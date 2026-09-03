package o00O0;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import coil.decode.DataSource;
import coil.size.Size;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import p115o00O00oO.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 implements OooOO0O<Bitmap> {
    @Override // o00O0.OooOO0O
    public final boolean OooO00o(Bitmap bitmap) {
        OooOO0O.OooO00o.OooO00o(this, bitmap);
        return true;
    }

    @Override // o00O0.OooOO0O
    public final String OooO0O0(Bitmap bitmap) {
        Bitmap data = bitmap;
        Intrinsics.checkNotNullParameter(data, "data");
        return null;
    }

    @Override // o00O0.OooOO0O
    public final Object OooO0OO(p113o00O00Oo.OooO0O0 oooO0O0, Bitmap bitmap, Size size, o00oO0o o00oo0o2, Continuation continuation) {
        Resources resources = o00oo0o2.f30375OooO00o.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "context.resources");
        return new OooO(new BitmapDrawable(resources, bitmap), false, DataSource.MEMORY);
    }
}
