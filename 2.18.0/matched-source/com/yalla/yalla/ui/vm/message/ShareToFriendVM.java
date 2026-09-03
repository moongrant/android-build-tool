package com.yalla.yalla.ui.vm.message;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.app.base.fragment.ContributionFragment;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.common.db.table.ChatMessage;
import com.yalla.yalla.common.db.table.FriendInfo;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.RoomThemeGiveInfo;
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
import p089o000o000.o000OO;
import p089o000o000.o000OO00;
import p089o000o000.o000OOo0;
import p089o000o000.o00O0000;
import p089o000o000.o00O00o0;
import p089o000o000.o0O0ooO;
import p089o000o000.oo0oOO0;
import p255o00ooO0O.o0000O0O;
import p500o0o00Oo0.OooOOO;
import p522o0o0O0O0.OooOo00;
import p522o0o0O0O0.o0000;
import p522o0o0O0O0.o00000OO;
import p522o0o0O0O0.o0000O0;
import p522o0o0O0O0.o0000O00;
import p522o0o0O0O0.o0000Ooo;
import p522o0o0O0O0.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b=\u0010>J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002JB\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002JB\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0002JJ\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0002JB\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002JJ\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0016Jb\u00101\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u0002J\"\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000205040\u00102\u0006\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\tR#\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R#\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:¨\u0006?"}, d2 = {"Lcom/yalla/yalla/ui/vm/message/ShareToFriendVM;", "Lo00OO/OooO00o;", "", "content", "Lkotlinx/coroutines/flow/Flow;", "Lo000o000/o0O0ooO;", "Lcom/yalla/yalla/common/db/table/FriendInfo;", "getSearchFriends", "", "", "targetIds", ContributionFragment.ARG_1, "roomIdx", "roomName", "roomHeader", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Landroidx/lifecycle/LiveData;", "", "shareRoom", "momentId", "momentImage", "momentText", "", "momentType", "shareMoment", "topicId", "topicImage", "topicName", "topicUserCount", "topicMomentCount", "shareTopic", "userId", "userIdx", "userName", "userHead", "shareUser", "activityImage", "activityText1", "activityText2", "activityUrl", "activity", "shareActivity", "eventId", "eventName", "eventImgUrl", "eventTagId", "eventStartTime", "eventEndTime", "roomIp", "sendEventRoomMsg", "targetId", "shopId", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/model/RoomThemeGiveInfo;", "getRoomThemeGivenInfo", "recentFriends", "Lkotlinx/coroutines/flow/Flow;", "getRecentFriends", "()Lkotlinx/coroutines/flow/Flow;", "allFriends", "getAllFriends", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class ShareToFriendVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    @NotNull
    private final Flow<o0O0ooO<FriendInfo>> allFriends;

    @NotNull
    private final Flow<o0O0ooO<FriendInfo>> recentFriends;

    public static final class OooO00o extends Lambda implements Function0<o00O00o0<Integer, FriendInfo>> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final OooO00o f25694Oooo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O00o0<Integer, FriendInfo> invoke() {
            return p493o0o00O00.OooO0OO.OooO00o().OooOo00().OooO0o0(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41235OooO00o)).longValue());
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.ShareToFriendVM$getRoomThemeGivenInfo$1", f = "ShareToFriendVM.kt", i = {}, l = {121, 121}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RoomThemeGiveInfo>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f25695Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ long f25696OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f25697OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ long f25698OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(long j, long j2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f25696OoooO0 = j;
            this.f25698OoooO0O = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f25696OoooO0, this.f25698OoooO0O, continuation);
            oooO0O0.f25697OoooO00 = obj;
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
            int i = this.f25695Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25697OoooO00;
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
            liveDataScope = (LiveDataScope) this.f25697OoooO00;
            p522o0o0O0O0.o0O0ooO o0o0ooo = p522o0o0O0O0.o0O0ooO.f42809OooO00o;
            long j = this.f25696OoooO0;
            long j2 = this.f25698OoooO0O;
            this.f25697OoooO00 = liveDataScope;
            this.f25695Oooo = 1;
            obj = o0o0ooo.OooO00o(j, j2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25697OoooO00 = null;
            this.f25695Oooo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<o00O00o0<Integer, FriendInfo>> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f25699Oooo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str) {
            super(0);
            this.f25699Oooo = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O00o0<Integer, FriendInfo> invoke() {
            String searchText = this.f25699Oooo;
            Intrinsics.checkNotNullParameter(searchText, "searchText");
            return p493o0o00O00.OooO0OO.OooO00o().OooOo00().OooOOOo(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41235OooO00o)).longValue(), searchText);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<o00O00o0<Integer, FriendInfo>> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public static final OooO0o f25700Oooo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O00o0<Integer, FriendInfo> invoke() {
            return p493o0o00O00.OooO0OO.OooO00o().OooOOoo().OooO0oo(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41235OooO00o)).longValue());
        }
    }

    public ShareToFriendVM() {
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        OooO0o pagingSourceFactory = OooO0o.f25700Oooo;
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        o00O0000 config = new o00O0000(20, 5, false, 0, 56);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        this.recentFriends = new o000OO(pagingSourceFactory instanceof oo0oOO0 ? new o000OO00(pagingSourceFactory) : new o000OOo0(pagingSourceFactory, null), null, config).f28896OooO0o;
        CoroutineScope viewModelScope2 = ViewModelKt.getViewModelScope(this);
        OooO00o pagingSourceFactory2 = OooO00o.f25694Oooo;
        Intrinsics.checkNotNullParameter(viewModelScope2, "viewModelScope");
        Intrinsics.checkNotNullParameter(pagingSourceFactory2, "pagingSourceFactory");
        o00O0000 config2 = new o00O0000(20, 5, false, 0, 56);
        Intrinsics.checkNotNullParameter(config2, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory2, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config2, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory2, "pagingSourceFactory");
        this.allFriends = new o000OO(pagingSourceFactory2 instanceof oo0oOO0 ? new o000OO00(pagingSourceFactory2) : new o000OOo0(pagingSourceFactory2, null), null, config2).f28896OooO0o;
    }

    @NotNull
    public final Flow<o0O0ooO<FriendInfo>> getAllFriends() {
        return this.allFriends;
    }

    @NotNull
    public final Flow<o0O0ooO<FriendInfo>> getRecentFriends() {
        return this.recentFriends;
    }

    @NotNull
    public final LiveData<ApiResult<RoomThemeGiveInfo>> getRoomThemeGivenInfo(long targetId, long shopId) {
        return o0000O0O.OooO00o(new OooO0O0(targetId, shopId, null));
    }

    @NotNull
    public final Flow<o0O0ooO<FriendInfo>> getSearchFriends(@NotNull String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        OooO0OO pagingSourceFactory = new OooO0OO(content);
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        o00O0000 config = new o00O0000(20, 5, false, 0, 56);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        return new o000OO(pagingSourceFactory instanceof oo0oOO0 ? new o000OO00(pagingSourceFactory) : new o000OOo0(pagingSourceFactory, null), null, config).f28896OooO0o;
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
            long jLongValue = ((Number) it.next()).longValue();
            OooOo00 oooOo00 = OooOo00.f42259OooO00o;
            ArrayList arrayList2 = arrayList;
            msg = oooOo00.OooOOO(jLongValue, eventId, eventName, eventImgUrl, eventTagId, eventStartTime, eventEndTime, roomId, roomName, roomIp, "", 0L, false);
            oooOo00.OooO0oO(msg);
            arrayList2.add(msg.getMid());
            arrayList = arrayList2;
            str = str;
        }
        ArrayList midList = arrayList;
        Intrinsics.checkNotNullParameter(midList, "midList");
        Intrinsics.checkNotNullParameter(targetIds, str);
        Intrinsics.checkNotNullParameter(msg, "msg");
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o0000Ooo(msg, mutableLiveData, targetIds, midList, null), 2, null);
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
            OooOo00 oooOo00 = OooOo00.f42259OooO00o;
            ArrayList arrayList2 = arrayList;
            ChatMessage chatMessageOooOO0o = OooOo00.f42259OooO00o.OooOO0o(jLongValue, activityImage, activityText1, activityText2, activityUrl, (448 & 32) != 0 ? "" : message, (448 & 64) != 0 ? "" : null, 0L, false);
            oooOo00.OooO0oO(chatMessageOooOO0o);
            ChatMessage.ShareActivityInfo shareActivityInfo = chatMessageOooOO0o.getShareActivityInfo();
            if (shareActivityInfo != null) {
                shareActivityInfo.setActivity(activity);
            }
            if (message.length() > 0) {
                ChatMessage chatMessageOooOo0o = OooOo00.f42259OooO00o.OooOo0o(jLongValue, message, (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? 0L : 0L, (60 & 16) != 0 ? false : false, false);
                oooOo00.OooO0oO(chatMessageOooOo0o);
                arrayList2.add(new Pair(chatMessageOooOO0o.getMid(), chatMessageOooOo0o.getMid()));
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
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00000OO(msg, mutableLiveData, targetIds, midList, null), 2, null);
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
            OooOo00 oooOo00 = OooOo00.f42259OooO00o;
            ChatMessage chatMessageOooOOOO = OooOo00.f42259OooO00o.OooOOOO(jLongValue, momentId, momentImage, momentText, momentType, (448 & 32) != 0 ? "" : message, (448 & 64) != 0 ? "" : null, 0L, false);
            oooOo00.OooO0oO(chatMessageOooOOOO);
            if (message.length() > 0) {
                ChatMessage chatMessageOooOo0o = OooOo00.f42259OooO00o.OooOo0o(jLongValue, message, (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? 0L : 0L, (60 & 16) != 0 ? false : false, false);
                oooOo00.OooO0oO(chatMessageOooOo0o);
                midList.add(new Pair(chatMessageOooOOOO.getMid(), chatMessageOooOo0o.getMid()));
            } else {
                midList.add(new Pair(chatMessageOooOOOO.getMid(), ""));
            }
            msg = chatMessageOooOOOO;
        }
        Intrinsics.checkNotNullParameter(midList, "midList");
        Intrinsics.checkNotNullParameter(targetIds, "targetIds");
        Intrinsics.checkNotNullParameter(msg, "msg");
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o0000(msg, mutableLiveData, targetIds, midList, null), 2, null);
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
            OooOo00 oooOo00 = OooOo00.f42259OooO00o;
            ArrayList arrayList2 = arrayList;
            ChatMessage chatMessageOooOOo0 = OooOo00.f42259OooO00o.OooOOo0(jLongValue, roomId, roomIdx, roomName, roomHeader, (928 & 32) != 0 ? "" : null, (928 & 64) != 0 ? "" : message, (928 & 128) != 0 ? "" : null, 0L, false);
            oooOo00.OooO0oO(chatMessageOooOOo0);
            if (message.length() > 0) {
                ChatMessage chatMessageOooOo0o = OooOo00.f42259OooO00o.OooOo0o(jLongValue, message, (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? 0L : 0L, (60 & 16) != 0 ? false : false, false);
                oooOo00.OooO0oO(chatMessageOooOo0o);
                arrayList2.add(new Pair(chatMessageOooOOo0.getMid(), chatMessageOooOo0o.getMid()));
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
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o0000O00(msg, mutableLiveData, targetIds, midList, null), 2, null);
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
            OooOo00 oooOo00 = OooOo00.f42259OooO00o;
            ArrayList arrayList2 = arrayList;
            ChatMessage chatMessageOooOOoo = OooOo00.f42259OooO00o.OooOOoo(jLongValue, topicId, topicImage, topicName, topicUserCount, topicMomentCount, (896 & 64) != 0 ? "" : message, (896 & 128) != 0 ? "" : null, 0L, false);
            oooOo00.OooO0oO(chatMessageOooOOoo);
            if (message.length() > 0) {
                ChatMessage chatMessageOooOo0o = OooOo00.f42259OooO00o.OooOo0o(jLongValue, message, (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? 0L : 0L, (60 & 16) != 0 ? false : false, false);
                oooOo00.OooO0oO(chatMessageOooOo0o);
                arrayList2.add(new Pair(chatMessageOooOOoo.getMid(), chatMessageOooOo0o.getMid()));
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
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o0000oo(msg, mutableLiveData, targetIds, midList, null), 2, null);
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
            OooOo00 oooOo00 = OooOo00.f42259OooO00o;
            ArrayList arrayList2 = arrayList;
            ChatMessage chatMessageOooOo0 = OooOo00.f42259OooO00o.OooOo0(jLongValue, userId, userIdx, userName, userHead, (448 & 32) != 0 ? "" : message, (448 & 64) != 0 ? "" : null, 0L, false);
            oooOo00.OooO0oO(chatMessageOooOo0);
            if (message.length() > 0) {
                ChatMessage chatMessageOooOo0o = OooOo00.f42259OooO00o.OooOo0o(jLongValue, message, (60 & 4) != 0 ? "" : null, (60 & 8) != 0 ? 0L : 0L, (60 & 16) != 0 ? false : false, false);
                oooOo00.OooO0oO(chatMessageOooOo0o);
                arrayList2.add(new Pair(chatMessageOooOo0.getMid(), chatMessageOooOo0o.getMid()));
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
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o0000O0(msg, mutableLiveData, targetIds, midList, null), 2, null);
        return mutableLiveData;
    }
}
