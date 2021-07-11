import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class MainKtTest {


    @Before
    fun setUp() {
    }

    @Test
    fun `empty array returns 0`(){
        val result = sumOfSquares(arrayListOf())
        assertEquals(result, 0)
    }

    @Test
    fun `1, 2, 2, returns 9`(){
        val result = sumOfSquares(arrayListOf(1, 2, 2))
        assertEquals(result, 9)
    }

    @Test
    fun `1, 2, 3 returns 14`(){
        val result = sumOfSquares(arrayListOf(1, 2, 3))
        assertEquals(result, 14)
    }

    @Test
    fun `3, 6, 9 returns 126`(){
        val result = sumOfSquares(arrayListOf(3, 6, 9))
        assertEquals(result, 126)
    }

    @Test
    fun `10, 12, 12 returns 388`(){
        val result = sumOfSquares(arrayListOf(10, 12, 12))
        assertEquals(result, 388)
    }

    @Test
    fun `2, 2, 3, 3, 4, 5, 6 returns 103`(){
        val result = sumOfSquares(arrayListOf(2, 2, 3, 3, 4, 5, 6))
        assertEquals(result, 103)
    }

    @Test
    fun `25, 30, 49, 100 returns 13926`(){
        val result = sumOfSquares(arrayListOf(25, 30, 49, 100))
        assertEquals(result, 13926)
    }

}