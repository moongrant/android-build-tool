package p023Oooo00O;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o000O<S> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f1056OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f1057OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f1058OooO0OO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Boolean.FALSE);

    public o000O(S s) {
        this.f1056OooO00o = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(s);
        this.f1057OooO0O0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(s);
    }

    public final void OooO00o(boolean z) {
        this.f1058OooO0OO.setValue(Boolean.valueOf(z));
    }

    public final void OooO0O0(S s) {
        this.f1057OooO0O0.setValue(s);
    }
}
