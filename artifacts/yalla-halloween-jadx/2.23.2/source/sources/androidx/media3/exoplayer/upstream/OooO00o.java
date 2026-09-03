package androidx.media3.exoplayer.upstream;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO00o implements LoadErrorHandlingPolicy {
    /* JADX WARN: Code duplicated, block: B:22:0x002f  */
    @Override // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public final long OooO00o(LoadErrorHandlingPolicy.OooO00o oooO00o) {
        boolean z;
        Throwable cause = oooO00o.f8251OooO00o;
        if (!(cause instanceof ParserException) && !(cause instanceof FileNotFoundException) && !(cause instanceof HttpDataSource$CleartextNotPermittedException) && !(cause instanceof Loader.UnexpectedLoaderException)) {
            int i = DataSourceException.f6966OooO0o0;
            while (cause != null) {
                if ((cause instanceof DataSourceException) && ((DataSourceException) cause).f6967OooO0Oo == 2008) {
                    z = true;
                    if (!z) {
                        return Math.min((oooO00o.f8252OooO0O0 - 1) * 1000, 5000);
                    }
                } else {
                    cause = cause.getCause();
                }
            }
            z = false;
            if (!z) {
                return Math.min((oooO00o.f8252OooO0O0 - 1) * 1000, 5000);
            }
        }
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public final int OooO0O0(int i) {
        return i == 7 ? 6 : 3;
    }

    @Override // androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy
    public final /* synthetic */ void OooO0OO() {
    }
}
