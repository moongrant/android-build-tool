package p490o0o000oo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import com.code.android.util.ToastUtil;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.yalla.support.common.util.NetworkUtil;
import com.yalla.yalla.common.manager.PackManager;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.common.manager.error.CommonError;
import com.yalla.yalla.common.manager.error.CommonErrorHandler;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.JSInfoModel;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.activity.event.EventDisplayActivity;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.activity.main.TaskActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import com.yalla.yalla.ui.activity.room.RoomThemeStoreActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.login.bean.AuthRequest;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmOverloads;
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
import net.sqlcipher.database.SQLiteDatabase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p154o00Oo0oO.o00000OO;
import p154o00Oo0oO.o00oO0o;
import p255o00ooO0O.o00O000;
import p256o00ooO0o.oo0oOO0;
import p393o0OOooOo.o0O00000;
import p489o0o000oO.o0OOO0o;
import p489o0o000oO.o0ooOOo;
import p517o0o0O00.o00O00;
import p524o0o0O0o.o00O0;
import p532o0o0OOO.o00OO0O0;
import p620o0oo0o0.o0O0O00;
import p620o0oo0o0.oo0o0Oo;
import p625o0oo0oO0.o0000O0;
import p625o0oo0oO0.o0000oo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public abstract class o0Oo0oo {

    @DebugMetadata(c = "com.yalla.yalla.common.bridge.webjs.BaseJSBridge$goToGooglePlay$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO(Continuation<? super OooO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00O000 o00o001 = o00O000.f34368OooO00o;
            Activity activityOooO0O0 = o00O000.OooO0O0();
            if (activityOooO0O0 != null) {
                PackManager.INSTANCE.goToAppStore(activityOooO0O0);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.bridge.webjs.BaseJSBridge$confirmRecharge$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ApiError error = new ApiError(2003, null, 2, null);
            Intrinsics.checkNotNullParameter(error, "error");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0o0000.OooOOOO(error, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.bridge.webjs.BaseJSBridge$createRoomPage$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO0O0(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00O000 o00o001 = o00O000.f34368OooO00o;
            Activity activityOooO0O0 = o00O000.OooO0O0();
            if (activityOooO0O0 != null) {
                CreateRoomActivity.f22793o00O0O.OooO00o(activityOooO0O0);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.bridge.webjs.BaseJSBridge$downloadPage$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f40995Oooo;

        public static final class OooO00o extends Lambda implements Function1<Boolean, Unit> {

            /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
            public final /* synthetic */ String f40996Oooo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(String str) {
                super(1);
                this.f40996Oooo = str;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(Boolean bool) {
                if (bool.booleanValue()) {
                    String str = this.f40996Oooo;
                    if (!(str == null || StringsKt.isBlank(str))) {
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new oo0o0Oo(this.f40996Oooo, null), 2, null);
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f40995Oooo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f40995Oooo, continuation);
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
            o00O000 o00o001 = o00O000.f34368OooO00o;
            Activity activityOooO0O0 = o00O000.OooO0O0();
            if (activityOooO0O0 != null) {
                o0O0O00.OooO0OO(activityOooO0O0, oo0o0Oo.f48625OooO0OO, null, new OooO00o(this.f40995Oooo));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.bridge.webjs.BaseJSBridge$goToBuyRoomTheme$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO0o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00O000 o00o001 = o00O000.f34368OooO00o;
            Activity activityOooO0O0 = o00O000.OooO0O0();
            if (activityOooO0O0 != null) {
                RoomThemeStoreActivity.f23019Oooooo0.OooO00o(activityOooO0O0, false);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.bridge.webjs.BaseJSBridge$goToRecharge$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooOO0(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00O000 o00o001 = o00O000.f34368OooO00o;
            Activity activityOooO0O0 = o00O000.OooO0O0();
            if (activityOooO0O0 != null) {
                WalletActivity.f23287ooOO.OooO00o(activityOooO0O0, false);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.bridge.webjs.BaseJSBridge$profilePage$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f40997Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(String str, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f40997Oooo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0O(this.f40997Oooo, continuation);
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
            o00O000 o00o001 = o00O000.f34368OooO00o;
            Activity activityOooO0O0 = o00O000.OooO0O0();
            if (activityOooO0O0 != null) {
                UserInfoActivity.OooO00o.OooO0Oo(UserInfoActivity.f23471o0OOO0o, activityOooO0O0, this.f40997Oooo, false, 12);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.bridge.webjs.BaseJSBridge$showMsg$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f40998Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(String str, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f40998Oooo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO(this.f40998Oooo, continuation);
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
            o00O000 o00o001 = o00O000.f34368OooO00o;
            Activity activityOooO0O0 = o00O000.OooO0O0();
            if (activityOooO0O0 != null) {
                String str = this.f40998Oooo;
                oo0oOO0 oo0ooo0 = new oo0oOO0(activityOooO0O0);
                oo0ooo0.OooOo0O(str);
                oo0ooo0.OooOOO0();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.bridge.webjs.BaseJSBridge$rechargePage$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooOOO0(Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooOOO0(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00O000 o00o001 = o00O000.f34368OooO00o;
            Activity activityOooO0O0 = o00O000.OooO0O0();
            if (activityOooO0O0 != null) {
                WalletActivity.f23287ooOO.OooO00o(activityOooO0O0, false);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.bridge.webjs.BaseJSBridge$showToastMsg$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f40999Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(String str, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f40999Oooo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOOO(this.f40999Oooo, continuation);
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
            ToastUtil.f12582OooO00o.OooO0O0(this.f40999Oooo);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.bridge.webjs.BaseJSBridge$toAppMarketDownLoad$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f41000Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(String str, Continuation<? super OooOo> continuation) {
            super(2, continuation);
            this.f41000Oooo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo(this.f41000Oooo, continuation);
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
            o00O000 o00o001 = o00O000.f34368OooO00o;
            Activity context = o00O000.OooO0O0();
            if (context != null) {
                String packageName = this.f41000Oooo;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(packageName, "packageName");
                if (p518o0o0O000.Oooo000.OooO00o(context, "com.android.vending")) {
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + packageName));
                        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                        intent.setPackage("com.android.vending");
                        context.startActivity(intent);
                    } catch (Exception e) {
                        e.printStackTrace();
                        p518o0o0O000.Oooo000.OooO0OO(context, packageName);
                    }
                } else {
                    p518o0o0O000.Oooo000.OooO0OO(context, packageName);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.bridge.webjs.BaseJSBridge$taskPage$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooOo00(Continuation<? super OooOo00> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo00(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooOo00(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00O000 o00o001 = o00O000.f34368OooO00o;
            Activity activityOooO0O0 = o00O000.OooO0O0();
            if (activityOooO0O0 != null) {
                TaskActivity.f22080o00ooo.OooO00o(activityOooO0O0);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.bridge.webjs.BaseJSBridge$toBadgePage$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class Oooo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f41001Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(int i, Continuation<? super Oooo0> continuation) {
            super(2, continuation);
            this.f41001Oooo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new Oooo0(this.f41001Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((Oooo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00O000 o00o001 = o00O000.f34368OooO00o;
            Activity activityOooO0O0 = o00O000.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = this.f41001Oooo;
                BadgeActivity.OooO00o oooO00o = BadgeActivity.f23302OoooooO;
                p500o0o00Oo0.OooOOO oooOOO = p500o0o00Oo0.OooOOO.f41235OooO00o;
                Long value = oooOOO.OooOo().getValue();
                if (value == null) {
                    value = Boxing.boxLong(0L);
                }
                Intrinsics.checkNotNullExpressionValue(value, "Account.userId.value ?: 0");
                oooO00o.OooO00o(activityOooO0O0, value.longValue(), String.valueOf(oooOOO.OooOoO().getValue()), String.valueOf(oooOOO.OooO0oo().getValue()), String.valueOf(oooOOO.OooOO0O().getValue()), i == 1);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final Oooo000 f41002Oooo = new Oooo000();

        public Oooo000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00O000 o00o001 = o00O000.f34368OooO00o;
            Activity activityOooO0O0 = o00O000.OooO0O0();
            FragmentActivity fragmentActivity = activityOooO0O0 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O0 : null;
            if (fragmentActivity != null) {
                Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
                p499o0o00Oo.OooOOO0 oooOOO0 = p499o0o00Oo.OooOOO0.f41199OooO00o;
                if (!StringsKt.isBlank(p499o0o00Oo.OooOOO0.OooO0o().OooOOO0())) {
                    YCSDKOpenKit.setApplicationId(p499o0o00Oo.OooOOO0.OooO0o().OooOOO0());
                    YCSDKOpenKit.setApplicationKey(p499o0o00Oo.OooOOO0.OooO0o().OooOOO());
                    YCSDKOpenKit.setDirectUrl("https://www.yalla.live/");
                    YCSDKOpenKit.INSTANCE.sdkInitialize(fragmentActivity);
                }
                o000000O action = new o000000O(fragmentActivity);
                Intrinsics.checkNotNullParameter(action, "action");
                YCSDKOpenKit yCSDKOpenKit = YCSDKOpenKit.INSTANCE;
                Object[] array = StringsKt__StringsKt.split$default("public_profile,user_gender,user_country,user_birthday,user_friends,user_phone", new String[]{","}, false, 0, 6, (Object) null).toArray(new String[0]);
                Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                YCSDKOpenKit.sendReq$default(yCSDKOpenKit, fragmentActivity, new AuthRequest("a671060faf538fcf28b5a2e12234fac8", (String[]) array), new o0000O0.OooO0O0(action), null, 8, null);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.bridge.webjs.BaseJSBridge$toHomePage$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000oOoO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f41003Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(int i, Continuation<? super o000oOoO> continuation) {
            super(2, continuation);
            this.f41003Oooo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o000oOoO(this.f41003Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o000oOoO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00O000 o00o001 = o00O000.f34368OooO00o;
            Activity activityOooO0O0 = o00O000.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = this.f41003Oooo;
                MainActivity.OooO00o oooO00o = MainActivity.f21962o00Ooo;
                MainActivity.OooO00o.OooO00o(activityOooO0O0, false, i, 22);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.bridge.webjs.BaseJSBridge$toYallaChatTrees$1$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00O0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f41004Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f41005OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(String str, FragmentActivity fragmentActivity, Continuation<? super o00O0O> continuation) {
            super(2, continuation);
            this.f41004Oooo = str;
            this.f41005OoooO00 = fragmentActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o00O0O(this.f41004Oooo, this.f41005OoooO00, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o00O0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (!o00O0.OooO0o0(this.f41004Oooo)) {
                SharedUrlManager.INSTANCE.getYallachatTreeUrl().observe(this.f41005OoooO00, new Observer() { // from class: o0o000oo.o00000
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj2) {
                        String it = (String) obj2;
                        o0000O0.OooO00o oooO00o = o0000O0.f48646OooO0O0;
                        Intrinsics.checkNotNullExpressionValue(it, "it");
                        oooO00o.OooO0O0(it);
                    }
                });
                return Unit.INSTANCE;
            }
            String str = this.f41004Oooo;
            if (str != null) {
                o0000O0.f48646OooO0O0.OooO0O0(str);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.bridge.webjs.BaseJSBridge$toPostDetailPage$1", f = "BaseJSBridge.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0OoOo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f41006Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(MomentDetailModel momentDetailModel, Continuation<? super o0OoOo0> continuation) {
            super(2, continuation);
            this.f41006Oooo = momentDetailModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0OoOo0(this.f41006Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0OoOo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00O000 o00o001 = o00O000.f34368OooO00o;
            Activity activityOooO0O0 = o00O000.OooO0O0();
            if (activityOooO0O0 != null) {
                MomentDetailModel momentDetailModel = this.f41006Oooo;
                PostDetailActivity.OooO00o oooO00o = PostDetailActivity.f22436o000000O;
                PostDetailActivity.f22436o000000O.OooO00o(activityOooO0O0, momentDetailModel, (256 & 4) != 0 ? false : false, (256 & 8) != 0 ? 1 : -1, (256 & 16) != 0 ? null : null, (256 & 32) != 0 ? false : false, (256 & 64) != 0 ? null : MomentAdapterTag.Web, (256 & 128) != 0 ? false : true, (256 & 256) != 0 ? "" : null);
            }
            return Unit.INSTANCE;
        }
    }

    @JvmOverloads
    @JavascriptInterface
    public final void buriedPointEvent(@Nullable String str) {
        buriedPointEvent(str, null);
    }

    public abstract void closePage();

    @JavascriptInterface
    public final void coinNotEnough() {
        p190o00o00oO.oo0o0Oo.OooO0O0(CommonError.Coin_NotEnough, null, 2, null, CommonErrorHandler.INSTANCE);
    }

    @JavascriptInterface
    public final void coinNotEnoughQuick() {
        p608o0oo0O.OooOo.OooO0OO("202005", MapsKt.mapOf(new Pair("source", 4)));
        p190o00o00oO.oo0o0Oo.OooO0O0(CommonError.Coin_NotEnough_QuickRecharge, null, 2, null, CommonErrorHandler.INSTANCE);
    }

    @JavascriptInterface
    public final void confirmRecharge() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO00o(null), 3, null);
    }

    @JavascriptInterface
    public void createRoomPage() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0O0(null), 3, null);
    }

    @JavascriptInterface
    public final boolean darkmode() {
        return false;
    }

    @JavascriptInterface
    public final void downloadPage(@Nullable String str) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0OO(str, null), 3, null);
    }

    @JavascriptInterface
    public final void eventStatistic(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        o0O00000.OooO0OO(message);
    }

    @JavascriptInterface
    public final void fruitGameClose() {
        closePage();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JavascriptInterface
    @NotNull
    public final String getInfo(@NotNull String info) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(info, "info");
        JSInfoModel jSInfoModel = new JSInfoModel();
        for (String str : StringsKt__StringsKt.split$default(info, new String[]{"|"}, false, 0, 6, (Object) null)) {
            long jLongValue = 0;
            String str2 = "";
            switch (str.hashCode()) {
                case -1850780999:
                    if (str.equals("phoneBrand")) {
                        o0OOO0o o0ooo0o2 = o0OOO0o.f40953OooO00o;
                        jSInfoModel.setPhoneBrand(o0OOO0o.OooO0O0());
                    }
                    break;
                case -1840709029:
                    if (str.equals("phoneModel")) {
                        o0OOO0o o0ooo0o3 = o0OOO0o.f40953OooO00o;
                        jSInfoModel.setPhoneModel(o0OOO0o.OooO0OO());
                    }
                    break;
                case -1811743075:
                    if (str.equals("networkOperatorName")) {
                        jSInfoModel.setNetworkOperatorName(NetworkUtil.f20518OooO00o.OooO0Oo());
                    }
                    break;
                case -1540282147:
                    if (str.equals("kaVipLevel")) {
                        Pair<Integer, Integer> value = p500o0o00Oo0.OooOOO.f41235OooO00o.OooO().getValue();
                        jSInfoModel.setKaVipLevel(value != null ? value.getSecond().intValue() : 0);
                    }
                    break;
                case -934795532:
                    if (str.equals("region")) {
                        Integer value2 = p500o0o00Oo0.OooOOO.f41235OooO00o.OooOOO().getValue();
                        Intrinsics.checkNotNull(value2);
                        jSInfoModel.setRegion(value2.intValue());
                    }
                    break;
                case -925319370:
                    if (str.equals("roomID")) {
                        Long value3 = o00OO0O0.f43338OooooOo.OooO00o().f43344OooO0Oo.getValue();
                        if (value3 != null) {
                            Intrinsics.checkNotNullExpressionValue(value3, "RoomDataSource.instance().roomId.value ?: 0");
                            jLongValue = value3.longValue();
                        }
                        jSInfoModel.setRoomID(jLongValue);
                    }
                    break;
                case -836030906:
                    if (str.equals("userId")) {
                        Long value4 = p500o0o00Oo0.OooOOO.f41235OooO00o.OooOo().getValue();
                        if (value4 != null) {
                            Intrinsics.checkNotNullExpressionValue(value4, "Account.userId.value ?: 0");
                            jLongValue = value4.longValue();
                        }
                        jSInfoModel.setUserId(jLongValue);
                    }
                    break;
                case -662089212:
                    if (str.equals("appVersionCode")) {
                        o0ooOOo o0ooooo2 = o0ooOOo.f40966OooO00o;
                        jSInfoModel.setAppVersionCode(o0ooOOo.OooO00o());
                    }
                    break;
                case -661774686:
                    if (str.equals("appVersionName")) {
                        o0ooOOo o0ooooo3 = o0ooOOo.f40966OooO00o;
                        jSInfoModel.setAppVersionName(o0ooOOo.OooO0O0());
                    }
                    break;
                case -147154190:
                    if (str.equals("userIdx")) {
                        String value5 = p500o0o00Oo0.OooOOO.f41235OooO00o.OooOoO0().getValue();
                        if (value5 != null) {
                            Intrinsics.checkNotNullExpressionValue(value5, "Account.userIdx.value ?: \"\"");
                            str2 = value5;
                        }
                        jSInfoModel.setUserIdx(str2);
                    }
                    break;
                case 3735305:
                    if (str.equals("zeus")) {
                        jSInfoModel.setZeus(p487o0o000Oo.Oooo0.f40913OooO00o.OooO00o("").OooO00o());
                    }
                    break;
                case 110541305:
                    if (str.equals(FirebaseMessagingService.EXTRA_TOKEN)) {
                        String value6 = p500o0o00Oo0.OooOOO.f41235OooO00o.OooOo0().getValue();
                        if (value6 != null) {
                            Intrinsics.checkNotNullExpressionValue(value6, "Account.tokenActivity.value ?: \"\"");
                            str2 = value6;
                        }
                        jSInfoModel.setToken(str2);
                    }
                    break;
                case 321545849:
                    if (str.equals("userLevel")) {
                        Integer value7 = p500o0o00Oo0.OooOOO.f41235OooO00o.OooOO0().getValue();
                        if (value7 == null) {
                            iIntValue = 0;
                        } else {
                            Intrinsics.checkNotNullExpressionValue(value7, "Account.level.value ?: 0");
                            iIntValue = value7.intValue();
                        }
                        jSInfoModel.setUserLevel(iIntValue);
                    }
                    break;
                case 329221358:
                    if (str.equals("userToken")) {
                        String value8 = p500o0o00Oo0.OooOOO.f41235OooO00o.OooOo00().getValue();
                        if (value8 != null) {
                            Intrinsics.checkNotNullExpressionValue(value8, "Account.token.value ?: \"\"");
                            str2 = value8;
                        }
                        jSInfoModel.setUserToken(str2);
                    }
                    break;
                case 1471573351:
                    if (str.equals("vipLevel")) {
                        Pair<Boolean, Integer> value9 = p500o0o00Oo0.OooOOO.f41235OooO00o.OooOOO0().getValue();
                        jSInfoModel.setVipLevel(value9 != null ? value9.getSecond().intValue() : 0);
                    }
                    break;
                case 1842452087:
                    if (str.equals("netType")) {
                        jSInfoModel.setNetType(NetworkUtil.f20518OooO00o.OooO0OO().toString());
                    }
                    break;
                case 2098881846:
                    if (str.equals("systemVersionCode")) {
                        o0OOO0o o0ooo0o4 = o0OOO0o.f40953OooO00o;
                        jSInfoModel.setSystemVersionCode(String.valueOf(((Number) o0OOO0o.f40954OooO0O0.getValue()).intValue()));
                    }
                    break;
                case 2099196372:
                    if (str.equals("systemVersionName")) {
                        o0OOO0o o0ooo0o5 = o0OOO0o.f40953OooO00o;
                        jSInfoModel.setSystemVersionName(o0OOO0o.OooO0Oo());
                    }
                    break;
            }
        }
        return p518o0o0O000.o0Oo0oo.OooO0O0(jSInfoModel);
    }

    @JavascriptInterface
    public final void goToBuyRoomTheme() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0o(null), 3, null);
    }

    @JavascriptInterface
    public final void goToGooglePlay() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO(null), 3, null);
    }

    @JavascriptInterface
    public void goToRecharge() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOO0(null), 3, null);
    }

    @JavascriptInterface
    public final boolean isInstallYallaChat() {
        return PackManager.INSTANCE.isInstalledYallaChat();
    }

    @JavascriptInterface
    public final void profilePage(@Nullable String str) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOO0O(str, null), 3, null);
    }

    @Deprecated(message = "用上面那个，这个不能删，兼容旧版本活动")
    @JavascriptInterface
    public void rechargePage() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOO0(null), 3, null);
    }

    @JavascriptInterface
    public void refreshUrl() {
    }

    @JvmOverloads
    @JavascriptInterface
    public final void roomPage(@Nullable String str) {
        roomPage(str, 0);
    }

    @JavascriptInterface
    public final void showMsg(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOO(message, null), 3, null);
    }

    @JavascriptInterface
    public final void showToastMsg(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(message, null), 3, null);
    }

    @JavascriptInterface
    public void taskPage() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOo00(null), 3, null);
    }

    @JavascriptInterface
    public final void toAppMarketDownLoad(@NotNull String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOo(packageName, null), 3, null);
    }

    @JavascriptInterface
    public final void toAssociationYallaChat() {
        Oooo000 action = Oooo000.f41002Oooo;
        o0000oo notInstall = true & true ? o0000oo.f48659Oooo : null;
        Intrinsics.checkNotNullParameter(notInstall, "notInstall");
        Intrinsics.checkNotNullParameter(action, "action");
        if (PackManager.INSTANCE.isInstalledYallaChat()) {
            action.invoke();
        } else {
            notInstall.invoke();
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new o0000O0.OooO00o.C0418OooO00o(null), 2, null);
        }
    }

    @JavascriptInterface
    public final void toBadgePage(int i) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo0(i, null), 3, null);
    }

    @JavascriptInterface
    public void toBlindboxRecord() {
    }

    @JavascriptInterface
    public final void toEventPage() {
        o00O000 o00o001 = o00O000.f34368OooO00o;
        Activity activityOooO0O0 = o00O000.OooO0O0();
        if (activityOooO0O0 != null) {
            EventDisplayActivity.OooO00o oooO00o = EventDisplayActivity.f21917o000oOoO;
            EventDisplayActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }

    @JavascriptInterface
    public final void toHomePage(int i) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o000oOoO(i, null), 3, null);
    }

    @JavascriptInterface
    public final void toPostDetailPage(long j) {
        MomentDetailModel momentDetailModel = new MomentDetailModel();
        momentDetailModel.setId(j);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0OoOo0(momentDetailModel, null), 3, null);
    }

    @JavascriptInterface
    public final void toYallaChatTrees(@Nullable String str) {
        o00O000 o00o001 = o00O000.f34368OooO00o;
        Activity activityOooO0O0 = o00O000.OooO0O0();
        FragmentActivity fragmentActivity = activityOooO0O0 instanceof FragmentActivity ? (FragmentActivity) activityOooO0O0 : null;
        if (fragmentActivity != null) {
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new o00O0O(str, fragmentActivity, null), 2, null);
        }
    }

    @JavascriptInterface
    public final void updateCoin(long j) {
        p500o0o00Oo0.OooOOO.f41235OooO00o.OooO0OO().postValue(Long.valueOf(j));
    }

    @JavascriptInterface
    public void updateCrystal(int i) {
        p500o0o00Oo0.OooOOO.f41235OooO00o.OooO0o().postValue(Long.valueOf(i));
    }

    @JvmOverloads
    @JavascriptInterface
    public final void buriedPointEvent(@Nullable String str, @Nullable Map<String, String> map) {
        if (str != null) {
            p608o0oo0O.OooOo.OooO0OO(str, map);
        }
    }

    @JvmOverloads
    @JavascriptInterface
    public final void roomPage(@Nullable String str, int i) {
        o00O00.OooO0O0("enterRoom roomId:" + str + " , giftId:" + i);
        Integer numValueOf = Integer.valueOf(i);
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        o00oO0o o00oo0o2 = o00000OO.f32228OooO00o;
        o00000OO.f32234OooO0oO.OooO0OO(str, new o0O0O00(numValueOf));
    }
}
