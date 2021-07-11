import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class MainKtTest {


    @Before
    fun setUp() {
    }

    @Test
    fun `empty string returns empty`() {
        val result = reverseString("")
        assertEquals(result.isEmpty(), true )
    }

    @Test
    fun `Good food returns doof dooG`(){
        val result = reverseString("Good food")
        assertEquals(result, "doof dooG")
    }

    @Test
    fun `real test returns tset laer`(){
        val result = reverseString("real test")
        assertEquals(result, "tset laer")
    }

    @Test
    fun `long string works correctly`(){
        val testString = "THE brown fox jumps over the lazy dog."
        val result = reverseString(testString)
        val expected = testString.reversed()
        assertEquals(result, expected)
    }


    @Test
    fun `special characters works correctly`(){
        val testString = "$#%^@!.,;:}{[]."
        val result = reverseString(testString)
        val expected = testString.reversed()
        assertEquals(result, expected)
    }

    @Test
    fun `string of numbers works correctly`(){
        val testString = "1234567890908754632"
        val result = reverseString(testString)
        val expected = testString.reversed()
        assertEquals(result, expected)
    }
}