package p361o0OOOoOo;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo implements Callable<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ long f38476OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0OO00O f38477OooO0O0;

    public o000OOo(o0OO00O o0oo00o2, long j) {
        this.f38477OooO0O0 = o0oo00o2;
        this.f38476OooO00o = j;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f38476OooO00o);
        this.f38477OooO0O0.f38503OooOO0.OooO0O0(bundle);
        return null;
    }
}
