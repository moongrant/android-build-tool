package p641o0ooOOOO;

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
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class w9 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59204OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ab f59205OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f59206OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f59207OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RtlViewPager f59208OooO0o0;

    public w9(@NonNull ConstraintLayout constraintLayout, @NonNull ab abVar, @NonNull YlTableLayout ylTableLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull RtlViewPager rtlViewPager) {
        this.f59204OooO00o = constraintLayout;
        this.f59205OooO0O0 = abVar;
        this.f59206OooO0OO = ylTableLayout;
        this.f59207OooO0Oo = appCompatTextView;
        this.f59208OooO0o0 = rtlViewPager;
    }

    @NonNull
    public static w9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59204OooO00o;
    }

    @NonNull
    public static w9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.user_activity_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.abl_related;
        if (((AppBarLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
            i = oO00O0oO.cdHeader;
            if (((CoordinatorLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                i = oO00O0oO.ctl_room;
                if (((CollapsingToolbarLayout) OooOO0.OooO00o(i, viewInflate)) != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.header), viewInflate)) != null) {
                    ab abVarOooO00o = ab.OooO00o(viewOooO00o);
                    i = oO00O0oO.tlBadgeTable;
                    YlTableLayout ylTableLayout = (YlTableLayout) OooOO0.OooO00o(i, viewInflate);
                    if (ylTableLayout != null) {
                        i = oO00O0oO.tvMyMedal;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                        if (appCompatTextView != null) {
                            i = oO00O0oO.vpMainMoment;
                            RtlViewPager rtlViewPager = (RtlViewPager) OooOO0.OooO00o(i, viewInflate);
                            if (rtlViewPager != null) {
                                return new w9((ConstraintLayout) viewInflate, abVarOooO00o, ylTableLayout, appCompatTextView, rtlViewPager);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
