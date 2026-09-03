package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.app.base.view.ViewPagerFixed;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class db implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final CoordinatorLayout f49161OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f49162OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f49163OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ComposeView f49164OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ViewPagerFixed f49165OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ComposeView f49166OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ViewStub f49167OooO0oO;

    public db(@NonNull CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull ComposeView composeView, @NonNull ComposeView composeView2, @NonNull ViewPagerFixed viewPagerFixed, @NonNull ViewStub viewStub) {
        this.f49161OooO00o = coordinatorLayout;
        this.f49162OooO0O0 = appBarLayout;
        this.f49163OooO0OO = collapsingToolbarLayout;
        this.f49164OooO0Oo = composeView;
        this.f49166OooO0o0 = composeView2;
        this.f49165OooO0o = viewPagerFixed;
        this.f49167OooO0oO = viewStub;
    }

    @NonNull
    public static db inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49161OooO00o;
    }

    @NonNull
    public static db inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main_fragment_room_related, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.abl_related;
        AppBarLayout appBarLayout = (AppBarLayout) o00Oo0.OooO00o(viewInflate, R.id.abl_related);
        if (appBarLayout != null) {
            i = R.id.ctl_room;
            CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) o00Oo0.OooO00o(viewInflate, R.id.ctl_room);
            if (collapsingToolbarLayout != null) {
                i = R.id.cvIndicator;
                ComposeView composeView = (ComposeView) o00Oo0.OooO00o(viewInflate, R.id.cvIndicator);
                if (composeView != null) {
                    i = R.id.myRoomCV;
                    ComposeView composeView2 = (ComposeView) o00Oo0.OooO00o(viewInflate, R.id.myRoomCV);
                    if (composeView2 != null) {
                        i = R.id.vpRoomRelated;
                        ViewPagerFixed viewPagerFixed = (ViewPagerFixed) o00Oo0.OooO00o(viewInflate, R.id.vpRoomRelated);
                        if (viewPagerFixed != null) {
                            i = R.id.vs_main_related_tips_bubble;
                            ViewStub viewStub = (ViewStub) o00Oo0.OooO00o(viewInflate, R.id.vs_main_related_tips_bubble);
                            if (viewStub != null) {
                                return new db((CoordinatorLayout) viewInflate, appBarLayout, collapsingToolbarLayout, composeView, composeView2, viewPagerFixed, viewStub);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
