package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final TextView f43882OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43883OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43884OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f43885OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final NetImageView f43886OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ImageView f43887OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f43888OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final ImageView f43889OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final SexView f43890OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final TextView f43891OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final TextView f43892OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final TextView f43893OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NonNull
    public final TextView f43894OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f43895OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NonNull
    public final TextView f43896OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NonNull
    public final View f43897OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NonNull
    public final ViewPager2 f43898OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NonNull
    public final UserPremiumView f43899OooOOo0;

    public h(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView, @NonNull NetImageView netImageView, @NonNull AppCompatImageView appCompatImageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull SexView sexView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull AppCompatTextView appCompatTextView, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull View view, @NonNull UserPremiumView userPremiumView, @NonNull ViewPager2 viewPager2) {
        this.f43883OooO00o = constraintLayout;
        this.f43884OooO0O0 = constraintLayout2;
        this.f43885OooO0OO = imageView;
        this.f43886OooO0Oo = netImageView;
        this.f43888OooO0o0 = appCompatImageView;
        this.f43887OooO0o = imageView2;
        this.f43889OooO0oO = imageView3;
        this.f43890OooO0oo = sexView;
        this.f43882OooO = textView;
        this.f43891OooOO0 = textView2;
        this.f43892OooOO0O = textView3;
        this.f43893OooOO0o = textView4;
        this.f43895OooOOO0 = appCompatTextView;
        this.f43894OooOOO = textView5;
        this.f43896OooOOOO = textView6;
        this.f43897OooOOOo = view;
        this.f43899OooOOo0 = userPremiumView;
        this.f43898OooOOo = viewPager2;
    }

    @NonNull
    public static h inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43883OooO00o;
    }

    @NonNull
    public static h inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewOooO00o;
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_dialog_guessing_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.clSelfRanking;
        ConstraintLayout constraintLayout = (ConstraintLayout) OooO0O0.OooO00o(i, viewInflate);
        if (constraintLayout != null) {
            i = o0OO00O.ivDesc;
            ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = o0OO00O.ivHeader;
                NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, viewInflate);
                if (netImageView != null) {
                    i = o0OO00O.ivHeaderHonor;
                    if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
                        i = o0OO00O.ivRanking;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) OooO0O0.OooO00o(i, viewInflate);
                        if (appCompatImageView != null) {
                            i = o0OO00O.ivRankingFrame;
                            ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                            if (imageView2 != null) {
                                i = o0OO00O.ivType;
                                ImageView imageView3 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                                if (imageView3 != null) {
                                    i = o0OO00O.llTable;
                                    if (((LinearLayout) OooO0O0.OooO00o(i, viewInflate)) != null) {
                                        i = o0OO00O.sexView;
                                        SexView sexView = (SexView) OooO0O0.OooO00o(i, viewInflate);
                                        if (sexView != null) {
                                            i = o0OO00O.tvGiftListTable;
                                            TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                            if (textView != null) {
                                                i = o0OO00O.tvGiftNumber;
                                                TextView textView2 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                if (textView2 != null) {
                                                    i = o0OO00O.tvHeaderHonor;
                                                    TextView textView3 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                    if (textView3 != null) {
                                                        i = o0OO00O.tvName;
                                                        TextView textView4 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                        if (textView4 != null) {
                                                            i = o0OO00O.tvRanking;
                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) OooO0O0.OooO00o(i, viewInflate);
                                                            if (appCompatTextView != null) {
                                                                i = o0OO00O.tvStarListTable;
                                                                TextView textView5 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                if (textView5 != null) {
                                                                    i = o0OO00O.tvTips;
                                                                    TextView textView6 = (TextView) OooO0O0.OooO00o(i, viewInflate);
                                                                    if (textView6 != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.vClose), viewInflate)) != null) {
                                                                        i = o0OO00O.vipView;
                                                                        UserPremiumView userPremiumView = (UserPremiumView) OooO0O0.OooO00o(i, viewInflate);
                                                                        if (userPremiumView != null) {
                                                                            i = o0OO00O.vpGuessingList;
                                                                            ViewPager2 viewPager2 = (ViewPager2) OooO0O0.OooO00o(i, viewInflate);
                                                                            if (viewPager2 != null) {
                                                                                return new h((ConstraintLayout) viewInflate, constraintLayout, imageView, netImageView, appCompatImageView, imageView2, imageView3, sexView, textView, textView2, textView3, textView4, appCompatTextView, textView5, textView6, viewOooO00o, userPremiumView, viewPager2);
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
