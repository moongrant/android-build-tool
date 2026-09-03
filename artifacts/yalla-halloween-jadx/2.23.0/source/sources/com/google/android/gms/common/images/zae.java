package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.base.zai;
import com.google.android.gms.internal.base.zaj;
import java.lang.ref.WeakReference;
import net.sqlcipher.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final class zae extends zag {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final WeakReference<ImageView> f15004OooO0OO;

    public zae(ImageView imageView, int i) {
        super(Uri.EMPTY, i);
        Asserts.checkNotNull(imageView);
        this.f15004OooO0OO = new WeakReference<>(imageView);
    }

    @Override // com.google.android.gms.common.images.zag
    public final void OooO00o(@Nullable Drawable drawable, boolean z, boolean z2, boolean z3) {
        ImageView imageView = this.f15004OooO0OO.get();
        if (imageView != null) {
            if (!z2 && !z3 && (imageView instanceof zaj)) {
                throw null;
            }
            boolean z4 = false;
            if (!z2 && !z) {
                z4 = true;
            }
            if (z4) {
                Drawable drawable2 = imageView.getDrawable();
                if (drawable2 == null) {
                    drawable2 = null;
                } else if (drawable2 instanceof zai) {
                    drawable2 = ((zai) drawable2).zaa();
                }
                drawable = new zai(drawable2, drawable);
            }
            imageView.setImageDrawable(drawable);
            if (imageView instanceof zaj) {
                throw null;
            }
            if (drawable == null || !z4) {
                return;
            }
            ((zai) drawable).zab(SQLiteDatabase.MAX_SQL_CACHE_SIZE);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zae)) {
            return false;
        }
        ImageView imageView = this.f15004OooO0OO.get();
        ImageView imageView2 = ((zae) obj).f15004OooO0OO.get();
        return (imageView2 == null || imageView == null || !Objects.equal(imageView2, imageView)) ? false : true;
    }

    public final int hashCode() {
        return 0;
    }

    public zae(ImageView imageView, Uri uri) {
        super(uri, 0);
        Asserts.checkNotNull(imageView);
        this.f15004OooO0OO = new WeakReference<>(imageView);
    }
}
