package p494o0o00OO0;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import androidx.compose.runtime.internal.StabilityInferred;
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
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooO {
    @TargetApi(29)
    @Nullable
    public static final String OooO00o(@NotNull Context context, @NotNull File fileToExport) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileToExport, "fileToExport");
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        try {
            String strProbeContentType = Files.probeContentType(fileToExport.toPath());
            if (strProbeContentType != null && StringsKt__StringsJVMKt.startsWith(strProbeContentType, "image", true)) {
                String str = System.currentTimeMillis() + '.' + StringsKt__StringsKt.substringAfterLast$default(strProbeContentType, "/", (String) null, 2, (Object) null);
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", str);
                contentValues.put("mime_type", strProbeContentType);
                contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + "/yalla");
                contentValues.put("is_pending", (Integer) 1);
                Uri uriInsert = context.getContentResolver().insert(uri, contentValues);
                if (uriInsert == null) {
                    return null;
                }
                ContentResolver contentResolver = context.getContentResolver();
                Intrinsics.checkNotNullExpressionValue(contentResolver, "context.contentResolver");
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uriInsert, "w");
                try {
                    new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptorOpenFileDescriptor).write(FilesKt.readBytes(fileToExport));
                    fileToExport.delete();
                    CloseableKt.closeFinally(parcelFileDescriptorOpenFileDescriptor, null);
                    contentValues.clear();
                    contentValues.put("is_pending", (Integer) 0);
                    context.getContentResolver().update(uriInsert, contentValues, null, null);
                    StringBuilder sb = new StringBuilder();
                    String type = Environment.DIRECTORY_PICTURES;
                    Intrinsics.checkNotNullExpressionValue(type, "DIRECTORY_PICTURES");
                    Intrinsics.checkNotNullParameter(type, "type");
                    File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(type);
                    Intrinsics.checkNotNullExpressionValue(externalStoragePublicDirectory, "getExternalStoragePublicDirectory(type)");
                    sb.append(externalStoragePublicDirectory.getAbsolutePath());
                    sb.append("/yalla/");
                    sb.append(str);
                    return sb.toString();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(parcelFileDescriptorOpenFileDescriptor, th);
                        throw th2;
                    }
                }
            }
            return null;
        } catch (IOException e) {
            o00O00.OooO0o0("FSManager", e.getMessage());
            return null;
        }
    }
}
