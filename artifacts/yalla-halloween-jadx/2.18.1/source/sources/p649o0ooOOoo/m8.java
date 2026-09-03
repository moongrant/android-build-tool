package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class m8 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50003OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Button f50004OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50005OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f50006OooO0Oo;

    public m8(@NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f50003OooO00o = linearLayout;
        this.f50004OooO0O0 = button;
        this.f50005OooO0OO = imageView;
        this.f50006OooO0Oo = textView;
    }

    @NonNull
    public static m8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50003OooO00o;
    }

    @NonNull
    public static m8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.empty_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.button;
        Button button = (Button) o00Oo0.OooO00o(viewInflate, R.id.button);
        if (button != null) {
            i = R.id.image;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.image);
            if (imageView != null) {
                i = R.id.text;
                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.text);
                if (textView != null) {
                    return new m8((LinearLayout) viewInflate, button, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
