package com.bumptech.glide.load;

import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import p219o00oO0O0.o0O00o0;
import p224o00oOOOo.oOO00000;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ParcelFileDescriptorRewinder f12460OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0O00o0 f12461OooO0O0;

    public OooO00o(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, o0O00o0 o0o00o1) {
        this.f12460OooO00o = parcelFileDescriptorRewinder;
        this.f12461OooO0O0 = o0o00o1;
    }

    public final ImageHeaderParser.ImageType OooO00o(ImageHeaderParser imageHeaderParser) throws Throwable {
        oOO00000 ooo00000 = null;
        try {
            oOO00000 ooo00001 = new oOO00000(new FileInputStream(this.f12460OooO00o.OooO00o().getFileDescriptor()), this.f12461OooO0O0);
            try {
                ImageHeaderParser.ImageType imageTypeOooO0OO = imageHeaderParser.OooO0OO(ooo00001);
                try {
                    ooo00001.close();
                } catch (IOException unused) {
                }
                this.f12460OooO00o.OooO00o();
                return imageTypeOooO0OO;
            } catch (Throwable th) {
                th = th;
                ooo00000 = ooo00001;
                if (ooo00000 != null) {
                    try {
                        ooo00000.close();
                    } catch (IOException unused2) {
                    }
                }
                this.f12460OooO00o.OooO00o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
