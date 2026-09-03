package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ni implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f50128OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50129OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f50130OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final NetImageView f50131OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f50132OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f50133OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f50134OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f50135OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f50136OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f50137OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f50138OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50139OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NonNull
    public final View f50140OooOOO0;

    public ni(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull NetImageView netImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3, @NonNull AppCompatTextView appCompatTextView4, @NonNull AppCompatTextView appCompatTextView5, @NonNull AppCompatTextView appCompatTextView6, @NonNull AppCompatTextView appCompatTextView7, @NonNull ConstraintLayout constraintLayout2, @NonNull View view) {
        this.f50129OooO00o = constraintLayout;
        this.f50130OooO0O0 = appCompatImageView;
        this.f50131OooO0OO = netImageView;
        this.f50132OooO0Oo = appCompatImageView2;
        this.f50134OooO0o0 = appCompatTextView;
        this.f50133OooO0o = appCompatTextView2;
        this.f50135OooO0oO = appCompatTextView3;
        this.f50136OooO0oo = appCompatTextView4;
        this.f50128OooO = appCompatTextView5;
        this.f50137OooOO0 = appCompatTextView6;
        this.f50138OooOO0O = appCompatTextView7;
        this.f50139OooOO0o = constraintLayout2;
        this.f50140OooOOO0 = view;
    }

    @NonNull
    public static ni OooO00o(@NonNull View view) {
        int i = R.id.ivRank;
        AppCompatImageView appCompatImageView = (AppCompatImageView) o00Oo0.OooO00o(view, R.id.ivRank);
        if (appCompatImageView != null) {
            i = R.id.ivUserHead;
            NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(view, R.id.ivUserHead);
            if (netImageView != null) {
                i = R.id.ivUserMark;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) o00Oo0.OooO00o(view, R.id.ivUserMark);
                if (appCompatImageView2 != null) {
                    i = R.id.tvRank;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) o00Oo0.OooO00o(view, R.id.tvRank);
                    if (appCompatTextView != null) {
                        i = R.id.tvRankBronze;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) o00Oo0.OooO00o(view, R.id.tvRankBronze);
                        if (appCompatTextView2 != null) {
                            i = R.id.tvRankDiamond;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) o00Oo0.OooO00o(view, R.id.tvRankDiamond);
                            if (appCompatTextView3 != null) {
                                i = R.id.tvRankGold;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) o00Oo0.OooO00o(view, R.id.tvRankGold);
                                if (appCompatTextView4 != null) {
                                    i = R.id.tvRankName;
                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) o00Oo0.OooO00o(view, R.id.tvRankName);
                                    if (appCompatTextView5 != null) {
                                        i = R.id.tvRankNum;
                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) o00Oo0.OooO00o(view, R.id.tvRankNum);
                                        if (appCompatTextView6 != null) {
                                            i = R.id.tvRankSilver;
                                            AppCompatTextView appCompatTextView7 = (AppCompatTextView) o00Oo0.OooO00o(view, R.id.tvRankSilver);
                                            if (appCompatTextView7 != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                i = R.id.vLine;
                                                View viewOooO00o = o00Oo0.OooO00o(view, R.id.vLine);
                                                if (viewOooO00o != null) {
                                                    return new ni(constraintLayout, appCompatImageView, netImageView, appCompatImageView2, appCompatTextView, appCompatTextView2, appCompatTextView3, appCompatTextView4, appCompatTextView5, appCompatTextView6, appCompatTextView7, constraintLayout, viewOooO00o);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ni inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50129OooO00o;
    }

    @NonNull
    public static ni inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_item_badge_rank, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
