/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author javierOporto
 */
public class testQueryItem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try 
        {
           dao.SexoDAO sdao = new dao.SexoDAO();
           
            for (edm.Sexo arg : sdao.getList()) {
                
                System.out.println(arg.getSexoDs());
            }
           
         
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
        
    }
    
}
