package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o3 implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44708OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final EditText f44709OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f44710OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f44711OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final TextView f44712OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f44713OooO0o0;

    public o3(@NonNull ConstraintLayout constraintLayout, @NonNull EditText editText, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView) {
        this.f44708OooO00o = constraintLayout;
        this.f44709OooO0O0 = editText;
        this.f44710OooO0OO = imageView;
        this.f44711OooO0Oo = imageView2;
        this.f44713OooO0o0 = imageView3;
        this.f44712OooO0o = textView;
    }

    @NonNull
    public static o3 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44708OooO00o;
    }

    @NonNull
    public static o3 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.view_search_editview, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.etSearch;
        EditText editText = (EditText) OooO0O0.OooO00o(i, viewInflate);
        if (editText != null) {
            i = o0OO00O.ivBg;
            ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = o0OO00O.ivDelete;
                ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView2 != null) {
                    i = o0OO00O.ivFg;
                    ImageView imageView3 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                    if (imageView3 != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        i = o0OO00O.tvSearch;
                        TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                        if (textView != null) {
                            return new o3(constraintLayout, editText, imageView, imageView2, imageView3, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
