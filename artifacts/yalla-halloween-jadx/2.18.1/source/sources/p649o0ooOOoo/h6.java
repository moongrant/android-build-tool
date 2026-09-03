package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class h6 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49518OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f49519OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Switch f49520OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f49521OooO0Oo;

    public h6(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull Switch r3, @NonNull TextView textView) {
        this.f49518OooO00o = linearLayout;
        this.f49519OooO0O0 = recyclerView;
        this.f49520OooO0OO = r3;
        this.f49521OooO0Oo = textView;
    }

    @NonNull
    public static h6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49518OooO00o;
    }

    @NonNull
    public static h6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.account_activity_account_protection, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.rvTrustedDevice;
        RecyclerView recyclerView = (RecyclerView) o00Oo0.OooO00o(viewInflate, R.id.rvTrustedDevice);
        if (recyclerView != null) {
            i = R.id.switchProtection;
            Switch r0 = (Switch) o00Oo0.OooO00o(viewInflate, R.id.switchProtection);
            if (r0 != null) {
                i = R.id.tvTrustedDevice;
                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTrustedDevice);
                if (textView != null) {
                    return new h6((LinearLayout) viewInflate, recyclerView, r0, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
