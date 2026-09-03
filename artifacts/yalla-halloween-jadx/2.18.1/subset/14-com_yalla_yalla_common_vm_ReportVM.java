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
import p254o00ooO0O.o0000O0O;
import p498o0o00Oo0.o00O0;
import p520o0o0O0O0.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Deprecated(message = "举报换功能了，迟早删掉")
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ*\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bJ*\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\fR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/common/vm/ReportVM;", "Lo00OO/OooO00o;", "Lcom/yalla/yalla/common/manager/cloud_file/CloudFileType;", "reportType", "", "Landroid/net/Uri;", "fileList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/yalla/support/cloudfilemanager/CloudFileInfo;", "uploadReportImage", "cloudFileType", "", "reportId", "cloudFileInfoList", "Lo0o00OOO/Oooo0;", "", "updateReportImg", "", "eventId", "content", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/app/base/model/ReportData;", "reportEvent", "Lcom/yalla/yalla/common/repository/CloudFileRepo;", "cloudFileRepo", "Lcom/yalla/yalla/common/repository/CloudFileRepo;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class ReportVM extends o00OO.OooO00o {
    public static final int $stable = 0;

    @NotNull
    private final CloudFileRepo cloudFileRepo = new CloudFileRepo();

    @NotNull
    private final o00O0 reportRepo = new o00O0();

    @DebugMetadata(c = "com.yalla.yalla.common.vm.ReportVM$reportEvent$1", f = "ReportVM.kt", i = {}, l = {45, 45}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<ReportData>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ long f21269Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21270Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21271Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f21272Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f21273OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, long j, String str2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f21272Oooo0oo = str;
            this.f21269Oooo = j;
            this.f21273OoooO00 = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f21272Oooo0oo, this.f21269Oooo, this.f21273OoooO00, continuation);
            oooO00o.f21271Oooo0oO = obj;
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
            int i = this.f21270Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f21271Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f21271Oooo0oO;
            Oooo0 oooo0 = Oooo0.f42257OooO00o;
            String str = this.f21272Oooo0oo;
            long j = this.f21269Oooo;
            String str2 = this.f21273OoooO00;
            this.f21271Oooo0oO = liveDataScope;
            this.f21270Oooo0o = 1;
            obj = oooo0.OooOO0o(str, j, str2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f21271Oooo0oO = null;
            this.f21270Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.ReportVM$updateReportImg$1$1", f = "ReportVM.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ ReportVM f21274Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public p495o0o00OOO.Oooo0 f21275Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f21276Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ p495o0o00OOO.Oooo0<Object> f21277Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f21278OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ CloudFileType f21279OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ List<CloudFileInfo> f21280OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(p495o0o00OOO.Oooo0<Object> oooo0, ReportVM reportVM, CloudFileType cloudFileType, String str, List<CloudFileInfo> list, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f21277Oooo0oo = oooo0;
            this.f21274Oooo = reportVM;
            this.f21279OoooO00 = cloudFileType;
            this.f21278OoooO0 = str;
            this.f21280OoooO0O = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f21277Oooo0oo, this.f21274Oooo, this.f21279OoooO00, this.f21278OoooO0, this.f21280OoooO0O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            p495o0o00OOO.Oooo0<Object> oooo0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21276Oooo0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                p495o0o00OOO.Oooo0<Object> oooo1 = this.f21277Oooo0oo;
                o00O0 o00o1 = this.f21274Oooo.reportRepo;
                CloudFileType cloudFileType = this.f21279OoooO00;
                String str = this.f21278OoooO0;
                List<CloudFileInfo> list = this.f21280OoooO0O;
                this.f21275Oooo0o = oooo1;
                this.f21276Oooo0oO = 1;
                Objects.requireNonNull(o00o1);
                Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new ReportRepo$updateReportImg$$inlined$call$1(o00o1, null, list, cloudFileType, str), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooo0 = oooo1;
                obj = objWithContext;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooo0 = this.f21275Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            oooo0.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.ReportVM$uploadReportImage$1$1", f = "ReportVM.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ ReportVM f21281Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public MutableLiveData f21282Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f21283Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<List<CloudFileInfo>> f21284Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ List<Uri> f21285OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ CloudFileType f21286OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(MutableLiveData<List<CloudFileInfo>> mutableLiveData, ReportVM reportVM, CloudFileType cloudFileType, List<Uri> list, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f21284Oooo0oo = mutableLiveData;
            this.f21281Oooo = reportVM;
            this.f21286OoooO00 = cloudFileType;
            this.f21285OoooO0 = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f21284Oooo0oo, this.f21281Oooo, this.f21286OoooO00, this.f21285OoooO0, continuation);
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
            int i = this.f21283Oooo0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData<List<CloudFileInfo>> mutableLiveData2 = this.f21284Oooo0oo;
                CloudFileRepo cloudFileRepo = this.f21281Oooo.cloudFileRepo;
                CloudFileType cloudFileType = this.f21286OoooO00;
                List<Uri> list = this.f21285OoooO0;
                this.f21282Oooo0o = mutableLiveData2;
                this.f21283Oooo0oO = 1;
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
                mutableLiveData = this.f21282Oooo0o;
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
    public final p495o0o00OOO.Oooo0<Object> updateReportImg(@NotNull CloudFileType cloudFileType, @NotNull String reportId, @NotNull List<CloudFileInfo> cloudFileInfoList) {
        Intrinsics.checkNotNullParameter(cloudFileType, "cloudFileType");
        Intrinsics.checkNotNullParameter(reportId, "reportId");
        Intrinsics.checkNotNullParameter(cloudFileInfoList, "cloudFileInfoList");
        p495o0o00OOO.Oooo0<Object> oooo0 = new p495o0o00OOO.Oooo0<>();
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
