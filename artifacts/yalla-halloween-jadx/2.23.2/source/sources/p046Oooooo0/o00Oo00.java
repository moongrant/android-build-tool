package p046Oooooo0;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.AudioSpec;
import o000OO.OooOOO;
import p028Oooo0oO.o00O0O0;
import p042OooooO0.oOO00O;
import p045Oooooo.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00Oo00 implements OooOOO<OooOO0O> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f2009OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f2010OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AudioSpec f2011OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oOO00O f2012OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Timebase f2013OooO0o0;

    public o00Oo00(@NonNull String str, int i, @NonNull Timebase timebase, @NonNull AudioSpec audioSpec, @NonNull oOO00O ooo00o) {
        this.f2009OooO00o = str;
        this.f2010OooO0O0 = i;
        this.f2013OooO0o0 = timebase;
        this.f2011OooO0OO = audioSpec;
        this.f2012OooO0Oo = ooo00o;
    }

    @Override // o000OO.OooOOO
    @NonNull
    public final OooOO0O get() {
        Range<Integer> rangeOooO0O0 = this.f2011OooO0OO.OooO0O0();
        o00O0O0.OooO00o("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
        oOO00O ooo00o = this.f2012OooO0Oo;
        int iOooO0OO = o00OOOO0.OooO0OO(156000, ooo00o.OooO0Oo(), 2, ooo00o.OooO0o0(), 48000, rangeOooO0O0);
        Oooooo.OooOOO.OooO00o oooO00o = new Oooooo.OooOOO.OooO00o();
        oooO00o.f1819OooO0O0 = -1;
        String str = this.f2009OooO00o;
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        oooO00o.f1818OooO00o = str;
        oooO00o.f1819OooO0O0 = Integer.valueOf(this.f2010OooO0O0);
        Timebase timebase = this.f2013OooO0o0;
        if (timebase == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        oooO00o.f1820OooO0OO = timebase;
        oooO00o.f1822OooO0o = Integer.valueOf(ooo00o.OooO0Oo());
        oooO00o.f1823OooO0o0 = Integer.valueOf(ooo00o.OooO0o0());
        oooO00o.f1821OooO0Oo = Integer.valueOf(iOooO0OO);
        return oooO00o.OooO00o();
    }
}
