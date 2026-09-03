package p641o0ooOOOO;

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
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class k7 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58279OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58280OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58281OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58282OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f58283OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f58284OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f58285OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f58286OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58287OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58288OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58289OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f58290OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f58291OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f58292OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f58293OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f58294OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final TextView f58295OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f58296OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NonNull
    public final TextView f58297OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public final View f58298OooOo00;

    public k7(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull NetImageView netImageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull View view) {
        this.f58280OooO00o = constraintLayout;
        this.f58281OooO0O0 = frameLayout;
        this.f58282OooO0OO = frameLayout2;
        this.f58283OooO0Oo = imageView;
        this.f58285OooO0o0 = netImageView;
        this.f58284OooO0o = imageView2;
        this.f58286OooO0oO = imageView3;
        this.f58287OooO0oo = linearLayout;
        this.f58279OooO = linearLayout2;
        this.f58288OooOO0 = linearLayout3;
        this.f58289OooOO0O = linearLayout4;
        this.f58290OooOO0o = textView;
        this.f58292OooOOO0 = textView2;
        this.f58291OooOOO = textView3;
        this.f58293OooOOOO = textView4;
        this.f58294OooOOOo = textView5;
        this.f58296OooOOo0 = textView6;
        this.f58295OooOOo = textView7;
        this.f58297OooOOoo = textView8;
        this.f58298OooOo00 = view;
    }

    @NonNull
    public static k7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58280OooO00o;
    }

    @NonNull
    public static k7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_activity_theme_layout_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.flSelectedThemeBg;
        FrameLayout frameLayout = (FrameLayout) OooOO0.OooO00o(i, viewInflate);
        if (frameLayout != null) {
            i = oO00O0oO.flSendGift;
            FrameLayout frameLayout2 = (FrameLayout) OooOO0.OooO00o(i, viewInflate);
            if (frameLayout2 != null) {
                i = oO00O0oO.ivCoin;
                ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = oO00O0oO.ivTheme;
                    NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                    if (netImageView != null) {
                        i = oO00O0oO.ivThemeType;
                        ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                        if (imageView2 != null) {
                            i = oO00O0oO.ivZoomTheme;
                            ImageView imageView3 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                            if (imageView3 != null) {
                                i = oO00O0oO.llBottomPrice;
                                LinearLayout linearLayout = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                                if (linearLayout != null) {
                                    i = oO00O0oO.llBottomPurchase;
                                    LinearLayout linearLayout2 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                                    if (linearLayout2 != null) {
                                        i = oO00O0oO.llThemePrice;
                                        LinearLayout linearLayout3 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                                        if (linearLayout3 != null) {
                                            i = oO00O0oO.llThemeType;
                                            LinearLayout linearLayout4 = (LinearLayout) OooOO0.OooO00o(i, viewInflate);
                                            if (linearLayout4 != null) {
                                                i = oO00O0oO.tvActivityTheme;
                                                TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                if (textView != null) {
                                                    i = oO00O0oO.tvLimitTime;
                                                    TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                    if (textView2 != null) {
                                                        i = oO00O0oO.tvRemainNum;
                                                        TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                        if (textView3 != null) {
                                                            i = oO00O0oO.tvThemeCost;
                                                            TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                            if (textView4 != null) {
                                                                i = oO00O0oO.tvThemeName;
                                                                TextView textView5 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                if (textView5 != null) {
                                                                    i = oO00O0oO.tvThemePrice;
                                                                    TextView textView6 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                    if (textView6 != null) {
                                                                        i = oO00O0oO.tvThemePurchase;
                                                                        TextView textView7 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                        if (textView7 != null) {
                                                                            i = oO00O0oO.tvThemeType;
                                                                            TextView textView8 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                            if (textView8 != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.vMask), viewInflate)) != null) {
                                                                                return new k7((ConstraintLayout) viewInflate, frameLayout, frameLayout2, imageView, netImageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, viewOooO00o);
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
