package com.yalla.yalla.ui.view;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.window.SecureFlagPolicy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p587o0oOooOO.v0;

/* JADX INFO: loaded from: classes4.dex */
@Immutable
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f29967OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f29968OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f29969OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f29970OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final v0 f29971OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final SecureFlagPolicy f29972OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final BottomSheetBehaviorProperties f29973OooO0oO;

    public OooO00o() {
        this(false, null, 127);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO00o)) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) obj;
        return this.f29967OooO00o == oooO00o.f29967OooO00o && this.f29968OooO0O0 == oooO00o.f29968OooO0O0 && this.f29969OooO0OO == oooO00o.f29969OooO0OO && this.f29970OooO0Oo == oooO00o.f29970OooO0Oo && this.f29972OooO0o0 == oooO00o.f29972OooO0o0 && Intrinsics.areEqual(this.f29971OooO0o, oooO00o.f29971OooO0o) && Intrinsics.areEqual(this.f29973OooO0oO, oooO00o.f29973OooO0oO);
    }

    public final int hashCode() {
        return this.f29973OooO0oO.hashCode() + ((this.f29971OooO0o.hashCode() + ((this.f29972OooO0o0.hashCode() + ((((((((this.f29967OooO00o ? 1231 : 1237) * 31) + (this.f29968OooO0O0 ? 1231 : 1237)) * 31) + (this.f29969OooO0OO ? 1231 : 1237)) * 31) + (this.f29970OooO0Oo ? 1231 : 1237)) * 31)) * 31)) * 31);
    }

    public OooO00o(boolean z, BottomSheetBehaviorProperties behaviorProperties, int i) {
        boolean z2 = (i & 1) != 0;
        z = (i & 2) != 0 ? true : z;
        SecureFlagPolicy securePolicy = (i & 16) != 0 ? SecureFlagPolicy.Inherit : null;
        v0 navigationBarProperties = (i & 32) != 0 ? new v0(0) : null;
        behaviorProperties = (i & 64) != 0 ? new BottomSheetBehaviorProperties(null, false, 2047) : behaviorProperties;
        Intrinsics.checkNotNullParameter(securePolicy, "securePolicy");
        Intrinsics.checkNotNullParameter(navigationBarProperties, "navigationBarProperties");
        Intrinsics.checkNotNullParameter(behaviorProperties, "behaviorProperties");
        this.f29967OooO00o = z2;
        this.f29968OooO0O0 = z;
        this.f29969OooO0OO = false;
        this.f29970OooO0Oo = false;
        this.f29972OooO0o0 = securePolicy;
        this.f29971OooO0o = navigationBarProperties;
        this.f29973OooO0oO = behaviorProperties;
    }
}
