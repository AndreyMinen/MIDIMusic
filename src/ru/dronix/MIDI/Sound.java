/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.dronix.MIDI;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Sound {
    
    private Player music;
    
    private int cel=1900;
    
    private int[][] notes2={
        {470, 81}, {230, 80}, {470, 81}, {250, -1},
        {230, 80}, {470, 81}, {230, 69}, {230, 76},
        {470, 81}, {230, 69}, {470, 74}, {470, 73},
        {470, 74}, {470, 76}, {470, 73}, {470, 71},
        {970, -1}, {230, 69}, {230, 68}, {470, 69},
        {730, -1}, {230, 64}, {230, 69}, {230, 71},
        {470, 73}, {970, -1}, {230, 73}, {230, 74},
        {470, 76}, {730, -1}, {230, 69}, {230, 74},
        {230, 73}, {470, 71}, {1450, -1},{470, 81},
        {230, 80}, {470, 81}, {250, -1}, {230, 80},
        {470, 81}, {230, 69}, {230, 76}, {470, 81},
        {230, 69}, {470, 74}, {470, 73}, {470, 74},
        {470, 76}, {470, 73}, {470, 71}, {970, -1},
        {230, 69}, {230, 68}, {470, 69}, {730, -1},
        {230, 64}, {230, 69}, {230, 71}, {470, 73},
        {970, -1}, {230, 73}, {230, 74}, {470, 76},
        {730, -1}, {230, 69}, {230, 74}, {230, 73},
        {470, 71}, {250, -1}
    };
    
    private int[][] notes={
        {cel/16,57},{cel/16,57},{cel/16,57},{cel/16,57},
        {cel/16,55},{cel/16,57},{cel/8,59},{cel/8,59},
        {cel/8,-1},{cel/16,57},{cel/16,59},
        
        {cel/8,60},{cel/8,60},{cel/8,-1},
        {cel/16,60},{cel/16,60},{cel/8,59},
        {cel/8,55},{cel/8,-1},{cel/4,57},
        
        {cel/16,57},{cel/16,57},{cel/16,57},{cel/16,57},
        {cel/16,55},{cel/16,57},{cel/8,59},{cel/8,59},
        {cel/8,-1},{cel/16,57},{cel/16,59},
        
        {cel/8,60},{cel/8,60},{cel/8,-1},
        {cel/16,60},{cel/16,60},{cel/8,59},
        {cel/8,55},{cel/8,-1},{cel/4,57},
        
        {cel/16,57},{cel/16,57},{cel/16,57},{cel/16,57},
        {cel/16,55},{cel/16,57},{cel/8,59},{cel/8,59},
        {cel/8,-1},{cel/16,57},{cel/16,59},
        
        {cel/8,60},{cel/8,60},{cel/8,-1},
        {cel/16,60},{cel/16,60},{cel/8,59},
        {cel/8,55},{cel/8,-1},{cel/2,53},
        
        
        {cel/8,53},{cel/8,53},{cel/16,52},{cel/16,52},{cel/8,53},{cel/8,65},{cel/8,-1},{cel/16,52},{cel/16,52},
        {cel/8,53},{cel/8,65},{cel/8,-1},{cel/8,52},{cel/8,55},{cel/8,67},{cel/8,-1},{cel/8,53},
        {cel/8,53},{cel/8,53},{cel/16,52},{cel/16,52},{cel/8,53},{cel/8,65},{cel/8,-1},{cel/8,53},
        {cel/8,52},{cel,52},{cel/8,55},{cel/8,52},{cel/8,55},{cel/4,57},
        
        {cel/8,-1},{cel/16,57},{cel/16,57},{cel/16,57},{cel/16,57},{cel/16,57},{cel/16,57},{cel/8,55},{cel/8,55},
        {cel/8,-1},{cel/16,55},{cel/16,55},
        
        {cel/8,53},{cel/8,53},{cel/8,-1},{cel/16,53},{cel/16,53},{cel/8,55},{cel/8,52},{cel/8,55},{cel/8,57},
        {cel/8,-1},{cel/16,57},{cel/16,57},{cel/16,57},{cel/16,57},{cel/16,57},{cel/16,57},{cel/8,55},{cel/8,55},
        {cel/8,-1},{cel/16,55},{cel/16,55},
        
        {cel/8,53},{cel/8,53},{cel/8,-1},{cel/16,53},{cel/16,53},{cel/8,52},{cel/8,52},{cel/8,55},{cel/8,57},
        
        {cel/8,-1},{cel/16,57},{cel/16,57},{cel/16,57},{cel/16,57},{cel/16,57},{cel/16,57},{cel/8,55},{cel/8,55},
        {cel/8,-1},{cel/16,55},{cel/16,55},
        
        {cel/8,53},{cel/8,53},{cel/8,-1},{cel/16,53},{cel/16,53},{cel/8,52},{cel/8,52},{cel/8,55},{cel/8,57},
        {cel/8,-1},{cel/16,57},{cel/16,57},{cel/16,57},{cel/16,57},{cel/16,57},{cel/16,57},{cel/8,55},{cel/8,55},
        {cel/8,-1},{cel/16,55},{cel/16,55},
        
        {cel/8,53},{cel/8,53},{cel/8,-1},{cel/16,53},{cel/16,53},{cel/8,52},{cel/8,52},{cel/8,55},{cel/4,53},
        
        {cel/8,53},{cel/8,53},{cel/16,52},{cel/16,52},{cel/8,53},{cel/8,65},{cel/8,-1},{cel/16,52},{cel/16,52},
        
        {cel/8,53},{cel/8,65},{cel/8,-1},{cel/8,52},{cel/8,55},{cel/8,67},{cel/8,-1},{cel/8,53},
        
        {cel/8,53},{cel/8,53},{cel/16,52},{cel/16,52},{cel/8,53},{cel/8,65},{cel/8,-1},{cel/16,52},{cel/16,52},
        
        {cel/8,53},{cel/8,65},{cel/8,-1},{cel/8,52},{cel/8,55},{cel/8,67},{cel/8,-1},{cel/8,53},
        
        {cel/4,52},{cel/4,-1},{cel/8,52},{cel/8,52},{cel/4,-1}, {cel/4,-1},{cel/4,52},{cel/4,-1},{cel/8,-1},{cel/8,57},
        
        {cel/16,57},{cel/16,57},{cel/16,57},{cel/16,57},
        {cel/16,55},{cel/16,57},{cel/8,59},{cel/8,59},
        {cel/8,-1},{cel/16,57},{cel/16,59},
        
        {cel/8,60},{cel/8,60},{cel/8,-1},
        {cel/16,60},{cel/16,60},{cel/8,59},
        {cel/8,55},{cel/8,-1},{cel/4,57},
    };
    
    public Sound(){
        music=new Player();
        play();
    }
    
    public static void main(String[] args){
        new Sound();
    }
    
    private void play(){
        for(int[] note:notes){
            if(note[1]!=-1){
                music.playSound(0, note[0], 80, note[1]);
            }else{
                try {
                    Thread.sleep(note[0]);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Sound.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        music.close();
    }
    
}
