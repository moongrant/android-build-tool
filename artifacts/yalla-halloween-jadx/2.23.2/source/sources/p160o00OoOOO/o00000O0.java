package p160o00OoOOO;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.resource.bitmap.OooO00o;
import com.bumptech.glide.load.resource.bitmap.OooO0O0;
import java.io.IOException;
import p144o00Oo.o00oOoo;
import p154o00Oo0oo.o0O0O00;
import p154o00Oo0oo.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(21)
public final class o00000O0 implements o0O0O00<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f38069OooO00o;

    public o00000O0(OooO00o oooO00o) {
        this.f38069OooO00o = oooO00o;
    }

    @Override // p154o00Oo0oo.o0O0O00
    public final boolean OooO00o(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
        String str = Build.MANUFACTURER;
        if (!(!("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor2.getStatSize() <= 536870912)) {
            return false;
        }
        this.f38069OooO00o.getClass();
        return "robolectric".equals(Build.FINGERPRINT) ^ true;
    }

    @Override // p154o00Oo0oo.o0O0O00
    @Nullable
    public final o00oOoo<Bitmap> OooO0O0(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i, int i2, @NonNull oo0o0Oo oo0o0oo) throws IOException {
        OooO00o oooO00o = this.f38069OooO00o;
        return oooO00o.OooO00o(new OooO0O0.OooO0OO(parcelFileDescriptor, oooO00o.f13093OooO0Oo, oooO00o.f13092OooO0OO), i, i2, oo0o0oo, OooO00o.f13087OooOO0O);
    }
}
