package p479o0o000OO;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleService;
import com.code.android.util.o000000;
import com.common.support.longlink.LongLink;
import com.common.support.longlink.MessageHandler;
import com.common.support.longlink.Protocol;
import com.common.support.longlink.connection.DefaultReconnectionConfig;
import com.common.support.longlink.connection.ReconnectionConfig;
import com.common.support.longlink.pulse.DefaultPulseAdapter;
import com.common.support.longlinksocket.Address;
import com.common.support.longlinksocket.SocketBasedConnectionFactory;
import com.common.support.longlinksocket.SocketConfig;
import com.common.support.longlinksocket.SocketProtocol;
import com.facebook.internal.security.CertificateUtil;
import com.yalla.yalla.service.room.RoomLiveService;
import java.security.SecureRandom;
import java.util.List;
import kotlin.UByte;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p382o0OOoo0o.o00Ooo;
import p579o0oOoo.oO0000o0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOo implements OooOOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f47637OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LifecycleService f47638OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f47639OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public LongLink<Oooo0> f47640OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooO00o f47641OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public OooOo00 f47642OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public o00Oo0 f47643OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Oooo000 f47644OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public String f47645OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f47646OooOO0;

    public static final class OooO00o implements Protocol<Oooo0, Oooo0> {
        @Override // com.common.support.longlink.Protocol
        public final boolean isPulseMessage(Oooo0 oooo0) {
            Oooo0 message = oooo0;
            Intrinsics.checkNotNullParameter(message, "message");
            return message.f47654OooO00o == 100;
        }

        @Override // com.common.support.longlink.Protocol
        public final byte[] pack(Oooo0 oooo0) {
            Oooo0 message = oooo0;
            Intrinsics.checkNotNullParameter(message, "message");
            return message.OooO00o();
        }

        @Override // com.common.support.longlink.Protocol
        public final Oooo0 pingMessage() {
            SecureRandom secureRandom = Oooo0.f47653OooO0Oo;
            return Oooo0.OooO00o.OooO00o(100L, false, new byte[0]);
        }

        @Override // com.common.support.longlink.Protocol
        public final Oooo0 pongMessage() {
            return (Oooo0) Protocol.DefaultImpls.pongMessage(this);
        }

        @Override // com.common.support.longlink.Protocol
        public final Oooo0 unpack(byte[] message) {
            Intrinsics.checkNotNullParameter(message, "message");
            SecureRandom secureRandom = Oooo0.f47653OooO0Oo;
            Intrinsics.checkNotNullParameter(message, "byte");
            byte[] bArr = new byte[4];
            System.arraycopy(message, 0, bArr, 0, 4);
            int iOooO0O0 = oO0000o0.OooO0O0(bArr);
            byte[] bArr2 = new byte[4];
            System.arraycopy(message, 4, bArr2, 0, 4);
            int iOooO0O1 = oO0000o0.OooO0O0(bArr2);
            int i = (iOooO0O0 - 4) - 4;
            byte[] bArr3 = new byte[i];
            System.arraycopy(message, 8, bArr3, 0, i);
            return new Oooo0(iOooO0O1, bArr3, 0);
        }
    }

    public static final class OooO0O0 implements SocketConfig {

        public static final class OooO00o implements SocketProtocol {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ OooOo f47648OooO00o;

            public OooO00o(OooOo oooOo) {
                this.f47648OooO00o = oooOo;
            }

            @Override // com.common.support.longlinksocket.SocketProtocol
            public final int bodyLength(@NotNull byte[] msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                OooOo oooOo = this.f47648OooO00o;
                int i = oooOo.f47637OooO;
                if (msg.length < oooOo.f47646OooOO0 + i) {
                    return -1;
                }
                byte[] bArr = new byte[i];
                System.arraycopy(msg, 0, bArr, 0, i);
                if (bArr.length < 0 + 4) {
                    throw new IllegalAccessError();
                }
                int i2 = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    i2 |= bArr[0 + i3] & UByte.MAX_VALUE;
                    if (i3 == 3) {
                        break;
                    }
                    i2 <<= 8;
                }
                return i2;
            }

            @Override // com.common.support.longlinksocket.SocketProtocol
            public final int getHeadLength() {
                OooOo oooOo = this.f47648OooO00o;
                return oooOo.f47637OooO + oooOo.f47646OooOO0;
            }

            @Override // com.common.support.longlinksocket.SocketProtocol
            public final long getMaxPkgSizeInByte() {
                return 10485760L;
            }
        }

        public OooO0O0() {
        }

        @Override // com.common.support.longlinksocket.SocketConfig
        @NotNull
        public final Address address() {
            List listSplit$default = StringsKt__StringsKt.split$default(OooOo.this.f47645OooO0oo, new String[]{CertificateUtil.DELIMITER}, false, 0, 6, (Object) null);
            return new Address((String) listSplit$default.get(0), o000000.OooO0o0((String) listSplit$default.get(1)));
        }

        @Override // com.common.support.longlinksocket.SocketConfig
        public final int getConnectTimeout() {
            OooOo.this.getClass();
            return (int) 7000;
        }

        @Override // com.common.support.longlinksocket.SocketConfig
        @NotNull
        public final SocketProtocol getSocketProtocol() {
            return new OooO00o(OooOo.this);
        }
    }

    @SourceDebugExtension({"SMAP\nRoomLiveSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomLiveSocket.kt\ncom/yalla/yalla/service/room/socket/RoomLiveSocket$connect$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1#2:182\n*E\n"})
    public static final class OooO0OO implements ReconnectionConfig {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f47649OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ List<String> f47651OooO0OO;

        public OooO0OO(List<String> list) {
            this.f47651OooO0OO = list;
            OooOo.this.getClass();
            this.f47649OooO00o = list.size();
        }

        @Override // com.common.support.longlink.connection.ReconnectionConfig
        public final void beforeReconnection(int i) {
            OooOo oooOo = OooOo.this;
            OooOOO0.OooO0OO(oooOo.f47639OooO0O0, "currentUrl = " + oooOo.f47645OooO0oo);
            if (i > 1) {
                List<String> list = this.f47651OooO0OO;
                if (list.size() > 1) {
                    int iIndexOf = list.indexOf(oooOo.f47645OooO0oo) + 1;
                    oooOo.f47645OooO0oo = (iIndexOf < 0 || iIndexOf > CollectionsKt.getLastIndex(list)) ? list.get(0) : list.get(iIndexOf);
                    OooOOO0.OooO0OO(oooOo.f47639OooO0O0, "newUrl = " + oooOo.f47645OooO0oo);
                }
            }
        }

        @Override // com.common.support.longlink.connection.ReconnectionConfig
        public final long getMaxReconnectionGap() {
            return 1000L;
        }

        @Override // com.common.support.longlink.connection.ReconnectionConfig
        public final int getMaxReconnectionTimes() {
            return this.f47649OooO00o;
        }

        @Override // com.common.support.longlink.connection.ReconnectionConfig
        public final long reconnectionGap(int i) {
            OooOo.this.getClass();
            return 1000L;
        }
    }

    public static final class OooO0o implements MessageHandler<Oooo0> {
        public OooO0o() {
        }

        @Override // com.common.support.longlink.MessageHandler
        public final void handle(Oooo0 oooo0) {
            Oooo0 message = oooo0;
            Intrinsics.checkNotNullParameter(message, "message");
            o00Oo0 o00oo1 = OooOo.this.f47643OooO0o0;
            if (o00oo1 != null) {
                o00oo1.OooO00o(o000000.OooO0OO(Long.valueOf(message.f47654OooO00o)), message.f47656OooO0OO, message.f47655OooO0O0);
            }
        }

        @Override // com.common.support.longlink.MessageHandler
        public final void handlePulseMessage(Oooo0 oooo0) {
            MessageHandler.DefaultImpls.handlePulseMessage(this, oooo0);
        }
    }

    public OooOo(@NotNull RoomLiveService context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47638OooO00o = context;
        this.f47639OooO0O0 = "RoomLiveSocket";
        this.f47641OooO0Oo = new OooO00o();
        this.f47644OooO0oO = new Oooo000(this);
        this.f47645OooO0oo = "";
        this.f47637OooO = 4;
        this.f47646OooOO0 = 4;
    }

    @Override // p479o0o000OO.OooOOOO
    public final void OooO00o(@Nullable RoomLiveService.OooO0OO oooO0OO) {
        this.f47642OooO0o = oooO0OO;
    }

    @Override // p479o0o000OO.OooOOOO
    public final void OooO0O0(int i, @Nullable byte[] bArr) {
        OooOOO0.OooO0OO(this.f47639OooO0O0, "sendMessage code = " + i + ", message = " + bArr);
        LongLink<Oooo0> longLink = this.f47640OooO0OO;
        if (longLink != null) {
            SecureRandom secureRandom = Oooo0.f47653OooO0Oo;
            longLink.send(Oooo0.OooO00o.OooO00o(i, true, bArr).OooO00o());
        }
    }

    @Override // p479o0o000OO.OooOOOO
    public final void OooO0OO(@Nullable RoomLiveService.OooO0o oooO0o) {
        this.f47643OooO0o0 = oooO0o;
    }

    @Override // p479o0o000OO.OooOOOO
    public final void OooO0Oo(@NotNull List<String> urlList) {
        Intrinsics.checkNotNullParameter(urlList, "urlList");
        String str = this.f47639OooO0O0;
        OooOOO0.OooO0OO(str, "connect");
        String str2 = urlList.get(0);
        this.f47645OooO0oo = str2;
        OooOOO0.OooO0OO(str, "connect socketUrl = " + str2);
        OooO0o oooO0o = new OooO0o();
        LongLink.Companion companion = LongLink.INSTANCE;
        LongLink<Oooo0> longLinkCreate = companion.create(this.f47638OooO00o, this.f47641OooO0Oo, oooO0o, new SocketBasedConnectionFactory(new OooO0O0()), (64 & 16) != 0 ? new DefaultReconnectionConfig() : new OooO0OO(urlList), (64 & 32) != 0 ? new DefaultPulseAdapter() : o00Ooo.f47680OooO00o, (64 & 64) != 0 ? null : null);
        this.f47640OooO0OO = longLinkCreate;
        if (longLinkCreate != null) {
            longLinkCreate.addConnectionCallback(this.f47644OooO0oO);
        }
        LongLink<Oooo0> longLink = this.f47640OooO0OO;
        if (longLink != null) {
            longLink.open();
        }
        companion.setLoggable(!o00Ooo.OooO0o0());
    }

    @Override // p479o0o000OO.OooOOOO
    public final void OooO0o0(int i, @Nullable String str) {
        byte[] bytes;
        OooOOO0.OooO0OO(this.f47639OooO0O0, "sendMessage code = " + i + ", message = " + str);
        LongLink<Oooo0> longLink = this.f47640OooO0OO;
        if (longLink != null) {
            SecureRandom secureRandom = Oooo0.f47653OooO0Oo;
            long j = i;
            if (str != null) {
                bytes = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            } else {
                bytes = null;
            }
            longLink.send(Oooo0.OooO00o.OooO00o(j, false, bytes).OooO00o());
        }
    }

    @Override // p479o0o000OO.OooOOOO
    public final void disconnect() {
        OooOOO0.OooO0OO(this.f47639OooO0O0, "disconnect longLink = " + this.f47640OooO0OO);
        LongLink<Oooo0> longLink = this.f47640OooO0OO;
        if (longLink != null) {
            longLink.removeConnectionCallback(this.f47644OooO0oO);
        }
        LongLink<Oooo0> longLink2 = this.f47640OooO0OO;
        if (longLink2 != null) {
            LongLink.DefaultImpls.close$default(longLink2, 0, 1, null);
        }
        this.f47640OooO0OO = null;
    }
}
