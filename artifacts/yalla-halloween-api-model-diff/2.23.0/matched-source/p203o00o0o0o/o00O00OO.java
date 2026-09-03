package p203o00o0o0o;

import com.google.android.exoplayer2.OooOOO;
import com.google.android.exoplayer2.OooOo00;
import com.google.android.exoplayer2.audio.OooO0o;
import com.google.android.exoplayer2.oo0o0Oo;
import com.google.android.exoplayer2.source.OooOOOO;
import java.util.Arrays;
import java.util.List;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O00OO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f39187OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f39188OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f39189OooO0o0;

    public /* synthetic */ o00O00OO(int i, Object obj, Object obj2) {
        this.f39187OooO0Oo = i;
        this.f39189OooO0o0 = obj;
        this.f39188OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        boolean z;
        switch (this.f39187OooO0Oo) {
            case 0:
                OooOOO oooOOO = (OooOOO) this.f39189OooO0o0;
                OooOo00.OooO0o oooO0o = (OooOo00.OooO0o) this.f39188OooO0o;
                int i = oooOOO.f11110Oooo00O - oooO0o.f11314OooO0OO;
                oooOOO.f11110Oooo00O = i;
                boolean z2 = true;
                if (oooO0o.f11315OooO0Oo) {
                    oooOOO.f11111Oooo00o = oooO0o.f11317OooO0o0;
                    oooOOO.f11108Oooo0 = true;
                }
                if (oooO0o.f11316OooO0o) {
                    oooOOO.f11112Oooo0O0 = oooO0o.f11318OooO0oO;
                }
                if (i == 0) {
                    oo0o0Oo oo0o0oo = oooO0o.f11313OooO0O0.f39262OooO00o;
                    if (!oooOOO.f11133Oooooo.f39262OooO00o.OooOOo0() && oo0o0oo.OooOOo0()) {
                        oooOOO.f11135OoooooO = -1;
                        oooOOO.f11136Ooooooo = 0L;
                    }
                    if (!oo0o0oo.OooOOo0()) {
                        List listAsList = Arrays.asList(((o0O00) oo0o0oo).f39244OooOOOo);
                        o00O000o.OooO0Oo(listAsList.size() == oooOOO.f11090OooOOOO.size());
                        for (int i2 = 0; i2 < listAsList.size(); i2++) {
                            ((OooOOO.OooO0o) oooOOO.f11090OooOOOO.get(i2)).f11144OooO0O0 = (oo0o0Oo) listAsList.get(i2);
                        }
                    }
                    long j2 = -9223372036854775807L;
                    if (oooOOO.f11108Oooo0) {
                        if (oooO0o.f11313OooO0O0.f39263OooO0O0.equals(oooOOO.f11133Oooooo.f39263OooO0O0) && oooO0o.f11313OooO0O0.f39265OooO0Oo == oooOOO.f11133Oooooo.f39277OooOOo) {
                            z2 = false;
                        }
                        if (z2) {
                            if (oo0o0oo.OooOOo0() || oooO0o.f11313OooO0O0.f39263OooO0O0.OooO00o()) {
                                j2 = oooO0o.f11313OooO0O0.f39265OooO0Oo;
                            } else {
                                o0O000o0 o0o000o1 = oooO0o.f11313OooO0O0;
                                OooOOOO.OooO0O0 oooO0O0 = o0o000o1.f39263OooO0O0;
                                long j3 = o0o000o1.f39265OooO0Oo;
                                Object obj = oooO0O0.f39859OooO00o;
                                oo0o0Oo.OooO0O0 oooO0O1 = oooOOO.f11088OooOOO;
                                oo0o0oo.OooO0oo(obj, oooO0O1);
                                j2 = j3 + oooO0O1.f12909OooO0oo;
                            }
                        }
                        j = j2;
                        z = z2;
                    } else {
                        j = -9223372036854775807L;
                        z = false;
                    }
                    oooOOO.f11108Oooo0 = false;
                    oooOOO.o00000Oo(oooO0o.f11313OooO0O0, 1, oooOOO.f11112Oooo0O0, z, oooOOO.f11111Oooo00o, j, -1, false);
                }
                break;
            default:
                OooO0o.OooO00o oooO00o = (OooO0o.OooO00o) this.f39189OooO0o0;
                Exception exc = (Exception) this.f39188OooO0o;
                oooO00o.getClass();
                int i3 = o0O00.f40595OooO00o;
                oooO00o.f11611OooO0O0.OooOOo0(exc);
                break;
        }
    }
}
