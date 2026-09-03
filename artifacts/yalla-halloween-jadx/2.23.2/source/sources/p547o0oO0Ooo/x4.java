package p547o0oO0Ooo;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.progressindicator.BaseProgressIndicator;
import java.util.ArrayList;
import o0O000.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x4 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final OooO00o f55838OooOOO = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public ArrayList f55839OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f55840OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final p4 f55842OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ValueAnimator f55843OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public ValueAnimator f55844OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f55845OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f55846OooOO0O;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f55848OooOOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Paint f55847OooOO0o = new Paint();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o4 f55841OooO0o = new o4();

    public class OooO00o extends Property<x4, Float> {
        public OooO00o() {
            super(Float.class, "growFraction");
        }

        @Override // android.util.Property
        public final Float get(x4 x4Var) {
            return Float.valueOf(x4Var.OooO0O0());
        }

        @Override // android.util.Property
        public final void set(x4 x4Var, Float f) {
            x4 x4Var2 = x4Var;
            float fFloatValue = f.floatValue();
            if (x4Var2.f55846OooOO0O != fFloatValue) {
                x4Var2.f55846OooOO0O = fFloatValue;
                x4Var2.invalidateSelf();
            }
        }
    }

    public x4(@NonNull Context context, @NonNull p4 p4Var) {
        this.f55840OooO0Oo = context;
        this.f55842OooO0o0 = p4Var;
        setAlpha(255);
    }

    public final float OooO0O0() {
        p4 p4Var = this.f55842OooO0o0;
        if (!(p4Var.f55810OooO0o0 != 0)) {
            if (!(p4Var.f55809OooO0o != 0)) {
                return 1.0f;
            }
        }
        return this.f55846OooOO0O;
    }

    public final boolean OooO0OO() {
        ValueAnimator valueAnimator = this.f55844OooO0oo;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final boolean OooO0Oo() {
        ValueAnimator valueAnimator = this.f55843OooO0oO;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public boolean OooO0o(boolean z, boolean z2, boolean z3) {
        ValueAnimator valueAnimator = this.f55843OooO0oO;
        OooO00o oooO00o = f55838OooOOO;
        if (valueAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, oooO00o, 0.0f, 1.0f);
            this.f55843OooO0oO = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f55843OooO0oO.setInterpolator(OooO0O0.f40881OooO0O0);
            ValueAnimator valueAnimator2 = this.f55843OooO0oO;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f55843OooO0oO = valueAnimator2;
            valueAnimator2.addListener(new v4(this));
        }
        if (this.f55844OooO0oo == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, oooO00o, 1.0f, 0.0f);
            this.f55844OooO0oo = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f55844OooO0oo.setInterpolator(OooO0O0.f40881OooO0O0);
            ValueAnimator valueAnimator3 = this.f55844OooO0oo;
            if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f55844OooO0oo = valueAnimator3;
            valueAnimator3.addListener(new w4(this));
        }
        boolean z4 = false;
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator4 = z ? this.f55843OooO0oO : this.f55844OooO0oo;
        ValueAnimator valueAnimator5 = z ? this.f55844OooO0oo : this.f55843OooO0oO;
        if (!z3) {
            if (valueAnimator5.isRunning()) {
                boolean z5 = this.f55845OooOO0;
                this.f55845OooOO0 = true;
                valueAnimator5.cancel();
                this.f55845OooOO0 = z5;
            }
            if (valueAnimator4.isRunning()) {
                valueAnimator4.end();
            } else {
                boolean z6 = this.f55845OooOO0;
                this.f55845OooOO0 = true;
                valueAnimator4.end();
                this.f55845OooOO0 = z6;
            }
            return super.setVisible(z, false);
        }
        if (z3 && valueAnimator4.isRunning()) {
            return false;
        }
        boolean z7 = !z || super.setVisible(z, false);
        p4 p4Var = this.f55842OooO0o0;
        if (!z ? p4Var.f55809OooO0o != 0 : p4Var.f55810OooO0o0 != 0) {
            z4 = true;
        }
        if (z4) {
            if (z2 || !valueAnimator4.isPaused()) {
                valueAnimator4.start();
            } else {
                valueAnimator4.resume();
            }
            return z7;
        }
        boolean z8 = this.f55845OooOO0;
        this.f55845OooOO0 = true;
        valueAnimator4.end();
        this.f55845OooOO0 = z8;
        return z7;
    }

    public final boolean OooO0o0(boolean z, boolean z2, boolean z3) {
        o4 o4Var = this.f55841OooO0o;
        ContentResolver contentResolver = this.f55840OooO0Oo.getContentResolver();
        o4Var.getClass();
        return OooO0o(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public final void OooO0oO(@NonNull BaseProgressIndicator.OooO0o oooO0o) {
        ArrayList arrayList = this.f55839OooO;
        if (arrayList == null || !arrayList.contains(oooO0o)) {
            return;
        }
        this.f55839OooO.remove(oooO0o);
        if (this.f55839OooO.isEmpty()) {
            this.f55839OooO = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f55848OooOOO0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return OooO0Oo() || OooO0OO();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f55848OooOOO0 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f55847OooOO0o.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        return OooO0o0(z, z2, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        OooO0o(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        OooO0o(false, true, false);
    }
}
