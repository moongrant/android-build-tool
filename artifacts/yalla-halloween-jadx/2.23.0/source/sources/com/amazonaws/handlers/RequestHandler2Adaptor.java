package com.amazonaws.handlers;

import com.amazonaws.AmazonClientException;
import com.amazonaws.DefaultRequest;
import com.amazonaws.Response;

/* JADX INFO: loaded from: classes2.dex */
final class RequestHandler2Adaptor extends RequestHandler2 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RequestHandler f9075OooO00o;

    public RequestHandler2Adaptor(RequestHandler requestHandler) {
        if (requestHandler == null) {
            throw new IllegalArgumentException();
        }
        this.f9075OooO00o = requestHandler;
    }

    @Override // com.amazonaws.handlers.RequestHandler2
    public final void OooO00o(DefaultRequest defaultRequest, AmazonClientException amazonClientException) {
        this.f9075OooO00o.OooO0OO();
    }

    @Override // com.amazonaws.handlers.RequestHandler2
    public final void OooO0O0(DefaultRequest defaultRequest, Response response) {
        this.f9075OooO00o.OooO0O0();
    }

    @Override // com.amazonaws.handlers.RequestHandler2
    public final void OooO0OO(DefaultRequest defaultRequest) {
        this.f9075OooO00o.OooO00o();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RequestHandler2Adaptor) {
            return this.f9075OooO00o.equals(((RequestHandler2Adaptor) obj).f9075OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9075OooO00o.hashCode();
    }
}
