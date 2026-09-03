package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.booking.rtlviewpager.RtlViewPager;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ag implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f48955OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f48956OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f48957OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RtlViewPager f48958OooO0Oo;

    public ag(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RtlViewPager rtlViewPager) {
        this.f48955OooO00o = linearLayout;
        this.f48956OooO0O0 = textView;
        this.f48957OooO0OO = textView2;
        this.f48958OooO0Oo = rtlViewPager;
    }

    @NonNull
    public static ag inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f48955OooO00o;
    }

    @NonNull
    public static ag inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_fragment_packet_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.llTitle;
        if (((ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.llTitle)) != null) {
            i = R.id.tvReceived;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvReceived);
            if (textView != null) {
                i = R.id.tvSend;
                TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvSend);
                if (textView2 != null) {
                    i = R.id.vpPacketHistory;
                    RtlViewPager rtlViewPager = (RtlViewPager) o00Oo0.OooO00o(viewInflate, R.id.vpPacketHistory);
                    if (rtlViewPager != null) {
                        return new ag((LinearLayout) viewInflate, textView, textView2, rtlViewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
