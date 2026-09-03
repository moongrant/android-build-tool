package p102o000oo0;

import com.facebook.share.internal.ShareInternalUtility;
import java.io.IOException;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p659o0oooO00.o000OO;
import p659o0oooO00.o000OO00;
import p659o0oooO00.o00O000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 extends o000OO {
    @Override // p659o0oooO00.o0000O0O
    @NotNull
    public final o00O000 OooOO0O(@NotNull o000OO00 file) throws IOException {
        o000OO00 dir = file.OooO0O0();
        if (dir != null) {
            Intrinsics.checkNotNullParameter(dir, "dir");
            Intrinsics.checkNotNullParameter(dir, "dir");
            Intrinsics.checkNotNullParameter(this, "<this>");
            Intrinsics.checkNotNullParameter(dir, "dir");
            ArrayDeque<o000OO00> arrayDeque = new ArrayDeque();
            while (dir != null && !OooO0o(dir)) {
                arrayDeque.addFirst(dir);
                dir = dir.OooO0O0();
            }
            for (o000OO00 dir2 : arrayDeque) {
                Intrinsics.checkNotNullParameter(dir2, "dir");
                OooO0OO(dir2);
            }
        }
        Intrinsics.checkNotNullParameter(file, "file");
        o000OO.OooOOO0(file, "sink", ShareInternalUtility.STAGING_PARAM);
        return this.f60220OooO0O0.OooOO0O(file);
    }
}
