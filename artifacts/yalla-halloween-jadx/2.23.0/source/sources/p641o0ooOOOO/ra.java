package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class ra implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58760OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f58761OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f58762OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f58763OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f58764OooO0o0;

    public ra(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull RecyclerView recyclerView) {
        this.f58760OooO00o = constraintLayout;
        this.f58761OooO0O0 = appCompatImageView;
        this.f58762OooO0OO = appCompatImageView2;
        this.f58763OooO0Oo = appCompatImageView3;
        this.f58764OooO0o0 = recyclerView;
    }

    @NonNull
    public static ra inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58760OooO00o;
    }

    @NonNull
    public static ra inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.user_dialog_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.ivBadgeDetailClose;
        AppCompatImageView appCompatImageView = (AppCompatImageView) OooOO0.OooO00o(i, viewInflate);
        if (appCompatImageView != null) {
            i = oO00O0oO.ivBadgeDetailLeft;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) OooOO0.OooO00o(i, viewInflate);
            if (appCompatImageView2 != null) {
                i = oO00O0oO.ivBadgeDetailRight;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) OooOO0.OooO00o(i, viewInflate);
                if (appCompatImageView3 != null) {
                    i = oO00O0oO.rvBadgeDetail;
                    RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
                    if (recyclerView != null) {
                        return new ra((ConstraintLayout) viewInflate, appCompatImageView, appCompatImageView2, appCompatImageView3, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
