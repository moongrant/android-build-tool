package p375o0OOoO00;

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
import p373o0OOoO.OooOO0;
import p374o0OOoO0.OooOOOO;
import p377o0OOoO0o.OooOO0O;
import p377o0OOoO0o.OooOOO0;
import p672o0oooo0O.oO000O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooOO0O f43223OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o00O0O f43224OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile int f43225OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile AtomicBoolean f43226OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Future<Integer> f43227OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Socket f43228OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile Future<Integer> f43229OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ReentrantLock f43230OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooOOO0 f43231OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public OooOO0 f43232OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final Oooo0 f43233OooOO0O;

    public final class OooO00o implements Callable<Integer> {
        public OooO00o() {
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws ExecutionException, InterruptedException {
            Future<Integer> future;
            int i;
            o00Oo0 o00oo1 = o00Oo0.this;
            Future<Integer> future2 = o00oo1.f43229OooO0o0;
            if ((future2 != null && !future2.isCancelled()) || ((future = o00oo1.f43229OooO0o0) != null && !future.isDone())) {
                oO000O0O.OooO00o(o00oo1.f43233OooOO0O.f43211OooO0Oo).OooO00o("Method connectInner, Disconnect Task is Running, waiting for it to finish", new Object[0]);
                Future<Integer> future3 = o00oo1.f43229OooO0o0;
                if (future3 != null) {
                    future3.get();
                }
            }
            int i2 = -1;
            if (!o00oo1.f43226OooO0OO.get()) {
                oO000O0O.OooO00o(o00oo1.f43233OooOO0O.f43211OooO0Oo).OooO00o("Method connectInner, after CreateSocket socket = " + o00oo1.f43228OooO0o, new Object[0]);
                if (!o00oo1.f43233OooOO0O.f43214OooO0oO.f43237OooO0o) {
                    ThreadPoolExecutor threadPoolExecutor = o000oOoO.f43220OooO00o;
                    o000oOoO.OooO00o(o00oo1.f43233OooOO0O.f43214OooO0oO);
                    oO000O0O.OooO00o(o00oo1.f43233OooOO0O.f43211OooO0Oo).OooO00o("Method startEventDispatcher", new Object[0]);
                }
                Oooo0 oooo0 = o00oo1.f43233OooOO0O;
                int i3 = oooo0.f43208OooO00o;
                long j = oooo0.f43209OooO0O0;
                oooo0.f43214OooO0oO.OooO0oO(new OooOOOO.OooO0O0(5, null));
                int i4 = 0;
                Throwable th = null;
                while (true) {
                    if (i4 < i3 && !o00oo1.f43226OooO0OO.get()) {
                        try {
                            Socket socket = new Socket();
                            socket.setSoTimeout(0);
                            oO000O0O.OooO00o(o00oo1.f43233OooOO0O.f43211OooO0Oo).OooO00o("Method createSocket, socket created", new Object[0]);
                            o00oo1.f43228OooO0o = socket;
                            Intrinsics.checkNotNull(socket);
                            o00O0O o00o0o2 = o00oo1.f43224OooO00o;
                            o00oo1.OooO0O0(socket, new InetSocketAddress(o00o0o2.f43221OooO00o, o00o0o2.f43222OooO0O0));
                            i = 0;
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            oO000O0O.OooO00o(o00oo1.f43233OooOO0O.f43211OooO0Oo).OooO0OO(th);
                            if (!(!o00oo1.f43226OooO0OO.get() && o00oo1.f43225OooO0O0 == 1)) {
                                i = -1;
                                break;
                            }
                            i4++;
                            TimeUnit.MILLISECONDS.sleep(j);
                            oO000O0O.OooO00o(o00oo1.f43233OooOO0O.f43211OooO0Oo).OooO00o(android.support.v4.media.OooO00o.OooO00o("Connection Retrying , retryTimes = ", i4), new Object[0]);
                        }
                    }
                    i = -1;
                    break;
                }
                oO000O0O.OooO00o OooO00o2 = oO000O0O.OooO00o(o00oo1.f43233OooOO0O.f43211OooO0Oo);
                StringBuilder sbOooO0O0 = o0000O0.OooO0O0("Method connectInner, after connect ,result = ", i, "，state = ");
                sbOooO0O0.append(o00oo1.f43225OooO0O0);
                OooO00o2.OooO00o(sbOooO0O0.toString(), new Object[0]);
                try {
                    o00oo1.f43230OooO0oO.lockInterruptibly();
                    if (o00oo1.f43225OooO0O0 == 1) {
                        if (i == 0) {
                            o00oo1.f43225OooO0O0 = 2;
                            o00oo1.f43233OooOO0O.f43214OooO0oO.OooO0oO(new OooOOOO.OooO0O0(3, null));
                        } else if (i == -1) {
                            o00oo1.f43225OooO0O0 = 3;
                            o00oo1.f43233OooOO0O.f43214OooO0oO.OooO0oO(new OooOOOO.OooO0O0(4, th));
                            o00oo1.OooO00o(true);
                            o00oo1.f43228OooO0o = null;
                        }
                    }
                    if (o00oo1.f43230OooO0oO.isHeldByCurrentThread()) {
                        o00oo1.f43230OooO0oO.unlock();
                    }
                    i2 = i;
                } catch (Throwable th3) {
                    if (o00oo1.f43230OooO0oO.isHeldByCurrentThread()) {
                        o00oo1.f43230OooO0oO.unlock();
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
            o00Oo0 o00oo1 = o00Oo0.this;
            Future<Integer> future2 = o00oo1.f43227OooO0Oo;
            if ((future2 != null && !future2.isCancelled()) || ((future = o00oo1.f43227OooO0Oo) != null && !future.isDone())) {
                Future<Integer> future3 = o00oo1.f43227OooO0Oo;
                if (future3 != null) {
                    future3.get();
                }
                o00oo1.OooO00o(false);
            }
            try {
                o00oo1.f43230OooO0oO.lockInterruptibly();
                if (o00oo1.f43225OooO0O0 == 4) {
                    o00oo1.f43225OooO0O0 = 5;
                }
                return 0;
            } finally {
                if (o00oo1.f43230OooO0oO.isHeldByCurrentThread()) {
                    o00oo1.f43230OooO0oO.unlock();
                }
            }
        }
    }

    public o00Oo0(@NotNull Oooo0 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f43233OooOO0O = config;
        this.f43224OooO00o = new o00O0O("", 0);
        this.f43226OooO0OO = new AtomicBoolean(false);
        this.f43230OooO0oO = new ReentrantLock();
    }

    public final void OooO00o(boolean z) throws IOException {
        OooOOO0 oooOOO0 = this.f43231OooO0oo;
        if (oooOOO0 != null) {
            oooOOO0.OooO0Oo();
        }
        OooOO0O oooOO0O = this.f43223OooO;
        if (oooOO0O != null) {
            oooOO0O.OooO0Oo();
        }
        OooOO0 oooOO1 = this.f43232OooOO0;
        if (oooOO1 != null) {
            oooOO1.OooO0Oo();
        }
        Socket socket = this.f43228OooO0o;
        if (socket != null) {
            socket.close();
        }
        this.f43231OooO0oo = null;
        this.f43223OooO = null;
        this.f43228OooO0o = null;
        if (z) {
            return;
        }
        this.f43233OooOO0O.f43214OooO0oO.OooO0Oo();
    }

    public final void OooO0O0(Socket socket, InetSocketAddress inetSocketAddress) throws IOException {
        Oooo0 oooo0 = this.f43233OooOO0O;
        socket.connect(inetSocketAddress, oooo0.f43210OooO0OO);
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        if (outputStream == null || inputStream == null) {
            throw new ConnectException("connect success ,but stream is null");
        }
        this.f43231OooO0oo = new OooOOO0(outputStream, oooo0);
        OooOO0 oooOO1 = new OooOO0(oooo0);
        this.f43232OooOO0 = oooOO1;
        Intrinsics.checkNotNull(oooOO1);
        this.f43223OooO = new OooOO0O(inputStream, oooOO1, oooo0);
        ThreadPoolExecutor threadPoolExecutor = o000oOoO.f43220OooO00o;
        OooOOO0 oooOOO0 = this.f43231OooO0oo;
        Intrinsics.checkNotNull(oooOOO0);
        o000oOoO.OooO00o(oooOOO0);
        OooOO0O oooOO0O = this.f43223OooO;
        Intrinsics.checkNotNull(oooOO0O);
        o000oOoO.OooO00o(oooOO0O);
        oooo0.f43215OooO0oo.OooO0OO();
        OooOO0 oooOO2 = this.f43232OooOO0;
        Intrinsics.checkNotNull(oooOO2);
        o000oOoO.OooO00o(oooOO2);
        oO000O0O.OooO00o(oooo0.f43211OooO0Oo).OooO00o("Method startIOTask", new Object[0]);
    }

    public final void OooO0OO(boolean z) {
        try {
            this.f43230OooO0oO.lockInterruptibly();
            if (this.f43225OooO0O0 == 1 || this.f43225OooO0O0 == 2) {
                if (this.f43225OooO0O0 == 2) {
                    OooO00o(z);
                    this.f43225OooO0O0 = 5;
                } else {
                    this.f43225OooO0O0 = 4;
                    this.f43229OooO0o0 = o000oOoO.OooO0O0(new OooO0O0());
                }
            }
        } finally {
            if (this.f43230OooO0oO.isHeldByCurrentThread()) {
                this.f43230OooO0oO.unlock();
            }
        }
    }
}
