package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.flexbox.FlexboxLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class r4 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final FrameLayout f58720OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f58721OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f58722OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final FlexboxLayout f58723OooO0Oo;

    public r4(@NonNull FrameLayout frameLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull FlexboxLayout flexboxLayout) {
        this.f58720OooO00o = frameLayout;
        this.f58721OooO0O0 = view;
        this.f58722OooO0OO = imageView;
        this.f58723OooO0Oo = flexboxLayout;
    }

    @NonNull
    public static r4 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58720OooO00o;
    }

    @NonNull
    public static r4 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.main_search_adapter_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.bottomView;
        View viewOooO00o = OooOO0.OooO00o(i, viewInflate);
        if (viewOooO00o != null) {
            i = oO00O0oO.deleteSearchHistory;
            ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = oO00O0oO.historySearchLayout;
                FlexboxLayout flexboxLayout = (FlexboxLayout) OooOO0.OooO00o(i, viewInflate);
                if (flexboxLayout != null) {
                    i = oO00O0oO.tvSearch;
                    if (((TextView) OooOO0.OooO00o(i, viewInflate)) != null) {
                        return new r4((FrameLayout) viewInflate, viewOooO00o, imageView, flexboxLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
