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
import com.yalla.yalla.common.ui.view.DotView;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class ah implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f48959OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final DotView f48960OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final TextView f48961OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f48962OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final t9 f48963OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NonNull
    public final ImageView f48964OooO0o0;

    public ah(@NonNull LinearLayout linearLayout, @NonNull DotView dotView, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull t9 t9Var) {
        this.f48959OooO00o = linearLayout;
        this.f48960OooO0O0 = dotView;
        this.f48961OooO0OO = textView;
        this.f48962OooO0Oo = imageView;
        this.f48964OooO0o0 = imageView2;
        this.f48963OooO0o = t9Var;
    }

    @NonNull
    public static ah inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f48959OooO00o;
    }

    @NonNull
    public static ah inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.room_member_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.convenePosition;
        DotView dotView = (DotView) o00Oo0.OooO00o(viewInflate, R.id.convenePosition);
        if (dotView != null) {
            i = R.id.count;
            TextView textView = (TextView) o00Oo0.OooO00o(viewInflate, R.id.count);
            if (textView != null) {
                i = R.id.delete;
                ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.delete);
                if (imageView != null) {
                    i = R.id.doubt;
                    ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.doubt);
                    if (imageView2 != null) {
                        i = R.id.search;
                        View viewOooO00o = o00Oo0.OooO00o(viewInflate, R.id.search);
                        if (viewOooO00o != null) {
                            return new ah((LinearLayout) viewInflate, dotView, textView, imageView, imageView2, t9.OooO00o(viewOooO00o));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
