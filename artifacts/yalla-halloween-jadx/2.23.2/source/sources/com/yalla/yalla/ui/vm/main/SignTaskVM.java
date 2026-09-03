package com.yalla.yalla.ui.vm.main;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooOOO;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
import com.yalla.yalla.data.repository.SignTaskRepository;
import com.yalla.yalla.data.repository.SignTaskRepository$getRandomRoomData$$inlined$call$1;
import com.yalla.yalla.data.repository.SignTaskRepository$getRewardCrystal$$inlined$call$1;
import com.yalla.yalla.data.repository.SignTaskRepository$loadSignDayData$$inlined$call$1;
import com.yalla.yalla.data.repository.SignTaskRepository$signIn$$inlined$call$1;
import com.yalla.yalla.model.CheckInAddUpWeekModel;
import com.yalla.yalla.model.RandomRoomModel;
import com.yalla.yalla.model.SignInModel;
import com.yalla.yalla.model.SignTaskModel;
import com.yalla.yalla.model.http.ApiResult;
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
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p394o0Oo0.OooOO0;
import p414o0Oo0oO.oO00OOO;
import p415o0Oo0oO0.o00Ooo;
import p424o0OoO0Oo.o00O;
import p424o0OoO0Oo.o00OO0O0;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p590o0oOooo0.w0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0003J+\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\f\"\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012J\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00020\u0014J\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0014J\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00020\u0014J\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0010R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010$\u001a\n #*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/yalla/yalla/ui/vm/main/SignTaskVM;", "Lo0Oo0/OooOO0;", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/SignInModel;", "it", "", "updateSignData", "data", "Landroid/text/SpannableStringBuilder;", "getGoldCrystalTips", "", "string", "", "replaces", "getSpannableStringBuilder", "(Ljava/lang/String;[Ljava/lang/String;)Landroid/text/SpannableStringBuilder;", "", "isDaily", "", "delay", "Lo0OoO0Oo/o00OO0O0;", "", "Lcom/yalla/yalla/model/SignTaskModel;", "loadTaskListData", "Lcom/yalla/yalla/model/CheckInAddUpWeekModel;", "loadSignDayData", "signIn", "Lcom/yalla/yalla/model/RandomRoomModel;", "getRandomRoomData", "taskId", "", "getRewardCrystal", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", "kotlin.jvm.PlatformType", "currentTime", "Ljava/lang/String;", "getHasSignInToday", "()Z", "hasSignInToday", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSignTaskVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignTaskVM.kt\ncom/yalla/yalla/ui/vm/main/SignTaskVM\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
public final class SignTaskVM extends OooOO0 {
    public static final int $stable = 8;
    private final String currentTime;

    @NotNull
    private final SimpleDateFormat dateFormat;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SignTaskVM$signIn$1", f = "SignTaskVM.kt", i = {0}, l = {104}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class OooO extends SuspendLambda implements Function2<o00OO0O0<ApiResult<SignInModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31323OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31325OooO0o0;

        public OooO(Continuation<? super OooO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = SignTaskVM.this.new OooO(continuation);
            oooO.f31325OooO0o0 = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<SignInModel>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooO) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31323OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0O0 o00oo0o2 = (o00OO0O0) this.f31325OooO0o0;
                SignTaskRepository signTaskRepository = SignTaskRepository.f22667OooO00o;
                this.f31325OooO0o0 = o00oo0o2;
                this.f31323OooO0Oo = 1;
                signTaskRepository.getClass();
                String url = oo000o.OooO0OO("/Webservers/Task/SignIn");
                Intrinsics.checkNotNullParameter(url, "url");
                Object objOooO0Oo = OooOOO.OooO0Oo(new SignTaskRepository$signIn$$inlined$call$1(new o0ooOOo(url, 0), null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (o00OO0O0) this.f31325OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            SignTaskVM.this.updateSignData(apiResult);
            o00oo0o1.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SignTaskVM$getRandomRoomData$1", f = "SignTaskVM.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<o00OO0O0<ApiResult<RandomRoomModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31326OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31327OooO0o0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f31327OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<RandomRoomModel>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31326OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0O0 o00oo0o2 = (o00OO0O0) this.f31327OooO0o0;
                SignTaskRepository signTaskRepository = SignTaskRepository.f22667OooO00o;
                this.f31327OooO0o0 = o00oo0o2;
                this.f31326OooO0Oo = 1;
                signTaskRepository.getClass();
                String url = oo000o.OooO0OO("/Webservers/Bar/TaskBar");
                Intrinsics.checkNotNullParameter(url, "url");
                Object objOooO0Oo = OooOOO.OooO0Oo(new SignTaskRepository$getRandomRoomData$$inlined$call$1(new o0ooOOo(url, 0), null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (o00OO0O0) this.f31327OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            o00oo0o1.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SignTaskVM$getRewardCrystal$1", f = "SignTaskVM.kt", i = {0}, l = {124}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<o00OO0O0<ApiResult<Long>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31328OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f31329OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31330OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f31329OooO0o = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f31329OooO0o, continuation);
            oooO0O0.f31330OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<Long>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31328OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0O0 o00oo0o2 = (o00OO0O0) this.f31330OooO0o0;
                SignTaskRepository signTaskRepository = SignTaskRepository.f22667OooO00o;
                this.f31330OooO0o0 = o00oo0o2;
                this.f31328OooO0Oo = 1;
                signTaskRepository.getClass();
                String url = oo000o.OooO0OO("/Webservers/Task/TaskGetCoin");
                Intrinsics.checkNotNullParameter(url, "url");
                o0ooOOo o0ooooo = new o0ooOOo(url, 0);
                o0ooooo.OooO0O0(Boxing.boxInt(this.f31329OooO0o), "taskid");
                Object objOooO0Oo = OooOOO.OooO0Oo(new SignTaskRepository$getRewardCrystal$$inlined$call$1(o0ooooo, null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (o00OO0O0) this.f31330OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess() && apiResult.getData() != null) {
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                o0O00oO0.OooO0Oo().postValue(apiResult.getData());
            }
            o00oo0o1.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SignTaskVM$loadSignDayData$1", f = "SignTaskVM.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<o00OO0O0<ApiResult<CheckInAddUpWeekModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31331OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31332OooO0o0;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(continuation);
            oooO0OO.f31332OooO0o0 = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<CheckInAddUpWeekModel>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31331OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0O0 o00oo0o2 = (o00OO0O0) this.f31332OooO0o0;
                SignTaskRepository signTaskRepository = SignTaskRepository.f22667OooO00o;
                this.f31332OooO0o0 = o00oo0o2;
                this.f31331OooO0Oo = 1;
                signTaskRepository.getClass();
                String url = oo000o.OooO0OO("/Webservers/Task/CheckInAddupWeek");
                Intrinsics.checkNotNullParameter(url, "url");
                Object objOooO0Oo = OooOOO.OooO0Oo(new SignTaskRepository$loadSignDayData$$inlined$call$1(new o0ooOOo(url, 0), null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (o00OO0O0) this.f31332OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            o00oo0o1.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SignTaskVM$loadTaskListData$1", f = "SignTaskVM.kt", i = {0}, l = {94}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class OooO0o extends SuspendLambda implements Function2<o00OO0O0<ApiResult<List<SignTaskModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31333OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f31334OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31335OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f31336OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i, boolean z, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f31334OooO0o = i;
            this.f31336OooO0oO = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f31334OooO0o, this.f31336OooO0oO, continuation);
            oooO0o.f31335OooO0o0 = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<List<SignTaskModel>>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31333OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0O0 o00oo0o2 = (o00OO0O0) this.f31335OooO0o0;
                SignTaskRepository signTaskRepository = SignTaskRepository.f22667OooO00o;
                this.f31335OooO0o0 = o00oo0o2;
                this.f31333OooO0Oo = 1;
                signTaskRepository.getClass();
                Object objOooO0OO = SignTaskRepository.OooO0OO(this.f31334OooO0o, this);
                if (objOooO0OO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
                obj = objOooO0OO;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (o00OO0O0) this.f31335OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            w0.OooO00o(this.f31336OooO0oO, apiResult);
            o00oo0o1.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    public SignTaskVM() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+02"));
        this.dateFormat = simpleDateFormat;
        this.currentTime = simpleDateFormat.format(new Date());
    }

    public static /* synthetic */ o00OO0O0 loadTaskListData$default(SignTaskVM signTaskVM, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return signTaskVM.loadTaskListData(i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSignData(ApiResult<SignInModel> it) {
        if (!it.isSuccess() || it.getData() == null) {
            if (1090 == it.getError().getCode()) {
                oO00OOO oo00oooOooOO0o = o00Ooo.OooOO0o();
                String currentTime = this.currentTime;
                Intrinsics.checkNotNullExpressionValue(currentTime, "currentTime");
                oo00oooOooOO0o.OooOOOo(currentTime);
                return;
            }
            return;
        }
        SignInModel data = it.getData();
        Intrinsics.checkNotNull(data);
        SignInModel signInModel = data;
        oO00OOO oo00oooOooOO0o2 = o00Ooo.OooOO0o();
        String currentTime2 = this.currentTime;
        Intrinsics.checkNotNullExpressionValue(currentTime2, "currentTime");
        oo00oooOooOO0o2.OooOOOo(currentTime2);
        SharedMainMessageManager.INSTANCE.isSignIn().postValue(Boolean.TRUE);
        if (signInModel.getChangeCoin() > 0) {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            o0O00oO0.OooO0O0().postValue(Long.valueOf(signInModel.getBalance()));
        }
        if (signInModel.getChangeCrystal() > 0) {
            o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
            o0O00oO0.OooO0Oo().postValue(Long.valueOf(signInModel.getCrystalBalance()));
        }
    }

    @Nullable
    public final SpannableStringBuilder getGoldCrystalTips(@NotNull SignInModel data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.getChangeCoin() != 0 && data.getChangeCrystal() != 0) {
            return getSpannableStringBuilder(o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(o000000.check_in_ss), String.valueOf(data.getChangeCoin())), String.valueOf(data.getChangeCrystal())), String.valueOf(data.getChangeCoin()), String.valueOf(data.getChangeCrystal()));
        }
        if (data.getChangeCoin() != 0) {
            return getSpannableStringBuilder(o0000O.OooO00o(o0000.OooO0OO(o000000.check_in_c), String.valueOf(data.getChangeCoin())), String.valueOf(data.getChangeCoin()));
        }
        if (data.getChangeCrystal() != 0) {
            return getSpannableStringBuilder(o0000O.OooO00o(o0000.OooO0OO(o000000.check_in_s), String.valueOf(data.getChangeCrystal())), String.valueOf(data.getChangeCrystal()));
        }
        return null;
    }

    public final boolean getHasSignInToday() {
        return Intrinsics.areEqual(this.currentTime, o00Ooo.OooOO0o().OooOOO0());
    }

    @NotNull
    public final o00OO0O0<ApiResult<RandomRoomModel>> getRandomRoomData() {
        return o00O.OooO00o(this, new OooO00o(null));
    }

    @NotNull
    public final o00OO0O0<ApiResult<Long>> getRewardCrystal(int taskId) {
        return o00O.OooO00o(this, new OooO0O0(taskId, null));
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
                spannableStringBuilder.setSpan(new ForegroundColorSpan(o0000.OooO00o(o0OOO0o.color_FE6C6C)), iIndexOf$default, length, 33);
                spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf$default, length, 33);
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(18, true), iIndexOf$default, length, 33);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return spannableStringBuilder;
    }

    @NotNull
    public final o00OO0O0<ApiResult<CheckInAddUpWeekModel>> loadSignDayData() {
        return o00O.OooO00o(this, new OooO0OO(null));
    }

    @NotNull
    public final o00OO0O0<ApiResult<List<SignTaskModel>>> loadTaskListData(int isDaily, boolean delay) {
        return o00O.OooO00o(this, new OooO0o(isDaily, delay, null));
    }

    @NotNull
    public final o00OO0O0<ApiResult<SignInModel>> signIn() {
        return o00O.OooO00o(this, new OooO(null));
    }
}
