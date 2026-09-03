package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final int[] f5493OooO00o = {R.attr.state_checked};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final int[] f5494OooO0O0 = new int[0];

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Rect f5495OooO0OO = new Rect();

    @RequiresApi(18)
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final boolean f5496OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final Method f5497OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final Field f5498OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Field f5499OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public static final Field f5500OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public static final Field f5501OooO0o0;

        /* JADX WARN: Code duplicated, block: B:25:0x004b  */
        /* JADX WARN: Code duplicated, block: B:26:0x0058  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z;
            try {
                Class<?> cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", new Class[0]);
                try {
                    field = cls.getField(ViewHierarchyConstants.DIMENSION_LEFT_KEY);
                    try {
                        field2 = cls.getField(ViewHierarchyConstants.DIMENSION_TOP_KEY);
                        try {
                            field3 = cls.getField("right");
                            try {
                                field4 = cls.getField("bottom");
                                z = true;
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                                field4 = null;
                                z = false;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                            field3 = null;
                        }
                    } catch (ClassNotFoundException unused3) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z = false;
                        if (z) {
                            f5497OooO0O0 = method;
                            f5498OooO0OO = field;
                            f5499OooO0Oo = field2;
                            f5501OooO0o0 = field3;
                            f5500OooO0o = field4;
                            f5496OooO00o = true;
                            return;
                        }
                        f5497OooO0O0 = null;
                        f5498OooO0OO = null;
                        f5499OooO0Oo = null;
                        f5501OooO0o0 = null;
                        f5500OooO0o = null;
                        f5496OooO00o = false;
                    } catch (NoSuchFieldException unused4) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z = false;
                        if (z) {
                            f5497OooO0O0 = method;
                            f5498OooO0OO = field;
                            f5499OooO0Oo = field2;
                            f5501OooO0o0 = field3;
                            f5500OooO0o = field4;
                            f5496OooO00o = true;
                            return;
                        }
                        f5497OooO0O0 = null;
                        f5498OooO0OO = null;
                        f5499OooO0Oo = null;
                        f5501OooO0o0 = null;
                        f5500OooO0o = null;
                        f5496OooO00o = false;
                    } catch (NoSuchMethodException unused5) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z = false;
                        if (z) {
                            f5497OooO0O0 = method;
                            f5498OooO0OO = field;
                            f5499OooO0Oo = field2;
                            f5501OooO0o0 = field3;
                            f5500OooO0o = field4;
                            f5496OooO00o = true;
                            return;
                        }
                        f5497OooO0O0 = null;
                        f5498OooO0OO = null;
                        f5499OooO0Oo = null;
                        f5501OooO0o0 = null;
                        f5500OooO0o = null;
                        f5496OooO00o = false;
                    }
                } catch (ClassNotFoundException unused6) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        f5497OooO0O0 = method;
                        f5498OooO0OO = field;
                        f5499OooO0Oo = field2;
                        f5501OooO0o0 = field3;
                        f5500OooO0o = field4;
                        f5496OooO00o = true;
                        return;
                    }
                    f5497OooO0O0 = null;
                    f5498OooO0OO = null;
                    f5499OooO0Oo = null;
                    f5501OooO0o0 = null;
                    f5500OooO0o = null;
                    f5496OooO00o = false;
                } catch (NoSuchFieldException unused7) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        f5497OooO0O0 = method;
                        f5498OooO0OO = field;
                        f5499OooO0Oo = field2;
                        f5501OooO0o0 = field3;
                        f5500OooO0o = field4;
                        f5496OooO00o = true;
                        return;
                    }
                    f5497OooO0O0 = null;
                    f5498OooO0OO = null;
                    f5499OooO0Oo = null;
                    f5501OooO0o0 = null;
                    f5500OooO0o = null;
                    f5496OooO00o = false;
                } catch (NoSuchMethodException unused8) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z = false;
                    if (z) {
                        f5497OooO0O0 = method;
                        f5498OooO0OO = field;
                        f5499OooO0Oo = field2;
                        f5501OooO0o0 = field3;
                        f5500OooO0o = field4;
                        f5496OooO00o = true;
                        return;
                    }
                    f5497OooO0O0 = null;
                    f5498OooO0OO = null;
                    f5499OooO0Oo = null;
                    f5501OooO0o0 = null;
                    f5500OooO0o = null;
                    f5496OooO00o = false;
                }
            } catch (ClassNotFoundException unused9) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused10) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused11) {
                method = null;
                field = null;
            }
            if (z) {
                f5497OooO0O0 = method;
                f5498OooO0OO = field;
                f5499OooO0Oo = field2;
                f5501OooO0o0 = field3;
                f5500OooO0o = field4;
                f5496OooO00o = true;
                return;
            }
            f5497OooO0O0 = null;
            f5498OooO0OO = null;
            f5499OooO0Oo = null;
            f5501OooO0o0 = null;
            f5500OooO0o = null;
            f5496OooO00o = false;
        }
    }

    @RequiresApi(29)
    public static class OooO0O0 {
        @DoNotInline
        public static Insets OooO00o(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static void OooO00o(@NonNull Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i == 21 && "android.graphics.drawable.VectorDrawable".equals(name)) {
            OooO0O0(drawable);
        } else {
            if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
                return;
            }
            OooO0O0(drawable);
        }
    }

    public static void OooO0O0(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f5493OooO00o);
        } else {
            drawable.setState(f5494OooO0O0);
        }
        drawable.setState(state);
    }

    @NonNull
    public static Rect OooO0OO(@NonNull Drawable drawable) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            Insets insetsOooO00o = OooO0O0.OooO00o(drawable);
            return new Rect(insetsOooO00o.left, insetsOooO00o.top, insetsOooO00o.right, insetsOooO00o.bottom);
        }
        Drawable drawableOooO0Oo = p084o000Ooo.o0OOO0o.OooO0Oo(drawable);
        boolean z = OooO00o.f5496OooO00o;
        if (i < 29 && OooO00o.f5496OooO00o) {
            try {
                Object objInvoke = OooO00o.f5497OooO0O0.invoke(drawableOooO0Oo, new Object[0]);
                if (objInvoke != null) {
                    return new Rect(OooO00o.f5498OooO0OO.getInt(objInvoke), OooO00o.f5499OooO0Oo.getInt(objInvoke), OooO00o.f5501OooO0o0.getInt(objInvoke), OooO00o.f5500OooO0o.getInt(objInvoke));
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        return f5495OooO0OO;
    }

    public static PorterDuff.Mode OooO0Oo(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
