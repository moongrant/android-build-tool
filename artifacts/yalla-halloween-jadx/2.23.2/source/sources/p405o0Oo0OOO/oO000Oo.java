package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.internal.FlowLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO000Oo implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44774OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FlowLayout f44775OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f44776OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44777OooO0Oo;

    public oO000Oo(@NonNull LinearLayout linearLayout, @NonNull FlowLayout flowLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2) {
        this.f44774OooO00o = linearLayout;
        this.f44775OooO0O0 = flowLayout;
        this.f44776OooO0OO = imageView;
        this.f44777OooO0Oo = linearLayout2;
    }

    @NonNull
    public static oO000Oo OooO00o(@NonNull View view) {
        int i = o0OO00O.flTage;
        FlowLayout flowLayout = (FlowLayout) OooO0O0.OooO00o(i, view);
        if (flowLayout != null) {
            i = o0OO00O.ivCountryClose;
            ImageView imageView = (ImageView) OooO0O0.OooO00o(i, view);
            if (imageView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new oO000Oo(linearLayout, flowLayout, imageView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static oO000Oo inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44774OooO00o;
    }

    @NonNull
    public static oO000Oo inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.main_dialog_explore_tag_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
