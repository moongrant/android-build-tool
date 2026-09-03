package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f14182OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Map<String, List<String>> f14183OooO0oo;

    public HttpDataSource$InvalidResponseCodeException(int i, @Nullable DataSourceException dataSourceException, Map map) {
        super(android.support.v4.media.OooO00o.OooO00o("Response code: ", i), dataSourceException, 2004);
        this.f14182OooO0oO = i;
        this.f14183OooO0oo = map;
    }
}
