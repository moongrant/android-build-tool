package p651o0ooOOoo;

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
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p105o000oo0O.o00O0O;
import p105o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class te implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50648OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50649OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FrameLayout f50650OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final FrameLayout f50651OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50652OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f50653OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f50654OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f50655OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50656OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50657OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50658OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f50659OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f50660OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final TextView f50661OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f50662OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final TextView f50663OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final TextView f50664OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final TextView f50665OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NonNull
    public final TextView f50666OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NonNull
    public final View f50667OooOo00;

    public te(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView, @NonNull NetImageView netImageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull View view) {
        this.f50649OooO00o = constraintLayout;
        this.f50650OooO0O0 = frameLayout;
        this.f50651OooO0OO = frameLayout2;
        this.f50652OooO0Oo = imageView;
        this.f50654OooO0o0 = netImageView;
        this.f50653OooO0o = imageView2;
        this.f50655OooO0oO = imageView3;
        this.f50656OooO0oo = linearLayout;
        this.f50648OooO = linearLayout2;
        this.f50657OooOO0 = linearLayout3;
        this.f50658OooOO0O = linearLayout4;
        this.f50659OooOO0o = textView;
        this.f50661OooOOO0 = textView2;
        this.f50660OooOOO = textView3;
        this.f50662OooOOOO = textView4;
        this.f50663OooOOOo = textView5;
        this.f50665OooOOo0 = textView6;
        this.f50664OooOOo = textView7;
        this.f50666OooOOoo = textView8;
        this.f50667OooOo00 = view;
    }

    @NonNull
    public static te inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p105o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50649OooO00o;
    }

    @NonNull
    public static te inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_activity_theme_layout_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.flSelectedThemeBg;
        FrameLayout frameLayout = (FrameLayout) o00Oo0.OooO00o(viewInflate, R.id.flSelectedThemeBg);
        if (frameLayout != null) {
            i = R.id.flSendGift;
            FrameLayout frameLayout2 = (FrameLayout) o00Oo0.OooO00o(viewInflate, R.id.flSendGift);
            if (frameLayout2 != null) {
                i = R.id.ivCoin;
                ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivCoin);
                if (imageView != null) {
                    i = R.id.ivTheme;
                    NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivTheme);
                    if (netImageView != null) {
                        i = R.id.ivThemeType;
                        ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivThemeType);
                        if (imageView2 != null) {
                            i = R.id.ivZoomTheme;
                            ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivZoomTheme);
                            if (imageView3 != null) {
                                i = R.id.llBottomPrice;
                                LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llBottomPrice);
                                if (linearLayout != null) {
                                    i = R.id.llBottomPurchase;
                                    LinearLayout linearLayout2 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llBottomPurchase);
                                    if (linearLayout2 != null) {
                                        i = R.id.llThemePrice;
                                        LinearLayout linearLayout3 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llThemePrice);
                                        if (linearLayout3 != null) {
                                            i = R.id.llThemeType;
                                            LinearLayout linearLayout4 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llThemeType);
                                            if (linearLayout4 != null) {
                                                i = R.id.tvActivityTheme;
                                                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvActivityTheme);
                                                if (textView != null) {
                                                    i = R.id.tvLimitTime;
                                                    TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvLimitTime);
                                                    if (textView2 != null) {
                                                        i = R.id.tvRemainNum;
                                                        TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvRemainNum);
                                                        if (textView3 != null) {
                                                            i = R.id.tvThemeCost;
                                                            TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvThemeCost);
                                                            if (textView4 != null) {
                                                                i = R.id.tvThemeName;
                                                                TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvThemeName);
                                                                if (textView5 != null) {
                                                                    i = R.id.tvThemePrice;
                                                                    TextView textView6 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvThemePrice);
                                                                    if (textView6 != null) {
                                                                        i = R.id.tvThemePurchase;
                                                                        TextView textView7 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvThemePurchase);
                                                                        if (textView7 != null) {
                                                                            i = R.id.tvThemeType;
                                                                            TextView textView8 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvThemeType);
                                                                            if (textView8 != null) {
                                                                                i = R.id.vMask;
                                                                                View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.vMask);
                                                                                if (viewOooO00o != null) {
                                                                                    return new te((ConstraintLayout) viewInflate, frameLayout, frameLayout2, imageView, netImageView, imageView2, imageView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, viewOooO00o);
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
