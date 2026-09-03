package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.booking.rtlviewpager.RtlViewPager;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class m1 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44158OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f44159OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final View f44160OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RtlViewPager f44161OooO0Oo;

    public m1(@NonNull LinearLayout linearLayout, @NonNull YlTableLayout ylTableLayout, @NonNull View view, @NonNull RtlViewPager rtlViewPager) {
        this.f44158OooO00o = linearLayout;
        this.f44159OooO0O0 = ylTableLayout;
        this.f44160OooO0OO = view;
        this.f44161OooO0Oo = rtlViewPager;
    }

    @NonNull
    public static m1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44158OooO00o;
    }

    @NonNull
    public static m1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.user_activity_badge_news, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.tlBadgeTable;
        YlTableLayout ylTableLayout = (YlTableLayout) OooO0O0.OooO00o(i, viewInflate);
        if (ylTableLayout != null) {
            i = o0OO00O.tvRecentlyTitle;
            if (((AppCompatTextView) OooO0O0.OooO00o(i, viewInflate)) != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.vBg), viewInflate)) != null) {
                i = o0OO00O.vpMainMoment;
                RtlViewPager rtlViewPager = (RtlViewPager) OooO0O0.OooO00o(i, viewInflate);
                if (rtlViewPager != null) {
                    return new m1((LinearLayout) viewInflate, ylTableLayout, viewOooO00o, rtlViewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
