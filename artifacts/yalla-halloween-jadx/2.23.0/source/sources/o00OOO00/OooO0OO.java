package o00OOO00;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p532o0o0Oo.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO0OO<T> implements OooOOO0<T> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f37334OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public o00OO.OooO0OO f37335OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f37336OooO0o0;

    public OooO0OO() {
        this(0);
    }

    @Override // o00OOO00.OooOOO0
    @Nullable
    public final o00OO.OooO0OO OooO00o() {
        return this.f37335OooO0o;
    }

    @Override // o00OOO00.OooOOO0
    public final void OooO0O0(@NonNull OooOO0O oooOO0O) {
    }

    @Override // o00OOO00.OooOOO0
    public final void OooO0Oo(@Nullable o00OO.OooO0OO oooO0OO) {
        this.f37335OooO0o = oooO0OO;
    }

    @Override // o00OOO00.OooOOO0
    public final void OooO0o0(@Nullable Drawable drawable) {
    }

    @Override // o00OOO00.OooOOO0
    public final void OooOO0(@NonNull OooOO0O oooOO0O) {
        oooOO0O.OooO0O0(this.f37334OooO0Oo, this.f37336OooO0o0);
    }

    @Override // o00OOO00.OooOOO0
    public void OooOO0O(@Nullable Drawable drawable) {
    }

    @Override // com.bumptech.glide.manager.Oooo000
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.Oooo000
    public final void onStart() {
    }

    @Override // com.bumptech.glide.manager.Oooo000
    public final void onStop() {
    }

    public OooO0OO(int i) {
        if (!o0000oo.OooO(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.f37334OooO0Oo = Integer.MIN_VALUE;
        this.f37336OooO0o0 = Integer.MIN_VALUE;
    }
}
