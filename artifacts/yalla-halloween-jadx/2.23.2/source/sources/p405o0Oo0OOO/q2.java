package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class q2 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f45406OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f45407OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f45408OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final r2 f45409OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final Toolbar f45410OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f45411OooO0o0;

    public q2(@NonNull AppBarLayout appBarLayout, @NonNull AppBarLayout appBarLayout2, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull r2 r2Var, @NonNull YlTableLayout ylTableLayout, @NonNull Toolbar toolbar) {
        this.f45406OooO00o = appBarLayout;
        this.f45407OooO0O0 = appBarLayout2;
        this.f45408OooO0OO = collapsingToolbarLayout;
        this.f45409OooO0Oo = r2Var;
        this.f45411OooO0o0 = ylTableLayout;
        this.f45410OooO0o = toolbar;
    }

    @NonNull
    public static q2 OooO00o(@NonNull View view) {
        View viewOooO00o;
        AppBarLayout appBarLayout = (AppBarLayout) view;
        int i = o0OO00O.ctl;
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) OooO0O0.OooO00o(i, view);
        if (collapsingToolbarLayout != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.details), view)) != null) {
            r2 r2VarOooO00o = r2.OooO00o(viewOooO00o);
            i = o0OO00O.magicIndicator;
            YlTableLayout ylTableLayout = (YlTableLayout) OooO0O0.OooO00o(i, view);
            if (ylTableLayout != null) {
                i = o0OO00O.toolbar_holder;
                Toolbar toolbar = (Toolbar) OooO0O0.OooO00o(i, view);
                if (toolbar != null) {
                    return new q2(appBarLayout, appBarLayout, collapsingToolbarLayout, r2VarOooO00o, ylTableLayout, toolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static q2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45406OooO00o;
    }

    @NonNull
    public static q2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.user_include_userinfo_header_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
