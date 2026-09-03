package com.yalla.yalla.ui.vm.main;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.code.android.util.o0OoOo0;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
import com.yalla.yalla.data.repository.MainRoomDialogRepo$getOfficialAction$$inlined$call$1;
import com.yalla.yalla.data.repository.MainRoomDialogRepo$getUserReturnReward$$inlined$call$1;
import com.yalla.yalla.data.repository.MainRoomDialogRepo$loadBindMoreAccount$$inlined$call$1;
import com.yalla.yalla.data.repository.MainRoomDialogRepo$signInWhether$$inlined$call$1;
import com.yalla.yalla.data.repository.SignTaskRepository;
import com.yalla.yalla.manager.main.MainDialogManager$Link;
import com.yalla.yalla.manager.main.MainDialogManager$PriorityType;
import com.yalla.yalla.model.CheckSignInModel;
import com.yalla.yalla.model.SignTaskModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.BindMoreAccountModel;
import com.yalla.yalla.model.user.OfficialActionModel;
import com.zego.zegoavkit2.ZegoConstants;
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
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p041Ooooo0o.o00000;
import p382o0OOoOo.o0ooOOo;
import p382o0OOoOo.oo000o;
import p414o0Oo0o0O.o00OO0O0;
import p416o0Oo0oO.oO00OOO;
import p417o0Oo0oO0.o00Oo0;
import p426o0OoO0Oo.o00OO00O;
import p426o0OoO0Oo.oo0oOO0;
import p474o0OoooOO.oo0oO0;
import p587o0oOooO.oOOO00Oo;
import p597o0oo00O.OooOOOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bl\u0010mJ\u001a\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u001a\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000bH\u0002J \u0010\u0012\u001a\u00020\u00062\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0002J\u001a\u0010\u0016\u001a\u00020\u00062\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0015H\u0002R+\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR+\u0010!\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR+\u0010%\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001b\"\u0004\b$\u0010\u001dR\"\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R+\u00104\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010\u0019\u001a\u0004\b2\u0010\u001b\"\u0004\b3\u0010\u001dR+\u00108\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010\u0019\u001a\u0004\b6\u0010\u001b\"\u0004\b7\u0010\u001dR+\u0010<\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u0010\u0019\u001a\u0004\b:\u0010\u001b\"\u0004\b;\u0010\u001dR+\u0010@\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b=\u0010\u0019\u001a\u0004\b>\u0010\u001b\"\u0004\b?\u0010\u001dR+\u0010D\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bA\u0010\u0019\u001a\u0004\bB\u0010\u001b\"\u0004\bC\u0010\u001dR/\u0010K\u001a\u0004\u0018\u00010E2\b\u0010\u0017\u001a\u0004\u0018\u00010E8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010\u0019\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR/\u0010O\u001a\u0004\u0018\u00010E2\b\u0010\u0017\u001a\u0004\u0018\u00010E8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bL\u0010\u0019\u001a\u0004\bM\u0010H\"\u0004\bN\u0010JR(\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00040P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010\u0019\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR/\u0010\\\u001a\u0004\u0018\u00010V2\b\u0010\u0017\u001a\u0004\u0018\u00010V8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bW\u0010\u0019\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010^\u001a\u00020]8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u0016\u0010e\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010g\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010i\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010'R\u0016\u0010j\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010fR\u0016\u0010k\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010'¨\u0006n"}, d2 = {"Lcom/yalla/yalla/ui/vm/main/MainRoomVM;", "Lo0Oo0/OooOO0;", "Lcom/yalla/yalla/manager/main/MainDialogManager$Link;", "link", "", "reGet", "", "loadAll", "showIcon", "showIconAnim", "setCheckVisibility", "Lo0OoO0Oo/o00OO00O;", "Lcom/yalla/yalla/model/http/ApiResult;", "", "Lcom/yalla/yalla/model/SignTaskModel;", "loadTaskListData", "Lkotlin/Function1;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "loadAction", "loadSignIn", "checkState", "Lkotlin/Function0;", "loadBindMoreAccount", "<set-?>", "isLoginState$delegate", "Landroidx/compose/runtime/MutableState;", "isLoginState", "()Z", "setLoginState", "(Z)V", "checkInTaskTypeShowIv$delegate", "getCheckInTaskTypeShowIv", "setCheckInTaskTypeShowIv", "checkInTaskTypeShowIv", "checkInTaskTypeShowSvga$delegate", "getCheckInTaskTypeShowSvga", "setCheckInTaskTypeShowSvga", "checkInTaskTypeShowSvga", "haveSignIn", "Z", "getHaveSignIn", "setHaveSignIn", "Lcom/yalla/yalla/manager/main/MainDialogManager$PriorityType;", "showingPriorityType", "Lcom/yalla/yalla/manager/main/MainDialogManager$PriorityType;", "getShowingPriorityType", "()Lcom/yalla/yalla/manager/main/MainDialogManager$PriorityType;", "setShowingPriorityType", "(Lcom/yalla/yalla/manager/main/MainDialogManager$PriorityType;)V", "dialogShowWelcome$delegate", "getDialogShowWelcome", "setDialogShowWelcome", "dialogShowWelcome", "dialogShowUserReturn$delegate", "getDialogShowUserReturn", "setDialogShowUserReturn", "dialogShowUserReturn", "dialogShowOfficialAction$delegate", "getDialogShowOfficialAction", "setDialogShowOfficialAction", "dialogShowOfficialAction", "dialogShowBindYallaChatTips$delegate", "getDialogShowBindYallaChatTips", "setDialogShowBindYallaChatTips", "dialogShowBindYallaChatTips", "dialogShowCheckInTask$delegate", "getDialogShowCheckInTask", "setDialogShowCheckInTask", "dialogShowCheckInTask", "Lcom/yalla/yalla/model/user/OfficialActionModel;", "userReturnModel$delegate", "getUserReturnModel", "()Lcom/yalla/yalla/model/user/OfficialActionModel;", "setUserReturnModel", "(Lcom/yalla/yalla/model/user/OfficialActionModel;)V", "userReturnModel", "officialActionModel$delegate", "getOfficialActionModel", "setOfficialActionModel", "officialActionModel", "Landroidx/compose/runtime/MutableState;", "showBindMoreAccount", "getShowBindMoreAccount", "()Landroidx/compose/runtime/MutableState;", "setShowBindMoreAccount", "(Landroidx/compose/runtime/MutableState;)V", "Lcom/yalla/yalla/model/user/BindMoreAccountModel;", "bindMoreAccount$delegate", "getBindMoreAccount", "()Lcom/yalla/yalla/model/user/BindMoreAccountModel;", "setBindMoreAccount", "(Lcom/yalla/yalla/model/user/BindMoreAccountModel;)V", "bindMoreAccount", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", "getDateFormat", "()Ljava/text/SimpleDateFormat;", "setDateFormat", "(Ljava/text/SimpleDateFormat;)V", "", "dialogOfficialActionShowForToDay", "Ljava/lang/String;", "lastLink", "Lcom/yalla/yalla/manager/main/MainDialogManager$Link;", "isLoadingSignIn", "dialogCheckInTaskForToDay", "isLoadingBindMoreAccount", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMainRoomVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainRoomVM.kt\ncom/yalla/yalla/ui/vm/main/MainRoomVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,271:1\n81#2:272\n107#2,2:273\n81#2:275\n107#2,2:276\n81#2:278\n107#2,2:279\n81#2:281\n107#2,2:282\n81#2:284\n107#2,2:285\n81#2:287\n107#2,2:288\n81#2:290\n107#2,2:291\n81#2:293\n107#2,2:294\n81#2:296\n107#2,2:297\n81#2:299\n107#2,2:300\n81#2:302\n107#2,2:303\n*S KotlinDebug\n*F\n+ 1 MainRoomVM.kt\ncom/yalla/yalla/ui/vm/main/MainRoomVM\n*L\n34#1:272\n34#1:273,2\n37#1:275\n37#1:276,2\n40#1:278\n40#1:279,2\n49#1:281\n49#1:282,2\n52#1:284\n52#1:285,2\n55#1:287\n55#1:288,2\n58#1:290\n58#1:291,2\n61#1:293\n61#1:294,2\n64#1:296\n64#1:297,2\n67#1:299\n67#1:300,2\n72#1:302\n72#1:303,2\n*E\n"})
public final class MainRoomVM extends p396o0Oo0.OooOO0 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: bindMoreAccount$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState bindMoreAccount;

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
    private boolean isLoadingBindMoreAccount;
    private boolean isLoadingSignIn;

    /* JADX INFO: renamed from: isLoginState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isLoginState;

    @Nullable
    private MainDialogManager$Link lastLink;

    /* JADX INFO: renamed from: officialActionModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState officialActionModel;

    @NotNull
    private MutableState<Boolean> showBindMoreAccount;

    @Nullable
    private MainDialogManager$PriorityType showingPriorityType;

    /* JADX INFO: renamed from: userReturnModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState userReturnModel;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainRoomVM$loadSignIn$1", f = "MainRoomVM.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31238OooO0Oo;

        public OooO(Continuation<? super OooO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MainRoomVM.this.new OooO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31238OooO0Oo;
            MainRoomVM mainRoomVM = MainRoomVM.this;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (mainRoomVM.isLoadingSignIn) {
                    return Unit.INSTANCE;
                }
                mainRoomVM.isLoadingSignIn = true;
                o00OO0O0 o00oo0o1 = o00OO0O0.f46154OooO00o;
                this.f31238OooO0Oo = 1;
                o00oo0o1.getClass();
                String url = oo000o.OooO0OO("/Webservers/Task/SignInWhether");
                Intrinsics.checkNotNullParameter(url, "url");
                o0ooOOo o0ooooo = new o0ooOOo(url, 0);
                o0ooooo.OooO0O0(Boxing.boxInt(1), "type");
                obj = OooOOO.OooO0Oo(new MainRoomDialogRepo$signInWhether$$inlined$call$1(o0ooooo, null), this);
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
            String str = mainRoomVM.getDateFormat().format(new Date());
            CheckSignInModel checkSignInModel = (CheckSignInModel) apiResult.getData();
            if (checkSignInModel != null && checkSignInModel.getState() == 0) {
                mainRoomVM.setHaveSignIn(false);
                if (!mainRoomVM.getDialogShowWelcome() && !mainRoomVM.getDialogShowUserReturn() && !mainRoomVM.getDialogShowOfficialAction()) {
                    Intrinsics.checkNotNull(str);
                    mainRoomVM.dialogCheckInTaskForToDay = str;
                    mainRoomVM.setDialogShowCheckInTask(true);
                }
                mainRoomVM.setCheckVisibility(false, true);
                SharedMainMessageManager.INSTANCE.isSignIn().postValue(Boxing.boxBoolean(false));
            } else {
                mainRoomVM.setHaveSignIn(true);
                oO00OOO oo00oooOooOO0o = o00Oo0.OooOO0o();
                Intrinsics.checkNotNull(str);
                oo00oooOooOO0o.OooOOOo(str);
                mainRoomVM.loadTaskListData();
                SharedMainMessageManager.INSTANCE.isSignIn().postValue(Boxing.boxBoolean(true));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainRoomVM$loadAction$1", f = "MainRoomVM.kt", i = {}, l = {95, 116}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31240OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MainRoomVM f31241OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Function1<Boolean, Unit> f31242OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Function1<? super Boolean, Unit> function1, MainRoomVM mainRoomVM, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f31242OooO0o0 = function1;
            this.f31241OooO0o = mainRoomVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f31242OooO0o0, this.f31241OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:41:0x00db  */
        /* JADX WARN: Code duplicated, block: B:43:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:45:0x00e6  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OfficialActionModel officialActionModel;
            ApiResult apiResult;
            OfficialActionModel officialActionModel2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31240OooO0Oo;
            MainRoomVM mainRoomVM = this.f31241OooO0o;
            Function1<Boolean, Unit> function1 = this.f31242OooO0o0;
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
            o00OO0O0 o00oo0o1 = o00OO0O0.f46154OooO00o;
            this.f31240OooO0Oo = 1;
            o00oo0o1.getClass();
            String url = oo000o.OooO0OO("/Webservers/User/GetUserReturnInfo");
            Intrinsics.checkNotNullParameter(url, "url");
            o0ooOOo o0ooooo = new o0ooOOo(url, 0);
            o0ooooo.OooO0O0(Boxing.boxInt(0), "type");
            obj = OooOOO.OooO0Oo(new MainRoomDialogRepo$getUserReturnReward$$inlined$call$1(o0ooooo, null), this);
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
            o00OO0O0 o00oo0o2 = o00OO0O0.f46154OooO00o;
            this.f31240OooO0Oo = 2;
            o00oo0o2.getClass();
            String url2 = oo000o.OooO0OO("/Webservers/User/GetUserReturnInfo");
            Intrinsics.checkNotNullParameter(url2, "url");
            o0ooOOo o0ooooo2 = new o0ooOOo(url2, 0);
            o0ooooo2.OooO0O0(Boxing.boxInt(1), "type");
            obj = OooOOO.OooO0Oo(new MainRoomDialogRepo$getOfficialAction$$inlined$call$1(o0ooooo2, null), this);
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
        public final /* synthetic */ MainDialogManager$Link f31245OooO0o0;

        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MainDialogManager$Link.values().length];
                try {
                    iArr[MainDialogManager$Link.All.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MainDialogManager$Link.Action.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MainDialogManager$Link.SignIn.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MainDialogManager$Link mainDialogManager$Link) {
            super(0);
            this.f31245OooO0o0 = mainDialogManager$Link;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MainRoomVM mainRoomVM = MainRoomVM.this;
            MainDialogManager$Link mainDialogManager$Link = this.f31245OooO0o0;
            mainRoomVM.lastLink = mainDialogManager$Link;
            int i = OooO00o.$EnumSwitchMapping$0[mainDialogManager$Link.ordinal()];
            if (i == 1) {
                mainRoomVM.loadBindMoreAccount(new com.yalla.yalla.ui.vm.main.OooO0O0(mainRoomVM));
            } else if (i == 2) {
                MainRoomVM.loadAction$default(mainRoomVM, null, 1, null);
            } else if (i == 3) {
                mainRoomVM.checkState();
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainRoomVM$loadBindMoreAccount$1", f = "MainRoomVM.kt", i = {}, l = {246, 265}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31246OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f31247OooO0o;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f31249OooO0oO;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainRoomVM$loadBindMoreAccount$1$1", f = "MainRoomVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Ref.BooleanRef f31250OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ Function0<Unit> f31251OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(Ref.BooleanRef booleanRef, Function0<Unit> function0, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f31250OooO0Oo = booleanRef;
                this.f31251OooO0o0 = function0;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f31250OooO0Oo, this.f31251OooO0o0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Function0<Unit> function0;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                if (this.f31250OooO0Oo.element && (function0 = this.f31251OooO0o0) != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Ref.BooleanRef booleanRef, Function0<Unit> function0, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f31247OooO0o = booleanRef;
            this.f31249OooO0oO = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MainRoomVM.this.new OooO0o(this.f31247OooO0o, this.f31249OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0117 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OooO00o oooO00o;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31246OooO0Oo;
            Ref.BooleanRef booleanRef = this.f31247OooO0o;
            MainRoomVM mainRoomVM = MainRoomVM.this;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (!mainRoomVM.isLoadingBindMoreAccount) {
                mainRoomVM.isLoadingBindMoreAccount = true;
                o00OO0O0 o00oo0o1 = o00OO0O0.f46154OooO00o;
                this.f31246OooO0Oo = 1;
                o00oo0o1.getClass();
                String url = oo000o.OooO0OO("/Webservers/task/bindthirdtip");
                Intrinsics.checkNotNullParameter(url, "url");
                obj = OooOOO.OooO0Oo(new MainRoomDialogRepo$loadBindMoreAccount$$inlined$call$1(new o0ooOOo(url, 0), null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            oooO00o = new OooO00o(booleanRef, this.f31249OooO0oO, null);
            this.f31246OooO0Oo = 2;
            if (OooOOO.OooO0o0(oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
            ApiResult apiResult = (ApiResult) obj;
            mainRoomVM.isLoadingBindMoreAccount = false;
            if (apiResult.isSuccess() && apiResult.getData() != null) {
                BindMoreAccountModel bindMoreAccountModel = (BindMoreAccountModel) apiResult.getData();
                if (bindMoreAccountModel != null && bindMoreAccountModel.getIsShowDialog()) {
                    oO00OOO oo00oooOooOO0o = o00Oo0.OooOO0o();
                    BindMoreAccountModel bindMoreAccountModel2 = (BindMoreAccountModel) apiResult.getData();
                    int iOooO0o0 = o0OoOo0.OooO0o0(0, bindMoreAccountModel2 != null ? Boxing.boxInt(bindMoreAccountModel2.getLimit()) : null);
                    oo00oooOooOO0o.getClass();
                    oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
                    oo00oooOooOO0o.OooO0oO(iOooO0o0, "bindMoreAccountMaxCount" + oo0oO0.OooOOo0().getValue());
                    int iOooOO0o = o00Oo0.OooOO0o().OooOO0o();
                    int iOooOO0O = o00Oo0.OooOO0o().OooOO0O();
                    boolean z = oo0oO0.f47970OooO0Oo;
                    StringBuilder sbOooO00o = o00000.OooO00o("WRM loadBindMoreAccount \nbindMoreAccountMaxCount = ", iOooOO0o, " \nbindMoreAccountCount = ", iOooOO0O, " \nAccount.isFirstLogin = ");
                    sbOooO00o.append(z);
                    sbOooO00o.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
                    OooOOOO.OooO0O0(sbOooO00o.toString());
                    if (o00Oo0.OooOO0o().OooOO0o() > o00Oo0.OooOO0o().OooOO0O() && !oo0oO0.f47970OooO0Oo) {
                        mainRoomVM.getShowBindMoreAccount().setValue(Boxing.boxBoolean(true));
                        mainRoomVM.setBindMoreAccount((BindMoreAccountModel) apiResult.getData());
                        booleanRef.element = false;
                    }
                }
            }
            oooO00o = new OooO00o(booleanRef, this.f31249OooO0oO, null);
            this.f31246OooO0Oo = 2;
            if (OooOOO.OooO0o0(oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainRoomVM$loadTaskListData$1", f = "MainRoomVM.kt", i = {0}, l = {75}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class OooOO0 extends SuspendLambda implements Function2<o00OO00O<ApiResult<List<SignTaskModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31252OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31253OooO0o0;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0 oooOO1 = new OooOO0(continuation);
            oooOO1.f31253OooO0o0 = obj;
            return oooOO1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO00O<ApiResult<List<SignTaskModel>>> o00oo00o, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(o00oo00o, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO00O o00oo00o;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31252OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO00O o00oo00o2 = (o00OO00O) this.f31253OooO0o0;
                SignTaskRepository signTaskRepository = SignTaskRepository.f22672OooO00o;
                this.f31253OooO0o0 = o00oo00o2;
                this.f31252OooO0Oo = 1;
                signTaskRepository.getClass();
                Object objOooO0OO = SignTaskRepository.OooO0OO(1, this);
                if (objOooO0OO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo00o = o00oo00o2;
                obj = objOooO0OO;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo00o = (o00OO00O) this.f31253OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            oOOO00Oo.OooO00o(false, apiResult);
            o00oo00o.postValue(apiResult);
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
        this.showBindMoreAccount = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.bindMoreAccount = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        this.dialogOfficialActionShowForToDay = "";
        this.dialogCheckInTaskForToDay = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkState() {
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        if (Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.FALSE)) {
            return;
        }
        String str = this.dateFormat.format(new Date());
        if (Intrinsics.areEqual(this.dialogCheckInTaskForToDay, str)) {
            return;
        }
        Intrinsics.checkNotNull(str);
        this.dialogCheckInTaskForToDay = str;
        if (!Intrinsics.areEqual(str, o00Oo0.OooOO0o().OooOOO0())) {
            loadSignIn();
        } else {
            loadTaskListData();
            SharedMainMessageManager.INSTANCE.isSignIn().postValue(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadAction(Function1<? super Boolean, Unit> listener) {
        String str = this.dateFormat.format(new Date());
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        if (!Intrinsics.areEqual(oo0oO0.OooOo0O().getValue(), Boolean.TRUE) || Intrinsics.areEqual(this.dialogOfficialActionShowForToDay, str)) {
            return;
        }
        Intrinsics.checkNotNull(str);
        this.dialogOfficialActionShowForToDay = str;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO00o(listener, this, null), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadAction$default(MainRoomVM mainRoomVM, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        mainRoomVM.loadAction(function1);
    }

    public static /* synthetic */ void loadAll$default(MainRoomVM mainRoomVM, MainDialogManager$Link mainDialogManager$Link, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            mainDialogManager$Link = MainDialogManager$Link.All;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        mainRoomVM.loadAll(mainDialogManager$Link, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadBindMoreAccount(Function0<Unit> listener) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0o(booleanRef, listener, null), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadBindMoreAccount$default(MainRoomVM mainRoomVM, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        mainRoomVM.loadBindMoreAccount(function0);
    }

    private final void loadSignIn() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o00OO00O<ApiResult<List<SignTaskModel>>> loadTaskListData() {
        return oo0oOO0.OooO00o(this, new OooOO0(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final BindMoreAccountModel getBindMoreAccount() {
        return (BindMoreAccountModel) this.bindMoreAccount.getValue();
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

    @NotNull
    public final MutableState<Boolean> getShowBindMoreAccount() {
        return this.showBindMoreAccount;
    }

    @Nullable
    public final MainDialogManager$PriorityType getShowingPriorityType() {
        return this.showingPriorityType;
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

    public final void loadAll(@NotNull MainDialogManager$Link link, boolean reGet) {
        Intrinsics.checkNotNullParameter(link, "link");
        if (isLoginState()) {
            Boolean boolValueOf = Boolean.valueOf(reGet);
            OooO0O0 listener = new OooO0O0();
            Intrinsics.checkNotNullParameter(listener, "listener");
            if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
                listener.invoke();
            }
            MainDialogManager$Link mainDialogManager$Link = this.lastLink;
            OooO0OO listener2 = new OooO0OO(link);
            Intrinsics.checkNotNullParameter(listener2, "listener");
            if (mainDialogManager$Link == null) {
                listener2.invoke();
            }
        }
    }

    public final void setBindMoreAccount(@Nullable BindMoreAccountModel bindMoreAccountModel) {
        this.bindMoreAccount.setValue(bindMoreAccountModel);
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

    public final void setShowBindMoreAccount(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.showBindMoreAccount = mutableState;
    }

    public final void setShowingPriorityType(@Nullable MainDialogManager$PriorityType mainDialogManager$PriorityType) {
        this.showingPriorityType = mainDialogManager$PriorityType;
    }

    public final void setUserReturnModel(@Nullable OfficialActionModel officialActionModel) {
        this.userReturnModel.setValue(officialActionModel);
    }
}
