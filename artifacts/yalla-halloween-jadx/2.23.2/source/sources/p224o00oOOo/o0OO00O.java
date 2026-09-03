package p224o00oOOo;

import com.facebook.share.internal.ShareInternalUtility;
import java.io.IOException;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p662o0oooO0O.o0OO000o;
import p662o0oooO0O.o0OOOO00;
import p662o0oooO0O.ooo0Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O extends o0OO000o {
    @Override // p662o0oooO0O.o0OO000
    @NotNull
    public final ooo0Oo0 OooOO0O(@NotNull o0OOOO00 file) throws IOException {
        o0OOOO00 dir = file.OooO0O0();
        if (dir != null) {
            Intrinsics.checkNotNullParameter(dir, "dir");
            Intrinsics.checkNotNullParameter(dir, "dir");
            Intrinsics.checkNotNullParameter(this, "<this>");
            Intrinsics.checkNotNullParameter(dir, "dir");
            ArrayDeque<o0OOOO00> arrayDeque = new ArrayDeque();
            while (dir != null && !OooO0o(dir)) {
                arrayDeque.addFirst(dir);
                dir = dir.OooO0O0();
            }
            for (o0OOOO00 dir2 : arrayDeque) {
                Intrinsics.checkNotNullParameter(dir2, "dir");
                OooO0OO(dir2);
            }
        }
        Intrinsics.checkNotNullParameter(file, "file");
        o0OO000o.OooOOO0(file, "sink", ShareInternalUtility.STAGING_PARAM);
        return this.f59772OooO0O0.OooOO0O(file);
    }
}
