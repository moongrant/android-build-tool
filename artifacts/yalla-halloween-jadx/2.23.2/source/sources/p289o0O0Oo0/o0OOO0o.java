package p289o0O0Oo0;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0o implements Callable<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ long f41582OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f41583OooO0O0;

    public o0OOO0o(o00Ooo o00ooo2, long j) {
        this.f41583OooO0O0 = o00ooo2;
        this.f41582OooO00o = j;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f41582OooO00o);
        this.f41583OooO0O0.f41553OooOO0O.OooO00o(bundle);
        return null;
    }
}
