package com.store.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.store.configuration.HelperClass;
import com.store.dto.Product;

public class ProductDao {

	HelperClass helperClass = new HelperClass();

	Connection connection = null;

	// SAVE PRODUCT
	public Product saveProduct(Product product) {

		connection = helperClass.getConnection();
		String sql = "INSERT INTO product VALUES(?,?,?,?)";

		// CREATE CONNECTION

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, product.getId());
			preparedStatement.setString(2, product.getName());
			preparedStatement.setString(3, product.getBrand());
			preparedStatement.setDouble(4, product.getPrice());

			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return product;
	}

	// DELETE PRODUCT

	public boolean deleteProduct(int id) {
		connection = helperClass.getConnection();
		String sql = "DELETE FROM product WHERE id=?";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, id);

			int i = preparedStatement.executeUpdate();

			if (i > 0) {
				return false;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return true;

	}

//UPDATE PRODUCT

	public double updateProduct(double price, int id) {

		connection = helperClass.getConnection();

		String sql = "UPDATE product SET price = ? WHERE id = ?";

		// create statement
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setDouble(1, price);
			preparedStatement.setInt(2, id);

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return price;

	}

	public int getPrice(int id) {

		connection = helperClass.getConnection();

		String sql = "SELECT price FROM product WHERE ID=?";

		// create statement
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setDouble(1, id);

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				System.out.print(resultSet.getDouble(1) + " updated to ");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return id;

	}

	public int getProduct(int id) {
		connection = helperClass.getConnection();
		String sql = "SELECT * FROM product WHERE ID=?";

		try {
			// create Statement
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// passed the values of delimiters/placeholders --->?
			preparedStatement.setInt(1, id);
			// Execute
			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getDouble(4));
				System.out.println("===============================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return id;
	}

	public void GetAllProduct() {

		connection = helperClass.getConnection();

		String sql = "SELECT * FROM product";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println(resultSet.getDouble(4));
				System.out.println("===============================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
