package com.wingmann.algorithms.search

import org.junit.jupiter.api.Test

class LinearSearcherTest {
    @Test
    fun testLinearSearch1() {
        val array = listOf(1, 2, 4, 5, 3, 9, 53)
        val key = 5

        assert(linearSearch(array, key) == 3)
    }

    @Test
    fun testLinearSearch2() {
        val array = listOf(1, 4, 3)
        val key = 9

        assert(linearSearch(array, key) == -1)
    }

    @Test
    fun testLinearSearch3() {
        val array = listOf('a', 'c', 'e', 'd')
        val key = 'c'

        assert(linearSearch(array, key) == 1)
    }

    @Test
    fun testLinearSearch4() {
        val array = listOf("Hey", "There", "How", "Are", "You")
        val key = "You"

        assert(linearSearch(array, key) == 4)
    }
}
