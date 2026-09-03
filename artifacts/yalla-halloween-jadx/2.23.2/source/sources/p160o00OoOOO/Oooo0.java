package p160o00OoOOO;

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
import p144o00Oo.o00oOoo;
import p154o00Oo0oo.o000OOo;
import p154o00Oo0oo.o0OO00O;
import p154o00Oo0oo.oo0o0Oo;
import p156o00OoO00.OooO0o;
import p174o00OooOo.o00O0OOO;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements o000OOo<Bitmap> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o0OO00O<Integer> f38045OooO0O0 = o0OO00O.OooO00o(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0OO00O<Bitmap.CompressFormat> f38046OooO0OO = new o0OO00O<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, o0OO00O.f37828OooO0o0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final OooO0o f38047OooO00o;

    public Oooo0(@NonNull OooO0o oooO0o) {
        this.f38047OooO00o = oooO0o;
    }

    @Override // p154o00Oo0oo.o000OOo
    @NonNull
    public final EncodeStrategy OooO00o(@NonNull oo0o0Oo oo0o0oo) {
        return EncodeStrategy.TRANSFORMED;
    }

    @Override // p154o00Oo0oo.o0ooOOo
    public final boolean OooO0O0(@NonNull Object obj, @NonNull File file, @NonNull oo0o0Oo oo0o0oo) throws Throwable {
        FileOutputStream fileOutputStream;
        boolean z;
        Bitmap bitmap = (Bitmap) ((o00oOoo) obj).get();
        o0OO00O<Bitmap.CompressFormat> o0oo00o2 = f38046OooO0OO;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) oo0o0oo.OooO0OO(o0oo00o2);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = o00O0OOO.f38347OooO0O0;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) oo0o0oo.OooO0OO(f38045OooO0O0)).intValue();
        OutputStream oooO0OO = null;
        try {
            try {
                try {
                    fileOutputStream = new FileOutputStream(file);
                    OooO0o oooO0o = this.f38047OooO00o;
                    if (oooO0o != null) {
                        try {
                            oooO0OO = new OooO0OO(fileOutputStream, oooO0o);
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
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + o00OO0O0.OooO0OO(bitmap) + " in " + o00O0OOO.OooO00o(jElapsedRealtimeNanos) + ", options format: " + oo0o0oo.OooO0OO(o0oo00o2) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            return z;
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
