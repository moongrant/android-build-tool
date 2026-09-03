package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.internal.o00Ooo;
import p338o0OO0o0O.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public class OooO00o {
    public static RectF OooO00o(TabLayout tabLayout, @Nullable View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.f17782o00Oo0 || !(view instanceof TabLayout.TabView)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        TabLayout.TabView tabView = (TabLayout.TabView) view;
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int iOooO0O0 = (int) o00Ooo.OooO0O0(tabView.getContext(), 24);
        if (contentWidth < iOooO0O0) {
            contentWidth = iOooO0O0;
        }
        int right = (tabView.getRight() + tabView.getLeft()) / 2;
        int bottom = (tabView.getBottom() + tabView.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    public void OooO0O0(TabLayout tabLayout, View view, View view2, @FloatRange(from = 0.0d, to = 1.0d) float f, @NonNull Drawable drawable) {
        RectF rectFOooO00o = OooO00o(tabLayout, view);
        RectF rectFOooO00o2 = OooO00o(tabLayout, view2);
        drawable.setBounds(OooO0o.OooO0O0((int) rectFOooO00o.left, (int) rectFOooO00o2.left, f), drawable.getBounds().top, OooO0o.OooO0O0((int) rectFOooO00o.right, (int) rectFOooO00o2.right, f), drawable.getBounds().bottom);
    }
}
