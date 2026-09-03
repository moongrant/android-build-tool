package p623o0oo0oO0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.manager.PackManager;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.callback.YCSDKCallback;
import com.yallatech.support.platform.login.bean.AuthRequest;
import com.yallatech.support.platform.login.bean.AuthResponse;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.oo000o;
import p254o00ooO0O.o00O000;
import p255o00ooO0o.oo0oOO0;
import p497o0o00Oo.OooOOO0;
import p499o0o00OoO.oo0o0Oo;
import p515o0o0O00.o00O00;
import p516o0o0O000.Oooo000;
import p522o0o0O0o.o00O0;
import p606o0oo0O.OooOo;
import p640o0ooO0oO.o000O0O0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o0000O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f48629OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f48630OooO00o;

    public static final class OooO00o {

        /* JADX INFO: renamed from: o0oo0oO0.o0000O0$OooO00o$OooO00o, reason: collision with other inner class name */
        @DebugMetadata(c = "com.yalla.yalla.util.yallachat.YallaChatSdk$Companion$doOnInstalled$2", f = "YallaChatSdk.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0419OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: o0oo0oO0.o0000O0$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C0420OooO00o extends Lambda implements Function0<Unit> {

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public final /* synthetic */ oo0oOO0 f48631Oooo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0420OooO00o(oo0oOO0 oo0ooo0) {
                    super(0);
                    this.f48631Oooo0o = oo0ooo0;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Unit invoke() {
                    String strOooO0Oo;
                    OooOo.OooO0O0("103003");
                    WebPageInfo webPageInfo = new WebPageInfo(WebFrom.YallaChatDownUrl);
                    if (Oooo000.OooO00o(this.f48631Oooo0o.f34199OooO00o, "com.android.vending")) {
                        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
                        oo0o0Oo oo0o0ooOooO0o = OooOOO0.OooO0o();
                        Objects.requireNonNull(oo0o0ooOooO0o);
                        strOooO0Oo = oo0o0ooOooO0o.OooO0Oo(String.valueOf(o000O0O0.OooO00o(-27388178308624L).hashCode()), "");
                    } else {
                        OooOOO0 oooOOO1 = OooOOO0.f41180OooO00o;
                        oo0o0Oo oo0o0ooOooO0o2 = OooOOO0.OooO0o();
                        Objects.requireNonNull(oo0o0ooOooO0o2);
                        strOooO0Oo = oo0o0ooOooO0o2.OooO0Oo(String.valueOf(o000O0O0.OooO00o(-27559977000464L).hashCode()), "");
                    }
                    webPageInfo.OooO0Oo(strOooO0Oo);
                    webPageInfo.OooO00o("region", String.valueOf(oo000o.OooO0O0()));
                    WebActivity.f22108OoooooO.OooO00o(this.f48631Oooo0o.f34199OooO00o, webPageInfo);
                    return Unit.INSTANCE;
                }
            }

            public C0419OooO00o(Continuation<? super C0419OooO00o> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0419OooO00o(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return new C0419OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                OooOo.OooO0O0("303001");
                o00O000 o00o001 = o00O000.f34346OooO00o;
                Activity activityOooO0O0 = o00O000.OooO0O0();
                if (activityOooO0O0 != null) {
                    oo0oOO0 oo0ooo0 = new oo0oOO0(activityOooO0O0);
                    oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
                    oo0ooo0.OooOo0O(p254o00ooO0O.o000O0O0.OooO0OO(R.string.main_task_yalla_chat_content));
                    oo0ooo0.OooOOOo(R.string.Install);
                    oo0ooo0.OooOo0o(new C0420OooO00o(oo0ooo0));
                    oo0ooo0.OooOOO0();
                }
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0O0 extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ String f48632Oooo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(String str) {
                super(0);
                this.f48632Oooo0o = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f48632Oooo0o));
                intent.setPackage("com.yallatech.yallachat");
                o00O000 o00o001 = o00O000.f34346OooO00o;
                intent.putExtra("com.android.browser.application_id", o00O000.OooO00o().getPackageName());
                try {
                    Activity activityOooO0O0 = o00O000.OooO0O0();
                    if (activityOooO0O0 != null) {
                        activityOooO0O0.startActivity(intent);
                    }
                } catch (Exception unused) {
                }
                return Unit.INSTANCE;
            }
        }

        public final void OooO00o(@NotNull Function0<Unit> notInstall, @NotNull Function0<Unit> action) {
            Intrinsics.checkNotNullParameter(notInstall, "notInstall");
            Intrinsics.checkNotNullParameter(action, "action");
            if (PackManager.INSTANCE.isInstalledYallaChat()) {
                action.invoke();
            } else {
                notInstall.invoke();
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new C0419OooO00o(null), 2, null);
            }
        }

        public final void OooO0O0(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            OooO00o(o0000oo.f48642Oooo0o, new OooO0O0(url));
        }
    }

    public static final class OooO0O0 implements YCSDKCallback {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ Function1<AuthResponse, Unit> f48633OooO00o;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Function1<? super AuthResponse, Unit> function1) {
            this.f48633OooO00o = function1;
        }

        @Override // com.yallatech.support.platform.callback.YCSDKCallback
        public final void onResult(@NotNull BaseResp result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (result instanceof AuthResponse) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("YallaChatSDK toAuthisSuccess = ");
                sbOooO0o0.append(result.isSuccess());
                sbOooO0o0.append(", code = ");
                sbOooO0o0.append(result.getCode());
                sbOooO0o0.append(" , message = ");
                sbOooO0o0.append(result.getMsg());
                sbOooO0o0.append(", authCode = ");
                sbOooO0o0.append(((AuthResponse) result).getAuthCode());
                sbOooO0o0.append(' ');
                o00O00.OooO0O0(sbOooO0o0.toString());
                this.f48633OooO00o.invoke(result);
                if (result.isSuccess() || !o00O0.OooO0o0(result.getMsg())) {
                    return;
                }
                ToastUtil.f12567OooO00o.OooO0O0(result.getMsg());
            }
        }
    }

    public o0000O0(@NotNull Context fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
        this.f48630OooO00o = fragmentActivity;
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        if (!StringsKt.isBlank(OooOOO0.OooO0o().OooOOO0())) {
            YCSDKOpenKit.setApplicationId(OooOOO0.OooO0o().OooOOO0());
            YCSDKOpenKit.setApplicationKey(OooOOO0.OooO0o().OooOOO());
            YCSDKOpenKit.setDirectUrl("https://www.yalla.live/");
            YCSDKOpenKit.INSTANCE.sdkInitialize(fragmentActivity);
        }
    }

    public final void OooO00o(@NotNull Function1<? super AuthResponse, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        YCSDKOpenKit yCSDKOpenKit = YCSDKOpenKit.INSTANCE;
        Context context = this.f48630OooO00o;
        Object[] array = StringsKt__StringsKt.split$default("public_profile,user_gender,user_country,user_birthday,user_friends,user_phone", new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        YCSDKOpenKit.sendReq$default(yCSDKOpenKit, context, new AuthRequest("a671060faf538fcf28b5a2e12234fac8", (String[]) array), new OooO0O0(action), null, 8, null);
    }
}
