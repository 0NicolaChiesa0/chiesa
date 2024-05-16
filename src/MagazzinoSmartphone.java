public class MagazzinoSmartphone {
    private Smartphone[] smartphones;
    private int count;


    public MagazzinoSmartphone() {
        smartphones = new Smartphone[10]; // Assuming initial capacity of 10
        count = 0;
    }

    public MagazzinoSmartphone(MagazzinoSmartphone other) {
    //     for (int i = 0; i < smartphones.length; i++) {
    //         if (smartphones!=null){
    //         other.smartphones[i]=smartphones[i];
    //         }
    //     }   
    //}
        
    }

    public void addSmartphone(Smartphone smartphone) {
        // boolean trovato = false;
        // for (int i = 0; i < smartphones.length; i++) {
        //     if (smartphone[i] == null && !trovato) {
        //         smartphone[i] = smartphone;
        //         trovato = true;
        //     }
        // }

    }

    public void removeSmartphone(Smartphone smartphone) {
        // boolean trovato = false;
        // int posizione = 0;
        // for (int i = 0; i < smartphones.length; i++) {
        //     if (smartphone[i] == smartphone && !trovato) {
        //         trovato = true;
        //         posizione = i;
        //         smartphone[i] = null;
        //     }
        // }
        // for (int j = posizione; j < smartphones.length; j++) {
        //     if(smartphone[j+1]!=null){
        //         smartphone[j]=smartphone[j+1];
        //     }else{
        //         smartphone[j+1]=null;
        //     }
        // }
    }

    public Smartphone[] getSmartphonesArray() {
        Smartphone[] smartphoneArray = new Smartphone[count];
        System.arraycopy(smartphones, 0, smartphoneArray, 0, count);
        return smartphoneArray;
    }

    public Smartphone getSmartphoneByBrand(String brand) {
        Smartphone smartphone = null;

        return smartphone;
    }

    public MagazzinoSmartphone getSmartphonesByStorageCapacity(int storageCapacity) {
        MagazzinoSmartphone magazzinoSmartphone = new MagazzinoSmartphone();

        return magazzinoSmartphone;
    }

    public MagazzinoSmartphone getSmartphonesByPriceRange(double minPrice, double maxPrice) {
        MagazzinoSmartphone magazzinoSmartphone = new MagazzinoSmartphone();

        return magazzinoSmartphone;
    }

    @Override
    public String toString() {
        String result = "\nMagazzinoSmartphone:\n";

        return result;
    }

    public int getCount() {
        return count;
    }

    public boolean equals(Object obj) {
        
        return true;
    }

}