package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class d9 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f57743OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f57744OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f57745OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f57746OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f57747OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f57748OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f57749OooO0oO;

    public d9(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayoutCompat linearLayoutCompat3, @NonNull LinearLayoutCompat linearLayoutCompat4, @NonNull LinearLayoutCompat linearLayoutCompat5, @NonNull LinearLayoutCompat linearLayoutCompat6, @NonNull TextView textView) {
        this.f57743OooO00o = linearLayoutCompat;
        this.f57744OooO0O0 = linearLayoutCompat2;
        this.f57745OooO0OO = linearLayoutCompat3;
        this.f57746OooO0Oo = linearLayoutCompat4;
        this.f57748OooO0o0 = linearLayoutCompat5;
        this.f57747OooO0o = linearLayoutCompat6;
        this.f57749OooO0oO = textView;
    }

    @NonNull
    public static d9 OooO00o(@NonNull View view) {
        int i = oO00O0oO.llAddFriend;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) OooOO0.OooO00o(i, view);
        if (linearLayoutCompat != null) {
            i = oO00O0oO.llMagicCard;
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) OooOO0.OooO00o(i, view);
            if (linearLayoutCompat2 != null) {
                i = oO00O0oO.llMessage;
                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) OooOO0.OooO00o(i, view);
                if (linearLayoutCompat3 != null) {
                    i = oO00O0oO.llMuteMic;
                    LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) OooOO0.OooO00o(i, view);
                    if (linearLayoutCompat4 != null) {
                        i = oO00O0oO.llSendGift;
                        LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) OooOO0.OooO00o(i, view);
                        if (linearLayoutCompat5 != null) {
                            i = oO00O0oO.tvMuteMic;
                            TextView textView = (TextView) OooOO0.OooO00o(i, view);
                            if (textView != null) {
                                return new d9((LinearLayoutCompat) view, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, linearLayoutCompat5, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static d9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57743OooO00o;
    }

    @NonNull
    public static d9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_include_user_information_bottom_one, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
