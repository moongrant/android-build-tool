package com.yalla.yalla.data.manager;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.data.db.table.SystemMessage;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.service.im.socket.IMConnectState;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394o0Oo00oO.o0O0O00;
import p403o0Oo0OOo.o00OOOOo;
import p403o0Oo0OOo.o0O0O0o0;
import p403o0Oo0OOo.o0OOooO0;
import p403o0Oo0OOo.oO0O00o0;
import p403o0Oo0OOo.oO0oO000;
import p403o0Oo0OOo.oOo00ooO;
import p464o0Oooo.o000000O;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bK\u0010LJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R*\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014\"\u0004\b\u001f\u0010\u0016R*\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R*\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0012\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016R*\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010&8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R,\u0010.\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010-\u0018\u00010\u000f8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0012\u001a\u0004\b/\u0010\u0014\"\u0004\b0\u0010\u0016R,\u00102\u001a\f\u0012\u0006\u0012\u0004\u0018\u000101\u0018\u00010\u000f8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0012\u001a\u0004\b3\u0010\u0014\"\u0004\b4\u0010\u0016R%\u00107\u001a\u0010\u0012\f\u0012\n 6*\u0004\u0018\u000105050\u00078\u0006¢\u0006\f\n\u0004\b7\u0010\n\u001a\u0004\b8\u0010\fR%\u00109\u001a\u0010\u0012\f\u0012\n 6*\u0004\u0018\u000105050\u00078\u0006¢\u0006\f\n\u0004\b9\u0010\n\u001a\u0004\b9\u0010\fR%\u0010:\u001a\u0010\u0012\f\u0012\n 6*\u0004\u0018\u000105050\u00078\u0006¢\u0006\f\n\u0004\b:\u0010\n\u001a\u0004\b;\u0010\fR%\u0010<\u001a\u0010\u0012\f\u0012\n 6*\u0004\u0018\u000105050\u00078\u0006¢\u0006\f\n\u0004\b<\u0010\n\u001a\u0004\b=\u0010\fR%\u0010>\u001a\u0010\u0012\f\u0012\n 6*\u0004\u0018\u000105050\u00078\u0006¢\u0006\f\n\u0004\b>\u0010\n\u001a\u0004\b?\u0010\fR%\u0010@\u001a\u0010\u0012\f\u0012\n 6*\u0004\u0018\u000105050\u00078\u0006¢\u0006\f\n\u0004\b@\u0010\n\u001a\u0004\bA\u0010\fR*\u0010B\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010&8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010(\u001a\u0004\bC\u0010*\"\u0004\bD\u0010,R*\u0010E\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010&8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010(\u001a\u0004\bF\u0010*\"\u0004\bG\u0010,R*\u0010H\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010&8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010(\u001a\u0004\bI\u0010*\"\u0004\bJ\u0010,¨\u0006M"}, d2 = {"Lcom/yalla/yalla/data/manager/SharedMessageVM;", "Lo0Oo00oO/o0O0O00;", "", "sumUnreadMessageCount", "isShowUserDot", "isShowDrawerTaskDot", "isShowStoreDot", "Landroidx/lifecycle/MutableLiveData;", "Lcom/yalla/yalla/service/im/socket/IMConnectState;", "connectState", "Landroidx/lifecycle/MutableLiveData;", "getConnectState", "()Landroidx/lifecycle/MutableLiveData;", "setConnectState", "(Landroidx/lifecycle/MutableLiveData;)V", "Landroidx/lifecycle/LiveData;", "", "unreadSystemMessageCount", "Landroidx/lifecycle/LiveData;", "getUnreadSystemMessageCount", "()Landroidx/lifecycle/LiveData;", "setUnreadSystemMessageCount", "(Landroidx/lifecycle/LiveData;)V", "unreadActivityMessageCount", "getUnreadActivityMessageCount", "setUnreadActivityMessageCount", "unreadYallaTeamMessageCount", "getUnreadYallaTeamMessageCount", "setUnreadYallaTeamMessageCount", "unreadFriendRequestsMessageCount", "getUnreadFriendRequestsMessageCount", "setUnreadFriendRequestsMessageCount", "unreadMomentsMessageCount", "getUnreadMomentsMessageCount", "setUnreadMomentsMessageCount", "unreadChatMessageCount", "getUnreadChatMessageCount", "setUnreadChatMessageCount", "Landroidx/lifecycle/MediatorLiveData;", "unreadMessageCount", "Landroidx/lifecycle/MediatorLiveData;", "getUnreadMessageCount", "()Landroidx/lifecycle/MediatorLiveData;", "setUnreadMessageCount", "(Landroidx/lifecycle/MediatorLiveData;)V", "Lcom/yalla/yalla/data/db/table/SystemMessage;", "latestSystemMessage", "getLatestSystemMessage", "setLatestSystemMessage", "Lcom/yalla/yalla/data/db/table/YallaTeamMessage;", "latestYallaTeamMessage", "getLatestYallaTeamMessage", "setLatestYallaTeamMessage", "", "kotlin.jvm.PlatformType", "haveNewFollowingPost", "getHaveNewFollowingPost", "isSignIn", "haveRewardTask", "getHaveRewardTask", "haveNewVersion", "getHaveNewVersion", "uniqueMessageDot", "getUniqueMessageDot", "userVehicleMessageDot", "getUserVehicleMessageDot", "userDot", "getUserDot", "setUserDot", "drawerTaskDot", "getDrawerTaskDot", "setDrawerTaskDot", "storeDot", "getStoreDot", "setStoreDot", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class SharedMessageVM extends o0O0O00 {
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

    public static final class OooO extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f22840OooO0Oo = new OooO();

        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            SharedMessageVM.INSTANCE.isShowStoreDot();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f22841OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                SharedMessageVM sharedMessageVM = SharedMessageVM.INSTANCE;
                sharedMessageVM.setUnreadSystemMessageCount(null);
                sharedMessageVM.setUnreadActivityMessageCount(null);
                sharedMessageVM.setUnreadYallaTeamMessageCount(null);
                sharedMessageVM.setUnreadFriendRequestsMessageCount(null);
                sharedMessageVM.setUnreadMomentsMessageCount(null);
                sharedMessageVM.setUnreadMessageCount(null);
                sharedMessageVM.setLatestSystemMessage(null);
                sharedMessageVM.setUnreadChatMessageCount(null);
                sharedMessageVM.setLatestYallaTeamMessage(null);
                sharedMessageVM.setUserDot(null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f22842OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            SharedMessageVM.INSTANCE.isShowDrawerTaskDot();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f22843OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            SharedMessageVM.INSTANCE.isShowDrawerTaskDot();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f22844OooO0Oo;

        public OooO0o(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f22844OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f22844OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f22844OooO0Oo;
        }

        public final int hashCode() {
            return this.f22844OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f22844OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f22845OooO0Oo = new OooOO0();

        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            SharedMessageVM.INSTANCE.isShowStoreDot();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f22846OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            SharedMessageVM.INSTANCE.sumUnreadMessageCount();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f22847OooO0Oo = new OooOOO();

        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            SharedMessageVM.INSTANCE.sumUnreadMessageCount();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f22848OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            SharedMessageVM.INSTANCE.sumUnreadMessageCount();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOOO f22849OooO0Oo = new OooOOOO();

        public OooOOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            SharedMessageVM.INSTANCE.sumUnreadMessageCount();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo f22850OooO0Oo = new OooOo();

        public OooOo() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            SharedMessageVM.INSTANCE.isShowUserDot();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo00 f22851OooO0Oo = new OooOo00();

        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            SharedMessageVM.INSTANCE.sumUnreadMessageCount();
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo0 f22852OooO0Oo = new Oooo0();

        public Oooo0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            SharedMessageVM.INSTANCE.isShowUserDot();
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo000 f22853OooO0Oo = new Oooo000();

        public Oooo000() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            SharedMessageVM.INSTANCE.isShowUserDot();
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000oOoO f22854OooO0Oo = new o000oOoO();

        public o000oOoO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            SharedMessageVM.INSTANCE.isShowUserDot();
            return Unit.INSTANCE;
        }
    }

    static {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooOo0O().observeForever(new OooO0o(OooO00o.f22841OooO0Oo));
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
    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    public final void isShowDrawerTaskDot() {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    public final void isShowStoreDot() {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x005f  */
    public final void isShowUserDot() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void sumUnreadMessageCount() {
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
            mediatorLiveData.addSource(isSignIn, new OooO0o(OooO0O0.f22842OooO0Oo));
            mediatorLiveData.addSource(haveRewardTask, new OooO0o(OooO0OO.f22843OooO0Oo));
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
            oO0O00o0 oo0o00o0Oooo000 = o000OOo.OooO00o().Oooo000();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            latestSystemMessage = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(oo0o00o0Oooo000.OooO0o0(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue()), 300L), (CoroutineContext) null, 0L, 3, (Object) null);
        }
        return latestSystemMessage;
    }

    @Nullable
    public final LiveData<YallaTeamMessage> getLatestYallaTeamMessage() {
        if (latestYallaTeamMessage == null) {
            oO0oO000 oo0oo000Oooo0 = o000OOo.OooO00o().Oooo0();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            latestYallaTeamMessage = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(oo0oo000Oooo0.OooO0OO(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue()), 300L), (CoroutineContext) null, 0L, 3, (Object) null);
        }
        return latestYallaTeamMessage;
    }

    @Nullable
    public final MediatorLiveData<Boolean> getStoreDot() {
        if (storeDot == null) {
            MediatorLiveData<Boolean> mediatorLiveData = new MediatorLiveData<>();
            mediatorLiveData.addSource(uniqueMessageDot, new OooO0o(OooO.f22840OooO0Oo));
            mediatorLiveData.addSource(userVehicleMessageDot, new OooO0o(OooOO0.f22845OooO0Oo));
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
            oOo00ooO ooo00oooOooOooo = o000OOo.OooO00o().OooOooo();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            unreadActivityMessageCount = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(ooo00oooOooOooo.OooO0o0(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue()), 300L), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
        }
        return unreadActivityMessageCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final LiveData<Integer> getUnreadChatMessageCount() {
        if (unreadChatMessageCount == null) {
            o00OOOOo o00oooooOooOOo0 = o000OOo.OooO00o().OooOOo0();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Long l = (Long) o000000O.OooOOo0().getValue();
            unreadChatMessageCount = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(o00oooooOooOOo0.OooO00o(l == null ? 0L : l.longValue()), 300L), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
        }
        return unreadChatMessageCount;
    }

    @Nullable
    public final LiveData<Integer> getUnreadFriendRequestsMessageCount() {
        if (unreadFriendRequestsMessageCount == null) {
            o0O0O0o0 o0o0o0o0OooOOoo = o000OOo.OooO00o().OooOOoo();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            unreadFriendRequestsMessageCount = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(o0o0o0o0OooOOoo.OooO00o(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue()), 300L), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
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
            mediatorLiveData.addSource(unreadSystemMessageCount2, new OooO0o(OooOO0O.f22846OooO0Oo));
            LiveData unreadActivityMessageCount2 = sharedMessageVM.getUnreadActivityMessageCount();
            Intrinsics.checkNotNull(unreadActivityMessageCount2);
            mediatorLiveData.addSource(unreadActivityMessageCount2, new OooO0o(OooOOO0.f22848OooO0Oo));
            LiveData unreadYallaTeamMessageCount2 = sharedMessageVM.getUnreadYallaTeamMessageCount();
            Intrinsics.checkNotNull(unreadYallaTeamMessageCount2);
            mediatorLiveData.addSource(unreadYallaTeamMessageCount2, new OooO0o(OooOOO.f22847OooO0Oo));
            LiveData unreadFriendRequestsMessageCount2 = sharedMessageVM.getUnreadFriendRequestsMessageCount();
            Intrinsics.checkNotNull(unreadFriendRequestsMessageCount2);
            mediatorLiveData.addSource(unreadFriendRequestsMessageCount2, new OooO0o(OooOOOO.f22849OooO0Oo));
            LiveData unreadChatMessageCount2 = sharedMessageVM.getUnreadChatMessageCount();
            Intrinsics.checkNotNull(unreadChatMessageCount2);
            mediatorLiveData.addSource(unreadChatMessageCount2, new OooO0o(OooOo00.f22851OooO0Oo));
            unreadMessageCount = mediatorLiveData;
        }
        return unreadMessageCount;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final LiveData<Integer> getUnreadMomentsMessageCount() {
        if (unreadMomentsMessageCount == null) {
            o0OOooO0 o0ooooo0OooOo0o = o000OOo.OooO00o().OooOo0o();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            unreadMomentsMessageCount = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(o0ooooo0OooOo0o.OooO0oo((Long) o000000O.OooOOo0().getValue()), 300L), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
        }
        return unreadMomentsMessageCount;
    }

    @Nullable
    public final LiveData<Integer> getUnreadSystemMessageCount() {
        if (unreadSystemMessageCount == null) {
            oO0O00o0 oo0o00o0Oooo000 = o000OOo.OooO00o().Oooo000();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            unreadSystemMessageCount = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(oo0o00o0Oooo000.OooO00o(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue()), 300L), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
        }
        return unreadSystemMessageCount;
    }

    @Nullable
    public final LiveData<Integer> getUnreadYallaTeamMessageCount() {
        if (unreadYallaTeamMessageCount == null) {
            oO0oO000 oo0oo000Oooo0 = o000OOo.OooO00o().Oooo0();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            unreadYallaTeamMessageCount = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(oo0oo000Oooo0.OooO00o(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue()), 300L), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
        }
        return unreadYallaTeamMessageCount;
    }

    @Nullable
    public final MediatorLiveData<Boolean> getUserDot() {
        if (userDot == null) {
            MediatorLiveData<Boolean> mediatorLiveData = new MediatorLiveData<>();
            mediatorLiveData.addSource(isSignIn, new OooO0o(OooOo.f22850OooO0Oo));
            mediatorLiveData.addSource(haveRewardTask, new OooO0o(Oooo000.f22853OooO0Oo));
            mediatorLiveData.addSource(uniqueMessageDot, new OooO0o(Oooo0.f22852OooO0Oo));
            mediatorLiveData.addSource(userVehicleMessageDot, new OooO0o(o000oOoO.f22854OooO0Oo));
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
