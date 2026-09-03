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
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/common/support/imagepicker/mediaedit/utils/FileUtils;", "", "()V", "TAG", "", "copy", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "source", "targetPath", "getFileExtension", ShareConstants.MEDIA_URI, "getFileName", "mediaedit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFileUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileUtils.kt\ncom/common/support/imagepicker/mediaedit/utils/FileUtils\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,76:1\n36#2:77\n36#2:78\n*S KotlinDebug\n*F\n+ 1 FileUtils.kt\ncom/common/support/imagepicker/mediaedit/utils/FileUtils\n*L\n28#1:77\n32#1:78\n*E\n"})
public final class FileUtils {

    @NotNull
    public static final FileUtils INSTANCE = new FileUtils();

    @NotNull
    private static final String TAG = "FileUtils";

    private FileUtils() {
    }

    private final String getFileName(Context context, Uri uri) {
        Cursor cursorQuery;
        String string;
        String str = null;
        if (Intrinsics.areEqual(uri.getScheme(), "content") && (cursorQuery = context.getContentResolver().query(uri, null, null, null, null)) != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    int columnIndex = cursorQuery.getColumnIndex("_display_name");
                    if (columnIndex != -1) {
                        string = cursorQuery.getString(columnIndex);
                    } else {
                        ImagePickerLogUtil.INSTANCE.w(TAG, "OpenableColumns.DISPLAY_NAME index = -1");
                        string = null;
                    }
                } else {
                    string = null;
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursorQuery, null);
                str = string;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(cursorQuery, th);
                    throw th2;
                }
            }
        }
        if (str != null) {
            return str;
        }
        String path = uri.getPath();
        if (path == null) {
            return path;
        }
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
            MessageDigestUtils messageDigestUtils = MessageDigestUtils.INSTANCE;
            String string = source.toString();
            Intrinsics.checkNotNullExpressionValue(string, "source.toString()");
            File file2 = new File(file, messageDigestUtils.md5(string) + System.currentTimeMillis() + "." + INSTANCE.getFileExtension(context, source));
            if (file2.exists()) {
                Uri uriFromFile = Uri.fromFile(file2);
                CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                return uriFromFile;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                ByteStreamsKt.copyTo$default(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                CloseableKt.closeFinally(fileOutputStream, null);
                Uri uriFromFile2 = Uri.fromFile(file2);
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
        String fileName = INSTANCE.getFileName(context, uri);
        if (!(fileName == null || fileName.length() == 0)) {
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) fileName, new String[]{"."}, false, 0, 6, (Object) null);
            if (listSplit$default.size() > 1) {
                return (String) listSplit$default.get(listSplit$default.size() - 1);
            }
        }
        return "";
    }
}
