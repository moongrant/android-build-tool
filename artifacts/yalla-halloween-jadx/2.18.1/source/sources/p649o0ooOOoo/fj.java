package p649o0ooOOoo;

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
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class fj implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f49412OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final TextView f49413OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f49414OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final EditText f49415OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49416OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f49417OooO0o0;

    public fj(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull EditText editText, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout) {
        this.f49412OooO00o = linearLayout;
        this.f49413OooO0O0 = textView;
        this.f49414OooO0OO = imageView;
        this.f49415OooO0Oo = editText;
        this.f49417OooO0o0 = textView2;
        this.f49416OooO0o = constraintLayout;
    }

    @NonNull
    public static fj inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49412OooO00o;
    }

    @NonNull
    public static fj inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_search_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.bg;
        if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.bg)) != null) {
            i = R.id.cancel;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.cancel);
            if (textView != null) {
                i = R.id.clear;
                ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.clear);
                if (imageView != null) {
                    i = R.id.edit;
                    EditText editText = (EditText) o00Oo0.OooO00o(viewInflate, R.id.edit);
                    if (editText != null) {
                        i = R.id.hint;
                        TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.hint);
                        if (textView2 != null) {
                            i = R.id.layout;
                            ConstraintLayout constraintLayout = (ConstraintLayout) o00Oo0.OooO00o(viewInflate, R.id.layout);
                            if (constraintLayout != null) {
                                i = R.id.tag;
                                if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.tag)) != null) {
                                    return new fj((LinearLayout) viewInflate, textView, imageView, editText, textView2, constraintLayout);
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
