package com.yalla.yalla.data.cache;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p407o0Oo0Oo.o0O;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0015\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bF\u0010GJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002R,\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR,\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR%\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R%\u0010\u001a\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R%\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R%\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019R%\u0010\u001f\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u00138\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019R%\u0010!\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u00138\u0006¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u0019R%\u0010#\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u00138\u0006¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u0019R%\u0010%\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u00138\u0006¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u0019R%\u0010'\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u00138\u0006¢\u0006\f\n\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010\u0019R%\u0010)\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u00138\u0006¢\u0006\f\n\u0004\b)\u0010\u0017\u001a\u0004\b*\u0010\u0019R%\u0010+\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u00138\u0006¢\u0006\f\n\u0004\b+\u0010\u0017\u001a\u0004\b,\u0010\u0019R%\u0010-\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u00138\u0006¢\u0006\f\n\u0004\b-\u0010\u0017\u001a\u0004\b.\u0010\u0019R%\u0010/\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u00138\u0006¢\u0006\f\n\u0004\b/\u0010\u0017\u001a\u0004\b0\u0010\u0019R%\u00101\u001a\u0010\u0012\f\u0012\n \u0015*\u0004\u0018\u00010\u00140\u00140\u00138\u0006¢\u0006\f\n\u0004\b1\u0010\u0017\u001a\u0004\b2\u0010\u0019R*\u00104\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001038F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R*\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001038F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00105\u001a\u0004\b;\u00107\"\u0004\b<\u00109R*\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001038F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00105\u001a\u0004\b>\u00107\"\u0004\b?\u00109R*\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001038F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u00105\u001a\u0004\bA\u00107\"\u0004\bB\u00109R*\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u0001038F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u00105\u001a\u0004\bD\u00107\"\u0004\bE\u00109¨\u0006H"}, d2 = {"Lcom/yalla/yalla/data/cache/SharedMainMessageManager;", "Lo0Oo0/OooOO0;", "", "isShowDrawUserDot", "isShowUserDot", "isShowDrawerTaskDot", "isShowStoreDot", "isShowPremiumDot", "Landroidx/lifecycle/LiveData;", "", "newFansNum", "Landroidx/lifecycle/LiveData;", "getNewFansNum", "()Landroidx/lifecycle/LiveData;", "setNewFansNum", "(Landroidx/lifecycle/LiveData;)V", "newVisitorNum", "getNewVisitorNum", "setNewVisitorNum", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "haveNewFollowingPost", "Landroidx/lifecycle/MutableLiveData;", "getHaveNewFollowingPost", "()Landroidx/lifecycle/MutableLiveData;", "isSignIn", "haveRewardTask", "getHaveRewardTask", "haveAchievementRewardTask", "getHaveAchievementRewardTask", "haveNewVersion", "getHaveNewVersion", "uniqueMessageDot", "getUniqueMessageDot", "userVehicleMessageDot", "getUserVehicleMessageDot", "storeBubbleDot", "getStoreBubbleDot", "premiumMomentEditRedDot", "getPremiumMomentEditRedDot", "vipRedDot_CustomRoomTheme", "getVipRedDot_CustomRoomTheme", "vipRedDot_ExclusiveBubble", "getVipRedDot_ExclusiveBubble", "vipRedDot_IncognitoAccess", "getVipRedDot_IncognitoAccess", "vipRedDot_ExclusiveBackpackGift", "getVipRedDot_ExclusiveBackpackGift", "vipRedDot_ExclusiveGiftRunway", "getVipRedDot_ExclusiveGiftRunway", "Landroidx/lifecycle/MediatorLiveData;", "userDot", "Landroidx/lifecycle/MediatorLiveData;", "getUserDot", "()Landroidx/lifecycle/MediatorLiveData;", "setUserDot", "(Landroidx/lifecycle/MediatorLiveData;)V", "drawUserDot", "getDrawUserDot", "setDrawUserDot", "drawerTaskDot", "getDrawerTaskDot", "setDrawerTaskDot", "storeDot", "getStoreDot", "setStoreDot", "premiumDot", "getPremiumDot", "setPremiumDot", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class SharedMainMessageManager extends p394o0Oo0.OooOO0 {
    public static final int $stable;

    @NotNull
    public static final SharedMainMessageManager INSTANCE = new SharedMainMessageManager();

    @Nullable
    private static MediatorLiveData<Boolean> drawUserDot;

    @Nullable
    private static MediatorLiveData<Boolean> drawerTaskDot;

    @NotNull
    private static final MutableLiveData<Boolean> haveAchievementRewardTask;

    @NotNull
    private static final MutableLiveData<Boolean> haveNewFollowingPost;

    @NotNull
    private static final MutableLiveData<Boolean> haveNewVersion;

    @NotNull
    private static final MutableLiveData<Boolean> haveRewardTask;

    @NotNull
    private static final MutableLiveData<Boolean> isSignIn;

    @Nullable
    private static LiveData<Integer> newFansNum;

    @Nullable
    private static LiveData<Integer> newVisitorNum;

    @Nullable
    private static MediatorLiveData<Boolean> premiumDot;

    @NotNull
    private static final MutableLiveData<Boolean> premiumMomentEditRedDot;

    @NotNull
    private static final MutableLiveData<Boolean> storeBubbleDot;

    @Nullable
    private static MediatorLiveData<Boolean> storeDot;

    @NotNull
    private static final MutableLiveData<Boolean> uniqueMessageDot;

    @Nullable
    private static MediatorLiveData<Boolean> userDot;

    @NotNull
    private static final MutableLiveData<Boolean> userVehicleMessageDot;

    @NotNull
    private static final MutableLiveData<Boolean> vipRedDot_CustomRoomTheme;

    @NotNull
    private static final MutableLiveData<Boolean> vipRedDot_ExclusiveBackpackGift;

    @NotNull
    private static final MutableLiveData<Boolean> vipRedDot_ExclusiveBubble;

    @NotNull
    private static final MutableLiveData<Boolean> vipRedDot_ExclusiveGiftRunway;

    @NotNull
    private static final MutableLiveData<Boolean> vipRedDot_IncognitoAccess;

    public static final class OooO extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f22319OooO0Oo = new OooO();

        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            SharedMainMessageManager.INSTANCE.isShowDrawerTaskDot();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f22320OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                SharedMainMessageManager sharedMainMessageManager = SharedMainMessageManager.INSTANCE;
                sharedMainMessageManager.setUserDot(null);
                sharedMainMessageManager.setDrawerTaskDot(null);
                MutableLiveData<Boolean> haveAchievementRewardTask = sharedMainMessageManager.getHaveAchievementRewardTask();
                if (haveAchievementRewardTask != null) {
                    haveAchievementRewardTask.postValue(Boolean.FALSE);
                }
                sharedMainMessageManager.setNewVisitorNum(null);
                sharedMainMessageManager.setNewFansNum(null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f22321OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            SharedMainMessageManager.INSTANCE.isShowDrawUserDot();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f22322OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            SharedMainMessageManager.INSTANCE.isShowDrawUserDot();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f22323OooO0Oo = new OooO0o();

        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            SharedMainMessageManager.INSTANCE.isShowDrawerTaskDot();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f22324OooO0Oo = new OooOO0();

        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            SharedMainMessageManager.INSTANCE.isShowDrawerTaskDot();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f22325OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            SharedMainMessageManager.INSTANCE.isShowPremiumDot();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f22326OooO0Oo = new OooOOO();

        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            SharedMainMessageManager.INSTANCE.isShowStoreDot();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f22327OooO0Oo;

        public OooOOO0(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f22327OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f22327OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f22327OooO0Oo;
        }

        public final int hashCode() {
            return this.f22327OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f22327OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOOO f22328OooO0Oo = new OooOOOO();

        public OooOOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            SharedMainMessageManager.INSTANCE.isShowStoreDot();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo f22329OooO0Oo = new OooOo();

        public OooOo() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            SharedMainMessageManager.INSTANCE.isShowUserDot();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo00 f22330OooO0Oo = new OooOo00();

        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            SharedMainMessageManager.INSTANCE.isShowStoreDot();
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo0 f22331OooO0Oo = new Oooo0();

        public Oooo0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            SharedMainMessageManager.INSTANCE.isShowUserDot();
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo000 f22332OooO0Oo = new Oooo000();

        public Oooo000() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            SharedMainMessageManager.INSTANCE.isShowUserDot();
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000oOoO f22333OooO0Oo = new o000oOoO();

        public o000oOoO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            SharedMainMessageManager.INSTANCE.isShowUserDot();
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00O0O f22334OooO0Oo = new o00O0O();

        public o00O0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            SharedMainMessageManager.INSTANCE.isShowUserDot();
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00Oo0 f22335OooO0Oo = new o00Oo0();

        public o00Oo0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            SharedMainMessageManager.INSTANCE.isShowUserDot();
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0OoOo0 f22336OooO0Oo = new o0OoOo0();

        public o0OoOo0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            SharedMainMessageManager.INSTANCE.isShowUserDot();
            return Unit.INSTANCE;
        }
    }

    static {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0O00oO0.OooOo0O().observeForever(new OooOOO0(OooO00o.f22320OooO0Oo));
        Boolean bool = Boolean.FALSE;
        haveNewFollowingPost = new MutableLiveData<>(bool);
        isSignIn = new MutableLiveData<>(Boolean.TRUE);
        haveRewardTask = new MutableLiveData<>(bool);
        haveAchievementRewardTask = new MutableLiveData<>(bool);
        haveNewVersion = new MutableLiveData<>(bool);
        uniqueMessageDot = new MutableLiveData<>(bool);
        userVehicleMessageDot = new MutableLiveData<>(bool);
        storeBubbleDot = new MutableLiveData<>(bool);
        premiumMomentEditRedDot = new MutableLiveData<>(bool);
        vipRedDot_CustomRoomTheme = new MutableLiveData<>(bool);
        vipRedDot_ExclusiveBubble = new MutableLiveData<>(bool);
        vipRedDot_IncognitoAccess = new MutableLiveData<>(bool);
        vipRedDot_ExclusiveBackpackGift = new MutableLiveData<>(bool);
        vipRedDot_ExclusiveGiftRunway = new MutableLiveData<>(bool);
        $stable = 8;
    }

    private SharedMainMessageManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isShowDrawUserDot() {
        MediatorLiveData<Boolean> drawUserDot2 = getDrawUserDot();
        if (drawUserDot2 == null) {
            return;
        }
        LiveData<Integer> newFansNum2 = getNewFansNum();
        Intrinsics.checkNotNull(newFansNum2);
        Integer value = newFansNum2.getValue();
        if (value == null) {
            value = 0;
        }
        int iIntValue = value.intValue();
        LiveData<Integer> newVisitorNum2 = getNewVisitorNum();
        Intrinsics.checkNotNull(newVisitorNum2);
        Integer value2 = newVisitorNum2.getValue();
        if (value2 == null) {
            value2 = 0;
        }
        drawUserDot2.setValue(Boolean.valueOf(value2.intValue() + iIntValue > 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
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
                Boolean value3 = haveAchievementRewardTask.getValue();
                Intrinsics.checkNotNull(value3);
                if (value3.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
            }
        } else {
            z = true;
        }
        drawerTaskDot2.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isShowPremiumDot() {
        MediatorLiveData<Boolean> premiumDot2 = getPremiumDot();
        if (premiumDot2 != null) {
            Boolean value = premiumMomentEditRedDot.getValue();
            Intrinsics.checkNotNull(value);
            premiumDot2.postValue(value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
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
                    Boolean value3 = storeBubbleDot.getValue();
                    Intrinsics.checkNotNull(value3);
                    if (value3.booleanValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            storeDot2.postValue(Boolean.valueOf(z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0093  */
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
                Boolean value3 = haveAchievementRewardTask.getValue();
                Intrinsics.checkNotNull(value3);
                if (value3.booleanValue()) {
                    z = true;
                } else {
                    Boolean value4 = haveNewVersion.getValue();
                    Intrinsics.checkNotNull(value4);
                    if (value4.booleanValue()) {
                        z = true;
                    } else {
                        Boolean value5 = uniqueMessageDot.getValue();
                        Intrinsics.checkNotNull(value5);
                        if (value5.booleanValue()) {
                            z = true;
                        } else {
                            Boolean value6 = userVehicleMessageDot.getValue();
                            Intrinsics.checkNotNull(value6);
                            if (value6.booleanValue()) {
                                z = true;
                            } else {
                                Boolean value7 = storeBubbleDot.getValue();
                                Intrinsics.checkNotNull(value7);
                                if (value7.booleanValue()) {
                                    z = true;
                                } else {
                                    Boolean value8 = premiumMomentEditRedDot.getValue();
                                    Intrinsics.checkNotNull(value8);
                                    if (value8.booleanValue()) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            z = true;
        }
        userDot2.setValue(Boolean.valueOf(z));
    }

    @Nullable
    public final MediatorLiveData<Boolean> getDrawUserDot() {
        if (drawUserDot == null) {
            MediatorLiveData<Boolean> mediatorLiveData = new MediatorLiveData<>();
            SharedMainMessageManager sharedMainMessageManager = INSTANCE;
            LiveData newFansNum2 = sharedMainMessageManager.getNewFansNum();
            Intrinsics.checkNotNull(newFansNum2);
            mediatorLiveData.addSource(newFansNum2, new OooOOO0(OooO0O0.f22321OooO0Oo));
            LiveData newVisitorNum2 = sharedMainMessageManager.getNewVisitorNum();
            Intrinsics.checkNotNull(newVisitorNum2);
            mediatorLiveData.addSource(newVisitorNum2, new OooOOO0(OooO0OO.f22322OooO0Oo));
            drawUserDot = mediatorLiveData;
        }
        return drawUserDot;
    }

    @Nullable
    public final MediatorLiveData<Boolean> getDrawerTaskDot() {
        if (drawerTaskDot == null) {
            MediatorLiveData<Boolean> mediatorLiveData = new MediatorLiveData<>();
            mediatorLiveData.addSource(isSignIn, new OooOOO0(OooO0o.f22323OooO0Oo));
            mediatorLiveData.addSource(haveRewardTask, new OooOOO0(OooO.f22319OooO0Oo));
            mediatorLiveData.addSource(haveAchievementRewardTask, new OooOOO0(OooOO0.f22324OooO0Oo));
            drawerTaskDot = mediatorLiveData;
        }
        return drawerTaskDot;
    }

    @NotNull
    public final MutableLiveData<Boolean> getHaveAchievementRewardTask() {
        return haveAchievementRewardTask;
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
    public final LiveData<Integer> getNewFansNum() {
        if (newFansNum == null) {
            o0O o0oOooo000 = p408o0Oo0Oo0.o00Oo0.OooO00o().Oooo000();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            newFansNum = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(o0oOooo000.OooOO0(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue()), 300L), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
        }
        return newFansNum;
    }

    @Nullable
    public final LiveData<Integer> getNewVisitorNum() {
        if (newVisitorNum == null) {
            o0O o0oOooo000 = p408o0Oo0Oo0.o00Oo0.OooO00o().Oooo000();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            newVisitorNum = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(o0oOooo000.OooO0o(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue()), 300L), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
        }
        return newVisitorNum;
    }

    @Nullable
    public final MediatorLiveData<Boolean> getPremiumDot() {
        if (premiumDot == null) {
            MediatorLiveData<Boolean> mediatorLiveData = new MediatorLiveData<>();
            mediatorLiveData.addSource(premiumMomentEditRedDot, new OooOOO0(OooOO0O.f22325OooO0Oo));
            premiumDot = mediatorLiveData;
        }
        return premiumDot;
    }

    @NotNull
    public final MutableLiveData<Boolean> getPremiumMomentEditRedDot() {
        return premiumMomentEditRedDot;
    }

    @NotNull
    public final MutableLiveData<Boolean> getStoreBubbleDot() {
        return storeBubbleDot;
    }

    @Nullable
    public final MediatorLiveData<Boolean> getStoreDot() {
        if (storeDot == null) {
            MediatorLiveData<Boolean> mediatorLiveData = new MediatorLiveData<>();
            mediatorLiveData.addSource(uniqueMessageDot, new OooOOO0(OooOOO.f22326OooO0Oo));
            mediatorLiveData.addSource(userVehicleMessageDot, new OooOOO0(OooOOOO.f22328OooO0Oo));
            mediatorLiveData.addSource(storeBubbleDot, new OooOOO0(OooOo00.f22330OooO0Oo));
            storeDot = mediatorLiveData;
        }
        return storeDot;
    }

    @NotNull
    public final MutableLiveData<Boolean> getUniqueMessageDot() {
        return uniqueMessageDot;
    }

    @Nullable
    public final MediatorLiveData<Boolean> getUserDot() {
        if (userDot == null) {
            MediatorLiveData<Boolean> mediatorLiveData = new MediatorLiveData<>();
            mediatorLiveData.addSource(isSignIn, new OooOOO0(OooOo.f22329OooO0Oo));
            mediatorLiveData.addSource(haveRewardTask, new OooOOO0(Oooo000.f22332OooO0Oo));
            mediatorLiveData.addSource(haveAchievementRewardTask, new OooOOO0(Oooo0.f22331OooO0Oo));
            mediatorLiveData.addSource(uniqueMessageDot, new OooOOO0(o000oOoO.f22333OooO0Oo));
            mediatorLiveData.addSource(userVehicleMessageDot, new OooOOO0(o0OoOo0.f22336OooO0Oo));
            mediatorLiveData.addSource(storeBubbleDot, new OooOOO0(o00O0O.f22334OooO0Oo));
            mediatorLiveData.addSource(premiumMomentEditRedDot, new OooOOO0(o00Oo0.f22335OooO0Oo));
            userDot = mediatorLiveData;
        }
        return userDot;
    }

    @NotNull
    public final MutableLiveData<Boolean> getUserVehicleMessageDot() {
        return userVehicleMessageDot;
    }

    @NotNull
    public final MutableLiveData<Boolean> getVipRedDot_CustomRoomTheme() {
        return vipRedDot_CustomRoomTheme;
    }

    @NotNull
    public final MutableLiveData<Boolean> getVipRedDot_ExclusiveBackpackGift() {
        return vipRedDot_ExclusiveBackpackGift;
    }

    @NotNull
    public final MutableLiveData<Boolean> getVipRedDot_ExclusiveBubble() {
        return vipRedDot_ExclusiveBubble;
    }

    @NotNull
    public final MutableLiveData<Boolean> getVipRedDot_ExclusiveGiftRunway() {
        return vipRedDot_ExclusiveGiftRunway;
    }

    @NotNull
    public final MutableLiveData<Boolean> getVipRedDot_IncognitoAccess() {
        return vipRedDot_IncognitoAccess;
    }

    @NotNull
    public final MutableLiveData<Boolean> isSignIn() {
        return isSignIn;
    }

    public final void setDrawUserDot(@Nullable MediatorLiveData<Boolean> mediatorLiveData) {
        drawUserDot = mediatorLiveData;
    }

    public final void setDrawerTaskDot(@Nullable MediatorLiveData<Boolean> mediatorLiveData) {
        drawerTaskDot = mediatorLiveData;
    }

    public final void setNewFansNum(@Nullable LiveData<Integer> liveData) {
        newFansNum = liveData;
    }

    public final void setNewVisitorNum(@Nullable LiveData<Integer> liveData) {
        newVisitorNum = liveData;
    }

    public final void setPremiumDot(@Nullable MediatorLiveData<Boolean> mediatorLiveData) {
        premiumDot = mediatorLiveData;
    }

    public final void setStoreDot(@Nullable MediatorLiveData<Boolean> mediatorLiveData) {
        storeDot = mediatorLiveData;
    }

    public final void setUserDot(@Nullable MediatorLiveData<Boolean> mediatorLiveData) {
        userDot = mediatorLiveData;
    }
}
