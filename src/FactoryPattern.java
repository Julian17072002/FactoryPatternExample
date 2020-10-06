
public class FactoryPattern {
		
		  public static Factory getCocktail() {
			String cocktail = readFromConfig();
			try {
				Factory f = (Factory) Class.forName(cocktail).newInstance();
				return f;
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			return null;
		  }
			
		  private static String readFromConfig() {
			return "CubaLibre";
		  }
			
		  public static void main(String[] args) {
			  Factory f = FactoryPattern.getCocktail();
			  f.mischen();	
		}
			
	 }

