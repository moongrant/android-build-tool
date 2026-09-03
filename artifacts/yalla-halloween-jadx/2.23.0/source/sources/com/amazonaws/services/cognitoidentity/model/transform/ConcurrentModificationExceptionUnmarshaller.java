package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;
import com.amazonaws.services.cognitoidentity.model.ConcurrentModificationException;
import com.amazonaws.transform.JsonErrorUnmarshaller;

/* JADX INFO: loaded from: classes2.dex */
public class ConcurrentModificationExceptionUnmarshaller extends JsonErrorUnmarshaller {
    public ConcurrentModificationExceptionUnmarshaller() {
        super(ConcurrentModificationException.class);
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller
    public final boolean OooO0O0(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return jsonErrorResponse.f9101OooO0O0.equals("ConcurrentModificationException");
    }

    @Override // com.amazonaws.transform.JsonErrorUnmarshaller, com.amazonaws.transform.Unmarshaller
    /* JADX INFO: renamed from: OooO0OO */
    public final AmazonServiceException OooO00o(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        ConcurrentModificationException concurrentModificationException = (ConcurrentModificationException) super.OooO00o(jsonErrorResponse);
        concurrentModificationException.f8950OooO0o0 = "ConcurrentModificationException";
        return concurrentModificationException;
    }
}
