package p220o00oO0o;

import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;
import p081o000OoO.o000oOoO;
import p145o00Oo0.o00000OO;
import p145o00Oo0.o0O0ooO;
import p145o00Oo0.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo {
    public static final p145o00Oo0.o0Oo0oo OooO00o(o000oOoO o000oooo2) {
        if (!o000oooo2.OooO0o0()) {
            return null;
        }
        Shader shader = o000oooo2.f28334OooO00o;
        if (shader == null) {
            return new o0O0ooO(o00000OO.OooO0O0(o000oooo2.f28336OooO0OO));
        }
        Intrinsics.checkNotNullParameter(shader, "shader");
        return new o0OO00O(shader);
    }
}
