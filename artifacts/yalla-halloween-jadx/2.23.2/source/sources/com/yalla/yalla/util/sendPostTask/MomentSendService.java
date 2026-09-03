package com.yalla.yalla.util.sendPostTask;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.code.android.util.o0OoOo0;
import com.common.support.apm.Sailfish;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.data.repository.MomentSendRepo;
import com.yalla.yalla.data.repository.MomentSendRepo$changeImagesUrl$$inlined$call$1;
import com.yalla.yalla.manager.cloud_file.CloudFileType;
import com.yalla.yalla.model.MomentSelectMedia;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentSendContentModel;
import com.yalla.yalla.model.moment.MomentSendModel;
import com.yalla.yalla.model.moment.MomentSendResultModel;
import com.yalla.yalla.model.moment.MomentSendState;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.repository.CloudFileRepo;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p414o0Oo0oO.oO00O0o0;
import p415o0Oo0oO0.o00Ooo;
import p423o0OoO0OO.o0000O0;
import p438o0OoOOoO.o0O00O0o;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p598o0oo00Oo.o0000O00;
import p602o0oo00oo.o0000OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/util/sendPostTask/MomentSendService;", "Landroid/app/IntentService;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMomentSendService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentSendService.kt\ncom/yalla/yalla/util/sendPostTask/MomentSendService\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,295:1\n1855#2,2:296\n1864#2,3:298\n1855#2,2:301\n*S KotlinDebug\n*F\n+ 1 MomentSendService.kt\ncom/yalla/yalla/util/sendPostTask/MomentSendService\n*L\n186#1:296,2\n223#1:298,3\n247#1:301,2\n*E\n"})
public final class MomentSendService extends IntentService {

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final /* synthetic */ int f32346OooO0oo = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f32347OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final CloudFileRepo f32348OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f32349OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final ArrayList f32350OooO0oO;

