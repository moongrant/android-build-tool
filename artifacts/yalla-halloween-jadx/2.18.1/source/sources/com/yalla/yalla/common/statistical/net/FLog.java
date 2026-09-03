package com.yalla.yalla.common.statistical.net;

import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.fragment.ContributionFragment;
import com.common.support.apmwrapper.model.NormalLogModel;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.yalla.support.common.util.NetworkUtil;
import com.yalla.support.common.util.OooOO0O;
import com.yalla.yalla.common.statistical.event.ImEventType;
import com.yalla.yalla.common.statistical.event.NetWorkMonitorEventType;
import com.yalla.yalla.common.statistical.event.RoomEventType;
import com.yalla.yalla.common.statistical.event.WebEventType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.TimeoutKt;
import o0.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p487o0o000oO.o0OOO0o;
import p498o0o00Oo0.OooOOO;
import p530o0o0OOO.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0004J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00172\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00192\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u001bJ \u0010\u001c\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J0\u0010\u001c\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J\u0016\u0010!\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u0004J(\u0010!\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u0004J\u0016\u0010\"\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006#"}, d2 = {"Lcom/yalla/yalla/common/statistical/net/FLog;", "", "()V", "LEVEL_ERROR", "", "LEVEL_INFO", "dataFormat", "Ljava/text/SimpleDateFormat;", "getDataFormat", "()Ljava/text/SimpleDateFormat;", "dataFormat$delegate", "Lkotlin/Lazy;", "apiBusinessErrorLog", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "equipPhoneInfo", "logInfo", "Lcom/common/support/apmwrapper/model/NormalLogModel;", "imLog", ViewHierarchyConstants.TAG_KEY, "Lcom/yalla/yalla/common/statistical/event/ImEventType;", "logFormattedDate", "networkMonitorLog", "Lcom/yalla/yalla/common/statistical/event/NetWorkMonitorEventType;", "roomLog", "Lcom/yalla/yalla/common/statistical/event/RoomEventType;", "webLog", "Lcom/yalla/yalla/common/statistical/event/WebEventType;", "write", "Lcom/yalla/yalla/common/statistical/net/NetStateExceptionTypeE;", "level", ContributionFragment.ARG_1, "roomIdx", "writeE", "writeI", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class FLog {

    @NotNull
    private static final String LEVEL_ERROR = "ERROR";

    @NotNull
    private static final String LEVEL_INFO = "INFO";

    @NotNull
    public static final FLog INSTANCE = new FLog();

    /* JADX INFO: renamed from: dataFormat$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy dataFormat = LazyKt.lazy(new Function0<SimpleDateFormat>() { // from class: com.yalla.yalla.common.statistical.net.FLog$dataFormat$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final SimpleDateFormat invoke() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.ENGLISH);
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            return simpleDateFormat;
        }
    });
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.yalla.yalla.common.statistical.net.FLog$equipPhoneInfo$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.statistical.net.FLog$equipPhoneInfo$1", f = "FLog.kt", i = {}, l = {119, 122, 125}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ NormalLogModel $logInfo;
        public Object L$0;
        public int label;

        /* JADX INFO: renamed from: com.yalla.yalla.common.statistical.net.FLog$equipPhoneInfo$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.yalla.yalla.common.statistical.net.FLog$equipPhoneInfo$1$1", f = "FLog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C02181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int label;

            public C02181(Continuation<? super C02181> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C02181(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                return ((C02181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(OooOO0O.OooO00o("www.1688.com"));
            }
        }

        /* JADX INFO: renamed from: com.yalla.yalla.common.statistical.net.FLog$equipPhoneInfo$1$2, reason: invalid class name */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.yalla.yalla.common.statistical.net.FLog$equipPhoneInfo$1$2", f = "FLog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int label;

            public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass2(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(OooOO0O.OooO00o("8.8.8.8"));
            }
        }

        /* JADX INFO: renamed from: com.yalla.yalla.common.statistical.net.FLog$equipPhoneInfo$1$3, reason: invalid class name */
        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.yalla.yalla.common.statistical.net.FLog$equipPhoneInfo$1$3", f = "FLog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int label;

            public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new AnonymousClass3(continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(OooOO0O.OooO00o("api.yalla.live"));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NormalLogModel normalLogModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$logInfo = normalLogModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.$logInfo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:33:0x00d4 A[Catch: Exception -> 0x0104, NumberFormatException -> 0x0109, TryCatch #2 {NumberFormatException -> 0x0109, Exception -> 0x0104, blocks: (B:8:0x0018, B:41:0x00ec, B:13:0x0029, B:33:0x00d4, B:16:0x0032, B:29:0x00c2, B:19:0x003a, B:23:0x005c, B:25:0x00b0, B:22:0x0058), top: B:49:0x000c }] */
        /* JADX WARN: Code duplicated, block: B:35:0x00e3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:36:0x00e4  */
        /* JADX WARN: Code duplicated, block: B:38:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:39:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:40:0x00eb A[PHI: r1
          0x00eb: PHI (r1v19 com.common.support.apmwrapper.model.NormalLogModel) = 
          (r1v14 com.common.support.apmwrapper.model.NormalLogModel)
          (r1v15 com.common.support.apmwrapper.model.NormalLogModel)
          (r1v16 com.common.support.apmwrapper.model.NormalLogModel)
          (r1v20 com.common.support.apmwrapper.model.NormalLogModel)
         binds: [B:24:0x00ae, B:28:0x00c0, B:32:0x00d2, B:38:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            NormalLogModel normalLogModel;
            NormalLogModel normalLogModel2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z = true;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.$logInfo.setTime(FLog.INSTANCE.logFormattedDate());
                    NormalLogModel normalLogModel3 = this.$logInfo;
                    Long value = OooOOO.f41216OooO00o.OooOo().getValue();
                    normalLogModel3.setUser_id(value == null ? 0L : value.longValue());
                    NormalLogModel normalLogModel4 = this.$logInfo;
                    o0OOO0o o0ooo0o2 = o0OOO0o.f40936OooO00o;
                    normalLogModel4.setApp_version(String.valueOf(o0OOO0o.OooO00o()));
                    this.$logInfo.setPlatform("Android " + Build.VERSION.RELEASE);
                    this.$logInfo.setNetwork_type(NetworkUtil.f20498OooO00o.OooO0OO() + "");
                    normalLogModel = this.$logInfo;
                    if (Intrinsics.areEqual(FLog.LEVEL_INFO, normalLogModel.getLevel())) {
                        normalLogModel2 = normalLogModel;
                    } else {
                        C02181 c02181 = new C02181(null);
                        this.L$0 = normalLogModel;
                        this.label = 1;
                        obj = TimeoutKt.withTimeoutOrNull(5000L, c02181, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    normalLogModel2.setNetwork_available(z);
                    this.$logInfo.put("operator", NetworkUtil.f20498OooO00o.OooO0Oo());
                    OooO00o oooO00o = OooO00o.f26553OooO0O0;
                    OooO00o.OooO00o(this.$logInfo);
                    return Unit.INSTANCE;
                }
                if (i == 1) {
                    normalLogModel = (NormalLogModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i == 2) {
                        normalLogModel = (NormalLogModel) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        if (obj == null) {
                            AnonymousClass3 anonymousClass3 = new AnonymousClass3(null);
                            this.L$0 = normalLogModel;
                            this.label = 3;
                            obj = TimeoutKt.withTimeoutOrNull(5000L, anonymousClass3, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            normalLogModel2 = normalLogModel;
                        } else {
                            normalLogModel2 = normalLogModel;
                        }
                        normalLogModel2.setNetwork_available(z);
                        this.$logInfo.put("operator", NetworkUtil.f20498OooO00o.OooO0Oo());
                        OooO00o oooO00o2 = OooO00o.f26553OooO0O0;
                        OooO00o.OooO00o(this.$logInfo);
                        return Unit.INSTANCE;
                    }
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    normalLogModel2 = (NormalLogModel) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                if (obj != null) {
                    normalLogModel = normalLogModel2;
                    normalLogModel2 = normalLogModel;
                } else {
                    z = false;
                }
                normalLogModel2.setNetwork_available(z);
                this.$logInfo.put("operator", NetworkUtil.f20498OooO00o.OooO0Oo());
                OooO00o oooO00o3 = OooO00o.f26553OooO0O0;
                OooO00o.OooO00o(this.$logInfo);
                return Unit.INSTANCE;
                if (obj == null) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
                    this.L$0 = normalLogModel;
                    this.label = 2;
                    obj = TimeoutKt.withTimeoutOrNull(5000L, anonymousClass2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (obj == null) {
                        AnonymousClass3 anonymousClass4 = new AnonymousClass3(null);
                        this.L$0 = normalLogModel;
                        this.label = 3;
                        obj = TimeoutKt.withTimeoutOrNull(5000L, anonymousClass4, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        normalLogModel2 = normalLogModel;
                        if (obj != null) {
                            normalLogModel = normalLogModel2;
                            normalLogModel2 = normalLogModel;
                        } else {
                            z = false;
                        }
                    } else {
                        normalLogModel2 = normalLogModel;
                    }
                } else {
                    normalLogModel2 = normalLogModel;
                }
                normalLogModel2.setNetwork_available(z);
                this.$logInfo.put("operator", NetworkUtil.f20498OooO00o.OooO0Oo());
                OooO00o oooO00o4 = OooO00o.f26553OooO0O0;
                OooO00o.OooO00o(this.$logInfo);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return Unit.INSTANCE;
        }
    }

    private FLog() {
    }

    public static /* synthetic */ void apiBusinessErrorLog$default(FLog fLog, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        fLog.apiBusinessErrorLog(str);
    }

    private final void equipPhoneInfo(NormalLogModel logInfo) {
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new AnonymousClass1(logInfo, null), 2, null);
    }

    private final SimpleDateFormat getDataFormat() {
        return (SimpleDateFormat) dataFormat.getValue();
    }

    public static /* synthetic */ void roomLog$default(FLog fLog, RoomEventType roomEventType, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        fLog.roomLog(roomEventType, str);
    }

    private final void write(NetStateExceptionTypeE tag, String message, String level) {
        NormalLogModel normalLogModel = new NormalLogModel();
        normalLogModel.setLevel(level);
        normalLogModel.setTag(tag.toString());
        normalLogModel.setMessage(message);
        equipPhoneInfo(normalLogModel);
    }

    public final void apiBusinessErrorLog(@Nullable String message) {
        NormalLogModel normalLogModel = new NormalLogModel();
        normalLogModel.setLevel(LEVEL_ERROR);
        normalLogModel.setMessage(message);
        normalLogModel.setTag(WebEventType.Http_Business_Error.toString());
        equipPhoneInfo(normalLogModel);
    }

    public final void imLog(@NotNull ImEventType tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        NormalLogModel normalLogModel = new NormalLogModel();
        normalLogModel.setLevel(LEVEL_ERROR);
        normalLogModel.setTag(tag.toString());
        equipPhoneInfo(normalLogModel);
    }

    @NotNull
    public final String logFormattedDate() {
        String str = getDataFormat().format(new Date(System.currentTimeMillis()));
        Intrinsics.checkNotNullExpressionValue(str, "dataFormat.format(Date(S…tem.currentTimeMillis()))");
        return str;
    }

    public final void networkMonitorLog(@NotNull NetWorkMonitorEventType tag, @Nullable String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        NormalLogModel normalLogModel = new NormalLogModel();
        normalLogModel.setLevel(LEVEL_ERROR);
        normalLogModel.setTag(tag.toString());
        normalLogModel.setMessage(message);
        equipPhoneInfo(normalLogModel);
    }

    public final void roomLog(@NotNull RoomEventType tag, @Nullable String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        NormalLogModel normalLogModel = new NormalLogModel();
        normalLogModel.setLevel(LEVEL_ERROR);
        normalLogModel.setTag(tag.toString());
        normalLogModel.setMessage(message);
        o00OO00O.OooO00o oooO00o = o00OO00O.f43313OooooOo;
        normalLogModel.put("room_id", String.valueOf(oooO00o.OooO00o().f43319OooO0Oo.getValue()));
        normalLogModel.put("room_idx", String.valueOf(oooO00o.OooO00o().f43318OooO0OO.getValue()));
        equipPhoneInfo(normalLogModel);
    }

    public final void webLog(@NotNull WebEventType tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        NormalLogModel normalLogModel = new NormalLogModel();
        normalLogModel.setLevel(LEVEL_ERROR);
        normalLogModel.setTag(tag.toString());
        equipPhoneInfo(normalLogModel);
    }

    public final void writeE(@NotNull String tag, @NotNull String message, @NotNull String roomId, @Nullable String roomIdx) {
        com.facebook.OooO00o.OooO0O0(tag, ViewHierarchyConstants.TAG_KEY, message, ShareConstants.WEB_DIALOG_PARAM_MESSAGE, roomId, ContributionFragment.ARG_1);
        if (roomIdx == null) {
            roomIdx = "";
        }
        write(tag, message, roomId, roomIdx, LEVEL_ERROR);
    }

    public final void writeI(@NotNull NetStateExceptionTypeE tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        write(tag, message, LEVEL_INFO);
    }

    private final void write(String tag, String message, String roomId, String roomIdx, String level) {
        NormalLogModel normalLogModel = new NormalLogModel();
        normalLogModel.setLevel(level);
        normalLogModel.setTag(tag);
        normalLogModel.setMessage(message);
        normalLogModel.put("room_id", roomId);
        normalLogModel.put("room_idx", roomIdx);
        equipPhoneInfo(normalLogModel);
    }

    public final void writeE(@NotNull NetStateExceptionTypeE tag, @NotNull String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        write(tag, message, LEVEL_ERROR);
    }
}
