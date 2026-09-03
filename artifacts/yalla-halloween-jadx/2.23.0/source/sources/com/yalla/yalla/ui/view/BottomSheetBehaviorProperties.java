package com.yalla.yalla.ui.view;

import androidx.compose.animation.Oooo0;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Immutable
public final class BottomSheetBehaviorProperties {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f30352OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final State f30353OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f30354OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f30355OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f30356OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f30357OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f30358OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f30359OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f30360OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f30361OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final boolean f30362OooOO0O;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/view/BottomSheetBehaviorProperties$State;", "", "Expanded", "HalfExpanded", "Collapsed", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
    @Immutable
    public enum State {
        Expanded,
        HalfExpanded,
        Collapsed
    }

    public BottomSheetBehaviorProperties(State state, boolean z, int i) {
        state = (i & 1) != 0 ? State.Collapsed : state;
        int i2 = (i & 2) != 0 ? -1 : 0;
        int i3 = (i & 4) != 0 ? -1 : 0;
        boolean z2 = (i & 8) != 0;
        float f = (i & 32) != 0 ? 0.5f : 0.0f;
        boolean z3 = (i & 64) != 0;
        int i4 = (i & 128) == 0 ? 0 : -1;
        boolean z4 = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0;
        z = (i & ConstantsKt.MINIMUM_BLOCK_SIZE) != 0 ? false : z;
        Intrinsics.checkNotNullParameter(state, "state");
        this.f30353OooO00o = state;
        this.f30354OooO0O0 = i2;
        this.f30355OooO0OO = i3;
        this.f30356OooO0Oo = z2;
        this.f30358OooO0o0 = 0;
        this.f30357OooO0o = f;
        this.f30359OooO0oO = z3;
        this.f30360OooO0oo = i4;
        this.f30352OooO = z4;
        this.f30361OooOO0 = z;
        this.f30362OooOO0O = false;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomSheetBehaviorProperties)) {
            return false;
        }
        BottomSheetBehaviorProperties bottomSheetBehaviorProperties = (BottomSheetBehaviorProperties) obj;
        if (this.f30353OooO00o != bottomSheetBehaviorProperties.f30353OooO00o) {
            return false;
        }
        if (!(this.f30354OooO0O0 == bottomSheetBehaviorProperties.f30354OooO0O0)) {
            return false;
        }
        if (!(this.f30355OooO0OO == bottomSheetBehaviorProperties.f30355OooO0OO) || this.f30356OooO0Oo != bottomSheetBehaviorProperties.f30356OooO0Oo || this.f30358OooO0o0 != bottomSheetBehaviorProperties.f30358OooO0o0) {
            return false;
        }
        if ((this.f30357OooO0o == bottomSheetBehaviorProperties.f30357OooO0o) && this.f30359OooO0oO == bottomSheetBehaviorProperties.f30359OooO0oO) {
            return (this.f30360OooO0oo == bottomSheetBehaviorProperties.f30360OooO0oo) && this.f30352OooO == bottomSheetBehaviorProperties.f30352OooO && this.f30361OooOO0 == bottomSheetBehaviorProperties.f30361OooOO0 && this.f30362OooOO0O == bottomSheetBehaviorProperties.f30362OooOO0O;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Oooo0.OooO00o(this.f30357OooO0o, ((((((((this.f30353OooO00o.hashCode() * 31) + this.f30354OooO0O0) * 31) + this.f30355OooO0OO) * 31) + (this.f30356OooO0Oo ? 1231 : 1237)) * 31) + this.f30358OooO0o0) * 31, 31) + (this.f30359OooO0oO ? 1231 : 1237)) * 31) + this.f30360OooO0oo) * 31) + (this.f30352OooO ? 1231 : 1237)) * 31) + (this.f30361OooOO0 ? 1231 : 1237)) * 31) + (this.f30362OooOO0O ? 1231 : 1237);
    }
}
