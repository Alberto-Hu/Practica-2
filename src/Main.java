//Hu Alberto - 1279840
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salida = false;
        int opcion;

        while (!salida) {

            System.out.println("\n1. Clase Computadora");
            System.out.println("2. Clase Radio");
            System.out.println("3. Clase Barco");
            System.out.println("4. Clase Celular");
            System.out.println("5. Clase Lampara");
            System.out.println("6. Salir\n");

            try {

                System.out.println("** Elige una clase del 1 al 5 ** Ingresar 6 para salir ** ");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la Clase 1, Computadora: ");

                        Computadora comp1 = new Computadora();
                        Computadora comp2 = new Computadora();
                        Computadora comp3 = new Computadora();

                        System.out.println("Ingresa la marca de la computadora #1 ");
                        Scanner inMarca = new Scanner(System.in);
                        comp1.setMarca(inMarca.next());

                        System.out.println("Ingresa el modelo de la computadora #1: ");
                        Scanner inModelo = new Scanner(System.in);
                        comp1.setModelo(inModelo.next());

                        System.out.println("Ingresa el color de la computadora #1: ");
                        Scanner inColor = new Scanner(System.in);
                        comp1.setColor(inColor.next());

                        System.out.println("Ingresa la ram de la computadora #1: ");
                        Scanner inRam = new Scanner(System.in);
                        comp1.setRam(inRam.nextInt());

                        System.out.println("Ingresa el almacenamiento de la computadora #1: ");
                        Scanner inAlmacenamiento = new Scanner(System.in);
                        comp1.setAlmacenamiento(inAlmacenamiento.nextInt());

                        System.out.println("Ingresa la marca de la computadora #2 ");
                        comp2.setMarca(inMarca.next());

                        System.out.println("Ingresa el modelo de la computadora #2: ");
                        comp2.setModelo(inModelo.next());

                        System.out.println("Ingresa el color de la computadora #2: ");
                        comp2.setColor(inColor.next());

                        System.out.println("Ingresa la ram de la computadora #2: ");
                        comp2.setRam(inRam.nextInt());

                        System.out.println("Ingresa el almacenamiento de lacomputadora #2: ");
                        comp2.setAlmacenamiento(inAlmacenamiento.nextInt());

                        System.out.println("Ingresa la marca de la computadora #3 ");
                        comp3.setMarca(inMarca.next());

                        System.out.println("Ingresa el modelo de la computadora #3: ");
                        comp3.setModelo(inModelo.next());

                        System.out.println("Ingresa el color de la computadora #3: ");
                        comp3.setColor(inColor.next());

                        System.out.println("Ingresa la ram de la computadora #3: ");
                        comp3.setRam(inRam.nextInt());

                        System.out.println("Ingresa el almacenamiento de la computadora #3: ");
                        comp3.setAlmacenamiento(inAlmacenamiento.nextInt());

                        System.out.println("Computadora #1: ");
                        System.out.println("Marca: "+comp1.getMarca()+"\nColor: "+comp1.getColor()+"\nModelo: "+comp1.getModelo()+"\nRam: "+comp1.getRam()+"gb\nAlmacenamiento: "+comp1.getAlmacenamiento()+"GB");
                        System.out.println("\nComputadora #2: ");
                        System.out.println("Marca: "+comp2.getMarca()+"\nColor: "+comp2.getColor()+"\nModelo: "+comp2.getModelo()+"\nRam: "+comp2.getRam()+"gb\nAlmacenamiento: "+comp2.getAlmacenamiento()+"GB");
                        System.out.println("\nComputadora #3: ");
                        System.out.println("Marca: "+comp3.getMarca()+"\nColor: "+comp3.getColor()+"\nModelo: "+comp3.getModelo()+"\nRam: "+comp3.getRam()+"gb\nAlmacenamiento: "+comp3.getAlmacenamiento()+"GB");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la Clase 2, Radio: ");

                        Radio radio1 = new Radio();
                        Radio radio2 = new Radio();
                        Radio radio3 = new Radio();

                        System.out.println("Ingresa el tipo de la radio #1: ");
                        Scanner inTipo = new Scanner(System.in);
                        radio1.setTipo(inTipo.next());

                        System.out.println("Ingresa el tamaño de la radio #1: ");
                        Scanner inTamanio = new Scanner(System.in);
                        radio1.setTamanio(inTamanio.next());

                        System.out.println("Ingrese el tipo de batería de la radio #1: ");
                        Scanner inTipoBateria = new Scanner(System.in);
                        radio1.setTipoBateria(inTipoBateria.next());

                        System.out.println("Ingrese el tipo de conectividad de la radio #1: ");
                        Scanner inConectividad = new Scanner(System.in);
                        radio1.setConectividad(inConectividad.next());

                        System.out.println("Ingresa el tipo de diseño de la radio #1: ");
                        Scanner inDisenio = new Scanner(System.in);
                        radio1.setDisenio(inDisenio.next());

                        System.out.println("Ingresa el tipo de la radio #2 ");
                        radio2.setTipo(inTipo.next());

                        System.out.println("Ingresa el tamaño de la radio #2");
                        radio2.setTamanio(inTamanio.next());

                        System.out.println("Ingrese el tipo de batería de la radio #2: ");
                        radio2.setTipoBateria(inTipoBateria.next());

                        System.out.println("Ingrese el tipo de conectividad de la radio #2: ");
                        radio2.setConectividad(inConectividad.next());

                        System.out.println("Ingresa el tipo de diseño de la radio #2: ");
                        radio2.setDisenio(inDisenio.next());

                        System.out.println("Ingresa el tipo de la radio #3 ");
                        radio3.setTipo(inTipo.next());

                        System.out.println("Ingresa el tamaño de la radio #3: ");
                        radio3.setTamanio(inTamanio.next());

                        System.out.println("Ingrese el tipo de batería de la radio #3: ");
                        radio3.setTipoBateria(inTipoBateria.next());

                        System.out.println("Ingrese el tipo de conectividad de la radio #3: ");
                        radio3.setConectividad(inConectividad.next());

                        System.out.println("Ingresa el tipo de diseño de la radio #3: ");
                        radio3.setDisenio(inDisenio.next());

                        System.out.println("Radio #1: ");
                        System.out.println("Tipo de Radio: "+radio1.getTipo()+"\nTamaño: "+radio1.getTamanio()+"\nTipo de Batería: "+radio1.getTipoBateria()+"\nConectividad: "+radio1.getConectividad()+"\nDiseño: "+radio1.getDisenio());
                        System.out.println("\nRadio #2: ");
                        System.out.println("Tipo de Radio: "+radio2.getTipo()+"\nTamaño: "+radio2.getTamanio()+"\nTipo de Batería: "+radio2.getTipoBateria()+"\nConectividad: "+radio2.getConectividad()+"\nDiseño: "+radio2.getDisenio());
                        System.out.println("\nRadio #3: ");
                        System.out.println("Tipo de Radio: "+radio3.getTipo()+"\nTamaño: "+radio3.getTamanio()+"\nTipo de Batería: "+radio3.getTipoBateria()+"\nConectividad: "+radio3.getConectividad()+"\nDiseño: "+radio3.getDisenio());

                        break;
                    case 3:
                        System.out.println("Has seleccionado la Clase 3, Barco: ");

                        Barco barco1 = new Barco();
                        Barco barco2 = new Barco();
                        Barco barco3 = new Barco();

                        System.out.println("Ingrese el tipo de barco #1 ");
                        Scanner inTipob = new Scanner(System.in);
                        barco1.setTipob(inTipob.next());

                        System.out.println("Ingrese el tipo de conduccion del barco #1: ");
                        Scanner inConduccion = new Scanner(System.in);
                        barco1.setConduccion(inConduccion.next());

                        System.out.println("Ingresa el tamanio del barco #1: ");
                        Scanner inTamano = new Scanner(System.in);
                        barco1.setTamano(inTamano.next());

                        System.out.println("Ingresa la velocidad del barco #1: ");
                        Scanner inVelocidad = new Scanner(System.in);
                        barco1.setVelocidad(inVelocidad.nextInt());

                        System.out.println("Ingresa la capacidad del barco #1: ");
                        Scanner inCapacidad = new Scanner(System.in);
                        barco1.setCapacidad(inCapacidad.nextInt());

                        System.out.println("Ingrese el tipo de barco #2 ");
                        barco2.setTipob(inTipob.next());

                        System.out.println("Ingrese el tipo de conduccion del barco #2: ");
                        barco2.setConduccion(inConduccion.next());

                        System.out.println("Ingresa el tamanio del barco #2: ");
                        barco2.setTamano(inTamano.next());

                        System.out.println("Ingresa la velocidad del barco #2: ");
                        barco2.setVelocidad(inVelocidad.nextInt());

                        System.out.println("Ingresa la capacidad del barco #2: ");
                        barco2.setCapacidad(inCapacidad.nextInt());

                        System.out.println("Ingrese el tipo de barco #3 ");
                        barco3.setTipob(inTipob.next());

                        System.out.println("Ingrese el tipo de conduccion del barco #3: ");
                        barco3.setConduccion(inConduccion.next());

                        System.out.println("Ingresa el tamanio del barco #3: ");
                        barco3.setTamano(inTamano.next());

                        System.out.println("Ingresa la velocidad del barco #3: ");
                        barco3.setVelocidad(inVelocidad.nextInt());

                        System.out.println("Ingresa la capacidad del barco #3: ");
                        barco3.setCapacidad(inCapacidad.nextInt());

                        System.out.println("Barco #1: ");
                        System.out.println("Tipo de barco: "+barco1.getTipob()+"\nConduccion: "+barco1.getConduccion()+"\n:Tamanio "+barco1.getTamano()+"\nVelocidad: "+barco1.getVelocidad()+"nudos\nCapacidad: "+barco1.getCapacidad()+"personas");
                        System.out.println("\nBarco #2: ");
                        System.out.println("Tipo de barco: "+barco2.getTipob()+"\nConduccion: "+barco2.getConduccion()+"\nTamanio: "+barco2.getTamano()+"\nVelocidad: "+barco2.getVelocidad()+"nudos\nCapacidad: "+barco2.getCapacidad()+"personas");
                        System.out.println("\nBarco #3: ");
                        System.out.println("Tipo de barco: "+barco3.getTipob()+"\nConduccion: "+barco3.getConduccion()+"\nTamanio: "+barco3.getTamano()+"\nVelocidad: "+barco3.getVelocidad()+"nudos\nCapacidad: "+barco3.getCapacidad()+"personas");

                        break;
                    case 4:
                        System.out.println("Has seleccionado la Clase 4, Celular: ");

                        Celular celular1 = new Celular();
                        Celular celular2 = new Celular();
                        Celular celular3 = new Celular();

                        System.out.println("Bateria del celular #1 ");
                        Scanner inBateria = new Scanner(System.in);
                        celular1.setBateria(inBateria.next());

                        System.out.println("Ingrese el tipo de camara del celular #1: ");
                        Scanner inCamara = new Scanner(System.in);
                        celular1.setCamara(inCamara.next());

                        System.out.println("Ingresa el color del celular #1: ");
                        Scanner inColorr = new Scanner(System.in);
                        celular1.setColorr(inColorr.next());

                        System.out.println("Ingresa el tamanio del celular #1: ");
                        Scanner inCelTamano = new Scanner(System.in);
                        celular1.setCelTamano(inCelTamano.next());

                        System.out.println("Ingresa la capacidad de almacenamiento del celular #1: ");
                        Scanner inAlmacen = new Scanner(System.in);
                        celular1.setAlmacen(inAlmacen.nextInt());

                        System.out.println("Bateria del celular #2 ");
                        celular2.setBateria(inBateria.next());

                        System.out.println("Ingrese el tipo de camara del celular #2: ");
                        celular2.setCamara(inCamara.next());

                        System.out.println("Ingresa el color del celular #2: ");
                        celular2.setColorr(inColorr.next());

                        System.out.println("Ingresa el tamanio del celular #2: ");
                        celular2.setCelTamano(inCelTamano.next());

                        System.out.println("Ingresa la capacidad de almacenamiento del celular #2: ");
                        celular2.setAlmacen(inAlmacen.nextInt());

                        System.out.println("Bateria del celular #3 ");
                        celular3.setBateria(inBateria.next());

                        System.out.println("Ingrese el tipo de camara del celular #3: ");
                        celular3.setCamara(inCamara.next());

                        System.out.println("Ingresa el color del celular #3: ");
                        celular3.setColorr(inColorr.next());

                        System.out.println("Ingresa el tamanio del celular #3: ");
                        celular3.setCelTamano(inCelTamano.next());

                        System.out.println("Ingresa la capacidad de almacenamiento del celular #3: ");
                        celular3.setAlmacen(inAlmacen.nextInt());

                        System.out.println("Celular #1: ");
                        System.out.println("Bateria: "+celular1.getBateria()+"\nCamara: "+celular1.getCamara()+"\n:Color "+celular1.getColorr()+"\nTamaño: "+celular1.getCelTamano()+"\nAlmacenamiento: "+celular1.getAlmacen()+"GB");
                        System.out.println("\nCelular #2: ");
                        System.out.println("Bateria: "+celular2.getBateria()+"\nCamara: "+celular2.getCamara()+"\nColor: "+celular2.getColorr()+"\nTamaño: "+celular2.getCelTamano()+"\nAlmacenamiento: "+celular2.getAlmacen()+"GB");
                        System.out.println("\nCelular #3: ");
                        System.out.println("Bateria: "+celular3.getBateria()+"\nCamara: "+celular3.getCamara()+"\nColor: "+celular3.getColorr()+"\nTamaño "+celular3.getCelTamano()+"\nAlmacenamiento: "+celular3.getAlmacen()+"GB");

                        break;
                    case 5:
                        System.out.println("Has seleccionado la Clase 5, Lampara: ");

                        Lampara lampara1 = new Lampara();
                        Lampara lampara2 = new Lampara();
                        Lampara lampara3 = new Lampara();

                        System.out.println("Ingresa el estado de la lampara #1: ");
                        Scanner inEstado = new Scanner(System.in);
                        lampara1.setEstado(inEstado.next());

                        System.out.println("Ingresa la intensidad de la lampara #1: ");
                        Scanner inIntensidad = new Scanner(System.in);
                        lampara1.setIntensidad(inIntensidad.next());

                        System.out.println("Ingrese el color de la lampara #1: ");
                        Scanner inLampcolor = new Scanner(System.in);
                        lampara1.setLampcolor(inLampcolor.next());

                        System.out.println("Ingrese la forma de la lampara #1: ");
                        Scanner inForma = new Scanner(System.in);
                        lampara1.setForma(inForma.next());

                        System.out.println("Ingresa el tamanio de la lampara #1: ");
                        Scanner inLamTamano = new Scanner(System.in);
                        lampara1.setLamTamano(inLamTamano.next());

                        System.out.println("Ingresa el estado de la lampara #2 ");
                        lampara2.setEstado(inEstado.next());

                        System.out.println("Ingresa la intensidad de la lampara #2");
                        lampara2.setIntensidad(inIntensidad.next());

                        System.out.println("Ingrese el color de la lampara #2: ");
                        lampara2.setLampcolor(inLampcolor.next());

                        System.out.println("Ingrese la forma de la lampara #2: ");
                        lampara2.setForma(inForma.next());

                        System.out.println("Ingresa el tamanio de la lampara #2: ");
                        lampara2.setLamTamano(inLamTamano.next());

                        System.out.println("Ingresa el estado de la lampara #3 ");
                        lampara3.setEstado(inEstado.next());

                        System.out.println("Ingresa la intensidad de la lampara #3: ");
                        lampara3.setIntensidad(inIntensidad.next());

                        System.out.println("Ingrese el color de la lampara #3: ");
                        lampara3.setLampcolor(inLampcolor.next());

                        System.out.println("Ingrese la forma de la lampara #3: ");
                        lampara3.setForma(inForma.next());

                        System.out.println("Ingresa el tamanio de la lampara #3: ");
                        lampara3.setLamTamano(inLamTamano.next());

                        System.out.println("Lampara #1: ");
                        System.out.println("Estado: "+lampara1.getEstado()+"\nIntensidad: "+lampara1.getIntensidad()+"\nColor lampara: "+lampara1.getLampcolor()+"\nForma lampara: "+lampara1.getForma()+"\nTamanio: "+lampara1.getLamTamano());
                        System.out.println("\nLampara #2: ");
                        System.out.println("Estado: "+lampara2.getEstado()+"\nIntensidad: "+lampara2.getIntensidad()+"\nColor lampara: "+lampara2.getLampcolor()+"\nForma lampara: "+lampara2.getForma()+"\nTamanio: "+lampara2.getLamTamano());
                        System.out.println("\nLampara #3: ");
                        System.out.println("Estado: "+lampara3.getEstado()+"\nIntensidad: "+lampara3.getIntensidad()+"\nColor lampara: "+lampara3.getLampcolor()+"\nForma lampara: "+lampara3.getForma()+"\nTamanio: "+lampara3.getLamTamano());

                        break;
                    case 6:
                        salida = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 6");
                }
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un número valido");
                sn.next();
            }
        }

    }

}