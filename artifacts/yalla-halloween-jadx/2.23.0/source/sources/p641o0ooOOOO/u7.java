package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.SexView;
import com.yalla.yalla.ui.view.UserPremiumView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class u7 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f58959OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58960OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58961OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f58962OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f58963OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f58964OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f58965OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f58966OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final SexView f58967OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f58968OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f58969OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f58970OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f58971OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f58972OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f58973OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final View f58974OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f58975OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final UserPremiumView f58976OooOOo0;

    public u7(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull NetImageView netImageView, @NonNull AppCompatImageView appCompatImageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull SexView sexView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull AppCompatTextView appCompatTextView, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull View view, @NonNull UserPremiumView userPremiumView, @NonNull ViewPager2 viewPager2) {
        this.f58960OooO00o = constraintLayout;
        this.f58961OooO0O0 = constraintLayout2;
        this.f58962OooO0OO = imageView;
        this.f58963OooO0Oo = netImageView;
        this.f58965OooO0o0 = appCompatImageView;
        this.f58964OooO0o = imageView2;
        this.f58966OooO0oO = imageView3;
        this.f58967OooO0oo = sexView;
        this.f58959OooO = textView;
        this.f58968OooOO0 = textView2;
        this.f58969OooOO0O = textView3;
        this.f58970OooOO0o = textView4;
        this.f58972OooOOO0 = appCompatTextView;
        this.f58971OooOOO = textView5;
        this.f58973OooOOOO = textView6;
        this.f58974OooOOOo = view;
        this.f58976OooOOo0 = userPremiumView;
        this.f58975OooOOo = viewPager2;
    }

    @NonNull
    public static u7 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58960OooO00o;
    }

    @NonNull
    public static u7 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_dialog_guessing_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.clSelfRanking;
        ConstraintLayout constraintLayout = (ConstraintLayout) OooOO0.OooO00o(i, viewInflate);
        if (constraintLayout != null) {
            i = oO00O0oO.ivDesc;
            ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = oO00O0oO.ivHeader;
                NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                if (netImageView != null) {
                    i = oO00O0oO.ivHeaderHonor;
                    if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                        i = oO00O0oO.ivRanking;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) OooOO0.OooO00o(i, viewInflate);
                        if (appCompatImageView != null) {
                            i = oO00O0oO.ivRankingFrame;
                            ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                            if (imageView2 != null) {
                                i = oO00O0oO.ivType;
                                ImageView imageView3 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                                if (imageView3 != null) {
                                    i = oO00O0oO.llTable;
                                    if (((LinearLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                                        i = oO00O0oO.sexView;
                                        SexView sexView = (SexView) OooOO0.OooO00o(i, viewInflate);
                                        if (sexView != null) {
                                            i = oO00O0oO.tvGiftListTable;
                                            TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                                            if (textView != null) {
                                                i = oO00O0oO.tvGiftNumber;
                                                TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                if (textView2 != null) {
                                                    i = oO00O0oO.tvHeaderHonor;
                                                    TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                    if (textView3 != null) {
                                                        i = oO00O0oO.tvName;
                                                        TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                        if (textView4 != null) {
                                                            i = oO00O0oO.tvRanking;
                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                                                            if (appCompatTextView != null) {
                                                                i = oO00O0oO.tvStarListTable;
                                                                TextView textView5 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                if (textView5 != null) {
                                                                    i = oO00O0oO.tvTips;
                                                                    TextView textView6 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                                                    if (textView6 != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.vClose), viewInflate)) != null) {
                                                                        i = oO00O0oO.vipView;
                                                                        UserPremiumView userPremiumView = (UserPremiumView) OooOO0.OooO00o(i, viewInflate);
                                                                        if (userPremiumView != null) {
                                                                            i = oO00O0oO.vpGuessingList;
                                                                            ViewPager2 viewPager2 = (ViewPager2) OooOO0.OooO00o(i, viewInflate);
                                                                            if (viewPager2 != null) {
                                                                                return new u7((ConstraintLayout) viewInflate, constraintLayout, imageView, netImageView, appCompatImageView, imageView2, imageView3, sexView, textView, textView2, textView3, textView4, appCompatTextView, textView5, textView6, viewOooO00o, userPremiumView, viewPager2);
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
