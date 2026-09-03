package p486o0o000oo;

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
import p386o0OOooO.oo0o0Oo;
import p590o0oOooo0.oOO00OO;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00O00OO implements o00O00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f48706OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LifecycleService f48707OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f48708OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public LongLink<oo00o> f48709OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooO00o f48710OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public oOO00O f48711OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public o00O0O0O f48712OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final o00O00o0 f48713OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public String f48714OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f48715OooOO0;

    public static final class OooO00o implements Protocol<oo00o, oo00o> {
        @Override // com.common.support.longlink.Protocol
        public final boolean isPulseMessage(oo00o oo00oVar) {
            oo00o message = oo00oVar;
            Intrinsics.checkNotNullParameter(message, "message");
            return message.f48734OooO00o == 100;
        }

        @Override // com.common.support.longlink.Protocol
        public final byte[] pack(oo00o oo00oVar) {
            oo00o message = oo00oVar;
            Intrinsics.checkNotNullParameter(message, "message");
            return message.OooO00o();
        }

        @Override // com.common.support.longlink.Protocol
        public final oo00o pingMessage() {
            SecureRandom secureRandom = oo00o.f48733OooO0Oo;
            return oo00o.OooO00o.OooO00o(100L, false, new byte[0]);
        }

        @Override // com.common.support.longlink.Protocol
        public final oo00o pongMessage() {
            return (oo00o) Protocol.DefaultImpls.pongMessage(this);
        }

        @Override // com.common.support.longlink.Protocol
        public final oo00o unpack(byte[] message) {
            Intrinsics.checkNotNullParameter(message, "message");
            SecureRandom secureRandom = oo00o.f48733OooO0Oo;
            Intrinsics.checkNotNullParameter(message, "byte");
            byte[] bArr = new byte[4];
            System.arraycopy(message, 0, bArr, 0, 4);
            int iOooO0O0 = oOO00OO.OooO0O0(bArr);
            byte[] bArr2 = new byte[4];
            System.arraycopy(message, 4, bArr2, 0, 4);
            int iOooO0O1 = oOO00OO.OooO0O0(bArr2);
            int i = (iOooO0O0 - 4) - 4;
            byte[] bArr3 = new byte[i];
            System.arraycopy(message, 8, bArr3, 0, i);
            return new oo00o(iOooO0O1, bArr3, 0);
        }
    }

    public static final class OooO0O0 implements SocketConfig {

        public static final class OooO00o implements SocketProtocol {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ o00O00OO f48717OooO00o;

            public OooO00o(o00O00OO o00o00oo2) {
                this.f48717OooO00o = o00o00oo2;
            }

            @Override // com.common.support.longlinksocket.SocketProtocol
            public final int bodyLength(@NotNull byte[] msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                o00O00OO o00o00oo2 = this.f48717OooO00o;
                int i = o00o00oo2.f48706OooO;
                if (msg.length < o00o00oo2.f48715OooOO0 + i) {
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
                o00O00OO o00o00oo2 = this.f48717OooO00o;
                return o00o00oo2.f48706OooO + o00o00oo2.f48715OooOO0;
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
            List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) o00O00OO.this.f48714OooO0oo, new String[]{CertificateUtil.DELIMITER}, false, 0, 6, (Object) null);
            return new Address((String) listSplit$default.get(0), o000000.OooO0o0((String) listSplit$default.get(1)));
        }

        @Override // com.common.support.longlinksocket.SocketConfig
        public final int getConnectTimeout() {
            o00O00OO.this.getClass();
            return (int) 7000;
        }

        @Override // com.common.support.longlinksocket.SocketConfig
        @NotNull
        public final SocketProtocol getSocketProtocol() {
            return new OooO00o(o00O00OO.this);
        }
    }

    @SourceDebugExtension({"SMAP\nRoomLiveSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomLiveSocket.kt\ncom/yalla/yalla/service/room/socket/RoomLiveSocket$connect$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1#2:182\n*E\n"})
    public static final class OooO0OO implements ReconnectionConfig {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f48718OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ List<String> f48720OooO0OO;

        public OooO0OO(List<String> list) {
            this.f48720OooO0OO = list;
            o00O00OO.this.getClass();
            this.f48718OooO00o = list.size();
        }

        @Override // com.common.support.longlink.connection.ReconnectionConfig
        public final void beforeReconnection(int i) {
            o00O00OO o00o00oo2 = o00O00OO.this;
            o0000O00.OooO0OO(o00o00oo2.f48708OooO0O0, "currentUrl = " + o00o00oo2.f48714OooO0oo);
            if (i > 1) {
                List<String> list = this.f48720OooO0OO;
                if (list.size() > 1) {
                    int iIndexOf = list.indexOf(o00o00oo2.f48714OooO0oo) + 1;
                    o00o00oo2.f48714OooO0oo = (iIndexOf < 0 || iIndexOf > CollectionsKt.getLastIndex(list)) ? list.get(0) : list.get(iIndexOf);
                    o0000O00.OooO0OO(o00o00oo2.f48708OooO0O0, "newUrl = " + o00o00oo2.f48714OooO0oo);
                }
            }
        }

        @Override // com.common.support.longlink.connection.ReconnectionConfig
        public final long getMaxReconnectionGap() {
            return 1000L;
        }

        @Override // com.common.support.longlink.connection.ReconnectionConfig
        public final int getMaxReconnectionTimes() {
            return this.f48718OooO00o;
        }

        @Override // com.common.support.longlink.connection.ReconnectionConfig
        public final long reconnectionGap(int i) {
            o00O00OO.this.getClass();
            return 1000L;
        }
    }

    public static final class OooO0o implements MessageHandler<oo00o> {
        public OooO0o() {
        }

        @Override // com.common.support.longlink.MessageHandler
        public final void handle(oo00o oo00oVar) {
            oo00o message = oo00oVar;
            Intrinsics.checkNotNullParameter(message, "message");
            o00O0O0O o00o0o0o2 = o00O00OO.this.f48712OooO0o0;
            if (o00o0o0o2 != null) {
                o00o0o0o2.OooO00o(o000000.OooO0OO(Long.valueOf(message.f48734OooO00o)), message.f48736OooO0OO, message.f48735OooO0O0);
            }
        }

        @Override // com.common.support.longlink.MessageHandler
        public final void handlePulseMessage(oo00o oo00oVar) {
            MessageHandler.DefaultImpls.handlePulseMessage(this, oo00oVar);
        }
    }

    public o00O00OO(@NotNull RoomLiveService context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48707OooO00o = context;
        this.f48708OooO0O0 = "RoomLiveSocket";
        this.f48710OooO0Oo = new OooO00o();
        this.f48713OooO0oO = new o00O00o0(this);
        this.f48714OooO0oo = "";
        this.f48706OooO = 4;
        this.f48715OooOO0 = 4;
    }

    @Override // p486o0o000oo.o00O00O
    public final void OooO00o(@Nullable RoomLiveService.OooO0OO oooO0OO) {
        this.f48711OooO0o = oooO0OO;
    }

    @Override // p486o0o000oo.o00O00O
    public final void OooO0O0(int i, @Nullable byte[] bArr) {
        o0000O00.OooO0OO(this.f48708OooO0O0, "sendMessage code = " + i + ", message = " + bArr);
        LongLink<oo00o> longLink = this.f48709OooO0OO;
        if (longLink != null) {
            SecureRandom secureRandom = oo00o.f48733OooO0Oo;
            longLink.send(oo00o.OooO00o.OooO00o(i, true, bArr).OooO00o());
        }
    }

    @Override // p486o0o000oo.o00O00O
    public final void OooO0OO(@Nullable RoomLiveService.OooO0o oooO0o) {
        this.f48712OooO0o0 = oooO0o;
    }

    @Override // p486o0o000oo.o00O00O
    public final void OooO0Oo(@NotNull List<String> urlList) {
        Intrinsics.checkNotNullParameter(urlList, "urlList");
        String str = this.f48708OooO0O0;
        o0000O00.OooO0OO(str, "connect");
        String str2 = urlList.get(0);
        this.f48714OooO0oo = str2;
        o0000O00.OooO0OO(str, "connect socketUrl = " + str2);
        OooO0o oooO0o = new OooO0o();
        LongLink.Companion companion = LongLink.INSTANCE;
        LongLink<oo00o> longLinkCreate = companion.create(this.f48707OooO00o, this.f48710OooO0Oo, oooO0o, new SocketBasedConnectionFactory(new OooO0O0()), (64 & 16) != 0 ? new DefaultReconnectionConfig() : new OooO0OO(urlList), (64 & 32) != 0 ? new DefaultPulseAdapter() : o00O0OO0.f48730OooO00o, (64 & 64) != 0 ? null : null);
        this.f48709OooO0OO = longLinkCreate;
        if (longLinkCreate != null) {
            longLinkCreate.addConnectionCallback(this.f48713OooO0oO);
        }
        LongLink<oo00o> longLink = this.f48709OooO0OO;
        if (longLink != null) {
            longLink.open();
        }
        companion.setLoggable(!oo0o0Oo.OooO0o0());
    }

    @Override // p486o0o000oo.o00O00O
    public final void OooO0o0(int i, @Nullable String str) {
        byte[] bytes;
        o0000O00.OooO0OO(this.f48708OooO0O0, "sendMessage code = " + i + ", message = " + str);
        LongLink<oo00o> longLink = this.f48709OooO0OO;
        if (longLink != null) {
            SecureRandom secureRandom = oo00o.f48733OooO0Oo;
            long j = i;
            if (str != null) {
                bytes = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            } else {
                bytes = null;
            }
            longLink.send(oo00o.OooO00o.OooO00o(j, false, bytes).OooO00o());
        }
    }

    @Override // p486o0o000oo.o00O00O
    public final void disconnect() {
        o0000O00.OooO0OO(this.f48708OooO0O0, "disconnect longLink = " + this.f48709OooO0OO);
        LongLink<oo00o> longLink = this.f48709OooO0OO;
        if (longLink != null) {
            longLink.removeConnectionCallback(this.f48713OooO0oO);
        }
        LongLink<oo00o> longLink2 = this.f48709OooO0OO;
        if (longLink2 != null) {
            LongLink.DefaultImpls.close$default(longLink2, 0, 1, null);
        }
        this.f48709OooO0OO = null;
    }
}
