package com.exemploweb.entities;

import java.io.Serializable;
import java.util.Date;

public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private Date moment;

    private Order order = new Order();
}
