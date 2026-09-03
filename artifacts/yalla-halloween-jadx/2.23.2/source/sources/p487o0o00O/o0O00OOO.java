package p487o0o00O;

import android.content.Intent;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import androidx.lifecycle.LifecycleOwnerKt;
import com.code.android.util.o0000;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.share.ShareContentModel;
import com.yalla.yalla.model.share.ShareContentType;
import com.yalla.yalla.model.share.ShareWebModel;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p205o00o0o0o.o000O;
import p415o0Oo0oO0.o00Ooo;
import p562o0oOo000.o000000;
import p576o0oOoOOo.oOO00;
import p577o0oOoOo.o0OO000;
import p590o0oOooo0.oOO0O000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00OOO extends oOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ WebActivity f48852OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0OO000 f48853OooO0O0;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$goToRecharge$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebActivity f48854OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(WebActivity webActivity, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f48854OooO0Oo = webActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(this.f48854OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o0oo0000.OooO00o.OooO0O0("105027");
            WebActivity webActivity = this.f48854OooO0Oo;
            WebPageInfo webPageInfo = webActivity.f25137OooOo0O;
            if (webPageInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo = null;
            }
            if (webPageInfo.f32281OooO0Oo == WebFrom.FirstChargeRewardUrlWallet) {
                webActivity.finish();
                return Unit.INSTANCE;
            }
            int i = WalletActivity.f26588OooOoOO;
            WalletActivity.OooO00o.OooO00o(webActivity, false);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$ContactCustomerService$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebActivity f48855OooO0Oo;

        /* JADX INFO: renamed from: o0o00O.o0O00OOO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0462OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ boolean f48856OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ WebActivity f48857OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0462OooO00o(WebActivity webActivity, boolean z) {
                super(0);
                this.f48856OooO0Oo = z;
                this.f48857OooO0o0 = webActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                boolean z = this.f48856OooO0Oo;
                WebActivity webActivity = this.f48857OooO0o0;
                if (z) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(o00Ooo.OooOO0o().OooO0o0("kaServeAddress", "")));
                    intent.setPackage("com.whatsapp");
                    webActivity.startActivity(intent);
                } else {
                    oOO0O000.OooO0OO(webActivity, "com.whatsapp");
                }
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0O0 extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final OooO0O0 f48858OooO0Oo = new OooO0O0();

            public OooO0O0() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final /* bridge */ /* synthetic */ Unit invoke() {
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(WebActivity webActivity, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f48855OooO0Oo = webActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f48855OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            WebActivity webActivity = this.f48855OooO0Oo;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            try {
                boolean zOooO0O0 = oOO0O000.OooO0O0(webActivity, "com.whatsapp");
                o000O o000o = new o000O(webActivity);
                o000o.OooOo00(o0000.OooO0OO(zOooO0O0 ? o000000.user_ka_vip_open_whatsapp : o000000.user_ka_vip_open_market));
                o000o.OooOOOo(zOooO0O0 ? o0000.OooO0OO(o000000.OK) : o0000.OooO0OO(o000000.user_ka_vip_open_market_download));
                o000o.OooOo0(new C0462OooO00o(webActivity, zOooO0O0));
                o000o.OooOo0O(OooO0O0.f48858OooO0Oo);
                o000o.OooOO0o();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$CreateRoom$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebActivity f48859OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(WebActivity webActivity, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f48859OooO0Oo = webActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f48859OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            WebActivity webActivity = this.f48859OooO0Oo;
            webActivity.f25132OooOOo0 = true;
            int i = CreateRoomActivity.f26050OooOoo0;
            CreateRoomActivity.OooO00o.OooO00o(webActivity);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$buySuccess$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebActivity f48860OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(WebActivity webActivity, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f48860OooO0Oo = webActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f48860OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            int i = WebActivity.f25130OooOoO0;
            WebActivity webActivity = this.f48860OooO0Oo;
            webActivity.getClass();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(webActivity), null, null, new o0O00oO0(webActivity, null), 3, null);
            p545o0oO0O00.OooOo00.OooO0O0(192, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$goBackLastPage$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebActivity f48861OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(WebActivity webActivity, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f48861OooO0Oo = webActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f48861OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f48861OooO0Oo.onBackPressed();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$hideBackBtn$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebActivity f48862OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f48863OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(WebActivity webActivity, boolean z, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f48862OooO0Oo = webActivity;
            this.f48863OooO0o0 = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0(this.f48862OooO0Oo, this.f48863OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            int i = WebActivity.f25130OooOoO0;
            this.f48862OooO0Oo.OooOoO0().setShowToolbar(!this.f48863OooO0o0);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$onBackPress$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebActivity f48864OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f48865OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(WebActivity webActivity, boolean z, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f48864OooO0Oo = webActivity;
            this.f48865OooO0o0 = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0O(this.f48864OooO0Oo, this.f48865OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f48864OooO0Oo.f25135OooOo0 = this.f48865OooO0o0;
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$refreshUrl$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebActivity f48866OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(WebActivity webActivity, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f48866OooO0Oo = webActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO(this.f48866OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            int i = WebActivity.f25130OooOoO0;
            WebActivity webActivity = this.f48866OooO0Oo;
            webActivity.getClass();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(webActivity), null, null, new o0O00oO0(webActivity, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$rechargePage$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooOOO0(Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return o0O00OOO.this.new OooOOO0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o0O00OOO.this.goToRecharge();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$shareThird$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO000 f48868OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f48869OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f48870OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f48871OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f48872OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(o0OO000 o0oo000, String str, String str2, String str3, String str4, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f48868OooO0Oo = o0oo000;
            this.f48870OooO0o0 = str;
            this.f48869OooO0o = str2;
            this.f48871OooO0oO = str3;
            this.f48872OooO0oo = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOOO(this.f48868OooO0Oo, this.f48870OooO0o0, this.f48869OooO0o, this.f48871OooO0oO, this.f48872OooO0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o0OO000 o0oo000 = this.f48868OooO0Oo;
            o0oo000.getClass();
            String title = this.f48870OooO0o0;
            Intrinsics.checkNotNullParameter(title, "title");
            String message = this.f48869OooO0o;
            Intrinsics.checkNotNullParameter(message, "message");
            String url = this.f48871OooO0oO;
            Intrinsics.checkNotNullParameter(url, "url");
            String imageUrl = this.f48872OooO0oo;
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            ShareContentModel shareContentModel = new ShareContentModel(ShareContentType.WebH5Content);
            ShareWebModel shareWebModel = new ShareWebModel();
            shareWebModel.setTitle(title);
            shareWebModel.setUrl(url);
            shareWebModel.setContent(message);
            shareWebModel.setImagesUrl(imageUrl);
            shareContentModel.setWeb(shareWebModel);
            o0oo000.f56515OooO0O0.setValue(shareContentModel);
            Boolean bool = Boolean.FALSE;
            o0oo000.f56517OooO0Oo.setValue(bool);
            o0oo000.f56519OooO0o0.setValue(bool);
            o0oo000.f56514OooO00o.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$showOpenInBrowser$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebActivity f48873OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f48874OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(WebActivity webActivity, String str, Continuation<? super OooOo> continuation) {
            super(2, continuation);
            this.f48873OooO0Oo = webActivity;
            this.f48874OooO0o0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo(this.f48873OooO0Oo, this.f48874OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            int i = WebActivity.f25130OooOoO0;
            this.f48873OooO0Oo.OooOoO0().setShowMenuOpenInBrowser(o0OoOo0.OooO0O0(this.f48874OooO0o0));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$showClose$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebActivity f48875OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f48876OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(WebActivity webActivity, String str, Continuation<? super OooOo00> continuation) {
            super(2, continuation);
            this.f48875OooO0Oo = webActivity;
            this.f48876OooO0o0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo00(this.f48875OooO0Oo, this.f48876OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOo00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            int i = WebActivity.f25130OooOoO0;
            this.f48875OooO0Oo.OooOoO0().setBackIconIsClose(o0OoOo0.OooO0O0(this.f48876OooO0o0));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$showShare$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class Oooo000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebActivity f48877OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f48878OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(WebActivity webActivity, String str, Continuation<? super Oooo000> continuation) {
            super(2, continuation);
            this.f48877OooO0Oo = webActivity;
            this.f48878OooO0o0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new Oooo000(this.f48877OooO0Oo, this.f48878OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((Oooo000) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            int i = WebActivity.f25130OooOoO0;
            this.f48877OooO0Oo.OooOoO0().setShowMenuShare(o0OoOo0.OooO0O0(this.f48878OooO0o0));
            return Unit.INSTANCE;
        }
    }

    public o0O00OOO(WebActivity webActivity, o0OO000 o0oo000) {
        this.f48852OooO00o = webActivity;
        this.f48853OooO0O0 = o0oo000;
    }

    @Override // p576o0oOoOOo.oOO00
    @JavascriptInterface
    public void ContactCustomerService() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(this.f48852OooO00o, null), 3, null);
    }

    @Override // p576o0oOoOOo.oOO00
    @JavascriptInterface
    public void CreateRoom() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0O0(this.f48852OooO00o, null), 3, null);
    }

    @Override // p576o0oOoOOo.oOO00
    @JavascriptInterface
    public void buySuccess() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0OO(this.f48852OooO00o, null), 3, null);
    }

    @Override // p576o0oOoOOo.oO0o0000
    @JavascriptInterface
    public void goBackLastPage() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0o(this.f48852OooO00o, null), 3, null);
    }

    @Override // p576o0oOoOOo.oO0o0000
    @JavascriptInterface
    public void goToRecharge() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO(this.f48852OooO00o, null), 3, null);
    }

    @Override // p576o0oOoOOo.oOO00
    @JavascriptInterface
    public void hideBackBtn(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOO0(this.f48852OooO00o, z, null), 3, null);
    }

    @Override // p576o0oOoOOo.oOO00
    @JavascriptInterface
    public void onBackPress(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOO0O(this.f48852OooO00o, z, null), 3, null);
    }

    @Override // p576o0oOoOOo.oO0o0000
    public final void onClosePage() {
        this.f48852OooO00o.finish();
    }

    @Override // p576o0oOoOOo.oO0o0000
    @JavascriptInterface
    public void rechargePage() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOO0(null), 3, null);
    }

    @Override // p576o0oOoOOo.oO0o0000
    @JavascriptInterface
    public void refreshUrl() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOO(this.f48852OooO00o, null), 3, null);
    }

    @JavascriptInterface
    public final void shareThird(@NotNull String title, @NotNull String content, @NotNull String url, @NotNull String imageUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(this.f48853OooO0O0, title, content, url, imageUrl, null), 3, null);
    }

    @Override // p576o0oOoOOo.oOO00
    @JavascriptInterface
    public void showClose(@NotNull String show) {
        Intrinsics.checkNotNullParameter(show, "show");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOo00(this.f48852OooO00o, show, null), 3, null);
    }

    @Override // p576o0oOoOOo.oOO00
    @JavascriptInterface
    public void showOpenInBrowser(@NotNull String show) {
        Intrinsics.checkNotNullParameter(show, "show");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOo(this.f48852OooO00o, show, null), 3, null);
    }

    @Override // p576o0oOoOOo.oOO00
    @JavascriptInterface
    public void showShare(@NotNull String show) {
        Intrinsics.checkNotNullParameter(show, "show");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(this.f48852OooO00o, show, null), 3, null);
    }
}
