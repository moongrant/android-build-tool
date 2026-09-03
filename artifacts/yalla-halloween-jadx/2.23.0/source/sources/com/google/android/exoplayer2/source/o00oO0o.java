package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.Map;
import p226o00oOo00.o000O0o;
import p244o00oo0Oo.o000OO0O;
import p244o00oo0Oo.o00O0OO0;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00oO0o extends OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o f13340OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final DataSpec f13341OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final com.google.android.exoplayer2.OooOo f13342OooOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final LoadErrorHandlingPolicy f13344OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o000O0o f13345OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final com.google.android.exoplayer2.o000oOoO f13347OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public o00O0OO0 f13348OooOOOo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final long f13343OooOO0O = -9223372036854775807L;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final boolean f13346OooOOO0 = true;

    public o00oO0o(com.google.android.exoplayer2.o000oOoO.OooOOOO oooOOOO, com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o interfaceC0215OooO00o, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        this.f13340OooO = interfaceC0215OooO00o;
        this.f13344OooOO0o = loadErrorHandlingPolicy;
        com.google.android.exoplayer2.o000oOoO.OooO0O0 oooO0O0 = new com.google.android.exoplayer2.o000oOoO.OooO0O0();
        oooO0O0.f12704OooO0O0 = Uri.EMPTY;
        String string = oooOOOO.f12786OooO0Oo.toString();
        string.getClass();
        oooO0O0.f12703OooO00o = string;
        oooO0O0.f12710OooO0oo = ImmutableList.OooOO0O(ImmutableList.OooOOOo(oooOOOO));
        oooO0O0.f12711OooOO0 = null;
        com.google.android.exoplayer2.o000oOoO o000ooooOooO00o = oooO0O0.OooO00o();
        this.f13347OooOOOO = o000ooooOooO00o;
        com.google.android.exoplayer2.OooOo.OooO00o oooO00o = new com.google.android.exoplayer2.OooOo.OooO00o();
        oooO00o.f11244OooOO0O = (String) com.google.common.base.OooOo.OooO00o(oooOOOO.f12788OooO0o0, "text/x-unknown");
        oooO00o.f11237OooO0OO = oooOOOO.f12787OooO0o;
        oooO00o.f11238OooO0Oo = oooOOOO.f12789OooO0oO;
        oooO00o.f11240OooO0o0 = oooOOOO.f12790OooO0oo;
        oooO00o.f11236OooO0O0 = oooOOOO.f12785OooO;
        String str = oooOOOO.f12791OooOO0;
        oooO00o.f11235OooO00o = str != null ? str : null;
        this.f13342OooOO0 = new com.google.android.exoplayer2.OooOo(oooO00o);
        Map mapEmptyMap = Collections.emptyMap();
        Uri uri = oooOOOO.f12786OooO0Oo;
        o00O000o.OooO0o(uri, "The uri must be set.");
        this.f13341OooO0oo = new DataSpec(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 1, null);
        this.f13345OooOOO = new o000O0o(-9223372036854775807L, true, false, o000ooooOooO00o);
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final com.google.android.exoplayer2.o000oOoO OooO0Oo() {
        return this.f13347OooOOOO;
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final void OooO0o0(OooOOO oooOOO) {
        ((oo000o) oooOOO).f13369OooOO0o.OooO0OO(null);
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final OooOOO OooO0oo(OooOOOO.OooO0O0 oooO0O0, o000OO0O o000oo0o2, long j) {
        return new oo000o(this.f13341OooO0oo, this.f13340OooO, this.f13348OooOOOo, this.f13342OooOO0, this.f13343OooOO0O, this.f13344OooOO0o, new OooOo00.OooO00o(this.f12975OooO0OO.f13060OooO0OO, 0, oooO0O0), this.f13346OooOOO0);
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final void OooOO0o() {
    }

    @Override // com.google.android.exoplayer2.source.OooO00o
    public final void OooOOo0(@Nullable o00O0OO0 o00o0oo1) {
        this.f13348OooOOOo = o00o0oo1;
        OooOOo(this.f13345OooOOO);
    }

    @Override // com.google.android.exoplayer2.source.OooO00o
    public final void OooOOoo() {
    }
}
