package com.amazonaws.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.http.JsonErrorResponseHandler;

/* JADX INFO: loaded from: classes.dex */
public class JsonErrorUnmarshaller extends AbstractErrorUnmarshaller<JsonErrorResponseHandler.JsonErrorResponse> {
    public JsonErrorUnmarshaller() {
    }

    public boolean OooO0O0(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        return true;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    /* JADX INFO: renamed from: OooO0OO, reason: merged with bridge method [inline-methods] */
    public AmazonServiceException OooO00o(JsonErrorResponseHandler.JsonErrorResponse jsonErrorResponse) throws Exception {
        String str = jsonErrorResponse.f10406OooO00o;
        String str2 = jsonErrorResponse.f10407OooO0O0;
        if ((str == null || str.isEmpty()) && (str2 == null || str2.isEmpty())) {
            throw new AmazonClientException("Neither error message nor error code is found in the error response payload.");
        }
        AmazonServiceException amazonServiceExceptionNewInstance = this.f11151OooO00o.getConstructor(String.class).newInstance(str);
        amazonServiceExceptionNewInstance.f10269Oooo0oO = str2;
        return amazonServiceExceptionNewInstance;
    }

    public JsonErrorUnmarshaller(Class<? extends AmazonServiceException> cls) {
        super(cls);
    }
}
