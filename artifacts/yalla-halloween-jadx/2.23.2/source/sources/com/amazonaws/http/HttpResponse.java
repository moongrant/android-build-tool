package com.amazonaws.http;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes2.dex */
public class HttpResponse {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f12180OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f12181OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InputStream f12182OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<String, String> f12183OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public InputStream f12184OooO0o0;

    public static class Builder {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f12185OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f12186OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public InputStream f12187OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final HashMap f12188OooO0Oo = new HashMap();
    }

    public HttpResponse(String str, int i, Map map, InputStream inputStream) {
        this.f12180OooO00o = str;
        this.f12181OooO0O0 = i;
        this.f12183OooO0Oo = map;
        this.f12182OooO0OO = inputStream;
    }

    public final InputStream OooO00o() throws IOException {
        if (this.f12184OooO0o0 == null) {
            synchronized (this) {
                if (this.f12182OooO0OO == null || !"gzip".equals(this.f12183OooO0Oo.get("Content-Encoding"))) {
                    this.f12184OooO0o0 = this.f12182OooO0OO;
                } else {
                    this.f12184OooO0o0 = new GZIPInputStream(this.f12182OooO0OO);
                }
            }
        }
        return this.f12184OooO0o0;
    }
}
