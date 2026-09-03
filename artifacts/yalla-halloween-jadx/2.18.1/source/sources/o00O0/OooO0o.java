package o00O0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import coil.decode.DataSource;
import coil.size.Size;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p115o00O00oO.o000oOoO;
import p115o00O00oO.o00oO0o;
import p119o00O0Oo0.o00O0O;
import p660o0ooo0o0.o00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o implements OooOO0O<Drawable> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000oOoO f30072OooO00o;

    public OooO0o(@NotNull o000oOoO drawableDecoder) {
        Intrinsics.checkNotNullParameter(drawableDecoder, "drawableDecoder");
        this.f30072OooO00o = drawableDecoder;
    }

    @Override // o00O0.OooOO0O
    public final boolean OooO00o(Drawable drawable) {
        OooOO0O.OooO00o.OooO00o(this, drawable);
        return true;
    }

    @Override // o00O0.OooOO0O
    public final String OooO0O0(Drawable drawable) {
        Drawable data = drawable;
        Intrinsics.checkNotNullParameter(data, "data");
        return null;
    }

    @Override // o00O0.OooOO0O
    public final Object OooO0OO(p113o00O00Oo.OooO0O0 oooO0O0, Drawable drawable, Size size, o00oO0o o00oo0o2, Continuation continuation) {
        Drawable bitmapDrawable = drawable;
        o00O o00o2 = o00O0O.f30749OooO00o;
        Intrinsics.checkNotNullParameter(bitmapDrawable, "<this>");
        boolean z = (bitmapDrawable instanceof p103o000oo00.OooOo) || (bitmapDrawable instanceof VectorDrawable);
        if (z) {
            Bitmap bitmapOooO00o = this.f30072OooO00o.OooO00o(bitmapDrawable, o00oo0o2.f30376OooO0O0, size, o00oo0o2.f30378OooO0Oo, o00oo0o2.f30380OooO0o0);
            Resources resources = o00oo0o2.f30375OooO00o.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
            bitmapDrawable = new BitmapDrawable(resources, bitmapOooO00o);
        }
        return new OooO(bitmapDrawable, z, DataSource.MEMORY);
    }
}
