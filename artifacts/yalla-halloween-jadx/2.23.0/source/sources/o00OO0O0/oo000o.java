package o00OO0O0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import p127o00O0oo.o0000;
import p127o00O0oo.o00000O0;
import p532o0o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o implements o0000<BitmapDrawable>, o00000O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Resources f37251OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0000<Bitmap> f37252OooO0o0;

    public oo000o(@NonNull Resources resources, @NonNull o0000<Bitmap> o0000Var) {
        o0000O00.OooO0O0(resources);
        this.f37251OooO0Oo = resources;
        o0000O00.OooO0O0(o0000Var);
        this.f37252OooO0o0 = o0000Var;
    }

    @Override // p127o00O0oo.o0000
    public final void OooO00o() {
        this.f37252OooO0o0.OooO00o();
    }

    @Override // p127o00O0oo.o0000
    @NonNull
    public final Class<BitmapDrawable> OooO0O0() {
        return BitmapDrawable.class;
    }

    @Override // p127o00O0oo.o0000
    @NonNull
    public final BitmapDrawable get() {
        return new BitmapDrawable(this.f37251OooO0Oo, this.f37252OooO0o0.get());
    }

    @Override // p127o00O0oo.o0000
    public final int getSize() {
        return this.f37252OooO0o0.getSize();
    }

    @Override // p127o00O0oo.o00000O0
    public final void initialize() {
        o0000<Bitmap> o0000Var = this.f37252OooO0o0;
        if (o0000Var instanceof o00000O0) {
            ((o00000O0) o0000Var).initialize();
        }
    }
}
