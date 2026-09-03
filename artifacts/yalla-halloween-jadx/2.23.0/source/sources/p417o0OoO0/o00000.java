package p417o0OoO0;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.fragment.app.FragmentActivity;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class o00000 {
    public static Uri OooO00o(FragmentActivity context, File file) throws FileNotFoundException {
        Uri contentUri;
        String relativePath = Environment.DIRECTORY_PICTURES;
        Intrinsics.checkNotNullExpressionValue(relativePath, "DIRECTORY_PICTURES");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(relativePath, "relativePath");
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", file.getName());
        String extension = FilesKt.getExtension(file);
        int iHashCode = extension.hashCode();
        String str = "jpeg";
        Unit unit = null;
        if (iHashCode != 105441) {
            if (iHashCode == 111145) {
                str = "png";
                if (!extension.equals("png")) {
                    return null;
                }
            } else if (iHashCode != 3268712 || !extension.equals("jpeg")) {
                return null;
            }
        } else if (!extension.equals("jpg")) {
            return null;
        }
        contentValues.put("mime_type", "image/".concat(str));
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            contentValues.put("relative_path", relativePath);
            contentValues.put("is_pending", (Integer) 1);
        }
        boolean z = i >= 29;
        if (z) {
            contentUri = MediaStore.Images.Media.getContentUri("external");
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        }
        Uri uriInsert = context.getContentResolver().insert(contentUri, contentValues);
        if (uriInsert != null) {
            OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(uriInsert);
            if (outputStreamOpenOutputStream != null) {
                try {
                    try {
                        outputStreamOpenOutputStream.write(FilesKt.readBytes(file));
                        outputStreamOpenOutputStream.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    Unit unit2 = Unit.INSTANCE;
                    CloseableKt.closeFinally(outputStreamOpenOutputStream, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(outputStreamOpenOutputStream, th);
                        throw th2;
                    }
                }
            }
            contentValues.clear();
            if (Build.VERSION.SDK_INT >= 29) {
                contentValues.put("is_pending", (Integer) 0);
                context.getContentResolver().update(uriInsert, contentValues, null, null);
            }
            unit = Unit.INSTANCE;
        }
        if (unit != null) {
            return uriInsert;
        }
        throw new RuntimeException("MediaStore failed for some reason");
    }
}
