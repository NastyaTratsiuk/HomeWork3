package com.itacademy;

public class Main {

    public static void main(String[] args) {

        Telephone nokia = new Telephone();
        nokia.displeyInfo();
        System.out.println();

        Telephone samsung = new Telephone("samsung", 5, 4);
        samsung.displeyInfo();
        System.out.println("Customer Rating" + samsung.getCustomerRating());
        System.out.println("RAM " + samsung.getRAM());
        System.out.println();

        Telephone lg = new Telephone("lg", true, 140.6f, 2019, 64, 3200, 195, 1499.99, 10);
        lg.setCustomerRating(5);
        lg.setRAM(10);
        lg.displeyInfo();
        System.out.println("Customer Rating " + lg.getCustomerRating());
        System.out.println("RAM " + lg.getRAM());

        System.out.println(lg.colculateTelephoneAndCaseSummaryWeight(lg.weightCase));
        System.out.println(nokia.colculateFlashMemoryAndCard(nokia.memoryCard));
        System.out.println(samsung.colculateSumThiknessPhoneAndCharging(samsung.thickessChargingModule));
        System.out.println(lg.colculatePhonePriseInYear(lg.priceReductionFactor));
        System.out.println(nokia.colculationBatteryPowerInAYear(nokia.batteryReduction));
        nokia.payOfPhone(lg.nfc);
        lg.phonePaymentMethod(lg.nfc);
        nokia.printCameraRating(nokia.cameraPixels);
        lg.printCustomerReviews(lg.getCustomerRating());
        lg.printCustomerReviewsSwitch(lg.getCustomerRating());
        nokia.printAverageBatteryLife(nokia.batteryCapacity);
        lg.printPhoneRAMComparison(lg.getRAM());
        lg.printPhoneRAWComparisonSwitch(lg.getRAM());
        Telephone.batteryConsumption(Telephone.batteryCharge);
        Telephone.batteryConsumptionDoWhile(Telephone.batteryCharge);
        Telephone.printRAMArrays(Telephone.ramArrays);
        Telephone.printRamArraysForeach(Telephone.ramArrays);
        Telephone.sortArrays(Telephone.ramArrays);
        Telephone.sotrArraysFor(Telephone.ramArrays);
        Telephone.printRamArraysForeach(Telephone.ramArrays);
    }
}

