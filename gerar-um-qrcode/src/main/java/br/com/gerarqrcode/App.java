package br.com.gerarqrcode;

/**
 * Hello world!
 * https:www.journaldev.com/470/java-qr-code-generator-zxing-example
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Generate gerar;
         gerar = new Generate();         
         gerar.generateQR(args[0],args[1]);
    }
}