package com.ecommerce.shopping;

import java.util.ArrayList;

/**
 * Created by Ravinder Ghai on 9/3/17.
 */
public class PromotionalRulesImpl implements PromotionalRules {

    private String operaHousePromotionRule;
    private String sydneySkyTowerPromotionRule;
    private String sydneyBridgeClimbPromotionRule;

    private int totalOperaHouseTicketsBought;

    public PromotionalRulesImpl() {
        this.operaHousePromotionRule = ShoppingCartConstants.OPERA_HOUSE_PROMOTION_RULE;
        this.sydneySkyTowerPromotionRule = ShoppingCartConstants.SYDNEY_SKY_TOWER_PROMOTION_RULE;
        this.sydneyBridgeClimbPromotionRule = ShoppingCartConstants.SYDNEY_BRIDGE_CLIMB_PROMOTION_RULE;
    }

    @Override
    public double operaHouseDeal(ArrayList<Tour> tours) {

        // Calculate total number of tickets purchased for opera house tour.
        if (null != tours) {
            try {
                for (Tour tour : tours) {
                    if (tour.getId().equals(ShoppingCartConstants.OPERA_HOUSE_TOUR_ID)) {
                        ++totalOperaHouseTicketsBought;
                    }
                }
                // Apply the deal if applicable to compute and return the final tour ticket cost
                if (totalOperaHouseTicketsBought >= 3) {

                    // Logic: compute total sets of 3 tickets (ignoring fractional part)
                    // and multiply them by 2 to find total tickets to be charged
                    return ((totalOperaHouseTicketsBought / ShoppingCartConstants.OPERA_HOUSE_TICKET_SET)
                            * ShoppingCartConstants.OPERA_HOUSE_TICKET_DEAL_SET)
                            * ShoppingCartConstants.OPERA_HOUSE_TOUR_COST;

                } else {
                    return totalOperaHouseTicketsBought * ShoppingCartConstants.OPERA_HOUSE_TOUR_COST;
                }
            } catch (Exception e) {
                System.out.println("Error: there was an error computing tour total.");
                e.printStackTrace();
            }

        }
        // Log error
        System.out.println("Error: tour object is null");
        return 0.00;
    }

    @Override
    public double sydneySkyTowerDeal(ArrayList<Tour> tours) {
        int totalSkyTowerTicketsBought = 0;

        if (null != tours) {
            try {

                // One sky tower ticket free with one opera house ticket bought
                if (totalOperaHouseTicketsBought > 0) {
                    // Applying sydney sky tower FREE deal - 1 for 1 free as per specs
                    return 0.00;

                } else {
                    for (Tour tour : tours) {
                        if (tour.getId().equals(ShoppingCartConstants.SYDNEY_SKY_TOWER_ID)) {
                            ++totalSkyTowerTicketsBought;
                        }
                        return totalSkyTowerTicketsBought * ShoppingCartConstants.SYDNEY_SKY_TOWER_COST;
                    }
                }

            } catch (Exception e) {
                System.out.println("Error: there was an error sky tower tour computing tour total.");
                e.printStackTrace();
            }
        }
        // Log error
        System.out.println("Error: tour object is null");
        return 0.00;
    }

    @Override
    public double sydneyBridgeClimbDeal(ArrayList<Tour> tours) {

        int totalTicketsBought = 0;
        // Calculate total number of tickets purchased for bridge climb tour.
        if (null != tours) {
            try {
                for (Tour tour : tours) {
                    if (tour.getId().equals(ShoppingCartConstants.SYDNEY_BRIDGE_CLIMB_ID)) {
                        ++totalTicketsBought;
                    }
                }

                // Apply the deal if applicable to compute and return the final bridge climb ticket cost
                // Logic: If more than 4 bridge climb tickets bought then price per ticket drops by $20.
                if (totalTicketsBought > 4) {
                    return totalTicketsBought * ShoppingCartConstants.SYDNEY_BRIDGE_CLIMB_TICKET_DEAL;
                } else {
                    return totalTicketsBought * ShoppingCartConstants.SYDNEY_BRIDGE_CLIMB_COST;
                }
            } catch (Exception e) {
                System.out.println("Error: there was an error computing tour total.");
                e.printStackTrace();
            }
        }
        // Log error
        System.out.println("Error: tour object is null");
        return 0.00;
    }

}
