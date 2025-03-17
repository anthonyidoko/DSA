package codility.array.CyclicRotation
fun main(){
    println(solution(intArrayOf(1, 2, 3, 4), 2).toList())
}
fun solution(A: IntArray, K: Int): IntArray {
    if (A.isEmpty() || A.size == K) return A
    val items = A.toMutableList()
    if(K < A.size){
        val itemsToShift = items.subList(A.size-K,A.size)
        items.addAll(0,itemsToShift)
        for(i in 1 .. K){
            items.removeAt(items.size-1)
        }
        return items.toIntArray()
    }
    for(i in 0 until K){
        val itemToShift = items[items.size-1]
        items.add(0,itemToShift)
        items.removeAt(items.size-1)
    }

    return items.toIntArray()
}