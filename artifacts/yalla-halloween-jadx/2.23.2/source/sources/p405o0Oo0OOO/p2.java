package p405o0Oo0OOO;

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
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class p2 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f45384OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f45385OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final UserMedalView f45386OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f45387OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f45388OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final MarqueeRecyclerView f45389OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f45390OooO0oO;

    public p2(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull UserMedalView userMedalView, @NonNull AppCompatTextView appCompatTextView, @NonNull MarqueeRecyclerView marqueeRecyclerView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3) {
        this.f45384OooO00o = constraintLayout;
        this.f45385OooO0O0 = netImageView;
        this.f45386OooO0OO = userMedalView;
        this.f45387OooO0Oo = appCompatTextView;
        this.f45389OooO0o0 = marqueeRecyclerView;
        this.f45388OooO0o = appCompatTextView2;
        this.f45390OooO0oO = appCompatTextView3;
    }

    @NonNull
    public static p2 OooO00o(@NonNull View view) {
        int i = o0OO00O.ivUserHead;
        NetImageView netImageView = (NetImageView) OooO0O0.OooO00o(i, view);
        if (netImageView != null) {
            i = o0OO00O.llTop;
            if (((LinearLayoutCompat) OooO0O0.OooO00o(i, view)) != null) {
                i = o0OO00O.medalView;
                UserMedalView userMedalView = (UserMedalView) OooO0O0.OooO00o(i, view);
                if (userMedalView != null) {
                    i = o0OO00O.rankUserAll;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) OooO0O0.OooO00o(i, view);
                    if (appCompatTextView != null) {
                        i = o0OO00O.rvBanner;
                        MarqueeRecyclerView marqueeRecyclerView = (MarqueeRecyclerView) OooO0O0.OooO00o(i, view);
                        if (marqueeRecyclerView != null) {
                            i = o0OO00O.tvUserName;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) OooO0O0.OooO00o(i, view);
                            if (appCompatTextView2 != null) {
                                i = o0OO00O.tvWearBadge;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) OooO0O0.OooO00o(i, view);
                                if (appCompatTextView3 != null) {
                                    return new p2((ConstraintLayout) view, netImageView, userMedalView, appCompatTextView, marqueeRecyclerView, appCompatTextView2, appCompatTextView3);
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
    public static p2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45384OooO00o;
    }

    @NonNull
    public static p2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.user_header_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
