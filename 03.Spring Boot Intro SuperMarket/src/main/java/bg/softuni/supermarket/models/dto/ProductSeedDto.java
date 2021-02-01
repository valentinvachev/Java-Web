package bg.softuni.supermarket.models.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;

public class ProductSeedDto {

    private LocalDate bestBefore;
    private String description;
    @NotNull
    @Size(min = 2)
    private String name;
    @Positive
    @NotNull
    private BigDecimal price;
    private CategorySeedDto category;

    public CategorySeedDto getCategory() {
        return category;
    }

    public void setCategory(CategorySeedDto category) {
        this.category = category;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(LocalDate bestBefore) {
        this.bestBefore = bestBefore;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


}
