package androidx.compose.ui.platform;

import android.content.res.Configuration;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a5\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0010\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\nH\u0002\u001a!\u0010\u0011\u001a\u00020\u0012*\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"localeLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroid/content/res/Configuration;", "getLocaleLayoutDirection", "(Landroid/content/res/Configuration;)Landroidx/compose/ui/unit/LayoutDirection;", "dot", "", "m1", "Landroidx/compose/ui/graphics/Matrix;", "row", "", "m2", "column", "dot-p89u6pk", "([FI[FI)F", "layoutDirectionFromInt", "layoutDirection", "preTransform", "", "other", "preTransform-JiSxe2E", "([F[F)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidComposeView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n+ 2 Matrix.kt\nandroidx/compose/ui/graphics/Matrix\n*L\n1#1,2051:1\n42#2,2:2052\n42#2,2:2054\n42#2,2:2056\n42#2,2:2058\n42#2,2:2060\n42#2,2:2062\n42#2,2:2064\n42#2,2:2066\n42#2,2:2068\n42#2,2:2070\n42#2,2:2072\n42#2,2:2074\n42#2,2:2076\n42#2,2:2078\n42#2,2:2080\n42#2,2:2082\n39#2:2084\n39#2:2085\n39#2:2086\n39#2:2087\n*S KotlinDebug\n*F\n+ 1 AndroidComposeView.android.kt\nandroidx/compose/ui/platform/AndroidComposeView_androidKt\n*L\n1940#1:2052,2\n1941#1:2054,2\n1942#1:2056,2\n1943#1:2058,2\n1944#1:2060,2\n1945#1:2062,2\n1946#1:2064,2\n1947#1:2066,2\n1948#1:2068,2\n1949#1:2070,2\n1950#1:2072,2\n1951#1:2074,2\n1952#1:2076,2\n1953#1:2078,2\n1954#1:2080,2\n1955#1:2082,2\n1960#1:2084\n1961#1:2085\n1962#1:2086\n1963#1:2087\n*E\n"})
public final class AndroidComposeView_androidKt {
    /* JADX INFO: renamed from: dot-p89u6pk, reason: not valid java name */
    private static final float m3090dotp89u6pk(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3 + 0] * fArr2[0 + i2]);
    }

    @NotNull
    public static final LayoutDirection getLocaleLayoutDirection(@NotNull Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "<this>");
        return layoutDirectionFromInt(configuration.getLayoutDirection());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LayoutDirection layoutDirectionFromInt(int i) {
        if (i != 0) {
            return i != 1 ? LayoutDirection.Ltr : LayoutDirection.Rtl;
        }
        return LayoutDirection.Ltr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: preTransform-JiSxe2E, reason: not valid java name */
    public static final void m3091preTransformJiSxe2E(float[] fArr, float[] fArr2) {
        float fM3090dotp89u6pk = m3090dotp89u6pk(fArr2, 0, fArr, 0);
        float fM3090dotp89u6pk2 = m3090dotp89u6pk(fArr2, 0, fArr, 1);
        float fM3090dotp89u6pk3 = m3090dotp89u6pk(fArr2, 0, fArr, 2);
        float fM3090dotp89u6pk4 = m3090dotp89u6pk(fArr2, 0, fArr, 3);
        float fM3090dotp89u6pk5 = m3090dotp89u6pk(fArr2, 1, fArr, 0);
        float fM3090dotp89u6pk6 = m3090dotp89u6pk(fArr2, 1, fArr, 1);
        float fM3090dotp89u6pk7 = m3090dotp89u6pk(fArr2, 1, fArr, 2);
        float fM3090dotp89u6pk8 = m3090dotp89u6pk(fArr2, 1, fArr, 3);
        float fM3090dotp89u6pk9 = m3090dotp89u6pk(fArr2, 2, fArr, 0);
        float fM3090dotp89u6pk10 = m3090dotp89u6pk(fArr2, 2, fArr, 1);
        float fM3090dotp89u6pk11 = m3090dotp89u6pk(fArr2, 2, fArr, 2);
        float fM3090dotp89u6pk12 = m3090dotp89u6pk(fArr2, 2, fArr, 3);
        float fM3090dotp89u6pk13 = m3090dotp89u6pk(fArr2, 3, fArr, 0);
        float fM3090dotp89u6pk14 = m3090dotp89u6pk(fArr2, 3, fArr, 1);
        float fM3090dotp89u6pk15 = m3090dotp89u6pk(fArr2, 3, fArr, 2);
        float fM3090dotp89u6pk16 = m3090dotp89u6pk(fArr2, 3, fArr, 3);
        fArr[0] = fM3090dotp89u6pk;
        fArr[1] = fM3090dotp89u6pk2;
        fArr[2] = fM3090dotp89u6pk3;
        fArr[3] = fM3090dotp89u6pk4;
        fArr[4] = fM3090dotp89u6pk5;
        fArr[5] = fM3090dotp89u6pk6;
        fArr[6] = fM3090dotp89u6pk7;
        fArr[7] = fM3090dotp89u6pk8;
        fArr[8] = fM3090dotp89u6pk9;
        fArr[9] = fM3090dotp89u6pk10;
        fArr[10] = fM3090dotp89u6pk11;
        fArr[11] = fM3090dotp89u6pk12;
        fArr[12] = fM3090dotp89u6pk13;
        fArr[13] = fM3090dotp89u6pk14;
        fArr[14] = fM3090dotp89u6pk15;
        fArr[15] = fM3090dotp89u6pk16;
    }
}
