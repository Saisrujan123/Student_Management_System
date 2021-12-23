fun main(args: Array<String>) {
    var math1=50.5
    var math2=60.5
    var science1=70.0
    var science2=80.0
    var eng1=30.0
    var eng2=35.0
    var perc1=((math1+science1+eng1)/300)*100
    var perc2=((math2+science2+eng2)/300)*100
    val admin_pwd="admin_password"
    val student1_pwd="student1_password"
    val student2_pwd="student2_password"
    while (true) {
        println("press 1 if you are an admin or 2 if you are a student or anything else to exit")
        val inp = readLine()
        if (inp == "1") {
            println("please enter your password")
            val pwd = readLine()
            if (pwd == admin_pwd) {
                println("Student 1 marks")
                println("english:-${eng1}")
                println("maths:-${math1}")
                println("science:-${science1}")
                println("percentage:-${perc1}")
                println()
                println("Student 2 marks")
                println("english:-${eng2}")
                println("maths:-${math2}")
                println("science:-${science2}")
                println("percentage:-${perc2}")
                println("press 1 to edit or anything else to logout")
                val z = readLine()
                if (z == "1") {
                    println("press 1 for student1 or 2 for student2")
                    val x = readLine()
                    if (x == "1") {
                        println("enter the subject code(eng,math,science)")
                        val y = readLine()
                        if (y == "math") {
                            println("enter new marks")
                            var i = readLine()
                            if (i != null) {
                                math1 = i.toDouble()
                            }
                            perc1 = ((math1 + science1 + eng1) / 300) * 100

                        } else if (y == "eng") {
                            println("enter new marks")
                            val i = readLine()
                            if (i != null)
                                eng1 = i.toDouble()
                            perc1 = ((math1 + science1 + eng1) / 300) * 100

                        } else if (y == "science") {
                            println("enter new marks")
                            val i = readLine()
                            if (i != null)
                                science1 = i.toDouble()
                            perc1 = ((math1 + science1 + eng1) / 300) * 100

                        } else {
                            println("log in again and Please enter a correct subject code")

                        }

                    } else if (x == "2") {
                        println("enter the subject code(eng,math,science)")
                        val y = readLine()
                        if (y == "math") {
                            println("enter new marks")
                            var i = readLine()
                            if (i != null)
                                math2 = i.toDouble()
                            perc2 = ((math2 + science2 + eng2) / 300) * 100

                        } else if (y == "eng") {
                            println("enter new marks")
                            val i = readLine()
                            if (i != null)
                                eng2 = i.toDouble()
                            perc2 = ((math2 + science2 + eng2) / 300) * 100

                        } else if (y == "science") {
                            println("enter new marks")
                            val i = readLine()
                            if (i != null)
                                science2 = i.toDouble()
                            perc2 = ((math2 + science2 + eng2) / 300) * 100

                        } else {
                            println(" log in again and Please enter a correct subject code")
                        }
                    } else {
                        println("log in again and please enter a correct number")
                    }
                }


            } else {
                println("Sorry the password you entered is incorrect")
            }

        } else if (inp == "2") {
            println("please enter your password")
            val pwd = readLine()
            if (pwd == student1_pwd) {
                println("Student 1 marks")
                println("english:-${eng1}")
                println("maths:-${math1}")
                println("science:-${science1}")
                println("percentage:-${perc1}")
            } else if (pwd == student2_pwd) {
                println("Student 2 marks")
                println("english:-${eng2}")
                println("maths:-${math2}")
                println("science:-${science2}")
                println("percentage:-${perc2}")
            } else {
                println("Sorry the password you entered is incorrect")
            }
        } else {
            break
        }
        println("session logged out")
    }


}