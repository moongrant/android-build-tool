package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager2.widget.ViewPager2;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class j7 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58178OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final m7 f58179OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final n7 f58180OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f58181OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f58182OooO0o0;

    public j7(@NonNull LinearLayout linearLayout, @NonNull m7 m7Var, @NonNull n7 n7Var, @NonNull ViewPager2 viewPager2, @NonNull YlTableLayout ylTableLayout) {
        this.f58178OooO00o = linearLayout;
        this.f58179OooO0O0 = m7Var;
        this.f58180OooO0OO = n7Var;
        this.f58181OooO0Oo = viewPager2;
        this.f58182OooO0o0 = ylTableLayout;
    }

    @NonNull
    public static j7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58178OooO00o;
    }

    @NonNull
    public static j7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_activity_theme, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.themeFootLayout;
        View viewOooO00o = OooOO0.OooO00o(i, viewInflate);
        if (viewOooO00o != null) {
            m7 m7VarOooO00o = m7.OooO00o(viewOooO00o);
            i = oO00O0oO.themeHeadLayout;
            View viewOooO00o2 = OooOO0.OooO00o(i, viewInflate);
            if (viewOooO00o2 != null) {
                n7 n7VarOooO00o = n7.OooO00o(viewOooO00o2);
                i = oO00O0oO.vToolbarBackground;
                if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                    i = oO00O0oO.vpThemePager;
                    ViewPager2 viewPager2 = (ViewPager2) OooOO0.OooO00o(i, viewInflate);
                    if (viewPager2 != null) {
                        i = oO00O0oO.ylThemeTable;
                        YlTableLayout ylTableLayout = (YlTableLayout) OooOO0.OooO00o(i, viewInflate);
                        if (ylTableLayout != null) {
                            return new j7((LinearLayout) viewInflate, m7VarOooO00o, n7VarOooO00o, viewPager2, ylTableLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
