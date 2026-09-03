package p092o000o0O0;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.OooO00o;
import p091o000o0O.o0Oo0oo;
import p091o000o0O.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f35296OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooO00o f35297OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f35298OooO0o0;

    public o00000OO(OooO00o oooO00o, WorkDatabase workDatabase, String str) {
        this.f35297OooO0o = oooO00o;
        this.f35296OooO0Oo = workDatabase;
        this.f35298OooO0o0 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o0Oo0oo o0oo0ooOooO0oo = ((oo0o0Oo) this.f35296OooO0Oo.OooOo00()).OooO0oo(this.f35298OooO0o0);
        if (o0oo0ooOooO0oo == null || !o0oo0ooOooO0oo.OooO0O0()) {
            return;
        }
        synchronized (this.f35297OooO0o.f8471OooO0o) {
            this.f35297OooO0o.f8469OooO.put(this.f35298OooO0o0, o0oo0ooOooO0oo);
            this.f35297OooO0o.f8475OooOO0.add(o0oo0ooOooO0oo);
            OooO00o oooO00o = this.f35297OooO0o;
            oooO00o.f8476OooOO0O.OooO0OO(oooO00o.f8475OooOO0);
        }
    }
}
