package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class zb implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f59511OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final EditText f59512OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f59513OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f59514OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f59515OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f59516OooO0o0;

    public zb(@NonNull ConstraintLayout constraintLayout, @NonNull EditText editText, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView) {
        this.f59511OooO00o = constraintLayout;
        this.f59512OooO0O0 = editText;
        this.f59513OooO0OO = imageView;
        this.f59514OooO0Oo = imageView2;
        this.f59516OooO0o0 = imageView3;
        this.f59515OooO0o = textView;
    }

    @NonNull
    public static zb inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f59511OooO00o;
    }

    @NonNull
    public static zb inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.view_search_editview, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.etSearch;
        EditText editText = (EditText) OooOO0.OooO00o(i, viewInflate);
        if (editText != null) {
            i = oO00O0oO.ivBg;
            ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = oO00O0oO.ivDelete;
                ImageView imageView2 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                if (imageView2 != null) {
                    i = oO00O0oO.ivFg;
                    ImageView imageView3 = (ImageView) OooOO0.OooO00o(i, viewInflate);
                    if (imageView3 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i = oO00O0oO.tvSearch;
                        TextView textView = (TextView) OooOO0.OooO00o(i, viewInflate);
                        if (textView != null) {
                            return new zb(constraintLayout, editText, imageView, imageView2, imageView3, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
