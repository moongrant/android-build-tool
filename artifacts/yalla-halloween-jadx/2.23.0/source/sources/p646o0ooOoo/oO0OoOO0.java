package p646o0ooOoo;

import java.io.IOException;
import java.net.Socket;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.StreamResetException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p634o0ooO0oO.o00O00;
import p634o0ooO0oO.o00OO;
import p634o0ooO0oO.o00OO00O;
import p634o0ooO0oO.o0O00000;
import p635o0ooO0oo.o0O000o0;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0OoOO0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f59675OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final oO000o00 f59676OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00O00 f59677OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final oO0Oo0oo f59678OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00OO00O f59679OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public oO00O0o0 f59680OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public oO00O0o0.OooO00o f59681OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f59682OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f59683OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public o0O00000 f59684OooOO0;

    public oO0OoOO0(@NotNull oO000o00 connectionPool, @NotNull o00O00 address, @NotNull oO0Oo0oo call, @NotNull o00OO00O eventListener) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f59676OooO00o = connectionPool;
        this.f59677OooO0O0 = address;
        this.f59678OooO0OO = call;
        this.f59679OooO0Oo = eventListener;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0158 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x007e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x0088  */
    /* JADX WARN: Code duplicated, block: B:43:0x0091  */
    /* JADX WARN: Code duplicated, block: B:45:0x009c  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:64:0x013b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0157  */
    public final oO000OOo OooO00o(int i, int i2, int i3, int i4, boolean z, boolean z2) throws IOException {
        o0O00000 o0o00000;
        oO00O0o0.OooO00o oooO00o;
        oO00O0o0 oo00o0o0;
        oO00O0o0.OooO00o oooO00oOooO0O0;
        List<o0O00000> list;
        oO00O0o0.OooO00o oooO00o2;
        oO000OOo connection;
        Socket socketOooOO0;
        while (!this.f59678OooO0OO.f59667OooOOoo) {
            oO000OOo oo000ooo = this.f59678OooO0OO.f59662OooOOO0;
            if (oo000ooo != null) {
                synchronized (oo000ooo) {
                    socketOooOO0 = (oo000ooo.f59624OooOO0 || !OooO0O0(oo000ooo.f59617OooO0O0.f57326OooO00o.f57144OooO)) ? this.f59678OooO0OO.OooOO0() : null;
                    Unit unit = Unit.INSTANCE;
                }
                if (this.f59678OooO0OO.f59662OooOOO0 != null) {
                    if (!(socketOooOO0 == null)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    if (socketOooOO0 != null) {
                        o0O000o0.OooO0Oo(socketOooOO0);
                    }
                    this.f59679OooO0Oo.connectionReleased(this.f59678OooO0OO, oo000ooo);
                    this.f59682OooO0oO = 0;
                    this.f59683OooO0oo = 0;
                    this.f59675OooO = 0;
                    if (this.f59676OooO00o.OooO00o(this.f59677OooO0O0, this.f59678OooO0OO, null, false)) {
                        oo000ooo = this.f59678OooO0OO.f59662OooOOO0;
                        Intrinsics.checkNotNull(oo000ooo);
                        this.f59679OooO0Oo.connectionAcquired(this.f59678OooO0OO, oo000ooo);
                    } else {
                        o0o00000 = this.f59684OooOO0;
                        try {
                            if (o0o00000 != null) {
                                Intrinsics.checkNotNull(o0o00000);
                                this.f59684OooOO0 = null;
                            } else {
                                oooO00o = this.f59681OooO0o0;
                                if (oooO00o != null) {
                                    Intrinsics.checkNotNull(oooO00o);
                                    if (oooO00o.OooO00o()) {
                                        oooO00o2 = this.f59681OooO0o0;
                                        Intrinsics.checkNotNull(oooO00o2);
                                        if (oooO00o2.OooO00o()) {
                                            throw new NoSuchElementException();
                                        }
                                        int i5 = oooO00o2.f59649OooO0O0;
                                        oooO00o2.f59649OooO0O0 = i5 + 1;
                                        o0o00000 = oooO00o2.f59648OooO00o.get(i5);
                                    }
                                }
                                oo00o0o0 = this.f59680OooO0o;
                                if (oo00o0o0 == null) {
                                    o00O00 o00o01 = this.f59677OooO0O0;
                                    oO0Oo0oo oo0oo0oo = this.f59678OooO0OO;
                                    oo00o0o0 = new oO00O0o0(o00o01, oo0oo0oo.f59653OooO0Oo.f57283Oooo000, oo0oo0oo, this.f59679OooO0Oo);
                                    this.f59680OooO0o = oo00o0o0;
                                }
                                oooO00oOooO0O0 = oo00o0o0.OooO0O0();
                                this.f59681OooO0o0 = oooO00oOooO0O0;
                                list = oooO00oOooO0O0.f59648OooO00o;
                                if (!this.f59678OooO0OO.f59667OooOOoo) {
                                    throw new IOException("Canceled");
                                }
                                if (this.f59676OooO00o.OooO00o(this.f59677OooO0O0, this.f59678OooO0OO, list, false)) {
                                    oo000ooo = this.f59678OooO0OO.f59662OooOOO0;
                                    Intrinsics.checkNotNull(oo000ooo);
                                    this.f59679OooO0Oo.connectionAcquired(this.f59678OooO0OO, oo000ooo);
                                } else {
                                    if (oooO00oOooO0O0.OooO00o()) {
                                        throw new NoSuchElementException();
                                    }
                                    int i6 = oooO00oOooO0O0.f59649OooO0O0;
                                    oooO00oOooO0O0.f59649OooO0O0 = i6 + 1;
                                    o0o00000 = oooO00oOooO0O0.f59648OooO00o.get(i6);
                                    connection = new oO000OOo(this.f59676OooO00o, o0o00000);
                                    this.f59678OooO0OO.f59668OooOo0 = connection;
                                    connection.OooO0OO(i, i2, i3, i4, z, this.f59678OooO0OO, this.f59679OooO0Oo);
                                    this.f59678OooO0OO.f59668OooOo0 = null;
                                    this.f59678OooO0OO.f59653OooO0Oo.f57283Oooo000.OooO00o(connection.f59617OooO0O0);
                                    if (this.f59676OooO00o.OooO00o(this.f59677OooO0O0, this.f59678OooO0OO, list, true)) {
                                        oO000OOo oo000ooo2 = this.f59678OooO0OO.f59662OooOOO0;
                                        Intrinsics.checkNotNull(oo000ooo2);
                                        this.f59684OooOO0 = o0o00000;
                                        Socket socket = connection.f59619OooO0Oo;
                                        Intrinsics.checkNotNull(socket);
                                        o0O000o0.OooO0Oo(socket);
                                        this.f59679OooO0Oo.connectionAcquired(this.f59678OooO0OO, oo000ooo2);
                                        oo000ooo = oo000ooo2;
                                    } else {
                                        synchronized (connection) {
                                            oO000o00 oo000o00 = this.f59676OooO00o;
                                            oo000o00.getClass();
                                            Intrinsics.checkNotNullParameter(connection, "connection");
                                            byte[] bArr = o0O000o0.f57386OooO00o;
                                            oo000o00.f59639OooO0o0.add(connection);
                                            oo000o00.f59637OooO0OO.OooO0OO(oo000o00.f59638OooO0Oo, 0L);
                                            this.f59678OooO0OO.OooO0Oo(connection);
                                            Unit unit2 = Unit.INSTANCE;
                                        }
                                        this.f59679OooO0Oo.connectionAcquired(this.f59678OooO0OO, connection);
                                        oo000ooo = connection;
                                    }
                                }
                            }
                            connection.OooO0OO(i, i2, i3, i4, z, this.f59678OooO0OO, this.f59679OooO0Oo);
                            this.f59678OooO0OO.f59668OooOo0 = null;
                            this.f59678OooO0OO.f59653OooO0Oo.f57283Oooo000.OooO00o(connection.f59617OooO0O0);
                            if (this.f59676OooO00o.OooO00o(this.f59677OooO0O0, this.f59678OooO0OO, list, true)) {
                                oO000OOo oo000ooo3 = this.f59678OooO0OO.f59662OooOOO0;
                                Intrinsics.checkNotNull(oo000ooo3);
                                this.f59684OooOO0 = o0o00000;
                                Socket socket2 = connection.f59619OooO0Oo;
                                Intrinsics.checkNotNull(socket2);
                                o0O000o0.OooO0Oo(socket2);
                                this.f59679OooO0Oo.connectionAcquired(this.f59678OooO0OO, oo000ooo3);
                                oo000ooo = oo000ooo3;
                            } else {
                                synchronized (connection) {
                                    oO000o00 oo000o01 = this.f59676OooO00o;
                                    oo000o01.getClass();
                                    Intrinsics.checkNotNullParameter(connection, "connection");
                                    byte[] bArr2 = o0O000o0.f57386OooO00o;
                                    oo000o01.f59639OooO0o0.add(connection);
                                    oo000o01.f59637OooO0OO.OooO0OO(oo000o01.f59638OooO0Oo, 0L);
                                    this.f59678OooO0OO.OooO0Oo(connection);
                                    Unit unit3 = Unit.INSTANCE;
                                    this.f59679OooO0Oo.connectionAcquired(this.f59678OooO0OO, connection);
                                    oo000ooo = connection;
                                }
                            }
                        } catch (Throwable th) {
                            this.f59678OooO0OO.f59668OooOo0 = null;
                            throw th;
                        }
                        list = null;
                        connection = new oO000OOo(this.f59676OooO00o, o0o00000);
                        this.f59678OooO0OO.f59668OooOo0 = connection;
                    }
                }
            } else {
                this.f59682OooO0oO = 0;
                this.f59683OooO0oo = 0;
                this.f59675OooO = 0;
                if (this.f59676OooO00o.OooO00o(this.f59677OooO0O0, this.f59678OooO0OO, null, false)) {
                    oo000ooo = this.f59678OooO0OO.f59662OooOOO0;
                    Intrinsics.checkNotNull(oo000ooo);
                    this.f59679OooO0Oo.connectionAcquired(this.f59678OooO0OO, oo000ooo);
                } else {
                    o0o00000 = this.f59684OooOO0;
                    if (o0o00000 != null) {
                        Intrinsics.checkNotNull(o0o00000);
                        this.f59684OooOO0 = null;
                    } else {
                        oooO00o = this.f59681OooO0o0;
                        if (oooO00o != null) {
                            Intrinsics.checkNotNull(oooO00o);
                            if (oooO00o.OooO00o()) {
                                oooO00o2 = this.f59681OooO0o0;
                                Intrinsics.checkNotNull(oooO00o2);
                                if (oooO00o2.OooO00o()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = oooO00o2.f59649OooO0O0;
                                oooO00o2.f59649OooO0O0 = i7 + 1;
                                o0o00000 = oooO00o2.f59648OooO00o.get(i7);
                            }
                        }
                        oo00o0o0 = this.f59680OooO0o;
                        if (oo00o0o0 == null) {
                            o00O00 o00o02 = this.f59677OooO0O0;
                            oO0Oo0oo oo0oo0oo2 = this.f59678OooO0OO;
                            oo00o0o0 = new oO00O0o0(o00o02, oo0oo0oo2.f59653OooO0Oo.f57283Oooo000, oo0oo0oo2, this.f59679OooO0Oo);
                            this.f59680OooO0o = oo00o0o0;
                        }
                        oooO00oOooO0O0 = oo00o0o0.OooO0O0();
                        this.f59681OooO0o0 = oooO00oOooO0O0;
                        list = oooO00oOooO0O0.f59648OooO00o;
                        if (!this.f59678OooO0OO.f59667OooOOoo) {
                            throw new IOException("Canceled");
                        }
                        if (this.f59676OooO00o.OooO00o(this.f59677OooO0O0, this.f59678OooO0OO, list, false)) {
                            oo000ooo = this.f59678OooO0OO.f59662OooOOO0;
                            Intrinsics.checkNotNull(oo000ooo);
                            this.f59679OooO0Oo.connectionAcquired(this.f59678OooO0OO, oo000ooo);
                        } else {
                            if (oooO00oOooO0O0.OooO00o()) {
                                throw new NoSuchElementException();
                            }
                            int i8 = oooO00oOooO0O0.f59649OooO0O0;
                            oooO00oOooO0O0.f59649OooO0O0 = i8 + 1;
                            o0o00000 = oooO00oOooO0O0.f59648OooO00o.get(i8);
                            connection = new oO000OOo(this.f59676OooO00o, o0o00000);
                            this.f59678OooO0OO.f59668OooOo0 = connection;
                            connection.OooO0OO(i, i2, i3, i4, z, this.f59678OooO0OO, this.f59679OooO0Oo);
                            this.f59678OooO0OO.f59668OooOo0 = null;
                            this.f59678OooO0OO.f59653OooO0Oo.f57283Oooo000.OooO00o(connection.f59617OooO0O0);
                            if (this.f59676OooO00o.OooO00o(this.f59677OooO0O0, this.f59678OooO0OO, list, true)) {
                                oO000OOo oo000ooo4 = this.f59678OooO0OO.f59662OooOOO0;
                                Intrinsics.checkNotNull(oo000ooo4);
                                this.f59684OooOO0 = o0o00000;
                                Socket socket3 = connection.f59619OooO0Oo;
                                Intrinsics.checkNotNull(socket3);
                                o0O000o0.OooO0Oo(socket3);
                                this.f59679OooO0Oo.connectionAcquired(this.f59678OooO0OO, oo000ooo4);
                                oo000ooo = oo000ooo4;
                            } else {
                                synchronized (connection) {
                                    oO000o00 oo000o02 = this.f59676OooO00o;
                                    oo000o02.getClass();
                                    Intrinsics.checkNotNullParameter(connection, "connection");
                                    byte[] bArr3 = o0O000o0.f57386OooO00o;
                                    oo000o02.f59639OooO0o0.add(connection);
                                    oo000o02.f59637OooO0OO.OooO0OO(oo000o02.f59638OooO0Oo, 0L);
                                    this.f59678OooO0OO.OooO0Oo(connection);
                                    Unit unit4 = Unit.INSTANCE;
                                    this.f59679OooO0Oo.connectionAcquired(this.f59678OooO0OO, connection);
                                    oo000ooo = connection;
                                }
                            }
                        }
                    }
                    list = null;
                    connection = new oO000OOo(this.f59676OooO00o, o0o00000);
                    this.f59678OooO0OO.f59668OooOo0 = connection;
                    connection.OooO0OO(i, i2, i3, i4, z, this.f59678OooO0OO, this.f59679OooO0Oo);
                    this.f59678OooO0OO.f59668OooOo0 = null;
                    this.f59678OooO0OO.f59653OooO0Oo.f57283Oooo000.OooO00o(connection.f59617OooO0O0);
                    if (this.f59676OooO00o.OooO00o(this.f59677OooO0O0, this.f59678OooO0OO, list, true)) {
                        oO000OOo oo000ooo5 = this.f59678OooO0OO.f59662OooOOO0;
                        Intrinsics.checkNotNull(oo000ooo5);
                        this.f59684OooOO0 = o0o00000;
                        Socket socket4 = connection.f59619OooO0Oo;
                        Intrinsics.checkNotNull(socket4);
                        o0O000o0.OooO0Oo(socket4);
                        this.f59679OooO0Oo.connectionAcquired(this.f59678OooO0OO, oo000ooo5);
                        oo000ooo = oo000ooo5;
                    } else {
                        synchronized (connection) {
                            oO000o00 oo000o03 = this.f59676OooO00o;
                            oo000o03.getClass();
                            Intrinsics.checkNotNullParameter(connection, "connection");
                            byte[] bArr4 = o0O000o0.f57386OooO00o;
                            oo000o03.f59639OooO0o0.add(connection);
                            oo000o03.f59637OooO0OO.OooO0OO(oo000o03.f59638OooO0Oo, 0L);
                            this.f59678OooO0OO.OooO0Oo(connection);
                            Unit unit5 = Unit.INSTANCE;
                            this.f59679OooO0Oo.connectionAcquired(this.f59678OooO0OO, connection);
                            oo000ooo = connection;
                        }
                    }
                }
            }
            if (oo000ooo.OooOO0(z2)) {
                return oo000ooo;
            }
            oo000ooo.OooOO0o();
            if (this.f59684OooOO0 == null) {
                oO00O0o0.OooO00o oooO00o3 = this.f59681OooO0o0;
                if (oooO00o3 == null ? true : oooO00o3.OooO00o()) {
                    continue;
                } else {
                    oO00O0o0 oo00o0o1 = this.f59680OooO0o;
                    if (!(oo00o0o1 != null ? oo00o0o1.OooO00o() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean OooO0O0(@NotNull o00OO url) {
        Intrinsics.checkNotNullParameter(url, "url");
        o00OO o00oo2 = this.f59677OooO0O0.f57144OooO;
        return url.f57208OooO0o0 == o00oo2.f57208OooO0o0 && Intrinsics.areEqual(url.f57206OooO0Oo, o00oo2.f57206OooO0Oo);
    }

    public final void OooO0OO(@NotNull IOException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f59684OooOO0 = null;
        if ((e instanceof StreamResetException) && ((StreamResetException) e).f60854OooO0Oo == ErrorCode.REFUSED_STREAM) {
            this.f59682OooO0oO++;
        } else if (e instanceof ConnectionShutdownException) {
            this.f59683OooO0oo++;
        } else {
            this.f59675OooO++;
        }
    }
}
