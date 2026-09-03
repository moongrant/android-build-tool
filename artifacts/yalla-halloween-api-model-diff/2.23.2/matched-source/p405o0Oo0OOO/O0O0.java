package p405o0Oo0OOO;

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
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class O0O0 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43675OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43676OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f43677OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FrameLayout f43678OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f43679OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f43680OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f43681OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f43682OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43683OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43684OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final LinearLayout f43685OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f43686OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f43687OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f43688OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f43689OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f43690OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final TextView f43691OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f43692OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NonNull
    public final TextView f43693OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public final View f43694OooOo00;

    public O0O0(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull NetImageView netImageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull View view) {
        this.f43676OooO00o = constraintLayout;
        this.f43677OooO0O0 = frameLayout;
        this.f43678OooO0OO = frameLayout2;
        this.f43679OooO0Oo = imageView;
        this.f43681OooO0o0 = netImageView;
        this.f43680OooO0o = imageView2;
        this.f43682OooO0oO = imageView3;
        this.f43683OooO0oo = linearLayout;
        this.f43675OooO = linearLayout2;
        this.f43684OooOO0 = linearLayout3;
        this.f43685OooOO0O = linearLayout4;
        this.f43686OooOO0o = textView;
        this.f43688OooOOO0 = textView2;
        this.f43687OooOOO = textView3;
        this.f43689OooOOOO = textView4;
        this.f43690OooOOOo = textView5;
        this.f43692OooOOo0 = textView6;
        this.f43691OooOOo = textView7;
        this.f43693OooOOoo = textView8;
        this.f43694OooOo00 = view;
    }

    @NonNull
    public static O0O0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43676OooO00o;
    }

    @NonNull
    public static O0O0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_activity_theme_layout_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.flSelectedThemeBg;
        FrameLayout frameLayout = (FrameLayout) OooO0O0.OooO00o(i, viewInflate);
        if (frameLayout != null) {
            i = o0OO00O.flSendGift;
            FrameLayout frameLayout2 = (FrameLayout) OooO0O0.OooO00o(i, viewInflate);
            if (frameLayout2 != null) {
                i = o0OO00O.ivCoin;
                ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = o0OO00O.ivTheme;
                    NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                    if (netImageView != null) {
                        i = o0OO00O.ivThemeType;
                        ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                        if (imageView2 != null) {
                            i = o0OO00O.ivZoomTheme;
                            ImageView imageView3 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                            if (imageView3 != null) {
                                i = o0OO00O.llBottomPrice;
                                LinearLayout linearLayout = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                                if (linearLayout != null) {
                                    i = o0OO00O.llBottomPurchase;
                                    LinearLayout linearLayout2 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                                    if (linearLayout2 != null) {
                                        i = o0OO00O.llThemePrice;
                                        LinearLayout linearLayout3 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                                        if (linearLayout3 != null) {
                                            i = o0OO00O.llThemeType;
                                            LinearLayout linearLayout4 = (LinearLayout) OooO0O0.OooO00o(i, viewInflate);
                                            if (linearLayout4 != null) {
                                                i = o0OO00O.tvActivityTheme;
                                                TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                if (textView != null) {
                                                    i = o0OO00O.tvLimitTime;
                                                    TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (textView2 != null) {
                                                        i = o0OO00O.tvRemainNum;
                                                        TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                        if (textView3 != null) {
                                                            i = o0OO00O.tvThemeCost;
                                                            TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                            if (textView4 != null) {
                                                                i = o0OO00O.tvThemeName;
                                                                TextView textView5 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                if (textView5 != null) {
                                                                    i = o0OO00O.tvThemePrice;
                                                                    TextView textView6 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                    if (textView6 != null) {
                                                                        i = o0OO00O.tvThemePurchase;
                                                                        TextView textView7 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                        if (textView7 != null) {
                                                                            i = o0OO00O.tvThemeType;
                                                                            TextView textView8 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                            if (textView8 != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.vMask), viewInflate)) != null) {
                                                                                return new O0O0((ConstraintLayout) viewInflate, frameLayout, frameLayout2, imageView, netImageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, viewOooO00o);
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
