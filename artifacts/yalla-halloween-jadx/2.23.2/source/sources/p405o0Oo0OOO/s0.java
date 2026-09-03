package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f45485OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f45486OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f45487OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f45488OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f45489OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f45490OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f45491OooO0oO;

    public s0(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayoutCompat linearLayoutCompat3, @NonNull LinearLayoutCompat linearLayoutCompat4, @NonNull LinearLayoutCompat linearLayoutCompat5, @NonNull LinearLayoutCompat linearLayoutCompat6, @NonNull TextView textView) {
        this.f45485OooO00o = linearLayoutCompat;
        this.f45486OooO0O0 = linearLayoutCompat2;
        this.f45487OooO0OO = linearLayoutCompat3;
        this.f45488OooO0Oo = linearLayoutCompat4;
        this.f45490OooO0o0 = linearLayoutCompat5;
        this.f45489OooO0o = linearLayoutCompat6;
        this.f45491OooO0oO = textView;
    }

    @NonNull
    public static s0 OooO00o(@NonNull View view) {
        int i = o0OO00O.llAddFriend;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) OooO0O0.OooO00o(i, view);
        if (linearLayoutCompat != null) {
            i = o0OO00O.llMagicCard;
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) OooO0O0.OooO00o(i, view);
            if (linearLayoutCompat2 != null) {
                i = o0OO00O.llMessage;
                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) OooO0O0.OooO00o(i, view);
                if (linearLayoutCompat3 != null) {
                    i = o0OO00O.llMuteMic;
                    LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) OooO0O0.OooO00o(i, view);
                    if (linearLayoutCompat4 != null) {
                        i = o0OO00O.llSendGift;
                        LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) OooO0O0.OooO00o(i, view);
                        if (linearLayoutCompat5 != null) {
                            i = o0OO00O.tvMuteMic;
                            TextView textView = (TextView) OooO0O0.OooO00o(i, view);
                            if (textView != null) {
                                return new s0((LinearLayoutCompat) view, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, linearLayoutCompat5, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static s0 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f45485OooO00o;
    }

    @NonNull
    public static s0 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.room_include_user_information_bottom_one, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
