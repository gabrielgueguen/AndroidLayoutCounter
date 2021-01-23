package com.example.androidlayoutcounter
/*
 * Author: Gabriel Gueguen
 *  Title: Android Dev Assignment 1 - Counter
 *   Date: 2021-01-22
 */
class Counter(var count: Int = 0) {
    /**
     * Increment count value
     */
    fun countUp() {
        count++
    }

    /**
     * Decrement count value
     */
    fun countDown() {
        count--
    }
}