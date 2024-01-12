// import pour les tests
import org.junit.Test;

// import mes deux versions
import ressources.L22GenateParentheses;
import maVersion.L22GenateParenthesesMy;

// import pour assert (comparaison)
import static org.junit.Assert.assertEquals;

// import les outils
import java.util.Arrays;
import java.util.List;

public class L22GenateParenthesesTest {

    @Test
    public void testGenerateParenthesis() {
        L22GenateParentheses generator = new L22GenateParentheses();

        // Test avec n = 1
        List<String> result1 = generator.generateParenthesis(1);
        List<String> expected1 = Arrays.asList("()");
        assertEquals(expected1, result1);

        // Test avec n = 2
        List<String> result2 = generator.generateParenthesis(2);
        List<String> expected2 = Arrays.asList("(())", "()()");
        assertEquals(expected2, result2);
    }

    @Test
    public void testGenerateParenthesisMy() {
        L22GenateParenthesesMy generator = new L22GenateParenthesesMy();

        // Test avec n = 1
        List<String> result1 = generator.generateParenthesis(1);
        List<String> expected1 = Arrays.asList("()");
        assertEquals(expected1, result1);

        // Test avec n = 2
        List<String> result2 = generator.generateParenthesis(2);
        List<String> expected2 = Arrays.asList("(())", "()()");
        assertEquals(expected2, result2);
    }
}