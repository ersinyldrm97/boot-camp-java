package org.example;

import org.example.business.ProductManager;
import org.example.core.logging.DatabaseLogger;
import org.example.core.logging.FileLogger;
import org.example.core.logging.Logger;
import org.example.core.logging.MailLogger;
import org.example.dataAccess.HibernateProductDao;
import org.example.dataAccess.JdbcProductDao;
import org.example.entities.Product;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
  public static void main(String[] args) throws Exception {
    Product product1 = new Product(1, "IPhone 11", 14500);

    Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

    ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
    productManager.add(product1);

  }
}