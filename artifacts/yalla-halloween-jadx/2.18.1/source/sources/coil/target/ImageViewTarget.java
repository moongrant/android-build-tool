package coil.target;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OooO0O0;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o00O0OO.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p117o00O0OOo.OooOO0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcoil/target/ImageViewTarget;", "Lo00O0OO/OooO00o;", "Landroid/widget/ImageView;", "Lo00O0OOo/OooOO0;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "coil-base_release"}, k = 1, mv = {1, 5, 1})
public class ImageViewTarget implements OooO00o<ImageView>, OooOO0, DefaultLifecycleObserver {
    @Override // o00O0OO.OooO0O0
    public final void OooO00o(@NotNull Drawable result) {
        Intrinsics.checkNotNullParameter(result, "result");
        throw null;
    }

    @Override // o00O0OO.OooO0O0
    public final void OooO0O0(@Nullable Drawable drawable) {
        throw null;
    }

    @Override // o00O0OO.OooO00o
    public final void OooO0OO() {
        throw null;
    }

    @Override // p117o00O0OOo.OooOO0
    @Nullable
    public final Drawable OooO0Oo() {
        throw null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof ImageViewTarget) {
                Objects.requireNonNull((ImageViewTarget) obj);
                if (Intrinsics.areEqual((Object) null, (Object) null)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // o00O0OO.OooO0OO, p117o00O0OOo.OooOO0
    public final /* bridge */ /* synthetic */ View getView() {
        return null;
    }

    public final int hashCode() {
        throw null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        OooO0O0.OooO00o(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        OooO0O0.OooO0O0(this, lifecycleOwner);
    }

    @Override // o00O0OO.OooO0O0
    public final void onError() {
        throw null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        OooO0O0.OooO0OO(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        OooO0O0.OooO0Oo(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onStart(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        throw null;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onStop(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        throw null;
    }

    @NotNull
    public final String toString() {
        return "ImageViewTarget(view=null)";
    }
}
