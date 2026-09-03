package p027Oooo0o;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooOo;
import org.jetbrains.annotations.NotNull;
import p023Oooo00O.Oooo0;
import p023Oooo00O.o00OO0O0;
import p023Oooo00O.o0OO00O;
import p023Oooo00O.o0Oo0oo;
import p023Oooo00O.oo0O;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
public final class oOO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f2010OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Oooo0<OooOo, o0OO00O> f2011OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f2012OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f2013OooO0Oo;

    public oOO00O(long j, int i) {
        this.f2010OooO00o = i;
        OooOo oooOo = new OooOo(j);
        OooOo.OooO00o oooO00o = OooOo.f27310OooO0O0;
        o00OO0O0<Float, o0Oo0oo> o00oo0o1 = oo0O.f1293OooO00o;
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        this.f2011OooO0O0 = new Oooo0<>(oooOo, oo0O.f1299OooO0oO, null);
        this.f2012OooO0OO = j;
        this.f2013OooO0Oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.FALSE);
    }

    public final void OooO00o(boolean z) {
        this.f2013OooO0Oo.setValue(Boolean.valueOf(z));
    }
}
