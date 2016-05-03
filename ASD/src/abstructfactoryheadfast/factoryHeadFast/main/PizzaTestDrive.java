package abstructfactoryheadfast.factoryHeadFast.main;

import factoryHeadFast.ChicagoPizzaStore;
import factoryHeadFast.NYPizzaStore;
import factoryHeadFast.PizzaStore;
import factoryHeadFast.domain.pizza.Pizza;

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
