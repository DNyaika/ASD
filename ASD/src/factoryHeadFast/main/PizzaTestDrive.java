package factoryHeadFast.main;

import factoryHeadFast.domain.pizza.Pizza;
import headfastfactory.ChicagoPizzaStore;
import headfastfactory.NYPizzaStore;
import headfastfactory.PizzaStore;

public class PizzaTestDrive {
	
	public static void main(String...args){
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore ChicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("Cheese");
		System.out.println("Ethan ordered a"+ pizza.getName()+"\n");
		
		 pizza = ChicagoStore.orderPizza("Cheese");
		System.out.println("Ethan ordered a"+ pizza.getName()+"\n");
	}

}
