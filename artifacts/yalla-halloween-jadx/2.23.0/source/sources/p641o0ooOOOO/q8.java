package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.booking.rtlviewpager.RtlViewPager;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class q8 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58674OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f58675OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f58676OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RtlViewPager f58677OooO0Oo;

    public q8(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RtlViewPager rtlViewPager) {
        this.f58674OooO00o = linearLayout;
        this.f58675OooO0O0 = textView;
        this.f58676OooO0OO = textView2;
        this.f58677OooO0Oo = rtlViewPager;
    }

    @NonNull
    public static q8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58674OooO00o;
    }

    @NonNull
    public static q8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_fragment_packet_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.llTitle;
        if (((ConstraintLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
            i = oO00O0oO.tvReceived;
            TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
            if (textView != null) {
                i = oO00O0oO.tvSend;
                TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                if (textView2 != null) {
                    i = oO00O0oO.vpPacketHistory;
                    RtlViewPager rtlViewPager = (RtlViewPager) OooOO0.OooO00o(i, viewInflate);
                    if (rtlViewPager != null) {
                        return new q8((LinearLayout) viewInflate, textView, textView2, rtlViewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
