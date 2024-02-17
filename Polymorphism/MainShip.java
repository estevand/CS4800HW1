package Polymorphism;

public class MainShip 
{
    public static void main(String[] args) 
    {
        Ship[] shipArray = new Ship[3];
        shipArray[0] = new Ship("Ship", "2024");
        shipArray[1] = new CruiseShip("Cruise Ship", "2023", 500);
        shipArray[2] = new CargoShip("Cargo Ship", "2022", 22000);

        for (Ship shipType : shipArray) 
        {
            shipType.print();
            System.out.println();
        }
    }
}