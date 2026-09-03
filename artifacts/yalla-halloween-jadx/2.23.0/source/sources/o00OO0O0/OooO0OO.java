package o00OO0O0;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.EncodeStrategy;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o000000O;
import p126o00O0oOo.o00000O;
import p129o00O0ooo.o0000;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements o00000O<Bitmap> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o000000O<Integer> f37202OooO0O0 = o000000O.OooO00o(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o000000O<Bitmap.CompressFormat> f37203OooO0OO = new o000000O<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, o000000O.f36726OooO0o0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final o0000 f37204OooO00o;

    public OooO0OO(@NonNull o0000 o0000Var) {
        this.f37204OooO00o = o0000Var;
    }

    @Override // p126o00O0oOo.o0O0O00
    public final boolean OooO00o(@NonNull Object obj, @NonNull File file, @NonNull o00000 o00000Var) throws Throwable {
        FileOutputStream fileOutputStream;
        boolean z;
        Bitmap bitmap = (Bitmap) ((p127o00O0oo.o0000) obj).get();
        o000000O<Bitmap.CompressFormat> o000000o2 = f37203OooO0OO;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) o00000Var.OooO0OO(o000000o2);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = p532o0o0Oo.o00000O.f54564OooO0O0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) o00000Var.OooO0OO(f37202OooO0O0)).intValue();
        OutputStream oooO0OO = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    o0000 o0000Var = this.f37204OooO00o;
                    if (o0000Var != null) {
                        try {
                            oooO0OO = new com.bumptech.glide.load.data.OooO0OO(fileOutputStream, o0000Var);
                        } catch (IOException e) {
                            e = e;
                            oooO0OO = fileOutputStream;
                            if (Log.isLoggable("BitmapEncoder", 3)) {
                                Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                            }
                            if (oooO0OO != null) {
                                try {
                                    oooO0OO.close();
                                } catch (IOException unused) {
                                }
                            }
                            z = false;
                        } catch (Throwable th) {
                            th = th;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        oooO0OO = fileOutputStream;
                    }
                    bitmap.compress(compressFormat, iIntValue, oooO0OO);
                    oooO0OO.close();
                    try {
                        oooO0OO.close();
                    } catch (IOException unused3) {
                    }
                    z = true;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (IOException e2) {
                e = e2;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + o0000oo.OooO0OO(bitmap) + " in " + p532o0o0Oo.o00000O.OooO00o(jElapsedRealtimeNanos) + ", options format: " + o00000Var.OooO0OO(o000000o2) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            return z;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // p126o00O0oOo.o00000O
    @NonNull
    public final EncodeStrategy OooO0O0(@NonNull o00000 o00000Var) {
        return EncodeStrategy.TRANSFORMED;
    }
}
