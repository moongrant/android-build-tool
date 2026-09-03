package com.app.base.task.sendPostTask;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.CloudFileInfo;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.manager.cloud_file.CloudFileType;
import com.yalla.yalla.common.model.Error;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.repository.CloudFileRepo;
import com.yalla.yalla.common.repository.PostRepo$changeImagesUrl$$inlined$call$1;
import com.yalla.yalla.common.repository.PostRepo$sendPost$$inlined$call$1;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.model.MomentSendContentModel;
import com.yalla.yalla.model.MomentSendModel;
import com.yalla.yalla.model.MomentSendResultModel;
import com.yalla.yalla.model.MomentSendState;
import com.yalla.yalla.model.MomentType;
import com.zego.zegoliveroom.callback.IZegoLiveEventCallback;
import io.agora.rtc.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p206o00o0o0o.o000Oo0;
import p254o00ooO0O.o000O0O0;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.oo00o;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/app/base/task/sendPostTask/SendPostService;", "Landroid/app/IntentService;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class SendPostService extends IntentService {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f11901OoooO0 = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final oo00o f11902Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final String f11903Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f11904Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final CloudFileRepo f11905Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public List<MomentSendModel> f11906OoooO00;

    @DebugMetadata(c = "com.app.base.task.sendPostTask.SendPostService$reSendUploadImage$2", f = "SendPostService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.send_successfully));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {
        @JvmStatic
        public final void OooO00o(@NotNull Context context, @NotNull MomentSendModel sendPostModel, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(sendPostModel, "sendPostModel");
            Intent intent = new Intent(context, (Class<?>) SendPostService.class);
            intent.putExtra("DATA", sendPostModel);
            intent.putExtra("IsAdd", z);
            context.startService(intent);
        }
    }

    @DebugMetadata(c = "com.app.base.task.sendPostTask.SendPostService", f = "SendPostService.kt", i = {0}, l = {223}, m = "changeImageUrl", n = {"this"}, s = {"L$0"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f11907Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public SendPostService f11908Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f11909Oooo0oO;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11909Oooo0oO = obj;
            this.f11907Oooo |= Integer.MIN_VALUE;
            SendPostService sendPostService = SendPostService.this;
            OooO00o oooO00o = SendPostService.f11901OoooO0;
            return sendPostService.OooO00o(null, null, this);
        }
    }

    @DebugMetadata(c = "com.app.base.task.sendPostTask.SendPostService$onHandleIntent$1", f = "SendPostService.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f11911Oooo0o;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SendPostService.this.new OooO0OO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11911Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SendPostService sendPostService = SendPostService.this;
                this.f11911Oooo0o = 1;
                OooO00o oooO00o = SendPostService.f11901OoooO0;
                if (sendPostService.OooO0Oo(this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.app.base.task.sendPostTask.SendPostService", f = "SendPostService.kt", i = {0, 1}, l = {172, 175}, m = "reSendUploadImage", n = {"sendPostModel", "sendPostModel"}, s = {"L$0", "L$0"})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f11913Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public MomentSendModel f11914Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f11915Oooo0oO;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11915Oooo0oO = obj;
            this.f11913Oooo |= Integer.MIN_VALUE;
            SendPostService sendPostService = SendPostService.this;
            OooO00o oooO00o = SendPostService.f11901OoooO0;
            return sendPostService.OooO0O0(null, this);
        }
    }

    @DebugMetadata(c = "com.app.base.task.sendPostTask.SendPostService", f = "SendPostService.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 3, 4, 5}, l = {93, 101, 107, 124, Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED, 134, 163}, m = "sendContent", n = {"this", "sendPostModel", "this", "sendPostModel", "sendPost", "this", "sendPostModel", "data", "sendPostModel", "sendPostModel", "sendPostModel"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$0", "L$0"})
    public static final class OooOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f11917Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Object f11918Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public MomentSendModel f11919Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public Object f11920Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f11921OoooO0;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11917Oooo = obj;
            this.f11921OoooO0 |= Integer.MIN_VALUE;
            SendPostService sendPostService = SendPostService.this;
            OooO00o oooO00o = SendPostService.f11901OoooO0;
            return sendPostService.OooO0OO(null, this);
        }
    }

    @DebugMetadata(c = "com.app.base.task.sendPostTask.SendPostService$sendContent$2", f = "SendPostService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.Share_Shared_successfully));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.app.base.task.sendPostTask.SendPostService$sendContent$4", f = "SendPostService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.send_successfully));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.app.base.task.sendPostTask.SendPostService$sendContent$3$1", f = "SendPostService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ MomentSendModel f11923Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(MomentSendModel momentSendModel, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f11923Oooo0o = momentSendModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO0(this.f11923Oooo0o, continuation);
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
            ToastUtil.OooO0O0 oooO0O0 = ToastUtil.f12567OooO00o;
            String strOooO0OO = o000O0O0.OooO0OO(R.string.post_send_and_follow_topic);
            String[] strArr = new String[1];
            MomentSendContentModel content = this.f11923Oooo0o.getContent();
            if (content == null || (circleName = content.getCircleName()) == null) {
                circleName = "";
            }
            strArr[0] = circleName;
            oooO0O0.OooO0O0(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO, strArr));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.app.base.task.sendPostTask.SendPostService$sendContent$5", f = "SendPostService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooOOOO(Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOOO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooOOOO(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.send_successfully));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.app.base.task.sendPostTask.SendPostService", f = "SendPostService.kt", i = {0, 1}, l = {83, 85, 88}, m = "sendMomentTask", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class OooOo extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f11924Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public SendPostService f11925Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f11926Oooo0oO;

        public OooOo(Continuation<? super OooOo> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11926Oooo0oO = obj;
            this.f11924Oooo |= Integer.MIN_VALUE;
            SendPostService sendPostService = SendPostService.this;
            OooO00o oooO00o = SendPostService.f11901OoooO0;
            return sendPostService.OooO0Oo(this);
        }
    }

    @DebugMetadata(c = "com.app.base.task.sendPostTask.SendPostService$sendContent$7", f = "SendPostService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
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
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.Share_Failed_to_share));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.app.base.task.sendPostTask.SendPostService", f = "SendPostService.kt", i = {0, 0}, l = {194, IZegoLiveEventCallback.StreamEvent.PlayFail}, m = "uploadImage", n = {"this", "sendPostModel"}, s = {"L$0", "L$1"})
    public static final class Oooo000 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public SendPostService f11929Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public MomentSendModel f11930Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f11931Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f11932OoooO00;

        public Oooo000(Continuation<? super Oooo000> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f11931Oooo0oo = obj;
            this.f11932OoooO00 |= Integer.MIN_VALUE;
            SendPostService sendPostService = SendPostService.this;
            OooO00o oooO00o = SendPostService.f11901OoooO0;
            return sendPostService.OooO0o0(null, this);
        }
    }

    public SendPostService() {
        super("SendPostService");
        this.f11903Oooo0o = "动态发送任务";
        this.f11905Oooo0oo = new CloudFileRepo();
        this.f11902Oooo = new oo00o();
        this.f11906OoooO00 = new ArrayList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object OooO00o(MomentSendModel momentSendModel, List<CloudFileInfo> list, Continuation<? super Boolean> continuation) throws Throwable {
        OooO0O0 oooO0O0;
        SendPostService sendPostService;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f11907Oooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f11907Oooo = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objWithContext = oooO0O0.f11909Oooo0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f11907Oooo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            String strImgRemoveHost = CloudImageUtilKt.imgRemoveHost(list.get(0).getUrl());
            String strSubstring = strImgRemoveHost.substring(0, StringsKt__StringsKt.lastIndexOf$default(strImgRemoveHost, "/", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            StringBuffer stringBuffer = new StringBuffer();
            StringBuffer stringBuffer2 = new StringBuffer();
            for (CloudFileInfo cloudFileInfo : list) {
                if (stringBuffer.length() > 0) {
                    stringBuffer.append("|");
                }
                String strSubstring2 = cloudFileInfo.getUrl().substring(StringsKt__StringsKt.lastIndexOf$default(cloudFileInfo.getUrl(), "/", 0, false, 6, (Object) null) + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                stringBuffer.append(strSubstring2);
                if (stringBuffer2.length() > 0) {
                    stringBuffer2.append("|");
                }
                StringBuilder sb = new StringBuilder();
                sb.append(cloudFileInfo.getImgWidth());
                sb.append('*');
                sb.append(cloudFileInfo.getImgHight());
                stringBuffer2.append(sb.toString());
                o00O00.OooO0O0("uploadFile = " + cloudFileInfo);
            }
            oo00o oo00oVar = this.f11902Oooo;
            String strValueOf = String.valueOf(momentSendModel.getPostId());
            String string = stringBuffer.toString();
            Intrinsics.checkNotNullExpressionValue(string, "urls.toString()");
            String string2 = stringBuffer2.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "sizes.toString()");
            oooO0O0.f11908Oooo0o = this;
            oooO0O0.f11907Oooo = 1;
            Objects.requireNonNull(oo00oVar);
            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new PostRepo$changeImagesUrl$$inlined$call$1(oo00oVar, null, strValueOf, strSubstring, string, string2), oooO0O0);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            sendPostService = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sendPostService = oooO0O0.f11908Oooo0o;
            ResultKt.throwOnFailure(objWithContext);
        }
        Response response = (Response) objWithContext;
        o00O00.OooO0O0(sendPostService.f11903Oooo0o + " changeImageUrl : isSuccess=\t" + response.getIsSuccess());
        return Boxing.boxBoolean(response.getIsSuccess());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[PHI: r6
      0x0086: PHI (r6v1 com.yalla.yalla.model.MomentSendModel) = (r6v0 com.yalla.yalla.model.MomentSendModel), (r6v2 com.yalla.yalla.model.MomentSendModel) binds: [B:17:0x0048, B:22:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object OooO0O0(MomentSendModel momentSendModel, Continuation<? super Unit> continuation) throws Throwable {
        OooO0o oooO0o;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i = oooO0o.f11913Oooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f11913Oooo = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        Object objOooO0o0 = oooO0o.f11915Oooo0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0o.f11913Oooo;
        if (i2 != 0) {
            if (i2 == 1) {
                momentSendModel = oooO0o.f11914Oooo0o;
                ResultKt.throwOnFailure(objOooO0o0);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                momentSendModel = oooO0o.f11914Oooo0o;
                ResultKt.throwOnFailure(objOooO0o0);
            }
            LiveEventBus.get("Post_send_success").post(momentSendModel);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objOooO0o0);
        if (!momentSendModel.getListSendPostImage().isEmpty()) {
            oooO0o.f11914Oooo0o = momentSendModel;
            oooO0o.f11913Oooo = 1;
            objOooO0o0 = OooO0o0(momentSendModel, oooO0o);
            if (objOooO0o0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            momentSendModel.setSendPostState(MomentSendState.FailedImage);
            p169o00Ooo00.OooOOOO oooOOOO = p169o00Ooo00.OooOOOO.f32671OooO00o;
            p169o00Ooo00.OooOOOO.OooO0Oo(momentSendModel);
            LiveEventBus.get("Post_send_filed").post(momentSendModel);
        }
        return Unit.INSTANCE;
        if (((Boolean) objOooO0o0).booleanValue()) {
            momentSendModel.setSendPostState(MomentSendState.Success);
            p169o00Ooo00.OooOOOO oooOOOO2 = p169o00Ooo00.OooOOOO.f32671OooO00o;
            p169o00Ooo00.OooOOOO.OooO0OO(momentSendModel);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO oooO = new OooO(null);
            oooO0o.f11914Oooo0o = momentSendModel;
            oooO0o.f11913Oooo = 2;
            if (BuildersKt.withContext(main, oooO, oooO0o) == coroutine_suspended) {
                return coroutine_suspended;
            }
            LiveEventBus.get("Post_send_success").post(momentSendModel);
        } else {
            momentSendModel.setSendPostState(MomentSendState.FailedImage);
            p169o00Ooo00.OooOOOO oooOOOO3 = p169o00Ooo00.OooOOOO.f32671OooO00o;
            p169o00Ooo00.OooOOOO.OooO0Oo(momentSendModel);
            LiveEventBus.get("Post_send_filed").post(momentSendModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00be  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:45:0x012d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0133  */
    /* JADX WARN: Code duplicated, block: B:49:0x014b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0152  */
    /* JADX WARN: Code duplicated, block: B:55:0x0164  */
    /* JADX WARN: Code duplicated, block: B:57:0x0186 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x0191  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:84:0x0235 A[RETURN] */
    public final Object OooO0OO(MomentSendModel momentSendModel, Continuation<? super Unit> continuation) throws Throwable {
        OooOO0 oooOO1;
        SendPostService sendPostService;
        Response response;
        MomentSendResultModel momentSendResultModel;
        String dyid;
        MomentSendResultModel momentSendResultModel2;
        Boolean boolBoxBoolean;
        Error error;
        MainCoroutineDispatcher main;
        OooOo00 oooOo00;
        Integer code2;
        MomentSendModel momentSendModel2;
        Response response2;
        MomentSendResultModel momentSendResultModel3;
        MainCoroutineDispatcher main2;
        OooOOO0 oooOOO0;
        MomentSendModel momentSendModel3;
        MainCoroutineDispatcher main3;
        OooOOO oooOOO;
        String dyid2;
        MainCoroutineDispatcher main4;
        OooOOOO oooOOOO;
        if (continuation instanceof OooOO0) {
            oooOO1 = (OooOO0) continuation;
            int i = oooOO1.f11921OoooO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO1.f11921OoooO0 = i - Integer.MIN_VALUE;
            } else {
                oooOO1 = new OooOO0(continuation);
            }
        } else {
            oooOO1 = new OooOO0(continuation);
        }
        Object objWithContext = oooOO1.f11917Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (oooOO1.f11921OoooO0) {
            case 0:
                ResultKt.throwOnFailure(objWithContext);
                oo00o oo00oVar = this.f11902Oooo;
                oooOO1.f11918Oooo0o = this;
                oooOO1.f11919Oooo0oO = momentSendModel;
                oooOO1.f11921OoooO0 = 1;
                Objects.requireNonNull(oo00oVar);
                objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new PostRepo$sendPost$$inlined$call$1(oo00oVar, null, momentSendModel), oooOO1);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sendPostService = this;
                response = (Response) objWithContext;
                StringBuilder sb = new StringBuilder();
                sb.append(sendPostService.f11903Oooo0o);
                sb.append(" sendPost : \tisSuccess=");
                sb.append(response.getIsSuccess());
                sb.append("\tdyid=");
                momentSendResultModel = (MomentSendResultModel) response.getData();
                if (momentSendResultModel != null) {
                    dyid = momentSendResultModel.getDyid();
                } else {
                    dyid = null;
                }
                sb.append(dyid);
                sb.append("\tisJoinedCircle=");
                momentSendResultModel2 = (MomentSendResultModel) response.getData();
                if (momentSendResultModel2 != null) {
                    boolBoxBoolean = Boxing.boxBoolean(momentSendResultModel2.getJoinedCircle());
                } else {
                    boolBoxBoolean = null;
                }
                sb.append(boolBoxBoolean);
                o00O00.OooO0O0(sb.toString());
                if (response.getIsSuccess()) {
                    o0O00000.OooO0OO("Moemnts_post_post");
                    if (momentSendModel.getType() == MomentType.Event.getValue() || momentSendModel.getShareType() != 20) {
                        momentSendModel2 = momentSendModel;
                    } else {
                        MainCoroutineDispatcher main5 = Dispatchers.getMain();
                        OooOO0O oooOO0O = new OooOO0O(null);
                        oooOO1.f11918Oooo0o = sendPostService;
                        oooOO1.f11919Oooo0oO = momentSendModel;
                        oooOO1.f11920Oooo0oo = response;
                        oooOO1.f11921OoooO0 = 2;
                        if (BuildersKt.withContext(main5, oooOO0O, oooOO1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        momentSendModel2 = momentSendModel;
                        response2 = response;
                        response = response2;
                    }
                    momentSendResultModel3 = (MomentSendResultModel) response.getData();
                    if (momentSendResultModel3 != null) {
                        if (momentSendResultModel3.getJoinedCircle()) {
                            main2 = Dispatchers.getMain();
                            oooOOO0 = new OooOOO0(momentSendModel2, null);
                            oooOO1.f11918Oooo0o = sendPostService;
                            oooOO1.f11919Oooo0oO = momentSendModel2;
                            oooOO1.f11920Oooo0oo = momentSendResultModel3;
                            oooOO1.f11921OoooO0 = 3;
                            if (BuildersKt.withContext(main2, oooOOO0, oooOO1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        dyid2 = momentSendResultModel3.getDyid();
                        if (dyid2 != null) {
                            momentSendModel2.setPostId(com.yalla.support.common.util.OooO.OooO0oO(dyid2));
                        }
                    }
                    momentSendModel3 = momentSendModel2;
                    if (momentSendModel3.getListSendPostImage().isEmpty()) {
                        momentSendModel3.setSendPostState(MomentSendState.Success);
                        p169o00Ooo00.OooOOOO oooOOOO2 = p169o00Ooo00.OooOOOO.f32671OooO00o;
                        p169o00Ooo00.OooOOOO.OooO0OO(momentSendModel3);
                        main3 = Dispatchers.getMain();
                        oooOOO = new OooOOO(null);
                        oooOO1.f11918Oooo0o = momentSendModel3;
                        oooOO1.f11919Oooo0oO = null;
                        oooOO1.f11920Oooo0oo = null;
                        oooOO1.f11921OoooO0 = 4;
                        if (BuildersKt.withContext(main3, oooOOO, oooOO1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        LiveEventBus.get("Post_send_success").post(momentSendModel3);
                        return Unit.INSTANCE;
                    }
                    oooOO1.f11918Oooo0o = momentSendModel3;
                    oooOO1.f11919Oooo0oO = null;
                    oooOO1.f11920Oooo0oo = null;
                    oooOO1.f11921OoooO0 = 5;
                    objWithContext = sendPostService.OooO0o0(momentSendModel3, oooOO1);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) objWithContext).booleanValue()) {
                        momentSendModel3.setSendPostState(MomentSendState.Success);
                        p169o00Ooo00.OooOOOO oooOOOO3 = p169o00Ooo00.OooOOOO.f32671OooO00o;
                        p169o00Ooo00.OooOOOO.OooO0OO(momentSendModel3);
                        main4 = Dispatchers.getMain();
                        oooOOOO = new OooOOOO(null);
                        oooOO1.f11918Oooo0o = momentSendModel3;
                        oooOO1.f11921OoooO0 = 6;
                        if (BuildersKt.withContext(main4, oooOOOO, oooOO1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        LiveEventBus.get("Post_send_success").post(momentSendModel3);
                    } else {
                        momentSendModel3.setSendPostState(MomentSendState.FailedImage);
                        p169o00Ooo00.OooOOOO oooOOOO4 = p169o00Ooo00.OooOOOO.f32671OooO00o;
                        p169o00Ooo00.OooOOOO.OooO0Oo(momentSendModel3);
                        LiveEventBus.get("Post_send_filed").post(momentSendModel3);
                    }
                } else {
                    momentSendModel.setSendPostState(MomentSendState.FailedContent);
                    error = response.getError();
                    if (error != null && (code2 = error.getCode()) != null && code2.intValue() == 4004) {
                        momentSendModel.setSendPostState(MomentSendState.FailedSendFrequently);
                    }
                    p169o00Ooo00.OooOOOO oooOOOO5 = p169o00Ooo00.OooOOOO.f32671OooO00o;
                    p169o00Ooo00.OooOOOO.OooO0Oo(momentSendModel);
                    LiveEventBus.get("Post_send_filed").post(momentSendModel);
                    if (momentSendModel.getType() == MomentType.Event.getValue() && momentSendModel.getShareType() == 20) {
                        main = Dispatchers.getMain();
                        oooOo00 = new OooOo00(null);
                        oooOO1.f11918Oooo0o = null;
                        oooOO1.f11919Oooo0oO = null;
                        oooOO1.f11921OoooO0 = 7;
                        if (BuildersKt.withContext(main, oooOo00, oooOO1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                momentSendModel = oooOO1.f11919Oooo0oO;
                SendPostService sendPostService2 = (SendPostService) oooOO1.f11918Oooo0o;
                ResultKt.throwOnFailure(objWithContext);
                sendPostService = sendPostService2;
                response = (Response) objWithContext;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(sendPostService.f11903Oooo0o);
                sb2.append(" sendPost : \tisSuccess=");
                sb2.append(response.getIsSuccess());
                sb2.append("\tdyid=");
                momentSendResultModel = (MomentSendResultModel) response.getData();
                if (momentSendResultModel != null) {
                    dyid = momentSendResultModel.getDyid();
                } else {
                    dyid = null;
                }
                sb2.append(dyid);
                sb2.append("\tisJoinedCircle=");
                momentSendResultModel2 = (MomentSendResultModel) response.getData();
                if (momentSendResultModel2 != null) {
                    boolBoxBoolean = Boxing.boxBoolean(momentSendResultModel2.getJoinedCircle());
                } else {
                    boolBoxBoolean = null;
                }
                sb2.append(boolBoxBoolean);
                o00O00.OooO0O0(sb2.toString());
                if (response.getIsSuccess()) {
                    o0O00000.OooO0OO("Moemnts_post_post");
                    if (momentSendModel.getType() == MomentType.Event.getValue()) {
                    }
                    momentSendModel2 = momentSendModel;
                    momentSendResultModel3 = (MomentSendResultModel) response.getData();
                    if (momentSendResultModel3 != null) {
                        if (momentSendResultModel3.getJoinedCircle()) {
                            main2 = Dispatchers.getMain();
                            oooOOO0 = new OooOOO0(momentSendModel2, null);
                            oooOO1.f11918Oooo0o = sendPostService;
                            oooOO1.f11919Oooo0oO = momentSendModel2;
                            oooOO1.f11920Oooo0oo = momentSendResultModel3;
                            oooOO1.f11921OoooO0 = 3;
                            if (BuildersKt.withContext(main2, oooOOO0, oooOO1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        dyid2 = momentSendResultModel3.getDyid();
                        if (dyid2 != null) {
                            momentSendModel2.setPostId(com.yalla.support.common.util.OooO.OooO0oO(dyid2));
                        }
                    }
                    momentSendModel3 = momentSendModel2;
                    if (momentSendModel3.getListSendPostImage().isEmpty()) {
                        momentSendModel3.setSendPostState(MomentSendState.Success);
                        p169o00Ooo00.OooOOOO oooOOOO6 = p169o00Ooo00.OooOOOO.f32671OooO00o;
                        p169o00Ooo00.OooOOOO.OooO0OO(momentSendModel3);
                        main3 = Dispatchers.getMain();
                        oooOOO = new OooOOO(null);
                        oooOO1.f11918Oooo0o = momentSendModel3;
                        oooOO1.f11919Oooo0oO = null;
                        oooOO1.f11920Oooo0oo = null;
                        oooOO1.f11921OoooO0 = 4;
                        if (BuildersKt.withContext(main3, oooOOO, oooOO1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        LiveEventBus.get("Post_send_success").post(momentSendModel3);
                        return Unit.INSTANCE;
                    }
                    oooOO1.f11918Oooo0o = momentSendModel3;
                    oooOO1.f11919Oooo0oO = null;
                    oooOO1.f11920Oooo0oo = null;
                    oooOO1.f11921OoooO0 = 5;
                    objWithContext = sendPostService.OooO0o0(momentSendModel3, oooOO1);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    if (((Boolean) objWithContext).booleanValue()) {
                        momentSendModel3.setSendPostState(MomentSendState.Success);
                        p169o00Ooo00.OooOOOO oooOOOO7 = p169o00Ooo00.OooOOOO.f32671OooO00o;
                        p169o00Ooo00.OooOOOO.OooO0OO(momentSendModel3);
                        main4 = Dispatchers.getMain();
                        oooOOOO = new OooOOOO(null);
                        oooOO1.f11918Oooo0o = momentSendModel3;
                        oooOO1.f11921OoooO0 = 6;
                        if (BuildersKt.withContext(main4, oooOOOO, oooOO1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        LiveEventBus.get("Post_send_success").post(momentSendModel3);
                    } else {
                        momentSendModel3.setSendPostState(MomentSendState.FailedImage);
                        p169o00Ooo00.OooOOOO oooOOOO8 = p169o00Ooo00.OooOOOO.f32671OooO00o;
                        p169o00Ooo00.OooOOOO.OooO0Oo(momentSendModel3);
                        LiveEventBus.get("Post_send_filed").post(momentSendModel3);
                    }
                    break;
                } else {
                    momentSendModel.setSendPostState(MomentSendState.FailedContent);
                    error = response.getError();
                    if (error != null) {
                        momentSendModel.setSendPostState(MomentSendState.FailedSendFrequently);
                    }
                    p169o00Ooo00.OooOOOO oooOOOO9 = p169o00Ooo00.OooOOOO.f32671OooO00o;
                    p169o00Ooo00.OooOOOO.OooO0Oo(momentSendModel);
                    LiveEventBus.get("Post_send_filed").post(momentSendModel);
                    if (momentSendModel.getType() == MomentType.Event.getValue()) {
                        main = Dispatchers.getMain();
                        oooOo00 = new OooOo00(null);
                        oooOO1.f11918Oooo0o = null;
                        oooOO1.f11919Oooo0oO = null;
                        oooOO1.f11921OoooO0 = 7;
                        if (BuildersKt.withContext(main, oooOo00, oooOO1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                }
                return Unit.INSTANCE;
            case 2:
                response2 = (Response) oooOO1.f11920Oooo0oo;
                momentSendModel2 = oooOO1.f11919Oooo0oO;
                sendPostService = (SendPostService) oooOO1.f11918Oooo0o;
                ResultKt.throwOnFailure(objWithContext);
                response = response2;
                momentSendResultModel3 = (MomentSendResultModel) response.getData();
                if (momentSendResultModel3 != null) {
                    if (momentSendResultModel3.getJoinedCircle()) {
                        main2 = Dispatchers.getMain();
                        oooOOO0 = new OooOOO0(momentSendModel2, null);
                        oooOO1.f11918Oooo0o = sendPostService;
                        oooOO1.f11919Oooo0oO = momentSendModel2;
                        oooOO1.f11920Oooo0oo = momentSendResultModel3;
                        oooOO1.f11921OoooO0 = 3;
                        if (BuildersKt.withContext(main2, oooOOO0, oooOO1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    dyid2 = momentSendResultModel3.getDyid();
                    if (dyid2 != null) {
                        momentSendModel2.setPostId(com.yalla.support.common.util.OooO.OooO0oO(dyid2));
                    }
                }
                momentSendModel3 = momentSendModel2;
                if (momentSendModel3.getListSendPostImage().isEmpty()) {
                    momentSendModel3.setSendPostState(MomentSendState.Success);
                    p169o00Ooo00.OooOOOO oooOOOO10 = p169o00Ooo00.OooOOOO.f32671OooO00o;
                    p169o00Ooo00.OooOOOO.OooO0OO(momentSendModel3);
                    main3 = Dispatchers.getMain();
                    oooOOO = new OooOOO(null);
                    oooOO1.f11918Oooo0o = momentSendModel3;
                    oooOO1.f11919Oooo0oO = null;
                    oooOO1.f11920Oooo0oo = null;
                    oooOO1.f11921OoooO0 = 4;
                    if (BuildersKt.withContext(main3, oooOOO, oooOO1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    LiveEventBus.get("Post_send_success").post(momentSendModel3);
                    return Unit.INSTANCE;
                }
                oooOO1.f11918Oooo0o = momentSendModel3;
                oooOO1.f11919Oooo0oO = null;
                oooOO1.f11920Oooo0oo = null;
                oooOO1.f11921OoooO0 = 5;
                objWithContext = sendPostService.OooO0o0(momentSendModel3, oooOO1);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Boolean) objWithContext).booleanValue()) {
                    momentSendModel3.setSendPostState(MomentSendState.Success);
                    p169o00Ooo00.OooOOOO oooOOOO11 = p169o00Ooo00.OooOOOO.f32671OooO00o;
                    p169o00Ooo00.OooOOOO.OooO0OO(momentSendModel3);
                    main4 = Dispatchers.getMain();
                    oooOOOO = new OooOOOO(null);
                    oooOO1.f11918Oooo0o = momentSendModel3;
                    oooOO1.f11921OoooO0 = 6;
                    if (BuildersKt.withContext(main4, oooOOOO, oooOO1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    LiveEventBus.get("Post_send_success").post(momentSendModel3);
                } else {
                    momentSendModel3.setSendPostState(MomentSendState.FailedImage);
                    p169o00Ooo00.OooOOOO oooOOOO12 = p169o00Ooo00.OooOOOO.f32671OooO00o;
                    p169o00Ooo00.OooOOOO.OooO0Oo(momentSendModel3);
                    LiveEventBus.get("Post_send_filed").post(momentSendModel3);
                }
                return Unit.INSTANCE;
            case 3:
                momentSendResultModel3 = (MomentSendResultModel) oooOO1.f11920Oooo0oo;
                momentSendModel2 = oooOO1.f11919Oooo0oO;
                sendPostService = (SendPostService) oooOO1.f11918Oooo0o;
                ResultKt.throwOnFailure(objWithContext);
                dyid2 = momentSendResultModel3.getDyid();
                if (dyid2 != null) {
                    momentSendModel2.setPostId(com.yalla.support.common.util.OooO.OooO0oO(dyid2));
                }
                momentSendModel3 = momentSendModel2;
                if (momentSendModel3.getListSendPostImage().isEmpty()) {
                    momentSendModel3.setSendPostState(MomentSendState.Success);
                    p169o00Ooo00.OooOOOO oooOOOO13 = p169o00Ooo00.OooOOOO.f32671OooO00o;
                    p169o00Ooo00.OooOOOO.OooO0OO(momentSendModel3);
                    main3 = Dispatchers.getMain();
                    oooOOO = new OooOOO(null);
                    oooOO1.f11918Oooo0o = momentSendModel3;
                    oooOO1.f11919Oooo0oO = null;
                    oooOO1.f11920Oooo0oo = null;
                    oooOO1.f11921OoooO0 = 4;
                    if (BuildersKt.withContext(main3, oooOOO, oooOO1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    LiveEventBus.get("Post_send_success").post(momentSendModel3);
                    return Unit.INSTANCE;
                }
                oooOO1.f11918Oooo0o = momentSendModel3;
                oooOO1.f11919Oooo0oO = null;
                oooOO1.f11920Oooo0oo = null;
                oooOO1.f11921OoooO0 = 5;
                objWithContext = sendPostService.OooO0o0(momentSendModel3, oooOO1);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (((Boolean) objWithContext).booleanValue()) {
                    momentSendModel3.setSendPostState(MomentSendState.Success);
                    p169o00Ooo00.OooOOOO oooOOOO14 = p169o00Ooo00.OooOOOO.f32671OooO00o;
                    p169o00Ooo00.OooOOOO.OooO0OO(momentSendModel3);
                    main4 = Dispatchers.getMain();
                    oooOOOO = new OooOOOO(null);
                    oooOO1.f11918Oooo0o = momentSendModel3;
                    oooOO1.f11921OoooO0 = 6;
                    if (BuildersKt.withContext(main4, oooOOOO, oooOO1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    LiveEventBus.get("Post_send_success").post(momentSendModel3);
                } else {
                    momentSendModel3.setSendPostState(MomentSendState.FailedImage);
                    p169o00Ooo00.OooOOOO oooOOOO15 = p169o00Ooo00.OooOOOO.f32671OooO00o;
                    p169o00Ooo00.OooOOOO.OooO0Oo(momentSendModel3);
                    LiveEventBus.get("Post_send_filed").post(momentSendModel3);
                }
                return Unit.INSTANCE;
            case 4:
                momentSendModel3 = (MomentSendModel) oooOO1.f11918Oooo0o;
                ResultKt.throwOnFailure(objWithContext);
                LiveEventBus.get("Post_send_success").post(momentSendModel3);
                return Unit.INSTANCE;
            case 5:
                momentSendModel3 = (MomentSendModel) oooOO1.f11918Oooo0o;
                ResultKt.throwOnFailure(objWithContext);
                if (((Boolean) objWithContext).booleanValue()) {
                    momentSendModel3.setSendPostState(MomentSendState.Success);
                    p169o00Ooo00.OooOOOO oooOOOO16 = p169o00Ooo00.OooOOOO.f32671OooO00o;
                    p169o00Ooo00.OooOOOO.OooO0OO(momentSendModel3);
                    main4 = Dispatchers.getMain();
                    oooOOOO = new OooOOOO(null);
                    oooOO1.f11918Oooo0o = momentSendModel3;
                    oooOO1.f11921OoooO0 = 6;
                    if (BuildersKt.withContext(main4, oooOOOO, oooOO1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    LiveEventBus.get("Post_send_success").post(momentSendModel3);
                } else {
                    momentSendModel3.setSendPostState(MomentSendState.FailedImage);
                    p169o00Ooo00.OooOOOO oooOOOO17 = p169o00Ooo00.OooOOOO.f32671OooO00o;
                    p169o00Ooo00.OooOOOO.OooO0Oo(momentSendModel3);
                    LiveEventBus.get("Post_send_filed").post(momentSendModel3);
                }
                return Unit.INSTANCE;
            case 6:
                momentSendModel3 = (MomentSendModel) oooOO1.f11918Oooo0o;
                ResultKt.throwOnFailure(objWithContext);
                LiveEventBus.get("Post_send_success").post(momentSendModel3);
                return Unit.INSTANCE;
            case 7:
                ResultKt.throwOnFailure(objWithContext);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.MomentSendModel>] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.MomentSendModel>] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.MomentSendModel>] */
    public final Object OooO0Oo(Continuation<? super Unit> continuation) {
        OooOo oooOo;
        SendPostService sendPostService;
        if (continuation instanceof OooOo) {
            oooOo = (OooOo) continuation;
            int i = oooOo.f11924Oooo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOo.f11924Oooo = i - Integer.MIN_VALUE;
            } else {
                oooOo = new OooOo(continuation);
            }
        } else {
            oooOo = new OooOo(continuation);
        }
        Object obj = oooOo.f11926Oooo0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOo.f11924Oooo;
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                sendPostService = oooOo.f11925Oooo0o;
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
        if (this.f11904Oooo0oO || this.f11906OoooO00.isEmpty()) {
            return Unit.INSTANCE;
        }
        this.f11904Oooo0oO = true;
        MomentSendModel momentSendModel = (MomentSendModel) this.f11906OoooO00.get(0);
        if (momentSendModel.getPostId() > 0) {
            oooOo.f11925Oooo0o = this;
            oooOo.f11924Oooo = 1;
            if (OooO0O0(momentSendModel, oooOo) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            oooOo.f11925Oooo0o = this;
            oooOo.f11924Oooo = 2;
            if (OooO0OO(momentSendModel, oooOo) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        sendPostService = this;
        sendPostService.f11906OoooO00.remove(0);
        oooOo.f11925Oooo0o = null;
        oooOo.f11924Oooo = 3;
        if (sendPostService.OooO0Oo(oooOo) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object OooO0o0(MomentSendModel momentSendModel, Continuation<? super Boolean> continuation) throws Throwable {
        Oooo000 oooo000;
        SendPostService sendPostService;
        if (continuation instanceof Oooo000) {
            oooo000 = (Oooo000) continuation;
            int i = oooo000.f11932OoooO00;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooo000.f11932OoooO00 = i - Integer.MIN_VALUE;
            } else {
                oooo000 = new Oooo000(continuation);
            }
        } else {
            oooo000 = new Oooo000(continuation);
        }
        Object objOooO0oo = oooo000.f11931Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooo000.f11932OoooO00;
        boolean z = true;
        if (i2 != 0) {
            if (i2 == 1) {
                momentSendModel = oooo000.f11930Oooo0oO;
                sendPostService = oooo000.f11929Oooo0o;
                ResultKt.throwOnFailure(objOooO0oo);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objOooO0oo);
            }
        }
        ResultKt.throwOnFailure(objOooO0oo);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = momentSendModel.localImages().iterator();
        while (it.hasNext()) {
            Uri uriOooO0OO = o000Oo0.OooO0OO(this, (String) it.next());
            if (uriOooO0OO != null) {
                Intrinsics.checkNotNullExpressionValue(uriOooO0OO, "getUriFromFilePath(this, path)");
                arrayList.add(uriOooO0OO);
            }
        }
        CloudFileRepo cloudFileRepo = this.f11905Oooo0oo;
        CloudFileType cloudFileType = CloudFileType.MOMENT_POST;
        oooo000.f11929Oooo0o = this;
        oooo000.f11930Oooo0oO = momentSendModel;
        oooo000.f11932OoooO00 = 1;
        objOooO0oo = CloudFileRepo.OooO0oo(cloudFileRepo, cloudFileType, arrayList, oooo000);
        if (objOooO0oo == coroutine_suspended) {
            return coroutine_suspended;
        }
        sendPostService = this;
        List<CloudFileInfo> list = (List) objOooO0oo;
        if (list != null) {
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                CloudFileInfo cloudFileInfo = (CloudFileInfo) obj;
                o00O00.OooO0oO(sendPostService.f11903Oooo0o + " uploadResults \t index=" + i3 + ": \n\t file=" + cloudFileInfo.getFile() + " \n\t url=" + cloudFileInfo.getUrl() + " \n\t imgWidth=" + cloudFileInfo.getImgWidth() + " \n\t imgHeight=" + cloudFileInfo.getImgHight());
                i3 = i4;
            }
        }
        if (list != null && !list.isEmpty()) {
            z = false;
        }
        if (z) {
            return Boxing.boxBoolean(false);
        }
        oooo000.f11929Oooo0o = null;
        oooo000.f11930Oooo0oO = null;
        oooo000.f11932OoooO00 = 2;
        objOooO0oo = sendPostService.OooO00o(momentSendModel, list, oooo000);
        return objOooO0oo == coroutine_suspended ? coroutine_suspended : objOooO0oo;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.MomentSendModel>] */
    @Override // android.app.IntentService
    public final void onHandleIntent(@Nullable Intent intent) {
        if (intent == null) {
            return;
        }
        Serializable serializableExtra = intent.getSerializableExtra("DATA");
        Intrinsics.checkNotNull(serializableExtra, "null cannot be cast to non-null type com.yalla.yalla.model.MomentSendModel");
        MomentSendModel taskModel = (MomentSendModel) serializableExtra;
        if (intent.getBooleanExtra("IsAdd", false)) {
            taskModel.setTaskId(System.currentTimeMillis());
            taskModel.setSendPostState(MomentSendState.Sending);
            p169o00Ooo00.OooOOOO oooOOOO = p169o00Ooo00.OooOOOO.f32671OooO00o;
            Intrinsics.checkNotNullParameter(taskModel, "taskModel");
            ArrayList<MomentDetailModel> arrayList = p169o00Ooo00.OooOOOO.f32672OooO0O0;
            MomentDetailModel momentDetailModel = new MomentDetailModel();
            momentDetailModel.setSendPostModel(taskModel);
            arrayList.add(momentDetailModel);
            LiveEventBus.get("Post_send_add").post(taskModel);
        } else {
            taskModel.setSendPostState(MomentSendState.Sending);
        }
        this.f11906OoooO00.add(taskModel);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getDefault(), null, new OooO0OO(null), 2, null);
    }
}
