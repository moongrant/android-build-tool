package p641o0ooOOOO;

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
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class vb implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final SVGAView f59087OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59088OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f59089OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f59090OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f59091OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final GiftNumberView f59092OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f59093OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final SVGAView f59094OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final SVGAView f59095OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final SVGAView f59096OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final SVGAView f59097OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final SVGAView f59098OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f59099OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f59100OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f59101OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f59102OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final View f59103OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f59104OooOOo0;

    public vb(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull NetImageView netImageView2, @NonNull ImageView imageView, @NonNull NetImageView netImageView3, @NonNull GiftNumberView giftNumberView, @NonNull SVGAView sVGAView, @NonNull SVGAView sVGAView2, @NonNull SVGAView sVGAView3, @NonNull SVGAView sVGAView4, @NonNull SVGAView sVGAView5, @NonNull SVGAView sVGAView6, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull View view) {
        this.f59088OooO00o = constraintLayout;
        this.f59089OooO0O0 = netImageView;
        this.f59090OooO0OO = netImageView2;
        this.f59091OooO0Oo = imageView;
        this.f59093OooO0o0 = netImageView3;
        this.f59092OooO0o = giftNumberView;
        this.f59094OooO0oO = sVGAView;
        this.f59095OooO0oo = sVGAView2;
        this.f59087OooO = sVGAView3;
        this.f59096OooOO0 = sVGAView4;
        this.f59097OooOO0O = sVGAView5;
        this.f59098OooOO0o = sVGAView6;
        this.f59100OooOOO0 = textView;
        this.f59099OooOOO = textView2;
        this.f59101OooOOOO = textView3;
        this.f59102OooOOOo = textView4;
        this.f59104OooOOo0 = textView5;
        this.f59103OooOOo = view;
    }

    @NonNull
    public static vb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59088OooO00o;
    }

    @NonNull
    public static vb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.view_room_broadcast_vip6, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivGiftImage;
        NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
        if (netImageView != null) {
            i = oO00O0oO.ivGiftType;
            NetImageView netImageView2 = (NetImageView) OooOO0.OooO00o(i, viewInflate);
            if (netImageView2 != null) {
                i = oO00O0oO.ivGo;
                ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = oO00O0oO.ivHeaderImage;
                    NetImageView netImageView3 = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                    if (netImageView3 != null) {
                        i = oO00O0oO.layoutContent;
                        if (((LinearLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                            i = oO00O0oO.layoutGiftNumber;
                            GiftNumberView giftNumberView = (GiftNumberView) OooOO0.OooO00o(i, viewInflate);
                            if (giftNumberView != null) {
                                i = oO00O0oO.svgaBgBig;
                                SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i, viewInflate);
                                if (sVGAView != null) {
                                    i = oO00O0oO.svgaBgGo;
                                    SVGAView sVGAView2 = (SVGAView) OooOO0.OooO00o(i, viewInflate);
                                    if (sVGAView2 != null) {
                                        i = oO00O0oO.svgaBgMiddle;
                                        SVGAView sVGAView3 = (SVGAView) OooOO0.OooO00o(i, viewInflate);
                                        if (sVGAView3 != null) {
                                            i = oO00O0oO.svgaBgSmall;
                                            SVGAView sVGAView4 = (SVGAView) OooOO0.OooO00o(i, viewInflate);
                                            if (sVGAView4 != null) {
                                                i = oO00O0oO.svgaBgStar;
                                                SVGAView sVGAView5 = (SVGAView) OooOO0.OooO00o(i, viewInflate);
                                                if (sVGAView5 != null) {
                                                    i = oO00O0oO.svgaHeaderFrame;
                                                    SVGAView sVGAView6 = (SVGAView) OooOO0.OooO00o(i, viewInflate);
                                                    if (sVGAView6 != null) {
                                                        i = oO00O0oO.tvFromUser;
                                                        TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                        if (textView != null) {
                                                            i = oO00O0oO.tvGiftEnd;
                                                            TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                            if (textView2 != null) {
                                                                i = oO00O0oO.tvTitle;
                                                                TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                if (textView3 != null) {
                                                                    i = oO00O0oO.tvTo;
                                                                    TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                    if (textView4 != null) {
                                                                        i = oO00O0oO.tvToUser;
                                                                        TextView textView5 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                        if (textView5 != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.viewEnd), viewInflate)) != null) {
                                                                            return new vb((ConstraintLayout) viewInflate, netImageView, netImageView2, imageView, netImageView3, giftNumberView, sVGAView, sVGAView2, sVGAView3, sVGAView4, sVGAView5, sVGAView6, textView, textView2, textView3, textView4, textView5, viewOooO00o);
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
