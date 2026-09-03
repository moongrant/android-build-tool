package com.yalla.yalla.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooOOO;
import com.common.support.crypto.AESKt;
import com.common.support.crypto.Base64ExtensionsKt;
import com.common.support.crypto.RSAKt;
import com.facebook.internal.ServerProtocol;
import com.yalla.yalla.model.AppConfigModel;
import com.yalla.yalla.model.AppKeyModel;
import com.yalla.yalla.model.GetInitConfigModel;
import com.yalla.yalla.model.http.ApiResult;
import java.nio.charset.Charset;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p382o0OOoOo.o0ooOOo;
import p382o0OOoOo.oo000o;
import p388o0OOooO.o000000;
import p388o0OOooO.o0OOO0o;
import p416o0Oo0oO.oO000O0;
import p416o0Oo0oO.oO000Oo0;
import p416o0Oo0oO.oO0Ooooo;
import p417o0Oo0oO0.o00Oo0;
import p474o0OoooOO.oO0oO000;
import p494o0o00OO0.OooO0o;
import p585o0oOoo00.o00000OO;
import p587o0oOooO.oO00000o;
import p587o0oOooO.oO00OO0O;
import p587o0oOooO.oO00Oo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAppConfigRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppConfigRepo.kt\ncom/yalla/yalla/repository/AppConfigRepo\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,99:1\n62#2:100\n62#2:101\n62#2:102\n*S KotlinDebug\n*F\n+ 1 AppConfigRepo.kt\ncom/yalla/yalla/repository/AppConfigRepo\n*L\n29#1:100\n81#1:101\n88#1:102\n*E\n"})
public final class AppConfigRepo extends oO0oO000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final AppConfigRepo f24302OooO00o = new AppConfigRepo();

    @DebugMetadata(c = "com.yalla.yalla.repository.AppConfigRepo", f = "AppConfigRepo.kt", i = {}, l = {100}, m = "getInitConfig", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f24303OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f24304OooO0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24303OooO0Oo = obj;
            this.f24304OooO0o |= Integer.MIN_VALUE;
            return AppConfigRepo.this.OooO0OO(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.repository.AppConfigRepo", f = "AppConfigRepo.kt", i = {}, l = {100}, m = "updateKeyStore", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f24306OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f24307OooO0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24306OooO0Oo = obj;
            this.f24307OooO0o |= Integer.MIN_VALUE;
            return AppConfigRepo.this.OooO0Oo(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0OO(@NotNull Continuation<? super Unit> continuation) {
        OooO00o oooO00o;
        GetInitConfigModel.VideoPostConf videoPostConf;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f24304OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f24304OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objOooO0Oo = oooO00o.f24303OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f24304OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            String url = oo000o.OooO0OO("/Webservers/Api/GetInitConfig");
            Intrinsics.checkNotNullParameter(url, "url");
            AppConfigRepo$getInitConfig$$inlined$call$1 appConfigRepo$getInitConfig$$inlined$call$1 = new AppConfigRepo$getInitConfig$$inlined$call$1(new o0ooOOo(url, 0), null);
            oooO00o.f24304OooO0o = 1;
            objOooO0Oo = OooOOO.OooO0Oo(appConfigRepo$getInitConfig$$inlined$call$1, oooO00o);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            return Unit.INSTANCE;
        }
        GetInitConfigModel getInitConfigModel = (GetInitConfigModel) apiResult.getData();
        if (getInitConfigModel != null && (videoPostConf = getInitConfigModel.getVideoPostConf()) != null) {
            OooO0o.f49552OooO00o = videoPostConf.getMinDuration();
            OooO0o.f49553OooO0O0 = videoPostConf.getMaxDuration();
            OooO0o.f49554OooO0OO = videoPostConf.getMaxFileSize();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0Oo(@NotNull Continuation<? super Unit> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f24307OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f24307OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objOooO0Oo = oooO0O0.f24306OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f24307OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            String url = oo000o.OooO0OO("/Webservers/Api/Info");
            Intrinsics.checkNotNullParameter(url, "url");
            o0ooOOo o0ooooo = new o0ooOOo(url, 0);
            o0ooooo.OooO0O0(Boxing.boxInt(o00Oo0.OooO0o().OooO0OO(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, 0)), ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);
            o0ooooo.OooO0O0(o000000.OooO00o(), "deviceid");
            AppConfigRepo$updateKeyStore$$inlined$call$1 appConfigRepo$updateKeyStore$$inlined$call$1 = new AppConfigRepo$updateKeyStore$$inlined$call$1(o0ooooo, null);
            oooO0O0.f24307OooO0o = 1;
            objOooO0Oo = OooOOO.OooO0Oo(appConfigRepo$updateKeyStore$$inlined$call$1, oooO0O0);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (!apiResult.isSuccess()) {
            return Unit.INSTANCE;
        }
        AppConfigModel appConfigModel = (AppConfigModel) apiResult.getData();
        if (appConfigModel != null) {
            o00Oo0.OooO0o().OooO0oO(appConfigModel.getVersion(), ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);
            if (appConfigModel.getIsGet() && (!StringsKt.isBlank(appConfigModel.getDomainName()))) {
                int i3 = o00000OO.f56616OooO00o;
                String domainName = appConfigModel.getDomainName();
                Intrinsics.checkNotNullParameter(domainName, "<set-?>");
                o00000OO.f56617OooO0O0 = domainName;
            } else {
                int i4 = o00000OO.f56616OooO00o;
                Intrinsics.checkNotNullParameter("", "<set-?>");
                o00000OO.f56617OooO0O0 = "";
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
            Lazy lazy = o0OOO0o.f43496OooO0O0;
            o0OOO0o.f43495OooO00o = appConfigModel.getTime() - jCurrentTimeMillis;
            o00Oo0.OooO00o().OooO0oO(appConfigModel.getFirstRecharge(), "firstRecharge");
            o00Oo0.OooO00o().OooO0oO(appConfigModel.getPhoneCodeType(), "phoneCodeType");
            oO000O0 oo000o0OooO00o = o00Oo0.OooO00o();
            String value = appConfigModel.getPhoneWaCodeCountry();
            oo000o0OooO00o.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            oo000o0OooO00o.OooO("phoneWaCodeCountry", value);
            o00Oo0.OooO00o().OooO0o("redemptionCodeIsOpenCDK", appConfigModel.getRedemptionCodeIsOpenCDK());
            oO000Oo0 oo000oo0OooO0o = o00Oo0.OooO0o();
            String value2 = appConfigModel.getYallaChatUrl();
            oo000oo0OooO0o.getClass();
            Intrinsics.checkNotNullParameter(value2, "value");
            oo000oo0OooO0o.OooO(String.valueOf(-1003119012), value2);
            oO000Oo0 oo000oo0OooO0o2 = o00Oo0.OooO0o();
            String value3 = appConfigModel.getYallaChatOfficeUrl();
            oo000oo0OooO0o2.getClass();
            Intrinsics.checkNotNullParameter(value3, "value");
            oo000oo0OooO0o2.OooO(String.valueOf(-1170565566), value3);
            o00Oo0.OooO0O0().OooO0oO(appConfigModel.getSocketSwitch(), "socket");
            oO0Ooooo oo0oooooOooO0O0 = o00Oo0.OooO0O0();
            String value4 = appConfigModel.getCurrentCountryCode();
            oo0oooooOooO0O0.getClass();
            Intrinsics.checkNotNullParameter(value4, "value");
            oo0oooooOooO0O0.OooO("currentCountryCode", value4);
            f24302OooO00o.getClass();
            if (appConfigModel.getUpt()) {
                byte[] bArrRsaDecrypt = RSAKt.rsaDecrypt(Base64ExtensionsKt.base64Decode(appConfigModel.getBf()), oO00OO0O.OooO0O0("K2"));
                byte[] bArrBase64Decode = Base64ExtensionsKt.base64Decode(appConfigModel.getStr());
                Charset charset = Charsets.UTF_8;
                String str = new String(bArrRsaDecrypt, charset);
                byte[] bArr = oO00000o.f56665OooO00o;
                AppKeyModel appKeyModel = (AppKeyModel) oO00Oo0.OooO00o(new String(AESKt.aesDecrypt$default(bArrBase64Decode, str, bArr, (String) null, 4, (Object) null), charset), AppKeyModel.class);
                oO000Oo0 oo000oo0OooO0o3 = o00Oo0.OooO0o();
                String value5 = appKeyModel.getTwitter().getKeyId();
                oo000oo0OooO0o3.getClass();
                Intrinsics.checkNotNullParameter(value5, "value");
                oo000oo0OooO0o3.OooO(String.valueOf(-59014420), value5);
                oO000Oo0 oo000oo0OooO0o4 = o00Oo0.OooO0o();
                String value6 = appKeyModel.getTwitter().getSecret();
                oo000oo0OooO0o4.getClass();
                Intrinsics.checkNotNullParameter(value6, "value");
                oo000oo0OooO0o4.OooO(String.valueOf(-1228471549), value6);
                oO000Oo0 oo000oo0OooO0o5 = o00Oo0.OooO0o();
                String value7 = appKeyModel.getInstagram().getKeyId();
                oo000oo0OooO0o5.getClass();
                Intrinsics.checkNotNullParameter(value7, "value");
                oo000oo0OooO0o5.OooO(String.valueOf(-372408188), Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(value7, oO00OO0O.OooO00o(), bArr, (String) null, 4, (Object) null)));
                oO000Oo0 oo000oo0OooO0o6 = o00Oo0.OooO0o();
                String value8 = appKeyModel.getInstagram().getSecret();
                oo000oo0OooO0o6.getClass();
                Intrinsics.checkNotNullParameter(value8, "value");
                oo000oo0OooO0o6.OooO(String.valueOf(-2019988625), Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(value8, oO00OO0O.OooO00o(), bArr, (String) null, 4, (Object) null)));
                oO000Oo0 oo000oo0OooO0o7 = o00Oo0.OooO0o();
                String value9 = appKeyModel.getWechat().getKeyId();
                oo000oo0OooO0o7.getClass();
                Intrinsics.checkNotNullParameter(value9, "value");
                oo000oo0OooO0o7.OooO(String.valueOf(1657547256), Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(value9, oO00OO0O.OooO00o(), bArr, (String) null, 4, (Object) null)));
                oO000Oo0 oo000oo0OooO0o8 = o00Oo0.OooO0o();
                String value10 = appKeyModel.getZego().getKeyId();
                oo000oo0OooO0o8.getClass();
                Intrinsics.checkNotNullParameter(value10, "value");
                oo000oo0OooO0o8.OooO(String.valueOf(371703205), Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(value10, oO00OO0O.OooO00o(), bArr, (String) null, 4, (Object) null)));
                oO000Oo0 oo000oo0OooO0o9 = o00Oo0.OooO0o();
                String value11 = appKeyModel.getAgora().getKeyId();
                oo000oo0OooO0o9.getClass();
                Intrinsics.checkNotNullParameter(value11, "value");
                oo000oo0OooO0o9.OooO(String.valueOf(-1319252278), Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(value11, oO00OO0O.OooO00o(), bArr, (String) null, 4, (Object) null)));
                oO000Oo0 oo000oo0OooO0o10 = o00Oo0.OooO0o();
                String value12 = appKeyModel.getAppsFlyer().getKeyId();
                oo000oo0OooO0o10.getClass();
                Intrinsics.checkNotNullParameter(value12, "value");
                oo000oo0OooO0o10.OooO(String.valueOf(-1347112992), Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(value12, oO00OO0O.OooO00o(), bArr, (String) null, 4, (Object) null)));
                oO000Oo0 oo000oo0OooO0o11 = o00Oo0.OooO0o();
                String value13 = appKeyModel.getAppsMessage().getKeyId();
                oo000oo0OooO0o11.getClass();
                Intrinsics.checkNotNullParameter(value13, "value");
                oo000oo0OooO0o11.OooO("imId", value13);
                oO000Oo0 oo000oo0OooO0o12 = o00Oo0.OooO0o();
                String value14 = appKeyModel.getAppsMessage().getSecret();
                oo000oo0OooO0o12.getClass();
                Intrinsics.checkNotNullParameter(value14, "value");
                oo000oo0OooO0o12.OooO(String.valueOf(104359), value14);
                oO000Oo0 oo000oo0OooO0o13 = o00Oo0.OooO0o();
                String value15 = appKeyModel.getAppsMessage().getSecretiv();
                oo000oo0OooO0o13.getClass();
                Intrinsics.checkNotNullParameter(value15, "value");
                oo000oo0OooO0o13.OooO(String.valueOf(104370), value15);
                oO000Oo0 oo000oo0OooO0o14 = o00Oo0.OooO0o();
                String value16 = appKeyModel.getChatKey().getKeyId();
                oo000oo0OooO0o14.getClass();
                Intrinsics.checkNotNullParameter(value16, "value");
                oo000oo0OooO0o14.OooO(String.valueOf(-1751298935), value16);
                oO000Oo0 oo000oo0OooO0o15 = o00Oo0.OooO0o();
                String value17 = appKeyModel.getChatKey().getSecret();
                oo000oo0OooO0o15.getClass();
                Intrinsics.checkNotNullParameter(value17, "value");
                oo000oo0OooO0o15.OooO(String.valueOf(1772725217), value17);
            }
        }
        return Unit.INSTANCE;
    }
}
