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
		if (instance == null)
			{
			System.out.println("J'existe");
			instance = new SuperPile();
			}
		return instance;
		}
	}