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
		
	public int depiler() //Observable
		{
		if (taille() == 0)
			{
			notifyElement();
			}
		return pop();
		}

	public int sommet() // Facade
		{
		int premier = pop();
		push(premier);
		return premier;
		}
		
	public int sousSommet() // FACADE
		{
		int premier = pop();
		int deuxieme = pop();
		push(deuxieme);
		push(premier);
		return deuxieme;
		}
	/*------------------------------------------------------------------*\
	|*							  Get           						*|
	\*------------------------------------------------------------------*/
	
	public int getTaille()
		{
		return size();
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Private						*|
	\*------------------------------------------------------------------*/

	private void notifyElement()
		{
		System.out.println("La pile est vide");
		}
		
	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//TOOLS
	private static SuperPile instancePile;
	}