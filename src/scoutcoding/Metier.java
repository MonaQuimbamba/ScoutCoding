package scoutcoding;
import java.awt.Desktop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;  
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Metier
{
  //@attributs 
  
  char[] listToTranslater = new char[20000] ;
  

 
 // id for code
 
 int id;
 
 public Metier()
  {
    super();
    
  }
  /******************************/
 String textCodeIn="";
 ArrayList<String> textCodeOut= new ArrayList<String>();
 public void setTextIn(String c)
 {textCodeIn=c;}

 public String getTextIn()
 { return textCodeIn; }

  public void setTextCodeOut(ArrayList<String> textCodeOut)
  {
    this.textCodeOut = textCodeOut;
  }

  public void setTextOut(String c)
  {textCodeOut.add(c);}
  
  public ArrayList<String> tesTextOut()
  {
    return textCodeOut;
  }
  
  public String getTextOut()
  {
    String res="";
    for(String c : textCodeOut)
    {
      res+= c;
    }
   return res;
  }
      
  public void translation()
  {

    
    if(this.getTextIn().isEmpty())
    {
      // code
    }

    else
    {
     int i=0;
      int count =getTextIn().length();
    while(i<count)  
    {  
      // start to write
     // if(Character.compare(listToTranslater[i],'A')==0 || Character.compare(listToTranslater[i],'a')==0)
     
      if(Character.compare( this.getTextIn().charAt(i),'A')==0 || Character.compare( this.getTextIn().charAt(i),'a')==0)
      {
         setTextOut(code()[1]);
      }
      else if(Character.compare( this.getTextIn().charAt(i),'B')==0 || Character.compare( this.getTextIn().charAt(i),'b')==0)
      {
         setTextOut(code()[2]);
      }
      else if(Character.compare( this.getTextIn().charAt(i),'C')==0 || Character.compare( this.getTextIn().charAt(i),'c')==0)
       {
          setTextOut(code()[3]);
       }
      else if(Character.compare( this.getTextIn().charAt(i),'D')==0 || Character.compare( this.getTextIn().charAt(i),'d')==0)
       {
         setTextOut(code()[4]);
       }
      else if(Character.compare( this.getTextIn().charAt(i),'E')==0 || Character.compare( this.getTextIn().charAt(i),'e')==0)
       {
          setTextOut(code()[5]);
       }
      else if(Character.compare( this.getTextIn().charAt(i),'F')==0 || Character.compare( this.getTextIn().charAt(i),'f')==0)
       {
          setTextOut(code()[6]);
       }
      else if(Character.compare( this.getTextIn().charAt(i),'G')==0 || Character.compare( this.getTextIn().charAt(i),'g')==0)
       {
          setTextOut(code()[7]);
       }
      else if(Character.compare( this.getTextIn().charAt(i),'H')==0 || Character.compare( this.getTextIn().charAt(i),'h')==0)
       {
          setTextOut(code()[8]);
       }
      else if(Character.compare( this.getTextIn().charAt(i),'I')==0 || Character.compare( this.getTextIn().charAt(i),'i')==0)
       {
          setTextOut(code()[9]);
       }
      else if(Character.compare( this.getTextIn().charAt(i),'J')==0 || Character.compare( this.getTextIn().charAt(i),'j')==0)
       {
          setTextOut(code()[10]);
       }
      else if(Character.compare( this.getTextIn().charAt(i),'K')==0 || Character.compare( this.getTextIn().charAt(i),'k')==0)
       {
          setTextOut(code()[11]);
       }
      else if(Character.compare( this.getTextIn().charAt(i),'L')==0 || Character.compare( this.getTextIn().charAt(i),'l')==0)
       {
          setTextOut(code()[12]);
       }
      else if(Character.compare( this.getTextIn().charAt(i),'M')==0 || Character.compare( this.getTextIn().charAt(i),'m')==0)
       {  setTextOut(code()[13]);
       }
      else if(Character.compare( this.getTextIn().charAt(i),'N')==0 || Character.compare( this.getTextIn().charAt(i),'n')==0)
       {
          setTextOut(code()[14]);
       }
      else if(Character.compare( this.getTextIn().charAt(i),'O')==0 || Character.compare( this.getTextIn().charAt(i),'o')==0)
       {
          setTextOut(code()[15]);
       }
      else if(Character.compare( this.getTextIn().charAt(i),'P')==0 || Character.compare( this.getTextIn().charAt(i),'p')==0)
       {
          setTextOut(code()[16]);
       }
      else if(Character.compare( this.getTextIn().charAt(i),'Q')==0 || Character.compare( this.getTextIn().charAt(i),'q')==0)
       {
          setTextOut(code()[17]);
       }
      else if(Character.compare( this.getTextIn().charAt(i),'R')==0 || Character.compare( this.getTextIn().charAt(i),'r')==0)
       {
          setTextOut(code()[18]);
       }
      else if(Character.compare( this.getTextIn().charAt(i),'S')==0 || Character.compare( this.getTextIn().charAt(i),'s')==0)
       {
          setTextOut(code()[19]);
       }
      else if(Character.compare( this.getTextIn().charAt(i),'T')==0 || Character.compare( this.getTextIn().charAt(i),'t')==0)
       {
          setTextOut(code()[20]);
       }
      else if(Character.compare( this.getTextIn().charAt(i),'U')==0 || Character.compare( this.getTextIn().charAt(i),'u')==0)
       {
          setTextOut(code()[21]);
       }
      else if(Character.compare( this.getTextIn().charAt(i),'V')==0 || Character.compare( this.getTextIn().charAt(i),'v')==0)
       {
          setTextOut(code()[22]);
       }
      else if(Character.compare( this.getTextIn().charAt(i),'W')==0 || Character.compare( this.getTextIn().charAt(i),'w')==0)
       {
          setTextOut(code()[23]);
       }
      else if(Character.compare( this.getTextIn().charAt(i),'X')==0 || Character.compare( this.getTextIn().charAt(i),'x')==0)
       {
          setTextOut(code()[24]);
       }
      else if(Character.compare( this.getTextIn().charAt(i),'Y')==0 || Character.compare( this.getTextIn().charAt(i),'y')==0)
       {
          setTextOut(code()[25]);
       }
      else if(Character.compare( this.getTextIn().charAt(i),'Z')==0 || Character.compare( this.getTextIn().charAt(i),'z')==0)
       {
          setTextOut(code()[26]);
       }
      else
      {
         //setTextOut(" ");
      }
  
      i++;
    }  
    
  }
    
  }
  
  public String[] code()
  {
             
    // list of codes
    String[] codeTX = {"TX","TXA","TXB","TXC","TXD", "TXE", "TXF", "TXG","TXH","TXI","TXJ","TXK","TXL","TXM","TXN","TXO","TXP","TXQ","TXR","TXS","TXT","TXU","TXV","TXW","TXX","TXY","TXZ"};
    String[] codeIver = {"Iver","Z","Y","X","W","V","U","T","S","R","Q","P","O","N","M","L","K","J","I","H","G","F","E","D","C","B","A"};
    String[] codeMorse ={"Morse","·- ","-··· ","-·-· ","-·· ","· ","··-· ","--· ","···· ","·· ","·--- ","-·- ","·-·· ","-- ","-· ","--- ","·--· ","--·- ","·-· ","··· ","- ","··- ","···- ","·-- ","-··- ","-·-- ","--·· "};
    String[] codeRonArab ={"RonAra","I","1","2","3","II","4","5","6","III","7","8","9","10","11","IV","12","13","14","15","16","V","17","18","19","20","21"};
    String[] codeVoPont = {"VoPont",".","B","C","D", ".", "F", "G","H",".","J","K","L","M","N",".","P","Q","R","S","T",".","V","W","X","Y","Z"};
    String[] codeNumeral = {"NumC","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26"};
    if(getCode()==1)
    {
     return codeTX;
    }
    else if (getCode()==2)
    {
      return codeIver;
    }
    else if (getCode()==3)
    {
      return codeMorse;
    }
    else if (getCode()==4)
    {
      return codeRonArab;
    }
    else if (getCode()==5)
    {
      return codeVoPont;
    }
    else if (getCode()==6)
    {
      return codeNumeral;
    }
    
    return null;
  }
  
  public void caranguejo()
  {
    try
    {setTextOut(miroir(this.getTextIn()));}
      catch(Exception e)
      {e.printStackTrace();}
    
  }
  
  public static String miroir(String c)
  { String res="";
    if(!c.isEmpty())
    {
      res= miroir(c.substring(1))+c.charAt(0);
    }
    return res;
  }

  public void setCode(int i)
  {
    this.id=i;
  }
  
  public Integer getCode()
  {
    return this.id;
  }
 
  
}
