package p547o0oO0Ooo;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Looper;
import android.provider.Settings;
import android.util.AndroidRuntimeException;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import p057o0000OoO.OooOOOO;
import p057o0000OoO.OooOo;
import p057o0000OoO.OooOo00;
import p274o0O000oo.OooOOO0;
import p547o0oO0Ooo.p4;

/* JADX INFO: loaded from: classes3.dex */
public final class u4<S extends p4> extends x4 {

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final OooO00o f55830OooOo00 = new OooO00o();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public y4<S> f55831OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final OooOo f55832OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f55833OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final OooOo00 f55834OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f55835OooOOoo;

    public class OooO00o extends OooOOOO {
        @Override // p057o0000OoO.OooOOOO
        public final float OooO00o(Object obj) {
            return ((u4) obj).f55833OooOOo * 10000.0f;
        }

        @Override // p057o0000OoO.OooOOOO
        public final void OooO0O0(Object obj, float f) {
            u4 u4Var = (u4) obj;
            u4Var.f55833OooOOo = f / 10000.0f;
            u4Var.invalidateSelf();
        }
    }

    public u4(@NonNull Context context, @NonNull p4 p4Var, @NonNull y4<S> y4Var) {
        super(context, p4Var);
        this.f55835OooOOoo = false;
        this.f55831OooOOOO = y4Var;
        y4Var.f55850OooO0O0 = this;
        OooOo oooOo = new OooOo();
        this.f55832OooOOOo = oooOo;
        oooOo.f33702OooO0O0 = 1.0f;
        oooOo.f33703OooO0OO = false;
        oooOo.f33701OooO00o = Math.sqrt(50.0f);
        oooOo.f33703OooO0OO = false;
        OooOo00 oooOo00 = new OooOo00(this);
        this.f55834OooOOo0 = oooOo00;
        oooOo00.f33710OooOOo = oooOo;
        if (this.f55846OooOO0O != 1.0f) {
            this.f55846OooOO0O = 1.0f;
            invalidateSelf();
        }
    }

    @Override // p547o0oO0Ooo.x4
    public final boolean OooO0o(boolean z, boolean z2, boolean z3) {
        boolean zOooO0o = super.OooO0o(z, z2, z3);
        o4 o4Var = this.f55841OooO0o;
        ContentResolver contentResolver = this.f55840OooO0Oo.getContentResolver();
        o4Var.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.f55835OooOOoo = true;
        } else {
            this.f55835OooOOoo = false;
            float f2 = 50.0f / f;
            OooOo oooOo = this.f55832OooOOOo;
            oooOo.getClass();
            if (f2 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            oooOo.f33701OooO00o = Math.sqrt(f2);
            oooOo.f33703OooO0OO = false;
        }
        return zOooO0o;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            y4<S> y4Var = this.f55831OooOOOO;
            Rect bounds = getBounds();
            float fOooO0O0 = OooO0O0();
            y4Var.f55849OooO00o.OooO00o();
            y4Var.OooO00o(canvas, bounds, fOooO0O0);
            y4<S> y4Var2 = this.f55831OooOOOO;
            Paint paint = this.f55847OooOO0o;
            y4Var2.OooO0OO(canvas, paint);
            this.f55831OooOOOO.OooO0O0(canvas, paint, 0.0f, this.f55833OooOOo, OooOOO0.OooO00o(this.f55842OooO0o0.f55807OooO0OO[0], this.f55848OooOOO0));
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f55831OooOOOO.OooO0Oo();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f55831OooOOOO.OooO0o0();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f55834OooOOo0.OooO0OO();
        this.f55833OooOOo = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z = this.f55835OooOOoo;
        OooOo00 oooOo00 = this.f55834OooOOo0;
        if (z) {
            oooOo00.OooO0OO();
            this.f55833OooOOo = i / 10000.0f;
            invalidateSelf();
        } else {
            oooOo00.f33678OooO0O0 = this.f55833OooOOo * 10000.0f;
            oooOo00.f33679OooO0OO = true;
            float f = i;
            if (oooOo00.f33681OooO0o) {
                oooOo00.f33711OooOOoo = f;
            } else {
                if (oooOo00.f33710OooOOo == null) {
                    oooOo00.f33710OooOOo = new OooOo(f);
                }
                OooOo oooOo = oooOo00.f33710OooOOo;
                double d = f;
                oooOo.f33700OooO = d;
                double d2 = (float) d;
                if (d2 > Float.MAX_VALUE) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                }
                float f2 = oooOo00.f33683OooO0oO;
                if (d2 < f2) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                }
                double dAbs = Math.abs(oooOo00.f33676OooO * 0.75f);
                oooOo.f33704OooO0Oo = dAbs;
                oooOo.f33706OooO0o0 = dAbs * 62.5d;
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new AndroidRuntimeException("Animations may only be started on the main thread");
                }
                boolean z2 = oooOo00.f33681OooO0o;
                if (!z2 && !z2) {
                    oooOo00.f33681OooO0o = true;
                    if (!oooOo00.f33679OooO0OO) {
                        oooOo00.f33678OooO0O0 = oooOo00.f33682OooO0o0.OooO00o(oooOo00.f33680OooO0Oo);
                    }
                    float f3 = oooOo00.f33678OooO0O0;
                    if (f3 > Float.MAX_VALUE || f3 < f2) {
                        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                    }
                    ThreadLocal<p057o0000OoO.OooOOO0> threadLocal = p057o0000OoO.OooOOO0.f33689OooO0o;
                    if (threadLocal.get() == null) {
                        threadLocal.set(new p057o0000OoO.OooOOO0());
                    }
                    p057o0000OoO.OooOOO0 oooOOO0 = threadLocal.get();
                    ArrayList<o0000OoO.OooOOO0.OooO0O0> arrayList = oooOOO0.f33691OooO0O0;
                    if (arrayList.size() == 0) {
                        if (oooOOO0.f33693OooO0Oo == null) {
                            oooOOO0.f33693OooO0Oo = new o0000OoO.OooOOO0.OooO0o(oooOOO0.f33692OooO0OO);
                        }
                        o0000OoO.OooOOO0.OooO0o oooO0o = oooOOO0.f33693OooO0Oo;
                        oooO0o.f33697OooO0O0.postFrameCallback(oooO0o.f33698OooO0OO);
                    }
                    if (!arrayList.contains(oooOo00)) {
                        arrayList.add(oooOo00);
                    }
                }
            }
        }
        return true;
    }
}
