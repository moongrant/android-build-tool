package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.OooOo00;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import p219o00oO0O0.o0O00o0;
import p224o00oOOOo.oOO00000;

/* JADX INFO: loaded from: classes.dex */
public interface OooO0O0 {

    public static final class OooO00o implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooOo00 f12525OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o0O00o0 f12526OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final List<ImageHeaderParser> f12527OooO0OO;

        public OooO00o(InputStream inputStream, List<ImageHeaderParser> list, o0O00o0 o0o00o1) {
            Objects.requireNonNull(o0o00o1, "Argument must not be null");
            this.f12526OooO0O0 = o0o00o1;
            Objects.requireNonNull(list, "Argument must not be null");
            this.f12527OooO0OO = list;
            this.f12525OooO00o = new OooOo00(inputStream, o0o00o1);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final int OooO00o() throws IOException {
            return com.bumptech.glide.load.OooO0OO.OooO00o(this.f12527OooO0OO, this.f12525OooO00o.OooO00o(), this.f12526OooO0O0);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        @Nullable
        public final Bitmap OooO0O0(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f12525OooO00o.OooO00o(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final void OooO0OO() {
            oOO00000 ooo00000 = this.f12525OooO00o.f12487OooO00o;
            synchronized (ooo00000) {
                ooo00000.f33843Oooo0oo = ooo00000.f33841Oooo0o.length;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final ImageHeaderParser.ImageType OooO0Oo() throws IOException {
            return com.bumptech.glide.load.OooO0OO.OooO0OO(this.f12527OooO0OO, this.f12525OooO00o.OooO00o(), this.f12526OooO0O0);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.OooO0O0$OooO0O0, reason: collision with other inner class name */
    @RequiresApi(21)
    public static final class C0081OooO0O0 implements OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o0O00o0 f12528OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final List<ImageHeaderParser> f12529OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ParcelFileDescriptorRewinder f12530OooO0OO;

        public C0081OooO0O0(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, o0O00o0 o0o00o1) {
            Objects.requireNonNull(o0o00o1, "Argument must not be null");
            this.f12528OooO00o = o0o00o1;
            Objects.requireNonNull(list, "Argument must not be null");
            this.f12529OooO0O0 = list;
            this.f12530OooO0OO = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final int OooO00o() throws IOException {
            return com.bumptech.glide.load.OooO0OO.OooO0O0(this.f12529OooO0O0, new com.bumptech.glide.load.OooO0O0(this.f12530OooO0OO, this.f12528OooO00o));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        @Nullable
        public final Bitmap OooO0O0(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f12530OooO0OO.OooO00o().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final void OooO0OO() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.OooO0O0
        public final ImageHeaderParser.ImageType OooO0Oo() throws IOException {
            return com.bumptech.glide.load.OooO0OO.OooO0Oo(this.f12529OooO0O0, new com.bumptech.glide.load.OooO00o(this.f12530OooO0OO, this.f12528OooO00o));
        }
    }

    int OooO00o() throws IOException;

    @Nullable
    Bitmap OooO0O0(BitmapFactory.Options options) throws IOException;

    void OooO0OO();

    ImageHeaderParser.ImageType OooO0Oo() throws IOException;
}
