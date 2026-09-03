package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.netimage.NetImageView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class wb implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59211OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f59212OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f59213OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59214OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f59215OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final NetImageView f59216OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final AppCompatTextView f59217OooO0oO;

    public wb(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull AppCompatTextView appCompatTextView, @NonNull ConstraintLayout constraintLayout, @NonNull NetImageView netImageView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatTextView appCompatTextView3) {
        this.f59211OooO00o = linearLayout;
        this.f59212OooO0O0 = imageView;
        this.f59213OooO0OO = appCompatTextView;
        this.f59214OooO0Oo = constraintLayout;
        this.f59216OooO0o0 = netImageView;
        this.f59215OooO0o = appCompatTextView2;
        this.f59217OooO0oO = appCompatTextView3;
    }

    @NonNull
    public static wb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59211OooO00o;
    }

    @NonNull
    public static wb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.view_room_member_convene_card, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.close;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = oO00O0oO.join;
            AppCompatTextView appCompatTextView = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
            if (appCompatTextView != null) {
                i = oO00O0oO.layout;
                ConstraintLayout constraintLayout = (ConstraintLayout) OooOO0.OooO00o(i, viewInflate);
                if (constraintLayout != null) {
                    i = oO00O0oO.roomHead;
                    NetImageView netImageView = (NetImageView) OooOO0.OooO00o(i, viewInflate);
                    if (netImageView != null) {
                        i = oO00O0oO.roomInfo;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                        if (appCompatTextView2 != null) {
                            i = oO00O0oO.roomName;
                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) OooOO0.OooO00o(i, viewInflate);
                            if (appCompatTextView3 != null) {
                                return new wb((LinearLayout) viewInflate, imageView, appCompatTextView, constraintLayout, netImageView, appCompatTextView2, appCompatTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
