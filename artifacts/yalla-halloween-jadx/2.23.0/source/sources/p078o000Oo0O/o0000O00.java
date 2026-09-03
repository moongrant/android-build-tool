package p078o000Oo0O;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o000Oo0 f34939OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o f34940OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0O0 f34941OooO0OO;

    public class OooO00o extends Property<View, Float> {
        public OooO00o() {
            super(Float.class, "translationAlpha");
        }

        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(o0000O00.f34939OooO00o.OooO0O0(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            o0000O00.OooO0O0(view, f.floatValue());
        }
    }

    public class OooO0O0 extends Property<View, Rect> {
        public OooO0O0() {
            super(Rect.class, "clipBounds");
        }

        @Override // android.util.Property
        public final Rect get(View view) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            return ViewCompat.OooOO0.OooO00o(view);
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
            ViewCompat.OooOO0.OooO0OO(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f34939OooO00o = new o000O00();
        } else {
            f34939OooO00o = new o000Oo0();
        }
        f34940OooO0O0 = new OooO00o();
        f34941OooO0OO = new OooO0O0();
    }

    public static void OooO00o(@NonNull View view, int i, int i2, int i3, int i4) {
        f34939OooO00o.OooO0oO(view, i, i2, i3, i4);
    }

    public static void OooO0O0(@NonNull View view, float f) {
        f34939OooO00o.OooO0OO(view, f);
    }

    public static void OooO0OO(int i, @NonNull View view) {
        f34939OooO00o.OooO00o(i, view);
    }
}
