package com.tarun.DAO;

import java.util.List;

import com.tarun.Entity.Cart;



public interface CartDAO {
	
	public boolean addCart(Cart c);
	
	public List<Cart> getBookByUser(int userId);
	
	public boolean removeBook(int bid,int uid,int cid);

}
