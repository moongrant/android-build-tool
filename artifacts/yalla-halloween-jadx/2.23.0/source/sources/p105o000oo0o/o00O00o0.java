package p105o000oo0o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil.decode.DataSource;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p109o000ooo.o0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00o0 implements o00O0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Bitmap f35769OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0Oo0oo f35770OooO0O0;

    public static final class OooO00o implements o00O0OO0.OooO00o<Bitmap> {
        @Override // o000oo0o.o00O0OO0.OooO00o
        public final o00O0OO0 OooO00o(Object obj, o0Oo0oo o0oo0oo2) {
            return new o00O00o0((Bitmap) obj, o0oo0oo2);
        }
    }

    public o00O00o0(@NotNull Bitmap bitmap, @NotNull o0Oo0oo o0oo0oo2) {
        this.f35769OooO00o = bitmap;
        this.f35770OooO0O0 = o0oo0oo2;
    }

    @Override // p105o000oo0o.o00O0OO0
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super o00O0O0O> continuation) {
        return new o00O0O0(new BitmapDrawable(this.f35770OooO0O0.f35863OooO00o.getResources(), this.f35769OooO00o), false, DataSource.MEMORY);
    }
}
