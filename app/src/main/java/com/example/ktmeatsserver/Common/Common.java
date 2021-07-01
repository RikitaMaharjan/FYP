package com.example.ktmeatsserver.Common;

import com.example.ktmeatsserver.Model.User;

public class Common {
    public static User currentUser;

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";

    public static final int PICK_IMAGE_REQUEST = 71;

    public static String convertCodeToString(String code)
    {
        if(code.equals("0"))
            return "Order Placed";
        else if(code.equals("1"))
            return "On making";
        else
            return "Shipped";
    }

}
