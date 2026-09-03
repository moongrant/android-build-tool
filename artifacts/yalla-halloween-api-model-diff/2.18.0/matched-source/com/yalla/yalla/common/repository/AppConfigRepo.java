package com.yalla.yalla.common.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.android.billingclient.api.o0Oo0oo;
import com.common.support.apollo.Apollo;
import com.facebook.internal.ServerProtocol;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.AppConfigModel;
import com.yalla.yalla.common.model.AppKeyModel;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p169o00Ooo0.OooOOOO;
import p255o00ooO0O.o0000O0;
import p482o0o000.OooO0O0;
import p489o0o000oO.o0OOO0o;
import p489o0o000oO.o0ooOOo;
import p489o0o000oO.oo000o;
import p499o0o00Oo.OooOOO0;
import p500o0o00Oo0.oOO00O;
import p501o0o00OoO.o00O0O;
import p501o0o00OoO.o00Ooo;
import p501o0o00OoO.oo0o0Oo;
import p518o0o0O000.o000000O;
import p518o0o0O000.o0OoOo0;
import p549o0o0o00O.o00O000;
import p642o0ooO0oO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class AppConfigRepo extends oOO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final AppConfigRepo f20699OooO00o = new AppConfigRepo();

    @DebugMetadata(c = "com.yalla.yalla.common.repository.AppConfigRepo", f = "AppConfigRepo.kt", i = {}, l = {92}, m = "updateKeyStore", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f20700Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f20701OoooO0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20700Oooo = obj;
            this.f20701OoooO0 |= Integer.MIN_VALUE;
            return AppConfigRepo.this.OooO0o0(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0o0(@NotNull Continuation<? super Unit> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f20701OoooO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f20701OoooO0 = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objOooO0OO = oooO00o.f20700Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f20701OoooO0;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0OO);
            OooO0O0 oooO0O0 = OooO0O0.f40767OooO00o;
            String str = OooO0O0.f40768OooO0O0;
            o00O000 o00o000OooO0O0 = com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 0);
            OooOOO0 oooOOO0 = OooOOO0.f41199OooO00o;
            oo0o0Oo oo0o0ooOooO0o = OooOOO0.OooO0o();
            Objects.requireNonNull(oo0o0ooOooO0o);
            o00o000OooO0O0.OooO0O0(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, Boxing.boxInt(oo0o0ooOooO0o.OooO0O0(o000O0O0.OooO00o(-22323927510769L), 0)));
            o0OOO0o o0ooo0o2 = o0OOO0o.f40953OooO00o;
            o00o000OooO0O0.OooO0O0("deviceid", o0OOO0o.OooO00o());
            AppConfigRepo$updateKeyStore$$inlined$call$1 appConfigRepo$updateKeyStore$$inlined$call$1 = new AppConfigRepo$updateKeyStore$$inlined$call$1(o00o000OooO0O0, null);
            oooO00o.f20701OoooO0 = 1;
            objOooO0OO = o0000O0.OooO0OO(appConfigRepo$updateKeyStore$$inlined$call$1, oooO00o);
            if (objOooO0OO == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOooO0OO);
        }
        ApiResult apiResult = (ApiResult) objOooO0OO;
        if (!apiResult.isSuccess()) {
            return Unit.INSTANCE;
        }
        AppConfigModel appConfigModel = (AppConfigModel) apiResult.getData();
        if (appConfigModel != null) {
            OooOOO0 oooOOO1 = OooOOO0.f41199OooO00o;
            oo0o0Oo oo0o0ooOooO0o2 = OooOOO0.OooO0o();
            int version = appConfigModel.getVersion();
            Objects.requireNonNull(oo0o0ooOooO0o2);
            oo0o0ooOooO0o2.OooO0oO(o000O0O0.OooO00o(-22358287249137L), version);
            oo000o oo000oVar = oo000o.f40977OooO00o;
            oo000o.OooO00o().postValue(Boxing.boxBoolean(appConfigModel.getIsWc()));
            if (appConfigModel.getIsGet() && (!StringsKt.isBlank(appConfigModel.getDomainName()))) {
                SharedUrlManager.INSTANCE.setSmHost(appConfigModel.getDomainName());
            } else {
                SharedUrlManager.INSTANCE.setSmHost("");
            }
            oo000o.f40978OooO0O0 = appConfigModel.getTime() - (System.currentTimeMillis() / ((long) 1000));
            o00O0O o00o0oOooO00o = OooOOO0.OooO00o();
            int firstRecharge = appConfigModel.getFirstRecharge();
            Objects.requireNonNull(o00o0oOooO00o);
            o00o0oOooO00o.OooO0oO(o000O0O0.OooO00o(-20958127910641L), firstRecharge);
            o00O0O o00o0oOooO00o2 = OooOOO0.OooO00o();
            int phoneCodeType = appConfigModel.getPhoneCodeType();
            Objects.requireNonNull(o00o0oOooO00o2);
            o00o0oOooO00o2.OooO0oO(o000O0O0.OooO00o(-20644595298033L), phoneCodeType);
            o00O0O o00o0oOooO00o3 = OooOOO0.OooO00o();
            String phoneWaCodeCountry = appConfigModel.getPhoneWaCodeCountry();
            Objects.requireNonNull(o00o0oOooO00o3);
            Intrinsics.checkNotNullParameter(phoneWaCodeCountry, o000O0O0.OooO00o(-20790624186097L));
            o00o0oOooO00o3.OooO(o000O0O0.OooO00o(-20816393989873L), phoneWaCodeCountry);
            oo0o0Oo oo0o0ooOooO0o3 = OooOOO0.OooO0o();
            String yallaChatUrl = appConfigModel.getYallaChatUrl();
            Objects.requireNonNull(oo0o0ooOooO0o3);
            Intrinsics.checkNotNullParameter(yallaChatUrl, o000O0O0.OooO00o(-23238755544817L));
            oo0o0ooOooO0o3.OooO(String.valueOf(o000O0O0.OooO00o(-23264525348593L).hashCode()), yallaChatUrl);
            oo0o0Oo oo0o0ooOooO0o4 = OooOOO0.OooO0o();
            String yallaChatOfficeUrl = appConfigModel.getYallaChatOfficeUrl();
            Objects.requireNonNull(oo0o0ooOooO0o4);
            Intrinsics.checkNotNullParameter(yallaChatOfficeUrl, o000O0O0.OooO00o(-23419144171249L));
            oo0o0ooOooO0o4.OooO(String.valueOf(o000O0O0.OooO00o(-23444913975025L).hashCode()), yallaChatOfficeUrl);
            OooOOO0.OooO0O0().OooO0oO("socket", appConfigModel.getSocketSwitch());
            o00Ooo o00oooOooO0O0 = OooOOO0.OooO0O0();
            String value = appConfigModel.getCurrentCountryCode();
            Objects.requireNonNull(o00oooOooO0O0);
            Intrinsics.checkNotNullParameter(value, "value");
            o00oooOooO0O0.OooO("currentCountryCode", value);
            if (appConfigModel.getUpt()) {
                String bf = appConfigModel.getBf();
                String strQ = Apollo.f12673OooO00o.q("K2");
                if (StringsKt.isBlank(strQ)) {
                    if (!o0ooOOo.OooO0OO()) {
                        throw new NullPointerException("Apollo not init");
                    }
                    System.exit(1);
                    throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
                }
                AppKeyModel appKeyModel = (AppKeyModel) o0Oo0oo.OooO0O0(OooOOOO.OooO0O0(o000000O.OooO0O0(bf, strQ), appConfigModel.getStr()), AppKeyModel.class);
                oo0o0Oo oo0o0ooOooO0o5 = OooOOO0.OooO0o();
                String keyId = appKeyModel.getTwitter().getKeyId();
                Objects.requireNonNull(oo0o0ooOooO0o5);
                Intrinsics.checkNotNullParameter(keyId, o000O0O0.OooO00o(-22628870188785L));
                oo0o0ooOooO0o5.OooO(String.valueOf(o000O0O0.OooO00o(-22654639992561L).hashCode()), keyId);
                oo0o0Oo oo0o0ooOooO0o6 = OooOOO0.OooO0o();
                String secret = appKeyModel.getTwitter().getSecret();
                Objects.requireNonNull(oo0o0ooOooO0o6);
                Intrinsics.checkNotNullParameter(secret, o000O0O0.OooO00o(-22762014174961L));
                oo0o0ooOooO0o6.OooO(String.valueOf(o000O0O0.OooO00o(-22787783978737L).hashCode()), secret);
                oo0o0Oo oo0o0ooOooO0o7 = OooOOO0.OooO0o();
                String keyId2 = appKeyModel.getInstagram().getKeyId();
                Objects.requireNonNull(oo0o0ooOooO0o7);
                Intrinsics.checkNotNullParameter(keyId2, o000O0O0.OooO00o(-23805691227889L));
                String strValueOf = String.valueOf(o000O0O0.OooO00o(-23831461031665L).hashCode());
                String strOooO0Oo = OooOOOO.OooO0Oo(o0OoOo0.OooO0O0(), keyId2);
                Intrinsics.checkNotNullExpressionValue(strOooO0Oo, o000O0O0.OooO00o(-23891590573809L));
                oo0o0ooOooO0o7.OooO(strValueOf, strOooO0Oo);
                oo0o0Oo oo0o0ooOooO0o8 = OooOOO0.OooO0o();
                String secret2 = appKeyModel.getInstagram().getSecret();
                Objects.requireNonNull(oo0o0ooOooO0o8);
                Intrinsics.checkNotNullParameter(secret2, o000O0O0.OooO00o(-24333972205297L));
                String strValueOf2 = String.valueOf(o000O0O0.OooO00o(-24359742009073L).hashCode());
                String strOooO0Oo2 = OooOOOO.OooO0Oo(o0OoOo0.OooO0O0(), secret2);
                Intrinsics.checkNotNullExpressionValue(strOooO0Oo2, o000O0O0.OooO00o(-24432756453105L));
                oo0o0ooOooO0o8.OooO(strValueOf2, strOooO0Oo2);
                oo0o0Oo oo0o0ooOooO0o9 = OooOOO0.OooO0o();
                String keyId3 = appKeyModel.getWechat().getKeyId();
                Objects.requireNonNull(oo0o0ooOooO0o9);
                Intrinsics.checkNotNullParameter(keyId3, o000O0O0.OooO00o(-24849368280817L));
                String strValueOf3 = String.valueOf(o000O0O0.OooO00o(-24875138084593L).hashCode());
                String strOooO0Oo3 = OooOOOO.OooO0Oo(o0OoOo0.OooO0O0(), keyId3);
                Intrinsics.checkNotNullExpressionValue(strOooO0Oo3, o000O0O0.OooO00o(-24922382724849L));
                oo0o0ooOooO0o9.OooO(strValueOf3, strOooO0Oo3);
                oo0o0Oo oo0o0ooOooO0o10 = OooOOO0.OooO0o();
                String keyId4 = appKeyModel.getZego().getKeyId();
                Objects.requireNonNull(oo0o0ooOooO0o10);
                Intrinsics.checkNotNullParameter(keyId4, o000O0O0.OooO00o(-25330404617969L));
                String strValueOf4 = String.valueOf(o000O0O0.OooO00o(-25356174421745L).hashCode());
                String strOooO0Oo4 = OooOOOO.OooO0Oo(o0OoOo0.OooO0O0(), keyId4);
                Intrinsics.checkNotNullExpressionValue(strOooO0Oo4, o000O0O0.OooO00o(-25394829127409L));
                oo0o0ooOooO0o10.OooO(strValueOf4, strOooO0Oo4);
                oo0o0Oo oo0o0ooOooO0o11 = OooOOO0.OooO0o();
                String keyId5 = appKeyModel.getAgora().getKeyId();
                Objects.requireNonNull(oo0o0ooOooO0o11);
                Intrinsics.checkNotNullParameter(keyId5, o000O0O0.OooO00o(-25807145987825L));
                String strValueOf5 = String.valueOf(o000O0O0.OooO00o(-25832915791601L).hashCode());
                String strOooO0Oo5 = OooOOOO.OooO0Oo(o0OoOo0.OooO0O0(), keyId5);
                Intrinsics.checkNotNullExpressionValue(strOooO0Oo5, o000O0O0.OooO00o(-25875865464561L));
                oo0o0ooOooO0o11.OooO(strValueOf5, strOooO0Oo5);
                oo0o0Oo oo0o0ooOooO0o12 = OooOOO0.OooO0o();
                String keyId6 = appKeyModel.getAppsFlyer().getKeyId();
                Objects.requireNonNull(oo0o0ooOooO0o12);
                Intrinsics.checkNotNullParameter(keyId6, o000O0O0.OooO00o(-26305362194161L));
                String strValueOf6 = String.valueOf(o000O0O0.OooO00o(-26331131997937L).hashCode());
                String strOooO0Oo6 = OooOOOO.OooO0Oo(o0OoOo0.OooO0O0(), keyId6);
                Intrinsics.checkNotNullExpressionValue(strOooO0Oo6, o000O0O0.OooO00o(-26391261540081L));
                oo0o0ooOooO0o12.OooO(strValueOf6, strOooO0Oo6);
                oo0o0Oo oo0o0ooOooO0o13 = OooOOO0.OooO0o();
                String keyId7 = appKeyModel.getAppsMessage().getKeyId();
                Objects.requireNonNull(oo0o0ooOooO0o13);
                Intrinsics.checkNotNullParameter(keyId7, o000O0O0.OooO00o(-22414121823985L));
                oo0o0ooOooO0o13.OooO(o000O0O0.OooO00o(-22439891627761L), keyId7);
                oo0o0Oo oo0o0ooOooO0o14 = OooOOO0.OooO0o();
                String secret3 = appKeyModel.getAppsMessage().getSecret();
                Objects.requireNonNull(oo0o0ooOooO0o14);
                Intrinsics.checkNotNullParameter(secret3, o000O0O0.OooO00o(-22478546333425L));
                oo0o0ooOooO0o14.OooO(String.valueOf(o000O0O0.OooO00o(-22504316137201L).hashCode()), secret3);
                oo0o0Oo oo0o0ooOooO0o15 = OooOOO0.OooO0o();
                String secretiv = appKeyModel.getAppsMessage().getSecretiv();
                Objects.requireNonNull(oo0o0ooOooO0o15);
                Intrinsics.checkNotNullParameter(secretiv, o000O0O0.OooO00o(-22538675875569L));
                oo0o0ooOooO0o15.OooO(String.valueOf(o000O0O0.OooO00o(-22564445679345L).hashCode()), secretiv);
                oo0o0Oo oo0o0ooOooO0o16 = OooOOO0.OooO0o();
                String keyId8 = appKeyModel.getChatKey().getKeyId();
                Objects.requireNonNull(oo0o0ooOooO0o16);
                Intrinsics.checkNotNullParameter(keyId8, o000O0O0.OooO00o(-22912338030321L));
                oo0o0ooOooO0o16.OooO(String.valueOf(o000O0O0.OooO00o(-22938107834097L).hashCode()), keyId8);
                oo0o0Oo oo0o0ooOooO0o17 = OooOOO0.OooO0o();
                String secret4 = appKeyModel.getChatKey().getSecret();
                Objects.requireNonNull(oo0o0ooOooO0o17);
                Intrinsics.checkNotNullParameter(secret4, o000O0O0.OooO00o(-23071251820273L));
                oo0o0ooOooO0o17.OooO(String.valueOf(o000O0O0.OooO00o(-23097021624049L).hashCode()), secret4);
            }
        }
        return Unit.INSTANCE;
    }
}
