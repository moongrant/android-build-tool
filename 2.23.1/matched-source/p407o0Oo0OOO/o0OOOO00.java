package p407o0Oo0OOO;

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
import p565o0oOo000.o0OO00O;
import p565o0oOo000.o0Oo0oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOOO00 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final FrameLayout f44630OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44631OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f44632OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f44633OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f44634OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f44635OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f44636OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final NetImageView f44637OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44638OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44639OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f44640OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f44641OooOO0o;

    public o0OOOO00(@NonNull LinearLayout linearLayout, @NonNull NetImageView netImageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull NetImageView netImageView2, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView5, @NonNull TextView textView6) {
        this.f44631OooO00o = linearLayout;
        this.f44632OooO0O0 = netImageView;
        this.f44633OooO0OO = textView;
        this.f44634OooO0Oo = textView2;
        this.f44636OooO0o0 = textView3;
        this.f44635OooO0o = textView4;
        this.f44637OooO0oO = netImageView2;
        this.f44638OooO0oo = constraintLayout;
        this.f44630OooO = frameLayout;
        this.f44639OooOO0 = linearLayout2;
        this.f44640OooOO0O = textView5;
        this.f44641OooOO0o = textView6;
    }

    @NonNull
    public static o0OOOO00 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44631OooO00o;
    }

    @NonNull
    public static o0OOOO00 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(o0OO00O.layout_send_moment_share, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0Oo0oo.eventImage;
        NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
        if (netImageView != null) {
            i = o0Oo0oo.eventName;
            TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
            if (textView != null) {
                i = o0Oo0oo.eventRoomId;
                TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                if (textView2 != null) {
                    i = o0Oo0oo.eventRoomName;
                    TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView3 != null) {
                        i = o0Oo0oo.eventTime;
                        TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                        if (textView4 != null) {
                            i = o0Oo0oo.ivShare;
                            NetImageView netImageView2 = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                            if (netImageView2 != null) {
                                i = o0Oo0oo.ivVideo;
                                if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                    i = o0Oo0oo.layoutEvent;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) OooO0O0.OooO00o(i, viewInflate);
                                    if (constraintLayout != null) {
                                        i = o0Oo0oo.layoutImage;
                                        FrameLayout frameLayout = (FrameLayout) OooO0O0.OooO00o(i, viewInflate);
                                        if (frameLayout != null) {
                                            i = o0Oo0oo.layoutShare;
                                            LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                                            if (linearLayout != null) {
                                                i = o0Oo0oo.tvShareContent;
                                                TextView textView5 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                if (textView5 != null) {
                                                    i = o0Oo0oo.tvShareTitle;
                                                    TextView textView6 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (textView6 != null) {
                                                        return new o0OOOO00((LinearLayout) viewInflate, netImageView, textView, textView2, textView3, textView4, netImageView2, constraintLayout, frameLayout, linearLayout, textView5, textView6);
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
