package com.example.ltwww_java_04092025_tuan03_tophangiabao_bai2.Controller;

import java.io.*;

import com.example.ltwww_java_04092025_tuan03_tophangiabao_bai2.DAO.UserDAO;
import com.example.ltwww_java_04092025_tuan03_tophangiabao_bai2.Model.Enum.Gender;
import com.example.ltwww_java_04092025_tuan03_tophangiabao_bai2.Model.User;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "userServlet", urlPatterns = "/user")
public class UserServlet extends HttpServlet {
    private UserDAO userDAO;

    public void init() {
        userDAO = new UserDAO();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("register-form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String birthday = req.getParameter("day") + "/" + req.getParameter("month") + "/" + req.getParameter("year");
        Gender gender = Gender.valueOf(req.getParameter("gender"));

        User user = new User(firstName, lastName, email, password, birthday, gender);
        userDAO.insertNewUser(user);

        //List
        req.setAttribute("userList", userDAO.getUserList());
        req.getRequestDispatcher("user-list.jsp").forward(req, resp);
    }

    public void destroy() {
    }
}