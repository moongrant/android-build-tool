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
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class nh implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50123OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final EditText f50124OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50125OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50126OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f50127OooO0o0;

    public nh(@NonNull LinearLayout linearLayout, @NonNull EditText editText, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.f50123OooO00o = linearLayout;
        this.f50124OooO0O0 = editText;
        this.f50125OooO0OO = imageView;
        this.f50126OooO0Oo = textView;
        this.f50127OooO0o0 = textView2;
    }

    @NonNull
    public static nh inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50123OooO00o;
    }

    @NonNull
    public static nh inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_activity_info_edit_remark, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.etText;
        EditText editText = (EditText) o00Oo0.OooO00o(viewInflate, R.id.etText);
        if (editText != null) {
            i = R.id.ivClear;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivClear);
            if (imageView != null) {
                i = R.id.tvName;
                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvName);
                if (textView != null) {
                    i = R.id.tvNum;
                    TextView textView2 = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvNum);
                    if (textView2 != null) {
                        return new nh((LinearLayout) viewInflate, editText, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
