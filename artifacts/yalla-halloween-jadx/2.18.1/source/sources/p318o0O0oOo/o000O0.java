package p318o0O0oOo;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0 implements o00000O {
    @Override // p318o0O0oOo.o00000O
    public final long OooO00o() {
        return SystemClock.uptimeMillis();
    }

    @Override // p318o0O0oOo.o00000O
    public final o000O0Oo OooO0O0(Looper looper, @Nullable Handler.Callback callback) {
        return new o000O0Oo(new Handler(looper, callback));
    }

    @Override // p318o0O0oOo.o00000O
    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}
