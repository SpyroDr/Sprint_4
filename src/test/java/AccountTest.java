import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class AccountTest {
    private Account account;
    private String name;
    private Boolean result;

    public AccountTest(String name, Boolean result) {
        this.name = name;
        this.result = result;
    }

    @Before
    public void setUp(){
        account = new Account(name);
    }

    @Parameterized.Parameters(name = "{index}: для имени: {0} метод checkNameToEmboss возвращает {1} ")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                        {"Тимоти Шаламе ", false},
                        {" Тимоти Шаламе", false},
                        {"Тимоти  Шаламе", false},
                        {"Тимоти Шаламе", true},
                        {" ТимотиШаламе", false},
                        {"ТимотиШаламе ", false},
                        {"ТШ", false},
                        {"Т Ш", true},
                        {"Тимоти Шаламепаимпрл", false},
                        {"Тимоти Шаламепаимпд", true},
                        {null, false},
                        {"", false},
                }
        );
    }
    @Test
    public void checkNameToEmbossNotCorrectNameCanNotPrint(){

        assertEquals(result,account.checkNameToEmboss());
    }
}
