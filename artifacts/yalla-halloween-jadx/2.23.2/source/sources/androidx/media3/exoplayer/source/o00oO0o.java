package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.Map;
import o000O.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class o00oO0o extends OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o f8079OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final DataSpec f8080OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final androidx.media3.common.OooOO0 f8081OooOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final LoadErrorHandlingPolicy f8083OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o0OOO0o f8084OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final androidx.media3.common.OooOOO0 f8086OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public o000O0O.OooOo f8087OooOOOo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final long f8082OooOO0O = -9223372036854775807L;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final boolean f8085OooOOO0 = true;

    public o00oO0o(androidx.media3.common.OooOOO0.OooOOOO oooOOOO, androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o interfaceC0142OooO00o, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        this.f8079OooO = interfaceC0142OooO00o;
        this.f8083OooOO0o = loadErrorHandlingPolicy;
        androidx.media3.common.OooOOO0.OooO0O0 oooO0O0 = new androidx.media3.common.OooOOO0.OooO0O0();
        oooO0O0.f6520OooO0O0 = Uri.EMPTY;
        String string = oooOOOO.f6602OooO0Oo.toString();
        string.getClass();
        oooO0O0.f6519OooO00o = string;
        oooO0O0.f6526OooO0oo = ImmutableList.OooOO0O(ImmutableList.OooOOOo(oooOOOO));
        oooO0O0.f6527OooOO0 = null;
        androidx.media3.common.OooOOO0 oooOOO0OooO00o = oooO0O0.OooO00o();
        this.f8086OooOOOO = oooOOO0OooO00o;
        androidx.media3.common.OooOO0.OooO00o oooO00o = new androidx.media3.common.OooOO0.OooO00o();
        oooO00o.f6445OooOO0O = (String) com.google.common.base.Oooo000.OooO00o(oooOOOO.f6604OooO0o0, "text/x-unknown");
        oooO00o.f6438OooO0OO = oooOOOO.f6603OooO0o;
        oooO00o.f6439OooO0Oo = oooOOOO.f6605OooO0oO;
        oooO00o.f6441OooO0o0 = oooOOOO.f6606OooO0oo;
        oooO00o.f6437OooO0O0 = oooOOOO.f6601OooO;
        String str = oooOOOO.f6607OooOO0;
        oooO00o.f6436OooO00o = str != null ? str : null;
        this.f8081OooOO0 = new androidx.media3.common.OooOO0(oooO00o);
        Map mapEmptyMap = Collections.emptyMap();
        Uri uri = oooOOOO.f6602OooO0Oo;
        p080o000OoO.o00Oo0.OooO0oO(uri, "The uri must be set.");
        this.f8080OooO0oo = new DataSpec(uri, 0L, 1, null, mapEmptyMap, 0L, -1L, null, 1, null);
        this.f8084OooOOO = new o0OOO0o(-9223372036854775807L, true, false, oooOOO0OooO00o);
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final OooOOO OooO0OO(OooOOOO.OooO0O0 oooO0O0, p074o000OO0o.o00Oo0 o00oo1, long j) {
        return new oo000o(this.f8080OooO0oo, this.f8079OooO, this.f8087OooOOOo, this.f8081OooOO0, this.f8082OooOO0O, this.f8083OooOO0o, new OooOo00.OooO00o(this.f7874OooO0OO.f7959OooO0OO, 0, oooO0O0), this.f8085OooOOO0);
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final androidx.media3.common.OooOOO0 OooO0Oo() {
        return this.f8086OooOOOO;
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final void OooO0oO(OooOOO oooOOO) {
        Loader loader = ((oo000o) oooOOO).f8108OooOO0o;
        Loader.OooO0OO<? extends Loader.OooO0o> oooO0OO = loader.f8256OooO0O0;
        if (oooO0OO != null) {
            oooO0OO.OooO00o(true);
        }
        loader.f8255OooO00o.shutdown();
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final void OooOO0o() {
    }

    @Override // androidx.media3.exoplayer.source.OooO00o
    public final void OooOOo0(@Nullable o000O0O.OooOo oooOo) {
        this.f8087OooOOOo = oooOo;
        OooOOo(this.f8084OooOOO);
    }

    @Override // androidx.media3.exoplayer.source.OooO00o
    public final void OooOOoo() {
    }
}
