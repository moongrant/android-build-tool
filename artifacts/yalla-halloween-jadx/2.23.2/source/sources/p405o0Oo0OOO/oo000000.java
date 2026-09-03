package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.booking.rtlviewpager.RtlViewPager;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000000 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f45251OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f45252OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final YlTableLayout f45253OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RtlViewPager f45254OooO0Oo;

    public oo000000(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull YlTableLayout ylTableLayout, @NonNull RtlViewPager rtlViewPager) {
        this.f45251OooO00o = linearLayout;
        this.f45252OooO0O0 = frameLayout;
        this.f45253OooO0OO = ylTableLayout;
        this.f45254OooO0Oo = rtlViewPager;
    }

    @NonNull
    public static oo000000 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45251OooO00o;
    }

    @NonNull
    public static oo000000 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_activity_packet_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.flHeader;
        FrameLayout frameLayout = (FrameLayout) OooO0O0.OooO00o(i, viewInflate);
        if (frameLayout != null) {
            i = o0OO00O.tabLayout;
            YlTableLayout ylTableLayout = (YlTableLayout) OooO0O0.OooO00o(i, viewInflate);
            if (ylTableLayout != null) {
                i = o0OO00O.vpPacketHistory;
                RtlViewPager rtlViewPager = (RtlViewPager) OooO0O0.OooO00o(i, viewInflate);
                if (rtlViewPager != null) {
                    return new oo000000((LinearLayout) viewInflate, frameLayout, ylTableLayout, rtlViewPager);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
