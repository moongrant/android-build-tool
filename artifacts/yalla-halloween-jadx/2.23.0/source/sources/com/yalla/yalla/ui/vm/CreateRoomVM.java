package com.yalla.yalla.ui.vm;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.code.android.util.o00oO0o;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.manager.cloud_file.CloudFileType;
import com.yalla.yalla.repository.CloudFileRepo;
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
import p136o00OOOo0.OooO0OO;
import p394o0Oo00oO.o0O0O00;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/ui/vm/CreateRoomVM;", "Lo0Oo00oO/o0O0O00;", "Landroid/net/Uri;", ShareConstants.MEDIA_URI, "Landroidx/lifecycle/LiveData;", "Lo00OOOo0/OooO0OO;", "uploadRoomHeader", "Lcom/yalla/yalla/repository/CloudFileRepo;", "cloudFileRepo", "Lcom/yalla/yalla/repository/CloudFileRepo;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class CreateRoomVM extends o0O0O00 {
    public static final int $stable = 0;

    @NotNull
    private final CloudFileRepo cloudFileRepo = new CloudFileRepo();

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.CreateRoomVM$uploadRoomHeader$1", f = "CreateRoomVM.kt", i = {}, l = {16, 16}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<OooO0OO>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31428OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31430OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Uri f31431OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Uri uri, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f31431OooO0oO = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = CreateRoomVM.this.new OooO00o(this.f31431OooO0oO, continuation);
            oooO00o.f31430OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<OooO0OO> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31428OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31430OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31430OooO0o0;
            CloudFileRepo cloudFileRepo = CreateRoomVM.this.cloudFileRepo;
            CloudFileType cloudFileType = CloudFileType.ROOM_COVER;
            Uri uri = this.f31431OooO0oO;
            this.f31430OooO0o0 = liveDataScope;
            this.f31428OooO0Oo = 1;
            obj = CloudFileRepo.OooO0Oo(cloudFileRepo, cloudFileType, uri, null, false, this, 28);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31430OooO0o0 = null;
            this.f31428OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final LiveData<OooO0OO> uploadRoomHeader(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return o00oO0o.OooO00o(new OooO00o(uri, null));
    }
}
