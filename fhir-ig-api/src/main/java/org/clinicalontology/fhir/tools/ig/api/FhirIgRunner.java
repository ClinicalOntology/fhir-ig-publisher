package org.clinicalontology.fhir.tools.ig.api;

public interface FhirIgRunner {

	public void runJob();

	public boolean interruptOnError();

	public void setInterruptOnErrorFlag(boolean interruptOnError);

	public void processCommandArgs(String[] args);

}
