package pen;
import java.util.Scanner;
/**
 *
 * @author yairv, irvingv
 */
public class PerdidoEnLaNoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner god=new Scanner(System.in);
        // TODO code application logic here
        int hola;
        hola=1;
        do{
            System.out.println("Perdido en la noche");
            System.out.println("I-Iniciar");
            System.out.println("C-Créditos");
            System.out.println("S-Salir");
        String opcion=god.nextLine();
        switch (opcion){
            case "i":
                hola=2;
                break;
            case "c":
                System.out.println("Este juego fue creado por:");
                System.out.println("Yair Vásquez Castro");
                System.out.println("Irving Gonzalo Vazquez Trinidad");
               break;
            case "s":
                System.out.println("No camines solo por la noche, la proxima historia podria ser la tuya....");
                System.exit(0);
                return;
                }
            } while (hola==1);
        /* escena 1 */
        System.out.println("Son las 11:00 de la noche, te dirigias hacia tu casa hasta que se apaga tu coche.");
        System.out.println("Sales de tu coche y miras a los alrededores, pero solo logras ver una casa a la distancia");
        int juego, caminoa, caminob, muerte, ending;
        juego=1;
        caminoa=0;
        caminob=0;
        ending=0;
        do{
            System.out.println("Estas parado cerca de tu coche");
            System.out.println("1.-Caminar hacia la casa");
            System.out.println("2.-Esperar en la carretera por ayuda");
            System.out.println("3.-Caminar por la carretera");
        String jugador=god.nextLine();
        switch (jugador){
            case "1":
                System.out.println("Empiezas a caminar hacia la casa por un camino hecho de tierra");
                caminoa=1;
                juego=2;
            break;
            case "2":
                System.out.println("Esperas en la carretera por mucho tiempo. No aparece ningun carro, sin embargo, te sientes observado....");
            break;
            case "3":
                System.out.println("Caminas por la carretera.");
                caminob=1;
                juego=2;
        }
        }while (juego==1);
        /* escena a.1 */
        if(caminoa==1){
        System.out.println("Seguir el camino de tierra te llevo al bosque.");
        do{
            System.out.println("Sientes que te observan...");
            System.out.println("1.-Seguir caminando");
            System.out.println("2.-Gritar de forma amenazante");
            System.out.println("3.-Regresar a la carretera");
        String jugador=god.nextLine();
        switch (jugador){
            case "1":
                System.out.println("Se te acelera el corazon tan solo con pensar que te observan, asi que sigues caminando...");
                caminoa=2;
                juego=3;
            break;
            case "2":
                System.out.println("Gritas varios insultos al aire, pero nadie responde...");
            break;
            case "3":
                System.out.println("Te envuelve el miedo y regresas a la carretera");
                caminoa=0;
                caminob=1;
                juego=3;
            break;
        }
        }while (juego==2);
        }else{
            System.out.println("");
        }
                /* escena a.2 */
        if(caminoa==2){
        System.out.println("Llegas a la casa, las luces se encuentran apagadas pero escuchas ruido dentro de esta");
        do{
            System.out.println("La puerta de la casa esta ligeramente abierta...");
            System.out.println("1.-Entrar a la casa");
            System.out.println("2.-Revisar los alrededores de la casa");
        String jugador=god.nextLine();
        switch (jugador){
            case "1":
                System.out.println("Abres la puerta en silencio. No ves a nadie, por lo que decides meterte...");
                caminoa=3;
                juego=4;
            break;
            case "2":
                System.out.println("Revisas los alrededores de la casa; descubres que la casa tiene una cochera pero no hay nada fuera de lo comun");
            break;
        }
        }while (juego==3);
        }else{
            System.out.println("");
        }
                        /* escena a.3 */
        if(caminoa==3){
        System.out.println("Entras a la casa y encuentras un sillon y unas escaleras hacia lo que parece ser un sotano. Se puede observar que en el sillon hay un telefono");
        do{
            System.out.println("Se escuchan ruidos...");
            System.out.println("1.-Tomar el telefono y realizar una llamada");
            System.out.println("2.-buscar la fuente del ruido");
        String jugador=god.nextLine();
        switch (jugador){
            case "1":
                System.out.println("Tomas el telefono. Vas a llamar a un amigo pero escuchas unos pasos acercandose hacia ti");
                caminoa=4;
                juego=5;
            break;
            case "2":
                System.out.println("Escuchas un ruido extraño que sale del sotano, asi que empiezas a bajar las escaleras");
                caminoa=0;
                juego=0;
                ending=1;
            break;
        }
        }while (juego==4);
        }else{
            System.out.println("");
        }
                                /* escena a.4 */
        if(caminoa==4){
        do{
            System.out.println("Alguien se acerca");
            System.out.println("1.-Esconderte");
            System.out.println("2.-Salir corriendo de la casa");
        String jugador=god.nextLine();
        switch (jugador){
            case "1":
                System.out.println("Te diriges hacia lo que parece ser el sotano para esconderte");
                caminoa=0;
                juego=0;
                ending=1;
            break;
            case "2":
                System.out.println("No pierdes el tiempo y sales corriendo");
                caminoa=0;
                juego=0;
                ending=2;
            break;
        }
        }while (juego==5);
}else{
      System.out.println("");
}
if(ending==1){                                        /* escena a.5 */
do{
    System.out.println("Entras al sotano y encuentras varias personas atadas");
    System.out.println("Los pasos se detienen. Volteas a las escaleras y ves una sombra humana bastante desproporcionada que te observa");
    System.out.println("La noche persiste,tu podrias ser el siguiente...");
    ending=0;
 }while (ending==1);
 }else{
    System.out.println("");
}
if(ending==2){
do{
    System.out.println("Corres hacia el bosque ");
    System.out.println("Por mas que corres, no dejas de oir pasos acercandose a ti. Despues de un rato, te detienes por agotamiento.");
    System.out.println("Empiezas a notar que cosas parecidas a ojos te observan desde las sombras, ya no tienes escapatoria");
    System.out.println("La noche es aterradora si encuentras lo desconocido...");
    ending=0;
 }while (ending==2);
 }else{
    System.out.println("");
}
        /* escena b.1 */
        if(caminob==1){
        System.out.println("Caminas por la carretera durante horas hasta que llegas a una estación de servicio.");
        do{
            System.out.println("Sientes que te observan...");
            System.out.println("1.-Entrar a la tienda");
            System.out.println("2.-Hacer una llamada en la cabina telefonica");
        String jugador=god.nextLine();
        switch (jugador){
            case "1":
                System.out.println("Entras a la tienda y ves al cajero, por lo que te dirijes hacia el.");
                caminob=2;
                juego=3;
            break;
            case "2":
                System.out.println("Ves una cabina telefonica, asi que te decides a llamar a un amigo para que te lleve a tu casa");
                ending=3;
                caminob=0;
                juego=0;
            break;
        }
        }while (juego==2);
        }else{
            System.out.println("");
        }
        /* escena b.2 */
        if(caminob==2){
        System.out.println("Saludas al cajero y le preguntas:");
        do{
            System.out.println("1.-¿Me permite hacer una llamada con su telefono?");
            System.out.println("2.-¿Sabe si pasa algún camion a estas horas?");
        String jugador=god.nextLine();
        switch (jugador){
            case "1":
                System.out.println("El cajero se limita a señalarte la cabina telefonica, por lo que te dirijes ahí");
                caminob=0;
                juego=0;
                ending=3;
            break;
            case "2":
                System.out.println("El cajero responde:");
                System.out.println("Señor, ya es bastante tarde para que pase algún camión, deberia de llamar a un familiar si se quedo varado");
                System.out.println("Sin otra opción, decides ir a la cabina telefonica");
                ending=3;
                caminob=0;
                juego=0;
            break;
        }
        }while (juego==3);
        }else{
            System.out.println("");
        }
        
if(ending==3){            
do{
    System.out.println("Al acercarte el telefono al oido escuchas una risa, volteas pero ya es demaciado tarde, un sujeto enmascarado te golpea con un martillo en la cabeza.");
    System.out.println("Lo unico que se encontro de ti, fue tu coche abandonado en la carretera...");
    ending=0;
 }while (ending==3);
}else{
    System.out.println("");
}
}
}