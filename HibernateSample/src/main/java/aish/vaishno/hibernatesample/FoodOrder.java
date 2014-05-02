/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aish.vaishno.hibernatesample;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;




/**
 *
 * @author aishwarya
 */

@Entity
@Table(name = "food_order")
public class FoodOrder implements Serializable {
    
    @Id
    @Column(name = "food_id")
    private Long id;
    @Column(name="item_name")
    private String itemName;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "FoodOrder{" + "id=" + id + ", itemName=" + itemName + '}';
    }
}
