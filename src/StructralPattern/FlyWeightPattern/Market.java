package StructralPattern.FlyWeightPattern;

import java.util.HashMap;
import java.util.Map;

public class Market {
  private Map<String, Product> products = new HashMap<>();
  public  Product lookUp(String productName){
      if(!products.containsKey(productName)) {
          products.put(productName, new Product(productName));
      }
          return products.get(productName);
  }
  public int getSizeOfProducts(){
      return products.size();
  }


}
