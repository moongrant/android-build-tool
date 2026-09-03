package androidx.compose.ui.platform;

import android.graphics.Rect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooO0o extends androidx.compose.ui.platform.OooO00o {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public static OooO0o f6292OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f6293OooO0o0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final ResolvedTextDirection f6294OooO0oO = ResolvedTextDirection.Rtl;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final ResolvedTextDirection f6295OooO0oo = ResolvedTextDirection.Ltr;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public o00000O.o0OOO0o f6296OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00000O0.o00O0O f6297OooO0Oo;

    public static final class OooO00o {
    }

    public OooO0o() {
        new Rect();
    }

    @Override // androidx.compose.ui.platform.OooOO0
    @Nullable
    public final int[] OooO00o(int i) {
        int iOooO0oo;
        o00000O.o0OOO0o o0ooo0o2 = null;
        if (OooO0Oo().length() <= 0 || i >= OooO0Oo().length()) {
            return null;
        }
        try {
            o00000O0.o00O0O o00o0o2 = this.f6297OooO0Oo;
            if (o00o0o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("node");
                o00o0o2 = null;
            }
            o00O0O.OooOO0O oooOO0OOooO0Oo = o00o0o2.OooO0Oo();
            int iRoundToInt = MathKt.roundToInt(oooOO0OOooO0Oo.f30407OooO0Oo - oooOO0OOooO0Oo.f30405OooO0O0);
            int iCoerceAtLeast = RangesKt.coerceAtLeast(0, i);
            o00000O.o0OOO0o o0ooo0o3 = this.f6296OooO0OO;
            if (o0ooo0o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                o0ooo0o3 = null;
            }
            int iOooO0oO = o0ooo0o3.OooO0oO(iCoerceAtLeast);
            o00000O.o0OOO0o o0ooo0o4 = this.f6296OooO0OO;
            if (o0ooo0o4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                o0ooo0o4 = null;
            }
            float fOooOO0o = o0ooo0o4.OooOO0o(iOooO0oO) + iRoundToInt;
            o00000O.o0OOO0o o0ooo0o5 = this.f6296OooO0OO;
            if (o0ooo0o5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                o0ooo0o5 = null;
            }
            o00000O.o0OOO0o o0ooo0o6 = this.f6296OooO0OO;
            if (o0ooo0o6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                o0ooo0o6 = null;
            }
            if (fOooOO0o < o0ooo0o5.OooOO0o(o0ooo0o6.f26878OooO0O0.f26777OooO0o - 1)) {
                o00000O.o0OOO0o o0ooo0o7 = this.f6296OooO0OO;
                if (o0ooo0o7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                } else {
                    o0ooo0o2 = o0ooo0o7;
                }
                iOooO0oo = o0ooo0o2.OooO0oo(fOooOO0o);
            } else {
                o00000O.o0OOO0o o0ooo0o8 = this.f6296OooO0OO;
                if (o0ooo0o8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                } else {
                    o0ooo0o2 = o0ooo0o8;
                }
                iOooO0oo = o0ooo0o2.f26878OooO0O0.f26777OooO0o;
            }
            return OooO0OO(iCoerceAtLeast, OooO0o(iOooO0oo - 1, f6295OooO0oo) + 1);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // androidx.compose.ui.platform.OooOO0
    @Nullable
    public final int[] OooO0O0(int i) {
        int iOooO0oo;
        o00000O.o0OOO0o o0ooo0o2 = null;
        if (OooO0Oo().length() <= 0 || i <= 0) {
            return null;
        }
        try {
            o00000O0.o00O0O o00o0o2 = this.f6297OooO0Oo;
            if (o00o0o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("node");
                o00o0o2 = null;
            }
            o00O0O.OooOO0O oooOO0OOooO0Oo = o00o0o2.OooO0Oo();
            int iRoundToInt = MathKt.roundToInt(oooOO0OOooO0Oo.f30407OooO0Oo - oooOO0OOooO0Oo.f30405OooO0O0);
            int iCoerceAtMost = RangesKt.coerceAtMost(OooO0Oo().length(), i);
            o00000O.o0OOO0o o0ooo0o3 = this.f6296OooO0OO;
            if (o0ooo0o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                o0ooo0o3 = null;
            }
            int iOooO0oO = o0ooo0o3.OooO0oO(iCoerceAtMost);
            o00000O.o0OOO0o o0ooo0o4 = this.f6296OooO0OO;
            if (o0ooo0o4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                o0ooo0o4 = null;
            }
            float fOooOO0o = o0ooo0o4.OooOO0o(iOooO0oO) - iRoundToInt;
            if (fOooOO0o > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                o00000O.o0OOO0o o0ooo0o5 = this.f6296OooO0OO;
                if (o0ooo0o5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
                } else {
                    o0ooo0o2 = o0ooo0o5;
                }
                iOooO0oo = o0ooo0o2.OooO0oo(fOooOO0o);
            } else {
                iOooO0oo = 0;
            }
            if (iCoerceAtMost == OooO0Oo().length() && iOooO0oo < iOooO0oO) {
                iOooO0oo++;
            }
            return OooO0OO(OooO0o(iOooO0oo, f6294OooO0oO), iCoerceAtMost);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final int OooO0o(int i, ResolvedTextDirection resolvedTextDirection) {
        o00000O.o0OOO0o o0ooo0o2 = this.f6296OooO0OO;
        o00000O.o0OOO0o o0ooo0o3 = null;
        if (o0ooo0o2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            o0ooo0o2 = null;
        }
        int iOooOO0O = o0ooo0o2.OooOO0O(i);
        o00000O.o0OOO0o o0ooo0o4 = this.f6296OooO0OO;
        if (o0ooo0o4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            o0ooo0o4 = null;
        }
        if (resolvedTextDirection != o0ooo0o4.OooOOO(iOooOO0O)) {
            o00000O.o0OOO0o o0ooo0o5 = this.f6296OooO0OO;
            if (o0ooo0o5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
            } else {
                o0ooo0o3 = o0ooo0o5;
            }
            return o0ooo0o3.OooOO0O(i);
        }
        o00000O.o0OOO0o o0ooo0o6 = this.f6296OooO0OO;
        if (o0ooo0o6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutResult");
        } else {
            o0ooo0o3 = o0ooo0o6;
        }
        return o0ooo0o3.OooO0o(i, false) - 1;
    }
}
