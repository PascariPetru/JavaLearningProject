package classesandobjects.autoservicetask;

public class ManageAutoSerivce {

    public static void main(String[] args)
    {
        Garage garajulLuiAndrei = new Garage("Lunca Nistrului");
        System.out.println("Adresa garajului lui Andrei este" +garajulLuiAndrei.address);
        garajulLuiAndrei.carCapacity = 342;
        garajulLuiAndrei.hasComputerDiagnostics = true;
        garajulLuiAndrei.numberId = "5454";
        garajulLuiAndrei.scheduler = "uneori";

        System.out.println("Garajul lui andrei are urmatoarele proprietati: Adresa " +garajulLuiAndrei.address +
                ", CarCapacity: " +garajulLuiAndrei.carCapacity + ", numberId: " + garajulLuiAndrei.numberId +
                ", Orar de lucru: " + garajulLuiAndrei.scheduler + ", hasComputerDiagnostics: "
                + garajulLuiAndrei.hasComputerDiagnostics);

        Garage garajulLuiGheorghe = new Garage("Lunca Prutului");
        System.out.println("Adresa garajului lui Andrei este" +garajulLuiGheorghe.address);
        garajulLuiGheorghe.carCapacity = 1233;
        garajulLuiGheorghe.hasComputerDiagnostics = false;
        garajulLuiGheorghe.numberId = "545224";
        garajulLuiGheorghe.scheduler = "niciodata";

        System.out.println("Garajul lui Gheorghe are urmatoarele proprietati: Adresa " +garajulLuiGheorghe.address +
                ", CarCapacity: " +garajulLuiGheorghe.carCapacity + ", numberId: " + garajulLuiGheorghe.numberId +
                ", Orar de lucru: " + garajulLuiGheorghe.scheduler + ", hasComputerDiagnostics: "
                + garajulLuiGheorghe.hasComputerDiagnostics);

        Garage garajulElenei = new Garage(345);
        garajulElenei.address = " Burebista 45";
        garajulElenei.hasComputerDiagnostics = false;
        garajulElenei.numberId = "545224";
        garajulElenei.scheduler = "fiecare a 8a zi a saptaminii";

        System.out.println("Garajul lui Elena are urmatoarele proprietati: Adresa " +garajulElenei.address +
                ", CarCapacity: " +garajulElenei.carCapacity + ", numberId: " + garajulElenei.numberId +
                ", Orar de lucru: " + garajulElenei.scheduler + ", hasComputerDiagnostics: "
                + garajulElenei.hasComputerDiagnostics);




        Car masinaLuiIulian = new Car("Mercedes;","GLE Class", 2022,"Diesel" );

        masinaLuiIulian.carPrice = 42113;
        masinaLuiIulian.km = 1233312;
        masinaLuiIulian.gearType = "Automatic";

        System.out.println("Masina lui Iulian are probleme dar si proprietati: Make: " + masinaLuiIulian.make +
                ", Model:" + masinaLuiIulian.model + ", Production Year: " + masinaLuiIulian.productionYear
                        + ", FuelType: " + masinaLuiIulian.fuelType + ", Car Price:" + masinaLuiIulian.carPrice
                        +", km:" + masinaLuiIulian.km + ", gear type:" + masinaLuiIulian.gearType);



        Tool elevatorTool = new Tool(2314412);
        elevatorTool.isElevator = true;
        elevatorTool.isUsed = true;
        elevatorTool.needsElectricity = true;

        System.out.println("Obiectul elevatorTool  are proprietatile: "
                + "Cod Unic:" + elevatorTool.uniqueCode
                        + "Este elevator:" + elevatorTool.isElevator
                        + "Este BU:" + elevatorTool.isUsed
                        + "Are lunina:" + elevatorTool.needsElectricity);


        Worker lucratorulGavril = new Worker();

        lucratorulGavril.name = "Gavril";
        lucratorulGavril.age = 40;
        lucratorulGavril.isExperienced = true;
        lucratorulGavril.sexType = "Masculin";
        lucratorulGavril.specialization = "Electric Auto";

        System.out.println("LucratorulGavril are proprietatile: "
                + "Nume: " + lucratorulGavril.name
                + "Specialitate: " + lucratorulGavril.specialization
                + "Experienta: " + lucratorulGavril.isExperienced
                + "Virsta: " + lucratorulGavril.age
                + "genul: " + lucratorulGavril.sexType);
    }
}
