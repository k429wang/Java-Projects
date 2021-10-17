package me.KaitheKiwi.gathering_profit_calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	/* 1. gather resources (track amount of each tier of resource gathered)
	 * 2. find tax at each city, as well as resource return rate to calculate total costs and amount of each refined product
	 * 3. find price of each product at each cities market and check where is best place to sell (keep in mind distance from refining city and gathering area)
	 *  
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		/* declare all variables:
		 * - amount of each tier of raw resource
		 * - tax and resource return rate of each city
		 * - market price of each tier of refined resource
		 */
		
		//input variables
		double oret4 = Double.parseDouble(in.readLine()), oret5 = Double.parseDouble(in.readLine()); //oret6 = Double.parseDouble(in.readLine());
		double taxFort = 0, taxThet = 0, taxBridge = 0, taxLym = 0, taxMart = 0, taxCaer = 0;
		double rrr = 1.152, rrrBonus = 1.361;
		
		double priceT4Fort = Double.parseDouble(in.readLine()), priceT5Fort = Double.parseDouble(in.readLine()), priceT6Fort = Double.parseDouble(in.readLine());
		double priceT4Thet = Double.parseDouble(in.readLine()), priceT5Thet = Double.parseDouble(in.readLine()), priceT6Thet = Double.parseDouble(in.readLine());
		double priceT4Bridge = Double.parseDouble(in.readLine()), priceT5Bridge = Double.parseDouble(in.readLine()), priceT6Bridge = Double.parseDouble(in.readLine());
		double priceT4Lym = Double.parseDouble(in.readLine()), priceT5Lym = Double.parseDouble(in.readLine()), priceT6Lym = Double.parseDouble(in.readLine());
		double priceT4Mart = Double.parseDouble(in.readLine()), priceT5Mart = Double.parseDouble(in.readLine()), priceT6Mart = Double.parseDouble(in.readLine());
		double priceT4Caer = Double.parseDouble(in.readLine()), priceT5Caer = Double.parseDouble(in.readLine()), priceT6Caer = Double.parseDouble(in.readLine());

		
		//output variables
		
		//cost to refine resources in each city
		double costFort = 0;
		double costThet = 0;
		double costBridge = 0;
		double costLym = 0;
		double costMart = 0;
		double costCaer = 0;
		
		//amount of refined resource
		double barT4 = 0;
		double barT5 = 0;
		double barT6 = 0;
		double barT4Thet = 0;
		double barT5Thet = 0;
		double barT6Thet = 0;
		
		//profit from selling in each city
		double profitFort = (barT4*priceT4Fort)+(barT5+priceT5Fort)+(barT6+priceT6Fort);
		double profitThet = (barT4Thet*priceT4Thet)+(barT5Thet+priceT5Thet)+(barT6Thet+priceT6Thet);
		double profitBridge = (barT4*priceT4Bridge)+(barT5+priceT5Bridge)+(barT6+priceT6Bridge);
		double profitLym = (barT4*priceT4Lym)+(barT5+priceT5Lym)+(barT6+priceT6Lym);
		double profitMart = (barT4*priceT4Mart)+(barT5+priceT5Mart)+(barT6+priceT6Mart);
		double profitCaer = (barT4*priceT4Caer)+(barT5+priceT5Caer)+(barT6+priceT6Caer);
		
	}

}
