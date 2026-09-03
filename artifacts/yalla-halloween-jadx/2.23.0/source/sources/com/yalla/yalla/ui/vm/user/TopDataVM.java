package com.yalla.yalla.ui.vm.user;

import androidx.compose.runtime.Oooo0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.code.android.util.OooOOO;
import com.code.android.util.o00oO0o;
import com.yalla.yalla.data.repository.CommonRepository$rankingList$$inlined$call$1;
import com.yalla.yalla.model.TopRankData;
import com.yalla.yalla.model.TopRankResponse;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import com.yalla.yalla.ui.vm.main.TopVM;
import java.util.List;
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
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p394o0Oo00oO.o0O0O00;
import p406o0Oo0Ooo.oOO0O0O0;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002R$\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/yalla/yalla/ui/vm/user/TopDataVM;", "Lo0Oo00oO/o0O0O00;", "", "rankType", ContributionFragment.ARG_1, "", "Lcom/yalla/yalla/model/TopRankData;", "data", "", "getMyRank", "getTextResource", "getHeadBgResource", TopDataVM.DATA_TYPE_KEY, "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/TopRankResponse;", "rankingList", "loadedTopRankData", "Lcom/yalla/yalla/model/TopRankData;", "getLoadedTopRankData", "()Lcom/yalla/yalla/model/TopRankData;", "setLoadedTopRankData", "(Lcom/yalla/yalla/model/TopRankData;)V", "<init>", "()V", "Companion", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class TopDataVM extends o0O0O00 {
    public static final int $stable = 8;

    @NotNull
    public static final String DATA_TYPE_KEY = "dataType";

    @NotNull
    public static final String TYPE_DAY = "day";

    @NotNull
    public static final String TYPE_HOUR = "hour";

    @NotNull
    public static final String TYPE_MONTH = "month";

    @NotNull
    public static final String TYPE_WEEKLY = "week";

    @Nullable
    private TopRankData loadedTopRankData;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.TopDataVM$rankingList$1", f = "TopDataVM.kt", i = {0}, l = {40, 63}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<TopRankResponse>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32720OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f32721OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32722OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f32723OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ TopDataVM f32724OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, String str2, TopDataVM topDataVM, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f32721OooO0o = str;
            this.f32723OooO0oO = str2;
            this.f32724OooO0oo = topDataVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f32721OooO0o, this.f32723OooO0oO, this.f32724OooO0oo, continuation);
            oooO0O0.f32722OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<TopRankResponse>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32720OooO0Oo;
            String str = this.f32721OooO0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32722OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32722OooO0o0;
            oOO0O0O0 ooo0o0o0 = oOO0O0O0.f44954OooO00o;
            this.f32722OooO0o0 = liveDataScope;
            this.f32720OooO0Oo = 1;
            ooo0o0o0.getClass();
            String url = o000OOo0.OooO0OO("/Webservers/rankinglist/RankingList");
            Intrinsics.checkNotNullParameter(url, "url");
            o0O0ooO o0o0ooo = new o0O0ooO(url, 0);
            o0o0ooo.OooO00o();
            o0o0ooo.OooO0O0(str, "str");
            o0o0ooo.OooO0O0(this.f32723OooO0oO, "type");
            obj = OooOOO.OooO0Oo(new CommonRepository$rankingList$$inlined$call$1(o0o0ooo, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                TopRankData topRankData = new TopRankData();
                TopRankResponse topRankResponse = (TopRankResponse) apiResult.getData();
                if (topRankResponse != null) {
                    TopVM.INSTANCE.getClass();
                    if (Intrinsics.areEqual(str, TopVM.TYPE_ROOM_GIFT)) {
                        topRankData.setImageUrl(topRankResponse.getImageUrl());
                        topRankData.setName(topRankResponse.getBarName());
                        topRankData.setId(topRankResponse.getRoomId());
                        topRankData.setRoomServerIp(topRankResponse.getRoomServerIp());
                    } else {
                        o000000O o000000o2 = o000000O.f46674OooO00o;
                        String str2 = (String) o000000O.OooO().getValue();
                        String str3 = "";
                        if (str2 == null) {
                            str2 = "";
                        } else {
                            Intrinsics.checkNotNullExpressionValue(str2, "Account.headerUrl.value ?: \"\"");
                        }
                        topRankData.setImageUrl(str2);
                        topRankData.setHeadFrameUrl(topRankResponse.getPerHeadFrameUrl());
                        String str4 = (String) o000000O.OooOOoo().getValue();
                        if (str4 != null) {
                            Intrinsics.checkNotNullExpressionValue(str4, "Account.userName.value ?: \"\"");
                            str3 = str4;
                        }
                        topRankData.setName(str3);
                    }
                    topRankData.setNumber(topRankResponse.getPerNumber());
                    topRankData.setType(str);
                }
                TopRankResponse topRankResponse2 = (TopRankResponse) apiResult.getData();
                if (topRankResponse2 != null) {
                    String roomId = topRankResponse2.getRoomId();
                    List<TopRankData> data = topRankResponse2.getData();
                    TopDataVM topDataVM = this.f32724OooO0oo;
                    topRankData.setNum(topDataVM.getMyRank(str, roomId, data));
                    topDataVM.setLoadedTopRankData(topRankData);
                }
            }
            this.f32722OooO0o0 = null;
            this.f32720OooO0Oo = 2;
            if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMyRank(String rankType, String roomId, List<TopRankData> data) {
        String strOooO00o;
        int size = data.size();
        int i = 0;
        while (i < size) {
            TopRankData topRankData = data.get(i);
            TopVM.INSTANCE.getClass();
            boolean zAreEqual = Intrinsics.areEqual(rankType, TopVM.TYPE_ROOM_GIFT);
            String id = topRankData.getId();
            if (zAreEqual) {
                strOooO00o = roomId;
            } else {
                o000000O o000000o2 = o000000O.f46674OooO00o;
                strOooO00o = Oooo0.OooO00o();
            }
            i++;
            if (Intrinsics.areEqual(id, strOooO00o)) {
                return i;
            }
        }
        return 0;
    }

    public final int getHeadBgResource(@NotNull String rankType) {
        Intrinsics.checkNotNullParameter(rankType, "rankType");
        int i = oO00OOO.main_top_room_gift;
        TopVM.Companion companion = TopVM.INSTANCE;
        companion.getClass();
        if (Intrinsics.areEqual(rankType, TopVM.TYPE_ROOM_GIFT)) {
            return i;
        }
        companion.getClass();
        if (Intrinsics.areEqual(rankType, TopVM.TYPE_GIFT_SENT)) {
            return oO00OOO.main_top_sent_gift;
        }
        companion.getClass();
        if (Intrinsics.areEqual(rankType, TopVM.TYPE_GIFT_RECEIVE)) {
            return oO00OOO.main_top_receive_gift;
        }
        companion.getClass();
        return Intrinsics.areEqual(rankType, TopVM.TYPE_YALLA_BILLION) ? oO00OOO.main_top_yalla_billion : i;
    }

    @Nullable
    public final TopRankData getLoadedTopRankData() {
        return this.loadedTopRankData;
    }

    public final int getTextResource(@NotNull String rankType) {
        Intrinsics.checkNotNullParameter(rankType, "rankType");
        int i = oOo00OO0.main_top_head_bg_blue;
        TopVM.Companion companion = TopVM.INSTANCE;
        companion.getClass();
        if (Intrinsics.areEqual(rankType, TopVM.TYPE_ROOM_GIFT)) {
            return i;
        }
        companion.getClass();
        if (Intrinsics.areEqual(rankType, TopVM.TYPE_GIFT_SENT)) {
            return oOo00OO0.main_all_head_bg_yellow;
        }
        companion.getClass();
        if (Intrinsics.areEqual(rankType, TopVM.TYPE_GIFT_RECEIVE)) {
            return oOo00OO0.main_top_head_bg_purple;
        }
        companion.getClass();
        return Intrinsics.areEqual(rankType, TopVM.TYPE_YALLA_BILLION) ? oOo00OO0.main_top_head_bg_red : i;
    }

    @NotNull
    public final LiveData<ApiResult<TopRankResponse>> rankingList(@NotNull String rankType, @NotNull String dataType) {
        Intrinsics.checkNotNullParameter(rankType, "rankType");
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        return o00oO0o.OooO00o(new OooO0O0(rankType, dataType, this, null));
    }

    public final void setLoadedTopRankData(@Nullable TopRankData topRankData) {
        this.loadedTopRankData = topRankData;
    }
}
