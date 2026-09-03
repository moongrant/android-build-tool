package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.weieyu.yalla.R;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class vi implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final LinearLayout f50826OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final ImageView f50827OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f50828OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final ImageView f50829OooO0Oo;

    public vi(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3) {
        this.f50826OooO00o = linearLayout;
        this.f50827OooO0O0 = imageView;
        this.f50828OooO0OO = imageView2;
        this.f50829OooO0Oo = imageView3;
    }

    @NonNull
    public static vi inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f50826OooO00o;
    }

    @NonNull
    public static vi inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_gift_run_way_number, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.iv_x;
        if (((ImageView) o00Oo0.OooO00o(viewInflate, R.id.iv_x)) != null) {
            i = R.id.layout_count;
            if (((LinearLayout) o00Oo0.OooO00o(viewInflate, R.id.layout_count)) != null) {
                i = R.id.number1;
                ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.number1);
                if (imageView != null) {
                    i = R.id.number2;
                    ImageView imageView2 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.number2);
                    if (imageView2 != null) {
                        i = R.id.number3;
                        ImageView imageView3 = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.number3);
                        if (imageView3 != null) {
                            return new vi((LinearLayout) viewInflate, imageView, imageView2, imageView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
