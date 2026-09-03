package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.booking.rtlviewpager.RtlViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class l1 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44112OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final p2 f44113OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f44114OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f44115OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RtlViewPager f44116OooO0o0;

    public l1(@NonNull ConstraintLayout constraintLayout, @NonNull p2 p2Var, @NonNull YlTableLayout ylTableLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull RtlViewPager rtlViewPager) {
        this.f44112OooO00o = constraintLayout;
        this.f44113OooO0O0 = p2Var;
        this.f44114OooO0OO = ylTableLayout;
        this.f44115OooO0Oo = appCompatTextView;
        this.f44116OooO0o0 = rtlViewPager;
    }

    @NonNull
    public static l1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44112OooO00o;
    }

    @NonNull
    public static l1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.user_activity_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.abl_related;
        if (((AppBarLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
            i = o0OO00O.cdHeader;
            if (((CoordinatorLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                i = o0OO00O.ctl_room;
                if (((CollapsingToolbarLayout) OooO0O0.OooO00o(i, viewInflate)) != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.header), viewInflate)) != null) {
                    p2 p2VarOooO00o = p2.OooO00o(viewOooO00o);
                    i = o0OO00O.tlBadgeTable;
                    YlTableLayout ylTableLayout = (YlTableLayout) OooO0O0.OooO00o(i, viewInflate);
                    if (ylTableLayout != null) {
                        i = o0OO00O.tvMyMedal;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                        if (appCompatTextView != null) {
                            i = o0OO00O.vpMainMoment;
                            RtlViewPager rtlViewPager = (RtlViewPager) OooO0O0.OooO00o(i, viewInflate);
                            if (rtlViewPager != null) {
                                return new l1((ConstraintLayout) viewInflate, p2VarOooO00o, ylTableLayout, appCompatTextView, rtlViewPager);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
