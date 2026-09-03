package com.yalla.yalla.ui.vm.main;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
import com.yalla.yalla.data.repository.MainRoomDialogRepo$getOfficialAction$$inlined$call$1;
import com.yalla.yalla.data.repository.MainRoomDialogRepo$getUserReturnReward$$inlined$call$1;
import com.yalla.yalla.data.repository.MainRoomDialogRepo$signInWhether$$inlined$call$1;
import com.yalla.yalla.data.repository.SignTaskRepository;
import com.yalla.yalla.model.CheckSignInModel;
import com.yalla.yalla.model.SignTaskModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.OfficialActionModel;
import com.yalla.yalla.ui.composable.main.MainRoomDialogType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p394o0Oo00oO.o0O0O00;
import p406o0Oo0Ooo.h;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o0000O00;
import p420o0OoO0OO.o0OO00O;
import p420o0OoO0OO.o0ooOOo;
import p464o0Oooo.o000000O;
import p579o0oOoo.oOOO0OO0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\\\u0010]J\u001a\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u001a\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000bH\u0002J \u0010\u0012\u001a\u00020\u00062\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0002R+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR+\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001bR+\u0010#\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001bR\"\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0019\"\u0004\b'\u0010\u001bR$\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R+\u00102\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b/\u0010\u0017\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u0010\u001bR+\u00106\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b3\u0010\u0017\u001a\u0004\b4\u0010\u0019\"\u0004\b5\u0010\u001bR+\u0010:\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u0010\u0017\u001a\u0004\b8\u0010\u0019\"\u0004\b9\u0010\u001bR+\u0010>\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010\u0017\u001a\u0004\b<\u0010\u0019\"\u0004\b=\u0010\u001bR+\u0010B\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010\u0017\u001a\u0004\b@\u0010\u0019\"\u0004\bA\u0010\u001bR/\u0010I\u001a\u0004\u0018\u00010C2\b\u0010\u0015\u001a\u0004\u0018\u00010C8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bD\u0010\u0017\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR/\u0010M\u001a\u0004\u0018\u00010C2\b\u0010\u0015\u001a\u0004\u0018\u00010C8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u0010\u0017\u001a\u0004\bK\u0010F\"\u0004\bL\u0010HR\"\u0010O\u001a\u00020N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\u0016\u0010V\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010X\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010%R\u0016\u0010[\u001a\u00020U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010W¨\u0006^"}, d2 = {"Lcom/yalla/yalla/ui/vm/main/MainRoomVM;", "Lo0Oo00oO/o0O0O00;", "Lcom/yalla/yalla/ui/vm/main/MainRoomDialogLink;", "link", "", "reGet", "", "loadAll", "showIcon", "showIconAnim", "setCheckVisibility", "Lo0OoO0OO/o0OO00O;", "Lcom/yalla/yalla/model/http/ApiResult;", "", "Lcom/yalla/yalla/model/SignTaskModel;", "loadTaskListData", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "loadAction", "loadSignIn", "checkState", "<set-?>", "isLoginState$delegate", "Landroidx/compose/runtime/MutableState;", "isLoginState", "()Z", "setLoginState", "(Z)V", "checkInTaskTypeShowIv$delegate", "getCheckInTaskTypeShowIv", "setCheckInTaskTypeShowIv", "checkInTaskTypeShowIv", "checkInTaskTypeShowSvga$delegate", "getCheckInTaskTypeShowSvga", "setCheckInTaskTypeShowSvga", "checkInTaskTypeShowSvga", "haveSignIn", "Z", "getHaveSignIn", "setHaveSignIn", "Lcom/yalla/yalla/ui/composable/main/MainRoomDialogType;", "showingDialogType", "Lcom/yalla/yalla/ui/composable/main/MainRoomDialogType;", "getShowingDialogType", "()Lcom/yalla/yalla/ui/composable/main/MainRoomDialogType;", "setShowingDialogType", "(Lcom/yalla/yalla/ui/composable/main/MainRoomDialogType;)V", "dialogShowWelcome$delegate", "getDialogShowWelcome", "setDialogShowWelcome", "dialogShowWelcome", "dialogShowUserReturn$delegate", "getDialogShowUserReturn", "setDialogShowUserReturn", "dialogShowUserReturn", "dialogShowOfficialAction$delegate", "getDialogShowOfficialAction", "setDialogShowOfficialAction", "dialogShowOfficialAction", "dialogShowBindYallaChatTips$delegate", "getDialogShowBindYallaChatTips", "setDialogShowBindYallaChatTips", "dialogShowBindYallaChatTips", "dialogShowCheckInTask$delegate", "getDialogShowCheckInTask", "setDialogShowCheckInTask", "dialogShowCheckInTask", "Lcom/yalla/yalla/model/user/OfficialActionModel;", "userReturnModel$delegate", "getUserReturnModel", "()Lcom/yalla/yalla/model/user/OfficialActionModel;", "setUserReturnModel", "(Lcom/yalla/yalla/model/user/OfficialActionModel;)V", "userReturnModel", "officialActionModel$delegate", "getOfficialActionModel", "setOfficialActionModel", "officialActionModel", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", "getDateFormat", "()Ljava/text/SimpleDateFormat;", "setDateFormat", "(Ljava/text/SimpleDateFormat;)V", "", "dialogOfficialActionShowForToDay", "Ljava/lang/String;", "lastLink", "Lcom/yalla/yalla/ui/vm/main/MainRoomDialogLink;", "isLoadingSignIn", "dialogCheckInTaskForToDay", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMainRoomVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainRoomVM.kt\ncom/yalla/yalla/ui/vm/main/MainRoomVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,233:1\n81#2:234\n107#2,2:235\n81#2:237\n107#2,2:238\n81#2:240\n107#2,2:241\n81#2:243\n107#2,2:244\n81#2:246\n107#2,2:247\n81#2:249\n107#2,2:250\n81#2:252\n107#2,2:253\n81#2:255\n107#2,2:256\n81#2:258\n107#2,2:259\n81#2:261\n107#2,2:262\n*S KotlinDebug\n*F\n+ 1 MainRoomVM.kt\ncom/yalla/yalla/ui/vm/main/MainRoomVM\n*L\n37#1:234\n37#1:235,2\n40#1:237\n40#1:238,2\n43#1:240\n43#1:241,2\n52#1:243\n52#1:244,2\n55#1:246\n55#1:247,2\n58#1:249\n58#1:250,2\n61#1:252\n61#1:253,2\n64#1:255\n64#1:256,2\n67#1:258\n67#1:259,2\n70#1:261\n70#1:262,2\n*E\n"})
public final class MainRoomVM extends o0O0O00 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: checkInTaskTypeShowIv$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState checkInTaskTypeShowIv;

    /* JADX INFO: renamed from: checkInTaskTypeShowSvga$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState checkInTaskTypeShowSvga;

    @NotNull
    private SimpleDateFormat dateFormat;

    @NotNull
    private String dialogCheckInTaskForToDay;

    @NotNull
    private String dialogOfficialActionShowForToDay;

    /* JADX INFO: renamed from: dialogShowBindYallaChatTips$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState dialogShowBindYallaChatTips;

    /* JADX INFO: renamed from: dialogShowCheckInTask$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState dialogShowCheckInTask;

    /* JADX INFO: renamed from: dialogShowOfficialAction$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState dialogShowOfficialAction;

    /* JADX INFO: renamed from: dialogShowUserReturn$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState dialogShowUserReturn;

    /* JADX INFO: renamed from: dialogShowWelcome$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState dialogShowWelcome;
    private boolean haveSignIn;
    private boolean isLoadingSignIn;

    /* JADX INFO: renamed from: isLoginState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isLoginState;

    @Nullable
    private MainRoomDialogLink lastLink;

    /* JADX INFO: renamed from: officialActionModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState officialActionModel;

    @Nullable
    private MainRoomDialogType showingDialogType;

    /* JADX INFO: renamed from: userReturnModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState userReturnModel;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainRoomVM$loadTaskListData$1", f = "MainRoomVM.kt", i = {0}, l = {73}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class OooO extends SuspendLambda implements Function2<o0OO00O<ApiResult<List<SignTaskModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31774OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31775OooO0o0;

        public OooO(Continuation<? super OooO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(continuation);
            oooO.f31775OooO0o0 = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0OO00O<ApiResult<List<SignTaskModel>>> o0oo00o2, Continuation<? super Unit> continuation) {
            return ((OooO) create(o0oo00o2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OO00O o0oo00o2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31774OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0OO00O o0oo00o3 = (o0OO00O) this.f31775OooO0o0;
                SignTaskRepository signTaskRepository = SignTaskRepository.f23136OooO00o;
                this.f31775OooO0o0 = o0oo00o3;
                this.f31774OooO0Oo = 1;
                signTaskRepository.getClass();
                Object objOooO0OO = SignTaskRepository.OooO0OO(1, this);
                if (objOooO0OO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o0oo00o2 = o0oo00o3;
                obj = objOooO0OO;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0oo00o2 = (o0OO00O) this.f31775OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            oOOO0OO0.OooO00o(false, apiResult);
            o0oo00o2.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainRoomVM$loadAction$1", f = "MainRoomVM.kt", i = {}, l = {93, 114}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31776OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f31777OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f31778OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Function1<? super Boolean, Unit> function1, MainRoomVM mainRoomVM, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f31778OooO0o0 = function1;
            this.f31777OooO0o = mainRoomVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f31778OooO0o0, this.f31777OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:43:0x00df  */
        /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OfficialActionModel officialActionModel;
            ApiResult apiResult;
            OfficialActionModel officialActionModel2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31776OooO0Oo;
            MainRoomVM mainRoomVM = this.f31777OooO0o;
            Function1<Boolean, Unit> function1 = this.f31778OooO0o0;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult.isSuccess() && (officialActionModel2 = (OfficialActionModel) apiResult.getData()) != null) {
                    officialActionModel2.refresh();
                    if (officialActionModel2.getDefaultIsShowDialog()) {
                        mainRoomVM.setOfficialActionModel(officialActionModel2);
                        mainRoomVM.setDialogShowOfficialAction(true);
                        if (function1 != null) {
                            function1.invoke(Boxing.boxBoolean(true));
                        }
                        return Unit.INSTANCE;
                    }
                    if (officialActionModel2.getDefaultIsShowButton()) {
                        mainRoomVM.setOfficialActionModel(officialActionModel2);
                    }
                }
                if (function1 != null) {
                    function1.invoke(Boxing.boxBoolean(false));
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            h hVar = h.f44829OooO00o;
            this.f31776OooO0Oo = 1;
            hVar.getClass();
            String url = o000OOo0.OooO0OO("/Webservers/User/GetUserReturnInfo");
            Intrinsics.checkNotNullParameter(url, "url");
            o0O0ooO o0o0ooo = new o0O0ooO(url, 0);
            o0o0ooo.OooO0O0(Boxing.boxInt(0), "type");
            obj = OooOOO.OooO0Oo(new MainRoomDialogRepo$getUserReturnReward$$inlined$call$1(o0o0ooo, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult2 = (ApiResult) obj;
            if (apiResult2.isSuccess() && (officialActionModel = (OfficialActionModel) apiResult2.getData()) != null) {
                officialActionModel.refresh();
                if (officialActionModel.getDefaultIsShowDialog()) {
                    mainRoomVM.setUserReturnModel(officialActionModel);
                    mainRoomVM.setDialogShowUserReturn(true);
                    if (function1 != null) {
                        function1.invoke(Boxing.boxBoolean(true));
                    }
                    return Unit.INSTANCE;
                }
                if (officialActionModel.getDefaultIsShowButton()) {
                    mainRoomVM.setUserReturnModel(officialActionModel);
                }
            }
            h hVar2 = h.f44829OooO00o;
            this.f31776OooO0Oo = 2;
            hVar2.getClass();
            String url2 = o000OOo0.OooO0OO("/Webservers/User/GetUserReturnInfo");
            Intrinsics.checkNotNullParameter(url2, "url");
            o0O0ooO o0o0ooo2 = new o0O0ooO(url2, 0);
            o0o0ooo2.OooO0O0(Boxing.boxInt(1), "type");
            obj = OooOOO.OooO0Oo(new MainRoomDialogRepo$getOfficialAction$$inlined$call$1(o0o0ooo2, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                officialActionModel2.refresh();
                if (officialActionModel2.getDefaultIsShowDialog()) {
                    mainRoomVM.setOfficialActionModel(officialActionModel2);
                    mainRoomVM.setDialogShowOfficialAction(true);
                    if (function1 != null) {
                        function1.invoke(Boxing.boxBoolean(true));
                    }
                    return Unit.INSTANCE;
                }
                if (officialActionModel2.getDefaultIsShowButton()) {
                    mainRoomVM.setOfficialActionModel(officialActionModel2);
                }
            }
            if (function1 != null) {
                function1.invoke(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MainRoomVM mainRoomVM = MainRoomVM.this;
            mainRoomVM.dialogOfficialActionShowForToDay = "";
            mainRoomVM.dialogCheckInTaskForToDay = "";
            mainRoomVM.lastLink = null;
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MainRoomDialogLink f31781OooO0o0;

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MainRoomDialogLink.values().length];
                try {
                    iArr[MainRoomDialogLink.All.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MainRoomDialogLink.Action.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MainRoomDialogLink.SignIn.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MainRoomDialogLink mainRoomDialogLink) {
            super(0);
            this.f31781OooO0o0 = mainRoomDialogLink;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MainRoomVM mainRoomVM = MainRoomVM.this;
            MainRoomDialogLink mainRoomDialogLink = this.f31781OooO0o0;
            mainRoomVM.lastLink = mainRoomDialogLink;
            int i = OooO00o.$EnumSwitchMapping$0[mainRoomDialogLink.ordinal()];
            if (i == 1) {
                mainRoomVM.loadAction(new com.yalla.yalla.ui.vm.main.OooO00o(mainRoomVM));
            } else if (i == 2) {
                MainRoomVM.loadAction$default(mainRoomVM, null, 1, null);
            } else if (i == 3) {
                mainRoomVM.checkState();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainRoomVM$loadSignIn$1", f = "MainRoomVM.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31782OooO0Oo;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MainRoomVM.this.new OooO0o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31782OooO0Oo;
            MainRoomVM mainRoomVM = MainRoomVM.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (mainRoomVM.isLoadingSignIn) {
                    return Unit.INSTANCE;
                }
                mainRoomVM.isLoadingSignIn = true;
                h hVar = h.f44829OooO00o;
                this.f31782OooO0Oo = 1;
                hVar.getClass();
                String url = o000OOo0.OooO0OO("/Webservers/Task/SignInWhether");
                Intrinsics.checkNotNullParameter(url, "url");
                o0O0ooO o0o0ooo = new o0O0ooO(url, 0);
                o0o0ooo.OooO0O0(Boxing.boxInt(1), "type");
                obj = OooOOO.OooO0Oo(new MainRoomDialogRepo$signInWhether$$inlined$call$1(o0o0ooo, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            mainRoomVM.isLoadingSignIn = false;
            if (!apiResult.isSuccess()) {
                mainRoomVM.setCheckInTaskTypeShowIv(false);
                return Unit.INSTANCE;
            }
            String toDay = mainRoomVM.getDateFormat().format(new Date());
            CheckSignInModel checkSignInModel = (CheckSignInModel) apiResult.getData();
            if (checkSignInModel != null && checkSignInModel.getState() == 0) {
                mainRoomVM.setHaveSignIn(false);
                if (!mainRoomVM.getDialogShowWelcome() && !mainRoomVM.getDialogShowUserReturn() && !mainRoomVM.getDialogShowOfficialAction()) {
                    Intrinsics.checkNotNullExpressionValue(toDay, "toDay");
                    mainRoomVM.dialogCheckInTaskForToDay = toDay;
                    mainRoomVM.setDialogShowCheckInTask(true);
                }
                mainRoomVM.setCheckVisibility(false, true);
                SharedMainMessageManager.INSTANCE.isSignIn().postValue(Boxing.boxBoolean(false));
            } else {
                mainRoomVM.setHaveSignIn(true);
                o0000O00 o0000o00OooOO0o = o00Oo0.OooOO0o();
                Intrinsics.checkNotNullExpressionValue(toDay, "toDay");
                o0000o00OooOO0o.OooOOO(toDay);
                mainRoomVM.loadTaskListData();
                SharedMainMessageManager.INSTANCE.isSignIn().postValue(Boxing.boxBoolean(true));
            }
            return Unit.INSTANCE;
        }
    }

    public MainRoomVM() {
        Boolean bool = Boolean.FALSE;
        this.isLoginState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        Boolean bool2 = Boolean.TRUE;
        this.checkInTaskTypeShowIv = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool2, null, 2, null);
        this.checkInTaskTypeShowSvga = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool2, null, 2, null);
        this.dialogShowWelcome = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.dialogShowUserReturn = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.dialogShowOfficialAction = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.dialogShowBindYallaChatTips = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.dialogShowCheckInTask = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.userReturnModel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.officialActionModel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        this.dialogOfficialActionShowForToDay = "";
        this.dialogCheckInTaskForToDay = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkState() {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.FALSE)) {
            return;
        }
        String today = this.dateFormat.format(new Date());
        if (Intrinsics.areEqual(this.dialogCheckInTaskForToDay, today)) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(today, "today");
        this.dialogCheckInTaskForToDay = today;
        if (!Intrinsics.areEqual(today, o00Oo0.OooOO0o().OooOO0O())) {
            loadSignIn();
        } else {
            loadTaskListData();
            SharedMainMessageManager.INSTANCE.isSignIn().postValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadAction(Function1<? super Boolean, Unit> listener) {
        String today = this.dateFormat.format(new Date());
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (!Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE) || Intrinsics.areEqual(this.dialogOfficialActionShowForToDay, today)) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(today, "today");
        this.dialogOfficialActionShowForToDay = today;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO00o(listener, this, null), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadAction$default(MainRoomVM mainRoomVM, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        mainRoomVM.loadAction(function1);
    }

    public static /* synthetic */ void loadAll$default(MainRoomVM mainRoomVM, MainRoomDialogLink mainRoomDialogLink, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            mainRoomDialogLink = MainRoomDialogLink.All;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        mainRoomVM.loadAll(mainRoomDialogLink, z);
    }

    private final void loadSignIn() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0o(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o0OO00O<ApiResult<List<SignTaskModel>>> loadTaskListData() {
        return o0ooOOo.OooO00o(this, new OooO(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getCheckInTaskTypeShowIv() {
        return ((Boolean) this.checkInTaskTypeShowIv.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getCheckInTaskTypeShowSvga() {
        return ((Boolean) this.checkInTaskTypeShowSvga.getValue()).booleanValue();
    }

    @NotNull
    public final SimpleDateFormat getDateFormat() {
        return this.dateFormat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getDialogShowBindYallaChatTips() {
        return ((Boolean) this.dialogShowBindYallaChatTips.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getDialogShowCheckInTask() {
        return ((Boolean) this.dialogShowCheckInTask.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getDialogShowOfficialAction() {
        return ((Boolean) this.dialogShowOfficialAction.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getDialogShowUserReturn() {
        return ((Boolean) this.dialogShowUserReturn.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getDialogShowWelcome() {
        return ((Boolean) this.dialogShowWelcome.getValue()).booleanValue();
    }

    public final boolean getHaveSignIn() {
        return this.haveSignIn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final OfficialActionModel getOfficialActionModel() {
        return (OfficialActionModel) this.officialActionModel.getValue();
    }

    @Nullable
    public final MainRoomDialogType getShowingDialogType() {
        return this.showingDialogType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final OfficialActionModel getUserReturnModel() {
        return (OfficialActionModel) this.userReturnModel.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isLoginState() {
        return ((Boolean) this.isLoginState.getValue()).booleanValue();
    }

    public final void loadAll(@NotNull MainRoomDialogLink link, boolean reGet) {
        Intrinsics.checkNotNullParameter(link, "link");
        if (isLoginState()) {
            Boolean boolValueOf = Boolean.valueOf(reGet);
            OooO0O0 listener = new OooO0O0();
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
                listener.invoke();
            }
            MainRoomDialogLink mainRoomDialogLink = this.lastLink;
            OooO0OO listener2 = new OooO0OO(link);
            Intrinsics.checkNotNullParameter(listener2, "listener");
            if (mainRoomDialogLink == null) {
                listener2.invoke();
            }
        }
    }

    public final void setCheckInTaskTypeShowIv(boolean z) {
        this.checkInTaskTypeShowIv.setValue(Boolean.valueOf(z));
    }

    public final void setCheckInTaskTypeShowSvga(boolean z) {
        this.checkInTaskTypeShowSvga.setValue(Boolean.valueOf(z));
    }

    public final void setCheckVisibility(boolean showIcon, boolean showIconAnim) {
        setCheckInTaskTypeShowIv(showIcon);
        setCheckInTaskTypeShowSvga(showIconAnim);
        if (showIconAnim) {
            return;
        }
        this.haveSignIn = true;
    }

    public final void setDateFormat(@NotNull SimpleDateFormat simpleDateFormat) {
        Intrinsics.checkNotNullParameter(simpleDateFormat, "<set-?>");
        this.dateFormat = simpleDateFormat;
    }

    public final void setDialogShowBindYallaChatTips(boolean z) {
        this.dialogShowBindYallaChatTips.setValue(Boolean.valueOf(z));
    }

    public final void setDialogShowCheckInTask(boolean z) {
        this.dialogShowCheckInTask.setValue(Boolean.valueOf(z));
    }

    public final void setDialogShowOfficialAction(boolean z) {
        this.dialogShowOfficialAction.setValue(Boolean.valueOf(z));
    }

    public final void setDialogShowUserReturn(boolean z) {
        this.dialogShowUserReturn.setValue(Boolean.valueOf(z));
    }

    public final void setDialogShowWelcome(boolean z) {
        this.dialogShowWelcome.setValue(Boolean.valueOf(z));
    }

    public final void setHaveSignIn(boolean z) {
        this.haveSignIn = z;
    }

    public final void setLoginState(boolean z) {
        this.isLoginState.setValue(Boolean.valueOf(z));
    }

    public final void setOfficialActionModel(@Nullable OfficialActionModel officialActionModel) {
        this.officialActionModel.setValue(officialActionModel);
    }

    public final void setShowingDialogType(@Nullable MainRoomDialogType mainRoomDialogType) {
        this.showingDialogType = mainRoomDialogType;
    }

    public final void setUserReturnModel(@Nullable OfficialActionModel officialActionModel) {
        this.userReturnModel.setValue(officialActionModel);
    }
}
