package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.gift.GiftNumberView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class k3 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final SVGAView f44084OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44085OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f44086OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f44087OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f44088OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final GiftNumberView f44089OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f44090OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final SVGAView f44091OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final SVGAView f44092OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final SVGAView f44093OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final SVGAView f44094OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final SVGAView f44095OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f44096OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f44097OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f44098OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f44099OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final View f44100OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f44101OooOOo0;

    public k3(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull NetImageView netImageView2, @NonNull ImageView imageView, @NonNull NetImageView netImageView3, @NonNull GiftNumberView giftNumberView, @NonNull SVGAView sVGAView, @NonNull SVGAView sVGAView2, @NonNull SVGAView sVGAView3, @NonNull SVGAView sVGAView4, @NonNull SVGAView sVGAView5, @NonNull SVGAView sVGAView6, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull View view) {
        this.f44085OooO00o = constraintLayout;
        this.f44086OooO0O0 = netImageView;
        this.f44087OooO0OO = netImageView2;
        this.f44088OooO0Oo = imageView;
        this.f44090OooO0o0 = netImageView3;
        this.f44089OooO0o = giftNumberView;
        this.f44091OooO0oO = sVGAView;
        this.f44092OooO0oo = sVGAView2;
        this.f44084OooO = sVGAView3;
        this.f44093OooOO0 = sVGAView4;
        this.f44094OooOO0O = sVGAView5;
        this.f44095OooOO0o = sVGAView6;
        this.f44097OooOOO0 = textView;
        this.f44096OooOOO = textView2;
        this.f44098OooOOOO = textView3;
        this.f44099OooOOOo = textView4;
        this.f44101OooOOo0 = textView5;
        this.f44100OooOOo = view;
    }

    @NonNull
    public static k3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44085OooO00o;
    }

    @NonNull
    public static k3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.view_room_broadcast_vip6, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivGiftImage;
        NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
        if (netImageView != null) {
            i = o0OO00O.ivGiftType;
            NetImageView netImageView2 = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
            if (netImageView2 != null) {
                i = o0OO00O.ivGo;
                ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = o0OO00O.ivHeaderImage;
                    NetImageView netImageView3 = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                    if (netImageView3 != null) {
                        i = o0OO00O.layoutContent;
                        if (((LinearLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                            i = o0OO00O.layoutGiftNumber;
                            GiftNumberView giftNumberView = (GiftNumberView) OooO0O0.OooO00o(i, viewInflate);
                            if (giftNumberView != null) {
                                i = o0OO00O.svgaBgBig;
                                SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                                if (sVGAView != null) {
                                    i = o0OO00O.svgaBgGo;
                                    SVGAView sVGAView2 = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                                    if (sVGAView2 != null) {
                                        i = o0OO00O.svgaBgMiddle;
                                        SVGAView sVGAView3 = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                                        if (sVGAView3 != null) {
                                            i = o0OO00O.svgaBgSmall;
                                            SVGAView sVGAView4 = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                                            if (sVGAView4 != null) {
                                                i = o0OO00O.svgaBgStar;
                                                SVGAView sVGAView5 = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                                                if (sVGAView5 != null) {
                                                    i = o0OO00O.svgaHeaderFrame;
                                                    SVGAView sVGAView6 = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (sVGAView6 != null) {
                                                        i = o0OO00O.tvFromUser;
                                                        TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                        if (textView != null) {
                                                            i = o0OO00O.tvGiftEnd;
                                                            TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                            if (textView2 != null) {
                                                                i = o0OO00O.tvTitle;
                                                                TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                if (textView3 != null) {
                                                                    i = o0OO00O.tvTo;
                                                                    TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                    if (textView4 != null) {
                                                                        i = o0OO00O.tvToUser;
                                                                        TextView textView5 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                        if (textView5 != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.viewEnd), viewInflate)) != null) {
                                                                            return new k3((ConstraintLayout) viewInflate, netImageView, netImageView2, imageView, netImageView3, giftNumberView, sVGAView, sVGAView2, sVGAView3, sVGAView4, sVGAView5, sVGAView6, textView, textView2, textView3, textView4, textView5, viewOooO00o);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
