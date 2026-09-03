package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.yalla.ui.view.ViewPagerFixed;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class s3 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58793OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ComposeView f58794OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f58795OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ViewPagerFixed f58796OooO0Oo;

    public s3(@NonNull ConstraintLayout constraintLayout, @NonNull ComposeView composeView, @NonNull YlTableLayout ylTableLayout, @NonNull ViewPagerFixed viewPagerFixed) {
        this.f58793OooO00o = constraintLayout;
        this.f58794OooO0O0 = composeView;
        this.f58795OooO0OO = ylTableLayout;
        this.f58796OooO0Oo = viewPagerFixed;
    }

    @NonNull
    public static s3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58793OooO00o;
    }

    @NonNull
    public static s3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.main_activity_main_search, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.composeHead;
        ComposeView composeView = (ComposeView) OooOO0.OooO00o(i, viewInflate);
        if (composeView != null) {
            i = oO00O0oO.tabLayout;
            YlTableLayout ylTableLayout = (YlTableLayout) OooOO0.OooO00o(i, viewInflate);
            if (ylTableLayout != null) {
                i = oO00O0oO.viewPager;
                ViewPagerFixed viewPagerFixed = (ViewPagerFixed) OooOO0.OooO00o(i, viewInflate);
                if (viewPagerFixed != null) {
                    return new s3((ConstraintLayout) viewInflate, composeView, ylTableLayout, viewPagerFixed);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
