package net.cloudburo.drools.model;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.lang.String;

public class Customer implements Serializable {

    private static final long serialVersionUID = -2948084449274181330L;
    
    private List<String> customerNeeds = new ArrayList<String>();

    private String lifeStage;

    private String assets;


    public Customer() {
    }

    public void setLifeStage(String lifeStage) {
        this.lifeStage = lifeStage;
    }

    public String getLifeStage() {
        return lifeStage;
    }

    public List<String> getCustomerNeeds() {
        return customerNeeds;
    }

    public void setCustomerNeeds(List<String> customerNeeds) {
        this.customerNeeds = customerNeeds;
    }

    public void addNeed(String need) {

        customerNeeds.add(need);
    }

    public void setAssets(String assets) {
        this.assets = assets;
    }

    public String getAssets() {
        return assets;
    }

}
