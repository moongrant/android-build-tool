package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager2.widget.ViewPager2;
import com.app.base.view.indicator.YlTableLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class te implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50657OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final we f50658OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final xe f50659OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f50660OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f50661OooO0o0;

    public te(@NonNull LinearLayout linearLayout, @NonNull we weVar, @NonNull xe xeVar, @NonNull ViewPager2 viewPager2, @NonNull YlTableLayout ylTableLayout) {
        this.f50657OooO00o = linearLayout;
        this.f50658OooO0O0 = weVar;
        this.f50659OooO0OO = xeVar;
        this.f50660OooO0Oo = viewPager2;
        this.f50661OooO0o0 = ylTableLayout;
    }

    @NonNull
    public static te inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50657OooO00o;
    }

    @NonNull
    public static te inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_activity_theme, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.themeFootLayout;
        View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.themeFootLayout);
        if (viewOooO00o != null) {
            we weVarOooO00o = we.OooO00o(viewOooO00o);
            i = R.id.themeHeadLayout;
            View viewOooO00o2 = o00Oo0.OooO00o(viewInflate, R.id.themeHeadLayout);
            if (viewOooO00o2 != null) {
                xe xeVarOooO00o = xe.OooO00o(viewOooO00o2);
                i = R.id.vToolbarBackground;
                if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.vToolbarBackground)) != null) {
                    i = R.id.vpThemePager;
                    ViewPager2 viewPager2 = (ViewPager2) o00Oo0.OooO00o(viewInflate, R.id.vpThemePager);
                    if (viewPager2 != null) {
                        i = R.id.ylThemeTable;
                        YlTableLayout ylTableLayout = (YlTableLayout) o00Oo0.OooO00o(viewInflate, R.id.ylThemeTable);
                        if (ylTableLayout != null) {
                            return new te((LinearLayout) viewInflate, weVarOooO00o, xeVarOooO00o, viewPager2, ylTableLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
