
package com.ecommerce.shopping;

import java.util.ArrayList;

/**
 * Created by Ravinder Ghai on 9/3/17.
 */
public class ShoppingCart {

    private PromotionalRules promotionalRules;
    private Boolean promotionalRulesFlag;
    private ArrayList<Tour> tours;
    private double total;

    public ShoppingCart(PromotionalRules promotionalRules) {
        this.promotionalRules = promotionalRules;
        promotionalRulesFlag = true;
        tours = new ArrayList<>();
    }

    public void add(Tour tour) {
        try {
            if (null != tour && tour.getId() != null && null != tour.getName()
                    && tour.getPrice() >= 0) {
                tours.add(tour);
            }
        } catch (Exception e) {
            System.out.println("Error: tour could not be added.");
            e.printStackTrace();
        }
    }

    public void remove(Tour tour) {
        try {
            if (null != tour) {
                tours.remove(tour);
            }
        } catch (Exception e) {
            System.out.println("Error: tour could not be removed.");
            e.printStackTrace();
        }
    }

    private double computeTotal() {
        double totalValue = 0;

        // Return total value for all tour objects contained inside tours collection object
        try {
            if (promotionalRulesFlag) {
                totalValue += this.promotionalRules.operaHouseDeal(tours);
                totalValue += this.promotionalRules.sydneyBridgeClimbDeal(tours);
                totalValue += this.promotionalRules.sydneySkyTowerDeal(tours);
                this.setTotal(totalValue);
            }
        } catch (Exception e) {
            System.out.println("Error: there was an error computing total tours total.");
            e.printStackTrace();
        }
        return totalValue;
    }

    public double getTotal() {
        return computeTotal();
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
