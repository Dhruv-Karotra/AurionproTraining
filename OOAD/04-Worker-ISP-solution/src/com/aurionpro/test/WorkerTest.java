package com.aurionpro.test;

import com.aurionpro.model.IWorkable;
import com.aurionpro.model.IWorker;
import com.aurionpro.model.Robot;
import com.aurionpro.model.Worker;

public class WorkerTest {

	public static void main(String[] args) {
		IWorker worker=new Worker();
		worker.start();
		worker.stop();
		worker.eat();
		worker.rest();
		
		IWorkable robot=new Robot();
		robot.start();
		robot.start();
	}

}
