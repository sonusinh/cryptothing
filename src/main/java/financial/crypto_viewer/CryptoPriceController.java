package financial.crypto_viewer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import java.util.List;

@RestController
@RequestMapping("/api/crypto")
public class CryptoPriceController {
    private final CryptoPriceService cryptoPriceService;

    public CryptoPriceController(CryptoPriceService cryptoPriceService) {
        this.cryptoPriceService = cryptoPriceService;
    }

    @GetMapping("/prices")
    public ResponseEntity<List<CryptoPrice>> getPrices() {
        List<CryptoPrice> prices = cryptoPriceService.fetchCryptoPrices();
        return ResponseEntity.ok(prices);
    }
}
