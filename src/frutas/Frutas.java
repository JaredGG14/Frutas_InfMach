package frutas;

import java.util.Scanner;

public class Frutas {
    public static void main(String[] args) {
        boolean r=false;
        String res = null;
        
        Scanner rd = new Scanner(System.in);
        //Descarte por sabores:
        System.out.println("¿Su fruta es de sabor neutro?");
        res=rd.nextLine().toLowerCase();
        if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
            System.out.println("Su fruta es un aguacate");
        }else{
            res = null;
            System.out.println("¿Su fruta es de sabor dulce?");
            res=rd.nextLine().toLowerCase();
            if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
            //Descarte por tonalidades:
                System.out.println("¿Su fruta tiene tonalidad exterior de color Naranja/Amarillo?");
                res=rd.nextLine().toLowerCase();
                if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                    System.out.println("Su fruta es el mango.");
                }else{
                    System.out.println("¿Su fruta tiene tonalidad exterior de color Verde?");
                    res=rd.nextLine().toLowerCase();
                    if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                        System.out.println("¿Su fruta tiene tonalidad interior de color Rojo?");
                        res=rd.nextLine().toLowerCase();
                        if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                            System.out.println("Su fruta es la sandía.");
                        } else {
                            System.out.println("Su fruta es la pera.");
                        }
                    }else{
                        System.out.println("¿Su fruta tiene tonalidad exterior de color Rojo?");
                        res=rd.nextLine().toLowerCase();
                        if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                            System.out.println("Su fruta es la cereza.");
                        } else {
                            System.out.println("¿Su fruta tiene tonalidad exterior de color Morado/Azul Oscuro?");
                            res=rd.nextLine().toLowerCase();
                            if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                                System.out.println("Su fruta es el higo.");
                            } else {
                                System.out.println("¿Su fruta tiene tonalidad exterior de color café?");
                                res=rd.nextLine().toLowerCase();
                                if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                                    System.out.println("Su fruta es el mamey");
                                } else {
                                    System.out.println("¿Su fruta tiene tonalidad exterior de color Corteza gris con verde?");
                                    res=rd.nextLine().toLowerCase();
                                    if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                                        System.out.println("Su fruta es el Melón");
                                    }
                                }
                            }
                        }
                    }
                }
            }else{
                System.out.println("¿Su fruta es de sabor semiácido?");
                res=rd.nextLine().toLowerCase();
                if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                    System.out.println("¿Su fruta tiene tonalidad exterior de color Amarillo?");
                    res=rd.nextLine().toLowerCase();
                    if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                        System.out.println("¿Su fruta tiene semillas de color Negro?");
                        res=rd.nextLine().toLowerCase();
                        if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                            System.out.println("Su fruta es la maracuyá.");
                        } else {
                            System.out.println("Su fruta es la piña.");
                        }
                    } else {
                        System.out.println("¿Su fruta tiene tonalidad exterior de color Rosado/Rojo?");
                        res=rd.nextLine().toLowerCase();
                        if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                            System.out.println("¿Su fruta tiene tonalidad interior de color Naranja?");
                            res=rd.nextLine().toLowerCase();
                            if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                                System.out.println("Su fruta es el melocotón");
                            } else {
                                System.out.println("¿Su fruta tiene tonalidad interior de color Rojo?");
                                res=rd.nextLine().toLowerCase();
                                if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                                    System.out.println("Su fruta es la frambuesa");
                                }else{
                                    System.out.println("¿Su fruta tiene tonalidad interior de color Naranja?");
                                    res=rd.nextLine().toLowerCase();
                                    if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                                        System.out.println("Su fruta es el melocotón");
                                    }else{
                                        System.out.println("¿Su fruta tiene tonalidad interior de color blanco?");
                                        res=rd.nextLine().toLowerCase();
                                        if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                                            System.out.println("¿Su fruta tiene semillas de color negro?");
                                            res=rd.nextLine().toLowerCase();
                                            if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                                                System.out.println("Su fruta es la pitahaya (Fruta del Dragon)");
                                            }else{
                                                System.out.println("Su fruta es el Lichi");
                                            }
                                        }
                                    }
                                }
                            }
                        }else{
                            System.out.println("¿Su fruta tiene tonalidad exterior de color Verde?");
                            res=rd.nextLine().toLowerCase();
                            if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                                System.out.println("Su fruta es la guanábana");
                            } else {
                                System.out.println("¿Su fruta tiene tonalidad exterior de color Morado/Azul?");
                                res=rd.nextLine().toLowerCase();
                                if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                                    System.out.println("¿Su fruta tiene tonalidad interior de color Morado?");
                                    res=rd.nextLine().toLowerCase();
                                    if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                                        System.out.println("Su fruta es Mora Azul");
                                    } else {
                                        System.out.println("Su fruta es la Uva");
                                    }
                                }
                            }
                        }
                    }
                }else{
                    System.out.println("¿Su fruta es de sabor ácido?");
                    res=rd.nextLine().toLowerCase();
                    if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                        System.out.println("¿Su fruta tiene tonalidad exterior de color Rojo?");
                        res=rd.nextLine().toLowerCase();
                        if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                            System.out.println("¿Su fruta tiene tonalidad interior de color rojo?");
                            res=rd.nextLine().toLowerCase();
                            if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                                System.out.println("Su fruta es la fresa");
                            }else{
                                System.out.println("Su fruta es la manzana");
                            }
                        }else{
                            System.out.println("¿Su fruta tiene tonalidad exterior de color Naranja?");
                            res=rd.nextLine().toLowerCase();
                            if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                                System.out.println("Tu fruta es el persimo");
                            }else{
                                System.out.println("¿Su fruta tiene tonalidad exterior de color Verde?");
                                res=rd.nextLine().toLowerCase();
                                if (res.equals("si") || res.equals("s") || res.equals("y") || res.equals("yes")){
                                    System.out.println("Tu fruta es el limón.");
                                }else{
                                    System.out.println("Tu fruta es el Kiwi");
                                }
                            }
                        }
                    }else{
                        System.out.println("No podemos saber qué fruta es si no sabes su sabor.");
                    }
                }
            }
        }
        
    }
    
}
