package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.yalla.yalla.ui.view.UserIdentityView;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 implements OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final View f45542OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f45543OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final UserIdentityView f45544OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f45545OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f45546OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f45547OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f45548OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f45549OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final View f45550OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final View f45551OooOO0;

    public t0(@NonNull FrameLayout frameLayout, @NonNull UserIdentityView userIdentityView, @NonNull ImageView imageView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayoutCompat linearLayoutCompat3, @NonNull LinearLayoutCompat linearLayoutCompat4, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.f45543OooO00o = frameLayout;
        this.f45544OooO0O0 = userIdentityView;
        this.f45545OooO0OO = imageView;
        this.f45546OooO0Oo = linearLayoutCompat;
        this.f45548OooO0o0 = linearLayoutCompat2;
        this.f45547OooO0o = linearLayoutCompat3;
        this.f45549OooO0oO = linearLayoutCompat4;
        this.f45550OooO0oo = view;
        this.f45542OooO = view2;
        this.f45551OooOO0 = view3;
    }

    @NonNull
    public static t0 OooO00o(@NonNull View view) {
        View viewOooO00o;
        View viewOooO00o2;
        View viewOooO00o3;
        int i = o0OO00O.ivIdentity;
        UserIdentityView userIdentityView = (UserIdentityView) OooO0O0.OooO00o(i, view);
        if (userIdentityView != null) {
            i = o0OO00O.ivSetUpMic;
            ImageView imageView = (ImageView) OooO0O0.OooO00o(i, view);
            if (imageView != null) {
                i = o0OO00O.llBanWords;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) OooO0O0.OooO00o(i, view);
                if (linearLayoutCompat != null) {
                    i = o0OO00O.llIdentity;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) OooO0O0.OooO00o(i, view);
                    if (linearLayoutCompat2 != null) {
                        i = o0OO00O.llKitOut;
                        LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) OooO0O0.OooO00o(i, view);
                        if (linearLayoutCompat3 != null) {
                            i = o0OO00O.llSetUpMic;
                            LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) OooO0O0.OooO00o(i, view);
                            if (linearLayoutCompat4 != null && (viewOooO00o = OooO0O0.OooO00o((i = o0OO00O.vLine1), view)) != null && (viewOooO00o2 = OooO0O0.OooO00o((i = o0OO00O.vLine2), view)) != null && (viewOooO00o3 = OooO0O0.OooO00o((i = o0OO00O.vLine3), view)) != null) {
                                return new t0((FrameLayout) view, userIdentityView, imageView, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, viewOooO00o, viewOooO00o2, viewOooO00o3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static t0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45543OooO00o;
    }

    @NonNull
    public static t0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_include_user_information_bottom_two, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
