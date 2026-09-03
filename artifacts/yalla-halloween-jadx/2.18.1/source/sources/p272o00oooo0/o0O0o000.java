package p272o00oooo0;

import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O0o000 f34968OooO00o = new o0O0o000();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static o0O0o00O f34969OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static String f34970OooO0OO = "YL_APM";

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static boolean f34971OooO0Oo;

    public static final class OooO00o implements o0O0o00O {
        @Override // p272o00oooo0.o0O0o00O
        public final void OooO00o(int i, @NotNull String tag, @NotNull String content) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(content, "content");
            if (i == 3) {
                Log.d(tag, content);
            } else if (i == 4) {
                Log.i(tag, content);
            } else {
                if (i != 6) {
                    return;
                }
                Log.e(tag, content);
            }
        }
    }

    public final void OooO00o(@NotNull String debug) {
        Intrinsics.checkNotNullParameter(debug, "debug");
        if (f34971OooO0Oo) {
            f34969OooO0O0.OooO00o(3, f34970OooO0OO, debug);
        }
    }

    public final void OooO0O0(@NotNull String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (f34971OooO0Oo) {
            f34969OooO0O0.OooO00o(6, f34970OooO0OO, error);
        }
    }
}
