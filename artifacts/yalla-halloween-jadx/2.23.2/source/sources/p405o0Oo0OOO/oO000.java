package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.yalla.ui.view.ViewPagerFixed;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44724OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ComposeView f44725OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f44726OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ViewPagerFixed f44727OooO0Oo;

    public oO000(@NonNull ConstraintLayout constraintLayout, @NonNull ComposeView composeView, @NonNull YlTableLayout ylTableLayout, @NonNull ViewPagerFixed viewPagerFixed) {
        this.f44724OooO00o = constraintLayout;
        this.f44725OooO0O0 = composeView;
        this.f44726OooO0OO = ylTableLayout;
        this.f44727OooO0Oo = viewPagerFixed;
    }

    @NonNull
    public static oO000 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44724OooO00o;
    }

    @NonNull
    public static oO000 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.main_activity_main_search, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.composeHead;
        ComposeView composeView = (ComposeView) OooO0O0.OooO00o(i, viewInflate);
        if (composeView != null) {
            i = o0OO00O.tabLayout;
            YlTableLayout ylTableLayout = (YlTableLayout) OooO0O0.OooO00o(i, viewInflate);
            if (ylTableLayout != null) {
                i = o0OO00O.viewPager;
                ViewPagerFixed viewPagerFixed = (ViewPagerFixed) OooO0O0.OooO00o(i, viewInflate);
                if (viewPagerFixed != null) {
                    return new oO000((ConstraintLayout) viewInflate, composeView, ylTableLayout, viewPagerFixed);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
