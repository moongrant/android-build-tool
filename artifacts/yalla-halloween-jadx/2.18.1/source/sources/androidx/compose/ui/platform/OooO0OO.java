package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooO0OO extends androidx.compose.ui.platform.OooO00o {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public static OooO0OO f6289OooO0o0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o00000O.o0OOO0o f6291OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f6287OooO0Oo = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final ResolvedTextDirection f6288OooO0o = ResolvedTextDirection.Rtl;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final ResolvedTextDirection f6290OooO0oO = ResolvedTextDirection.Ltr;

    public static final class OooO00o {
    }

    public OooO0OO(DefaultConstructorMarker defaultConstructorMarker) {
    }

    @Override // androidx.compose.ui.platform.OooOO0
    @Nullable
    public final int[] OooO00o(int i) {
        int iOooO0oO;
        if (OooO0Oo().length() <= 0 || i >= OooO0Oo().length()) {
            return null;
        }
        if (i < 0) {
            o00000O.o0OOO0o o0ooo0o2 = this.f6291OooO0OO;
            if (o0ooo0o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                o0ooo0o2 = null;
            }
            iOooO0oO = o0ooo0o2.OooO0oO(0);
        } else {
            o00000O.o0OOO0o o0ooo0o3 = this.f6291OooO0OO;
            if (o0ooo0o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                o0ooo0o3 = null;
            }
            int iOooO0oO2 = o0ooo0o3.OooO0oO(i);
            iOooO0oO = OooO0o(iOooO0oO2, f6288OooO0o) == i ? iOooO0oO2 : iOooO0oO2 + 1;
        }
        o00000O.o0OOO0o o0ooo0o4 = this.f6291OooO0OO;
        if (o0ooo0o4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            o0ooo0o4 = null;
        }
        if (iOooO0oO >= o0ooo0o4.f26878OooO0O0.f26777OooO0o) {
            return null;
        }
        return OooO0OO(OooO0o(iOooO0oO, f6288OooO0o), OooO0o(iOooO0oO, f6290OooO0oO) + 1);
    }

    @Override // androidx.compose.ui.platform.OooOO0
    @Nullable
    public final int[] OooO0O0(int i) {
        int iOooO0oO;
        if (OooO0Oo().length() <= 0 || i <= 0) {
            return null;
        }
        if (i > OooO0Oo().length()) {
            o00000O.o0OOO0o o0ooo0o2 = this.f6291OooO0OO;
            if (o0ooo0o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                o0ooo0o2 = null;
            }
            iOooO0oO = o0ooo0o2.OooO0oO(OooO0Oo().length());
        } else {
            o00000O.o0OOO0o o0ooo0o3 = this.f6291OooO0OO;
            if (o0ooo0o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                o0ooo0o3 = null;
            }
            int iOooO0oO2 = o0ooo0o3.OooO0oO(i);
            iOooO0oO = OooO0o(iOooO0oO2, f6290OooO0oO) + 1 == i ? iOooO0oO2 : iOooO0oO2 - 1;
        }
        if (iOooO0oO < 0) {
            return null;
        }
        return OooO0OO(OooO0o(iOooO0oO, f6288OooO0o), OooO0o(iOooO0oO, f6290OooO0oO) + 1);
    }

    public final int OooO0o(int i, ResolvedTextDirection resolvedTextDirection) {
        o00000O.o0OOO0o o0ooo0o2 = this.f6291OooO0OO;
        o00000O.o0OOO0o o0ooo0o3 = null;
        if (o0ooo0o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            o0ooo0o2 = null;
        }
        int iOooOO0O = o0ooo0o2.OooOO0O(i);
        o00000O.o0OOO0o o0ooo0o4 = this.f6291OooO0OO;
        if (o0ooo0o4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            o0ooo0o4 = null;
        }
        if (resolvedTextDirection != o0ooo0o4.OooOOO(iOooOO0O)) {
            o00000O.o0OOO0o o0ooo0o5 = this.f6291OooO0OO;
            if (o0ooo0o5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            } else {
                o0ooo0o3 = o0ooo0o5;
            }
            return o0ooo0o3.OooOO0O(i);
        }
        o00000O.o0OOO0o o0ooo0o6 = this.f6291OooO0OO;
        if (o0ooo0o6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
        } else {
            o0ooo0o3 = o0ooo0o6;
        }
        return o0ooo0o3.OooO0o(i, false) - 1;
    }
}
