/**
 * Created by User on 6/1/2014.
 */
public abstract class Beverage {
  String description = "Unknown Beverage";

  public String getDescription() {
    return description;
  }

  public abstract double cost();
}
