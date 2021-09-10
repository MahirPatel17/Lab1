import java.util.Arrays;
import java.util.List;

public class Phone {
    private String company,model;
    private String color;
    private double price;

    public Phone(String company, String model, String color, double price) {
        setCompany(company);
        setModel(model);
        setColor(color);
        setPrice(price);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        company = company.toLowerCase();
        List<String> companies = Arrays.asList("iphone","oneplus","redmi");
        if(companies.contains(company))
        {
            this.company = company;
        }
        else
        {
            throw new IllegalArgumentException(String.format("%s is invalid, choose from %s",company,companies));
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(company.equals("iphone"))
        {
            List<String> models = Arrays.asList("10","11","12");
            if(models.contains(model))
            {
                this.model=model;
            }
            else
            {
                throw new IllegalArgumentException(String.format("Model %s is currently not available, choose from %s",model,models));
            }
        }
        else if(company.equals("oneplus"))
        {
            List<String> models = Arrays.asList("6t","7t","8t");
            if(models.contains(model))
            {
                this.model=model;
            }
            else
            {
                throw new IllegalArgumentException(String.format("Model %s is currently not available, choose from %s",model,models));
            }
        }
        else if(company.equals("redmi"))
        {
            List<String> models = Arrays.asList("6","7","10");
            if(models.contains(model))
            {
                this.model=model;
            }
            else
            {
                throw new IllegalArgumentException(String.format("Model %s is currently not available, choose from %s",model,models));
            }
        }
        else
        {
            throw new IllegalArgumentException("model is not valid");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        color = color.toLowerCase();
        List<String> colors = Arrays.asList("red","blue","black","gray");
        if(colors.contains(color))
        {
            this.color = color;
        }
        else
        {
            throw new IllegalArgumentException(String.format("%s is invalid, choose from %s",color,colors));
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price >= 0 && price <= 150000)
        {
            this.price = price;
        }
        else
        {
            throw new IllegalArgumentException(price + " is invalid, price must be between 0-150000");
        }
    }

    public String toString()
    {
        return("The selected phone is " + company + " " + model + " with " + color + " color and price = " + price);
    }
}
