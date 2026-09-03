package p125o00O0o0O;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil.decode.DataSource;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p131o00O0oo0.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO implements o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Bitmap f36599OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0O0O00 f36600OooO0O0;

    public static final class OooO00o implements o0ooOOo.OooO00o<Bitmap> {
        @Override // o00O0o0O.o0ooOOo.OooO00o
        public final o0ooOOo OooO00o(Object obj, o0O0O00 o0o0o00) {
            return new o000oOoO((Bitmap) obj, o0o0o00);
        }
    }

    public o000oOoO(@NotNull Bitmap bitmap, @NotNull o0O0O00 o0o0o00) {
        this.f36599OooO00o = bitmap;
        this.f36600OooO0O0 = o0o0o00;
    }

    @Override // p125o00O0o0O.o0ooOOo
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super o00oO0o> continuation) {
        return new oo000o(new BitmapDrawable(this.f36600OooO0O0.f36838OooO00o.getResources(), this.f36599OooO00o), false, DataSource.MEMORY);
    }
}
