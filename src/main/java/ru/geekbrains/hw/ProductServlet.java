package ru.geekbrains.hw;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductServlet extends HttpServlet {

    private Product product;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init();

        product = new Product(1, "Product", "202");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Enter doGet");

        String action = request.getParameter("action");
        request.setAttribute("product", product);
        switch (action == null ? "info" : action) {
            case "update":
                request.getRequestDispatcher("/update.jsp").forward(request, response);
                break;
            case "info":
            default:
                request.getRequestDispatcher("/product.jsp").forward(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Enter doPost");

        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");

        if ("submit".equals(action)) {
            product.setId(Integer.parseInt(request.getParameter("id")));
            product.setTitle(request.getParameter("title"));
            product.setCost(request.getParameter("cost"));
        }

        request.setAttribute("product", product);
        request.getRequestDispatcher("/product.jsp").forward(request, response);
    }
}