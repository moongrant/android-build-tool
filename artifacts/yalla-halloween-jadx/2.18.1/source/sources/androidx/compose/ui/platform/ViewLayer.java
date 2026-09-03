package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002()R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR$\u0010'\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\"8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, d2 = {"Landroidx/compose/ui/platform/ViewLayer;", "Landroid/view/View;", "Lo000000/o000000;", "", "Landroidx/compose/ui/platform/AndroidComposeView;", "Oooo0o", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/DrawChildContainer;", "Oooo0oO", "Landroidx/compose/ui/platform/DrawChildContainer;", "getContainer", "()Landroidx/compose/ui/platform/DrawChildContainer;", "container", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "OoooO", "Z", "isInvalidated", "()Z", "setInvalidated", "(Z)V", "Lo00Oo0/o000O0o;", "getManualClipPath", "()Lo00Oo0/o000O0o;", "manualClipPath", "", "getLayerId", "()J", "layerId", "getOwnerViewId", "ownerViewId", "", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "cameraDistancePx", "OooO0OO", "OooO0o", "ui_release"}, k = 1, mv = {1, 6, 0})
public final class ViewLayer extends View implements o000000.o000000 {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f6305OoooOo0 = new OooO0OO();

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public static final Function2<View, Matrix, Unit> f6306OoooOoO = OooO0O0.f6324Oooo0o;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f6307OoooOoo = new OooO00o();

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @Nullable
    public static Method f6308Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public static Field f6309Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static boolean f6310OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public static boolean f6311OooooOO;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f6312Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AndroidComposeView ownerView;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DrawChildContainer container;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Function1<? super p145o00Oo0.o0O0O00, Unit> f6315Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name and from kotlin metadata */
    public boolean isInvalidated;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f6317OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final o00O0O00 f6318OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public Rect f6319OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f6320OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public final o00O00OO<View> f6321OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public long f6322OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final p145o00Oo0.o000OOo f6323o000oOoO;

