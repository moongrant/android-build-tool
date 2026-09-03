package p466o0OooO0;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.OooO0o;
import com.google.android.exoplayer2.OooOo00;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.exoplayer2.o000oOoO;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.util.Objects;
import p310o0O0o0oo.o000O0Oo;
import p310o0O0o0oo.o00O00;
import p310o0O0o0oo.o00O00O;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000oo;
import p319o0O0oOo0.o000;
import p319o0O0oOo0.o0000OO0;
import p709oo0oOOo.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final RendererCapabilities[] f40489OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O00 f40490OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f40491OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SampleStream[] f40492OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f40493OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o0000OO0 f40494OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f40495OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f40496OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean[] f40497OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o0000OO0 f40498OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooOo00 f40499OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public o0000O f40500OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public o000 f40501OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public TrackGroupArray f40502OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public long f40503OooOOOO;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.HashSet, java.util.Set<com.google.android.exoplayer2.OooOo00$OooO0OO>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List<o0O0o0oo.o00O00O$OooO00o>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<java.lang.Object, com.google.android.exoplayer2.OooOo00$OooO0OO>] */
    public o0000O(RendererCapabilities[] rendererCapabilitiesArr, long j, o0000OO0 o0000oo1, OooO0OO oooO0OO, OooOo00 oooOo00, o0000OO0 o0000oo2, o000 o000Var) {
        this.f40489OooO = rendererCapabilitiesArr;
        this.f40503OooOOOO = j;
        this.f40498OooOO0 = o0000oo1;
        this.f40499OooOO0O = oooOo00;
        o00O00O.OooO00o oooO00o = o0000oo2.f40509OooO00o;
        this.f40491OooO0O0 = oooO00o.f36330OooO00o;
        this.f40494OooO0o = o0000oo2;
        this.f40502OooOOO0 = TrackGroupArray.f14604Oooo;
        this.f40501OooOOO = o000Var;
        this.f40492OooO0OO = new SampleStream[rendererCapabilitiesArr.length];
        this.f40497OooO0oo = new boolean[rendererCapabilitiesArr.length];
        long j2 = o0000oo2.f40510OooO0O0;
        long j3 = o0000oo2.f40512OooO0Oo;
        Objects.requireNonNull(oooOo00);
        Pair pair = (Pair) oooO00o.f36330OooO00o;
        Object obj = pair.first;
        o00O00O.OooO00o OooO00o2 = oooO00o.OooO00o(pair.second);
        OooOo00.OooO0OO oooO0OO2 = (OooOo00.OooO0OO) oooOo00.f13391OooO0OO.get(obj);
        Objects.requireNonNull(oooO0OO2);
        oooOo00.f13396OooO0oo.add(oooO0OO2);
        OooOo00.OooO0O0 oooO0O0 = oooOo00.f13395OooO0oO.get(oooO0OO2);
        if (oooO0O0 != null) {
            oooO0O0.f13403OooO00o.OooO00o(oooO0O0.f13404OooO0O0);
        }
        oooO0OO2.f13408OooO0OO.add(OooO00o2);
        o00O00 o00o00OooOo0O = oooO0OO2.f13406OooO00o.OooO0Oo(OooO00o2, oooO0OO, j2);
        oooOo00.f13390OooO0O0.put(o00o00OooOo0O, oooO0OO2);
        oooOo00.OooO0Oo();
        if (j3 != -9223372036854775807L && j3 != Long.MIN_VALUE) {
            o00o00OooOo0O = new o000O0Oo(o00o00OooOo0O, j3);
        }
        this.f40490OooO00o = o00o00OooOo0O;
    }

    public final o000 OooO(float f, o000oOoO o000oooo2) throws ExoPlaybackException {
        o0000OO0 o0000oo1 = this.f40498OooOO0;
        RendererCapabilities[] rendererCapabilitiesArr = this.f40489OooO;
        TrackGroupArray trackGroupArray = this.f40502OooOOO0;
        o00O00O.OooO00o oooO00o = this.f40494OooO0o.f40509OooO00o;
        o000 o000VarOooO0O0 = o0000oo1.OooO0O0(rendererCapabilitiesArr, trackGroupArray);
        for (com.google.android.exoplayer2.trackselection.OooO0OO oooO0OO : o000VarOooO0O0.f36753OooO0OO.OooO00o()) {
            if (oooO0OO != null) {
                oooO0OO.OooO0OO();
            }
        }
        return o000VarOooO0O0;
    }

    public final long OooO00o(o000 o000Var, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= o000Var.f36751OooO00o) {
                break;
            }
            boolean[] zArr2 = this.f40497OooO0oo;
            if (z || !o000Var.OooO00o(this.f40501OooOOO, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        SampleStream[] sampleStreamArr = this.f40492OooO0OO;
        int i2 = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr = this.f40489OooO;
            if (i2 >= rendererCapabilitiesArr.length) {
                break;
            }
            if (((OooO0o) rendererCapabilitiesArr[i2]).f13201Oooo0o == 6) {
                sampleStreamArr[i2] = null;
            }
            i2++;
        }
        OooO0O0();
        this.f40501OooOOO = o000Var;
        OooO0OO();
        p319o0O0oOo0.o0000O o0000o2 = o000Var.f36753OooO0OO;
        long jOooO0Oo = this.f40490OooO00o.OooO0Oo(o0000o2.OooO00o(), this.f40497OooO0oo, this.f40492OooO0OO, zArr, j);
        SampleStream[] sampleStreamArr2 = this.f40492OooO0OO;
        int i3 = 0;
        while (true) {
            RendererCapabilities[] rendererCapabilitiesArr2 = this.f40489OooO;
            if (i3 >= rendererCapabilitiesArr2.length) {
                break;
            }
            if (((OooO0o) rendererCapabilitiesArr2[i3]).f13201Oooo0o == 6 && this.f40501OooOOO.OooO0O0(i3)) {
                sampleStreamArr2[i3] = new p023Oooo00O.o000oOoO();
            }
            i3++;
        }
        this.f40495OooO0o0 = false;
        int i4 = 0;
        while (true) {
            SampleStream[] sampleStreamArr3 = this.f40492OooO0OO;
            if (i4 >= sampleStreamArr3.length) {
                return jOooO0Oo;
            }
            if (sampleStreamArr3[i4] != null) {
                o00000O0.OooO0Oo(o000Var.OooO0O0(i4));
                if (((OooO0o) this.f40489OooO[i4]).f13201Oooo0o != 6) {
                    this.f40495OooO0o0 = true;
                }
            } else {
                o00000O0.OooO0Oo(o0000o2.f36756OooO0O0[i4] == null);
            }
            i4++;
        }
    }

    public final void OooO0O0() {
        if (!OooO0oO()) {
            return;
        }
        int i = 0;
        while (true) {
            o000 o000Var = this.f40501OooOOO;
            if (i >= o000Var.f36751OooO00o) {
                return;
            }
            boolean zOooO0O0 = o000Var.OooO0O0(i);
            com.google.android.exoplayer2.trackselection.OooO0OO oooO0OO = this.f40501OooOOO.f36753OooO0OO.f36756OooO0O0[i];
            if (zOooO0O0 && oooO0OO != null) {
                oooO0OO.OooO0o();
            }
            i++;
        }
    }

    public final void OooO0OO() {
        if (!OooO0oO()) {
            return;
        }
        int i = 0;
        while (true) {
            o000 o000Var = this.f40501OooOOO;
            if (i >= o000Var.f36751OooO00o) {
                return;
            }
            boolean zOooO0O0 = o000Var.OooO0O0(i);
            com.google.android.exoplayer2.trackselection.OooO0OO oooO0OO = this.f40501OooOOO.f36753OooO0OO.f36756OooO0O0[i];
            if (zOooO0O0 && oooO0OO != null) {
                oooO0OO.OooO0o0();
            }
            i++;
        }
    }

    public final long OooO0Oo() {
        if (!this.f40493OooO0Oo) {
            return this.f40494OooO0o.f40510OooO0O0;
        }
        long jOooOOo0 = this.f40495OooO0o0 ? this.f40490OooO00o.OooOOo0() : Long.MIN_VALUE;
        return jOooOOo0 == Long.MIN_VALUE ? this.f40494OooO0o.f40514OooO0o0 : jOooOOo0;
    }

    public final boolean OooO0o() {
        return this.f40493OooO0Oo && (!this.f40495OooO0o0 || this.f40490OooO00o.OooOOo0() == Long.MIN_VALUE);
    }

    public final long OooO0o0() {
        return this.f40494OooO0o.f40510OooO0O0 + this.f40503OooOOOO;
    }

    public final boolean OooO0oO() {
        return this.f40500OooOO0o == null;
    }

    public final void OooO0oo() {
        OooO0O0();
        long j = this.f40494OooO0o.f40512OooO0Oo;
        OooOo00 oooOo00 = this.f40499OooOO0O;
        o00O00 o00o01 = this.f40490OooO00o;
        try {
            if (j == -9223372036854775807L || j == Long.MIN_VALUE) {
                oooOo00.OooO0oo(o00o01);
            } else {
                oooOo00.OooO0oo(((o000O0Oo) o00o01).f36285Oooo0o);
            }
        } catch (RuntimeException e) {
            o0000oo.OooO0O0("MediaPeriodHolder", "Period release failed.", e);
        }
    }
}
