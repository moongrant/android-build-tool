package p654o0ooo0o;

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
import kotlin.text.StringsKt;
import okhttp3.Protocol;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p634o0ooO0oO.o00OOOOo;
import p634o0ooO0oO.o0O000;
import p634o0ooO0oO.o0O0000O;
import p634o0ooO0oO.o0oOOo;
import p635o0ooO0oo.o0O000o0;
import p639o0ooOO0o.o00OO00O;
import p639o0ooOO0o.o00OO0O0;
import p639o0ooOO0o.oo0oOO0;
import p646o0ooOoo.oO000Oo0;
import p646o0ooOoo.oO0Oo0oo;
import p646o0ooOoo.oO0o0o;
import p659o0oooO00.o0000;
import p659o0oooO00.o00000O;
import p659o0oooO00.o0000Ooo;

/* JADX INFO: loaded from: classes5.dex */
public final class o000000O implements o0O0000O, o0000Ooo.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public static final List<Protocol> f60062OooOo = CollectionsKt.listOf(Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public OooO0o f60063OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o00OOOOo f60064OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0O000 f60065OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Random f60066OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f60067OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f60068OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public o00000O f60069OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final String f60070OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public oO0Oo0oo f60071OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public o0000Ooo f60072OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public o0000 f60073OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final o00OO00O f60074OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public OooO0OO f60075OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public String f60076OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<ByteString> f60077OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final ArrayDeque<Object> f60078OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public boolean f60079OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f60080OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f60081OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public boolean f60082OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public String f60083OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public int f60084OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f60085OooOo0o;

    public static final class OooO extends oo0oOO0 {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000000O f60086OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(String str, o000000O o000000o2) {
            super(str, true);
            this.f60086OooO0o0 = o000000o2;
        }

        @Override // p639o0ooOO0o.oo0oOO0
        public final long OooO00o() {
            oO0Oo0oo oo0oo0oo = this.f60086OooO0o0.f60071OooO0oo;
            Intrinsics.checkNotNull(oo0oo0oo);
            oo0oo0oo.cancel();
            return -1L;
        }
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f60087OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final ByteString f60088OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f60089OooO0OO = 60000;

        public OooO00o(int i, @Nullable ByteString byteString) {
            this.f60087OooO00o = i;
            this.f60088OooO0O0 = byteString;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f60090OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final ByteString f60091OooO0O0;

        public OooO0O0(@NotNull ByteString data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f60090OooO00o = 2;
            this.f60091OooO0O0 = data;
        }
    }

    public static abstract class OooO0OO implements Closeable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f60092OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @NotNull
        public final o0000Ooo f60093OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        @NotNull
        public final o0000 f60094OooO0o0;

        public OooO0OO(@NotNull o0000 source, @NotNull o0000Ooo sink) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            this.f60092OooO0Oo = true;
            this.f60094OooO0o0 = source;
            this.f60093OooO0o = sink;
        }
    }

    public final class OooO0o extends oo0oOO0 {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000000O f60095OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o000000O this$0) {
            super(Intrinsics.stringPlus(this$0.f60076OooOOO0, " writer"), true);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f60095OooO0o0 = this$0;
        }

        @Override // p639o0ooOO0o.oo0oOO0
        public final long OooO00o() {
            o000000O o000000o2 = this.f60095OooO0o0;
            try {
                return o000000o2.OooOO0o() ? 0L : -1L;
            } catch (IOException e) {
                o000000o2.OooO0oo(e, null);
                return -1L;
            }
        }
    }

    public o000000O(@NotNull o00OO0O0 taskRunner, @NotNull o00OOOOo originalRequest, @NotNull WebSocketConnection$webSocketListener$1 listener, @NotNull Random random, long j, long j2) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f60064OooO00o = originalRequest;
        this.f60065OooO0O0 = listener;
        this.f60066OooO0OO = random;
        this.f60067OooO0Oo = j;
        this.f60069OooO0o0 = null;
        this.f60068OooO0o = j2;
        this.f60074OooOO0o = taskRunner.OooO0o();
        this.f60077OooOOOO = new ArrayDeque<>();
        this.f60078OooOOOo = new ArrayDeque<>();
        this.f60081OooOOoo = -1;
        if (!Intrinsics.areEqual("GET", originalRequest.f57314OooO0O0)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("Request must be GET: ", originalRequest.f57314OooO0O0).toString());
        }
        ByteString byteString = ByteString.f60866OooO0oO;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        Unit unit = Unit.INSTANCE;
        this.f60070OooO0oO = ByteString.OooO00o.OooO0o0(bArr).OooO00o();
    }

    public final void OooO(@NotNull String name, @NotNull oO000Oo0 streams) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(streams, "streams");
        o00000O o00000o = this.f60069OooO0o0;
        Intrinsics.checkNotNull(o00000o);
        synchronized (this) {
            this.f60076OooOOO0 = name;
            this.f60075OooOOO = streams;
            boolean z = streams.f60092OooO0Oo;
            this.f60073OooOO0O = new o0000(z, streams.f60093OooO0o, this.f60066OooO0OO, o00000o.f60096OooO00o, z ? o00000o.f60098OooO0OO : o00000o.f60101OooO0o0, this.f60068OooO0o);
            this.f60063OooO = new OooO0o(this);
            long j = this.f60067OooO0Oo;
            if (j != 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                this.f60074OooOO0o.OooO0OO(new o00000O0(Intrinsics.stringPlus(name, " ping"), this, nanos), nanos);
            }
            if (!this.f60078OooOOOo.isEmpty()) {
                OooOO0O();
            }
            Unit unit = Unit.INSTANCE;
        }
        boolean z2 = streams.f60092OooO0Oo;
        this.f60072OooOO0 = new o0000Ooo(z2, streams.f60094OooO0o0, this, o00000o.f60096OooO00o, z2 ^ true ? o00000o.f60098OooO0OO : o00000o.f60101OooO0o0);
    }

    @Override // p634o0ooO0oO.o0O0000O
    public final boolean OooO00o(@NotNull ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        synchronized (this) {
            if (!this.f60082OooOo0 && !this.f60079OooOOo) {
                long j = this.f60080OooOOo0;
                byte[] bArr = bytes.data;
                if (((long) bArr.length) + j <= 16777216) {
                    this.f60080OooOOo0 = j + ((long) bArr.length);
                    this.f60078OooOOOo.add(new OooO0O0(bytes));
                    OooOO0O();
                    return true;
                }
                close(1001, null);
            }
            return false;
        }
    }

    @Override // o0ooo0o.o0000Ooo.OooO00o
    public final void OooO0O0(@NotNull ByteString bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f60065OooO0O0.onMessage(this, bytes);
    }

    @Override // o0ooo0o.o0000Ooo.OooO00o
    public final void OooO0OO(@NotNull String text) throws IOException {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f60065OooO0O0.onMessage(this, text);
    }

    @Override // o0ooo0o.o0000Ooo.OooO00o
    public final synchronized void OooO0Oo(@NotNull ByteString payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!this.f60082OooOo0 && (!this.f60079OooOOo || !this.f60078OooOOOo.isEmpty())) {
            this.f60077OooOOOO.add(payload);
            OooOO0O();
        }
    }

    @Override // o0ooo0o.o0000Ooo.OooO00o
    public final void OooO0o(int i, @NotNull String reason) {
        OooO0OO oooO0OO;
        o0000Ooo o0000ooo;
        o0000 o0000Var;
        Intrinsics.checkNotNullParameter(reason, "reason");
        boolean z = true;
        if (!(i != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            if (this.f60081OooOOoo != -1) {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("already closed".toString());
            }
            this.f60081OooOOoo = i;
            this.f60083OooOo00 = reason;
            oooO0OO = null;
            if (this.f60079OooOOo && this.f60078OooOOOo.isEmpty()) {
                OooO0OO oooO0OO2 = this.f60075OooOOO;
                this.f60075OooOOO = null;
                o0000ooo = this.f60072OooOO0;
                this.f60072OooOO0 = null;
                o0000Var = this.f60073OooOO0O;
                this.f60073OooOO0O = null;
                this.f60074OooOO0o.OooO0o0();
                oooO0OO = oooO0OO2;
            } else {
                o0000ooo = null;
                o0000Var = null;
            }
            Unit unit = Unit.INSTANCE;
        }
        try {
            this.f60065OooO0O0.onClosing(this, i, reason);
            if (oooO0OO != null) {
                this.f60065OooO0O0.onClosed(this, i, reason);
            }
        } finally {
            if (oooO0OO != null) {
                o0O000o0.OooO0OO(oooO0OO);
            }
            if (o0000ooo != null) {
                o0O000o0.OooO0OO(o0000ooo);
            }
            if (o0000Var != null) {
                o0O000o0.OooO0OO(o0000Var);
            }
        }
    }

    @Override // o0ooo0o.o0000Ooo.OooO00o
    public final synchronized void OooO0o0(@NotNull ByteString payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f60085OooOo0o = false;
    }

    public final void OooO0oO(@NotNull o0oOOo response, @Nullable oO0o0o oo0o0o) throws IOException {
        Intrinsics.checkNotNullParameter(response, "response");
        int i = response.f57345OooO0oO;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(' ');
            throw new ProtocolException(oo000o.OooO00o(sb, response.f57343OooO0o, '\''));
        }
        String strOooO0OO = response.OooO0OO("Connection", null);
        if (!StringsKt.OooOO0o("Upgrade", strOooO0OO)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + ((Object) strOooO0OO) + '\'');
        }
        String strOooO0OO2 = response.OooO0OO("Upgrade", null);
        if (!StringsKt.OooOO0o("websocket", strOooO0OO2)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + ((Object) strOooO0OO2) + '\'');
        }
        String strOooO0OO3 = response.OooO0OO("Sec-WebSocket-Accept", null);
        ByteString byteString = ByteString.f60866OooO0oO;
        String strOooO00o = ByteString.OooO00o.OooO0OO(Intrinsics.stringPlus(this.f60070OooO0oO, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11")).OooO0Oo("SHA-1").OooO00o();
        if (Intrinsics.areEqual(strOooO00o, strOooO0OO3)) {
            if (oo0o0o == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strOooO00o + "' but was '" + ((Object) strOooO0OO3) + '\'');
    }

    public final void OooO0oo(@NotNull Exception e, @Nullable o0oOOo o0oooo) {
        Intrinsics.checkNotNullParameter(e, "e");
        synchronized (this) {
            if (this.f60082OooOo0) {
                return;
            }
            this.f60082OooOo0 = true;
            OooO0OO oooO0OO = this.f60075OooOOO;
            this.f60075OooOOO = null;
            o0000Ooo o0000ooo = this.f60072OooOO0;
            this.f60072OooOO0 = null;
            o0000 o0000Var = this.f60073OooOO0O;
            this.f60073OooOO0O = null;
            this.f60074OooOO0o.OooO0o0();
            Unit unit = Unit.INSTANCE;
            try {
                this.f60065OooO0O0.onFailure(this, e, o0oooo);
            } finally {
                if (oooO0OO != null) {
                    o0O000o0.OooO0OO(oooO0OO);
                }
                if (o0000ooo != null) {
                    o0O000o0.OooO0OO(o0000ooo);
                }
                if (o0000Var != null) {
                    o0O000o0.OooO0OO(o0000Var);
                }
            }
        }
    }

    public final void OooOO0() throws IOException {
        while (this.f60081OooOOoo == -1) {
            o0000Ooo o0000ooo = this.f60072OooOO0;
            Intrinsics.checkNotNull(o0000ooo);
            o0000ooo.OooO0OO();
            if (o0000ooo.f60114OooOOO0) {
                o0000ooo.OooO00o();
            } else {
                int i = o0000ooo.f60110OooOO0;
                if (i != 1 && i != 2) {
                    byte[] bArr = o0O000o0.f57386OooO00o;
                    String hexString = Integer.toHexString(i);
                    Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(this)");
                    throw new ProtocolException(Intrinsics.stringPlus("Unknown opcode: ", hexString));
                }
                while (true) {
                    if (o0000ooo.f60104OooO) {
                        throw new IOException("closed");
                    }
                    long j = o0000ooo.f60111OooOO0O;
                    o00000O buffer = o0000ooo.f60116OooOOOo;
                    if (j > 0) {
                        o0000ooo.f60107OooO0o0.o0ooOoO(buffer, j);
                        if (!o0000ooo.f60105OooO0Oo) {
                            o00000O.OooO00o oooO00o = o0000ooo.f60119OooOOoo;
                            Intrinsics.checkNotNull(oooO00o);
                            buffer.Oooo0O0(oooO00o);
                            oooO00o.OooO0OO(buffer.f60177OooO0o0 - o0000ooo.f60111OooOO0O);
                            byte[] bArr2 = o0000ooo.f60117OooOOo;
                            Intrinsics.checkNotNull(bArr2);
                            o00000OO.OooO0O0(oooO00o, bArr2);
                            oooO00o.close();
                        }
                    }
                    if (o0000ooo.f60112OooOO0o) {
                        if (o0000ooo.f60113OooOOO) {
                            o000000 o000000Var = o0000ooo.f60118OooOOo0;
                            if (o000000Var == null) {
                                o000000Var = new o000000(o0000ooo.f60109OooO0oo);
                                o0000ooo.f60118OooOOo0 = o000000Var;
                            }
                            Intrinsics.checkNotNullParameter(buffer, "buffer");
                            o00000O o00000o = o000000Var.f60060OooO0o0;
                            if (!(o00000o.f60177OooO0o0 == 0)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            Inflater inflater = o000000Var.f60059OooO0o;
                            if (o000000Var.f60058OooO0Oo) {
                                inflater.reset();
                            }
                            o00000o.Oooo000(buffer);
                            o00000o.o0ooOOo(65535);
                            long bytesRead = inflater.getBytesRead() + o00000o.f60177OooO0o0;
                            do {
                                o000000Var.f60061OooO0oO.OooO00o(buffer, LongCompanionObject.MAX_VALUE);
                            } while (inflater.getBytesRead() < bytesRead);
                        }
                        o0000Ooo.OooO00o oooO00o2 = o0000ooo.f60106OooO0o;
                        if (i != 1) {
                            oooO00o2.OooO0O0(buffer.Oooo0o0());
                            break;
                        } else {
                            oooO00o2.OooO0OO(buffer.OoooOO0());
                            break;
                        }
                    }
                    while (!o0000ooo.f60104OooO) {
                        o0000ooo.OooO0OO();
                        if (!o0000ooo.f60114OooOOO0) {
                            break;
                        } else {
                            o0000ooo.OooO00o();
                        }
                    }
                    if (o0000ooo.f60110OooOO0 != 0) {
                        int i2 = o0000ooo.f60110OooOO0;
                        byte[] bArr3 = o0O000o0.f57386OooO00o;
                        String hexString2 = Integer.toHexString(i2);
                        Intrinsics.checkNotNullExpressionValue(hexString2, "toHexString(this)");
                        throw new ProtocolException(Intrinsics.stringPlus("Expected continuation opcode. Got: ", hexString2));
                    }
                }
            }
        }
    }

    public final void OooOO0O() {
        byte[] bArr = o0O000o0.f57386OooO00o;
        OooO0o oooO0o = this.f60063OooO;
        if (oooO0o != null) {
            this.f60074OooOO0o.OooO0OO(oooO0o, 0L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final boolean OooOO0o() throws IOException {
        String str;
        o0000Ooo o0000ooo;
        o0000 o0000Var;
        int i;
        ?? r4;
        synchronized (this) {
            if (this.f60082OooOo0) {
                return false;
            }
            o0000 o0000Var2 = this.f60073OooOO0O;
            ByteString byteStringPoll = this.f60077OooOOOO.poll();
            Object obj = null;
            int i2 = -1;
            if (byteStringPoll == null) {
                Object objPoll = this.f60078OooOOOo.poll();
                if (objPoll instanceof OooO00o) {
                    int i3 = this.f60081OooOOoo;
                    str = this.f60083OooOo00;
                    if (i3 != -1) {
                        OooO0OO oooO0OO = this.f60075OooOOO;
                        this.f60075OooOOO = null;
                        o0000ooo = this.f60072OooOO0;
                        this.f60072OooOO0 = null;
                        o0000Var = this.f60073OooOO0O;
                        this.f60073OooOO0O = null;
                        this.f60074OooOO0o.OooO0o0();
                        obj = oooO0OO;
                    } else {
                        this.f60074OooOO0o.OooO0OO(new OooO(Intrinsics.stringPlus(this.f60076OooOOO0, " cancel"), this), TimeUnit.MILLISECONDS.toNanos(((OooO00o) objPoll).f60089OooO0OO));
                        o0000ooo = null;
                        o0000Var = null;
                    }
                    i2 = i3;
                } else {
                    if (objPoll == null) {
                        return false;
                    }
                    str = null;
                    o0000ooo = null;
                    o0000Var = null;
                }
                int i4 = i2;
                r4 = obj;
                obj = objPoll;
                i = i4;
            } else {
                str = null;
                o0000ooo = null;
                o0000Var = null;
                i = -1;
                r4 = 0;
            }
            Unit unit = Unit.INSTANCE;
            try {
                if (byteStringPoll != null) {
                    Intrinsics.checkNotNull(o0000Var2);
                    ByteString payload = byteStringPoll;
                    o0000Var2.getClass();
                    Intrinsics.checkNotNullParameter(payload, "payload");
                    o0000Var2.OooO00o(10, payload);
                } else if (obj instanceof OooO0O0) {
                    OooO0O0 oooO0O0 = (OooO0O0) obj;
                    Intrinsics.checkNotNull(o0000Var2);
                    o0000Var2.OooO0OO(oooO0O0.f60090OooO00o, oooO0O0.f60091OooO0O0);
                    synchronized (this) {
                        this.f60080OooOOo0 -= (long) oooO0O0.f60091OooO0O0.OooO0o0();
                    }
                } else {
                    if (!(obj instanceof OooO00o)) {
                        throw new AssertionError();
                    }
                    OooO00o oooO00o = (OooO00o) obj;
                    Intrinsics.checkNotNull(o0000Var2);
                    int i5 = oooO00o.f60087OooO00o;
                    ByteString byteString = oooO00o.f60088OooO0O0;
                    o0000Var2.getClass();
                    ByteString byteStringOooo0o0 = ByteString.f60866OooO0oO;
                    if (i5 != 0 || byteString != null) {
                        if (i5 != 0) {
                            String strOooO00o = o00000OO.OooO00o(i5);
                            if (!(strOooO00o == null)) {
                                Intrinsics.checkNotNull(strOooO00o);
                                throw new IllegalArgumentException(strOooO00o.toString());
                            }
                        }
                        o00000O o00000o = new o00000O();
                        o00000o.oo0o0Oo(i5);
                        if (byteString != null) {
                            o00000o.OoooooO(byteString);
                        }
                        byteStringOooo0o0 = o00000o.Oooo0o0();
                    }
                    try {
                        o0000Var2.OooO00o(8, byteStringOooo0o0);
                        o0000Var2.f60052OooOO0o = true;
                        if (r4 != 0) {
                            o0O000 o0o001 = this.f60065OooO0O0;
                            Intrinsics.checkNotNull(str);
                            o0o001.onClosed(this, i, str);
                        }
                    } catch (Throwable th) {
                        o0000Var2.f60052OooOO0o = true;
                        throw th;
                    }
                }
                if (r4 != 0) {
                    o0O000o0.OooO0OO(r4);
                }
                if (o0000ooo != null) {
                    o0O000o0.OooO0OO(o0000ooo);
                }
                if (o0000Var != null) {
                    o0O000o0.OooO0OO(o0000Var);
                }
                return true;
            } catch (Throwable th2) {
                if (r4 != 0) {
                    o0O000o0.OooO0OO(r4);
                }
                if (o0000ooo != null) {
                    o0O000o0.OooO0OO(o0000ooo);
                }
                if (o0000Var != null) {
                    o0O000o0.OooO0OO(o0000Var);
                }
                throw th2;
            }
        }
    }

    @Override // p634o0ooO0oO.o0O0000O
    public final boolean close(int i, @Nullable String str) {
        ByteString byteStringOooO0OO;
        synchronized (this) {
            try {
                String strOooO00o = o00000OO.OooO00o(i);
                if (!(strOooO00o == null)) {
                    Intrinsics.checkNotNull(strOooO00o);
                    throw new IllegalArgumentException(strOooO00o.toString());
                }
                if (str != null) {
                    ByteString byteString = ByteString.f60866OooO0oO;
                    byteStringOooO0OO = ByteString.OooO00o.OooO0OO(str);
                    if (!(((long) byteStringOooO0OO.data.length) <= 123)) {
                        throw new IllegalArgumentException(Intrinsics.stringPlus("reason.size() > 123: ", str).toString());
                    }
                } else {
                    byteStringOooO0OO = null;
                }
                if (!this.f60082OooOo0 && !this.f60079OooOOo) {
                    this.f60079OooOOo = true;
                    this.f60078OooOOOo.add(new OooO00o(i, byteStringOooO0OO));
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
