package com.amazonaws.internal.config;

import OooO00o.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class HttpClientConfig {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f10416OooO00o;

    public HttpClientConfig(String str) {
        this.f10416OooO00o = str;
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("serviceName: ");
        sbOooO0o0.append(this.f10416OooO00o);
        return sbOooO0o0.toString();
    }
}
