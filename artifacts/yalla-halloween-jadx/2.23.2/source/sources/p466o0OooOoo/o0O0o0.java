package p466o0OooOoo;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import com.yalla.yalla.download.fs.MediaType;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o0 {
    @TargetApi(29)
    @Nullable
    public static String OooO00o(@NotNull Context context, @NotNull File fileToExport, @NotNull MediaType type) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileToExport, "fileToExport");
        Intrinsics.checkNotNullParameter(type, "type");
        MediaType mediaType = MediaType.Image;
        Uri uri = type == mediaType ? MediaStore.Images.Media.EXTERNAL_CONTENT_URI : MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        try {
            String strProbeContentType = Files.probeContentType(fileToExport.toPath());
            if (strProbeContentType == null) {
                return null;
            }
            if (type == mediaType && !StringsKt__StringsJVMKt.startsWith(strProbeContentType, "image", true)) {
                return null;
            }
            String str = System.currentTimeMillis() + "." + StringsKt__StringsKt.substringAfterLast$default(strProbeContentType, "/", (String) null, 2, (Object) null);
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str);
            contentValues.put("mime_type", strProbeContentType);
            contentValues.put("relative_path", (type == mediaType ? Environment.DIRECTORY_PICTURES : Environment.DIRECTORY_MOVIES) + "/yalla");
            contentValues.put("is_pending", (Integer) 1);
            Uri uriInsert = context.getContentResolver().insert(uri, contentValues);
            if (uriInsert == null) {
                return null;
            }
            ContentResolver contentResolver = context.getContentResolver();
            Intrinsics.checkNotNullExpressionValue(contentResolver, "getContentResolver(...)");
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uriInsert, "w");
            try {
                new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorOpenFileDescriptor).write(FilesKt.readBytes(fileToExport));
                fileToExport.delete();
                CloseableKt.closeFinally(parcelFileDescriptorOpenFileDescriptor, null);
                contentValues.clear();
                contentValues.put("is_pending", (Integer) 0);
                context.getContentResolver().update(uriInsert, contentValues, null, null);
                String type2 = type == mediaType ? Environment.DIRECTORY_PICTURES : Environment.DIRECTORY_DCIM;
                Intrinsics.checkNotNull(type2);
                Intrinsics.checkNotNullParameter(type2, "type");
                File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(type2);
                Intrinsics.checkNotNullExpressionValue(externalStoragePublicDirectory, "getExternalStoragePublicDirectory(...)");
                return externalStoragePublicDirectory.getAbsolutePath() + "/yalla/" + str;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(parcelFileDescriptorOpenFileDescriptor, th);
                    throw th2;
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
