package p115o00O00oO;

import android.graphics.drawable.ColorDrawable;
import coil.size.Size;
import kotlin.coroutines.Continuation;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p113o00O00Oo.OooO0O0;
import p674o0oooo0.o00Oo00;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 implements Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OoOo0 f30386OooO00o = new o0OoOo0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooOo f30387OooO0O0 = new OooOo(new ColorDrawable(), false);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final o00Oo00 f30388OooO0OO = new o00Oo00();

    @Override // p115o00O00oO.Oooo0
    public final boolean OooO00o(@NotNull o0oOOo source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return false;
    }

    @Override // p115o00O00oO.Oooo0
    @Nullable
    public final Object OooO0O0(@NotNull OooO0O0 oooO0O0, @NotNull o0oOOo o0oooo2, @NotNull Size size, @NotNull o00oO0o o00oo0o2, @NotNull Continuation<? super OooOo> continuation) {
        try {
            o0oooo2.OooOO0O(f30388OooO0OO);
            CloseableKt.closeFinally(o0oooo2, null);
            return f30387OooO0O0;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(o0oooo2, th);
                throw th2;
            }
        }
    }
}
