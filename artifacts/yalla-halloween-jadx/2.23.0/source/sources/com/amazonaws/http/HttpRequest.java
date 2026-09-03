package com.amazonaws.http;

import com.amazonaws.util.StringUtils;
import java.io.InputStream;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class HttpRequest {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f9085OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final URI f9086OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<String, String> f9087OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InputStream f9088OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f9089OooO0o0;

    public HttpRequest(String str, URI uri, HashMap map, InputStream inputStream) {
        Charset charset = StringUtils.f9590OooO00o;
        this.f9085OooO00o = str == null ? null : str.isEmpty() ? "" : str.toUpperCase(Locale.ENGLISH);
        this.f9086OooO0O0 = uri;
        this.f9087OooO0OO = Collections.unmodifiableMap(map);
        this.f9088OooO0Oo = inputStream;
    }

    public final long OooO00o() {
        String str;
        Map<String, String> map = this.f9087OooO0OO;
        if (map == null || (str = map.get("Content-Length")) == null || str.isEmpty()) {
            return 0L;
        }
        return Long.valueOf(str).longValue();
    }
}
