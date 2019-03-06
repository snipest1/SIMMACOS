/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SIMMACOS;

// Definition of a process control block

public class ProcessControl {

public int procid;

public int ACC;

public int PSIAR;

public int memoryBase;

public int memoryLimit;

public ProcessControl(int address,int size,int procid) {

this.procid=procid;

ACC = 0;

PSIAR = 0;

memoryBase = address;

memoryLimit=address+size;

}

} 
