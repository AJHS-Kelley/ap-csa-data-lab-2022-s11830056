//Johann Burke, 1/12/2022, 8:29, AP Data Lab, v0.3
public class Cereal
{
private String name;
private double fiber;
private double cups;
private double FPC;

public Cereal(String name, double fiber, double cups, double FPC)
{
    name = name;
    fiber = fiber;
    cups = cups;
    FPC = FPC;

}
public Cereal()
{
    name = "";
    fiber = 0.0;
    cups = 0.0;
    FPC = 0.0;
}

// getters

public String getName()
{
    return name;
    
}


public double getFiber()
{
    return fiber;
}

public double getCups()
{
    return cups;
}

public double getFPC()
{
    return FPC;
}
public String toString()
{
    return "Cereal: " + name + "\nFiber content: " + fiber + "\nserving size (in cups): " + cups + "\nFiber Per Cup: " + FPC;

}

public static void main(String[]args)
{
Cereal food1 = new Cereal();
System.out.println(food1.toString());

}






}