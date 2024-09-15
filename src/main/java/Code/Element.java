/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

/**
 *
 * @author Saleem Malik
 */
public class Element {
    private String acronym;
    private String meaning;

    public Element(String acronym, String meaning) {
        this.acronym = acronym;
        this.meaning = meaning;
    }

    public String getAcronym() {
        return acronym;
    }

    public String getMeaning() {
        return meaning;
    }
    
    
}
