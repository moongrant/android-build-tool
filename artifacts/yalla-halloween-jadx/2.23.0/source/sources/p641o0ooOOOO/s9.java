package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
public final class s9 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f58808OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f58809OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f58810OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f58811OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f58812OooO0o0;

    public s9(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f58808OooO00o = linearLayout;
        this.f58809OooO0O0 = imageView;
        this.f58810OooO0OO = imageView2;
        this.f58811OooO0Oo = textView;
        this.f58812OooO0o0 = textView2;
    }

    @NonNull
    public static s9 OooO00o(@NonNull View view) {
        int i = oO00O0oO.ivGiftImage;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, view);
        if (imageView != null) {
            i = oO00O0oO.ivSubscript;
            ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, view);
            if (imageView2 != null) {
                i = oO00O0oO.top;
                if (((LinearLayout) OooOO0.OooO00o(i, view)) != null) {
                    i = oO00O0oO.tvGiftContent;
                    TextView textView = (TextView) OooOO0.OooO00o(i, view);
                    if (textView != null) {
                        i = oO00O0oO.tvGiftTitle;
                        TextView textView2 = (TextView) OooOO0.OooO00o(i, view);
                        if (textView2 != null) {
                            return new s9((LinearLayout) view, imageView, imageView2, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static s9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58808OooO00o;
    }

    @NonNull
    public static s9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.room_popupwindow_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return OooO00o(viewInflate);
    }
}
