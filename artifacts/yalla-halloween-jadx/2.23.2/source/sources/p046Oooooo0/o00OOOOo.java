package p046Oooooo0;

import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.AudioSpec;
import o000OO.OooOOO;
import p028Oooo0oO.o00O0O0;
import p042OooooO0.oOO00O;
import p045Oooooo.OooOO0O;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00OOOOo implements OooOOO<OooOO0O> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f2003OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Timebase f2004OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f2005OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AudioSpec f2006OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final EncoderProfilesProxy.AudioProfileProxy f2007OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oOO00O f2008OooO0o0;

    public o00OOOOo(@NonNull String str, int i, @NonNull Timebase timebase, @NonNull AudioSpec audioSpec, @NonNull oOO00O ooo00o, @NonNull EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
        this.f2003OooO00o = str;
        this.f2005OooO0OO = i;
        this.f2004OooO0O0 = timebase;
        this.f2006OooO0Oo = audioSpec;
        this.f2008OooO0o0 = ooo00o;
        this.f2007OooO0o = audioProfileProxy;
    }

    @Override // o000OO.OooOOO
    @NonNull
    public final OooOO0O get() {
        o00O0O0.OooO00o("AudioEncAdPrflRslvr", "Using resolved AUDIO bitrate from AudioProfile");
        Range<Integer> rangeOooO0O0 = this.f2006OooO0Oo.OooO0O0();
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.f2007OooO0o;
        int iOooO00o = audioProfileProxy.OooO00o();
        oOO00O ooo00o = this.f2008OooO0o0;
        int iOooO0OO = o00OOOO0.OooO0OO(iOooO00o, ooo00o.OooO0Oo(), audioProfileProxy.OooO0O0(), ooo00o.OooO0o0(), audioProfileProxy.OooO0o(), rangeOooO0O0);
        Oooooo.OooOOO.OooO00o oooO00o = new Oooooo.OooOOO.OooO00o();
        oooO00o.f1819OooO0O0 = -1;
        String str = this.f2003OooO00o;
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        oooO00o.f1818OooO00o = str;
        oooO00o.f1819OooO0O0 = Integer.valueOf(this.f2005OooO0OO);
        Timebase timebase = this.f2004OooO0O0;
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
