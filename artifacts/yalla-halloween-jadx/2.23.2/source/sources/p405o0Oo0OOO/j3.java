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
import com.yalla.yalla.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.gift.GiftNumberView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class j3 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final ImageView f43982OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43983OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f43984OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f43985OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f43986OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f43987OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final UserPremiumView f43988OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final UserPremiumView f43989OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43990OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final ImageView f43991OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final GiftNumberView f43992OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43993OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final ImageView f43994OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final SVGAView f43995OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f43996OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f43997OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final TextView f43998OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f43999OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NonNull
    public final TextView f44000OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NonNull
    public final TextView f44001OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public final TextView f44002OooOo00;

    public j3(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull ImageView imageView, @NonNull NetImageView netImageView2, @NonNull UserPremiumView userPremiumView, @NonNull ImageView imageView2, @NonNull UserPremiumView userPremiumView2, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull GiftNumberView giftNumberView, @NonNull LinearLayout linearLayout2, @NonNull SVGAView sVGAView, @NonNull ImageView imageView5, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.f43983OooO00o = constraintLayout;
        this.f43984OooO0O0 = netImageView;
        this.f43985OooO0OO = imageView;
        this.f43986OooO0Oo = netImageView2;
        this.f43988OooO0o0 = userPremiumView;
        this.f43987OooO0o = imageView2;
        this.f43989OooO0oO = userPremiumView2;
        this.f43990OooO0oo = linearLayout;
        this.f43982OooO = imageView3;
        this.f43991OooOO0 = imageView4;
        this.f43992OooOO0O = giftNumberView;
        this.f43993OooOO0o = linearLayout2;
        this.f43995OooOOO0 = sVGAView;
        this.f43994OooOOO = imageView5;
        this.f43996OooOOOO = textView;
        this.f43997OooOOOo = textView2;
        this.f43999OooOOo0 = textView3;
        this.f43998OooOOo = textView4;
        this.f44000OooOOoo = textView5;
        this.f44002OooOo00 = textView6;
        this.f44001OooOo0 = textView7;
    }

    @NonNull
    public static j3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43983OooO00o;
    }

    @NonNull
    public static j3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.view_room_broadcast_all, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivGiftImage;
        NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
        if (netImageView != null) {
            i = o0OO00O.ivGo;
            ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = o0OO00O.ivHeaderImage;
                NetImageView netImageView2 = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                if (netImageView2 != null) {
                    i = o0OO00O.ivTitle;
                    UserPremiumView userPremiumView = (UserPremiumView) OooO0O0.OooO00o(i, viewInflate);
                    if (userPremiumView != null) {
                        i = o0OO00O.ivType;
                        ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                        if (imageView2 != null) {
                            i = o0OO00O.ivUserVip;
                            UserPremiumView userPremiumView2 = (UserPremiumView) OooO0O0.OooO00o(i, viewInflate);
                            if (userPremiumView2 != null) {
                                i = o0OO00O.layoutContent;
                                LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                                if (linearLayout != null) {
                                    i = o0OO00O.layoutContent30;
                                    ImageView imageView3 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                    if (imageView3 != null) {
                                        i = o0OO00O.layoutContent40;
                                        ImageView imageView4 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                        if (imageView4 != null) {
                                            i = o0OO00O.layoutGiftNumber;
                                            GiftNumberView giftNumberView = (GiftNumberView) OooO0O0.OooO00o(i, viewInflate);
                                            if (giftNumberView != null) {
                                                i = o0OO00O.layoutTitle;
                                                LinearLayout linearLayout2 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                                                if (linearLayout2 != null) {
                                                    i = o0OO00O.svgaBg;
                                                    SVGAView sVGAView = (SVGAView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (sVGAView != null) {
                                                        i = o0OO00O.topView;
                                                        ImageView imageView5 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                                        if (imageView5 != null) {
                                                            i = o0OO00O.tvContent;
                                                            TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                            if (textView != null) {
                                                                i = o0OO00O.tvFromUser;
                                                                TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                if (textView2 != null) {
                                                                    i = o0OO00O.tvLuckyEnd;
                                                                    TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                    if (textView3 != null) {
                                                                        i = o0OO00O.tvTitle;
                                                                        TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                        if (textView4 != null) {
                                                                            i = o0OO00O.tvTo;
                                                                            TextView textView5 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                            if (textView5 != null) {
                                                                                i = o0OO00O.tvToUser;
                                                                                TextView textView6 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                                if (textView6 != null) {
                                                                                    i = o0OO00O.tvWow;
                                                                                    TextView textView7 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                                    if (textView7 != null) {
                                                                                        return new j3((ConstraintLayout) viewInflate, netImageView, imageView, netImageView2, userPremiumView, imageView2, userPremiumView2, linearLayout, imageView3, imageView4, giftNumberView, linearLayout2, sVGAView, imageView5, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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
