package com.yalla.yalla.common.vm;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.facebook.share.internal.ShareConstants;
import com.yalla.support.cloudfilemanager.CloudFileInfo;
import com.yalla.support.cloudfilemanager.CloudFileManager;
import com.yalla.yalla.common.manager.cloud_file.CloudFile;
import com.yalla.yalla.common.manager.cloud_file.CloudFileType;
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

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ3\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/common/vm/UserInfoEditVM;", "Lo00OO/OooO00o;", "Landroid/net/Uri;", ShareConstants.MEDIA_URI, "", "sourceId", "", "autoName", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/support/cloudfilemanager/CloudFileInfo;", "uploadAvatar", "(Landroid/net/Uri;Ljava/lang/Long;Z)Landroidx/lifecycle/LiveData;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserInfoEditVM extends o00OO.OooO00o {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.common.vm.UserInfoEditVM$uploadAvatar$1", f = "UserInfoEditVM.kt", i = {}, l = {12, 12}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<CloudFileInfo>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Long f21351Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21352Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21353Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Uri f21354Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ boolean f21355OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Uri uri, Long l, boolean z, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f21354Oooo0oo = uri;
            this.f21351Oooo = l;
            this.f21355OoooO00 = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f21354Oooo0oo, this.f21351Oooo, this.f21355OoooO00, continuation);
            oooO00o.f21353Oooo0oO = obj;
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
            int i = this.f21352Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f21353Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f21353Oooo0oO;
            CloudFileManager<CloudFileType> manager = CloudFile.INSTANCE.getManager();
            CloudFileType cloudFileType = CloudFileType.USER_AVATAR;
            Uri uri = this.f21354Oooo0oo;
            Long l = this.f21351Oooo;
            boolean z = this.f21355OoooO00;
            this.f21353Oooo0oO = liveDataScope;
            this.f21352Oooo0o = 1;
            obj = manager.uploadFile(cloudFileType, uri, l, z, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f21353Oooo0oO = null;
            this.f21352Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ LiveData uploadAvatar$default(UserInfoEditVM userInfoEditVM, Uri uri, Long l, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return userInfoEditVM.uploadAvatar(uri, l, z);
    }

    @NotNull
    public final LiveData<CloudFileInfo> uploadAvatar(@NotNull Uri uri, @Nullable Long sourceId, boolean autoName) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return o0000O0O.OooO00o(new OooO00o(uri, sourceId, autoName, null));
    }
}
