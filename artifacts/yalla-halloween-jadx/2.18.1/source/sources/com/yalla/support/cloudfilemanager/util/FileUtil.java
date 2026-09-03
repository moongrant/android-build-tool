package com.yalla.support.cloudfilemanager.util;

import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.facebook.share.internal.ShareConstants;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o00O000;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\rJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\rJ\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/yalla/support/cloudfilemanager/util/FileUtil;", "", "()V", "DEFAULT_BUFFER_SIZE", "", "EOF", "copy", "", "input", "Ljava/io/InputStream;", "output", "Ljava/io/OutputStream;", "copyFile2Cache", "Ljava/io/File;", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "", ShareInternalUtility.STAGING_PARAM, "createFileDirectorys", "", "filePath", "", "getFileExtension", "mimeType", "getFileMimeType", "getFileName", "rename", "newName", "CloudFileManager_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FileUtil {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int EOF = -1;

    @NotNull
    public static final FileUtil INSTANCE = new FileUtil();

    private FileUtil() {
    }

    private final long copy(InputStream input, OutputStream output) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int i = input.read(bArr);
            Unit unit = Unit.INSTANCE;
            if (-1 == i) {
                return j;
            }
            Intrinsics.checkNotNull(output);
            output.write(bArr, 0, i);
            j += (long) i;
        }
    }

    private final void createFileDirectorys(String filePath) {
        Object[] array = new Regex("/").split(StringsKt__StringsKt.substringBeforeLast$default(filePath, "/", (String) null, 2, (Object) null), 0).toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String str = "";
        for (String str2 : (String[]) array) {
            str = str + '/' + str2;
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
    }

    private final File rename(File file, String newName) {
        File file2 = new File(file.getParent(), newName);
        if (!Intrinsics.areEqual(file2, file)) {
            if (file2.exists() && file2.delete()) {
                Log.d("FileUtil", "Delete old " + newName + " file");
            }
            if (file.renameTo(file2)) {
                Log.d("FileUtil", "Rename file to " + newName);
            }
        }
        return file2;
    }

    @Nullable
    public final File copyFile2Cache(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String fileName = getFileName(uri);
        if (fileName == null) {
            return null;
        }
        o00O000 o00o001 = o00O000.f34346OooO00o;
        File file = new File(o00O000.OooO00o().getCacheDir(), "cloud");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, fileName);
        if (copyFile2Cache(uri, file2)) {
            return file2;
        }
        return null;
    }

    @NotNull
    public final String getFileExtension(@NotNull String mimeType) {
        Intrinsics.checkNotNullParameter(mimeType, "mimeType");
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(mimeType);
        return extensionFromMimeType == null ? "" : extensionFromMimeType;
    }

    @NotNull
    public final String getFileMimeType(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        o00O000 o00o001 = o00O000.f34346OooO00o;
        String type = o00O000.OooO00o().getContentResolver().getType(uri);
        return type == null ? "" : type;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0046 A[PHI: r1
      0x0046: PHI (r1v7 java.lang.String) = (r1v1 java.lang.String), (r1v8 java.lang.String) binds: [B:13:0x003c, B:17:0x0044] A[DONT_GENERATE, DONT_INLINE]] */
    @Nullable
    public final String getFileName(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String string = null;
        if (Intrinsics.areEqual(uri.getScheme(), "content")) {
            o00O000 o00o001 = o00O000.f34346OooO00o;
            Cursor cursorQuery = o00O000.OooO00o().getContentResolver().query(uri, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            } else if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        if (string != null) {
            return string;
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

    @NotNull
    public final String getFileExtension(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String fileName = getFileName(uri);
        if (fileName == null) {
            fileName = "";
        }
        List listSplit$default = StringsKt__StringsKt.split$default(fileName, new String[]{"."}, false, 0, 6, (Object) null);
        return listSplit$default.size() > 1 ? (String) listSplit$default.get(listSplit$default.size() - 1) : "";
    }

    @NotNull
    public final String getFileMimeType(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(getFileExtension(file));
        return mimeTypeFromExtension == null ? "" : mimeTypeFromExtension;
    }

    @NotNull
    public final String getFileExtension(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(file.getAbsolutePath());
        boolean z = true;
        if (fileExtensionFromUrl == null || fileExtensionFromUrl.length() == 0) {
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "file.absolutePath");
            fileExtensionFromUrl = StringsKt__StringsKt.substringBefore$default(StringsKt__StringsKt.substringAfterLast(absolutePath, ".", ""), "?", (String) null, 2, (Object) null);
        }
        if (fileExtensionFromUrl != null && fileExtensionFromUrl.length() != 0) {
            z = false;
        }
        if (z || fileExtensionFromUrl.length() > 5) {
            return "jpg";
        }
        Intrinsics.checkNotNullExpressionValue(fileExtensionFromUrl, "fileExtensionFromUrl");
        return fileExtensionFromUrl;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0090 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[SYNTHETIC] */
    public final boolean copyFile2Cache(@NotNull Uri uri, @NotNull File file) throws Throwable {
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        Exception e;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(file, "file");
        if (!file.exists()) {
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "file.absolutePath");
            createFileDirectorys(absolutePath);
            file.createNewFile();
        }
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream2 = null;
        BufferedOutputStream bufferedOutputStream3 = null;
        bufferedInputStream = null;
        boolean z = false;
        try {
            o00O000 o00o001 = o00O000.f34346OooO00o;
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(o00O000.OooO00o().getContentResolver().openInputStream(uri));
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    byte[] bArr = new byte[4096];
                    for (int i = bufferedInputStream2.read(bArr, 0, 4096); i > 0; i = bufferedInputStream2.read(bArr, 0, 4096)) {
                        bufferedOutputStream.write(bArr, 0, i);
                    }
                    bufferedOutputStream.flush();
                    z = true;
                    try {
                        bufferedInputStream2.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                } catch (Exception e3) {
                    e = e3;
                    bufferedOutputStream2 = bufferedOutputStream;
                    bufferedOutputStream = bufferedOutputStream2;
                    bufferedInputStream = bufferedInputStream2;
                    try {
                        e.printStackTrace();
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (bufferedOutputStream != null) {
                        }
                        return z;
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        if (bufferedOutputStream != null) {
                            throw th;
                        }
                        try {
                            bufferedOutputStream.close();
                            throw th;
                        } catch (IOException e6) {
                            e6.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream3 = bufferedOutputStream;
                    bufferedOutputStream = bufferedOutputStream3;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                    }
                    if (bufferedOutputStream != null) {
                        throw th;
                    }
                    bufferedOutputStream.close();
                    throw th;
                }
            } catch (Exception e7) {
                e = e7;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e8) {
            e = e8;
            bufferedOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedOutputStream = null;
        }
        try {
            bufferedOutputStream.close();
        } catch (IOException e9) {
            e9.printStackTrace();
        }
        return z;
    }
}
