package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OOOO0o implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f44639OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f44640OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f44641OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final TextView f44642OooO0Oo;

    public o0OOOO0o(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull TextView textView) {
        this.f44639OooO00o = linearLayout;
        this.f44640OooO0O0 = imageView;
        this.f44641OooO0OO = imageView2;
        this.f44642OooO0Oo = textView;
    }

    @NonNull
    public static o0OOOO0o inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44639OooO00o;
    }

    @NonNull
    public static o0OOOO0o inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.layout_send_moment_topic, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.ivTopic;
        if (((ImageView) OooO0O0.OooO00o(i, viewInflate)) != null) {
            i = o0OO00O.ivTopicArrow;
            ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
            if (imageView != null) {
                i = o0OO00O.ivTopicClose;
                ImageView imageView2 = (ImageView) OooO0O0.OooO00o(i, viewInflate);
                if (imageView2 != null) {
                    i = o0OO00O.tvTopic;
                    TextView textView = (TextView) OooO0O0.OooO00o(i, viewInflate);
                    if (textView != null) {
                        return new o0OOOO0o((LinearLayout) viewInflate, imageView, imageView2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
