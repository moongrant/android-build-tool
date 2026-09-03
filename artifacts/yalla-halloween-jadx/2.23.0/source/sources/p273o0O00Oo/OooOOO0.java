package p273o0O00Oo;

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
import p272o0O000oo.OooOOO;
import p273o0O00Oo.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0<S extends OooO0OO> extends OooOo00 {

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final OooO00o f41726OooOo00 = new OooO00o();

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public OooOo<S> f41727OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final OooOo f41728OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public float f41729OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final OooOo00 f41730OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f41731OooOOoo;

    public class OooO00o extends OooOOOO<OooOOO0> {
        @Override // p057o0000OoO.OooOOOO
        public final float OooO00o(OooOOO0 oooOOO0) {
            return oooOOO0.f41729OooOOo * 10000.0f;
        }

        @Override // p057o0000OoO.OooOOOO
        public final void OooO0O0(OooOOO0 oooOOO0, float f) {
            OooOOO0 oooOOO1 = oooOOO0;
            oooOOO1.f41729OooOOo = f / 10000.0f;
            oooOOO1.invalidateSelf();
        }
    }

    public OooOOO0(@NonNull Context context, @NonNull OooO0OO oooO0OO, @NonNull OooOo<S> oooOo) {
        super(context, oooO0OO);
        this.f41731OooOOoo = false;
        this.f41727OooOOOO = oooOo;
        oooOo.f41734OooO0O0 = this;
        OooOo oooOo2 = new OooOo();
        this.f41728OooOOOo = oooOo2;
        oooOo2.f34215OooO0O0 = 1.0f;
        oooOo2.f34216OooO0OO = false;
        oooOo2.f34214OooO00o = Math.sqrt(50.0f);
        oooOo2.f34216OooO0OO = false;
        OooOo00 oooOo00 = new OooOo00(this);
        this.f41730OooOOo0 = oooOo00;
        oooOo00.f34223OooOOo = oooOo2;
        if (this.f41743OooOO0O != 1.0f) {
            this.f41743OooOO0O = 1.0f;
            invalidateSelf();
        }
    }

    @Override // p273o0O00Oo.OooOo00
    public final boolean OooO0o(boolean z, boolean z2, boolean z3) {
        boolean zOooO0o = super.OooO0o(z, z2, z3);
        OooO0O0 oooO0O0 = this.f41738OooO0o;
        ContentResolver contentResolver = this.f41737OooO0Oo.getContentResolver();
        oooO0O0.getClass();
        float f = Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f);
        if (f == 0.0f) {
            this.f41731OooOOoo = true;
        } else {
            this.f41731OooOOoo = false;
            float f2 = 50.0f / f;
            OooOo oooOo = this.f41728OooOOOo;
            oooOo.getClass();
            if (f2 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            oooOo.f34214OooO00o = Math.sqrt(f2);
            oooOo.f34216OooO0OO = false;
        }
        return zOooO0o;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            OooOo<S> oooOo = this.f41727OooOOOO;
            Rect bounds = getBounds();
            float fOooO0O0 = OooO0O0();
            oooOo.f41733OooO00o.OooO00o();
            oooOo.OooO00o(canvas, bounds, fOooO0O0);
            OooOo<S> oooOo2 = this.f41727OooOOOO;
            Paint paint = this.f41744OooOO0o;
            oooOo2.OooO0OO(canvas, paint);
            this.f41727OooOOOO.OooO0O0(canvas, paint, 0.0f, this.f41729OooOOo, OooOOO.OooO00o(this.f41739OooO0o0.f41703OooO0OO[0], this.f41745OooOOO0));
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f41727OooOOOO.OooO0Oo();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f41727OooOOOO.OooO0o0();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f41730OooOOo0.OooO0OO();
        this.f41729OooOOo = getLevel() / 10000.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z = this.f41731OooOOoo;
        OooOo00 oooOo00 = this.f41730OooOOo0;
        if (z) {
            oooOo00.OooO0OO();
            this.f41729OooOOo = i / 10000.0f;
            invalidateSelf();
        } else {
            oooOo00.f34191OooO0O0 = this.f41729OooOOo * 10000.0f;
            oooOo00.f34192OooO0OO = true;
            float f = i;
            if (oooOo00.f34194OooO0o) {
                oooOo00.f34224OooOOoo = f;
            } else {
                if (oooOo00.f34223OooOOo == null) {
                    oooOo00.f34223OooOOo = new OooOo(f);
                }
                OooOo oooOo = oooOo00.f34223OooOOo;
                double d = f;
                oooOo.f34213OooO = d;
                double d2 = (float) d;
                if (d2 > Float.MAX_VALUE) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                }
                float f2 = oooOo00.f34196OooO0oO;
                if (d2 < f2) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                }
                double dAbs = Math.abs(oooOo00.f34189OooO * 0.75f);
                oooOo.f34217OooO0Oo = dAbs;
                oooOo.f34219OooO0o0 = dAbs * 62.5d;
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new AndroidRuntimeException("Animations may only be started on the main thread");
                }
                boolean z2 = oooOo00.f34194OooO0o;
                if (!z2 && !z2) {
                    oooOo00.f34194OooO0o = true;
                    if (!oooOo00.f34192OooO0OO) {
                        oooOo00.f34191OooO0O0 = oooOo00.f34195OooO0o0.OooO00o(oooOo00.f34193OooO0Oo);
                    }
                    float f3 = oooOo00.f34191OooO0O0;
                    if (f3 > Float.MAX_VALUE || f3 < f2) {
                        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                    }
                    ThreadLocal<p057o0000OoO.OooOOO0> threadLocal = p057o0000OoO.OooOOO0.f34202OooO0o;
                    if (threadLocal.get() == null) {
                        threadLocal.set(new p057o0000OoO.OooOOO0());
                    }
                    p057o0000OoO.OooOOO0 oooOOO0 = threadLocal.get();
                    ArrayList<o0000OoO.OooOOO0.OooO0O0> arrayList = oooOOO0.f34204OooO0O0;
                    if (arrayList.size() == 0) {
                        if (oooOOO0.f34206OooO0Oo == null) {
                            oooOOO0.f34206OooO0Oo = new o0000OoO.OooOOO0.OooO0o(oooOOO0.f34205OooO0OO);
                        }
                        o0000OoO.OooOOO0.OooO0o oooO0o = oooOOO0.f34206OooO0Oo;
                        oooO0o.f34210OooO0O0.postFrameCallback(oooO0o.f34211OooO0OO);
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
