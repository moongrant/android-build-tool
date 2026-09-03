package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.ui.view.MarqueeRecyclerView;
import com.yalla.yalla.ui.view.UserMedalView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class ab implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57519OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f57520OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final UserMedalView f57521OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f57522OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f57523OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final MarqueeRecyclerView f57524OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f57525OooO0oO;

    public ab(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull UserMedalView userMedalView, @NonNull AppCompatTextView appCompatTextView, @NonNull MarqueeRecyclerView marqueeRecyclerView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3) {
        this.f57519OooO00o = constraintLayout;
        this.f57520OooO0O0 = netImageView;
        this.f57521OooO0OO = userMedalView;
        this.f57522OooO0Oo = appCompatTextView;
        this.f57524OooO0o0 = marqueeRecyclerView;
        this.f57523OooO0o = appCompatTextView2;
        this.f57525OooO0oO = appCompatTextView3;
    }

    @NonNull
    public static ab OooO00o(@NonNull View view) {
        int i = oO00O0oO.ivUserHead;
        NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, view);
        if (netImageView != null) {
            i = oO00O0oO.llTop;
            if (((LinearLayoutCompat) OooOO0.OooO00o(i, view)) != null) {
                i = oO00O0oO.medalView;
                UserMedalView userMedalView = (UserMedalView) OooOO0.OooO00o(i, view);
                if (userMedalView != null) {
                    i = oO00O0oO.rankUserAll;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) OooOO0.OooO00o(i, view);
                    if (appCompatTextView != null) {
                        i = oO00O0oO.rvBanner;
                        MarqueeRecyclerView marqueeRecyclerView = (MarqueeRecyclerView) OooOO0.OooO00o(i, view);
                        if (marqueeRecyclerView != null) {
                            i = oO00O0oO.tvUserName;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) OooOO0.OooO00o(i, view);
                            if (appCompatTextView2 != null) {
                                i = oO00O0oO.tvWearBadge;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) OooOO0.OooO00o(i, view);
                                if (appCompatTextView3 != null) {
                                    return new ab((ConstraintLayout) view, netImageView, userMedalView, appCompatTextView, marqueeRecyclerView, appCompatTextView2, appCompatTextView3);
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
    public static ab inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57519OooO00o;
    }

    @NonNull
    public static ab inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.user_header_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
