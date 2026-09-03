package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0OoOo0 {
    public static void OooO00o(int i, int i2, int i3, int i4, BitmapFactory.Options options, Oooo0 oooo0) {
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
                iMax = oooo0.f19774OooOO0 ? Math.max(iFloor, iFloor2) : Math.min(iFloor, iFloor2);
            }
            iMax = (int) dFloor;
        } else {
            iMax = 1;
        }
        options.inSampleSize = iMax;
        options.inJustDecodeBounds = false;
    }

    public static void OooO0O0(int i, int i2, BitmapFactory.Options options, Oooo0 oooo0) {
        OooO00o(i, i2, options.outWidth, options.outHeight, options, oooo0);
    }

    public static BitmapFactory.Options OooO0Oo(Oooo0 oooo0) {
        boolean zOooO00o = oooo0.OooO00o();
        boolean z = oooo0.f19780OooOOOo != null;
        BitmapFactory.Options options = null;
        if (zOooO00o || z) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = zOooO00o;
            if (z) {
                options.inPreferredConfig = oooo0.f19780OooOOOo;
            }
        }
        return options;
    }

    public abstract boolean OooO0OO(Oooo0 oooo0);

    public abstract OooO00o OooO0o(Oooo0 oooo0) throws IOException;

    public int OooO0o0() {
        return 0;
    }

    public boolean OooO0oO(NetworkInfo networkInfo) {
        return false;
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Picasso.LoadedFrom f19822OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Bitmap f19823OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final InputStream f19824OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f19825OooO0Oo;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public OooO00o(InputStream inputStream, Picasso.LoadedFrom loadedFrom) {
            this(null, inputStream, loadedFrom, 0);
            StringBuilder sb = o00oO0o.f19821OooO00o;
            Objects.requireNonNull(inputStream, "stream == null");
        }

        public OooO00o(Bitmap bitmap, InputStream inputStream, Picasso.LoadedFrom loadedFrom, int i) {
            if ((inputStream != null) ^ (bitmap != null)) {
                this.f19823OooO0O0 = bitmap;
                this.f19824OooO0OO = inputStream;
                StringBuilder sb = o00oO0o.f19821OooO00o;
                Objects.requireNonNull(loadedFrom, "loadedFrom == null");
                this.f19822OooO00o = loadedFrom;
                this.f19825OooO0Oo = i;
                return;
            }
            throw new AssertionError();
        }
    }
}
