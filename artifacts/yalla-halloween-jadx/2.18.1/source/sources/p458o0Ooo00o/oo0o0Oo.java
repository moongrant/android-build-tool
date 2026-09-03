package p458o0Ooo00o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.share.internal.ShareInternalUtility;
import com.yalantis.ucrop.PictureMultiCuttingActivity;
import com.yalantis.ucrop.UCropActivity;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.Objects;
import p206o00o0o0o.o000Oo0;
import p454o0Ooo0.OooO;
import p454o0Ooo0.OooOOO;
import p457o0Ooo00O.o0OO00O;
import p552o0oOO0Oo.o000O000;
import p583o0oOoOoo.l3;
import p583o0oOoOoo.n3;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0Oo extends AsyncTask<Void, Void, Throwable> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Bitmap.CompressFormat f40419OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final WeakReference<Context> f40420OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Bitmap f40421OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final RectF f40422OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final RectF f40423OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f40424OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f40425OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f40426OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f40427OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f40428OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Uri f40429OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public Uri f40430OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f40431OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o000O000 f40432OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f40433OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f40434OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f40435OooOOo0;

    public oo0o0Oo(@NonNull Context context, @Nullable Bitmap bitmap, @NonNull n3 n3Var, @NonNull l3 l3Var, @Nullable o000O000 o000o001) {
        this.f40420OooO00o = new WeakReference<>(context);
        this.f40421OooO0O0 = bitmap;
        this.f40422OooO0OO = n3Var.f46936OooO00o;
        this.f40423OooO0Oo = n3Var.f46937OooO0O0;
        this.f40425OooO0o0 = n3Var.f46938OooO0OO;
        this.f40424OooO0o = n3Var.f46939OooO0Oo;
        this.f40426OooO0oO = l3Var.f46927OooO00o;
        this.f40427OooO0oo = l3Var.f46928OooO0O0;
        this.f40419OooO = l3Var.f46929OooO0OO;
        this.f40428OooOO0 = l3Var.f46930OooO0Oo;
        this.f40429OooOO0O = l3Var.f46932OooO0o0;
        this.f40430OooOO0o = l3Var.f46931OooO0o;
        this.f40432OooOOO0 = o000o001;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0184  */
    public final boolean OooO00o() throws Throwable {
        boolean z;
        FileOutputStream fileOutputStream;
        OutputStream outputStreamOpenOutputStream;
        if (this.f40426OooO0oO > 0 && this.f40427OooO0oo > 0) {
            float fWidth = this.f40422OooO0OO.width() / this.f40425OooO0o0;
            float fHeight = this.f40422OooO0OO.height() / this.f40425OooO0o0;
            int i = this.f40426OooO0oO;
            if (fWidth > i || fHeight > this.f40427OooO0oo) {
                float fMin = Math.min(i / fWidth, this.f40427OooO0oo / fHeight);
                Bitmap bitmap = this.f40421OooO0O0;
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * fMin), Math.round(this.f40421OooO0O0.getHeight() * fMin), false);
                Bitmap bitmap2 = this.f40421OooO0O0;
                if (bitmap2 != bitmapCreateScaledBitmap) {
                    bitmap2.recycle();
                }
                this.f40421OooO0O0 = bitmapCreateScaledBitmap;
                this.f40425OooO0o0 /= fMin;
            }
        }
        if (this.f40424OooO0o != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            Matrix matrix = new Matrix();
            matrix.setRotate(this.f40424OooO0o, this.f40421OooO0O0.getWidth() / 2, this.f40421OooO0O0.getHeight() / 2);
            Bitmap bitmap3 = this.f40421OooO0O0;
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap3, 0, 0, bitmap3.getWidth(), this.f40421OooO0O0.getHeight(), matrix, true);
            Bitmap bitmap4 = this.f40421OooO0O0;
            if (bitmap4 != bitmapCreateBitmap) {
                bitmap4.recycle();
            }
            this.f40421OooO0O0 = bitmapCreateBitmap;
        }
        this.f40434OooOOOo = Math.round((this.f40422OooO0OO.left - this.f40423OooO0Oo.left) / this.f40425OooO0o0);
        this.f40435OooOOo0 = Math.round((this.f40422OooO0OO.top - this.f40423OooO0Oo.top) / this.f40425OooO0o0);
        this.f40431OooOOO = Math.round(this.f40422OooO0OO.width() / this.f40425OooO0o0);
        this.f40433OooOOOO = Math.round(this.f40422OooO0OO.height() / this.f40425OooO0o0);
        boolean z2 = this.f40434OooOOOo + this.f40431OooOOO > this.f40421OooO0O0.getWidth();
        boolean z3 = this.f40435OooOOo0 + this.f40433OooOOOO > this.f40421OooO0O0.getHeight();
        if (z2) {
            this.f40434OooOOOo = this.f40421OooO0O0.getWidth() - this.f40431OooOOO;
        }
        if (z3) {
            this.f40435OooOOo0 = this.f40421OooO0O0.getHeight() - this.f40433OooOOOO;
        }
        int iRound = Math.round(Math.max(this.f40431OooOOO, this.f40433OooOOOO) / 1000.0f) + 1;
        if (this.f40426OooO0oO <= 0 || this.f40427OooO0oo <= 0) {
            float f = iRound;
            if (Math.abs(this.f40422OooO0OO.left - this.f40423OooO0Oo.left) > f || Math.abs(this.f40422OooO0OO.top - this.f40423OooO0Oo.top) > f || Math.abs(this.f40422OooO0OO.bottom - this.f40423OooO0Oo.bottom) > f || Math.abs(this.f40422OooO0OO.right - this.f40423OooO0Oo.right) > f || this.f40424OooO0o != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        Log.i("BitmapCropTask", "Should crop: " + z);
        if (!z) {
            InputStream inputStreamOpenInputStream = OooO0O0().getContentResolver().openInputStream(this.f40429OooOO0O);
            OutputStream outputStreamOpenOutputStream2 = OooO0O0().getContentResolver().openOutputStream(this.f40430OooOO0o);
            try {
                try {
                    OooO0O0().getContentResolver().openFileDescriptor(this.f40429OooOO0O, "r").getFileDescriptor();
                    byte[] bArr = new byte[5120];
                    while (true) {
                        int i2 = inputStreamOpenInputStream.read(bArr);
                        if (i2 == -1) {
                            break;
                        }
                        outputStreamOpenOutputStream2.write(bArr, 0, i2);
                    }
                    outputStreamOpenOutputStream2.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return false;
            } finally {
                inputStreamOpenInputStream.close();
                outputStreamOpenOutputStream2.close();
            }
        }
        ExifInterface exifInterface = new ExifInterface(new FileInputStream(OooO0O0().getContentResolver().openFileDescriptor(this.f40429OooOO0O, "r").getFileDescriptor()));
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f40421OooO0O0, this.f40434OooOOOo, this.f40435OooOOo0, this.f40431OooOOO, this.f40433OooOOOO);
        Context contextOooO0O0 = OooO0O0();
        if (contextOooO0O0 != null) {
            try {
                try {
                    outputStreamOpenOutputStream = contextOooO0O0.getContentResolver().openOutputStream(this.f40430OooOO0o);
                } catch (FileNotFoundException e2) {
                    Uri uri = this.f40429OooOO0O;
                    if (uri == null) {
                        throw e2;
                    }
                    String scheme = uri.getScheme();
                    String path = ShareInternalUtility.STAGING_PARAM.equals(scheme) ? this.f40429OooOO0O.getPath() : "content".equals(scheme) ? o000Oo0.OooO0O0(contextOooO0O0, this.f40429OooOO0O) : null;
                    if (TextUtils.isEmpty(path)) {
                        throw e2;
                    }
                    try {
                        File file = new File(path);
                        File parentFile = file.getParentFile();
                        String name = file.getName();
                        String strSubstring = name.substring(0, name.lastIndexOf("."));
                        Bitmap.CompressFormat compressFormat = this.f40419OooO;
                        File file2 = new File(parentFile, strSubstring + "_" + System.currentTimeMillis() + "_crop" + ((compressFormat != Bitmap.CompressFormat.JPEG && compressFormat == Bitmap.CompressFormat.PNG) ? ".png" : ".jpg"));
                        fileOutputStream = new FileOutputStream(file2);
                        try {
                            this.f40430OooOO0o = Uri.fromFile(file2);
                            outputStreamOpenOutputStream = fileOutputStream;
                        } catch (Exception e3) {
                            e = e3;
                            e.printStackTrace();
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            OooO.OooO00o(fileOutputStream);
                            throw th;
                        }
                    } catch (Exception e4) {
                        e = e4;
                    }
                }
                bitmapCreateBitmap2.compress(this.f40419OooO, this.f40428OooOO0, outputStreamOpenOutputStream);
                bitmapCreateBitmap2.recycle();
                OooO.OooO00o(outputStreamOpenOutputStream);
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
                OooO.OooO00o(fileOutputStream);
                throw th;
            }
        }
        if (this.f40419OooO.equals(Bitmap.CompressFormat.JPEG)) {
            InputStream inputStreamOpenInputStream2 = OooO0O0().getContentResolver().openInputStream(this.f40430OooOO0o);
            int i3 = this.f40431OooOOO;
            int i4 = this.f40433OooOOOO;
            byte[] bArr2 = OooOOO.f40362OooO0O0;
            String[] strArr = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "PhotographicSensitivity", "Make", "Model", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};
            try {
                ExifInterface exifInterface2 = new ExifInterface(inputStreamOpenInputStream2);
                for (int i5 = 0; i5 < 22; i5++) {
                    String str = strArr[i5];
                    String strOooO0Oo = exifInterface.OooO0Oo(str);
                    if (!TextUtils.isEmpty(strOooO0Oo)) {
                        exifInterface2.Oooo00O(str, strOooO0Oo);
                    }
                }
                exifInterface2.Oooo00O("ImageWidth", String.valueOf(i3));
                exifInterface2.Oooo00O("ImageLength", String.valueOf(i4));
                exifInterface2.Oooo00O("Orientation", AppEventsConstants.EVENT_PARAM_VALUE_NO);
                exifInterface2.OooOoo();
            } catch (IOException e5) {
                Log.d("ImageHeaderParser", e5.getMessage());
            }
        }
        return true;
    }

    public final Context OooO0O0() {
        return this.f40420OooO00o.get();
    }

    @Override // android.os.AsyncTask
    @Nullable
    public final Throwable doInBackground(Void[] voidArr) {
        Bitmap bitmap = this.f40421OooO0O0;
        if (bitmap == null) {
            return new NullPointerException("ViewBitmap is null");
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException("ViewBitmap is recycled");
        }
        if (this.f40423OooO0Oo.isEmpty()) {
            return new NullPointerException("CurrentImageRect is empty");
        }
        try {
            OooO00o();
            this.f40421OooO0O0 = null;
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(@Nullable Throwable th) {
        Throwable th2 = th;
        o000O000 o000o001 = this.f40432OooOOO0;
        if (o000o001 != null) {
            if (th2 != null) {
                o0OO00O o0oo00o2 = (o0OO00O) o000o001;
                o0oo00o2.f40403OooO00o.OooOo0(th2);
                o0oo00o2.f40403OooO00o.onBackPressed();
                return;
            }
            Uri uri = this.f40430OooOO0o;
            int i = this.f40434OooOOOo;
            int i2 = this.f40435OooOOo0;
            int i3 = this.f40431OooOOO;
            int i4 = this.f40433OooOOOO;
            o0OO00O o0oo00o3 = (o0OO00O) o000o001;
            UCropActivity uCropActivity = o0oo00o3.f40403OooO00o;
            uCropActivity.OooOo0O(uri, uCropActivity.f20307OoooOOo.getTargetAspectRatio(), i, i2, i3, i4);
            UCropActivity uCropActivity2 = o0oo00o3.f40403OooO00o;
            Objects.requireNonNull(uCropActivity2);
            if (uCropActivity2 instanceof PictureMultiCuttingActivity) {
                return;
            }
            o0oo00o3.f40403OooO00o.onBackPressed();
        }
    }
}
