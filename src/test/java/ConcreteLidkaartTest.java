import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class ConcreteLidkaartTest {

    @Test
    public void noAdditionalStuff_shouldReturnNormalPrice() throws Exception {
        Lidkaart lidkaart = new ConcreteLidkaart();
        int expected = 100;

        Assertions.assertThat(lidkaart.getPrice()).isEqualTo(expected);


    }

    @Test
    public void addingKlimmuurToLidkaart_shouldAddToTotal() throws Exception {
        Lidkaart lidkaart = new ConcreteLidkaart();

        int expected = 115;

        lidkaart = new Klimmuur(lidkaart);

        int actual = lidkaart.getPrice();

        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void addingEverythingToLidkaart_shouldAddToTotal() throws Exception {
        Lidkaart lidkaart = new ConcreteLidkaart();

        int expected = 185;

        lidkaart = new Klimmuur(lidkaart);
        lidkaart = new Zwembad(lidkaart);
        lidkaart = new Groepslessen(lidkaart);

        int actual = lidkaart.getPrice();

        Assertions.assertThat(actual).isEqualTo(expected);

    }
}