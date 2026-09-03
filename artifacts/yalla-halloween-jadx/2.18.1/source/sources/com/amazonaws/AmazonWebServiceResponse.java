package com.amazonaws;

/* JADX INFO: loaded from: classes.dex */
public class AmazonWebServiceResponse<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public T f10275OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public ResponseMetadata f10276OooO0O0;

    public final String OooO00o() {
        ResponseMetadata responseMetadata = this.f10276OooO0O0;
        if (responseMetadata == null) {
            return null;
        }
        return responseMetadata.f10298OooO00o.get("AWS_REQUEST_ID");
    }
}
