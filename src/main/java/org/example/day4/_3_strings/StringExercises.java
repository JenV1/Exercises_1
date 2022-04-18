package org.example.day4._3_strings;

public class StringExercises {
    /*
       TODO 9
       Prefix the param with 'Good job, '

       goodJob("Anna")          -> "Good job, Anna!"
       goodJob("my friend")     -> "Good job, my friend!"
       goodJob("XYZ")           -> "Good job, XYZ!"
       goodJob("Indiana Jones") -> "Good job, Indiana Jones!"

    */
    String goodJob(String name) {

        return "Good job, " + name +"!";
    }

    /*
       TODO 10
       If String is even length, return first half x2. Else return original String.

       doubleFirstHalf("HeyYou")   -> "HeyHey"
       doubleFirstHalf("12345678") -> "12341234"
       doubleFirstHalf("M")        -> "M"
       doubleFirstHalf("panda")    -> "panda"
    */
    String doubleFirstHalf(String str) {

        int length = str.length();

        if (length%2 == 0) {
            return str.substring(0, length/2).repeat(2);
        }

        return str;
    }

    /*
        TODO 11

        interlace("A", "B")      -> "ABABA"
        interlace("Sun", "Moon") -> "SunMoonSunMoonSun"
        interlace("blue", "red") -> "blueredblueredblue"
        interlace("Hi", "Ciao")  -> "HiCiaoHiCiaoHi"
     */
    String interlace(String a, String b) {

        return a+b+a+b+a;
    }

    /*
        TODO 12

        cutEnds("Java")  -> "av"
        cutEnds("koala") -> "oal"
        cutEnds("XX")    -> ""
        cutEnds("a")     -> ""
     */
    String cutEnds(String str) {
        int length = str.length();

        if (length == 1) {
            return "";
        }

        String substring = str.substring(1, length - 1);
        return substring;
    }

    /*

       TODO 13

       addTags("smile", "i")        -> <i>smile</i>
       addTags("777666555", "phone" -> <phone>777666555</phone>
       addTags("welcome", "header"  -> <header>welcome</header>
     */
    String addTags(String word, String tag) {

        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    /*

       TODO 14

       copyLastChars("computer") -> "ter ter"
       copyLastChars("ABCD")     -> "BCD BCD"
       copyLastChars("Hi")       -> "Hi Hi"
       copyLastChars("Amazing")  -> "ing ing"
     */
    String copyLastChars(String str) {
        int length = str.length();

        if (length<3) {
            return str + " " + str;
        } else {
            String substring = str.substring(length-3, length);
            return substring + " " + substring;
        }

    }
}
