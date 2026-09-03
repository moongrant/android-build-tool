package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class ca implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57670OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57671OooO0O0;

    public ca(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2) {
        this.f57670OooO00o = linearLayout;
        this.f57671OooO0O0 = linearLayout2;
    }

    @NonNull
    public static ca OooO00o(@NonNull View view) {
        int i = oO00O0oO.delete_account_layout_content;
        if (((TextView) OooOO0.OooO00o(i, view)) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        LinearLayout linearLayout = (LinearLayout) view;
        return new ca(linearLayout, linearLayout);
    }

    @NonNull
    public static ca inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57670OooO00o;
    }

    @NonNull
    public static ca inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.user_activity_delete_account_layout_user_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
