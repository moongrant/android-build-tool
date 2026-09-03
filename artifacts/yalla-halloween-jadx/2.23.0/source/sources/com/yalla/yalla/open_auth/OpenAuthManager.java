package com.yalla.yalla.open_auth;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.camera.core.impl.OooOOOO;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.common.support.crypto.AESKt;
import com.facebook.AccessToken;
import com.facebook.internal.ServerProtocol;
import com.facebook.login.LoginManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.identity.TwitterLoginButton;
import com.twitter.sdk.android.core.o000oOoO;
import com.twitter.sdk.android.core.o0Oo0oo;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.util.WebPageInfo;
import com.yallatech.support.platform.login.bean.AuthResponse;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p342o0OOO0oO.OooO;
import p343o0OOO0oo.OooOO0;
import p343o0OOO0oo.OooOOO0;
import p377o0OOoOo.o0000oo;
import p377o0OOoOo.o000O00O;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o000OOo;
import p417o0OoO0.o0000O0O;
import p421o0OoO0Oo.o00000O0;
import p465o0Oooo0.o0000O;
import p465o0Oooo0.o0000O0;
import p465o0Oooo0.o000O00;
import p465o0Oooo0.o000O000;
import p465o0Oooo0.o000O0O0;
import p465o0Oooo0.o000O0Oo;
import p465o0Oooo0.o000OO0O;
import p579o0oOoo.o0o0000;
import p579o0oOoo.oO000Oo;
import p584o0oOooO0.oO00OOo0;
import p602o0oo0O0O.o000OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OpenAuthManager {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Lazy f24728OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f24729OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Function3<? super String, ? super AuthType, ? super String, Unit> f24730OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f24731OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f24732OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f24733OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f24734OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Lazy f24735OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f24736OooO0oo;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/open_auth/OpenAuthManager$AuthType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "Facebook", "Twitter", "Instagram", "WeChat", "YallaChat", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
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
            boolean zIsSuccess = it.isSuccess();
            OpenAuthManager openAuthManager = OpenAuthManager.this;
            if (!zIsSuccess) {
                Function0<Unit> function0 = openAuthManager.f24731OooO0OO;
                if (function0 != null) {
                    function0.invoke();
                }
            } else if (o0000O0O.OooO0o(it.getAuthCode())) {
                Function3<? super String, ? super AuthType, ? super String, Unit> function3 = openAuthManager.f24730OooO0O0;
                if (function3 != null) {
                    function3.invoke(it.getAuthCode(), AuthType.YallaChat, null);
                }
            } else {
                Function0<Unit> function1 = openAuthManager.f24732OooO0Oo;
                if (function1 != null) {
                    function1.invoke();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public OpenAuthManager(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        this.f24729OooO00o = fragmentActivity;
        this.f24734OooO0o0 = LazyKt.lazy(new o0000O(this));
        this.f24733OooO0o = LazyKt.lazy(new o000O00(this));
        this.f24735OooO0oO = LazyKt.lazy(new o000O0Oo(this));
        this.f24736OooO0oo = LazyKt.lazy(new o000O000(this));
        this.f24728OooO = LazyKt.lazy(new o000OO0O(this));
    }

    public final void OooO00o() {
        FecebookOAuth fecebookOAuth = (FecebookOAuth) this.f24734OooO0o0.getValue();
        fecebookOAuth.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add("public_profile");
        LoginManager.INSTANCE.getInstance().logInWithReadPermissions(fecebookOAuth.f24712OooO00o, arrayList);
    }

    public final void OooO0O0() {
        InstagramOAuth instagramOAuth = (InstagramOAuth) this.f24736OooO0oo.getValue();
        instagramOAuth.getClass();
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.LoginInstagram);
        webPageInfo.OooO0o0(instagramOAuth.f24722OooO0Oo);
        webPageInfo.OooO0Oo(o0000.OooO0OO(oO00OOo0.single_third_instagram));
        webPageInfo.f32816OooO = true;
        int i = WebActivity.f25584OooOoO0;
        FragmentActivity activity = instagramOAuth.f24719OooO00o;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent(activity, (Class<?>) WebActivity.class);
        intent.putExtra("pageinfo", webPageInfo);
        activity.startActivityForResult(intent, 101);
    }

    public final void OooO0OO() {
        ((TwitterOAuth) this.f24733OooO0o.getValue()).f24738OooO00o.performClick();
    }

    public final void OooO0Oo() {
        boolean zOooO00o;
        FirebaseAnalytics.getInstance(this.f24729OooO00o).f19791OooO00o.zzy("WeChat_Auth", null);
        o000O0O0 o000o0o1 = (o000O0O0) this.f24735OooO0oO.getValue();
        boolean zOooO00o2 = true;
        o000o0o1.f46878OooO0Oo = true;
        String strOooOO0o = o00Oo0.OooO0o().OooOO0o();
        o0OOOO0o.OooO0O0 oooO0O0 = o000o0o1.f46875OooO00o;
        boolean z = oooO0O0.f43620OooO0OO;
        Context context = oooO0O0.f43618OooO00o;
        if (z) {
            try {
                zOooO00o = o0OOOO0o.OooO00o.OooO00o(context.getPackageManager().getPackageInfo("com.tencent.mm", 64).signatures, z);
            } catch (PackageManager.NameNotFoundException unused) {
                zOooO00o = false;
            }
        } else {
            int i = OooOO0.f43608OooO00o;
            zOooO00o = true;
        }
        if (zOooO00o) {
            int i2 = OooOO0.f43608OooO00o;
            oooO0O0.f43619OooO0O0 = strOooOO0o;
            context.getPackageName();
            String str = "weixin://registerapp?appid=" + oooO0O0.f43619OooO0O0;
            if (!OooOOO0.OooO00o("com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_REGISTER")) {
                String str2 = OooOOO0.OooO00o("com.tencent.mm") ? null : "com.tencent.mm.permission.MM_MESSAGE";
                Intent intent = new Intent("com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_REGISTER");
                String packageName = context.getPackageName();
                intent.putExtra("_mmessage_sdkVersion", 570490883);
                intent.putExtra("_mmessage_appPackage", packageName);
                intent.putExtra("_mmessage_content", str);
                intent.putExtra("_mmessage_checksum", OooO.OooO00o(570490883, str, packageName));
                context.sendBroadcast(intent, str2);
                intent.toString();
            }
        } else {
            int i3 = OooOO0.f43608OooO00o;
        }
        o0OOOO00.OooO0OO oooO0OO = new o0OOOO00.OooO0OO();
        oooO0OO.f43614OooO0OO = "snsapi_userinfo";
        oooO0OO.f43615OooO0Oo = "carjob_wx_login";
        boolean z2 = oooO0O0.f43620OooO0OO;
        if (z2) {
            try {
                zOooO00o2 = o0OOOO0o.OooO00o.OooO00o(context.getPackageManager().getPackageInfo("com.tencent.mm", 64).signatures, z2);
            } catch (PackageManager.NameNotFoundException unused2) {
                zOooO00o2 = false;
            }
        }
        if (zOooO00o2 && oooO0OO.OooO0Oo()) {
            Bundle bundle = new Bundle();
            oooO0OO.OooO0OO(bundle);
            String str3 = "weixin://sendreq?appid=" + oooO0O0.f43619OooO0O0;
            if (context != null && !OooOOO0.OooO00o("com.tencent.mm")) {
                String strOooO00o = OooOOO0.OooO00o("com.tencent.mm.plugin.base.stub.WXEntryActivity") ? OooOOOO.OooO00o("com.tencent.mm", ".wxapi.WXEntryActivity") : "com.tencent.mm.plugin.base.stub.WXEntryActivity";
                int i4 = OooOO0.f43608OooO00o;
                Intent intent2 = new Intent();
                intent2.setClassName("com.tencent.mm", strOooO00o);
                intent2.putExtras(bundle);
                String packageName2 = context.getPackageName();
                intent2.putExtra("_mmessage_sdkVersion", 570490883);
                intent2.putExtra("_mmessage_appPackage", packageName2);
                intent2.putExtra("_mmessage_content", str3);
                intent2.putExtra("_mmessage_checksum", OooO.OooO00o(570490883, str3, packageName2));
                intent2.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY).addFlags(134217728);
                try {
                    context.startActivity(intent2);
                    intent2.toString();
                    return;
                } catch (Exception e) {
                    e.getMessage();
                }
            }
            int i5 = OooOO0.f43608OooO00o;
        }
    }

    public final boolean OooO0o() {
        o0OOOO0o.OooO0O0 oooO0O0 = ((o000O0O0) this.f24735OooO0oO.getValue()).f46875OooO00o;
        try {
            PackageInfo packageInfo = oooO0O0.f43618OooO00o.getPackageManager().getPackageInfo("com.tencent.mm", 64);
            if (packageInfo != null) {
                return o0OOOO0o.OooO00o.OooO00o(packageInfo.signatures, oooO0O0.f43620OooO0OO);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final void OooO0o0() {
        ((o000OO) this.f24728OooO.getValue()).OooO00o(new OooO00o());
    }

    public final void OooO0oO(int i, int i2, @Nullable Intent intent) {
        boolean z;
        ((FecebookOAuth) this.f24734OooO0o0.getValue()).f24713OooO0O0.onActivityResult(i, i2, intent);
        TwitterLoginButton twitterLoginButton = ((TwitterOAuth) this.f24733OooO0o.getValue()).f24738OooO00o;
        twitterLoginButton.getTwitterAuthClient().f43649OooO0OO.getClass();
        if (i == 140) {
            o0OOOOO0.OooOO0 twitterAuthClient = twitterLoginButton.getTwitterAuthClient();
            twitterAuthClient.getClass();
            com.twitter.sdk.android.core.o00Oo0.OooO0OO().OooO0O0("Twitter", p022Oooo00O.OooOO0.OooO00o("onActivityResult called with ", i, ZegoConstants.ZegoVideoDataAuxPublishingStream, i2));
            o0OOOOO0.OooO0O0 oooO0O0 = twitterAuthClient.f43647OooO00o;
            if (oooO0O0.f43646OooO00o.get() != null) {
                AtomicReference<o0OOOOO0.OooO00o> atomicReference = oooO0O0.f43646OooO00o;
                o0OOOOO0.OooO00o oooO00o = atomicReference.get();
                if (oooO00o != null) {
                    if (oooO00o.f43643OooO00o != i) {
                        z = false;
                    } else {
                        com.twitter.sdk.android.core.OooO0O0<o0Oo0oo> oooO0O1 = oooO00o.f43645OooO0OO;
                        if (oooO0O1 != null) {
                            if (i2 == -1) {
                                oooO0O1.OooO0Oo(new o000oOoO<>(new o0Oo0oo(intent.getLongExtra(AccessToken.USER_ID_KEY, 0L), new TwitterAuthToken(intent.getStringExtra("tk"), intent.getStringExtra("ts")), intent.getStringExtra("screen_name")), null));
                            } else if (intent == null || !intent.hasExtra("auth_error")) {
                                oooO0O1.OooO0OO(new TwitterAuthException("Authorize failed."));
                            } else {
                                oooO0O1.OooO0OO((TwitterAuthException) intent.getSerializableExtra("auth_error"));
                            }
                        }
                        z = true;
                    }
                    if (z) {
                        atomicReference.set(null);
                    }
                }
            } else {
                com.twitter.sdk.android.core.o00Oo0.OooO0OO().OooO0Oo("Twitter", "Authorize not in progress", null);
            }
        }
        InstagramOAuth instagramOAuth = (InstagramOAuth) this.f24736OooO0oo.getValue();
        instagramOAuth.getClass();
        if (i != 101 || intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("INSTAGRAG_LOGIN_URI");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (!StringsKt.OooO0o(stringExtra, "=") || !StringsKt.OooO0o(stringExtra, "code")) {
            Function0<Unit> function0 = instagramOAuth.f24721OooO0OO;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        String code = StringsKt.OooOoO(((String[]) new Regex("=").split(stringExtra, 0).toArray(new String[0]))[1], "#_", "");
        o000O00O o000o00o2 = p377o0OOoOo.o000O0O0.f44226OooO00o;
        o0000O0 callback = new o0000O0(instagramOAuth);
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(callback, "callback");
        o00000O0 o00000o1 = new o00000O0();
        o00000o1.f45564OooO00o = "https://api.instagram.com/oauth/access_token";
        o00000o1.OooO0OO("client_id", o00Oo0.OooO0o().OooOO0O());
        o000OOo o000oooOooO0o = o00Oo0.OooO0o();
        o000oooOooO0o.getClass();
        o00000o1.OooO0OO("client_secret", new String(AESKt.aesDecrypt$default(o000oooOooO0o.OooO0o0(String.valueOf(-2019988625), o0000.OooO0OO(oO00OOo0.single_instagram_client_secret)), oO000Oo.OooO00o(), o0o0000.f56518OooO00o, false, null, 12, null), Charsets.UTF_8));
        o00000o1.OooO0OO("grant_type", "authorization_code");
        o00000o1.OooO0OO(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, o0000.OooO0OO(oO00OOo0.single_instagram_callback_url));
        o00000o1.OooO0OO("code", code);
        o00000o1.OooO0O0().OooO00o(new o0000oo(callback));
    }
}
