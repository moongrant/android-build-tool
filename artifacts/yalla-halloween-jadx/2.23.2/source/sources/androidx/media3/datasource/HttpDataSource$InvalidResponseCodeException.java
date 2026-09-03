package androidx.media3.datasource;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f6984OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @UnstableApi
    public final Map<String, List<String>> f6985OooO0oo;

    @UnstableApi
    public HttpDataSource$InvalidResponseCodeException(int i, @Nullable DataSourceException dataSourceException, Map map) {
        super(android.support.v4.media.OooO00o.OooO00o("Response code: ", i), dataSourceException, 2004);
        this.f6984OooO0oO = i;
        this.f6985OooO0oo = map;
    }
}
