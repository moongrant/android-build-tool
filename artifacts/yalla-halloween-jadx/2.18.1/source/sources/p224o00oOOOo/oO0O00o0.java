package p224o00oOOOo;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import java.io.IOException;
import p214o00oO0.o00OOOO0;
import p217o00oO00o.o00000;
import p217o00oO00o.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final class oO0O00o0<DataType> implements o00000O0<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000O0<DataType, Bitmap> f33804OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Resources f33805OooO0O0;

    public oO0O00o0(@NonNull Resources resources, @NonNull o00000O0<DataType, Bitmap> o00000o1) {
        this.f33805OooO0O0 = resources;
        this.f33804OooO00o = o00000o1;
    }

    @Override // p217o00oO00o.o00000O0
    public final o00OOOO0<BitmapDrawable> OooO00o(@NonNull DataType datatype, int i, int i2, @NonNull o00000 o00000Var) throws IOException {
        return oOo00o00.OooO0O0(this.f33805OooO0O0, this.f33804OooO00o.OooO00o(datatype, i, i2, o00000Var));
    }

    @Override // p217o00oO00o.o00000O0
    public final boolean OooO0O0(@NonNull DataType datatype, @NonNull o00000 o00000Var) throws IOException {
        return this.f33804OooO00o.OooO0O0(datatype, o00000Var);
    }
}
