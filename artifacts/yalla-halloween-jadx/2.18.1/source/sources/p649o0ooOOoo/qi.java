package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class qi implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50413OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f50414OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50415OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final View f50416OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final TextView f50417OooO0o0;

    public qi(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull View view, @NonNull TextView textView) {
        this.f50413OooO00o = linearLayout;
        this.f50414OooO0O0 = imageView;
        this.f50415OooO0OO = imageView2;
        this.f50416OooO0Oo = view;
        this.f50417OooO0o0 = textView;
    }

    @NonNull
    public static qi inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50413OooO00o;
    }

    @NonNull
    public static qi inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_dialog_title, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivEnd;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivEnd);
        if (imageView != null) {
            i = R.id.ivStart;
            ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivStart);
            if (imageView2 != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                i = R.id.line;
                View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.line);
                if (viewOooO00o != null) {
                    i = R.id.tvTitle;
                    TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTitle);
                    if (textView != null) {
                        return new qi(linearLayout, imageView, imageView2, viewOooO00o, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
