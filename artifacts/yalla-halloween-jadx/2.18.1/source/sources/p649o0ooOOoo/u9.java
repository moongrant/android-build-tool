package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class u9 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f50689OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f50690OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50691OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50692OooO0Oo;

    public u9(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3) {
        this.f50689OooO00o = constraintLayout;
        this.f50690OooO0O0 = imageView;
        this.f50691OooO0OO = imageView2;
        this.f50692OooO0Oo = imageView3;
    }

    @NonNull
    public static u9 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50689OooO00o;
    }

    @NonNull
    public static u9 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_send_moment_emoji_at_poll, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.ivAt;
        ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivAt);
        if (imageView != null) {
            i = R.id.ivEmoji;
            ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivEmoji);
            if (imageView2 != null) {
                i = R.id.ivPoll;
                ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.ivPoll);
                if (imageView3 != null) {
                    return new u9((ConstraintLayout) viewInflate, imageView, imageView2, imageView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
