package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class sh implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50620OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final EditText f50621OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f50622OooO0OO;

    public sh(@NonNull LinearLayout linearLayout, @NonNull EditText editText, @NonNull TextView textView) {
        this.f50620OooO00o = linearLayout;
        this.f50621OooO0O0 = editText;
        this.f50622OooO0OO = textView;
    }

    @NonNull
    public static sh inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50620OooO00o;
    }

    @NonNull
    public static sh inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_activity_user_info_edit_bio, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.et_text;
        EditText editText = (EditText) o00Oo0.OooO00o(viewInflate, R.id.et_text);
        if (editText != null) {
            i = R.id.tv_num;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tv_num);
            if (textView != null) {
                return new sh((LinearLayout) viewInflate, editText, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
