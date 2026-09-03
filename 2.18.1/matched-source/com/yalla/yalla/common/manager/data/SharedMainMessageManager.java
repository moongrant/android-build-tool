package com.yalla.yalla.common.manager.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159o00OoOO.o000OO00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0018\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bF\u0010GJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002R,\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R,\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t8F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R%\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR%\u0010\u001b\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR%\u0010\u001c\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR%\u0010\u001e\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00148\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001aR%\u0010 \u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00148\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u001aR%\u0010\"\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00148\u0006¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001aR%\u0010$\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00148\u0006¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\u001aR%\u0010&\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00148\u0006¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b'\u0010\u001aR%\u0010(\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00148\u0006¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010\u001aR%\u0010*\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00148\u0006¢\u0006\f\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u001aR%\u0010,\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00148\u0006¢\u0006\f\n\u0004\b,\u0010\u0018\u001a\u0004\b-\u0010\u001aR%\u0010.\u001a\u0010\u0012\f\u0012\n \u0016*\u0004\u0018\u00010\u00150\u00150\u00148\u0006¢\u0006\f\n\u0004\b.\u0010\u0018\u001a\u0004\b/\u0010\u001aR*\u00101\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001008F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u00107\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001008F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R*\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001008F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00102\u001a\u0004\b;\u00104\"\u0004\b<\u00106R*\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001008F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00102\u001a\u0004\b>\u00104\"\u0004\b?\u00106R*\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001008F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u00102\u001a\u0004\bA\u00104\"\u0004\bB\u00106R*\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001008F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u00102\u001a\u0004\bD\u00104\"\u0004\bE\u00106¨\u0006H"}, d2 = {"Lcom/yalla/yalla/common/manager/data/SharedMainMessageManager;", "Lo00OO/OooO00o;", "", "isShowDrawUserDot", "isShowUserDot", "isShowDrawerTaskDot", "isShowStoreDot", "isShowPremiumDot", "isShowVipDot", "Landroidx/lifecycle/LiveData;", "", "newFansNum", "Landroidx/lifecycle/LiveData;", "getNewFansNum", "()Landroidx/lifecycle/LiveData;", "setNewFansNum", "(Landroidx/lifecycle/LiveData;)V", "newVisitorNum", "getNewVisitorNum", "setNewVisitorNum", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "haveNewFollowingPost", "Landroidx/lifecycle/MutableLiveData;", "getHaveNewFollowingPost", "()Landroidx/lifecycle/MutableLiveData;", "isSignIn", "haveRewardTask", "getHaveRewardTask", "haveAchievementRewardTask", "getHaveAchievementRewardTask", "haveNewVersion", "getHaveNewVersion", "uniqueMessageDot", "getUniqueMessageDot", "userVehicleMessageDot", "getUserVehicleMessageDot", "storeBubbleDot", "getStoreBubbleDot", "premiumMomentEditRedDot", "getPremiumMomentEditRedDot", "vipRedDot_CustomRoomTheme", "getVipRedDot_CustomRoomTheme", "vipRedDot_ExclusiveBubble", "getVipRedDot_ExclusiveBubble", "vipRedDot_IncognitoAccess", "getVipRedDot_IncognitoAccess", "Landroidx/lifecycle/MediatorLiveData;", "userDot", "Landroidx/lifecycle/MediatorLiveData;", "getUserDot", "()Landroidx/lifecycle/MediatorLiveData;", "setUserDot", "(Landroidx/lifecycle/MediatorLiveData;)V", "drawUserDot", "getDrawUserDot", "setDrawUserDot", "drawerTaskDot", "getDrawerTaskDot", "setDrawerTaskDot", "storeDot", "getStoreDot", "setStoreDot", "premiumDot", "getPremiumDot", "setPremiumDot", "vipDot", "getVipDot", "setVipDot", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class SharedMainMessageManager extends o00OO.OooO00o {
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

    @Nullable
    private static MediatorLiveData<Boolean> vipDot;

    @NotNull
    private static final MutableLiveData<Boolean> vipRedDot_CustomRoomTheme;

    @NotNull
    private static final MutableLiveData<Boolean> vipRedDot_ExclusiveBubble;

    @NotNull
    private static final MutableLiveData<Boolean> vipRedDot_IncognitoAccess;

    static {
        p498o0o00Oo0.OooOOO.f41216OooO00o.OooOooO().observeForever(new Observer() { // from class: com.yalla.yalla.common.manager.data.o0Oo0oo
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SharedMainMessageManager.m282_init_$lambda0((Boolean) obj);
            }
        });
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
        $stable = 8;
    }

    private SharedMainMessageManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_drawUserDot_$lambda-14$lambda-12, reason: not valid java name */
    public static final void m260_get_drawUserDot_$lambda14$lambda12(Integer num) {
        INSTANCE.isShowDrawUserDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_drawUserDot_$lambda-14$lambda-13, reason: not valid java name */
    public static final void m261_get_drawUserDot_$lambda14$lambda13(Integer num) {
        INSTANCE.isShowDrawUserDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_drawerTaskDot_$lambda-18$lambda-15, reason: not valid java name */
    public static final void m262_get_drawerTaskDot_$lambda18$lambda15(Boolean bool) {
        INSTANCE.isShowDrawerTaskDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_drawerTaskDot_$lambda-18$lambda-16, reason: not valid java name */
    public static final void m263_get_drawerTaskDot_$lambda18$lambda16(Boolean bool) {
        INSTANCE.isShowDrawerTaskDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_drawerTaskDot_$lambda-18$lambda-17, reason: not valid java name */
    public static final void m264_get_drawerTaskDot_$lambda18$lambda17(Boolean bool) {
        INSTANCE.isShowDrawerTaskDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_premiumDot_$lambda-24$lambda-23, reason: not valid java name */
    public static final void m265_get_premiumDot_$lambda24$lambda23(Boolean bool) {
        INSTANCE.isShowPremiumDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_storeDot_$lambda-22$lambda-19, reason: not valid java name */
    public static final void m266_get_storeDot_$lambda22$lambda19(Boolean bool) {
        INSTANCE.isShowStoreDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_storeDot_$lambda-22$lambda-20, reason: not valid java name */
    public static final void m267_get_storeDot_$lambda22$lambda20(Boolean bool) {
        INSTANCE.isShowStoreDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_storeDot_$lambda-22$lambda-21, reason: not valid java name */
    public static final void m268_get_storeDot_$lambda22$lambda21(Boolean bool) {
        INSTANCE.isShowStoreDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_userDot_$lambda-11$lambda-1, reason: not valid java name */
    public static final void m269_get_userDot_$lambda11$lambda1(Boolean bool) {
        INSTANCE.isShowUserDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_userDot_$lambda-11$lambda-10, reason: not valid java name */
    public static final void m270_get_userDot_$lambda11$lambda10(Boolean bool) {
        INSTANCE.isShowUserDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_userDot_$lambda-11$lambda-2, reason: not valid java name */
    public static final void m271_get_userDot_$lambda11$lambda2(Boolean bool) {
        INSTANCE.isShowUserDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_userDot_$lambda-11$lambda-3, reason: not valid java name */
    public static final void m272_get_userDot_$lambda11$lambda3(Boolean bool) {
        INSTANCE.isShowUserDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_userDot_$lambda-11$lambda-4, reason: not valid java name */
    public static final void m273_get_userDot_$lambda11$lambda4(Boolean bool) {
        INSTANCE.isShowUserDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_userDot_$lambda-11$lambda-5, reason: not valid java name */
    public static final void m274_get_userDot_$lambda11$lambda5(Boolean bool) {
        INSTANCE.isShowUserDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_userDot_$lambda-11$lambda-6, reason: not valid java name */
    public static final void m275_get_userDot_$lambda11$lambda6(Boolean bool) {
        INSTANCE.isShowUserDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_userDot_$lambda-11$lambda-7, reason: not valid java name */
    public static final void m276_get_userDot_$lambda11$lambda7(Boolean bool) {
        INSTANCE.isShowUserDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_userDot_$lambda-11$lambda-8, reason: not valid java name */
    public static final void m277_get_userDot_$lambda11$lambda8(Boolean bool) {
        INSTANCE.isShowUserDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_userDot_$lambda-11$lambda-9, reason: not valid java name */
    public static final void m278_get_userDot_$lambda11$lambda9(Boolean bool) {
        INSTANCE.isShowUserDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_vipDot_$lambda-28$lambda-25, reason: not valid java name */
    public static final void m279_get_vipDot_$lambda28$lambda25(Boolean bool) {
        INSTANCE.isShowVipDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_vipDot_$lambda-28$lambda-26, reason: not valid java name */
    public static final void m280_get_vipDot_$lambda28$lambda26(Boolean bool) {
        INSTANCE.isShowVipDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _get_vipDot_$lambda-28$lambda-27, reason: not valid java name */
    public static final void m281_get_vipDot_$lambda28$lambda27(Boolean bool) {
        INSTANCE.isShowVipDot();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m282_init_$lambda0(Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        userDot = null;
        drawerTaskDot = null;
        MutableLiveData<Boolean> mutableLiveData = haveAchievementRewardTask;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(Boolean.FALSE);
        }
    }

    private final void isShowDrawUserDot() {
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

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
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

    private final void isShowPremiumDot() {
        MediatorLiveData<Boolean> premiumDot2 = getPremiumDot();
        if (premiumDot2 != null) {
            Boolean value = premiumMomentEditRedDot.getValue();
            Intrinsics.checkNotNull(value);
            premiumDot2.postValue(value);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
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

    /* JADX WARN: Code duplicated, block: B:29:0x00c6  */
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
                                        Boolean value9 = vipRedDot_CustomRoomTheme.getValue();
                                        Intrinsics.checkNotNull(value9);
                                        if (value9.booleanValue()) {
                                            z = true;
                                        } else {
                                            Boolean value10 = vipRedDot_ExclusiveBubble.getValue();
                                            Intrinsics.checkNotNull(value10);
                                            if (value10.booleanValue()) {
                                                z = true;
                                            } else {
                                                Boolean value11 = vipRedDot_IncognitoAccess.getValue();
                                                Intrinsics.checkNotNull(value11);
                                                if (value11.booleanValue()) {
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
                    }
                }
            }
        } else {
            z = true;
        }
        userDot2.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    private final void isShowVipDot() {
        boolean z;
        MediatorLiveData<Boolean> vipDot2 = getVipDot();
        if (vipDot2 != null) {
            Boolean value = vipRedDot_CustomRoomTheme.getValue();
            Intrinsics.checkNotNull(value);
            if (value.booleanValue()) {
                z = true;
            } else {
                Boolean value2 = vipRedDot_ExclusiveBubble.getValue();
                Intrinsics.checkNotNull(value2);
                if (value2.booleanValue()) {
                    z = true;
                } else {
                    Boolean value3 = vipRedDot_IncognitoAccess.getValue();
                    Intrinsics.checkNotNull(value3);
                    if (value3.booleanValue()) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            vipDot2.postValue(Boolean.valueOf(z));
        }
    }

    @Nullable
    public final MediatorLiveData<Boolean> getDrawUserDot() {
        if (drawUserDot == null) {
            MediatorLiveData<Boolean> mediatorLiveData = new MediatorLiveData<>();
            SharedMainMessageManager sharedMainMessageManager = INSTANCE;
            LiveData newFansNum2 = sharedMainMessageManager.getNewFansNum();
            Intrinsics.checkNotNull(newFansNum2);
            mediatorLiveData.addSource(newFansNum2, new Observer() { // from class: com.yalla.yalla.common.manager.data.OooOo
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMainMessageManager.m260_get_drawUserDot_$lambda14$lambda12((Integer) obj);
                }
            });
            LiveData newVisitorNum2 = sharedMainMessageManager.getNewVisitorNum();
            Intrinsics.checkNotNull(newVisitorNum2);
            mediatorLiveData.addSource(newVisitorNum2, new Observer() { // from class: com.yalla.yalla.common.manager.data.OooOo00
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMainMessageManager.m261_get_drawUserDot_$lambda14$lambda13((Integer) obj);
                }
            });
            drawUserDot = mediatorLiveData;
        }
        return drawUserDot;
    }

    @Nullable
    public final MediatorLiveData<Boolean> getDrawerTaskDot() {
        if (drawerTaskDot == null) {
            MediatorLiveData<Boolean> mediatorLiveData = new MediatorLiveData<>();
            mediatorLiveData.addSource(isSignIn, new Observer() { // from class: com.yalla.yalla.common.manager.data.oo000o
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMainMessageManager.m262_get_drawerTaskDot_$lambda18$lambda15((Boolean) obj);
                }
            });
            mediatorLiveData.addSource(haveRewardTask, new Observer() { // from class: com.yalla.yalla.common.manager.data.OooOOO0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMainMessageManager.m263_get_drawerTaskDot_$lambda18$lambda16((Boolean) obj);
                }
            });
            mediatorLiveData.addSource(haveAchievementRewardTask, new Observer() { // from class: com.yalla.yalla.common.manager.data.o00Oo0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMainMessageManager.m264_get_drawerTaskDot_$lambda18$lambda17((Boolean) obj);
                }
            });
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
            newFansNum = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(p491o0o00O00.OooO0OO.OooO00o().Oooo00O().OooO0o0(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o)).longValue()), 300L), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
        }
        return newFansNum;
    }

    @Nullable
    public final LiveData<Integer> getNewVisitorNum() {
        if (newVisitorNum == null) {
            newVisitorNum = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(p491o0o00O00.OooO0OO.OooO00o().Oooo00O().OooO(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o)).longValue()), 300L), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
        }
        return newVisitorNum;
    }

    @Nullable
    public final MediatorLiveData<Boolean> getPremiumDot() {
        if (premiumDot == null) {
            MediatorLiveData<Boolean> mediatorLiveData = new MediatorLiveData<>();
            mediatorLiveData.addSource(premiumMomentEditRedDot, new Observer() { // from class: com.yalla.yalla.common.manager.data.OooOO0
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMainMessageManager.m265_get_premiumDot_$lambda24$lambda23((Boolean) obj);
                }
            });
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
            mediatorLiveData.addSource(uniqueMessageDot, o000OO00.f32459OooO0OO);
            mediatorLiveData.addSource(userVehicleMessageDot, Oooo000.f20625OooO0O0);
            mediatorLiveData.addSource(storeBubbleDot, new Observer() { // from class: com.yalla.yalla.common.manager.data.OooOO0O
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMainMessageManager.m268_get_storeDot_$lambda22$lambda21((Boolean) obj);
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
    public final MediatorLiveData<Boolean> getUserDot() {
        if (userDot == null) {
            MediatorLiveData<Boolean> mediatorLiveData = new MediatorLiveData<>();
            mediatorLiveData.addSource(isSignIn, new Observer() { // from class: com.yalla.yalla.common.manager.data.o00Ooo
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMainMessageManager.m269_get_userDot_$lambda11$lambda1((Boolean) obj);
                }
            });
            mediatorLiveData.addSource(haveRewardTask, new Observer() { // from class: com.yalla.yalla.common.manager.data.OooOOO
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMainMessageManager.m271_get_userDot_$lambda11$lambda2((Boolean) obj);
                }
            });
            mediatorLiveData.addSource(haveAchievementRewardTask, o0OoOo0.f20639OooO0O0);
            mediatorLiveData.addSource(uniqueMessageDot, new Observer() { // from class: com.yalla.yalla.common.manager.data.o00oO0o
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMainMessageManager.m273_get_userDot_$lambda11$lambda4((Boolean) obj);
                }
            });
            mediatorLiveData.addSource(userVehicleMessageDot, new Observer() { // from class: com.yalla.yalla.common.manager.data.o0OOO0o
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMainMessageManager.m274_get_userDot_$lambda11$lambda5((Boolean) obj);
                }
            });
            mediatorLiveData.addSource(storeBubbleDot, new Observer() { // from class: com.yalla.yalla.common.manager.data.OooO0o
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMainMessageManager.m275_get_userDot_$lambda11$lambda6((Boolean) obj);
                }
            });
            mediatorLiveData.addSource(premiumMomentEditRedDot, Oooo0.f20622OooO0O0);
            mediatorLiveData.addSource(vipRedDot_CustomRoomTheme, new Observer() { // from class: com.yalla.yalla.common.manager.data.o0ooOOo
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMainMessageManager.m277_get_userDot_$lambda11$lambda8((Boolean) obj);
                }
            });
            mediatorLiveData.addSource(vipRedDot_ExclusiveBubble, o00O0O.f20629OooO0O0);
            mediatorLiveData.addSource(vipRedDot_IncognitoAccess, new Observer() { // from class: com.yalla.yalla.common.manager.data.o000oOoO
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMainMessageManager.m270_get_userDot_$lambda11$lambda10((Boolean) obj);
                }
            });
            userDot = mediatorLiveData;
        }
        return userDot;
    }

    @NotNull
    public final MutableLiveData<Boolean> getUserVehicleMessageDot() {
        return userVehicleMessageDot;
    }

    @Nullable
    public final MediatorLiveData<Boolean> getVipDot() {
        if (vipDot == null) {
            MediatorLiveData<Boolean> mediatorLiveData = new MediatorLiveData<>();
            mediatorLiveData.addSource(vipRedDot_CustomRoomTheme, new Observer() { // from class: com.yalla.yalla.common.manager.data.OooO
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMainMessageManager.m279_get_vipDot_$lambda28$lambda25((Boolean) obj);
                }
            });
            mediatorLiveData.addSource(vipRedDot_ExclusiveBubble, new Observer() { // from class: com.yalla.yalla.common.manager.data.OooOOOO
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMainMessageManager.m280_get_vipDot_$lambda28$lambda26((Boolean) obj);
                }
            });
            mediatorLiveData.addSource(vipRedDot_IncognitoAccess, new Observer() { // from class: com.yalla.yalla.common.manager.data.o0OO00O
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    SharedMainMessageManager.m281_get_vipDot_$lambda28$lambda27((Boolean) obj);
                }
            });
            vipDot = mediatorLiveData;
        }
        return vipDot;
    }

    @NotNull
    public final MutableLiveData<Boolean> getVipRedDot_CustomRoomTheme() {
        return vipRedDot_CustomRoomTheme;
    }

    @NotNull
    public final MutableLiveData<Boolean> getVipRedDot_ExclusiveBubble() {
        return vipRedDot_ExclusiveBubble;
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

    public final void setVipDot(@Nullable MediatorLiveData<Boolean> mediatorLiveData) {
        vipDot = mediatorLiveData;
    }
}
