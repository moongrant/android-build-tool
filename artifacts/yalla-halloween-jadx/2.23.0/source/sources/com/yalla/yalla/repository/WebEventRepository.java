package com.yalla.yalla.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.MomentLogActionType;
import com.yalla.yalla.model.MomentLogSourcePage;
import com.yalla.yalla.model.http.Response;
import io.agora.rtc.Constants;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464o0Oooo.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nWebEventRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebEventRepository.kt\ncom/yalla/yalla/repository/WebEventRepository\n+ 2 ApiBaseRepository.kt\ncom/yalla/yalla/repository/ApiBaseRepository\n*L\n1#1,146:1\n26#2:147\n47#2:148\n26#2:149\n47#2:150\n26#2:151\n47#2:152\n26#2:153\n47#2:154\n*S KotlinDebug\n*F\n+ 1 WebEventRepository.kt\ncom/yalla/yalla/repository/WebEventRepository\n*L\n26#1:147\n26#1:148\n54#1:149\n54#1:150\n92#1:151\n92#1:152\n106#1:153\n106#1:154\n*E\n"})
public final class WebEventRepository extends o0O00oO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final WebEventRepository f24891OooO00o = new WebEventRepository();

    @DebugMetadata(c = "com.yalla.yalla.repository.WebEventRepository$enterRoomLog$1", f = "WebEventRepository.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f24892OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f24893OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f24894OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f24895OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ EnterRoomParentPage f24896OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ArrayList<String> arrayList, ArrayList<String> arrayList2, String str, EnterRoomParentPage enterRoomParentPage, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f24894OooO0o0 = arrayList;
            this.f24893OooO0o = arrayList2;
            this.f24895OooO0oO = str;
            this.f24896OooO0oo = enterRoomParentPage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f24894OooO0o0, this.f24893OooO0o, this.f24895OooO0oO, this.f24896OooO0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f24892OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WebEventRepository webEventRepository = WebEventRepository.f24891OooO00o;
                ArrayList<String> arrayList = this.f24894OooO0o0;
                ArrayList<String> arrayList2 = this.f24893OooO0o;
                String str = this.f24895OooO0oO;
                EnterRoomParentPage enterRoomParentPage = this.f24896OooO0oo;
                this.f24892OooO0Oo = 1;
                webEventRepository.getClass();
                if (BuildersKt.withContext(Dispatchers.getIO(), new WebEventRepository$registerEventApkEnterRoomLog$$inlined$call$1(webEventRepository, null, arrayList, arrayList2, str, enterRoomParentPage), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.repository.WebEventRepository$momentsContent$1", f = "WebEventRepository.kt", i = {}, l = {Constants.ERR_WATERMARK_READ}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f24897OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f24898OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentLogActionType f24899OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f24900OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MomentLogActionType momentLogActionType, String str, String str2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f24899OooO0o0 = momentLogActionType;
            this.f24898OooO0o = str;
            this.f24900OooO0oO = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f24899OooO0o0, this.f24898OooO0o, this.f24900OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f24897OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WebEventRepository webEventRepository = WebEventRepository.f24891OooO00o;
                MomentLogSourcePage momentLogSourcePage = MomentLogSourcePage.moments_content;
                MomentLogActionType momentLogActionType = this.f24899OooO0o0;
                String str = this.f24898OooO0o;
                String str2 = this.f24900OooO0oO;
                this.f24897OooO0Oo = 1;
                if (webEventRepository.OooO0Oo(momentLogSourcePage, momentLogActionType, str, str2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.repository.WebEventRepository$momentsEvent$1", f = "WebEventRepository.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f24901OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentLogActionType f24902OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentLogSourcePage f24903OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f24904OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f24905OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MomentLogSourcePage momentLogSourcePage, MomentLogActionType momentLogActionType, String str, String str2, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f24903OooO0o0 = momentLogSourcePage;
            this.f24902OooO0o = momentLogActionType;
            this.f24904OooO0oO = str;
            this.f24905OooO0oo = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f24903OooO0o0, this.f24902OooO0o, this.f24904OooO0oO, this.f24905OooO0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f24901OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WebEventRepository webEventRepository = WebEventRepository.f24891OooO00o;
                MomentLogSourcePage momentLogSourcePage = this.f24903OooO0o0;
                MomentLogActionType momentLogActionType = this.f24902OooO0o;
                String str = this.f24904OooO0oO;
                String str2 = this.f24905OooO0oo;
                this.f24901OooO0Oo = 1;
                if (webEventRepository.OooO0Oo(momentLogSourcePage, momentLogActionType, str, str2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.repository.WebEventRepository$roomExposureLog$1", f = "WebEventRepository.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f24906OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f24907OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ArrayList<String> f24908OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ EnterRoomParentPage f24909OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(ArrayList<String> arrayList, ArrayList<String> arrayList2, EnterRoomParentPage enterRoomParentPage, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f24908OooO0o0 = arrayList;
            this.f24907OooO0o = arrayList2;
            this.f24909OooO0oO = enterRoomParentPage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f24908OooO0o0, this.f24907OooO0o, this.f24909OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f24906OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WebEventRepository webEventRepository = WebEventRepository.f24891OooO00o;
                ArrayList<String> arrayList = this.f24908OooO0o0;
                ArrayList<String> arrayList2 = this.f24907OooO0o;
                EnterRoomParentPage enterRoomParentPage = this.f24909OooO0oO;
                this.f24906OooO0Oo = 1;
                webEventRepository.getClass();
                if (BuildersKt.withContext(Dispatchers.getIO(), new WebEventRepository$registerEventApkRoomExposureLog$$inlined$call$1(webEventRepository, null, arrayList, arrayList2, enterRoomParentPage), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static void OooO0OO(@NotNull Fragment fragment, @Nullable ArrayList arrayList, @Nullable ArrayList arrayList2, @NotNull String roomId, @NotNull EnterRoomParentPage sourcePage) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        Intrinsics.checkNotNullParameter(sourcePage, "sourcePage");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new OooO00o(arrayList, arrayList2, roomId, sourcePage, null), 3, null);
    }

    public static void OooO0o(@NotNull MomentLogSourcePage sourcePage, @NotNull MomentLogActionType actionType, @NotNull String actionInfo, @Nullable String str) {
        Intrinsics.checkNotNullParameter(sourcePage, "sourcePage");
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(actionInfo, "actionInfo");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0OO(sourcePage, actionType, actionInfo, str, null), 3, null);
    }

    public static void OooO0o0(@NotNull MomentLogActionType actionType, @NotNull String actionInfo, @Nullable String str) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(actionInfo, "actionInfo");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooO0O0(actionType, actionInfo, str, null), 3, null);
    }

    public static void OooO0oO(@NotNull Fragment fragment, @Nullable ArrayList arrayList, @Nullable ArrayList arrayList2, @NotNull EnterRoomParentPage expoSource) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(expoSource, "expoSource");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new OooO0o(arrayList, arrayList2, expoSource, null), 3, null);
    }

    @Nullable
    public final Object OooO0Oo(@NotNull MomentLogSourcePage momentLogSourcePage, @NotNull MomentLogActionType momentLogActionType, @NotNull String str, @Nullable String str2, @NotNull Continuation<? super Response<String>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new WebEventRepository$momentBehaviorLog$$inlined$call$1(this, null, momentLogSourcePage, momentLogActionType, str, str2), continuation);
    }
}
