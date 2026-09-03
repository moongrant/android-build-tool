package com.amazonaws.handlers;

import com.amazonaws.Request;
import com.amazonaws.Response;

/* JADX INFO: loaded from: classes.dex */
public abstract class RequestHandler2 {
    public static RequestHandler2 OooO00o(RequestHandler requestHandler) {
        return new RequestHandler2Adaptor(requestHandler);
    }

    public abstract void OooO0O0(Request request, Exception exc);

    public abstract void OooO0OO(Request<?> request, Response<?> response);

    public abstract void OooO0Oo(Request<?> request);
}
