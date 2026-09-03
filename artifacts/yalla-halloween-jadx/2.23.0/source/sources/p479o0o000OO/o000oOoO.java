package p479o0o000OO;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleService;
import com.code.android.util.o000000;
import com.code.android.util.o000O0;
import com.common.support.longlink.LongLink;
import com.common.support.longlink.MessageHandler;
import com.common.support.longlink.Protocol;
import com.common.support.longlink.connection.DefaultReconnectionConfig;
import com.common.support.longlink.connection.ReconnectionConfig;
import com.common.support.longlink.pulse.DefaultPulseAdapter;
import com.common.support.networkstate.NetworkStateUtil;
import com.yalla.yalla.service.room.RoomLiveService;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140o00OOooo.OooOO0;
import p382o0OOoo0o.o00Ooo;
import p382o0OOoo0o.oo000o;
import p464o0Oooo.o000000O;
import p592o0oo00O.OooOOO0;
import p634o0ooO0oO.o00OOOO0;
import p634o0ooO0oO.o00OOOOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000oOoO implements OooOOOO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o00OOOOo f47658OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LifecycleService f47659OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f47660OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public LongLink<o00O0O> f47661OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooO00o f47662OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public o00Oo0 f47663OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00OOOO0 f47664OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public OooOo00 f47665OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final o0OoOo0 f47666OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final String f47667OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public String f47668OooOO0O;

    public static final class OooO00o implements Protocol<o00O0O, o00O0O> {
        @Override // com.common.support.longlink.Protocol
        public final boolean isPulseMessage(o00O0O o00o0o2) {
            o00O0O message = o00o0o2;
            Intrinsics.checkNotNullParameter(message, "message");
            return message.f47676OooO00o == 100;
        }

        @Override // com.common.support.longlink.Protocol
        public final byte[] pack(o00O0O o00o0o2) {
            o00O0O message = o00o0o2;
            Intrinsics.checkNotNullParameter(message, "message");
            return message.OooO00o();
        }

        @Override // com.common.support.longlink.Protocol
        public final o00O0O pingMessage() {
            SecureRandom secureRandom = o00O0O.f47675OooO0o0;
            return o00O0O.OooO00o.OooO00o(100L, false, new byte[0]);
        }

        @Override // com.common.support.longlink.Protocol
        public final o00O0O pongMessage() {
            return (o00O0O) Protocol.DefaultImpls.pongMessage(this);
        }

        @Override // com.common.support.longlink.Protocol
        public final o00O0O unpack(byte[] message) {
            Intrinsics.checkNotNullParameter(message, "message");
            SecureRandom secureRandom = o00O0O.f47675OooO0o0;
            Intrinsics.checkNotNullParameter(message, "byte");
            if (message.length < 3) {
                return o00O0O.f47674OooO0o;
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(message);
            if (byteBufferWrap.get() != -65) {
                return o00O0O.f47674OooO0o;
            }
            short s = byteBufferWrap.getShort();
            byte b = byteBufferWrap.get();
            long j = byteBufferWrap.getLong();
            long j2 = byteBufferWrap.getLong();
            int i = s + 3;
            int length = message.length - i;
            byte[] bArr = new byte[length];
            byteBufferWrap.get(bArr, i - byteBufferWrap.position(), length);
            return new o00O0O(j2, bArr, b, j);
        }
    }

    public static final class OooO0O0 implements MessageHandler<o00O0O> {
        public OooO0O0() {
        }

        @Override // com.common.support.longlink.MessageHandler
        public final void handle(o00O0O o00o0o2) {
            o00O0O message = o00o0o2;
            Intrinsics.checkNotNullParameter(message, "message");
            o00Oo0 o00oo1 = o000oOoO.this.f47663OooO0o;
            if (o00oo1 != null) {
                o00oo1.OooO00o(o000000.OooO0OO(Long.valueOf(message.f47676OooO00o)), message.f47678OooO0OO, message.f47677OooO0O0);
            }
        }

        @Override // com.common.support.longlink.MessageHandler
        public final void handlePulseMessage(o00O0O o00o0o2) {
            MessageHandler.DefaultImpls.handlePulseMessage(this, o00o0o2);
        }
    }

    @SourceDebugExtension({"SMAP\nRoomLiveWebSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomLiveWebSocket.kt\ncom/yalla/yalla/service/room/socket/RoomLiveWebSocket$connect$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
    public static final class OooO0OO implements ReconnectionConfig {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f47670OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ List<String> f47672OooO0OO;

        public OooO0OO(List<String> list) {
            this.f47672OooO0OO = list;
            o000oOoO.this.getClass();
            this.f47670OooO00o = list.size();
        }

        @Override // com.common.support.longlink.connection.ReconnectionConfig
        public final void beforeReconnection(int i) {
            int iIndexOf;
            o000oOoO o000oooo2 = o000oOoO.this;
            String str = o000oooo2.f47660OooO0O0;
            o00OOOOo o00ooooo2 = o000oooo2.f47658OooO;
            if (o00ooooo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("request");
                o00ooooo2 = null;
            }
            OooOOO0.OooO0OO(str, "currentUrl = " + o00ooooo2.f57313OooO00o);
            if (i > 1) {
                List<String> list = this.f47672OooO0OO;
                if (list.size() > 1 && (iIndexOf = list.indexOf(o000oooo2.f47668OooOO0O)) >= 0) {
                    int i2 = iIndexOf + 1;
                    String str2 = (i2 < 0 || i2 > CollectionsKt.getLastIndex(list)) ? list.get(0) : list.get(i2);
                    OooOOO0.OooO0OO(o000oooo2.f47660OooO0O0, "newUrl = " + str2);
                    o000oooo2.f47668OooOO0O = str2;
                    o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o();
                    oooO00o.OooOO0(str2 + o000oooo2.f47667OooOO0);
                    o000000O o000000o2 = o000000O.f46674OooO00o;
                    oooO00o.OooO0Oo("yalla-token", String.valueOf(o000000O.OooOOOo().getValue()));
                    oooO00o.OooO0Oo("yalla-deviceID", oo000o.OooO00o());
                    oooO00o.OooO0Oo("yalla-clientVer", String.valueOf(o00Ooo.OooO0OO()));
                    o000oooo2.f47658OooO = oooO00o.OooO0O0();
                }
            }
        }

        @Override // com.common.support.longlink.connection.ReconnectionConfig
        public final long getMaxReconnectionGap() {
            return 1000L;
        }

        @Override // com.common.support.longlink.connection.ReconnectionConfig
        public final int getMaxReconnectionTimes() {
            return this.f47670OooO00o;
        }

        @Override // com.common.support.longlink.connection.ReconnectionConfig
        public final long reconnectionGap(int i) {
            o000oOoO.this.getClass();
            return 1000L;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<o00OOOOo> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00OOOOo invoke() {
            o00OOOOo o00ooooo2 = o000oOoO.this.f47658OooO;
            if (o00ooooo2 != null) {
                return o00ooooo2;
            }
            Intrinsics.throwUninitializedPropertyAccessException("request");
            return null;
        }
    }

    public o000oOoO(@NotNull RoomLiveService context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f47659OooO00o = context;
        this.f47660OooO0O0 = "RoomLiveWebSocket";
        this.f47662OooO0Oo = new OooO00o();
        o00OOOO0.OooO00o oooO00o = new o00OOOO0.OooO00o();
        oooO00o.f57289OooO0o = false;
        oooO00o.OooO0OO(7000L, TimeUnit.SECONDS);
        this.f47664OooO0o0 = new o00OOOO0(oooO00o);
        this.f47666OooO0oo = new o0OoOo0(this);
        this.f47667OooOO0 = "/comet";
        this.f47668OooOO0O = "";
    }

    @Override // p479o0o000OO.OooOOOO
    public final void OooO00o(@Nullable RoomLiveService.OooO0OO oooO0OO) {
        this.f47665OooO0oO = oooO0OO;
    }

    @Override // p479o0o000OO.OooOOOO
    public final void OooO0O0(int i, @Nullable byte[] bArr) {
        OooOOO0.OooO0OO(this.f47660OooO0O0, "sendMessage code = " + i + ", message = " + bArr);
        LongLink<o00O0O> longLink = this.f47661OooO0OO;
        if (longLink != null) {
            SecureRandom secureRandom = o00O0O.f47675OooO0o0;
            longLink.send(o00O0O.OooO00o.OooO00o(i, true, bArr).OooO00o());
        }
    }

    @Override // p479o0o000OO.OooOOOO
    public final void OooO0OO(@Nullable RoomLiveService.OooO0o oooO0o) {
        this.f47663OooO0o = oooO0o;
    }

    @Override // p479o0o000OO.OooOOOO
    public final void OooO0Oo(@NotNull List<String> urlList) {
        Intrinsics.checkNotNullParameter(urlList, "urlList");
        OooOOO0.OooO0OO(this.f47660OooO0O0, "RoomLiveSocket connect ".concat(OooOO0.OooO00o(urlList)));
        if (!NetworkStateUtil.INSTANCE.isConnected(o000O0.OooO00o())) {
            OooOo00 oooOo00 = this.f47665OooO0oO;
            if (oooOo00 != null) {
                oooOo00.OooO0OO();
                return;
            }
            return;
        }
        this.f47668OooOO0O = urlList.get(0);
        o00OOOOo.OooO00o oooO00o = new o00OOOOo.OooO00o();
        oooO00o.OooOO0(((Object) urlList.get(0)) + this.f47667OooOO0);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        oooO00o.OooO0Oo("yalla-token", String.valueOf(o000000O.OooOOOo().getValue()));
        oooO00o.OooO0Oo("yalla-deviceID", oo000o.OooO00o());
        oooO00o.OooO0Oo("yalla-clientVer", String.valueOf(o00Ooo.OooO0OO()));
        o00OOOOo o00oooooOooO0O0 = oooO00o.OooO0O0();
        this.f47658OooO = o00oooooOooO0O0;
        OooOOO0.OooO0OO("RoomLiveWebSocket", "connect request = " + o00oooooOooO0O0);
        LongLink.Companion companion = LongLink.INSTANCE;
        LongLink<o00O0O> longLinkCreateWebSocketLongLink = companion.createWebSocketLongLink(this.f47659OooO00o, this.f47662OooO0Oo, new OooO0O0(), this.f47664OooO0o0, (Function0<o00OOOOo>) new OooO0o(), (128 & 32) != 0 ? new DefaultReconnectionConfig() : new OooO0OO(urlList), (128 & 64) != 0 ? new DefaultPulseAdapter() : oo000o.f47684OooO00o, (128 & 128) != 0 ? null : null);
        this.f47661OooO0OO = longLinkCreateWebSocketLongLink;
        if (longLinkCreateWebSocketLongLink != null) {
            longLinkCreateWebSocketLongLink.addConnectionCallback(this.f47666OooO0oo);
        }
        LongLink<o00O0O> longLink = this.f47661OooO0OO;
        if (longLink != null) {
            longLink.open();
        }
        companion.setLoggable(!o00Ooo.OooO0o0());
    }

    @Override // p479o0o000OO.OooOOOO
    public final void OooO0o0(int i, @Nullable String str) {
        byte[] bytes;
        OooOOO0.OooO0OO(this.f47660OooO0O0, "sendMessage code = " + i + ", message = " + str);
        LongLink<o00O0O> longLink = this.f47661OooO0OO;
        if (longLink != null) {
            SecureRandom secureRandom = o00O0O.f47675OooO0o0;
            long j = i;
            if (str != null) {
                bytes = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            } else {
                bytes = null;
            }
            longLink.send(o00O0O.OooO00o.OooO00o(j, false, bytes).OooO00o());
        }
    }

    @Override // p479o0o000OO.OooOOOO
    public final void disconnect() {
        OooOOO0.OooO0OO(this.f47660OooO0O0, "disconnect");
        this.f47663OooO0o = null;
        this.f47665OooO0oO = null;
        LongLink<o00O0O> longLink = this.f47661OooO0OO;
        if (longLink != null) {
            longLink.removeConnectionCallback(this.f47666OooO0oo);
        }
        LongLink<o00O0O> longLink2 = this.f47661OooO0OO;
        if (longLink2 != null) {
            LongLink.DefaultImpls.close$default(longLink2, 0, 1, null);
        }
        this.f47661OooO0OO = null;
    }
}
