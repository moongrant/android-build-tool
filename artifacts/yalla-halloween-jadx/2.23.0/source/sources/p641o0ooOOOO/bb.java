package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class bb implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f57608OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f57609OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f57610OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final cb f57611OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final Toolbar f57612OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f57613OooO0o0;

    public bb(@NonNull AppBarLayout appBarLayout, @NonNull AppBarLayout appBarLayout2, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull cb cbVar, @NonNull YlTableLayout ylTableLayout, @NonNull Toolbar toolbar) {
        this.f57608OooO00o = appBarLayout;
        this.f57609OooO0O0 = appBarLayout2;
        this.f57610OooO0OO = collapsingToolbarLayout;
        this.f57611OooO0Oo = cbVar;
        this.f57613OooO0o0 = ylTableLayout;
        this.f57612OooO0o = toolbar;
    }

    @NonNull
    public static bb OooO00o(@NonNull View view) {
        View viewOooO00o;
        AppBarLayout appBarLayout = (AppBarLayout) view;
        int i = oO00O0oO.ctl;
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) OooOO0.OooO00o(i, view);
        if (collapsingToolbarLayout != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.details), view)) != null) {
            cb cbVarOooO00o = cb.OooO00o(viewOooO00o);
            i = oO00O0oO.magicIndicator;
            YlTableLayout ylTableLayout = (YlTableLayout) OooOO0.OooO00o(i, view);
            if (ylTableLayout != null) {
                i = oO00O0oO.toolbar_holder;
                Toolbar toolbar = (Toolbar) OooOO0.OooO00o(i, view);
                if (toolbar != null) {
                    return new bb(appBarLayout, appBarLayout, collapsingToolbarLayout, cbVarOooO00o, ylTableLayout, toolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static bb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57608OooO00o;
    }

    @NonNull
    public static bb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.user_include_userinfo_header_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
