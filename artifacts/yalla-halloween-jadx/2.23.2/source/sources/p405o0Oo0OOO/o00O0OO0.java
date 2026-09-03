package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.yalla.ui.view.ViewPagerFixed;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OO0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44327OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f44328OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final View f44329OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ViewPagerFixed f44330OooO0Oo;

    public o00O0OO0(@NonNull ConstraintLayout constraintLayout, @NonNull YlTableLayout ylTableLayout, @NonNull View view, @NonNull ViewPagerFixed viewPagerFixed) {
        this.f44327OooO00o = constraintLayout;
        this.f44328OooO0O0 = ylTableLayout;
        this.f44329OooO0OO = view;
        this.f44330OooO0Oo = viewPagerFixed;
    }

    @NonNull
    public static o00O0OO0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44327OooO00o;
    }

    @NonNull
    public static o00O0OO0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.activity_recharge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
        int i = o0OO00O.tabLayout;
        YlTableLayout ylTableLayout = (YlTableLayout) OooO0O0.OooO00o(i, viewInflate);
        if (ylTableLayout != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.topView), viewInflate)) != null) {
            i = o0OO00O.viewPager;
            ViewPagerFixed viewPagerFixed = (ViewPagerFixed) OooO0O0.OooO00o(i, viewInflate);
            if (viewPagerFixed != null) {
                return new o00O0OO0(constraintLayout, ylTableLayout, viewOooO00o, viewPagerFixed);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
