package p114o00O00o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p145o00Oo0.OooOo00;
import p145o00Oo0.o00000OO;
import p263o00ooo.o000O0;
import p263o00ooo.o000O0Oo;
import p263o00ooo.o000OO0O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f30273OooO00o = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) OooO00o.f30274Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<Handler> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f30274Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    @NotNull
    public static final o000OO0O OooO00o(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Intrinsics.checkNotNullExpressionValue(bitmap, "bitmap");
            Intrinsics.checkNotNullParameter(bitmap, "<this>");
            return new o000O0(new OooOo00(bitmap));
        }
        if (drawable instanceof ColorDrawable) {
            return new o000O0Oo(o00000OO.OooO0O0(((ColorDrawable) drawable).getColor()));
        }
        Drawable drawableMutate = drawable.mutate();
        Intrinsics.checkNotNullExpressionValue(drawableMutate, "mutate()");
        return new OooOO0O(drawableMutate);
    }
}
