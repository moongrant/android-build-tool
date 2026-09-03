package p282o0O00o;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o0000O0O.OooO;
import org.jetbrains.annotations.NotNull;
import p028Oooo0o0.o0OoO00O;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes2.dex */
@Stable
public final class OooOOO0 implements o0OoO00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f35205OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooOO0 f35206OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO f35207OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f35208OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f35209OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f35210OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f35211OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f35212OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f35213OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f35214OooOO0;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OooOOO0(@NotNull OooOO0 insets, @NotNull OooO density) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f35206OooO00o = insets;
        this.f35207OooO0O0 = density;
        Boolean bool = Boolean.FALSE;
        this.f35208OooO0OO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(bool);
        this.f35209OooO0Oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(bool);
        this.f35211OooO0o0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(bool);
        this.f35210OooO0o = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(bool);
        float f = 0;
        this.f35212OooO0oO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(new o0000O0O.OooOOO0(f));
        this.f35213OooO0oo = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(new o0000O0O.OooOOO0(f));
        this.f35205OooO = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(new o0000O0O.OooOOO0(f));
        this.f35214OooOO0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(new o0000O0O.OooOOO0(f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p028Oooo0o0.o0OoO00O
    public final float OooO00o() {
        return ((o0000O0O.OooOOO0) this.f35214OooOO0.getValue()).f27326Oooo + (((Boolean) this.f35210OooO0o.getValue()).booleanValue() ? this.f35207OooO0O0.OooO0o0(this.f35206OooO00o.OooO0o0()) : 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0063 A[PHI: r3
      0x0063: PHI (r3v7 float) = (r3v6 float), (r3v14 float) binds: [B:12:0x0054, B:7:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p028Oooo0o0.o0OoO00O
    public final float OooO0O0(@NotNull LayoutDirection layoutDirection) {
        float f;
        float fOooO0o0;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int i = OooO00o.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i == 1) {
            f = ((o0000O0O.OooOOO0) this.f35212OooO0oO.getValue()).f27326Oooo;
            if (((Boolean) this.f35208OooO0OO.getValue()).booleanValue()) {
                fOooO0o0 = this.f35207OooO0O0.OooO0o0(this.f35206OooO00o.OooO0oO());
            } else {
                fOooO0o0 = 0;
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = ((o0000O0O.OooOOO0) this.f35205OooO.getValue()).f27326Oooo;
            if (((Boolean) this.f35211OooO0o0.getValue()).booleanValue()) {
                fOooO0o0 = this.f35207OooO0O0.OooO0o0(this.f35206OooO00o.OooO0oO());
            } else {
                fOooO0o0 = 0;
            }
        }
        return f + fOooO0o0;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0063 A[PHI: r3
      0x0063: PHI (r3v7 float) = (r3v6 float), (r3v14 float) binds: [B:12:0x0054, B:7:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p028Oooo0o0.o0OoO00O
    public final float OooO0OO(@NotNull LayoutDirection layoutDirection) {
        float f;
        float fOooO0o0;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        int i = OooO00o.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        if (i == 1) {
            f = ((o0000O0O.OooOOO0) this.f35205OooO.getValue()).f27326Oooo;
            if (((Boolean) this.f35211OooO0o0.getValue()).booleanValue()) {
                fOooO0o0 = this.f35207OooO0O0.OooO0o0(this.f35206OooO00o.OooOOO());
            } else {
                fOooO0o0 = 0;
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = ((o0000O0O.OooOOO0) this.f35212OooO0oO.getValue()).f27326Oooo;
            if (((Boolean) this.f35208OooO0OO.getValue()).booleanValue()) {
                fOooO0o0 = this.f35207OooO0O0.OooO0o0(this.f35206OooO00o.OooOOO());
            } else {
                fOooO0o0 = 0;
            }
        }
        return f + fOooO0o0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p028Oooo0o0.o0OoO00O
    public final float OooO0Oo() {
        return ((o0000O0O.OooOOO0) this.f35213OooO0oo.getValue()).f27326Oooo + (((Boolean) this.f35209OooO0Oo.getValue()).booleanValue() ? this.f35207OooO0O0.OooO0o0(this.f35206OooO00o.OooOO0O()) : 0);
    }
}
