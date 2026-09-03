package p203o00o0o0o;

import android.util.Pair;
import com.google.android.exoplayer2.drm.OooO0O0;
import com.google.android.exoplayer2.o00O0O;
import com.google.android.exoplayer2.source.OooOOOO;
import java.util.concurrent.CopyOnWriteArraySet;
import p245o00oo0o.o00O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O00000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f39251OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f39252OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f39253OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Object f39254OooO0oO;

    public /* synthetic */ o0O00000(int i, Object obj, int i2, Object obj2) {
        this.f39251OooO0Oo = i2;
        this.f39252OooO0o = obj;
        this.f39254OooO0oO = obj2;
        this.f39253OooO0o0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f39251OooO0Oo;
        int i2 = this.f39253OooO0o0;
        Object obj = this.f39254OooO0oO;
        Object obj2 = this.f39252OooO0o;
        switch (i) {
            case 0:
                Pair pair = (Pair) obj;
                ((o00O0O.OooO00o) obj2).f12812OooO0o0.f12807OooO0oo.Oooo00o(((Integer) pair.first).intValue(), (OooOOOO.OooO0O0) pair.second, i2);
                break;
            case 1:
                OooO0O0.OooO00o oooO00o = (OooO0O0.OooO00o) obj2;
                OooO0O0 oooO0O0 = (OooO0O0) obj;
                int i3 = oooO00o.f11769OooO00o;
                oooO0O0.OooOO0O();
                oooO0O0.Oooo00o(i3, oooO00o.f11770OooO0O0, i2);
                break;
            default:
                o00O.OooO00o oooO00o2 = (o00O.OooO00o) obj;
                for (o00O.OooO0OO oooO0OO : (CopyOnWriteArraySet) obj2) {
                    if (!oooO0OO.f40555OooO0Oo) {
                        if (i2 != -1) {
                            oooO0OO.f40553OooO0O0.OooO00o(i2);
                        }
                        oooO0OO.f40554OooO0OO = true;
                        oooO00o2.invoke(oooO0OO.f40552OooO00o);
                    }
                }
                break;
        }
    }

    public /* synthetic */ o0O00000(CopyOnWriteArraySet copyOnWriteArraySet, int i, o00O.OooO00o oooO00o) {
        this.f39251OooO0Oo = 2;
        this.f39252OooO0o = copyOnWriteArraySet;
        this.f39253OooO0o0 = i;
        this.f39254OooO0oO = oooO00o;
    }
}
