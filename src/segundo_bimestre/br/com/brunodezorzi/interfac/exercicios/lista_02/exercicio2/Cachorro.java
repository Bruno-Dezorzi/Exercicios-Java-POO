/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package segundo_bimestre.br.com.brunodezorzi.interfac.exercicios.lista_02.exercicio2;

/**
 *
 * @author HP Victus
 */
public class Cachorro implements Animal{
    
    private String nome;

    @Override
    public void emitirSom() {
        System.out.println("AUAUAUAAUUAUAUAUAUAAUUAAUUAUAUAUAUAUAU");
    }

    @Override
    public void mover() {
        System.out.println("CORRENDO DESAJEITADO");
    }
    
    
}