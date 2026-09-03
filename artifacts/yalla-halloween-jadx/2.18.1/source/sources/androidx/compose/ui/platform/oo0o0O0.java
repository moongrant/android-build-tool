package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.unit.LayoutDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class oo0o0O0 implements o000000.o000000 {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public static final Function2<o000Oo0, Matrix, Unit> f6630OoooOo0 = OooO00o.f6643Oooo0o;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f6631Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final AndroidComposeView f6632Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public Function1<? super p145o00Oo0.o0O0O00, Unit> f6633Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f6634Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public p145o00Oo0.Oooo0 f6635OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f6636OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final o00O0O00 f6637OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f6638OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final o00O00OO<o000Oo0> f6639OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public long f6640OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public final o000Oo0 f6641OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final p145o00Oo0.o000OOo f6642o000oOoO;

    public static final class OooO00o extends Lambda implements Function2<o000Oo0, Matrix, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f6643Oooo0o = new OooO00o();

        public OooO00o() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(o000Oo0 o000oo1, Matrix matrix) {
            o000Oo0 rn = o000oo1;
            Matrix matrix2 = matrix;
            Intrinsics.checkNotNullParameter(rn, "rn");
            Intrinsics.checkNotNullParameter(matrix2, "matrix");
            rn.Oooo0O0(matrix2);
            return Unit.INSTANCE;
        }
    }

    public oo0o0O0(@NotNull AndroidComposeView ownerView, @NotNull Function1<? super p145o00Oo0.o0O0O00, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer) {
        Intrinsics.checkNotNullParameter(ownerView, "ownerView");
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        this.f6632Oooo0o = ownerView;
        this.f6633Oooo0oO = drawBlock;
        this.f6634Oooo0oo = invalidateParentLayer;
        this.f6637OoooO00 = new o00O0O00(ownerView.getDensity());
        this.f6639OoooOO0 = new o00O00OO<>(f6630OoooOo0);
        this.f6642o000oOoO = new p145o00Oo0.o000OOo();
        o00Oo0.o00O00.OooO00o oooO00o = p145o00Oo0.o00O00.f32112OooO0O0;
        this.f6640OoooOOO = p145o00Oo0.o00O00.f32113OooO0OO;
        o000Oo0 o00o0o0o2 = Build.VERSION.SDK_INT >= 29 ? new o00O0O0O(ownerView) : new o00O0O0(ownerView);
        o00o0o0o2.OooOoo();
        this.f6641OoooOOo = o00o0o0o2;
    }

    @Override // o000000.o000000
    public final void OooO(@NotNull p145o00Oo0.o0O0O00 canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Canvas canvas2 = p145o00Oo0.OooOOOO.f32049OooO00o;
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        Canvas canvas3 = ((p145o00Oo0.OooOOO) canvas).f32046OooO00o;
        if (canvas3.isHardwareAccelerated()) {
            OooO0oo();
            boolean z = this.f6641OoooOOo.Oooo0OO() > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f6638OoooO0O = z;
            if (z) {
                canvas.OooOOoo();
            }
            this.f6641OoooOOo.OooOOoo(canvas3);
            if (this.f6638OoooO0O) {
                canvas.OooOO0();
                return;
            }
            return;
        }
        float fOooO0oO = this.f6641OoooOOo.OooO0oO();
        float fOooOO0O = this.f6641OoooOOo.OooOO0O();
        float fOooOOO = this.f6641OoooOOo.OooOOO();
        float fOooO0o0 = this.f6641OoooOOo.OooO0o0();
        if (this.f6641OoooOOo.OooOOOO() < 1.0f) {
            p145o00Oo0.Oooo0 oooo0 = this.f6635OoooO;
            if (oooo0 == null) {
                oooo0 = new p145o00Oo0.Oooo0();
                this.f6635OoooO = oooo0;
            }
            oooo0.OooO0O0(this.f6641OoooOOo.OooOOOO());
            canvas3.saveLayer(fOooO0oO, fOooOO0O, fOooOOO, fOooO0o0, oooo0.f32051OooO00o);
        } else {
            canvas.OooO0oo();
        }
        canvas.OooO0O0(fOooO0oO, fOooOO0O);
        canvas.OooOOO0(this.f6639OoooOO0.OooO0O0(this.f6641OoooOOo));
        if (this.f6641OoooOOo.Oooo00O() || this.f6641OoooOOo.OooOooo()) {
            this.f6637OoooO00.OooO00o(canvas);
        }
        Function1<? super p145o00Oo0.o0O0O00, Unit> function1 = this.f6633Oooo0oO;
        if (function1 != null) {
            function1.invoke(canvas);
        }
        canvas.OooOOo0();
        OooOO0(false);
    }

    @Override // o000000.o000000
    public final void OooO00o(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, @NotNull p145o00Oo0.o000OOo0 shape, boolean z, long j2, long j3, @NotNull LayoutDirection layoutDirection, @NotNull o0000O0O.OooO density) {
        Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        this.f6640OoooOOO = j;
        boolean z2 = false;
        boolean z3 = this.f6641OoooOOo.Oooo00O() && !(this.f6637OoooO00.f6483OooO ^ true);
        this.f6641OoooOOo.OooOO0o(f);
        this.f6641OoooOOo.OooOO0(f2);
        this.f6641OoooOOo.OooO0O0(f3);
        this.f6641OoooOOo.OooOOO0(f4);
        this.f6641OoooOOo.OooO(f5);
        this.f6641OoooOOo.OooOoO0(f6);
        this.f6641OoooOOo.Oooo000(p145o00Oo0.o00000OO.OooO0oO(j2));
        this.f6641OoooOOo.Oooo0(p145o00Oo0.o00000OO.OooO0oO(j3));
        this.f6641OoooOOo.OooO0oo(f9);
        this.f6641OoooOOo.OooOOo0(f7);
        this.f6641OoooOOo.OooO0Oo(f8);
        this.f6641OoooOOo.OooOOOo(f10);
        this.f6641OoooOOo.OooOo00(p145o00Oo0.o00O00.OooO00o(j) * this.f6641OoooOOo.getWidth());
        this.f6641OoooOOo.OooOo(p145o00Oo0.o00O00.OooO0O0(j) * this.f6641OoooOOo.getHeight());
        this.f6641OoooOOo.Oooo00o(z && shape != p145o00Oo0.o000O0Oo.f32099OooO00o);
        this.f6641OoooOOo.OooOo0(z && shape == p145o00Oo0.o000O0Oo.f32099OooO00o);
        this.f6641OoooOOo.OooO0o();
        boolean zOooO0Oo = this.f6637OoooO00.OooO0Oo(shape, this.f6641OoooOOo.OooOOOO(), this.f6641OoooOOo.Oooo00O(), this.f6641OoooOOo.Oooo0OO(), layoutDirection, density);
        this.f6641OoooOOo.OooOoo0(this.f6637OoooO00.OooO0O0());
        if (this.f6641OoooOOo.Oooo00O() && !(!this.f6637OoooO00.f6483OooO)) {
            z2 = true;
        }
        if (z3 != z2 || (z2 && zOooO0Oo)) {
            invalidate();
        } else if (Build.VERSION.SDK_INT >= 26) {
            o0O00O.f6583OooO00o.OooO00o(this.f6632Oooo0o);
        } else {
            this.f6632Oooo0o.invalidate();
        }
        if (!this.f6638OoooO0O && this.f6641OoooOOo.Oooo0OO() > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE && (function0 = this.f6634Oooo0oo) != null) {
            function0.invoke();
        }
        this.f6639OoooOO0.OooO0OO();
    }

    @Override // o000000.o000000
    public final void OooO0O0(@NotNull Function1<? super p145o00Oo0.o0O0O00, Unit> drawBlock, @NotNull Function0<Unit> invalidateParentLayer) {
        Intrinsics.checkNotNullParameter(drawBlock, "drawBlock");
        Intrinsics.checkNotNullParameter(invalidateParentLayer, "invalidateParentLayer");
        OooOO0(false);
        this.f6636OoooO0 = false;
        this.f6638OoooO0O = false;
        o00Oo0.o00O00.OooO00o oooO00o = p145o00Oo0.o00O00.f32112OooO0O0;
        this.f6640OoooOOO = p145o00Oo0.o00O00.f32113OooO0OO;
        this.f6633Oooo0oO = drawBlock;
        this.f6634Oooo0oo = invalidateParentLayer;
    }

    @Override // o000000.o000000
    public final void OooO0OO(@NotNull o00O0O.OooO0o rect, boolean z) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        if (!z) {
            p145o00Oo0.o0000O.OooO0OO(this.f6639OoooOO0.OooO0O0(this.f6641OoooOOo), rect);
            return;
        }
        float[] fArrOooO00o = this.f6639OoooOO0.OooO00o(this.f6641OoooOOo);
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
        if (this.f6641OoooOOo.OooOooo()) {
            return ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE <= fOooO0OO && fOooO0OO < ((float) this.f6641OoooOOo.getWidth()) && ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE <= fOooO0Oo && fOooO0Oo < ((float) this.f6641OoooOOo.getHeight());
        }
        if (this.f6641OoooOOo.Oooo00O()) {
            return this.f6637OoooO00.OooO0OO(j);
        }
        return true;
    }

    @Override // o000000.o000000
    public final void OooO0o(long j) {
        int i = (int) (j >> 32);
        int iOooO0O0 = o0000O0O.o000oOoO.OooO0O0(j);
        float f = i;
        this.f6641OoooOOo.OooOo00(p145o00Oo0.o00O00.OooO00o(this.f6640OoooOOO) * f);
        float f2 = iOooO0O0;
        this.f6641OoooOOo.OooOo(p145o00Oo0.o00O00.OooO0O0(this.f6640OoooOOO) * f2);
        o000Oo0 o000oo1 = this.f6641OoooOOo;
        if (o000oo1.OooOo0O(o000oo1.OooO0oO(), this.f6641OoooOOo.OooOO0O(), this.f6641OoooOOo.OooO0oO() + i, this.f6641OoooOOo.OooOO0O() + iOooO0O0)) {
            o00O0O00 o00o0o01 = this.f6637OoooO00;
            long jOooO00o = o00O0O.OooOo.OooO00o(f, f2);
            if (!o00O0O.OooOo00.OooO00o(o00o0o01.f6487OooO0Oo, jOooO00o)) {
                o00o0o01.f6487OooO0Oo = jOooO00o;
                o00o0o01.f6491OooO0oo = true;
            }
            this.f6641OoooOOo.OooOoo0(this.f6637OoooO00.OooO0O0());
            invalidate();
            this.f6639OoooOO0.OooO0OO();
        }
    }

    @Override // o000000.o000000
    public final long OooO0o0(long j, boolean z) {
        if (!z) {
            return p145o00Oo0.o0000O.OooO0O0(this.f6639OoooOO0.OooO0O0(this.f6641OoooOOo), j);
        }
        float[] fArrOooO00o = this.f6639OoooOO0.OooO00o(this.f6641OoooOOo);
        if (fArrOooO00o != null) {
            return p145o00Oo0.o0000O.OooO0O0(fArrOooO00o, j);
        }
        o00O0O.OooO.OooO00o oooO00o = o00O0O.OooO.f30391OooO0O0;
        return o00O0O.OooO.f30393OooO0Oo;
    }

    @Override // o000000.o000000
    public final void OooO0oO(long j) {
        int iOooO0oO = this.f6641OoooOOo.OooO0oO();
        int iOooOO0O = this.f6641OoooOOo.OooOO0O();
        o0000O0O.OooOo.OooO00o oooO00o = o0000O0O.OooOo.f27310OooO0O0;
        int i = (int) (j >> 32);
        int iOooO0OO = o0000O0O.OooOo.OooO0OO(j);
        if (iOooO0oO == i && iOooOO0O == iOooO0OO) {
            return;
        }
        this.f6641OoooOOo.OooOOo(i - iOooO0oO);
        this.f6641OoooOOo.OooOoO(iOooO0OO - iOooOO0O);
        if (Build.VERSION.SDK_INT >= 26) {
            o0O00O.f6583OooO00o.OooO00o(this.f6632Oooo0o);
        } else {
            this.f6632Oooo0o.invalidate();
        }
        this.f6639OoooOO0.OooO0OO();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // o000000.o000000
    public final void OooO0oo() {
        p145o00Oo0.o000O0o o000o0o2;
        if (this.f6631Oooo || !this.f6641OoooOOo.OooOoOO()) {
            OooOO0(false);
            if (this.f6641OoooOOo.Oooo00O()) {
                o00O0O00 o00o0o01 = this.f6637OoooO00;
                if (!o00o0o01.f6483OooO) {
                    o000o0o2 = null;
                } else {
                    o00o0o01.OooO0o0();
                    o000o0o2 = o00o0o01.f6490OooO0oO;
                }
            } else {
                o000o0o2 = null;
            }
            Function1<? super p145o00Oo0.o0O0O00, Unit> function1 = this.f6633Oooo0oO;
            if (function1 != null) {
                this.f6641OoooOOo.OooOooO(this.f6642o000oOoO, o000o0o2, function1);
            }
        }
    }

    public final void OooOO0(boolean z) {
        if (z != this.f6631Oooo) {
            this.f6631Oooo = z;
            this.f6632Oooo0o.OooOooO(this, z);
        }
    }

    @Override // o000000.o000000
    public final void destroy() {
        if (this.f6641OoooOOo.OooOoOO()) {
            this.f6641OoooOOo.OooOo0o();
        }
        this.f6633Oooo0oO = null;
        this.f6634Oooo0oo = null;
        this.f6636OoooO0 = true;
        OooOO0(false);
        AndroidComposeView androidComposeView = this.f6632Oooo0o;
        androidComposeView.f6218Oooooo = true;
        androidComposeView.Oooo00O(this);
    }

    @Override // o000000.o000000
    public final void invalidate() {
        if (this.f6631Oooo || this.f6636OoooO0) {
            return;
        }
        this.f6632Oooo0o.invalidate();
        OooOO0(true);
    }
}
