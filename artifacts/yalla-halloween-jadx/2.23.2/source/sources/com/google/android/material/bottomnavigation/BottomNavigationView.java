package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.o000Oo0;
import com.google.android.material.internal.o00oO0o;
import com.google.android.material.internal.oo0o0Oo;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import org.jctools.util.Pow2;
import p272o0O0000o.o00000;
import p272o0O0000o.o0000O0O;
import p272o0O0000o.o000OO;
import p447o0OoOoOo.o0O00o00;

/* JADX INFO: loaded from: classes3.dex */
public class BottomNavigationView extends NavigationBarView {

    @Deprecated
    public interface OooO00o extends NavigationBarView.OooO0O0 {
    }

    @Deprecated
    public interface OooO0O0 extends NavigationBarView.OooO0OO {
    }

    public BottomNavigationView(@NonNull Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavigationBarMenuView OooO00o(@NonNull Context context) {
        return new BottomNavigationMenuView(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) != 1073741824 && suggestedMinimumHeight > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), Pow2.MAX_POW2);
        }
        super.onMeasure(i, i2);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.f15954Oooo0o != z) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z);
            getPresenter().OooO(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(@Nullable OooO00o oooO00o) {
        setOnItemReselectedListener(oooO00o);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(@Nullable OooO0O0 oooO0O0) {
        setOnItemSelectedListener(oooO0O0);
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, o00000.bottomNavigationStyle);
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, o0000O0O.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        o000Oo0 o000oo0OooO0o0 = o00oO0o.OooO0o0(getContext(), attributeSet, o000OO.BottomNavigationView, i, i2, new int[0]);
        setItemHorizontalTranslationEnabled(o000oo0OooO0o0.OooO00o(o000OO.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int i3 = o000OO.BottomNavigationView_android_minHeight;
        if (o000oo0OooO0o0.OooOO0o(i3)) {
            setMinimumHeight(o000oo0OooO0o0.OooO0Oo(i3, 0));
        }
        o000oo0OooO0o0.OooO00o(o000OO.BottomNavigationView_compatShadowEnabled, true);
        o000oo0OooO0o0.OooOOO();
        oo0o0Oo.OooO00o(this, new o0O00o00());
    }
}
