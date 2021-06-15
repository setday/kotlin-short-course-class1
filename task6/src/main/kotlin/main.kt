fun<T> assertCorrectMatrixSize(m: Array<Array<T>>) {
    assert(m.isNotEmpty())
    val cols = m[0].size
    for (row in m.indices.drop(1))
        assert(m[row].size == cols)
}

fun<T> assertSameSizeOfMatrices(m1: Array<Array<T>>, m2: Array<Array<T>>) {
    assertCorrectMatrixSize(m1)
    assertCorrectMatrixSize(m2)
    assert(m1.size == m2.size)
    assert(m1[0].size == m2[0].size)
}

fun<T> createMatrixOfSameSize(m: Array<Array<T>>, default: T): Array<Array<T>> {
    assertCorrectMatrixSize(m)
    val res = m.copyOf()
    for(row in res.indices) {
        res[row] = m[row].copyOf()
        for (col in res[row].indices)
            res[row][col] = default
    }
    return res
}

fun<T> printMatrix(m: Array<Array<T>>) {
    assertCorrectMatrixSize(m)
    for(row in m.indices) {
        for (col in m.indices)
            print(m[row][col])
        println()
    }
}

fun sumOfMatrices(m1: Array<Array<Int>>, m2: Array<Array<Int>>): Array<Array<Int>> {
    assertSameSizeOfMatrices(m1, m2)
    val res = createMatrixOfSameSize(m1, 0)
    for(row in res.indices)
        for(col in res[row].indices)
            res[row][col] = m1[row][col] + m2[row][col]
    return res
}

fun main() {
    val m: Array<Array<Int>> = arrayOf(
        arrayOf(1,0,0),
        arrayOf(0,1,0),
        arrayOf(0,0,1)
    )
    printMatrix(sumOfMatrices(m, m))
}