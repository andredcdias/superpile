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
		Empiler(4);
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private static void Empiler(int valeur)
		{
		for(int i = 0; i < valeur; i++)
			{
			SuperPile.getInstance().empiler(i);
			}
		}
	}