/**
 * UseSuperPile.java
 * @author : André Da Costa Dias
 */

public class UseSuperPile
	{
	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public static void main(String[] args)
		{
		main();
		}

	public static void main()
		{
		empiler(5);
		
		afficherTaille();
		
		depilerAfficher();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/
	
	private static void depilerAfficher()
		{
		System.out.println("Element du sommet et retiré : " + SuperPile.getInstance().depiler());
		}
		
	private static void afficherTaille()
		{
		System.out.println("Taille de la pile : " + SuperPile.getInstance().getTaille());
		}

	private static void empiler(int valeur)
		{
		for(int i = 0; i < valeur; i++)
			{
			SuperPile.getInstance().empiler(i);
			}
		}
	}