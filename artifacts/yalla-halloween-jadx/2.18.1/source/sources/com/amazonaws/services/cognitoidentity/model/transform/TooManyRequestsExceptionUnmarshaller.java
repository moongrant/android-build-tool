package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.cognitoidentity.model.TooManyRequestsException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* JADX INFO: loaded from: classes.dex */
public class TooManyRequestsExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public TooManyRequestsExceptionUnmarshaller() {
        super(TooManyRequestsException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public final boolean OooO0O0(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.f10407OooO0O0.equals("TooManyRequestsException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    /* JADX INFO: renamed from: OooO0OO */
    public final AmazonServiceException OooO00o(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        TooManyRequestsException tooManyRequestsException = (TooManyRequestsException) super.OooO00o(jsonErrorResponse);
        tooManyRequestsException.f10269Oooo0oO = "TooManyRequestsException";
        return tooManyRequestsException;
    }
}
