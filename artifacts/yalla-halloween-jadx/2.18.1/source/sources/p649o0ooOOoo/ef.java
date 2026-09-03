package p649o0ooOOoo;

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
import com.app.base.view.SexView;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ef implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f49256OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49257OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49258OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f49259OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f49260OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f49261OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f49262OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f49263OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final SexView f49264OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f49265OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f49266OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f49267OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f49268OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49269OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f49270OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final View f49271OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f49272OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final UserPremiumView f49273OooOOo0;

    public ef(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull NetImageView netImageView, @NonNull AppCompatImageView appCompatImageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull SexView sexView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull AppCompatTextView appCompatTextView, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull View view, @NonNull UserPremiumView userPremiumView, @NonNull ViewPager2 viewPager2) {
        this.f49257OooO00o = constraintLayout;
        this.f49258OooO0O0 = constraintLayout2;
        this.f49259OooO0OO = imageView;
        this.f49260OooO0Oo = netImageView;
        this.f49262OooO0o0 = appCompatImageView;
        this.f49261OooO0o = imageView2;
        this.f49263OooO0oO = imageView3;
        this.f49264OooO0oo = sexView;
        this.f49256OooO = textView;
        this.f49265OooOO0 = textView2;
        this.f49266OooOO0O = textView3;
        this.f49267OooOO0o = textView4;
        this.f49269OooOOO0 = appCompatTextView;
        this.f49268OooOOO = textView5;
        this.f49270OooOOOO = textView6;
        this.f49271OooOOOo = view;
        this.f49273OooOOo0 = userPremiumView;
        this.f49272OooOOo = viewPager2;
    }

    @NonNull
    public static ef inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49257OooO00o;
    }

    @NonNull
    public static ef inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_dialog_guessing_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.clSelfRanking;
        ConstraintLayout constraintLayout = (ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.clSelfRanking);
        if (constraintLayout != null) {
            i = R.id.ivDesc;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivDesc);
            if (imageView != null) {
                i = R.id.ivHeader;
                NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(viewInflate, R.id.ivHeader);
                if (netImageView != null) {
                    i = R.id.ivHeaderHonor;
                    if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivHeaderHonor)) != null) {
                        i = R.id.ivRanking;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) o00Oo0.OooO00o(viewInflate, R.id.ivRanking);
                        if (appCompatImageView != null) {
                            i = R.id.ivRankingFrame;
                            ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivRankingFrame);
                            if (imageView2 != null) {
                                i = R.id.ivType;
                                ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivType);
                                if (imageView3 != null) {
                                    i = R.id.llTable;
                                    if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llTable)) != null) {
                                        i = R.id.sexView;
                                        SexView sexView = (SexView) o00Oo0.OooO00o(viewInflate, R.id.sexView);
                                        if (sexView != null) {
                                            i = R.id.tvGiftListTable;
                                            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvGiftListTable);
                                            if (textView != null) {
                                                i = R.id.tvGiftNumber;
                                                TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvGiftNumber);
                                                if (textView2 != null) {
                                                    i = R.id.tvHeaderHonor;
                                                    TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvHeaderHonor);
                                                    if (textView3 != null) {
                                                        i = R.id.tvName;
                                                        TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvName);
                                                        if (textView4 != null) {
                                                            i = R.id.tvRanking;
                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) o00Oo0.OooO00o(viewInflate, R.id.tvRanking);
                                                            if (appCompatTextView != null) {
                                                                i = R.id.tvStarListTable;
                                                                TextView textView5 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvStarListTable);
                                                                if (textView5 != null) {
                                                                    i = R.id.tvTips;
                                                                    TextView textView6 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTips);
                                                                    if (textView6 != null) {
                                                                        i = R.id.vClose;
                                                                        View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.vClose);
                                                                        if (viewOooO00o != null) {
                                                                            i = R.id.vipView;
                                                                            UserPremiumView userPremiumView = (UserPremiumView) o00Oo0.OooO00o(viewInflate, R.id.vipView);
                                                                            if (userPremiumView != null) {
                                                                                i = R.id.vpGuessingList;
                                                                                ViewPager2 viewPager2 = (ViewPager2) o00Oo0.OooO00o(viewInflate, R.id.vpGuessingList);
                                                                                if (viewPager2 != null) {
                                                                                    return new ef((ConstraintLayout) viewInflate, constraintLayout, imageView, netImageView, appCompatImageView, imageView2, imageView3, sexView, textView, textView2, textView3, textView4, appCompatTextView, textView5, textView6, viewOooO00o, userPremiumView, viewPager2);
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
