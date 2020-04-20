package com.revature.rapp.controller;

public class timetowords {

    // Complete the timeInWords function below.
    static String timeInWords(int h, int m) {
     String strHour = "";
     String strMinute  = "";
     String strOutput = "";
     if (m==0) {
      strOutput = numberInWords(h) + " o\' clock";
      }
      else if(m<=30){
         strHour =  numberInWords(h);
         strMinute = numberInWords(m);
         if(m==1)
         {
          strMinute+= " minute";
         }
         else
         {
           strMinute+= " minutes";  
         }
        if (m==15)
          strMinute ="quarter";
        else if(m==30)
          strMinute ="half";

          strOutput = strMinute + " past " + strHour;
      }
      else
      {
         strHour =  numberInWords(h+1);
         strMinute = numberInWords(60-m);
          if ((60-m)==15){
          strMinute ="quarter";
          strOutput = strMinute + " to " + strHour;
          }
          else if ((60-m)==1){
           strOutput = strMinute + " minute to " + strHour;
          }
          else
          {
         strOutput = strMinute + " minutes to " + strHour;
          }

         
      }


  return (strOutput);
    }

static String numberInWords(int n)
{
          String strHour = "";
        switch(n) {
      case 1:
      strHour = "one";
      break;
      case 2:
      strHour = "two";
       break;
      case 3:
      strHour = "three";
       break;
      case 4:
      strHour = "four";
       break;
      case 5:
      strHour = "five";
       break;
      case 6:
      strHour = "six";
       break;
      case 7:
     strHour = "seven";
      break;
      case 8:
      strHour = "eight";
       break;
      case 9:
      strHour = "nine";
       break;
      case 10:
      strHour = "ten";
       break;
      case 11:
      strHour = "eleven";  
       break;
      case 12:
      strHour = "twelve";
       break;
      case 13:
      strHour = "thirteen";
       break;
      case 14:
      strHour = "fourteen"; 
       break;
      case 15:
      strHour = "fifteen";
       break;
      case 16:
      strHour = "sixteen";
       break;
      case 17:
      strHour = "seventeen";
       break;
       case 18:
      strHour = "eighteen";
       break;
      case 19:
       strHour = "ninteen";
       break;
         case 20:
       strHour = "twenty";
       break;
           case 21:
       strHour = "twenty one";
       break;
                case 22:
       strHour = "twenty two";
       break;
                case 23:
       strHour = "twenty three";
       break;
                case 24:
       strHour = "twenty four";
       break;
                case 25:
       strHour = "twenty five";
       break;
                case 26:
       strHour = "twenty six";
       break;
                case 27:
       strHour = "twenty seven";
       break;
                case 28:
       strHour = "twenty eight";
       break;
                case 29:
       strHour = "twenty nine";
       break;     
       default:
    // code block
    }
    return  strHour;
}
}
