fun main(args: Array<String>)
{
    var m=readLine()!!.toInt()
    var ar=readLine()!!.split(' ').map{it.toInt()}
    var a = 0
    var b = 0
    var ans = 0
    for( x in ar) {
        if(x<b) ans++
        else if(x>a) {
            b = a
            a = x
        }
        else if(x>b) b = x
    }
    print(ans)
}