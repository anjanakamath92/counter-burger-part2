public class BuildOrder {
 public static Component getOrder()
 {
 Component order = new Composite( "Order" ) ;
 
 CustomBurger customBurger = new
 CustomBurger( "Build Your Own Burger " ) ;
 //Organic price for 1/3 lb
 Burger b = new Burger( "Burger Options" ) ;
 String[] bo ={ "Organic Bison*", "1/2lb.", "On A Bun " } ;
 b.setOptions( bo ) ;
 // 1 cheese free, extra cheese +1.00
 Cheese c = new Cheese( "Cheese Options" ) ;
 String[] co = { "Yellow American", "Spicy Jalapeno Jack " } ;
 c.setOptions( co ) ;
 c.wrapDecorator( b ) ;
 
 PremiumCheese q = new PremiumCheese( "Cheese Options " ) ;
 String[] qo = { "Danish Blue Cheese "} ;
 q.setOptions( qo ) ;
 q.wrapDecorator( c ) ;
 
  // 1 sauce free, extra +.75
 Sauce s = new Sauce( "Sauce Options " ) ;
 String[] so = { "Mayonnaise", "Thai Peanut Sauce" } ;
 s.setOptions( so ) ;
 s.wrapDecorator( q ) ;
 
 
 // 4 toppings free, extra +.75
 Toppings t = new Toppings("Toppings Options" ) ;
 String[] to ={ "Dill Pickle Chips", "Black Olives", "Spicy Pickle" } ;
 t.setOptions( to ) ;
 t.wrapDecorator( s ) ;
 
 PremiumToppings pt = new PremiumToppings("Toppings Options" ) ;
 String[] to2 ={ "Marinated Tomatoes"};
 pt.setOptions( to2) ;
 pt.wrapDecorator( t ) ;
 
  Bun bu = new Bun( "Bun Options" ) ;
 String[] b1 = { "Ciabatta" } ;
 bu.setOptions( b1 ) ;
 bu.wrapDecorator( pt  ) ;
 
  Side si = new Side( "Side Options" ) ;
 String[] sid = { "Shoestring Fries" } ;
 si.setOptions( sid ) ;
 si.wrapDecorator( bu ) ;

 // Setup Custom Burger Ingredients
 customBurger.setDecorator( si ) ;
 customBurger.addChild( b ) ;
 customBurger.addChild( c ) ;
 customBurger.addChild( q ) ;
 customBurger.addChild( s ) ;
 customBurger.addChild( t ) ;
 customBurger.addChild( pt ) ;
 customBurger.addChild( bu ) ;
 customBurger.addChild( si ) ;
 order.addChild( customBurger );
  
 
 CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger " ) ;
 //Organic price for 1/3 lb
 Burger b2 = new Burger( "Burger Options" ) ;
 String[] bo2 ={ "Hormone & Antibitic Free Beef*", "1/3lb.", "On A Bun" } ;
 b2.setOptions( bo2 ) ;
 // 1 cheese free, extra cheese +1.00
 Cheese c2 = new Cheese( "Cheese Options" ) ;
 String[] co2 = { "Smoked Gouda", "Greek Feta" } ;
 c2.setOptions( co2 ) ;
 c2.wrapDecorator( b2 ) ;
 
 PremiumCheese q2 = new PremiumCheese( "Cheese Options" ) ;
 String[] qo2 = { "Fresh Mozzarella"} ;
 q2.setOptions( qo2 ) ;
 q2.wrapDecorator( c2 ) ;
 
  // 1 sauce free, extra +.75
 Sauce s2 = new Sauce( "Sauce Options" ) ;
 String[] so2 = { "Habanero Sauce" } ;
 s2.setOptions( so2 ) ;
 s2.wrapDecorator( q2 ) ;
 
 
 // 4 toppings free, extra +.75
 Toppings t2 = new Toppings("Toppings Options" ) ;
 String[] to22 = { "Crushed Peanuts" } ;
 t2.setOptions( to22 ) ;
 t2.wrapDecorator( s2 ) ;
 
 PremiumToppings pt2 = new PremiumToppings("Toppings Options" ) ;
 String[] to23 ={ "Marinated Tomatoes", "Sunny Side Up Egg"};
 pt2.setOptions( to23) ;
 pt2.wrapDecorator( t2 ) ;

 Bun bu2 = new Bun( "Bun Options" ) ;
 String[] b22 = { "Gluten-Free Bun" } ;
 bu2.setOptions( b22 ) ;
 bu2.wrapDecorator( pt2  ) ;
 
  Side si2 = new Side( "Side Options" ) ;
 String[] sid2 = { "Shoestring Fries" } ;
 si2.setOptions( sid2 ) ;
 si2.wrapDecorator( bu2 ) ;

 // Setup Custom Burger Ingredients
 customBurger2.setDecorator( si2 ) ;
 customBurger2.addChild( b2 ) ;
 customBurger2.addChild( c2 ) ;
 customBurger2.addChild( q2 ) ;
 customBurger2.addChild( s2 ) ;
 customBurger2.addChild( t2 ) ;
 customBurger2.addChild( pt2 ) ;
 customBurger2.addChild( bu2 ) ;
 customBurger2.addChild( si2 ) ;


 // Add Custom Burger to the ORder

 order.addChild( customBurger2 );
 
 return order ;
 }
}