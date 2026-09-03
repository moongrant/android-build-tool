package p486o0o000oo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleService;
import com.code.android.util.o000000;
import com.code.android.util.o000O00O;
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
import p187o00o00o0.OooO;
import p386o0OOooO.oo0o0Oo;
import p475o0Ooooo0.o0O00oO0;
import p598o0oo00Oo.o0000O00;
import p641o0ooOO0o.o0O00O0o;
import p641o0ooOO0o.o0OoO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00O0 implements o00O00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o0O00O0o f48690OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LifecycleService f48691OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final String f48692OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public LongLink<o00O0O0> f48693OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooO00o f48694OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public o00O0O0O f48695OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o0OoO00O f48696OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public oOO00O f48697OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final o00O0O00 f48698OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final String f48699OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public String f48700OooOO0O;

    public static final class OooO00o implements Protocol<o00O0O0, o00O0O0> {
        @Override // com.common.support.longlink.Protocol
        public final boolean isPulseMessage(o00O0O0 o00o0o0) {
            o00O0O0 message = o00o0o0;
            Intrinsics.checkNotNullParameter(message, "message");
            return message.f48725OooO00o == 100;
        }

        @Override // com.common.support.longlink.Protocol
        public final byte[] pack(o00O0O0 o00o0o0) {
            o00O0O0 message = o00o0o0;
            Intrinsics.checkNotNullParameter(message, "message");
            return message.OooO00o();
        }

        @Override // com.common.support.longlink.Protocol
        public final o00O0O0 pingMessage() {
            SecureRandom secureRandom = o00O0O0.f48724OooO0o0;
            return o00O0O0.OooO00o.OooO00o(100L, false, new byte[0]);
        }

        @Override // com.common.support.longlink.Protocol
        public final o00O0O0 pongMessage() {
            return (o00O0O0) Protocol.DefaultImpls.pongMessage(this);
        }

        @Override // com.common.support.longlink.Protocol
        public final o00O0O0 unpack(byte[] message) {
            Intrinsics.checkNotNullParameter(message, "message");
            SecureRandom secureRandom = o00O0O0.f48724OooO0o0;
            Intrinsics.checkNotNullParameter(message, "byte");
            if (message.length < 3) {
                return o00O0O0.f48723OooO0o;
            }
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(message);
            if (byteBufferWrap.get() != -65) {
                return o00O0O0.f48723OooO0o;
            }
            short s = byteBufferWrap.getShort();
            byte b = byteBufferWrap.get();
            long j = byteBufferWrap.getLong();
            long j2 = byteBufferWrap.getLong();
            int i = s + 3;
            int length = message.length - i;
            byte[] bArr = new byte[length];
            byteBufferWrap.get(bArr, i - byteBufferWrap.position(), length);
            return new o00O0O0(j2, bArr, b, j);
        }
    }

    public static final class OooO0O0 implements MessageHandler<o00O0O0> {
        public OooO0O0() {
        }

        @Override // com.common.support.longlink.MessageHandler
        public final void handle(o00O0O0 o00o0o0) {
            o00O0O0 message = o00o0o0;
            Intrinsics.checkNotNullParameter(message, "message");
            o00O0O0O o00o0o0o2 = o00O0.this.f48695OooO0o;
            if (o00o0o0o2 != null) {
                o00o0o0o2.OooO00o(o000000.OooO0OO(Long.valueOf(message.f48725OooO00o)), message.f48727OooO0OO, message.f48726OooO0O0);
            }
        }

        @Override // com.common.support.longlink.MessageHandler
        public final void handlePulseMessage(o00O0O0 o00o0o0) {
            MessageHandler.DefaultImpls.handlePulseMessage(this, o00o0o0);
        }
    }

    @SourceDebugExtension({"SMAP\nRoomLiveWebSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomLiveWebSocket.kt\ncom/yalla/yalla/service/room/socket/RoomLiveWebSocket$connect$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
    public static final class OooO0OO implements ReconnectionConfig {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f48702OooO00o;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ List<String> f48704OooO0OO;

        public OooO0OO(List<String> list) {
            this.f48704OooO0OO = list;
            o00O0.this.getClass();
            this.f48702OooO00o = list.size();
        }

        @Override // com.common.support.longlink.connection.ReconnectionConfig
        public final void beforeReconnection(int i) {
            int iIndexOf;
            o00O0 o00o1 = o00O0.this;
            String str = o00o1.f48692OooO0O0;
            o0O00O0o o0o00o0o = o00o1.f48690OooO;
            if (o0o00o0o == null) {
                Intrinsics.throwUninitializedPropertyAccessException("request");
                o0o00o0o = null;
            }
            o0000O00.OooO0OO(str, "currentUrl = " + o0o00o0o.f57828OooO00o);
            if (i > 1) {
                List<String> list = this.f48704OooO0OO;
                if (list.size() > 1 && (iIndexOf = list.indexOf(o00o1.f48700OooOO0O)) >= 0) {
                    int i2 = iIndexOf + 1;
                    String str2 = (i2 < 0 || i2 > CollectionsKt.getLastIndex(list)) ? list.get(0) : list.get(i2);
                    o0000O00.OooO0OO(o00o1.f48692OooO0O0, "newUrl = " + str2);
                    o00o1.f48700OooOO0O = str2;
                    o0O00O0o.OooO00o oooO00o = new o0O00O0o.OooO00o();
                    oooO00o.OooOO0(str2 + o00o1.f48699OooOO0);
                    o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                    oooO00o.OooO0Oo("yalla-token", String.valueOf(o0O00oO0.OooOOOo().getValue()));
                    oooO00o.OooO0Oo("yalla-deviceID", p386o0OOooO.o000000.OooO00o());
                    oooO00o.OooO0Oo("yalla-clientVer", String.valueOf(oo0o0Oo.OooO0OO()));
                    o00o1.f48690OooO = oooO00o.OooO0O0();
                }
            }
        }

        @Override // com.common.support.longlink.connection.ReconnectionConfig
        public final long getMaxReconnectionGap() {
            return 1000L;
        }

        @Override // com.common.support.longlink.connection.ReconnectionConfig
        public final int getMaxReconnectionTimes() {
            return this.f48702OooO00o;
        }

        @Override // com.common.support.longlink.connection.ReconnectionConfig
        public final long reconnectionGap(int i) {
            o00O0.this.getClass();
            return 1000L;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<o0O00O0o> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O00O0o invoke() {
            o0O00O0o o0o00o0o = o00O0.this.f48690OooO;
            if (o0o00o0o != null) {
                return o0o00o0o;
            }
            Intrinsics.throwUninitializedPropertyAccessException("request");
            return null;
        }
    }

    public o00O0(@NotNull RoomLiveService context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48691OooO00o = context;
        this.f48692OooO0O0 = "RoomLiveWebSocket";
        this.f48694OooO0Oo = new OooO00o();
        o0OoO00O.OooO00o oooO00o = new o0OoO00O.OooO00o();
        oooO00o.f57918OooO0o = false;
        oooO00o.OooO0O0(7000L, TimeUnit.SECONDS);
        this.f48696OooO0o0 = new o0OoO00O(oooO00o);
        this.f48698OooO0oo = new o00O0O00(this);
        this.f48699OooOO0 = "/comet";
        this.f48700OooOO0O = "";
    }

    @Override // p486o0o000oo.o00O00O
    public final void OooO00o(@Nullable RoomLiveService.OooO0OO oooO0OO) {
        this.f48697OooO0oO = oooO0OO;
    }

    @Override // p486o0o000oo.o00O00O
    public final void OooO0O0(int i, @Nullable byte[] bArr) {
        o0000O00.OooO0OO(this.f48692OooO0O0, "sendMessage code = " + i + ", message = " + bArr);
        LongLink<o00O0O0> longLink = this.f48693OooO0OO;
        if (longLink != null) {
            SecureRandom secureRandom = o00O0O0.f48724OooO0o0;
            longLink.send(o00O0O0.OooO00o.OooO00o(i, true, bArr).OooO00o());
        }
    }

    @Override // p486o0o000oo.o00O00O
    public final void OooO0OO(@Nullable RoomLiveService.OooO0o oooO0o) {
        this.f48695OooO0o = oooO0o;
    }

    @Override // p486o0o000oo.o00O00O
    public final void OooO0Oo(@NotNull List<String> urlList) {
        Intrinsics.checkNotNullParameter(urlList, "urlList");
        o0000O00.OooO0OO(this.f48692OooO0O0, "RoomLiveSocket connect ".concat(OooO.OooO00o(urlList)));
        if (!NetworkStateUtil.INSTANCE.isConnected(o000O00O.OooO00o())) {
            oOO00O ooo00o = this.f48697OooO0oO;
            if (ooo00o != null) {
                ooo00o.OooO0OO();
                return;
            }
            return;
        }
        this.f48700OooOO0O = urlList.get(0);
        o0O00O0o.OooO00o oooO00o = new o0O00O0o.OooO00o();
        oooO00o.OooOO0(((Object) urlList.get(0)) + this.f48699OooOO0);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        oooO00o.OooO0Oo("yalla-token", String.valueOf(o0O00oO0.OooOOOo().getValue()));
        oooO00o.OooO0Oo("yalla-deviceID", p386o0OOooO.o000000.OooO00o());
        oooO00o.OooO0Oo("yalla-clientVer", String.valueOf(oo0o0Oo.OooO0OO()));
        o0O00O0o o0o00o0oOooO0O0 = oooO00o.OooO0O0();
        this.f48690OooO = o0o00o0oOooO0O0;
        o0000O00.OooO0OO("RoomLiveWebSocket", "connect request = " + o0o00o0oOooO0O0);
        LongLink.Companion companion = LongLink.INSTANCE;
        LongLink<o00O0O0> longLinkCreateWebSocketLongLink = companion.createWebSocketLongLink(this.f48691OooO00o, this.f48694OooO0Oo, new OooO0O0(), this.f48696OooO0o0, (Function0<o0O00O0o>) new OooO0o(), (128 & 32) != 0 ? new DefaultReconnectionConfig() : new OooO0OO(urlList), (128 & 64) != 0 ? new DefaultPulseAdapter() : oo0o0O0.f48737OooO00o, (128 & 128) != 0 ? null : null);
        this.f48693OooO0OO = longLinkCreateWebSocketLongLink;
        if (longLinkCreateWebSocketLongLink != null) {
            longLinkCreateWebSocketLongLink.addConnectionCallback(this.f48698OooO0oo);
        }
        LongLink<o00O0O0> longLink = this.f48693OooO0OO;
        if (longLink != null) {
            longLink.open();
        }
        companion.setLoggable(!oo0o0Oo.OooO0o0());
    }

    @Override // p486o0o000oo.o00O00O
    public final void OooO0o0(int i, @Nullable String str) {
        byte[] bytes;
        o0000O00.OooO0OO(this.f48692OooO0O0, "sendMessage code = " + i + ", message = " + str);
        LongLink<o00O0O0> longLink = this.f48693OooO0OO;
        if (longLink != null) {
            SecureRandom secureRandom = o00O0O0.f48724OooO0o0;
            long j = i;
            if (str != null) {
                bytes = str.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            } else {
                bytes = null;
            }
            longLink.send(o00O0O0.OooO00o.OooO00o(j, false, bytes).OooO00o());
        }
    }

    @Override // p486o0o000oo.o00O00O
    public final void disconnect() {
        o0000O00.OooO0OO(this.f48692OooO0O0, "disconnect");
        this.f48695OooO0o = null;
        this.f48697OooO0oO = null;
        LongLink<o00O0O0> longLink = this.f48693OooO0OO;
        if (longLink != null) {
            longLink.removeConnectionCallback(this.f48698OooO0oo);
        }
        LongLink<o00O0O0> longLink2 = this.f48693OooO0OO;
        if (longLink2 != null) {
            LongLink.DefaultImpls.close$default(longLink2, 0, 1, null);
        }
        this.f48693OooO0OO = null;
    }
}
