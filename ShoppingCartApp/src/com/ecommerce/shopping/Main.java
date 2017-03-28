
package com.ecommerce.shopping;

/**
 * Created by Ravinder Ghai on 9/3/17.
 */
public class Main {

    public static void main(String[] args) {

        // Test App via plain POJOs
        // Test case 1:
        PromotionalRules promotionalRules = new PromotionalRulesImpl();
        ShoppingCart sp1 = new ShoppingCart(promotionalRules);

        Tour tour1 = new Tour(
            ShoppingCartConstants.OPERA_HOUSE_TOUR_ID,
            ShoppingCartConstants.OPERA_HOUSE_TOUR,
            ShoppingCartConstants.OPERA_HOUSE_TOUR_COST
        );
        sp1.add(tour1);

        Tour tour2 = new Tour(
            ShoppingCartConstants.OPERA_HOUSE_TOUR_ID,
            ShoppingCartConstants.OPERA_HOUSE_TOUR,
            ShoppingCartConstants.OPERA_HOUSE_TOUR_COST
        );
        sp1.add(tour2);

        Tour tour3 = new Tour(
            ShoppingCartConstants.OPERA_HOUSE_TOUR_ID,
            ShoppingCartConstants.OPERA_HOUSE_TOUR,
            ShoppingCartConstants.OPERA_HOUSE_TOUR_COST
        );
        sp1.add(tour3);

        Tour tour4 = new Tour(
            ShoppingCartConstants.SYDNEY_BRIDGE_CLIMB_ID,
            ShoppingCartConstants.SYDNEY_BRIDGE_CLIMB,
            ShoppingCartConstants.SYDNEY_BRIDGE_CLIMB_COST
        );
        sp1.add(tour4);
        System.out.println("OH, OH, OH, BC - Total expected: $710.00: Actual result: " + sp1.getTotal());


        // Test case 2:
        PromotionalRules promotionalRules2 = new PromotionalRulesImpl();
        ShoppingCart sp2 = new ShoppingCart(promotionalRules2);

        Tour tour5 = new Tour(
                ShoppingCartConstants.OPERA_HOUSE_TOUR_ID,
                ShoppingCartConstants.OPERA_HOUSE_TOUR,
                ShoppingCartConstants.OPERA_HOUSE_TOUR_COST
        );
        sp2.add(tour5);

        Tour tour6 = new Tour(
                ShoppingCartConstants.SYDNEY_SKY_TOWER_ID,
                ShoppingCartConstants.SYDNEY_SKY_TOWER,
                ShoppingCartConstants.SYDNEY_SKY_TOWER_COST
        );
        sp2.add(tour6);
        System.out.println("OH, SK - Total expected: $300.00: Actual result: " + sp2.getTotal());


        // Test case 3:
        PromotionalRules promotionalRules3 = new PromotionalRulesImpl();
        ShoppingCart sp3 = new ShoppingCart(promotionalRules3);

        Tour tour7 = new Tour(
                ShoppingCartConstants.SYDNEY_BRIDGE_CLIMB_ID,
                ShoppingCartConstants.SYDNEY_BRIDGE_CLIMB,
                ShoppingCartConstants.SYDNEY_BRIDGE_CLIMB_COST
        );
        sp3.add(tour7);

        Tour tour8 = new Tour(
                ShoppingCartConstants.SYDNEY_BRIDGE_CLIMB_ID,
                ShoppingCartConstants.SYDNEY_BRIDGE_CLIMB,
                ShoppingCartConstants.SYDNEY_BRIDGE_CLIMB_COST
        );
        sp3.add(tour8);

        Tour tour9 = new Tour(
                ShoppingCartConstants.SYDNEY_BRIDGE_CLIMB_ID,
                ShoppingCartConstants.SYDNEY_BRIDGE_CLIMB,
                ShoppingCartConstants.SYDNEY_BRIDGE_CLIMB_COST
        );
        sp3.add(tour9);

        Tour tour10 = new Tour(
                ShoppingCartConstants.SYDNEY_BRIDGE_CLIMB_ID,
                ShoppingCartConstants.SYDNEY_BRIDGE_CLIMB,
                ShoppingCartConstants.SYDNEY_BRIDGE_CLIMB_COST
        );
        sp3.add(tour10);

        Tour tour11 = new Tour(
                ShoppingCartConstants.SYDNEY_BRIDGE_CLIMB_ID,
                ShoppingCartConstants.SYDNEY_BRIDGE_CLIMB,
                ShoppingCartConstants.SYDNEY_BRIDGE_CLIMB_COST
        );
        sp3.add(tour11);

        Tour tour12 = new Tour(
                ShoppingCartConstants.OPERA_HOUSE_TOUR_ID,
                ShoppingCartConstants.OPERA_HOUSE_TOUR,
                ShoppingCartConstants.OPERA_HOUSE_TOUR_COST
        );
        sp3.add(tour12);
        System.out.println("BC, BC, BC, BC, BC, OH - Total expected: $750: Actual result: " + sp3.getTotal());
    }

}
