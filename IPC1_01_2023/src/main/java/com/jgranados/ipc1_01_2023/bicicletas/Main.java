package com.jgranados.ipc1_01_2023.bicicletas;

/**
 *
 * @author jose
 */
public class Main {

    public static void main(String[] args) {
        /*BicicletaVelocidades[] bicicletasV = new BicicletaVelocidades[5];
        BicicletaPista[] bicicletasP = new BicicletaPista[5];
        BicicletaMontaña[] bicicletasM = new BicicletaMontaña[5];*/
        Bicicleta[] bicicletas = new Bicicleta[10];
        
        BicicletaVelocidades bicicletaV = new BicicletaVelocidades();
        BicicletaVelocidades bicicletaV2 = new BicicletaVelocidades();
        BicicletaVelocidades bicicletaV3 = new BicicletaVelocidades();
        
        /*bicicletasV[0] = bicicletaV;
        bicicletasV[1] = bicicletaV2;
        bicicletasV[2] = bicicletaV3;
        */
        
        bicicletas[0] = bicicletaV;
        bicicletas[1] = bicicletaV2;
        bicicletas[2] = bicicletaV3;
        //bicicletaV.frenar();
        
        BicicletaPista bicicletaPista = new BicicletaPista();
        BicicletaPista bicicletaPista2 = new BicicletaPista();
        BicicletaPista bicicletaPista3 = new BicicletaPista();
        
        /*bicicletasP[0] = bicicletaPista;
        bicicletasP[1] = bicicletaPista2;
        bicicletasP[2] = bicicletaPista3;*/
        //bicicletaPista.frenar();
        
        bicicletas[3] = bicicletaPista;
        bicicletas[4] = bicicletaPista2;
        bicicletas[5] = bicicletaPista3;
        
        BicicletaMontaña montaña = new BicicletaMontaña();
        BicicletaMontaña montaña2 = new BicicletaMontaña();
        BicicletaMontaña montaña3 = new BicicletaMontaña();
        
        bicicletas[6] = montaña;
        bicicletas[7] = montaña2;
        bicicletas[8] = montaña3;
        
        for (int i = 0; i < bicicletas.length; i++) {
            Bicicleta bicicleta = bicicletas[i];
            if (bicicleta != null) {
                bicicleta.frenar();
                
                if (bicicleta instanceof BicicletaMontaña) {
                    BicicletaMontaña bicicletaMontaña = (BicicletaMontaña) bicicleta;
                    bicicletaMontaña.cambiarAmortiguador();
                }
                
            }
            
        }
        
        
        
    }
}
