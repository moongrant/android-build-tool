package com.amazonaws.http;

import com.amazonaws.util.StringUtils;
import java.io.InputStream;
import java.net.URI;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class HttpRequest {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f10391OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public URI f10392OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<String, String> f10393OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InputStream f10394OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f10395OooO0o0;

    public HttpRequest(String str, URI uri, Map<String, String> map, InputStream inputStream) {
        this.f10391OooO00o = StringUtils.OooO0O0(str);
        this.f10392OooO0O0 = uri;
        this.f10393OooO0OO = Collections.unmodifiableMap(map);
        this.f10394OooO0Oo = inputStream;
    }

    public final long OooO00o() {
        String str;
        Map<String, String> map = this.f10393OooO0OO;
        if (map == null || (str = map.get("Content-Length")) == null || str.isEmpty()) {
            return 0L;
        }
        return Long.valueOf(str).longValue();
    }
}
