package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsCompat {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public static final WindowInsetsCompat f5381OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOo00 f5382OooO00o;

    public static class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WindowInsetsCompat f5383OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public p052o00000oO.OooOO0O[] f5384OooO0O0;

        public OooO() {
            this(new WindowInsetsCompat());
        }

        public final void OooO00o() {
            p052o00000oO.OooOO0O[] oooOO0OArr = this.f5384OooO0O0;
            if (oooOO0OArr != null) {
                p052o00000oO.OooOO0O oooOO0OOooO00o = oooOO0OArr[Type.OooO00o(1)];
                p052o00000oO.OooOO0O oooOO0OOooO00o2 = this.f5384OooO0O0[Type.OooO00o(2)];
                WindowInsetsCompat windowInsetsCompat = this.f5383OooO00o;
                if (oooOO0OOooO00o2 == null) {
                    oooOO0OOooO00o2 = windowInsetsCompat.OooO00o(2);
                }
                if (oooOO0OOooO00o == null) {
                    oooOO0OOooO00o = windowInsetsCompat.OooO00o(1);
                }
                OooO0oO(p052o00000oO.OooOO0O.OooO00o(oooOO0OOooO00o, oooOO0OOooO00o2));
                p052o00000oO.OooOO0O oooOO0O = this.f5384OooO0O0[Type.OooO00o(16)];
                if (oooOO0O != null) {
                    OooO0o(oooOO0O);
                }
                p052o00000oO.OooOO0O oooOO0O2 = this.f5384OooO0O0[Type.OooO00o(32)];
                if (oooOO0O2 != null) {
                    OooO0Oo(oooOO0O2);
                }
                p052o00000oO.OooOO0O oooOO0O3 = this.f5384OooO0O0[Type.OooO00o(64)];
                if (oooOO0O3 != null) {
                    OooO0oo(oooOO0O3);
                }
            }
        }

        @NonNull
        public WindowInsetsCompat OooO0O0() {
            throw null;
        }

        public void OooO0OO(int i, @NonNull p052o00000oO.OooOO0O oooOO0O) {
            if (this.f5384OooO0O0 == null) {
                this.f5384OooO0O0 = new p052o00000oO.OooOO0O[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.f5384OooO0O0[Type.OooO00o(i2)] = oooOO0O;
                }
            }
        }

        public void OooO0Oo(@NonNull p052o00000oO.OooOO0O oooOO0O) {
        }

        public void OooO0o(@NonNull p052o00000oO.OooOO0O oooOO0O) {
        }

        public void OooO0o0(@NonNull p052o00000oO.OooOO0O oooOO0O) {
            throw null;
        }

        public void OooO0oO(@NonNull p052o00000oO.OooOO0O oooOO0O) {
            throw null;
        }

        public void OooO0oo(@NonNull p052o00000oO.OooOO0O oooOO0O) {
        }

        public OooO(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.f5383OooO00o = windowInsetsCompat;
        }
    }

    @RequiresApi(21)
    @SuppressLint({"SoonBlockedPrivateApi"})
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final Field f5385OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final Field f5386OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final Field f5387OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final boolean f5388OooO0Oo;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f5385OooO00o = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f5386OooO0O0 = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f5387OooO0OO = declaredField3;
                declaredField3.setAccessible(true);
                f5388OooO0Oo = true;
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }
    }

    @RequiresApi(30)
    public static class OooO0o extends OooO0OO {
        public OooO0o() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooO
        public void OooO0OO(int i, @NonNull p052o00000oO.OooOO0O oooOO0O) {
            this.f5395OooO0OO.setInsets(OooOo.OooO00o(i), oooOO0O.OooO0Oo());
        }

        public OooO0o(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    @RequiresApi(20)
    public static class OooOO0 extends OooOo00 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static Method f5396OooO = null;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static boolean f5397OooO0oo = false;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static Class<?> f5398OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static Field f5399OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static Field f5400OooOO0o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NonNull
        public final WindowInsets f5401OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public p052o00000oO.OooOO0O[] f5402OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public WindowInsetsCompat f5403OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public p052o00000oO.OooOO0O f5404OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public p052o00000oO.OooOO0O f5405OooO0oO;

        public OooOO0(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.f5404OooO0o0 = null;
            this.f5401OooO0OO = windowInsets;
        }

        @NonNull
        @SuppressLint({"WrongConstant"})
        private p052o00000oO.OooOO0O OooOo00(int i, boolean z) {
            p052o00000oO.OooOO0O oooOO0OOooO00o = p052o00000oO.OooOO0O.f33988OooO0o0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    oooOO0OOooO00o = p052o00000oO.OooOO0O.OooO00o(oooOO0OOooO00o, OooOo0(i2, z));
                }
            }
            return oooOO0OOooO00o;
        }

        private p052o00000oO.OooOO0O OooOo0O() {
            WindowInsetsCompat windowInsetsCompat = this.f5403OooO0o;
            return windowInsetsCompat != null ? windowInsetsCompat.f5382OooO00o.OooO() : p052o00000oO.OooOO0O.f33988OooO0o0;
        }

        @Nullable
        private p052o00000oO.OooOO0O OooOo0o(@NonNull View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f5397OooO0oo) {
                OooOoO0();
            }
            Method method = f5396OooO;
            if (method != null && f5398OooOO0 != null && f5399OooOO0O != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f5399OooOO0O.get(f5400OooOO0o.get(objInvoke));
                    if (rect != null) {
                        return p052o00000oO.OooOO0O.OooO0O0(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void OooOoO0() {
            try {
                f5396OooO = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f5398OooOO0 = cls;
                f5399OooOO0O = cls.getDeclaredField("mVisibleInsets");
                f5400OooOO0o = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f5399OooOO0O.setAccessible(true);
                f5400OooOO0o.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f5397OooO0oo = true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        public void OooO0Oo(@NonNull View view) {
            p052o00000oO.OooOO0O OooOo0o2 = OooOo0o(view);
            if (OooOo0o2 == null) {
                OooOo0o2 = p052o00000oO.OooOO0O.f33988OooO0o0;
            }
            OooOoO(OooOo0o2);
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public p052o00000oO.OooOO0O OooO0o(int i) {
            return OooOo00(i, false);
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public p052o00000oO.OooOO0O OooO0oO(int i) {
            return OooOo00(i, true);
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public final p052o00000oO.OooOO0O OooOO0O() {
            if (this.f5404OooO0o0 == null) {
                WindowInsets windowInsets = this.f5401OooO0OO;
                this.f5404OooO0o0 = p052o00000oO.OooOO0O.OooO0O0(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.f5404OooO0o0;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public WindowInsetsCompat OooOOO0(int i, int i2, int i3, int i4) {
            OooO oooO0OO;
            WindowInsetsCompat windowInsetsCompatOooOO0 = WindowInsetsCompat.OooOO0(null, this.f5401OooO0OO);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30) {
                oooO0OO = new OooO0o(windowInsetsCompatOooOO0);
            } else {
                oooO0OO = i5 >= 29 ? new OooO0OO(windowInsetsCompatOooOO0) : new OooO0O0(windowInsetsCompatOooOO0);
            }
            oooO0OO.OooO0oO(WindowInsetsCompat.OooO0oO(OooOO0O(), i, i2, i3, i4));
            oooO0OO.OooO0o0(WindowInsetsCompat.OooO0oO(OooO(), i, i2, i3, i4));
            return oooO0OO.OooO0O0();
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        public boolean OooOOOO() {
            return this.f5401OooO0OO.isRound();
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @SuppressLint({"WrongConstant"})
        public boolean OooOOOo(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0 && !OooOo(i2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        public void OooOOo(@Nullable WindowInsetsCompat windowInsetsCompat) {
            this.f5403OooO0o = windowInsetsCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        public void OooOOo0(p052o00000oO.OooOO0O[] oooOO0OArr) {
            this.f5402OooO0Oo = oooOO0OArr;
        }

        public boolean OooOo(int i) {
            if (i != 1 && i != 2) {
                if (i == 4) {
                    return false;
                }
                if (i != 8 && i != 128) {
                    return true;
                }
            }
            return !OooOo0(i, false).equals(p052o00000oO.OooOO0O.f33988OooO0o0);
        }

        @NonNull
        public p052o00000oO.OooOO0O OooOo0(int i, boolean z) {
            p052o00000oO.OooOO0O oooOO0OOooO;
            int i2;
            if (i == 1) {
                return z ? p052o00000oO.OooOO0O.OooO0O0(0, Math.max(OooOo0O().f33990OooO0O0, OooOO0O().f33990OooO0O0), 0, 0) : p052o00000oO.OooOO0O.OooO0O0(0, OooOO0O().f33990OooO0O0, 0, 0);
            }
            if (i == 2) {
                if (z) {
                    p052o00000oO.OooOO0O OooOo0O2 = OooOo0O();
                    p052o00000oO.OooOO0O oooOO0OOooO2 = OooO();
                    return p052o00000oO.OooOO0O.OooO0O0(Math.max(OooOo0O2.f33989OooO00o, oooOO0OOooO2.f33989OooO00o), 0, Math.max(OooOo0O2.f33991OooO0OO, oooOO0OOooO2.f33991OooO0OO), Math.max(OooOo0O2.f33992OooO0Oo, oooOO0OOooO2.f33992OooO0Oo));
                }
                p052o00000oO.OooOO0O OooOO0O2 = OooOO0O();
                WindowInsetsCompat windowInsetsCompat = this.f5403OooO0o;
                oooOO0OOooO = windowInsetsCompat != null ? windowInsetsCompat.f5382OooO00o.OooO() : null;
                int iMin = OooOO0O2.f33992OooO0Oo;
                if (oooOO0OOooO != null) {
                    iMin = Math.min(iMin, oooOO0OOooO.f33992OooO0Oo);
                }
                return p052o00000oO.OooOO0O.OooO0O0(OooOO0O2.f33989OooO00o, 0, OooOO0O2.f33991OooO0OO, iMin);
            }
            p052o00000oO.OooOO0O oooOO0O = p052o00000oO.OooOO0O.f33988OooO0o0;
            if (i == 8) {
                p052o00000oO.OooOO0O[] oooOO0OArr = this.f5402OooO0Oo;
                oooOO0OOooO = oooOO0OArr != null ? oooOO0OArr[Type.OooO00o(8)] : null;
                if (oooOO0OOooO != null) {
                    return oooOO0OOooO;
                }
                p052o00000oO.OooOO0O OooOO0O3 = OooOO0O();
                p052o00000oO.OooOO0O OooOo0O3 = OooOo0O();
                int i3 = OooOO0O3.f33992OooO0Oo;
                if (i3 > OooOo0O3.f33992OooO0Oo) {
                    return p052o00000oO.OooOO0O.OooO0O0(0, 0, 0, i3);
                }
                p052o00000oO.OooOO0O oooOO0O2 = this.f5405OooO0oO;
                return (oooOO0O2 == null || oooOO0O2.equals(oooOO0O) || (i2 = this.f5405OooO0oO.f33992OooO0Oo) <= OooOo0O3.f33992OooO0Oo) ? oooOO0O : p052o00000oO.OooOO0O.OooO0O0(0, 0, 0, i2);
            }
            if (i == 16) {
                return OooOO0();
            }
            if (i == 32) {
                return OooO0oo();
            }
            if (i == 64) {
                return OooOO0o();
            }
            if (i != 128) {
                return oooOO0O;
            }
            WindowInsetsCompat windowInsetsCompat2 = this.f5403OooO0o;
            Oooo000 oooo000OooO0o0 = windowInsetsCompat2 != null ? windowInsetsCompat2.f5382OooO00o.OooO0o0() : OooO0o0();
            if (oooo000OooO0o0 == null) {
                return oooOO0O;
            }
            int i4 = Build.VERSION.SDK_INT;
            DisplayCutout displayCutout = oooo000OooO0o0.f5333OooO00o;
            return p052o00000oO.OooOO0O.OooO0O0(i4 >= 28 ? Oooo000.OooO00o.OooO0Oo(displayCutout) : 0, i4 >= 28 ? Oooo000.OooO00o.OooO0o(displayCutout) : 0, i4 >= 28 ? Oooo000.OooO00o.OooO0o0(displayCutout) : 0, i4 >= 28 ? Oooo000.OooO00o.OooO0OO(displayCutout) : 0);
        }

        public void OooOoO(@NonNull p052o00000oO.OooOO0O oooOO0O) {
            this.f5405OooO0oO = oooOO0O;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f5405OooO0oO, ((OooOO0) obj).f5405OooO0oO);
            }
            return false;
        }
    }

    @RequiresApi(21)
    public static class OooOO0O extends OooOO0 {

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public p052o00000oO.OooOO0O f5406OooOOO0;

        public OooOO0O(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f5406OooOOO0 = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public final p052o00000oO.OooOO0O OooO() {
            if (this.f5406OooOOO0 == null) {
                WindowInsets windowInsets = this.f5401OooO0OO;
                this.f5406OooOOO0 = p052o00000oO.OooOO0O.OooO0O0(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.f5406OooOOO0;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public WindowInsetsCompat OooO0O0() {
            return WindowInsetsCompat.OooOO0(null, this.f5401OooO0OO.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public WindowInsetsCompat OooO0OO() {
            return WindowInsetsCompat.OooOO0(null, this.f5401OooO0OO.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        public boolean OooOOO() {
            return this.f5401OooO0OO.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        public void OooOOoo(@Nullable p052o00000oO.OooOO0O oooOO0O) {
            this.f5406OooOOO0 = oooOO0O;
        }
    }

    @RequiresApi(29)
    public static class OooOOO extends OooOOO0 {

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public p052o00000oO.OooOO0O f5407OooOOO;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public p052o00000oO.OooOO0O f5408OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public p052o00000oO.OooOO0O f5409OooOOOo;

        public OooOOO(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f5407OooOOO = null;
            this.f5408OooOOOO = null;
            this.f5409OooOOOo = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public p052o00000oO.OooOO0O OooO0oo() {
            if (this.f5408OooOOOO == null) {
                this.f5408OooOOOO = p052o00000oO.OooOO0O.OooO0OO(this.f5401OooO0OO.getMandatorySystemGestureInsets());
            }
            return this.f5408OooOOOO;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public p052o00000oO.OooOO0O OooOO0() {
            if (this.f5407OooOOO == null) {
                this.f5407OooOOO = p052o00000oO.OooOO0O.OooO0OO(this.f5401OooO0OO.getSystemGestureInsets());
            }
            return this.f5407OooOOO;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public p052o00000oO.OooOO0O OooOO0o() {
            if (this.f5409OooOOOo == null) {
                this.f5409OooOOOo = p052o00000oO.OooOO0O.OooO0OO(this.f5401OooO0OO.getTappableElementInsets());
            }
            return this.f5409OooOOOo;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOO0, androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public WindowInsetsCompat OooOOO0(int i, int i2, int i3, int i4) {
            return WindowInsetsCompat.OooOO0(null, this.f5401OooO0OO.inset(i, i2, i3, i4));
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOO0O, androidx.core.view.WindowInsetsCompat.OooOo00
        public void OooOOoo(@Nullable p052o00000oO.OooOO0O oooOO0O) {
        }
    }

    @RequiresApi(28)
    public static class OooOOO0 extends OooOO0O {
        public OooOOO0(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public WindowInsetsCompat OooO00o() {
            return WindowInsetsCompat.OooOO0(null, this.f5401OooO0OO.consumeDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @Nullable
        public Oooo000 OooO0o0() {
            DisplayCutout displayCutout = this.f5401OooO0OO.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new Oooo000(displayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOO0, androidx.core.view.WindowInsetsCompat.OooOo00
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooOOO0)) {
                return false;
            }
            OooOOO0 oooOOO0 = (OooOOO0) obj;
            return Objects.equals(this.f5401OooO0OO, oooOOO0.f5401OooO0OO) && Objects.equals(this.f5405OooO0oO, oooOOO0.f5405OooO0oO);
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        public int hashCode() {
            return this.f5401OooO0OO.hashCode();
        }
    }

    @RequiresApi(30)
    public static class OooOOOO extends OooOOO {

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        @NonNull
        public static final WindowInsetsCompat f5410OooOOo0 = WindowInsetsCompat.OooOO0(null, WindowInsets.CONSUMED);

        public OooOOOO(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOO0, androidx.core.view.WindowInsetsCompat.OooOo00
        public final void OooO0Oo(@NonNull View view) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOO0, androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public p052o00000oO.OooOO0O OooO0o(int i) {
            return p052o00000oO.OooOO0O.OooO0OO(this.f5401OooO0OO.getInsets(OooOo.OooO00o(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOO0, androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public p052o00000oO.OooOO0O OooO0oO(int i) {
            return p052o00000oO.OooOO0O.OooO0OO(this.f5401OooO0OO.getInsetsIgnoringVisibility(OooOo.OooO00o(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOO0, androidx.core.view.WindowInsetsCompat.OooOo00
        public boolean OooOOOo(int i) {
            return this.f5401OooO0OO.isVisible(OooOo.OooO00o(i));
        }
    }

    @RequiresApi(30)
    public static final class OooOo {
        public static int OooO00o(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    public static class OooOo00 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public static final WindowInsetsCompat f5411OooO0O0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WindowInsetsCompat f5412OooO00o;

        static {
            OooO oooO0OO;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                oooO0OO = new OooO0o();
            } else {
                oooO0OO = i >= 29 ? new OooO0OO() : new OooO0O0();
            }
            f5411OooO0O0 = oooO0OO.OooO0O0().f5382OooO00o.OooO00o().f5382OooO00o.OooO0O0().f5382OooO00o.OooO0OO();
        }

        public OooOo00(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.f5412OooO00o = windowInsetsCompat;
        }

        @NonNull
        public p052o00000oO.OooOO0O OooO() {
            return p052o00000oO.OooOO0O.f33988OooO0o0;
        }

        @NonNull
        public WindowInsetsCompat OooO00o() {
            return this.f5412OooO00o;
        }

        @NonNull
        public WindowInsetsCompat OooO0O0() {
            return this.f5412OooO00o;
        }

        @NonNull
        public WindowInsetsCompat OooO0OO() {
            return this.f5412OooO00o;
        }

        public void OooO0Oo(@NonNull View view) {
        }

        @NonNull
        public p052o00000oO.OooOO0O OooO0o(int i) {
            return p052o00000oO.OooOO0O.f33988OooO0o0;
        }

        @Nullable
        public Oooo000 OooO0o0() {
            return null;
        }

        @NonNull
        public p052o00000oO.OooOO0O OooO0oO(int i) {
            if ((i & 8) == 0) {
                return p052o00000oO.OooOO0O.f33988OooO0o0;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        @NonNull
        public p052o00000oO.OooOO0O OooO0oo() {
            return OooOO0O();
        }

        @NonNull
        public p052o00000oO.OooOO0O OooOO0() {
            return OooOO0O();
        }

        @NonNull
        public p052o00000oO.OooOO0O OooOO0O() {
            return p052o00000oO.OooOO0O.f33988OooO0o0;
        }

        @NonNull
        public p052o00000oO.OooOO0O OooOO0o() {
            return OooOO0O();
        }

        public boolean OooOOO() {
            return false;
        }

        @NonNull
        public WindowInsetsCompat OooOOO0(int i, int i2, int i3, int i4) {
            return f5411OooO0O0;
        }

        public boolean OooOOOO() {
            return false;
        }

        public boolean OooOOOo(int i) {
            return true;
        }

        public void OooOOo(@Nullable WindowInsetsCompat windowInsetsCompat) {
        }

        public void OooOOo0(p052o00000oO.OooOO0O[] oooOO0OArr) {
        }

        public void OooOOoo(p052o00000oO.OooOO0O oooOO0O) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooOo00)) {
                return false;
            }
            OooOo00 oooOo00 = (OooOo00) obj;
            return OooOOOO() == oooOo00.OooOOOO() && OooOOO() == oooOo00.OooOOO() && o000OO.OooO0OO.OooO00o(OooOO0O(), oooOo00.OooOO0O()) && o000OO.OooO0OO.OooO00o(OooO(), oooOo00.OooO()) && o000OO.OooO0OO.OooO00o(OooO0o0(), oooOo00.OooO0o0());
        }

        public int hashCode() {
            return o000OO.OooO0OO.OooO0O0(Boolean.valueOf(OooOOOO()), Boolean.valueOf(OooOOO()), OooOO0O(), OooO(), OooO0o0());
        }
    }

    public static final class Type {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public @interface InsetsType {
        }

        public static int OooO00o(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException(android.support.v4.media.OooO00o.OooO00o("type needs to be >= FIRST and <= LAST, type=", i));
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f5381OooO0O0 = OooOOOO.f5410OooOOo0;
        } else {
            f5381OooO0O0 = OooOo00.f5411OooO0O0;
        }
    }

    @RequiresApi(20)
    public WindowInsetsCompat(@NonNull WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f5382OooO00o = new OooOOOO(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f5382OooO00o = new OooOOO(this, windowInsets);
        } else if (i >= 28) {
            this.f5382OooO00o = new OooOOO0(this, windowInsets);
        } else {
            this.f5382OooO00o = new OooOO0O(this, windowInsets);
        }
    }

    public static p052o00000oO.OooOO0O OooO0oO(@NonNull p052o00000oO.OooOO0O oooOO0O, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, oooOO0O.f33989OooO00o - i);
        int iMax2 = Math.max(0, oooOO0O.f33990OooO0O0 - i2);
        int iMax3 = Math.max(0, oooOO0O.f33991OooO0OO - i3);
        int iMax4 = Math.max(0, oooOO0O.f33992OooO0Oo - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? oooOO0O : p052o00000oO.OooOO0O.OooO0O0(iMax, iMax2, iMax3, iMax4);
    }

    @NonNull
    @RequiresApi(20)
    public static WindowInsetsCompat OooOO0(@Nullable View view, @NonNull WindowInsets windowInsets) {
        windowInsets.getClass();
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat(windowInsets);
        if (view != null) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            if (ViewCompat.OooOO0O.OooO0O0(view)) {
                WindowInsetsCompat windowInsetsCompatOooO00o = ViewCompat.OooOOOO.OooO00o(view);
                OooOo00 oooOo00 = windowInsetsCompat.f5382OooO00o;
                oooOo00.OooOOo(windowInsetsCompatOooO00o);
                oooOo00.OooO0Oo(view.getRootView());
            }
        }
        return windowInsetsCompat;
    }

    @Nullable
    @RequiresApi(20)
    public final WindowInsets OooO() {
        OooOo00 oooOo00 = this.f5382OooO00o;
        if (oooOo00 instanceof OooOO0) {
            return ((OooOO0) oooOo00).f5401OooO0OO;
        }
        return null;
    }

    @NonNull
    public final p052o00000oO.OooOO0O OooO00o(int i) {
        return this.f5382OooO00o.OooO0o(i);
    }

    @NonNull
    public final p052o00000oO.OooOO0O OooO0O0(int i) {
        return this.f5382OooO00o.OooO0oO(i);
    }

    @Deprecated
    public final int OooO0OO() {
        return this.f5382OooO00o.OooOO0O().f33992OooO0Oo;
    }

    @Deprecated
    public final int OooO0Oo() {
        return this.f5382OooO00o.OooOO0O().f33989OooO00o;
    }

    @Deprecated
    public final int OooO0o() {
        return this.f5382OooO00o.OooOO0O().f33990OooO0O0;
    }

    @Deprecated
    public final int OooO0o0() {
        return this.f5382OooO00o.OooOO0O().f33991OooO0OO;
    }

    @NonNull
    @Deprecated
    public final WindowInsetsCompat OooO0oo(int i, int i2, int i3, int i4) {
        OooO oooO0OO;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            oooO0OO = new OooO0o(this);
        } else {
            oooO0OO = i5 >= 29 ? new OooO0OO(this) : new OooO0O0(this);
        }
        oooO0OO.OooO0oO(p052o00000oO.OooOO0O.OooO0O0(i, i2, i3, i4));
        return oooO0OO.OooO0O0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowInsetsCompat)) {
            return false;
        }
        return o000OO.OooO0OO.OooO00o(this.f5382OooO00o, ((WindowInsetsCompat) obj).f5382OooO00o);
    }

    public final int hashCode() {
        OooOo00 oooOo00 = this.f5382OooO00o;
        if (oooOo00 == null) {
            return 0;
        }
        return oooOo00.hashCode();
    }

    @RequiresApi(api = 20)
    public static class OooO0O0 extends OooO {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static boolean f5389OooO0o = false;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static Field f5390OooO0o0 = null;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static Constructor<WindowInsets> f5391OooO0oO = null;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static boolean f5392OooO0oo = false;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public WindowInsets f5393OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public p052o00000oO.OooOO0O f5394OooO0Oo;

        public OooO0O0() {
            this.f5393OooO0OO = OooO();
        }

        @Nullable
        private static WindowInsets OooO() {
            if (!f5389OooO0o) {
                try {
                    f5390OooO0o0 = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f5389OooO0o = true;
            }
            Field field = f5390OooO0o0;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f5392OooO0oo) {
                try {
                    f5391OooO0oO = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f5392OooO0oo = true;
            }
            Constructor<WindowInsets> constructor = f5391OooO0oO;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooO
        @NonNull
        public WindowInsetsCompat OooO0O0() {
            OooO00o();
            WindowInsetsCompat windowInsetsCompatOooOO0 = WindowInsetsCompat.OooOO0(null, this.f5393OooO0OO);
            p052o00000oO.OooOO0O[] oooOO0OArr = this.f5384OooO0O0;
            OooOo00 oooOo00 = windowInsetsCompatOooOO0.f5382OooO00o;
            oooOo00.OooOOo0(oooOO0OArr);
            oooOo00.OooOOoo(this.f5394OooO0Oo);
            return windowInsetsCompatOooOO0;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooO
        public void OooO0o0(@Nullable p052o00000oO.OooOO0O oooOO0O) {
            this.f5394OooO0Oo = oooOO0O;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooO
        public void OooO0oO(@NonNull p052o00000oO.OooOO0O oooOO0O) {
            WindowInsets windowInsets = this.f5393OooO0OO;
            if (windowInsets != null) {
                this.f5393OooO0OO = windowInsets.replaceSystemWindowInsets(oooOO0O.f33989OooO00o, oooOO0O.f33990OooO0O0, oooOO0O.f33991OooO0OO, oooOO0O.f33992OooO0Oo);
            }
        }

        public OooO0O0(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.f5393OooO0OO = windowInsetsCompat.OooO();
        }
    }

    @RequiresApi(api = 29)
    public static class OooO0OO extends OooO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final WindowInsets.Builder f5395OooO0OO;

        public OooO0OO() {
            this.f5395OooO0OO = oo0o0O0.OooO00o();
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooO
        @NonNull
        public WindowInsetsCompat OooO0O0() {
            OooO00o();
            WindowInsetsCompat windowInsetsCompatOooOO0 = WindowInsetsCompat.OooOO0(null, this.f5395OooO0OO.build());
            windowInsetsCompatOooOO0.f5382OooO00o.OooOOo0(this.f5384OooO0O0);
            return windowInsetsCompatOooOO0;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooO
        public void OooO0Oo(@NonNull p052o00000oO.OooOO0O oooOO0O) {
            this.f5395OooO0OO.setMandatorySystemGestureInsets(oooOO0O.OooO0Oo());
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooO
        public void OooO0o(@NonNull p052o00000oO.OooOO0O oooOO0O) {
            this.f5395OooO0OO.setSystemGestureInsets(oooOO0O.OooO0Oo());
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooO
        public void OooO0o0(@NonNull p052o00000oO.OooOO0O oooOO0O) {
            this.f5395OooO0OO.setStableInsets(oooOO0O.OooO0Oo());
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooO
        public void OooO0oO(@NonNull p052o00000oO.OooOO0O oooOO0O) {
            this.f5395OooO0OO.setSystemWindowInsets(oooOO0O.OooO0Oo());
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooO
        public void OooO0oo(@NonNull p052o00000oO.OooOO0O oooOO0O) {
            this.f5395OooO0OO.setTappableElementInsets(oooOO0O.OooO0Oo());
        }

        public OooO0OO(@NonNull WindowInsetsCompat windowInsetsCompat) {
            WindowInsets.Builder builderOooO00o;
            super(windowInsetsCompat);
            WindowInsets windowInsetsOooO = windowInsetsCompat.OooO();
            if (windowInsetsOooO != null) {
                builderOooO00o = o00O0OO.OooO00o(windowInsetsOooO);
            } else {
                builderOooO00o = oo0o0O0.OooO00o();
            }
            this.f5395OooO0OO = builderOooO00o;
        }
    }

    public WindowInsetsCompat() {
        this.f5382OooO00o = new OooOo00(this);
    }
}
