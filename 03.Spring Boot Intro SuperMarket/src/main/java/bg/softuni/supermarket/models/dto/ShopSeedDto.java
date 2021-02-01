package bg.softuni.supermarket.models.dto;

import bg.softuni.supermarket.models.Product;
import bg.softuni.supermarket.models.Town;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class ShopSeedDto {
    @NotNull
    @Size(min = 2)
    private String address;
    @NotNull
    @Size(min = 2)
    private String name;
    private TownSeedDto town;
    private List<ProductSeedDto> products;

    public List<ProductSeedDto> getProducts() {
        return products;
    }

    public void setProducts(List<ProductSeedDto> products) {
        this.products = products;
    }

    public void addProduct(ProductSeedDto product) {
        if (this.products == null) {
            this.products = new ArrayList<>();
            this.products.add(product);
        }

        this.products.add(product);
    }

    public TownSeedDto getTown() {
        return town;
    }

    public void setTown(TownSeedDto town) {
        this.town = town;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
