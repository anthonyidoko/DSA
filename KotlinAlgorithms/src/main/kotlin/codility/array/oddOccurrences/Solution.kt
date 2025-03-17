package codility.array.oddOccurrences

fun main(){
    println(solution(intArrayOf(9, 3, 9, 3, 9, 7, 9)))
}

fun solution(input: IntArray): Int{
    input.groupBy { it }.forEach { (key, value) ->
        if (value.size % 2 > 0){
            return key
        }
    }
    return 0

}