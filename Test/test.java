@Test
public void isLeapYear_forNumbersNotDivisibleByFour_false(){
        LeapYear leapYear = new LeapYear();
        assertEquals(false, leapYear.isLeapYear(1999));
        }