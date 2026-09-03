package p660o0ooo0o0;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O0O implements o00O0OO0 {
    @Override // p660o0ooo0o0.o00O0OO0
    @NotNull
    public final List<InetAddress> lookup(@NotNull String hostname) throws UnknownHostException {
        Intrinsics.checkNotNullParameter(hostname, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(hostname);
            Intrinsics.checkNotNullExpressionValue(allByName, "InetAddress.getAllByName(hostname)");
            return ArraysKt.toList(allByName);
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException(OooOo00.OooO0Oo("Broken system behaviour for dns lookup of ", hostname));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }
}
