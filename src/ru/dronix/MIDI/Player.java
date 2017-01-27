/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.dronix.MIDI;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;

/**
 *
 * @author admin
 */
public class Player {
    
    private MidiChannel[] channels;
    private Synthesizer synth;
    
    public Player(){
        try {
            synth=MidiSystem.getSynthesizer();
            synth.open();
            channels=synth.getChannels();
            channels[0].programChange(33);
        } catch (MidiUnavailableException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void close(){
        synth.close();
    }
    
    public void playSound(int channel,int diraction, int volume, int... notes){
        
        for(int note:notes){
            channels[channel].noteOn(note, volume);
        }
        try {
            Thread.sleep(diraction);
        } catch (InterruptedException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(int note:notes){
            channels[channel].noteOff(note);
        }
        
    }
    
}
