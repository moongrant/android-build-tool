package p100o000oOoo;

import android.os.SystemClock;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ScaleFactorKt;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Stable
public final class o000 extends Painter {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f35454OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Painter f35455OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final ContentScale f35456OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Painter f35457OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f35458OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f35459OooO0oo;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f35462OooOO0o;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final MutableState f35460OooOO0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f35461OooOO0O = -1;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final MutableState f35464OooOOO0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final MutableState f35463OooOOO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public o000(@Nullable Painter painter, @Nullable Painter painter2, @NotNull ContentScale contentScale, int i, boolean z, boolean z2) {
        this.f35455OooO0Oo = painter;
        this.f35457OooO0o0 = painter2;
        this.f35456OooO0o = contentScale;
        this.f35458OooO0oO = i;
        this.f35459OooO0oo = z;
        this.f35454OooO = z2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO00o(DrawScope drawScope, Painter painter, float f) {
        long jM2872timesUQTWf7w;
        if (painter == null || f <= 0.0f) {
            return;
        }
        long jMo2108getSizeNHjbRc = drawScope.mo2108getSizeNHjbRc();
        long intrinsicSize = painter.getIntrinsicSize();
        Size.Companion companion = Size.INSTANCE;
        if ((intrinsicSize == companion.m1513getUnspecifiedNHjbRc()) || Size.m1507isEmptyimpl(intrinsicSize)) {
            jM2872timesUQTWf7w = jMo2108getSizeNHjbRc;
        } else {
            if ((jMo2108getSizeNHjbRc == companion.m1513getUnspecifiedNHjbRc()) || Size.m1507isEmptyimpl(jMo2108getSizeNHjbRc)) {
                jM2872timesUQTWf7w = jMo2108getSizeNHjbRc;
            } else {
                jM2872timesUQTWf7w = ScaleFactorKt.m2872timesUQTWf7w(intrinsicSize, this.f35456OooO0o.mo2785computeScaleFactorH7hwNQA(intrinsicSize, jMo2108getSizeNHjbRc));
            }
        }
        boolean z = jMo2108getSizeNHjbRc == companion.m1513getUnspecifiedNHjbRc();
        MutableState mutableState = this.f35463OooOOO;
        if (z || Size.m1507isEmptyimpl(jMo2108getSizeNHjbRc)) {
            painter.m2207drawx_KDEd0(drawScope, jM2872timesUQTWf7w, f, (ColorFilter) mutableState.getValue());
            return;
        }
        float f2 = 2;
        float fM1505getWidthimpl = (Size.m1505getWidthimpl(jMo2108getSizeNHjbRc) - Size.m1505getWidthimpl(jM2872timesUQTWf7w)) / f2;
        float fM1502getHeightimpl = (Size.m1502getHeightimpl(jMo2108getSizeNHjbRc) - Size.m1502getHeightimpl(jM2872timesUQTWf7w)) / f2;
        drawScope.getDrawContext().getTransform().inset(fM1505getWidthimpl, fM1502getHeightimpl, fM1505getWidthimpl, fM1502getHeightimpl);
        painter.m2207drawx_KDEd0(drawScope, jM2872timesUQTWf7w, f, (ColorFilter) mutableState.getValue());
        float f3 = -fM1505getWidthimpl;
        float f4 = -fM1502getHeightimpl;
        drawScope.getDrawContext().getTransform().inset(f3, f4, f3, f4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float OooO0O0() {
        return ((Number) this.f35464OooOOO0.getValue()).floatValue();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f) {
        this.f35464OooOOO0.setValue(Float.valueOf(f));
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        this.f35463OooOOO.setValue(colorFilter);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public final long getIntrinsicSize() {
        Painter painter = this.f35455OooO0Oo;
        long intrinsicSize = painter != null ? painter.getIntrinsicSize() : Size.INSTANCE.m1514getZeroNHjbRc();
        Painter painter2 = this.f35457OooO0o0;
        long intrinsicSize2 = painter2 != null ? painter2.getIntrinsicSize() : Size.INSTANCE.m1514getZeroNHjbRc();
        Size.Companion companion = Size.INSTANCE;
        boolean z = intrinsicSize != companion.m1513getUnspecifiedNHjbRc();
        boolean z2 = intrinsicSize2 != companion.m1513getUnspecifiedNHjbRc();
        if (z && z2) {
            return SizeKt.Size(Math.max(Size.m1505getWidthimpl(intrinsicSize), Size.m1505getWidthimpl(intrinsicSize2)), Math.max(Size.m1502getHeightimpl(intrinsicSize), Size.m1502getHeightimpl(intrinsicSize2)));
        }
        if (this.f35454OooO) {
            if (z) {
                return intrinsicSize;
            }
            if (z2) {
                return intrinsicSize2;
            }
        }
        return companion.m1513getUnspecifiedNHjbRc();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(@NotNull DrawScope drawScope) {
        boolean z = this.f35462OooOO0o;
        Painter painter = this.f35457OooO0o0;
        if (z) {
            OooO00o(drawScope, painter, OooO0O0());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f35461OooOO0O == -1) {
            this.f35461OooOO0O = jUptimeMillis;
        }
        float f = (jUptimeMillis - this.f35461OooOO0O) / this.f35458OooO0oO;
        float fOooO0O0 = OooO0O0() * RangesKt.coerceIn(f, 0.0f, 1.0f);
        float fOooO0O1 = this.f35459OooO0oo ? OooO0O0() - fOooO0O0 : OooO0O0();
        this.f35462OooOO0o = f >= 1.0f;
        OooO00o(drawScope, this.f35455OooO0Oo, fOooO0O1);
        OooO00o(drawScope, painter, fOooO0O0);
        if (this.f35462OooOO0o) {
            this.f35455OooO0Oo = null;
        } else {
            MutableState mutableState = this.f35460OooOO0;
            mutableState.setValue(Integer.valueOf(((Number) mutableState.getValue()).intValue() + 1));
        }
    }
}
