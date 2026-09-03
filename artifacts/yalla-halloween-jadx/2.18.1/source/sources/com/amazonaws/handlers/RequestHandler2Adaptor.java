package com.amazonaws.handlers;

import com.amazonaws.Request;
import com.amazonaws.Response;

/* JADX INFO: loaded from: classes.dex */
final class RequestHandler2Adaptor extends RequestHandler2 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final RequestHandler f10380OooO00o;

    public RequestHandler2Adaptor(RequestHandler requestHandler) {
        if (requestHandler == null) {
            throw new IllegalArgumentException();
        }
        this.f10380OooO00o = requestHandler;
    }

    @Override // com.amazonaws.handlers.RequestHandler2
    public final void OooO0O0(Request request, Exception exc) {
        this.f10380OooO00o.OooO00o();
    }

    @Override // com.amazonaws.handlers.RequestHandler2
    public final void OooO0OO(Request<?> request, Response<?> response) {
        this.f10380OooO00o.OooO0O0();
    }

    @Override // com.amazonaws.handlers.RequestHandler2
    public final void OooO0Oo(Request<?> request) {
        this.f10380OooO00o.beforeRequest();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RequestHandler2Adaptor) {
            return this.f10380OooO00o.equals(((RequestHandler2Adaptor) obj).f10380OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10380OooO00o.hashCode();
    }
}
