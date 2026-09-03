package p662o0oooO0O;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends o0O0O0o0 {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Socket f59742OooOO0O;

    public o(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f59742OooOO0O = socket;
    }

    @Override // p662o0oooO0O.o0O0O0o0
    @NotNull
    public final IOException OooOO0O(@Nullable IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // p662o0oooO0O.o0O0O0o0
    public final void OooOO0o() {
        Socket socket = this.f59742OooOO0O;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (!o0OO.OooO0OO(e)) {
                throw e;
            }
            o0OOO00.f59784OooO00o.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            o0OOO00.f59784OooO00o.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
