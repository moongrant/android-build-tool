package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.GiftNumberView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class cj implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageView f49120OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49121OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f49122OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f49123OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f49124OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f49125OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final UserPremiumView f49126OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final UserPremiumView f49127OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49128OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f49129OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final GiftNumberView f49130OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49131OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final ImageView f49132OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final SVGAView f49133OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f49134OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f49135OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final TextView f49136OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f49137OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NonNull
    public final TextView f49138OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NonNull
    public final TextView f49139OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public final TextView f49140OooOo00;

    public cj(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull ImageView imageView, @NonNull NetImageView netImageView2, @NonNull UserPremiumView userPremiumView, @NonNull ImageView imageView2, @NonNull UserPremiumView userPremiumView2, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull GiftNumberView giftNumberView, @NonNull LinearLayout linearLayout2, @NonNull SVGAView sVGAView, @NonNull ImageView imageView5, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.f49121OooO00o = constraintLayout;
        this.f49122OooO0O0 = netImageView;
        this.f49123OooO0OO = imageView;
        this.f49124OooO0Oo = netImageView2;
        this.f49126OooO0o0 = userPremiumView;
        this.f49125OooO0o = imageView2;
        this.f49127OooO0oO = userPremiumView2;
        this.f49128OooO0oo = linearLayout;
        this.f49120OooO = imageView3;
        this.f49129OooOO0 = imageView4;
        this.f49130OooOO0O = giftNumberView;
        this.f49131OooOO0o = linearLayout2;
        this.f49133OooOOO0 = sVGAView;
        this.f49132OooOOO = imageView5;
        this.f49134OooOOOO = textView;
        this.f49135OooOOOo = textView2;
        this.f49137OooOOo0 = textView3;
        this.f49136OooOOo = textView4;
        this.f49138OooOOoo = textView5;
        this.f49140OooOo00 = textView6;
        this.f49139OooOo0 = textView7;
    }

    @NonNull
    public static cj inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49121OooO00o;
    }

    @NonNull
    public static cj inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_room_broadcast_static, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivGiftImage;
        NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivGiftImage);
        if (netImageView != null) {
            i = R.id.ivGo;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivGo);
            if (imageView != null) {
                i = R.id.ivHeaderImage;
                NetImageView netImageView2 = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivHeaderImage);
                if (netImageView2 != null) {
                    i = R.id.ivTitle;
                    UserPremiumView userPremiumView = (UserPremiumView) o00Oo0.OooO00o(viewInflate, R.id.ivTitle);
                    if (userPremiumView != null) {
                        i = R.id.ivType;
                        ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivType);
                        if (imageView2 != null) {
                            i = R.id.ivUserVip;
                            UserPremiumView userPremiumView2 = (UserPremiumView) o00Oo0.OooO00o(viewInflate, R.id.ivUserVip);
                            if (userPremiumView2 != null) {
                                i = R.id.layoutContent;
                                LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.layoutContent);
                                if (linearLayout != null) {
                                    i = R.id.layoutContent30;
                                    ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.layoutContent30);
                                    if (imageView3 != null) {
                                        i = R.id.layoutContent40;
                                        ImageView imageView4 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.layoutContent40);
                                        if (imageView4 != null) {
                                            i = R.id.layoutGiftNumber;
                                            GiftNumberView giftNumberView = (GiftNumberView) o00Oo0.OooO00o(viewInflate, R.id.layoutGiftNumber);
                                            if (giftNumberView != null) {
                                                i = R.id.layoutTitle;
                                                LinearLayout linearLayout2 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.layoutTitle);
                                                if (linearLayout2 != null) {
                                                    i = R.id.svgaBg;
                                                    SVGAView sVGAView = (SVGAView) o00Oo0.OooO00o(viewInflate, R.id.svgaBg);
                                                    if (sVGAView != null) {
                                                        i = R.id.topView;
                                                        ImageView imageView5 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.topView);
                                                        if (imageView5 != null) {
                                                            i = R.id.tvContent;
                                                            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvContent);
                                                            if (textView != null) {
                                                                i = R.id.tvFromUser;
                                                                TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvFromUser);
                                                                if (textView2 != null) {
                                                                    i = R.id.tvLuckyEnd;
                                                                    TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvLuckyEnd);
                                                                    if (textView3 != null) {
                                                                        i = R.id.tvTitle;
                                                                        TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTitle);
                                                                        if (textView4 != null) {
                                                                            i = R.id.tvTo;
                                                                            TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTo);
                                                                            if (textView5 != null) {
                                                                                i = R.id.tvToUser;
                                                                                TextView textView6 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvToUser);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.tvWow;
                                                                                    TextView textView7 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvWow);
                                                                                    if (textView7 != null) {
                                                                                        return new cj((ConstraintLayout) viewInflate, netImageView, imageView, netImageView2, userPremiumView, imageView2, userPremiumView2, linearLayout, imageView3, imageView4, giftNumberView, linearLayout2, sVGAView, imageView5, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
