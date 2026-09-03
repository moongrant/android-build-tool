package com.yalla.yalla.ui.vm.user;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.app.base.fragment.ContributionFragment;
import com.weieyu.yalla.R;
import com.yalla.yalla.data.repository.CommonRepository$rankingList$$inlined$complexCall$1;
import com.yalla.yalla.model.TopRankData;
import com.yalla.yalla.model.TopRankResponse;
import com.yalla.yalla.ui.vm.main.TopVM;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import o00OO.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p495o0o00OOO.Oooo000;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0002J&\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002J4\u0010\u0012\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002R$\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/yalla/yalla/ui/vm/user/TopDataVM;", "Lo00OO/OooO00o;", "", "rankType", "Lcom/yalla/yalla/model/TopRankResponse;", "", "Lcom/yalla/yalla/model/TopRankData;", "results", "", "doSuccessResult", ContributionFragment.ARG_1, "data", "", "getMyRank", "getTextResource", "getHeadBgResource", TopDataVM.DATA_TYPE_KEY, "Lo0o00OOO/Oooo000;", "rankingList", "loadedTopRankData", "Lcom/yalla/yalla/model/TopRankData;", "getLoadedTopRankData", "()Lcom/yalla/yalla/model/TopRankData;", "setLoadedTopRankData", "(Lcom/yalla/yalla/model/TopRankData;)V", "<init>", "()V", "Companion", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopDataVM extends OooO00o {
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

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.TopDataVM$rankingList$1$1", f = "TopDataVM.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ TopDataVM f26207Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26208Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f26209Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f26210Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Oooo000<List<TopRankData>, TopRankResponse<List<TopRankData>>> f26211OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, String str2, TopDataVM topDataVM, Oooo000<List<TopRankData>, TopRankResponse<List<TopRankData>>> oooo000, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f26209Oooo0oO = str;
            this.f26210Oooo0oo = str2;
            this.f26207Oooo = topDataVM;
            this.f26211OoooO00 = oooo000;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f26209Oooo0oO, this.f26210Oooo0oo, this.f26207Oooo, this.f26211OoooO00, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26208Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                p520o0o0O0O0.Oooo000 oooo000 = p520o0o0O0O0.Oooo000.f42297OooO00o;
                String str = this.f26209Oooo0oO;
                String str2 = this.f26210Oooo0oo;
                this.f26208Oooo0o = 1;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new CommonRepository$rankingList$$inlined$complexCall$1(oooo000, null, str, str2), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            TopDataVM topDataVM = this.f26207Oooo;
            String str3 = this.f26209Oooo0oO;
            Oooo000<List<TopRankData>, TopRankResponse<List<TopRankData>>> oooo001 = this.f26211OoooO00;
            TopRankResponse topRankResponse = (TopRankResponse) obj;
            topDataVM.doSuccessResult(str3, topRankResponse);
            oooo001.postValue((List<TopRankData>) topRankResponse);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doSuccessResult(String rankType, TopRankResponse<List<TopRankData>> results) {
        TopRankData topRankData = new TopRankData();
        Objects.requireNonNull(TopVM.INSTANCE);
        if (Intrinsics.areEqual(rankType, TopVM.TYPE_ROOM_GIFT)) {
            topRankData.setImageUrl(results.getImageUrl());
            topRankData.setName(results.getBarName());
            topRankData.setId(results.getRoomId());
            topRankData.setRoomServerIp(results.getRoomServerIp());
        } else {
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            String value = oooOOO.OooO0oo().getValue();
            if (value == null) {
                value = "";
            }
            topRankData.setImageUrl(value);
            topRankData.setHeadFrameUrl(results.getPerHeadFrameUrl());
            String value2 = oooOOO.OooOoO().getValue();
            topRankData.setName(value2 != null ? value2 : "");
        }
        topRankData.setNumber(results.getPerNumber());
        topRankData.setType(rankType);
        String roomId = results.getRoomId();
        List<TopRankData> data = results.getData();
        if (data == null) {
            return;
        }
        topRankData.setNum(getMyRank(rankType, roomId, data));
        this.loadedTopRankData = topRankData;
    }

    private final int getMyRank(String rankType, String roomId, List<TopRankData> data) {
        int size = data.size();
        int i = 0;
        while (i < size) {
            TopRankData topRankData = data.get(i);
            Objects.requireNonNull(TopVM.INSTANCE);
            i++;
            if (Intrinsics.areEqual(topRankData.getId(), Intrinsics.areEqual(rankType, TopVM.TYPE_ROOM_GIFT) ? roomId : kotlin.collections.unsigned.OooO00o.OooO0O0(OooOOO.f41216OooO00o))) {
                return i;
            }
        }
        return 0;
    }

    public final int getHeadBgResource(@NotNull String rankType) {
        Intrinsics.checkNotNullParameter(rankType, "rankType");
        TopVM.Companion companion = TopVM.INSTANCE;
        Objects.requireNonNull(companion);
        if (Intrinsics.areEqual(rankType, TopVM.TYPE_ROOM_GIFT)) {
            return R.mipmap.main_top_room_gift;
        }
        Objects.requireNonNull(companion);
        if (Intrinsics.areEqual(rankType, TopVM.TYPE_GIFT_SENT)) {
            return R.mipmap.main_top_sent_gift;
        }
        Objects.requireNonNull(companion);
        if (Intrinsics.areEqual(rankType, TopVM.TYPE_GIFT_RECEIVE)) {
            return R.mipmap.main_top_receive_gift;
        }
        Objects.requireNonNull(companion);
        return Intrinsics.areEqual(rankType, TopVM.TYPE_YALLA_BILLION) ? R.mipmap.main_top_yalla_billion : R.mipmap.main_top_room_gift;
    }

    @Nullable
    public final TopRankData getLoadedTopRankData() {
        return this.loadedTopRankData;
    }

    public final int getTextResource(@NotNull String rankType) {
        Intrinsics.checkNotNullParameter(rankType, "rankType");
        TopVM.Companion companion = TopVM.INSTANCE;
        Objects.requireNonNull(companion);
        if (Intrinsics.areEqual(rankType, TopVM.TYPE_ROOM_GIFT)) {
            return R.drawable.main_top_head_bg_blue;
        }
        Objects.requireNonNull(companion);
        if (Intrinsics.areEqual(rankType, TopVM.TYPE_GIFT_SENT)) {
            return R.drawable.main_all_head_bg_yellow;
        }
        Objects.requireNonNull(companion);
        if (Intrinsics.areEqual(rankType, TopVM.TYPE_GIFT_RECEIVE)) {
            return R.drawable.main_top_head_bg_purple;
        }
        Objects.requireNonNull(companion);
        return Intrinsics.areEqual(rankType, TopVM.TYPE_YALLA_BILLION) ? R.drawable.main_top_head_bg_red : R.drawable.main_top_head_bg_blue;
    }

    @NotNull
    public final Oooo000<List<TopRankData>, TopRankResponse<List<TopRankData>>> rankingList(@NotNull String rankType, @NotNull String dataType) {
        Intrinsics.checkNotNullParameter(rankType, "rankType");
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Oooo000<List<TopRankData>, TopRankResponse<List<TopRankData>>> oooo000 = new Oooo000<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(rankType, dataType, this, oooo000, null), 3, null);
        return oooo000;
    }

    public final void setLoadedTopRankData(@Nullable TopRankData topRankData) {
        this.loadedTopRankData = topRankData;
    }
}
