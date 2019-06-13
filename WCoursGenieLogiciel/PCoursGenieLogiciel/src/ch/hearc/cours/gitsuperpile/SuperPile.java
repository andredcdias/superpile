/**
 * SuperPile.java
 * @author andrehen.dacostad
 */

package ch.hearc.cours.gitsuperpile;

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
		if (instanceSuperPile == null)
			{
			System.out.println("SuperPile créée");
			instanceSuperPile = new SuperPile();
			}
		return instanceSuperPile;
		}

	public void empiler(int valeur)
		{
		push(valeur);
		}

	public int depiler() //Observable
		{
		if (getTaille() == 0)
			{
			notifierElement();
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

	private void notifierElement()
		{
		System.out.println("La pile est vide");
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	//TOOLS
	private static SuperPile instanceSuperPile;
	}
