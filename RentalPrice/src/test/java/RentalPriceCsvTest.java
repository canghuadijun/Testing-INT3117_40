import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RentalPriceCsvTest {
    @ParameterizedTest
    @CsvFileSource(resources = "/Data.csv", numLinesToSkip = 1)
    void test(String a, int b, int result){
        RentalPrice temp = new RentalPrice();
        assertEquals(temp.rentalPrice(a,b),result);
    }
}