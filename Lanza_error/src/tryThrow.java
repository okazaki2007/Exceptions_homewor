import java.util.ArrayList;

public class tryThrow {
    static int num1=20;
    static int num2=0;




    public void lis() throws Exception {
        int num=9;

        for(int i=10; i>=0;i--){

            if(i==0){
                throw  new Exception("No es divisible el numero "+num+" entre el numero "+ i );}//creacion de excepcion
            else{
                System.out.println(num+"/"+i+"= "+num/i);
            }


        }
    }




    public void dividir2() throws InterruptedException {
        System.out.println("Dividir "+num1+"/"+ num2+" es igual a:");
        Thread.sleep(15);
        try{
            System.out.println(num1/num2);

        }catch (Exception e) {
            System.err.println("Error al ejecutar la division");
        }
        finally {
            System.out.println("Se procede a cerrar los recursos....");
        }
    }





    public void test(){
        ArrayList r=new ArrayList();
        for(int i=0; i<11; i++){

            try{
                r.add(i);
                System.out.println(r);


            }catch (Exception e){
                System.err.println("Error en agregar elemento a lista");
            }


        }
    }




    public static void main(String[] args) throws Exception {

        System.out.println("\n------------------Prueba metodo numero 1----------------------\n");
        tryThrow t=new tryThrow();

        try{
        t.lis();}
        catch (Exception e){
            System.err.println(e.getMessage());//Obtiene la excepcion creada proviniente del metodo lis()
            Thread.sleep(15);
        }finally {
            System.out.println("Cerrando recursos.....");
        }




        try{
            System.out.println("\n------------------Prueba metodo numero 2----------------------\n");
            Thread.sleep(15);
            t.dividir2();
        }catch (Exception e){
            System.err.println(e.getMessage());///Obtiene mensaje de error proviniente del metodo dividir2()
        }






        try{
            System.out.println("\n------------------Prueba metodo numero 3----------------------\n");
            Thread.sleep(15);
        t.test();}
        catch (Exception e){
            System.err.println(e.getMessage());//Obtiene mensaje de error proviniente del metodo test()
        }
        finally {
            System.out.println("\nLa ejecucion finalizó, cerrando recursos......");
        }
    }
}
