package p349o0OOO0oo;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.tabs.OooO00o;
import com.google.android.material.tabs.TabLayout;
import p338o0OO0o0O.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo extends OooO00o {
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
        drawable.setBounds(OooO0o.OooO0O0((int) rectFOooO00o.left, (int) rectFOooO00o2.left, fCos2), drawable.getBounds().top, OooO0o.OooO0O0((int) rectFOooO00o.right, (int) rectFOooO00o2.right, fCos), drawable.getBounds().bottom);
    }
}
