package p649o0ooOOoo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.AutoImage;
import p104o000oo0O.o00O0O;
import p104o000oo0O.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class l8 implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f49916OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AutoImage f49917OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f49918OooO0OO;

    public l8(@NonNull ConstraintLayout constraintLayout, @NonNull AutoImage autoImage, @NonNull ImageView imageView) {
        this.f49916OooO00o = constraintLayout;
        this.f49917OooO0O0 = autoImage;
        this.f49918OooO0OO = imageView;
    }

    @NonNull
    public static l8 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p104o000oo0O.o00O0O
    @NonNull
    public final View OooO0O0() {
        return this.f49916OooO00o;
    }

    @NonNull
    public static l8 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_user_return_reward, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.autoImage;
        AutoImage autoImage = (AutoImage) o00Oo0.OooO00o(viewInflate, R.id.autoImage);
        if (autoImage != null) {
            i = R.id.close;
            ImageView imageView = (ImageView) o00Oo0.OooO00o(viewInflate, R.id.close);
            if (imageView != null) {
                return new l8((ConstraintLayout) viewInflate, autoImage, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
