package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.yalla.yalla.ui.view.UserIdentityView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class e9 implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final View f57844OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f57845OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final UserIdentityView f57846OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f57847OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f57848OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f57849OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f57850OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f57851OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final View f57852OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final View f57853OooOO0;

    public e9(@NonNull FrameLayout frameLayout, @NonNull UserIdentityView userIdentityView, @NonNull ImageView imageView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayoutCompat linearLayoutCompat3, @NonNull LinearLayoutCompat linearLayoutCompat4, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.f57845OooO00o = frameLayout;
        this.f57846OooO0O0 = userIdentityView;
        this.f57847OooO0OO = imageView;
        this.f57848OooO0Oo = linearLayoutCompat;
        this.f57850OooO0o0 = linearLayoutCompat2;
        this.f57849OooO0o = linearLayoutCompat3;
        this.f57851OooO0oO = linearLayoutCompat4;
        this.f57852OooO0oo = view;
        this.f57844OooO = view2;
        this.f57853OooOO0 = view3;
    }

    @NonNull
    public static e9 OooO00o(@NonNull View view) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewOooO00o3;
        int i = oO00O0oO.ivIdentity;
        UserIdentityView userIdentityView = (UserIdentityView) OooOO0.OooO00o(i, view);
        if (userIdentityView != null) {
            i = oO00O0oO.ivSetUpMic;
            ImageView imageView = (ImageView) OooOO0.OooO00o(i, view);
            if (imageView != null) {
                i = oO00O0oO.llBanWords;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) OooOO0.OooO00o(i, view);
                if (linearLayoutCompat != null) {
                    i = oO00O0oO.llIdentity;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) OooOO0.OooO00o(i, view);
                    if (linearLayoutCompat2 != null) {
                        i = oO00O0oO.llKitOut;
                        LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) OooOO0.OooO00o(i, view);
                        if (linearLayoutCompat3 != null) {
                            i = oO00O0oO.llSetUpMic;
                            LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) OooOO0.OooO00o(i, view);
                            if (linearLayoutCompat4 != null && (viewOooO00o = OooOO0.OooO00o((i = oO00O0oO.vLine1), view)) != null && (viewOooO00o2 = OooOO0.OooO00o((i = oO00O0oO.vLine2), view)) != null && (viewOooO00o3 = OooOO0.OooO00o((i = oO00O0oO.vLine3), view)) != null) {
                                return new e9((FrameLayout) view, userIdentityView, imageView, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, viewOooO00o, viewOooO00o2, viewOooO00o3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static e9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57845OooO00o;
    }

    @NonNull
    public static e9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_include_user_information_bottom_two, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
