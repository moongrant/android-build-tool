package p121o00O0Ooo;

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
public final class o000OO extends Painter {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final boolean f36468OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Painter f36469OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final ContentScale f36470OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Painter f36471OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f36472OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f36473OooO0oo;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f36476OooOO0o;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final MutableState f36474OooOO0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f36475OooOO0O = -1;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final MutableState f36478OooOOO0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(1.0f), null, 2, null);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final MutableState f36477OooOOO = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public o000OO(@Nullable Painter painter, @Nullable Painter painter2, @NotNull ContentScale contentScale, int i, boolean z, boolean z2) {
        this.f36469OooO0Oo = painter;
        this.f36471OooO0o0 = painter2;
        this.f36470OooO0o = contentScale;
        this.f36472OooO0oO = i;
        this.f36473OooO0oo = z;
        this.f36468OooO = z2;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OooO00o(DrawScope drawScope, Painter painter, float f) {
        long jM2882timesUQTWf7w;
        if (painter == null || f <= 0.0f) {
            return;
        }
        long jMo2118getSizeNHjbRc = drawScope.mo2118getSizeNHjbRc();
        long intrinsicSize = painter.getIntrinsicSize();
        Size.Companion companion = Size.INSTANCE;
        if ((intrinsicSize == companion.m1524getUnspecifiedNHjbRc()) || Size.m1518isEmptyimpl(intrinsicSize)) {
            jM2882timesUQTWf7w = jMo2118getSizeNHjbRc;
        } else {
            if ((jMo2118getSizeNHjbRc == companion.m1524getUnspecifiedNHjbRc()) || Size.m1518isEmptyimpl(jMo2118getSizeNHjbRc)) {
                jM2882timesUQTWf7w = jMo2118getSizeNHjbRc;
            } else {
                jM2882timesUQTWf7w = ScaleFactorKt.m2882timesUQTWf7w(intrinsicSize, this.f36470OooO0o.mo2795computeScaleFactorH7hwNQA(intrinsicSize, jMo2118getSizeNHjbRc));
            }
        }
        boolean z = jMo2118getSizeNHjbRc == companion.m1524getUnspecifiedNHjbRc();
        MutableState mutableState = this.f36477OooOOO;
        if (z || Size.m1518isEmptyimpl(jMo2118getSizeNHjbRc)) {
            painter.m2217drawx_KDEd0(drawScope, jM2882timesUQTWf7w, f, (ColorFilter) mutableState.getValue());
            return;
        }
        float f2 = 2;
        float fM1516getWidthimpl = (Size.m1516getWidthimpl(jMo2118getSizeNHjbRc) - Size.m1516getWidthimpl(jM2882timesUQTWf7w)) / f2;
        float fM1513getHeightimpl = (Size.m1513getHeightimpl(jMo2118getSizeNHjbRc) - Size.m1513getHeightimpl(jM2882timesUQTWf7w)) / f2;
        drawScope.getDrawContext().getTransform().inset(fM1516getWidthimpl, fM1513getHeightimpl, fM1516getWidthimpl, fM1513getHeightimpl);
        painter.m2217drawx_KDEd0(drawScope, jM2882timesUQTWf7w, f, (ColorFilter) mutableState.getValue());
        float f3 = -fM1516getWidthimpl;
        float f4 = -fM1513getHeightimpl;
        drawScope.getDrawContext().getTransform().inset(f3, f4, f3, f4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float OooO0O0() {
        return ((Number) this.f36478OooOOO0.getValue()).floatValue();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyAlpha(float f) {
        this.f36478OooOOO0.setValue(Float.valueOf(f));
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        this.f36477OooOOO.setValue(colorFilter);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public final long getIntrinsicSize() {
        Painter painter = this.f36469OooO0Oo;
        long intrinsicSize = painter != null ? painter.getIntrinsicSize() : Size.INSTANCE.m1525getZeroNHjbRc();
        Painter painter2 = this.f36471OooO0o0;
        long intrinsicSize2 = painter2 != null ? painter2.getIntrinsicSize() : Size.INSTANCE.m1525getZeroNHjbRc();
        Size.Companion companion = Size.INSTANCE;
        boolean z = intrinsicSize != companion.m1524getUnspecifiedNHjbRc();
        boolean z2 = intrinsicSize2 != companion.m1524getUnspecifiedNHjbRc();
        if (z && z2) {
            return SizeKt.Size(Math.max(Size.m1516getWidthimpl(intrinsicSize), Size.m1516getWidthimpl(intrinsicSize2)), Math.max(Size.m1513getHeightimpl(intrinsicSize), Size.m1513getHeightimpl(intrinsicSize2)));
        }
        if (this.f36468OooO) {
            if (z) {
                return intrinsicSize;
            }
            if (z2) {
                return intrinsicSize2;
            }
        }
        return companion.m1524getUnspecifiedNHjbRc();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(@NotNull DrawScope drawScope) {
        boolean z = this.f36476OooOO0o;
        Painter painter = this.f36471OooO0o0;
        if (z) {
            OooO00o(drawScope, painter, OooO0O0());
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f36475OooOO0O == -1) {
            this.f36475OooOO0O = jUptimeMillis;
        }
        float f = (jUptimeMillis - this.f36475OooOO0O) / this.f36472OooO0oO;
        float fOooO0O0 = OooO0O0() * RangesKt.coerceIn(f, 0.0f, 1.0f);
        float fOooO0O1 = this.f36473OooO0oo ? OooO0O0() - fOooO0O0 : OooO0O0();
        this.f36476OooOO0o = f >= 1.0f;
        OooO00o(drawScope, this.f36469OooO0Oo, fOooO0O1);
        OooO00o(drawScope, painter, fOooO0O0);
        if (this.f36476OooOO0o) {
            this.f36469OooO0Oo = null;
        } else {
            MutableState mutableState = this.f36474OooOO0;
            mutableState.setValue(Integer.valueOf(((Number) mutableState.getValue()).intValue() + 1));
        }
    }
}
