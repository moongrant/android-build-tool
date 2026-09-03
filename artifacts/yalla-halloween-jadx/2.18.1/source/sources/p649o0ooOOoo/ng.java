package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ng implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50116OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50117OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50118OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50119OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50120OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final LinearLayoutCompat f50121OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f50122OooO0oO;

    public ng(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull LinearLayoutCompat linearLayoutCompat3, @NonNull LinearLayoutCompat linearLayoutCompat4, @NonNull LinearLayoutCompat linearLayoutCompat5, @NonNull LinearLayoutCompat linearLayoutCompat6, @NonNull TextView textView) {
        this.f50116OooO00o = linearLayoutCompat;
        this.f50117OooO0O0 = linearLayoutCompat2;
        this.f50118OooO0OO = linearLayoutCompat3;
        this.f50119OooO0Oo = linearLayoutCompat4;
        this.f50121OooO0o0 = linearLayoutCompat5;
        this.f50120OooO0o = linearLayoutCompat6;
        this.f50122OooO0oO = textView;
    }

    @NonNull
    public static ng OooO00o(@NonNull View view) {
        int i = R.id.llAddFriend;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) o00Oo0.OooO00o(view, R.id.llAddFriend);
        if (linearLayoutCompat != null) {
            i = R.id.llMagicCard;
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) o00Oo0.OooO00o(view, R.id.llMagicCard);
            if (linearLayoutCompat2 != null) {
                i = R.id.llMessage;
                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) o00Oo0.OooO00o(view, R.id.llMessage);
                if (linearLayoutCompat3 != null) {
                    i = R.id.llMuteMic;
                    LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) o00Oo0.OooO00o(view, R.id.llMuteMic);
                    if (linearLayoutCompat4 != null) {
                        i = R.id.llSendGift;
                        LinearLayoutCompat linearLayoutCompat5 = (LinearLayoutCompat) o00Oo0.OooO00o(view, R.id.llSendGift);
                        if (linearLayoutCompat5 != null) {
                            i = R.id.tvMuteMic;
                            TextView textView = (TextView) o00Oo0.OooO00o(view, R.id.tvMuteMic);
                            if (textView != null) {
                                return new ng((LinearLayoutCompat) view, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, linearLayoutCompat4, linearLayoutCompat5, textView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ng inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50116OooO00o;
    }

    @NonNull
    public static ng inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_include_user_information_bottom_one, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
