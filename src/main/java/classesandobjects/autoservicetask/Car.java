package classesandobjects.autoservicetask;

public class Car {
    int km;

    String gearType;

    String make;

    String model;

    int productionYear;

    double carPrice;

    String fuelType;

    Car(String makeParametruDeIntrare, String modelFormalParameter, int productionYear, String fuelType) {
        this.make = makeParametruDeIntrare;
        this.model = modelFormalParameter;
        this.productionYear = productionYear;
        this.fuelType = fuelType;
        System.out.println("In urma executiei acestui constructor 4 parametri se creaza un nou obiect despre care nu cunoastem price, gearType, km");
    }

    Car(String make, String model){
        this.make = make;
        this.model = model;
        System.out.println("A fost creat o masina despre care cunoastem doar Marca si Modelul");

    }




}
