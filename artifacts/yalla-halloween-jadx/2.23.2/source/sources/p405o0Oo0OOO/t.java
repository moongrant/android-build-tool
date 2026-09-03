package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.netimage.NetImageView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class t implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f45528OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f45529OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f45530OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f45531OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f45532OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final SVGAView f45533OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f45534OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final SVGAView f45535OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f45536OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f45537OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f45538OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f45539OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f45540OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f45541OooOOO0;

    public t(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull NetImageView netImageView, @NonNull SVGAView sVGAView, @NonNull SVGAView sVGAView2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2) {
        this.f45529OooO00o = frameLayout;
        this.f45530OooO0O0 = imageView;
        this.f45531OooO0OO = imageView2;
        this.f45532OooO0Oo = imageView3;
        this.f45534OooO0o0 = netImageView;
        this.f45533OooO0o = sVGAView;
        this.f45535OooO0oO = sVGAView2;
        this.f45536OooO0oo = textView;
        this.f45528OooO = textView2;
        this.f45537OooOO0 = textView3;
        this.f45538OooOO0O = textView4;
        this.f45539OooOO0o = textView5;
        this.f45541OooOOO0 = linearLayoutCompat;
        this.f45540OooOOO = linearLayoutCompat2;
    }

    @NonNull
    public static t inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45529OooO00o;
    }

    @NonNull
    public static t inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_dialog_treasure_box_open, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivAwardBg;
        ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = o0OO00O.ivAwardNotWin;
            ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
            if (imageView2 != null) {
                i = o0OO00O.ivClose;
                ImageView imageView3 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView3 != null) {
                    i = o0OO00O.ivHeader;
                    NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                    if (netImageView != null) {
                        i = o0OO00O.svga;
                        SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                        if (sVGAView != null) {
                            i = o0OO00O.svgaViewAward;
                            SVGAView sVGAView2 = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                            if (sVGAView2 != null) {
                                i = o0OO00O.tvAward;
                                TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                if (textView != null) {
                                    i = o0OO00O.tvName;
                                    TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                    if (textView2 != null) {
                                        i = o0OO00O.tvShowTime;
                                        TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                        if (textView3 != null) {
                                            i = o0OO00O.tvTip;
                                            TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                            if (textView4 != null) {
                                                i = o0OO00O.tvTitle;
                                                TextView textView5 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                if (textView5 != null) {
                                                    i = o0OO00O.vAward;
                                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) OooO0O0.OooO00o(i, viewInflate);
                                                    if (linearLayoutCompat != null) {
                                                        i = o0OO00O.vCountdown;
                                                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) OooO0O0.OooO00o(i, viewInflate);
                                                        if (linearLayoutCompat2 != null) {
                                                            return new t((FrameLayout) viewInflate, imageView, imageView2, imageView3, netImageView, sVGAView, sVGAView2, textView, textView2, textView3, textView4, textView5, linearLayoutCompat, linearLayoutCompat2);
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
