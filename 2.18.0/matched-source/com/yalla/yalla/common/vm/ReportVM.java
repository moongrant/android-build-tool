package com.yalla.yalla.common.vm;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.app.base.model.ReportData;
import com.yalla.support.cloudfilemanager.CloudFileInfo;
import com.yalla.yalla.common.manager.cloud_file.CloudFileType;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.repository.CloudFileRepo;
import com.yalla.yalla.common.repository.ReportRepo$updateReportImg$$inlined$call$1;
import java.util.List;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p255o00ooO0O.o0000O0O;
import p497o0o00OOO.Oooo0;
import p500o0o00Oo0.o00O0O00;
import p522o0o0O0O0.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Deprecated(message = "举报换功能了，迟早删掉")
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bJ*\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\fR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/common/vm/ReportVM;", "Lo00OO/OooO00o;", "Lcom/yalla/yalla/common/manager/cloud_file/CloudFileType;", "reportType", "", "Landroid/net/Uri;", "fileList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/yalla/support/cloudfilemanager/CloudFileInfo;", "uploadReportImage", "cloudFileType", "", "reportId", "cloudFileInfoList", "Lo0o00OOO/Oooo0;", "", "updateReportImg", "", "eventId", "content", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/app/base/model/ReportData;", "reportEvent", "Lcom/yalla/yalla/common/repository/CloudFileRepo;", "cloudFileRepo", "Lcom/yalla/yalla/common/repository/CloudFileRepo;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class ReportVM extends o00OO.OooO00o {
    public static final int $stable = 0;

    @NotNull
    private final CloudFileRepo cloudFileRepo = new CloudFileRepo();

    @NotNull
    private final o00O0O00 reportRepo = new o00O0O00();

    @DebugMetadata(c = "com.yalla.yalla.common.vm.ReportVM$reportEvent$1", f = "ReportVM.kt", i = {}, l = {45, 45}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<ReportData>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f21288Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ String f21289OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f21290OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f21291OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ long f21292OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, long j, String str2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f21290OoooO0 = str;
            this.f21292OoooO0O = j;
            this.f21289OoooO = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f21290OoooO0, this.f21292OoooO0O, this.f21289OoooO, continuation);
            oooO00o.f21291OoooO00 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<ReportData>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21288Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f21291OoooO00;
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
            liveDataScope = (LiveDataScope) this.f21291OoooO00;
            o0OoOo0 o0oooo1 = o0OoOo0.f42843OooO00o;
            String str = this.f21290OoooO0;
            long j = this.f21292OoooO0O;
            String str2 = this.f21289OoooO;
            this.f21291OoooO00 = liveDataScope;
            this.f21288Oooo = 1;
            obj = o0oooo1.OooOO0o(str, j, str2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f21291OoooO00 = null;
            this.f21288Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.ReportVM$updateReportImg$1$1", f = "ReportVM.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public Oooo0 f21293Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ CloudFileType f21294OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Oooo0<Object> f21295OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f21296OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ ReportVM f21297OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ String f21298OoooOO0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ List<CloudFileInfo> f21299o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Oooo0<Object> oooo0, ReportVM reportVM, CloudFileType cloudFileType, String str, List<CloudFileInfo> list, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f21295OoooO0 = oooo0;
            this.f21297OoooO0O = reportVM;
            this.f21294OoooO = cloudFileType;
            this.f21298OoooOO0 = str;
            this.f21299o000oOoO = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f21295OoooO0, this.f21297OoooO0O, this.f21294OoooO, this.f21298OoooOO0, this.f21299o000oOoO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Oooo0<Object> oooo0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21296OoooO00;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0<Object> oooo1 = this.f21295OoooO0;
                o00O0O00 o00o0o01 = this.f21297OoooO0O.reportRepo;
                CloudFileType cloudFileType = this.f21294OoooO;
                String str = this.f21298OoooOO0;
                List<CloudFileInfo> list = this.f21299o000oOoO;
                this.f21293Oooo = oooo1;
                this.f21296OoooO00 = 1;
                Objects.requireNonNull(o00o0o01);
                Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new ReportRepo$updateReportImg$$inlined$call$1(o00o0o01, null, list, cloudFileType, str), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooo0 = oooo1;
                obj = objWithContext;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooo0 = this.f21293Oooo;
                ResultKt.throwOnFailure(obj);
            }
            oooo0.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.ReportVM$uploadReportImage$1$1", f = "ReportVM.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public MutableLiveData f21300Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ CloudFileType f21301OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<List<CloudFileInfo>> f21302OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f21303OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ ReportVM f21304OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ List<Uri> f21305OoooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MutableLiveData<List<CloudFileInfo>> mutableLiveData, ReportVM reportVM, CloudFileType cloudFileType, List<Uri> list, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f21302OoooO0 = mutableLiveData;
            this.f21304OoooO0O = reportVM;
            this.f21301OoooO = cloudFileType;
            this.f21305OoooOO0 = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f21302OoooO0, this.f21304OoooO0O, this.f21301OoooO, this.f21305OoooOO0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21303OoooO00;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData<List<CloudFileInfo>> mutableLiveData2 = this.f21302OoooO0;
                CloudFileRepo cloudFileRepo = this.f21304OoooO0O.cloudFileRepo;
                CloudFileType cloudFileType = this.f21301OoooO;
                List<Uri> list = this.f21305OoooOO0;
                this.f21300Oooo = mutableLiveData2;
                this.f21303OoooO00 = 1;
                Object objOooO0oo = CloudFileRepo.OooO0oo(cloudFileRepo, cloudFileType, list, this);
                if (objOooO0oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = mutableLiveData2;
                obj = objOooO0oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = this.f21300Oooo;
                ResultKt.throwOnFailure(obj);
            }
            mutableLiveData.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final LiveData<ApiResult<ReportData>> reportEvent(@NotNull String reportType, long eventId, @NotNull String content) {
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(content, "content");
        return o0000O0O.OooO00o(new OooO00o(reportType, eventId, content, null));
    }

    @NotNull
    public final Oooo0<Object> updateReportImg(@NotNull CloudFileType cloudFileType, @NotNull String reportId, @NotNull List<CloudFileInfo> cloudFileInfoList) {
        Intrinsics.checkNotNullParameter(cloudFileType, "cloudFileType");
        Intrinsics.checkNotNullParameter(reportId, "reportId");
        Intrinsics.checkNotNullParameter(cloudFileInfoList, "cloudFileInfoList");
        Oooo0<Object> oooo0 = new Oooo0<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(oooo0, this, cloudFileType, reportId, cloudFileInfoList, null), 3, null);
        return oooo0;
    }

    @NotNull
    public final MutableLiveData<List<CloudFileInfo>> uploadReportImage(@NotNull CloudFileType reportType, @NotNull List<Uri> fileList) {
        Intrinsics.checkNotNullParameter(reportType, "reportType");
        Intrinsics.checkNotNullParameter(fileList, "fileList");
        MutableLiveData<List<CloudFileInfo>> mutableLiveData = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0OO(mutableLiveData, this, reportType, fileList, null), 3, null);
        return mutableLiveData;
    }
}
