package p651o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p105o000oo0O.o00O0O;
import p105o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class w9 implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50860OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50861OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f50862OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f50863OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50864OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f50865OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f50866OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final NetImageView f50867OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50868OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f50869OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f50870OooOO0O;

    public w9(@NonNull LinearLayout linearLayout, @NonNull NetImageView netImageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull NetImageView netImageView2, @NonNull ConstraintLayout constraintLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f50861OooO00o = linearLayout;
        this.f50862OooO0O0 = netImageView;
        this.f50863OooO0OO = textView;
        this.f50864OooO0Oo = textView2;
        this.f50866OooO0o0 = textView3;
        this.f50865OooO0o = textView4;
        this.f50867OooO0oO = netImageView2;
        this.f50868OooO0oo = constraintLayout;
        this.f50860OooO = linearLayout2;
        this.f50869OooOO0 = textView5;
        this.f50870OooOO0O = textView6;
    }

    @NonNull
    public static w9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p105o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50861OooO00o;
    }

    @NonNull
    public static w9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_send_moment_share, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.eventImage;
        NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.eventImage);
        if (netImageView != null) {
            i = R.id.eventName;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.eventName);
            if (textView != null) {
                i = R.id.eventRoomId;
                TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.eventRoomId);
                if (textView2 != null) {
                    i = R.id.eventRoomName;
                    TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.eventRoomName);
                    if (textView3 != null) {
                        i = R.id.eventTime;
                        TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.eventTime);
                        if (textView4 != null) {
                            i = R.id.ivShare;
                            NetImageView netImageView2 = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivShare);
                            if (netImageView2 != null) {
                                i = R.id.layoutEvent;
                                ConstraintLayout constraintLayout = (ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.layoutEvent);
                                if (constraintLayout != null) {
                                    i = R.id.layoutShare;
                                    LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.layoutShare);
                                    if (linearLayout != null) {
                                        i = R.id.tvShareContent;
                                        TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvShareContent);
                                        if (textView5 != null) {
                                            i = R.id.tvShareTitle;
                                            TextView textView6 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvShareTitle);
                                            if (textView6 != null) {
                                                return new w9((LinearLayout) viewInflate, netImageView, textView, textView2, textView3, textView4, netImageView2, constraintLayout, linearLayout, textView5, textView6);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
