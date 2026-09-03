package p172o00OooO0;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p170o00Ooo0o.Oooo0;
import p174o00OooOo.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o000000<T> implements o00000OO<T> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f38314OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Oooo0 f38315OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f38316OooO0o0;

    public o000000() {
        this(0);
    }

    @Override // p172o00OooO0.o00000OO
    public final void OooO(@Nullable Oooo0 oooo0) {
        this.f38315OooO0o = oooo0;
    }

    @Override // p172o00OooO0.o00000OO
    @Nullable
    public final Oooo0 OooO00o() {
        return this.f38315OooO0o;
    }

    @Override // p172o00OooO0.o00000OO
    public final void OooO0OO(@Nullable Drawable drawable) {
    }

    @Override // p172o00OooO0.o00000OO
    public final void OooO0o(@NonNull o00000O o00000o) {
        o00000o.OooO0O0(this.f38314OooO0Oo, this.f38316OooO0o0);
    }

    @Override // p172o00OooO0.o00000OO
    public final void OooOO0(@NonNull o00000O o00000o) {
    }

    @Override // p172o00OooO0.o00000OO
    public void OooOO0O(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.OooOo00
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.OooOo00
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.OooOo00
    public final void onStop() {
    }

    public o000000(int i) {
        if (!o00OO0O0.OooO0oo(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f38314OooO0Oo = Integer.MIN_VALUE;
        this.f38316OooO0o0 = Integer.MIN_VALUE;
    }
}
