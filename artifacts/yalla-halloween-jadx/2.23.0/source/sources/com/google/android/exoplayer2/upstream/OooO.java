package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO implements LoadErrorHandlingPolicy {
    /* JADX WARN: Code duplicated, block: B:22:0x002f  */
    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    public final long OooO00o(LoadErrorHandlingPolicy.OooO0OO oooO0OO) {
        boolean z;
        Throwable cause = oooO0OO.f14190OooO00o;
        if (!(cause instanceof ParserException) && !(cause instanceof FileNotFoundException) && !(cause instanceof HttpDataSource$CleartextNotPermittedException) && !(cause instanceof Loader.UnexpectedLoaderException)) {
            int i = DataSourceException.f14157OooO0o0;
            while (cause != null) {
                if ((cause instanceof DataSourceException) && ((DataSourceException) cause).f14158OooO0Oo == 2008) {
                    z = true;
                    if (!z) {
                        return Math.min((oooO0OO.f14191OooO0O0 - 1) * 1000, 5000);
                    }
                } else {
                    cause = cause.getCause();
                }
            }
            z = false;
            if (!z) {
                return Math.min((oooO0OO.f14191OooO0O0 - 1) * 1000, 5000);
            }
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    public final int OooO0O0(int i) {
        return i == 7 ? 6 : 3;
    }

    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    @Nullable
    public final LoadErrorHandlingPolicy.OooO0O0 OooO0OO(LoadErrorHandlingPolicy.OooO00o oooO00o, LoadErrorHandlingPolicy.OooO0OO oooO0OO) {
        int i;
        IOException iOException = oooO0OO.f14190OooO00o;
        if (!((iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i = ((HttpDataSource$InvalidResponseCodeException) iOException).f14182OooO0oO) == 403 || i == 404 || i == 410 || i == 416 || i == 500 || i == 503))) {
            return null;
        }
        if (oooO00o.OooO00o(1)) {
            return new LoadErrorHandlingPolicy.OooO0O0(1, 300000L);
        }
        if (oooO00o.OooO00o(2)) {
            return new LoadErrorHandlingPolicy.OooO0O0(2, 60000L);
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy
    public final /* synthetic */ void OooO0Oo() {
    }
}
