package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.http.Error;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.topic.TopicInfoModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import p412o0Oo0o0O.o0;
import p412o0Oo0o0O.o0O0000O;
import p412o0Oo0o0O.o0OoOoOo;
import p424o0OoO0Oo.o00OO000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b(\u0010)J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\b2\u0006\u0010\f\u001a\u00020\u000bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00158\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001f\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R-\u0010\u001e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\rj\b\u0012\u0004\u0012\u00020\u000b`\u001d0\u00158\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u0019R\u001f\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00158\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\"\u0010\"\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/TopicDetailVM;", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "", "getCurrentTopicUserId", "", "loadTopicDetail", "", "follow", "Lo0OoO0Oo/o00OO000;", "", "followTopic", "", "circleId", "Ljava/util/ArrayList;", "Lcom/yalla/yalla/data/db/table/UserInfo;", "circleAdmin", "Lcom/yalla/yalla/model/topic/TopicInfoModel;", "topicDetailLiveData", "Lo0OoO0Oo/o00OO000;", "getTopicDetailLiveData", "()Lo0OoO0Oo/o00OO000;", "Landroidx/lifecycle/MutableLiveData;", "topicDetailLocal", "Landroidx/lifecycle/MutableLiveData;", "getTopicDetailLocal", "()Landroidx/lifecycle/MutableLiveData;", "isFollow", "topicOwnerId", "getTopicOwnerId", "Lkotlin/collections/ArrayList;", "topicManagerIds", "getTopicManagerIds", "topDyId", "getTopDyId", "loadCircleAdminIsSuccess", "Z", "getLoadCircleAdminIsSuccess", "()Z", "setLoadCircleAdminIsSuccess", "(Z)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class TopicDetailVM extends BaseMomentDetailVM {
    public static final int $stable = 8;
    private boolean loadCircleAdminIsSuccess;

    @NotNull
    private final o00OO000<TopicInfoModel> topicDetailLiveData = new o00OO000<>();

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

    @SourceDebugExtension({"SMAP\nTopicDetailVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicDetailVM.kt\ncom/yalla/yalla/ui/vm/moment/TopicDetailVM$circleAdmin$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n1855#2,2:75\n*S KotlinDebug\n*F\n+ 1 TopicDetailVM.kt\ncom/yalla/yalla/ui/vm/moment/TopicDetailVM$circleAdmin$1$1\n*L\n63#1:75,2\n*E\n"})
    public static final class OooO00o extends Lambda implements Function1<Response<ArrayList<UserInfo>>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00OO000<ArrayList<UserInfo>> f31843OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00OO000<ArrayList<UserInfo>> o00oo001) {
            super(1);
            this.f31843OooO0o0 = o00oo001;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<ArrayList<UserInfo>> response) {
            Response<ArrayList<UserInfo>> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.getIsSuccess()) {
                TopicDetailVM topicDetailVM = TopicDetailVM.this;
                topicDetailVM.setLoadCircleAdminIsSuccess(true);
                ArrayList<String> arrayList = new ArrayList<>();
                ArrayList<UserInfo> data = it.getData();
                if (data != null) {
                    Iterator<T> it2 = data.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(String.valueOf(((UserInfo) it2.next()).getUserId()));
                    }
                }
                if (true ^ arrayList.isEmpty()) {
                    topicDetailVM.getTopicManagerIds().postValue(arrayList);
                }
            }
            this.f31843OooO0o0.postValue(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Response<Integer>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o00OO000<Integer> f31844OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f31845OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ TopicDetailVM f31846OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o00OO000<Integer> o00oo001, TopicDetailVM topicDetailVM, boolean z) {
            super(1);
            this.f31844OooO0Oo = o00oo001;
            this.f31846OooO0o0 = topicDetailVM;
            this.f31845OooO0o = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<Integer> response) {
            Integer code;
            Response<Integer> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f31844OooO0Oo.postValue(it);
            boolean isSuccess = it.getIsSuccess();
            TopicDetailVM topicDetailVM = this.f31846OooO0o0;
            if (isSuccess) {
                topicDetailVM.isFollow().postValue(Boolean.valueOf(this.f31845OooO0o));
            } else {
                Error error = it.getError();
                if ((error == null || (code = error.getCode()) == null || code.intValue() != 1033) ? false : true) {
                    topicDetailVM.isFollow().postValue(Boolean.FALSE);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Response<TopicInfoModel>, Unit> {
        public OooO0OO() {
            super(1);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x005b  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Response<TopicInfoModel> response) {
            boolean z;
            Response<TopicInfoModel> it = response;
            Intrinsics.checkNotNullParameter(it, "it");
            TopicDetailVM topicDetailVM = TopicDetailVM.this;
            topicDetailVM.getTopicDetailLiveData().postValue(it);
            MutableLiveData<Long> topicOwnerId = topicDetailVM.getTopicOwnerId();
            TopicInfoModel data = it.getData();
            topicOwnerId.postValue(data != null ? Long.valueOf(data.getUserId()) : null);
            MutableLiveData<Long> topDyId = topicDetailVM.getTopDyId();
            TopicInfoModel data2 = it.getData();
            topDyId.postValue(data2 != null ? Long.valueOf(data2.getTopDyId()) : null);
            if (it.getIsSuccess()) {
                MutableLiveData<Boolean> mutableLiveDataIsFollow = topicDetailVM.isFollow();
                TopicInfoModel data3 = it.getData();
                if (data3 != null) {
                    z = data3.getIsJoin() == 1;
                }
                mutableLiveDataIsFollow.postValue(Boolean.valueOf(z));
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final o00OO000<ArrayList<UserInfo>> circleAdmin(@NotNull String circleId) {
        Intrinsics.checkNotNullParameter(circleId, "circleId");
        o00OO000<ArrayList<UserInfo>> o00oo001 = new o00OO000<>();
        OooO00o listener = new OooO00o(o00oo001);
        Intrinsics.checkNotNullParameter(circleId, "circleId");
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0(circleId, listener, null), 3, null);
        return o00oo001;
    }

    @NotNull
    public final o00OO000<Integer> followTopic(boolean follow) {
        o00OO000<Integer> o00oo001 = new o00OO000<>();
        TopicInfoModel value = this.topicDetailLocal.getValue();
        if (value != null) {
            long id = value.getId();
            OooO0O0 listener = new OooO0O0(o00oo001, this, follow);
            Intrinsics.checkNotNullParameter(listener, "listener");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0O0000O(id, follow, listener, null), 3, null);
        }
        return o00oo001;
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

    public final boolean getLoadCircleAdminIsSuccess() {
        return this.loadCircleAdminIsSuccess;
    }

    @NotNull
    public final MutableLiveData<Long> getTopDyId() {
        return this.topDyId;
    }

    @NotNull
    public final o00OO000<TopicInfoModel> getTopicDetailLiveData() {
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
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0OoOoOo(id, listener, null), 3, null);
        }
    }

    public final void setLoadCircleAdminIsSuccess(boolean z) {
        this.loadCircleAdminIsSuccess = z;
    }
}
