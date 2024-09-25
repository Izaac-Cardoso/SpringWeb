package com.exemploweb.entities.pk;

import com.exemploweb.entities.Order;
import com.exemploweb.entities.Product;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;

/**
 * PK stands for Primary Key, it's a class to represent a composite id.
 * The class's attributes (which can be a simple variable or a class instance)
 * form the association for a composite key. The annotation @Embeddable 
 * marks the class as a composite id for JPA.
 */

@Embeddable
public class OrderItemPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order orders;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
     
    public Order getOrder() {
        return orders;
    }

    public void setOrder(Order orders) {
        this.orders = orders;
    }  

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((orders == null) ? 0 : orders.hashCode());
        result = prime * result + ((product == null) ? 0 : product.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OrderItemPK other = (OrderItemPK) obj;
        if (orders == null) {
            if (other.orders != null)
                return false;
        } else if (!orders.equals(other.orders))
            return false;
        if (product == null) {
            if (other.product != null)
                return false;
        } else if (!product.equals(other.product))
            return false;
        return true;
    }  

}
