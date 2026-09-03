package p651o0ooOoOO;

import java.net.ProtocolException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p449o0OoOoOo.o0OOOO0o;
import p449o0OoOoOo.o0o0000;
import p660o0ooo0o0.o00OO;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o0O00o0;
import p660o0ooo0o0.o0oOO;
import p660o0ooo0o0.oo0o0O0;
import p663o0oooO0.o00O0OO;
import p664o0oooO00.o000000O;
import p672o0oooOoO.fk;
import p672o0oooOoO.gk;

/* JADX INFO: loaded from: classes.dex */
public final class jj extends o0OOOO0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o00OO f51144OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final o00OOO00 f51145OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public fk f51146OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooO00o f51147OooO0o0;

    public static final class OooO00o extends o0O00o0 {
        public OooO00o() {
        }

        @Override // p660o0ooo0o0.o0O00o0
        public final void OooO00o(@NotNull o0oOO webSocket, int i, @NotNull String reason) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(reason, "reason");
            jj jjVar = jj.this;
            o0o0000 o0o0000Var = jjVar.f40296OooO00o;
            if (o0o0000Var == null) {
                return;
            }
            o0o0000Var.OooO00o(jjVar, i, reason);
        }

        @Override // p660o0ooo0o0.o0O00o0
        public final void OooO0O0(@NotNull o0oOO webSocket, int i, @NotNull String reason) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(reason, "reason");
            jj jjVar = jj.this;
            o0o0000 o0o0000Var = jjVar.f40296OooO00o;
            if (o0o0000Var == null) {
                return;
            }
            o0o0000Var.OooO0O0(jjVar, i, reason);
        }

        @Override // p660o0ooo0o0.o0O00o0
        public final void OooO0OO(@NotNull o0oOO webSocket, @NotNull Throwable t, @Nullable o00OOOO0 o00oooo1) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(t, "t");
            jj jjVar = jj.this;
            o0o0000 o0o0000Var = jjVar.f40296OooO00o;
            if (o0o0000Var == null) {
                return;
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("response code is ");
            sbOooO0o0.append(o00oooo1 == null ? null : Integer.valueOf(o00oooo1.f51443OoooO00));
            sbOooO0o0.append(", ");
            sbOooO0o0.append((Object) (o00oooo1 != null ? o00oooo1.f51437Oooo : null));
            o0o0000Var.OooO0OO(jjVar, t, sbOooO0o0.toString());
        }

        @Override // p660o0ooo0o0.o0O00o0
        public final void OooO0Oo(@NotNull o0oOO webSocket, @NotNull String text) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(text, "text");
            jj jjVar = jj.this;
            o0o0000 o0o0000Var = jjVar.f40296OooO00o;
            if (o0o0000Var == null) {
                return;
            }
            o0o0000Var.OooO0Oo(jjVar, text);
        }

        @Override // p660o0ooo0o0.o0O00o0
        public final void OooO0o(@NotNull o0oOO webSocket, @NotNull o00OOOO0 response) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(response, "response");
            jj jjVar = jj.this;
            o0o0000 o0o0000Var = jjVar.f40296OooO00o;
            if (o0o0000Var == null) {
                return;
            }
            int i = response.f51443OoooO00;
            if (i == 101) {
                i = 100;
            }
            o0o0000Var.OooO0o(jjVar, i, response.f51437Oooo);
        }

        @Override // p660o0ooo0o0.o0O00o0
        public final void OooO0o0(@NotNull o0oOO webSocket, @NotNull ByteString bytes) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            jj jjVar = jj.this;
            o0o0000 o0o0000Var = jjVar.f40296OooO00o;
            if (o0o0000Var == null) {
                return;
            }
            o0o0000Var.OooO0o0(jjVar, bytes.OooOOO0());
        }
    }

    public jj(@NotNull o00OO okHttpClient, @NotNull o00OOO00 originalRequest) {
        Intrinsics.checkNotNullParameter(okHttpClient, "okHttpClient");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f51144OooO0O0 = okHttpClient;
        this.f51145OooO0OO = originalRequest;
        this.f51147OooO0o0 = new OooO00o();
    }

    @Override // p449o0OoOoOo.o0OOo000
    public final boolean OooOO0(@NotNull byte[] bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        fk fkVar = this.f51146OooO0Oo;
        boolean z = false;
        if (fkVar != null) {
            ByteString bytes2 = ByteString.f53047OoooO00.OooO0Oo(bytes, 0, bytes.length);
            Intrinsics.checkNotNullParameter(bytes2, "bytes");
            synchronized (fkVar) {
                if (!fkVar.f51973OooOOOO && !fkVar.f51970OooOO0o) {
                    long j = fkVar.f51969OooOO0O;
                    byte[] bArr = bytes2.data;
                    if (((long) bArr.length) + j > 16777216) {
                        fkVar.OooO0oO(1001, null);
                    } else {
                        fkVar.f51969OooOO0O = j + ((long) bArr.length);
                        fkVar.f51968OooOO0.add(new fk.OooO0O0(bytes2));
                        fkVar.OooOO0O();
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    @Override // p449o0OoOoOo.o0OOo000
    public final boolean OooOO0O(int i) {
        if (i != 1000) {
            if (!(400 <= i && i < 500)) {
                return true;
            }
        }
        return false;
    }

    @Override // p449o0OoOoOo.o0OOo000
    public final boolean OooOO0o(int i, @NotNull String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        fk fkVar = this.f51146OooO0Oo;
        if (fkVar == null) {
            return false;
        }
        return fkVar.OooO0oO(i, reason);
    }

    @Override // p449o0OoOoOo.o0OOo000
    public final void open() {
        o00OO client = this.f51144OooO0O0;
        o00OOO00 request = this.f51145OooO0OO;
        OooO00o listener = this.f51147OooO0o0;
        Objects.requireNonNull(client);
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(listener, "listener");
        fk fkVar = new fk(o000000O.f51825OooO0oo, request, listener, new Random(), client.f51344o00Oo0, client.f51345o00Ooo);
        Intrinsics.checkNotNullParameter(client, "client");
        if (fkVar.f51975OooOOo.OooO0O0("Sec-WebSocket-Extensions") != null) {
            fkVar.OooO0oo(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
        } else {
            o00OO.OooO00o oooO00oOooO0Oo = client.OooO0Oo();
            oooO00oOooO0Oo.OooO0o0(oo0o0O0.NONE);
            List<Protocol> protocols = fk.f51958OooOo;
            Intrinsics.checkNotNullParameter(protocols, "protocols");
            List mutableList = CollectionsKt.toMutableList((Collection) protocols);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!(mutableList.contains(protocol) || mutableList.contains(Protocol.HTTP_1_1))) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + mutableList).toString());
            }
            if (!(!mutableList.contains(protocol) || mutableList.size() <= 1)) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + mutableList).toString());
            }
            if (!(!mutableList.contains(Protocol.HTTP_1_0))) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + mutableList).toString());
            }
            if (!(!mutableList.contains(null))) {
                throw new IllegalArgumentException("protocols must not contain null".toString());
            }
            mutableList.remove(Protocol.SPDY_3);
            if (!Intrinsics.areEqual(mutableList, oooO00oOooO0Oo.f51370OooOo00)) {
                oooO00oOooO0Oo.f51378OooOooO = null;
            }
            List<? extends Protocol> listUnmodifiableList = Collections.unmodifiableList(mutableList);
            Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "Collections.unmodifiableList(protocolsCopy)");
            oooO00oOooO0Oo.f51370OooOo00 = listUnmodifiableList;
            o00OO o00oo2 = new o00OO(oooO00oOooO0Oo);
            o00OOO00.OooO00o oooO00o = new o00OOO00.OooO00o(fkVar.f51975OooOOo);
            oooO00o.OooO0o0("Upgrade", "websocket");
            oooO00o.OooO0o0("Connection", "Upgrade");
            oooO00o.OooO0o0("Sec-WebSocket-Key", fkVar.f51960OooO00o);
            oooO00o.OooO0o0("Sec-WebSocket-Version", "13");
            oooO00o.OooO0o0("Sec-WebSocket-Extensions", "permessage-deflate");
            o00OOO00 o00ooo00OooO0O0 = oooO00o.OooO0O0();
            o00O0OO o00o0oo2 = new o00O0OO(o00oo2, o00ooo00OooO0O0, true);
            fkVar.f51961OooO0O0 = o00o0oo2;
            Intrinsics.checkNotNull(o00o0oo2);
            o00o0oo2.OoooO0O(new gk(fkVar, o00ooo00OooO0O0));
        }
        this.f51146OooO0Oo = fkVar;
    }
}
