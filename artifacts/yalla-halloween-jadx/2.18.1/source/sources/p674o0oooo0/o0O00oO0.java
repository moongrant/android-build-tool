package p674o0oooo0;

import OooO00o.OooO00o;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O00oO0 extends o0o0Oo {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Socket f52075OooOO0o;

    public o0O00oO0(@NotNull Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f52075OooOO0o = socket;
    }

    @Override // p674o0oooo0.o0o0Oo
    @NotNull
    public final IOException OooOO0O(@Nullable IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // p674o0oooo0.o0o0Oo
    public final void OooOO0o() {
        try {
            this.f52075OooOO0o.close();
        } catch (AssertionError e) {
            if (!o0O000Oo.OooO0Oo(e)) {
                throw e;
            }
            Logger logger = o0O000o0.f52053OooO00o;
            Level level = Level.WARNING;
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Failed to close timed out socket ");
            sbOooO0o0.append(this.f52075OooOO0o);
            logger.log(level, sbOooO0o0.toString(), (Throwable) e);
        } catch (Exception e2) {
            Logger logger2 = o0O000o0.f52053OooO00o;
            Level level2 = Level.WARNING;
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Failed to close timed out socket ");
            sbOooO0o1.append(this.f52075OooOO0o);
            logger2.log(level2, sbOooO0o1.toString(), (Throwable) e2);
        }
    }
}
