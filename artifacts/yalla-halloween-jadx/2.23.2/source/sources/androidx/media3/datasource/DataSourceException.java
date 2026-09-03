package androidx.media3.datasource;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class DataSourceException extends IOException {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ int f6966OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f6967OooO0Oo;

    @UnstableApi
    public DataSourceException(int i) {
        this.f6967OooO0Oo = i;
    }

    @UnstableApi
    public DataSourceException(int i, @Nullable Throwable th) {
        super(th);
        this.f6967OooO0Oo = i;
    }

    @UnstableApi
    public DataSourceException(@Nullable String str, int i) {
        super(str);
        this.f6967OooO0Oo = i;
    }

    @UnstableApi
    public DataSourceException(@Nullable Throwable th, int i, @Nullable String str) {
        super(str, th);
        this.f6967OooO0Oo = i;
    }
}
