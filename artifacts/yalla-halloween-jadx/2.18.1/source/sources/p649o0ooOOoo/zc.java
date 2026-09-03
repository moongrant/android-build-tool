package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.app.base.view.ViewPagerFixed;
import com.app.base.view.indicator.YlTableLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class zc implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ViewPagerFixed f51074OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f51075OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f51076OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f51077OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final y6 f51078OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f51079OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final k9 f51080OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f51081OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final Toolbar f51082OooO0oo;

    public zc(@NonNull FrameLayout frameLayout, @NonNull AppBarLayout appBarLayout, @NonNull CoordinatorLayout coordinatorLayout, @NonNull y6 y6Var, @NonNull k9 k9Var, @NonNull ImageView imageView, @NonNull YlTableLayout ylTableLayout, @NonNull Toolbar toolbar, @NonNull ViewPagerFixed viewPagerFixed) {
        this.f51075OooO00o = frameLayout;
        this.f51076OooO0O0 = appBarLayout;
        this.f51077OooO0OO = coordinatorLayout;
        this.f51078OooO0Oo = y6Var;
        this.f51080OooO0o0 = k9Var;
        this.f51079OooO0o = imageView;
        this.f51081OooO0oO = ylTableLayout;
        this.f51082OooO0oo = toolbar;
        this.f51074OooO = viewPagerFixed;
    }

    @NonNull
    public static zc inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f51075OooO00o;
    }

    @NonNull
    public static zc inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_activity_topic_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) o00Oo0.OooO00o(viewInflate, R.id.appBarLayout);
        if (appBarLayout != null) {
            i = R.id.clTopics;
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) o00Oo0.OooO00o(viewInflate, R.id.clTopics);
            if (coordinatorLayout != null) {
                i = R.id.emptyLayout;
                View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.emptyLayout);
                if (viewOooO00o != null) {
                    y6 y6VarOooO00o = y6.OooO00o(viewOooO00o);
                    i = R.id.head;
                    View viewOooO00o2 = o00Oo0.OooO00o(viewInflate, R.id.head);
                    if (viewOooO00o2 != null) {
                        k9 k9VarOooO00o = k9.OooO00o(viewOooO00o2);
                        i = R.id.ivCreate;
                        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivCreate);
                        if (imageView != null) {
                            i = R.id.tabLayout;
                            YlTableLayout ylTableLayout = (YlTableLayout) o00Oo0.OooO00o(viewInflate, R.id.tabLayout);
                            if (ylTableLayout != null) {
                                i = R.id.toolbarHolder;
                                Toolbar toolbar = (Toolbar) o00Oo0.OooO00o(viewInflate, R.id.toolbarHolder);
                                if (toolbar != null) {
                                    i = R.id.vpTopicDetail;
                                    ViewPagerFixed viewPagerFixed = (ViewPagerFixed) o00Oo0.OooO00o(viewInflate, R.id.vpTopicDetail);
                                    if (viewPagerFixed != null) {
                                        return new zc((FrameLayout) viewInflate, appBarLayout, coordinatorLayout, y6VarOooO00o, k9VarOooO00o, imageView, ylTableLayout, toolbar, viewPagerFixed);
                                    }
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
