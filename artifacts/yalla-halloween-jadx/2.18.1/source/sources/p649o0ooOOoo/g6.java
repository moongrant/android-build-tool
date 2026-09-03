package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class g6 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49418OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49419OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49420OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49421OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f49422OooO0o0;

    public g6(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull TextView textView) {
        this.f49418OooO00o = linearLayout;
        this.f49419OooO0O0 = linearLayout2;
        this.f49420OooO0OO = linearLayout3;
        this.f49421OooO0Oo = linearLayout4;
        this.f49422OooO0o0 = textView;
    }

    @NonNull
    public static g6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49418OooO00o;
    }

    @NonNull
    public static g6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.account_activity_account, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.llAccountBind;
        LinearLayout linearLayout = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llAccountBind);
        if (linearLayout != null) {
            i = R.id.llAccountProtection;
            LinearLayout linearLayout2 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llAccountProtection);
            if (linearLayout2 != null) {
                i = R.id.llUnprotected;
                LinearLayout linearLayout3 = (LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.llUnprotected);
                if (linearLayout3 != null) {
                    i = R.id.tvProtectionState;
                    TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvProtectionState);
                    if (textView != null) {
                        return new g6((LinearLayout) viewInflate, linearLayout, linearLayout2, linearLayout3, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
