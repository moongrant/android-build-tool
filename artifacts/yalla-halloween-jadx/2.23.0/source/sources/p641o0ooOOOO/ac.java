package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class ac implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f57526OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f57527OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f57528OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final EditText f57529OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f57530OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f57531OooO0o0;

    public ac(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull EditText editText, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout) {
        this.f57526OooO00o = linearLayout;
        this.f57527OooO0O0 = textView;
        this.f57528OooO0OO = imageView;
        this.f57529OooO0Oo = editText;
        this.f57531OooO0o0 = textView2;
        this.f57530OooO0o = constraintLayout;
    }

    @NonNull
    public static ac inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f57526OooO00o;
    }

    @NonNull
    public static ac inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.view_search_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.bg;
        if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
            i = oO00O0oO.cancel;
            TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
            if (textView != null) {
                i = oO00O0oO.clear;
                ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView != null) {
                    i = oO00O0oO.edit;
                    EditText editText = (EditText) OooOO0.OooO00o(i, viewInflate);
                    if (editText != null) {
                        i = oO00O0oO.hint;
                        TextView textView2 = (TextView) OooOO0.OooO00o(i, viewInflate);
                        if (textView2 != null) {
                            i = oO00O0oO.layout;
                            ConstraintLayout constraintLayout = (ConstraintLayout) OooOO0.OooO00o(i, viewInflate);
                            if (constraintLayout != null) {
                                i = oO00O0oO.tag;
                                if (((ImageView) OooOO0.OooO00o(i, viewInflate)) != null) {
                                    return new ac((LinearLayout) viewInflate, textView, imageView, editText, textView2, constraintLayout);
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
