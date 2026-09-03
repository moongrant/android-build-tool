package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.booking.rtlviewpager.RtlViewPager;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class x9 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59340OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f59341OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final View f59342OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RtlViewPager f59343OooO0Oo;

    public x9(@NonNull LinearLayout linearLayout, @NonNull YlTableLayout ylTableLayout, @NonNull View view, @NonNull RtlViewPager rtlViewPager) {
        this.f59340OooO00o = linearLayout;
        this.f59341OooO0O0 = ylTableLayout;
        this.f59342OooO0OO = view;
        this.f59343OooO0Oo = rtlViewPager;
    }

    @NonNull
    public static x9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59340OooO00o;
    }

    @NonNull
    public static x9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.user_activity_badge_news, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.tlBadgeTable;
        YlTableLayout ylTableLayout = (YlTableLayout) OooOO0.OooO00o(i, viewInflate);
        if (ylTableLayout != null) {
            i = oO00O0oO.tvRecentlyTitle;
            if (((AppCompatTextView) OooOO0.OooO00o(i, viewInflate)) != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.vBg), viewInflate)) != null) {
                i = oO00O0oO.vpMainMoment;
                RtlViewPager rtlViewPager = (RtlViewPager) OooOO0.OooO00o(i, viewInflate);
                if (rtlViewPager != null) {
                    return new x9((LinearLayout) viewInflate, ylTableLayout, viewOooO00o, rtlViewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
