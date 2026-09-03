package com.yalla.yalla.ui.vm.moment;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.code.android.util.o00oO0o;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.manager.cloud_file.CloudFileType;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.repository.CloudFileRepo;
import java.util.LinkedHashMap;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o0000O;
import p406o0Oo0Ooo.a0;
import p406o0Oo0Ooo.v;
import p406o0Oo0Ooo.w;
import p406o0Oo0Ooo.x;
import p406o0Oo0Ooo.y;
import p406o0Oo0Ooo.z;
import p417o0OoO0.o0000O0O;
import p420o0OoO0OO.o0OOO0o;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\f\u001a\u00020\u0007J$\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0007J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u0007J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0007R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/TopicEditVM;", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "Landroid/net/Uri;", ShareConstants.MEDIA_URI, "Landroidx/lifecycle/LiveData;", "Lo00OOOo0/OooO0OO;", "uploadTopicCover", "", "topicName", "Lo0OoO0OO/o0OOO0o;", "", "checkTopicName", "topicDesc", "checkTopicDesc", "topicImage", "topicIntroduction", "createTopic", "", "topicId", "changeTopicImage", "changeTopicDesc", "topicRule", "changeTopicRule", "Lcom/yalla/yalla/repository/CloudFileRepo;", "cloudFileRepo", "Lcom/yalla/yalla/repository/CloudFileRepo;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class TopicEditVM extends BaseMomentDetailVM {
    public static final int $stable = 0;

    @NotNull
    private final CloudFileRepo cloudFileRepo = new CloudFileRepo();

    public static final class OooO extends Lambda implements Function1<Response<Boolean>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OOO0o<Boolean> f32384OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(o0OOO0o<Boolean> o0ooo0o2) {
            super(1);
            this.f32384OooO0Oo = o0ooo0o2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<Boolean> response) {
            Response<Boolean> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f32384OooO0Oo.postValue(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Response<Boolean>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OOO0o<Boolean> f32385OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o0OOO0o<Boolean> o0ooo0o2) {
            super(1);
            this.f32385OooO0Oo = o0ooo0o2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<Boolean> response) {
            Response<Boolean> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f32385OooO0Oo.postValue(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Response<Boolean>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OOO0o<Boolean> f32386OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0OOO0o<Boolean> o0ooo0o2) {
            super(1);
            this.f32386OooO0Oo = o0ooo0o2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<Boolean> response) {
            Response<Boolean> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f32386OooO0Oo.postValue(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Response<Boolean>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OOO0o<Boolean> f32387OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o0OOO0o<Boolean> o0ooo0o2) {
            super(1);
            this.f32387OooO0Oo = o0ooo0o2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<Boolean> response) {
            Response<Boolean> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f32387OooO0Oo.postValue(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Response<Boolean>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OOO0o<Boolean> f32388OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o0OOO0o<Boolean> o0ooo0o2) {
            super(1);
            this.f32388OooO0Oo = o0ooo0o2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<Boolean> response) {
            Response<Boolean> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f32388OooO0Oo.postValue(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Response<Boolean>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OOO0o<Boolean> f32389OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(o0OOO0o<Boolean> o0ooo0o2) {
            super(1);
            this.f32389OooO0Oo = o0ooo0o2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<Boolean> response) {
            Response<Boolean> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f32389OooO0Oo.postValue(it);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicEditVM$uploadTopicCover$1", f = "TopicEditVM.kt", i = {}, l = {16, 16}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<LiveDataScope<p136o00OOOo0.OooO0OO>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32390OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32392OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Uri f32393OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Uri uri, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f32393OooO0oO = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0O oooOO0O = TopicEditVM.this.new OooOO0O(this.f32393OooO0oO, continuation);
            oooOO0O.f32392OooO0o0 = obj;
            return oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<p136o00OOOo0.OooO0OO> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32390OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32392OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32392OooO0o0;
            CloudFileRepo cloudFileRepo = TopicEditVM.this.cloudFileRepo;
            CloudFileType cloudFileType = CloudFileType.MOMENT_TOPIC_HEADER;
            Uri uri = this.f32393OooO0oO;
            this.f32392OooO0o0 = liveDataScope;
            this.f32390OooO0Oo = 1;
            obj = CloudFileRepo.OooO0Oo(cloudFileRepo, cloudFileType, uri, null, false, this, 28);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32392OooO0o0 = null;
            this.f32390OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final o0OOO0o<Boolean> changeTopicDesc(long topicId, @NotNull String topicDesc) {
        Intrinsics.checkNotNullParameter(topicDesc, "topicDesc");
        o0OOO0o<Boolean> o0ooo0o2 = new o0OOO0o<>();
        OooO00o listener = new OooO00o(o0ooo0o2);
        Intrinsics.checkNotNullParameter(topicDesc, "topicDesc");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String id = String.valueOf(topicId);
        String cirDescribe = o0000O0O.OooOO0(topicDesc);
        y callback = new y(listener);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(cirDescribe, "cirDescribe");
        Intrinsics.checkNotNullParameter(callback, "callback");
        LinkedHashMap params = oO00o000.OooO00o();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        params.put("id", id);
        params.put("cirDescribe", cirDescribe);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0OO(o0000O.f44149o0000O0O, o0000O.f44154o0000Oo, params, callback);
        return o0ooo0o2;
    }

    @NotNull
    public final o0OOO0o<Boolean> changeTopicImage(long topicId, @NotNull String topicImage) {
        Intrinsics.checkNotNullParameter(topicImage, "topicImage");
        o0OOO0o<Boolean> o0ooo0o2 = new o0OOO0o<>();
        OooO0O0 listener = new OooO0O0(o0ooo0o2);
        Intrinsics.checkNotNullParameter(topicImage, "topicImage");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String id = String.valueOf(topicId);
        z callback = new z(listener);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(topicImage, "cirImage");
        Intrinsics.checkNotNullParameter(callback, "callback");
        LinkedHashMap params = oO00o000.OooO00o();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        params.put("id", id);
        params.put("cirImage", topicImage);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0OO(o0000O.f44149o0000O0O, o0000O.f44154o0000Oo, params, callback);
        return o0ooo0o2;
    }

    @NotNull
    public final o0OOO0o<Boolean> changeTopicRule(long topicId, @NotNull String topicRule) {
        Intrinsics.checkNotNullParameter(topicRule, "topicRule");
        o0OOO0o<Boolean> o0ooo0o2 = new o0OOO0o<>();
        OooO0OO listener = new OooO0OO(o0ooo0o2);
        Intrinsics.checkNotNullParameter(topicRule, "topicRule");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String id = String.valueOf(topicId);
        String cirRule = o0000O0O.OooOO0(topicRule);
        a0 callback = new a0(listener);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(cirRule, "cirRule");
        Intrinsics.checkNotNullParameter(callback, "callback");
        LinkedHashMap params = oO00o000.OooO00o();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        params.put("id", id);
        params.put("cirRule", cirRule);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0OO(o0000O.f44149o0000O0O, o0000O.f44154o0000Oo, params, callback);
        return o0ooo0o2;
    }

    @NotNull
    public final o0OOO0o<Boolean> checkTopicDesc(@NotNull String topicDesc) {
        Intrinsics.checkNotNullParameter(topicDesc, "topicDesc");
        o0OOO0o<Boolean> o0ooo0o2 = new o0OOO0o<>();
        OooO0o listener = new OooO0o(o0ooo0o2);
        Intrinsics.checkNotNullParameter(topicDesc, "topicDesc");
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new v(topicDesc, listener, null), 3, null);
        return o0ooo0o2;
    }

    @NotNull
    public final o0OOO0o<Boolean> checkTopicName(@NotNull String topicName) {
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        o0OOO0o<Boolean> o0ooo0o2 = new o0OOO0o<>();
        OooO listener = new OooO(o0ooo0o2);
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new w(topicName, listener, null), 3, null);
        return o0ooo0o2;
    }

    @NotNull
    public final o0OOO0o<Boolean> createTopic(@NotNull String topicImage, @NotNull String topicName, @NotNull String topicIntroduction) {
        Intrinsics.checkNotNullParameter(topicImage, "topicImage");
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        Intrinsics.checkNotNullParameter(topicIntroduction, "topicIntroduction");
        o0OOO0o<Boolean> o0ooo0o2 = new o0OOO0o<>();
        OooOO0 listener = new OooOO0(o0ooo0o2);
        Intrinsics.checkNotNullParameter(topicImage, "topicImage");
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        Intrinsics.checkNotNullParameter(topicIntroduction, "topicIntroduction");
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new x(topicImage, topicName, topicIntroduction, listener, null), 3, null);
        return o0ooo0o2;
    }

    @NotNull
    public final LiveData<p136o00OOOo0.OooO0OO> uploadTopicCover(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return o00oO0o.OooO00o(new OooOO0O(uri, null));
    }
}
