package p105o000oo0o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import coil.decode.DataSource;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p079o000Oo0o.o00O000;
import p109o000ooo.o0Oo0oo;
import p321o0O0ooO.o000O0O0;
import p321o0O0ooO.o000OO00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0O00 implements o00O0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Drawable f35774OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0Oo0oo f35775OooO0O0;

    public static final class OooO00o implements o00O0OO0.OooO00o<Drawable> {
        @Override // o000oo0o.o00O0OO0.OooO00o
        public final o00O0OO0 OooO00o(Object obj, o0Oo0oo o0oo0oo2) {
            return new o00O0O00((Drawable) obj, o0oo0oo2);
        }
    }

    public o00O0O00(@NotNull Drawable drawable, @NotNull o0Oo0oo o0oo0oo2) {
        this.f35774OooO00o = drawable;
        this.f35775OooO0O0 = o0oo0oo2;
    }

    @Override // p105o000oo0o.o00O0OO0
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super o00O0O0O> continuation) {
        Bitmap.Config[] configArr = o000O0O0.f42845OooO00o;
        Drawable bitmapDrawable = this.f35774OooO00o;
        boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof o00O000);
        if (z) {
            o0Oo0oo o0oo0oo2 = this.f35775OooO0O0;
            bitmapDrawable = new BitmapDrawable(o0oo0oo2.f35863OooO00o.getResources(), o000OO00.OooO00o(bitmapDrawable, o0oo0oo2.f35864OooO0O0, o0oo0oo2.f35866OooO0Oo, o0oo0oo2.f35868OooO0o0, o0oo0oo2.f35867OooO0o));
        }
        return new o00O0O0(bitmapDrawable, z, DataSource.MEMORY);
    }
}
