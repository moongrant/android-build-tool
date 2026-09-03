package p660o0oooO0;

import androidx.compose.foundation.layout.oo000o;
import com.common.support.longlink.websocket.WebSocketConnection$webSocketListener$1;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Protocol;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0O00o00;
import p641o0ooOO0o.o0O0O0Oo;
import p641o0ooOO0o.o0O0oo0o;
import p648o0ooOoo.oO000o00;
import p652o0ooo000.o0000;
import p652o0ooo000.o00000O;
import p652o0ooo000.o0000O00;
import p653o0ooo00O.o0000O0;
import p653o0ooo00O.o0000OO0;
import p662o0oooO0O.o0O0o0;
import p662o0oooO0O.o0O0o00O;
import p662o0oooO0O.oo0OOoo;

/* JADX INFO: loaded from: classes5.dex */
public final class o000OO00 implements o0O0oo0o, o00oOoo.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public static final List<Protocol> f59665OooOo = CollectionsKt.listOf(Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public OooO0o f59666OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0O00O0o f59667OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0O0O0Oo f59668OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Random f59669OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f59670OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f59671OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public o00O0000 f59672OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final String f59673OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public o0000O0 f59674OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public o00oOoo f59675OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public o00O000 f59676OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final o0000 f59677OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public OooO0OO f59678OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public String f59679OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<ByteString> f59680OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<Object> f59681OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f59682OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f59683OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f59684OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f59685OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public String f59686OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f59687OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f59688OooOo0o;

    public static final class OooO extends o00000O {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000OO00 f59689OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(String str, o000OO00 o000oo01) {
            super(str, true);
            this.f59689OooO0o0 = o000oo01;
        }

        @Override // p652o0ooo000.o00000O
        public final long OooO00o() {
            o0000O0 o0000o1 = this.f59689OooO0o0.f59674OooO0oo;
            Intrinsics.checkNotNull(o0000o1);
            o0000o1.cancel();
            return -1L;
        }
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f59690OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final ByteString f59691OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f59692OooO0OO = 60000;

        public OooO00o(int i, @Nullable ByteString byteString) {
            this.f59690OooO00o = i;
            this.f59691OooO0O0 = byteString;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f59693OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final ByteString f59694OooO0O0;

        public OooO0O0(@NotNull ByteString data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f59693OooO00o = 2;
            this.f59694OooO0O0 = data;
        }
    }

    public static abstract class OooO0OO implements Closeable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f59695OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final o0O0o00O f59696OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final o0O0o0 f59697OooO0o0;

        public OooO0OO(@NotNull o0O0o0 source, @NotNull o0O0o00O sink) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            this.f59695OooO0Oo = true;
            this.f59697OooO0o0 = source;
            this.f59696OooO0o = sink;
        }
    }

    public final class OooO0o extends o00000O {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000OO00 f59698OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o000OO00 this$0) {
            super(Intrinsics.stringPlus(this$0.f59679OooOOO0, " writer"), true);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f59698OooO0o0 = this$0;
        }

        @Override // p652o0ooo000.o00000O
        public final long OooO00o() {
            o000OO00 o000oo01 = this.f59698OooO0o0;
            try {
                return o000oo01.OooOO0o() ? 0L : -1L;
            } catch (IOException e) {
                o000oo01.OooO0oo(e, null);
                return -1L;
            }
        }
    }

    public o000OO00(@NotNull o0000O00 taskRunner, @NotNull o0O00O0o originalRequest, @NotNull WebSocketConnection$webSocketListener$1 listener, @NotNull Random random, long j, long j2) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f59667OooO00o = originalRequest;
        this.f59668OooO0O0 = listener;
        this.f59669OooO0OO = random;
        this.f59670OooO0Oo = j;
        this.f59672OooO0o0 = null;
        this.f59671OooO0o = j2;
        this.f59677OooOO0o = taskRunner.OooO0o();
        this.f59680OooOOOO = new ArrayDeque<>();
        this.f59681OooOOOo = new ArrayDeque<>();
        this.f59684OooOOoo = -1;
        if (!Intrinsics.areEqual("GET", originalRequest.f57829OooO0O0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("Request must be GET: ", originalRequest.f57829OooO0O0).toString());
        }
        ByteString byteString = ByteString.f60193OooO0oO;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        Unit unit = Unit.INSTANCE;
        this.f59673OooO0oO = ByteString.OooO00o.OooO0o0(bArr).OooO00o();
    }

    public final void OooO(@NotNull String name, @NotNull o0000OO0 streams) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(streams, "streams");
        o00O0000 o00o0001 = this.f59672OooO0o0;
        Intrinsics.checkNotNull(o00o0001);
        synchronized (this) {
            this.f59679OooOOO0 = name;
            this.f59678OooOOO = streams;
            boolean z = streams.f59695OooO0Oo;
            this.f59676OooOO0O = new o00O000(z, streams.f59696OooO0o, this.f59669OooO0OO, o00o0001.f59717OooO00o, z ? o00o0001.f59719OooO0OO : o00o0001.f59722OooO0o0, this.f59671OooO0o);
            this.f59666OooO = new OooO0o(this);
            long j = this.f59670OooO0Oo;
            if (j != 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                this.f59677OooOO0o.OooO0OO(new o00(Intrinsics.stringPlus(name, " ping"), this, nanos), nanos);
            }
            if (!this.f59681OooOOOo.isEmpty()) {
                OooOO0O();
            }
            Unit unit = Unit.INSTANCE;
        }
        boolean z2 = streams.f59695OooO0Oo;
        this.f59675OooOO0 = new o00oOoo(z2, streams.f59697OooO0o0, this, o00o0001.f59717OooO00o, z2 ^ true ? o00o0001.f59719OooO0OO : o00o0001.f59722OooO0o0);
    }

    @Override // p641o0ooOO0o.o0O0oo0o
    public final boolean OooO00o(@NotNull ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        synchronized (this) {
            if (!this.f59685OooOo0 && !this.f59682OooOOo) {
                long j = this.f59683OooOOo0;
                byte[] bArr = bytes.data;
                if (((long) bArr.length) + j <= 16777216) {
                    this.f59683OooOOo0 = j + ((long) bArr.length);
                    this.f59681OooOOOo.add(new OooO0O0(bytes));
                    OooOO0O();
                    return true;
                }
                close(1001, null);
            }
            return false;
        }
    }

    @Override // o0oooO0.o00oOoo.OooO00o
    public final void OooO0O0(@NotNull ByteString bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f59668OooO0O0.onMessage(this, bytes);
    }

    @Override // o0oooO0.o00oOoo.OooO00o
    public final void OooO0OO(@NotNull String text) throws IOException {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f59668OooO0O0.onMessage(this, text);
    }

    @Override // o0oooO0.o00oOoo.OooO00o
    public final synchronized void OooO0Oo(@NotNull ByteString payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!this.f59685OooOo0 && (!this.f59682OooOOo || !this.f59681OooOOOo.isEmpty())) {
            this.f59680OooOOOO.add(payload);
            OooOO0O();
        }
    }

    @Override // o0oooO0.o00oOoo.OooO00o
    public final void OooO0o(int i, @NotNull String reason) {
        OooO0OO oooO0OO;
        o00oOoo o00oooo2;
        o00O000 o00o001;
        Intrinsics.checkNotNullParameter(reason, "reason");
        boolean z = true;
        if (!(i != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            if (this.f59684OooOOoo != -1) {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("already closed".toString());
            }
            this.f59684OooOOoo = i;
            this.f59686OooOo00 = reason;
            oooO0OO = null;
            if (this.f59682OooOOo && this.f59681OooOOOo.isEmpty()) {
                OooO0OO oooO0OO2 = this.f59678OooOOO;
                this.f59678OooOOO = null;
                o00oooo2 = this.f59675OooOO0;
                this.f59675OooOO0 = null;
                o00o001 = this.f59676OooOO0O;
                this.f59676OooOO0O = null;
                this.f59677OooOO0o.OooO0o0();
                oooO0OO = oooO0OO2;
            } else {
                o00oooo2 = null;
                o00o001 = null;
            }
            Unit unit = Unit.INSTANCE;
        }
        try {
            this.f59668OooO0O0.onClosing(this, i, reason);
            if (oooO0OO != null) {
                this.f59668OooO0O0.onClosed(this, i, reason);
            }
        } finally {
            if (oooO0OO != null) {
                oO000o00.OooO0OO(oooO0OO);
            }
            if (o00oooo2 != null) {
                oO000o00.OooO0OO(o00oooo2);
            }
            if (o00o001 != null) {
                oO000o00.OooO0OO(o00o001);
            }
        }
    }

    @Override // o0oooO0.o00oOoo.OooO00o
    public final synchronized void OooO0o0(@NotNull ByteString payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f59688OooOo0o = false;
    }

    public final void OooO0oO(@NotNull o0O00o00 response, @Nullable p653o0ooo00O.o0000O00 o0000o00) throws IOException {
        Intrinsics.checkNotNullParameter(response, "response");
        int i = response.f57850OooO0oO;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(' ');
            throw new ProtocolException(oo000o.OooO0O0(sb, response.f57848OooO0o, '\''));
        }
        String strOooO0OO = response.OooO0OO("Connection", null);
        if (!StringsKt__StringsJVMKt.equals("Upgrade", strOooO0OO, true)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + ((Object) strOooO0OO) + '\'');
        }
        String strOooO0OO2 = response.OooO0OO("Upgrade", null);
        if (!StringsKt__StringsJVMKt.equals("websocket", strOooO0OO2, true)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + ((Object) strOooO0OO2) + '\'');
        }
        String strOooO0OO3 = response.OooO0OO("Sec-WebSocket-Accept", null);
        ByteString byteString = ByteString.f60193OooO0oO;
        String strOooO00o = ByteString.OooO00o.OooO0OO(Intrinsics.stringPlus(this.f59673OooO0oO, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")).OooO0Oo("SHA-1").OooO00o();
        if (Intrinsics.areEqual(strOooO00o, strOooO0OO3)) {
            if (o0000o00 == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strOooO00o + "' but was '" + ((Object) strOooO0OO3) + '\'');
    }

    public final void OooO0oo(@NotNull Exception e, @Nullable o0O00o00 o0o00o01) {
        Intrinsics.checkNotNullParameter(e, "e");
        synchronized (this) {
            if (this.f59685OooOo0) {
                return;
            }
            this.f59685OooOo0 = true;
            OooO0OO oooO0OO = this.f59678OooOOO;
            this.f59678OooOOO = null;
            o00oOoo o00oooo2 = this.f59675OooOO0;
            this.f59675OooOO0 = null;
            o00O000 o00o001 = this.f59676OooOO0O;
            this.f59676OooOO0O = null;
            this.f59677OooOO0o.OooO0o0();
            Unit unit = Unit.INSTANCE;
            try {
                this.f59668OooO0O0.onFailure(this, e, o0o00o01);
            } finally {
                if (oooO0OO != null) {
                    oO000o00.OooO0OO(oooO0OO);
                }
                if (o00oooo2 != null) {
                    oO000o00.OooO0OO(o00oooo2);
                }
                if (o00o001 != null) {
                    oO000o00.OooO0OO(o00o001);
                }
            }
        }
    }

    public final void OooOO0() throws IOException {
        while (this.f59684OooOOoo == -1) {
            o00oOoo o00oooo2 = this.f59675OooOO0;
            Intrinsics.checkNotNull(o00oooo2);
            o00oooo2.OooO0OO();
            if (o00oooo2.f59733OooOOO0) {
                o00oooo2.OooO00o();
            } else {
                int i = o00oooo2.f59729OooOO0;
                if (i != 1 && i != 2) {
                    byte[] bArr = oO000o00.f58124OooO00o;
                    String hexString = Integer.toHexString(i);
                    Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
                    throw new ProtocolException(Intrinsics.stringPlus("Unknown opcode: ", hexString));
                }
                while (true) {
                    if (o00oooo2.f59723OooO) {
                        throw new IOException("closed");
                    }
                    long j = o00oooo2.f59730OooOO0O;
                    oo0OOoo buffer = o00oooo2.f59735OooOOOo;
                    if (j > 0) {
                        o00oooo2.f59726OooO0o0.Oooo0o(buffer, j);
                        if (!o00oooo2.f59724OooO0Oo) {
                            oo0OOoo.OooO00o oooO00o = o00oooo2.f59738OooOOoo;
                            Intrinsics.checkNotNull(oooO00o);
                            buffer.Oooo0O0(oooO00o);
                            oooO00o.OooO0OO(buffer.f59828OooO0o0 - o00oooo2.f59730OooOO0O);
                            byte[] bArr2 = o00oooo2.f59736OooOOo;
                            Intrinsics.checkNotNull(bArr2);
                            o0O0ooO.OooO0O0(oooO00o, bArr2);
                            oooO00o.close();
                        }
                    }
                    if (o00oooo2.f59731OooOO0o) {
                        if (o00oooo2.f59732OooOOO) {
                            o000O o000o = o00oooo2.f59737OooOOo0;
                            if (o000o == null) {
                                o000o = new o000O(o00oooo2.f59728OooO0oo);
                                o00oooo2.f59737OooOOo0 = o000o;
                            }
                            Intrinsics.checkNotNullParameter(buffer, "buffer");
                            oo0OOoo oo0oooo = o000o.f59662OooO0o0;
                            if (!(oo0oooo.f59828OooO0o0 == 0)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            Inflater inflater = o000o.f59661OooO0o;
                            if (o000o.f59660OooO0Oo) {
                                inflater.reset();
                            }
                            oo0oooo.o00Oo0(buffer);
                            oo0oooo.oo0o0Oo(65535);
                            long bytesRead = inflater.getBytesRead() + oo0oooo.f59828OooO0o0;
                            do {
                                o000o.f59663OooO0oO.OooO00o(buffer, LongCompanionObject.MAX_VALUE);
                            } while (inflater.getBytesRead() < bytesRead);
                        }
                        o00oOoo.OooO00o oooO00o2 = o00oooo2.f59725OooO0o;
                        if (i != 1) {
                            oooO00o2.OooO0O0(buffer.Oooo0o0());
                            break;
                        } else {
                            oooO00o2.OooO0OO(buffer.OoooOO0());
                            break;
                        }
                    }
                    while (!o00oooo2.f59723OooO) {
                        o00oooo2.OooO0OO();
                        if (!o00oooo2.f59733OooOOO0) {
                            break;
                        } else {
                            o00oooo2.OooO00o();
                        }
                    }
                    if (o00oooo2.f59729OooOO0 != 0) {
                        int i2 = o00oooo2.f59729OooOO0;
                        byte[] bArr3 = oO000o00.f58124OooO00o;
                        String hexString2 = Integer.toHexString(i2);
                        Intrinsics.checkNotNullExpressionValue(hexString2, "toHexString(this)");
                        throw new ProtocolException(Intrinsics.stringPlus("Expected continuation opcode. Got: ", hexString2));
                    }
                }
            }
        }
    }

    public final void OooOO0O() {
        byte[] bArr = oO000o00.f58124OooO00o;
        OooO0o oooO0o = this.f59666OooO;
        if (oooO0o != null) {
            this.f59677OooOO0o.OooO0OO(oooO0o, 0L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final boolean OooOO0o() throws IOException {
        String str;
        o00oOoo o00oooo2;
        o00O000 o00o001;
        int i;
        ?? r4;
        synchronized (this) {
            if (this.f59685OooOo0) {
                return false;
            }
            o00O000 o00o002 = this.f59676OooOO0O;
            ByteString byteStringPoll = this.f59680OooOOOO.poll();
            Object obj = null;
            int i2 = -1;
            if (byteStringPoll == null) {
                Object objPoll = this.f59681OooOOOo.poll();
                if (objPoll instanceof OooO00o) {
                    int i3 = this.f59684OooOOoo;
                    str = this.f59686OooOo00;
                    if (i3 != -1) {
                        OooO0OO oooO0OO = this.f59678OooOOO;
                        this.f59678OooOOO = null;
                        o00oooo2 = this.f59675OooOO0;
                        this.f59675OooOO0 = null;
                        o00o001 = this.f59676OooOO0O;
                        this.f59676OooOO0O = null;
                        this.f59677OooOO0o.OooO0o0();
                        obj = oooO0OO;
                    } else {
                        this.f59677OooOO0o.OooO0OO(new OooO(Intrinsics.stringPlus(this.f59679OooOOO0, " cancel"), this), TimeUnit.MILLISECONDS.toNanos(((OooO00o) objPoll).f59692OooO0OO));
                        o00oooo2 = null;
                        o00o001 = null;
                    }
                    i2 = i3;
                } else {
                    if (objPoll == null) {
                        return false;
                    }
                    str = null;
                    o00oooo2 = null;
                    o00o001 = null;
                }
                int i4 = i2;
                r4 = obj;
                obj = objPoll;
                i = i4;
            } else {
                str = null;
                o00oooo2 = null;
                o00o001 = null;
                i = -1;
                r4 = 0;
            }
            Unit unit = Unit.INSTANCE;
            try {
                if (byteStringPoll != null) {
                    Intrinsics.checkNotNull(o00o002);
                    ByteString payload = byteStringPoll;
                    o00o002.getClass();
                    Intrinsics.checkNotNullParameter(payload, "payload");
                    o00o002.OooO00o(10, payload);
                } else if (obj instanceof OooO0O0) {
                    OooO0O0 oooO0O0 = (OooO0O0) obj;
                    Intrinsics.checkNotNull(o00o002);
                    o00o002.OooO0OO(oooO0O0.f59693OooO00o, oooO0O0.f59694OooO0O0);
                    synchronized (this) {
                        this.f59683OooOOo0 -= (long) oooO0O0.f59694OooO0O0.OooO0o0();
                    }
                } else {
                    if (!(obj instanceof OooO00o)) {
                        throw new AssertionError();
                    }
                    OooO00o oooO00o = (OooO00o) obj;
                    Intrinsics.checkNotNull(o00o002);
                    int i5 = oooO00o.f59690OooO00o;
                    ByteString byteString = oooO00o.f59691OooO0O0;
                    o00o002.getClass();
                    ByteString byteStringOooo0o0 = ByteString.f60193OooO0oO;
                    if (i5 != 0 || byteString != null) {
                        if (i5 != 0) {
                            String strOooO00o = o0O0ooO.OooO00o(i5);
                            if (!(strOooO00o == null)) {
                                Intrinsics.checkNotNull(strOooO00o);
                                throw new IllegalArgumentException(strOooO00o.toString());
                            }
                        }
                        oo0OOoo oo0oooo = new oo0OOoo();
                        oo0oooo.o000OOo(i5);
                        if (byteString != null) {
                            oo0oooo.o00O0O(byteString);
                        }
                        byteStringOooo0o0 = oo0oooo.Oooo0o0();
                    }
                    try {
                        o00o002.OooO00o(8, byteStringOooo0o0);
                        o00o002.f59713OooOO0o = true;
                        if (r4 != 0) {
                            o0O0O0Oo o0o0o0oo = this.f59668OooO0O0;
                            Intrinsics.checkNotNull(str);
                            o0o0o0oo.onClosed(this, i, str);
                        }
                    } catch (Throwable th) {
                        o00o002.f59713OooOO0o = true;
                        throw th;
                    }
                }
                if (r4 != 0) {
                    oO000o00.OooO0OO(r4);
                }
                if (o00oooo2 != null) {
                    oO000o00.OooO0OO(o00oooo2);
                }
                if (o00o001 != null) {
                    oO000o00.OooO0OO(o00o001);
                }
                return true;
            } catch (Throwable th2) {
                if (r4 != 0) {
                    oO000o00.OooO0OO(r4);
                }
                if (o00oooo2 != null) {
                    oO000o00.OooO0OO(o00oooo2);
                }
                if (o00o001 != null) {
                    oO000o00.OooO0OO(o00o001);
                }
                throw th2;
            }
        }
    }

    @Override // p641o0ooOO0o.o0O0oo0o
    public final boolean close(int i, @Nullable String str) {
        ByteString byteStringOooO0OO;
        synchronized (this) {
            try {
                String strOooO00o = o0O0ooO.OooO00o(i);
                if (!(strOooO00o == null)) {
                    Intrinsics.checkNotNull(strOooO00o);
                    throw new IllegalArgumentException(strOooO00o.toString());
                }
                if (str != null) {
                    ByteString byteString = ByteString.f60193OooO0oO;
                    byteStringOooO0OO = ByteString.OooO00o.OooO0OO(str);
                    if (!(((long) byteStringOooO0OO.data.length) <= 123)) {
                        throw new IllegalArgumentException(Intrinsics.stringPlus("reason.size() > 123: ", str).toString());
                    }
                } else {
                    byteStringOooO0OO = null;
                }
                if (!this.f59685OooOo0 && !this.f59682OooOOo) {
                    this.f59682OooOOo = true;
                    this.f59681OooOOOo.add(new OooO00o(i, byteStringOooO0OO));
                    OooOO0O();
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
