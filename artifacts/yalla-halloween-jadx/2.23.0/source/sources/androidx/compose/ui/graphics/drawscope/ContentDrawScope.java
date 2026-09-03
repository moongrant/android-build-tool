package androidx.compose.ui.graphics.drawscope;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawContent", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ContentDrawScope extends DrawScope {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* JADX INFO: renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m2123drawImageAZ2fEMs(@NotNull ContentDrawScope contentDrawScope, @NotNull ImageBitmap image, long j, long j2, long j3, long j4, float f, @NotNull DrawStyle style, @Nullable ColorFilter colorFilter, int i, int i2) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(style, "style");
            OooO0O0.OooO00o(contentDrawScope, image, j, j2, j3, j4, f, style, colorFilter, i, i2);
        }

        @Deprecated
        /* JADX INFO: renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m2124getCenterF1C5BW0(@NotNull ContentDrawScope contentDrawScope) {
            return OooO0O0.OooO0O0(contentDrawScope);
        }

        @Deprecated
        /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m2125getSizeNHjbRc(@NotNull ContentDrawScope contentDrawScope) {
            return OooO0O0.OooO0OO(contentDrawScope);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m2126roundToPxR2X_6o(@NotNull ContentDrawScope contentDrawScope, long j) {
            return androidx.compose.ui.unit.OooO00o.OooO00o(contentDrawScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m2127roundToPx0680j_4(@NotNull ContentDrawScope contentDrawScope, float f) {
            return androidx.compose.ui.unit.OooO00o.OooO0O0(contentDrawScope, f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m2128toDpGaN1DYA(@NotNull ContentDrawScope contentDrawScope, long j) {
            return androidx.compose.ui.unit.OooO00o.OooO0OO(contentDrawScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2129toDpu2uoSUM(@NotNull ContentDrawScope contentDrawScope, float f) {
            return androidx.compose.ui.unit.OooO00o.OooO0Oo(contentDrawScope, f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m2131toDpSizekrfVVM(@NotNull ContentDrawScope contentDrawScope, long j) {
            return androidx.compose.ui.unit.OooO00o.OooO0o(contentDrawScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m2132toPxR2X_6o(@NotNull ContentDrawScope contentDrawScope, long j) {
            return androidx.compose.ui.unit.OooO00o.OooO0oO(contentDrawScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m2133toPx0680j_4(@NotNull ContentDrawScope contentDrawScope, float f) {
            return androidx.compose.ui.unit.OooO00o.OooO0oo(contentDrawScope, f);
        }

        @Stable
        @Deprecated
        @NotNull
        public static Rect toRect(@NotNull ContentDrawScope contentDrawScope, @NotNull DpRect receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return androidx.compose.ui.unit.OooO00o.OooO(contentDrawScope, receiver);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m2134toSizeXkaWNTQ(@NotNull ContentDrawScope contentDrawScope, long j) {
            return androidx.compose.ui.unit.OooO00o.OooOO0(contentDrawScope, j);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m2135toSp0xMU5do(@NotNull ContentDrawScope contentDrawScope, float f) {
            return androidx.compose.ui.unit.OooO00o.OooOO0O(contentDrawScope, f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2136toSpkPz2Gy4(@NotNull ContentDrawScope contentDrawScope, float f) {
            return androidx.compose.ui.unit.OooO00o.OooOO0o(contentDrawScope, f);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m2130toDpu2uoSUM(@NotNull ContentDrawScope contentDrawScope, int i) {
            return androidx.compose.ui.unit.OooO00o.OooO0o0(contentDrawScope, i);
        }

        @Stable
        @Deprecated
        /* JADX INFO: renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m2137toSpkPz2Gy4(@NotNull ContentDrawScope contentDrawScope, int i) {
            return androidx.compose.ui.unit.OooO00o.OooOOO0(contentDrawScope, i);
        }
    }

    void drawContent();
}
