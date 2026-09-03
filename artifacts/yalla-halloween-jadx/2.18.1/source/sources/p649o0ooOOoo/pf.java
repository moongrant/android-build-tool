package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class pf implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f50312OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f50313OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f50314OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50315OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50316OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final SVGAView f50317OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f50318OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final SVGAView f50319OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f50320OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f50321OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f50322OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f50323OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50324OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50325OooOOO0;

    public pf(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull NetImageView netImageView, @NonNull SVGAView sVGAView, @NonNull SVGAView sVGAView2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2) {
        this.f50313OooO00o = frameLayout;
        this.f50314OooO0O0 = imageView;
        this.f50315OooO0OO = imageView2;
        this.f50316OooO0Oo = imageView3;
        this.f50318OooO0o0 = netImageView;
        this.f50317OooO0o = sVGAView;
        this.f50319OooO0oO = sVGAView2;
        this.f50320OooO0oo = textView;
        this.f50312OooO = textView2;
        this.f50321OooOO0 = textView3;
        this.f50322OooOO0O = textView4;
        this.f50323OooOO0o = textView5;
        this.f50325OooOOO0 = linearLayoutCompat;
        this.f50324OooOOO = linearLayoutCompat2;
    }

    @NonNull
    public static pf inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50313OooO00o;
    }

    @NonNull
    public static pf inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_dialog_treasure_box_open, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivAwardBg;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivAwardBg);
        if (imageView != null) {
            i = R.id.ivAwardNotWin;
            ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivAwardNotWin);
            if (imageView2 != null) {
                i = R.id.ivClose;
                ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivClose);
                if (imageView3 != null) {
                    i = R.id.ivHeader;
                    NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivHeader);
                    if (netImageView != null) {
                        i = R.id.svga;
                        SVGAView sVGAView = (SVGAView) o00Oo0.OooO00o(viewInflate, R.id.svga);
                        if (sVGAView != null) {
                            i = R.id.svgaViewAward;
                            SVGAView sVGAView2 = (SVGAView) o00Oo0.OooO00o(viewInflate, R.id.svgaViewAward);
                            if (sVGAView2 != null) {
                                i = R.id.tvAward;
                                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvAward);
                                if (textView != null) {
                                    i = R.id.tvName;
                                    TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvName);
                                    if (textView2 != null) {
                                        i = R.id.tvShowTime;
                                        TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvShowTime);
                                        if (textView3 != null) {
                                            i = R.id.tvTip;
                                            TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTip);
                                            if (textView4 != null) {
                                                i = R.id.tvTitle;
                                                TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTitle);
                                                if (textView5 != null) {
                                                    i = R.id.vAward;
                                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) o00Oo0.OooO00o(viewInflate, R.id.vAward);
                                                    if (linearLayoutCompat != null) {
                                                        i = R.id.vCountdown;
                                                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) o00Oo0.OooO00o(viewInflate, R.id.vCountdown);
                                                        if (linearLayoutCompat2 != null) {
                                                            return new pf((FrameLayout) viewInflate, imageView, imageView2, imageView3, netImageView, sVGAView, sVGAView2, textView, textView2, textView3, textView4, textView5, linearLayoutCompat, linearLayoutCompat2);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
