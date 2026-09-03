package p101o000oOoo;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;
import o000O0O0.o00000O;

/* JADX INFO: loaded from: classes.dex */
public final class oO00OO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final oO00OOOo f29748OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Property<View, Float> f29749OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Property<View, Rect> f29750OooO0OO;

    public class OooO00o extends Property<View, Float> {
        public OooO00o() {
            super(Float.class, "translationAlpha");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(oO00OO0O.OooO00o(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            oO00OO0O.OooO0OO(view, f.floatValue());
        }
    }

    public class OooO0O0 extends Property<View, Rect> {
        public OooO0O0(Class cls) {
            super(cls, "clipBounds");
        }

        @Override // android.util.Property
        public final Rect get(View view) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            return ViewCompat.OooOO0.OooO00o(view);
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            ViewCompat.OooOO0.OooO0OO(view, rect);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f29748OooO00o = new oO00Oo0();
        } else if (i >= 23) {
            f29748OooO00o = new oO00Oo00();
        } else if (i >= 22) {
            f29748OooO00o = new oO00OOo0();
        } else {
            f29748OooO00o = new oO00OOOo();
        }
        f29749OooO0O0 = new OooO00o();
        f29750OooO0OO = new OooO0O0(Rect.class);
    }

    public static float OooO00o(@NonNull View view) {
        return f29748OooO00o.OooO0OO(view);
    }

    public static void OooO0O0(@NonNull View view, int i, int i2, int i3, int i4) {
        f29748OooO00o.OooO00o(view, i, i2, i3, i4);
    }

    public static void OooO0OO(@NonNull View view, float f) {
        f29748OooO00o.OooO0Oo(view, f);
    }

    public static void OooO0Oo(@NonNull View view, int i) {
        f29748OooO00o.OooO0O0(view, i);
    }

    public static void OooO0o(@NonNull View view, @NonNull Matrix matrix) {
        f29748OooO00o.OooO0oO(view, matrix);
    }

    public static void OooO0o0(@NonNull View view, @NonNull Matrix matrix) {
        f29748OooO00o.OooO0o(view, matrix);
    }
}
