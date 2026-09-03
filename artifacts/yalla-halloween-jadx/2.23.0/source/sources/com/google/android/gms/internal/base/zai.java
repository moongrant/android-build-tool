package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import net.sqlcipher.database.SQLiteDatabase;
import p263o00oooO.o000000;
import p263o00oooO.o000000O;

/* JADX INFO: loaded from: classes3.dex */
public final class zai extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f15335OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f15336OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f15337OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f15338OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f15339OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f15340OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f15341OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f15342OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o000000O f15343OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Drawable f15344OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final Drawable f15345OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f15346OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public boolean f15347OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f15348OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f15349OooOOo0;

    public zai(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        this(null);
        drawable = drawable == null ? o000000.f41066OooO00o : drawable;
        this.f15345OooOOO0 = drawable;
        drawable.setCallback(this);
        o000000O o000000o2 = this.f15343OooOO0o;
        o000000o2.f41069OooO0O0 = drawable.getChangingConfigurations() | o000000o2.f41069OooO0O0;
        drawable2 = drawable2 == null ? o000000.f41066OooO00o : drawable2;
        this.f15344OooOOO = drawable2;
        drawable2.setCallback(this);
        o000000O o000000o3 = this.f15343OooOO0o;
        o000000o3.f41069OooO0O0 = drawable2.getChangingConfigurations() | o000000o3.f41069OooO0O0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2 = this.f15336OooO0Oo;
        int i3 = 0;
        boolean z = true;
        if (i2 == 1) {
            this.f15338OooO0o0 = SystemClock.uptimeMillis();
            this.f15336OooO0Oo = 2;
            z = false;
        } else if (i2 == 2 && this.f15338OooO0o0 >= 0) {
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.f15338OooO0o0) / this.f15340OooO0oo;
            z = fUptimeMillis >= 1.0f;
            if (z) {
                this.f15336OooO0Oo = 0;
            }
            this.f15335OooO = (int) ((this.f15337OooO0o * Math.min(fUptimeMillis, 1.0f)) + 0.0f);
        }
        int i4 = this.f15335OooO;
        boolean z2 = this.f15341OooOO0;
        Drawable drawable = this.f15345OooOOO0;
        Drawable drawable2 = this.f15344OooOOO;
        if (!z) {
            if (z2) {
                drawable.setAlpha(this.f15339OooO0oO - i4);
            }
            drawable.draw(canvas);
            if (z2) {
                drawable.setAlpha(this.f15339OooO0oO);
            }
            if (i4 > 0) {
                drawable2.setAlpha(i4);
                drawable2.draw(canvas);
                drawable2.setAlpha(this.f15339OooO0oO);
            }
            invalidateSelf();
            return;
        }
        if (z2) {
            if (i4 == 0) {
            }
            i = this.f15339OooO0oO;
            if (i4 == i) {
                drawable2.setAlpha(i);
                drawable2.draw(canvas);
            }
        }
        i3 = i4;
        drawable.draw(canvas);
        i4 = i3;
        i = this.f15339OooO0oO;
        if (i4 == i) {
            drawable2.setAlpha(i);
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        o000000O o000000o2 = this.f15343OooOO0o;
        return changingConfigurations | o000000o2.f41068OooO00o | o000000o2.f41069OooO0O0;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final Drawable.ConstantState getConstantState() {
        if (!zac()) {
            return null;
        }
        int changingConfigurations = getChangingConfigurations();
        o000000O o000000o2 = this.f15343OooOO0o;
        o000000o2.f41068OooO00o = changingConfigurations;
        return o000000o2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f15345OooOOO0.getIntrinsicHeight(), this.f15344OooOOO.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f15345OooOOO0.getIntrinsicWidth(), this.f15344OooOOO.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.f15349OooOOo0) {
            this.f15348OooOOo = Drawable.resolveOpacity(this.f15345OooOOO0.getOpacity(), this.f15344OooOOO.getOpacity());
            this.f15349OooOOo0 = true;
        }
        return this.f15348OooOOo;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f15342OooOO0O && super.mutate() == this) {
            if (!zac()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.f15345OooOOO0.mutate();
            this.f15344OooOOO.mutate();
            this.f15342OooOO0O = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f15345OooOOO0.setBounds(rect);
        this.f15344OooOOO.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f15335OooO == this.f15339OooO0oO) {
            this.f15335OooO = i;
        }
        this.f15339OooO0oO = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f15345OooOOO0.setColorFilter(colorFilter);
        this.f15344OooOOO.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final Drawable zaa() {
        return this.f15344OooOOO;
    }

    public final void zab(int i) {
        this.f15337OooO0o = this.f15339OooO0oO;
        this.f15335OooO = 0;
        this.f15340OooO0oo = SQLiteDatabase.MAX_SQL_CACHE_SIZE;
        this.f15336OooO0Oo = 1;
        invalidateSelf();
    }

    public final boolean zac() {
        if (!this.f15346OooOOOO) {
            boolean z = false;
            if (this.f15345OooOOO0.getConstantState() != null && this.f15344OooOOO.getConstantState() != null) {
                z = true;
            }
            this.f15347OooOOOo = z;
            this.f15346OooOOOO = true;
        }
        return this.f15347OooOOOo;
    }

    public zai(@Nullable o000000O o000000o2) {
        this.f15336OooO0Oo = 0;
        this.f15339OooO0oO = 255;
        this.f15335OooO = 0;
        this.f15341OooOO0 = true;
        this.f15343OooOO0o = new o000000O(o000000o2);
    }
}
