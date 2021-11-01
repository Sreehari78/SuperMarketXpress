/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarketbillingsystem;

/**
 *
 * @author User
 */
public class SuperMarketBillingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LoadingPage loadPage = new LoadingPage();
        LoadingPage.LoadingBar();
        loadPage.setVisible(true);
        loadPage.dispose();
    }
    
}
