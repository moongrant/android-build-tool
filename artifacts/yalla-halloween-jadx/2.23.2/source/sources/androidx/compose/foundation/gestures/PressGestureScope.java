package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0004ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "awaitRelease", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tryAwaitRelease", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface PressGestureScope extends Density {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m307roundToPxR2X_6o(@NotNull PressGestureScope pressGestureScope, long j) {
            return androidx.compose.ui.unit.OooO00o.OooO00o(pressGestureScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m308roundToPx0680j_4(@NotNull PressGestureScope pressGestureScope, float f) {
            return androidx.compose.ui.unit.OooO00o.OooO0O0(pressGestureScope, f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m309toDpGaN1DYA(@NotNull PressGestureScope pressGestureScope, long j) {
            return androidx.compose.ui.unit.OooO00o.OooO0OO(pressGestureScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m310toDpu2uoSUM(@NotNull PressGestureScope pressGestureScope, float f) {
            return androidx.compose.ui.unit.OooO00o.OooO0Oo(pressGestureScope, f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m312toDpSizekrfVVM(@NotNull PressGestureScope pressGestureScope, long j) {
            return androidx.compose.ui.unit.OooO00o.OooO0o(pressGestureScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m313toPxR2X_6o(@NotNull PressGestureScope pressGestureScope, long j) {
            return androidx.compose.ui.unit.OooO00o.OooO0oO(pressGestureScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m314toPx0680j_4(@NotNull PressGestureScope pressGestureScope, float f) {
            return androidx.compose.ui.unit.OooO00o.OooO0oo(pressGestureScope, f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull PressGestureScope pressGestureScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return androidx.compose.ui.unit.OooO00o.OooO(pressGestureScope, receiver);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m315toSizeXkaWNTQ(@NotNull PressGestureScope pressGestureScope, long j) {
            return androidx.compose.ui.unit.OooO00o.OooOO0(pressGestureScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m316toSp0xMU5do(@NotNull PressGestureScope pressGestureScope, float f) {
            return androidx.compose.ui.unit.OooO00o.OooOO0O(pressGestureScope, f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m317toSpkPz2Gy4(@NotNull PressGestureScope pressGestureScope, float f) {
            return androidx.compose.ui.unit.OooO00o.OooOO0o(pressGestureScope, f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m311toDpu2uoSUM(@NotNull PressGestureScope pressGestureScope, int i) {
            return androidx.compose.ui.unit.OooO00o.OooO0o0(pressGestureScope, i);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m318toSpkPz2Gy4(@NotNull PressGestureScope pressGestureScope, int i) {
            return androidx.compose.ui.unit.OooO00o.OooOOO0(pressGestureScope, i);
        }
    }

    @Nullable
    Object awaitRelease(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object tryAwaitRelease(@NotNull Continuation<? super Boolean> continuation);
}
