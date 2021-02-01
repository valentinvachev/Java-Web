package bg.softuni.supermarket.models.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

public class SellerSeedDto {

    @NotNull
    @Size(min = 2)
    private String firstName;
    @NotNull
    @Size(min = 2)
    private String lastName;
    @NotNull
    @Min(value = 18,message = "Should be at least 18 years old")
    private int age;
    @Positive
    @NotNull
    private BigDecimal salary;
    private ShopSeedDto shop;
    private SellerSeedDto manager;

    public ShopSeedDto getShop() {
        return shop;
    }

    public void setShop(ShopSeedDto shop) {
        this.shop = shop;
    }

    public SellerSeedDto getManager() {
        return manager;
    }

    public void setManager(SellerSeedDto manager) {
        this.manager = manager;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
