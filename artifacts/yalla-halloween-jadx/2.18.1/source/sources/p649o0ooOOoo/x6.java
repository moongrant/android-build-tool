package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class x6 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50911OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f50912OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50913OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50914OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final EditText f50915OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final EditText f50916OooO0o0;

    public x6(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull EditText editText, @NonNull EditText editText2) {
        this.f50911OooO00o = linearLayout;
        this.f50912OooO0O0 = button;
        this.f50913OooO0OO = imageView;
        this.f50914OooO0Oo = imageView2;
        this.f50916OooO0o0 = editText;
        this.f50915OooO0o = editText2;
    }

    @NonNull
    public static x6 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50911OooO00o;
    }

    @NonNull
    public static x6 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_change_password, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.baseHeaderLayout;
        View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.baseHeaderLayout);
        if (viewOooO00o != null) {
            f7.OooO00o(viewOooO00o);
            i = R.id.btn_submit;
            Button button = (Button) o00Oo0.OooO00o(viewInflate, R.id.btn_submit);
            if (button != null) {
                i = R.id.iv_see_new;
                ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.iv_see_new);
                if (imageView != null) {
                    i = R.id.iv_see_old;
                    ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.iv_see_old);
                    if (imageView2 != null) {
                        i = R.id.txt_newpwd;
                        EditText editText = (EditText) o00Oo0.OooO00o(viewInflate, R.id.txt_newpwd);
                        if (editText != null) {
                            i = R.id.txt_oldpwd;
                            EditText editText2 = (EditText) o00Oo0.OooO00o(viewInflate, R.id.txt_oldpwd);
                            if (editText2 != null) {
                                return new x6((LinearLayout) viewInflate, button, imageView, imageView2, editText, editText2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
