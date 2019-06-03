fun main()
{
    var m1 = readLine()!!.split(' ').map{it.toInt()}
    var (m) = m1
    while(true)
    {
        m =  m - 1
        if (m == -1) break;
        var n = readLine()!!.split(' ').map{it.toInt()}
 		var (a,b) = n
        if(a==b) 
        {
            print("${(a-1)} 1 1")
        } else 
        {
            if(a>b)
            {
                print("${(a-b+1)} 1 ${(b-1)}")
            } else 
            {
                print("${(b-a+1)} 1 ${(a-1)}")
            }
            
        }
        println("")
        
    }
}