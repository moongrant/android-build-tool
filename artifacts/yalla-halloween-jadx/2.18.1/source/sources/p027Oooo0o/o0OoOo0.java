package p027Oooo0o;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooOOO0;
import org.jetbrains.annotations.NotNull;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 implements o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f2006OooO00o = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(new OooOOO0(Float.NaN));

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f2007OooO0O0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(new OooOOO0(Float.NaN));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p027Oooo0o.o000oOoO
    @NotNull
    public final o00OOOO0 OooO00o(@NotNull o00OOOO0 o00oooo1, float f) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        return SizeKt.OooO0oO(o00oooo1, ((OooOOO0) this.f2007OooO0O0.getValue()).f27306Oooo0o * f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p027Oooo0o.o000oOoO
    @NotNull
    public final o00OOOO0 OooO0O0(@NotNull o00OOOO0 o00oooo1, float f) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        return SizeKt.OooOO0o(o00oooo1, ((OooOOO0) this.f2006OooO00o.getValue()).f27306Oooo0o * f);
    }
}
