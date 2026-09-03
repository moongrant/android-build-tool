package com.yalla.yalla.ui.vm.main;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import com.yalla.yalla.common.manager.data.SharedMainMessageManager;
import com.yalla.yalla.common.model.Error;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.data.repository.SignTaskRepository$getRandomRoomData$$inlined$call$1;
import com.yalla.yalla.data.repository.SignTaskRepository$getRewardCrystal$$inlined$call$1;
import com.yalla.yalla.data.repository.SignTaskRepository$loadSignDayData$$inlined$call$1;
import com.yalla.yalla.data.repository.SignTaskRepository$loadTaskListData$$inlined$call$1;
import com.yalla.yalla.data.repository.SignTaskRepository$signIn$$inlined$call$1;
import com.yalla.yalla.model.CheckInAddUpWeekModel;
import com.yalla.yalla.model.RandomRoomModel;
import com.yalla.yalla.model.SignInModel;
import com.yalla.yalla.model.TaskModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p495o0o00OOO.Oooo0;
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.OooOOO;
import p499o0o00OoO.o00000OO;
import p520o0o0O0O0.o00O0000;
import p617o0oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0003J+\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\f\"\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014J\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00142\u0006\u0010\u001d\u001a\u00020\u0010R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010$\u001a\n #*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/yalla/yalla/ui/vm/main/SignTaskVM;", "Lo00OO/OooO00o;", "Lcom/yalla/yalla/common/model/Response;", "Lcom/yalla/yalla/model/SignInModel;", "it", "", "updateSignData", "data", "Landroid/text/SpannableStringBuilder;", "getGoldCrystalTips", "", "string", "", "replaces", "getSpannableStringBuilder", "(Ljava/lang/String;[Ljava/lang/String;)Landroid/text/SpannableStringBuilder;", "", "isDaily", "", "delay", "Lo0o00OOO/Oooo0;", "", "Lcom/yalla/yalla/model/TaskModel;", "loadTaskListData", "Lcom/yalla/yalla/model/CheckInAddUpWeekModel;", "loadSignDayData", "signIn", "Lcom/yalla/yalla/model/RandomRoomModel;", "getRandomRoomData", "taskId", "", "getRewardCrystal", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", "kotlin.jvm.PlatformType", "currentTime", "Ljava/lang/String;", "getHasSignInToday", "()Z", "hasSignInToday", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class SignTaskVM extends o00OO.OooO00o {
    public static final int $stable = 8;
    private final String currentTime;

    @NotNull
    private final SimpleDateFormat dateFormat;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SignTaskVM$signIn$1$1", f = "SignTaskVM.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25546Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Oooo0<SignInModel> f25547Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ SignTaskVM f25548Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Oooo0<SignInModel> oooo0, SignTaskVM signTaskVM, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f25547Oooo0oO = oooo0;
            this.f25548Oooo0oo = signTaskVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(this.f25547Oooo0oO, this.f25548Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25546Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00O0000 o00o0001 = o00O0000.f42672OooO00o;
                this.f25546Oooo0o = 1;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new SignTaskRepository$signIn$$inlined$call$1(o00o0001, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Oooo0<SignInModel> oooo0 = this.f25547Oooo0oO;
            SignTaskVM signTaskVM = this.f25548Oooo0oo;
            Response response = (Response) obj;
            oooo0.postValue((SignInModel) response);
            signTaskVM.updateSignData(response);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SignTaskVM$getRandomRoomData$1$1", f = "SignTaskVM.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Oooo0 f25549Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25550Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Oooo0<RandomRoomModel> f25551Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Oooo0<RandomRoomModel> oooo0, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25551Oooo0oo = oooo0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f25551Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Oooo0 oooo0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25550Oooo0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0<RandomRoomModel> oooo1 = this.f25551Oooo0oo;
                o00O0000 o00o0001 = o00O0000.f42672OooO00o;
                this.f25549Oooo0o = oooo1;
                this.f25550Oooo0oO = 1;
                Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new SignTaskRepository$getRandomRoomData$$inlined$call$1(o00o0001, null), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooo0 = oooo1;
                obj = objWithContext;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooo0 = this.f25549Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            oooo0.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SignTaskVM$getRewardCrystal$1$1", f = "SignTaskVM.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f25552Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Oooo0 f25553Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25554Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Oooo0<Long> f25555Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Oooo0<Long> oooo0, int i, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f25555Oooo0oo = oooo0;
            this.f25552Oooo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f25555Oooo0oo, this.f25552Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Oooo0 oooo0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25554Oooo0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0<Long> oooo1 = this.f25555Oooo0oo;
                o00O0000 o00o0001 = o00O0000.f42672OooO00o;
                int i2 = this.f25552Oooo;
                this.f25553Oooo0o = oooo1;
                this.f25554Oooo0oO = 1;
                Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new SignTaskRepository$getRewardCrystal$$inlined$call$1(o00o0001, null, i2), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooo0 = oooo1;
                obj = objWithContext;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooo0 = this.f25553Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            Response response = (Response) obj;
            if (response.getIsSuccess() && response.getData() != null) {
                OooOOO.f41216OooO00o.OooO0o().postValue(response.getData());
            }
            oooo0.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SignTaskVM$loadSignDayData$1$1", f = "SignTaskVM.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Oooo0 f25556Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25557Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Oooo0<CheckInAddUpWeekModel> f25558Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Oooo0<CheckInAddUpWeekModel> oooo0, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f25558Oooo0oo = oooo0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f25558Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Oooo0 oooo0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25557Oooo0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0<CheckInAddUpWeekModel> oooo1 = this.f25558Oooo0oo;
                o00O0000 o00o0001 = o00O0000.f42672OooO00o;
                this.f25556Oooo0o = oooo1;
                this.f25557Oooo0oO = 1;
                Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new SignTaskRepository$loadSignDayData$$inlined$call$1(o00o0001, null), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooo0 = oooo1;
                obj = objWithContext;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooo0 = this.f25556Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            oooo0.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SignTaskVM$loadTaskListData$1$1", f = "SignTaskVM.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ boolean f25559Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25560Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f25561Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Oooo0<List<TaskModel>> f25562Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i, Oooo0<List<TaskModel>> oooo0, boolean z, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f25561Oooo0oO = i;
            this.f25562Oooo0oo = oooo0;
            this.f25559Oooo = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f25561Oooo0oO, this.f25562Oooo0oo, this.f25559Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25560Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00O0000 o00o0001 = o00O0000.f42672OooO00o;
                int i2 = this.f25561Oooo0oO;
                this.f25560Oooo0o = 1;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new SignTaskRepository$loadTaskListData$$inlined$call$1(o00o0001, null, i2), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Oooo0<List<TaskModel>> oooo0 = this.f25562Oooo0oo;
            boolean z = this.f25559Oooo;
            Response response = (Response) obj;
            oooo0.postValue((List<TaskModel>) response);
            o00O000o.OooO00o(response, z);
            return Unit.INSTANCE;
        }
    }

    public SignTaskVM() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+02"));
        this.dateFormat = simpleDateFormat;
        this.currentTime = simpleDateFormat.format(new Date());
    }

    public static /* synthetic */ Oooo0 loadTaskListData$default(SignTaskVM signTaskVM, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return signTaskVM.loadTaskListData(i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSignData(Response<SignInModel> it) {
        Integer code2;
        if (!it.getIsSuccess() || it.getData() == null) {
            Error error = it.getError();
            boolean z = false;
            if (error != null && (code2 = error.getCode()) != null && 1090 == code2.intValue()) {
                z = true;
            }
            if (z) {
                OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
                o00000OO o00000ooOooOOO0 = OooOOO0.OooOOO0();
                String currentTime = this.currentTime;
                Intrinsics.checkNotNullExpressionValue(currentTime, "currentTime");
                o00000ooOooOOO0.OooOOOO(currentTime);
                return;
            }
            return;
        }
        SignInModel data = it.getData();
        Intrinsics.checkNotNull(data);
        SignInModel signInModel = data;
        OooOOO0 oooOOO1 = OooOOO0.f41180OooO00o;
        o00000OO o00000ooOooOOO1 = OooOOO0.OooOOO0();
        String currentTime2 = this.currentTime;
        Intrinsics.checkNotNullExpressionValue(currentTime2, "currentTime");
        o00000ooOooOOO1.OooOOOO(currentTime2);
        SharedMainMessageManager.INSTANCE.isSignIn().postValue(Boolean.TRUE);
        if (signInModel.getChangeCoin() > 0) {
            OooOOO.f41216OooO00o.OooO0OO().postValue(Long.valueOf(signInModel.getBalance()));
        }
        if (signInModel.getChangeCrystal() > 0) {
            OooOOO.f41216OooO00o.OooO0o().postValue(Long.valueOf(signInModel.getCrystalBalance()));
        }
    }

    @Nullable
    public final SpannableStringBuilder getGoldCrystalTips(@NotNull SignInModel data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.getChangeCoin() != 0 && data.getChangeCrystal() != 0) {
            return getSpannableStringBuilder(OooOo.OooO00o(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.check_in_ss), String.valueOf(data.getChangeCoin())), String.valueOf(data.getChangeCrystal())), String.valueOf(data.getChangeCoin()), String.valueOf(data.getChangeCrystal()));
        }
        if (data.getChangeCoin() != 0) {
            return getSpannableStringBuilder(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.check_in_c), String.valueOf(data.getChangeCoin())), String.valueOf(data.getChangeCoin()));
        }
        if (data.getChangeCrystal() != 0) {
            return getSpannableStringBuilder(OooOo.OooO00o(o000O0O0.OooO0OO(R.string.check_in_s), String.valueOf(data.getChangeCrystal())), String.valueOf(data.getChangeCrystal()));
        }
        return null;
    }

    public final boolean getHasSignInToday() {
        String str = this.currentTime;
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        return Intrinsics.areEqual(str, OooOOO0.OooOOO0().OooOO0O());
    }

    @NotNull
    public final Oooo0<RandomRoomModel> getRandomRoomData() {
        Oooo0<RandomRoomModel> oooo0 = new Oooo0<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(oooo0, null), 3, null);
        return oooo0;
    }

    @NotNull
    public final Oooo0<Long> getRewardCrystal(int taskId) {
        Oooo0<Long> oooo0 = new Oooo0<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(oooo0, taskId, null), 3, null);
        return oooo0;
    }

    @Nullable
    public final SpannableStringBuilder getSpannableStringBuilder(@NotNull String string, @NotNull String... replaces) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(replaces, "replaces");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        Iterator it = ArrayIteratorKt.iterator(replaces);
        while (it.hasNext()) {
            try {
                String str = (String) it.next();
                int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) string, str, 0, false, 6, (Object) null);
                int length = str.length() + iIndexOf$default;
                spannableStringBuilder.setSpan(new ForegroundColorSpan(o000O0O0.OooO00o(R.color.color_FE6C6C)), iIndexOf$default, length, 33);
                spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf$default, length, 33);
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(18, true), iIndexOf$default, length, 33);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return spannableStringBuilder;
    }

    @NotNull
    public final Oooo0<CheckInAddUpWeekModel> loadSignDayData() {
        Oooo0<CheckInAddUpWeekModel> oooo0 = new Oooo0<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0OO(oooo0, null), 3, null);
        return oooo0;
    }

    @NotNull
    public final Oooo0<List<TaskModel>> loadTaskListData(int isDaily, boolean delay) {
        Oooo0<List<TaskModel>> oooo0 = new Oooo0<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0o(isDaily, oooo0, delay, null), 3, null);
        return oooo0;
    }

    @NotNull
    public final Oooo0<SignInModel> signIn() {
        Oooo0<SignInModel> oooo0 = new Oooo0<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO(oooo0, this, null), 3, null);
        return oooo0;
    }
}
