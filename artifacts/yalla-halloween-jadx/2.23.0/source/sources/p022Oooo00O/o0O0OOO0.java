package p022Oooo00O;

import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.AndroidMemoryReading;
import java.util.Objects;
import p307o0O0oO0.OooOOO0;
import p310o0O0oOO.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0O0OOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f755OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f756OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f757OooO0o0;

    public /* synthetic */ o0O0OOO0(int i, Object obj, Object obj2) {
        this.f755OooO0Oo = i;
        this.f757OooO0o0 = obj;
        this.f756OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f755OooO0Oo;
        Object obj = this.f756OooO0o;
        Object obj2 = this.f757OooO0o0;
        switch (i) {
            case 0:
                o0O0OOOo o0o0oooo = (o0O0OOOo) obj2;
                Objects.requireNonNull(o0o0oooo.f763OooO0o);
                o0o0oooo.f763OooO0o.OooOOOo((o0oO0O0o) obj);
                break;
            default:
                o0Oo0oo o0oo0oo2 = (o0Oo0oo) obj2;
                OooOOO0 oooOOO0 = o0Oo0oo.f42511OooO0o;
                AndroidMemoryReading androidMemoryReadingOooO0OO = o0oo0oo2.OooO0OO((Timer) obj);
                if (androidMemoryReadingOooO0OO != null) {
                    o0oo0oo2.f42513OooO0O0.add(androidMemoryReadingOooO0OO);
                }
                break;
        }
    }
}
