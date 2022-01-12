//Johann Burke, 1/12/2022, 8:29, AP Data Lab, v0.3
public class Cereal
{
private String cerealName;
private double fiber;
private double cups;
private double fiberPerCup;

public Cereal(String cerealName, double fiber, double cups, double fiberPerCup)
{
    name = cerealName;
    fiber = fiber;
    cups = cups;
    FPC = fiberPerCup;

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
    return "Cereal: " + name + "Fiber content:" + fiber + "serving size (in cups): " + cups + "Fiber Per Cup: " + FPC;

}


}