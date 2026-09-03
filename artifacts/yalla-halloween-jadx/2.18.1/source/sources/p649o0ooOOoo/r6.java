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
public final class r6 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50418OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f50419OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f50420OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50421OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f50422OooO0o0;

    public r6(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f50418OooO00o = linearLayout;
        this.f50419OooO0O0 = textView;
        this.f50420OooO0OO = textView2;
        this.f50421OooO0Oo = textView3;
        this.f50422OooO0o0 = textView4;
    }

    @NonNull
    public static r6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50418OooO00o;
    }

    @NonNull
    public static r6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.account_activity_protection_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.tvAppTypes;
        TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvAppTypes);
        if (textView != null) {
            i = R.id.tvDelete;
            TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvDelete);
            if (textView2 != null) {
                i = R.id.tvDeviceModel;
                TextView textView3 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvDeviceModel);
                if (textView3 != null) {
                    i = R.id.tvLastLoginTime;
                    TextView textView4 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvLastLoginTime);
                    if (textView4 != null) {
                        return new r6((LinearLayout) viewInflate, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
