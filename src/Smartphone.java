public class Smartphone {
    private String brand;
    private String model;
    private int storageCapacity;
    private double price;

    public Smartphone(){};

    public Smartphone(String brand, String model, int storageCapacity, double price) {
        setBrand(brand);
        setModel(model);
        setStorageCapacity(storageCapacity);
        setPrice(price);
    }

    public Smartphone(Smartphone other) {
        other.setBrand(brand);
        other.setModel(model);
        other.setStorageCapacity(storageCapacity);
        other.setPrice(price);
    }


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String s="";
        s= "Brand:"+brand+", Model: "+ model+", Storage Capacity: "+storageCapacity+"GB, Price: "+price;
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        // boolean uguali=false;
        // if (brand.equals(obj)&& model.equals(obj)&& storageCapacity==getStorageCapacity(obj)&&price==getPrice(obj)) {
        // //     uguali=true;
        // // }
        // return uguali;
        return true;
    }
    
}
