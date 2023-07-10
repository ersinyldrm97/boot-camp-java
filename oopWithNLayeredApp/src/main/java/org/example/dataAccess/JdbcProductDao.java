package org.example.dataAccess;

import org.example.entities.Product;

public class JdbcProductDao implements ProductDao {
  public void add(Product product) {
    System.out.println("Database added with JDBC");
  }

}
