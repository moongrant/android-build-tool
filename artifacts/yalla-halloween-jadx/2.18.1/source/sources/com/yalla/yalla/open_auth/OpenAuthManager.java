package com.yalla.yalla.open_auth;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.android.billingclient.api.o0O0O00;
import com.facebook.AccessToken;
import com.facebook.internal.ServerProtocol;
import com.facebook.login.LoginManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.identity.TwitterLoginButton;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yallatech.support.platform.login.bean.AuthResponse;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import o0OoO.OooO0O0;
import oO0OO.OooO;
import oO0OO.OooOOO;
import oO0OO.Oooo000;
import oO0OO.o00O0O;
import oO0OO.o00Oo0;
import oO0OO.o00Ooo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o00O00OO;
import p153o00Oo0oO.o00000;
import p153o00Oo0oO.o00000O0;
import p168o00Ooo0.OooOOOO;
import p174o00OooOO.o0O00O;
import p254o00ooO0O.o000O0O0;
import p426o0OoO0Oo.o0OO00O;
import p426o0OoO0Oo.oo0o0Oo;
import p429o0OoO0oO.o000000;
import p431o0OoOO.OooOo;
import p433o0OoOO0o.o0O0O0Oo;
import p433o0OoOO0o.o0O0o;
import p433o0OoOO0o.o0oO0Ooo;
import p484o0o000OO.OooOO0O;
import p497o0o00Oo.OooOOO0;
import p516o0o0O000.o0OoOo0;
import p522o0o0O0o.o00O0;
import p623o0oo0oO0.o0000O0;
import p646o0ooOOO0.o0O0O0O;
import p660o0ooo0o0.o00OOO00;
import p660o0ooo0o0.o0O0ooO;
import p660o0ooo0o0.o0o0Oo;
import p663o0oooO0.o00O0OO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OpenAuthManager {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Lazy f21646OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f21647OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Function3<? super String, ? super AuthType, ? super String, Unit> f21648OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f21649OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f21650OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f21651OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f21652OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Lazy f21653OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f21654OooO0oo;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/open_auth/OpenAuthManager$AuthType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "Facebook", "Twitter", "Instagram", "WeChat", "YallaChat", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
    public enum AuthType {
        Facebook(4),
        Twitter(9),
        Instagram(7),
        WeChat(5),
        YallaChat(12);

        private final int value;

        AuthType(int i) {
            this.value = i;
        }

        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final int getValue() {
            return this.value;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<AuthResponse, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AuthResponse authResponse) {
            AuthResponse it = authResponse;
            Intrinsics.checkNotNullParameter(it, "it");
            if (!it.isSuccess()) {
                Function0<Unit> function0 = OpenAuthManager.this.f21649OooO0OO;
                if (function0 != null) {
                    function0.invoke();
                }
            } else if (o00O0.OooO0o0(it.getAuthCode())) {
                Function3<? super String, ? super AuthType, ? super String, Unit> function3 = OpenAuthManager.this.f21648OooO0O0;
                if (function3 != null) {
                    function3.invoke(it.getAuthCode(), AuthType.YallaChat, null);
                }
            } else {
                Function0<Unit> function1 = OpenAuthManager.this.f21650OooO0Oo;
                if (function1 != null) {
                    function1.invoke();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public OpenAuthManager(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        this.f21647OooO00o = fragmentActivity;
        this.f21652OooO0o0 = LazyKt.lazy(new OooO(this));
        this.f21651OooO0o = LazyKt.lazy(new Oooo000(this));
        this.f21653OooO0oO = LazyKt.lazy(new o00O0O(this));
        this.f21654OooO0oo = LazyKt.lazy(new OooOOO(this));
        this.f21646OooO = LazyKt.lazy(new o00Oo0(this));
    }

    public final void OooO00o() {
        FecebookOAuth fecebookOAuth = (FecebookOAuth) this.f21652OooO0o0.getValue();
        Objects.requireNonNull(fecebookOAuth);
        ArrayList arrayList = new ArrayList();
        arrayList.add("public_profile");
        LoginManager.INSTANCE.getInstance().logInWithReadPermissions(fecebookOAuth.f21634OooO00o, arrayList);
    }

    public final void OooO0O0() {
        InstagramOAuth instagramOAuth = (InstagramOAuth) this.f21654OooO0oo.getValue();
        Objects.requireNonNull(instagramOAuth);
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.LoginInstagram);
        webPageInfo.OooO0Oo(instagramOAuth.f21644OooO0Oo);
        webPageInfo.OooO0OO(o000O0O0.OooO0OO(R.string.single_third_instagram));
        webPageInfo.f21220OoooO0 = true;
        WebActivity.OooO00o oooO00o = WebActivity.f22108OoooooO;
        FragmentActivity activity = instagramOAuth.f21641OooO00o;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent(activity, (Class<?>) WebActivity.class);
        intent.putExtra("pageinfo", webPageInfo);
        activity.startActivityForResult(intent, 101);
    }

    public final void OooO0OO() {
        ((TwitterOAuth) this.f21651OooO0o.getValue()).f21656OooO00o.performClick();
    }

    public final void OooO0Oo() {
        o00Ooo o00ooo2 = (o00Ooo) this.f21653OooO0oO.getValue();
        o00ooo2.f52748OooO0Oo = true;
        OooO0O0 oooO0O0 = o00ooo2.f52745OooO00o;
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        String strOooOO0o = OooOOO0.OooO0o().OooOO0o();
        if (o0OoO.OooO00o.OooO0O0(oooO0O0.f39811OooO00o, oooO0O0.f39813OooO0OO)) {
            o0O0O00 o0o0o00 = o0OO00O.f39846OooO00o;
            oooO0O0.f39812OooO0O0 = strOooOO0o;
            oooO0O0.f39811OooO00o.getPackageName();
            String str = "weixin://registerapp?appid=" + oooO0O0.f39812OooO0O0;
            Context context = oooO0O0.f39811OooO00o;
            if (context != null && !oo0o0Oo.OooO00o("com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_REGISTER")) {
                String str2 = oo0o0Oo.OooO00o("com.tencent.mm") ? null : "com.tencent.mm.permission.MM_MESSAGE";
                Intent intent = new Intent("com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_REGISTER");
                String packageName = context.getPackageName();
                intent.putExtra("_mmessage_sdkVersion", 570490883);
                intent.putExtra("_mmessage_appPackage", packageName);
                intent.putExtra("_mmessage_content", str);
                intent.putExtra("_mmessage_checksum", o0O00O.OooO00o(str, 570490883, packageName));
                context.sendBroadcast(intent, str2);
                intent.toString();
            }
        } else {
            o0O0O00 o0o0o01 = o0OO00O.f39846OooO00o;
        }
        o000000 o000000Var = new o000000();
        o000000Var.f39893OooO0OO = "snsapi_userinfo";
        o000000Var.f39894OooO0Oo = "carjob_wx_login";
        OooO0O0 oooO0O1 = o00ooo2.f52745OooO00o;
        if (o0OoO.OooO00o.OooO0O0(oooO0O1.f39811OooO00o, oooO0O1.f39813OooO0OO) && o000000Var.OooO0Oo()) {
            Bundle bundle = new Bundle();
            o000000Var.OooO0OO(bundle);
            o0O0O0O.OooO00o oooO00o = new o0O0O0O.OooO00o();
            oooO00o.f48888OooO0Oo = bundle;
            oooO00o.f48887OooO0OO = "weixin://sendreq?appid=" + oooO0O1.f39812OooO0O0;
            oooO00o.f48885OooO00o = "com.tencent.mm";
            oooO00o.f48886OooO0O0 = "com.tencent.mm.plugin.base.stub.WXEntryActivity";
            o0O0O0O.OooO00o(oooO0O1.f39811OooO00o, oooO00o);
        }
    }

    public final boolean OooO0o() {
        OooO0O0 oooO0O0 = ((o00Ooo) this.f21653OooO0oO.getValue()).f52745OooO00o;
        Objects.requireNonNull(oooO0O0);
        try {
            PackageInfo packageInfo = oooO0O0.f39811OooO00o.getPackageManager().getPackageInfo("com.tencent.mm", 64);
            if (packageInfo != null) {
                return o0OoO.OooO00o.OooO00o(packageInfo.signatures, oooO0O0.f39813OooO0OO);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final void OooO0o0() {
        ((o0000O0) this.f21646OooO.getValue()).OooO00o(new OooO00o());
    }

    public final void OooO0oO(int i, int i2, @Nullable Intent intent) {
        boolean z;
        ((FecebookOAuth) this.f21652OooO0o0.getValue()).f21635OooO0O0.onActivityResult(i, i2, intent);
        TwitterLoginButton twitterLoginButton = ((TwitterOAuth) this.f21651OooO0o.getValue()).f21656OooO00o;
        Objects.requireNonNull(twitterLoginButton.getTwitterAuthClient().f39911OooO0OO);
        if (i == 140) {
            p431o0OoOO.o00O0O twitterAuthClient = twitterLoginButton.getTwitterAuthClient();
            Objects.requireNonNull(twitterAuthClient);
            o0oO0Ooo.OooO0OO().OooO0OO("Twitter", o00O00OO.OooO00o("onActivityResult called with ", i, ZegoConstants.ZegoVideoDataAuxPublishingStream, i2));
            if (twitterAuthClient.f39909OooO00o.f39908OooO00o.get() != null) {
                OooOo oooOo = twitterAuthClient.f39909OooO00o.f39908OooO00o.get();
                if (oooOo != null) {
                    if (oooOo.f39905OooO00o != i) {
                        z = false;
                    } else {
                        o0O0o<o0O0O0Oo> o0o0o = oooOo.f39907OooO0OO;
                        if (o0o0o != null) {
                            if (i2 == -1) {
                                String stringExtra = intent.getStringExtra("tk");
                                String stringExtra2 = intent.getStringExtra("ts");
                                o0o0o.OooO0Oo(new p433o0OoOO0o.o0O00O<>(new o0O0O0Oo(new TwitterAuthToken(stringExtra, stringExtra2), intent.getLongExtra(AccessToken.USER_ID_KEY, 0L), intent.getStringExtra("screen_name")), null));
                            } else if (intent == null || !intent.hasExtra("auth_error")) {
                                o0o0o.OooO0OO(new TwitterAuthException("Authorize failed."));
                            } else {
                                o0o0o.OooO0OO((TwitterAuthException) intent.getSerializableExtra("auth_error"));
                            }
                        }
                        z = true;
                    }
                    if (z) {
                        twitterAuthClient.f39909OooO00o.f39908OooO00o.set(null);
                    }
                }
            } else {
                o0oO0Ooo.OooO0OO().OooO0O0("Twitter", "Authorize not in progress", null);
            }
        }
        InstagramOAuth instagramOAuth = (InstagramOAuth) this.f21654OooO0oo.getValue();
        Objects.requireNonNull(instagramOAuth);
        if (i != 101 || intent == null) {
            return;
        }
        String stringExtra3 = intent.getStringExtra("INSTAGRAG_LOGIN_URI");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        if (!StringsKt__StringsKt.contains$default(stringExtra3, "=", false, 2, (Object) null) || !StringsKt__StringsKt.contains$default(stringExtra3, "code", false, 2, (Object) null)) {
            Function0<Unit> function0 = instagramOAuth.f21643OooO0OO;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        Object[] array = new Regex("=").split(stringExtra3, 0).toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String code2 = StringsKt.OooOo00(((String[]) array)[1], "#_", "");
        oO0OO.OooO00o callback = new oO0OO.OooO00o(instagramOAuth);
        Intrinsics.checkNotNullParameter(code2, "code");
        Intrinsics.checkNotNullParameter(callback, "callback");
        ArrayList arrayList = new ArrayList();
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        String strOooOO0O = OooOOO0.OooO0o().OooOO0O();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("client_id", strOooOO0O);
        p499o0o00OoO.oo0o0Oo oo0o0ooOooO0o = OooOOO0.OooO0o();
        Objects.requireNonNull(oo0o0ooOooO0o);
        String strOooO0O0 = OooOOOO.OooO0O0(o0OoOo0.OooO0O0(), oo0o0ooOooO0o.OooO0Oo(String.valueOf(p640o0ooO0oO.o000O0O0.OooO00o(-28264351637008L).hashCode()), o000O0O0.OooO0OO(R.string.single_instagram_client_secret)));
        Intrinsics.checkNotNullExpressionValue(strOooO0O0, p640o0ooO0oO.o000O0O0.OooO00o(-28337366081040L));
        linkedHashMap.put("client_secret", strOooO0O0);
        linkedHashMap.put("grant_type", "authorization_code");
        linkedHashMap.put(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, o000O0O0.OooO0OO(R.string.single_instagram_callback_url));
        linkedHashMap.put("code", code2);
        p156o00OoO0.OooOOO0 oooOOO1 = new p156o00OoO0.OooOOO0("https://api.instagram.com/oauth/access_token", null, linkedHashMap, null, arrayList);
        OooOO0O oooOO0O = new OooOO0O(callback);
        o0o0Oo o0o0ooOooO0OO = oooOOO1.OooO0OO(oooOOO1.OooO0O0(), oooOO0O);
        o00OOO00.OooO00o oooO00o = oooOOO1.f32352OooO0o0;
        oooO00o.OooO0oo(o0o0ooOooO0OO);
        o0O0ooO o0o0oooOooO0OO = o00000O0.OooO0O0().f32199OooO00o.OooO0OO(oooO00o.OooO0O0());
        o00000O0 o00000o0OooO0O0 = o00000O0.OooO0O0();
        Objects.requireNonNull(o00000o0OooO0O0);
        ((o00O0OO) o0o0oooOooO0OO).OoooO0O(new o00000(o00000o0OooO0O0, oooOO0O, oooOOO1.f32351OooO0Oo));
    }
}
