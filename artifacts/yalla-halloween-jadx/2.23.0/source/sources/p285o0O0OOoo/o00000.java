package p285o0O0OOoo;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000 implements Callable<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ long f42110OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f42111OooO0O0;

    public o00000(o0O0O00 o0o0o00, long j) {
        this.f42111OooO0O0 = o0o0o00;
        this.f42110OooO00o = j;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f42110OooO00o);
        this.f42111OooO0O0.f42202OooOO0O.OooO0OO(bundle);
        return null;
    }
}
