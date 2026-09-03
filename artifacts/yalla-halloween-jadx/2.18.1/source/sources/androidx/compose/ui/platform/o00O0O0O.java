package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.annotation.RequiresApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(29)
public final class o00O0O0O implements o000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final RenderNode f6500OooO00o;

    public o00O0O0O(@NotNull AndroidComposeView ownerView) {
        Intrinsics.checkNotNullParameter(ownerView, "ownerView");
        this.f6500OooO00o = new RenderNode("Compose");
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooO(float f) {
        this.f6500OooO00o.setTranslationY(f);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooO0O0(float f) {
        this.f6500OooO00o.setAlpha(f);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooO0Oo(float f) {
        this.f6500OooO00o.setRotationY(f);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooO0o() {
        if (Build.VERSION.SDK_INT >= 31) {
            o00O0OO0.f6502OooO00o.OooO00o(this.f6500OooO00o, null);
        }
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final int OooO0o0() {
        return this.f6500OooO00o.getBottom();
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final int OooO0oO() {
        return this.f6500OooO00o.getLeft();
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooO0oo(float f) {
        this.f6500OooO00o.setRotationZ(f);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOO0(float f) {
        this.f6500OooO00o.setScaleY(f);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final int OooOO0O() {
        return this.f6500OooO00o.getTop();
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOO0o(float f) {
        this.f6500OooO00o.setScaleX(f);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final int OooOOO() {
        return this.f6500OooO00o.getRight();
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOOO0(float f) {
        this.f6500OooO00o.setTranslationX(f);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final float OooOOOO() {
        return this.f6500OooO00o.getAlpha();
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOOOo(float f) {
        this.f6500OooO00o.setCameraDistance(f);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOOo(int i) {
        this.f6500OooO00o.offsetLeftAndRight(i);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOOo0(float f) {
        this.f6500OooO00o.setRotationX(f);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOOoo(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawRenderNode(this.f6500OooO00o);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOo(float f) {
        this.f6500OooO00o.setPivotY(f);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOo0(boolean z) {
        this.f6500OooO00o.setClipToBounds(z);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOo00(float f) {
        this.f6500OooO00o.setPivotX(f);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final boolean OooOo0O(int i, int i2, int i3, int i4) {
        return this.f6500OooO00o.setPosition(i, i2, i3, i4);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOo0o() {
        this.f6500OooO00o.discardDisplayList();
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOoO(int i) {
        this.f6500OooO00o.offsetTopAndBottom(i);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOoO0(float f) {
        this.f6500OooO00o.setElevation(f);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final boolean OooOoOO() {
        return this.f6500OooO00o.hasDisplayList();
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final boolean OooOoo() {
        return this.f6500OooO00o.setHasOverlappingRendering(true);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOoo0(@Nullable Outline outline) {
        this.f6500OooO00o.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOooO(@NotNull p145o00Oo0.o000OOo canvasHolder, @Nullable p145o00Oo0.o000O0o o000o0o2, @NotNull Function1<? super p145o00Oo0.o0O0O00, Unit> drawBlock) {
        Intrinsics.checkNotNullParameter(canvasHolder, "canvasHolder");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        RecordingCanvas recordingCanvasBeginRecording = this.f6500OooO00o.beginRecording();
        Intrinsics.checkNotNullExpressionValue(recordingCanvasBeginRecording, "renderNode.beginRecording()");
        p145o00Oo0.OooOOO oooOOO = canvasHolder.f32110OooO00o;
        Canvas canvas = oooOOO.f32046OooO00o;
        oooOOO.OooOo0O(recordingCanvasBeginRecording);
        p145o00Oo0.OooOOO oooOOO2 = canvasHolder.f32110OooO00o;
        if (o000o0o2 != null) {
            oooOOO2.OooO0oo();
            oooOOO2.OooO0OO(o000o0o2, 1);
        }
        drawBlock.invoke(oooOOO2);
        if (o000o0o2 != null) {
            oooOOO2.OooOOo0();
        }
        canvasHolder.f32110OooO00o.OooOo0O(canvas);
        this.f6500OooO00o.endRecording();
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final boolean OooOooo() {
        return this.f6500OooO00o.getClipToBounds();
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void Oooo0(int i) {
        this.f6500OooO00o.setSpotShadowColor(i);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void Oooo000(int i) {
        this.f6500OooO00o.setAmbientShadowColor(i);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final boolean Oooo00O() {
        return this.f6500OooO00o.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void Oooo00o(boolean z) {
        this.f6500OooO00o.setClipToOutline(z);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void Oooo0O0(@NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f6500OooO00o.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final float Oooo0OO() {
        return this.f6500OooO00o.getElevation();
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final int getHeight() {
        return this.f6500OooO00o.getHeight();
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final int getWidth() {
        return this.f6500OooO00o.getWidth();
    }
}
