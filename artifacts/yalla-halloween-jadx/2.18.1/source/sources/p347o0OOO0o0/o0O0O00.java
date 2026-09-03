package p347o0OOO0o0;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.internal.o00Ooo;
import com.google.android.material.shape.MaterialShapeDrawable;
import p343o0OO0ooO.o0OOOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 {
    @NonNull
    public static o0OOO0o OooO00o(int i) {
        if (i != 0) {
            return i != 1 ? new o000000O() : new o0Oo0oo();
        }
        return new o000000O();
    }

    public static void OooO0O0(@NonNull View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).OooOOOO(f);
        }
    }

    public static void OooO0OO(@NonNull View view) {
        Drawable background = view.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            OooO0Oo(view, (MaterialShapeDrawable) background);
        }
    }

    public static void OooO0Oo(@NonNull View view, @NonNull MaterialShapeDrawable materialShapeDrawable) {
        o0OOOO0o o0oooo0o2 = materialShapeDrawable.f17510Oooo0o.f17535OooO0O0;
        if (o0oooo0o2 != null && o0oooo0o2.f38019OooO00o) {
            float fOooO0o0 = o00Ooo.OooO0o0(view);
            MaterialShapeDrawable.OooO0O0 oooO0O0 = materialShapeDrawable.f17510Oooo0o;
            if (oooO0O0.f17546OooOOO0 != fOooO0o0) {
                oooO0O0.f17546OooOOO0 = fOooO0o0;
                materialShapeDrawable.OooOoOO();
            }
        }
    }
}
