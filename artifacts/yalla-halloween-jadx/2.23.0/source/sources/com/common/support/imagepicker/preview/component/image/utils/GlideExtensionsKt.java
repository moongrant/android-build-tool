package com.common.support.imagepicker.preview.component.image.utils;

import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import com.bumptech.glide.OooO0OO;
import com.bumptech.glide.OooOOOO;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o00OO0O0.OooOo;
import o00OO0O0.o0Oo0oo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p131o00OO0o.OooO;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u001aO\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0002\u0010\r\u001aO\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0002\u0010\r\u001aY\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014¨\u0006\u0015"}, d2 = {"load", "", "Landroid/widget/ImageView;", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "loadGif", "gif", "error", "", "placeHolder", "radius", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "(Landroid/widget/ImageView;Landroid/net/Uri;Ljava/lang/Integer;Ljava/lang/Integer;III)V", "loadImg", "img", "loadVideo", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_VIDEO, "frame", "", "(Landroid/widget/ImageView;Landroid/net/Uri;Ljava/lang/Integer;Ljava/lang/Integer;IIIJ)V", "preview_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class GlideExtensionsKt {
    public static final void load(@NotNull ImageView imageView, @Nullable Uri uri) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        OooO0OO.OooO(imageView).OooOOOO(uri).OoooO0O(imageView);
    }

    public static final void loadGif(@NotNull ImageView imageView, @Nullable Uri uri, @DrawableRes @Nullable Integer num, @DrawableRes @Nullable Integer num2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        OooOOOO<OooO> oooOOOOO000oOoO = OooO0OO.OooO(imageView).OooOO0o().o000oOoO(uri);
        if (i2 > 0 && i3 > 0) {
            oooOOOOO000oOoO.OooOo0O(i2, i3);
        }
        if (num2 != null) {
            oooOOOOO000oOoO.OooOo0o(num2.intValue());
        }
        if (num != null) {
            oooOOOOO000oOoO.OooOO0O(num.intValue());
        }
        if (i > 0) {
            oooOOOOO000oOoO = (OooOOOO) oooOOOOO000oOoO.Oooo0o0(new OooOo(), new o0Oo0oo(i));
        }
        oooOOOOO000oOoO.OoooO0O(imageView);
    }

    public static final void loadImg(@NotNull ImageView imageView, @Nullable Uri uri, @DrawableRes @Nullable Integer num, @DrawableRes @Nullable Integer num2, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        int[] maxImageSize = BitmapUtilsKt.getMaxImageSize(i2, i3);
        OooOOOO<Bitmap> oooOOOOO000oOoO = OooO0OO.OooO(imageView).OooO0oo().o000oOoO(uri);
        if (i2 > 0 && i3 > 0) {
            oooOOOOO000oOoO.OooOo0O(maxImageSize[0], maxImageSize[1]);
        }
        if (num2 != null) {
            oooOOOOO000oOoO.OooOo0o(num2.intValue());
        }
        if (num != null) {
            oooOOOOO000oOoO.OooOO0O(num.intValue());
        }
        if (i > 0) {
            oooOOOOO000oOoO.Oooo0o0(new OooOo(), new o0Oo0oo(i));
        }
        oooOOOOO000oOoO.OoooO0O(imageView);
    }

    public static final void loadVideo(@NotNull ImageView imageView, @Nullable Uri uri, @DrawableRes @Nullable Integer num, @DrawableRes @Nullable Integer num2, int i, int i2, int i3, long j) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        OooOOOO<Bitmap> oooOOOOO000oOoO = OooO0OO.OooO(imageView).OooO0oo().o000oOoO(uri);
        oooOOOOO000oOoO.OooOOO(j);
        if (i2 > 0 && i3 > 0) {
            oooOOOOO000oOoO.OooOo0O(i2, i3);
        }
        if (num2 != null) {
            oooOOOOO000oOoO.OooOo0o(num2.intValue());
        }
        if (num != null) {
            oooOOOOO000oOoO.OooOO0O(num.intValue());
        }
        if (i > 0) {
            oooOOOOO000oOoO = (OooOOOO) oooOOOOO000oOoO.Oooo0o0(new OooOo(), new o0Oo0oo(i));
        }
        oooOOOOO000oOoO.OoooO0O(imageView);
    }
}
