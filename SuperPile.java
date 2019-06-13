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

	public synchronized static SuperPile getInstance() // SIngleton
		{
		if (instancePile == null)
			{
			instancePile = new SuperPile();
			}
		return instance;
		}
		
	public void Empiler(int case)
		{
		push(case);
		}
		
	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//TOOLS
	private static SuperPile instancePile;
	}