package p614o0oo0o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.callback.YCSDKCallback;
import com.yallatech.support.platform.login.bean.AuthRequest;
import com.yallatech.support.platform.login.bean.AuthResponse;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import p423o0OoO0OO.o00O00OO;
import p429o0OoOO.o00Ooo;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nYallaChatSdk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YallaChatSdk.kt\ncom/yalla/yalla/util/yallachat/YallaChatSdk\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,243:1\n37#2,2:244\n*S KotlinDebug\n*F\n+ 1 YallaChatSdk.kt\ncom/yalla/yalla/util/yallachat/YallaChatSdk\n*L\n57#1:244,2\n*E\n"})
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f57513OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f57514OooO00o;

    public static final class OooO00o {

        /* JADX INFO: renamed from: o0oo0o.o000oOoO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0492OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ String f57515OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0492OooO00o(String str) {
                super(0);
                this.f57515OooO0Oo = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f57515OooO0Oo));
                intent.setPackage("com.yallatech.yallachat");
                intent.putExtra("com.android.browser.application_id", o000O00O.OooO00o().getPackageName());
                try {
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null) {
                        activityOooO0O0.startActivity(intent);
                    }
                } catch (Exception unused) {
                }
                return Unit.INSTANCE;
            }
        }

        public static void OooO00o(OooO00o oooO00o, Function0 action) {
            oooO00o.getClass();
            Oooo000 notInstall = Oooo000.f57512OooO0Oo;
            Intrinsics.checkNotNullParameter(notInstall, "notInstall");
            Intrinsics.checkNotNullParameter(action, "action");
            Context context = o000O00O.f13421OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null ? o00Ooo.OooO0OO(activityOooO0O0, "com.yallatech.yallachat") : false) {
                action.invoke();
            } else {
                notInstall.invoke();
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new Oooo0(null), 2, null);
            }
        }

        public final void OooO0O0(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            OooO00o(this, new C0492OooO00o(url));
        }
    }

    public static final class OooO0O0 implements YCSDKCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Function1<AuthResponse, Unit> f57516OooO00o;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Function1<? super AuthResponse, Unit> function1) {
            this.f57516OooO00o = function1;
        }

        @Override // com.yallatech.support.platform.callback.YCSDKCallback
        public final void onResult(@NotNull BaseResp result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (result instanceof AuthResponse) {
                o0000O00.OooO0O0("YallaChatSDK toAuthisSuccess = " + result.isSuccess() + ", code = " + result.getCode() + " , message = " + result.getMsg() + ", authCode = " + ((AuthResponse) result).getAuthCode() + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                this.f57516OooO00o.invoke(result);
                if (result.isSuccess() || !o00O00OO.OooO0o(result.getMsg())) {
                    return;
                }
                String msg = result.getMsg();
                if (msg == null || StringsKt.isBlank(msg)) {
                    return;
                }
                o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(msg, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
        }
    }

    public o000oOoO(@NotNull Activity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        this.f57514OooO00o = fragmentActivity;
        if (!StringsKt.isBlank(p415o0Oo0oO0.o00Ooo.OooO0o().OooOOO0())) {
            YCSDKOpenKit.setApplicationId(p415o0Oo0oO0.o00Ooo.OooO0o().OooOOO0());
            YCSDKOpenKit.setApplicationKey(p415o0Oo0oO0.o00Ooo.OooO0o().OooOOO());
            YCSDKOpenKit.setDirectUrl("https://www.yalla.live/");
            YCSDKOpenKit.INSTANCE.sdkInitialize(fragmentActivity);
        }
    }

    public final void OooO00o(@NotNull Function1<? super AuthResponse, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        YCSDKOpenKit.sendReq$default(YCSDKOpenKit.INSTANCE, this.f57514OooO00o, new AuthRequest("a671060faf538fcf28b5a2e12234fac8", (String[]) StringsKt__StringsKt.split$default((CharSequence) "public_profile,user_gender,user_country,user_birthday,user_friends,user_phone", new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0])), new OooO0O0(action), null, 8, null);
    }
}
