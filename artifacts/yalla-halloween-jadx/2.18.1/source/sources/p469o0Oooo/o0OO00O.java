package p469o0Oooo;

import androidx.appcompat.widget.o00000O0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p472o0OoooO.o0O0ooO;
import p475o0OoooOo.oO000;
import p475o0OoooOo.oO000O0;
import p475o0OoooOo.oO000O0O;
import p477o0Ooooo0.o00OO0OO;
import p705oO0Ooo0O.o00Ooo;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public oO000 f40589OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public o0Oo0oo f40590OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public volatile int f40591OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public volatile AtomicBoolean f40592OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public volatile Future<Integer> f40593OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public Socket f40594OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public volatile Future<Integer> f40595OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ReentrantLock f40596OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public oO000O0 f40597OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public oO000O0O f40598OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public o00OO0OO f40599OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final o00oO0o f40600OooOO0o;

    public final class OooO00o implements Callable<Integer> {
        public OooO00o() {
        }

        @Override // java.util.concurrent.Callable
        public final Integer call() throws ExecutionException, InterruptedException {
            Future<Integer> future;
            int i;
            o0OO00O o0oo00o2 = o0OO00O.this;
            Future<Integer> future2 = o0oo00o2.f40595OooO0o0;
            if ((future2 != null && !future2.isCancelled()) || ((future = o0oo00o2.f40595OooO0o0) != null && !future.isDone())) {
                o00Ooo.OooO00o(o0oo00o2.f40600OooOO0o.f40584OooO0Oo).OooO00o("Method connectInner, Disconnect Task is Running, waiting for it to finish", new Object[0]);
                Future<Integer> future3 = o0oo00o2.f40595OooO0o0;
                if (future3 != null) {
                    future3.get();
                }
            }
            int i2 = -1;
            if (!o0oo00o2.f40592OooO0OO.get()) {
                o00Ooo.OooO0OO oooO0OOOooO00o = o00Ooo.OooO00o(o0oo00o2.f40600OooOO0o.f40584OooO0Oo);
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Method connectInner, after CreateSocket socket = ");
                sbOooO0o0.append(o0oo00o2.f40594OooO0o);
                oooO0OOOooO00o.OooO00o(sbOooO0o0.toString(), new Object[0]);
                if (!o0oo00o2.f40600OooOO0o.f40588OooO0oo.f40605Oooo0oo) {
                    o0ooOOo o0ooooo2 = o0ooOOo.f40609OooO0O0;
                    o0ooOOo.OooO00o(o0oo00o2.f40600OooOO0o.f40588OooO0oo);
                    o00Ooo.OooO00o(o0oo00o2.f40600OooOO0o.f40584OooO0Oo).OooO00o("Method startEventDispatcher", new Object[0]);
                }
                o00oO0o o00oo0o2 = o0oo00o2.f40600OooOO0o;
                int i3 = o00oo0o2.f40581OooO00o;
                long j = o00oo0o2.f40582OooO0O0;
                o00oo0o2.f40588OooO0oo.OooO0oO(new o0O0ooO.OooO0O0(5, null));
                int i4 = 0;
                Throwable th = null;
                while (true) {
                    if (i4 < i3 && !o0oo00o2.f40592OooO0OO.get()) {
                        try {
                            Socket socket = new Socket();
                            socket.setSoTimeout(0);
                            o00Ooo.OooO00o(o0oo00o2.f40600OooOO0o.f40584OooO0Oo).OooO00o("Method createSocket, socket created", new Object[0]);
                            o0oo00o2.f40594OooO0o = socket;
                            Intrinsics.checkNotNull(socket);
                            o0Oo0oo o0oo0oo2 = o0oo00o2.f40590OooO00o;
                            o0oo00o2.OooO0O0(socket, new InetSocketAddress(o0oo0oo2.f40606OooO00o, o0oo0oo2.f40607OooO0O0));
                            i = 0;
                            break;
                        } catch (Throwable th2) {
                            th = th2;
                            o00Ooo.OooO00o(o0oo00o2.f40600OooOO0o.f40584OooO0Oo).OooO0OO(th);
                            if (!(!o0oo00o2.f40592OooO0OO.get() && o0oo00o2.f40591OooO0O0 == 1)) {
                                i = -1;
                                break;
                            }
                            i4++;
                            TimeUnit.MILLISECONDS.sleep(j);
                            o00Ooo.OooO00o(o0oo00o2.f40600OooOO0o.f40584OooO0Oo).OooO00o(android.support.v4.media.OooO00o.OooO00o("Connection Retrying , retryTimes = ", i4), new Object[0]);
                        }
                    }
                    i = -1;
                    break;
                }
                o00Ooo.OooO0OO oooO0OOOooO00o2 = o00Ooo.OooO00o(o0oo00o2.f40600OooOO0o.f40584OooO0Oo);
                StringBuilder sbOooO00o = o00000O0.OooO00o("Method connectInner, after connect ,result = ", i, "，state = ");
                sbOooO00o.append(o0oo00o2.f40591OooO0O0);
                oooO0OOOooO00o2.OooO00o(sbOooO00o.toString(), new Object[0]);
                try {
                    o0oo00o2.f40596OooO0oO.lockInterruptibly();
                    if (o0oo00o2.f40591OooO0O0 == 1) {
                        if (i == 0) {
                            o0oo00o2.f40591OooO0O0 = 2;
                            o0oo00o2.f40600OooOO0o.f40588OooO0oo.OooO0oO(new o0O0ooO.OooO0O0(3, null));
                        } else if (i == -1) {
                            o0oo00o2.f40591OooO0O0 = 3;
                            o0oo00o2.f40600OooOO0o.f40588OooO0oo.OooO0oO(new o0O0ooO.OooO0O0(4, th));
                            o0oo00o2.OooO00o(true);
                            o0oo00o2.f40594OooO0o = null;
                        }
                    }
                    if (o0oo00o2.f40596OooO0oO.isHeldByCurrentThread()) {
                        o0oo00o2.f40596OooO0oO.unlock();
                    }
                    i2 = i;
                } catch (Throwable th3) {
                    if (o0oo00o2.f40596OooO0oO.isHeldByCurrentThread()) {
                        o0oo00o2.f40596OooO0oO.unlock();
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
            o0OO00O o0oo00o2 = o0OO00O.this;
            Future<Integer> future2 = o0oo00o2.f40593OooO0Oo;
            if ((future2 != null && !future2.isCancelled()) || ((future = o0oo00o2.f40593OooO0Oo) != null && !future.isDone())) {
                Future<Integer> future3 = o0oo00o2.f40593OooO0Oo;
                if (future3 != null) {
                    future3.get();
                }
                o0oo00o2.OooO00o(false);
            }
            try {
                o0oo00o2.f40596OooO0oO.lockInterruptibly();
                if (o0oo00o2.f40591OooO0O0 == 4) {
                    o0oo00o2.f40591OooO0O0 = 5;
                }
                return 0;
            } finally {
                if (o0oo00o2.f40596OooO0oO.isHeldByCurrentThread()) {
                    o0oo00o2.f40596OooO0oO.unlock();
                }
            }
        }
    }

    public o0OO00O(@NotNull o00oO0o config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f40600OooOO0o = config;
        this.f40590OooO00o = new o0Oo0oo("", 0);
        this.f40592OooO0OO = new AtomicBoolean(false);
        this.f40596OooO0oO = new ReentrantLock();
    }

    public final void OooO00o(boolean z) throws IOException {
        oO000O0 oo000o0 = this.f40597OooO0oo;
        if (oo000o0 != null) {
            oo000o0.OooO0Oo();
        }
        oO000 oo000 = this.f40589OooO;
        if (oo000 != null) {
            oo000.OooO0Oo();
        }
        oO000O0O oo000o0o = this.f40598OooOO0;
        if (oo000o0o != null) {
            oo000o0o.OooO0Oo();
        }
        o00OO0OO o00oo0oo = this.f40599OooOO0O;
        if (o00oo0oo != null) {
            o00oo0oo.OooO0Oo();
        }
        Socket socket = this.f40594OooO0o;
        if (socket != null) {
            socket.close();
        }
        this.f40597OooO0oo = null;
        this.f40589OooO = null;
        this.f40598OooOO0 = null;
        this.f40594OooO0o = null;
        if (z) {
            return;
        }
        this.f40600OooOO0o.f40588OooO0oo.OooO0Oo();
    }

    public final void OooO0O0(Socket socket, InetSocketAddress inetSocketAddress) throws IOException {
        socket.connect(inetSocketAddress, this.f40600OooOO0o.f40583OooO0OO);
        InputStream inputStream = socket.getInputStream();
        OutputStream outputStream = socket.getOutputStream();
        if (outputStream == null || inputStream == null) {
            throw new ConnectException("connect success ,but stream is null");
        }
        this.f40597OooO0oo = new oO000O0(outputStream, this.f40600OooOO0o);
        o00OO0OO o00oo0oo = new o00OO0OO(this.f40600OooOO0o);
        this.f40599OooOO0O = o00oo0oo;
        Intrinsics.checkNotNull(o00oo0oo);
        this.f40589OooO = new oO000(inputStream, o00oo0oo, this.f40600OooOO0o);
        o0ooOOo o0ooooo2 = o0ooOOo.f40609OooO0O0;
        oO000O0 oo000o0 = this.f40597OooO0oo;
        Intrinsics.checkNotNull(oo000o0);
        o0ooOOo.OooO00o(oo000o0);
        oO000 oo000 = this.f40589OooO;
        Intrinsics.checkNotNull(oo000);
        o0ooOOo.OooO00o(oo000);
        this.f40600OooOO0o.f40580OooO.OooO0O0();
        o00OO0OO o00oo0oo2 = this.f40599OooOO0O;
        Intrinsics.checkNotNull(o00oo0oo2);
        o0ooOOo.OooO00o(o00oo0oo2);
        o00Ooo.OooO00o(this.f40600OooOO0o.f40584OooO0Oo).OooO00o("Method startIOTask", new Object[0]);
    }

    public final void OooO0OO(boolean z) {
        try {
            this.f40596OooO0oO.lockInterruptibly();
            if (this.f40591OooO0O0 == 1 || this.f40591OooO0O0 == 2) {
                if (this.f40591OooO0O0 == 2) {
                    OooO00o(z);
                    this.f40591OooO0O0 = 5;
                } else {
                    this.f40591OooO0O0 = 4;
                    o0ooOOo o0ooooo2 = o0ooOOo.f40609OooO0O0;
                    this.f40595OooO0o0 = o0ooOOo.OooO0O0(new OooO0O0());
                }
            }
        } finally {
            if (this.f40596OooO0oO.isHeldByCurrentThread()) {
                this.f40596OooO0oO.unlock();
            }
        }
    }
}
