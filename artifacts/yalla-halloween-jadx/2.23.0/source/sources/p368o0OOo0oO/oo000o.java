package p368o0OOo0oO;

import androidx.appcompat.widget.o0000O0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p369o0OOo0oo.o00oO0o;
import p371o0OOoO0.OooO0OO;
import p371o0OOoO0.OooO0o;
import p373o0OOoO0O.OooOOOO;
import p667o0oooOoO.wc;

/* JADX INFO: loaded from: classes4.dex */
public final class oo000o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO0OO f43999OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o00Ooo f44000OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile int f44001OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile AtomicBoolean f44002OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Future<Integer> f44003OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Socket f44004OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile Future<Integer> f44005OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ReentrantLock f44006OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooO0o f44007OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooOOOO f44008OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final o0OoOo0 f44009OooOO0O;

    public final class OooO00o implements Callable<Integer> {
        public OooO00o() {
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws ExecutionException, InterruptedException {
            Future<Integer> future;
            int i;
            oo000o oo000oVar = oo000o.this;
            Future<Integer> future2 = oo000oVar.f44005OooO0o0;
            if ((future2 != null && !future2.isCancelled()) || ((future = oo000oVar.f44005OooO0o0) != null && !future.isDone())) {
                wc.OooO00o(oo000oVar.f44009OooOO0O.f43994OooO0Oo).OooO00o("Method connectInner, Disconnect Task is Running, waiting for it to finish", new Object[0]);
                Future<Integer> future3 = oo000oVar.f44005OooO0o0;
                if (future3 != null) {
                    future3.get();
                }
            }
            int i2 = -1;
            if (!oo000oVar.f44002OooO0OO.get()) {
                wc.OooO00o(oo000oVar.f44009OooOO0O.f43994OooO0Oo).OooO00o("Method connectInner, after CreateSocket socket = " + oo000oVar.f44004OooO0o, new Object[0]);
                if (!oo000oVar.f44009OooOO0O.f43997OooO0oO.f43987OooO0o) {
                    ThreadPoolExecutor threadPoolExecutor = o00O0O.f43985OooO00o;
                    o00O0O.OooO00o(oo000oVar.f44009OooOO0O.f43997OooO0oO);
                    wc.OooO00o(oo000oVar.f44009OooOO0O.f43994OooO0Oo).OooO00o("Method startEventDispatcher", new Object[0]);
                }
                o0OoOo0 o0oooo0 = oo000oVar.f44009OooOO0O;
                int i3 = o0oooo0.f43991OooO00o;
                long j = o0oooo0.f43992OooO0O0;
                o0oooo0.f43997OooO0oO.OooO0oO(new o00oO0o.OooO0O0(5, null));
                int i4 = 0;
                Throwable th = null;
                while (true) {
                    if (i4 < i3 && !oo000oVar.f44002OooO0OO.get()) {
                        try {
                            Socket socket = new Socket();
                            socket.setSoTimeout(0);
                            wc.OooO00o(oo000oVar.f44009OooOO0O.f43994OooO0Oo).OooO00o("Method createSocket, socket created", new Object[0]);
                            oo000oVar.f44004OooO0o = socket;
                            Intrinsics.checkNotNull(socket);
                            o00Ooo o00ooo2 = oo000oVar.f44000OooO00o;
                            oo000oVar.OooO0O0(socket, new InetSocketAddress(o00ooo2.f43989OooO00o, o00ooo2.f43990OooO0O0));
                            i = 0;
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            wc.OooO00o(oo000oVar.f44009OooOO0O.f43994OooO0Oo).OooO0OO(th);
                            if (!(!oo000oVar.f44002OooO0OO.get() && oo000oVar.f44001OooO0O0 == 1)) {
                                i = -1;
                                break;
                            }
                            i4++;
                            TimeUnit.MILLISECONDS.sleep(j);
                            wc.OooO00o(oo000oVar.f44009OooOO0O.f43994OooO0Oo).OooO00o(android.support.v4.media.OooO00o.OooO00o("Connection Retrying , retryTimes = ", i4), new Object[0]);
                        }
                    }
                    i = -1;
                    break;
                }
                wc.OooO00o OooO00o2 = wc.OooO00o(oo000oVar.f44009OooOO0O.f43994OooO0Oo);
                StringBuilder sbOooO00o = o0000O0.OooO00o("Method connectInner, after connect ,result = ", i, "，state = ");
                sbOooO00o.append(oo000oVar.f44001OooO0O0);
                OooO00o2.OooO00o(sbOooO00o.toString(), new Object[0]);
                try {
                    oo000oVar.f44006OooO0oO.lockInterruptibly();
                    if (oo000oVar.f44001OooO0O0 == 1) {
                        if (i == 0) {
                            oo000oVar.f44001OooO0O0 = 2;
                            oo000oVar.f44009OooOO0O.f43997OooO0oO.OooO0oO(new o00oO0o.OooO0O0(3, null));
                        } else if (i == -1) {
                            oo000oVar.f44001OooO0O0 = 3;
                            oo000oVar.f44009OooOO0O.f43997OooO0oO.OooO0oO(new o00oO0o.OooO0O0(4, th));
                            oo000oVar.OooO00o(true);
                            oo000oVar.f44004OooO0o = null;
                        }
                    }
                    if (oo000oVar.f44006OooO0oO.isHeldByCurrentThread()) {
                        oo000oVar.f44006OooO0oO.unlock();
                    }
                    i2 = i;
                } catch (Throwable th3) {
                    if (oo000oVar.f44006OooO0oO.isHeldByCurrentThread()) {
                        oo000oVar.f44006OooO0oO.unlock();
                    }
                    throw th3;
                }
            }
            return Integer.valueOf(i2);
        }
    }

    public final class OooO0O0 implements Callable<Integer> {
        public OooO0O0() {
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws ExecutionException, InterruptedException, IOException {
            Future<Integer> future;
            oo000o oo000oVar = oo000o.this;
            Future<Integer> future2 = oo000oVar.f44003OooO0Oo;
            if ((future2 != null && !future2.isCancelled()) || ((future = oo000oVar.f44003OooO0Oo) != null && !future.isDone())) {
                Future<Integer> future3 = oo000oVar.f44003OooO0Oo;
                if (future3 != null) {
                    future3.get();
                }
                oo000oVar.OooO00o(false);
            }
            try {
                oo000oVar.f44006OooO0oO.lockInterruptibly();
                if (oo000oVar.f44001OooO0O0 == 4) {
                    oo000oVar.f44001OooO0O0 = 5;
                }
                return 0;
            } finally {
                if (oo000oVar.f44006OooO0oO.isHeldByCurrentThread()) {
                    oo000oVar.f44006OooO0oO.unlock();
                }
            }
        }
    }

    public oo000o(@NotNull o0OoOo0 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f44009OooOO0O = config;
        this.f44000OooO00o = new o00Ooo("", 0);
        this.f44002OooO0OO = new AtomicBoolean(false);
        this.f44006OooO0oO = new ReentrantLock();
    }

    public final void OooO00o(boolean z) throws IOException {
        OooO0o oooO0o = this.f44007OooO0oo;
        if (oooO0o != null) {
            oooO0o.OooO0Oo();
        }
        OooO0OO oooO0OO = this.f43999OooO;
        if (oooO0OO != null) {
            oooO0OO.OooO0Oo();
        }
        OooOOOO oooOOOO = this.f44008OooOO0;
        if (oooOOOO != null) {
            oooOOOO.OooO0Oo();
        }
        Socket socket = this.f44004OooO0o;
        if (socket != null) {
            socket.close();
        }
        this.f44007OooO0oo = null;
        this.f43999OooO = null;
        this.f44004OooO0o = null;
        if (z) {
            return;
        }
        this.f44009OooOO0O.f43997OooO0oO.OooO0Oo();
    }

    public final void OooO0O0(Socket socket, InetSocketAddress inetSocketAddress) throws IOException {
        o0OoOo0 o0oooo0 = this.f44009OooOO0O;
        socket.connect(inetSocketAddress, o0oooo0.f43993OooO0OO);
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        if (outputStream == null || inputStream == null) {
            throw new ConnectException("connect success ,but stream is null");
        }
        this.f44007OooO0oo = new OooO0o(outputStream, o0oooo0);
        OooOOOO oooOOOO = new OooOOOO(o0oooo0);
        this.f44008OooOO0 = oooOOOO;
        Intrinsics.checkNotNull(oooOOOO);
        this.f43999OooO = new OooO0OO(inputStream, oooOOOO, o0oooo0);
        ThreadPoolExecutor threadPoolExecutor = o00O0O.f43985OooO00o;
        OooO0o oooO0o = this.f44007OooO0oo;
        Intrinsics.checkNotNull(oooO0o);
        o00O0O.OooO00o(oooO0o);
        OooO0OO oooO0OO = this.f43999OooO;
        Intrinsics.checkNotNull(oooO0OO);
        o00O0O.OooO00o(oooO0OO);
        o0oooo0.f43998OooO0oo.OooO0OO();
        OooOOOO oooOOOO2 = this.f44008OooOO0;
        Intrinsics.checkNotNull(oooOOOO2);
        o00O0O.OooO00o(oooOOOO2);
        wc.OooO00o(o0oooo0.f43994OooO0Oo).OooO00o("Method startIOTask", new Object[0]);
    }

    public final void OooO0OO(boolean z) {
        try {
            this.f44006OooO0oO.lockInterruptibly();
            if (this.f44001OooO0O0 == 1 || this.f44001OooO0O0 == 2) {
                if (this.f44001OooO0O0 == 2) {
                    OooO00o(z);
                    this.f44001OooO0O0 = 5;
                } else {
                    this.f44001OooO0O0 = 4;
                    this.f44005OooO0o0 = o00O0O.OooO0O0(new OooO0O0());
                }
            }
        } finally {
            if (this.f44006OooO0oO.isHeldByCurrentThread()) {
                this.f44006OooO0oO.unlock();
            }
        }
    }
}
