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
public final class yc implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f51021OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final EditText f51022OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f51023OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f51024OooO0Oo;

    public yc(@NonNull LinearLayout linearLayout, @NonNull EditText editText, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f51021OooO00o = linearLayout;
        this.f51022OooO0O0 = editText;
        this.f51023OooO0OO = imageView;
        this.f51024OooO0Oo = textView;
    }

    @NonNull
    public static yc inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f51021OooO00o;
    }

    @NonNull
    public static yc inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moment_activity_topic_create_name, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.etName;
        EditText editText = (EditText) o00Oo0.OooO00o(viewInflate, R.id.etName);
        if (editText != null) {
            i = R.id.ivClear;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivClear);
            if (imageView != null) {
                i = R.id.tvMaxTopicName;
                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvMaxTopicName);
                if (textView != null) {
                    return new yc((LinearLayout) viewInflate, editText, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
