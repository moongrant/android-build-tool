package p080o000OoO;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class o000O00 implements o0ooOOo {
    @Override // p080o000OoO.o0ooOOo
    public final long OooO00o() {
        return SystemClock.uptimeMillis();
    }

    @Override // p080o000OoO.o0ooOOo
    public final o000O00O OooO0O0(Looper looper, @Nullable Handler.Callback callback) {
        return new o000O00O(new Handler(looper, callback));
    }

    @Override // p080o000OoO.o0ooOOo
    public final void OooO0OO() {
    }

    @Override // p080o000OoO.o0ooOOo
    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}
