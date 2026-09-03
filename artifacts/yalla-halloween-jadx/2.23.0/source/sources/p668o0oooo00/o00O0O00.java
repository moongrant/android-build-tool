package p668o0oooo00;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O0O0 f60339OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final File f60340OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f60341OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f60342OooO0Oo;

    public o00O0O00(o00O0O0 o00o0o0, File file) throws IOException {
        this.f60340OooO0O0 = file;
        this.f60339OooO00o = o00o0o0;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize = 1;
        BitmapFactory.decodeStream(o00o0o0.open(), null, options);
        this.f60341OooO0OO = options.outWidth;
        this.f60342OooO0Oo = options.outHeight;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x015d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0163 A[EDGE_INSN: B:106:0x0163->B:107:0x0168 BREAK  A[LOOP:1: B:87:0x0129->B:104:0x0157]] */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:74:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:79:0x010e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0110  */
    /* JADX WARN: Code duplicated, block: B:81:0x0112  */
    /* JADX WARN: Code duplicated, block: B:84:0x011e A[ADDED_TO_REGION] */
    public final File OooO00o() throws IOException {
        int iCeil;
        int i;
        int i2;
        int iOooO0O0;
        boolean z;
        int iOooO0O1;
        int i3;
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i4 = this.f60341OooO0OO;
        if (i4 % 2 == 1) {
            i4++;
        }
        this.f60341OooO0OO = i4;
        int i5 = this.f60342OooO0Oo;
        if (i5 % 2 == 1) {
            i5++;
        }
        this.f60342OooO0Oo = i5;
        int iMax = Math.max(i4, i5);
        float fMin = Math.min(this.f60341OooO0OO, this.f60342OooO0Oo) / iMax;
        if (fMin > 1.0f || fMin <= 0.5625d) {
            double d = fMin;
            if (d > 0.5625d || d <= 0.5d) {
                iCeil = (int) Math.ceil(((double) iMax) / (1280.0d / d));
            } else {
                iCeil = iMax / 1280;
                if (iCeil == 0) {
                    iCeil = 1;
                }
            }
        } else if (iMax < 1664) {
            iCeil = 1;
        } else if (iMax < 4990) {
            iCeil = 2;
        } else if (iMax <= 4990 || iMax >= 10240) {
            iCeil = iMax / 1280;
            if (iCeil == 0) {
                iCeil = 1;
            }
        } else {
            iCeil = 4;
        }
        options.inSampleSize = iCeil;
        o00O0O0 o00o0o0 = this.f60339OooO00o;
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(o00o0o0.open(), null, options);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (o00O0.SINGLE.OooO00o(o00o0o0.open())) {
            byte[] bArrOooO0OO = o00O0.OooO0OO(o00o0o0.open());
            int i6 = 0;
            if (bArrOooO0OO != null) {
                int i7 = 0;
                while (true) {
                    if (i7 + 3 < bArrOooO0OO.length) {
                        int i8 = i7 + 1;
                        if ((bArrOooO0OO[i7] & UByte.MAX_VALUE) == 255) {
                            int i9 = bArrOooO0OO[i8] & UByte.MAX_VALUE;
                            if (i9 != 255) {
                                i8++;
                                if (i9 != 216 && i9 != 1) {
                                    if (i9 != 217 && i9 != 218) {
                                        int iOooO0O2 = o00O0.OooO0O0(bArrOooO0OO, i8, 2, false);
                                        if (iOooO0O2 < 2 || (i3 = i8 + iOooO0O2) > bArrOooO0OO.length) {
                                            Log.e("Luban", "Invalid length");
                                        } else if (i9 == 225 && iOooO0O2 >= 8 && o00O0.OooO0O0(bArrOooO0OO, i8 + 2, 4, false) == 1165519206 && o00O0.OooO0O0(bArrOooO0OO, i8 + 6, 2, false) == 0) {
                                            i2 = i8 + 8;
                                            i = iOooO0O2 - 8;
                                            if (i <= 8) {
                                                Log.e("Luban", "Orientation not found");
                                                break;
                                            }
                                            iOooO0O0 = o00O0.OooO0O0(bArrOooO0OO, i2, 4, false);
                                            if (iOooO0O0 != 1229531648 || iOooO0O0 == 1296891946) {
                                                if (iOooO0O0 == 1229531648) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                iOooO0O1 = o00O0.OooO0O0(bArrOooO0OO, i2 + 4, 4, z) + 2;
                                                if (iOooO0O1 >= 10 || iOooO0O1 > i) {
                                                    Log.e("Luban", "Invalid offset");
                                                } else {
                                                    int i10 = i2 + iOooO0O1;
                                                    int i11 = i - iOooO0O1;
                                                    int iOooO0O3 = o00O0.OooO0O0(bArrOooO0OO, i10 - 2, 2, z);
                                                    while (true) {
                                                        int i12 = iOooO0O3 - 1;
                                                        if (iOooO0O3 <= 0 || i11 < 12) {
                                                            Log.e("Luban", "Orientation not found");
                                                            break;
                                                        }
                                                        if (o00O0.OooO0O0(bArrOooO0OO, i10, 2, z) == 274) {
                                                            int iOooO0O4 = o00O0.OooO0O0(bArrOooO0OO, i10 + 8, 2, z);
                                                            if (iOooO0O4 == 1) {
                                                                break;
                                                            }
                                                            if (iOooO0O4 == 3) {
                                                                i6 = 180;
                                                                break;
                                                            }
                                                            if (iOooO0O4 == 6) {
                                                                i6 = 90;
                                                                break;
                                                            }
                                                            if (iOooO0O4 == 8) {
                                                                i6 = 270;
                                                                break;
                                                            }
                                                            Log.e("Luban", "Unsupported orientation");
                                                            break;
                                                        }
                                                        i10 += 12;
                                                        i11 -= 12;
                                                        iOooO0O3 = i12;
                                                    }
                                                }
                                            } else {
                                                Log.e("Luban", "Invalid byte order");
                                            }
                                        } else {
                                            i7 = i3;
                                        }
                                    }
                                }
                            }
                            i7 = i8;
                        }
                        i7 = i8;
                    }
                    i = 0;
                    i2 = i7;
                    if (i <= 8) {
                        Log.e("Luban", "Orientation not found");
                        break;
                    }
                    iOooO0O0 = o00O0.OooO0O0(bArrOooO0OO, i2, 4, false);
                    if (iOooO0O0 != 1229531648) {
                        if (iOooO0O0 == 1229531648) {
                            z = true;
                        } else {
                            z = false;
                        }
                        iOooO0O1 = o00O0.OooO0O0(bArrOooO0OO, i2 + 4, 4, z) + 2;
                        if (iOooO0O1 >= 10) {
                            Log.e("Luban", "Invalid offset");
                        } else {
                            Log.e("Luban", "Invalid offset");
                        }
                    } else {
                        if (iOooO0O0 == 1229531648) {
                            z = true;
                        } else {
                            z = false;
                        }
                        iOooO0O1 = o00O0.OooO0O0(bArrOooO0OO, i2 + 4, 4, z) + 2;
                        if (iOooO0O1 >= 10) {
                            Log.e("Luban", "Invalid offset");
                        } else {
                            Log.e("Luban", "Invalid offset");
                        }
                    }
                }
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i6);
            bitmapDecodeStream = Bitmap.createBitmap(bitmapDecodeStream, 0, 0, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight(), matrix, true);
        }
        bitmapDecodeStream.compress(Bitmap.CompressFormat.JPEG, 60, byteArrayOutputStream);
        bitmapDecodeStream.recycle();
        File file = this.f60340OooO0O0;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.flush();
        fileOutputStream.close();
        byteArrayOutputStream.close();
        return file;
    }
}
