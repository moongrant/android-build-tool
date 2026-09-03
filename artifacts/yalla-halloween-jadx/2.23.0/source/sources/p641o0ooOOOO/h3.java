package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class h3 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58028OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f58029OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f58030OooO0OO;

    public h3(@NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull TextView textView) {
        this.f58028OooO00o = linearLayout;
        this.f58029OooO0O0 = imageView;
        this.f58030OooO0OO = textView;
    }

    @NonNull
    public static h3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58028OooO00o;
    }

    @NonNull
    public static h3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.layout_status_empty, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.view_empty_holder_bt_empty;
        if (((Button) OooOO0.OooO00o(i, viewInflate)) != null) {
            i = oO00O0oO.view_empty_holder_iv_no_data;
            ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = oO00O0oO.view_empty_holder_tv_blank_text;
                TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                if (textView != null) {
                    return new h3(imageView, (LinearLayout) viewInflate, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
