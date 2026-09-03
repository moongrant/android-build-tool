package com.yalla.yalla.data.manager;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.common.db.table.SystemMessage;
import com.yalla.yalla.common.db.table.YallaTeamMessage;
import com.yalla.yalla.data.manager.SharedMessageVM;
import com.yalla.yalla.service.im.socket.IMConnectState;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import o00OO.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p490o0o00O0.OooOo00;
import p491o0o00O00.OooO0OO;
import p498o0o00Oo0.OooOOO;
import p518o0o0O00o.o000O0;
import p518o0o0O00o.o000O00;
import p518o0o0O00o.o000O00O;
import p518o0o0O00o.o000Oo0;
import p518o0o0O00o.o00O0000;
import p518o0o0O00o.o0O0ooO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bK\u0010LJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R*\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R*\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R*\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010&8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R,\u0010.\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010-\u0018\u00010\u000f8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0012\u001a\u0004\b/\u0010\u0014\"\u0004\b0\u0010\u0016R,\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u000101\u0018\u00010\u000f8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0012\u001a\u0004\b3\u0010\u0014\"\u0004\b4\u0010\u0016R%\u00107\u001a\u0010\u0012\f\u0012\n 6*\u0004\u0018\u000105050\u00078\u0006¢\u0006\f\n\u0004\b7\u0010\n\u001a\u0004\b8\u0010\fR%\u00109\u001a\u0010\u0012\f\u0012\n 6*\u0004\u0018\u000105050\u00078\u0006¢\u0006\f\n\u0004\b9\u0010\n\u001a\u0004\b9\u0010\fR%\u0010:\u001a\u0010\u0012\f\u0012\n 6*\u0004\u0018\u000105050\u00078\u0006¢\u0006\f\n\u0004\b:\u0010\n\u001a\u0004\b;\u0010\fR%\u0010<\u001a\u0010\u0012\f\u0012\n 6*\u0004\u0018\u000105050\u00078\u0006¢\u0006\f\n\u0004\b<\u0010\n\u001a\u0004\b=\u0010\fR%\u0010>\u001a\u0010\u0012\f\u0012\n 6*\u0004\u0018\u000105050\u00078\u0006¢\u0006\f\n\u0004\b>\u0010\n\u001a\u0004\b?\u0010\fR%\u0010@\u001a\u0010\u0012\f\u0012\n 6*\u0004\u0018\u000105050\u00078\u0006¢\u0006\f\n\u0004\b@\u0010\n\u001a\u0004\bA\u0010\fR*\u0010B\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010&8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010(\u001a\u0004\bC\u0010*\"\u0004\bD\u0010,R*\u0010E\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010&8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010(\u001a\u0004\bF\u0010*\"\u0004\bG\u0010,R*\u0010H\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010&8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010(\u001a\u0004\bI\u0010*\"\u0004\bJ\u0010,¨\u0006M"}, d2 = {"Lcom/yalla/yalla/data/manager/SharedMessageVM;", "Lo00OO/OooO00o;", "", "sumUnreadMessageCount", "isShowUserDot", "isShowDrawerTaskDot", "isShowStoreDot", "Landroidx/lifecycle/MutableLiveData;", "Lcom/yalla/yalla/service/im/socket/IMConnectState;", "connectState", "Landroidx/lifecycle/MutableLiveData;", "getConnectState", "()Landroidx/lifecycle/MutableLiveData;", "setConnectState", "(Landroidx/lifecycle/MutableLiveData;)V", "Landroidx/lifecycle/LiveData;", "", "unreadSystemMessageCount", "Landroidx/lifecycle/LiveData;", "getUnreadSystemMessageCount", "()Landroidx/lifecycle/LiveData;", "setUnreadSystemMessageCount", "(Landroidx/lifecycle/LiveData;)V", "unreadActivityMessageCount", "getUnreadActivityMessageCount", "setUnreadActivityMessageCount", "unreadYallaTeamMessageCount", "getUnreadYallaTeamMessageCount", "setUnreadYallaTeamMessageCount", "unreadFriendRequestsMessageCount", "getUnreadFriendRequestsMessageCount", "setUnreadFriendRequestsMessageCount", "unreadMomentsMessageCount", "getUnreadMomentsMessageCount", "setUnreadMomentsMessageCount", "unreadChatMessageCount", "getUnreadChatMessageCount", "setUnreadChatMessageCount", "Landroidx/lifecycle/MediatorLiveData;", "unreadMessageCount", "Landroidx/lifecycle/MediatorLiveData;", "getUnreadMessageCount", "()Landroidx/lifecycle/MediatorLiveData;", "setUnreadMessageCount", "(Landroidx/lifecycle/MediatorLiveData;)V", "Lcom/yalla/yalla/common/db/table/SystemMessage;", "latestSystemMessage", "getLatestSystemMessage", "setLatestSystemMessage", "Lcom/yalla/yalla/common/db/table/YallaTeamMessage;", "latestYallaTeamMessage", "getLatestYallaTeamMessage", "setLatestYallaTeamMessage", "", "kotlin.jvm.PlatformType", "haveNewFollowingPost", "getHaveNewFollowingPost", "isSignIn", "haveRewardTask", "getHaveRewardTask", "haveNewVersion", "getHaveNewVersion", "uniqueMessageDot", "getUniqueMessageDot", "userVehicleMessageDot", "getUserVehicleMessageDot", "userDot", "getUserDot", "setUserDot", "drawerTaskDot", "getDrawerTaskDot", "setDrawerTaskDot", "storeDot", "getStoreDot", "setStoreDot", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class SharedMessageVM extends OooO00o {
    public static final int $stable;

    @NotNull
    public static final SharedMessageVM INSTANCE = new SharedMessageVM();

    @NotNull
    private static MutableLiveData<IMConnectState> connectState;

    @Nullable
    private static MediatorLiveData<Boolean> drawerTaskDot;

    @NotNull
    private static final MutableLiveData<Boolean> haveNewFollowingPost;

    @NotNull
    private static final MutableLiveData<Boolean> haveNewVersion;

    @NotNull
    private static final MutableLiveData<Boolean> haveRewardTask;

    @NotNull
    private static final MutableLiveData<Boolean> isSignIn;

    @Nullable
    private static LiveData<SystemMessage> latestSystemMessage;

    @Nullable
    private static LiveData<YallaTeamMessage> latestYallaTeamMessage;

    @Nullable
    private static MediatorLiveData<Boolean> storeDot;

    @NotNull
    private static final MutableLiveData<Boolean> uniqueMessageDot;

    @Nullable
    private static LiveData<Integer> unreadActivityMessageCount;

    @Nullable
    private static LiveData<Integer> unreadChatMessageCount;

    @Nullable
    private static LiveData<Integer> unreadFriendRequestsMessageCount;

    @Nullable
    private static MediatorLiveData<Integer> unreadMessageCount;

    @Nullable
    private static LiveData<Integer> unreadMomentsMessageCount;

    @Nullable
    private static LiveData<Integer> unreadSystemMessageCount;

    @Nullable
    private static LiveData<Integer> unreadYallaTeamMessageCount;

    @Nullable
    private static MediatorLiveData<Boolean> userDot;

    @NotNull
    private static final MutableLiveData<Boolean> userVehicleMessageDot;

    static {
        OooOOO.f41216OooO00o.OooOooO().observeForever(new Observer() { // from class: o0o0O00o.o000OO0O
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SharedMessageVM.m304_init_$lambda0((Boolean) obj);
            }
        });
        connectState = new MutableLiveData<>();
        Boolean bool = Boolean.FALSE;
        haveNewFollowingPost = new MutableLiveData<>(bool);
        isSignIn = new MutableLiveData<>(Boolean.TRUE);
        haveRewardTask = new MutableLiveData<>(bool);
        haveNewVersion = new MutableLiveData<>(bool);
        uniqueMessageDot = new MutableLiveData<>(bool);
        userVehicleMessageDot = new MutableLiveData<>(bool);
        $stable = 8;
    }

    private SharedMessageVM() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_drawerTaskDot_$lambda-14$lambda-12, reason: not valid java name */
    public static final void m291_get_drawerTaskDot_$lambda14$lambda12(Boolean bool) {
        INSTANCE.isShowDrawerTaskDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_drawerTaskDot_$lambda-14$lambda-13, reason: not valid java name */
    public static final void m292_get_drawerTaskDot_$lambda14$lambda13(Boolean bool) {
        INSTANCE.isShowDrawerTaskDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_storeDot_$lambda-17$lambda-15, reason: not valid java name */
    public static final void m293_get_storeDot_$lambda17$lambda15(Boolean bool) {
        INSTANCE.isShowStoreDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_storeDot_$lambda-17$lambda-16, reason: not valid java name */
    public static final void m294_get_storeDot_$lambda17$lambda16(Boolean bool) {
        INSTANCE.isShowStoreDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_unreadMessageCount_$lambda-6$lambda-1, reason: not valid java name */
    public static final void m295_get_unreadMessageCount_$lambda6$lambda1(Integer num) {
        INSTANCE.sumUnreadMessageCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_unreadMessageCount_$lambda-6$lambda-2, reason: not valid java name */
    public static final void m296_get_unreadMessageCount_$lambda6$lambda2(Integer num) {
        INSTANCE.sumUnreadMessageCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_unreadMessageCount_$lambda-6$lambda-3, reason: not valid java name */
    public static final void m297_get_unreadMessageCount_$lambda6$lambda3(Integer num) {
        INSTANCE.sumUnreadMessageCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_unreadMessageCount_$lambda-6$lambda-4, reason: not valid java name */
    public static final void m298_get_unreadMessageCount_$lambda6$lambda4(Integer num) {
        INSTANCE.sumUnreadMessageCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_unreadMessageCount_$lambda-6$lambda-5, reason: not valid java name */
    public static final void m299_get_unreadMessageCount_$lambda6$lambda5(Integer num) {
        INSTANCE.sumUnreadMessageCount();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_userDot_$lambda-11$lambda-10, reason: not valid java name */
    public static final void m300_get_userDot_$lambda11$lambda10(Boolean bool) {
        INSTANCE.isShowUserDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_userDot_$lambda-11$lambda-7, reason: not valid java name */
    public static final void m301_get_userDot_$lambda11$lambda7(Boolean bool) {
        INSTANCE.isShowUserDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_userDot_$lambda-11$lambda-8, reason: not valid java name */
    public static final void m302_get_userDot_$lambda11$lambda8(Boolean bool) {
        INSTANCE.isShowUserDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_userDot_$lambda-11$lambda-9, reason: not valid java name */
    public static final void m303_get_userDot_$lambda11$lambda9(Boolean bool) {
        INSTANCE.isShowUserDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m304_init_$lambda0(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        unreadSystemMessageCount = null;
        unreadActivityMessageCount = null;
        unreadYallaTeamMessageCount = null;
        unreadFriendRequestsMessageCount = null;
        unreadMomentsMessageCount = null;
        unreadMessageCount = null;
        latestSystemMessage = null;
        unreadChatMessageCount = null;
        latestYallaTeamMessage = null;
        userDot = null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    private final void isShowDrawerTaskDot() {
        boolean z;
        MediatorLiveData<Boolean> drawerTaskDot2 = getDrawerTaskDot();
        if (drawerTaskDot2 == null) {
            return;
        }
        Boolean value = isSignIn.getValue();
        Intrinsics.checkNotNull(value);
        if (value.booleanValue()) {
            Boolean value2 = haveRewardTask.getValue();
            Intrinsics.checkNotNull(value2);
            if (value2.booleanValue()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        drawerTaskDot2.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    private final void isShowStoreDot() {
        boolean z;
        MediatorLiveData<Boolean> storeDot2 = getStoreDot();
        if (storeDot2 != null) {
            Boolean value = uniqueMessageDot.getValue();
            Intrinsics.checkNotNull(value);
            if (value.booleanValue()) {
                z = true;
            } else {
                Boolean value2 = userVehicleMessageDot.getValue();
                Intrinsics.checkNotNull(value2);
                if (value2.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
            }
            storeDot2.postValue(Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    private final void isShowUserDot() {
        boolean z;
        MediatorLiveData<Boolean> userDot2 = getUserDot();
        if (userDot2 == null) {
            return;
        }
        Boolean value = isSignIn.getValue();
        Intrinsics.checkNotNull(value);
        if (value.booleanValue()) {
            Boolean value2 = haveRewardTask.getValue();
            Intrinsics.checkNotNull(value2);
            if (value2.booleanValue()) {
                z = true;
            } else {
                Boolean value3 = haveNewVersion.getValue();
                Intrinsics.checkNotNull(value3);
                if (value3.booleanValue()) {
                    z = true;
                } else {
                    Boolean value4 = uniqueMessageDot.getValue();
                    Intrinsics.checkNotNull(value4);
                    if (value4.booleanValue()) {
                        z = true;
                    } else {
                        Boolean value5 = userVehicleMessageDot.getValue();
                        Intrinsics.checkNotNull(value5);
                        if (value5.booleanValue()) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                }
            }
        } else {
            z = true;
        }
        userDot2.setValue(Boolean.valueOf(z));
    }

    private final void sumUnreadMessageCount() {
        Integer value;
        Integer value2;
        Integer value3;
        Integer value4;
        Integer value5;
        LiveData<Integer> unreadSystemMessageCount2 = getUnreadSystemMessageCount();
        Integer num = 0;
        if (unreadSystemMessageCount2 == null || (value = unreadSystemMessageCount2.getValue()) == null) {
            value = num;
        }
        int iIntValue = value.intValue();
        LiveData<Integer> unreadActivityMessageCount2 = getUnreadActivityMessageCount();
        if (unreadActivityMessageCount2 == null || (value2 = unreadActivityMessageCount2.getValue()) == null) {
            value2 = num;
        }
        int iIntValue2 = value2.intValue() + iIntValue;
        LiveData<Integer> unreadYallaTeamMessageCount2 = getUnreadYallaTeamMessageCount();
        if (unreadYallaTeamMessageCount2 == null || (value3 = unreadYallaTeamMessageCount2.getValue()) == null) {
            value3 = num;
        }
        int iIntValue3 = value3.intValue() + iIntValue2;
        LiveData<Integer> unreadFriendRequestsMessageCount2 = getUnreadFriendRequestsMessageCount();
        if (unreadFriendRequestsMessageCount2 == null || (value4 = unreadFriendRequestsMessageCount2.getValue()) == null) {
            value4 = num;
        }
        int iIntValue4 = value4.intValue() + iIntValue3;
        LiveData<Integer> unreadChatMessageCount2 = getUnreadChatMessageCount();
        if (unreadChatMessageCount2 != null && (value5 = unreadChatMessageCount2.getValue()) != null) {
            num = value5;
        }
        int iIntValue5 = num.intValue() + iIntValue4;
        MediatorLiveData<Integer> unreadMessageCount2 = getUnreadMessageCount();
        if (unreadMessageCount2 == null) {
            return;
        }
        unreadMessageCount2.setValue(Integer.valueOf(iIntValue5));
    }

    @NotNull
    public final MutableLiveData<IMConnectState> getConnectState() {
        return connectState;
    }

    @Nullable
    public final MediatorLiveData<Boolean> getDrawerTaskDot() {
        if (drawerTaskDot == null) {
            MediatorLiveData<Boolean> mediatorLiveData = new MediatorLiveData<>();
            mediatorLiveData.addSource(isSignIn, o0O0ooO.f42205OooO0O0);
            mediatorLiveData.addSource(haveRewardTask, o000Oo0.f42196OooO0O0);
            drawerTaskDot = mediatorLiveData;
        }
        return drawerTaskDot;
    }

    @NotNull
    public final MutableLiveData<Boolean> getHaveNewFollowingPost() {
        return haveNewFollowingPost;
    }

    @NotNull
    public final MutableLiveData<Boolean> getHaveNewVersion() {
        return haveNewVersion;
    }

    @NotNull
    public final MutableLiveData<Boolean> getHaveRewardTask() {
        return haveRewardTask;
    }

    @Nullable
    public final LiveData<SystemMessage> getLatestSystemMessage() {
        if (latestSystemMessage == null) {
            latestSystemMessage = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(OooO0OO.OooO00o().Oooo00o().OooO0Oo(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue()), 300L), (CoroutineContext) null, 0L, 3, (Object) null);
        }
        return latestSystemMessage;
    }

    @Nullable
    public final LiveData<YallaTeamMessage> getLatestYallaTeamMessage() {
        if (latestYallaTeamMessage == null) {
            latestYallaTeamMessage = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(OooO0OO.OooO00o().Oooo0OO().OooO0oO(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue()), 300L), (CoroutineContext) null, 0L, 3, (Object) null);
        }
        return latestYallaTeamMessage;
    }

    @Nullable
    public final MediatorLiveData<Boolean> getStoreDot() {
        if (storeDot == null) {
            MediatorLiveData<Boolean> mediatorLiveData = new MediatorLiveData<>();
            mediatorLiveData.addSource(uniqueMessageDot, new Observer() { // from class: o0o0O00o.o000O0O0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMessageVM.m293_get_storeDot_$lambda17$lambda15((Boolean) obj);
                }
            });
            mediatorLiveData.addSource(userVehicleMessageDot, new Observer() { // from class: o0o0O00o.o000O
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMessageVM.m294_get_storeDot_$lambda17$lambda16((Boolean) obj);
                }
            });
            storeDot = mediatorLiveData;
        }
        return storeDot;
    }

    @NotNull
    public final MutableLiveData<Boolean> getUniqueMessageDot() {
        return uniqueMessageDot;
    }

    @Nullable
    public final LiveData<Integer> getUnreadActivityMessageCount() {
        if (unreadActivityMessageCount == null) {
            unreadActivityMessageCount = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(OooO0OO.OooO00o().Oooo00O().OooO0oO(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue()), 300L), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
        }
        return unreadActivityMessageCount;
    }

    @Nullable
    public final LiveData<Integer> getUnreadChatMessageCount() {
        if (unreadChatMessageCount == null) {
            OooOo00 oooOo00OooOOoo = OooO0OO.OooO00o().OooOOoo();
            Long value = OooOOO.f41216OooO00o.OooOo().getValue();
            unreadChatMessageCount = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(oooOo00OooOOoo.OooO00o(value == null ? 0L : value.longValue()), 300L), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
        }
        return unreadChatMessageCount;
    }

    @Nullable
    public final LiveData<Integer> getUnreadFriendRequestsMessageCount() {
        if (unreadFriendRequestsMessageCount == null) {
            unreadFriendRequestsMessageCount = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(OooO0OO.OooO00o().OooOo0().OooO00o(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue()), 300L), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
        }
        return unreadFriendRequestsMessageCount;
    }

    @Nullable
    public final MediatorLiveData<Integer> getUnreadMessageCount() {
        if (unreadMessageCount == null) {
            MediatorLiveData<Integer> mediatorLiveData = new MediatorLiveData<>();
            SharedMessageVM sharedMessageVM = INSTANCE;
            LiveData unreadSystemMessageCount2 = sharedMessageVM.getUnreadSystemMessageCount();
            Intrinsics.checkNotNull(unreadSystemMessageCount2);
            mediatorLiveData.addSource(unreadSystemMessageCount2, o00O0000.f42201OooO0O0);
            LiveData unreadActivityMessageCount2 = sharedMessageVM.getUnreadActivityMessageCount();
            Intrinsics.checkNotNull(unreadActivityMessageCount2);
            mediatorLiveData.addSource(unreadActivityMessageCount2, o000O00.f42182OooO0O0);
            LiveData unreadYallaTeamMessageCount2 = sharedMessageVM.getUnreadYallaTeamMessageCount();
            Intrinsics.checkNotNull(unreadYallaTeamMessageCount2);
            mediatorLiveData.addSource(unreadYallaTeamMessageCount2, new Observer() { // from class: o0o0O00o.o00
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMessageVM.m297_get_unreadMessageCount_$lambda6$lambda3((Integer) obj);
                }
            });
            LiveData unreadFriendRequestsMessageCount2 = sharedMessageVM.getUnreadFriendRequestsMessageCount();
            Intrinsics.checkNotNull(unreadFriendRequestsMessageCount2);
            mediatorLiveData.addSource(unreadFriendRequestsMessageCount2, o000O00O.f42187OooO0O0);
            LiveData unreadChatMessageCount2 = sharedMessageVM.getUnreadChatMessageCount();
            Intrinsics.checkNotNull(unreadChatMessageCount2);
            mediatorLiveData.addSource(unreadChatMessageCount2, new Observer() { // from class: o0o0O00o.o000OOo0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMessageVM.m299_get_unreadMessageCount_$lambda6$lambda5((Integer) obj);
                }
            });
            unreadMessageCount = mediatorLiveData;
        }
        return unreadMessageCount;
    }

    @Nullable
    public final LiveData<Integer> getUnreadMomentsMessageCount() {
        if (unreadMomentsMessageCount == null) {
            unreadMomentsMessageCount = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(OooO0OO.OooO00o().OooOoO0().OooO0Oo(OooOOO.f41216OooO00o.OooOo().getValue()), 300L), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
        }
        return unreadMomentsMessageCount;
    }

    @Nullable
    public final LiveData<Integer> getUnreadSystemMessageCount() {
        if (unreadSystemMessageCount == null) {
            unreadSystemMessageCount = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(OooO0OO.OooO00o().Oooo00o().OooO00o(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue()), 300L), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
        }
        return unreadSystemMessageCount;
    }

    @Nullable
    public final LiveData<Integer> getUnreadYallaTeamMessageCount() {
        if (unreadYallaTeamMessageCount == null) {
            unreadYallaTeamMessageCount = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(OooO0OO.OooO00o().Oooo0OO().OooO00o(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue()), 300L), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
        }
        return unreadYallaTeamMessageCount;
    }

    @Nullable
    public final MediatorLiveData<Boolean> getUserDot() {
        if (userDot == null) {
            MediatorLiveData<Boolean> mediatorLiveData = new MediatorLiveData<>();
            mediatorLiveData.addSource(isSignIn, new Observer() { // from class: o0o0O00o.o000O0Oo
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMessageVM.m301_get_userDot_$lambda11$lambda7((Boolean) obj);
                }
            });
            mediatorLiveData.addSource(haveRewardTask, new Observer() { // from class: o0o0O00o.o000O0o
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMessageVM.m302_get_userDot_$lambda11$lambda8((Boolean) obj);
                }
            });
            mediatorLiveData.addSource(uniqueMessageDot, new Observer() { // from class: o0o0O00o.o000OO00
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMessageVM.m303_get_userDot_$lambda11$lambda9((Boolean) obj);
                }
            });
            mediatorLiveData.addSource(userVehicleMessageDot, o000O0.f42178OooO0O0);
            userDot = mediatorLiveData;
        }
        return userDot;
    }

    @NotNull
    public final MutableLiveData<Boolean> getUserVehicleMessageDot() {
        return userVehicleMessageDot;
    }

    @NotNull
    public final MutableLiveData<Boolean> isSignIn() {
        return isSignIn;
    }

    public final void setConnectState(@NotNull MutableLiveData<IMConnectState> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        connectState = mutableLiveData;
    }

    public final void setDrawerTaskDot(@Nullable MediatorLiveData<Boolean> mediatorLiveData) {
        drawerTaskDot = mediatorLiveData;
    }

    public final void setLatestSystemMessage(@Nullable LiveData<SystemMessage> liveData) {
        latestSystemMessage = liveData;
    }

    public final void setLatestYallaTeamMessage(@Nullable LiveData<YallaTeamMessage> liveData) {
        latestYallaTeamMessage = liveData;
    }

    public final void setStoreDot(@Nullable MediatorLiveData<Boolean> mediatorLiveData) {
        storeDot = mediatorLiveData;
    }

    public final void setUnreadActivityMessageCount(@Nullable LiveData<Integer> liveData) {
        unreadActivityMessageCount = liveData;
    }

    public final void setUnreadChatMessageCount(@Nullable LiveData<Integer> liveData) {
        unreadChatMessageCount = liveData;
    }

    public final void setUnreadFriendRequestsMessageCount(@Nullable LiveData<Integer> liveData) {
        unreadFriendRequestsMessageCount = liveData;
    }

    public final void setUnreadMessageCount(@Nullable MediatorLiveData<Integer> mediatorLiveData) {
        unreadMessageCount = mediatorLiveData;
    }

    public final void setUnreadMomentsMessageCount(@Nullable LiveData<Integer> liveData) {
        unreadMomentsMessageCount = liveData;
    }

    public final void setUnreadSystemMessageCount(@Nullable LiveData<Integer> liveData) {
        unreadSystemMessageCount = liveData;
    }

    public final void setUnreadYallaTeamMessageCount(@Nullable LiveData<Integer> liveData) {
        unreadYallaTeamMessageCount = liveData;
    }

    public final void setUserDot(@Nullable MediatorLiveData<Boolean> mediatorLiveData) {
        userDot = mediatorLiveData;
    }
}
