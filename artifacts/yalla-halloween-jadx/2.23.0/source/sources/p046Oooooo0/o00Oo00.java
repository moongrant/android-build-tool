package p046Oooooo0;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.AudioSpec;
import o000OO.OooOOO;
import p028Oooo0oO.o00O0O0;
import p042OooooO0.o00O00o0;
import p045Oooooo.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00Oo00 implements OooOOO<OooOO0O> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f2019OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f2020OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final AudioSpec f2021OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O00o0 f2022OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Timebase f2023OooO0o0;

    public o00Oo00(@NonNull String str, int i, @NonNull Timebase timebase, @NonNull AudioSpec audioSpec, @NonNull o00O00o0 o00o00o1) {
        this.f2019OooO00o = str;
        this.f2020OooO0O0 = i;
        this.f2023OooO0o0 = timebase;
        this.f2021OooO0OO = audioSpec;
        this.f2022OooO0Oo = o00o00o1;
    }

    @Override // o000OO.OooOOO
    @NonNull
    public final OooOO0O get() {
        Range<Integer> rangeOooO0O0 = this.f2021OooO0OO.OooO0O0();
        o00O0O0.OooO00o("AudioEncCfgDefaultRslvr", "Using fallback AUDIO bitrate");
        o00O00o0 o00o00o1 = this.f2022OooO0Oo;
        int iOooO0OO = o00OOOO0.OooO0OO(156000, o00o00o1.OooO0Oo(), 2, o00o00o1.OooO0o0(), 48000, rangeOooO0O0);
        Oooooo.OooOOO.OooO00o oooO00o = new Oooooo.OooOOO.OooO00o();
        oooO00o.f1832OooO0O0 = -1;
        String str = this.f2019OooO00o;
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        oooO00o.f1831OooO00o = str;
        oooO00o.f1832OooO0O0 = Integer.valueOf(this.f2020OooO0O0);
        Timebase timebase = this.f2023OooO0o0;
        if (timebase == null) {
            throw new NullPointerException("Null inputTimebase");
        }
        oooO00o.f1833OooO0OO = timebase;
        oooO00o.f1835OooO0o = Integer.valueOf(o00o00o1.OooO0Oo());
        oooO00o.f1836OooO0o0 = Integer.valueOf(o00o00o1.OooO0o0());
        oooO00o.f1834OooO0Oo = Integer.valueOf(iOooO0OO);
        return oooO00o.OooO00o();
    }
}
