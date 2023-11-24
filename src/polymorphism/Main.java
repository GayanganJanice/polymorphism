
package polymorphism;

public class Main {
    
   
    
    public static void main(String[] args){
      
        Polymorphism_Fruits my_fruits = new Polymorphism_Fruits();
        Polymorphism_Foods my_foods = new Polymorphism_Foods();
        Polymorphism_Drinks my_drinks = new Polymorphism_Drinks();
       
    
        System.out.println("       ");
        
        my_fruits.FaveFruit();
        my_foods.FaveFoods();
        my_drinks.FaveDrinks();

}
}