package core;


/**
 * Cette classe représente tous les objets du jeu (Medikit, Weapon,
 * Chest, Key)
 *
 * @author Groupe 1 WoZ
 * @version 09/11/2017
 */
public abstract class Item
{
    private String nameItem;
    private String descriptionItem;

    /**
     * Constructeur d'objets de classe Item
     * @param  name nom de l'item, description description de l'item
     */
    public Item(String name, String description)
    {
        nameItem = name;
        descriptionItem = description;
    }

    /**
     * Cette méthode récupère le nom de l'item
     * @return     le nom de l'item
     */
    public String getName()
    {
        return(nameItem);
    }

    /**
     * Cette méthode récupère la description de l'item
     * @return     la description de l'item
     */
    public String getDescription()
    {
        return(descriptionItem);
    }
    
    public boolean rechercheInventaire()
    {
        return(true);
    }
    /**
     * exemple :
     * 
    List parentList = new ArrayList();

		List child1 = new ArrayList();
		child1.add("a1");
		child1.add("a2");
		child1.add("a3");

		List child2 = new ArrayList();
		child2.add("b1");
		child2.add("b2");

		List child3 = new ArrayList();
		child3.add("c1");

		parentList.add(child1);
		parentList.add(child2);
		parentList.add(child3);

		for (int i = 0; i < parentList.size(); i++) {
			List child = (List) parentList.get(i);
			for (int j = 0; j < child.size(); j++) {
				System.out.println(child.get(j));
			}
		}
**/
}

