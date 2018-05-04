import org.junit.Assert;
import org.junit.Test;


public class ParenCheckerTest {

    @Test
    public void parenCheckerTest1() {
        // Given
        String parenString = "()";

        // When
        Boolean actual = ParenChecker.CheckParenthesis(parenString);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void parenCheckerTest2() {
        // Given
        String parenString = "()(";

        // When
        Boolean actual = ParenChecker.CheckParenthesis(parenString);

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void parenCheckerTest3() {
        // Given
        String parenString = ")()(";

        //When
        Boolean actual = ParenChecker.CheckParenthesis(parenString);

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void parenCheckerTest4() {
        // Given
        String parenString = "a(d)a";

        //When
        Boolean actual = ParenChecker.CheckParenthesis(parenString);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void parenCheckerTest5() {
        // Given
        String parenString = "a(da";

        //When
        Boolean actual = ParenChecker.CheckParenthesis(parenString);

        // Then
        Assert.assertFalse(actual);
    }


    @Test
    public void TestCheckParenthesisWithEmoji1() {
        // Given
        String checkParenthesisWithEmoji = "i am sick today (:()";

        //When
        Boolean actual = ParenChecker.CheckParenthesisWithEmoji(checkParenthesisWithEmoji);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void TestCheckParenthesisWithEmoji2() {
        // Given
        String checkParenthesisWithEmoji = "(:)";

        //When
        Boolean actual = ParenChecker.CheckParenthesisWithEmoji(checkParenthesisWithEmoji);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void TestCheckParenthesisWithEmoji3() {
        // Given
        String checkParenthesisWithEmoji = "(:";

        //When
        Boolean actual = ParenChecker.CheckParenthesisWithEmoji(checkParenthesisWithEmoji);

        // Then
        Assert.assertFalse(actual);
    }
    @Test
    public void openingAndClosing1() {
        // Given;
        String openingAndClosingString = "({()})";

        //When
        Boolean actual = ParenChecker.openingAndClosing(openingAndClosingString);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void openingAndClosing2() {
        // Given
        String openingAndClosingString = "({)})";

        //When
        Boolean actual = ParenChecker.openingAndClosing(openingAndClosingString);

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void openingAndClosing3() {
        // Given
        String openingAndClosingString = "\"\'({})\'\"";

        //When
        Boolean actual = ParenChecker.openingAndClosing(openingAndClosingString);

        // Then
        Assert.assertTrue(actual);
    }


    @Test
    public void openingAndClosing4() {
        // Given
        String openingAndClosingString = "c\"c\'c(d{a}d)d\'c\"c";

        //When
        Boolean actual = ParenChecker.openingAndClosing(openingAndClosingString);

        // Then
        Assert.assertTrue(actual);
    }

    @Test
    public void openingAndClosing5() {
        // Given
        String openingAndClosingString = "c\"c\'c}d)d\'c\"c";

        //When
        Boolean actual = ParenChecker.openingAndClosing(openingAndClosingString);

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void openingAndClosing6() {
        // Given
        String openingAndClosingString = "{hello'";

        //When
        Boolean actual = ParenChecker.openingAndClosing(openingAndClosingString);

        // Then
        Assert.assertFalse(actual);
    }

    @Test
    public void openingAndClosing7() {
        // Given
        String openingAndClosingString = "{hello} [world]";

        //When
        Boolean actual = ParenChecker.openingAndClosing(openingAndClosingString);

        // Then
        Assert.assertTrue(actual);
    }

}