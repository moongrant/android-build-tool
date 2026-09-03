package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.UserIdentityView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class og implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public final View f50201OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f50202OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final UserIdentityView f50203OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50204OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50205OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50206OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50207OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50208OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public final View f50209OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final View f50210OooOO0;

    public og(@NonNull FrameLayout frameLayout, @NonNull UserIdentityView userIdentityView, @NonNull ImageView imageView, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayoutCompat linearLayoutCompat3, @NonNull LinearLayoutCompat linearLayoutCompat4, @NonNull View view, @NonNull View view2, @NonNull View view3) {
        this.f50202OooO00o = frameLayout;
        this.f50203OooO0O0 = userIdentityView;
        this.f50204OooO0OO = imageView;
        this.f50205OooO0Oo = linearLayoutCompat;
        this.f50207OooO0o0 = linearLayoutCompat2;
        this.f50206OooO0o = linearLayoutCompat3;
        this.f50208OooO0oO = linearLayoutCompat4;
        this.f50209OooO0oo = view;
        this.f50201OooO = view2;
        this.f50210OooOO0 = view3;
    }

    @NonNull
    public static og OooO00o(@NonNull View view) {
        int i = R.id.ivIdentity;
        UserIdentityView userIdentityView = (UserIdentityView) o00Oo0.OooO00o(view, R.id.ivIdentity);
        if (userIdentityView != null) {
            i = R.id.ivSetUpMic;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(view, R.id.ivSetUpMic);
            if (imageView != null) {
                i = R.id.llBanWords;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) o00Oo0.OooO00o(view, R.id.llBanWords);
                if (linearLayoutCompat != null) {
                    i = R.id.llIdentity;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) o00Oo0.OooO00o(view, R.id.llIdentity);
                    if (linearLayoutCompat2 != null) {
                        i = R.id.llKitOut;
                        LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) o00Oo0.OooO00o(view, R.id.llKitOut);
                        if (linearLayoutCompat3 != null) {
                            i = R.id.llSetUpMic;
                            LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) o00Oo0.OooO00o(view, R.id.llSetUpMic);
                            if (linearLayoutCompat4 != null) {
                                i = R.id.vLine1;
                                View viewOooO00o = o00Oo0.OooO00o(view, R.id.vLine1);
                                if (viewOooO00o != null) {
                                    i = R.id.vLine2;
                                    View viewOooO00o2 = o00Oo0.OooO00o(view, R.id.vLine2);
                                    if (viewOooO00o2 != null) {
                                        i = R.id.vLine3;
                                        View viewOooO00o3 = o00Oo0.OooO00o(view, R.id.vLine3);
                                        if (viewOooO00o3 != null) {
                                            return new og((FrameLayout) view, userIdentityView, imageView, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, viewOooO00o, viewOooO00o2, viewOooO00o3);
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
    public static og inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50202OooO00o;
    }

    @NonNull
    public static og inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_include_user_information_bottom_two, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
