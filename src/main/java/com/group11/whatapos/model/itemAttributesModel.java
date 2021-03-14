package com.group11.whatapos.model;

import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * This class will be used for order customization
 * for customers. This is for one particular item.
 */

public class itemAttributesModel{
    
    private String itemAttributes;
    private String otherComments;

    /**
     * Constructor takes attributes and comments for one item
     * and puts them in this item attribute model. The order
     * model has a list of these so that 
     * @param _attributes String
     * @param _comments String
     */
    public itemAttributesModel(String _attributes, String _comments){
        itemAttributes = _attributes;
        otherComments  = _comments;
    }

    /**
     * @return String of item attributes for a singular item
     */
    public String getItemAttributes(){
        return itemAttributes;
    }

    /**
     * @return String of other comments made by customer for a singular item
     */
    public String getOtherComments(){
        return otherComments;
    }
}