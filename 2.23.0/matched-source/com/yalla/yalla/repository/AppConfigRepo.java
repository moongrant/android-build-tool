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
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p382o0OOoo0o.o0OoOo0;
import p382o0OOoo0o.oo000o;
import p402o0Oo0OOO.o00O000o;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o000OOo;
import p409o0Oo0o0o.o00Ooo;
import p409o0Oo0o0o.o00oO0o;
import p464o0Oooo.o0O00oO0;
import p488o0o00O0o.o0OOO0o;
import p579o0oOoo.o0o0000;
import p579o0oOoo.oO000Oo;
import p579o0oOoo.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAppConfigRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppConfigRepo.kt\ncom/yalla/yalla/repository/AppConfigRepo\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,99:1\n62#2:100\n62#2:101\n62#2:102\n*S KotlinDebug\n*F\n+ 1 AppConfigRepo.kt\ncom/yalla/yalla/repository/AppConfigRepo\n*L\n29#1:100\n81#1:101\n88#1:102\n*E\n"})
public final class AppConfigRepo extends o0O00oO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final AppConfigRepo f24755OooO00o = new AppConfigRepo();

    @DebugMetadata(c = "com.yalla.yalla.repository.AppConfigRepo", f = "AppConfigRepo.kt", i = {}, l = {100}, m = "getInitConfig", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f24756OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f24757OooO0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24756OooO0Oo = obj;
            this.f24757OooO0o |= Integer.MIN_VALUE;
            return AppConfigRepo.this.OooO0OO(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.repository.AppConfigRepo", f = "AppConfigRepo.kt", i = {}, l = {100}, m = "updateKeyStore", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f24759OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f24760OooO0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f24759OooO0Oo = obj;
            this.f24760OooO0o |= Integer.MIN_VALUE;
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
            int i = oooO00o.f24757OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f24757OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objOooO0Oo = oooO00o.f24756OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f24757OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            String url = o000OOo0.OooO0OO("/Webservers/Api/GetInitConfig");
            Intrinsics.checkNotNullParameter(url, "url");
            AppConfigRepo$getInitConfig$$inlined$call$1 appConfigRepo$getInitConfig$$inlined$call$1 = new AppConfigRepo$getInitConfig$$inlined$call$1(new o0O0ooO(url, 0), null);
            oooO00o.f24757OooO0o = 1;
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
            o0OOO0o.f48462OooO00o = videoPostConf.getMinDuration();
            o0OOO0o.f48463OooO0O0 = videoPostConf.getMaxDuration();
            o0OOO0o.f48464OooO0OO = videoPostConf.getMaxFileSize();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0Oo(@NotNull Continuation<? super Unit> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f24760OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f24760OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objOooO0Oo = oooO0O0.f24759OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f24760OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            String url = o000OOo0.OooO0OO("/Webservers/Api/Info");
            Intrinsics.checkNotNullParameter(url, "url");
            o0O0ooO o0o0ooo = new o0O0ooO(url, 0);
            o0o0ooo.OooO0O0(Boxing.boxInt(o00Oo0.OooO0o().OooO0OO(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, 0)), ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);
            o0o0ooo.OooO0O0(oo000o.OooO00o(), "deviceid");
            AppConfigRepo$updateKeyStore$$inlined$call$1 appConfigRepo$updateKeyStore$$inlined$call$1 = new AppConfigRepo$updateKeyStore$$inlined$call$1(o0o0ooo, null);
            oooO0O0.f24760OooO0o = 1;
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
                int i3 = o00O000o.f44490OooO00o;
                String domainName = appConfigModel.getDomainName();
                Intrinsics.checkNotNullParameter(domainName, "<set-?>");
                o00O000o.f44491OooO0O0 = domainName;
            } else {
                int i4 = o00O000o.f44490OooO00o;
                Intrinsics.checkNotNullParameter("", "<set-?>");
                o00O000o.f44491OooO0O0 = "";
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
            Lazy lazy = o0OoOo0.f44301OooO0O0;
            o0OoOo0.f44300OooO00o = appConfigModel.getTime() - jCurrentTimeMillis;
            o00Oo0.OooO00o().OooO0oO(appConfigModel.getFirstRecharge(), "firstRecharge");
            o00Oo0.OooO00o().OooO0oO(appConfigModel.getPhoneCodeType(), "phoneCodeType");
            o00Ooo o00oooOooO00o = o00Oo0.OooO00o();
            String value = appConfigModel.getPhoneWaCodeCountry();
            o00oooOooO00o.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            o00oooOooO00o.OooO("phoneWaCodeCountry", value);
            o00Oo0.OooO00o().OooO0o("redemptionCodeIsOpenCDK", appConfigModel.getRedemptionCodeIsOpenCDK());
            o000OOo o000oooOooO0o = o00Oo0.OooO0o();
            String value2 = appConfigModel.getYallaChatUrl();
            o000oooOooO0o.getClass();
            Intrinsics.checkNotNullParameter(value2, "value");
            o000oooOooO0o.OooO(String.valueOf(-1003119012), value2);
            o000OOo o000oooOooO0o2 = o00Oo0.OooO0o();
            String value3 = appConfigModel.getYallaChatOfficeUrl();
            o000oooOooO0o2.getClass();
            Intrinsics.checkNotNullParameter(value3, "value");
            o000oooOooO0o2.OooO(String.valueOf(-1170565566), value3);
            o00Oo0.OooO0O0().OooO0oO(appConfigModel.getSocketSwitch(), "socket");
            o00oO0o o00oo0oOooO0O0 = o00Oo0.OooO0O0();
            String value4 = appConfigModel.getCurrentCountryCode();
            o00oo0oOooO0O0.getClass();
            Intrinsics.checkNotNullParameter(value4, "value");
            o00oo0oOooO0O0.OooO("currentCountryCode", value4);
            f24755OooO00o.getClass();
            if (appConfigModel.getUpt()) {
                byte[] bArrRsaDecrypt = RSAKt.rsaDecrypt(Base64ExtensionsKt.base64Decode(appConfigModel.getBf()), oO000Oo.OooO0O0("K2"));
                byte[] bArrBase64Decode = Base64ExtensionsKt.base64Decode(appConfigModel.getStr());
                Charset charset = Charsets.UTF_8;
                String str = new String(bArrRsaDecrypt, charset);
                byte[] bArr = o0o0000.f56518OooO00o;
                AppKeyModel appKeyModel = (AppKeyModel) oOo00OO0.OooO00o(new String(AESKt.aesDecrypt$default(bArrBase64Decode, str, bArr, (String) null, 4, (Object) null), charset), AppKeyModel.class);
                o000OOo o000oooOooO0o3 = o00Oo0.OooO0o();
                String value5 = appKeyModel.getTwitter().getKeyId();
                o000oooOooO0o3.getClass();
                Intrinsics.checkNotNullParameter(value5, "value");
                o000oooOooO0o3.OooO(String.valueOf(-59014420), value5);
                o000OOo o000oooOooO0o4 = o00Oo0.OooO0o();
                String value6 = appKeyModel.getTwitter().getSecret();
                o000oooOooO0o4.getClass();
                Intrinsics.checkNotNullParameter(value6, "value");
                o000oooOooO0o4.OooO(String.valueOf(-1228471549), value6);
                o000OOo o000oooOooO0o5 = o00Oo0.OooO0o();
                String value7 = appKeyModel.getInstagram().getKeyId();
                o000oooOooO0o5.getClass();
                Intrinsics.checkNotNullParameter(value7, "value");
                o000oooOooO0o5.OooO(String.valueOf(-372408188), Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(value7, oO000Oo.OooO00o(), bArr, (String) null, 4, (Object) null)));
                o000OOo o000oooOooO0o6 = o00Oo0.OooO0o();
                String value8 = appKeyModel.getInstagram().getSecret();
                o000oooOooO0o6.getClass();
                Intrinsics.checkNotNullParameter(value8, "value");
                o000oooOooO0o6.OooO(String.valueOf(-2019988625), Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(value8, oO000Oo.OooO00o(), bArr, (String) null, 4, (Object) null)));
                o000OOo o000oooOooO0o7 = o00Oo0.OooO0o();
                String value9 = appKeyModel.getWechat().getKeyId();
                o000oooOooO0o7.getClass();
                Intrinsics.checkNotNullParameter(value9, "value");
                o000oooOooO0o7.OooO(String.valueOf(1657547256), Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(value9, oO000Oo.OooO00o(), bArr, (String) null, 4, (Object) null)));
                o000OOo o000oooOooO0o8 = o00Oo0.OooO0o();
                String value10 = appKeyModel.getZego().getKeyId();
                o000oooOooO0o8.getClass();
                Intrinsics.checkNotNullParameter(value10, "value");
                o000oooOooO0o8.OooO(String.valueOf(371703205), Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(value10, oO000Oo.OooO00o(), bArr, (String) null, 4, (Object) null)));
                o000OOo o000oooOooO0o9 = o00Oo0.OooO0o();
                String value11 = appKeyModel.getAgora().getKeyId();
                o000oooOooO0o9.getClass();
                Intrinsics.checkNotNullParameter(value11, "value");
                o000oooOooO0o9.OooO(String.valueOf(-1319252278), Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(value11, oO000Oo.OooO00o(), bArr, (String) null, 4, (Object) null)));
                o000OOo o000oooOooO0o10 = o00Oo0.OooO0o();
                String value12 = appKeyModel.getAppsFlyer().getKeyId();
                o000oooOooO0o10.getClass();
                Intrinsics.checkNotNullParameter(value12, "value");
                o000oooOooO0o10.OooO(String.valueOf(-1347112992), Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(value12, oO000Oo.OooO00o(), bArr, (String) null, 4, (Object) null)));
                o000OOo o000oooOooO0o11 = o00Oo0.OooO0o();
                String value13 = appKeyModel.getAppsMessage().getKeyId();
                o000oooOooO0o11.getClass();
                Intrinsics.checkNotNullParameter(value13, "value");
                o000oooOooO0o11.OooO("imId", value13);
                o000OOo o000oooOooO0o12 = o00Oo0.OooO0o();
                String value14 = appKeyModel.getAppsMessage().getSecret();
                o000oooOooO0o12.getClass();
                Intrinsics.checkNotNullParameter(value14, "value");
                o000oooOooO0o12.OooO(String.valueOf(104359), value14);
                o000OOo o000oooOooO0o13 = o00Oo0.OooO0o();
                String value15 = appKeyModel.getAppsMessage().getSecretiv();
                o000oooOooO0o13.getClass();
                Intrinsics.checkNotNullParameter(value15, "value");
                o000oooOooO0o13.OooO(String.valueOf(104370), value15);
                o000OOo o000oooOooO0o14 = o00Oo0.OooO0o();
                String value16 = appKeyModel.getChatKey().getKeyId();
                o000oooOooO0o14.getClass();
                Intrinsics.checkNotNullParameter(value16, "value");
                o000oooOooO0o14.OooO(String.valueOf(-1751298935), value16);
                o000OOo o000oooOooO0o15 = o00Oo0.OooO0o();
                String value17 = appKeyModel.getChatKey().getSecret();
                o000oooOooO0o15.getClass();
                Intrinsics.checkNotNullParameter(value17, "value");
                o000oooOooO0o15.OooO(String.valueOf(1772725217), value17);
            }
        }
        return Unit.INSTANCE;
    }
}
