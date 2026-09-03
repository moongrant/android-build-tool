package p276o0O00o;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.tabs.OooO00o;
import com.google.android.material.tabs.TabLayout;
import o0O000.OooO0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO extends OooO00o {
    @Override // com.google.android.material.tabs.OooO00o
    public final void OooO0O0(TabLayout tabLayout, View view, View view2, float f, @NonNull Drawable drawable) {
        if (f >= 0.5f) {
            view = view2;
        }
        RectF rectFOooO00o = OooO00o.OooO00o(tabLayout, view);
        float fOooO00o = f < 0.5f ? OooO0O0.OooO00o(1.0f, 0.0f, 0.0f, 0.5f, f) : OooO0O0.OooO00o(0.0f, 1.0f, 0.5f, 1.0f, f);
        drawable.setBounds((int) rectFOooO00o.left, drawable.getBounds().top, (int) rectFOooO00o.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fOooO00o * 255.0f));
    }
}
