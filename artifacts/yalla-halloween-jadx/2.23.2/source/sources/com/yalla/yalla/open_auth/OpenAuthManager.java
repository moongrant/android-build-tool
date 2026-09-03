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
import com.twitter.sdk.android.core.Oooo0;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.identity.TwitterLoginButton;
import com.twitter.sdk.android.core.o0OOO0o;
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
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import net.sqlcipher.database.SQLiteDatabase;
import o0OOOOO.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p346o0OOO0oo.OooOO0O;
import p349o0OOOOoO.o00O0O;
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.o0OO00O;
import p414o0Oo0oO.oO000Oo0;
import p415o0Oo0oO0.o00Ooo;
import p423o0OoO0OO.o00O00OO;
import p427o0OoO0oO.o0o0Oo;
import p472o0OoooOO.o0O0oo00;
import p472o0OoooOO.o0OO000o;
import p472o0OoooOO.o0OO00OO;
import p472o0OoooOO.o0OO0O0;
import p472o0OoooOO.o0OO0o;
import p472o0OoooOO.o0OO0oO0;
import p472o0OoooOO.o0OOO00;
import p562o0oOo000.o000000;
import p590o0oOooo0.oO0oO000;
import p590o0oOooo0.oOO0Oo00;
import p614o0oo0o.o000oOoO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OpenAuthManager {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final Lazy f24265OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f24266OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public Function3<? super String, ? super AuthType, ? super String, Unit> f24267OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f24268OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f24269OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f24270OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f24271OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final Lazy f24272OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f24273OooO0oo;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v1 com.yalla.yalla.open_auth.OpenAuthManager$AuthType[], still in use, count: 1, list:
      (r10v1 com.yalla.yalla.open_auth.OpenAuthManager$AuthType[]) from 0x0046: INVOKE (r10v1 com.yalla.yalla.open_auth.OpenAuthManager$AuthType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:71)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/open_auth/OpenAuthManager$AuthType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "I", "OooO00o", "()I", "Facebook", "Twitter", "Instagram", "WeChat", "YallaChat", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
    public static final class AuthType {
        Facebook(4),
        Twitter(9),
        Instagram(7),
        WeChat(5),
        YallaChat(12);

        private static final /* synthetic */ EnumEntries $ENTRIES;
        private final int value;

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(authTypeArr);
        }

        public AuthType(int i) {
            super(str, i);
            this.value = i;
        }

        public static AuthType valueOf(String str) {
            return (AuthType) Enum.valueOf(AuthType.class, str);
        }

        public static AuthType[] values() {
            return (AuthType[]) $VALUES.clone();
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
                Function0<Unit> function0 = openAuthManager.f24268OooO0OO;
                if (function0 != null) {
                    function0.invoke();
                }
            } else if (o00O00OO.OooO0o(it.getAuthCode())) {
                Function3<? super String, ? super AuthType, ? super String, Unit> function3 = openAuthManager.f24267OooO0O0;
                if (function3 != null) {
                    function3.invoke(it.getAuthCode(), AuthType.YallaChat, null);
                }
            } else {
                Function0<Unit> function1 = openAuthManager.f24269OooO0Oo;
                if (function1 != null) {
                    function1.invoke();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public OpenAuthManager(@NotNull FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        this.f24266OooO00o = fragmentActivity;
        this.f24271OooO0o0 = LazyKt.lazy(new o0OO000o(this));
        this.f24270OooO0o = LazyKt.lazy(new o0OO0O0(this));
        this.f24272OooO0oO = LazyKt.lazy(new o0OO0o(this));
        this.f24273OooO0oo = LazyKt.lazy(new o0OO00OO(this));
        this.f24265OooO = LazyKt.lazy(new o0OO0oO0(this));
    }

    public final void OooO00o() {
        FecebookOAuth fecebookOAuth = (FecebookOAuth) this.f24271OooO0o0.getValue();
        fecebookOAuth.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add("public_profile");
        arrayList.add("email");
        LoginManager.INSTANCE.getInstance().logInWithReadPermissions(fecebookOAuth.f24249OooO00o, arrayList);
    }

    public final void OooO0O0() {
        InstagramOAuth instagramOAuth = (InstagramOAuth) this.f24273OooO0oo.getValue();
        instagramOAuth.getClass();
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.LoginInstagram);
        webPageInfo.OooO0o0(instagramOAuth.f24259OooO0Oo);
        webPageInfo.OooO0Oo(o0000.OooO0OO(o000000.single_third_instagram));
        webPageInfo.f32280OooO = true;
        int i = WebActivity.f25130OooOoO0;
        FragmentActivity activity = instagramOAuth.f24256OooO00o;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent(activity, (Class<?>) WebActivity.class);
        intent.putExtra("pageinfo", webPageInfo);
        activity.startActivityForResult(intent, 101);
    }

    public final void OooO0OO() {
        ((TwitterOAuth) this.f24270OooO0o.getValue()).f24275OooO00o.performClick();
    }

    public final void OooO0Oo() {
        boolean zOooO00o;
        FirebaseAnalytics.getInstance(this.f24266OooO00o).f19317OooO00o.zzy("WeChat_Auth", null);
        o0OOO00 o0ooo00 = (o0OOO00) this.f24272OooO0oO.getValue();
        boolean zOooO00o2 = true;
        o0ooo00.f47913OooO0Oo = true;
        String strOooOO0o = o00Ooo.OooO0o().OooOO0o();
        o0OOOO.OooO0O0 oooO0O0 = o0ooo00.f47910OooO00o;
        boolean z = oooO0O0.f42796OooO0OO;
        Context context = oooO0O0.f42794OooO00o;
        if (z) {
            try {
                zOooO00o = o0OOOO.OooO00o.OooO00o(context.getPackageManager().getPackageInfo("com.tencent.mm", 64).signatures, z);
            } catch (PackageManager.NameNotFoundException unused) {
                zOooO00o = false;
            }
        } else {
            int i = o00O0O.f42850OooO00o;
            zOooO00o = true;
        }
        if (zOooO00o) {
            int i2 = o00O0O.f42850OooO00o;
            oooO0O0.f42795OooO0O0 = strOooOO0o;
            context.getPackageName();
            String str = "weixin://registerapp?appid=" + oooO0O0.f42795OooO0O0;
            if (!p349o0OOOOoO.o00Ooo.OooO00o("com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_REGISTER")) {
                String str2 = p349o0OOOOoO.o00Ooo.OooO00o("com.tencent.mm") ? null : "com.tencent.mm.permission.MM_MESSAGE";
                Intent intent = new Intent("com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_REGISTER");
                String packageName = context.getPackageName();
                intent.putExtra("_mmessage_sdkVersion", 570490883);
                intent.putExtra("_mmessage_appPackage", packageName);
                intent.putExtra("_mmessage_content", str);
                intent.putExtra("_mmessage_checksum", OooOO0O.OooO00o(570490883, str, packageName));
                context.sendBroadcast(intent, str2);
                intent.toString();
            }
        } else {
            int i3 = o00O0O.f42850OooO00o;
        }
        o0OOOO0.OooO0OO oooO0OO = new o0OOOO0.OooO0OO();
        oooO0OO.f42797OooO0OO = "snsapi_userinfo";
        oooO0OO.f42798OooO0Oo = "carjob_wx_login";
        boolean z2 = oooO0O0.f42796OooO0OO;
        if (z2) {
            try {
                zOooO00o2 = o0OOOO.OooO00o.OooO00o(context.getPackageManager().getPackageInfo("com.tencent.mm", 64).signatures, z2);
            } catch (PackageManager.NameNotFoundException unused2) {
                zOooO00o2 = false;
            }
        }
        if (zOooO00o2 && oooO0OO.OooO0Oo()) {
            Bundle bundle = new Bundle();
            oooO0OO.OooO0OO(bundle);
            String str3 = "weixin://sendreq?appid=" + oooO0O0.f42795OooO0O0;
            if (context != null && !p349o0OOOOoO.o00Ooo.OooO00o("com.tencent.mm")) {
                String strOooO00o = p349o0OOOOoO.o00Ooo.OooO00o("com.tencent.mm.plugin.base.stub.WXEntryActivity") ? OooOOOO.OooO00o("com.tencent.mm", ".wxapi.WXEntryActivity") : "com.tencent.mm.plugin.base.stub.WXEntryActivity";
                int i4 = o00O0O.f42850OooO00o;
                Intent intent2 = new Intent();
                intent2.setClassName("com.tencent.mm", strOooO00o);
                intent2.putExtras(bundle);
                String packageName2 = context.getPackageName();
                intent2.putExtra("_mmessage_sdkVersion", 570490883);
                intent2.putExtra("_mmessage_appPackage", packageName2);
                intent2.putExtra("_mmessage_content", str3);
                intent2.putExtra("_mmessage_checksum", OooOO0O.OooO00o(570490883, str3, packageName2));
                intent2.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY).addFlags(134217728);
                try {
                    context.startActivity(intent2);
                    intent2.toString();
                    return;
                } catch (Exception e) {
                    e.getMessage();
                }
            }
            int i5 = o00O0O.f42850OooO00o;
        }
    }

    public final boolean OooO0o() {
        o0OOOO.OooO0O0 oooO0O0 = ((o0OOO00) this.f24272OooO0oO.getValue()).f47910OooO00o;
        try {
            PackageInfo packageInfo = oooO0O0.f42794OooO00o.getPackageManager().getPackageInfo("com.tencent.mm", 64);
            if (packageInfo != null) {
                return o0OOOO.OooO00o.OooO00o(packageInfo.signatures, oooO0O0.f42796OooO0OO);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final void OooO0o0() {
        ((o000oOoO) this.f24265OooO.getValue()).OooO00o(new OooO00o());
    }

    public final void OooO0oO(int i, int i2, @Nullable Intent intent) {
        boolean z;
        ((FecebookOAuth) this.f24271OooO0o0.getValue()).f24250OooO0O0.onActivityResult(i, i2, intent);
        TwitterLoginButton twitterLoginButton = ((TwitterOAuth) this.f24270OooO0o.getValue()).f24275OooO00o;
        twitterLoginButton.getTwitterAuthClient().f42810OooO0OO.getClass();
        if (i == 140) {
            OooOO0 twitterAuthClient = twitterLoginButton.getTwitterAuthClient();
            twitterAuthClient.getClass();
            com.twitter.sdk.android.core.o00O0O.OooO0OO().OooO0O0("Twitter", androidx.compose.compiler.plugins.kotlin.lower.OooO0O0.OooO0O0("onActivityResult called with ", i, ZegoConstants.ZegoVideoDataAuxPublishingStream, i2));
            o0OOOOO.OooO0O0 oooO0O0 = twitterAuthClient.f42808OooO00o;
            if (oooO0O0.f42807OooO00o.get() != null) {
                AtomicReference<o0OOOOO.OooO00o> atomicReference = oooO0O0.f42807OooO00o;
                o0OOOOO.OooO00o oooO00o = atomicReference.get();
                if (oooO00o != null) {
                    if (oooO00o.f42804OooO00o != i) {
                        z = false;
                    } else {
                        com.twitter.sdk.android.core.OooO0O0<o0OOO0o> oooO0O1 = oooO00o.f42806OooO0OO;
                        if (oooO0O1 != null) {
                            if (i2 == -1) {
                                oooO0O1.OooO0Oo(new Oooo0<>(new o0OOO0o(intent.getLongExtra(AccessToken.USER_ID_KEY, 0L), new TwitterAuthToken(intent.getStringExtra("tk"), intent.getStringExtra("ts")), intent.getStringExtra("screen_name")), null));
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
                com.twitter.sdk.android.core.o00O0O.OooO0OO().OooO0Oo("Twitter", "Authorize not in progress", null);
            }
        }
        InstagramOAuth instagramOAuth = (InstagramOAuth) this.f24273OooO0oo.getValue();
        instagramOAuth.getClass();
        if (i != 101 || intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("INSTAGRAG_LOGIN_URI");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (!StringsKt__StringsKt.contains$default(stringExtra, "=", false, 2, (Object) null) || !StringsKt__StringsKt.contains$default(stringExtra, "code", false, 2, (Object) null)) {
            Function0<Unit> function0 = instagramOAuth.f24258OooO0OO;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        String code = StringsKt__StringsJVMKt.replace$default(((String[]) new Regex("=").split(stringExtra, 0).toArray(new String[0]))[1], "#_", "", false, 4, (Object) null);
        o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
        o0O0oo00 callback = new o0O0oo00(instagramOAuth);
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(callback, "callback");
        o0o0Oo o0o0oo = new o0o0Oo();
        o0o0oo.f46764OooO00o = "https://api.instagram.com/oauth/access_token";
        o0o0oo.OooO0OO("client_id", o00Ooo.OooO0o().OooOO0O());
        oO000Oo0 oo000oo0OooO0o = o00Ooo.OooO0o();
        oo000oo0OooO0o.getClass();
        o0o0oo.OooO0OO("client_secret", new String(AESKt.aesDecrypt$default(oo000oo0OooO0o.OooO0o0(String.valueOf(-2019988625), o0000.OooO0OO(o000000.single_instagram_client_secret)), oOO0Oo00.OooO00o(), oO0oO000.f57154OooO00o, false, null, 12, null), Charsets.UTF_8));
        o0o0oo.OooO0OO("grant_type", "authorization_code");
        o0o0oo.OooO0OO(ServerProtocol.DIALOG_PARAM_REDIRECT_URI, o0000.OooO0OO(o000000.single_instagram_callback_url));
        o0o0oo.OooO0OO("code", code);
        o0o0oo.OooO0O0().OooO00o(new p384o0OOoo0O.OooOOOO(callback));
    }
}
