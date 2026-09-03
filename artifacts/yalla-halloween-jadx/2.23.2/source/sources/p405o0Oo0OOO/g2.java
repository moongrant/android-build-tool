package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class g2 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f43874OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f43875OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f43876OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final AppCompatImageView f43877OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f43878OooO0o0;

    public g2(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatImageView appCompatImageView2, @NonNull AppCompatImageView appCompatImageView3, @NonNull RecyclerView recyclerView) {
        this.f43874OooO00o = constraintLayout;
        this.f43875OooO0O0 = appCompatImageView;
        this.f43876OooO0OO = appCompatImageView2;
        this.f43877OooO0Oo = appCompatImageView3;
        this.f43878OooO0o0 = recyclerView;
    }

    @NonNull
    public static g2 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f43874OooO00o;
    }

    @NonNull
    public static g2 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.user_dialog_badge, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivBadgeDetailClose;
        AppCompatImageView appCompatImageView = (AppCompatImageView) OooO0O0.OooO00o(i, viewInflate);
        if (appCompatImageView != null) {
            i = o0OO00O.ivBadgeDetailLeft;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) OooO0O0.OooO00o(i, viewInflate);
            if (appCompatImageView2 != null) {
                i = o0OO00O.ivBadgeDetailRight;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) OooO0O0.OooO00o(i, viewInflate);
                if (appCompatImageView3 != null) {
                    i = o0OO00O.rvBadgeDetail;
                    RecyclerView recyclerView = (RecyclerView) OooO0O0.OooO00o(i, viewInflate);
                    if (recyclerView != null) {
                        return new g2((ConstraintLayout) viewInflate, appCompatImageView, appCompatImageView2, appCompatImageView3, recyclerView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
