/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apc;

/**
 *
 * @author Priscilla
 */
public class Aula2 {
    
  /* public static void main( String args[] )
   {
      int count; // variável de controle também utilizada depois que loop termina
      
      for ( count = 1; count <= 10; count++ ) // faz o loop 10 vezes
      {  
         if ( count == 5 ) // se contagem for 5,
            break;         // termina o loop

         System.out.printf( "%d ", count );
      } // for final

      System.out.printf( "\nBroke out of loop at count = %d\n", count );
   } // fim de main*/
    public static void main( String args[] )
   {
      for ( int count = 1; count <= 10; count++ ) // faz o loop 10 vezes
      {  
         if ( count == 5 ) // se contagem for 5,
            continue;      // pula o código restante no loop

         System.out.printf( "%d ", count );
      } // for final

      System.out.println( "\nUsed continue to skip printing 5" );
   } // fim de main
    
}
