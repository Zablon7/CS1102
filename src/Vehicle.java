import com.sun.jdi.VirtualMachine;

class Vehicle {
    int registrationNumber;
    String owner;

    void transferOwnership(String newOwner){

    }

}

class Car extends Vehicle{
    int numberOfDoors;
}

class Truck extends Vehicle{
    int numberOfAxles;
}

class Motorcycle extends Vehicle{
    boolean hasSidecar;
}

