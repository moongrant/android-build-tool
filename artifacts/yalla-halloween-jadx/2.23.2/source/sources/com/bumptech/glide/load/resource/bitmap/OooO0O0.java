package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.OooOo00;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import p156o00OoO00.OooO0o;
import p160o00OoOOO.o00000O;
import p174o00OooOo.o00O;
import p174o00OooOo.o00O0;
import p174o00OooOo.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public interface OooO0O0 {

    public static final class OooO00o implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ByteBuffer f13095OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<ImageHeaderParser> f13096OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final OooO0o f13097OooO0OO;

        public OooO00o(OooO0o oooO0o, ByteBuffer byteBuffer, List list) {
            this.f13095OooO00o = byteBuffer;
            this.f13096OooO0O0 = list;
            this.f13097OooO0OO = oooO0o;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        @Nullable
        public final Bitmap OooO00o(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(new o00O0.OooO00o(o00O0.OooO0OO(this.f13095OooO00o)), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final void OooO0O0() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final int OooO0OO() throws IOException {
            ByteBuffer byteBufferOooO0OO = o00O0.OooO0OO(this.f13095OooO00o);
            OooO0o oooO0o = this.f13097OooO0OO;
            if (byteBufferOooO0OO == null) {
                return -1;
            }
            List<ImageHeaderParser> list = this.f13096OooO0O0;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                try {
                    int iOooO0O0 = list.get(i).OooO0O0(byteBufferOooO0OO, oooO0o);
                    o00O0.OooO0OO(byteBufferOooO0OO);
                    if (iOooO0O0 != -1) {
                        return iOooO0O0;
                    }
                } catch (Throwable th) {
                    o00O0.OooO0OO(byteBufferOooO0OO);
                    throw th;
                }
            }
            return -1;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final ImageHeaderParser.ImageType OooO0Oo() throws IOException {
            return com.bumptech.glide.load.OooO00o.OooO0O0(this.f13096OooO0O0, o00O0.OooO0OO(this.f13095OooO00o));
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C0193OooO0O0 implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOo00 f13098OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final OooO0o f13099OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final List<ImageHeaderParser> f13100OooO0OO;

        public C0193OooO0O0(OooO0o oooO0o, o00O o00o2, List list) {
            o00OO00O.OooO0O0(oooO0o);
            this.f13099OooO0O0 = oooO0o;
            o00OO00O.OooO0O0(list);
            this.f13100OooO0OO = list;
            this.f13098OooO00o = new OooOo00(o00o2, oooO0o);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        @Nullable
        public final Bitmap OooO00o(BitmapFactory.Options options) throws IOException {
            o00000O o00000o = this.f13098OooO00o.f13057OooO00o;
            o00000o.reset();
            return BitmapFactory.decodeStream(o00000o, null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final void OooO0O0() {
            o00000O o00000o = this.f13098OooO00o.f13057OooO00o;
            synchronized (o00000o) {
                o00000o.f38065OooO0o = o00000o.f38064OooO0Oo.length;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final int OooO0OO() throws IOException {
            o00000O o00000o = this.f13098OooO00o.f13057OooO00o;
            o00000o.reset();
            return com.bumptech.glide.load.OooO00o.OooO00o(this.f13099OooO0O0, o00000o, this.f13100OooO0OO);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final ImageHeaderParser.ImageType OooO0Oo() throws IOException {
            o00000O o00000o = this.f13098OooO00o.f13057OooO00o;
            o00000o.reset();
            return com.bumptech.glide.load.OooO00o.OooO0OO(this.f13099OooO0O0, o00000o, this.f13100OooO0OO);
        }
    }

    @RequiresApi(21)
    public static final class OooO0OO implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0o f13101OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<ImageHeaderParser> f13102OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f13103OooO0OO;

        public OooO0OO(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, OooO0o oooO0o) {
            o00OO00O.OooO0O0(oooO0o);
            this.f13101OooO00o = oooO0o;
            o00OO00O.OooO0O0(list);
            this.f13102OooO0O0 = list;
            this.f13103OooO0OO = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        @Nullable
        public final Bitmap OooO00o(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f13103OooO0OO.OooO00o().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final void OooO0O0() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final int OooO0OO() throws Throwable {
            o00000O o00000o;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f13103OooO0OO;
            OooO0o oooO0o = this.f13101OooO00o;
            List<ImageHeaderParser> list = this.f13102OooO0O0;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = list.get(i);
                try {
                    o00000o = new o00000O(new FileInputStream(parcelFileDescriptorRewinder.OooO00o().getFileDescriptor()), oooO0o);
                    try {
                        int iOooO0Oo = imageHeaderParser.OooO0Oo(o00000o, oooO0o);
                        o00000o.release();
                        parcelFileDescriptorRewinder.OooO00o();
                        if (iOooO0Oo != -1) {
                            return iOooO0Oo;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (o00000o != null) {
                            o00000o.release();
                        }
                        parcelFileDescriptorRewinder.OooO00o();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    o00000o = null;
                }
            }
            return -1;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final ImageHeaderParser.ImageType OooO0Oo() throws Throwable {
            o00000O o00000o;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f13103OooO0OO;
            OooO0o oooO0o = this.f13101OooO00o;
            List<ImageHeaderParser> list = this.f13102OooO0O0;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = list.get(i);
                try {
                    o00000o = new o00000O(new FileInputStream(parcelFileDescriptorRewinder.OooO00o().getFileDescriptor()), oooO0o);
                    try {
                        ImageHeaderParser.ImageType imageTypeOooO0OO = imageHeaderParser.OooO0OO(o00000o);
                        o00000o.release();
                        parcelFileDescriptorRewinder.OooO00o();
                        if (imageTypeOooO0OO != ImageHeaderParser.ImageType.UNKNOWN) {
                            return imageTypeOooO0OO;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (o00000o != null) {
                            o00000o.release();
                        }
                        parcelFileDescriptorRewinder.OooO00o();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    o00000o = null;
                }
            }
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    @Nullable
    Bitmap OooO00o(BitmapFactory.Options options) throws IOException;

    void OooO0O0();

    int OooO0OO() throws IOException;

    ImageHeaderParser.ImageType OooO0Oo() throws IOException;
}
