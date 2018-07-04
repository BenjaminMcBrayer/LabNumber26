package co.grandcircus.coffeeshopapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import co.grandcircus.coffeeshopapp.entity.Item;

@Repository
@Transactional
public class ItemDao {

	@PersistenceContext
	EntityManager eManager;

	public Item findById(Long itemid) {
		return eManager.find(Item.class, itemid);
	}

	public List<Item> findAll() {
		TypedQuery<Item> namedQuery = eManager.createNamedQuery("find_all_items", Item.class);
		
		return namedQuery.getResultList();
	}

	public Item findByName(String name) {
		// TODO: Create a new method to find items by name (rather than primary key).
		return null;
	}
	
	public Item update(Item item) {

		return eManager.merge(item);
	}
	
	public void deleteById(Long itemid) {
		Item item = findById(itemid);
		eManager.remove(item);
	}

}