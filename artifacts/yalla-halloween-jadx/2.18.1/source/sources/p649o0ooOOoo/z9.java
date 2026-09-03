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
public final class z9 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f51064OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f51065OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f51066OooO0OO;

    public z9(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.f51064OooO00o = linearLayout;
        this.f51065OooO0O0 = imageView;
        this.f51066OooO0OO = textView;
    }

    @NonNull
    public static z9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f51064OooO00o;
    }

    @NonNull
    public static z9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_send_moment_topic, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivTopic;
        if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivTopic)) != null) {
            i = R.id.ivTopicArrow;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivTopicArrow);
            if (imageView != null) {
                i = R.id.tvTopic;
                TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.tvTopic);
                if (textView != null) {
                    return new z9((LinearLayout) viewInflate, imageView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
