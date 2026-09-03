package p131o00OO0o;

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
import p079o000Oo0o.o000OO00;
import p532o0o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO extends Drawable implements OooOOO.OooO0O0, Animatable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f37263OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f37264OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f37265OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f37266OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f37267OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f37268OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f37269OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f37270OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Paint f37271OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public ArrayList f37272OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Rect f37273OooOOO0;

    public static final class OooO00o extends Drawable.ConstantState {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @VisibleForTesting
        public final OooOOO f37274OooO00o;

        public OooO00o(OooOOO oooOOO) {
            this.f37274OooO00o = oooOOO;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return new OooO(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable(Resources resources) {
            return new OooO(this);
        }
    }

    public OooO() {
        throw null;
    }

    public OooO(OooO00o oooO00o) {
        this.f37268OooO0oo = true;
        this.f37269OooOO0 = -1;
        o0000O00.OooO0O0(oooO00o);
        this.f37264OooO0Oo = oooO00o;
    }

    @Override // o00OO0o.OooOOO.OooO0O0
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
        OooOOO oooOOO = this.f37264OooO0Oo.f37274OooO00o;
        OooOOO.OooO00o oooO00o = oooOOO.f37285OooO;
        if ((oooO00o != null ? oooO00o.f37304OooO0oo : -1) == oooOOO.f37286OooO00o.OooO0OO() - 1) {
            this.f37263OooO++;
        }
        int i = this.f37269OooOO0;
        if (i == -1 || this.f37263OooO < i) {
            return;
        }
        ArrayList arrayList = this.f37272OooOOO;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((o000OO00) this.f37272OooOOO.get(i2)).OooO00o(this);
            }
        }
        stop();
    }

    public final void OooO0O0() {
        o0000O00.OooO00o(!this.f37267OooO0oO, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        OooO00o oooO00o = this.f37264OooO0Oo;
        if (oooO00o.f37274OooO00o.f37286OooO00o.OooO0OO() == 1) {
            invalidateSelf();
            return;
        }
        if (this.f37266OooO0o0) {
            return;
        }
        this.f37266OooO0o0 = true;
        OooOOO oooOOO = oooO00o.f37274OooO00o;
        if (oooOOO.f37294OooOO0) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = oooOOO.f37288OooO0OO;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !oooOOO.f37290OooO0o) {
            oooOOO.f37290OooO0o = true;
            oooOOO.f37294OooOO0 = false;
            oooOOO.OooO00o();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        if (this.f37267OooO0oO) {
            return;
        }
        if (this.f37270OooOO0O) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f37273OooOOO0 == null) {
                this.f37273OooOOO0 = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f37273OooOOO0);
            this.f37270OooOO0O = false;
        }
        OooOOO oooOOO = this.f37264OooO0Oo.f37274OooO00o;
        OooOOO.OooO00o oooO00o = oooOOO.f37285OooO;
        Bitmap bitmap = oooO00o != null ? oooO00o.f37305OooOO0 : oooOOO.f37296OooOO0o;
        if (this.f37273OooOOO0 == null) {
            this.f37273OooOOO0 = new Rect();
        }
        Rect rect = this.f37273OooOOO0;
        if (this.f37271OooOO0o == null) {
            this.f37271OooOO0o = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f37271OooOO0o);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f37264OooO0Oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f37264OooO0Oo.f37274OooO00o.f37301OooOOo0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f37264OooO0Oo.f37274OooO00o.f37300OooOOOo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f37266OooO0o0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f37270OooOO0O = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f37271OooOO0o == null) {
            this.f37271OooOO0o = new Paint(2);
        }
        this.f37271OooOO0o.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f37271OooOO0o == null) {
            this.f37271OooOO0o = new Paint(2);
        }
        this.f37271OooOO0o.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        o0000O00.OooO00o(!this.f37267OooO0oO, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f37268OooO0oo = z;
        if (!z) {
            this.f37266OooO0o0 = false;
            OooOOO oooOOO = this.f37264OooO0Oo.f37274OooO00o;
            ArrayList arrayList = oooOOO.f37288OooO0OO;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                oooOOO.f37290OooO0o = false;
            }
        } else if (this.f37265OooO0o) {
            OooO0O0();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f37265OooO0o = true;
        this.f37263OooO = 0;
        if (this.f37268OooO0oo) {
            OooO0O0();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f37265OooO0o = false;
        this.f37266OooO0o0 = false;
        OooOOO oooOOO = this.f37264OooO0Oo.f37274OooO00o;
        ArrayList arrayList = oooOOO.f37288OooO0OO;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            oooOOO.f37290OooO0o = false;
        }
    }
}
