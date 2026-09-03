package com.yalla.yalla.common.vm;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.facebook.share.internal.ShareConstants;
import com.yalla.support.cloudfilemanager.CloudFileInfo;
import com.yalla.yalla.common.manager.cloud_file.CloudFileType;
import com.yalla.yalla.common.repository.CloudFileRepo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0O;
import p498o0o00Oo0.o00O0O00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/common/vm/CreateRoomVM;", "Lo00OO/OooO00o;", "Landroid/net/Uri;", ShareConstants.MEDIA_URI, "Landroidx/lifecycle/LiveData;", "Lcom/yalla/support/cloudfilemanager/CloudFileInfo;", "uploadRoomHeader", "Lcom/yalla/yalla/common/repository/CloudFileRepo;", "cloudFileRepo", "Lcom/yalla/yalla/common/repository/CloudFileRepo;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class CreateRoomVM extends o00OO.OooO00o {
    public static final int $stable = 0;

    @NotNull
    private final CloudFileRepo cloudFileRepo = new CloudFileRepo();

    @NotNull
    private final o00O0O00 roomRepo = new o00O0O00();

    @DebugMetadata(c = "com.yalla.yalla.common.vm.CreateRoomVM$uploadRoomHeader$1", f = "CreateRoomVM.kt", i = {}, l = {22, 22}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<CloudFileInfo>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Uri f21236Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21237Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21238Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Uri uri, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f21236Oooo = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = CreateRoomVM.this.new OooO00o(this.f21236Oooo, continuation);
            oooO00o.f21238Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<CloudFileInfo> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21237Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f21238Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f21238Oooo0oO;
            CloudFileRepo cloudFileRepo = CreateRoomVM.this.cloudFileRepo;
            CloudFileType cloudFileType = CloudFileType.ROOM_COVER;
            Uri uri = this.f21236Oooo;
            this.f21238Oooo0oO = liveDataScope;
            this.f21237Oooo0o = 1;
            obj = CloudFileRepo.OooO0o(cloudFileRepo, cloudFileType, uri, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f21238Oooo0oO = null;
            this.f21237Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final LiveData<CloudFileInfo> uploadRoomHeader(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return o0000O0O.OooO00o(new OooO00o(uri, null));
    }
}
