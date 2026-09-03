package p672o0oooOoO;

import Oooo000.o00oO0o;
import com.qiniu.android.http.request.Request;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import okhttp3.Protocol;
import okio.ByteString;
import org.conscrypt.EvpMdRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o0O00o0;
import p660o0ooo0o0.o0oOO;
import p663o0oooO0.o00O0OO;
import p663o0oooO0.o00O0OO0;
import p664o0oooO00.o000000;
import p664o0oooO00.o000000O;
import p664o0oooO00.oo0o0Oo;
import p674o0oooo0.o0oOOo;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes3.dex */
public final class fk implements o0oOO, jk.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final List<Protocol> f51958OooOo = CollectionsKt.listOf(Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final ArrayDeque<ByteString> f51959OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f51960OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public o00O0OO f51961OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public OooO0o f51962OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public jk f51963OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o000000 f51964OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public kk f51965OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public String f51966OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooO0OO f51967OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ArrayDeque<Object> f51968OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f51969OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f51970OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public String f51971OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public int f51972OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f51973OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f51974OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final o00OOO00 f51975OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public boolean f51976OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o0O00o0 f51977OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final long f51978OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final Random f51979OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public hk f51980OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f51981OooOo0o;

    public static final class OooO extends oo0o0Oo {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ fk f51982OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f51983OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(String str, long j, fk fkVar) {
            super(str, true);
            this.f51983OooO0o0 = j;
            this.f51982OooO0o = fkVar;
        }

        @Override // p664o0oooO00.oo0o0Oo
        public final long OooO00o() {
            kk kkVar;
            fk fkVar = this.f51982OooO0o;
            synchronized (fkVar) {
                if (!fkVar.f51973OooOOOO && (kkVar = fkVar.f51965OooO0o0) != null) {
                    int i = fkVar.f51976OooOOo0 ? fkVar.f51974OooOOOo : -1;
                    fkVar.f51974OooOOOo++;
                    fkVar.f51976OooOOo0 = true;
                    Unit unit = Unit.INSTANCE;
                    if (i != -1) {
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("sent ping but didn't receive pong within ");
                        sbOooO0o0.append(fkVar.f51978OooOo0);
                        sbOooO0o0.append("ms (after ");
                        sbOooO0o0.append(i - 1);
                        sbOooO0o0.append(" successful ping/pongs)");
                        fkVar.OooO0oo(new SocketTimeoutException(sbOooO0o0.toString()), null);
                    } else {
                        try {
                            ByteString payload = ByteString.f53046Oooo;
                            Intrinsics.checkNotNullParameter(payload, "payload");
                            kkVar.OooO00o(9, payload);
                        } catch (IOException e) {
                            fkVar.OooO0oo(e, null);
                        }
                    }
                }
            }
            return this.f51983OooO0o0;
        }
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f51984OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final ByteString f51985OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f51986OooO0OO = 60000;

        public OooO00o(int i, @Nullable ByteString byteString) {
            this.f51984OooO00o = i;
            this.f51985OooO0O0 = byteString;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f51987OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final ByteString f51988OooO0O0;

        public OooO0O0(@NotNull ByteString data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.f51987OooO00o = 2;
            this.f51988OooO0O0 = data;
        }
    }

    public static abstract class OooO0OO implements Closeable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final boolean f51989Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @NotNull
        public final o0oOOo f51990Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        @NotNull
        public final oo00oO f51991Oooo0oo;

        public OooO0OO(@NotNull o0oOOo source, @NotNull oo00oO sink) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            this.f51989Oooo0o = true;
            this.f51990Oooo0oO = source;
            this.f51991Oooo0oo = sink;
        }
    }

    public final class OooO0o extends oo0o0Oo {
        public OooO0o() {
            super(p058o0000OoO.OooO.OooO00o(new StringBuilder(), fk.this.f51966OooO0oO, " writer"), true);
        }

        @Override // p664o0oooO00.oo0o0Oo
        public final long OooO00o() {
            try {
                return fk.this.OooOO0o() ? 0L : -1L;
            } catch (IOException e) {
                fk.this.OooO0oo(e, null);
                return -1L;
            }
        }
    }

    public static final class OooOO0 extends oo0o0Oo {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ fk f51993OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(String str, fk fkVar) {
            super(str, true);
            this.f51993OooO0o0 = fkVar;
        }

        @Override // p664o0oooO00.oo0o0Oo
        public final long OooO00o() {
            o00O0OO o00o0oo2 = this.f51993OooO0o0.f51961OooO0O0;
            Intrinsics.checkNotNull(o00o0oo2);
            o00o0oo2.cancel();
            return -1L;
        }
    }

    public fk(@NotNull o000000O taskRunner, @NotNull o00OOO00 originalRequest, @NotNull o0O00o0 listener, @NotNull Random random, long j, long j2) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(random, "random");
        this.f51975OooOOo = originalRequest;
        this.f51977OooOOoo = listener;
        this.f51979OooOo00 = random;
        this.f51978OooOo0 = j;
        this.f51980OooOo0O = null;
        this.f51981OooOo0o = j2;
        this.f51964OooO0o = taskRunner.OooO0o();
        this.f51959OooO = new ArrayDeque<>();
        this.f51968OooOO0 = new ArrayDeque<>();
        this.f51972OooOOO0 = -1;
        if (!Intrinsics.areEqual(Request.HttpMethodGet, originalRequest.f51426OooO0OO)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Request must be GET: ");
            sbOooO0o0.append(originalRequest.f51426OooO0OO);
            throw new IllegalArgumentException(sbOooO0o0.toString().toString());
        }
        ByteString.OooO00o oooO00o = ByteString.f53047OoooO00;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        Unit unit = Unit.INSTANCE;
        this.f51960OooO00o = oooO00o.OooO0Oo(bArr, 0, 16).OooO00o();
    }

    public final void OooO(@NotNull String name, @NotNull OooO0OO streams) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(streams, "streams");
        hk hkVar = this.f51980OooOo0O;
        Intrinsics.checkNotNull(hkVar);
        synchronized (this) {
            this.f51966OooO0oO = name;
            this.f51967OooO0oo = streams;
            boolean z = streams.f51989Oooo0o;
            this.f51965OooO0o0 = new kk(z, streams.f51991Oooo0oo, this.f51979OooOo00, hkVar.f51996OooO00o, z ? hkVar.f51998OooO0OO : hkVar.f52001OooO0o0, this.f51981OooOo0o);
            this.f51962OooO0OO = new OooO0o();
            long j = this.f51978OooOo0;
            if (j != 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(j);
                this.f51964OooO0o.OooO0OO(new OooO(name + " ping", nanos, this), nanos);
            }
            if (!this.f51968OooOO0.isEmpty()) {
                OooOO0O();
            }
            Unit unit = Unit.INSTANCE;
        }
        boolean z2 = streams.f51989Oooo0o;
        this.f51963OooO0Oo = new jk(z2, streams.f51990Oooo0oO, this, hkVar.f51996OooO00o, z2 ^ true ? hkVar.f51998OooO0OO : hkVar.f52001OooO0o0);
    }

    @Override // o0oooOoO.jk.OooO00o
    public final void OooO00o(@NotNull ByteString bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        this.f51977OooOOoo.OooO0o0(this, bytes);
    }

    @Override // o0oooOoO.jk.OooO00o
    public final void OooO0O0(@NotNull String text) throws IOException {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f51977OooOOoo.OooO0Oo(this, text);
    }

    @Override // o0oooOoO.jk.OooO00o
    public final synchronized void OooO0OO(@NotNull ByteString payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!this.f51973OooOOOO && (!this.f51970OooOO0o || !this.f51968OooOO0.isEmpty())) {
            this.f51959OooO.add(payload);
            OooOO0O();
        }
    }

    @Override // o0oooOoO.jk.OooO00o
    public final synchronized void OooO0Oo(@NotNull ByteString payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f51976OooOOo0 = false;
    }

    public final void OooO0o(@NotNull o00OOOO0 response, @Nullable o00O0OO0 o00o0oo1) throws IOException {
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.f51443OoooO00 != 101) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Expected HTTP 101 response but was '");
            sbOooO0o0.append(response.f51443OoooO00);
            sbOooO0o0.append(' ');
            throw new ProtocolException(o00oO0o.OooO0O0(sbOooO0o0, response.f51437Oooo, '\''));
        }
        String strOooO0O0 = response.OooO0O0("Connection", null);
        if (!StringsKt.OooO("Upgrade", strOooO0O0)) {
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + strOooO0O0 + '\'');
        }
        String strOooO0O1 = response.OooO0O0("Upgrade", null);
        if (!StringsKt.OooO("websocket", strOooO0O1)) {
            throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + strOooO0O1 + '\'');
        }
        String strOooO0O2 = response.OooO0O0("Sec-WebSocket-Accept", null);
        String strOooO00o = ByteString.f53047OoooO00.OooO0OO(this.f51960OooO00o + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").OooO0O0(EvpMdRef.SHA1.JCA_NAME).OooO00o();
        if (!(!Intrinsics.areEqual(strOooO00o, strOooO0O2))) {
            if (o00o0oo1 == null) {
                throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
            }
            return;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strOooO00o + "' but was '" + strOooO0O2 + '\'');
    }

    @Override // o0oooOoO.jk.OooO00o
    public final void OooO0o0(int i, @NotNull String reason) {
        OooO0OO oooO0OO;
        jk jkVar;
        kk kkVar;
        Intrinsics.checkNotNullParameter(reason, "reason");
        if (!(i != -1)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        synchronized (this) {
            if (!(this.f51972OooOOO0 == -1)) {
                throw new IllegalStateException("already closed".toString());
            }
            this.f51972OooOOO0 = i;
            this.f51971OooOOO = reason;
            oooO0OO = null;
            if (this.f51970OooOO0o && this.f51968OooOO0.isEmpty()) {
                OooO0OO oooO0OO2 = this.f51967OooO0oo;
                this.f51967OooO0oo = null;
                jkVar = this.f51963OooO0Oo;
                this.f51963OooO0Oo = null;
                kkVar = this.f51965OooO0o0;
                this.f51965OooO0o0 = null;
                this.f51964OooO0o.OooO0o();
                oooO0OO = oooO0OO2;
            } else {
                jkVar = null;
                kkVar = null;
            }
            Unit unit = Unit.INSTANCE;
        }
        try {
            this.f51977OooOOoo.OooO0O0(this, i, reason);
            if (oooO0OO != null) {
                this.f51977OooOOoo.OooO00o(this, i, reason);
            }
        } finally {
            if (oooO0OO != null) {
                p659o0ooo0o.o00OOO00.OooO0Oo(oooO0OO);
            }
            if (jkVar != null) {
                p659o0ooo0o.o00OOO00.OooO0Oo(jkVar);
            }
            if (kkVar != null) {
                p659o0ooo0o.o00OOO00.OooO0Oo(kkVar);
            }
        }
    }

    public final boolean OooO0oO(int i, @Nullable String str) {
        synchronized (this) {
            ik.OooO0OO(i);
            ByteString byteStringOooO0OO = null;
            if (str != null) {
                byteStringOooO0OO = ByteString.f53047OoooO00.OooO0OO(str);
                if (!(((long) byteStringOooO0OO.data.length) <= 123)) {
                    throw new IllegalArgumentException(("reason.size() > 123: " + str).toString());
                }
            }
            if (!this.f51973OooOOOO && !this.f51970OooOO0o) {
                this.f51970OooOO0o = true;
                this.f51968OooOO0.add(new OooO00o(i, byteStringOooO0OO));
                OooOO0O();
                return true;
            }
            return false;
        }
    }

    public final void OooO0oo(@NotNull Exception e, @Nullable o00OOOO0 o00oooo1) {
        Intrinsics.checkNotNullParameter(e, "e");
        synchronized (this) {
            if (this.f51973OooOOOO) {
                return;
            }
            this.f51973OooOOOO = true;
            OooO0OO oooO0OO = this.f51967OooO0oo;
            this.f51967OooO0oo = null;
            jk jkVar = this.f51963OooO0Oo;
            this.f51963OooO0Oo = null;
            kk kkVar = this.f51965OooO0o0;
            this.f51965OooO0o0 = null;
            this.f51964OooO0o.OooO0o();
            Unit unit = Unit.INSTANCE;
            try {
                this.f51977OooOOoo.OooO0OO(this, e, o00oooo1);
            } finally {
                if (oooO0OO != null) {
                    p659o0ooo0o.o00OOO00.OooO0Oo(oooO0OO);
                }
                if (jkVar != null) {
                    p659o0ooo0o.o00OOO00.OooO0Oo(jkVar);
                }
                if (kkVar != null) {
                    p659o0ooo0o.o00OOO00.OooO0Oo(kkVar);
                }
            }
        }
    }

    public final void OooOO0() throws IOException {
        while (this.f51972OooOOO0 == -1) {
            jk jkVar = this.f51963OooO0Oo;
            Intrinsics.checkNotNull(jkVar);
            jkVar.OooO0O0();
            if (jkVar.f52008OoooO00) {
                jkVar.OooO00o();
            } else {
                int i = jkVar.f52004Oooo0oO;
                if (i != 1 && i != 2) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Unknown opcode: ");
                    sbOooO0o0.append(p659o0ooo0o.o00OOO00.OooOo(i));
                    throw new ProtocolException(sbOooO0o0.toString());
                }
                while (true) {
                    if (jkVar.f52003Oooo0o) {
                        throw new IOException("closed");
                    }
                    long j = jkVar.f52005Oooo0oo;
                    if (j > 0) {
                        jkVar.f52013OoooOo0.o0O0O00(jkVar.f52006OoooO, j);
                        if (!jkVar.f52012OoooOOo) {
                            p674o0oooo0.o0oOO o0ooo2 = jkVar.f52006OoooO;
                            o0oooo0.o0oOO.OooO00o oooO00o = jkVar.f52011OoooOOO;
                            Intrinsics.checkNotNull(oooO00o);
                            o0ooo2.OooOoOO(oooO00o);
                            jkVar.f52011OoooOOO.OooO0O0(jkVar.f52006OoooO.f52099Oooo0oO - jkVar.f52005Oooo0oo);
                            o0oooo0.o0oOO.OooO00o oooO00o2 = jkVar.f52011OoooOOO;
                            byte[] bArr = jkVar.f52017o000oOoO;
                            Intrinsics.checkNotNull(bArr);
                            ik.OooO0O0(oooO00o2, bArr);
                            jkVar.f52011OoooOOO.close();
                        }
                    }
                    if (jkVar.f52002Oooo) {
                        if (jkVar.f52007OoooO0) {
                            ek ekVar = jkVar.f52010OoooOO0;
                            if (ekVar == null) {
                                ekVar = new ek(jkVar.f52016Ooooo00);
                                jkVar.f52010OoooOO0 = ekVar;
                            }
                            p674o0oooo0.o0oOO buffer = jkVar.f52006OoooO;
                            Intrinsics.checkNotNullParameter(buffer, "buffer");
                            if (!(ekVar.f51955Oooo0o.f52099Oooo0oO == 0)) {
                                throw new IllegalArgumentException("Failed requirement.".toString());
                            }
                            if (ekVar.f51954Oooo) {
                                ekVar.f51956Oooo0oO.reset();
                            }
                            ekVar.f51955Oooo0o.o0ooOOo(buffer);
                            ekVar.f51955Oooo0o.o0OoOo0(65535);
                            long bytesRead = ekVar.f51956Oooo0oO.getBytesRead() + ekVar.f51955Oooo0o.f52099Oooo0oO;
                            do {
                                ekVar.f51957Oooo0oo.OooO00o(buffer, Long.MAX_VALUE);
                            } while (ekVar.f51956Oooo0oO.getBytesRead() < bytesRead);
                        }
                        if (i != 1) {
                            jkVar.f52014OoooOoO.OooO00o(jkVar.f52006OoooO.OooOoo());
                            break;
                        } else {
                            jkVar.f52014OoooOoO.OooO0O0(jkVar.f52006OoooO.Oooo0o());
                            break;
                        }
                    }
                    while (!jkVar.f52003Oooo0o) {
                        jkVar.OooO0O0();
                        if (!jkVar.f52008OoooO00) {
                            break;
                        } else {
                            jkVar.OooO00o();
                        }
                    }
                    if (jkVar.f52004Oooo0oO != 0) {
                        StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("Expected continuation opcode. Got: ");
                        sbOooO0o1.append(p659o0ooo0o.o00OOO00.OooOo(jkVar.f52004Oooo0oO));
                        throw new ProtocolException(sbOooO0o1.toString());
                    }
                }
            }
        }
    }

    public final void OooOO0O() {
        byte[] bArr = p659o0ooo0o.o00OOO00.f51183OooO00o;
        OooO0o oooO0o = this.f51962OooO0OO;
        if (oooO0o != null) {
            this.f51964OooO0o.OooO0OO(oooO0o, 0L);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10, types: [T, o0oooOoO.jk] */
    /* JADX WARN: Type inference failed for: r3v11, types: [T, o0oooOoO.kk] */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, o0oooOoO.fk$OooO0OO] */
    public final boolean OooOO0o() throws IOException {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = null;
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.element = null;
        Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        objectRef3.element = null;
        Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        objectRef4.element = null;
        Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
        objectRef5.element = null;
        synchronized (this) {
            if (this.f51973OooOOOO) {
                return false;
            }
            kk kkVar = this.f51965OooO0o0;
            ByteString payload = this.f51959OooO.poll();
            if (payload == null) {
                ?? Poll = this.f51968OooOO0.poll();
                objectRef.element = Poll;
                if (Poll instanceof OooO00o) {
                    int i = this.f51972OooOOO0;
                    intRef.element = i;
                    objectRef2.element = this.f51971OooOOO;
                    if (i != -1) {
                        objectRef3.element = this.f51967OooO0oo;
                        this.f51967OooO0oo = null;
                        objectRef4.element = this.f51963OooO0Oo;
                        this.f51963OooO0Oo = null;
                        objectRef5.element = this.f51965OooO0o0;
                        this.f51965OooO0o0 = null;
                        this.f51964OooO0o.OooO0o();
                    } else {
                        T t = objectRef.element;
                        if (t == 0) {
                            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close");
                        }
                        long j = ((OooO00o) t).f51986OooO0OO;
                        this.f51964OooO0o.OooO0OO(new OooOO0(this.f51966OooO0oO + " cancel", this), TimeUnit.MILLISECONDS.toNanos(j));
                    }
                } else if (Poll == 0) {
                    return false;
                }
            }
            Unit unit = Unit.INSTANCE;
            try {
                if (payload != null) {
                    Intrinsics.checkNotNull(kkVar);
                    Objects.requireNonNull(kkVar);
                    Intrinsics.checkNotNullParameter(payload, "payload");
                    kkVar.OooO00o(10, payload);
                } else {
                    T t2 = objectRef.element;
                    if (t2 instanceof OooO0O0) {
                        if (t2 == 0) {
                            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Message");
                        }
                        OooO0O0 oooO0O0 = (OooO0O0) t2;
                        Intrinsics.checkNotNull(kkVar);
                        kkVar.OooO0O0(oooO0O0.f51987OooO00o, oooO0O0.f51988OooO0O0);
                        synchronized (this) {
                            this.f51969OooOO0O -= (long) oooO0O0.f51988OooO0O0.OooO0o0();
                        }
                    } else {
                        if (!(t2 instanceof OooO00o)) {
                            throw new AssertionError();
                        }
                        if (t2 == 0) {
                            throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close");
                        }
                        OooO00o oooO00o = (OooO00o) t2;
                        Intrinsics.checkNotNull(kkVar);
                        int i2 = oooO00o.f51984OooO00o;
                        ByteString byteString = oooO00o.f51985OooO0O0;
                        Objects.requireNonNull(kkVar);
                        ByteString byteStringOooOoo = ByteString.f53046Oooo;
                        if (i2 != 0 || byteString != null) {
                            if (i2 != 0) {
                                ik.OooO0OO(i2);
                            }
                            p674o0oooo0.o0oOO o0ooo2 = new p674o0oooo0.o0oOO();
                            o0ooo2.o00Oo0(i2);
                            if (byteString != null) {
                                o0ooo2.OoooOOO(byteString);
                            }
                            byteStringOooOoo = o0ooo2.OooOoo();
                        }
                        try {
                            kkVar.OooO00o(8, byteStringOooOoo);
                            kkVar.f52021Oooo0oo = true;
                            if (((OooO0OO) objectRef3.element) != null) {
                                o0O00o0 o0o00o1 = this.f51977OooOOoo;
                                int i3 = intRef.element;
                                String str = (String) objectRef2.element;
                                Intrinsics.checkNotNull(str);
                                o0o00o1.OooO00o(this, i3, str);
                            }
                        } catch (Throwable th) {
                            kkVar.f52021Oooo0oo = true;
                            throw th;
                        }
                    }
                }
                OooO0OO oooO0OO = (OooO0OO) objectRef3.element;
                if (oooO0OO != null) {
                    p659o0ooo0o.o00OOO00.OooO0Oo(oooO0OO);
                }
                jk jkVar = (jk) objectRef4.element;
                if (jkVar != null) {
                    p659o0ooo0o.o00OOO00.OooO0Oo(jkVar);
                }
                kk kkVar2 = (kk) objectRef5.element;
                if (kkVar2 != null) {
                    p659o0ooo0o.o00OOO00.OooO0Oo(kkVar2);
                }
                return true;
            } catch (Throwable th2) {
                OooO0OO oooO0OO2 = (OooO0OO) objectRef3.element;
                if (oooO0OO2 != null) {
                    p659o0ooo0o.o00OOO00.OooO0Oo(oooO0OO2);
                }
                jk jkVar2 = (jk) objectRef4.element;
                if (jkVar2 != null) {
                    p659o0ooo0o.o00OOO00.OooO0Oo(jkVar2);
                }
                kk kkVar3 = (kk) objectRef5.element;
                if (kkVar3 != null) {
                    p659o0ooo0o.o00OOO00.OooO0Oo(kkVar3);
                }
                throw th2;
            }
        }
    }
}
