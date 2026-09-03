package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.model.Error;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.model.TopicInfoModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p153o00Oo0oO.o00000OO;
import p495o0o00OOO.Oooo0;
import p520o0o0O0O0.o00O0O0;
import p520o0o0O0O0.o00O0OO0;
import p520o0o0O0O0.oo0oOO0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b2\u0006\u0010\f\u001a\u00020\u000bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001f\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R-\u0010\u001a\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\rj\b\u0012\u0004\u0012\u00020\u000b`\u00190\u00108\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015R\u001f\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001f\u0010\u0015R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0006¢\u0006\f\n\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0015R\"\u0010\"\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/TopicDetailVM;", "Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "", "getCurrentTopicUserId", "", "loadTopicDetail", "", "follow", "Lo0o00OOO/Oooo0;", "", "followTopic", "", "circleId", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/common/db/table/UserInfo;", "circleAdmin", "Landroidx/lifecycle/MutableLiveData;", "Lcom/yalla/yalla/model/TopicInfoModel;", "topicDetailLocal", "Landroidx/lifecycle/MutableLiveData;", "getTopicDetailLocal", "()Landroidx/lifecycle/MutableLiveData;", "isFollow", "topicOwnerId", "getTopicOwnerId", "Lkotlin/collections/ArrayList;", "topicManagerIds", "getTopicManagerIds", "topDyId", "getTopDyId", "topDyIdRefresh", "getTopDyIdRefresh", "deletePostId", "getDeletePostId", "loadCircleAdminIsSuccess", "Z", "getLoadCircleAdminIsSuccess", "()Z", "setLoadCircleAdminIsSuccess", "(Z)V", "topicDetailLiveData", "Lo0o00OOO/Oooo0;", "getTopicDetailLiveData", "()Lo0o00OOO/Oooo0;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopicDetailVM extends MomentVM {
    public static final int $stable = 8;
    private boolean loadCircleAdminIsSuccess;

    @NotNull
    private final Oooo0<TopicInfoModel> topicDetailLiveData = new Oooo0<>();

    @NotNull
    private final MutableLiveData<TopicInfoModel> topicDetailLocal = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> isFollow = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Long> topicOwnerId = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<ArrayList<String>> topicManagerIds = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Long> topDyId = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Long> topDyIdRefresh = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Long> deletePostId = new MutableLiveData<>();

    public static final class OooO00o extends Lambda implements Function1<Response<ArrayList<UserInfo>>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Oooo0<ArrayList<UserInfo>> f25915Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Oooo0<ArrayList<UserInfo>> oooo0) {
            super(1);
            this.f25915Oooo0oO = oooo0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<ArrayList<UserInfo>> response) {
            Response<ArrayList<UserInfo>> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getIsSuccess()) {
                TopicDetailVM.this.setLoadCircleAdminIsSuccess(true);
                ArrayList<String> arrayList = new ArrayList<>();
                ArrayList<UserInfo> data = it.getData();
                if (data != null) {
                    Iterator<T> it2 = data.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(String.valueOf(((UserInfo) it2.next()).getUserId()));
                    }
                }
                if (true ^ arrayList.isEmpty()) {
                    TopicDetailVM.this.getTopicManagerIds().postValue(arrayList);
                }
            }
            this.f25915Oooo0oO.postValue(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Response<Integer>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Oooo0<Integer> f25916Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ TopicDetailVM f25917Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f25918Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Oooo0<Integer> oooo0, TopicDetailVM topicDetailVM, boolean z) {
            super(1);
            this.f25916Oooo0o = oooo0;
            this.f25917Oooo0oO = topicDetailVM;
            this.f25918Oooo0oo = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<Integer> response) {
            Integer code2;
            Response<Integer> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f25916Oooo0o.postValue(it);
            if (it.getIsSuccess()) {
                this.f25917Oooo0oO.isFollow().postValue(Boolean.valueOf(this.f25918Oooo0oo));
            } else {
                Error error = it.getError();
                boolean z = false;
                if (error != null && (code2 = error.getCode()) != null && code2.intValue() == 1033) {
                    z = true;
                }
                if (z) {
                    this.f25917Oooo0oO.isFollow().postValue(Boolean.FALSE);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Response<TopicInfoModel>, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<TopicInfoModel> response) {
            Response<TopicInfoModel> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            TopicDetailVM.this.getTopicDetailLiveData().postValue(it);
            MutableLiveData<Long> topicOwnerId = TopicDetailVM.this.getTopicOwnerId();
            TopicInfoModel data = it.getData();
            topicOwnerId.postValue(data != null ? Long.valueOf(data.getUserId()) : null);
            MutableLiveData<Long> topDyId = TopicDetailVM.this.getTopDyId();
            TopicInfoModel data2 = it.getData();
            topDyId.postValue(data2 != null ? Long.valueOf(data2.getTopDyId()) : null);
            if (it.getIsSuccess()) {
                MutableLiveData<Boolean> mutableLiveDataIsFollow = TopicDetailVM.this.isFollow();
                TopicInfoModel data3 = it.getData();
                mutableLiveDataIsFollow.postValue(Boolean.valueOf(data3 != null && data3.getIsJoin() == 1));
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final Oooo0<ArrayList<UserInfo>> circleAdmin(@NotNull String circleId) {
        Intrinsics.checkNotNullParameter(circleId, "circleId");
        Oooo0<ArrayList<UserInfo>> oooo0 = new Oooo0<>();
        OooO00o listener = new OooO00o(oooo0);
        Intrinsics.checkNotNullParameter(circleId, "circleId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        o00000OO.f32214OooO0oo.circleAdmin(circleId, new o00O0O0(listener));
        return oooo0;
    }

    @NotNull
    public final Oooo0<Integer> followTopic(boolean follow) {
        Oooo0<Integer> oooo0 = new Oooo0<>();
        TopicInfoModel value = this.topicDetailLocal.getValue();
        if (value != null) {
            long id = value.getId();
            OooO0O0 listener = new OooO0O0(oooo0, this, follow);
            Intrinsics.checkNotNullParameter(listener, "listener");
            o00000OO.f32214OooO0oo.circleJoinIns(String.valueOf(id), follow, new o00O0OO0(listener));
        }
        return oooo0;
    }

    public final long getCurrentTopicUserId() {
        TopicInfoModel topicInfoModel;
        TopicInfoModel value = this.topicDetailLocal.getValue();
        long userId = 0;
        long userId2 = value != null ? value.getUserId() : 0L;
        if (userId2 != 0) {
            return userId2;
        }
        Response response = (Response) this.topicDetailLiveData.getValue();
        if (response != null && (topicInfoModel = (TopicInfoModel) response.getData()) != null) {
            userId = topicInfoModel.getUserId();
        }
        return userId;
    }

    @NotNull
    public final MutableLiveData<Long> getDeletePostId() {
        return this.deletePostId;
    }

    public final boolean getLoadCircleAdminIsSuccess() {
        return this.loadCircleAdminIsSuccess;
    }

    @NotNull
    public final MutableLiveData<Long> getTopDyId() {
        return this.topDyId;
    }

    @NotNull
    public final MutableLiveData<Long> getTopDyIdRefresh() {
        return this.topDyIdRefresh;
    }

    @NotNull
    public final Oooo0<TopicInfoModel> getTopicDetailLiveData() {
        return this.topicDetailLiveData;
    }

    @NotNull
    public final MutableLiveData<TopicInfoModel> getTopicDetailLocal() {
        return this.topicDetailLocal;
    }

    @NotNull
    public final MutableLiveData<ArrayList<String>> getTopicManagerIds() {
        return this.topicManagerIds;
    }

    @NotNull
    public final MutableLiveData<Long> getTopicOwnerId() {
        return this.topicOwnerId;
    }

    @NotNull
    public final MutableLiveData<Boolean> isFollow() {
        return this.isFollow;
    }

    public final void loadTopicDetail() {
        TopicInfoModel value = this.topicDetailLocal.getValue();
        if (value != null) {
            long id = value.getId();
            OooO0OO listener = new OooO0OO();
            Intrinsics.checkNotNullParameter(listener, "listener");
            o00000OO.f32214OooO0oo.circleSingle(String.valueOf(id), new oo0oOO0(listener));
        }
    }

    public final void setLoadCircleAdminIsSuccess(boolean z) {
        this.loadCircleAdminIsSuccess = z;
    }
}
