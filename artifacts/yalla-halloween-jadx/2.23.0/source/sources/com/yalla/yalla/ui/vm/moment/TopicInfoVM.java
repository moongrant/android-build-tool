package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.TopicInfoRepository$getCircleInfoByDyId$$inlined$call$1;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yalla.yalla.model.topic.TopicVerifyState;
import java.util.ArrayList;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p377o0OOoOo.o0000O;
import p385o0OOooOO.o00oOoo;
import p406o0Oo0Ooo.h0;
import p406o0Oo0Ooo.i0;
import p420o0OoO0OO.o0OOO0o;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J4\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0006\u0010\f\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002R\u001f\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/TopicInfoVM;", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "", "toUserid", "datesort", "", "pageindex", "Lo0OoO0OO/o0OOO0o;", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/model/topic/TopicInfoModel;", "Lkotlin/collections/ArrayList;", "loadUserTopicListAll", "topicId", "Lcom/yalla/yalla/model/topic/TopicVerifyState;", "topicUserVerify", "dyId", "", "getCircleInfoByDyId", "Landroidx/compose/runtime/MutableState;", "topicInfo", "Landroidx/compose/runtime/MutableState;", "getTopicInfo", "()Landroidx/compose/runtime/MutableState;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class TopicInfoVM extends BaseMomentDetailVM {
    public static final int $stable = 0;

    @NotNull
    private final MutableState<TopicInfoModel> topicInfo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicInfoVM$getCircleInfoByDyId$1", f = "TopicInfoVM.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32429OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ TopicInfoVM f32430OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f32431OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, TopicInfoVM topicInfoVM, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f32431OooO0o0 = str;
            this.f32430OooO0o = topicInfoVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f32431OooO0o0, this.f32430OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32429OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f32429OooO0Oo = 1;
                String strOooO0Oo = o000OOo0.OooO0Oo(o0000O.f44163o0000oO0);
                o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
                o0o0oooOooO00o.OooO0O0(this.f32431OooO0o0, "dyid");
                obj = OooOOO.OooO0Oo(new TopicInfoRepository$getCircleInfoByDyId$$inlined$call$1(o0o0oooOooO00o, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                this.f32430OooO0o.getTopicInfo().setValue(apiResult.getData());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Response<ArrayList<TopicInfoModel>>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OOO0o<ArrayList<TopicInfoModel>> f32432OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0OOO0o<ArrayList<TopicInfoModel>> o0ooo0o2) {
            super(1);
            this.f32432OooO0Oo = o0ooo0o2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<ArrayList<TopicInfoModel>> response) {
            Response<ArrayList<TopicInfoModel>> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f32432OooO0Oo.postValue(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Response<TopicVerifyState>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OOO0o<TopicVerifyState> f32433OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o0OOO0o<TopicVerifyState> o0ooo0o2) {
            super(1);
            this.f32433OooO0Oo = o0ooo0o2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<TopicVerifyState> response) {
            Response<TopicVerifyState> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f32433OooO0Oo.postValue(it);
            return Unit.INSTANCE;
        }
    }

    public final void getCircleInfoByDyId(@NotNull String dyId) {
        Intrinsics.checkNotNullParameter(dyId, "dyId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(dyId, this, null), 3, null);
    }

    @NotNull
    public final MutableState<TopicInfoModel> getTopicInfo() {
        return this.topicInfo;
    }

    @NotNull
    public final o0OOO0o<ArrayList<TopicInfoModel>> loadUserTopicListAll(@NotNull String toUserid, @NotNull String datesort, int pageindex) {
        Intrinsics.checkNotNullParameter(toUserid, "toUserid");
        Intrinsics.checkNotNullParameter(datesort, "datesort");
        o0OOO0o<ArrayList<TopicInfoModel>> o0ooo0o2 = new o0OOO0o<>();
        Integer numValueOf = Integer.valueOf(pageindex);
        OooO0O0 listener = new OooO0O0(o0ooo0o2);
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new h0(toUserid, datesort, numValueOf, listener, null), 3, null);
        return o0ooo0o2;
    }

    @NotNull
    public final o0OOO0o<TopicVerifyState> topicUserVerify(@NotNull String topicId) {
        Intrinsics.checkNotNullParameter(topicId, "topicId");
        o0OOO0o<TopicVerifyState> o0ooo0o2 = new o0OOO0o<>();
        OooO0OO listener = new OooO0OO(o0ooo0o2);
        Intrinsics.checkNotNullParameter(topicId, "topicId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new i0(topicId, listener, null), 3, null);
        return o0ooo0o2;
    }
}
