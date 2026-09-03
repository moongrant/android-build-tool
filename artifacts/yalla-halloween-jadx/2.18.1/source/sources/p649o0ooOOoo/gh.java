package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.app.base.view.indicator.YlTableLayout;
import com.booking.rtlviewpager.RtlViewPager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class gh implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49494OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ki f49495OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f49496OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49497OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RtlViewPager f49498OooO0o0;

    public gh(@NonNull ConstraintLayout constraintLayout, @NonNull ki kiVar, @NonNull YlTableLayout ylTableLayout, @NonNull AppCompatTextView appCompatTextView, @NonNull RtlViewPager rtlViewPager) {
        this.f49494OooO00o = constraintLayout;
        this.f49495OooO0O0 = kiVar;
        this.f49496OooO0OO = ylTableLayout;
        this.f49497OooO0Oo = appCompatTextView;
        this.f49498OooO0o0 = rtlViewPager;
    }

    @NonNull
    public static gh inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49494OooO00o;
    }

    @NonNull
    public static gh inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_activity_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.abl_related;
        if (((AppBarLayout) o00Oo0.OooO00o(viewInflate, R.id.abl_related)) != null) {
            i = R.id.cdHeader;
            if (((CoordinatorLayout) o00Oo0.OooO00o(viewInflate, R.id.cdHeader)) != null) {
                i = R.id.ctl_room;
                if (((CollapsingToolbarLayout) o00Oo0.OooO00o(viewInflate, R.id.ctl_room)) != null) {
                    i = R.id.header;
                    View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.header);
                    if (viewOooO00o != null) {
                        ki kiVarOooO00o = ki.OooO00o(viewOooO00o);
                        i = R.id.tlBadgeTable;
                        YlTableLayout ylTableLayout = (YlTableLayout) o00Oo0.OooO00o(viewInflate, R.id.tlBadgeTable);
                        if (ylTableLayout != null) {
                            i = R.id.tvMyMedal;
                            AppCompatTextView appCompatTextView = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.tvMyMedal);
                            if (appCompatTextView != null) {
                                i = R.id.vpMainMoment;
                                RtlViewPager rtlViewPager = (RtlViewPager) o00Oo0.OooO00o(viewInflate, R.id.vpMainMoment);
                                if (rtlViewPager != null) {
                                    return new gh((ConstraintLayout) viewInflate, kiVarOooO00o, ylTableLayout, appCompatTextView, rtlViewPager);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
