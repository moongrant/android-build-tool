package p458o0Ooo00o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.Objects;
import p016OooOoO0.OooOo00;
import p454o0Ooo0.OooO;
import p454o0Ooo0.OooOOO;
import p454o0Ooo0.OooOOO0;
import p552o0oOO0Oo.o000O0o;
import p583o0oOoOoo.m3;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0O00 extends AsyncTask<Void, Void, OooO00o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public WeakReference<Context> f40410OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Uri f40411OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Uri f40412OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f40413OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000O0o f40414OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f40415OooO0o0;

    public o0O0O00(@NonNull Context context, @NonNull Uri uri, @Nullable Uri uri2, int i, int i2, o000O0o o000o0o2) {
        this.f40410OooO00o = new WeakReference<>(context);
        this.f40411OooO0O0 = uri;
        this.f40412OooO0OO = uri2;
        this.f40413OooO0Oo = i;
        this.f40415OooO0o0 = i2;
        this.f40414OooO0o = o000o0o2;
    }

    public final void OooO00o(@NonNull Uri uri, @Nullable Uri uri2) throws Throwable {
        InputStream inputStreamOpenInputStream;
        Log.d("BitmapWorkerTask", "copyFile");
        Objects.requireNonNull(uri2, "Output Uri is null - cannot copy image");
        FileOutputStream fileOutputStream = null;
        try {
            inputStreamOpenInputStream = OooO0OO().getContentResolver().openInputStream(uri);
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(new File(uri2.getPath()));
                try {
                    if (inputStreamOpenInputStream == null) {
                        throw new NullPointerException("InputStream for given input Uri is null");
                    }
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamOpenInputStream.read(bArr);
                        if (i <= 0) {
                            OooO.OooO00o(fileOutputStream2);
                            OooO.OooO00o(inputStreamOpenInputStream);
                            this.f40411OooO0O0 = this.f40412OooO0OO;
                            return;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    OooO.OooO00o(fileOutputStream);
                    OooO.OooO00o(inputStreamOpenInputStream);
                    this.f40411OooO0O0 = this.f40412OooO0OO;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamOpenInputStream = null;
        }
    }

    public final void OooO0O0(@NonNull Uri uri, @Nullable Uri uri2) throws IOException, NullPointerException {
        Log.d("BitmapWorkerTask", "downloadFile");
        Objects.requireNonNull(uri2, "Output Uri is null - cannot download image");
        try {
            try {
                URL url = new URL(uri.toString());
                byte[] bArr = new byte[1024];
                BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
                OutputStream outputStreamOpenOutputStream = OooO0OO().getContentResolver().openOutputStream(uri2);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStreamOpenOutputStream);
                while (true) {
                    int i = bufferedInputStream.read(bArr);
                    if (i <= -1) {
                        break;
                    } else {
                        bufferedOutputStream.write(bArr, 0, i);
                    }
                }
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                bufferedInputStream.close();
                outputStreamOpenOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } finally {
            this.f40411OooO0O0 = this.f40412OooO0OO;
        }
    }

    public final Context OooO0OO() {
        return this.f40410OooO00o.get();
    }

    public final void OooO0Oo() throws IOException, NullPointerException {
        String scheme = this.f40411OooO0O0.getScheme();
        Log.d("BitmapWorkerTask", "Uri scheme: " + scheme);
        if ("http".equals(scheme) || "https".equals(scheme)) {
            try {
                OooO0O0(this.f40411OooO0O0, this.f40412OooO0OO);
                return;
            } catch (IOException | NullPointerException e) {
                Log.e("BitmapWorkerTask", "Downloading failed", e);
                throw e;
            }
        }
        if (!"content".equals(scheme)) {
            if (ShareInternalUtility.STAGING_PARAM.equals(scheme)) {
                return;
            }
            Log.e("BitmapWorkerTask", "Invalid Uri scheme " + scheme);
            throw new IllegalArgumentException(OooOo00.OooO0Oo("Invalid Uri scheme ", scheme));
        }
        String strOooO0OO = o000O000.OooO00o.OooO00o(OooO0OO(), "android.permission.READ_EXTERNAL_STORAGE") == 0 ? OooOOO0.OooO0OO(OooO0OO(), this.f40411OooO0O0) : null;
        if (!TextUtils.isEmpty(strOooO0OO) && new File(strOooO0OO).exists()) {
            this.f40411OooO0O0 = Build.VERSION.SDK_INT >= 29 ? this.f40411OooO0O0 : Uri.fromFile(new File(strOooO0OO));
            return;
        }
        try {
            OooO00o(this.f40411OooO0O0, this.f40412OooO0OO);
        } catch (IOException | NullPointerException e2) {
            Log.e("BitmapWorkerTask", "Copying failed", e2);
            throw e2;
        }
    }

    @Override // android.os.AsyncTask
    @NonNull
    public final OooO00o doInBackground(Void[] voidArr) {
        OooO00o oooO00o;
        int i;
        int i2;
        int iOooO00o;
        int i3;
        Bitmap bitmap;
        Bitmap bitmapCreateBitmap;
        if (this.f40411OooO0O0 == null) {
            return new OooO00o(new NullPointerException("Input Uri cannot be null"));
        }
        try {
            OooO0Oo();
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = OooO0OO().getContentResolver().openFileDescriptor(this.f40411OooO0O0, "r");
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ParcelFileDescriptor was null for given Uri: [");
                    sbOooO0o0.append(this.f40411OooO0O0);
                    sbOooO0o0.append("]");
                    return new OooO00o(new NullPointerException(sbOooO0o0.toString()));
                }
                FileDescriptor fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                int i4 = options.outWidth;
                int i5 = -1;
                if (i4 == -1 || (i = options.outHeight) == -1) {
                    StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Bounds for bitmap could not be retrieved from the Uri: [");
                    sbOooO0o1.append(this.f40411OooO0O0);
                    sbOooO0o1.append("]");
                    return new OooO00o(new IllegalArgumentException(sbOooO0o1.toString()));
                }
                int i6 = this.f40413OooO0Oo;
                int i7 = this.f40415OooO0o0;
                if (i > i7 || i4 > i6) {
                    int i8 = 1;
                    while (true) {
                        if (i / i8 <= i7 && i4 / i8 <= i6) {
                            break;
                        }
                        i8 *= 2;
                    }
                    i2 = i8;
                } else {
                    i2 = 1;
                }
                options.inSampleSize = i2;
                int i9 = 0;
                options.inJustDecodeBounds = false;
                Bitmap bitmapDecodeFileDescriptor = null;
                boolean z = false;
                while (!z) {
                    try {
                        bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                        z = true;
                    } catch (OutOfMemoryError e) {
                        Log.e("BitmapWorkerTask", "doInBackground: BitmapFactory.decodeFileDescriptor: ", e);
                        options.inSampleSize *= 2;
                    }
                }
                if (isCancelled()) {
                    StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0("Bitmap isCancelled the Uri: [");
                    sbOooO0o2.append(this.f40411OooO0O0);
                    sbOooO0o2.append("]");
                    return new OooO00o(new IllegalArgumentException(sbOooO0o2.toString()));
                }
                if (bitmapDecodeFileDescriptor == null) {
                    StringBuilder sbOooO0o3 = OooO00o.OooO00o.OooO0o0("Bitmap could not be decoded from the Uri: [");
                    sbOooO0o3.append(this.f40411OooO0O0);
                    sbOooO0o3.append("]");
                    return new OooO00o(new IllegalArgumentException(sbOooO0o3.toString()));
                }
                OooO.OooO00o(parcelFileDescriptorOpenFileDescriptor);
                Context contextOooO0OO = OooO0OO();
                Uri uri = this.f40411OooO0O0;
                try {
                    InputStream inputStreamOpenInputStream = contextOooO0OO.getContentResolver().openInputStream(uri);
                    if (inputStreamOpenInputStream == null) {
                        i3 = 0;
                    } else {
                        iOooO00o = new OooOOO(inputStreamOpenInputStream).OooO00o();
                        try {
                            OooO.OooO00o(inputStreamOpenInputStream);
                        } catch (IOException e2) {
                            e = e2;
                            StringBuilder sbOooO0o4 = OooO00o.OooO00o.OooO0o0("getExifOrientation: ");
                            sbOooO0o4.append(uri.toString());
                            Log.e("BitmapLoadUtils", sbOooO0o4.toString(), e);
                        }
                        i3 = iOooO00o;
                    }
                } catch (IOException e3) {
                    e = e3;
                    iOooO00o = 0;
                }
                switch (i3) {
                    case 3:
                    case 4:
                        i9 = 180;
                        break;
                    case 5:
                    case 6:
                        i9 = 90;
                        break;
                    case 7:
                    case 8:
                        i9 = 270;
                        break;
                }
                if (i3 != 2 && i3 != 7 && i3 != 4 && i3 != 5) {
                    i5 = 1;
                }
                m3 m3Var = new m3(i3, i9, i5);
                Matrix matrix = new Matrix();
                if (i9 != 0) {
                    matrix.preRotate(i9);
                }
                if (i5 != 1) {
                    matrix.postScale(i5, 1.0f);
                }
                if (matrix.isIdentity()) {
                    return new OooO00o(bitmapDecodeFileDescriptor, m3Var);
                }
                try {
                    bitmap = bitmapDecodeFileDescriptor;
                    try {
                        bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeFileDescriptor, 0, 0, bitmapDecodeFileDescriptor.getWidth(), bitmapDecodeFileDescriptor.getHeight(), matrix, true);
                        if (bitmap.sameAs(bitmapCreateBitmap)) {
                            bitmapCreateBitmap = bitmap;
                        }
                    } catch (OutOfMemoryError e4) {
                        e = e4;
                        Log.e("BitmapLoadUtils", "transformBitmap: ", e);
                    }
                } catch (OutOfMemoryError e5) {
                    e = e5;
                    bitmap = bitmapDecodeFileDescriptor;
                }
                return new OooO00o(bitmapCreateBitmap, m3Var);
            } catch (FileNotFoundException e6) {
                oooO00o = new OooO00o(e6);
                return oooO00o;
            }
        } catch (IOException | IllegalArgumentException | NullPointerException e7) {
            oooO00o = new OooO00o(e7);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(@NonNull OooO00o oooO00o) {
        OooO00o oooO00o2 = oooO00o;
        Exception exc = oooO00o2.f40418OooO0OO;
        if (exc == null) {
            this.f40414OooO0o.OooO00o(oooO00o2.f40416OooO00o, oooO00o2.f40417OooO0O0, this.f40411OooO0O0, this.f40412OooO0OO);
        } else {
            this.f40414OooO0o.onFailure(exc);
        }
    }

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Bitmap f40416OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public m3 f40417OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Exception f40418OooO0OO;

        public OooO00o(@NonNull Bitmap bitmap, @NonNull m3 m3Var) {
            this.f40416OooO00o = bitmap;
            this.f40417OooO0O0 = m3Var;
        }

        public OooO00o(@NonNull Exception exc) {
            this.f40418OooO0OO = exc;
        }
    }
}
