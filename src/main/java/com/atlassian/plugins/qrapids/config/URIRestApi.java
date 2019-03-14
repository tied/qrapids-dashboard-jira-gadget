package com.atlassian.plugins.qrapids.config;

public class URIRestApi {

    private static URIRestApi single_instance;
    private static String URISICurrentEvaluation = "/SICurrent";//"/api/StrategicIndicators/CurrentEvaluation";
    private static String URISIHistoricalData = "/SIHistorical";//"api/StrategicIndicators/HistoricalData";
    private static String URIDSICurrentEvaluation = "/DSICurrent";//"/api/DetailedStrategicIndicators/CurrentEvaluation";
    private static String URIDSIHistoricalData = "/api/DetailedStrategicIndicators/HistoricalData";
    private static String URIQFCurrentEvaluation = "/api/QualityFactors/CurrentEvaluation";
    private static String URIQFHistoricalData = "/api/QualityFactors/HistoricalData";
    private static String URIMCurrentEvaluation = "/api/Metrics/CurrentEvaluation";
    private static String URIMHistoricalData = "/api/Metrics/HistoricalData";

    public static URIRestApi getInstance() {
        if (single_instance == null)
            single_instance = new URIRestApi();

        return single_instance;
    }

    private URIRestApi() {
    }

    public static String getURISICurrentEvaluation() {
        return URISICurrentEvaluation;
    }

    public static String getURISIHistoricalData() {
        return URISIHistoricalData;
    }

    public static String getURIDSICurrentEvaluation() {
        return URIDSICurrentEvaluation;
    }

    public static String getURIDSIHistoricalData() {
        return URIDSIHistoricalData;
    }

    public static String getURIQFCurrentEvaluation() {
        return URIQFCurrentEvaluation;
    }

    public static String getURIQFHistoricalData() {
        return URIQFHistoricalData;
    }

    public static String getURIMCurrentEvaluation() {
        return URIMCurrentEvaluation;
    }

    public static String getURIMHistoricalData() {
        return URIMHistoricalData;
    }
}