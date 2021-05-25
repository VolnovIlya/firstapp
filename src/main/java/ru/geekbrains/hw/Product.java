package ru.geekbrains.hw;

public class Product {
    private Integer id;
    private String title;
    private String cost;

    public Product(Integer id, String title, String cost){
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", cost=" + cost +
                '}';
    }
}
