package o0O00o00;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.o000O0Oo;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO {
    @NonNull
    public static OooO OooO00o(int i) {
        if (i != 0) {
            return i != 1 ? new OooOo() : new OooOO0();
        }
        return new OooOo();
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
        p419o0OoO00O.OooOOO0 oooOOO0 = materialShapeDrawable.f17582OooO0Oo.f17606OooO0O0;
        if (oooOOO0 != null && oooOOO0.f45536OooO00o) {
            float fOooO = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap<View, o000O0Oo> weakHashMap = ViewCompat.f5334OooO00o;
                fOooO += ViewCompat.OooOOO.OooO((View) parent);
            }
            MaterialShapeDrawable.OooO0O0 oooO0O0 = materialShapeDrawable.f17582OooO0Oo;
            if (oooO0O0.f17617OooOOO0 != fOooO) {
                oooO0O0.f17617OooOOO0 = fOooO;
                materialShapeDrawable.OooOo0o();
            }
        }
    }
}
