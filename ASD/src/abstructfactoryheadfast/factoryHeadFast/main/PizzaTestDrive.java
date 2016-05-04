package abstructfactoryheadfast.factoryHeadFast.main;

import abstructfactoryheadfast.factoryHeadFast.NYPizzaStore;
import abstructfactoryheadfast.factoryHeadFast.PizzaStore;
import abstructfactoryheadfast.factoryHeadFast.domain.pizza.Pizza;



public class PizzaTestDrive {
	
	public static void main(String...args){
		PizzaStore nyStore = new NYPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("Cheese");
		System.out.println("Ethan ordered a"+ pizza.getName()+"\n");
	}
}
