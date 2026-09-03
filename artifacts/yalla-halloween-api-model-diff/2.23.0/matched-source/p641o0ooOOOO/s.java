package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58768OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final RecyclerView f58769OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Switch f58770OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f58771OooO0Oo;

    public s(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull Switch r3, @NonNull TextView textView) {
        this.f58768OooO00o = linearLayout;
        this.f58769OooO0O0 = recyclerView;
        this.f58770OooO0OO = r3;
        this.f58771OooO0Oo = textView;
    }

    @NonNull
    public static s inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58768OooO00o;
    }

    @NonNull
    public static s inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.account_activity_account_protection, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.rvTrustedDevice;
        RecyclerView recyclerView = (RecyclerView) OooOO0.OooO00o(i, viewInflate);
        if (recyclerView != null) {
            i = oO00O0oO.switchProtection;
            Switch r0 = (Switch) OooOO0.OooO00o(i, viewInflate);
            if (r0 != null) {
                i = oO00O0oO.tvTrustedDevice;
                TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                if (textView != null) {
                    return new s((LinearLayout) viewInflate, recyclerView, r0, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
