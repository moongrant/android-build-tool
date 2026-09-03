package p224o00oOOOo;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.load.resource.bitmap.OooO00o;
import com.bumptech.glide.load.resource.bitmap.OooO0O0;
import java.io.IOException;
import java.util.Objects;
import p214o00oO0.o00OOOO0;
import p217o00oO00o.o00000;
import p217o00oO00o.o00000O0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class oO implements o00000O0<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f33800OooO00o;

    public oO(OooO00o oooO00o) {
        this.f33800OooO00o = oooO00o;
    }

    @Override // p217o00oO00o.o00000O0
    @Nullable
    public final o00OOOO0<Bitmap> OooO00o(@NonNull ParcelFileDescriptor parcelFileDescriptor, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        OooO00o oooO00o = this.f33800OooO00o;
        return oooO00o.OooO00o(new OooO0O0.C0081OooO0O0(parcelFileDescriptor, oooO00o.f12523OooO0Oo, oooO00o.f12522OooO0OO), i, i2, o00000Var, OooO00o.f12517OooOO0O);
    }

    @Override // p217o00oO00o.o00000O0
    public final boolean OooO0O0(@NonNull ParcelFileDescriptor parcelFileDescriptor, @NonNull o00000 o00000Var) throws IOException {
        Objects.requireNonNull(this.f33800OooO00o);
        return true;
    }
}
