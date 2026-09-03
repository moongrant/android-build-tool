package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.cognitoidentity.model.LimitExceededException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* JADX INFO: loaded from: classes2.dex */
public class LimitExceededExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public LimitExceededExceptionUnmarshaller() {
        super(LimitExceededException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public final boolean OooO0O0(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.f9101OooO0O0.equals("LimitExceededException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    /* JADX INFO: renamed from: OooO0OO */
    public final AmazonServiceException OooO00o(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        LimitExceededException limitExceededException = (LimitExceededException) super.OooO00o(jsonErrorResponse);
        limitExceededException.f8950OooO0o0 = "LimitExceededException";
        return limitExceededException;
    }
}
