package com.amazonaws.auth;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class SignerFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ConcurrentHashMap f12153OooO00o;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f12153OooO00o = concurrentHashMap;
        concurrentHashMap.put("QueryStringSignerType", QueryStringSigner.class);
        concurrentHashMap.put("AWS3SignerType", AWS3Signer.class);
        concurrentHashMap.put("AWS4SignerType", AWS4Signer.class);
        concurrentHashMap.put("NoOpSignerType", NoOpSigner.class);
    }
}
