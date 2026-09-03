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
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p394o0Oo00oO.o0O0O00;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o0000O00;
import p420o0OoO0OO.o0OO00O;
import p420o0OoO0OO.o0ooOOo;
import p464o0Oooo.o000000O;
import p579o0oOoo.oOOO0OO0;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b)\u0010*J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0003J+\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\f\"\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012J\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00020\u0014J\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0014J\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00020\u0014J\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0010R\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010$\u001a\n #*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0011\u0010(\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/yalla/yalla/ui/vm/main/SignTaskVM;", "Lo0Oo00oO/o0O0O00;", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/SignInModel;", "it", "", "updateSignData", "data", "Landroid/text/SpannableStringBuilder;", "getGoldCrystalTips", "", "string", "", "replaces", "getSpannableStringBuilder", "(Ljava/lang/String;[Ljava/lang/String;)Landroid/text/SpannableStringBuilder;", "", "isDaily", "", "delay", "Lo0OoO0OO/o0OO00O;", "", "Lcom/yalla/yalla/model/SignTaskModel;", "loadTaskListData", "Lcom/yalla/yalla/model/CheckInAddUpWeekModel;", "loadSignDayData", "signIn", "Lcom/yalla/yalla/model/RandomRoomModel;", "getRandomRoomData", "taskId", "", "getRewardCrystal", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", "kotlin.jvm.PlatformType", "currentTime", "Ljava/lang/String;", "getHasSignInToday", "()Z", "hasSignInToday", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSignTaskVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignTaskVM.kt\ncom/yalla/yalla/ui/vm/main/SignTaskVM\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,130:1\n1#2:131\n*E\n"})
public final class SignTaskVM extends o0O0O00 {
    public static final int $stable = 8;
    private final String currentTime;

    @NotNull
    private final SimpleDateFormat dateFormat;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SignTaskVM$signIn$1", f = "SignTaskVM.kt", i = {0}, l = {104}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class OooO extends SuspendLambda implements Function2<o0OO00O<ApiResult<SignInModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31858OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31860OooO0o0;

        public OooO(Continuation<? super OooO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = SignTaskVM.this.new OooO(continuation);
            oooO.f31860OooO0o0 = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0OO00O<ApiResult<SignInModel>> o0oo00o2, Continuation<? super Unit> continuation) {
            return ((OooO) create(o0oo00o2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OO00O o0oo00o2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31858OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0OO00O o0oo00o3 = (o0OO00O) this.f31860OooO0o0;
                SignTaskRepository signTaskRepository = SignTaskRepository.f23136OooO00o;
                this.f31860OooO0o0 = o0oo00o3;
                this.f31858OooO0Oo = 1;
                signTaskRepository.getClass();
                String url = o000OOo0.OooO0OO("/Webservers/Task/SignIn");
                Intrinsics.checkNotNullParameter(url, "url");
                Object objOooO0Oo = OooOOO.OooO0Oo(new SignTaskRepository$signIn$$inlined$call$1(new o0O0ooO(url, 0), null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o0oo00o2 = o0oo00o3;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0oo00o2 = (o0OO00O) this.f31860OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            SignTaskVM.this.updateSignData(apiResult);
            o0oo00o2.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SignTaskVM$getRandomRoomData$1", f = "SignTaskVM.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<o0OO00O<ApiResult<RandomRoomModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31861OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31862OooO0o0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f31862OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0OO00O<ApiResult<RandomRoomModel>> o0oo00o2, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o0oo00o2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OO00O o0oo00o2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31861OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0OO00O o0oo00o3 = (o0OO00O) this.f31862OooO0o0;
                SignTaskRepository signTaskRepository = SignTaskRepository.f23136OooO00o;
                this.f31862OooO0o0 = o0oo00o3;
                this.f31861OooO0Oo = 1;
                signTaskRepository.getClass();
                String url = o000OOo0.OooO0OO("/Webservers/Bar/TaskBar");
                Intrinsics.checkNotNullParameter(url, "url");
                Object objOooO0Oo = OooOOO.OooO0Oo(new SignTaskRepository$getRandomRoomData$$inlined$call$1(new o0O0ooO(url, 0), null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o0oo00o2 = o0oo00o3;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0oo00o2 = (o0OO00O) this.f31862OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            o0oo00o2.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SignTaskVM$getRewardCrystal$1", f = "SignTaskVM.kt", i = {0}, l = {124}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<o0OO00O<ApiResult<Long>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31863OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f31864OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31865OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f31864OooO0o = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f31864OooO0o, continuation);
            oooO0O0.f31865OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0OO00O<ApiResult<Long>> o0oo00o2, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(o0oo00o2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OO00O o0oo00o2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31863OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0OO00O o0oo00o3 = (o0OO00O) this.f31865OooO0o0;
                SignTaskRepository signTaskRepository = SignTaskRepository.f23136OooO00o;
                this.f31865OooO0o0 = o0oo00o3;
                this.f31863OooO0Oo = 1;
                signTaskRepository.getClass();
                String url = o000OOo0.OooO0OO("/Webservers/Task/TaskGetCoin");
                Intrinsics.checkNotNullParameter(url, "url");
                o0O0ooO o0o0ooo = new o0O0ooO(url, 0);
                o0o0ooo.OooO0O0(Boxing.boxInt(this.f31864OooO0o), "taskid");
                Object objOooO0Oo = OooOOO.OooO0Oo(new SignTaskRepository$getRewardCrystal$$inlined$call$1(o0o0ooo, null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o0oo00o2 = o0oo00o3;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0oo00o2 = (o0OO00O) this.f31865OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess() && apiResult.getData() != null) {
                o000000O o000000o2 = o000000O.f46674OooO00o;
                o000000O.OooO0Oo().postValue(apiResult.getData());
            }
            o0oo00o2.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SignTaskVM$loadSignDayData$1", f = "SignTaskVM.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<o0OO00O<ApiResult<CheckInAddUpWeekModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31866OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31867OooO0o0;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(continuation);
            oooO0OO.f31867OooO0o0 = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0OO00O<ApiResult<CheckInAddUpWeekModel>> o0oo00o2, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(o0oo00o2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OO00O o0oo00o2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31866OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0OO00O o0oo00o3 = (o0OO00O) this.f31867OooO0o0;
                SignTaskRepository signTaskRepository = SignTaskRepository.f23136OooO00o;
                this.f31867OooO0o0 = o0oo00o3;
                this.f31866OooO0Oo = 1;
                signTaskRepository.getClass();
                String url = o000OOo0.OooO0OO("/Webservers/Task/CheckInAddupWeek");
                Intrinsics.checkNotNullParameter(url, "url");
                Object objOooO0Oo = OooOOO.OooO0Oo(new SignTaskRepository$loadSignDayData$$inlined$call$1(new o0O0ooO(url, 0), null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o0oo00o2 = o0oo00o3;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0oo00o2 = (o0OO00O) this.f31867OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            o0oo00o2.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.SignTaskVM$loadTaskListData$1", f = "SignTaskVM.kt", i = {0}, l = {94}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class OooO0o extends SuspendLambda implements Function2<o0OO00O<ApiResult<List<SignTaskModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31868OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f31869OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31870OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f31871OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i, boolean z, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f31869OooO0o = i;
            this.f31871OooO0oO = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f31869OooO0o, this.f31871OooO0oO, continuation);
            oooO0o.f31870OooO0o0 = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o0OO00O<ApiResult<List<SignTaskModel>>> o0oo00o2, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(o0oo00o2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o0OO00O o0oo00o2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31868OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0OO00O o0oo00o3 = (o0OO00O) this.f31870OooO0o0;
                SignTaskRepository signTaskRepository = SignTaskRepository.f23136OooO00o;
                this.f31870OooO0o0 = o0oo00o3;
                this.f31868OooO0Oo = 1;
                signTaskRepository.getClass();
                Object objOooO0OO = SignTaskRepository.OooO0OO(this.f31869OooO0o, this);
                if (objOooO0OO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o0oo00o2 = o0oo00o3;
                obj = objOooO0OO;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0oo00o2 = (o0OO00O) this.f31870OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            oOOO0OO0.OooO00o(this.f31871OooO0oO, apiResult);
            o0oo00o2.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    public SignTaskVM() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+02"));
        this.dateFormat = simpleDateFormat;
        this.currentTime = simpleDateFormat.format(new Date());
    }

    public static /* synthetic */ o0OO00O loadTaskListData$default(SignTaskVM signTaskVM, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return signTaskVM.loadTaskListData(i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSignData(ApiResult<SignInModel> it) {
        if (!it.isSuccess() || it.getData() == null) {
            if (1090 == it.getError().getCode()) {
                o0000O00 o0000o00OooOO0o = o00Oo0.OooOO0o();
                String currentTime = this.currentTime;
                Intrinsics.checkNotNullExpressionValue(currentTime, "currentTime");
                o0000o00OooOO0o.OooOOO(currentTime);
                return;
            }
            return;
        }
        SignInModel data = it.getData();
        Intrinsics.checkNotNull(data);
        SignInModel signInModel = data;
        o0000O00 o0000o00OooOO0o2 = o00Oo0.OooOO0o();
        String currentTime2 = this.currentTime;
        Intrinsics.checkNotNullExpressionValue(currentTime2, "currentTime");
        o0000o00OooOO0o2.OooOOO(currentTime2);
        SharedMainMessageManager.INSTANCE.isSignIn().postValue(Boolean.TRUE);
        if (signInModel.getChangeCoin() > 0) {
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o000000O.OooO0O0().postValue(Long.valueOf(signInModel.getBalance()));
        }
        if (signInModel.getChangeCrystal() > 0) {
            o000000O o000000o3 = o000000O.f46674OooO00o;
            o000000O.OooO0Oo().postValue(Long.valueOf(signInModel.getCrystalBalance()));
        }
    }

    @Nullable
    public final SpannableStringBuilder getGoldCrystalTips(@NotNull SignInModel data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.getChangeCoin() != 0 && data.getChangeCrystal() != 0) {
            return getSpannableStringBuilder(o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.check_in_ss), String.valueOf(data.getChangeCoin())), String.valueOf(data.getChangeCrystal())), String.valueOf(data.getChangeCoin()), String.valueOf(data.getChangeCrystal()));
        }
        if (data.getChangeCoin() != 0) {
            return getSpannableStringBuilder(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.check_in_c), String.valueOf(data.getChangeCoin())), String.valueOf(data.getChangeCoin()));
        }
        if (data.getChangeCrystal() != 0) {
            return getSpannableStringBuilder(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.check_in_s), String.valueOf(data.getChangeCrystal())), String.valueOf(data.getChangeCrystal()));
        }
        return null;
    }

    public final boolean getHasSignInToday() {
        return Intrinsics.areEqual(this.currentTime, o00Oo0.OooOO0o().OooOO0O());
    }

    @NotNull
    public final o0OO00O<ApiResult<RandomRoomModel>> getRandomRoomData() {
        return o0ooOOo.OooO00o(this, new OooO00o(null));
    }

    @NotNull
    public final o0OO00O<ApiResult<Long>> getRewardCrystal(int taskId) {
        return o0ooOOo.OooO00o(this, new OooO0O0(taskId, null));
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
                spannableStringBuilder.setSpan(new ForegroundColorSpan(o0000.OooO00o(oO00O0o.color_FE6C6C)), iIndexOf$default, length, 33);
                spannableStringBuilder.setSpan(new StyleSpan(1), iIndexOf$default, length, 33);
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(18, true), iIndexOf$default, length, 33);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return spannableStringBuilder;
    }

    @NotNull
    public final o0OO00O<ApiResult<CheckInAddUpWeekModel>> loadSignDayData() {
        return o0ooOOo.OooO00o(this, new OooO0OO(null));
    }

    @NotNull
    public final o0OO00O<ApiResult<List<SignTaskModel>>> loadTaskListData(int isDaily, boolean delay) {
        return o0ooOOo.OooO00o(this, new OooO0o(isDaily, delay, null));
    }

    @NotNull
    public final o0OO00O<ApiResult<SignInModel>> signIn() {
        return o0ooOOo.OooO00o(this, new OooO(null));
    }
}
