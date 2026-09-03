package p659o0oooO00;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class o00O000o extends o000000 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Socket f60236OooOO0O;

    public o00O000o(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f60236OooOO0O = socket;
    }

    @Override // p659o0oooO00.o000000
    @NotNull
    public final IOException OooOO0O(@Nullable IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // p659o0oooO00.o000000
    public final void OooOO0o() {
        Socket socket = this.f60236OooOO0O;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!o000O0Oo.OooO0OO(e)) {
                throw e;
            }
            o000OO0O.f60223OooO00o.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            o000OO0O.f60223OooO00o.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
