package com.yalla.yalla.api.old;

import com.app.base.protobuf.room.Room2;
import com.common.support.apm.otlp.biz.OtlpHttpEventListener;
import com.common.support.apm.otlp.biz.OtlpInterceptor;
import com.common.support.firebreak.http.FireBreakInterceptor;
import com.yalla.yalla.mixedroom.roomdata.RoomData;
import com.yalla.yalla.mixedroom.roomdata.RoomGiftScoreboardData;
import com.yalla.yalla.mixedroom.service.RoomLiveService;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import p483o0o00O0O.o0000;
import p483o0o00O0O.o00000;
import p483o0o00O0O.o000000;
import p483o0o00O0O.o000000O;
import p483o0o00O0O.o00000O;
import p483o0o00O0O.o00000O0;
import p483o0o00O0O.o00000OO;
import p483o0o00O0O.o00oO0o;
import p483o0o00O0O.o0OOO0o;
import p483o0o00O0O.o0Oo0oo;
import p483o0o00O0O.o0ooOOo;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class OooO implements Function0 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f45016OooO0oO;

    public /* synthetic */ OooO(int i) {
        this.f45016OooO0oO = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f45016OooO0oO) {
            case 0:
                Lazy lazy = OooOOO.f45025OooO00o;
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                builder.callTimeout(15L, timeUnit);
                builder.connectTimeout(7L, timeUnit);
                builder.readTimeout(7L, timeUnit);
                builder.writeTimeout(7L, timeUnit);
                if (!p447o0Ooo00.OooOOO0.OooOO0O()) {
                    com.yalla.yalla.http.OooOOOO.OooO00o OooO00o2 = com.yalla.yalla.http.OooOOOO.OooO00o();
                    SSLSocketFactory sSLSocketFactory = OooO00o2.f49674OooO00o;
                    Intrinsics.checkNotNullExpressionValue(sSLSocketFactory, "sSLSocketFactory");
                    X509TrustManager trustManager = OooO00o2.f49675OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(trustManager, "trustManager");
                    builder.sslSocketFactory(sSLSocketFactory, trustManager);
                }
                builder.addInterceptor(new o0ooOOo());
                OooOOO.OooO0O0(builder);
                builder.addInterceptor(new o00000());
                builder.addInterceptor(new o000000());
                builder.addInterceptor(new o000000O());
                builder.addInterceptor(new o00oO0o());
                builder.addInterceptor(new o00000O());
                builder.addInterceptor(new o0Oo0oo());
                builder.addInterceptor(new o00000OO());
                builder.addInterceptor(new o0000());
                builder.addInterceptor(new o0OOO0o());
                builder.addInterceptor(new OtlpInterceptor("8267947"));
                builder.eventListenerFactory(OtlpHttpEventListener.INSTANCE.get("8267947"));
                OooOOO.OooO00o(builder);
                builder.addInterceptor(new FireBreakInterceptor(0L, 1, null));
                builder.addInterceptor(new o00000O0());
                return builder.build();
            case 1:
                return Integer.valueOf(RoomGiftScoreboardData.ruleCrystalNum_delegate$lambda$19());
            case 2:
                com.yalla.yalla.statistical.buriedpoint.OooO00o.OooO0O0("101110");
                return Unit.INSTANCE;
            case 3:
                if (RoomData.getRacingGame().getHaveGamePermission()) {
                    Room2.RoomModelSwitchIn.Builder builderNewBuilder = Room2.RoomModelSwitchIn.newBuilder();
                    builderNewBuilder.setRoomId(RoomData.getInfo().getRoomId());
                    builderNewBuilder.setRoomModel(Room2.RoomModel.RoomChat);
                    com.yalla.yalla.statistical.dev.OooO00o.OooOo0O(com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o, "sendCommand SWITCH_GAME_MODE", "model: " + builderNewBuilder.getRoomModel(), 4);
                    RoomLiveService roomLiveService = RoomLiveService.f50123Oooo000;
                    if (roomLiveService != null) {
                        roomLiveService.OooO0oo(1100100, builderNewBuilder.build().toByteArray());
                    }
                }
                return Unit.INSTANCE;
            case 4:
                com.yalla.yalla.statistical.buriedpoint.OooO00o.OooO0O0("102071");
                return Unit.INSTANCE;
            default:
                return new o0o0000.OooO0o();
        }
    }
}
