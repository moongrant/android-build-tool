package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager2.widget.ViewPager2;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class O0000000 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43670OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Oo0000 f43671OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final a f43672OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f43673OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f43674OooO0o0;

    public O0000000(@NonNull LinearLayout linearLayout, @NonNull Oo0000 oo0000, @NonNull a aVar, @NonNull ViewPager2 viewPager2, @NonNull YlTableLayout ylTableLayout) {
        this.f43670OooO00o = linearLayout;
        this.f43671OooO0O0 = oo0000;
        this.f43672OooO0OO = aVar;
        this.f43673OooO0Oo = viewPager2;
        this.f43674OooO0o0 = ylTableLayout;
    }

    @NonNull
    public static O0000000 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43670OooO00o;
    }

    @NonNull
    public static O0000000 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_activity_theme, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.themeFootLayout;
        View viewOooO00o = OooO0O0.OooO00o(i, viewInflate);
        if (viewOooO00o != null) {
            Oo0000 oo0000OooO00o = Oo0000.OooO00o(viewOooO00o);
            i = o0OO00O.themeHeadLayout;
            View viewOooO00o2 = OooO0O0.OooO00o(i, viewInflate);
            if (viewOooO00o2 != null) {
                a aVarOooO00o = a.OooO00o(viewOooO00o2);
                i = o0OO00O.vToolbarBackground;
                if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                    i = o0OO00O.vpThemePager;
                    ViewPager2 viewPager2 = (ViewPager2) OooO0O0.OooO00o(i, viewInflate);
                    if (viewPager2 != null) {
                        i = o0OO00O.ylThemeTable;
                        YlTableLayout ylTableLayout = (YlTableLayout) OooO0O0.OooO00o(i, viewInflate);
                        if (ylTableLayout != null) {
                            return new O0000000((LinearLayout) viewInflate, oo0000OooO00o, aVarOooO00o, viewPager2, ylTableLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
