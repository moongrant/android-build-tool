package p013OooOo0O;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import io.agora.rtc.Constants;
import java.util.Objects;
import kotlin.KotlinVersion;
import p084o000Ooo.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class OooO0o extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public static final /* synthetic */ int f215OoooOo0 = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public Drawable f216Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public OooO0OO f217Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Rect f218Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Drawable f219Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public boolean f220OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f221OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f222OoooO00 = KotlinVersion.MAX_COMPONENT_VALUE;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f223OoooO0O = -1;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public OooO00o f224OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public long f225OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public OooO0O0 f226OoooOOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public long f227o000oOoO;

    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooO0o.this.OooO00o(true);
            OooO0o.this.invalidateSelf();
        }
    }

    public static class OooO0O0 implements Drawable.Callback {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Drawable.Callback f229Oooo0o;

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(@NonNull Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
            Drawable.Callback callback = this.f229Oooo0o;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
            Drawable.Callback callback = this.f229Oooo0o;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    public static abstract class OooO0OO extends Drawable.ConstantState {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f230OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0o f231OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Resources f232OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f233OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f234OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f235OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f236OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Drawable[] f237OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f238OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f239OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Rect f240OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f241OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public int f242OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f243OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public int f244OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public int f245OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public boolean f246OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public int f247OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public int f248OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f249OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public boolean f250OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public boolean f251OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public boolean f252OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public boolean f253OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f254OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f255OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public boolean f256OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public boolean f257OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public ColorFilter f258OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public ColorStateList f259OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public PorterDuff.Mode f260OooOooo;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public boolean f261Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public boolean f262Oooo00O;

        public OooO0OO(OooO0OO oooO0OO, OooO0o oooO0o, Resources resources) {
            this.f230OooO = false;
            this.f241OooOO0o = false;
            this.f253OooOo0o = true;
            this.f255OooOoO0 = 0;
            this.f254OooOoO = 0;
            this.f231OooO00o = oooO0o;
            this.f232OooO0O0 = resources != null ? resources : oooO0OO != null ? oooO0OO.f232OooO0O0 : null;
            int i = oooO0OO != null ? oooO0OO.f233OooO0OO : 0;
            int i2 = OooO0o.f215OoooOo0;
            i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
            i = i == 0 ? Constants.ERR_ALREADY_IN_RECORDING : i;
            this.f233OooO0OO = i;
            if (oooO0OO == null) {
                this.f237OooO0oO = new Drawable[10];
                this.f238OooO0oo = 0;
                return;
            }
            this.f234OooO0Oo = oooO0OO.f234OooO0Oo;
            this.f236OooO0o0 = oooO0OO.f236OooO0o0;
            this.f250OooOo0 = true;
            this.f252OooOo0O = true;
            this.f230OooO = oooO0OO.f230OooO;
            this.f241OooOO0o = oooO0OO.f241OooOO0o;
            this.f253OooOo0o = oooO0OO.f253OooOo0o;
            this.f249OooOo = oooO0OO.f249OooOo;
            this.f255OooOoO0 = oooO0OO.f255OooOoO0;
            this.f254OooOoO = oooO0OO.f254OooOoO;
            this.f256OooOoOO = oooO0OO.f256OooOoOO;
            this.f258OooOoo0 = oooO0OO.f258OooOoo0;
            this.f257OooOoo = oooO0OO.f257OooOoo;
            this.f259OooOooO = oooO0OO.f259OooOooO;
            this.f260OooOooo = oooO0OO.f260OooOooo;
            this.f261Oooo000 = oooO0OO.f261Oooo000;
            this.f262Oooo00O = oooO0OO.f262Oooo00O;
            if (oooO0OO.f233OooO0OO == i) {
                if (oooO0OO.f239OooOO0) {
                    this.f240OooOO0O = oooO0OO.f240OooOO0O != null ? new Rect(oooO0OO.f240OooOO0O) : null;
                    this.f239OooOO0 = true;
                }
                if (oooO0OO.f243OooOOO0) {
                    this.f242OooOOO = oooO0OO.f242OooOOO;
                    this.f244OooOOOO = oooO0OO.f244OooOOOO;
                    this.f245OooOOOo = oooO0OO.f245OooOOOo;
                    this.f247OooOOo0 = oooO0OO.f247OooOOo0;
                    this.f243OooOOO0 = true;
                }
            }
            if (oooO0OO.f246OooOOo) {
                this.f248OooOOoo = oooO0OO.f248OooOOoo;
                this.f246OooOOo = true;
            }
            if (oooO0OO.f251OooOo00) {
                this.f251OooOo00 = true;
            }
            Drawable[] drawableArr = oooO0OO.f237OooO0oO;
            this.f237OooO0oO = new Drawable[drawableArr.length];
            this.f238OooO0oo = oooO0OO.f238OooO0oo;
            SparseArray<Drawable.ConstantState> sparseArray = oooO0OO.f235OooO0o;
            if (sparseArray != null) {
                this.f235OooO0o = sparseArray.clone();
            } else {
                this.f235OooO0o = new SparseArray<>(this.f238OooO0oo);
            }
            int i3 = this.f238OooO0oo;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    Drawable.ConstantState constantState = drawableArr[i4].getConstantState();
                    if (constantState != null) {
                        this.f235OooO0o.put(i4, constantState);
                    } else {
                        this.f237OooO0oO[i4] = drawableArr[i4];
                    }
                }
            }
        }

        public final int OooO00o(Drawable drawable) {
            int i = this.f238OooO0oo;
            if (i >= this.f237OooO0oO.length) {
                int i2 = i + 10;
                OooOO0.OooO00o oooO00o = (OooOO0.OooO00o) this;
                Drawable[] drawableArr = new Drawable[i2];
                Drawable[] drawableArr2 = oooO00o.f237OooO0oO;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
                }
                oooO00o.f237OooO0oO = drawableArr;
                int[][] iArr = new int[i2][];
                System.arraycopy(oooO00o.f265Oooo00o, 0, iArr, 0, i);
                oooO00o.f265Oooo00o = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f231OooO00o);
            this.f237OooO0oO[i] = drawable;
            this.f238OooO0oo++;
            this.f236OooO0o0 = drawable.getChangingConfigurations() | this.f236OooO0o0;
            this.f246OooOOo = false;
            this.f251OooOo00 = false;
            this.f240OooOO0O = null;
            this.f239OooOO0 = false;
            this.f243OooOOO0 = false;
            this.f250OooOo0 = false;
            return i;
        }

        public final void OooO0O0() {
            this.f243OooOOO0 = true;
            OooO0OO();
            int i = this.f238OooO0oo;
            Drawable[] drawableArr = this.f237OooO0oO;
            this.f244OooOOOO = -1;
            this.f242OooOOO = -1;
            this.f247OooOOo0 = 0;
            this.f245OooOOOo = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f242OooOOO) {
                    this.f242OooOOO = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f244OooOOOO) {
                    this.f244OooOOOO = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f245OooOOOo) {
                    this.f245OooOOOo = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f247OooOOo0) {
                    this.f247OooOOo0 = minimumHeight;
                }
            }
        }

        public final void OooO0OO() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f235OooO0o;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f237OooO0oO[this.f235OooO0o.keyAt(i)] = OooO0o(this.f235OooO0o.valueAt(i).newDrawable(this.f232OooO0O0));
                }
                this.f235OooO0o = null;
            }
        }

        public final Drawable OooO0Oo(int i) {
            int iIndexOfKey;
            Drawable drawable = this.f237OooO0oO[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f235OooO0o;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable drawableOooO0o = OooO0o(this.f235OooO0o.valueAt(iIndexOfKey).newDrawable(this.f232OooO0O0));
            this.f237OooO0oO[i] = drawableOooO0o;
            this.f235OooO0o.removeAt(iIndexOfKey);
            if (this.f235OooO0o.size() == 0) {
                this.f235OooO0o = null;
            }
            return drawableOooO0o;
        }

        public final Drawable OooO0o(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                o0OOO0o.OooO0OO(drawable, this.f249OooOo);
            }
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setCallback(this.f231OooO00o);
            return drawableMutate;
        }

        public abstract void OooO0o0();

        public final void OooO0oO(Resources resources) {
            if (resources != null) {
                this.f232OooO0O0 = resources;
                int i = OooO0o.f215OoooOo0;
                int i2 = resources.getDisplayMetrics().densityDpi;
                if (i2 == 0) {
                    i2 = Constants.ERR_ALREADY_IN_RECORDING;
                }
                int i3 = this.f233OooO0OO;
                this.f233OooO0OO = i2;
                if (i3 != i2) {
                    this.f243OooOOO0 = false;
                    this.f239OooOO0 = false;
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @RequiresApi(21)
        public final boolean canApplyTheme() {
            int i = this.f238OooO0oo;
            Drawable[] drawableArr = this.f237OooO0oO;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f235OooO0o.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (o0OOO0o.OooO0O0.OooO0O0(drawable)) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f234OooO0Oo | this.f236OooO0o0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x0049  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0065  */
    /* JADX WARN: Code duplicated, block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void OooO00o(boolean z) {
        boolean z2;
        Drawable drawable;
        long j;
        boolean z3 = true;
        this.f221OoooO0 = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f219Oooo0oo;
        if (drawable2 != null) {
            long j2 = this.f227o000oOoO;
            if (j2 != 0) {
                if (j2 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f222OoooO00);
                    this.f227o000oOoO = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j2 - jUptimeMillis) * 255)) / this.f217Oooo0o.f255OooOoO0)) * this.f222OoooO00) / KotlinVersion.MAX_COMPONENT_VALUE);
                    z2 = true;
                }
            }
            drawable = this.f216Oooo;
            if (drawable != null) {
                j = this.f225OoooOOO;
                if (j == 0) {
                    if (j <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f216Oooo = null;
                        this.f225OoooOOO = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.f217Oooo0o.f254OooOoO) * this.f222OoooO00) / KotlinVersion.MAX_COMPONENT_VALUE);
                    }
                }
                if (z || !z3) {
                }
                scheduleSelf(this.f224OoooOO0, jUptimeMillis + 16);
                return;
            }
            this.f225OoooOOO = 0L;
            z3 = z2;
            if (z) {
            }
        }
        this.f227o000oOoO = 0L;
        z2 = false;
        drawable = this.f216Oooo;
        if (drawable != null) {
            j = this.f225OoooOOO;
            if (j == 0) {
                if (j <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.f216Oooo = null;
                    this.f225OoooOOO = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.f217Oooo0o.f254OooOoO) * this.f222OoooO00) / KotlinVersion.MAX_COMPONENT_VALUE);
                }
            }
            if (z) {
            }
        }
        this.f225OoooOOO = 0L;
        z3 = z2;
        if (z) {
        }
    }

    public OooO0OO OooO0O0() {
        throw null;
    }

    public final void OooO0OO(Drawable drawable) {
        if (this.f226OoooOOo == null) {
            this.f226OoooOOo = new OooO0O0();
        }
        OooO0O0 oooO0O0 = this.f226OoooOOo;
        oooO0O0.f229Oooo0o = drawable.getCallback();
        drawable.setCallback(oooO0O0);
        try {
            if (this.f217Oooo0o.f255OooOoO0 <= 0 && this.f221OoooO0) {
                drawable.setAlpha(this.f222OoooO00);
            }
            OooO0OO oooO0OO = this.f217Oooo0o;
            if (oooO0OO.f257OooOoo) {
                drawable.setColorFilter(oooO0OO.f258OooOoo0);
            } else {
                if (oooO0OO.f261Oooo000) {
                    o0OOO0o.OooO0O0.OooO0oo(drawable, oooO0OO.f259OooOooO);
                }
                OooO0OO oooO0OO2 = this.f217Oooo0o;
                if (oooO0OO2.f262Oooo00O) {
                    o0OOO0o.OooO0O0.OooO(drawable, oooO0OO2.f260OooOooo);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f217Oooo0o.f253OooOo0o);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                o0OOO0o.OooO0OO(drawable, o0OOO0o.OooO0O0(this));
            }
            o0OOO0o.OooO00o.OooO0o0(drawable, this.f217Oooo0o.f256OooOoOO);
            Rect rect = this.f218Oooo0oO;
            if (rect != null) {
                o0OOO0o.OooO0O0.OooO0o(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            OooO0O0 oooO0O1 = this.f226OoooOOo;
            Drawable.Callback callback = oooO0O1.f229Oooo0o;
            oooO0O1.f229Oooo0o = null;
            drawable.setCallback(callback);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    final boolean OooO0Oo(int i) {
        if (i == this.f223OoooO0O) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f217Oooo0o.f254OooOoO > 0) {
            Drawable drawable = this.f216Oooo;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f219Oooo0oo;
            if (drawable2 != null) {
                this.f216Oooo = drawable2;
                this.f225OoooOOO = ((long) this.f217Oooo0o.f254OooOoO) + jUptimeMillis;
            } else {
                this.f216Oooo = null;
                this.f225OoooOOO = 0L;
            }
        } else {
            Drawable drawable3 = this.f219Oooo0oo;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0) {
            OooO0OO oooO0OO = this.f217Oooo0o;
            if (i < oooO0OO.f238OooO0oo) {
                Drawable drawableOooO0Oo = oooO0OO.OooO0Oo(i);
                this.f219Oooo0oo = drawableOooO0Oo;
                this.f223OoooO0O = i;
                if (drawableOooO0Oo != null) {
                    int i2 = this.f217Oooo0o.f255OooOoO0;
                    if (i2 > 0) {
                        this.f227o000oOoO = jUptimeMillis + ((long) i2);
                    }
                    OooO0OO(drawableOooO0Oo);
                }
            } else {
                this.f219Oooo0oo = null;
                this.f223OoooO0O = -1;
            }
        } else {
            this.f219Oooo0oo = null;
            this.f223OoooO0O = -1;
        }
        if (this.f227o000oOoO != 0 || this.f225OoooOOO != 0) {
            OooO00o oooO00o = this.f224OoooOO0;
            if (oooO00o == null) {
                this.f224OoooOO0 = new OooO00o();
            } else {
                unscheduleSelf(oooO00o);
            }
            OooO00o(true);
        }
        invalidateSelf();
        return true;
    }

    public void OooO0o0(OooO0OO oooO0OO) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public void applyTheme(@NonNull Resources.Theme theme) {
        OooO0OO oooO0OO = this.f217Oooo0o;
        Objects.requireNonNull(oooO0OO);
        if (theme != null) {
            oooO0OO.OooO0OO();
            int i = oooO0OO.f238OooO0oo;
            Drawable[] drawableArr = oooO0OO.f237OooO0oO;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2] != null && o0OOO0o.OooO0O0.OooO0O0(drawableArr[i2])) {
                    o0OOO0o.OooO0O0.OooO00o(drawableArr[i2], theme);
                    oooO0OO.f236OooO0o0 |= drawableArr[i2].getChangingConfigurations();
                }
            }
            oooO0OO.OooO0oO(theme.getResources());
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public final boolean canApplyTheme() {
        return this.f217Oooo0o.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Drawable drawable = this.f219Oooo0oo;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f216Oooo;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f222OoooO00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        OooO0OO oooO0OO = this.f217Oooo0o;
        return changingConfigurations | oooO0OO.f236OooO0o0 | oooO0OO.f234OooO0Oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        OooO0OO oooO0OO = this.f217Oooo0o;
        boolean z = false;
        if (!oooO0OO.f250OooOo0) {
            oooO0OO.OooO0OO();
            oooO0OO.f250OooOo0 = true;
            int i = oooO0OO.f238OooO0oo;
            Drawable[] drawableArr = oooO0OO.f237OooO0oO;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    oooO0OO.f252OooOo0O = true;
                    z = true;
                    break;
                }
                if (drawableArr[i2].getConstantState() == null) {
                    oooO0OO.f252OooOo0O = false;
                    break;
                }
                i2++;
            }
        } else {
            z = oooO0OO.f252OooOo0O;
        }
        if (!z) {
            return null;
        }
        this.f217Oooo0o.f234OooO0Oo = getChangingConfigurations();
        return this.f217Oooo0o;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public final Drawable getCurrent() {
        return this.f219Oooo0oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(@NonNull Rect rect) {
        Rect rect2 = this.f218Oooo0oO;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        OooO0OO oooO0OO = this.f217Oooo0o;
        if (oooO0OO.f241OooOO0o) {
            if (!oooO0OO.f243OooOOO0) {
                oooO0OO.OooO0O0();
            }
            return oooO0OO.f244OooOOOO;
        }
        Drawable drawable = this.f219Oooo0oo;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        OooO0OO oooO0OO = this.f217Oooo0o;
        if (oooO0OO.f241OooOO0o) {
            if (!oooO0OO.f243OooOOO0) {
                oooO0OO.OooO0O0();
            }
            return oooO0OO.f242OooOOO;
        }
        Drawable drawable = this.f219Oooo0oo;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        OooO0OO oooO0OO = this.f217Oooo0o;
        if (oooO0OO.f241OooOO0o) {
            if (!oooO0OO.f243OooOOO0) {
                oooO0OO.OooO0O0();
            }
            return oooO0OO.f247OooOOo0;
        }
        Drawable drawable = this.f219Oooo0oo;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        OooO0OO oooO0OO = this.f217Oooo0o;
        if (oooO0OO.f241OooOO0o) {
            if (!oooO0OO.f243OooOOO0) {
                oooO0OO.OooO0O0();
            }
            return oooO0OO.f245OooOOOo;
        }
        Drawable drawable = this.f219Oooo0oo;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f219Oooo0oo;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        OooO0OO oooO0OO = this.f217Oooo0o;
        if (oooO0OO.f246OooOOo) {
            return oooO0OO.f248OooOOoo;
        }
        oooO0OO.OooO0OO();
        int i = oooO0OO.f238OooO0oo;
        Drawable[] drawableArr = oooO0OO.f237OooO0oO;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        oooO0OO.f248OooOOoo = opacity;
        oooO0OO.f246OooOOo = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public final void getOutline(@NonNull Outline outline) {
        Drawable drawable = this.f219Oooo0oo;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(@NonNull Rect rect) {
        boolean padding;
        OooO0OO oooO0OO = this.f217Oooo0o;
        Rect rect2 = null;
        if (!oooO0OO.f230OooO) {
            Rect rect3 = oooO0OO.f240OooOO0O;
            if (rect3 != null || oooO0OO.f239OooOO0) {
                rect2 = rect3;
            } else {
                oooO0OO.OooO0OO();
                Rect rect4 = new Rect();
                int i = oooO0OO.f238OooO0oo;
                Drawable[] drawableArr = oooO0OO.f237OooO0oO;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect4.left;
                        if (i3 > rect2.left) {
                            rect2.left = i3;
                        }
                        int i4 = rect4.top;
                        if (i4 > rect2.top) {
                            rect2.top = i4;
                        }
                        int i5 = rect4.right;
                        if (i5 > rect2.right) {
                            rect2.right = i5;
                        }
                        int i6 = rect4.bottom;
                        if (i6 > rect2.bottom) {
                            rect2.bottom = i6;
                        }
                    }
                }
                oooO0OO.f239OooOO0 = true;
                oooO0OO.f240OooOO0O = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            padding = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f219Oooo0oo;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f217Oooo0o.f256OooOoOO && o0OOO0o.OooO0O0(this) == 1) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        OooO0OO oooO0OO = this.f217Oooo0o;
        if (oooO0OO != null) {
            oooO0OO.f246OooOOo = false;
            oooO0OO.f251OooOo00 = false;
        }
        if (drawable != this.f219Oooo0oo || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f217Oooo0o.f256OooOoOO;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f216Oooo;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f216Oooo = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f219Oooo0oo;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f221OoooO0) {
                this.f219Oooo0oo.setAlpha(this.f222OoooO00);
            }
        }
        if (this.f225OoooOOO != 0) {
            this.f225OoooOOO = 0L;
            z = true;
        }
        if (this.f227o000oOoO != 0) {
            this.f227o000oOoO = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f220OoooO && super.mutate() == this) {
            OooO0OO oooO0OOOooO0O0 = OooO0O0();
            oooO0OOOooO0O0.OooO0o0();
            OooO0o0(oooO0OOOooO0O0);
            this.f220OoooO = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f216Oooo;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f219Oooo0oo;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        OooO0OO oooO0OO = this.f217Oooo0o;
        int i2 = this.f223OoooO0O;
        int i3 = oooO0OO.f238OooO0oo;
        Drawable[] drawableArr = oooO0OO.f237OooO0oO;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            if (drawableArr[i4] != null) {
                boolean zOooO0OO = Build.VERSION.SDK_INT >= 23 ? o0OOO0o.OooO0OO(drawableArr[i4], i) : false;
                if (i4 == i2) {
                    z = zOooO0OO;
                }
            }
        }
        oooO0OO.f249OooOo = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f216Oooo;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f219Oooo0oo;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        Drawable drawable = this.f216Oooo;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f219Oooo0oo;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        if (drawable != this.f219Oooo0oo || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f221OoooO0 && this.f222OoooO00 == i) {
            return;
        }
        this.f221OoooO0 = true;
        this.f222OoooO00 = i;
        Drawable drawable = this.f219Oooo0oo;
        if (drawable != null) {
            if (this.f227o000oOoO == 0) {
                drawable.setAlpha(i);
            } else {
                OooO00o(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        OooO0OO oooO0OO = this.f217Oooo0o;
        if (oooO0OO.f256OooOoOO != z) {
            oooO0OO.f256OooOoOO = z;
            Drawable drawable = this.f219Oooo0oo;
            if (drawable != null) {
                o0OOO0o.OooO00o.OooO0o0(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        OooO0OO oooO0OO = this.f217Oooo0o;
        oooO0OO.f257OooOoo = true;
        if (oooO0OO.f258OooOoo0 != colorFilter) {
            oooO0OO.f258OooOoo0 = colorFilter;
            Drawable drawable = this.f219Oooo0oo;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        OooO0OO oooO0OO = this.f217Oooo0o;
        if (oooO0OO.f253OooOo0o != z) {
            oooO0OO.f253OooOo0o = z;
            Drawable drawable = this.f219Oooo0oo;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.f219Oooo0oo;
        if (drawable != null) {
            o0OOO0o.OooO0O0.OooO0o0(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f218Oooo0oO;
        if (rect == null) {
            this.f218Oooo0oO = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f219Oooo0oo;
        if (drawable != null) {
            o0OOO0o.OooO0O0.OooO0o(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(@ColorInt int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        OooO0OO oooO0OO = this.f217Oooo0o;
        oooO0OO.f261Oooo000 = true;
        if (oooO0OO.f259OooOooO != colorStateList) {
            oooO0OO.f259OooOooO = colorStateList;
            o0OOO0o.OooO0O0.OooO0oo(this.f219Oooo0oo, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(@NonNull PorterDuff.Mode mode) {
        OooO0OO oooO0OO = this.f217Oooo0o;
        oooO0OO.f262Oooo00O = true;
        if (oooO0OO.f260OooOooo != mode) {
            oooO0OO.f260OooOooo = mode;
            o0OOO0o.OooO0O0.OooO(this.f219Oooo0oo, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f216Oooo;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f219Oooo0oo;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        if (drawable != this.f219Oooo0oo || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
