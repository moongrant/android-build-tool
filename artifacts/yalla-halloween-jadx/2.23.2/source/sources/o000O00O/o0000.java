package o000O00O;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0000 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.OooO f34004OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ androidx.media3.exoplayer.OooOO0O.OooO0o f34005OooO0o0;

    public /* synthetic */ o0000(androidx.media3.exoplayer.OooO oooO, androidx.media3.exoplayer.OooOO0O.OooO0o oooO0o) {
        this.f34004OooO0Oo = oooO;
        this.f34005OooO0o0 = oooO0o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        androidx.media3.exoplayer.OooO oooO = this.f34004OooO0Oo;
        androidx.media3.exoplayer.OooOO0O.OooO0o oooO0o = this.f34005OooO0o0;
        int i = oooO.f7155Oooo00O - oooO0o.f7284OooO0OO;
        oooO.f7155Oooo00O = i;
        boolean z = true;
        if (oooO0o.f7285OooO0Oo) {
            oooO.f7156Oooo00o = oooO0o.f7287OooO0o0;
            oooO.f7153Oooo0 = true;
        }
        if (oooO0o.f7286OooO0o) {
            oooO.f7157Oooo0O0 = oooO0o.f7288OooO0oO;
        }
        if (i == 0) {
            androidx.media3.common.Oooo0 oooo0 = oooO0o.f7283OooO0O0.f34105OooO00o;
            if (!oooO.f7179Oooooo0.f34105OooO00o.OooOo00() && oooo0.OooOo00()) {
                oooO.f7178Oooooo = -1;
                oooO.f7180OoooooO = 0L;
            }
            if (!oooo0.OooOo00()) {
                List listAsList = Arrays.asList(((oo0oOO0) oooo0).f34162OooOOo0);
                p080o000OoO.o00Oo0.OooO0Oo(listAsList.size() == oooO.f7135OooOOOO.size());
                for (int i2 = 0; i2 < listAsList.size(); i2++) {
                    ((androidx.media3.exoplayer.OooO.OooO0o) oooO.f7135OooOOOO.get(i2)).f7188OooO0O0 = (androidx.media3.common.Oooo0) listAsList.get(i2);
                }
            }
            long j2 = -9223372036854775807L;
            if (oooO.f7153Oooo0) {
                if (oooO0o.f7283OooO0O0.f34106OooO0O0.equals(oooO.f7179Oooooo0.f34106OooO0O0) && oooO0o.f7283OooO0O0.f34108OooO0Oo == oooO.f7179Oooooo0.f34120OooOOo) {
                    z = false;
                }
                if (z) {
                    if (oooo0.OooOo00() || oooO0o.f7283OooO0O0.f34106OooO0O0.OooO00o()) {
                        j = oooO0o.f7283OooO0O0.f34108OooO0Oo;
                    } else {
                        o00O0OO o00o0oo2 = oooO0o.f7283OooO0O0;
                        androidx.media3.exoplayer.source.OooOOOO.OooO0O0 oooO0O0 = o00o0oo2.f34106OooO0O0;
                        long j3 = o00o0oo2.f34108OooO0Oo;
                        Object obj = oooO0O0.f33816OooO00o;
                        androidx.media3.common.Oooo0.OooO0O0 oooO0O1 = oooO.f7133OooOOO;
                        oooo0.OooOO0O(obj, oooO0O1);
                        j = j3 + oooO0O1.f6645OooO0oo;
                    }
                    j2 = j;
                }
            } else {
                z = false;
            }
            oooO.f7153Oooo0 = false;
            oooO.o000000O(oooO0o.f7283OooO0O0, 1, oooO.f7157Oooo0O0, z, oooO.f7156Oooo00o, j2, -1, false);
        }
    }
}
