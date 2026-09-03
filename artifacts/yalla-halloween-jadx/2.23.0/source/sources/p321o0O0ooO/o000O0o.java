package p321o0O0ooO;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p102o000oo0.OooOOO0;
import p659o0oooO00.o000OO00;

/* JADX INFO: loaded from: classes2.dex */
@JvmName(name = "-FileSystems")
public final class o000O0o {
    public static final void OooO00o(@NotNull OooOOO0 oooOOO0, @NotNull o000OO00 o000oo01) throws IOException {
        try {
            IOException iOException = null;
            for (o000OO00 path : (ArrayList) oooOOO0.OooO0oO(o000oo01)) {
                try {
                    if (oooOOO0.OooO0oo(path).f60188OooO0O0) {
                        OooO00o(oooOOO0, path);
                    }
                    Intrinsics.checkNotNullParameter(path, "path");
                    oooOOO0.OooO0Oo(path);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
