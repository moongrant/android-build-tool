package p273o0O00Oo;

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
public abstract class OooOo00 extends Drawable implements Animatable {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final OooO00o f41735OooOOO = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public ArrayList f41736OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Context f41737OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0OO f41739OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ValueAnimator f41740OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public ValueAnimator f41741OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f41742OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f41743OooOO0O;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f41745OooOOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Paint f41744OooOO0o = new Paint();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO0O0 f41738OooO0o = new OooO0O0();

    public class OooO00o extends Property<OooOo00, Float> {
        public OooO00o() {
            super(Float.class, "growFraction");
        }

        @Override // android.util.Property
        public final Float get(OooOo00 oooOo00) {
            return Float.valueOf(oooOo00.OooO0O0());
        }

        @Override // android.util.Property
        public final void set(OooOo00 oooOo00, Float f) {
            OooOo00 oooOo01 = oooOo00;
            float fFloatValue = f.floatValue();
            if (oooOo01.f41743OooOO0O != fFloatValue) {
                oooOo01.f41743OooOO0O = fFloatValue;
                oooOo01.invalidateSelf();
            }
        }
    }

    public OooOo00(@NonNull Context context, @NonNull OooO0OO oooO0OO) {
        this.f41737OooO0Oo = context;
        this.f41739OooO0o0 = oooO0OO;
        setAlpha(255);
    }

    public final float OooO0O0() {
        OooO0OO oooO0OO = this.f41739OooO0o0;
        if (!(oooO0OO.f41706OooO0o0 != 0)) {
            if (!(oooO0OO.f41705OooO0o != 0)) {
                return 1.0f;
            }
        }
        return this.f41743OooOO0O;
    }

    public final boolean OooO0OO() {
        ValueAnimator valueAnimator = this.f41741OooO0oo;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public final boolean OooO0Oo() {
        ValueAnimator valueAnimator = this.f41740OooO0oO;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    public boolean OooO0o(boolean z, boolean z2, boolean z3) {
        ValueAnimator valueAnimator = this.f41740OooO0oO;
        OooO00o oooO00o = f41735OooOOO;
        if (valueAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, oooO00o, 0.0f, 1.0f);
            this.f41740OooO0oO = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f41740OooO0oO.setInterpolator(OooO0O0.f41572OooO0O0);
            ValueAnimator valueAnimator2 = this.f41740OooO0oO;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f41740OooO0oO = valueAnimator2;
            valueAnimator2.addListener(new OooOOO(this));
        }
        if (this.f41741OooO0oo == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, oooO00o, 1.0f, 0.0f);
            this.f41741OooO0oo = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f41741OooO0oo.setInterpolator(OooO0O0.f41572OooO0O0);
            ValueAnimator valueAnimator3 = this.f41741OooO0oo;
            if (valueAnimator3 != null && valueAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.f41741OooO0oo = valueAnimator3;
            valueAnimator3.addListener(new OooOOOO(this));
        }
        boolean z4 = false;
        if (!isVisible() && !z) {
            return false;
        }
        ValueAnimator valueAnimator4 = z ? this.f41740OooO0oO : this.f41741OooO0oo;
        ValueAnimator valueAnimator5 = z ? this.f41741OooO0oo : this.f41740OooO0oO;
        if (!z3) {
            if (valueAnimator5.isRunning()) {
                boolean z5 = this.f41742OooOO0;
                this.f41742OooOO0 = true;
                valueAnimator5.cancel();
                this.f41742OooOO0 = z5;
            }
            if (valueAnimator4.isRunning()) {
                valueAnimator4.end();
            } else {
                boolean z6 = this.f41742OooOO0;
                this.f41742OooOO0 = true;
                valueAnimator4.end();
                this.f41742OooOO0 = z6;
            }
            return super.setVisible(z, false);
        }
        if (z3 && valueAnimator4.isRunning()) {
            return false;
        }
        boolean z7 = !z || super.setVisible(z, false);
        OooO0OO oooO0OO = this.f41739OooO0o0;
        if (!z ? oooO0OO.f41705OooO0o != 0 : oooO0OO.f41706OooO0o0 != 0) {
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
        boolean z8 = this.f41742OooOO0;
        this.f41742OooOO0 = true;
        valueAnimator4.end();
        this.f41742OooOO0 = z8;
        return z7;
    }

    public final boolean OooO0o0(boolean z, boolean z2, boolean z3) {
        OooO0O0 oooO0O0 = this.f41738OooO0o;
        ContentResolver contentResolver = this.f41737OooO0Oo.getContentResolver();
        oooO0O0.getClass();
        return OooO0o(z, z2, z3 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public final void OooO0oO(@NonNull BaseProgressIndicator.OooO0o oooO0o) {
        ArrayList arrayList = this.f41736OooO;
        if (arrayList == null || !arrayList.contains(oooO0o)) {
            return;
        }
        this.f41736OooO.remove(oooO0o);
        if (this.f41736OooO.isEmpty()) {
            this.f41736OooO = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f41745OooOOO0;
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
        this.f41745OooOOO0 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f41744OooOO0o.setColorFilter(colorFilter);
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
