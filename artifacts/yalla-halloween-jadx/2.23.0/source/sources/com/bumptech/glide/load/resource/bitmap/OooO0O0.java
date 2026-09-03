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
import o00OO0O0.o0ooOOo;
import p129o00O0ooo.o0000;
import p532o0o0Oo.o0000O00;
import p532o0o0Oo.o0000Ooo;
import p532o0o0Oo.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public interface OooO0O0 {

    public static final class OooO00o implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ByteBuffer f10004OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<ImageHeaderParser> f10005OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o0000 f10006OooO0OO;

        public OooO00o(o0000 o0000Var, ByteBuffer byteBuffer, List list) {
            this.f10004OooO00o = byteBuffer;
            this.f10005OooO0O0 = list;
            this.f10006OooO0OO = o0000Var;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        @Nullable
        public final Bitmap OooO00o(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(new oo0o0Oo.OooO00o(oo0o0Oo.OooO0OO(this.f10004OooO00o)), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final void OooO0O0() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final int OooO0OO() throws IOException {
            ByteBuffer byteBufferOooO0OO = oo0o0Oo.OooO0OO(this.f10004OooO00o);
            o0000 o0000Var = this.f10006OooO0OO;
            if (byteBufferOooO0OO == null) {
                return -1;
            }
            List<ImageHeaderParser> list = this.f10005OooO0O0;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                try {
                    int iOooO0Oo = list.get(i).OooO0Oo(byteBufferOooO0OO, o0000Var);
                    oo0o0Oo.OooO0OO(byteBufferOooO0OO);
                    if (iOooO0Oo != -1) {
                        return iOooO0Oo;
                    }
                } catch (Throwable th) {
                    oo0o0Oo.OooO0OO(byteBufferOooO0OO);
                    throw th;
                }
            }
            return -1;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final ImageHeaderParser.ImageType OooO0Oo() throws IOException {
            return com.bumptech.glide.load.OooO00o.OooO0O0(this.f10005OooO0O0, oo0o0Oo.OooO0OO(this.f10004OooO00o));
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C0175OooO0O0 implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOo00 f10007OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0000 f10008OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final List<ImageHeaderParser> f10009OooO0OO;

        public C0175OooO0O0(o0000 o0000Var, o0000Ooo o0000ooo, List list) {
            o0000O00.OooO0O0(o0000Var);
            this.f10008OooO0O0 = o0000Var;
            o0000O00.OooO0O0(list);
            this.f10009OooO0OO = list;
            this.f10007OooO00o = new OooOo00(o0000ooo, o0000Var);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        @Nullable
        public final Bitmap OooO00o(BitmapFactory.Options options) throws IOException {
            o0ooOOo o0ooooo = this.f10007OooO00o.f9966OooO00o;
            o0ooooo.reset();
            return BitmapFactory.decodeStream(o0ooooo, null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final void OooO0O0() {
            o0ooOOo o0ooooo = this.f10007OooO00o.f9966OooO00o;
            synchronized (o0ooooo) {
                o0ooooo.f37247OooO0o = o0ooooo.f37246OooO0Oo.length;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final int OooO0OO() throws IOException {
            o0ooOOo o0ooooo = this.f10007OooO00o.f9966OooO00o;
            o0ooooo.reset();
            return com.bumptech.glide.load.OooO00o.OooO00o(this.f10008OooO0O0, o0ooooo, this.f10009OooO0OO);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final ImageHeaderParser.ImageType OooO0Oo() throws IOException {
            o0ooOOo o0ooooo = this.f10007OooO00o.f9966OooO00o;
            o0ooooo.reset();
            return com.bumptech.glide.load.OooO00o.OooO0OO(this.f10008OooO0O0, o0ooooo, this.f10009OooO0OO);
        }
    }

    @RequiresApi(21)
    public static final class OooO0OO implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0000 f10010OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<ImageHeaderParser> f10011OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f10012OooO0OO;

        public OooO0OO(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, o0000 o0000Var) {
            o0000O00.OooO0O0(o0000Var);
            this.f10010OooO00o = o0000Var;
            o0000O00.OooO0O0(list);
            this.f10011OooO0O0 = list;
            this.f10012OooO0OO = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        @Nullable
        public final Bitmap OooO00o(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f10012OooO0OO.OooO00o().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final void OooO0O0() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final int OooO0OO() throws Throwable {
            o0ooOOo o0ooooo;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f10012OooO0OO;
            o0000 o0000Var = this.f10010OooO00o;
            List<ImageHeaderParser> list = this.f10011OooO0O0;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = list.get(i);
                try {
                    o0ooooo = new o0ooOOo(new FileInputStream(parcelFileDescriptorRewinder.OooO00o().getFileDescriptor()), o0000Var);
                    try {
                        int iOooO00o = imageHeaderParser.OooO00o(o0ooooo, o0000Var);
                        o0ooooo.release();
                        parcelFileDescriptorRewinder.OooO00o();
                        if (iOooO00o != -1) {
                            return iOooO00o;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (o0ooooo != null) {
                            o0ooooo.release();
                        }
                        parcelFileDescriptorRewinder.OooO00o();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    o0ooooo = null;
                }
            }
            return -1;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final ImageHeaderParser.ImageType OooO0Oo() throws Throwable {
            o0ooOOo o0ooooo;
            ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f10012OooO0OO;
            o0000 o0000Var = this.f10010OooO00o;
            List<ImageHeaderParser> list = this.f10011OooO0O0;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ImageHeaderParser imageHeaderParser = list.get(i);
                try {
                    o0ooooo = new o0ooOOo(new FileInputStream(parcelFileDescriptorRewinder.OooO00o().getFileDescriptor()), o0000Var);
                    try {
                        ImageHeaderParser.ImageType imageTypeOooO0OO = imageHeaderParser.OooO0OO(o0ooooo);
                        o0ooooo.release();
                        parcelFileDescriptorRewinder.OooO00o();
                        if (imageTypeOooO0OO != ImageHeaderParser.ImageType.UNKNOWN) {
                            return imageTypeOooO0OO;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (o0ooooo != null) {
                            o0ooooo.release();
                        }
                        parcelFileDescriptorRewinder.OooO00o();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    o0ooooo = null;
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
