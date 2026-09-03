package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.booking.rtlviewpager.RtlViewPager;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class h7 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58039OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58040OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f58041OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RtlViewPager f58042OooO0Oo;

    public h7(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull YlTableLayout ylTableLayout, @NonNull RtlViewPager rtlViewPager) {
        this.f58039OooO00o = linearLayout;
        this.f58040OooO0O0 = frameLayout;
        this.f58041OooO0OO = ylTableLayout;
        this.f58042OooO0Oo = rtlViewPager;
    }

    @NonNull
    public static h7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58039OooO00o;
    }

    @NonNull
    public static h7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_activity_packet_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.flHeader;
        FrameLayout frameLayout = (FrameLayout) OooOO0.OooO00o(i, viewInflate);
        if (frameLayout != null) {
            i = oO00O0oO.tabLayout;
            YlTableLayout ylTableLayout = (YlTableLayout) OooOO0.OooO00o(i, viewInflate);
            if (ylTableLayout != null) {
                i = oO00O0oO.vpPacketHistory;
                RtlViewPager rtlViewPager = (RtlViewPager) OooOO0.OooO00o(i, viewInflate);
                if (rtlViewPager != null) {
                    return new h7((LinearLayout) viewInflate, frameLayout, ylTableLayout, rtlViewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
