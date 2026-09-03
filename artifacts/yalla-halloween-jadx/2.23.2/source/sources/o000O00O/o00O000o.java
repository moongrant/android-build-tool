package o000O00O;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.SampleStream;

/* JADX INFO: loaded from: classes.dex */
public final class o00O000o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final RendererCapabilities[] f34056OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.OooOOO f34057OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f34058OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SampleStream[] f34059OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f34060OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o00O00 f34061OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f34062OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f34063OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean[] f34064OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final p425o0OoO0o.o00000 f34065OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final androidx.media3.exoplayer.OooOOO0 f34066OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public o00O000o f34067OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public p425o0OoO0o.o00000O0 f34068OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public o000O.oo0o0Oo f34069OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f34070OooOOOO;

    public o00O000o(RendererCapabilities[] rendererCapabilitiesArr, long j, p425o0OoO0o.o00000 o00000Var, p074o000OO0o.o00Oo0 o00oo1, androidx.media3.exoplayer.OooOOO0 oooOOO0, o00O00 o00o01, p425o0OoO0o.o00000O0 o00000o1) {
        this.f34056OooO = rendererCapabilitiesArr;
        this.f34070OooOOOO = j;
        this.f34065OooOO0 = o00000Var;
        this.f34066OooOO0O = oooOOO0;
        androidx.media3.exoplayer.source.OooOOOO.OooO0O0 oooO0O0 = o00o01.f34046OooO00o;
        this.f34058OooO0O0 = oooO0O0.f33816OooO00o;
        this.f34061OooO0o = o00o01;
        this.f34069OooOOO0 = o000O.oo0o0Oo.f33891OooO0oO;
        this.f34068OooOOO = o00000o1;
        this.f34059OooO0OO = new SampleStream[rendererCapabilitiesArr.length];
        this.f34064OooO0oo = new boolean[rendererCapabilitiesArr.length];
        long j2 = o00o01.f34049OooO0Oo;
        oooOOO0.getClass();
        int i = OooO00o.f33954OooOO0o;
        Pair pair = (Pair) oooO0O0.f33816OooO00o;
        Object obj = pair.first;
        androidx.media3.exoplayer.source.OooOOOO.OooO0O0 OooO0O1 = oooO0O0.OooO0O0(pair.second);
        androidx.media3.exoplayer.OooOOO0.OooO0OO oooO0OO = (androidx.media3.exoplayer.OooOOO0.OooO0OO) oooOOO0.f7311OooO0Oo.get(obj);
        oooO0OO.getClass();
        oooOOO0.f7314OooO0oO.add(oooO0OO);
        androidx.media3.exoplayer.OooOOO0.OooO0O0 oooO0O1 = oooOOO0.f7312OooO0o.get(oooO0OO);
        if (oooO0O1 != null) {
            oooO0O1.f7321OooO00o.OooO(oooO0O1.f7322OooO0O0);
        }
        oooO0OO.f7326OooO0OO.add(OooO0O1);
        androidx.media3.exoplayer.source.OooOOO oooOOOOooOoo0 = oooO0OO.f7324OooO00o.OooO0OO(OooO0O1, o00oo1, o00o01.f34047OooO0O0);
        oooOOO0.f7310OooO0OO.put(oooOOOOooOoo0, oooO0OO);
        oooOOO0.OooO0OO();
        this.f34057OooO00o = j2 != -9223372036854775807L ? new androidx.media3.exoplayer.source.OooO0O0(oooOOOOooOoo0, true, 0L, j2) : oooOOOOooOoo0;
    }

    public final long OooO00o(p425o0OoO0o.o00000O0 o00000o1, long j, boolean z, boolean[] zArr) {
        RendererCapabilities[] rendererCapabilitiesArr;
        SampleStream[] sampleStreamArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= o00000o1.f46754OooO00o) {
                break;
            }
            if (z || !o00000o1.OooO00o(this.f34068OooOOO, i)) {
                z2 = false;
            }
            this.f34064OooO0oo[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            rendererCapabilitiesArr = this.f34056OooO;
            int length = rendererCapabilitiesArr.length;
            sampleStreamArr = this.f34059OooO0OO;
            if (i2 >= length) {
                break;
            }
            if (((androidx.media3.exoplayer.OooO0O0) rendererCapabilitiesArr[i2]).f7198OooO0o0 == -2) {
                sampleStreamArr[i2] = null;
            }
            i2++;
        }
        OooO0O0();
        this.f34068OooOOO = o00000o1;
        OooO0OO();
        long jOooO0Oo = this.f34057OooO00o.OooO0Oo(o00000o1.f46756OooO0OO, this.f34064OooO0oo, this.f34059OooO0OO, zArr, j);
        for (int i3 = 0; i3 < rendererCapabilitiesArr.length; i3++) {
            if (((androidx.media3.exoplayer.OooO0O0) rendererCapabilitiesArr[i3]).f7198OooO0o0 == -2 && this.f34068OooOOO.OooO0O0(i3)) {
                sampleStreamArr[i3] = new o000O.OooOOOO();
            }
        }
        this.f34062OooO0o0 = false;
        for (int i4 = 0; i4 < sampleStreamArr.length; i4++) {
            if (sampleStreamArr[i4] != null) {
                p080o000OoO.o00Oo0.OooO0Oo(o00000o1.OooO0O0(i4));
                if (((androidx.media3.exoplayer.OooO0O0) rendererCapabilitiesArr[i4]).f7198OooO0o0 != -2) {
                    this.f34062OooO0o0 = true;
                }
            } else {
                p080o000OoO.o00Oo0.OooO0Oo(o00000o1.f46756OooO0OO[i4] == null);
            }
        }
        return jOooO0Oo;
    }

    public final void OooO0O0() {
        int i = 0;
        if (!(this.f34067OooOO0o == null)) {
            return;
        }
        while (true) {
            p425o0OoO0o.o00000O0 o00000o1 = this.f34068OooOOO;
            if (i >= o00000o1.f46754OooO00o) {
                return;
            }
            boolean zOooO0O0 = o00000o1.OooO0O0(i);
            androidx.media3.exoplayer.trackselection.OooO0o oooO0o = this.f34068OooOOO.f46756OooO0OO[i];
            if (zOooO0O0 && oooO0o != null) {
                oooO0o.OooO0o();
            }
            i++;
        }
    }

    public final void OooO0OO() {
        int i = 0;
        if (!(this.f34067OooOO0o == null)) {
            return;
        }
        while (true) {
            p425o0OoO0o.o00000O0 o00000o1 = this.f34068OooOOO;
            if (i >= o00000o1.f46754OooO00o) {
                return;
            }
            boolean zOooO0O0 = o00000o1.OooO0O0(i);
            androidx.media3.exoplayer.trackselection.OooO0o oooO0o = this.f34068OooOOO.f46756OooO0OO[i];
            if (zOooO0O0 && oooO0o != null) {
                oooO0o.OooOO0();
            }
            i++;
        }
    }

    public final long OooO0Oo() {
        if (!this.f34060OooO0Oo) {
            return this.f34061OooO0o.f34047OooO0O0;
        }
        long jOooOOOo = this.f34062OooO0o0 ? this.f34057OooO00o.OooOOOo() : Long.MIN_VALUE;
        return jOooOOOo == Long.MIN_VALUE ? this.f34061OooO0o.f34051OooO0o0 : jOooOOOo;
    }

    public final void OooO0o() {
        OooO0O0();
        androidx.media3.exoplayer.source.OooOOO oooOOO = this.f34057OooO00o;
        try {
            boolean z = oooOOO instanceof androidx.media3.exoplayer.source.OooO0O0;
            androidx.media3.exoplayer.OooOOO0 oooOOO0 = this.f34066OooOO0O;
            if (z) {
                oooOOO0.OooO0o(((androidx.media3.exoplayer.source.OooO0O0) oooOOO).f7880OooO0Oo);
            } else {
                oooOOO0.OooO0o(oooOOO);
            }
        } catch (RuntimeException e) {
            Log.OooO0Oo("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final long OooO0o0() {
        return this.f34061OooO0o.f34047OooO0O0 + this.f34070OooOOOO;
    }

    public final p425o0OoO0o.o00000O0 OooO0oO(float f, androidx.media3.common.Oooo0 oooo0) throws ExoPlaybackException {
        p425o0OoO0o.o00000O0 o00000o0OooO0o0 = this.f34065OooOO0.OooO0o0(this.f34056OooO, this.f34069OooOOO0, this.f34061OooO0o.f34046OooO00o, oooo0);
        for (androidx.media3.exoplayer.trackselection.OooO0o oooO0o : o00000o0OooO0o0.f46756OooO0OO) {
            if (oooO0o != null) {
                oooO0o.OooO0Oo(f);
            }
        }
        return o00000o0OooO0o0;
    }

    public final void OooO0oo() {
        androidx.media3.exoplayer.source.OooOOO oooOOO = this.f34057OooO00o;
        if (oooOOO instanceof androidx.media3.exoplayer.source.OooO0O0) {
            long j = this.f34061OooO0o.f34049OooO0Oo;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            androidx.media3.exoplayer.source.OooO0O0 oooO0O0 = (androidx.media3.exoplayer.source.OooO0O0) oooOOO;
            oooO0O0.f7884OooO0oo = 0L;
            oooO0O0.f7879OooO = j;
        }
    }
}
