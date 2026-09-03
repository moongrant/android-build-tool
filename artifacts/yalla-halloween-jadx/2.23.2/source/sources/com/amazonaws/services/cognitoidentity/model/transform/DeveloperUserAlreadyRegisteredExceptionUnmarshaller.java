package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.cognitoidentity.model.DeveloperUserAlreadyRegisteredException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* JADX INFO: loaded from: classes2.dex */
public class DeveloperUserAlreadyRegisteredExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public DeveloperUserAlreadyRegisteredExceptionUnmarshaller() {
        super(DeveloperUserAlreadyRegisteredException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public final boolean OooO0O0(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.f12191OooO0O0.equals("DeveloperUserAlreadyRegisteredException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    /* JADX INFO: renamed from: OooO0OO */
    public final AmazonServiceException OooO00o(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        DeveloperUserAlreadyRegisteredException developerUserAlreadyRegisteredException = (DeveloperUserAlreadyRegisteredException) super.OooO00o(jsonErrorResponse);
        developerUserAlreadyRegisteredException.f12040OooO0o0 = "DeveloperUserAlreadyRegisteredException";
        return developerUserAlreadyRegisteredException;
    }
}
