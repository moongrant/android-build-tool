package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o00oO0o {
    public static void OooO00o(int i, int i2, int i3, int i4, BitmapFactory.Options options, o00Ooo o00ooo2) {
        int iMax;
        double dFloor;
        if (i4 > i2 || i3 > i) {
            if (i2 == 0) {
                dFloor = Math.floor(i3 / i);
            } else if (i == 0) {
                dFloor = Math.floor(i4 / i2);
            } else {
                int iFloor = (int) Math.floor(i4 / i2);
                int iFloor2 = (int) Math.floor(i3 / i);
                iMax = o00ooo2.f21799OooOO0 ? Math.max(iFloor, iFloor2) : Math.min(iFloor, iFloor2);
            }
            iMax = (int) dFloor;
        } else {
            iMax = 1;
        }
        options.inSampleSize = iMax;
        options.inJustDecodeBounds = false;
    }

    public static BitmapFactory.Options OooO0OO(o00Ooo o00ooo2) {
        boolean zOooO00o = o00ooo2.OooO00o();
        Bitmap.Config config = o00ooo2.f21805OooOOOo;
        boolean z = config != null;
        if (!zOooO00o && !z) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = zOooO00o;
        if (z) {
            options.inPreferredConfig = config;
        }
        return options;
    }

    public abstract boolean OooO0O0(o00Ooo o00ooo2);

    public int OooO0Oo() {
        return 0;
    }

    public boolean OooO0o(NetworkInfo networkInfo) {
        return false;
    }

    public abstract OooO00o OooO0o0(o00Ooo o00ooo2) throws IOException;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Picasso.LoadedFrom f21814OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Bitmap f21815OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final InputStream f21816OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f21817OooO0Oo;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public OooO00o(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
            this(bitmap, null, loadedFrom, 0);
            StringBuilder sb = o000000O.f21773OooO00o;
            if (bitmap == null) {
                throw new NullPointerException("bitmap == null");
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public OooO00o(InputStream inputStream, Picasso.LoadedFrom loadedFrom) {
            this(null, inputStream, loadedFrom, 0);
            StringBuilder sb = o000000O.f21773OooO00o;
            if (inputStream == null) {
                throw new NullPointerException("stream == null");
            }
        }

        public OooO00o(Bitmap bitmap, InputStream inputStream, Picasso.LoadedFrom loadedFrom, int i) {
            if ((inputStream != null) ^ (bitmap != null)) {
                this.f21815OooO0O0 = bitmap;
                this.f21816OooO0OO = inputStream;
                StringBuilder sb = o000000O.f21773OooO00o;
                if (loadedFrom != null) {
                    this.f21814OooO00o = loadedFrom;
                    this.f21817OooO0Oo = i;
                    return;
                }
                throw new NullPointerException("loadedFrom == null");
            }
            throw new AssertionError();
        }
    }
}
