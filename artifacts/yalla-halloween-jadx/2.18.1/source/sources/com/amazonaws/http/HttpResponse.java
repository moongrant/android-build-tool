package com.amazonaws.http;

import com.efs.sdk.base.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes.dex */
public class HttpResponse {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f10396OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f10397OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InputStream f10398OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<String, String> f10399OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public InputStream f10400OooO0o0;

    public static class Builder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f10401OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f10402OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public InputStream f10403OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Map<String, String> f10404OooO0Oo = new HashMap();
    }

    public HttpResponse(String str, int i, Map map, InputStream inputStream, AnonymousClass1 anonymousClass1) {
        this.f10396OooO00o = str;
        this.f10397OooO0O0 = i;
        this.f10399OooO0Oo = map;
        this.f10398OooO0OO = inputStream;
    }

    public final InputStream OooO00o() throws IOException {
        if (this.f10400OooO0o0 == null) {
            synchronized (this) {
                if (this.f10398OooO0OO == null || !Constants.CP_GZIP.equals(this.f10399OooO0Oo.get("Content-Encoding"))) {
                    this.f10400OooO0o0 = this.f10398OooO0OO;
                } else {
                    this.f10400OooO0o0 = new GZIPInputStream(this.f10398OooO0OO);
                }
            }
        }
        return this.f10400OooO0o0;
    }
}
