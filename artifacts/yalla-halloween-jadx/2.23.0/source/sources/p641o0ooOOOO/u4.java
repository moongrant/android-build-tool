package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.ViewPagerFixed;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class u4 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58945OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f58946OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ViewPagerFixed f58947OooO0OO;

    public u4(@NonNull LinearLayout linearLayout, @NonNull YlTableLayout ylTableLayout, @NonNull ViewPagerFixed viewPagerFixed) {
        this.f58945OooO00o = linearLayout;
        this.f58946OooO0O0 = ylTableLayout;
        this.f58947OooO0OO = viewPagerFixed;
    }

    @NonNull
    public static u4 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58945OooO00o;
    }

    @NonNull
    public static u4 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.main_top_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.tlTop;
        YlTableLayout ylTableLayout = (YlTableLayout) OooOO0.OooO00o(i, viewInflate);
        if (ylTableLayout != null) {
            i = oO00O0oO.vpTop;
            ViewPagerFixed viewPagerFixed = (ViewPagerFixed) OooOO0.OooO00o(i, viewInflate);
            if (viewPagerFixed != null) {
                return new u4((LinearLayout) viewInflate, ylTableLayout, viewPagerFixed);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
