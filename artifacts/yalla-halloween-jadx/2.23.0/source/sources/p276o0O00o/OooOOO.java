package p276o0O00o;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.tabs.OooO00o;
import com.google.android.material.tabs.TabLayout;
import o0O000.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO extends OooO00o {
    @Override // com.google.android.material.tabs.OooO00o
    public final void OooO0O0(TabLayout tabLayout, View view, View view2, float f, @NonNull Drawable drawable) {
        float fCos;
        float fCos2;
        RectF rectFOooO00o = OooO00o.OooO00o(tabLayout, view);
        RectF rectFOooO00o2 = OooO00o.OooO00o(tabLayout, view2);
        if (rectFOooO00o.left < rectFOooO00o2.left) {
            double d = (((double) f) * 3.141592653589793d) / 2.0d;
            fCos2 = (float) (1.0d - Math.cos(d));
            fCos = (float) Math.sin(d);
        } else {
            double d2 = (((double) f) * 3.141592653589793d) / 2.0d;
            float fSin = (float) Math.sin(d2);
            fCos = (float) (1.0d - Math.cos(d2));
            fCos2 = fSin;
        }
        drawable.setBounds(OooO0O0.OooO0O0((int) rectFOooO00o.left, (int) rectFOooO00o2.left, fCos2), drawable.getBounds().top, OooO0O0.OooO0O0((int) rectFOooO00o.right, (int) rectFOooO00o2.right, fCos), drawable.getBounds().bottom);
    }
}
