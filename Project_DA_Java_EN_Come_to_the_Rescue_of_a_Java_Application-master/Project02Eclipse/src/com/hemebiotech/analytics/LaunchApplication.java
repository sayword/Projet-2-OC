package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class LaunchApplication {

	public static void main(String args[]) throws Exception {

		AnalyticsCounter AnalyticsCounter = new AnalyticsCounter();
		analyticsCounter.readFile("symptoms.txt");

	}
}
