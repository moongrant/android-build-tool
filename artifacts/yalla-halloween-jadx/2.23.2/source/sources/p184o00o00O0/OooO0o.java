package p184o00o00O0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO0.o0OoOo0;
import p041Ooooo0o.o00000;
import p182o00o000O.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nFileExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileExt.kt\ncom/code/android/cloudfilemanager/util/FileExt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,325:1\n37#2,2:326\n1#3:328\n13309#4,2:329\n*S KotlinDebug\n*F\n+ 1 FileExt.kt\ncom/code/android/cloudfilemanager/util/FileExt\n*L\n35#1:326,2\n312#1:329,2\n*E\n"})
public final class OooO0o {
    /* JADX WARN: Code duplicated, block: B:107:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Nullable
    public static File OooO00o(@NotNull Uri uri) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        Exception e;
        BufferedOutputStream bufferedOutputStream2;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        Intrinsics.checkNotNullParameter(uri, "uri");
        String strOooO0Oo = OooO0Oo(uri);
        BufferedInputStream bufferedInputStream2 = null;
        BufferedOutputStream bufferedOutputStream3 = null;
        if (strOooO0Oo == null) {
            return null;
        }
        Context context = OooOO0O.f38411OooO0o0;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("context");
            context = null;
        }
        File file = new File(context.getCacheDir(), "cloud");
        if (!file.exists()) {
            file.mkdirs();
        }
        File file2 = new File(file, strOooO0Oo);
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(file2, "file");
        boolean z = false;
        if (!file2.exists()) {
            String absolutePath = file2.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            String strOooO0O0 = "";
            for (String str : (String[]) new Regex("/").split(StringsKt__StringsKt.substringBeforeLast$default(absolutePath, "/", (String) null, 2, (Object) null), 0).toArray(new String[0])) {
                strOooO0O0 = o0OoOo0.OooO0O0(strOooO0O0, "/", str);
                File file3 = new File(strOooO0O0);
                if (!file3.exists()) {
                    file3.mkdirs();
                }
            }
            file2.createNewFile();
        }
        try {
            Context context2 = OooOO0O.f38411OooO0o0;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context2 = null;
            }
            bufferedInputStream = new BufferedInputStream(context2.getContentResolver().openInputStream(uri));
            try {
                bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file2));
                try {
                    byte[] bArr = new byte[4096];
                    for (int i = bufferedInputStream.read(bArr, 0, 4096); i > 0; i = bufferedInputStream.read(bArr, 0, 4096)) {
                        bufferedOutputStream2.write(bArr, 0, i);
                    }
                    bufferedOutputStream2.flush();
                    try {
                        bufferedInputStream.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    try {
                        bufferedOutputStream2.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    z = true;
                } catch (Exception e4) {
                    e = e4;
                    try {
                        e.printStackTrace();
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                            } catch (IOException e5) {
                                e5.printStackTrace();
                            }
                        }
                        if (bufferedOutputStream2 != null) {
                            try {
                                bufferedOutputStream2.close();
                            } catch (IOException e6) {
                                e6.printStackTrace();
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream2 = bufferedInputStream;
                        bufferedOutputStream = bufferedOutputStream2;
                        th = th;
                        if (bufferedInputStream2 != null) {
                            try {
                                bufferedInputStream2.close();
                            } catch (IOException e7) {
                                e7.printStackTrace();
                            }
                        }
                        if (bufferedOutputStream == null) {
                            throw th;
                        }
                        try {
                            bufferedOutputStream.close();
                            throw th;
                        } catch (IOException e8) {
                            e8.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bufferedOutputStream3 = bufferedOutputStream2;
                    bufferedOutputStream2 = bufferedOutputStream3;
                    bufferedInputStream2 = bufferedInputStream;
                    bufferedOutputStream = bufferedOutputStream2;
                    th = th;
                    if (bufferedInputStream2 != null) {
                        bufferedInputStream2.close();
                    }
                    if (bufferedOutputStream == null) {
                        throw th;
                    }
                    bufferedOutputStream.close();
                    throw th;
                }
            } catch (Exception e9) {
                e = e9;
                bufferedOutputStream2 = null;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e10) {
            e = e10;
            bufferedOutputStream2 = null;
            bufferedInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            bufferedOutputStream = null;
            if (bufferedInputStream2 != null) {
                bufferedInputStream2.close();
            }
            if (bufferedOutputStream == null) {
                throw th;
            }
            bufferedOutputStream.close();
            throw th;
        }
        if (z) {
            return file2;
        }
        return null;
    }

    @NotNull
    public static String OooO0O0(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(file.getAbsolutePath());
        if (fileExtensionFromUrl == null || fileExtensionFromUrl.length() == 0) {
            String absolutePath = file.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
            fileExtensionFromUrl = StringsKt__StringsKt.substringBefore$default(StringsKt__StringsKt.substringAfterLast(absolutePath, ".", ""), "?", (String) null, 2, (Object) null);
        }
        if ((fileExtensionFromUrl == null || fileExtensionFromUrl.length() == 0) || fileExtensionFromUrl.length() > 5) {
            return "jpg";
        }
        Intrinsics.checkNotNull(fileExtensionFromUrl);
        return fileExtensionFromUrl;
    }

    @NotNull
    public static String OooO0OO(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(OooO0O0(file));
        return mimeTypeFromExtension == null ? "" : mimeTypeFromExtension;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004a A[PHI: r1
      0x004a: PHI (r1v7 java.lang.String) = (r1v1 java.lang.String), (r1v8 java.lang.String) binds: [B:17:0x0040, B:21:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    @SuppressLint({"Range"})
    @Nullable
    public static String OooO0Oo(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String string = null;
        if (Intrinsics.areEqual(uri.getScheme(), "content")) {
            Context context = OooOO0O.f38411OooO0o0;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("context");
                context = null;
            }
            Cursor cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
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

    public static long OooO0o(@Nullable File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jOooO0o = 0;
        if (fileArrListFiles == null) {
            return 0L;
        }
        Intrinsics.checkNotNull(fileArrListFiles);
        for (File file2 : fileArrListFiles) {
            if (file2 != null) {
                Intrinsics.checkNotNull(file2);
                jOooO0o += OooO0o(file2);
            }
        }
        return jOooO0o;
    }

    public static void OooO0o0(@Nullable String str, @NotNull Function3 listener) {
        int iValueOf;
        int iValueOf2;
        long jValueOf;
        Intrinsics.checkNotNullParameter(listener, "listener");
        try {
            try {
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                mediaMetadataRetriever.setDataSource(str);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(24);
                int i = strExtractMetadata != null ? Integer.parseInt(strExtractMetadata) : 0;
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
                int i2 = strExtractMetadata2 != null ? Integer.parseInt(strExtractMetadata2) : 0;
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                int i3 = strExtractMetadata3 != null ? Integer.parseInt(strExtractMetadata3) : 0;
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(9);
                long j = 1000;
                long j2 = ((strExtractMetadata4 != null ? Long.parseLong(strExtractMetadata4) : 0L) / j) * j;
                if (i == 90 || i == 270) {
                    int i4 = i3;
                    i3 = i2;
                    i2 = i4;
                }
                StringBuilder sbOooO00o = o00000.OooO00o("getMediaVideoInfo width = ", i2, ", height = ", i3, ", duration = ");
                sbOooO00o.append(j2);
                System.out.println((Object) sbOooO00o.toString());
                iValueOf = Integer.valueOf(i2);
                iValueOf2 = Integer.valueOf(i3);
                jValueOf = Long.valueOf(j2);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println((Object) "getMediaVideoInfo width = 0, height = 0, duration = 0");
                iValueOf = 0;
                iValueOf2 = 0;
                jValueOf = 0L;
            }
            listener.invoke(iValueOf, iValueOf2, jValueOf);
        } catch (Throwable th) {
            System.out.println((Object) "getMediaVideoInfo width = 0, height = 0, duration = 0");
            listener.invoke(0, 0, 0L);
            throw th;
        }
    }
}
