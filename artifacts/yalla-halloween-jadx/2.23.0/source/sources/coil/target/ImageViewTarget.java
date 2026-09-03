package coil.target;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcoil/target/ImageViewTarget;", "Lcoil/target/GenericViewTarget;", "Landroid/widget/ImageView;", "coil-base_release"}, k = 1, mv = {1, 7, 1})
public class ImageViewTarget extends GenericViewTarget<ImageView> {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ImageView f8634OooO0o0;

    public ImageViewTarget(@NotNull ImageView imageView) {
        this.f8634OooO0o0 = imageView;
    }

    @Override // coil.target.GenericViewTarget, o00O0000.OooO0o
    @Nullable
    public final Drawable OooO0Oo() {
        return this.f8634OooO0o0.getDrawable();
    }

    @Override // coil.target.GenericViewTarget
    public final void OooO0o0(@Nullable Drawable drawable) {
        this.f8634OooO0o0.setImageDrawable(drawable);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ImageViewTarget) {
            if (Intrinsics.areEqual(this.f8634OooO0o0, ((ImageViewTarget) obj).f8634OooO0o0)) {
                return true;
            }
        }
        return false;
    }

    @Override // p112o000oooo.o00O0
    public final View getView() {
        return this.f8634OooO0o0;
    }

    public final int hashCode() {
        return this.f8634OooO0o0.hashCode();
    }
}
