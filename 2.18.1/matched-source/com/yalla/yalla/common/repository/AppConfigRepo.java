package com.yalla.yalla.common.repository;

import androidx.compose.runtime.internal.StabilityInferred;
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
import p168o00Ooo0.OooOOOO;
import p254o00ooO0O.o0000O0;
import p480o0o000.OooO0O0;
import p487o0o000oO.o00oO0o;
import p487o0o000oO.o0OOO0o;
import p487o0o000oO.o0Oo0oo;
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.o00O00O;
import p499o0o00OoO.o00O0O;
import p499o0o00OoO.o00Ooo;
import p499o0o00OoO.oo0o0Oo;
import p516o0o0O000.o000000O;
import p516o0o0O000.o0OoOo0;
import p547o0o0o00O.o00O000o;
import p640o0ooO0oO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class AppConfigRepo extends o00O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final AppConfigRepo f20679OooO00o = new AppConfigRepo();

    @DebugMetadata(c = "com.yalla.yalla.common.repository.AppConfigRepo", f = "AppConfigRepo.kt", i = {}, l = {92}, m = "updateKeyStore", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f20680Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f20682Oooo0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20680Oooo0o = obj;
            this.f20682Oooo0oo |= Integer.MIN_VALUE;
            return AppConfigRepo.this.OooO0o0(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0o0(@NotNull Continuation<? super Unit> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f20682Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f20682Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objOooO0OO = oooO00o.f20680Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f20682Oooo0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0OO);
            OooO0O0 oooO0O0 = OooO0O0.f40748OooO00o;
            String str = OooO0O0.f40749OooO0O0;
            o00O000o o00o000oOooO0O0 = com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 0);
            OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
            oo0o0Oo oo0o0ooOooO0o = OooOOO0.OooO0o();
            Objects.requireNonNull(oo0o0ooOooO0o);
            o00o000oOooO0O0.OooO0O0(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, Boxing.boxInt(oo0o0ooOooO0o.OooO0O0(o000O0O0.OooO00o(-26546364718608L), 0)));
            o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
            o00o000oOooO0O0.OooO0O0("deviceid", o0Oo0oo.OooO00o());
            AppConfigRepo$updateKeyStore$$inlined$call$1 appConfigRepo$updateKeyStore$$inlined$call$1 = new AppConfigRepo$updateKeyStore$$inlined$call$1(o00o000oOooO0O0, null);
            oooO00o.f20682Oooo0oo = 1;
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
            OooOOO0 oooOOO1 = OooOOO0.f41180OooO00o;
            oo0o0Oo oo0o0ooOooO0o2 = OooOOO0.OooO0o();
            int version = appConfigModel.getVersion();
            Objects.requireNonNull(oo0o0ooOooO0o2);
            oo0o0ooOooO0o2.OooO0oO(o000O0O0.OooO00o(-26580724456976L), version);
            o00oO0o o00oo0o2 = o00oO0o.f40931OooO00o;
            o00oO0o.OooO00o().postValue(Boxing.boxBoolean(appConfigModel.getIsWc()));
            if (appConfigModel.getIsGet() && (!StringsKt.isBlank(appConfigModel.getDomainName()))) {
                SharedUrlManager.INSTANCE.setSmHost(appConfigModel.getDomainName());
            } else {
                SharedUrlManager.INSTANCE.setSmHost("");
            }
            o00oO0o.f40932OooO0O0 = appConfigModel.getTime() - (System.currentTimeMillis() / ((long) 1000));
            o00O0O o00o0oOooO00o = OooOOO0.OooO00o();
            int firstRecharge = appConfigModel.getFirstRecharge();
            Objects.requireNonNull(o00o0oOooO00o);
            o00o0oOooO00o.OooO0oO(o000O0O0.OooO00o(-24424650874384L), firstRecharge);
            o00O0O o00o0oOooO00o2 = OooOOO0.OooO00o();
            int phoneCodeType = appConfigModel.getPhoneCodeType();
            Objects.requireNonNull(o00o0oOooO00o2);
            o00o0oOooO00o2.OooO0oO(o000O0O0.OooO00o(-24111118261776L), phoneCodeType);
            o00O0O o00o0oOooO00o3 = OooOOO0.OooO00o();
            String phoneWaCodeCountry = appConfigModel.getPhoneWaCodeCountry();
            Objects.requireNonNull(o00o0oOooO00o3);
            Intrinsics.checkNotNullParameter(phoneWaCodeCountry, o000O0O0.OooO00o(-24257147149840L));
            o00o0oOooO00o3.OooO(o000O0O0.OooO00o(-24282916953616L), phoneWaCodeCountry);
            oo0o0Oo oo0o0ooOooO0o3 = OooOOO0.OooO0o();
            String yallaChatUrl = appConfigModel.getYallaChatUrl();
            Objects.requireNonNull(oo0o0ooOooO0o3);
            Intrinsics.checkNotNullParameter(yallaChatUrl, o000O0O0.OooO00o(-27461192752656L));
            oo0o0ooOooO0o3.OooO(String.valueOf(o000O0O0.OooO00o(-27486962556432L).hashCode()), yallaChatUrl);
            oo0o0Oo oo0o0ooOooO0o4 = OooOOO0.OooO0o();
            String yallaChatOfficeUrl = appConfigModel.getYallaChatOfficeUrl();
            Objects.requireNonNull(oo0o0ooOooO0o4);
            Intrinsics.checkNotNullParameter(yallaChatOfficeUrl, o000O0O0.OooO00o(-27641581379088L));
            oo0o0ooOooO0o4.OooO(String.valueOf(o000O0O0.OooO00o(-27667351182864L).hashCode()), yallaChatOfficeUrl);
            OooOOO0.OooO0O0().OooO0oO("socket", appConfigModel.getSocketSwitch());
            o00Ooo o00oooOooO0O0 = OooOOO0.OooO0O0();
            String value = appConfigModel.getCurrentCountryCode();
            Objects.requireNonNull(o00oooOooO0O0);
            Intrinsics.checkNotNullParameter(value, "value");
            o00oooOooO0O0.OooO("currentCountryCode", value);
            if (appConfigModel.getUpt()) {
                String bf = appConfigModel.getBf();
                String strQ = Apollo.f12658OooO00o.q("K2");
                if (StringsKt.isBlank(strQ)) {
                    if (!o0OOO0o.OooO0OO()) {
                        throw new NullPointerException("Apollo not init");
                    }
                    System.exit(1);
                    throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
                }
                AppKeyModel appKeyModel = (AppKeyModel) com.android.billingclient.api.o0Oo0oo.OooO0O0(OooOOOO.OooO0O0(o000000O.OooO0O0(bf, strQ), appConfigModel.getStr()), AppKeyModel.class);
                oo0o0Oo oo0o0ooOooO0o5 = OooOOO0.OooO0o();
                String keyId = appKeyModel.getTwitter().getKeyId();
                Objects.requireNonNull(oo0o0ooOooO0o5);
                Intrinsics.checkNotNullParameter(keyId, o000O0O0.OooO00o(-26851307396624L));
                oo0o0ooOooO0o5.OooO(String.valueOf(o000O0O0.OooO00o(-26877077200400L).hashCode()), keyId);
                oo0o0Oo oo0o0ooOooO0o6 = OooOOO0.OooO0o();
                String secret = appKeyModel.getTwitter().getSecret();
                Objects.requireNonNull(oo0o0ooOooO0o6);
                Intrinsics.checkNotNullParameter(secret, o000O0O0.OooO00o(-26984451382800L));
                oo0o0ooOooO0o6.OooO(String.valueOf(o000O0O0.OooO00o(-27010221186576L).hashCode()), secret);
                oo0o0Oo oo0o0ooOooO0o7 = OooOOO0.OooO0o();
                String keyId2 = appKeyModel.getInstagram().getKeyId();
                Objects.requireNonNull(oo0o0ooOooO0o7);
                Intrinsics.checkNotNullParameter(keyId2, o000O0O0.OooO00o(-28028128435728L));
                String strValueOf = String.valueOf(o000O0O0.OooO00o(-28053898239504L).hashCode());
                String strOooO0Oo = OooOOOO.OooO0Oo(o0OoOo0.OooO0O0(), keyId2);
                Intrinsics.checkNotNullExpressionValue(strOooO0Oo, o000O0O0.OooO00o(-28114027781648L));
                oo0o0ooOooO0o7.OooO(strValueOf, strOooO0Oo);
                oo0o0Oo oo0o0ooOooO0o8 = OooOOO0.OooO0o();
                String secret2 = appKeyModel.getInstagram().getSecret();
                Objects.requireNonNull(oo0o0ooOooO0o8);
                Intrinsics.checkNotNullParameter(secret2, o000O0O0.OooO00o(-28556409413136L));
                String strValueOf2 = String.valueOf(o000O0O0.OooO00o(-28582179216912L).hashCode());
                String strOooO0Oo2 = OooOOOO.OooO0Oo(o0OoOo0.OooO0O0(), secret2);
                Intrinsics.checkNotNullExpressionValue(strOooO0Oo2, o000O0O0.OooO00o(-28655193660944L));
                oo0o0ooOooO0o8.OooO(strValueOf2, strOooO0Oo2);
                oo0o0Oo oo0o0ooOooO0o9 = OooOOO0.OooO0o();
                String keyId3 = appKeyModel.getWechat().getKeyId();
                Objects.requireNonNull(oo0o0ooOooO0o9);
                Intrinsics.checkNotNullParameter(keyId3, o000O0O0.OooO00o(-29071805488656L));
                String strValueOf3 = String.valueOf(o000O0O0.OooO00o(-29097575292432L).hashCode());
                String strOooO0Oo3 = OooOOOO.OooO0Oo(o0OoOo0.OooO0O0(), keyId3);
                Intrinsics.checkNotNullExpressionValue(strOooO0Oo3, o000O0O0.OooO00o(-29144819932688L));
                oo0o0ooOooO0o9.OooO(strValueOf3, strOooO0Oo3);
                oo0o0Oo oo0o0ooOooO0o10 = OooOOO0.OooO0o();
                String keyId4 = appKeyModel.getZego().getKeyId();
                Objects.requireNonNull(oo0o0ooOooO0o10);
                Intrinsics.checkNotNullParameter(keyId4, o000O0O0.OooO00o(-29552841825808L));
                String strValueOf4 = String.valueOf(o000O0O0.OooO00o(-29578611629584L).hashCode());
                String strOooO0Oo4 = OooOOOO.OooO0Oo(o0OoOo0.OooO0O0(), keyId4);
                Intrinsics.checkNotNullExpressionValue(strOooO0Oo4, o000O0O0.OooO00o(-29617266335248L));
                oo0o0ooOooO0o10.OooO(strValueOf4, strOooO0Oo4);
                oo0o0Oo oo0o0ooOooO0o11 = OooOOO0.OooO0o();
                String keyId5 = appKeyModel.getAgora().getKeyId();
                Objects.requireNonNull(oo0o0ooOooO0o11);
                Intrinsics.checkNotNullParameter(keyId5, o000O0O0.OooO00o(-30029583195664L));
                String strValueOf5 = String.valueOf(o000O0O0.OooO00o(-30055352999440L).hashCode());
                String strOooO0Oo5 = OooOOOO.OooO0Oo(o0OoOo0.OooO0O0(), keyId5);
                Intrinsics.checkNotNullExpressionValue(strOooO0Oo5, o000O0O0.OooO00o(-30098302672400L));
                oo0o0ooOooO0o11.OooO(strValueOf5, strOooO0Oo5);
                oo0o0Oo oo0o0ooOooO0o12 = OooOOO0.OooO0o();
                String keyId6 = appKeyModel.getAppsFlyer().getKeyId();
                Objects.requireNonNull(oo0o0ooOooO0o12);
                Intrinsics.checkNotNullParameter(keyId6, o000O0O0.OooO00o(-30527799402000L));
                String strValueOf6 = String.valueOf(o000O0O0.OooO00o(-30553569205776L).hashCode());
                String strOooO0Oo6 = OooOOOO.OooO0Oo(o0OoOo0.OooO0O0(), keyId6);
                Intrinsics.checkNotNullExpressionValue(strOooO0Oo6, o000O0O0.OooO00o(-30613698747920L));
                oo0o0ooOooO0o12.OooO(strValueOf6, strOooO0Oo6);
                oo0o0Oo oo0o0ooOooO0o13 = OooOOO0.OooO0o();
                String keyId7 = appKeyModel.getAppsMessage().getKeyId();
                Objects.requireNonNull(oo0o0ooOooO0o13);
                Intrinsics.checkNotNullParameter(keyId7, o000O0O0.OooO00o(-26636559031824L));
                oo0o0ooOooO0o13.OooO(o000O0O0.OooO00o(-26662328835600L), keyId7);
                oo0o0Oo oo0o0ooOooO0o14 = OooOOO0.OooO0o();
                String secret3 = appKeyModel.getAppsMessage().getSecret();
                Objects.requireNonNull(oo0o0ooOooO0o14);
                Intrinsics.checkNotNullParameter(secret3, o000O0O0.OooO00o(-26700983541264L));
                oo0o0ooOooO0o14.OooO(String.valueOf(o000O0O0.OooO00o(-26726753345040L).hashCode()), secret3);
                oo0o0Oo oo0o0ooOooO0o15 = OooOOO0.OooO0o();
                String secretiv = appKeyModel.getAppsMessage().getSecretiv();
                Objects.requireNonNull(oo0o0ooOooO0o15);
                Intrinsics.checkNotNullParameter(secretiv, o000O0O0.OooO00o(-26761113083408L));
                oo0o0ooOooO0o15.OooO(String.valueOf(o000O0O0.OooO00o(-26786882887184L).hashCode()), secretiv);
                oo0o0Oo oo0o0ooOooO0o16 = OooOOO0.OooO0o();
                String keyId8 = appKeyModel.getChatKey().getKeyId();
                Objects.requireNonNull(oo0o0ooOooO0o16);
                Intrinsics.checkNotNullParameter(keyId8, o000O0O0.OooO00o(-27134775238160L));
                oo0o0ooOooO0o16.OooO(String.valueOf(o000O0O0.OooO00o(-27160545041936L).hashCode()), keyId8);
                oo0o0Oo oo0o0ooOooO0o17 = OooOOO0.OooO0o();
                String secret4 = appKeyModel.getChatKey().getSecret();
                Objects.requireNonNull(oo0o0ooOooO0o17);
                Intrinsics.checkNotNullParameter(secret4, o000O0O0.OooO00o(-27293689028112L));
                oo0o0ooOooO0o17.OooO(String.valueOf(o000O0O0.OooO00o(-27319458831888L).hashCode()), secret4);
            }
        }
        return Unit.INSTANCE;
    }
}
