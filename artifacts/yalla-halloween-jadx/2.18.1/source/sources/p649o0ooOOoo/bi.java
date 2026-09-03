package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class bi implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49063OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f49064OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f49065OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f49066OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f49067OooO0o0;

    public bi(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull RecyclerView recyclerView) {
        this.f49063OooO00o = constraintLayout;
        this.f49064OooO0O0 = appCompatImageView;
        this.f49065OooO0OO = appCompatImageView2;
        this.f49066OooO0Oo = appCompatImageView3;
        this.f49067OooO0o0 = recyclerView;
    }

    @NonNull
    public static bi inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49063OooO00o;
    }

    @NonNull
    public static bi inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_dialog_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivBadgeDetailClose;
        AppCompatImageView appCompatImageView = (AppCompatImageView) o00Oo0.OooO00o(viewInflate, R.id.ivBadgeDetailClose);
        if (appCompatImageView != null) {
            i = R.id.ivBadgeDetailLeft;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) o00Oo0.OooO00o(viewInflate, R.id.ivBadgeDetailLeft);
            if (appCompatImageView2 != null) {
                i = R.id.ivBadgeDetailRight;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) o00Oo0.OooO00o(viewInflate, R.id.ivBadgeDetailRight);
                if (appCompatImageView3 != null) {
                    i = R.id.rvBadgeDetail;
                    RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rvBadgeDetail);
                    if (recyclerView != null) {
                        return new bi((ConstraintLayout) viewInflate, appCompatImageView, appCompatImageView2, appCompatImageView3, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
