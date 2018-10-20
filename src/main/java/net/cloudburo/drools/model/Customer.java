package net.cloudburo.drools.model;

import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import java.lang.String;

public class Customer implements Serializable {

    private static final long serialVersionUID = -2948084449274181330L;
    
    public enum CustomerNeed {
        SAVINGACCOUNT,
        LIFEINSURANCE,
        DIGITALBANKING,
        STUDENTLOAN,
        MORTGAGE
    }

    private List<CustomerNeed> customerNeeds = new ArrayList<CustomerNeed>();

    // https://www.peoples-ebank.com/lifestages.html
    public enum CustomerLifeStage {
        GETTINGSTARTED,
        CAREERFOCUSED,
        ADVICEFAMILY,
        EMPTYNESTER,
        GOLDENYEARS,
        BUSINESS
    }

    private CustomerLifeStage lifestage;

    public enum CustomerAssets {
        TO50K,
        FROM50KTO150K,
        FROM150KTO300K,
        OVER300K
    }

    private CustomerAssets assets;


    public Customer() {
    }

    public void setLifeStage(CustomerLifeStage lifestage) {

        this.lifestage = lifestage;
    }

    public CustomerLifeStage getLifeStage() {

        return lifestage;
    }

    public List<CustomerNeed> getCustomerNeeds() {
        return customerNeeds;
    }

    public void setCustomerNeeds(List<CustomerNeed> customerNeeds) {
        this.customerNeeds = customerNeeds;
    }

    public void addNeed(CustomerNeed need) {

        customerNeeds.add(need);
    }

    public void setAssets(CustomerAssets assets) {
        this.assets = assets;
    }

    public CustomerAssets getAssets() {
        return assets;
    }

}
