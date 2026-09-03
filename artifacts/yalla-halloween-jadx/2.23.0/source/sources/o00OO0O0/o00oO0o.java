package o00OO0O0;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import p126o00O0oOo.o00000;
import p126o00O0oOo.o00000O0;
import p127o00O0oo.o0000;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
public final class o00oO0o implements o00000O0<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.bumptech.glide.load.resource.bitmap.OooO00o f37238OooO00o;

    public o00oO0o(com.bumptech.glide.load.resource.bitmap.OooO00o oooO00o) {
        this.f37238OooO00o = oooO00o;
    }

    @Override // p126o00O0oOo.o00000O0
    @Nullable
    public final o0000<Bitmap> OooO00o(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        com.bumptech.glide.load.resource.bitmap.OooO00o oooO00o = this.f37238OooO00o;
        return oooO00o.OooO00o(new com.bumptech.glide.load.resource.bitmap.OooO0O0.OooO0OO(parcelFileDescriptor, oooO00o.f10002OooO0Oo, oooO00o.f10001OooO0OO), i, i2, o00000Var, com.bumptech.glide.load.resource.bitmap.OooO00o.f9996OooOO0O);
    }

    @Override // p126o00O0oOo.o00000O0
    public final boolean OooO0O0(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull o00000 o00000Var) throws IOException {
        ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
        String str = Build.MANUFACTURER;
        if (!(!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor2.getStatSize() <= 536870912)) {
            return false;
        }
        this.f37238OooO00o.getClass();
        return "robolectric".equals(Build.FINGERPRINT) ^ true;
    }
}
