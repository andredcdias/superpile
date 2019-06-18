/**
 * UseSuperPile.java
 * @author andrehen.dacostad
 */

package ch.hearc.cours.gitsuperpile;

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

	/*------------------------------*\
	|*			  Static			*|
	\*------------------------------*/

	private static void viderPile(int n)
		{
		for(int i = 0; i < n; i++)
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

	private static void empiler(int n)
		{
		for(int i = 0; i < n; i++)
			{
			SuperPile.getInstance().empiler(i);
			}
		}
	}
