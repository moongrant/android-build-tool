package p203o00o0o0o;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.OooO00o;
import com.google.android.exoplayer2.OooO0o;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.o00O0O;
import com.google.android.exoplayer2.oo0o0Oo;
import com.google.android.exoplayer2.source.OooO0O0;
import com.google.android.exoplayer2.source.OooOOO;
import com.google.android.exoplayer2.source.OooOOOO;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.util.Log;
import p226o00oOo00.o00000OO;
import p226o00oOo00.o000O0;
import p241o00oo0O.o00O000;
import p241o00oo0O.o00oOoo;
import p244o00oo0Oo.o000OO0O;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00OOOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final RendererCapabilities[] f39212OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO f39213OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f39214OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SampleStream[] f39215OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f39216OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o00OOOOo f39217OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f39218OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f39219OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean[] f39220OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o00oOoo f39221OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o00O0O f39222OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public o00OOOO0 f39223OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public o00O000 f39224OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public o000O0 f39225OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f39226OooOOOO;

    public o00OOOO0(RendererCapabilities[] rendererCapabilitiesArr, long j, o00oOoo o00oooo2, o000OO0O o000oo0o2, o00O0O o00o0o2, o00OOOOo o00ooooo2, o00O000 o00o001) {
        this.f39212OooO = rendererCapabilitiesArr;
        this.f39226OooOOOO = j;
        this.f39221OooOO0 = o00oooo2;
        this.f39222OooOO0O = o00o0o2;
        OooOOOO.OooO0O0 oooO0O0 = o00ooooo2.f39228OooO00o;
        this.f39214OooO0O0 = oooO0O0.f39859OooO00o;
        this.f39217OooO0o = o00ooooo2;
        this.f39225OooOOO0 = o000O0.f39864OooO0oO;
        this.f39224OooOOO = o00o001;
        this.f39215OooO0OO = new SampleStream[rendererCapabilitiesArr.length];
        this.f39220OooO0oo = new boolean[rendererCapabilitiesArr.length];
        long j2 = o00ooooo2.f39231OooO0Oo;
        o00o0o2.getClass();
        int i = OooO00o.f11030OooOO0O;
        Pair pair = (Pair) oooO0O0.f39859OooO00o;
        Object obj = pair.first;
        OooOOOO.OooO0O0 OooO0O1 = oooO0O0.OooO0O0(pair.second);
        o00O0O.OooO0OO oooO0OO = (o00O0O.OooO0OO) o00o0o2.f12803OooO0Oo.get(obj);
        oooO0OO.getClass();
        o00o0o2.f12806OooO0oO.add(oooO0OO);
        o00O0O.OooO0O0 oooO0O1 = o00o0o2.f12804OooO0o.get(oooO0OO);
        if (oooO0O1 != null) {
            oooO0O1.f12813OooO00o.OooO0oO(oooO0O1.f12814OooO0O0);
        }
        oooO0OO.f12818OooO0OO.add(OooO0O1);
        OooOOO oooOOOOooOoo0 = oooO0OO.f12816OooO00o.OooO0oo(OooO0O1, o000oo0o2, o00ooooo2.f39229OooO0O0);
        o00o0o2.f12802OooO0OO.put(oooOOOOooOoo0, oooO0OO);
        o00o0o2.OooO0OO();
        this.f39213OooO00o = j2 != -9223372036854775807L ? new OooO0O0(oooOOOOooOoo0, true, 0L, j2) : oooOOOOooOoo0;
    }

    public final long OooO00o(o00O000 o00o001, long j, boolean z, boolean[] zArr) {
        RendererCapabilities[] rendererCapabilitiesArr;
        SampleStream[] sampleStreamArr;
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= o00o001.f40402OooO00o) {
                break;
            }
            if (z || !o00o001.OooO00o(this.f39224OooOOO, i)) {
                z2 = false;
            }
            this.f39220OooO0oo[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            rendererCapabilitiesArr = this.f39212OooO;
            int length = rendererCapabilitiesArr.length;
            sampleStreamArr = this.f39215OooO0OO;
            if (i2 >= length) {
                break;
            }
            if (((OooO0o) rendererCapabilitiesArr[i2]).f11044OooO0o0 == -2) {
                sampleStreamArr[i2] = null;
            }
            i2++;
        }
        OooO0O0();
        this.f39224OooOOO = o00o001;
        OooO0OO();
        long jOooOO0O = this.f39213OooO00o.OooOO0O(o00o001.f40404OooO0OO, this.f39220OooO0oo, this.f39215OooO0OO, zArr, j);
        for (int i3 = 0; i3 < rendererCapabilitiesArr.length; i3++) {
            if (((OooO0o) rendererCapabilitiesArr[i3]).f11044OooO0o0 == -2 && this.f39224OooOOO.OooO0O0(i3)) {
                sampleStreamArr[i3] = new o00000OO();
            }
        }
        this.f39218OooO0o0 = false;
        for (int i4 = 0; i4 < sampleStreamArr.length; i4++) {
            if (sampleStreamArr[i4] != null) {
                o00O000o.OooO0Oo(o00o001.OooO0O0(i4));
                if (((OooO0o) rendererCapabilitiesArr[i4]).f11044OooO0o0 != -2) {
                    this.f39218OooO0o0 = true;
                }
            } else {
                o00O000o.OooO0Oo(o00o001.f40404OooO0OO[i4] == null);
            }
        }
        return jOooOO0O;
    }

    public final void OooO0O0() {
        int i = 0;
        if (!(this.f39223OooOO0o == null)) {
            return;
        }
        while (true) {
            o00O000 o00o001 = this.f39224OooOOO;
            if (i >= o00o001.f40402OooO00o) {
                return;
            }
            boolean zOooO0O0 = o00o001.OooO0O0(i);
            com.google.android.exoplayer2.trackselection.OooO0o oooO0o = this.f39224OooOOO.f40404OooO0OO[i];
            if (zOooO0O0 && oooO0o != null) {
                oooO0o.OooO0o();
            }
            i++;
        }
    }

    public final void OooO0OO() {
        int i = 0;
        if (!(this.f39223OooOO0o == null)) {
            return;
        }
        while (true) {
            o00O000 o00o001 = this.f39224OooOOO;
            if (i >= o00o001.f40402OooO00o) {
                return;
            }
            boolean zOooO0O0 = o00o001.OooO0O0(i);
            com.google.android.exoplayer2.trackselection.OooO0o oooO0o = this.f39224OooOOO.f40404OooO0OO[i];
            if (zOooO0O0 && oooO0o != null) {
                oooO0o.OooOO0o();
            }
            i++;
        }
    }

    public final long OooO0Oo() {
        if (!this.f39216OooO0Oo) {
            return this.f39217OooO0o.f39229OooO0O0;
        }
        long jOooOOoo = this.f39218OooO0o0 ? this.f39213OooO00o.OooOOoo() : Long.MIN_VALUE;
        return jOooOOoo == Long.MIN_VALUE ? this.f39217OooO0o.f39233OooO0o0 : jOooOOoo;
    }

    public final void OooO0o() {
        OooO0O0();
        OooOOO oooOOO = this.f39213OooO00o;
        try {
            boolean z = oooOOO instanceof OooO0O0;
            o00O0O o00o0o2 = this.f39222OooOO0O;
            if (z) {
                o00o0o2.OooO0o(((OooO0O0) oooOOO).f12981OooO0Oo);
            } else {
                o00o0o2.OooO0o(oooOOO);
            }
        } catch (RuntimeException e) {
            Log.OooO0Oo("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final long OooO0o0() {
        return this.f39217OooO0o.f39229OooO0O0 + this.f39226OooOOOO;
    }

    public final o00O000 OooO0oO(float f, oo0o0Oo oo0o0oo) throws ExoPlaybackException {
        o00O000 o00o000OooO0o0 = this.f39221OooOO0.OooO0o0(this.f39212OooO, this.f39225OooOOO0, this.f39217OooO0o.f39228OooO00o, oo0o0oo);
        for (com.google.android.exoplayer2.trackselection.OooO0o oooO0o : o00o000OooO0o0.f40404OooO0OO) {
            if (oooO0o != null) {
                oooO0o.OooO0o0(f);
            }
        }
        return o00o000OooO0o0;
    }

    public final void OooO0oo() {
        OooOOO oooOOO = this.f39213OooO00o;
        if (oooOOO instanceof OooO0O0) {
            long j = this.f39217OooO0o.f39231OooO0Oo;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            OooO0O0 oooO0O0 = (OooO0O0) oooOOO;
            oooO0O0.f12985OooO0oo = 0L;
            oooO0O0.f12980OooO = j;
        }
    }
}
