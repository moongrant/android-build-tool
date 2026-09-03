package com.zego.ve;

import OooO00o.OooO00o;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.SystemClock;
import com.facebook.share.internal.ShareInternalUtility;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class VeBitmap {
    public static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            int i6 = i3 / 2;
            int i7 = i4 / 2;
            while (i6 / i5 >= i2 && i7 / i5 >= i) {
                i5 *= 2;
            }
        }
        return i5;
    }

    public static Bitmap createBitmapRGBA(int i, int i2) {
        return Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
    }

    public static Bitmap getBitmap(Context context, int i, int i2, String str) {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf == -1) {
            return null;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1, str.length());
        if (strSubstring.compareTo("asset") == 0) {
            return getBitmapFromAsset(context, strSubstring2);
        }
        if (strSubstring.compareTo(ShareInternalUtility.STAGING_PARAM) == 0) {
            return getBitmapFromPath(context, i, i2, strSubstring2);
        }
        if (strSubstring.compareTo("content") == 0) {
            return getBitmapFromUri(context, i, i2, str);
        }
        return null;
    }

    public static Bitmap getBitmapFromAsset(Context context, String str) {
        try {
            return BitmapFactory.decodeStream(context.getAssets().open(str));
        } catch (IOException unused) {
            return null;
        }
    }

    public static Bitmap getBitmapFromPath(Context context, int i, int i2, String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        options.inSampleSize = calculateInSampleSize(options, i, i2);
        return BitmapFactory.decodeFile(str, options);
    }

    public static Bitmap getBitmapFromUri(Context context, int i, int i2, String str) {
        Bitmap bitmapDecodeFileDescriptor = null;
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(Uri.parse(str), "r");
            FileDescriptor fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = calculateInSampleSize(options, i, i2);
            bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            parcelFileDescriptorOpenFileDescriptor.close();
            return bitmapDecodeFileDescriptor;
        } catch (IOException e) {
            e.printStackTrace();
            return bitmapDecodeFileDescriptor;
        }
    }

    public static int saveBitmap(Bitmap bitmap) {
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("snapshot-");
        sbOooO0o0.append(SystemClock.uptimeMillis());
        sbOooO0o0.append(".jpg");
        File file = new File("/sdcard/", sbOooO0o0.toString());
        try {
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
