package p486o0o00O00;

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
import p157o00OoOO0.o0OO00O;
import p408o0Oo0o0O.o00Oo0;
import p571o0oOoOO.o0O0o000;
import p572o0oOoOO0.oO0OOo0o;
import p579o0oOoo.oO000O0O;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00o00 extends oO0OOo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ WebActivity f48352OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0O0o000 f48353OooO0O0;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$goToRecharge$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebActivity f48354OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(WebActivity webActivity, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f48354OooO0Oo = webActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(this.f48354OooO0Oo, continuation);
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
            o0OO000.OooO00o("105027");
            WebActivity webActivity = this.f48354OooO0Oo;
            WebPageInfo webPageInfo = webActivity.f25591OooOo0O;
            if (webPageInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webPageInfo");
                webPageInfo = null;
            }
            if (webPageInfo.f32817OooO0Oo == WebFrom.FirstChargeRewardUrlWallet) {
                webActivity.finish();
                return Unit.INSTANCE;
            }
            int i = WalletActivity.f27054OooOoOO;
            WalletActivity.OooO00o.OooO00o(webActivity, false);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$ContactCustomerService$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebActivity f48355OooO0Oo;

        /* JADX INFO: renamed from: o0o00O00.o0O00o00$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0483OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ boolean f48356OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ WebActivity f48357OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0483OooO00o(WebActivity webActivity, boolean z) {
                super(0);
                this.f48356OooO0Oo = z;
                this.f48357OooO0o0 = webActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                boolean z = this.f48356OooO0Oo;
                WebActivity webActivity = this.f48357OooO0o0;
                if (z) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(o00Oo0.OooOO0o().OooO0o0("kaServeAddress", "")));
                    intent.setPackage("com.whatsapp");
                    webActivity.startActivity(intent);
                } else {
                    oO000O0O.OooO0O0(webActivity, "com.whatsapp");
                }
                return Unit.INSTANCE;
            }
        }

        public static final class OooO0O0 extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final OooO0O0 f48358OooO0Oo = new OooO0O0();

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
            this.f48355OooO0Oo = webActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f48355OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            WebActivity webActivity = this.f48355OooO0Oo;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            try {
                boolean zOooO00o = oO000O0O.OooO00o(webActivity, "com.whatsapp");
                o0OO00O o0oo00o2 = new o0OO00O(webActivity);
                o0oo00o2.OooOo00(o0000.OooO0OO(zOooO00o ? oO00OOo0.user_ka_vip_open_whatsapp : oO00OOo0.user_ka_vip_open_market));
                o0oo00o2.OooOOOo(zOooO00o ? o0000.OooO0OO(oO00OOo0.OK) : o0000.OooO0OO(oO00OOo0.user_ka_vip_open_market_download));
                o0oo00o2.OooOo0(new C0483OooO00o(webActivity, zOooO00o));
                o0oo00o2.OooOo0O(OooO0O0.f48358OooO0Oo);
                o0oo00o2.OooOO0o();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$CreateRoom$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebActivity f48359OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(WebActivity webActivity, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f48359OooO0Oo = webActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f48359OooO0Oo, continuation);
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
            WebActivity webActivity = this.f48359OooO0Oo;
            webActivity.f25586OooOOo0 = true;
            int i = CreateRoomActivity.f26502OooOoo0;
            CreateRoomActivity.OooO00o.OooO00o(webActivity);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$buySuccess$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebActivity f48360OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(WebActivity webActivity, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f48360OooO0Oo = webActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f48360OooO0Oo, continuation);
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
            int i = WebActivity.f25584OooOoO0;
            WebActivity webActivity = this.f48360OooO0Oo;
            webActivity.getClass();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(webActivity), null, null, new o0oO0O0o(webActivity, null), 3, null);
            com.squareup.okhttp.OooOo.OooO0OO(192, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$goBackLastPage$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebActivity f48361OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(WebActivity webActivity, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f48361OooO0Oo = webActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f48361OooO0Oo, continuation);
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
            this.f48361OooO0Oo.onBackPressed();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$hideBackBtn$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebActivity f48362OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f48363OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(WebActivity webActivity, boolean z, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f48362OooO0Oo = webActivity;
            this.f48363OooO0o0 = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0(this.f48362OooO0Oo, this.f48363OooO0o0, continuation);
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
            int i = WebActivity.f25584OooOoO0;
            this.f48362OooO0Oo.OooOoO0().setShowToolbar(!this.f48363OooO0o0);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$onBackPress$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebActivity f48364OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f48365OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(WebActivity webActivity, boolean z, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f48364OooO0Oo = webActivity;
            this.f48365OooO0o0 = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0O(this.f48364OooO0Oo, this.f48365OooO0o0, continuation);
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
            this.f48364OooO0Oo.f25589OooOo0 = this.f48365OooO0o0;
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$refreshUrl$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebActivity f48366OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(WebActivity webActivity, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f48366OooO0Oo = webActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO(this.f48366OooO0Oo, continuation);
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
            int i = WebActivity.f25584OooOoO0;
            WebActivity webActivity = this.f48366OooO0Oo;
            webActivity.getClass();
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(webActivity), null, null, new o0oO0O0o(webActivity, null), 3, null);
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
            return o0O00o00.this.new OooOOO0(continuation);
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
            o0O00o00.this.goToRecharge();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$shareThird$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0O0o000 f48368OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f48369OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f48370OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f48371OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f48372OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(o0O0o000 o0o0o000, String str, String str2, String str3, String str4, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f48368OooO0Oo = o0o0o000;
            this.f48370OooO0o0 = str;
            this.f48369OooO0o = str2;
            this.f48371OooO0oO = str3;
            this.f48372OooO0oo = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOOO(this.f48368OooO0Oo, this.f48370OooO0o0, this.f48369OooO0o, this.f48371OooO0oO, this.f48372OooO0oo, continuation);
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
            o0O0o000 o0o0o000 = this.f48368OooO0Oo;
            o0o0o000.getClass();
            String title = this.f48370OooO0o0;
            Intrinsics.checkNotNullParameter(title, "title");
            String message = this.f48369OooO0o;
            Intrinsics.checkNotNullParameter(message, "message");
            String url = this.f48371OooO0oO;
            Intrinsics.checkNotNullParameter(url, "url");
            String imageUrl = this.f48372OooO0oo;
            Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
            ShareContentModel shareContentModel = new ShareContentModel(ShareContentType.WebH5Content);
            ShareWebModel shareWebModel = new ShareWebModel();
            shareWebModel.setTitle(title);
            shareWebModel.setUrl(url);
            shareWebModel.setContent(message);
            shareWebModel.setImagesUrl(imageUrl);
            shareContentModel.setWeb(shareWebModel);
            o0o0o000.f56248OooO0O0.setValue(shareContentModel);
            Boolean bool = Boolean.FALSE;
            o0o0o000.f56250OooO0Oo.setValue(bool);
            o0o0o000.f56252OooO0o0.setValue(bool);
            o0o0o000.f56247OooO00o.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$showOpenInBrowser$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebActivity f48373OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f48374OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(WebActivity webActivity, String str, Continuation<? super OooOo> continuation) {
            super(2, continuation);
            this.f48373OooO0Oo = webActivity;
            this.f48374OooO0o0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo(this.f48373OooO0Oo, this.f48374OooO0o0, continuation);
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
            int i = WebActivity.f25584OooOoO0;
            this.f48373OooO0Oo.OooOoO0().setShowMenuOpenInBrowser(o0OoOo0.OooO0O0(this.f48374OooO0o0));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$showClose$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebActivity f48375OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f48376OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(WebActivity webActivity, String str, Continuation<? super OooOo00> continuation) {
            super(2, continuation);
            this.f48375OooO0Oo = webActivity;
            this.f48376OooO0o0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo00(this.f48375OooO0Oo, this.f48376OooO0o0, continuation);
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
            int i = WebActivity.f25584OooOoO0;
            this.f48375OooO0Oo.OooOoO0().setBackIconIsClose(o0OoOo0.OooO0O0(this.f48376OooO0o0));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.main.WebActivity$initWebJSBridge$1$showShare$1", f = "WebActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class Oooo000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ WebActivity f48377OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f48378OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(WebActivity webActivity, String str, Continuation<? super Oooo000> continuation) {
            super(2, continuation);
            this.f48377OooO0Oo = webActivity;
            this.f48378OooO0o0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new Oooo000(this.f48377OooO0Oo, this.f48378OooO0o0, continuation);
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
            int i = WebActivity.f25584OooOoO0;
            this.f48377OooO0Oo.OooOoO0().setShowMenuShare(o0OoOo0.OooO0O0(this.f48378OooO0o0));
            return Unit.INSTANCE;
        }
    }

    public o0O00o00(WebActivity webActivity, o0O0o000 o0o0o000) {
        this.f48352OooO00o = webActivity;
        this.f48353OooO0O0 = o0o0o000;
    }

    @Override // p572o0oOoOO0.oO0OOo0o
    @JavascriptInterface
    public void ContactCustomerService() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(this.f48352OooO00o, null), 3, null);
    }

    @Override // p572o0oOoOO0.oO0OOo0o
    @JavascriptInterface
    public void CreateRoom() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0O0(this.f48352OooO00o, null), 3, null);
    }

    @Override // p572o0oOoOO0.oO0OOo0o
    @JavascriptInterface
    public void buySuccess() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0OO(this.f48352OooO00o, null), 3, null);
    }

    @Override // p572o0oOoOO0.oO000O0
    @JavascriptInterface
    public void goBackLastPage() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0o(this.f48352OooO00o, null), 3, null);
    }

    @Override // p572o0oOoOO0.oO000O0
    @JavascriptInterface
    public void goToRecharge() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO(this.f48352OooO00o, null), 3, null);
    }

    @Override // p572o0oOoOO0.oO0OOo0o
    @JavascriptInterface
    public void hideBackBtn(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOO0(this.f48352OooO00o, z, null), 3, null);
    }

    @Override // p572o0oOoOO0.oO0OOo0o
    @JavascriptInterface
    public void onBackPress(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOO0O(this.f48352OooO00o, z, null), 3, null);
    }

    @Override // p572o0oOoOO0.oO000O0
    public final void onClosePage() {
        this.f48352OooO00o.finish();
    }

    @Override // p572o0oOoOO0.oO000O0
    @JavascriptInterface
    public void rechargePage() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOO0(null), 3, null);
    }

    @Override // p572o0oOoOO0.oO000O0
    @JavascriptInterface
    public void refreshUrl() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOO(this.f48352OooO00o, null), 3, null);
    }

    @JavascriptInterface
    public final void shareThird(@NotNull String title, @NotNull String content, @NotNull String url, @NotNull String imageUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(this.f48353OooO0O0, title, content, url, imageUrl, null), 3, null);
    }

    @Override // p572o0oOoOO0.oO0OOo0o
    @JavascriptInterface
    public void showClose(@NotNull String show) {
        Intrinsics.checkNotNullParameter(show, "show");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOo00(this.f48352OooO00o, show, null), 3, null);
    }

    @Override // p572o0oOoOO0.oO0OOo0o
    @JavascriptInterface
    public void showOpenInBrowser(@NotNull String show) {
        Intrinsics.checkNotNullParameter(show, "show");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOo(this.f48352OooO00o, show, null), 3, null);
    }

    @Override // p572o0oOoOO0.oO0OOo0o
    @JavascriptInterface
    public void showShare(@NotNull String show) {
        Intrinsics.checkNotNullParameter(show, "show");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(this.f48352OooO00o, show, null), 3, null);
    }
}
