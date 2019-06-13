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
		
		sommetAfficher();
		
		sousSommetAfficher();

		viderPile(5);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void viderPile(int case)
		{
		for(int i = 0; i < case; i++)
			{
			SuperPile.getInstance().depiler();
			}
		}

	private static void sousSommetAfficher()
		{
		System.out.println("Element une case en dessous du sommet : " + SuperPile.getInstance().sousSommet());
		}
		
	private static void sommetAfficher()
		{
		System.out.println("Element du sommet non retiré : " + SuperPile.getInstance().sommet());
		}
		
	private static void depilerAfficher()
		{
		System.out.println("Element du sommet et retiré : " + SuperPile.getInstance().depiler());
		}
		
	private static void afficherTaille()
		{
		System.out.println("Taille de la pile : " + SuperPile.getInstance().getTaille());
		}

	private static void empiler(int case)
		{
		for(int i = 0; i < case; i++)
			{
			SuperPile.getInstance().empiler(i);
			}
		}
	}