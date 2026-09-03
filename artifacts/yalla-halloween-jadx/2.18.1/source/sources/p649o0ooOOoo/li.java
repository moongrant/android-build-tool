package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import com.app.base.view.indicator.YlTableLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class li implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f49985OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppBarLayout f49986OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final CollapsingToolbarLayout f49987OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final mi f49988OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final Toolbar f49989OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f49990OooO0o0;

    public li(@NonNull AppBarLayout appBarLayout, @NonNull AppBarLayout appBarLayout2, @NonNull CollapsingToolbarLayout collapsingToolbarLayout, @NonNull mi miVar, @NonNull YlTableLayout ylTableLayout, @NonNull Toolbar toolbar) {
        this.f49985OooO00o = appBarLayout;
        this.f49986OooO0O0 = appBarLayout2;
        this.f49987OooO0OO = collapsingToolbarLayout;
        this.f49988OooO0Oo = miVar;
        this.f49990OooO0o0 = ylTableLayout;
        this.f49989OooO0o = toolbar;
    }

    @NonNull
    public static li OooO00o(@NonNull View view) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        int i = R.id.ctl;
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) o00Oo0.OooO00o(view, R.id.ctl);
        if (collapsingToolbarLayout != null) {
            i = R.id.details;
            View viewOooO00o = o00Oo0.OooO00o(view, R.id.details);
            if (viewOooO00o != null) {
                mi miVarOooO00o = mi.OooO00o(viewOooO00o);
                i = R.id.magicIndicator;
                YlTableLayout ylTableLayout = (YlTableLayout) o00Oo0.OooO00o(view, R.id.magicIndicator);
                if (ylTableLayout != null) {
                    i = R.id.toolbar_holder;
                    Toolbar toolbar = (Toolbar) o00Oo0.OooO00o(view, R.id.toolbar_holder);
                    if (toolbar != null) {
                        return new li(appBarLayout, appBarLayout, collapsingToolbarLayout, miVarOooO00o, ylTableLayout, toolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static li inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49985OooO00o;
    }

    @NonNull
    public static li inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_include_userinfo_header_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
