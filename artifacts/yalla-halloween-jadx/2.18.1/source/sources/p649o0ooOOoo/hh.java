package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.app.base.view.indicator.YlTableLayout;
import com.booking.rtlviewpager.RtlViewPager;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class hh implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49627OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f49628OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final View f49629OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RtlViewPager f49630OooO0Oo;

    public hh(@NonNull LinearLayout linearLayout, @NonNull YlTableLayout ylTableLayout, @NonNull View view, @NonNull RtlViewPager rtlViewPager) {
        this.f49627OooO00o = linearLayout;
        this.f49628OooO0O0 = ylTableLayout;
        this.f49629OooO0OO = view;
        this.f49630OooO0Oo = rtlViewPager;
    }

    @NonNull
    public static hh inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49627OooO00o;
    }

    @NonNull
    public static hh inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_activity_badge_news, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.tlBadgeTable;
        YlTableLayout ylTableLayout = (YlTableLayout) o00Oo0.OooO00o(viewInflate, R.id.tlBadgeTable);
        if (ylTableLayout != null) {
            i = R.id.tvRecentlyTitle;
            if (((AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.tvRecentlyTitle)) != null) {
                i = R.id.vBg;
                View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.vBg);
                if (viewOooO00o != null) {
                    i = R.id.vpMainMoment;
                    RtlViewPager rtlViewPager = (RtlViewPager) o00Oo0.OooO00o(viewInflate, R.id.vpMainMoment);
                    if (rtlViewPager != null) {
                        return new hh((LinearLayout) viewInflate, ylTableLayout, viewOooO00o, rtlViewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
