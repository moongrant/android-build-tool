package p653o0ooo00O;

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
import p641o0ooOO0o.o0;
import p641o0ooOO0o.o00OO00O;
import p641o0ooOO0o.o0O000O;
import p641o0ooOO0o.o0oO0O0o;
import p648o0ooOoo.oO000o00;

/* JADX INFO: loaded from: classes5.dex */
public final class o0000oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f59363OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o000O000 f59364OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00OO00O f59365OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o0000O0 f59366OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o0 f59367OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public o000Oo0 f59368OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public o000Oo0.OooO00o f59369OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f59370OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f59371OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public o0oO0O0o f59372OooOO0;

    public o0000oo(@NotNull o000O000 connectionPool, @NotNull o00OO00O address, @NotNull o0000O0 call, @NotNull o0 eventListener) {
        Intrinsics.checkNotNullParameter(connectionPool, "connectionPool");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        this.f59364OooO00o = connectionPool;
        this.f59365OooO0O0 = address;
        this.f59366OooO0OO = call;
        this.f59367OooO0Oo = eventListener;
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
    public final o0000O0O OooO00o(int i, int i2, int i3, int i4, boolean z, boolean z2) throws IOException {
        o0oO0O0o o0oo0o0o2;
        o000Oo0.OooO00o oooO00o;
        o000Oo0 o000oo1;
        o000Oo0.OooO00o oooO00oOooO0O0;
        List<o0oO0O0o> list;
        o000Oo0.OooO00o oooO00o2;
        o0000O0O connection;
        Socket socketOooOO0;
        while (!this.f59366OooO0OO.f59319OooOOoo) {
            o0000O0O o0000o0o2 = this.f59366OooO0OO.f59314OooOOO0;
            if (o0000o0o2 != null) {
                synchronized (o0000o0o2) {
                    socketOooOO0 = (o0000o0o2.f59352OooOO0 || !OooO0O0(o0000o0o2.f59345OooO0O0.f57962OooO00o.f57743OooO)) ? this.f59366OooO0OO.OooOO0() : null;
                    Unit unit = Unit.INSTANCE;
                }
                if (this.f59366OooO0OO.f59314OooOOO0 != null) {
                    if (!(socketOooOO0 == null)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    if (socketOooOO0 != null) {
                        oO000o00.OooO0Oo(socketOooOO0);
                    }
                    this.f59367OooO0Oo.connectionReleased(this.f59366OooO0OO, o0000o0o2);
                    this.f59370OooO0oO = 0;
                    this.f59371OooO0oo = 0;
                    this.f59363OooO = 0;
                    if (this.f59364OooO00o.OooO00o(this.f59365OooO0O0, this.f59366OooO0OO, null, false)) {
                        o0000o0o2 = this.f59366OooO0OO.f59314OooOOO0;
                        Intrinsics.checkNotNull(o0000o0o2);
                        this.f59367OooO0Oo.connectionAcquired(this.f59366OooO0OO, o0000o0o2);
                    } else {
                        o0oo0o0o2 = this.f59372OooOO0;
                        try {
                            if (o0oo0o0o2 != null) {
                                Intrinsics.checkNotNull(o0oo0o0o2);
                                this.f59372OooOO0 = null;
                            } else {
                                oooO00o = this.f59369OooO0o0;
                                if (oooO00o != null) {
                                    Intrinsics.checkNotNull(oooO00o);
                                    if (oooO00o.OooO00o()) {
                                        oooO00o2 = this.f59369OooO0o0;
                                        Intrinsics.checkNotNull(oooO00o2);
                                        if (oooO00o2.OooO00o()) {
                                            throw new NoSuchElementException();
                                        }
                                        int i5 = oooO00o2.f59391OooO0O0;
                                        oooO00o2.f59391OooO0O0 = i5 + 1;
                                        o0oo0o0o2 = oooO00o2.f59390OooO00o.get(i5);
                                    }
                                }
                                o000oo1 = this.f59368OooO0o;
                                if (o000oo1 == null) {
                                    o00OO00O o00oo00o = this.f59365OooO0O0;
                                    o0000O0 o0000o1 = this.f59366OooO0OO;
                                    o000oo1 = new o000Oo0(o00oo00o, o0000o1.f59305OooO0Oo.f57912Oooo000, o0000o1, this.f59367OooO0Oo);
                                    this.f59368OooO0o = o000oo1;
                                }
                                oooO00oOooO0O0 = o000oo1.OooO0O0();
                                this.f59369OooO0o0 = oooO00oOooO0O0;
                                list = oooO00oOooO0O0.f59390OooO00o;
                                if (!this.f59366OooO0OO.f59319OooOOoo) {
                                    throw new IOException("Canceled");
                                }
                                if (this.f59364OooO00o.OooO00o(this.f59365OooO0O0, this.f59366OooO0OO, list, false)) {
                                    o0000o0o2 = this.f59366OooO0OO.f59314OooOOO0;
                                    Intrinsics.checkNotNull(o0000o0o2);
                                    this.f59367OooO0Oo.connectionAcquired(this.f59366OooO0OO, o0000o0o2);
                                } else {
                                    if (oooO00oOooO0O0.OooO00o()) {
                                        throw new NoSuchElementException();
                                    }
                                    int i6 = oooO00oOooO0O0.f59391OooO0O0;
                                    oooO00oOooO0O0.f59391OooO0O0 = i6 + 1;
                                    o0oo0o0o2 = oooO00oOooO0O0.f59390OooO00o.get(i6);
                                    connection = new o0000O0O(this.f59364OooO00o, o0oo0o0o2);
                                    this.f59366OooO0OO.f59320OooOo0 = connection;
                                    connection.OooO0OO(i, i2, i3, i4, z, this.f59366OooO0OO, this.f59367OooO0Oo);
                                    this.f59366OooO0OO.f59320OooOo0 = null;
                                    this.f59366OooO0OO.f59305OooO0Oo.f57912Oooo000.OooO00o(connection.f59345OooO0O0);
                                    if (this.f59364OooO00o.OooO00o(this.f59365OooO0O0, this.f59366OooO0OO, list, true)) {
                                        o0000O0O o0000o0o3 = this.f59366OooO0OO.f59314OooOOO0;
                                        Intrinsics.checkNotNull(o0000o0o3);
                                        this.f59372OooOO0 = o0oo0o0o2;
                                        Socket socket = connection.f59347OooO0Oo;
                                        Intrinsics.checkNotNull(socket);
                                        oO000o00.OooO0Oo(socket);
                                        this.f59367OooO0Oo.connectionAcquired(this.f59366OooO0OO, o0000o0o3);
                                        o0000o0o2 = o0000o0o3;
                                    } else {
                                        synchronized (connection) {
                                            o000O000 o000o001 = this.f59364OooO00o;
                                            o000o001.getClass();
                                            Intrinsics.checkNotNullParameter(connection, "connection");
                                            byte[] bArr = oO000o00.f58124OooO00o;
                                            o000o001.f59377OooO0o0.add(connection);
                                            o000o001.f59375OooO0OO.OooO0OO(o000o001.f59376OooO0Oo, 0L);
                                            this.f59366OooO0OO.OooO0Oo(connection);
                                            Unit unit2 = Unit.INSTANCE;
                                        }
                                        this.f59367OooO0Oo.connectionAcquired(this.f59366OooO0OO, connection);
                                        o0000o0o2 = connection;
                                    }
                                }
                            }
                            connection.OooO0OO(i, i2, i3, i4, z, this.f59366OooO0OO, this.f59367OooO0Oo);
                            this.f59366OooO0OO.f59320OooOo0 = null;
                            this.f59366OooO0OO.f59305OooO0Oo.f57912Oooo000.OooO00o(connection.f59345OooO0O0);
                            if (this.f59364OooO00o.OooO00o(this.f59365OooO0O0, this.f59366OooO0OO, list, true)) {
                                o0000O0O o0000o0o4 = this.f59366OooO0OO.f59314OooOOO0;
                                Intrinsics.checkNotNull(o0000o0o4);
                                this.f59372OooOO0 = o0oo0o0o2;
                                Socket socket2 = connection.f59347OooO0Oo;
                                Intrinsics.checkNotNull(socket2);
                                oO000o00.OooO0Oo(socket2);
                                this.f59367OooO0Oo.connectionAcquired(this.f59366OooO0OO, o0000o0o4);
                                o0000o0o2 = o0000o0o4;
                            } else {
                                synchronized (connection) {
                                    o000O000 o000o002 = this.f59364OooO00o;
                                    o000o002.getClass();
                                    Intrinsics.checkNotNullParameter(connection, "connection");
                                    byte[] bArr2 = oO000o00.f58124OooO00o;
                                    o000o002.f59377OooO0o0.add(connection);
                                    o000o002.f59375OooO0OO.OooO0OO(o000o002.f59376OooO0Oo, 0L);
                                    this.f59366OooO0OO.OooO0Oo(connection);
                                    Unit unit3 = Unit.INSTANCE;
                                    this.f59367OooO0Oo.connectionAcquired(this.f59366OooO0OO, connection);
                                    o0000o0o2 = connection;
                                }
                            }
                        } catch (Throwable th) {
                            this.f59366OooO0OO.f59320OooOo0 = null;
                            throw th;
                        }
                        list = null;
                        connection = new o0000O0O(this.f59364OooO00o, o0oo0o0o2);
                        this.f59366OooO0OO.f59320OooOo0 = connection;
                    }
                }
            } else {
                this.f59370OooO0oO = 0;
                this.f59371OooO0oo = 0;
                this.f59363OooO = 0;
                if (this.f59364OooO00o.OooO00o(this.f59365OooO0O0, this.f59366OooO0OO, null, false)) {
                    o0000o0o2 = this.f59366OooO0OO.f59314OooOOO0;
                    Intrinsics.checkNotNull(o0000o0o2);
                    this.f59367OooO0Oo.connectionAcquired(this.f59366OooO0OO, o0000o0o2);
                } else {
                    o0oo0o0o2 = this.f59372OooOO0;
                    if (o0oo0o0o2 != null) {
                        Intrinsics.checkNotNull(o0oo0o0o2);
                        this.f59372OooOO0 = null;
                    } else {
                        oooO00o = this.f59369OooO0o0;
                        if (oooO00o != null) {
                            Intrinsics.checkNotNull(oooO00o);
                            if (oooO00o.OooO00o()) {
                                oooO00o2 = this.f59369OooO0o0;
                                Intrinsics.checkNotNull(oooO00o2);
                                if (oooO00o2.OooO00o()) {
                                    throw new NoSuchElementException();
                                }
                                int i7 = oooO00o2.f59391OooO0O0;
                                oooO00o2.f59391OooO0O0 = i7 + 1;
                                o0oo0o0o2 = oooO00o2.f59390OooO00o.get(i7);
                            }
                        }
                        o000oo1 = this.f59368OooO0o;
                        if (o000oo1 == null) {
                            o00OO00O o00oo00o2 = this.f59365OooO0O0;
                            o0000O0 o0000o2 = this.f59366OooO0OO;
                            o000oo1 = new o000Oo0(o00oo00o2, o0000o2.f59305OooO0Oo.f57912Oooo000, o0000o2, this.f59367OooO0Oo);
                            this.f59368OooO0o = o000oo1;
                        }
                        oooO00oOooO0O0 = o000oo1.OooO0O0();
                        this.f59369OooO0o0 = oooO00oOooO0O0;
                        list = oooO00oOooO0O0.f59390OooO00o;
                        if (!this.f59366OooO0OO.f59319OooOOoo) {
                            throw new IOException("Canceled");
                        }
                        if (this.f59364OooO00o.OooO00o(this.f59365OooO0O0, this.f59366OooO0OO, list, false)) {
                            o0000o0o2 = this.f59366OooO0OO.f59314OooOOO0;
                            Intrinsics.checkNotNull(o0000o0o2);
                            this.f59367OooO0Oo.connectionAcquired(this.f59366OooO0OO, o0000o0o2);
                        } else {
                            if (oooO00oOooO0O0.OooO00o()) {
                                throw new NoSuchElementException();
                            }
                            int i8 = oooO00oOooO0O0.f59391OooO0O0;
                            oooO00oOooO0O0.f59391OooO0O0 = i8 + 1;
                            o0oo0o0o2 = oooO00oOooO0O0.f59390OooO00o.get(i8);
                            connection = new o0000O0O(this.f59364OooO00o, o0oo0o0o2);
                            this.f59366OooO0OO.f59320OooOo0 = connection;
                            connection.OooO0OO(i, i2, i3, i4, z, this.f59366OooO0OO, this.f59367OooO0Oo);
                            this.f59366OooO0OO.f59320OooOo0 = null;
                            this.f59366OooO0OO.f59305OooO0Oo.f57912Oooo000.OooO00o(connection.f59345OooO0O0);
                            if (this.f59364OooO00o.OooO00o(this.f59365OooO0O0, this.f59366OooO0OO, list, true)) {
                                o0000O0O o0000o0o5 = this.f59366OooO0OO.f59314OooOOO0;
                                Intrinsics.checkNotNull(o0000o0o5);
                                this.f59372OooOO0 = o0oo0o0o2;
                                Socket socket3 = connection.f59347OooO0Oo;
                                Intrinsics.checkNotNull(socket3);
                                oO000o00.OooO0Oo(socket3);
                                this.f59367OooO0Oo.connectionAcquired(this.f59366OooO0OO, o0000o0o5);
                                o0000o0o2 = o0000o0o5;
                            } else {
                                synchronized (connection) {
                                    o000O000 o000o003 = this.f59364OooO00o;
                                    o000o003.getClass();
                                    Intrinsics.checkNotNullParameter(connection, "connection");
                                    byte[] bArr3 = oO000o00.f58124OooO00o;
                                    o000o003.f59377OooO0o0.add(connection);
                                    o000o003.f59375OooO0OO.OooO0OO(o000o003.f59376OooO0Oo, 0L);
                                    this.f59366OooO0OO.OooO0Oo(connection);
                                    Unit unit4 = Unit.INSTANCE;
                                    this.f59367OooO0Oo.connectionAcquired(this.f59366OooO0OO, connection);
                                    o0000o0o2 = connection;
                                }
                            }
                        }
                    }
                    list = null;
                    connection = new o0000O0O(this.f59364OooO00o, o0oo0o0o2);
                    this.f59366OooO0OO.f59320OooOo0 = connection;
                    connection.OooO0OO(i, i2, i3, i4, z, this.f59366OooO0OO, this.f59367OooO0Oo);
                    this.f59366OooO0OO.f59320OooOo0 = null;
                    this.f59366OooO0OO.f59305OooO0Oo.f57912Oooo000.OooO00o(connection.f59345OooO0O0);
                    if (this.f59364OooO00o.OooO00o(this.f59365OooO0O0, this.f59366OooO0OO, list, true)) {
                        o0000O0O o0000o0o6 = this.f59366OooO0OO.f59314OooOOO0;
                        Intrinsics.checkNotNull(o0000o0o6);
                        this.f59372OooOO0 = o0oo0o0o2;
                        Socket socket4 = connection.f59347OooO0Oo;
                        Intrinsics.checkNotNull(socket4);
                        oO000o00.OooO0Oo(socket4);
                        this.f59367OooO0Oo.connectionAcquired(this.f59366OooO0OO, o0000o0o6);
                        o0000o0o2 = o0000o0o6;
                    } else {
                        synchronized (connection) {
                            o000O000 o000o004 = this.f59364OooO00o;
                            o000o004.getClass();
                            Intrinsics.checkNotNullParameter(connection, "connection");
                            byte[] bArr4 = oO000o00.f58124OooO00o;
                            o000o004.f59377OooO0o0.add(connection);
                            o000o004.f59375OooO0OO.OooO0OO(o000o004.f59376OooO0Oo, 0L);
                            this.f59366OooO0OO.OooO0Oo(connection);
                            Unit unit5 = Unit.INSTANCE;
                            this.f59367OooO0Oo.connectionAcquired(this.f59366OooO0OO, connection);
                            o0000o0o2 = connection;
                        }
                    }
                }
            }
            if (o0000o0o2.OooOO0(z2)) {
                return o0000o0o2;
            }
            o0000o0o2.OooOO0o();
            if (this.f59372OooOO0 == null) {
                o000Oo0.OooO00o oooO00o3 = this.f59369OooO0o0;
                if (oooO00o3 == null ? true : oooO00o3.OooO00o()) {
                    continue;
                } else {
                    o000Oo0 o000oo2 = this.f59368OooO0o;
                    if (!(o000oo2 != null ? o000oo2.OooO00o() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
        throw new IOException("Canceled");
    }

    public final boolean OooO0O0(@NotNull o0O000O url) {
        Intrinsics.checkNotNullParameter(url, "url");
        o0O000O o0o000o = this.f59365OooO0O0.f57743OooO;
        return url.f57794OooO0o0 == o0o000o.f57794OooO0o0 && Intrinsics.areEqual(url.f57792OooO0Oo, o0o000o.f57792OooO0Oo);
    }

    public final void OooO0OO(@NotNull IOException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        this.f59372OooOO0 = null;
        if ((e instanceof StreamResetException) && ((StreamResetException) e).f60181OooO0Oo == ErrorCode.REFUSED_STREAM) {
            this.f59370OooO0oO++;
        } else if (e instanceof ConnectionShutdownException) {
            this.f59371OooO0oo++;
        } else {
            this.f59363OooO++;
        }
    }
}
