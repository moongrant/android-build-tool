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
import com.yalla.yalla.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.gift.GiftNumberView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class ub implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageView f58985OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58986OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f58987OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f58988OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f58989OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f58990OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final UserPremiumView f58991OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final UserPremiumView f58992OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58993OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f58994OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final GiftNumberView f58995OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58996OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final ImageView f58997OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final SVGAView f58998OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f58999OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f59000OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final TextView f59001OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f59002OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NonNull
    public final TextView f59003OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NonNull
    public final TextView f59004OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public final TextView f59005OooOo00;

    public ub(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull ImageView imageView, @NonNull NetImageView netImageView2, @NonNull UserPremiumView userPremiumView, @NonNull ImageView imageView2, @NonNull UserPremiumView userPremiumView2, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull GiftNumberView giftNumberView, @NonNull LinearLayout linearLayout2, @NonNull SVGAView sVGAView, @NonNull ImageView imageView5, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.f58986OooO00o = constraintLayout;
        this.f58987OooO0O0 = netImageView;
        this.f58988OooO0OO = imageView;
        this.f58989OooO0Oo = netImageView2;
        this.f58991OooO0o0 = userPremiumView;
        this.f58990OooO0o = imageView2;
        this.f58992OooO0oO = userPremiumView2;
        this.f58993OooO0oo = linearLayout;
        this.f58985OooO = imageView3;
        this.f58994OooOO0 = imageView4;
        this.f58995OooOO0O = giftNumberView;
        this.f58996OooOO0o = linearLayout2;
        this.f58998OooOOO0 = sVGAView;
        this.f58997OooOOO = imageView5;
        this.f58999OooOOOO = textView;
        this.f59000OooOOOo = textView2;
        this.f59002OooOOo0 = textView3;
        this.f59001OooOOo = textView4;
        this.f59003OooOOoo = textView5;
        this.f59005OooOo00 = textView6;
        this.f59004OooOo0 = textView7;
    }

    @NonNull
    public static ub inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58986OooO00o;
    }

    @NonNull
    public static ub inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.view_room_broadcast_all, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivGiftImage;
        NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
        if (netImageView != null) {
            i = oO00O0oO.ivGo;
            ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = oO00O0oO.ivHeaderImage;
                NetImageView netImageView2 = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                if (netImageView2 != null) {
                    i = oO00O0oO.ivTitle;
                    UserPremiumView userPremiumView = (UserPremiumView) OooOO0.OooO00o(i, viewInflate);
                    if (userPremiumView != null) {
                        i = oO00O0oO.ivType;
                        ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                        if (imageView2 != null) {
                            i = oO00O0oO.ivUserVip;
                            UserPremiumView userPremiumView2 = (UserPremiumView) OooOO0.OooO00o(i, viewInflate);
                            if (userPremiumView2 != null) {
                                i = oO00O0oO.layoutContent;
                                LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                                if (linearLayout != null) {
                                    i = oO00O0oO.layoutContent30;
                                    ImageView imageView3 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                    if (imageView3 != null) {
                                        i = oO00O0oO.layoutContent40;
                                        ImageView imageView4 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                        if (imageView4 != null) {
                                            i = oO00O0oO.layoutGiftNumber;
                                            GiftNumberView giftNumberView = (GiftNumberView) OooOO0.OooO00o(i, viewInflate);
                                            if (giftNumberView != null) {
                                                i = oO00O0oO.layoutTitle;
                                                LinearLayout linearLayout2 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                                                if (linearLayout2 != null) {
                                                    i = oO00O0oO.svgaBg;
                                                    SVGAView sVGAView = (SVGAView) OooOO0.OooO00o(i, viewInflate);
                                                    if (sVGAView != null) {
                                                        i = oO00O0oO.topView;
                                                        ImageView imageView5 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                                        if (imageView5 != null) {
                                                            i = oO00O0oO.tvContent;
                                                            TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                            if (textView != null) {
                                                                i = oO00O0oO.tvFromUser;
                                                                TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                if (textView2 != null) {
                                                                    i = oO00O0oO.tvLuckyEnd;
                                                                    TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                    if (textView3 != null) {
                                                                        i = oO00O0oO.tvTitle;
                                                                        TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                        if (textView4 != null) {
                                                                            i = oO00O0oO.tvTo;
                                                                            TextView textView5 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                            if (textView5 != null) {
                                                                                i = oO00O0oO.tvToUser;
                                                                                TextView textView6 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                                if (textView6 != null) {
                                                                                    i = oO00O0oO.tvWow;
                                                                                    TextView textView7 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                                    if (textView7 != null) {
                                                                                        return new ub((ConstraintLayout) viewInflate, netImageView, imageView, netImageView2, userPremiumView, imageView2, userPremiumView2, linearLayout, imageView3, imageView4, giftNumberView, linearLayout2, sVGAView, imageView5, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
