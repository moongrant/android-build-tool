package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.internal.FlowLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class e4 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57810OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FlowLayout f57811OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f57812OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57813OooO0Oo;

    public e4(@NonNull LinearLayout linearLayout, @NonNull FlowLayout flowLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2) {
        this.f57810OooO00o = linearLayout;
        this.f57811OooO0O0 = flowLayout;
        this.f57812OooO0OO = imageView;
        this.f57813OooO0Oo = linearLayout2;
    }

    @NonNull
    public static e4 OooO00o(@NonNull View view) {
        int i = oO00O0oO.flTage;
        FlowLayout flowLayout = (FlowLayout) OooOO0.OooO00o(i, view);
        if (flowLayout != null) {
            i = oO00O0oO.ivCountryClose;
            ImageView imageView = (ImageView) OooOO0.OooO00o(i, view);
            if (imageView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new e4(linearLayout, flowLayout, imageView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static e4 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57810OooO00o;
    }

    @NonNull
    public static e4 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.main_dialog_explore_tag_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
