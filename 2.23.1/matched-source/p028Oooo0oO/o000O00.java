package p028Oooo0oO;

import android.util.Pair;
import androidx.camera.core.impl.o000O0O0;
import androidx.media3.exoplayer.OooOOO0;
import androidx.media3.exoplayer.source.OooOOOO;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.AndroidMemoryReading;
import p312o0O0oO0o.oo0o0Oo;
import p315o0O0oOOO.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000O00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1102OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1103OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1104OooO0o0;

    public /* synthetic */ o000O00(int i, Object obj, Object obj2) {
        this.f1102OooO0Oo = i;
        this.f1104OooO0o0 = obj;
        this.f1103OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1102OooO0Oo;
        Object obj = this.f1103OooO0o;
        Object obj2 = this.f1104OooO0o0;
        switch (i) {
            case 0:
                o000O00O o000o00o2 = (o000O00O) obj2;
                o000o00o2.getClass();
                ((o000O0O0.OooO00o) obj).OooO00o(o000o00o2);
                break;
            case 1:
                Pair pair = (Pair) obj;
                ((OooOOO0.OooO00o) obj2).f7325OooO0o0.f7320OooO0oo.Oooo00O(((Integer) pair.first).intValue(), (OooOOOO.OooO0O0) pair.second);
                break;
            default:
                o000OO0O o000oo0o2 = (o000OO0O) obj2;
                oo0o0Oo oo0o0oo = o000OO0O.f41872OooO0o;
                AndroidMemoryReading androidMemoryReadingOooO0OO = o000oo0o2.OooO0OO((Timer) obj);
                if (androidMemoryReadingOooO0OO != null) {
                    o000oo0o2.f41874OooO0O0.add(androidMemoryReadingOooO0OO);
                }
                break;
        }
    }
}
