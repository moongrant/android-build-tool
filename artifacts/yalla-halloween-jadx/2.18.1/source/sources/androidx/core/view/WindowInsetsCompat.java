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
import o000O0O0.o00000O;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsCompat {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public static final WindowInsetsCompat f7917OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOo00 f7918OooO00o;

    public static class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WindowInsetsCompat f7919OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public p071o000O0o.OooO[] f7920OooO0O0;

        public OooO() {
            this(new WindowInsetsCompat());
        }

        public final void OooO00o() {
            p071o000O0o.OooO[] oooOArr = this.f7920OooO0O0;
            if (oooOArr != null) {
                p071o000O0o.OooO oooOOooO0Oo = oooOArr[Type.OooO00o(1)];
                p071o000O0o.OooO oooOOooO0Oo2 = this.f7920OooO0O0[Type.OooO00o(2)];
                if (oooOOooO0Oo2 == null) {
                    oooOOooO0Oo2 = this.f7919OooO00o.OooO0Oo(2);
                }
                if (oooOOooO0Oo == null) {
                    oooOOooO0Oo = this.f7919OooO00o.OooO0Oo(1);
                }
                OooO0oO(p071o000O0o.OooO.OooO00o(oooOOooO0Oo, oooOOooO0Oo2));
                p071o000O0o.OooO oooO = this.f7920OooO0O0[Type.OooO00o(16)];
                if (oooO != null) {
                    OooO0o(oooO);
                }
                p071o000O0o.OooO oooO2 = this.f7920OooO0O0[Type.OooO00o(32)];
                if (oooO2 != null) {
                    OooO0Oo(oooO2);
                }
                p071o000O0o.OooO oooO3 = this.f7920OooO0O0[Type.OooO00o(64)];
                if (oooO3 != null) {
                    OooO0oo(oooO3);
                }
            }
        }

        @NonNull
        public WindowInsetsCompat OooO0O0() {
            throw null;
        }

        public void OooO0OO(int i, @NonNull p071o000O0o.OooO oooO) {
            if (this.f7920OooO0O0 == null) {
                this.f7920OooO0O0 = new p071o000O0o.OooO[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.f7920OooO0O0[Type.OooO00o(i2)] = oooO;
                }
            }
        }

        public void OooO0Oo(@NonNull p071o000O0o.OooO oooO) {
        }

        public void OooO0o(@NonNull p071o000O0o.OooO oooO) {
        }

        public void OooO0o0(@NonNull p071o000O0o.OooO oooO) {
            throw null;
        }

        public void OooO0oO(@NonNull p071o000O0o.OooO oooO) {
            throw null;
        }

        public void OooO0oo(@NonNull p071o000O0o.OooO oooO) {
        }

        public OooO(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.f7919OooO00o = windowInsetsCompat;
        }
    }

    @RequiresApi(21)
    @SuppressLint({"SoonBlockedPrivateApi"})
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static Field f7921OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static Field f7922OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static Field f7923OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static boolean f7924OooO0Oo;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f7921OooO00o = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f7922OooO0O0 = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f7923OooO0OO = declaredField3;
                declaredField3.setAccessible(true);
                f7924OooO0Oo = true;
            } catch (ReflectiveOperationException e) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Failed to get visible insets from AttachInfo ");
                sbOooO0o0.append(e.getMessage());
                Log.w("WindowInsetsCompat", sbOooO0o0.toString(), e);
            }
        }
    }

    @RequiresApi(30)
    public static class OooO0o extends OooO0OO {
        public OooO0o() {
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooO
        public void OooO0OO(int i, @NonNull p071o000O0o.OooO oooO) {
            this.f7931OooO0OO.setInsets(OooOo.OooO00o(i), oooO.OooO0o0());
        }

        public OooO0o(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    @RequiresApi(20)
    public static class OooOO0 extends OooOo00 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public static Method f7932OooO = null;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static boolean f7933OooO0oo = false;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public static Class<?> f7934OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public static Field f7935OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public static Field f7936OooOO0o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NonNull
        public final WindowInsets f7937OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public p071o000O0o.OooO[] f7938OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public WindowInsetsCompat f7939OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public p071o000O0o.OooO f7940OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public p071o000O0o.OooO f7941OooO0oO;

        public OooOO0(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.f7940OooO0o0 = null;
            this.f7937OooO0OO = windowInsets;
        }

        @NonNull
        @SuppressLint({"WrongConstant"})
        private p071o000O0o.OooO OooOo00(int i, boolean z) {
            p071o000O0o.OooO oooOOooO00o = p071o000O0o.OooO.f28161OooO0o0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    oooOOooO00o = p071o000O0o.OooO.OooO00o(oooOOooO00o, OooOo0(i2, z));
                }
            }
            return oooOOooO00o;
        }

        private p071o000O0o.OooO OooOo0O() {
            WindowInsetsCompat windowInsetsCompat = this.f7939OooO0o;
            return windowInsetsCompat != null ? windowInsetsCompat.f7918OooO00o.OooO() : p071o000O0o.OooO.f28161OooO0o0;
        }

        @Nullable
        private p071o000O0o.OooO OooOo0o(@NonNull View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f7933OooO0oo) {
                OooOoO0();
            }
            Method method = f7932OooO;
            if (method != null && f7934OooOO0 != null && f7935OooOO0O != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f7935OooOO0O.get(f7936OooOO0o.get(objInvoke));
                    if (rect != null) {
                        return p071o000O0o.OooO.OooO0OO(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Failed to get visible insets. (Reflection error). ");
                    sbOooO0o0.append(e.getMessage());
                    Log.e("WindowInsetsCompat", sbOooO0o0.toString(), e);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void OooOoO0() {
            try {
                f7932OooO = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f7934OooOO0 = cls;
                f7935OooOO0O = cls.getDeclaredField("mVisibleInsets");
                f7936OooOO0o = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f7935OooOO0O.setAccessible(true);
                f7936OooOO0o.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Failed to get visible insets. (Reflection error). ");
                sbOooO0o0.append(e.getMessage());
                Log.e("WindowInsetsCompat", sbOooO0o0.toString(), e);
            }
            f7933OooO0oo = true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        public void OooO0Oo(@NonNull View view) {
            p071o000O0o.OooO oooOOooOo0o = OooOo0o(view);
            if (oooOOooOo0o == null) {
                oooOOooOo0o = p071o000O0o.OooO.f28161OooO0o0;
            }
            OooOoO(oooOOooOo0o);
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public p071o000O0o.OooO OooO0o(int i) {
            return OooOo00(i, false);
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public p071o000O0o.OooO OooO0oO(int i) {
            return OooOo00(i, true);
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public final p071o000O0o.OooO OooOO0O() {
            if (this.f7940OooO0o0 == null) {
                this.f7940OooO0o0 = p071o000O0o.OooO.OooO0O0(this.f7937OooO0OO.getSystemWindowInsetLeft(), this.f7937OooO0OO.getSystemWindowInsetTop(), this.f7937OooO0OO.getSystemWindowInsetRight(), this.f7937OooO0OO.getSystemWindowInsetBottom());
            }
            return this.f7940OooO0o0;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public WindowInsetsCompat OooOOO0(int i, int i2, int i3, int i4) {
            OooO oooO0OO;
            WindowInsetsCompat windowInsetsCompatOooOOOO = WindowInsetsCompat.OooOOOO(this.f7937OooO0OO, null);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30) {
                oooO0OO = new OooO0o(windowInsetsCompatOooOOOO);
            } else {
                oooO0OO = i5 >= 29 ? new OooO0OO(windowInsetsCompatOooOOOO) : new OooO0O0(windowInsetsCompatOooOOOO);
            }
            oooO0OO.OooO0oO(WindowInsetsCompat.OooOO0(OooOO0O(), i, i2, i3, i4));
            oooO0OO.OooO0o0(WindowInsetsCompat.OooOO0(OooO(), i, i2, i3, i4));
            return oooO0OO.OooO0O0();
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        public boolean OooOOOO() {
            return this.f7937OooO0OO.isRound();
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
            this.f7939OooO0o = windowInsetsCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        public void OooOOo0(p071o000O0o.OooO[] oooOArr) {
            this.f7938OooO0Oo = oooOArr;
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
            return !OooOo0(i, false).equals(p071o000O0o.OooO.f28161OooO0o0);
        }

        @NonNull
        public p071o000O0o.OooO OooOo0(int i, boolean z) {
            p071o000O0o.OooO OooO2;
            int i2;
            if (i == 1) {
                return z ? p071o000O0o.OooO.OooO0O0(0, Math.max(OooOo0O().f28163OooO0O0, OooOO0O().f28163OooO0O0), 0, 0) : p071o000O0o.OooO.OooO0O0(0, OooOO0O().f28163OooO0O0, 0, 0);
            }
            if (i == 2) {
                if (z) {
                    p071o000O0o.OooO oooOOooOo0O = OooOo0O();
                    p071o000O0o.OooO OooO3 = OooO();
                    return p071o000O0o.OooO.OooO0O0(Math.max(oooOOooOo0O.f28162OooO00o, OooO3.f28162OooO00o), 0, Math.max(oooOOooOo0O.f28164OooO0OO, OooO3.f28164OooO0OO), Math.max(oooOOooOo0O.f28165OooO0Oo, OooO3.f28165OooO0Oo));
                }
                p071o000O0o.OooO oooOOooOO0O = OooOO0O();
                WindowInsetsCompat windowInsetsCompat = this.f7939OooO0o;
                OooO2 = windowInsetsCompat != null ? windowInsetsCompat.f7918OooO00o.OooO() : null;
                int iMin = oooOOooOO0O.f28165OooO0Oo;
                if (OooO2 != null) {
                    iMin = Math.min(iMin, OooO2.f28165OooO0Oo);
                }
                return p071o000O0o.OooO.OooO0O0(oooOOooOO0O.f28162OooO00o, 0, oooOOooOO0O.f28164OooO0OO, iMin);
            }
            if (i == 8) {
                p071o000O0o.OooO[] oooOArr = this.f7938OooO0Oo;
                OooO2 = oooOArr != null ? oooOArr[Type.OooO00o(8)] : null;
                if (OooO2 != null) {
                    return OooO2;
                }
                p071o000O0o.OooO oooOOooOO0O2 = OooOO0O();
                p071o000O0o.OooO oooOOooOo0O2 = OooOo0O();
                int i3 = oooOOooOO0O2.f28165OooO0Oo;
                if (i3 > oooOOooOo0O2.f28165OooO0Oo) {
                    return p071o000O0o.OooO.OooO0O0(0, 0, 0, i3);
                }
                p071o000O0o.OooO oooO = this.f7941OooO0oO;
                return (oooO == null || oooO.equals(p071o000O0o.OooO.f28161OooO0o0) || (i2 = this.f7941OooO0oO.f28165OooO0Oo) <= oooOOooOo0O2.f28165OooO0Oo) ? p071o000O0o.OooO.f28161OooO0o0 : p071o000O0o.OooO.OooO0O0(0, 0, 0, i2);
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
                return p071o000O0o.OooO.f28161OooO0o0;
            }
            WindowInsetsCompat windowInsetsCompat2 = this.f7939OooO0o;
            o000O0O0.OooO0O0 oooO0O0OooO0OO = windowInsetsCompat2 != null ? windowInsetsCompat2.OooO0OO() : OooO0o0();
            if (oooO0O0OooO0OO == null) {
                return p071o000O0o.OooO.f28161OooO0o0;
            }
            int i4 = Build.VERSION.SDK_INT;
            return p071o000O0o.OooO.OooO0O0(i4 >= 28 ? o000O0O0.OooO0O0.OooO00o.OooO0Oo(oooO0O0OooO0OO.f28103OooO00o) : 0, i4 >= 28 ? o000O0O0.OooO0O0.OooO00o.OooO0o(oooO0O0OooO0OO.f28103OooO00o) : 0, i4 >= 28 ? o000O0O0.OooO0O0.OooO00o.OooO0o0(oooO0O0OooO0OO.f28103OooO00o) : 0, i4 >= 28 ? o000O0O0.OooO0O0.OooO00o.OooO0OO(oooO0O0OooO0OO.f28103OooO00o) : 0);
        }

        public void OooOoO(@NonNull p071o000O0o.OooO oooO) {
            this.f7941OooO0oO = oooO;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f7941OooO0oO, ((OooOO0) obj).f7941OooO0oO);
            }
            return false;
        }
    }

    @RequiresApi(21)
    public static class OooOO0O extends OooOO0 {

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public p071o000O0o.OooO f7942OooOOO0;

        public OooOO0O(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f7942OooOOO0 = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public final p071o000O0o.OooO OooO() {
            if (this.f7942OooOOO0 == null) {
                this.f7942OooOOO0 = p071o000O0o.OooO.OooO0O0(this.f7937OooO0OO.getStableInsetLeft(), this.f7937OooO0OO.getStableInsetTop(), this.f7937OooO0OO.getStableInsetRight(), this.f7937OooO0OO.getStableInsetBottom());
            }
            return this.f7942OooOOO0;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public WindowInsetsCompat OooO0O0() {
            return WindowInsetsCompat.OooOOOO(this.f7937OooO0OO.consumeStableInsets(), null);
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public WindowInsetsCompat OooO0OO() {
            return WindowInsetsCompat.OooOOOO(this.f7937OooO0OO.consumeSystemWindowInsets(), null);
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        public boolean OooOOO() {
            return this.f7937OooO0OO.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        public void OooOOoo(@Nullable p071o000O0o.OooO oooO) {
            this.f7942OooOOO0 = oooO;
        }
    }

    @RequiresApi(29)
    public static class OooOOO extends OooOOO0 {

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public p071o000O0o.OooO f7943OooOOO;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public p071o000O0o.OooO f7944OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public p071o000O0o.OooO f7945OooOOOo;

        public OooOOO(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f7943OooOOO = null;
            this.f7944OooOOOO = null;
            this.f7945OooOOOo = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public p071o000O0o.OooO OooO0oo() {
            if (this.f7944OooOOOO == null) {
                this.f7944OooOOOO = p071o000O0o.OooO.OooO0Oo(this.f7937OooO0OO.getMandatorySystemGestureInsets());
            }
            return this.f7944OooOOOO;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public p071o000O0o.OooO OooOO0() {
            if (this.f7943OooOOO == null) {
                this.f7943OooOOO = p071o000O0o.OooO.OooO0Oo(this.f7937OooO0OO.getSystemGestureInsets());
            }
            return this.f7943OooOOO;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public p071o000O0o.OooO OooOO0o() {
            if (this.f7945OooOOOo == null) {
                this.f7945OooOOOo = p071o000O0o.OooO.OooO0Oo(this.f7937OooO0OO.getTappableElementInsets());
            }
            return this.f7945OooOOOo;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOO0, androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public WindowInsetsCompat OooOOO0(int i, int i2, int i3, int i4) {
            return WindowInsetsCompat.OooOOOO(this.f7937OooO0OO.inset(i, i2, i3, i4), null);
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOO0O, androidx.core.view.WindowInsetsCompat.OooOo00
        public void OooOOoo(@Nullable p071o000O0o.OooO oooO) {
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
            return WindowInsetsCompat.OooOOOO(this.f7937OooO0OO.consumeDisplayCutout(), null);
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        @Nullable
        public o000O0O0.OooO0O0 OooO0o0() {
            DisplayCutout displayCutout = this.f7937OooO0OO.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new o000O0O0.OooO0O0(displayCutout);
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
            return Objects.equals(this.f7937OooO0OO, oooOOO0.f7937OooO0OO) && Objects.equals(this.f7941OooO0oO, oooOOO0.f7941OooO0oO);
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOo00
        public int hashCode() {
            return this.f7937OooO0OO.hashCode();
        }
    }

    @RequiresApi(30)
    public static class OooOOOO extends OooOOO {

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        @NonNull
        public static final WindowInsetsCompat f7946OooOOo0 = WindowInsetsCompat.OooOOOO(WindowInsets.CONSUMED, null);

        public OooOOOO(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOO0, androidx.core.view.WindowInsetsCompat.OooOo00
        public final void OooO0Oo(@NonNull View view) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOO0, androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public p071o000O0o.OooO OooO0o(int i) {
            return p071o000O0o.OooO.OooO0Oo(this.f7937OooO0OO.getInsets(OooOo.OooO00o(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOO0, androidx.core.view.WindowInsetsCompat.OooOo00
        @NonNull
        public p071o000O0o.OooO OooO0oO(int i) {
            return p071o000O0o.OooO.OooO0Oo(this.f7937OooO0OO.getInsetsIgnoringVisibility(OooOo.OooO00o(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooOO0, androidx.core.view.WindowInsetsCompat.OooOo00
        public boolean OooOOOo(int i) {
            return this.f7937OooO0OO.isVisible(OooOo.OooO00o(i));
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
        public static final WindowInsetsCompat f7947OooO0O0;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WindowInsetsCompat f7948OooO00o;

        static {
            OooO oooO0OO;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                oooO0OO = new OooO0o();
            } else {
                oooO0OO = i >= 29 ? new OooO0OO() : new OooO0O0();
            }
            f7947OooO0O0 = oooO0OO.OooO0O0().f7918OooO00o.OooO00o().f7918OooO00o.OooO0O0().OooO00o();
        }

        public OooOo00(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.f7948OooO00o = windowInsetsCompat;
        }

        @NonNull
        public p071o000O0o.OooO OooO() {
            return p071o000O0o.OooO.f28161OooO0o0;
        }

        @NonNull
        public WindowInsetsCompat OooO00o() {
            return this.f7948OooO00o;
        }

        @NonNull
        public WindowInsetsCompat OooO0O0() {
            return this.f7948OooO00o;
        }

        @NonNull
        public WindowInsetsCompat OooO0OO() {
            return this.f7948OooO00o;
        }

        public void OooO0Oo(@NonNull View view) {
        }

        @NonNull
        public p071o000O0o.OooO OooO0o(int i) {
            return p071o000O0o.OooO.f28161OooO0o0;
        }

        @Nullable
        public o000O0O0.OooO0O0 OooO0o0() {
            return null;
        }

        @NonNull
        public p071o000O0o.OooO OooO0oO(int i) {
            if ((i & 8) == 0) {
                return p071o000O0o.OooO.f28161OooO0o0;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        @NonNull
        public p071o000O0o.OooO OooO0oo() {
            return OooOO0O();
        }

        @NonNull
        public p071o000O0o.OooO OooOO0() {
            return OooOO0O();
        }

        @NonNull
        public p071o000O0o.OooO OooOO0O() {
            return p071o000O0o.OooO.f28161OooO0o0;
        }

        @NonNull
        public p071o000O0o.OooO OooOO0o() {
            return OooOO0O();
        }

        public boolean OooOOO() {
            return false;
        }

        @NonNull
        public WindowInsetsCompat OooOOO0(int i, int i2, int i3, int i4) {
            return f7947OooO0O0;
        }

        public boolean OooOOOO() {
            return false;
        }

        public boolean OooOOOo(int i) {
            return true;
        }

        public void OooOOo(@Nullable WindowInsetsCompat windowInsetsCompat) {
        }

        public void OooOOo0(p071o000O0o.OooO[] oooOArr) {
        }

        public void OooOOoo(p071o000O0o.OooO oooO) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooOo00)) {
                return false;
            }
            OooOo00 oooOo00 = (OooOo00) obj;
            return OooOOOO() == oooOo00.OooOOOO() && OooOOO() == oooOo00.OooOOO() && o000OO0O.OooO0OO.OooO00o(OooOO0O(), oooOo00.OooOO0O()) && o000OO0O.OooO0OO.OooO00o(OooO(), oooOo00.OooO()) && o000OO0O.OooO0OO.OooO00o(OooO0o0(), oooOo00.OooO0o0());
        }

        public int hashCode() {
            return o000OO0O.OooO0OO.OooO0O0(Boolean.valueOf(OooOOOO()), Boolean.valueOf(OooOOO()), OooOO0O(), OooO(), OooO0o0());
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
            f7917OooO0O0 = OooOOOO.f7946OooOOo0;
        } else {
            f7917OooO0O0 = OooOo00.f7947OooO0O0;
        }
    }

    @RequiresApi(20)
    public WindowInsetsCompat(@NonNull WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f7918OooO00o = new OooOOOO(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f7918OooO00o = new OooOOO(this, windowInsets);
        } else if (i >= 28) {
            this.f7918OooO00o = new OooOOO0(this, windowInsets);
        } else {
            this.f7918OooO00o = new OooOO0O(this, windowInsets);
        }
    }

    public static p071o000O0o.OooO OooOO0(@NonNull p071o000O0o.OooO oooO, int i, int i2, int i3, int i4) {
        int iMax = Math.max(0, oooO.f28162OooO00o - i);
        int iMax2 = Math.max(0, oooO.f28163OooO0O0 - i2);
        int iMax3 = Math.max(0, oooO.f28164OooO0OO - i3);
        int iMax4 = Math.max(0, oooO.f28165OooO0Oo - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? oooO : p071o000O0o.OooO.OooO0O0(iMax, iMax2, iMax3, iMax4);
    }

    @NonNull
    @RequiresApi(20)
    public static WindowInsetsCompat OooOOOO(@NonNull WindowInsets windowInsets, @Nullable View view) {
        Objects.requireNonNull(windowInsets);
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat(windowInsets);
        if (view != null) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if (ViewCompat.OooOO0O.OooO0O0(view)) {
                windowInsetsCompat.OooOOO0(ViewCompat.OooOOO0(view));
                windowInsetsCompat.OooO0O0(view.getRootView());
            }
        }
        return windowInsetsCompat;
    }

    @Deprecated
    public final int OooO() {
        return this.f7918OooO00o.OooOO0O().f28163OooO0O0;
    }

    @NonNull
    @Deprecated
    public final WindowInsetsCompat OooO00o() {
        return this.f7918OooO00o.OooO0OO();
    }

    public final void OooO0O0(@NonNull View view) {
        this.f7918OooO00o.OooO0Oo(view);
    }

    @Nullable
    public final o000O0O0.OooO0O0 OooO0OO() {
        return this.f7918OooO00o.OooO0o0();
    }

    @NonNull
    public final p071o000O0o.OooO OooO0Oo(int i) {
        return this.f7918OooO00o.OooO0o(i);
    }

    @Deprecated
    public final int OooO0o() {
        return this.f7918OooO00o.OooOO0O().f28165OooO0Oo;
    }

    @NonNull
    public final p071o000O0o.OooO OooO0o0(int i) {
        return this.f7918OooO00o.OooO0oO(i);
    }

    @Deprecated
    public final int OooO0oO() {
        return this.f7918OooO00o.OooOO0O().f28162OooO00o;
    }

    @Deprecated
    public final int OooO0oo() {
        return this.f7918OooO00o.OooOO0O().f28164OooO0OO;
    }

    public final boolean OooOO0O() {
        return this.f7918OooO00o.OooOOO();
    }

    @NonNull
    @Deprecated
    public final WindowInsetsCompat OooOO0o(int i, int i2, int i3, int i4) {
        OooO oooO0OO;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            oooO0OO = new OooO0o(this);
        } else {
            oooO0OO = i5 >= 29 ? new OooO0OO(this) : new OooO0O0(this);
        }
        oooO0OO.OooO0oO(p071o000O0o.OooO.OooO0O0(i, i2, i3, i4));
        return oooO0OO.OooO0O0();
    }

    @Nullable
    @RequiresApi(20)
    public final WindowInsets OooOOO() {
        OooOo00 oooOo00 = this.f7918OooO00o;
        if (oooOo00 instanceof OooOO0) {
            return ((OooOO0) oooOo00).f7937OooO0OO;
        }
        return null;
    }

    public final void OooOOO0(@Nullable WindowInsetsCompat windowInsetsCompat) {
        this.f7918OooO00o.OooOOo(windowInsetsCompat);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WindowInsetsCompat) {
            return o000OO0O.OooO0OO.OooO00o(this.f7918OooO00o, ((WindowInsetsCompat) obj).f7918OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        OooOo00 oooOo00 = this.f7918OooO00o;
        if (oooOo00 == null) {
            return 0;
        }
        return oooOo00.hashCode();
    }

    @RequiresApi(api = 20)
    public static class OooO0O0 extends OooO {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static boolean f7925OooO0o = false;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static Field f7926OooO0o0 = null;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static Constructor<WindowInsets> f7927OooO0oO = null;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public static boolean f7928OooO0oo = false;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public WindowInsets f7929OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public p071o000O0o.OooO f7930OooO0Oo;

        public OooO0O0() {
            this.f7929OooO0OO = OooO();
        }

        @Nullable
        private static WindowInsets OooO() {
            if (!f7925OooO0o) {
                try {
                    f7926OooO0o0 = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f7925OooO0o = true;
            }
            Field field = f7926OooO0o0;
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
            if (!f7928OooO0oo) {
                try {
                    f7927OooO0oO = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f7928OooO0oo = true;
            }
            Constructor<WindowInsets> constructor = f7927OooO0oO;
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
            WindowInsetsCompat windowInsetsCompatOooOOOO = WindowInsetsCompat.OooOOOO(this.f7929OooO0OO, null);
            windowInsetsCompatOooOOOO.f7918OooO00o.OooOOo0(this.f7920OooO0O0);
            windowInsetsCompatOooOOOO.f7918OooO00o.OooOOoo(this.f7930OooO0Oo);
            return windowInsetsCompatOooOOOO;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooO
        public void OooO0o0(@Nullable p071o000O0o.OooO oooO) {
            this.f7930OooO0Oo = oooO;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooO
        public void OooO0oO(@NonNull p071o000O0o.OooO oooO) {
            WindowInsets windowInsets = this.f7929OooO0OO;
            if (windowInsets != null) {
                this.f7929OooO0OO = windowInsets.replaceSystemWindowInsets(oooO.f28162OooO00o, oooO.f28163OooO0O0, oooO.f28164OooO0OO, oooO.f28165OooO0Oo);
            }
        }

        public OooO0O0(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.f7929OooO0OO = windowInsetsCompat.OooOOO();
        }
    }

    @RequiresApi(api = 29)
    public static class OooO0OO extends OooO {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final WindowInsets.Builder f7931OooO0OO;

        public OooO0OO() {
            this.f7931OooO0OO = new WindowInsets.Builder();
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooO
        @NonNull
        public WindowInsetsCompat OooO0O0() {
            OooO00o();
            WindowInsetsCompat windowInsetsCompatOooOOOO = WindowInsetsCompat.OooOOOO(this.f7931OooO0OO.build(), null);
            windowInsetsCompatOooOOOO.f7918OooO00o.OooOOo0(this.f7920OooO0O0);
            return windowInsetsCompatOooOOOO;
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooO
        public void OooO0Oo(@NonNull p071o000O0o.OooO oooO) {
            this.f7931OooO0OO.setMandatorySystemGestureInsets(oooO.OooO0o0());
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooO
        public void OooO0o(@NonNull p071o000O0o.OooO oooO) {
            this.f7931OooO0OO.setSystemGestureInsets(oooO.OooO0o0());
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooO
        public void OooO0o0(@NonNull p071o000O0o.OooO oooO) {
            this.f7931OooO0OO.setStableInsets(oooO.OooO0o0());
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooO
        public void OooO0oO(@NonNull p071o000O0o.OooO oooO) {
            this.f7931OooO0OO.setSystemWindowInsets(oooO.OooO0o0());
        }

        @Override // androidx.core.view.WindowInsetsCompat.OooO
        public void OooO0oo(@NonNull p071o000O0o.OooO oooO) {
            this.f7931OooO0OO.setTappableElementInsets(oooO.OooO0o0());
        }

        public OooO0OO(@NonNull WindowInsetsCompat windowInsetsCompat) {
            WindowInsets.Builder builder;
            super(windowInsetsCompat);
            WindowInsets windowInsetsOooOOO = windowInsetsCompat.OooOOO();
            if (windowInsetsOooOOO != null) {
                builder = new WindowInsets.Builder(windowInsetsOooOOO);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f7931OooO0OO = builder;
        }
    }

    public WindowInsetsCompat() {
        this.f7918OooO00o = new OooOo00(this);
    }
}
