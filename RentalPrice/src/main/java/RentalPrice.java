public class RentalPrice {
    public static int rentalPrice(String type, int numberOfDays) {
        int result = -1;
        switch (type) {
            case "hondawave":
                if (numberOfDays >= 1 && numberOfDays <= 3) {
                    result = 120000;
                } else if (numberOfDays >= 4 && numberOfDays <= 6) {
                    result = 100000;
                } else if (numberOfDays >= 7 && numberOfDays <= 14) {
                    result = 80000;
                }
                break;
            case "airblade":
                if (numberOfDays >= 1 && numberOfDays <= 3) {
                    result = 180000;
                } else if (numberOfDays >= 4 && numberOfDays <= 6) {
                    result = 160000;
                } else if (numberOfDays >= 7 && numberOfDays <= 14) {
                    result = 140000;
                }
                break;
            case "exciter":
                if (numberOfDays >= 1 && numberOfDays <= 3) {
                    result = 220000;
                } else if (numberOfDays >= 4 && numberOfDays <= 6) {
                    result = 190000;
                } else if (numberOfDays >= 7 && numberOfDays <= 14) {
                    result = 170000;
                }
                break;
            default:
                result = -1;
        }
        return result;
    }
}
