package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.internal.FlowLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class va implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50798OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final FlowLayout f50799OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50800OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50801OooO0Oo;

    public va(@NonNull LinearLayout linearLayout, @NonNull FlowLayout flowLayout, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2) {
        this.f50798OooO00o = linearLayout;
        this.f50799OooO0O0 = flowLayout;
        this.f50800OooO0OO = imageView;
        this.f50801OooO0Oo = linearLayout2;
    }

    @NonNull
    public static va OooO00o(@NonNull View view) {
        int i = R.id.flTage;
        FlowLayout flowLayout = (FlowLayout) o00Oo0.OooO00o(view, R.id.flTage);
        if (flowLayout != null) {
            i = R.id.ivCountryClose;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(view, R.id.ivCountryClose);
            if (imageView != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new va(linearLayout, flowLayout, imageView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static va inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50798OooO00o;
    }

    @NonNull
    public static va inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.main_dialog_explore_tag_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
