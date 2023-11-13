package com.wingmann.algorithms.search

fun <T : Comparable<T>> linearSearch(data: List<T>, query: T): Int {
    if (data.isEmpty()) {
        return -1
    }

    for (i in data.indices) {
        if (query.compareTo(data[i]) == 0) {
            return i
        }
    }

    return -1
}
