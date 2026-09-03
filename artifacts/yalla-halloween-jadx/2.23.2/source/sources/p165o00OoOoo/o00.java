package p165o00OoOoo;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import o00O00OO.OooO0OO;
import p174o00OooOo.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00 extends Drawable implements o00O000.OooO0O0, Animatable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f38156OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f38157OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f38158OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f38159OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f38160OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f38161OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f38162OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f38163OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Paint f38164OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ArrayList f38165OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Rect f38166OooOOO0;

    public static final class OooO00o extends Drawable.ConstantState {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @VisibleForTesting
        public final o00O000 f38167OooO00o;

        public OooO00o(o00O000 o00o001) {
            this.f38167OooO00o = o00o001;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return new o00(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable(Resources resources) {
            return new o00(this);
        }
    }

    public o00() {
        throw null;
    }

    public o00(OooO00o oooO00o) {
        this.f38161OooO0oo = true;
        this.f38162OooOO0 = -1;
        o00OO00O.OooO0O0(oooO00o);
        this.f38157OooO0Oo = oooO00o;
    }

    @Override // o00OoOoo.o00O000.OooO0O0
    public final void OooO00o() {
        Object callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        o00O000 o00o001 = this.f38157OooO0Oo.f38167OooO00o;
        o00O000.OooO00o oooO00o = o00o001.f38180OooO;
        if ((oooO00o != null ? oooO00o.f38199OooO0oo : -1) == o00o001.f38181OooO00o.OooO0OO() - 1) {
            this.f38156OooO++;
        }
        int i = this.f38162OooOO0;
        if (i == -1 || this.f38156OooO < i) {
            return;
        }
        ArrayList arrayList = this.f38165OooOOO;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((OooO0OO) this.f38165OooOOO.get(i2)).OooO00o(this);
            }
        }
        stop();
    }

    public final void OooO0O0() {
        o00OO00O.OooO00o(!this.f38160OooO0oO, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        OooO00o oooO00o = this.f38157OooO0Oo;
        if (oooO00o.f38167OooO00o.f38181OooO00o.OooO0OO() == 1) {
            invalidateSelf();
            return;
        }
        if (this.f38159OooO0o0) {
            return;
        }
        this.f38159OooO0o0 = true;
        o00O000 o00o001 = oooO00o.f38167OooO00o;
        if (o00o001.f38189OooOO0) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = o00o001.f38183OooO0OO;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !o00o001.f38185OooO0o) {
            o00o001.f38185OooO0o = true;
            o00o001.f38189OooOO0 = false;
            o00o001.OooO00o();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        if (this.f38160OooO0oO) {
            return;
        }
        if (this.f38163OooOO0O) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f38166OooOOO0 == null) {
                this.f38166OooOOO0 = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f38166OooOOO0);
            this.f38163OooOO0O = false;
        }
        o00O000 o00o001 = this.f38157OooO0Oo.f38167OooO00o;
        o00O000.OooO00o oooO00o = o00o001.f38180OooO;
        Bitmap bitmap = oooO00o != null ? oooO00o.f38200OooOO0 : o00o001.f38191OooOO0o;
        if (this.f38166OooOOO0 == null) {
            this.f38166OooOOO0 = new Rect();
        }
        Rect rect = this.f38166OooOOO0;
        if (this.f38164OooOO0o == null) {
            this.f38164OooOO0o = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f38164OooOO0o);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f38157OooO0Oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f38157OooO0Oo.f38167OooO00o.f38196OooOOo0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f38157OooO0Oo.f38167OooO00o.f38195OooOOOo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f38159OooO0o0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f38163OooOO0O = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f38164OooOO0o == null) {
            this.f38164OooOO0o = new Paint(2);
        }
        this.f38164OooOO0o.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f38164OooOO0o == null) {
            this.f38164OooOO0o = new Paint(2);
        }
        this.f38164OooOO0o.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        o00OO00O.OooO00o(!this.f38160OooO0oO, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f38161OooO0oo = z;
        if (!z) {
            this.f38159OooO0o0 = false;
            o00O000 o00o001 = this.f38157OooO0Oo.f38167OooO00o;
            ArrayList arrayList = o00o001.f38183OooO0OO;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                o00o001.f38185OooO0o = false;
            }
        } else if (this.f38158OooO0o) {
            OooO0O0();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f38158OooO0o = true;
        this.f38156OooO = 0;
        if (this.f38161OooO0oo) {
            OooO0O0();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f38158OooO0o = false;
        this.f38159OooO0o0 = false;
        o00O000 o00o001 = this.f38157OooO0Oo.f38167OooO00o;
        ArrayList arrayList = o00o001.f38183OooO0OO;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            o00o001.f38185OooO0o = false;
        }
    }
}
