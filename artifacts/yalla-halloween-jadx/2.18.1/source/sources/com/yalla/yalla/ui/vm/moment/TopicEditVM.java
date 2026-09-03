package com.yalla.yalla.ui.vm.moment;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.facebook.share.internal.ShareConstants;
import com.yalla.support.cloudfilemanager.CloudFileInfo;
import com.yalla.yalla.common.manager.cloud_file.CloudFileType;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.repository.CloudFileRepo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o00000OO;
import p254o00ooO0O.o0000O0O;
import p495o0o00OOO.Oooo0;
import p520o0o0O0O0.o00O00OO;
import p520o0o0O0O0.o00O00o0;
import p520o0o0O0O0.o00O0O00;
import p520o0o0O0O0.oOO00O;
import p520o0o0O0O0.oo00o;
import p522o0o0O0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\u0007J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0007J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0007J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0007R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/TopicEditVM;", "Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "Landroid/net/Uri;", ShareConstants.MEDIA_URI, "Landroidx/lifecycle/LiveData;", "Lcom/yalla/support/cloudfilemanager/CloudFileInfo;", "uploadTopicCover", "", "topicName", "Lo0o00OOO/Oooo0;", "", "checkTopicName", "topicDesc", "checkTopicDesc", "topicImage", "topicIntroduction", "createTopic", "", "topicId", "changeTopicImage", "changeTopicDesc", "topicRule", "changeTopicRule", "Lcom/yalla/yalla/common/repository/CloudFileRepo;", "cloudFileRepo", "Lcom/yalla/yalla/common/repository/CloudFileRepo;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopicEditVM extends MomentVM {
    public static final int $stable = 0;

    @NotNull
    private final CloudFileRepo cloudFileRepo = new CloudFileRepo();

    public static final class OooO extends Lambda implements Function1<Response<Boolean>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Oooo0<Boolean> f25920Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Oooo0<Boolean> oooo0) {
            super(1);
            this.f25920Oooo0o = oooo0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<Boolean> response) {
            Response<Boolean> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f25920Oooo0o.postValue(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Response<Boolean>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Oooo0<Boolean> f25921Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Oooo0<Boolean> oooo0) {
            super(1);
            this.f25921Oooo0o = oooo0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<Boolean> response) {
            Response<Boolean> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f25921Oooo0o.postValue(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Response<Boolean>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Oooo0<Boolean> f25922Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Oooo0<Boolean> oooo0) {
            super(1);
            this.f25922Oooo0o = oooo0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<Boolean> response) {
            Response<Boolean> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f25922Oooo0o.postValue(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Response<Boolean>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Oooo0<Boolean> f25923Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Oooo0<Boolean> oooo0) {
            super(1);
            this.f25923Oooo0o = oooo0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<Boolean> response) {
            Response<Boolean> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f25923Oooo0o.postValue(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Response<Boolean>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Oooo0<Boolean> f25924Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Oooo0<Boolean> oooo0) {
            super(1);
            this.f25924Oooo0o = oooo0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<Boolean> response) {
            Response<Boolean> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f25924Oooo0o.postValue(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Response<Boolean>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Oooo0<Boolean> f25925Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(Oooo0<Boolean> oooo0) {
            super(1);
            this.f25925Oooo0o = oooo0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<Boolean> response) {
            Response<Boolean> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f25925Oooo0o.postValue(it);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicEditVM$uploadTopicCover$1", f = "TopicEditVM.kt", i = {}, l = {16, 16}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<LiveDataScope<CloudFileInfo>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Uri f25926Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25927Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25928Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Uri uri, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f25926Oooo = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0O oooOO0O = TopicEditVM.this.new OooOO0O(this.f25926Oooo, continuation);
            oooOO0O.f25928Oooo0oO = obj;
            return oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<CloudFileInfo> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25927Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25928Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25928Oooo0oO;
            CloudFileRepo cloudFileRepo = TopicEditVM.this.cloudFileRepo;
            CloudFileType cloudFileType = CloudFileType.MOMENT_TOPIC_HEADER;
            Uri uri = this.f25926Oooo;
            this.f25928Oooo0oO = liveDataScope;
            this.f25927Oooo0o = 1;
            obj = CloudFileRepo.OooO0o(cloudFileRepo, cloudFileType, uri, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25928Oooo0oO = null;
            this.f25927Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final Oooo0<Boolean> changeTopicDesc(long topicId, @NotNull String topicDesc) {
        Intrinsics.checkNotNullParameter(topicDesc, "topicDesc");
        Oooo0<Boolean> oooo0 = new Oooo0<>();
        OooO00o listener = new OooO00o(oooo0);
        Intrinsics.checkNotNullParameter(topicDesc, "topicDesc");
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00000OO.f32214OooO0oo.circleInfoEditDesc(String.valueOf(topicId), o00O0.OooO(topicDesc), new oo00o(listener));
        return oooo0;
    }

    @NotNull
    public final Oooo0<Boolean> changeTopicImage(long topicId, @NotNull String topicImage) {
        Intrinsics.checkNotNullParameter(topicImage, "topicImage");
        Oooo0<Boolean> oooo0 = new Oooo0<>();
        OooO0O0 listener = new OooO0O0(oooo0);
        Intrinsics.checkNotNullParameter(topicImage, "topicImage");
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00000OO.f32214OooO0oo.circleInfoEditImage(String.valueOf(topicId), topicImage, new p520o0o0O0O0.o00O0(listener));
        return oooo0;
    }

    @NotNull
    public final Oooo0<Boolean> changeTopicRule(long topicId, @NotNull String topicRule) {
        Intrinsics.checkNotNullParameter(topicRule, "topicRule");
        Oooo0<Boolean> oooo0 = new Oooo0<>();
        OooO0OO listener = new OooO0OO(oooo0);
        Intrinsics.checkNotNullParameter(topicRule, "topicRule");
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00000OO.f32214OooO0oo.circleInfoEditRule(String.valueOf(topicId), o00O0.OooO(topicRule), new o00O0O00(listener));
        return oooo0;
    }

    @NotNull
    public final Oooo0<Boolean> checkTopicDesc(@NotNull String topicDesc) {
        Intrinsics.checkNotNullParameter(topicDesc, "topicDesc");
        Oooo0<Boolean> oooo0 = new Oooo0<>();
        OooO0o listener = new OooO0o(oooo0);
        Intrinsics.checkNotNullParameter(topicDesc, "topicDesc");
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00000OO.f32214OooO0oo.checkTopicInfoAvailable(o00O0.OooO(topicDesc), 2, new oOO00O(listener));
        return oooo0;
    }

    @NotNull
    public final Oooo0<Boolean> checkTopicName(@NotNull String topicName) {
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        Oooo0<Boolean> oooo0 = new Oooo0<>();
        OooO listener = new OooO(oooo0);
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00000OO.f32214OooO0oo.checkTopicInfoAvailable(o00O0.OooO(topicName), 1, new o00O00OO(listener));
        return oooo0;
    }

    @NotNull
    public final Oooo0<Boolean> createTopic(@NotNull String topicImage, @NotNull String topicName, @NotNull String topicIntroduction) {
        Intrinsics.checkNotNullParameter(topicImage, "topicImage");
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        Intrinsics.checkNotNullParameter(topicIntroduction, "topicIntroduction");
        Oooo0<Boolean> oooo0 = new Oooo0<>();
        OooOO0 listener = new OooOO0(oooo0);
        Intrinsics.checkNotNullParameter(topicImage, "topicImage");
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        Intrinsics.checkNotNullParameter(topicIntroduction, "topicIntroduction");
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00000OO.f32214OooO0oo.createTopic(topicImage, o00O0.OooO(topicName), o00O0.OooO(topicIntroduction), new o00O00o0(listener));
        return oooo0;
    }

    @NotNull
    public final LiveData<CloudFileInfo> uploadTopicCover(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return o0000O0O.OooO00o(new OooOO0O(uri, null));
    }
}
