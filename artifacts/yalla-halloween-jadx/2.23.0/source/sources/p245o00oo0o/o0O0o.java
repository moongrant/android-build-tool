package p245o00oo0o;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0O0o implements o00O00OO {
    @Override // p245o00oo0o.o00O00OO
    public final long OooO00o() {
        return SystemClock.uptimeMillis();
    }

    @Override // p245o00oo0o.o00O00OO
    public final o0 OooO0O0(Looper looper, @Nullable Handler.Callback callback) {
        return new o0(new Handler(looper, callback));
    }

    @Override // p245o00oo0o.o00O00OO
    public final void OooO0OO() {
    }

    @Override // p245o00oo0o.o00O00OO
    public final long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }
}
