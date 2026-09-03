package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class pi implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50332OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final UserPremiumView f50333OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f50334OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50335OooO0Oo;

    public pi(@NonNull LinearLayout linearLayout, @NonNull UserPremiumView userPremiumView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f50332OooO00o = linearLayout;
        this.f50333OooO0O0 = userPremiumView;
        this.f50334OooO0OO = textView;
        this.f50335OooO0Oo = textView2;
    }

    @NonNull
    public static pi inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50332OooO00o;
    }

    @NonNull
    public static pi inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_vip_ari_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.iv_ari_header;
        UserPremiumView userPremiumView = (UserPremiumView) o00Oo0.OooO00o(viewInflate, R.id.iv_ari_header);
        if (userPremiumView != null) {
            i = R.id.tv_ari;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_ari);
            if (textView != null) {
                i = R.id.tv_num;
                TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_num);
                if (textView2 != null) {
                    return new pi((LinearLayout) viewInflate, userPremiumView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
