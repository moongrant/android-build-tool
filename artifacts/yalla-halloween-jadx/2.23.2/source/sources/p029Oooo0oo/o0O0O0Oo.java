package p029Oooo0oo;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import com.google.auto.value.AutoValue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import p037OoooOo0.o000O00;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public final class o0O0O0Oo {

    @AutoValue
    public static abstract class OooO00o {
        @NonNull
        public abstract ImageCapture.OooOO0O OooO00o();

        @NonNull
        public abstract o000O00<byte[]> OooO0O0();
    }

    public static Uri OooO00o(@NonNull File file, @NonNull File file2) throws ImageCaptureException {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new ImageCaptureException(null, "Failed to overwrite the file: " + file2.getAbsolutePath());
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    public static Uri OooO0O0(@NonNull File file, @NonNull ImageCapture.OooOO0O oooOO0O) throws Throwable {
        Uri uriInsert;
        int i;
        ContentValues contentValues;
        ContentResolver contentResolver = oooOO0O.f3424OooO0O0;
        Objects.requireNonNull(contentResolver);
        ContentValues contentValues2 = oooOO0O.f3426OooO0Oo;
        ContentValues contentValues3 = contentValues2 != null ? new ContentValues(contentValues2) : new ContentValues();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            contentValues3.put("is_pending", (Integer) 1);
        }
        try {
            try {
                uriInsert = contentResolver.insert(oooOO0O.f3425OooO0OO, contentValues3);
                try {
                    if (uriInsert == null) {
                        throw new ImageCaptureException(null, "Failed to insert a MediaStore URI.");
                    }
                    OooO0Oo(contentResolver, uriInsert, file);
                    if (i2 >= 29) {
                        ContentValues contentValues4 = new ContentValues();
                        if (i2 >= 29) {
                            contentValues4.put("is_pending", (Integer) 0);
                        }
                        contentResolver.update(uriInsert, contentValues4, null, null);
                    }
                    return uriInsert;
                } catch (IOException e) {
                    e = e;
                    throw new ImageCaptureException(e, "Failed to write to MediaStore URI: " + uriInsert);
                } catch (SecurityException e2) {
                    e = e2;
                    throw new ImageCaptureException(e, "Failed to write to MediaStore URI: " + uriInsert);
                }
            } catch (Throwable th) {
                th = th;
                if (oooOO0O != 0 && (i = Build.VERSION.SDK_INT) >= 29) {
                    contentValues = new ContentValues();
                    if (i >= 29) {
                        contentValues.put("is_pending", (Integer) 0);
                    }
                    contentResolver.update(oooOO0O, contentValues, null, null);
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            uriInsert = null;
            throw new ImageCaptureException(e, "Failed to write to MediaStore URI: " + uriInsert);
        } catch (SecurityException e4) {
            e = e4;
            uriInsert = null;
            throw new ImageCaptureException(e, "Failed to write to MediaStore URI: " + uriInsert);
        } catch (Throwable th2) {
            th = th2;
            oooOO0O = 0;
            if (oooOO0O != 0) {
                contentValues = new ContentValues();
                if (i >= 29) {
                    contentValues.put("is_pending", (Integer) 0);
                }
                contentResolver.update(oooOO0O, contentValues, null, null);
            }
            throw th;
        }
    }

    public static void OooO0OO(@NonNull File file, @NonNull OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    fileInputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void OooO0Oo(@NonNull ContentResolver contentResolver, @NonNull Uri uri, @NonNull File file) throws IOException {
        OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
        try {
            if (outputStreamOpenOutputStream != null) {
                OooO0OO(file, outputStreamOpenOutputStream);
                outputStreamOpenOutputStream.close();
            } else {
                throw new FileNotFoundException(uri + " cannot be resolved.");
            }
        } catch (Throwable th) {
            if (outputStreamOpenOutputStream != null) {
                try {
                    outputStreamOpenOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
