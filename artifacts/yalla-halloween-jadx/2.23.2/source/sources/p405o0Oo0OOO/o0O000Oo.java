package p405o0Oo0OOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.yalla.ui.view.AutoImage;
import o00O00o0.OooO00o;
import o00O00o0.OooO0O0;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000Oo implements OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f44411OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AutoImage f44412OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f44413OooO0OO;

    public o0O000Oo(@NonNull ConstraintLayout constraintLayout, @NonNull AutoImage autoImage, @NonNull ImageView imageView) {
        this.f44411OooO00o = constraintLayout;
        this.f44412OooO0O0 = autoImage;
        this.f44413OooO0OO = imageView;
    }

    @NonNull
    public static o0O000Oo inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // o00O00o0.OooO00o
    @NonNull
    public final View getRoot() {
        return this.f44411OooO00o;
    }

    @NonNull
    public static o0O000Oo inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oo0o0Oo.dialog_main_user_return, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = o0OO00O.autoImage;
        AutoImage autoImage = (AutoImage) OooO0O0.OooO00o(i, viewInflate);
        if (autoImage != null) {
            i = o0OO00O.close;
            ImageView imageView = (ImageView) OooO0O0.OooO00o(i, viewInflate);
            if (imageView != null) {
                return new o0O000Oo((ConstraintLayout) viewInflate, autoImage, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
