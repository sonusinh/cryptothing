package financial.crypto_viewer;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Allow CORS requests from the Vue.js frontend running on port 3000
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8084")  // Your Vue.js frontend URL
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Allowed HTTP methods
                .allowCredentials(true);  // Allow sending cookies with the request
    }
}
