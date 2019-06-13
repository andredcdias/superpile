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
		Empiler(5);
		
		AfficherTaille();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/
	
	private static void AfficherTaille()
		{
		System.out.println("Taille de la pile : " + SuperPile.getInstance().getTaille());
		}

	private static void Empiler(int valeur)
		{
		for(int i = 0; i < valeur; i++)
			{
			SuperPile.getInstance().empiler(i);
			}
		}
	}