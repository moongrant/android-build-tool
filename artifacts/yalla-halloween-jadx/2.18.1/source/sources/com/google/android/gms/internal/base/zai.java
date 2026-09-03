package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.KotlinVersion;
import net.sqlcipher.database.SQLiteDatabase;
import p333o0OO00Oo.OooOO0;
import p333o0OO00Oo.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
public final class zai extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f15844Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f15845Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public long f15846Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f15847Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f15848OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f15849OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f15850OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public boolean f15851OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public OooOO0O f15852OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public Drawable f15853OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f15854OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f15855OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f15856OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f15857OoooOoo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public Drawable f15858o000oOoO;

    public zai(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        this(null);
        drawable = drawable == null ? OooOO0.f37210OooO00o : drawable;
        this.f15858o000oOoO = drawable;
        drawable.setCallback(this);
        OooOO0O oooOO0O = this.f15852OoooOO0;
        oooOO0O.f37213OooO0O0 = drawable.getChangingConfigurations() | oooOO0O.f37213OooO0O0;
        drawable2 = drawable2 == null ? OooOO0.f37210OooO00o : drawable2;
        this.f15853OoooOOO = drawable2;
        drawable2.setCallback(this);
        OooOO0O oooOO0O2 = this.f15852OoooOO0;
        oooOO0O2.f37213OooO0O0 = drawable2.getChangingConfigurations() | oooOO0O2.f37213OooO0O0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2 = this.f15845Oooo0o;
        int i3 = 0;
        boolean z = true;
        if (i2 == 1) {
            this.f15846Oooo0oO = SystemClock.uptimeMillis();
            this.f15845Oooo0o = 2;
            z = false;
        } else if (i2 == 2 && this.f15846Oooo0oO >= 0) {
            float fUptimeMillis = (SystemClock.uptimeMillis() - this.f15846Oooo0oO) / this.f15850OoooO00;
            z = fUptimeMillis >= 1.0f;
            if (z) {
                this.f15845Oooo0o = 0;
            }
            this.f15849OoooO0 = (int) ((this.f15847Oooo0oo * Math.min(fUptimeMillis, 1.0f)) + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        int i4 = this.f15849OoooO0;
        boolean z2 = this.f15851OoooO0O;
        Drawable drawable = this.f15858o000oOoO;
        Drawable drawable2 = this.f15853OoooOOO;
        if (!z) {
            if (z2) {
                drawable.setAlpha(this.f15844Oooo - i4);
            }
            drawable.draw(canvas);
            if (z2) {
                drawable.setAlpha(this.f15844Oooo);
            }
            if (i4 > 0) {
                drawable2.setAlpha(i4);
                drawable2.draw(canvas);
                drawable2.setAlpha(this.f15844Oooo);
            }
            invalidateSelf();
            return;
        }
        if (z2) {
            if (i4 == 0) {
            }
            i = this.f15844Oooo;
            if (i4 == i) {
                drawable2.setAlpha(i);
                drawable2.draw(canvas);
            }
        }
        i3 = i4;
        drawable.draw(canvas);
        i4 = i3;
        i = this.f15844Oooo;
        if (i4 == i) {
            drawable2.setAlpha(i);
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        OooOO0O oooOO0O = this.f15852OoooOO0;
        return changingConfigurations | oooOO0O.f37212OooO00o | oooOO0O.f37213OooO0O0;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final Drawable.ConstantState getConstantState() {
        if (!zac()) {
            return null;
        }
        this.f15852OoooOO0.f37212OooO00o = getChangingConfigurations();
        return this.f15852OoooOO0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f15858o000oOoO.getIntrinsicHeight(), this.f15853OoooOOO.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f15858o000oOoO.getIntrinsicWidth(), this.f15853OoooOOO.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.f15856OoooOoO) {
            this.f15857OoooOoo = Drawable.resolveOpacity(this.f15858o000oOoO.getOpacity(), this.f15853OoooOOO.getOpacity());
            this.f15856OoooOoO = true;
        }
        return this.f15857OoooOoo;
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
        if (!this.f15848OoooO && super.mutate() == this) {
            if (!zac()) {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            this.f15858o000oOoO.mutate();
            this.f15853OoooOOO.mutate();
            this.f15848OoooO = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f15858o000oOoO.setBounds(rect);
        this.f15853OoooOOO.setBounds(rect);
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
        if (this.f15849OoooO0 == this.f15844Oooo) {
            this.f15849OoooO0 = i;
        }
        this.f15844Oooo = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f15858o000oOoO.setColorFilter(colorFilter);
        this.f15853OoooOOO.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final Drawable zaa() {
        return this.f15853OoooOOO;
    }

    public final void zab(int i) {
        this.f15847Oooo0oo = this.f15844Oooo;
        this.f15849OoooO0 = 0;
        this.f15850OoooO00 = SQLiteDatabase.MAX_SQL_CACHE_SIZE;
        this.f15845Oooo0o = 1;
        invalidateSelf();
    }

    public final boolean zac() {
        if (!this.f15854OoooOOo) {
            boolean z = false;
            if (this.f15858o000oOoO.getConstantState() != null && this.f15853OoooOOO.getConstantState() != null) {
                z = true;
            }
            this.f15855OoooOo0 = z;
            this.f15854OoooOOo = true;
        }
        return this.f15855OoooOo0;
    }

    public zai(@Nullable OooOO0O oooOO0O) {
        this.f15845Oooo0o = 0;
        this.f15844Oooo = KotlinVersion.MAX_COMPONENT_VALUE;
        this.f15849OoooO0 = 0;
        this.f15851OoooO0O = true;
        this.f15852OoooOO0 = new OooOO0O(oooOO0O);
    }
}
