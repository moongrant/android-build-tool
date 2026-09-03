package p641o0ooOOOO;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.yalla.yalla.ui.view.AutoImage;
import p081o000OoOO.OooO;
import p081o000OoOO.OooOO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;

/* JADX INFO: loaded from: classes4.dex */
public final class p1 implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final ConstraintLayout f58565OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final AutoImage f58566OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final ImageView f58567OooO0OO;

    public p1(@NonNull ConstraintLayout constraintLayout, @NonNull AutoImage autoImage, @NonNull ImageView imageView) {
        this.f58565OooO00o = constraintLayout;
        this.f58566OooO0O0 = autoImage;
        this.f58567OooO0OO = imageView;
    }

    @NonNull
    public static p1 inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // p081o000OoOO.OooO
    @NonNull
    public final View getRoot() {
        return this.f58565OooO00o;
    }

    @NonNull
    public static p1 inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(oO00OO0O.dialog_official_action, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = oO00O0oO.autoImage;
        AutoImage autoImage = (AutoImage) OooOO0.OooO00o(i, viewInflate);
        if (autoImage != null) {
            i = oO00O0oO.close;
            ImageView imageView = (ImageView) OooOO0.OooO00o(i, viewInflate);
            if (imageView != null) {
                return new p1((ConstraintLayout) viewInflate, autoImage, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
