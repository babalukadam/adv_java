package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Product;

public class PDaoImpl implements PDao{
	static Connection conn;
	static PreparedStatement pprint,padd,prm;
	static {
		conn=DBUtil.getMyConnection();
		try {
			pprint=conn.prepareStatement("select * from product");
			padd=conn.prepareStatement("insert into product values(?,?,?,?,?)");
			prm=conn.prepareStatement("delete from product where pid=?");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Product> printallproduct() {
		List<Product> plist=new ArrayList<>();
		try {
			ResultSet rs=pprint.executeQuery();
			while(rs.next())
			{
				plist.add(new Product(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4),rs.getInt(5)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return plist;
	}

	@Override
	public void adodProduct(Product p) {
		try {
			padd.setInt(1, p.getPid());
			padd.setString(2, p.getProduct());
			padd.setDouble(3, p.getPrice());
			padd.setInt(4, p.getQty());
			padd.setInt(5, p.getCid());
			padd.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deleteid(int pid) {
	try {
	
		prm.setInt(1, pid);
		prm.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
