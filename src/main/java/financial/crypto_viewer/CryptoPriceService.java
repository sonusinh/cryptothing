package financial.crypto_viewer;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.core.ParameterizedTypeReference;
import java.util.List;

@Service
public class CryptoPriceService {
    private final RestTemplate restTemplate = new RestTemplate();

    public List<CryptoPrice> fetchCryptoPrices() {
        String url = "https://api.coingecko.com/api/v3/coins/markets?vs_currency=usd";
        ResponseEntity<List<CryptoPrice>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<CryptoPrice>>() {}
        );
        return response.getBody();
    }
}

