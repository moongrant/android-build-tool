package p281o0O00o;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import org.jetbrains.annotations.NotNull;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO implements OooOO0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f35180OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f35181OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f35182OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f35183OooO0o0;

    public OooOOO(int i, int i2, int i3, int i4) {
        this.f35180OooO0OO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Integer.valueOf(i));
        this.f35181OooO0Oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Integer.valueOf(i2));
        this.f35183OooO0o0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Integer.valueOf(i3));
        this.f35182OooO0o = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(Integer.valueOf(i4));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p281o0O00o.OooOO0
    public final int OooO0o0() {
        return ((Number) this.f35182OooO0o.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p281o0O00o.OooOO0
    public final int OooO0oO() {
        return ((Number) this.f35180OooO0OO.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p281o0O00o.OooOO0
    public final int OooOO0O() {
        return ((Number) this.f35181OooO0Oo.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p281o0O00o.OooOO0
    public final int OooOOO() {
        return ((Number) this.f35183OooO0o0.getValue()).intValue();
    }
}
