package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yalla.yalla.ui.view.ViewPagerFixed;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0OOO00 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44919OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f44920OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ViewPagerFixed f44921OooO0OO;

    public oO0OOO00(@NonNull LinearLayout linearLayout, @NonNull YlTableLayout ylTableLayout, @NonNull ViewPagerFixed viewPagerFixed) {
        this.f44919OooO00o = linearLayout;
        this.f44920OooO0O0 = ylTableLayout;
        this.f44921OooO0OO = viewPagerFixed;
    }

    @NonNull
    public static oO0OOO00 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44919OooO00o;
    }

    @NonNull
    public static oO0OOO00 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.main_top_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.tlTop;
        YlTableLayout ylTableLayout = (YlTableLayout) OooO0O0.OooO00o(i, viewInflate);
        if (ylTableLayout != null) {
            i = o0OO00O.vpTop;
            ViewPagerFixed viewPagerFixed = (ViewPagerFixed) OooO0O0.OooO00o(i, viewInflate);
            if (viewPagerFixed != null) {
                return new oO0OOO00((LinearLayout) viewInflate, ylTableLayout, viewPagerFixed);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
