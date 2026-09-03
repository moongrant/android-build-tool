package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.UserMedalView;
import com.yalla.yalla.ui.view.MarqueeRecyclerView;
import com.yalla.yalla.util.netimage.NetImageView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ki implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49898OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final NetImageView f49899OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final UserMedalView f49900OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49901OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49902OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final MarqueeRecyclerView f49903OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f49904OooO0oO;

    public ki(@NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull UserMedalView userMedalView, @NonNull AppCompatTextView appCompatTextView, @NonNull MarqueeRecyclerView marqueeRecyclerView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3) {
        this.f49898OooO00o = constraintLayout;
        this.f49899OooO0O0 = netImageView;
        this.f49900OooO0OO = userMedalView;
        this.f49901OooO0Oo = appCompatTextView;
        this.f49903OooO0o0 = marqueeRecyclerView;
        this.f49902OooO0o = appCompatTextView2;
        this.f49904OooO0oO = appCompatTextView3;
    }

    @NonNull
    public static ki OooO00o(@NonNull View view) {
        int i = R.id.ivUserHead;
        NetImageView netImageView = (NetImageView) o00Oo0.OooO00o(view, R.id.ivUserHead);
        if (netImageView != null) {
            i = R.id.llTop;
            if (((LinearLayoutCompat) o00Oo0.OooO00o(view, R.id.llTop)) != null) {
                i = R.id.medalView;
                UserMedalView userMedalView = (UserMedalView) o00Oo0.OooO00o(view, R.id.medalView);
                if (userMedalView != null) {
                    i = R.id.rankUserAll;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) o00Oo0.OooO00o(view, R.id.rankUserAll);
                    if (appCompatTextView != null) {
                        i = R.id.rvBanner;
                        MarqueeRecyclerView marqueeRecyclerView = (MarqueeRecyclerView) o00Oo0.OooO00o(view, R.id.rvBanner);
                        if (marqueeRecyclerView != null) {
                            i = R.id.tvUserName;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) o00Oo0.OooO00o(view, R.id.tvUserName);
                            if (appCompatTextView2 != null) {
                                i = R.id.tvWearBadge;
                                AppCompatTextView appCompatTextView3 = (AppCompatTextView) o00Oo0.OooO00o(view, R.id.tvWearBadge);
                                if (appCompatTextView3 != null) {
                                    return new ki((ConstraintLayout) view, netImageView, userMedalView, appCompatTextView, marqueeRecyclerView, appCompatTextView2, appCompatTextView3);
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
    public static ki inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49898OooO00o;
    }

    @NonNull
    public static ki inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_header_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