    public static final class OooO00o extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(@NotNull View view, @NotNull Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            Outline outlineOooO0O0 = ((ViewLayer) view).f6318OoooO00.OooO0O0();
            Intrinsics.checkNotNull(outlineOooO0O0);
            outline.set(outlineOooO0O0);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<View, Matrix, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f6324Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(View view, Matrix matrix) {
            View view2 = view;
            Matrix matrix2 = matrix;
            Intrinsics.checkNotNullParameter(view2, "view");
            Intrinsics.checkNotNullParameter(matrix2, "matrix");
            matrix2.set(view2.getMatrix());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO {
        @SuppressLint({"BanUncheckedReflection"})
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            try {
                if (!ViewLayer.f6310OooooO0) {
                    ViewLayer.f6310OooooO0 = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.f6308Ooooo00 = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.f6309Ooooo0o = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.f6308Ooooo00 = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.f6309Ooooo0o = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.f6308Ooooo00;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.f6309Ooooo0o;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.f6309Ooooo0o;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.f6308Ooooo00;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                ViewLayer.f6311OooooOO = true;
            }
        }
    }

    @RequiresApi(29)
    public static final class OooO0o {
        @JvmStatic
        @DoNotInline
        public static final long OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            return view.getUniqueDrawingId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewLayer(@NotNull AndroidComposeView ownerView, @NotNull DrawChildContainer container, @NotNull Function1<? super p145o00Oo0.o0O0O00, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer) {
        super(ownerView.getContext());
        Intrinsics.checkNotNullParameter(ownerView, "ownerView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        this.ownerView = ownerView;
        this.container = container;
        this.f6315Oooo0oo = drawBlock;
        this.f6312Oooo = invalidateParentLayer;
        this.f6318OoooO00 = new o00O0O00(ownerView.getDensity());
        this.f6323o000oOoO = new p145o00Oo0.o000OOo();
        this.f6321OoooOOO = new o00O00OO<>(f6306OoooOoO);
        o00Oo0.o00O00.OooO00o oooO00o = p145o00Oo0.o00O00.f32112OooO0O0;
        this.f6322OoooOOo = p145o00Oo0.o00O00.f32113OooO0OO;
        setWillNotDraw(false);
        setId(View.generateViewId());
        container.addView(this);
    }

    private final p145o00Oo0.o000O0o getManualClipPath() {
        if (getClipToOutline()) {
            o00O0O00 o00o0o01 = this.f6318OoooO00;
            if (!(!o00o0o01.f6483OooO)) {
                o00o0o01.OooO0o0();
                return o00o0o01.f6490OooO0oO;
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z) {
        if (z != this.isInvalidated) {
            this.isInvalidated = z;
            this.ownerView.OooOooO(this, z);
        }
    }

    @Override // o000000.o000000
    public final void OooO(@NotNull p145o00Oo0.o0O0O00 canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean z = getElevation() > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f6320OoooOO0 = z;
        if (z) {
            canvas.OooOOoo();
        }
        this.container.OooO00o(canvas, this, getDrawingTime());
        if (this.f6320OoooOO0) {
            canvas.OooOO0();
        }
    }

    @Override // o000000.o000000
    public final void OooO00o(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, @NotNull p145o00Oo0.o000OOo0 shape, boolean z, long j2, long j3, @NotNull LayoutDirection layoutDirection, @NotNull o0000O0O.OooO density) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f6322OoooOOo = j;
        setScaleX(f);
        setScaleY(f2);
        setAlpha(f3);
        setTranslationX(f4);
        setTranslationY(f5);
        setElevation(f6);
        setRotation(f9);
        setRotationX(f7);
        setRotationY(f8);
        setPivotX(p145o00Oo0.o00O00.OooO00o(this.f6322OoooOOo) * getWidth());
        setPivotY(p145o00Oo0.o00O00.OooO0O0(this.f6322OoooOOo) * getHeight());
        setCameraDistancePx(f10);
        this.f6317OoooO0 = z && shape == p145o00Oo0.o000O0Oo.f32099OooO00o;
        OooOO0();
        boolean z2 = getManualClipPath() != null;
        setClipToOutline(z && shape != p145o00Oo0.o000O0Oo.f32099OooO00o);
        boolean zOooO0Oo = this.f6318OoooO00.OooO0Oo(shape, getAlpha(), getClipToOutline(), getElevation(), layoutDirection, density);
        setOutlineProvider(this.f6318OoooO00.OooO0O0() != null ? f6307OoooOoo : null);
        boolean z3 = getManualClipPath() != null;
        if (z2 != z3 || (z3 && zOooO0Oo)) {
            invalidate();
        }
        if (!this.f6320OoooOO0 && getElevation() > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && (function0 = this.f6312Oooo) != null) {
            function0.invoke();
        }
        this.f6321OoooOOO.OooO0OO();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            o00Oo00 o00oo00 = o00Oo00.f6514OooO00o;
            o00oo00.OooO00o(this, p145o00Oo0.o00000OO.OooO0oO(j2));
            o00oo00.OooO0O0(this, p145o00Oo0.o00000OO.OooO0oO(j3));
        }
        if (i >= 31) {
            o0oOO.f6625OooO00o.OooO00o(this, null);
        }
    }

    @Override // o000000.o000000
    public final void OooO0O0(@NotNull Function1<? super p145o00Oo0.o0O0O00, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer) {
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        if (Build.VERSION.SDK_INT >= 23 || f6311OooooOO) {
            this.container.addView(this);
        } else {
            setVisibility(0);
        }
        this.f6317OoooO0 = false;
        this.f6320OoooOO0 = false;
        o00Oo0.o00O00.OooO00o oooO00o = p145o00Oo0.o00O00.f32112OooO0O0;
        this.f6322OoooOOo = p145o00Oo0.o00O00.f32113OooO0OO;
        this.f6315Oooo0oo = drawBlock;
        this.f6312Oooo = invalidateParentLayer;
    }

    @Override // o000000.o000000
    public final void OooO0OO(@NotNull o00O0O.OooO0o rect, boolean z) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        if (!z) {
            p145o00Oo0.o0000O.OooO0OO(this.f6321OoooOOO.OooO0O0(this), rect);
            return;
        }
        float[] fArrOooO00o = this.f6321OoooOOO.OooO00o(this);
        if (fArrOooO00o != null) {
            p145o00Oo0.o0000O.OooO0OO(fArrOooO00o, rect);
            return;
        }
        rect.f30398OooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        rect.f30399OooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        rect.f30400OooO0OO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        rect.f30401OooO0Oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
    }

    @Override // o000000.o000000
    public final boolean OooO0Oo(long j) {
        float fOooO0OO = o00O0O.OooO.OooO0OO(j);
        float fOooO0Oo = o00O0O.OooO.OooO0Oo(j);
        if (this.f6317OoooO0) {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE <= fOooO0OO && fOooO0OO < ((float) getWidth()) && ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE <= fOooO0Oo && fOooO0Oo < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f6318OoooO00.OooO0OO(j);
        }
        return true;
    }

    @Override // o000000.o000000
    public final void OooO0o(long j) {
        int i = (int) (j >> 32);
        int iOooO0O0 = o0000O0O.o000oOoO.OooO0O0(j);
        if (i == getWidth() && iOooO0O0 == getHeight()) {
            return;
        }
        float f = i;
        setPivotX(p145o00Oo0.o00O00.OooO00o(this.f6322OoooOOo) * f);
        float f2 = iOooO0O0;
        setPivotY(p145o00Oo0.o00O00.OooO0O0(this.f6322OoooOOo) * f2);
        o00O0O00 o00o0o01 = this.f6318OoooO00;
        long jOooO00o = o00O0O.OooOo.OooO00o(f, f2);
        if (!o00O0O.OooOo00.OooO00o(o00o0o01.f6487OooO0Oo, jOooO00o)) {
            o00o0o01.f6487OooO0Oo = jOooO00o;
            o00o0o01.f6491OooO0oo = true;
        }
        setOutlineProvider(this.f6318OoooO00.OooO0O0() != null ? f6307OoooOoo : null);
        layout(getLeft(), getTop(), getLeft() + i, getTop() + iOooO0O0);
        OooOO0();
        this.f6321OoooOOO.OooO0OO();
    }

    @Override // o000000.o000000
    public final long OooO0o0(long j, boolean z) {
        if (!z) {
            return p145o00Oo0.o0000O.OooO0O0(this.f6321OoooOOO.OooO0O0(this), j);
        }
        float[] fArrOooO00o = this.f6321OoooOOO.OooO00o(this);
        if (fArrOooO00o != null) {
            return p145o00Oo0.o0000O.OooO0O0(fArrOooO00o, j);
        }
        o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
        return o00O0O.OooO.f30393OooO0Oo;
    }

    @Override // o000000.o000000
    public final void OooO0oO(long j) {
        o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27310OooO0O0;
        int i = (int) (j >> 32);
        if (i != getLeft()) {
            offsetLeftAndRight(i - getLeft());
            this.f6321OoooOOO.OooO0OO();
        }
        int iOooO0OO = o0000O0O.OooOo.OooO0OO(j);
        if (iOooO0OO != getTop()) {
            offsetTopAndBottom(iOooO0OO - getTop());
            this.f6321OoooOOO.OooO0OO();
        }
    }

    @Override // o000000.o000000
    public final void OooO0oo() {
        if (!this.isInvalidated || f6311OooooOO) {
            return;
        }
        setInvalidated(false);
        f6305OoooOo0.OooO00o(this);
    }

    public final void OooOO0() {
        Rect rect;
        if (this.f6317OoooO0) {
            Rect rect2 = this.f6319OoooO0O;
            if (rect2 == null) {
                this.f6319OoooO0O = new Rect(0, 0, getWidth(), getHeight());
            } else {
                Intrinsics.checkNotNull(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f6319OoooO0O;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // o000000.o000000
    public final void destroy() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.ownerView;
        androidComposeView.f6218Oooooo = true;
        this.f6315Oooo0oo = null;
        this.f6312Oooo = null;
        boolean zOooo00O = androidComposeView.Oooo00O(this);
        if (Build.VERSION.SDK_INT >= 23 || f6311OooooOO || !zOooo00O) {
            this.container.removeViewInLayout(this);
        } else {
            setVisibility(8);
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean z = false;
        setInvalidated(false);
        p145o00Oo0.o000OOo o000ooo2 = this.f6323o000oOoO;
        p145o00Oo0.OooOOO oooOOO = o000ooo2.f32110OooO00o;
        Canvas canvas2 = oooOOO.f32046OooO00o;
        Objects.requireNonNull(oooOOO);
        Intrinsics.checkNotNullParameter(canvas, "<set-?>");
        oooOOO.f32046OooO00o = canvas;
        p145o00Oo0.OooOOO oooOOO2 = o000ooo2.f32110OooO00o;
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            z = true;
            oooOOO2.OooO0oo();
            this.f6318OoooO00.OooO00o(oooOOO2);
        }
        Function1<? super p145o00Oo0.o0O0O00, Unit> function1 = this.f6315Oooo0oo;
        if (function1 != null) {
            function1.invoke(oooOOO2);
        }
        if (z) {
            oooOOO2.OooOOo0();
        }
        o000ooo2.f32110OooO00o.OooOo0O(canvas2);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    @NotNull
    public final DrawChildContainer getContainer() {
        return this.container;
    }

    public long getLayerId() {
        return getId();
    }

    @NotNull
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return OooO0o.OooO00o(this.ownerView);
        }
        return -1L;
    }

    @Override // android.view.View, o000000.o000000
    public final void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * getResources().getDisplayMetrics().densityDpi);
    }
}
