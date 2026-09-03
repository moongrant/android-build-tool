package o00OO00O;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p224o00oOOo.o0OO00O;
import p662o0oooO0O.o0OOOO00;

/* JADX INFO: loaded from: classes2.dex */
@JvmName(name = "-FileSystems")
public final class OooO0o {
    public static final void OooO00o(@NotNull o0OO00O o0oo00o2, @NotNull o0OOOO00 o0oooo01) throws IOException {
        try {
            IOException iOException = null;
            for (o0OOOO00 path : (ArrayList) o0oo00o2.OooO0oO(o0oooo01)) {
                try {
                    if (o0oo00o2.OooO0oo(path).f59744OooO0O0) {
                        OooO00o(o0oo00o2, path);
                    }
                    Intrinsics.checkNotNullParameter(path, "path");
                    o0oo00o2.OooO0Oo(path);
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
