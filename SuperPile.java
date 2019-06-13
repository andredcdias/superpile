/**
 * SuperPile.java
 * @author : André Da Costa Dias
 */


import java.util.Stack;

public class SuperPile extends Stack<Integer>
	{

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private SuperPile()
		{

		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	public synchronized static SuperPile getInstance() // Singleton
		{
		if (instancePile == null)
			{
			instancePile = new SuperPile();
			}
		return instance;
		}
		
	public void empiler(int case)
		{
		push(case);
		}
		
	public int depiler()
		{
		if (taille() == 0)
			{
			notifyElement();
			}
		return pop();
		}
		
	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//TOOLS
	private static SuperPile instancePile;
	}