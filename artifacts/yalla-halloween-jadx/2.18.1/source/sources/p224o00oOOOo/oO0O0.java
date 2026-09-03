package p224o00oOOOo;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.data.OooO0OO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p214o00oO0.o00OOOO0;
import p217o00oO00o.o00000;
import p217o00oO00o.o000000O;
import p217o00oO00o.o00000O;
import p219o00oO0O0.o0O00o0;
import p243o00oo00O.o0000O0O;
import p243o00oo00O.o000O000;

/* JADX INFO: loaded from: classes.dex */
public final class oO0O0 implements o00000O<Bitmap> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o000000O<Integer> f33801OooO0O0 = o000000O.OooO00o("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o000000O<Bitmap.CompressFormat> f33802OooO0OO = new o000000O<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, o000000O.f33632OooO0o0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o0O00o0 f33803OooO00o;

    public oO0O0(@NonNull o0O00o0 o0o00o1) {
        this.f33803OooO00o = o0o00o1;
    }

    @Override // p217o00oO00o.o00000O
    @NonNull
    public final EncodeStrategy OooO00o(@NonNull o00000 o00000Var) {
        return EncodeStrategy.TRANSFORMED;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0075 A[Catch: all -> 0x00c3, TRY_LEAVE, TryCatch #1 {, blocks: (B:10:0x0026, B:32:0x006b, B:34:0x006f, B:36:0x0075, B:40:0x00bf, B:41:0x00c2), top: B:46:0x0026 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:36:0x0075, please report this as an issue */
    @Override // p217o00oO00o.o000OOo
    public final boolean OooO0O0(@NonNull Object obj, @NonNull File file, @NonNull o00000 o00000Var) {
        FileOutputStream fileOutputStream;
        Bitmap bitmap = (Bitmap) ((o00OOOO0) obj).get();
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) o00000Var.OooO0OO(f33802OooO0OO);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = o0000O0O.f34164OooO0O0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) o00000Var.OooO0OO(f33801OooO0O0)).intValue();
        boolean z = false;
        OutputStream oooO0OO = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        oooO0OO = this.f33803OooO00o != null ? new OooO0OO(fileOutputStream, this.f33803OooO00o) : fileOutputStream;
                        bitmap.compress(compressFormat, iIntValue, oooO0OO);
                        oooO0OO.close();
                        z = true;
                    } catch (IOException e) {
                        e = e;
                        oooO0OO = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                            Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                        }
                        if (oooO0OO != null) {
                        }
                        if (Log.isLoggable("BitmapEncoder", 2)) {
                            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + o000O000.OooO0Oo(bitmap) + " in " + o0000O0O.OooO00o(jElapsedRealtimeNanos) + ", options format: " + o00000Var.OooO0OO(f33802OooO0OO) + ", hasAlpha: " + bitmap.hasAlpha());
                        }
                        return z;
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (IOException e2) {
                e = e2;
            }
            oooO0OO.close();
        } catch (IOException unused2) {
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + o000O000.OooO0Oo(bitmap) + " in " + o0000O0O.OooO00o(jElapsedRealtimeNanos) + ", options format: " + o00000Var.OooO0OO(f33802OooO0OO) + ", hasAlpha: " + bitmap.hasAlpha());
        }
        return z;
    }
}
