package OooOo;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import io.agora.rtc.Constants;
import p053o00000oo.o00Ooo;

/* JADX INFO: loaded from: classes.dex */
public class OooO0O0 extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final /* synthetic */ int f234OooOOOo = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f235OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public OooO0OO f236OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Drawable f237OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public Rect f238OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Drawable f239OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f240OooO0oo = 255;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public int f241OooOO0 = -1;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f242OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public OooO00o f243OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f244OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f245OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public C0003OooO0O0 f246OooOOOO;

    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f247OooO0Oo;

        public OooO00o(OooO oooO) {
            this.f247OooO0Oo = oooO;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooO0O0 oooO0O0 = this.f247OooO0Oo;
            oooO0O0.OooO00o(true);
            oooO0O0.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: OooOo.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static class C0003OooO0O0 implements Drawable.Callback {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Drawable.Callback f248OooO0Oo;

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(@NonNull Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
            Drawable.Callback callback = this.f248OooO0Oo;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
            Drawable.Callback callback = this.f248OooO0Oo;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    public static abstract class OooO0OO extends Drawable.ConstantState {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public boolean f249OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0O0 f250OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Resources f251OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f252OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f253OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public SparseArray<Drawable.ConstantState> f254OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f255OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Drawable[] f256OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f257OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f258OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public Rect f259OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public boolean f260OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public int f261OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public boolean f262OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public int f263OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public int f264OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public boolean f265OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public int f266OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public int f267OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f268OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public boolean f269OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public boolean f270OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public boolean f271OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public boolean f272OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f273OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f274OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public boolean f275OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public boolean f276OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public ColorFilter f277OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public ColorStateList f278OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public PorterDuff.Mode f279OooOooo;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public boolean f280Oooo000;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public boolean f281Oooo00O;

        public OooO0OO(OooO0OO oooO0OO, OooO0O0 oooO0O0, Resources resources) {
            this.f249OooO = false;
            this.f260OooOO0o = false;
            this.f272OooOo0o = true;
            this.f274OooOoO0 = 0;
            this.f273OooOoO = 0;
            this.f250OooO00o = oooO0O0;
            this.f251OooO0O0 = resources != null ? resources : oooO0OO != null ? oooO0OO.f251OooO0O0 : null;
            int i = oooO0OO != null ? oooO0OO.f252OooO0OO : 0;
            int i2 = OooO0O0.f234OooOOOo;
            i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
            i = i == 0 ? Constants.ERR_ALREADY_IN_RECORDING : i;
            this.f252OooO0OO = i;
            if (oooO0OO == null) {
                this.f256OooO0oO = new Drawable[10];
                this.f257OooO0oo = 0;
                return;
            }
            this.f253OooO0Oo = oooO0OO.f253OooO0Oo;
            this.f255OooO0o0 = oooO0OO.f255OooO0o0;
            this.f269OooOo0 = true;
            this.f271OooOo0O = true;
            this.f249OooO = oooO0OO.f249OooO;
            this.f260OooOO0o = oooO0OO.f260OooOO0o;
            this.f272OooOo0o = oooO0OO.f272OooOo0o;
            this.f268OooOo = oooO0OO.f268OooOo;
            this.f274OooOoO0 = oooO0OO.f274OooOoO0;
            this.f273OooOoO = oooO0OO.f273OooOoO;
            this.f275OooOoOO = oooO0OO.f275OooOoOO;
            this.f277OooOoo0 = oooO0OO.f277OooOoo0;
            this.f276OooOoo = oooO0OO.f276OooOoo;
            this.f278OooOooO = oooO0OO.f278OooOooO;
            this.f279OooOooo = oooO0OO.f279OooOooo;
            this.f280Oooo000 = oooO0OO.f280Oooo000;
            this.f281Oooo00O = oooO0OO.f281Oooo00O;
            if (oooO0OO.f252OooO0OO == i) {
                if (oooO0OO.f258OooOO0) {
                    this.f259OooOO0O = oooO0OO.f259OooOO0O != null ? new Rect(oooO0OO.f259OooOO0O) : null;
                    this.f258OooOO0 = true;
                }
                if (oooO0OO.f262OooOOO0) {
                    this.f261OooOOO = oooO0OO.f261OooOOO;
                    this.f263OooOOOO = oooO0OO.f263OooOOOO;
                    this.f264OooOOOo = oooO0OO.f264OooOOOo;
                    this.f266OooOOo0 = oooO0OO.f266OooOOo0;
                    this.f262OooOOO0 = true;
                }
            }
            if (oooO0OO.f265OooOOo) {
                this.f267OooOOoo = oooO0OO.f267OooOOoo;
                this.f265OooOOo = true;
            }
            if (oooO0OO.f270OooOo00) {
                this.f270OooOo00 = true;
            }
            Drawable[] drawableArr = oooO0OO.f256OooO0oO;
            this.f256OooO0oO = new Drawable[drawableArr.length];
            this.f257OooO0oo = oooO0OO.f257OooO0oo;
            SparseArray<Drawable.ConstantState> sparseArray = oooO0OO.f254OooO0o;
            if (sparseArray != null) {
                this.f254OooO0o = sparseArray.clone();
            } else {
                this.f254OooO0o = new SparseArray<>(this.f257OooO0oo);
            }
            int i3 = this.f257OooO0oo;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f254OooO0o.put(i4, constantState);
                    } else {
                        this.f256OooO0oO[i4] = drawableArr[i4];
                    }
                }
            }
        }

        public final int OooO00o(Drawable drawable) {
            int i = this.f257OooO0oo;
            if (i >= this.f256OooO0oO.length) {
                int i2 = i + 10;
                OooO.OooO00o oooO00o = (OooO.OooO00o) this;
                Drawable[] drawableArr = new Drawable[i2];
                Drawable[] drawableArr2 = oooO00o.f256OooO0oO;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
                }
                oooO00o.f256OooO0oO = drawableArr;
                int[][] iArr = new int[i2][];
                System.arraycopy(oooO00o.f219Oooo00o, 0, iArr, 0, i);
                oooO00o.f219Oooo00o = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f250OooO00o);
            this.f256OooO0oO[i] = drawable;
            this.f257OooO0oo++;
            this.f255OooO0o0 = drawable.getChangingConfigurations() | this.f255OooO0o0;
            this.f265OooOOo = false;
            this.f270OooOo00 = false;
            this.f259OooOO0O = null;
            this.f258OooOO0 = false;
            this.f262OooOOO0 = false;
            this.f269OooOo0 = false;
            return i;
        }

        public final void OooO0O0() {
            this.f262OooOOO0 = true;
            OooO0OO();
            int i = this.f257OooO0oo;
            Drawable[] drawableArr = this.f256OooO0oO;
            this.f263OooOOOO = -1;
            this.f261OooOOO = -1;
            this.f266OooOOo0 = 0;
            this.f264OooOOOo = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f261OooOOO) {
                    this.f261OooOOO = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f263OooOOOO) {
                    this.f263OooOOOO = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f264OooOOOo) {
                    this.f264OooOOOo = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f266OooOOo0) {
                    this.f266OooOOo0 = minimumHeight;
                }
            }
        }

        public final void OooO0OO() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f254OooO0o;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    int iKeyAt = this.f254OooO0o.keyAt(i);
                    Drawable.ConstantState constantStateValueAt = this.f254OooO0o.valueAt(i);
                    Drawable[] drawableArr = this.f256OooO0oO;
                    Drawable drawableNewDrawable = constantStateValueAt.newDrawable(this.f251OooO0O0);
                    o00Ooo.OooO0OO.OooO0O0(drawableNewDrawable, this.f268OooOo);
                    Drawable drawableMutate = drawableNewDrawable.mutate();
                    drawableMutate.setCallback(this.f250OooO00o);
                    drawableArr[iKeyAt] = drawableMutate;
                }
                this.f254OooO0o = null;
            }
        }

        public final Drawable OooO0Oo(int i) {
            int iIndexOfKey;
            Drawable drawable = this.f256OooO0oO[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f254OooO0o;
            if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable drawableNewDrawable = this.f254OooO0o.valueAt(iIndexOfKey).newDrawable(this.f251OooO0O0);
            o00Ooo.OooO0OO.OooO0O0(drawableNewDrawable, this.f268OooOo);
            Drawable drawableMutate = drawableNewDrawable.mutate();
            drawableMutate.setCallback(this.f250OooO00o);
            this.f256OooO0oO[i] = drawableMutate;
            this.f254OooO0o.removeAt(iIndexOfKey);
            if (this.f254OooO0o.size() == 0) {
                this.f254OooO0o = null;
            }
            return drawableMutate;
        }

        public abstract void OooO0o0();

        @Override // android.graphics.drawable.Drawable.ConstantState
        @RequiresApi(21)
        public final boolean canApplyTheme() {
            int i = this.f257OooO0oo;
            Drawable[] drawableArr = this.f256OooO0oO;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    Drawable.ConstantState constantState = this.f254OooO0o.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (o00Ooo.OooO0O0.OooO0O0(drawable)) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f253OooO0Oo | this.f255OooO0o0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x0047  */
    /* JADX WARN: Code duplicated, block: B:19:0x0050  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    public final void OooO00o(boolean z) {
        boolean z2;
        Drawable drawable;
        long j;
        boolean z3 = true;
        this.f235OooO = true;
        long jUptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f237OooO0o;
        if (drawable2 != null) {
            long j2 = this.f245OooOOO0;
            if (j2 != 0) {
                if (j2 <= jUptimeMillis) {
                    drawable2.setAlpha(this.f240OooO0oo);
                    this.f245OooOOO0 = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j2 - jUptimeMillis) * 255)) / this.f236OooO0Oo.f274OooOoO0)) * this.f240OooO0oo) / 255);
                    z2 = true;
                }
            }
            drawable = this.f239OooO0oO;
            if (drawable != null) {
                j = this.f244OooOOO;
                if (j == 0) {
                    if (j <= jUptimeMillis) {
                        drawable.setVisible(false, false);
                        this.f239OooO0oO = null;
                        this.f244OooOOO = 0L;
                    } else {
                        drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.f236OooO0Oo.f273OooOoO) * this.f240OooO0oo) / 255);
                    }
                }
                if (z || !z3) {
                }
                scheduleSelf(this.f243OooOO0o, jUptimeMillis + 16);
                return;
            }
            this.f244OooOOO = 0L;
            z3 = z2;
            if (z) {
            }
        }
        this.f245OooOOO0 = 0L;
        z2 = false;
        drawable = this.f239OooO0oO;
        if (drawable != null) {
            j = this.f244OooOOO;
            if (j == 0) {
                if (j <= jUptimeMillis) {
                    drawable.setVisible(false, false);
                    this.f239OooO0oO = null;
                    this.f244OooOOO = 0L;
                } else {
                    drawable.setAlpha(((((int) ((j - jUptimeMillis) * 255)) / this.f236OooO0Oo.f273OooOoO) * this.f240OooO0oo) / 255);
                }
            }
            if (z) {
            }
        }
        this.f244OooOOO = 0L;
        z3 = z2;
        if (z) {
        }
    }

    public OooO0OO OooO0O0() {
        throw null;
    }

    public final void OooO0OO(Drawable drawable) {
        if (this.f246OooOOOO == null) {
            this.f246OooOOOO = new C0003OooO0O0();
        }
        C0003OooO0O0 c0003OooO0O0 = this.f246OooOOOO;
        c0003OooO0O0.f248OooO0Oo = drawable.getCallback();
        drawable.setCallback(c0003OooO0O0);
        try {
            if (this.f236OooO0Oo.f274OooOoO0 <= 0 && this.f235OooO) {
                drawable.setAlpha(this.f240OooO0oo);
            }
            OooO0OO oooO0OO = this.f236OooO0Oo;
            if (oooO0OO.f276OooOoo) {
                drawable.setColorFilter(oooO0OO.f277OooOoo0);
            } else {
                if (oooO0OO.f280Oooo000) {
                    o00Ooo.OooO0O0.OooO0oo(drawable, oooO0OO.f278OooOooO);
                }
                OooO0OO oooO0OO2 = this.f236OooO0Oo;
                if (oooO0OO2.f281Oooo00O) {
                    o00Ooo.OooO0O0.OooO(drawable, oooO0OO2.f279OooOooo);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f236OooO0Oo.f272OooOo0o);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            o00Ooo.OooO0OO.OooO0O0(drawable, o00Ooo.OooO0OO.OooO00o(this));
            o00Ooo.OooO00o.OooO0o0(drawable, this.f236OooO0Oo.f275OooOoOO);
            Rect rect = this.f238OooO0o0;
            if (rect != null) {
                o00Ooo.OooO0O0.OooO0o(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C0003OooO0O0 c0003OooO0O1 = this.f246OooOOOO;
            Drawable.Callback callback = c0003OooO0O1.f248OooO0Oo;
            c0003OooO0O1.f248OooO0Oo = null;
            drawable.setCallback(callback);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    public final boolean OooO0Oo(int i) {
        if (i == this.f241OooOO0) {
            return false;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (this.f236OooO0Oo.f273OooOoO > 0) {
            Drawable drawable = this.f239OooO0oO;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f237OooO0o;
            if (drawable2 != null) {
                this.f239OooO0oO = drawable2;
                this.f244OooOOO = ((long) this.f236OooO0Oo.f273OooOoO) + jUptimeMillis;
            } else {
                this.f239OooO0oO = null;
                this.f244OooOOO = 0L;
            }
        } else {
            Drawable drawable3 = this.f237OooO0o;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i >= 0) {
            OooO0OO oooO0OO = this.f236OooO0Oo;
            if (i < oooO0OO.f257OooO0oo) {
                Drawable drawableOooO0Oo = oooO0OO.OooO0Oo(i);
                this.f237OooO0o = drawableOooO0Oo;
                this.f241OooOO0 = i;
                if (drawableOooO0Oo != null) {
                    int i2 = this.f236OooO0Oo.f274OooOoO0;
                    if (i2 > 0) {
                        this.f245OooOOO0 = jUptimeMillis + ((long) i2);
                    }
                    OooO0OO(drawableOooO0Oo);
                }
            } else {
                this.f237OooO0o = null;
                this.f241OooOO0 = -1;
            }
        } else {
            this.f237OooO0o = null;
            this.f241OooOO0 = -1;
        }
        if (this.f245OooOOO0 != 0 || this.f244OooOOO != 0) {
            OooO00o oooO00o = this.f243OooOO0o;
            if (oooO00o == null) {
                this.f243OooOO0o = new OooO00o((OooO) this);
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
        OooO0OO oooO0OO = this.f236OooO0Oo;
        if (theme == null) {
            oooO0OO.getClass();
            return;
        }
        oooO0OO.OooO0OO();
        int i = oooO0OO.f257OooO0oo;
        Drawable[] drawableArr = oooO0OO.f256OooO0oO;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null && o00Ooo.OooO0O0.OooO0O0(drawable)) {
                o00Ooo.OooO0O0.OooO00o(drawableArr[i2], theme);
                oooO0OO.f255OooO0o0 |= drawableArr[i2].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            oooO0OO.f251OooO0O0 = resources;
            int i3 = resources.getDisplayMetrics().densityDpi;
            if (i3 == 0) {
                i3 = Constants.ERR_ALREADY_IN_RECORDING;
            }
            int i4 = oooO0OO.f252OooO0OO;
            oooO0OO.f252OooO0OO = i3;
            if (i4 != i3) {
                oooO0OO.f262OooOOO0 = false;
                oooO0OO.f258OooOO0 = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public final boolean canApplyTheme() {
        return this.f236OooO0Oo.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Drawable drawable = this.f237OooO0o;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f239OooO0oO;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f240OooO0oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        OooO0OO oooO0OO = this.f236OooO0Oo;
        return changingConfigurations | oooO0OO.f255OooO0o0 | oooO0OO.f253OooO0Oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z;
        OooO0OO oooO0OO = this.f236OooO0Oo;
        if (!oooO0OO.f269OooOo0) {
            oooO0OO.OooO0OO();
            oooO0OO.f269OooOo0 = true;
            int i = oooO0OO.f257OooO0oo;
            Drawable[] drawableArr = oooO0OO.f256OooO0oO;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    oooO0OO.f271OooOo0O = true;
                    z = true;
                    break;
                }
                if (drawableArr[i2].getConstantState() == null) {
                    oooO0OO.f271OooOo0O = false;
                    z = false;
                    break;
                }
                i2++;
            }
        } else {
            z = oooO0OO.f271OooOo0O;
        }
        if (!z) {
            return null;
        }
        this.f236OooO0Oo.f253OooO0Oo = getChangingConfigurations();
        return this.f236OooO0Oo;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public final Drawable getCurrent() {
        return this.f237OooO0o;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(@NonNull Rect rect) {
        Rect rect2 = this.f238OooO0o0;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        OooO0OO oooO0OO = this.f236OooO0Oo;
        if (oooO0OO.f260OooOO0o) {
            if (!oooO0OO.f262OooOOO0) {
                oooO0OO.OooO0O0();
            }
            return oooO0OO.f263OooOOOO;
        }
        Drawable drawable = this.f237OooO0o;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        OooO0OO oooO0OO = this.f236OooO0Oo;
        if (oooO0OO.f260OooOO0o) {
            if (!oooO0OO.f262OooOOO0) {
                oooO0OO.OooO0O0();
            }
            return oooO0OO.f261OooOOO;
        }
        Drawable drawable = this.f237OooO0o;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        OooO0OO oooO0OO = this.f236OooO0Oo;
        if (oooO0OO.f260OooOO0o) {
            if (!oooO0OO.f262OooOOO0) {
                oooO0OO.OooO0O0();
            }
            return oooO0OO.f266OooOOo0;
        }
        Drawable drawable = this.f237OooO0o;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        OooO0OO oooO0OO = this.f236OooO0Oo;
        if (oooO0OO.f260OooOO0o) {
            if (!oooO0OO.f262OooOOO0) {
                oooO0OO.OooO0O0();
            }
            return oooO0OO.f264OooOOOo;
        }
        Drawable drawable = this.f237OooO0o;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f237OooO0o;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        OooO0OO oooO0OO = this.f236OooO0Oo;
        if (oooO0OO.f265OooOOo) {
            return oooO0OO.f267OooOOoo;
        }
        oooO0OO.OooO0OO();
        int i = oooO0OO.f257OooO0oo;
        Drawable[] drawableArr = oooO0OO.f256OooO0oO;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        oooO0OO.f267OooOOoo = opacity;
        oooO0OO.f265OooOOo = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public final void getOutline(@NonNull Outline outline) {
        Drawable drawable = this.f237OooO0o;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(@NonNull Rect rect) {
        boolean padding;
        OooO0OO oooO0OO = this.f236OooO0Oo;
        boolean z = false;
        Rect rect2 = null;
        if (!oooO0OO.f249OooO) {
            Rect rect3 = oooO0OO.f259OooOO0O;
            if (rect3 != null || oooO0OO.f258OooOO0) {
                rect2 = rect3;
            } else {
                oooO0OO.OooO0OO();
                Rect rect4 = new Rect();
                int i = oooO0OO.f257OooO0oo;
                Drawable[] drawableArr = oooO0OO.f256OooO0oO;
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
                oooO0OO.f258OooOO0 = true;
                oooO0OO.f259OooOO0O = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            padding = (((rect2.left | rect2.top) | rect2.bottom) | rect2.right) != 0;
        } else {
            Drawable drawable = this.f237OooO0o;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f236OooO0Oo.f275OooOoOO && o00Ooo.OooO0OO.OooO00o(this) == 1) {
            z = true;
        }
        if (z) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(@NonNull Drawable drawable) {
        OooO0OO oooO0OO = this.f236OooO0Oo;
        if (oooO0OO != null) {
            oooO0OO.f265OooOOo = false;
            oooO0OO.f270OooOo00 = false;
        }
        if (drawable != this.f237OooO0o || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f236OooO0Oo.f275OooOoOO;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f239OooO0oO;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f239OooO0oO = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f237OooO0o;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f235OooO) {
                this.f237OooO0o.setAlpha(this.f240OooO0oo);
            }
        }
        if (this.f244OooOOO != 0) {
            this.f244OooOOO = 0L;
            z = true;
        }
        if (this.f245OooOOO0 != 0) {
            this.f245OooOOO0 = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f242OooOO0O && super.mutate() == this) {
            OooO0OO oooO0OOOooO0O0 = OooO0O0();
            oooO0OOOooO0O0.OooO0o0();
            OooO0o0(oooO0OOOooO0O0);
            this.f242OooOO0O = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f239OooO0oO;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f237OooO0o;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        OooO0OO oooO0OO = this.f236OooO0Oo;
        int i2 = this.f241OooOO0;
        int i3 = oooO0OO.f257OooO0oo;
        Drawable[] drawableArr = oooO0OO.f256OooO0oO;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean zOooO0O0 = o00Ooo.OooO0OO.OooO0O0(drawable, i);
                if (i4 == i2) {
                    z = zOooO0O0;
                }
            }
        }
        oooO0OO.f268OooOo = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f239OooO0oO;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f237OooO0o;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        Drawable drawable = this.f239OooO0oO;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f237OooO0o;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        if (drawable != this.f237OooO0o || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f235OooO && this.f240OooO0oo == i) {
            return;
        }
        this.f235OooO = true;
        this.f240OooO0oo = i;
        Drawable drawable = this.f237OooO0o;
        if (drawable != null) {
            if (this.f245OooOOO0 == 0) {
                drawable.setAlpha(i);
            } else {
                OooO00o(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        OooO0OO oooO0OO = this.f236OooO0Oo;
        if (oooO0OO.f275OooOoOO != z) {
            oooO0OO.f275OooOoOO = z;
            Drawable drawable = this.f237OooO0o;
            if (drawable != null) {
                o00Ooo.OooO00o.OooO0o0(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        OooO0OO oooO0OO = this.f236OooO0Oo;
        oooO0OO.f276OooOoo = true;
        if (oooO0OO.f277OooOoo0 != colorFilter) {
            oooO0OO.f277OooOoo0 = colorFilter;
            Drawable drawable = this.f237OooO0o;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        OooO0OO oooO0OO = this.f236OooO0Oo;
        if (oooO0OO.f272OooOo0o != z) {
            oooO0OO.f272OooOo0o = z;
            Drawable drawable = this.f237OooO0o;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.f237OooO0o;
        if (drawable != null) {
            o00Ooo.OooO0O0.OooO0o0(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f238OooO0o0;
        if (rect == null) {
            this.f238OooO0o0 = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f237OooO0o;
        if (drawable != null) {
            o00Ooo.OooO0O0.OooO0o(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(@ColorInt int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        OooO0OO oooO0OO = this.f236OooO0Oo;
        oooO0OO.f280Oooo000 = true;
        if (oooO0OO.f278OooOooO != colorStateList) {
            oooO0OO.f278OooOooO = colorStateList;
            o00Ooo.OooO0O0(this.f237OooO0o, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(@NonNull PorterDuff.Mode mode) {
        OooO0OO oooO0OO = this.f236OooO0Oo;
        oooO0OO.f281Oooo00O = true;
        if (oooO0OO.f279OooOooo != mode) {
            oooO0OO.f279OooOooo = mode;
            o00Ooo.OooO0OO(this.f237OooO0o, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f239OooO0oO;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f237OooO0o;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        if (drawable != this.f237OooO0o || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
