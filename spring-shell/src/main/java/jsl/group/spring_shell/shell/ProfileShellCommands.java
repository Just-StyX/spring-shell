package jsl.group.spring_shell.shell;

import jsl.group.spring_shell.model.Product;
import jsl.group.spring_shell.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValues;
import org.springframework.boot.convert.ApplicationConversionService;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.validation.DataBinder;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Map;

@ShellComponent
@RequiredArgsConstructor
public class ProfileShellCommands {
    private final ProductService productService;

    @ShellMethod("This will add product to database")
    public void addProductToRepository(String productDetails, String language, String region) {
        var properties = productDetails.split(";");

        Locale locale = new Locale.Builder()
                .setLanguage(language)
                .setRegion(region)
                .build();

        PropertyValues propertyValues = new MutablePropertyValues(Map.of(
                "productName", properties[0],
                "productPrice", new BigDecimal(properties[1].trim())
        ));

        Product product = new Product();

        DataBinder dataBinder = new DataBinder(product);
        dataBinder.setConversionService(new ApplicationConversionService());
        dataBinder.bind(propertyValues);

        productService.saveProduct(product, locale);
    }

    @ShellMethod("This will send an email")
    public void sendEmail(String email, String message) {

    }

}
