package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.netimage.NetImageView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOO0OO implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final FrameLayout f44624OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44625OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f44626OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f44627OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f44628OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f44629OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f44630OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final NetImageView f44631OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44632OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44633OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f44634OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f44635OooOO0o;

    public o0OOO0OO(@NonNull LinearLayout linearLayout, @NonNull NetImageView netImageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull NetImageView netImageView2, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f44625OooO00o = linearLayout;
        this.f44626OooO0O0 = netImageView;
        this.f44627OooO0OO = textView;
        this.f44628OooO0Oo = textView2;
        this.f44630OooO0o0 = textView3;
        this.f44629OooO0o = textView4;
        this.f44631OooO0oO = netImageView2;
        this.f44632OooO0oo = constraintLayout;
        this.f44624OooO = frameLayout;
        this.f44633OooOO0 = linearLayout2;
        this.f44634OooOO0O = textView5;
        this.f44635OooOO0o = textView6;
    }

    @NonNull
    public static o0OOO0OO inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44625OooO00o;
    }

    @NonNull
    public static o0OOO0OO inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.layout_send_moment_share, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.eventImage;
        NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
        if (netImageView != null) {
            i = o0OO00O.eventName;
            TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
            if (textView != null) {
                i = o0OO00O.eventRoomId;
                TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                if (textView2 != null) {
                    i = o0OO00O.eventRoomName;
                    TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView3 != null) {
                        i = o0OO00O.eventTime;
                        TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                        if (textView4 != null) {
                            i = o0OO00O.ivShare;
                            NetImageView netImageView2 = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                            if (netImageView2 != null) {
                                i = o0OO00O.ivVideo;
                                if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                    i = o0OO00O.layoutEvent;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) OooO0O0.OooO00o(i, viewInflate);
                                    if (constraintLayout != null) {
                                        i = o0OO00O.layoutImage;
                                        FrameLayout frameLayout = (FrameLayout) OooO0O0.OooO00o(i, viewInflate);
                                        if (frameLayout != null) {
                                            i = o0OO00O.layoutShare;
                                            LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                                            if (linearLayout != null) {
                                                i = o0OO00O.tvShareContent;
                                                TextView textView5 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                if (textView5 != null) {
                                                    i = o0OO00O.tvShareTitle;
                                                    TextView textView6 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (textView6 != null) {
                                                        return new o0OOO0OO((LinearLayout) viewInflate, netImageView, textView, textView2, textView3, textView4, netImageView2, constraintLayout, frameLayout, linearLayout, textView5, textView6);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
