package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.annotation.RequiresApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class o00O0O0 implements o000Oo0 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static boolean f6476OooO0oO = true;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final RenderNode f6477OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f6478OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f6479OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f6480OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f6481OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f6482OooO0o0;

    public o00O0O0(@NotNull AndroidComposeView ownerView) {
        Intrinsics.checkNotNullParameter(ownerView, "ownerView");
        RenderNode renderNodeCreate = RenderNode.create("Compose", ownerView);
        Intrinsics.checkNotNullExpressionValue(renderNodeCreate, "create(\"Compose\", ownerView)");
        this.f6477OooO00o = renderNodeCreate;
        if (f6476OooO0oO) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                oo0oOO0 oo0ooo0 = oo0oOO0.f6646OooO00o;
                oo0ooo0.OooO0OO(renderNodeCreate, oo0ooo0.OooO00o(renderNodeCreate));
                oo0ooo0.OooO0Oo(renderNodeCreate, oo0ooo0.OooO0O0(renderNodeCreate));
            }
            OooO00o();
            f6476OooO0oO = false;
        }
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooO(float f) {
        this.f6477OooO00o.setTranslationY(f);
    }

    public final void OooO00o() {
        if (Build.VERSION.SDK_INT >= 24) {
            o00O0OOO.f6503OooO00o.OooO00o(this.f6477OooO00o);
        } else {
            o00O0OO.f6501OooO00o.OooO00o(this.f6477OooO00o);
        }
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooO0O0(float f) {
        this.f6477OooO00o.setAlpha(f);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooO0Oo(float f) {
        this.f6477OooO00o.setRotationY(f);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooO0o() {
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final int OooO0o0() {
        return this.f6482OooO0o0;
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final int OooO0oO() {
        return this.f6478OooO0O0;
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooO0oo(float f) {
        this.f6477OooO00o.setRotation(f);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOO0(float f) {
        this.f6477OooO00o.setScaleY(f);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final int OooOO0O() {
        return this.f6479OooO0OO;
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOO0o(float f) {
        this.f6477OooO00o.setScaleX(f);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final int OooOOO() {
        return this.f6480OooO0Oo;
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOOO0(float f) {
        this.f6477OooO00o.setTranslationX(f);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final float OooOOOO() {
        return this.f6477OooO00o.getAlpha();
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOOOo(float f) {
        this.f6477OooO00o.setCameraDistance(-f);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOOo(int i) {
        this.f6478OooO0O0 += i;
        this.f6480OooO0Oo += i;
        this.f6477OooO00o.offsetLeftAndRight(i);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOOo0(float f) {
        this.f6477OooO00o.setRotationX(f);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOOoo(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f6477OooO00o);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOo(float f) {
        this.f6477OooO00o.setPivotY(f);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOo0(boolean z) {
        this.f6481OooO0o = z;
        this.f6477OooO00o.setClipToBounds(z);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOo00(float f) {
        this.f6477OooO00o.setPivotX(f);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final boolean OooOo0O(int i, int i2, int i3, int i4) {
        this.f6478OooO0O0 = i;
        this.f6479OooO0OO = i2;
        this.f6480OooO0Oo = i3;
        this.f6482OooO0o0 = i4;
        return this.f6477OooO00o.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOo0o() {
        OooO00o();
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOoO(int i) {
        this.f6479OooO0OO += i;
        this.f6482OooO0o0 += i;
        this.f6477OooO00o.offsetTopAndBottom(i);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOoO0(float f) {
        this.f6477OooO00o.setElevation(f);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final boolean OooOoOO() {
        return this.f6477OooO00o.isValid();
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final boolean OooOoo() {
        return this.f6477OooO00o.setHasOverlappingRendering(true);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOoo0(@Nullable Outline outline) {
        this.f6477OooO00o.setOutline(outline);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void OooOooO(@NotNull p145o00Oo0.o000OOo canvasHolder, @Nullable p145o00Oo0.o000O0o o000o0o2, @NotNull Function1<? super p145o00Oo0.o0O0O00, Unit> drawBlock) {
        Intrinsics.checkNotNullParameter(canvasHolder, "canvasHolder");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Canvas canvasStart = this.f6477OooO00o.start(this.f6480OooO0Oo - this.f6478OooO0O0, this.f6482OooO0o0 - this.f6479OooO0OO);
        Intrinsics.checkNotNullExpressionValue(canvasStart, "renderNode.start(width, height)");
        p145o00Oo0.OooOOO oooOOO = canvasHolder.f32110OooO00o;
        Canvas canvas = oooOOO.f32046OooO00o;
        oooOOO.OooOo0O(canvasStart);
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
        this.f6477OooO00o.end(canvasStart);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final boolean OooOooo() {
        return this.f6481OooO0o;
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void Oooo0(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            oo0oOO0.f6646OooO00o.OooO0Oo(this.f6477OooO00o, i);
        }
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void Oooo000(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            oo0oOO0.f6646OooO00o.OooO0OO(this.f6477OooO00o, i);
        }
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final boolean Oooo00O() {
        return this.f6477OooO00o.getClipToOutline();
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void Oooo00o(boolean z) {
        this.f6477OooO00o.setClipToOutline(z);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final void Oooo0O0(@NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        this.f6477OooO00o.getMatrix(matrix);
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final float Oooo0OO() {
        return this.f6477OooO00o.getElevation();
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final int getHeight() {
        return this.f6482OooO0o0 - this.f6479OooO0OO;
    }

    @Override // androidx.compose.ui.platform.o000Oo0
    public final int getWidth() {
        return this.f6480OooO0Oo - this.f6478OooO0O0;
    }
}
