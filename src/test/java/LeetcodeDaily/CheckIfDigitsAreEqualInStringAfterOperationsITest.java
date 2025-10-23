package LeetcodeDaily;

import LeetcodeDaily.CheckIfDigitsAreEqualInStringAfterOperationsI;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CheckIfDigitsAreEqualInStringAfterOperationsITest {

    @Test
    public void returnsTrueForStringWithFinalEqualDigits() {
        CheckIfDigitsAreEqualInStringAfterOperationsI checker = new CheckIfDigitsAreEqualInStringAfterOperationsI();
        assertTrue(checker.hasSameDigits("1234"));
    }

    @Test
    public void returnsFalseForStringWithFinalUnequalDigits() {
        CheckIfDigitsAreEqualInStringAfterOperationsI checker = new CheckIfDigitsAreEqualInStringAfterOperationsI();
        assertFalse(checker.hasSameDigits("1235"));
    }

    @Test
    public void returnsTrueForStringOfLengthTwoWithEqualDigits() {
        CheckIfDigitsAreEqualInStringAfterOperationsI checker = new CheckIfDigitsAreEqualInStringAfterOperationsI();
        assertTrue(checker.hasSameDigits("77"));
    }

    @Test
    public void returnsFalseForStringOfLengthTwoWithUnequalDigits() {
        CheckIfDigitsAreEqualInStringAfterOperationsI checker = new CheckIfDigitsAreEqualInStringAfterOperationsI();
        assertFalse(checker.hasSameDigits("78"));
    }

    @Test
    public void handlesStringWithAllSameDigits() {
        CheckIfDigitsAreEqualInStringAfterOperationsI checker = new CheckIfDigitsAreEqualInStringAfterOperationsI();
        assertTrue(checker.hasSameDigits("1111"));
    }

    @Test
    public void handlesStringWithZeros() {
        CheckIfDigitsAreEqualInStringAfterOperationsI checker = new CheckIfDigitsAreEqualInStringAfterOperationsI();
        assertTrue(checker.hasSameDigits("0000"));
    }

    @Test
    public void handlesStringWithAlternatingDigits() {
        CheckIfDigitsAreEqualInStringAfterOperationsI checker = new CheckIfDigitsAreEqualInStringAfterOperationsI();
        assertFalse(checker.hasSameDigits("1010"));
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void handlesStringWithSingleDigit() {
        CheckIfDigitsAreEqualInStringAfterOperationsI checker = new CheckIfDigitsAreEqualInStringAfterOperationsI();
        checker.hasSameDigits("1");
    }

    @Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
    public void handlesEmptyString() {
        CheckIfDigitsAreEqualInStringAfterOperationsI checker = new CheckIfDigitsAreEqualInStringAfterOperationsI();
        checker.hasSameDigits("");
    }
}