    @DebugMetadata(c = "com.yalla.yalla.util.sendPostTask.MomentSendService$refreshMomentDetail$1", f = "MomentSendService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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
            String strOooO0OO = o0000.OooO0OO(o000000.send_successfully);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {
        @JvmStatic
        public static void OooO00o(@NotNull Context context, @NotNull MomentSendModel sendPostModel, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sendPostModel, "sendPostModel");
            Intent intent = new Intent(context, (Class<?>) MomentSendService.class);
            intent.putExtra("DATA", sendPostModel);
            intent.putExtra("IsAdd", z);
            context.startService(intent);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.util.sendPostTask.MomentSendService", f = "MomentSendService.kt", i = {0, 0}, l = {266}, m = "changeImageUrl", n = {"this", "isVideo"}, s = {"L$0", "Z$0"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public MomentSendService f32351OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f32352OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f32353OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f32355OooO0oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32352OooO0o = obj;
            this.f32355OooO0oo |= Integer.MIN_VALUE;
            int i = MomentSendService.f32346OooO0oo;
            return MomentSendService.this.OooO00o(null, null, false, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.util.sendPostTask.MomentSendService$onHandleIntent$1", f = "MomentSendService.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32356OooO0Oo;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MomentSendService.this.new OooO0OO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32356OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f32356OooO0Oo = 1;
                int i2 = MomentSendService.f32346OooO0oo;
                if (MomentSendService.this.OooO0o0(this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.yalla.yalla.util.sendPostTask.MomentSendService", f = "MomentSendService.kt", i = {0, 0}, l = {170}, m = "reSendUploadImage", n = {"this", "sendPostModel"}, s = {"L$0", "L$1"})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public MomentSendService f32358OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f32359OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public MomentSendModel f32360OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f32362OooO0oo;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32359OooO0o = obj;
            this.f32362OooO0oo |= Integer.MIN_VALUE;
            int i = MomentSendService.f32346OooO0oo;
            return MomentSendService.this.OooO0O0(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.util.sendPostTask.MomentSendService", f = "MomentSendService.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3}, l = {100, 107, 113, 132, 161}, m = "sendContent", n = {"this", "sendPostModel", "this", "sendPostModel", "sendPost", "this", "sendPostModel", "data", "this", "sendPostModel"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"})
    public static final class OooOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f32363OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public MomentSendService f32364OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Object f32365OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public MomentSendModel f32366OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public /* synthetic */ Object f32367OooO0oO;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32367OooO0oO = obj;
            this.f32363OooO |= Integer.MIN_VALUE;
            int i = MomentSendService.f32346OooO0oo;
            return MomentSendService.this.OooO0Oo(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.util.sendPostTask.MomentSendService$sendContent$2", f = "MomentSendService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0O(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooOO0O(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String strOooO0OO = o0000.OooO0OO(o000000.Share_Shared_successfully);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.util.sendPostTask.MomentSendService$sendContent$5", f = "MomentSendService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooOOO(Continuation<? super OooOOO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooOOO(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String strOooO0OO = o0000.OooO0OO(o000000.Share_Failed_to_share);
            if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.util.sendPostTask.MomentSendService$sendContent$3$1", f = "MomentSendService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentSendModel f32369OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(MomentSendModel momentSendModel, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f32369OooO0Oo = momentSendModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO0(this.f32369OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String circleName;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String strOooO0OO = o0000.OooO0OO(o000000.post_send_and_follow_topic);
            String[] strArr = new String[1];
            MomentSendContentModel content = this.f32369OooO0Oo.getContent();
            if (content == null || (circleName = content.getCircleName()) == null) {
                circleName = "";
            }
            strArr[0] = circleName;
            String strOooO00o = o0000O.OooO00o(strOooO0OO, strArr);
            if (!StringsKt.isBlank(strOooO00o)) {
                o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO00o, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.util.sendPostTask.MomentSendService", f = "MomentSendService.kt", i = {0, 1}, l = {90, 92, 95}, m = "sendMomentTask", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class OooOOOO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public MomentSendService f32370OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32372OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f32373OooO0oO;

        public OooOOOO(Continuation<? super OooOOOO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32372OooO0o0 = obj;
            this.f32373OooO0oO |= Integer.MIN_VALUE;
            int i = MomentSendService.f32346OooO0oo;
            return MomentSendService.this.OooO0o0(this);
        }
    }

    public static final class OooOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ String f32374OooO;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<String> f32376OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<String> f32377OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f32378OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MomentSendModel f32379OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(Ref.ObjectRef<String> objectRef, Ref.ObjectRef<String> objectRef2, String str, MomentSendModel momentSendModel, String str2) {
            super(0);
            this.f32377OooO0o0 = objectRef;
            this.f32376OooO0o = objectRef2;
            this.f32378OooO0oO = str;
            this.f32379OooO0oo = momentSendModel;
            this.f32374OooO = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            App app = App.f22232OooO0o;
            Intrinsics.checkNotNullExpressionValue(app, "getContext(...)");
            int i = MomentSendService.f32346OooO0oo;
            MomentSendService.this.getClass();
            String strPublicIpAddress = Sailfish.INSTANCE.netDiagService(app).publicIpAddress();
            if (strPublicIpAddress == null) {
                strPublicIpAddress = "";
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Ref.ObjectRef<String> objectRef = this.f32377OooO0o0;
            linkedHashMap.put("VideoSize", objectRef.element);
            Ref.ObjectRef<String> objectRef2 = this.f32376OooO0o;
            linkedHashMap.put("VideoDuration", objectRef2.element);
            linkedHashMap.put("Ip", strPublicIpAddress);
            linkedHashMap.put("StartTime", this.f32378OooO0oO);
            MomentSendModel momentSendModel = this.f32379OooO0oo;
            linkedHashMap.put("UploadId", String.valueOf(momentSendModel.getTaskId()));
            o0oo0000.OooO00o.OooO0OO("206001", linkedHashMap);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("VideoSize", objectRef.element);
            linkedHashMap2.put("VideoDuration", objectRef2.element);
            linkedHashMap2.put("Ip", strPublicIpAddress);
            linkedHashMap2.put("EndTime", this.f32374OooO);
            linkedHashMap2.put("UploadId", String.valueOf(momentSendModel.getTaskId()));
            o0000O00.OooO0O0("WRM uploadImage \nextInfoStart = " + p187o00o00o0.OooO.OooO00o(linkedHashMap) + ", \nextInfoEnd  = " + p187o00o00o0.OooO.OooO00o(linkedHashMap));
            o0oo0000.OooO00o.OooO0OO("206002", linkedHashMap2);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.util.sendPostTask.MomentSendService", f = "MomentSendService.kt", i = {0, 0, 0, 0, 0, 0}, l = {198, 234}, m = "uploadImage", n = {"this", "sendPostModel", "videoSize", "videoDuration", "uploadStartTime", "isVideo"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
    public static final class OooOo00 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f32380OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public MomentSendService f32381OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Ref.ObjectRef f32382OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public MomentSendModel f32383OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Ref.ObjectRef f32384OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public String f32385OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public /* synthetic */ Object f32386OooOO0;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f32388OooOO0o;

        public OooOo00(Continuation<? super OooOo00> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f32386OooOO0 = obj;
            this.f32388OooOO0o |= Integer.MIN_VALUE;
            int i = MomentSendService.f32346OooO0oo;
            return MomentSendService.this.OooO0o(null, this);
        }
    }

    public MomentSendService() {
        super("MomentSendService");
        this.f32347OooO0Oo = "MomentSendService";
        this.f32348OooO0o = new CloudFileRepo();
        this.f32350OooO0oO = new ArrayList();
    }

    public static void OooO0OO(MomentSendModel momentSendModel) {
        if (momentSendModel.getPostId() <= 0) {
            return;
        }
        com.code.android.util.OooOOO.OooO0OO(CoroutineScopeKt.MainScope(), new OooO(null));
        LiveEventBus.get("Post_send_success").post(momentSendModel);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object OooO00o(MomentSendModel momentSendModel, List<p182o00o000O.OooO0o> list, boolean z, Continuation<? super Boolean> continuation) {
        OooO0O0 oooO0O0;
        MomentSendService momentSendService;
        boolean z2 = z ? 1 : 0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f32355OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f32355OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objOooO0Oo = oooO0O0.f32352OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f32355OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            boolean z3 = false;
            String str = list.get(0).f38404OooO0O0;
            String strSubstring = str.substring(0, StringsKt__StringsKt.lastIndexOf$default(str, "/", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            StringBuffer stringBuffer = new StringBuffer();
            StringBuffer stringBuffer2 = new StringBuffer();
            StringBuffer stringBuffer3 = new StringBuffer();
            for (p182o00o000O.OooO0o oooO0o : list) {
                if (stringBuffer.length() > 0 ? true : z3) {
                    stringBuffer.append("|");
                }
                String strSubstring2 = oooO0o.OooO00o().substring(StringsKt__StringsKt.lastIndexOf$default(oooO0o.OooO00o(), "/", 0, false, 6, (Object) null) + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                stringBuffer.append(strSubstring2);
                if (stringBuffer2.length() > 0 ? true : z3) {
                    stringBuffer2.append("|");
                }
                stringBuffer2.append(oooO0o.f38406OooO0Oo + "*" + oooO0o.f38408OooO0o0);
                if (stringBuffer3.length() > 0) {
                    stringBuffer3.append("|");
                }
                stringBuffer3.append(String.valueOf(oooO0o.f38407OooO0o));
                o0000O00.OooO0O0(this.f32347OooO0Oo + " uploadFile = " + oooO0o);
                z3 = false;
            }
            String strValueOf = String.valueOf(momentSendModel.getPostId());
            String string = stringBuffer.toString();
            String string2 = stringBuffer2.toString();
            String string3 = stringBuffer2.toString();
            String string4 = stringBuffer3.toString();
            oooO0O0.f32351OooO0Oo = this;
            oooO0O0.f32353OooO0o0 = z2;
            oooO0O0.f32355OooO0oo = 1;
            String url = oo000o.OooO0Oo("/Webservers/Resource/PicSet");
            Intrinsics.checkNotNullParameter(url, "url");
            o0ooOOo o0ooooo = new o0ooOOo(url, 0);
            o0ooooo.OooO0O0(strValueOf, "dyid");
            o0ooooo.OooO0O0(Boxing.boxInt(z ? 1 : 0), "isVideo");
            o0ooooo.OooO0O0(strSubstring, "fileName");
            o0ooooo.OooO0O0(string, "pNumber");
            if (z2) {
                o0ooooo.OooO0O0(string3, "videoSize");
                o0ooooo.OooO0O0(string4, "videoDuration");
            } else {
                o0ooooo.OooO0O0(string2, "size");
            }
            objOooO0Oo = com.code.android.util.OooOOO.OooO0Oo(new MomentSendRepo$changeImagesUrl$$inlined$call$1(o0ooooo, null), oooO0O0);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
            momentSendService = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = oooO0O0.f32353OooO0o0;
            momentSendService = oooO0O0.f32351OooO0Oo;
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        o0000O00.OooO0O0(momentSendService.f32347OooO0Oo + " changeImageUrl : isSuccess=\t" + apiResult.isSuccess());
        if (z2 && apiResult.isSuccess()) {
            oO00O0o0 oo00o0o0OooO = o00Ooo.OooO();
            oo00o0o0OooO.getClass();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            oo00o0o0OooO.OooO0o("sendMomentAnimIconForVideoSendSuccess" + o0O00oO0.OooOOo0().getValue(), true);
        }
        return Boxing.boxBoolean(apiResult.isSuccess());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0065 A[PHI: r5
      0x0065: PHI (r5v1 com.yalla.yalla.model.moment.MomentSendModel) = (r5v0 com.yalla.yalla.model.moment.MomentSendModel), (r5v3 com.yalla.yalla.model.moment.MomentSendModel) binds: [B:15:0x0041, B:21:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object OooO0O0(MomentSendModel momentSendModel, Continuation<? super Unit> continuation) throws Throwable {
        OooO0o oooO0o;
        MomentSendService momentSendService;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i = oooO0o.f32362OooO0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f32362OooO0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        Object objOooO0o = oooO0o.f32359OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0o.f32362OooO0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0o);
            if (!momentSendModel.getListSendPostMedia().isEmpty()) {
                oooO0o.f32358OooO0Oo = this;
                oooO0o.f32360OooO0o0 = momentSendModel;
                oooO0o.f32362OooO0oo = 1;
                objOooO0o = OooO0o(momentSendModel, oooO0o);
                if (objOooO0o == coroutine_suspended) {
                    return coroutine_suspended;
                }
                momentSendService = this;
            } else {
                momentSendModel.setSendPostState(MomentSendState.FailedImage);
                o0000OO0.OooO0OO(momentSendModel);
                LiveEventBus.get("Post_send_filed").post(momentSendModel);
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        momentSendModel = oooO0o.f32360OooO0o0;
        momentSendService = oooO0o.f32358OooO0Oo;
        ResultKt.throwOnFailure(objOooO0o);
        if (((Boolean) objOooO0o).booleanValue()) {
            momentSendModel.setSendPostState(MomentSendState.Success);
            momentSendService.getClass();
            OooO0OO(momentSendModel);
        } else {
            momentSendModel.setSendPostState(MomentSendState.FailedImage);
            o0000OO0.OooO0OO(momentSendModel);
            LiveEventBus.get("Post_send_filed").post(momentSendModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0118  */
    /* JADX WARN: Code duplicated, block: B:50:0x011e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0135 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x013c  */
    /* JADX WARN: Code duplicated, block: B:58:0x014e  */
    /* JADX WARN: Code duplicated, block: B:60:0x015c  */
    /* JADX WARN: Code duplicated, block: B:62:0x016a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x016b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0174  */
    /* JADX WARN: Code duplicated, block: B:67:0x0180  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object OooO0Oo(MomentSendModel momentSendModel, Continuation<? super Unit> continuation) throws Throwable {
        OooOO0 oooOO1;
        MomentSendService momentSendService;
        ApiResult apiResult;
        MomentSendService momentSendService2;
        MomentSendModel momentSendModel2;
        ApiResult apiResult2;
        MomentSendResultModel momentSendResultModel;
        MainCoroutineDispatcher main;
        OooOOO0 oooOOO0;
        MomentSendModel momentSendModel3;
        MomentSendService momentSendService3;
        String dyid;
        MomentSendModel momentSendModel4 = momentSendModel;
        if (continuation instanceof OooOO0) {
            oooOO1 = (OooOO0) continuation;
            int i = oooOO1.f32363OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO1.f32363OooO = i - Integer.MIN_VALUE;
            } else {
                oooOO1 = new OooOO0(continuation);
            }
        } else {
            oooOO1 = new OooOO0(continuation);
        }
        Object objOooO00o = oooOO1.f32367OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOO1.f32363OooO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO00o);
            oooOO1.f32364OooO0Oo = this;
            oooOO1.f32366OooO0o0 = momentSendModel4;
            oooOO1.f32363OooO = 1;
            objOooO00o = MomentSendRepo.OooO00o(momentSendModel4, oooOO1);
            if (objOooO00o == coroutine_suspended) {
                return coroutine_suspended;
            }
            momentSendService = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    apiResult2 = (ApiResult) oooOO1.f32365OooO0o;
                    momentSendModel2 = oooOO1.f32366OooO0o0;
                    momentSendService2 = oooOO1.f32364OooO0Oo;
                    ResultKt.throwOnFailure(objOooO00o);
                    apiResult = apiResult2;
                    momentSendResultModel = (MomentSendResultModel) apiResult.getData();
                    if (momentSendResultModel != null) {
                        if (momentSendResultModel.getJoinedCircle()) {
                            main = Dispatchers.getMain();
                            oooOOO0 = new OooOOO0(momentSendModel2, null);
                            oooOO1.f32364OooO0Oo = momentSendService2;
                            oooOO1.f32366OooO0o0 = momentSendModel2;
                            oooOO1.f32365OooO0o = momentSendResultModel;
                            oooOO1.f32363OooO = 3;
                            if (BuildersKt.withContext(main, oooOOO0, oooOO1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        dyid = momentSendResultModel.getDyid();
                        if (dyid != null) {
                            momentSendModel2.setPostId(o0OoOo0.OooO(0L, dyid));
                        }
                    }
                    momentSendModel3 = momentSendModel2;
                    if (momentSendModel3.getListSendPostMedia().isEmpty()) {
                        momentSendModel3.setSendPostState(MomentSendState.Success);
                        momentSendService2.getClass();
                        OooO0OO(momentSendModel3);
                        return Unit.INSTANCE;
                    }
                    oooOO1.f32364OooO0Oo = momentSendService2;
                    oooOO1.f32366OooO0o0 = momentSendModel3;
                    oooOO1.f32365OooO0o = null;
                    oooOO1.f32363OooO = 4;
                    objOooO00o = momentSendService2.OooO0o(momentSendModel3, oooOO1);
                    if (objOooO00o == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    momentSendService3 = momentSendService2;
                } else if (i2 == 3) {
                    momentSendResultModel = (MomentSendResultModel) oooOO1.f32365OooO0o;
                    momentSendModel2 = oooOO1.f32366OooO0o0;
                    momentSendService2 = oooOO1.f32364OooO0Oo;
                    ResultKt.throwOnFailure(objOooO00o);
                    dyid = momentSendResultModel.getDyid();
                    if (dyid != null) {
                        momentSendModel2.setPostId(o0OoOo0.OooO(0L, dyid));
                    }
                    momentSendModel3 = momentSendModel2;
                    if (momentSendModel3.getListSendPostMedia().isEmpty()) {
                        momentSendModel3.setSendPostState(MomentSendState.Success);
                        momentSendService2.getClass();
                        OooO0OO(momentSendModel3);
                        return Unit.INSTANCE;
                    }
                    oooOO1.f32364OooO0Oo = momentSendService2;
                    oooOO1.f32366OooO0o0 = momentSendModel3;
                    oooOO1.f32365OooO0o = null;
                    oooOO1.f32363OooO = 4;
                    objOooO00o = momentSendService2.OooO0o(momentSendModel3, oooOO1);
                    if (objOooO00o == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    momentSendService3 = momentSendService2;
                } else {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(objOooO00o);
                        return Unit.INSTANCE;
                    }
                    momentSendModel3 = oooOO1.f32366OooO0o0;
                    momentSendService3 = oooOO1.f32364OooO0Oo;
                    ResultKt.throwOnFailure(objOooO00o);
                }
                if (((Boolean) objOooO00o).booleanValue()) {
                    momentSendModel3.setSendPostState(MomentSendState.Success);
                    momentSendService3.getClass();
                    OooO0OO(momentSendModel3);
                } else {
                    momentSendModel3.setSendPostState(MomentSendState.FailedImage);
                    o0000OO0.OooO0OO(momentSendModel3);
                    LiveEventBus.get("Post_send_filed").post(momentSendModel3);
                }
                return Unit.INSTANCE;
            }
            momentSendModel4 = oooOO1.f32366OooO0o0;
            momentSendService = oooOO1.f32364OooO0Oo;
            ResultKt.throwOnFailure(objOooO00o);
        }
        apiResult = (ApiResult) objOooO00o;
        String str = momentSendService.f32347OooO0Oo;
        boolean zIsSuccess = apiResult.isSuccess();
        MomentSendResultModel momentSendResultModel2 = (MomentSendResultModel) apiResult.getData();
        String dyid2 = momentSendResultModel2 != null ? momentSendResultModel2.getDyid() : null;
        MomentSendResultModel momentSendResultModel3 = (MomentSendResultModel) apiResult.getData();
        o0000O00.OooO0O0(str + " sendPost : \tisSuccess=" + zIsSuccess + "\tdyid=" + dyid2 + "\tisJoinedCircle=" + (momentSendResultModel3 != null ? Boxing.boxBoolean(momentSendResultModel3.getJoinedCircle()) : null));
        if (apiResult.isSuccess()) {
            o0oo0000.OooO00o.OooO0O0("103012");
            if (momentSendModel4.getType() == MomentType.Event.getValue() && momentSendModel4.getShareType() == 20) {
                MainCoroutineDispatcher main2 = Dispatchers.getMain();
                OooOO0O oooOO0O = new OooOO0O(null);
                oooOO1.f32364OooO0Oo = momentSendService;
                oooOO1.f32366OooO0o0 = momentSendModel4;
                oooOO1.f32365OooO0o = apiResult;
                oooOO1.f32363OooO = 2;
                if (BuildersKt.withContext(main2, oooOO0O, oooOO1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                momentSendService2 = momentSendService;
                momentSendModel2 = momentSendModel4;
                apiResult2 = apiResult;
                apiResult = apiResult2;
            } else {
                momentSendService2 = momentSendService;
                momentSendModel2 = momentSendModel4;
            }
            momentSendResultModel = (MomentSendResultModel) apiResult.getData();
            if (momentSendResultModel != null) {
                if (momentSendResultModel.getJoinedCircle()) {
                    main = Dispatchers.getMain();
                    oooOOO0 = new OooOOO0(momentSendModel2, null);
                    oooOO1.f32364OooO0Oo = momentSendService2;
                    oooOO1.f32366OooO0o0 = momentSendModel2;
                    oooOO1.f32365OooO0o = momentSendResultModel;
                    oooOO1.f32363OooO = 3;
                    if (BuildersKt.withContext(main, oooOOO0, oooOO1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                dyid = momentSendResultModel.getDyid();
                if (dyid != null) {
                    momentSendModel2.setPostId(o0OoOo0.OooO(0L, dyid));
                }
            }
            momentSendModel3 = momentSendModel2;
            if (momentSendModel3.getListSendPostMedia().isEmpty()) {
                momentSendModel3.setSendPostState(MomentSendState.Success);
                momentSendService2.getClass();
                OooO0OO(momentSendModel3);
                return Unit.INSTANCE;
            }
            oooOO1.f32364OooO0Oo = momentSendService2;
            oooOO1.f32366OooO0o0 = momentSendModel3;
            oooOO1.f32365OooO0o = null;
            oooOO1.f32363OooO = 4;
            objOooO00o = momentSendService2.OooO0o(momentSendModel3, oooOO1);
            if (objOooO00o == coroutine_suspended) {
                return coroutine_suspended;
            }
            momentSendService3 = momentSendService2;
            if (((Boolean) objOooO00o).booleanValue()) {
                momentSendModel3.setSendPostState(MomentSendState.Success);
                momentSendService3.getClass();
                OooO0OO(momentSendModel3);
            } else {
                momentSendModel3.setSendPostState(MomentSendState.FailedImage);
                o0000OO0.OooO0OO(momentSendModel3);
                LiveEventBus.get("Post_send_filed").post(momentSendModel3);
            }
        } else {
            momentSendModel4.setSendPostState(MomentSendState.FailedContent);
            if (apiResult.getError().getCode() == 4004) {
                momentSendModel4.setSendPostState(MomentSendState.FailedSendFrequently);
            }
            o0000OO0.OooO0OO(momentSendModel4);
            LiveEventBus.get("Post_send_filed").post(momentSendModel4);
            if (momentSendModel4.getType() == MomentType.Event.getValue() && momentSendModel4.getShareType() == 20) {
                MainCoroutineDispatcher main3 = Dispatchers.getMain();
                OooOOO oooOOO = new OooOOO(null);
                oooOO1.f32364OooO0Oo = null;
                oooOO1.f32366OooO0o0 = null;
                oooOO1.f32363OooO = 5;
                if (BuildersKt.withContext(main3, oooOOO, oooOO1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r7v10, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v8, types: [T, java.lang.String] */
    public final Object OooO0o(MomentSendModel momentSendModel, Continuation<? super Boolean> continuation) throws Throwable {
        OooOo00 oooOo00;
        MomentSendModel momentSendModel2;
        String str;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        MomentSendService momentSendService;
        ?? r4;
        if (continuation instanceof OooOo00) {
            oooOo00 = (OooOo00) continuation;
            int i = oooOo00.f32388OooOO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo00.f32388OooOO0o = i - Integer.MIN_VALUE;
            } else {
                oooOo00 = new OooOo00(continuation);
            }
        } else {
            oooOo00 = new OooOo00(continuation);
        }
        Object objWithContext = oooOo00.f32386OooOO0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOo00.f32388OooOO0o;
        boolean z = true;
        if (i2 != 0) {
            if (i2 == 1) {
                int i3 = oooOo00.f32380OooO;
                String str2 = oooOo00.f32385OooO0oo;
                Ref.ObjectRef objectRef3 = oooOo00.f32384OooO0oO;
                Ref.ObjectRef objectRef4 = oooOo00.f32382OooO0o;
                MomentSendModel momentSendModel3 = oooOo00.f32383OooO0o0;
                MomentSendService momentSendService2 = oooOo00.f32381OooO0Oo;
                ResultKt.throwOnFailure(objWithContext);
                str = str2;
                objectRef = objectRef3;
                objectRef2 = objectRef4;
                momentSendModel2 = momentSendModel3;
                momentSendService = momentSendService2;
                r4 = i3;
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithContext);
            }
        }
        ResultKt.throwOnFailure(objWithContext);
        ArrayList arrayList = new ArrayList();
        ?? r5 = momentSendModel.getType() == MomentType.Video.getValue() ? 1 : 0;
        Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
        objectRef5.element = "";
        Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
        objectRef6.element = "";
        for (MomentSelectMedia momentSelectMedia : momentSendModel.localMedias()) {
            File file = new File(momentSelectMedia.getPath());
            Uri uriFromFile = Uri.fromFile(file);
            if (uriFromFile != null) {
                Intrinsics.checkNotNull(uriFromFile);
                o0000O00.OooO0O0("WRM uploadImage item = " + p187o00o00o0.OooO.OooO00o(momentSelectMedia) + ", uri  = " + uriFromFile);
                arrayList.add(uriFromFile);
                if (r5 != 0) {
                    long length = 0;
                    if (momentSelectMedia.getDuration() > 0) {
                        if (file.isDirectory()) {
                            File[] fileArrListFiles = file.listFiles();
                            if (fileArrListFiles != null) {
                                Intrinsics.checkNotNull(fileArrListFiles);
                                for (File file2 : fileArrListFiles) {
                                    if (file2 != null) {
                                        Intrinsics.checkNotNull(file2);
                                        length = p184o00o00O0.OooO0o.OooO0o(file2) + length;
                                    }
                                }
                            }
                        } else {
                            length = file.length();
                        }
                        objectRef5.element = length + " Byte";
                        objectRef6.element = momentSelectMedia.getDuration() + " ms";
                    }
                }
            }
        }
        String strValueOf = String.valueOf(System.currentTimeMillis());
        CloudFileType cloudFileType = CloudFileType.MOMENT_POST;
        Boolean boolBoxBoolean = Boxing.boxBoolean(r5);
        oooOo00.f32381OooO0Oo = this;
        momentSendModel2 = momentSendModel;
        oooOo00.f32383OooO0o0 = momentSendModel2;
        oooOo00.f32382OooO0o = objectRef5;
        oooOo00.f32384OooO0oO = objectRef6;
        oooOo00.f32385OooO0oo = strValueOf;
        oooOo00.f32380OooO = r5;
        oooOo00.f32388OooOO0o = 1;
        this.f32348OooO0o.getClass();
        p182o00o000O.OooOO0O oooOO0O = (p182o00o000O.OooOO0O) o0O00O0o.f47174OooO00o.getValue();
        oooOO0O.getClass();
        objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new p182o00o000O.OooOo00(oooOO0O, boolBoxBoolean, null, cloudFileType, arrayList, null, false), oooOo00);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        str = strValueOf;
        objectRef = objectRef6;
        objectRef2 = objectRef5;
        momentSendService = this;
        r4 = r5;
        List<p182o00o000O.OooO0o> list = (List) objWithContext;
        o0000O0.OooO00o(Boxing.boxBoolean(r4 != 0), momentSendService.new OooOo(objectRef2, objectRef, str, momentSendModel2, String.valueOf(System.currentTimeMillis())));
        if (list != null) {
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                p182o00o000O.OooO0o oooO0o = (p182o00o000O.OooO0o) obj;
                String str3 = momentSendService.f32347OooO0Oo;
                File file3 = oooO0o.f38403OooO00o;
                String strOooO00o = oooO0o.OooO00o();
                if (r4 == 0) {
                    z = false;
                }
                o0000O00.OooO0o(str3 + " uploadResults \t index=" + i4 + ": \n\t file=" + file3 + " \n\t url=" + strOooO00o + " \n\t isVideo=" + z + "\n\t imgWidth=" + oooO0o.f38406OooO0Oo + " \n\t imgHeight=" + oooO0o.f38408OooO0o0);
                i4 = i5;
                z = true;
            }
        }
        if (list == null || list.isEmpty()) {
            return Boxing.boxBoolean(false);
        }
        boolean z2 = r4 != 0;
        oooOo00.f32381OooO0Oo = null;
        oooOo00.f32383OooO0o0 = null;
        oooOo00.f32382OooO0o = null;
        oooOo00.f32384OooO0oO = null;
        oooOo00.f32385OooO0oo = null;
        oooOo00.f32388OooOO0o = 2;
        objWithContext = momentSendService.OooO00o(momentSendModel2, list, z2, oooOo00);
        return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object OooO0o0(Continuation<? super Unit> continuation) {
        OooOOOO oooOOOO;
        MomentSendService momentSendService;
        if (continuation instanceof OooOOOO) {
            oooOOOO = (OooOOOO) continuation;
            int i = oooOOOO.f32373OooO0oO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOOO.f32373OooO0oO = i - Integer.MIN_VALUE;
            } else {
                oooOOOO = new OooOOOO(continuation);
            }
        } else {
            oooOOOO = new OooOOOO(continuation);
        }
        Object obj = oooOOOO.f32372OooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOOO.f32373OooO0oO;
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                momentSendService = oooOOOO.f32370OooO0Oo;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (!this.f32349OooO0o0) {
            ArrayList arrayList = this.f32350OooO0oO;
            if (!arrayList.isEmpty()) {
                this.f32349OooO0o0 = true;
                MomentSendModel momentSendModel = (MomentSendModel) arrayList.get(0);
                if (momentSendModel.getPostId() > 0) {
                    oooOOOO.f32370OooO0Oo = this;
                    oooOOOO.f32373OooO0oO = 1;
                    if (OooO0O0(momentSendModel, oooOOOO) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    oooOOOO.f32370OooO0Oo = this;
                    oooOOOO.f32373OooO0oO = 2;
                    if (OooO0Oo(momentSendModel, oooOOOO) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                momentSendService = this;
            }
        }
        return Unit.INSTANCE;
        momentSendService.f32350OooO0oO.remove(0);
        oooOOOO.f32370OooO0Oo = null;
        oooOOOO.f32373OooO0oO = 3;
        if (momentSendService.OooO0o0(oooOOOO) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // android.app.IntentService
    public final void onHandleIntent(@Nullable Intent intent) {
        if (intent == null) {
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra("DATA");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.model.moment.MomentSendModel");
        MomentSendModel taskModel = (MomentSendModel) serializableExtra;
        if (intent.getBooleanExtra("IsAdd", false)) {
            taskModel.setTaskId(System.currentTimeMillis());
            taskModel.setSendPostState(MomentSendState.Sending);
            SnapshotStateList<MomentDetailModel> snapshotStateList = o0000OO0.f57385OooO00o;
            Intrinsics.checkNotNullParameter(taskModel, "taskModel");
            MomentDetailModel momentDetailModel = new MomentDetailModel();
            momentDetailModel.setSendPostModel(taskModel);
            momentDetailModel.transformBySendModel(taskModel);
            SnapshotStateList<MomentDetailModel> snapshotStateList2 = o0000OO0.f57385OooO00o;
            if (snapshotStateList2.isEmpty()) {
                snapshotStateList2.add(momentDetailModel);
            } else {
                snapshotStateList2.add(0, momentDetailModel);
            }
            LiveEventBus.get("Post_send_add").post(taskModel);
        } else {
            taskModel.setSendPostState(MomentSendState.Sending);
        }
        this.f32350OooO0oO.add(taskModel);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getDefault(), null, new OooO0OO(null), 2, null);
    }
}
