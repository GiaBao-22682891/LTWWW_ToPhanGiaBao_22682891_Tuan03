package com.example.ltwww_java_04092025_tuan03_tophangiabao;

import java.io.*;

import com.example.ltwww_java_04092025_tuan03_tophangiabao.Enum.Course;
import com.example.ltwww_java_04092025_tuan03_tophangiabao.Enum.Gender;
import com.example.ltwww_java_04092025_tuan03_tophangiabao.Model.Student;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "registerServlet", value = "/register_servlet")
public class RegisterServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append("Served at:").append(req.getContextPath());

        String fname = req.getParameter("txtFName");
        String lname = req.getParameter("txtLName");
        String email = req.getParameter("txtEmail");
        String mobileNum = req.getParameter("txtMobileNum");
        Gender gender = Gender.valueOf(req.getParameter("radioGender"));
        String address = req.getParameter("txtAddress");
        String city = req.getParameter("txtCity");
        String pinCode = req.getParameter("txtPinCode");
        String state = req.getParameter("txtState");
        String country = req.getParameter("txtCountry");
        Course course = Course.valueOf(req.getParameter("radioCourse"));

        Student sv = new Student();
        sv.setFirstName(fname);
        sv.setLastName(lname);
        sv.setEmail(email);
        sv.setMobileNum(mobileNum);
        sv.setGender(gender);
        sv.setAddress(address);
        sv.setCity(city);
        sv.setPincode(pinCode);
        sv.setState(state);
        sv.setCountry(country);
        sv.setAppliedCourse(course);

        req.setAttribute("student", sv);

        RequestDispatcher rd = req.getRequestDispatcher("result-form.jsp");
        rd.forward(req, resp);

    }


    public void destroy() {
    }
}