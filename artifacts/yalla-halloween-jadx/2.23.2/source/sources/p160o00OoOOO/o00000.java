package p160o00OoOOO;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import p144o00Oo.o000OOo0;
import p144o00Oo.o00oOoo;
import p174o00OooOo.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 implements o00oOoo<BitmapDrawable>, o000OOo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Resources f38052OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o00oOoo<Bitmap> f38053OooO0o0;

    public o00000(@NonNull Resources resources, @NonNull o00oOoo<Bitmap> o00oooo2) {
        o00OO00O.OooO0O0(resources);
        this.f38052OooO0Oo = resources;
        o00OO00O.OooO0O0(o00oooo2);
        this.f38053OooO0o0 = o00oooo2;
    }

    @Override // p144o00Oo.o00oOoo
    public final void OooO00o() {
        this.f38053OooO0o0.OooO00o();
    }

    @Override // p144o00Oo.o00oOoo
    @NonNull
    public final Class<BitmapDrawable> OooO0OO() {
        return BitmapDrawable.class;
    }

    @Override // p144o00Oo.o00oOoo
    @NonNull
    public final BitmapDrawable get() {
        return new BitmapDrawable(this.f38052OooO0Oo, this.f38053OooO0o0.get());
    }

    @Override // p144o00Oo.o00oOoo
    public final int getSize() {
        return this.f38053OooO0o0.getSize();
    }

    @Override // p144o00Oo.o000OOo0
    public final void initialize() {
        o00oOoo<Bitmap> o00oooo2 = this.f38053OooO0o0;
        if (o00oooo2 instanceof o000OOo0) {
            ((o000OOo0) o00oooo2).initialize();
        }
    }
}
