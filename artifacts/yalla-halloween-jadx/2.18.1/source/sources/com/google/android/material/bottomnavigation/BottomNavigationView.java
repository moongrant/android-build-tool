package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.o0000O0;
import com.google.android.material.internal.o000oOoO;
import com.google.android.material.internal.o00Ooo;
import com.google.android.material.navigation.NavigationBarMenuView;
import com.google.android.material.navigation.NavigationBarView;
import p337o0OO0o0.OooO0o;
import p337o0OO0o0.Oooo0;
import p337o0OO0o0.Oooo000;

/* JADX INFO: loaded from: classes2.dex */
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
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) getMenuView();
        if (bottomNavigationMenuView.f16590o0ooOO0 != z) {
            bottomNavigationMenuView.setItemHorizontalTranslationEnabled(z);
            getPresenter().OooO0Oo(false);
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
        this(context, attributeSet, OooO0o.bottomNavigationStyle);
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, Oooo000.Widget_Design_BottomNavigationView);
    }

    public BottomNavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        o0000O0 o0000o0OooO0o0 = o000oOoO.OooO0o0(getContext(), attributeSet, Oooo0.BottomNavigationView, i, i2, new int[0]);
        setItemHorizontalTranslationEnabled(o0000o0OooO0o0.OooO00o(Oooo0.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int i3 = Oooo0.BottomNavigationView_android_minHeight;
        if (o0000o0OooO0o0.OooOOOo(i3)) {
            setMinimumHeight(o0000o0OooO0o0.OooO0o(i3, 0));
        }
        o0000o0OooO0o0.OooOOoo();
        o00Ooo.OooO00o(this, new p339o0OO0o0o.Oooo0());
    }
}
