package p125o00O0o0O;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import coil.decode.DataSource;
import kotlin.coroutines.Continuation;
import o00O00OO.OooOOO;
import o00OO00O.OooOo00;
import o00OO00O.Oooo000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p131o00O0oo0.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo implements o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Drawable f36603OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0O0O00 f36604OooO0O0;

    public static final class OooO00o implements o0ooOOo.OooO00o<Drawable> {
        @Override // o00O0o0O.o0ooOOo.OooO00o
        public final o0ooOOo OooO00o(Object obj, o0O0O00 o0o0o00) {
            return new o00Ooo((Drawable) obj, o0o0o00);
        }
    }

    public o00Ooo(@NotNull Drawable drawable, @NotNull o0O0O00 o0o0o00) {
        this.f36603OooO00o = drawable;
        this.f36604OooO0O0 = o0o0o00;
    }

    @Override // p125o00O0o0O.o0ooOOo
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super o00oO0o> continuation) {
        Bitmap.Config[] configArr = OooOo00.f37081OooO00o;
        Drawable bitmapDrawable = this.f36603OooO00o;
        boolean z = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof OooOOO);
        if (z) {
            o0O0O00 o0o0o00 = this.f36604OooO0O0;
            bitmapDrawable = new BitmapDrawable(o0o0o00.f36838OooO00o.getResources(), Oooo000.OooO00o(bitmapDrawable, o0o0o00.f36839OooO0O0, o0o0o00.f36841OooO0Oo, o0o0o00.f36843OooO0o0, o0o0o00.f36842OooO0o));
        }
        return new oo000o(bitmapDrawable, z, DataSource.MEMORY);
    }
}
