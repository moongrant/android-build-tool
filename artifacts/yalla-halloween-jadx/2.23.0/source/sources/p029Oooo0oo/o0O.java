package p029Oooo0oo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageReader;
import android.net.Uri;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.WorkerThread;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.ImageProcessingUtil;
import androidx.camera.core.OooOO0O;
import androidx.camera.core.OooOOO0;
import androidx.camera.core.OooOo00;
import androidx.camera.core.impl.o00Oo0;
import androidx.exifinterface.media.ExifInterface;
import com.google.auto.value.AutoValue;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import kotlin.UByte;
import org.conscrypt.PSKKeyManager;
import p028Oooo0oO.o000O0;
import p028Oooo0oO.o00OO0O0;
import p031OoooO0.o00O0O;
import p031OoooO0.o0OO00O;
import p033OoooO0O.o0O0O00;
import p037OoooOo0.o000O00O;
import p037OoooOo0.o000O0o;
import p099o000oOoO.o00000;
import p099o000oOoO.o00000O;
import p099o000oOoO.o00000OO;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 21)
public final class o0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o0O0O0o0 f1219OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final Executor f1220OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public OooO00o f1221OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public oo0OOoo f1222OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0O00oO0 f1223OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o0O0O0Oo f1224OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o0O00 f1225OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o0O0oo0o f1226OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o0O0OO0 f1227OooO0oo;

    @AutoValue
    public static abstract class OooO00o {
        public abstract o000O0o<OooO0O0> OooO00o();

        public abstract int OooO0O0();

        public abstract int OooO0OO();
    }

    @AutoValue
    public static abstract class OooO0O0 {
        @NonNull
        public abstract OooOOO0 OooO00o();

        @NonNull
        public abstract o0OO000 OooO0O0();
    }

    public o0O(@NonNull Executor executor) {
        if (o00000.OooO00o(o00000OO.class) != null) {
            this.f1220OooO00o = new o0O0O00(executor);
        } else {
            this.f1220OooO00o = executor;
        }
    }

    public final o000O00O<byte[]> OooO00o(o000O00O<byte[]> o000o00o2, int i) throws ImageCaptureException {
        o000OO.OooOOO0.OooO0o(null, o000o00o2.OooO0o0() == 256);
        this.f1226OooO0oO.getClass();
        Rect rectOooO0O0 = o000o00o2.OooO0O0();
        byte[] bArrOooO0OO = o000o00o2.OooO0OO();
        try {
            Bitmap bitmapDecodeRegion = BitmapRegionDecoder.newInstance(bArrOooO0OO, 0, bArrOooO0OO.length, false).decodeRegion(rectOooO0O0, new BitmapFactory.Options());
            o00O0O o00o0oOooO0Oo = o000o00o2.OooO0Oo();
            Objects.requireNonNull(o00o0oOooO0Oo);
            Rect rect = new Rect(0, 0, bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight());
            int iOooO0o = o000o00o2.OooO0o();
            Matrix matrixOooO0oO = o000o00o2.OooO0oO();
            RectF rectF = o0OO00O.f1413OooO00o;
            Matrix matrix = new Matrix(matrixOooO0oO);
            matrix.postTranslate(-rectOooO0O0.left, -rectOooO0O0.top);
            p037OoooOo0.o00000 o00000Var = new p037OoooOo0.o00000(bitmapDecodeRegion, o00o0oOooO0Oo, 42, new Size(bitmapDecodeRegion.getWidth(), bitmapDecodeRegion.getHeight()), rect, iOooO0o, matrix, o000o00o2.OooO00o());
            o0O00 o0o01 = this.f1225OooO0o0;
            o0 o0Var = new o0(o00000Var, i);
            o0o01.getClass();
            o000O00O<Bitmap> o000o00oOooO0O0 = o0Var.OooO0O0();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            o000o00oOooO0O0.OooO0OO().compress(Bitmap.CompressFormat.JPEG, o0Var.OooO00o(), byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            o00O0O o00o0oOooO0Oo2 = o000o00oOooO0O0.OooO0Oo();
            Objects.requireNonNull(o00o0oOooO0Oo2);
            return o000O00O.OooOO0(byteArray, o00o0oOooO0Oo2, o000o00oOooO0O0.OooO0oo(), o000o00oOooO0O0.OooO0O0(), o000o00oOooO0O0.OooO0o(), o000o00oOooO0O0.OooO0oO(), o000o00oOooO0O0.OooO00o());
        } catch (IOException e) {
            throw new ImageCaptureException(e, "Failed to decode JPEG.");
        }
    }

    @NonNull
    @WorkerThread
    public final OooOOO0 OooO0O0(@NonNull OooO0O0 oooO0O0) throws ImageCaptureException {
        o0OO000 o0oo000OooO0O0 = oooO0O0.OooO0O0();
        o000O00O o000o00oOooO = (o000O00O) this.f1222OooO0OO.OooO00o(oooO0O0);
        if (o000o00oOooO.OooO0o0() == 35 && this.f1221OooO0O0.OooO0OO() == 256) {
            o000O00O o000o00o2 = (o000O00O) this.f1223OooO0Oo.OooO00o(new o0O000(o000o00oOooO, o0oo000OooO0O0.f1288OooO0Oo));
            this.f1219OooO.getClass();
            OooOo00 oooOo00 = new OooOo00(new p028Oooo0oO.o000O00O(ImageReader.newInstance(o000o00o2.OooO0oo().getWidth(), o000o00o2.OooO0oo().getHeight(), PSKKeyManager.MAX_KEY_LENGTH_BYTES, 2)));
            OooOOO0 oooOOO0OooO00o = ImageProcessingUtil.OooO00o(oooOo00, (byte[]) o000o00o2.OooO0OO());
            oooOo00.OooO00o();
            Objects.requireNonNull(oooOOO0OooO00o);
            o00O0O o00o0oOooO0Oo = o000o00o2.OooO0Oo();
            Objects.requireNonNull(o00o0oOooO0Oo);
            Rect rectOooO0O0 = o000o00o2.OooO0O0();
            int iOooO0o = o000o00o2.OooO0o();
            Matrix matrixOooO0oO = o000o00o2.OooO0oO();
            o00Oo0 o00oo0OooO00o = o000o00o2.OooO00o();
            OooOO0O oooOO0O = (OooOO0O) oooOOO0OooO00o;
            o000o00oOooO = o000O00O.OooO(oooOOO0OooO00o, o00o0oOooO0Oo, new Size(oooOO0O.getWidth(), oooOO0O.getHeight()), rectOooO0O0, iOooO0o, matrixOooO0oO, o00oo0OooO00o);
        }
        this.f1227OooO0oo.getClass();
        OooOOO0 oooOOO0 = (OooOOO0) o000o00oOooO.OooO0OO();
        o00OO0O0 o00oo0o1 = new o00OO0O0(oooOOO0, o000o00oOooO.OooO0oo(), new o000O0(oooOOO0.o00000OO().OooO0O0(), oooOOO0.o00000OO().OooO0OO(), o000o00oOooO.OooO0o(), o000o00oOooO.OooO0oO()));
        o00oo0o1.OooO0OO(o000o00oOooO.OooO0O0());
        return o00oo0o1;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0124 A[Catch: all -> 0x01d9, TryCatch #3 {all -> 0x01d9, blocks: (B:22:0x00b8, B:59:0x0124, B:60:0x014d, B:30:0x00c9, B:32:0x00ce, B:35:0x00d4, B:37:0x00e5, B:39:0x00ed, B:42:0x00f3, B:44:0x00f7, B:46:0x00ff, B:49:0x0104, B:51:0x0108, B:53:0x010b, B:54:0x0118, B:55:0x011b, B:56:0x011e), top: B:115:0x00b8, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x014d A[Catch: all -> 0x01d9, TRY_LEAVE, TryCatch #3 {all -> 0x01d9, blocks: (B:22:0x00b8, B:59:0x0124, B:60:0x014d, B:30:0x00c9, B:32:0x00ce, B:35:0x00d4, B:37:0x00e5, B:39:0x00ed, B:42:0x00f3, B:44:0x00f7, B:46:0x00ff, B:49:0x0104, B:51:0x0108, B:53:0x010b, B:54:0x0118, B:55:0x011b, B:56:0x011e), top: B:115:0x00b8, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0192  */
    /* JADX WARN: Code duplicated, block: B:77:0x0195 A[Catch: all -> 0x01c2, IOException -> 0x01c4, TryCatch #2 {IOException -> 0x01c4, blocks: (B:68:0x0184, B:70:0x0188, B:72:0x018c, B:77:0x0195, B:78:0x019a, B:83:0x01a3, B:84:0x01aa, B:89:0x01b2), top: B:113:0x0184, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x019a A[Catch: all -> 0x01c2, IOException -> 0x01c4, TryCatch #2 {IOException -> 0x01c4, blocks: (B:68:0x0184, B:70:0x0188, B:72:0x018c, B:77:0x0195, B:78:0x019a, B:83:0x01a3, B:84:0x01aa, B:89:0x01b2), top: B:113:0x0184, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x019e  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a3 A[Catch: all -> 0x01c2, IOException -> 0x01c4, TryCatch #2 {IOException -> 0x01c4, blocks: (B:68:0x0184, B:70:0x0188, B:72:0x018c, B:77:0x0195, B:78:0x019a, B:83:0x01a3, B:84:0x01aa, B:89:0x01b2), top: B:113:0x0184, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01aa A[Catch: all -> 0x01c2, IOException -> 0x01c4, TryCatch #2 {IOException -> 0x01c4, blocks: (B:68:0x0184, B:70:0x0188, B:72:0x018c, B:77:0x0195, B:78:0x019a, B:83:0x01a3, B:84:0x01aa, B:89:0x01b2), top: B:113:0x0184, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:87:0x01af  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b2 A[Catch: all -> 0x01c2, IOException -> 0x01c4, TRY_LEAVE, TryCatch #2 {IOException -> 0x01c4, blocks: (B:68:0x0184, B:70:0x0188, B:72:0x018c, B:77:0x0195, B:78:0x019a, B:83:0x01a3, B:84:0x01aa, B:89:0x01b2), top: B:113:0x0184, outer: #0 }] */
    @NonNull
    @WorkerThread
    public final ImageCapture.OooOOO0 OooO0OO(@NonNull OooO0O0 oooO0O0) throws Throwable {
        File fileCreateTempFile;
        byte b;
        Range rangeCreate;
        int iOooO0o;
        o00O0O o00o0o2;
        boolean z;
        OutputStream outputStream;
        boolean z2;
        File file;
        boolean z3 = true;
        o000OO.OooOOO0.OooO0O0(this.f1221OooO0O0.OooO0OO() == 256, String.format("On-disk capture only support JPEG output format. Output format: %s", Integer.valueOf(this.f1221OooO0O0.OooO0OO())));
        o0OO000 o0oo000OooO0O0 = oooO0O0.OooO0O0();
        o000O00O<byte[]> o000o00oOooO00o = (o000O00O) this.f1223OooO0Oo.OooO00o(new o0O000((o000O00O) this.f1222OooO0OO.OooO00o(oooO0O0), o0oo000OooO0O0.f1288OooO0Oo));
        if (o0OO00O.OooO0O0(o000o00oOooO00o.OooO0O0(), o000o00oOooO00o.OooO0oo())) {
            o000o00oOooO00o = OooO00o(o000o00oOooO00o, o0oo000OooO0O0.f1288OooO0Oo);
        }
        o0O0O0Oo o0o0o0oo = this.f1224OooO0o;
        ImageCapture.OooOO0O oooOO0O = o0oo000OooO0O0.f1285OooO00o;
        Objects.requireNonNull(oooOO0O);
        o0O000O o0o000o = new o0O000O(o000o00oOooO00o, oooOO0O);
        o0o0o0oo.getClass();
        o000O00O<byte[]> o000o00oOooO0O0 = o0o000o.OooO0O0();
        ImageCapture.OooOO0O oooOO0OOooO00o = o0o000o.OooO00o();
        try {
            File file2 = oooOO0OOooO00o.f3425OooO00o;
            if (file2 != null) {
                String parent = file2.getParent();
                StringBuilder sb = new StringBuilder("CameraX");
                sb.append(UUID.randomUUID().toString());
                String name = file2.getName();
                int iLastIndexOf = name.lastIndexOf(46);
                sb.append(iLastIndexOf >= 0 ? name.substring(iLastIndexOf) : "");
                fileCreateTempFile = new File(parent, sb.toString());
            } else {
                fileCreateTempFile = File.createTempFile("CameraX", ".tmp");
            }
            byte[] bArrOooO0OO = o000o00oOooO0O0.OooO0OO();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    Uri uriOooO00o = null;
                    try {
                        try {
                            try {
                                if (o00000.OooO00o(o00000O.class) != null) {
                                    int i = 2;
                                    while (true) {
                                        if (i + 4 > bArrOooO0OO.length || (b = bArrOooO0OO[i]) != -1) {
                                            break;
                                        }
                                        int i2 = i + 2;
                                        int i3 = ((bArrOooO0OO[i2] & UByte.MAX_VALUE) << 8) | (bArrOooO0OO[i + 3] & UByte.MAX_VALUE);
                                        if (b == -1 && bArrOooO0OO[i + 1] == -38) {
                                            while (true) {
                                                int i4 = i2 + 2;
                                                if (i4 <= bArrOooO0OO.length) {
                                                    if (bArrOooO0OO[i2] == -1 && bArrOooO0OO[i2 + 1] == -39) {
                                                        int length = bArrOooO0OO.length - 1;
                                                        while (true) {
                                                            if (length > i2) {
                                                                if (bArrOooO0OO[length] == -1) {
                                                                    int i5 = length - 1;
                                                                    if (i5 > i4) {
                                                                        rangeCreate = Range.create(Integer.valueOf(i4), Integer.valueOf(i5));
                                                                        break;
                                                                    }
                                                                } else {
                                                                    length--;
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        i2++;
                                                    }
                                                }
                                            }
                                        } else {
                                            i += i3 + 2;
                                        }
                                    }
                                    if (rangeCreate != null) {
                                        fileOutputStream.write(bArrOooO0OO, 0, ((Integer) rangeCreate.getLower()).intValue());
                                        fileOutputStream.write(bArrOooO0OO, ((Integer) rangeCreate.getUpper()).intValue() + 1, (bArrOooO0OO.length - ((Integer) rangeCreate.getUpper()).intValue()) - 1);
                                    } else {
                                        fileOutputStream.write(bArrOooO0OO);
                                    }
                                    fileOutputStream.close();
                                    o00O0O o00o0oOooO0Oo = o000o00oOooO0O0.OooO0Oo();
                                    Objects.requireNonNull(o00o0oOooO0Oo);
                                    iOooO0o = o000o00oOooO0O0.OooO0o();
                                    o00O0O.OooO00o oooO00o = o00O0O.f1399OooO0O0;
                                    o00o0o2 = new o00O0O(new ExifInterface(fileCreateTempFile.toString()));
                                    o00o0oOooO0Oo.OooO00o(o00o0o2);
                                    if (o00o0o2.OooO0O0() == 0 && iOooO0o != 0) {
                                        o00o0o2.OooO0OO(iOooO0o);
                                    }
                                    oooOO0OOooO00o.f3429OooO0o.getClass();
                                    o00o0o2.OooO0Oo();
                                    if (oooOO0OOooO00o.f3427OooO0OO != null || oooOO0OOooO00o.f3426OooO0O0 == null || oooOO0OOooO00o.f3428OooO0Oo == null) {
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z) {
                                        uriOooO00o = o0O0O0Oo.OooO0O0(fileCreateTempFile, oooOO0OOooO00o);
                                    } else {
                                        outputStream = oooOO0OOooO00o.f3430OooO0o0;
                                        if (outputStream != null) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            Objects.requireNonNull(outputStream);
                                            o0O0O0Oo.OooO0OO(fileCreateTempFile, outputStream);
                                        } else {
                                            file = oooOO0OOooO00o.f3425OooO00o;
                                            if (file != null) {
                                                z3 = false;
                                            }
                                            if (z3) {
                                                Objects.requireNonNull(file);
                                                uriOooO00o = o0O0O0Oo.OooO00o(fileCreateTempFile, file);
                                            }
                                        }
                                    }
                                    fileCreateTempFile.delete();
                                    return new ImageCapture.OooOOO0(uriOooO00o);
                                }
                                if (oooOO0OOooO00o.f3427OooO0OO != null) {
                                    z = false;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    uriOooO00o = o0O0O0Oo.OooO0O0(fileCreateTempFile, oooOO0OOooO00o);
                                } else {
                                    outputStream = oooOO0OOooO00o.f3430OooO0o0;
                                    if (outputStream != null) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        Objects.requireNonNull(outputStream);
                                        o0O0O0Oo.OooO0OO(fileCreateTempFile, outputStream);
                                    } else {
                                        file = oooOO0OOooO00o.f3425OooO00o;
                                        if (file != null) {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            Objects.requireNonNull(file);
                                            uriOooO00o = o0O0O0Oo.OooO00o(fileCreateTempFile, file);
                                        }
                                    }
                                }
                                fileCreateTempFile.delete();
                                return new ImageCapture.OooOOO0(uriOooO00o);
                            } catch (Throwable th) {
                                fileCreateTempFile.delete();
                                throw th;
                            }
                        } catch (IOException unused) {
                            throw new ImageCaptureException(null, "Failed to write to OutputStream.");
                        }
                        o00O0O.OooO00o oooO00o2 = o00O0O.f1399OooO0O0;
                        o00o0o2 = new o00O0O(new ExifInterface(fileCreateTempFile.toString()));
                        o00o0oOooO0Oo.OooO00o(o00o0o2);
                        if (o00o0o2.OooO0O0() == 0) {
                            o00o0o2.OooO0OO(iOooO0o);
                        }
                        oooOO0OOooO00o.f3429OooO0o.getClass();
                        o00o0o2.OooO0Oo();
                    } catch (IOException e) {
                        throw new ImageCaptureException(e, "Failed to update Exif data");
                    }
                    rangeCreate = null;
                    if (rangeCreate != null) {
                        fileOutputStream.write(bArrOooO0OO, 0, ((Integer) rangeCreate.getLower()).intValue());
                        fileOutputStream.write(bArrOooO0OO, ((Integer) rangeCreate.getUpper()).intValue() + 1, (bArrOooO0OO.length - ((Integer) rangeCreate.getUpper()).intValue()) - 1);
                    } else {
                        fileOutputStream.write(bArrOooO0OO);
                    }
                    fileOutputStream.close();
                    o00O0O o00o0oOooO0Oo2 = o000o00oOooO0O0.OooO0Oo();
                    Objects.requireNonNull(o00o0oOooO0Oo2);
                    iOooO0o = o000o00oOooO0O0.OooO0o();
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException e2) {
                throw new ImageCaptureException(e2, "Failed to write to temp file");
            }
        } catch (IOException e3) {
            throw new ImageCaptureException(e3, "Failed to create temp file.");
        }
    }
}
