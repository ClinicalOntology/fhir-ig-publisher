package org.clinicalontology.fhir.tools.ig.api;

import org.clinicalontology.fhir.tools.ig.model.ValidationMessage;

import java.util.List;

public interface FhirIgValidator {

    List<Message> validate();

    boolean success();

}
