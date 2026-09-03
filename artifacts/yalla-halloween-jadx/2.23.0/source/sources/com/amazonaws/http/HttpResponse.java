package com.amazonaws.http;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes2.dex */
public class HttpResponse {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f9090OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f9091OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InputStream f9092OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<String, String> f9093OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public InputStream f9094OooO0o0;

    public static class Builder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f9095OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f9096OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public InputStream f9097OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final HashMap f9098OooO0Oo = new HashMap();
    }

    public HttpResponse(String str, int i, Map map, InputStream inputStream) {
        this.f9090OooO00o = str;
        this.f9091OooO0O0 = i;
        this.f9093OooO0Oo = map;
        this.f9092OooO0OO = inputStream;
    }

    public final InputStream OooO00o() throws IOException {
        if (this.f9094OooO0o0 == null) {
            synchronized (this) {
                if (this.f9092OooO0OO == null || !"gzip".equals(this.f9093OooO0Oo.get("Content-Encoding"))) {
                    this.f9094OooO0o0 = this.f9092OooO0OO;
                } else {
                    this.f9094OooO0o0 = new GZIPInputStream(this.f9092OooO0OO);
                }
            }
        }
        return this.f9094OooO0o0;
    }
}
