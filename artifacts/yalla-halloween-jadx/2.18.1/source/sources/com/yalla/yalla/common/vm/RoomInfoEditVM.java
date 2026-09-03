package com.yalla.yalla.common.vm;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.facebook.share.internal.ShareConstants;
import com.yalla.support.cloudfilemanager.CloudFileInfo;
import com.yalla.yalla.common.manager.cloud_file.CloudFileType;
import com.yalla.yalla.common.repository.CloudFileRepo;
import com.yalla.yalla.common.repository.RoomRepo$changeImageUrl$$inlined$call$1;
import java.util.List;
import java.util.Objects;
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
import p495o0o00OOO.Oooo0;
import p498o0o00Oo0.o00O0O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\tR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/common/vm/RoomInfoEditVM;", "Lo00OO/OooO00o;", "Landroid/net/Uri;", ShareConstants.MEDIA_URI, "Landroidx/lifecycle/MutableLiveData;", "Lcom/yalla/support/cloudfilemanager/CloudFileInfo;", "uploadRoomHeader", "", "userId", "", "cloudFileInfoList", "Lo0o00OOO/Oooo0;", "", "changeImageUrl", "Lcom/yalla/yalla/common/repository/CloudFileRepo;", "cloudFileRepo", "Lcom/yalla/yalla/common/repository/CloudFileRepo;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomInfoEditVM extends o00OO.OooO00o {
    public static final int $stable = 0;

    @NotNull
    private final CloudFileRepo cloudFileRepo = new CloudFileRepo();

    @NotNull
    private final o00O0O00 roomRepo = new o00O0O00();

    @DebugMetadata(c = "com.yalla.yalla.common.vm.RoomInfoEditVM$changeImageUrl$1$1", f = "RoomInfoEditVM.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ RoomInfoEditVM f21287Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Oooo0 f21288Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f21289Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Oooo0<Object> f21290Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ List<CloudFileInfo> f21291OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f21292OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Oooo0<Object> oooo0, RoomInfoEditVM roomInfoEditVM, String str, List<CloudFileInfo> list, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f21290Oooo0oo = oooo0;
            this.f21287Oooo = roomInfoEditVM;
            this.f21292OoooO00 = str;
            this.f21291OoooO0 = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f21290Oooo0oo, this.f21287Oooo, this.f21292OoooO00, this.f21291OoooO0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Oooo0<Object> oooo0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21289Oooo0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0<Object> oooo1 = this.f21290Oooo0oo;
                o00O0O00 o00o0o01 = this.f21287Oooo.roomRepo;
                CloudFileType cloudFileType = CloudFileType.ROOM_COVER;
                String str = this.f21292OoooO00;
                List<CloudFileInfo> list = this.f21291OoooO0;
                this.f21288Oooo0o = oooo1;
                this.f21289Oooo0oO = 1;
                Objects.requireNonNull(o00o0o01);
                Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new RoomRepo$changeImageUrl$$inlined$call$1(o00o0o01, null, list, cloudFileType, str), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooo0 = oooo1;
                obj = objWithContext;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooo0 = this.f21288Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            oooo0.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.RoomInfoEditVM$uploadRoomHeader$1$1", f = "RoomInfoEditVM.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ RoomInfoEditVM f21293Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public MutableLiveData f21294Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f21295Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<CloudFileInfo> f21296Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Uri f21297OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MutableLiveData<CloudFileInfo> mutableLiveData, RoomInfoEditVM roomInfoEditVM, Uri uri, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f21296Oooo0oo = mutableLiveData;
            this.f21293Oooo = roomInfoEditVM;
            this.f21297OoooO00 = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f21296Oooo0oo, this.f21293Oooo, this.f21297OoooO00, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21295Oooo0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData<CloudFileInfo> mutableLiveData2 = this.f21296Oooo0oo;
                CloudFileRepo cloudFileRepo = this.f21293Oooo.cloudFileRepo;
                CloudFileType cloudFileType = CloudFileType.ROOM_COVER;
                Uri uri = this.f21297OoooO00;
                this.f21294Oooo0o = mutableLiveData2;
                this.f21295Oooo0oO = 1;
                Object objOooO0o = CloudFileRepo.OooO0o(cloudFileRepo, cloudFileType, uri, this);
                if (objOooO0o == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = mutableLiveData2;
                obj = objOooO0o;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = this.f21294Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            mutableLiveData.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final Oooo0<Object> changeImageUrl(@NotNull String userId, @NotNull List<CloudFileInfo> cloudFileInfoList) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(cloudFileInfoList, "cloudFileInfoList");
        Oooo0<Object> oooo0 = new Oooo0<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(oooo0, this, userId, cloudFileInfoList, null), 3, null);
        return oooo0;
    }

    @NotNull
    public final MutableLiveData<CloudFileInfo> uploadRoomHeader(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        MutableLiveData<CloudFileInfo> mutableLiveData = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(mutableLiveData, this, uri, null), 3, null);
        return mutableLiveData;
    }
}
