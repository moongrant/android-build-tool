package com.yalla.yalla.ui.vm.message;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.Oooo0;
import androidx.paging.o0O0O00;
import androidx.paging.o0OOO0o;
import com.code.android.util.o00oO0o;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.data.db.table.ChatMessage;
import com.yalla.yalla.data.db.table.FriendInfo;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.share.RoomThemeGiveInfo;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p101o000oo.o00O000;
import p101o000oo.o00O0OOO;
import p101o000oo.o00oOoo;
import p101o000oo.o0O0ooO;
import p396o0Oo0.OooOO0;
import p409o0Oo0Oo.o000;
import p409o0Oo0Oo.o000000;
import p410o0Oo0Oo0.o00O0O;
import p414o0Oo0o0O.o00O0;
import p414o0Oo0o0O.o00O0O0;
import p414o0Oo0o0O.o00O0O00;
import p414o0Oo0o0O.o00O0O0O;
import p414o0Oo0o0O.o00O0OO0;
import p414o0Oo0o0O.o0o0Oo;
import p414o0Oo0o0O.oo0o0O0;
import p474o0OoooOO.oo0oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b=\u0010>J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002JB\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002JB\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0002JJ\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0002JB\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002JJ\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0016Jb\u00101\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0002J\"\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000205040\u00102\u0006\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\tR#\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R#\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:¨\u0006?"}, d2 = {"Lcom/yalla/yalla/ui/vm/message/ShareToFriendVM;", "Lo0Oo0/OooOO0;", "", "content", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/o0OOO0o;", "Lcom/yalla/yalla/data/db/table/FriendInfo;", "getSearchFriends", "", "", "targetIds", ContributionFragment.ARG_1, "roomIdx", "roomName", "roomHeader", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Landroidx/lifecycle/LiveData;", "", "shareRoom", "momentId", "momentImage", "momentText", "", "momentType", "shareMoment", "topicId", "topicImage", "topicName", "topicUserCount", "topicMomentCount", "shareTopic", "userId", "userIdx", "userName", "userHead", "shareUser", "activityImage", "activityText1", "activityText2", "activityUrl", "activity", "shareActivity", "eventId", "eventName", "eventImgUrl", "eventTagId", "eventStartTime", "eventEndTime", "roomIp", "sendEventRoomMsg", "targetId", "shopId", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/share/RoomThemeGiveInfo;", "getRoomThemeGivenInfo", "recentFriends", "Lkotlinx/coroutines/flow/Flow;", "getRecentFriends", "()Lkotlinx/coroutines/flow/Flow;", "allFriends", "getAllFriends", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class ShareToFriendVM extends OooOO0 {
    public static final int $stable = 8;

    @NotNull
    private final Flow<o0OOO0o<FriendInfo>> allFriends;

    @NotNull
    private final Flow<o0OOO0o<FriendInfo>> recentFriends;

    public static final class OooO00o extends Lambda implements Function0<o0O0O00<Integer, FriendInfo>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f31473OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0O00<Integer, FriendInfo> invoke() {
            o000 o000VarOooOOoo = o00O0O.OooO00o().OooOOoo();
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            return o000VarOooOOoo.OooOOO0(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.ShareToFriendVM$getRoomThemeGivenInfo$1", f = "ShareToFriendVM.kt", i = {}, l = {120, 120}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RoomThemeGiveInfo>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31474OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31475OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31476OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f31477OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(long j, long j2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f31475OooO0o = j;
            this.f31477OooO0oO = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f31475OooO0o, this.f31477OooO0oO, continuation);
            oooO0O0.f31476OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RoomThemeGiveInfo>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31474OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31476OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31476OooO0o0;
            o0o0Oo o0o0oo = o0o0Oo.f46322OooO00o;
            long j = this.f31475OooO0o;
            long j2 = this.f31477OooO0oO;
            this.f31476OooO0o0 = liveDataScope;
            this.f31474OooO0Oo = 1;
            obj = o0o0oo.OooO00o(j, j2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31476OooO0o0 = null;
            this.f31474OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o0O0O00<Integer, FriendInfo>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f31478OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str) {
            super(0);
            this.f31478OooO0Oo = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0O00<Integer, FriendInfo> invoke() {
            String searchText = this.f31478OooO0Oo;
            Intrinsics.checkNotNullParameter(searchText, "searchText");
            o000 o000VarOooOOoo = o00O0O.OooO00o().OooOOoo();
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            return o000VarOooOOoo.OooOO0(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), searchText);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<o0O0O00<Integer, FriendInfo>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f31479OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0O00<Integer, FriendInfo> invoke() {
            o000000 o000000VarOooOOo = o00O0O.OooO00o().OooOOo();
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            return o000000VarOooOOo.OooOOO0(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
        }
    }

    public ShareToFriendVM() {
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        OooO0o pagingSourceFactory = OooO0o.f31479OooO0Oo;
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        o00O000 config = new o00O000(20, 5, false, 20);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        this.recentFriends = p101o000oo.o0OOO0o.OooO00o(new Oooo0(pagingSourceFactory instanceof o00O0OOO ? new o0O0ooO(pagingSourceFactory) : new o00oOoo(pagingSourceFactory, null), null, config).f10284OooO0o, viewModelScope);
        CoroutineScope viewModelScope2 = ViewModelKt.getViewModelScope(this);
        Intrinsics.checkNotNullParameter(viewModelScope2, "viewModelScope");
        OooO00o pagingSourceFactory2 = OooO00o.f31473OooO0Oo;
        Intrinsics.checkNotNullParameter(pagingSourceFactory2, "pagingSourceFactory");
        o00O000 config2 = new o00O000(20, 5, false, 20);
        Intrinsics.checkNotNullParameter(config2, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory2, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config2, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory2, "pagingSourceFactory");
        this.allFriends = p101o000oo.o0OOO0o.OooO00o(new Oooo0(pagingSourceFactory2 instanceof o00O0OOO ? new o0O0ooO(pagingSourceFactory2) : new o00oOoo(pagingSourceFactory2, null), null, config2).f10284OooO0o, viewModelScope2);
    }

    @NotNull
    public final Flow<o0OOO0o<FriendInfo>> getAllFriends() {
        return this.allFriends;
    }

    @NotNull
    public final Flow<o0OOO0o<FriendInfo>> getRecentFriends() {
        return this.recentFriends;
    }

    @NotNull
    public final LiveData<ApiResult<RoomThemeGiveInfo>> getRoomThemeGivenInfo(long targetId, long shopId) {
        return o00oO0o.OooO00o(new OooO0O0(targetId, shopId, null));
    }

    @NotNull
    public final Flow<o0OOO0o<FriendInfo>> getSearchFriends(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        OooO0OO pagingSourceFactory = new OooO0OO(content);
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        o00O000 config = new o00O000(20, 5, false, 20);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        return p101o000oo.o0OOO0o.OooO00o(new Oooo0(pagingSourceFactory instanceof o00O0OOO ? new o0O0ooO(pagingSourceFactory) : new o00oOoo(pagingSourceFactory, null), null, config).f10284OooO0o, viewModelScope);
    }

    @NotNull
    public final LiveData<Boolean> sendEventRoomMsg(@NotNull List<Long> targetIds, long eventId, @NotNull String eventName, @NotNull String eventImgUrl, int eventTagId, long eventStartTime, long eventEndTime, long roomId, @NotNull String roomName, @NotNull String roomIp) {
        String str = "targetIds";
        Intrinsics.checkNotNullParameter(targetIds, "targetIds");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventImgUrl, "eventImgUrl");
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        Intrinsics.checkNotNullParameter(roomIp, "roomIp");
        Intrinsics.checkNotNullParameter(targetIds, "targetIds");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventImgUrl, "eventImgUrl");
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        Intrinsics.checkNotNullParameter(roomIp, "roomIp");
        ChatMessage msg = new ChatMessage();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = targetIds.iterator();
        while (it.hasNext()) {
            ArrayList arrayList2 = arrayList;
            msg = p414o0Oo0o0O.o000.OooOOO(((Number) it.next()).longValue(), eventId, eventName, eventImgUrl, eventTagId, eventStartTime, eventEndTime, roomId, roomName, roomIp, "", 0L, false);
            p414o0Oo0o0O.o000.OooO0oO(msg);
            arrayList2.add(msg.getMid());
            arrayList = arrayList2;
            str = str;
        }
        ArrayList midList = arrayList;
        Intrinsics.checkNotNullParameter(midList, "midList");
        Intrinsics.checkNotNullParameter(targetIds, str);
        Intrinsics.checkNotNullParameter(msg, "msg");
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00O0O00(msg, mutableLiveData, targetIds, midList, null), 2, null);
        return mutableLiveData;
    }

    @NotNull
    public final LiveData<Boolean> shareActivity(@NotNull List<Long> targetIds, @NotNull String activityImage, @NotNull String activityText1, @NotNull String activityText2, @NotNull String activityUrl, @NotNull String message, int activity) {
        Intrinsics.checkNotNullParameter(targetIds, "targetIds");
        Intrinsics.checkNotNullParameter(activityImage, "activityImage");
        Intrinsics.checkNotNullParameter(activityText1, "activityText1");
        Intrinsics.checkNotNullParameter(activityText2, "activityText2");
        Intrinsics.checkNotNullParameter(activityUrl, "activityUrl");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(targetIds, "targetIds");
        Intrinsics.checkNotNullParameter(activityImage, "activityImage");
        Intrinsics.checkNotNullParameter(activityText1, "activityText1");
        Intrinsics.checkNotNullParameter(activityText2, "activityText2");
        Intrinsics.checkNotNullParameter(activityUrl, "activityUrl");
        Intrinsics.checkNotNullParameter(message, "message");
        ChatMessage msg = new ChatMessage();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = targetIds.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            ArrayList arrayList2 = arrayList;
            ChatMessage chatMessageOooOO0o = p414o0Oo0o0O.o000.OooOO0o(jLongValue, activityImage, activityText1, activityText2, activityUrl, (416 & 32) != 0 ? "" : message, (416 & 64) != 0 ? "" : null, 0L, false);
            p414o0Oo0o0O.o000.OooO0oO(chatMessageOooOO0o);
            ChatMessage.ShareActivityInfo shareActivityInfo = chatMessageOooOO0o.getShareActivityInfo();
            if (shareActivityInfo != null) {
                shareActivityInfo.setActivity(activity);
            }
            if (message.length() > 0) {
                ChatMessage chatMessageOooOo = p414o0Oo0o0O.o000.OooOo(jLongValue, message, null, 0L, false, 60);
                p414o0Oo0o0O.o000.OooO0oO(chatMessageOooOo);
                arrayList2.add(new Pair(chatMessageOooOO0o.getMid(), chatMessageOooOo.getMid()));
            } else {
                arrayList2.add(new Pair(chatMessageOooOO0o.getMid(), ""));
            }
            msg = chatMessageOooOO0o;
            arrayList = arrayList2;
        }
        ArrayList midList = arrayList;
        Intrinsics.checkNotNullParameter(midList, "midList");
        Intrinsics.checkNotNullParameter(targetIds, "targetIds");
        Intrinsics.checkNotNullParameter(msg, "msg");
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00O0(msg, mutableLiveData, targetIds, midList, null), 2, null);
        return mutableLiveData;
    }

    @NotNull
    public final LiveData<Boolean> shareMoment(@NotNull List<Long> targetIds, long momentId, @NotNull String momentImage, @NotNull String momentText, int momentType, @NotNull String message) {
        Intrinsics.checkNotNullParameter(targetIds, "targetIds");
        Intrinsics.checkNotNullParameter(momentImage, "momentImage");
        Intrinsics.checkNotNullParameter(momentText, "momentText");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(targetIds, "targetIds");
        Intrinsics.checkNotNullParameter(momentImage, "momentImage");
        Intrinsics.checkNotNullParameter(momentText, "momentText");
        Intrinsics.checkNotNullParameter(message, "message");
        ChatMessage msg = new ChatMessage();
        ArrayList midList = new ArrayList();
        Iterator<T> it = targetIds.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            ChatMessage chatMessageOooOOOO = p414o0Oo0o0O.o000.OooOOOO(jLongValue, momentId, momentImage, momentText, momentType, (416 & 32) != 0 ? "" : message, (416 & 64) != 0 ? "" : null, 0L, false);
            p414o0Oo0o0O.o000.OooO0oO(chatMessageOooOOOO);
            if (message.length() > 0) {
                ChatMessage chatMessageOooOo = p414o0Oo0o0O.o000.OooOo(jLongValue, message, null, 0L, false, 60);
                p414o0Oo0o0O.o000.OooO0oO(chatMessageOooOo);
                midList.add(new Pair(chatMessageOooOOOO.getMid(), chatMessageOooOo.getMid()));
            } else {
                midList.add(new Pair(chatMessageOooOOOO.getMid(), ""));
            }
            msg = chatMessageOooOOOO;
        }
        Intrinsics.checkNotNullParameter(midList, "midList");
        Intrinsics.checkNotNullParameter(targetIds, "targetIds");
        Intrinsics.checkNotNullParameter(msg, "msg");
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00O0O0(msg, mutableLiveData, targetIds, midList, null), 2, null);
        return mutableLiveData;
    }

    @NotNull
    public final LiveData<Boolean> shareRoom(@NotNull List<Long> targetIds, long roomId, long roomIdx, @NotNull String roomName, @NotNull String roomHeader, @NotNull String message) {
        Intrinsics.checkNotNullParameter(targetIds, "targetIds");
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        Intrinsics.checkNotNullParameter(roomHeader, "roomHeader");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(targetIds, "targetIds");
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        Intrinsics.checkNotNullParameter(roomHeader, "roomHeader");
        Intrinsics.checkNotNullParameter(message, "message");
        ChatMessage msg = new ChatMessage();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = targetIds.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            ArrayList arrayList2 = arrayList;
            ChatMessage chatMessageOooOOo0 = p414o0Oo0o0O.o000.OooOOo0(jLongValue, roomId, roomIdx, roomName, roomHeader, (864 & 32) != 0 ? "" : null, (864 & 64) != 0 ? "" : message, (864 & 128) != 0 ? "" : null, 0L, false);
            p414o0Oo0o0O.o000.OooO0oO(chatMessageOooOOo0);
            if (message.length() > 0) {
                ChatMessage chatMessageOooOo = p414o0Oo0o0O.o000.OooOo(jLongValue, message, null, 0L, false, 60);
                p414o0Oo0o0O.o000.OooO0oO(chatMessageOooOo);
                arrayList2.add(new Pair(chatMessageOooOOo0.getMid(), chatMessageOooOo.getMid()));
            } else {
                arrayList2.add(new Pair(chatMessageOooOOo0.getMid(), ""));
            }
            msg = chatMessageOooOOo0;
            arrayList = arrayList2;
        }
        ArrayList midList = arrayList;
        Intrinsics.checkNotNullParameter(midList, "midList");
        Intrinsics.checkNotNullParameter(targetIds, "targetIds");
        Intrinsics.checkNotNullParameter(msg, "msg");
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00O0O0O(msg, mutableLiveData, targetIds, midList, null), 2, null);
        return mutableLiveData;
    }

    @NotNull
    public final LiveData<Boolean> shareTopic(@NotNull List<Long> targetIds, long topicId, @NotNull String topicImage, @NotNull String topicName, int topicUserCount, int topicMomentCount, @NotNull String message) {
        Intrinsics.checkNotNullParameter(targetIds, "targetIds");
        Intrinsics.checkNotNullParameter(topicImage, "topicImage");
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(targetIds, "targetIds");
        Intrinsics.checkNotNullParameter(topicImage, "topicImage");
        Intrinsics.checkNotNullParameter(topicName, "topicName");
        Intrinsics.checkNotNullParameter(message, "message");
        ChatMessage msg = new ChatMessage();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = targetIds.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            ArrayList arrayList2 = arrayList;
            ChatMessage chatMessageOooOOoo = p414o0Oo0o0O.o000.OooOOoo(jLongValue, topicImage, topicName, topicUserCount, (832 & 64) != 0 ? "" : message, false, topicMomentCount, (832 & 128) != 0 ? "" : null, topicId, 0L);
            p414o0Oo0o0O.o000.OooO0oO(chatMessageOooOOoo);
            if (message.length() > 0) {
                ChatMessage chatMessageOooOo = p414o0Oo0o0O.o000.OooOo(jLongValue, message, null, 0L, false, 60);
                p414o0Oo0o0O.o000.OooO0oO(chatMessageOooOo);
                arrayList2.add(new Pair(chatMessageOooOOoo.getMid(), chatMessageOooOo.getMid()));
            } else {
                arrayList2.add(new Pair(chatMessageOooOOoo.getMid(), ""));
            }
            msg = chatMessageOooOOoo;
            arrayList = arrayList2;
        }
        ArrayList midList = arrayList;
        Intrinsics.checkNotNullParameter(midList, "midList");
        Intrinsics.checkNotNullParameter(targetIds, "targetIds");
        Intrinsics.checkNotNullParameter(msg, "msg");
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00O0OO0(msg, mutableLiveData, targetIds, midList, null), 2, null);
        return mutableLiveData;
    }

    @NotNull
    public final LiveData<Boolean> shareUser(@NotNull List<Long> targetIds, long userId, long userIdx, @NotNull String userName, @NotNull String userHead, @NotNull String message) {
        Intrinsics.checkNotNullParameter(targetIds, "targetIds");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(userHead, "userHead");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(targetIds, "targetIds");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(userHead, "userHead");
        Intrinsics.checkNotNullParameter(message, "message");
        ChatMessage msg = new ChatMessage();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = targetIds.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            ArrayList arrayList2 = arrayList;
            ChatMessage chatMessageOooOo0 = p414o0Oo0o0O.o000.OooOo0(jLongValue, userId, userIdx, userName, userHead, (416 & 32) != 0 ? "" : message, (416 & 64) != 0 ? "" : null, 0L, false);
            p414o0Oo0o0O.o000.OooO0oO(chatMessageOooOo0);
            if (message.length() > 0) {
                ChatMessage chatMessageOooOo = p414o0Oo0o0O.o000.OooOo(jLongValue, message, null, 0L, false, 60);
                p414o0Oo0o0O.o000.OooO0oO(chatMessageOooOo);
                arrayList2.add(new Pair(chatMessageOooOo0.getMid(), chatMessageOooOo.getMid()));
            } else {
                arrayList2.add(new Pair(chatMessageOooOo0.getMid(), ""));
            }
            msg = chatMessageOooOo0;
            arrayList = arrayList2;
        }
        ArrayList midList = arrayList;
        Intrinsics.checkNotNullParameter(midList, "midList");
        Intrinsics.checkNotNullParameter(targetIds, "targetIds");
        Intrinsics.checkNotNullParameter(msg, "msg");
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new oo0o0O0(msg, mutableLiveData, targetIds, midList, null), 2, null);
        return mutableLiveData;
    }
}
