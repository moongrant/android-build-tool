package p028Oooo0oO;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.util.concurrent.Executor;
import p245o00oo0o.o00O;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000OO00 implements o00O000.OooO0OO, o00O.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1123OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1124OooO0o0;

    public /* synthetic */ o000OO00(Object obj, Object obj2) {
        this.f1123OooO0Oo = obj;
        this.f1124OooO0o0 = obj2;
    }

    @Override // o0ooOO0.o00O000.OooO0OO
    public final Object OooO0o0(o00O000.OooO00o oooO00o) {
        o0O0ooO o0o0ooo = (o0O0ooO) this.f1123OooO0Oo;
        Context context = (Context) this.f1124OooO0o0;
        Executor executor = o0o0ooo.f1192OooO0Oo;
        executor.execute(new o000OOo0(o0o0ooo, context, executor, oooO00o, SystemClock.elapsedRealtime()));
        return "CameraX initInternal";
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).OoooOOo();
    }
}
