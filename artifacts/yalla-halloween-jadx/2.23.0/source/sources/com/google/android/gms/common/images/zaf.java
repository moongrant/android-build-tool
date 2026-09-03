package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zaf extends zag {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final WeakReference<ImageManager.OnImageLoadedListener> f15005OooO0OO;

    public zaf(ImageManager.OnImageLoadedListener onImageLoadedListener, Uri uri) {
        super(uri, 0);
        Asserts.checkNotNull(onImageLoadedListener);
        this.f15005OooO0OO = new WeakReference<>(onImageLoadedListener);
    }

    @Override // com.google.android.gms.common.images.zag
    public final void OooO00o(@Nullable Drawable drawable, boolean z, boolean z2, boolean z3) {
        ImageManager.OnImageLoadedListener onImageLoadedListener;
        if (z2 || (onImageLoadedListener = this.f15005OooO0OO.get()) == null) {
            return;
        }
        onImageLoadedListener.onImageLoaded(this.f15006OooO00o.f14997OooO00o, drawable, z3);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaf)) {
            return false;
        }
        zaf zafVar = (zaf) obj;
        ImageManager.OnImageLoadedListener onImageLoadedListener = this.f15005OooO0OO.get();
        ImageManager.OnImageLoadedListener onImageLoadedListener2 = zafVar.f15005OooO0OO.get();
        return onImageLoadedListener2 != null && onImageLoadedListener != null && Objects.equal(onImageLoadedListener2, onImageLoadedListener) && Objects.equal(zafVar.f15006OooO00o, this.f15006OooO00o);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f15006OooO00o);
    }
}
