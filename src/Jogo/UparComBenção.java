/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;

/**
 *
 * @author Vinicius
 */
public class UparComBenção implements Benção{
    
    public void subirNivel()
    {
        System.out.println("Você foi abençoado por seu Deus, receba 1 poder divino.");
        new Upar().subirNivel();
    }
}
