package p695oO000oOO;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Log;
import com.uc.crashsdk.export.LogType;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.UByte;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o0 f52724OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public File f52725OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f52726OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f52727OooO0Oo;

    public o0O0o(o0 o0Var, File file) throws IOException {
        this.f52725OooO0O0 = file;
        this.f52724OooO00o = o0Var;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize = 1;
        BitmapFactory.decodeStream(o0Var.open(), null, options);
        this.f52726OooO0OO = options.outWidth;
        this.f52727OooO0Oo = options.outHeight;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0163  */
    /* JADX WARN: Code duplicated, block: B:106:0x0169 A[EDGE_INSN: B:106:0x0169->B:107:0x016e BREAK  A[LOOP:1: B:87:0x012f->B:104:0x015d]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:74:0x0100  */
    /* JADX WARN: Code duplicated, block: B:79:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:80:0x0116  */
    /* JADX WARN: Code duplicated, block: B:81:0x0118  */
    /* JADX WARN: Code duplicated, block: B:84:0x0124 A[ADDED_TO_REGION] */
    public final File OooO00o() throws IOException {
        int iCeil;
        int i;
        int i2;
        int iOooO0Oo;
        boolean z;
        int iOooO0Oo2;
        int i3;
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i4 = this.f52726OooO0OO;
        if (i4 % 2 == 1) {
            i4++;
        }
        this.f52726OooO0OO = i4;
        int i5 = this.f52727OooO0Oo;
        if (i5 % 2 == 1) {
            i5++;
        }
        this.f52727OooO0Oo = i5;
        int iMax = Math.max(i4, i5);
        float fMin = Math.min(this.f52726OooO0OO, this.f52727OooO0Oo) / iMax;
        if (fMin > 1.0f || fMin <= 0.5625d) {
            double d = fMin;
            if (d > 0.5625d || d <= 0.5d) {
                iCeil = (int) Math.ceil(((double) iMax) / (1280.0d / d));
            } else {
                iCeil = iMax / LogType.UNEXP_ANR;
                if (iCeil == 0) {
                    iCeil = 1;
                }
            }
        } else if (iMax < 1664) {
            iCeil = 1;
        } else if (iMax < 4990) {
            iCeil = 2;
        } else if (iMax <= 4990 || iMax >= 10240) {
            iCeil = iMax / LogType.UNEXP_ANR;
            if (iCeil == 0) {
                iCeil = 1;
            }
        } else {
            iCeil = 4;
        }
        options.inSampleSize = iCeil;
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(this.f52724OooO00o.open(), null, options);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        o0oOOo o0oooo2 = o0oOOo.SINGLE;
        if (o0oooo2.OooO00o(this.f52724OooO00o.open())) {
            byte[] bArrOooO0o0 = o0oooo2.OooO0o0(this.f52724OooO00o.open());
            int i6 = 0;
            if (bArrOooO0o0 != null) {
                int i7 = 0;
                while (true) {
                    if (i7 + 3 < bArrOooO0o0.length) {
                        int i8 = i7 + 1;
                        if ((bArrOooO0o0[i7] & UByte.MAX_VALUE) == 255) {
                            int i9 = bArrOooO0o0[i8] & UByte.MAX_VALUE;
                            if (i9 != 255) {
                                i8++;
                                if (i9 != 216 && i9 != 1) {
                                    if (i9 != 217 && i9 != 218) {
                                        int iOooO0Oo3 = o0oooo2.OooO0Oo(bArrOooO0o0, i8, 2, false);
                                        if (iOooO0Oo3 < 2 || (i3 = i8 + iOooO0Oo3) > bArrOooO0o0.length) {
                                            Log.e("Luban", "Invalid length");
                                        } else if (i9 == 225 && iOooO0Oo3 >= 8 && o0oooo2.OooO0Oo(bArrOooO0o0, i8 + 2, 4, false) == 1165519206 && o0oooo2.OooO0Oo(bArrOooO0o0, i8 + 6, 2, false) == 0) {
                                            i = i8 + 8;
                                            i2 = iOooO0Oo3 - 8;
                                            if (i2 <= 8) {
                                                Log.e("Luban", "Orientation not found");
                                                break;
                                            }
                                            iOooO0Oo = o0oooo2.OooO0Oo(bArrOooO0o0, i, 4, false);
                                            if (iOooO0Oo != 1229531648 || iOooO0Oo == 1296891946) {
                                                if (iOooO0Oo == 1229531648) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                iOooO0Oo2 = o0oooo2.OooO0Oo(bArrOooO0o0, i + 4, 4, z) + 2;
                                                if (iOooO0Oo2 >= 10 || iOooO0Oo2 > i2) {
                                                    Log.e("Luban", "Invalid offset");
                                                } else {
                                                    int i10 = i + iOooO0Oo2;
                                                    int i11 = i2 - iOooO0Oo2;
                                                    int iOooO0Oo4 = o0oooo2.OooO0Oo(bArrOooO0o0, i10 - 2, 2, z);
                                                    while (true) {
                                                        int i12 = iOooO0Oo4 - 1;
                                                        if (iOooO0Oo4 <= 0 || i11 < 12) {
                                                            Log.e("Luban", "Orientation not found");
                                                            break;
                                                        }
                                                        if (o0oooo2.OooO0Oo(bArrOooO0o0, i10, 2, z) == 274) {
                                                            int iOooO0Oo5 = o0oooo2.OooO0Oo(bArrOooO0o0, i10 + 8, 2, z);
                                                            if (iOooO0Oo5 == 1) {
                                                                break;
                                                            }
                                                            if (iOooO0Oo5 == 3) {
                                                                i6 = 180;
                                                                break;
                                                            }
                                                            if (iOooO0Oo5 == 6) {
                                                                i6 = 90;
                                                                break;
                                                            }
                                                            if (iOooO0Oo5 == 8) {
                                                                i6 = 270;
                                                                break;
                                                            }
                                                            Log.e("Luban", "Unsupported orientation");
                                                            break;
                                                        }
                                                        i10 += 12;
                                                        i11 -= 12;
                                                        iOooO0Oo4 = i12;
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
                    i = i7;
                    i2 = 0;
                    if (i2 <= 8) {
                        Log.e("Luban", "Orientation not found");
                        break;
                    }
                    iOooO0Oo = o0oooo2.OooO0Oo(bArrOooO0o0, i, 4, false);
                    if (iOooO0Oo != 1229531648) {
                        if (iOooO0Oo == 1229531648) {
                            z = true;
                        } else {
                            z = false;
                        }
                        iOooO0Oo2 = o0oooo2.OooO0Oo(bArrOooO0o0, i + 4, 4, z) + 2;
                        if (iOooO0Oo2 >= 10) {
                            Log.e("Luban", "Invalid offset");
                        } else {
                            Log.e("Luban", "Invalid offset");
                        }
                    } else {
                        if (iOooO0Oo == 1229531648) {
                            z = true;
                        } else {
                            z = false;
                        }
                        iOooO0Oo2 = o0oooo2.OooO0Oo(bArrOooO0o0, i + 4, 4, z) + 2;
                        if (iOooO0Oo2 >= 10) {
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
        FileOutputStream fileOutputStream = new FileOutputStream(this.f52725OooO0O0);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.flush();
        fileOutputStream.close();
        byteArrayOutputStream.close();
        return this.f52725OooO0O0;
    }
}
