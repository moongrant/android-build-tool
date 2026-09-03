package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class y1 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f59368OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f59369OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final RelativeLayout f59370OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f59371OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f59372OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f59373OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final TextView f59374OooO0oO;

    public y1(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.f59368OooO00o = linearLayout;
        this.f59369OooO0O0 = imageView;
        this.f59370OooO0OO = relativeLayout;
        this.f59371OooO0Oo = textView;
        this.f59373OooO0o0 = textView2;
        this.f59372OooO0o = textView3;
        this.f59374OooO0oO = textView4;
    }

    @NonNull
    public static y1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59368OooO00o;
    }

    @NonNull
    public static y1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.dialog_update_app, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.iv_cancel;
        ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
        if (imageView != null) {
            i = oO00O0oO.layout_bg;
            RelativeLayout relativeLayout = (RelativeLayout) OooOO0.OooO00o(i, viewInflate);
            if (relativeLayout != null) {
                i = oO00O0oO.layout_content;
                if (((LinearLayout) OooOO0.OooO00o(i, viewInflate)) != null) {
                    i = oO00O0oO.tv_confirm;
                    TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                    if (textView != null) {
                        i = oO00O0oO.tv_info;
                        TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                        if (textView2 != null) {
                            i = oO00O0oO.tv_title;
                            TextView textView3 = (TextView) OooOO0.OooO00o(i, viewInflate);
                            if (textView3 != null) {
                                i = oO00O0oO.tv_version_name;
                                TextView textView4 = (TextView) OooOO0.OooO00o(i, viewInflate);
                                if (textView4 != null) {
                                    return new y1((LinearLayout) viewInflate, imageView, relativeLayout, textView, textView2, textView3, textView4);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
