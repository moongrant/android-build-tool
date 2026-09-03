package com.common.support.imagepicker.mediaedit.utils;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.common.support.imagepicker.base.utils.ImagePickerLogUtil;
import com.facebook.share.internal.ShareConstants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006J\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/utils/FileUtils;", "", "()V", "TAG", "", "copy", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "source", "targetPath", "getFileExtension", ShareConstants.MEDIA_URI, "getFileName", "mediaedit_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FileUtils {

    @NotNull
    public static final FileUtils INSTANCE = new FileUtils();

    @NotNull
    private static final String TAG = "FileUtils";

    private FileUtils() {
    }

    @Nullable
    public final Uri copy(@NotNull Context context, @NotNull Uri source, @NotNull String targetPath) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(targetPath, "targetPath");
        InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(source);
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        try {
            File file = new File(targetPath);
            if (!file.exists()) {
                file.mkdirs();
            }
            StringBuilder sb = new StringBuilder();
            MessageDigestUtils messageDigestUtils = MessageDigestUtils.INSTANCE;
            String string = source.toString();
            Intrinsics.checkNotNullExpressionValue(string, "source.toString()");
            sb.append(messageDigestUtils.md5(string));
            sb.append(System.currentTimeMillis());
            sb.append('.');
            sb.append(INSTANCE.getFileExtension(context, source));
            File file2 = new File(file, sb.toString());
            if (file2.exists()) {
                Uri uriFromFile = Uri.fromFile(file2);
                Intrinsics.checkNotNullExpressionValue(uriFromFile, "fromFile(this)");
                CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                return uriFromFile;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                ByteStreamsKt.copyTo$default(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                CloseableKt.closeFinally(fileOutputStream, null);
                Uri uriFromFile2 = Uri.fromFile(file2);
                Intrinsics.checkNotNullExpressionValue(uriFromFile2, "fromFile(this)");
                CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                return uriFromFile2;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.closeFinally(inputStreamOpenInputStream, th3);
                throw th4;
            }
        }
    }

    @NotNull
    public final String getFileExtension(@NotNull Context context, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String imageExtension = ImageUtils.INSTANCE.getImageExtension(context, uri);
        if (imageExtension != null) {
            return imageExtension;
        }
        List listSplit$default = StringsKt__StringsKt.split$default(INSTANCE.getFileName(context, uri), new String[]{"."}, false, 0, 6, (Object) null);
        return listSplit$default.size() > 1 ? (String) listSplit$default.get(listSplit$default.size() - 1) : "";
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[PHI: r3
      0x0052: PHI (r3v7 java.lang.String) = (r3v4 java.lang.String), (r3v8 java.lang.String) binds: [B:16:0x0048, B:20:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    @NotNull
    public final String getFileName(@NotNull Context context, @NotNull Uri uri) {
        String string = TAG;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String str = null;
        if (Intrinsics.areEqual(uri.getScheme(), "content")) {
            Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
            try {
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            int columnIndex = cursorQuery.getColumnIndex("_display_name");
                            if (columnIndex != -1) {
                                string = cursorQuery.getString(columnIndex);
                                str = string;
                            } else {
                                ImagePickerLogUtil.INSTANCE.w(TAG, "OpenableColumns.DISPLAY_NAME index = -1");
                            }
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Exception e) {
                        ImagePickerLogUtil.e(string, e);
                    }
                } else if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
        if (str != null) {
            return str;
        }
        String path = uri.getPath();
        Intrinsics.checkNotNull(path);
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        int iLastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default(path, separator, 0, false, 6, (Object) null);
        if (iLastIndexOf$default == -1) {
            return path;
        }
        String strSubstring = path.substring(iLastIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return strSubstring;
    }
}
