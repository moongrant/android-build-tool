package p318o0O0oOo;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Handler f36728OooO00o;

    public o000O0Oo(Handler handler) {
        this.f36728OooO00o = handler;
    }

    public final Message OooO00o(int i, @Nullable Object obj) {
        return this.f36728OooO00o.obtainMessage(i, obj);
    }

    public final void OooO0O0() {
        this.f36728OooO00o.removeMessages(2);
    }

    public final boolean OooO0OO(int i) {
        return this.f36728OooO00o.sendEmptyMessage(i);
    }
}
