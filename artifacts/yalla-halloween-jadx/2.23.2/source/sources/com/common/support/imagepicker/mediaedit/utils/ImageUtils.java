package com.common.support.imagepicker.mediaedit.utils;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.exifinterface.media.ExifInterface;
import com.common.support.imagepicker.dataprovider.entities.AlbumItemWrapper;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import java.io.InputStream;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001c\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\u0014"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/utils/ImageUtils;", "", "()V", "getBitmapByGif", "Landroid/graphics/Bitmap;", "source", "Lcom/common/support/imagepicker/dataprovider/entities/AlbumItemWrapper;", "getFilePathFromMediaStore", "", "context", "Landroid/content/Context;", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "getImageExtension", "getImagePathFromUri", "getImageWidthHeight", "", ShareInternalUtility.STAGING_PARAM, "Ljava/io/File;", "getImageWidthHeight2", "mediaedit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ImageUtils {

    @NotNull
    public static final ImageUtils INSTANCE = new ImageUtils();

    private ImageUtils() {
    }

    private final String getFilePathFromMediaStore(Context context, Uri uri) throws Throwable {
        Cursor cursor = null;
        string = null;
        String string = null;
        try {
            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return string;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private final String getImagePathFromUri(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        if (StringsKt__StringsJVMKt.equals("content", uri.getScheme(), true)) {
            return getFilePathFromMediaStore(context, uri);
        }
        if (StringsKt__StringsJVMKt.equals(ShareInternalUtility.STAGING_PARAM, uri.getScheme(), true)) {
            return uri.getPath();
        }
        return null;
    }

    @Nullable
    public final Bitmap getBitmapByGif(@NotNull AlbumItemWrapper source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return OffScreenRender.INSTANCE.getSourceBitmap(source);
    }

    @Nullable
    public final String getImageExtension(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            try {
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                String str = options.outMimeType;
                Intrinsics.checkNotNullExpressionValue(str, "options.outMimeType");
                String strReplace$default = StringsKt__StringsJVMKt.replace$default(str, "image/", "", false, 4, (Object) null);
                CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                return strReplace$default;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(inputStreamOpenInputStream, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    @NotNull
    public final int[] getImageWidthHeight(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            Result.Companion companion = Result.INSTANCE;
            ExifInterface exifInterface = new ExifInterface(file);
            int iOooOOO = exifInterface.OooOOO();
            int iOooO0o0 = exifInterface.OooO0o0(0, "PixelXDimension");
            int iOooO0o1 = exifInterface.OooO0o0(0, "PixelYDimension");
            if (iOooO0o0 == 0 || iOooO0o1 == 0) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                options.inJustDecodeBounds = false;
                iOooO0o0 = options.outWidth;
                iOooO0o1 = options.outHeight;
            }
            return (iOooOOO == 90 || iOooOOO == 270) ? new int[]{iOooO0o1, iOooO0o0} : new int[]{iOooO0o0, iOooO0o1};
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Object objM4215constructorimpl = Result.m4215constructorimpl(ResultKt.createFailure(th));
            int[] iArr = {0, 0};
            if (Result.m4221isFailureimpl(objM4215constructorimpl)) {
                objM4215constructorimpl = iArr;
            }
            return (int[]) objM4215constructorimpl;
        }
    }

    @NotNull
    public final int[] getImageWidthHeight2(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            Result.Companion companion = Result.INSTANCE;
            String imagePathFromUri = INSTANCE.getImagePathFromUri(context, uri);
            if (imagePathFromUri == null || imagePathFromUri.length() == 0) {
                return new int[]{0, 0};
            }
            ExifInterface exifInterface = new ExifInterface(imagePathFromUri);
            int iOooO0o0 = exifInterface.OooO0o0(1, "Orientation");
            int iOooO0o1 = exifInterface.OooO0o0(0, "PixelXDimension");
            int iOooO0o2 = exifInterface.OooO0o0(0, "PixelYDimension");
            if (iOooO0o1 == 0 || iOooO0o2 == 0) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(imagePathFromUri, options);
                options.inJustDecodeBounds = false;
                iOooO0o1 = options.outWidth;
                iOooO0o2 = options.outHeight;
            }
            return (iOooO0o0 == 6 || iOooO0o0 == 8) ? new int[]{iOooO0o2, iOooO0o1} : new int[]{iOooO0o1, iOooO0o2};
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            if (Result.m4218exceptionOrNullimpl(Result.m4215constructorimpl(ResultKt.createFailure(th))) != null) {
                return new int[]{0, 0};
            }
            throw new KotlinNothingValueException();
        }
    }

    @NotNull
    public final int[] getImageWidthHeight(@NotNull Context context, @NotNull Uri uri) {
        Object objM4215constructorimpl;
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Object obj2 = {0, 0};
        try {
            Result.Companion companion = Result.INSTANCE;
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    ExifInterface exifInterface = new ExifInterface(inputStreamOpenInputStream);
                    int iOooO0o0 = exifInterface.OooO0o0(1, "Orientation");
                    int iOooO0o1 = exifInterface.OooO0o0(0, "PixelXDimension");
                    int iOooO0o2 = exifInterface.OooO0o0(0, "PixelYDimension");
                    if (iOooO0o1 <= 0 || iOooO0o2 <= 0) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                        options.inJustDecodeBounds = false;
                        obj = new int[]{options.outWidth, options.outHeight};
                    } else if (iOooO0o0 != 6 && iOooO0o0 != 8) {
                        obj = new int[]{iOooO0o1, iOooO0o2};
                    } else {
                        obj = new int[]{iOooO0o2, iOooO0o1};
                    }
                    CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(inputStreamOpenInputStream, th);
                        throw th2;
                    }
                }
            } else {
                obj = obj2;
            }
            objM4215constructorimpl = Result.m4215constructorimpl(obj);
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.INSTANCE;
            objM4215constructorimpl = Result.m4215constructorimpl(ResultKt.createFailure(th3));
        }
        if (!Result.m4221isFailureimpl(objM4215constructorimpl)) {
            obj2 = objM4215constructorimpl;
        }
        return (int[]) obj2;
    }
}
