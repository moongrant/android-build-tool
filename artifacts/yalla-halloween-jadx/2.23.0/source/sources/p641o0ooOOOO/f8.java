package p641o0ooOOOO;

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
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class f8 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f57923OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57924OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f57925OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f57926OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f57927OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final SVGAView f57928OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f57929OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final SVGAView f57930OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final TextView f57931OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f57932OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f57933OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f57934OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f57935OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f57936OooOOO0;

    public f8(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull NetImageView netImageView, @NonNull SVGAView sVGAView, @NonNull SVGAView sVGAView2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2) {
        this.f57924OooO00o = frameLayout;
        this.f57925OooO0O0 = imageView;
        this.f57926OooO0OO = imageView2;
        this.f57927OooO0Oo = imageView3;
        this.f57929OooO0o0 = netImageView;
        this.f57928OooO0o = sVGAView;
        this.f57930OooO0oO = sVGAView2;
        this.f57931OooO0oo = textView;
        this.f57923OooO = textView2;
        this.f57932OooOO0 = textView3;
        this.f57933OooOO0O = textView4;
        this.f57934OooOO0o = textView5;
        this.f57936OooOOO0 = linearLayoutCompat;
        this.f57935OooOOO = linearLayoutCompat2;
    }

    @NonNull
    public static f8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57924OooO00o;
    }

    @NonNull
    public static f8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_dialog_treasure_box_open, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivAwardBg;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = oO00O0oO.ivAwardNotWin;
            ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
            if (imageView2 != null) {
                i = oO00O0oO.ivClose;
                ImageView imageView3 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView3 != null) {
                    i = oO00O0oO.ivHeader;
                    NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                    if (netImageView != null) {
                        i = oO00O0oO.svga;
                        SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i, viewInflate);
                        if (sVGAView != null) {
                            i = oO00O0oO.svgaViewAward;
                            SVGAView sVGAView2 = (SVGAView) OooOO0.OooO00o(i, viewInflate);
                            if (sVGAView2 != null) {
                                i = oO00O0oO.tvAward;
                                TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                if (textView != null) {
                                    i = oO00O0oO.tvName;
                                    TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                    if (textView2 != null) {
                                        i = oO00O0oO.tvShowTime;
                                        TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                        if (textView3 != null) {
                                            i = oO00O0oO.tvTip;
                                            TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                            if (textView4 != null) {
                                                i = oO00O0oO.tvTitle;
                                                TextView textView5 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                if (textView5 != null) {
                                                    i = oO00O0oO.vAward;
                                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) OooOO0.OooO00o(i, viewInflate);
                                                    if (linearLayoutCompat != null) {
                                                        i = oO00O0oO.vCountdown;
                                                        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) OooOO0.OooO00o(i, viewInflate);
                                                        if (linearLayoutCompat2 != null) {
                                                            return new f8((FrameLayout) viewInflate, imageView, imageView2, imageView3, netImageView, sVGAView, sVGAView2, textView, textView2, textView3, textView4, textView5, linearLayoutCompat, linearLayoutCompat2);
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
