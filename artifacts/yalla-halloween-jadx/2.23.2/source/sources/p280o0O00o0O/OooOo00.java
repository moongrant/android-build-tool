package p280o0O00o0O;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000OOo0;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;
import p422o0OoO00O.o00O0O;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 {
    @NonNull
    public static OooOO0O OooO00o(int i) {
        if (i != 0) {
            return i != 1 ? new Oooo0() : new OooOOO0();
        }
        return new Oooo0();
    }

    public static void OooO0O0(@NonNull View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).OooOOO0(f);
        }
    }

    public static void OooO0OO(@NonNull View view) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            OooO0Oo(view, (MaterialShapeDrawable) background);
        }
    }

    public static void OooO0Oo(@NonNull View view, @NonNull MaterialShapeDrawable materialShapeDrawable) {
        o00O0O o00o0o2 = materialShapeDrawable.f17105OooO0Oo.f17129OooO0O0;
        if (o00o0o2 != null && o00o0o2.f46614OooO00o) {
            float fOooO = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
                fOooO += ViewCompat.OooOOO.OooO((View) parent);
            }
            MaterialShapeDrawable.OooO0O0 oooO0O0 = materialShapeDrawable.f17105OooO0Oo;
            if (oooO0O0.f17140OooOOO0 != fOooO) {
                oooO0O0.f17140OooOOO0 = fOooO;
                materialShapeDrawable.OooOo0o();
            }
        }
    }
}
