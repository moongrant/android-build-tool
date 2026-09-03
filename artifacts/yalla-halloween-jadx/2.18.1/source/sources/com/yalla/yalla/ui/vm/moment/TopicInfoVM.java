package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.model.TopicVerifyState;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p153o00Oo0oO.o00000OO;
import p495o0o00OOO.Oooo0;
import p520o0o0O0O0.o00O;
import p520o0o0O0O0.o00OO000;
import p520o0o0O0O0.o00OO00O;
import p520o0o0O0O0.oo0o0O0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002J4\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\r\u001a\u00020\u0002J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0010\u001a\u00020\u0002¨\u0006\u0014"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/TopicInfoVM;", "Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "", "toUserid", "Lo0o00OOO/Oooo0;", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/model/TopicInfoModel;", "Lkotlin/collections/ArrayList;", "loadUserTopicListCount3", "datesort", "", "pageindex", "loadUserTopicListAll", "topicId", "Lcom/yalla/yalla/model/TopicVerifyState;", "topicUserVerify", "dyId", "getCircleInfoByDyId", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopicInfoVM extends MomentVM {
    public static final int $stable = 0;

    public static final class OooO00o extends Lambda implements Function1<Response<TopicInfoModel>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Oooo0<TopicInfoModel> f25965Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Oooo0<TopicInfoModel> oooo0) {
            super(1);
            this.f25965Oooo0o = oooo0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<TopicInfoModel> response) {
            Response<TopicInfoModel> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f25965Oooo0o.postValue(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Response<ArrayList<TopicInfoModel>>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Oooo0<ArrayList<TopicInfoModel>> f25966Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Oooo0<ArrayList<TopicInfoModel>> oooo0) {
            super(1);
            this.f25966Oooo0o = oooo0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<ArrayList<TopicInfoModel>> response) {
            Response<ArrayList<TopicInfoModel>> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f25966Oooo0o.postValue(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Response<ArrayList<TopicInfoModel>>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Oooo0<ArrayList<TopicInfoModel>> f25967Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Oooo0<ArrayList<TopicInfoModel>> oooo0) {
            super(1);
            this.f25967Oooo0o = oooo0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<ArrayList<TopicInfoModel>> response) {
            Response<ArrayList<TopicInfoModel>> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f25967Oooo0o.postValue(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Response<TopicVerifyState>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Oooo0<TopicVerifyState> f25968Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Oooo0<TopicVerifyState> oooo0) {
            super(1);
            this.f25968Oooo0o = oooo0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<TopicVerifyState> response) {
            Response<TopicVerifyState> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f25968Oooo0o.postValue(it);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final Oooo0<TopicInfoModel> getCircleInfoByDyId(@NotNull String dyId) {
        Intrinsics.checkNotNullParameter(dyId, "dyId");
        Oooo0<TopicInfoModel> oooo0 = new Oooo0<>();
        OooO00o listener = new OooO00o(oooo0);
        Intrinsics.checkNotNullParameter(dyId, "dyId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00000OO.f32214OooO0oo.getCircleInfoByDyId(dyId, new oo0o0O0(listener));
        return oooo0;
    }

    @NotNull
    public final Oooo0<ArrayList<TopicInfoModel>> loadUserTopicListAll(@NotNull String toUserid, @NotNull String datesort, int pageindex) {
        Intrinsics.checkNotNullParameter(toUserid, "toUserid");
        Intrinsics.checkNotNullParameter(datesort, "datesort");
        Oooo0<ArrayList<TopicInfoModel>> oooo0 = new Oooo0<>();
        Integer numValueOf = Integer.valueOf(pageindex);
        OooO0O0 listener = new OooO0O0(oooo0);
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00000OO.f32214OooO0oo.circlePersonal(toUserid, 1, datesort, numValueOf, new o00O(listener));
        return oooo0;
    }

    @NotNull
    public final Oooo0<ArrayList<TopicInfoModel>> loadUserTopicListCount3(@NotNull String toUserid) {
        Intrinsics.checkNotNullParameter(toUserid, "toUserid");
        Oooo0<ArrayList<TopicInfoModel>> oooo0 = new Oooo0<>();
        OooO0OO listener = new OooO0OO(oooo0);
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00000OO.f32214OooO0oo.circlePersonal(toUserid, 0, null, 1, new o00OO000(listener));
        return oooo0;
    }

    @NotNull
    public final Oooo0<TopicVerifyState> topicUserVerify(@NotNull String topicId) {
        Intrinsics.checkNotNullParameter(topicId, "topicId");
        Oooo0<TopicVerifyState> oooo0 = new Oooo0<>();
        OooO0o listener = new OooO0o(oooo0);
        Intrinsics.checkNotNullParameter(topicId, "topicId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00000OO.f32214OooO0oo.circleUserVerify(topicId, new o00OO00O(listener));
        return oooo0;
    }
}
