package com.yalla.yalla.repository;

import android.content.SharedPreferences;
import androidx.compose.material3.t7;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.common.support.crypto.AESKt;
import com.common.support.crypto.Base64ExtensionsKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.mixedroom.roomdata.oO00o0;
import com.yalla.yalla.mixedroom.roomdata.oO00o00;
import com.yalla.yalla.mixedroom.roomdata.oO00o00O;
import com.yalla.yalla.mixedroom.roomdata.oO0OO00o;
import com.yalla.yalla.mixedroom.roomdata.oO0OOO00;
import com.yalla.yalla.mixedroom.roomdata.oOo0000O;
import com.yalla.yalla.mixedroom.roomdata.oOo000Oo;
import com.yalla.yalla.mixedroom.roomdata.oOo00o0o;
import com.yalla.yalla.model.LoginToken;
import com.yalla.yalla.model.UserBadgeItem;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.model.user.FirstRecharge;
import com.yalla.yalla.model.user.MyUserInfoModel;
import com.yalla.yalla.model.user.NicknameStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p469o0OooooO.oOO0OO;
import p469o0OooooO.oOO0OOO;

/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n+ 4 JsonUtil.kt\ncom/code/android/json/JsonUtilKt\n*L\n1#1,697:1\n85#2:698\n117#2,2:699\n7#3,8:701\n7#3,8:709\n7#3,8:717\n7#3,8:725\n7#3,8:734\n7#3,8:742\n7#3,8:750\n7#3,8:758\n7#3,8:766\n7#3,8:774\n7#3,8:782\n7#3,8:790\n7#3,8:798\n7#3,8:806\n7#3,8:814\n7#3,8:822\n7#3,8:830\n7#3,8:838\n7#3,8:846\n7#3,8:854\n7#3,8:862\n7#3,8:870\n7#3,8:878\n7#3,8:886\n7#3,8:894\n7#3,8:902\n7#3,8:910\n7#3,8:918\n7#3,8:926\n7#3,8:934\n7#3,8:942\n7#3,8:950\n7#3,8:958\n7#3,8:966\n7#3,8:974\n7#3,8:982\n7#3,8:990\n7#3,8:998\n7#3,8:1006\n7#3,8:1014\n7#3,8:1022\n7#3,8:1030\n7#3,8:1038\n37#4:733\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n456#1:698\n456#1:699,2\n138#1:701,8\n144#1:709,8\n150#1:717,8\n156#1:725,8\n162#1:734,8\n172#1:742,8\n185#1:750,8\n190#1:758,8\n196#1:766,8\n202#1:774,8\n220#1:782,8\n226#1:790,8\n232#1:798,8\n238#1:806,8\n244#1:814,8\n250#1:822,8\n256#1:830,8\n262#1:838,8\n267#1:846,8\n272#1:854,8\n277#1:862,8\n282#1:870,8\n287#1:878,8\n292#1:886,8\n297#1:894,8\n302#1:902,8\n307#1:910,8\n312#1:918,8\n319#1:926,8\n337#1:934,8\n345#1:942,8\n363#1:950,8\n370#1:958,8\n381#1:966,8\n388#1:974,8\n395#1:982,8\n406#1:990,8\n413#1:998,8\n420#1:1006,8\n427#1:1014,8\n434#1:1022,8\n441#1:1030,8\n448#1:1038,8\n162#1:733\n*E\n"})
public final class Account {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final Lazy f74683OooO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static boolean f74685OooO0O0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f74688OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static boolean f74689OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final Lazy f74690OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f74691OooO0oo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public static final Lazy f74702OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public static final Lazy f74703OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public static final Lazy f74705OooOo0O;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public static final Lazy f74707OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public static final Lazy f74708OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public static final Lazy f74709OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public static final Lazy f74710OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public static final Lazy f74711OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public static final Lazy f74712OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public static final Lazy f74713OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @NotNull
    public static final Lazy f74716Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @NotNull
    public static final Lazy f74717Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f74718Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f74719Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f74720Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f74721Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @NotNull
    public static final Lazy f74722Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public static final Lazy f74723Oooo0oO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public static final Lazy f74726OoooO0;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public static final Lazy f74728OoooO0O;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public static final Lazy f74732OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public static final Lazy f74733OoooOoO;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public static final MutableState f74736Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public static final MutableStateFlow<Boolean> f74737OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public static final MutableStateFlow<FirstRecharge> f74738OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public static final MutableStateFlow<Boolean> f74739OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public static final o00O000o f74740Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static boolean f74741Oooooo0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Account f74684OooO00o = new Account();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f74686OooO0OO = LazyKt.lazy(new androidx.compose.foundation.gestures.o000O00(6));

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f74687OooO0Oo = LazyKt.lazy(new com.code.android.window.dialog.OooO00o(3));

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public static final Lazy f74692OooOO0 = LazyKt.lazy(new com.yalla.yalla.mixedroom.service.error.OooO0o(3));

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public static final Lazy f74693OooOO0O = LazyKt.lazy(new com.yalla.yalla.mixedroom.service.error.OooO(1));

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f74694OooOO0o = LazyKt.lazy(new com.yalla.yalla.mixedroom.service.error.OooOO0(3));

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public static final Lazy f74696OooOOO0 = LazyKt.lazy(new com.yalla.yalla.developer.screen.OooOO0O(4));

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public static final Lazy f74695OooOOO = LazyKt.lazy(new com.yalla.yalla.developer.crash.OooOOO0(3));

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public static final Lazy f74697OooOOOO = LazyKt.lazy(new com.yalla.yalla.repository.OooO00o(0));

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public static final Lazy f74698OooOOOo = LazyKt.lazy(new androidx.compose.material3.pulltorefresh.Oooo000(1));

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public static final Lazy f74700OooOOo0 = LazyKt.lazy(new com.yalla.yalla.developer.screen.OooOO0(4));

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public static final Lazy f74699OooOOo = LazyKt.lazy(new com.yalla.yalla.module.room.room.live.side.OooOOO0(1));

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public static final Lazy f74701OooOOoo = LazyKt.lazy(new com.code.android.yldialog.OooOOO0(2));

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public static final Lazy f74704OooOo00 = LazyKt.lazy(new androidx.compose.runtime.OooOo(3));

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f74706OooOo0o = LazyKt.lazy(new com.yalla.yalla.module.media.preview.o0OO00O(1));

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @NotNull
    public static final Lazy f74715Oooo0 = LazyKt.lazy(new com.yalla.yalla.module.user.activity.Oooo000(2));

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f74724Oooo0oo = LazyKt.lazy(new com.yalla.yalla.repository.OooO0O0(0));

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public static final Lazy f74714Oooo = LazyKt.lazy(new com.code.android.window.dialog.o000OOo(1));

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public static final Lazy f74727OoooO00 = LazyKt.lazy(new com.code.android.window.dialog.o00000O0(3));

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public static final Lazy f74725OoooO = LazyKt.lazy(new com.code.android.window.popup.OooO0OO(4));

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public static final Lazy f74729OoooOO0 = LazyKt.lazy(new com.yalla.yalla.developer.host_test.OooOo00(3));

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public static final Lazy f74742o000oOoO = LazyKt.lazy(new com.yalla.yalla.repository.OooO0OO(0));

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public static final Lazy f74730OoooOOO = LazyKt.lazy(new com.yalla.yalla.module.moment.screen.o000O0o(2));

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public static final Lazy f74731OoooOOo = LazyKt.lazy(new com.yalla.yalla.module.room.room.live.bottom.OooOOO0(1));

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public static final Lazy f74734OoooOoo = LazyKt.lazy(new com.yalla.yalla.mixedroom.service.error.OooO00o(1));

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public static final Lazy f74735Ooooo00 = LazyKt.lazy(new com.code.android.window.popup.o0OoOo0(2));

    public static final class OooO implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final OooO f74743OooO0oO = new OooO();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            p472o0o0000o.OooOO0O.OooO00o().OooOOO(l.longValue(), "coin");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o implements Function1<Pair<? extends Boolean, ? extends Integer>, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final OooO00o f74744OooO0oO = new OooO00o();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Pair<? extends Boolean, ? extends Integer> pair) {
            Pair<? extends Boolean, ? extends Integer> pair2 = pair;
            p472o0o0000o.OooOO0O.OooO00o().OooOO0o("coinIsFrozen", pair2.getFirst().booleanValue());
            p472o0o0000o.OooOO0O.OooO00o().OooOOO0(pair2.getSecond().intValue(), "debtAmount");
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n346#2,5:13\n*E\n"})
    public static final class OooO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74745OooO0oO;

        public OooO0O0(MutableLiveData mutableLiveData) {
            this.f74745OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74745OooO0oO.observeForever(new AccountKt.OooO00o(OooO00o.f74744OooO0oO));
        }
    }

    public static final class OooO0OO implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final OooO0OO f74746OooO0oO = new OooO0OO();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String value = str;
            p471o0o000.OooO0o oooO0oOooO00o = p472o0o0000o.OooOO0O.OooO00o();
            oooO0oOooO00o.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            oooO0oOooO00o.OooOOOO("sign", value);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n283#2,2:13\n*E\n"})
    public static final class OooO0o implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74747OooO0oO;

        public OooO0o(MutableLiveData mutableLiveData) {
            this.f74747OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74747OooO0oO.observeForever(new AccountKt.OooO00o(OooO0OO.f74746OooO0oO));
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n203#2,2:13\n*E\n"})
    public static final class OooOO0 implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74748OooO0oO;

        public OooOO0(MutableLiveData mutableLiveData) {
            this.f74748OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74748OooO0oO.observeForever(new AccountKt.OooO00o(OooO.f74743OooO0oO));
        }
    }

    public static final class OooOO0O implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final OooOO0O f74749OooO0oO = new OooOO0O();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            p472o0o0000o.OooOO0O.OooO00o().OooOOO0(num.intValue(), "countryId");
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final OooOOO f74750OooO0oO = new OooOOO();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String value = str;
            p471o0o000.OooO0o oooO0oOooO00o = p472o0o0000o.OooOO0O.OooO00o();
            oooO0oOooO00o.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            oooO0oOooO00o.OooOOOO("cover", value);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n227#2,2:13\n*E\n"})
    public static final class OooOOO0 implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74751OooO0oO;

        public OooOOO0(MutableLiveData mutableLiveData) {
            this.f74751OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74751OooO0oO.observeForever(new AccountKt.OooO00o(OooOO0O.f74749OooO0oO));
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n268#2,2:13\n*E\n"})
    public static final class OooOOOO implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74752OooO0oO;

        public OooOOOO(MutableLiveData mutableLiveData) {
            this.f74752OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74752OooO0oO.observeForever(new AccountKt.OooO00o(OooOOO.f74750OooO0oO));
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n221#2,2:13\n*E\n"})
    public static final class OooOo implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74753OooO0oO;

        public OooOo(MutableLiveData mutableLiveData) {
            this.f74753OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74753OooO0oO.observeForever(new AccountKt.OooO00o(OooOo00.f74754OooO0oO));
        }
    }

    public static final class OooOo00 implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final OooOo00 f74754OooO0oO = new OooOo00();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            p472o0o0000o.OooOO0O.OooO00o().OooOOO(l.longValue(), "crystal");
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n449#2,2:13\n*E\n"})
    public static final class Oooo0 implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74755OooO0oO;

        public Oooo0(MutableLiveData mutableLiveData) {
            this.f74755OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74755OooO0oO.observeForever(new AccountKt.OooO00o(Oooo000.f74756OooO0oO));
        }
    }

    public static final class Oooo000 implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final Oooo000 f74756OooO0oO = new Oooo000();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String value = str;
            p471o0o000.OooO0o oooO0oOooO00o = p472o0o0000o.OooOO0O.OooO00o();
            oooO0oOooO00o.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            oooO0oOooO00o.OooOOOO("currBadgeRoundedImg", value);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n173#2,5:13\n*E\n"})
    public static final class o00 implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74763OooO0oO;

        public o00(MutableLiveData mutableLiveData) {
            this.f74763OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74763OooO0oO.observeForever(new AccountKt.OooO00o(o000OOo0.f74790OooO0oO));
        }
    }

    public static final class o000 implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o000 f74764OooO0oO = new o000();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            p472o0o0000o.OooOO0O.OooO00o().OooOO0o("isWealthFullLevel", bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n239#2,2:13\n*E\n"})
    public static final class o0000 implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74765OooO0oO;

        public o0000(MutableLiveData mutableLiveData) {
            this.f74765OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74765OooO0oO.observeForever(new AccountKt.OooO00o(o0000Ooo.f74776OooO0oO));
        }
    }

    public static final class o00000 implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o00000 f74766OooO0oO = new o00000();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String value = str;
            p471o0o000.OooO0o oooO0oOooO00o = p472o0o0000o.OooOO0O.OooO00o();
            oooO0oOooO00o.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            oooO0oOooO00o.OooOOOO("headerFrameUrl", value);
            return Unit.INSTANCE;
        }
    }

    public static final class o000000 implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o000000 f74767OooO0oO = new o000000();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            p472o0o0000o.OooOO0O.OooO00o().OooOOO0(num.intValue(), "followingNum");
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n191#2,2:13\n*E\n"})
    public static final class o000000O implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74768OooO0oO;

        public o000000O(MutableLiveData mutableLiveData) {
            this.f74768OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74768OooO0oO.observeForever(new AccountKt.OooO00o(o000000.f74767OooO0oO));
        }
    }

    public static final class o00000O implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o00000O f74769OooO0oO = new o00000O();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String value = str;
            p471o0o000.OooO0o oooO0oOooO00o = p472o0o0000o.OooOO0O.OooO00o();
            oooO0oOooO00o.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            oooO0oOooO00o.OooOOOO("headerUrl", value);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n151#2,2:13\n*E\n"})
    public static final class o00000O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74770OooO0oO;

        public o00000O0(MutableLiveData mutableLiveData) {
            this.f74770OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74770OooO0oO.observeForever(new AccountKt.OooO00o(o00000.f74766OooO0oO));
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n145#2,2:13\n*E\n"})
    public static final class o00000OO implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74771OooO0oO;

        public o00000OO(MutableLiveData mutableLiveData) {
            this.f74771OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74771OooO0oO.observeForever(new AccountKt.OooO00o(o00000O.f74769OooO0oO));
        }
    }

    public static final class o0000O implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o0000O f74772OooO0oO = new o0000O();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            p472o0o0000o.OooOO0O.OooO00o().OooOO0o("isShowWealthLevel", bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class o0000O0 extends MutableLiveData<Boolean> {
        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public final void setValue(Object obj) {
            Boolean bool = (Boolean) obj;
            super.setValue(bool);
            p472o0o0000o.OooOO0O.OooO00o().OooOO0o("isLogin", bool != null ? bool.booleanValue() : false);
            oOO0OO.OooO00o().f93850OooO0o.OooO0OO(Boolean.valueOf(bool != null ? bool.booleanValue() : false));
        }
    }

    public static final class o0000O00 implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o0000O00 f74773OooO0oO = new o0000O00();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            p472o0o0000o.OooOO0O.OooO00o().OooOO0o("isBlackUser", bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class o0000O0O implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o0000O0O f74774OooO0oO = new o0000O0O();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            p472o0o0000o.OooOO0O.OooO00o().OooOO0o("isNewUser", bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n421#2,2:13\n*E\n"})
    public static final class o0000OO0 implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74775OooO0oO;

        public o0000OO0(MutableLiveData mutableLiveData) {
            this.f74775OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74775OooO0oO.observeForever(new AccountKt.OooO00o(o0000O.f74772OooO0oO));
        }
    }

    public static final class o0000Ooo implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o0000Ooo f74776OooO0oO = new o0000Ooo();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            p472o0o0000o.OooOO0O.OooO00o().OooOOO0(num.intValue(), "isPrettyId");
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n364#2,2:13\n*E\n"})
    public static final class o0000oo implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74777OooO0oO;

        public o0000oo(MutableLiveData mutableLiveData) {
            this.f74777OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74777OooO0oO.observeForever(new AccountKt.OooO00o(o0000O00.f74773OooO0oO));
        }
    }

    public static final class o000O implements Function1<NicknameStyle, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o000O f74778OooO0oO = new o000O();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(NicknameStyle nicknameStyle) {
            NicknameStyle nicknameStyle2 = nicknameStyle;
            p471o0o000.OooO0o oooO0oOooO00o = p472o0o0000o.OooOO0O.OooO00o();
            String value = nicknameStyle2 != null ? p247o00oo0oO.o000OO0O.OooO00o(nicknameStyle2) : "";
            oooO0oOooO00o.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            oooO0oOooO00o.OooOOOO("nicknameStyle", value);
            return Unit.INSTANCE;
        }
    }

    public static final class o000O0 implements Function1<List<? extends UserBadgeItem>, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o000O0 f74779OooO0oO = new o000O0();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends UserBadgeItem> list) {
            String strOooO00o;
            List<? extends UserBadgeItem> list2 = list;
            p471o0o000.OooO0o oooO0oOooO00o = p472o0o0000o.OooOO0O.OooO00o();
            if (list2 != null) {
                oooO0oOooO00o.getClass();
                strOooO00o = p247o00oo0oO.o000OO0O.OooO00o(list2);
            } else {
                strOooO00o = "";
            }
            oooO0oOooO00o.OooOOOO("medalIcons", strOooO00o);
            return Unit.INSTANCE;
        }
    }

    public static final class o000O00 implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o000O00 f74780OooO0oO = new o000O00();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            p472o0o0000o.OooOO0O.OooO00o().OooOOO0(num.intValue(), "isPrettyId");
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n428#2,2:13\n*E\n"})
    public static final class o000O000 implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74781OooO0oO;

        public o000O000(MutableLiveData mutableLiveData) {
            this.f74781OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74781OooO0oO.observeForever(new AccountKt.OooO00o(o000.f74764OooO0oO));
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n245#2,2:13\n*E\n"})
    public static final class o000O00O implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74782OooO0oO;

        public o000O00O(MutableLiveData mutableLiveData) {
            this.f74782OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74782OooO0oO.observeForever(new AccountKt.OooO00o(o000O00.f74780OooO0oO));
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n407#2,2:13\n*E\n"})
    public static final class o000O0O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74783OooO0oO;

        public o000O0O0(MutableLiveData mutableLiveData) {
            this.f74783OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74783OooO0oO.observeForever(new AccountKt.OooO00o(o000OO0O.f74788OooO0oO));
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n251#2,2:13\n*E\n"})
    public static final class o000O0Oo implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74784OooO0oO;

        public o000O0Oo(MutableLiveData mutableLiveData) {
            this.f74784OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74784OooO0oO.observeForever(new AccountKt.OooO00o(o000O0.f74779OooO0oO));
        }
    }

    public static final class o000O0o implements Function1<Pair<? extends Integer, ? extends Integer>, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o000O0o f74785OooO0oO = new o000O0o();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Pair<? extends Integer, ? extends Integer> pair) {
            Pair<? extends Integer, ? extends Integer> pair2 = pair;
            p472o0o0000o.OooOO0O.OooO00o().OooOOO0(pair2.getFirst().intValue(), "kaVipState");
            p472o0o0000o.OooOO0O.OooO00o().OooOOO0(pair2.getSecond().intValue(), "kaVipLevel");
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n233#2,2:13\n*E\n"})
    public static final class o000OO implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74786OooO0oO;

        public o000OO(MutableLiveData mutableLiveData) {
            this.f74786OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74786OooO0oO.observeForever(new AccountKt.OooO00o(o0000O0O.f74774OooO0oO));
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n163#2,2:13\n*E\n"})
    public static final class o000OO00 implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74787OooO0oO;

        public o000OO00(MutableLiveData mutableLiveData) {
            this.f74787OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74787OooO0oO.observeForever(new AccountKt.OooO00o(o000O.f74778OooO0oO));
        }
    }

    public static final class o000OO0O implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o000OO0O f74788OooO0oO = new o000OO0O();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            p472o0o0000o.OooOO0O.OooO00o().OooOOO(l.longValue(), "nextWealthLevelExperience");
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n197#2,2:13\n*E\n"})
    public static final class o000OOo implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74789OooO0oO;

        public o000OOo(MutableLiveData mutableLiveData) {
            this.f74789OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74789OooO0oO.observeForever(new AccountKt.OooO00o(o0O0O00.f74820OooO0oO));
        }
    }

    public static final class o000OOo0 implements Function1<Pair<? extends Boolean, ? extends Integer>, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o000OOo0 f74790OooO0oO = new o000OOo0();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Pair<? extends Boolean, ? extends Integer> pair) {
            Pair<? extends Boolean, ? extends Integer> pair2 = pair;
            p472o0o0000o.OooOO0O.OooO00o().OooOO0o("vip", pair2.getFirst().booleanValue());
            p472o0o0000o.OooOO0O.OooO00o().OooOOO0(pair2.getSecond().intValue(), "vipLevel");
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n338#2,5:13\n*E\n"})
    public static final class o000Oo0 implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74791OooO0oO;

        public o000Oo0(MutableLiveData mutableLiveData) {
            this.f74791OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74791OooO0oO.observeForever(new AccountKt.OooO00o(o000O0o.f74785OooO0oO));
        }
    }

    public static final class o000oOoO implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o000oOoO f74792OooO0oO = new o000oOoO();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String value = str;
            p471o0o000.OooO0o oooO0oOooO00o = p472o0o0000o.OooOO0O.OooO00o();
            oooO0oOooO00o.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            oooO0oOooO00o.OooOOOO("currWealthBadgeImg", value);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o00O f74793OooO0oO = new o00O();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String value = str;
            p471o0o000.OooO0o oooO0oOooO00o = p472o0o0000o.OooOO0O.OooO00o();
            oooO0oOooO00o.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            oooO0oOooO00o.OooOOOO(String.valueOf(-157004578), StringsKt.isBlank(value) ? "" : Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(value, com.yalla.yalla.util.OooO00o.f80880OooO0O0, com.yalla.yalla.util.OooO00o.f80879OooO00o, (String) null, 4, (Object) null)));
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0 implements Function1<List<UserInfo.TagInfo>, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o00O0 f74794OooO0oO = new o00O0();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<UserInfo.TagInfo> list) {
            List<UserInfo.TagInfo> value = list;
            p471o0o000.OooO0o oooO0oOooO00o = p472o0o0000o.OooOO0O.OooO00o();
            oooO0oOooO00o.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(ViewHierarchyConstants.TAG_KEY, "key");
            SharedPreferences.Editor editorPutString = oooO0oOooO00o.f97389OooO00o.edit().putString(ViewHierarchyConstants.TAG_KEY, com.yalla.yalla.util.o000000O.OooO0OO(value));
            if (editorPutString != null) {
                editorPutString.commit();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00O00 implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o00O00 f74795OooO0oO = new o00O00();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            p472o0o0000o.OooOO0O.OooO00o().OooOO0o("roomPushNotification", bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n257#2,2:13\n*E\n"})
    public static final class o00O000 implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74796OooO0oO;

        public o00O000(MutableLiveData mutableLiveData) {
            this.f74796OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74796OooO0oO.observeForever(new AccountKt.OooO00o(o00oOoo.f74819OooO0oO));
        }
    }

    public static final class o00O0000 implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o00O0000 f74797OooO0oO = new o00O0000();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            p472o0o0000o.OooOO0O.OooO00o().OooOOO0(num.intValue(), "region");
            return Unit.INSTANCE;
        }
    }

    public static final class o00O000o extends MutableLiveData<RoomIndexModel> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(LifecycleOwner owner, Observer<? super RoomIndexModel> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            super.observe(owner, observer);
            Account account = Account.f74684OooO00o;
            if (Account.f74741Oooooo0) {
                return;
            }
            Account.Oooo0();
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n320#2,2:13\n*E\n"})
    public static final class o00O00O implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74798OooO0oO;

        public o00O00O(MutableLiveData mutableLiveData) {
            this.f74798OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74798OooO0oO.observeForever(new AccountKt.OooO00o(o00O00.f74795OooO0oO));
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n263#2,2:13\n*E\n"})
    public static final class o00O00OO implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74799OooO0oO;

        public o00O00OO(MutableLiveData mutableLiveData) {
            this.f74799OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74799OooO0oO.observeForever(new AccountKt.OooO00o(oOO00O.f74828OooO0oO));
        }
    }

    public static final class o00O00o0 implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o00O00o0 f74800OooO0oO = new o00O00o0();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String value = str;
            p471o0o000.OooO0o oooO0oOooO00o = p472o0o0000o.OooOO0O.OooO00o();
            oooO0oOooO00o.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            oooO0oOooO00o.OooOOOO("sign", value);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o00O0O f74801OooO0oO = new o00O0O();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            p472o0o0000o.OooOO0O.OooO00o().OooOOO0(num.intValue(), "currWealthBadgeLevel");
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O0 implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o00O0O0 f74802OooO0oO = new o00O0O0();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            p472o0o0000o.OooOO0O.OooO00o().OooOOO(l.longValue(), "thisWealthLevelExperience");
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n273#2,2:13\n*E\n"})
    public static final class o00O0O00 implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74803OooO0oO;

        public o00O0O00(MutableLiveData mutableLiveData) {
            this.f74803OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74803OooO0oO.observeForever(new AccountKt.OooO00o(o00O0.f74794OooO0oO));
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n414#2,2:13\n*E\n"})
    public static final class o00O0O0O implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74804OooO0oO;

        public o00O0O0O(MutableLiveData mutableLiveData) {
            this.f74804OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74804OooO0oO.observeForever(new AccountKt.OooO00o(o00O0O0.f74802OooO0oO));
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n293#2,2:13\n*E\n"})
    public static final class o00O0OO implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74805OooO0oO;

        public o00O0OO(MutableLiveData mutableLiveData) {
            this.f74805OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74805OooO0oO.observeForever(new AccountKt.OooO00o(oo0o0O0.f74832OooO0oO));
        }
    }

    public static final class o00O0OO0 implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o00O0OO0 f74806OooO0oO = new o00O0OO0();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String value = str;
            p471o0o000.OooO0o oooO0oOooO00o = p472o0o0000o.OooOO0O.OooO00o();
            oooO0oOooO00o.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            oooO0oOooO00o.OooOOOO(String.valueOf(110541305), StringsKt.isBlank(value) ? "" : Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(value, com.yalla.yalla.util.OooO00o.f80880OooO0O0, com.yalla.yalla.util.OooO00o.f80879OooO00o, (String) null, 4, (Object) null)));
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0OOO implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o00O0OOO f74807OooO0oO = new o00O0OOO();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String value = str;
            p471o0o000.OooO0o oooO0oOooO00o = p472o0o0000o.OooOO0O.OooO00o();
            oooO0oOooO00o.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            oooO0oOooO00o.OooOOOO(String.valueOf(140975345), StringsKt.isBlank(value) ? "" : Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(value, com.yalla.yalla.util.OooO00o.f80880OooO0O0, com.yalla.yalla.util.OooO00o.f80879OooO00o, (String) null, 4, (Object) null)));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n157#2,2:13\n*E\n"})
    public static final class o00OO implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74808OooO0oO;

        public o00OO(MutableLiveData mutableLiveData) {
            this.f74808OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74808OooO0oO.observeForever(new AccountKt.OooO00o(oo0O.f74831OooO0oO));
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n308#2,2:13\n*E\n"})
    public static final class o00OO000 implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74809OooO0oO;

        public o00OO000(MutableLiveData mutableLiveData) {
            this.f74809OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74809OooO0oO.observeForever(new AccountKt.OooO00o(o00O.f74793OooO0oO));
        }
    }

    public static final class o00OO00O implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o00OO00O f74810OooO0oO = new o00OO00O();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String value = str;
            p471o0o000.OooO0o oooO0oOooO00o = p472o0o0000o.OooOO0O.OooO00o();
            oooO0oOooO00o.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            oooO0oOooO00o.OooOOOO(String.valueOf(141429364), StringsKt.isBlank(value) ? "" : Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(value, com.yalla.yalla.util.OooO00o.f80880OooO0O0, com.yalla.yalla.util.OooO00o.f80879OooO00o, (String) null, 4, (Object) null)));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n303#2,2:13\n*E\n"})
    public static final class o00OO0O0 implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74811OooO0oO;

        public o00OO0O0(MutableLiveData mutableLiveData) {
            this.f74811OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74811OooO0oO.observeForever(new AccountKt.OooO00o(o00OO00O.f74810OooO0oO));
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n288#2,2:13\n*E\n"})
    public static final class o00OO0OO implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74812OooO0oO;

        public o00OO0OO(MutableLiveData mutableLiveData) {
            this.f74812OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74812OooO0oO.observeForever(new AccountKt.OooO00o(o00O0OO0.f74806OooO0oO));
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n313#2,2:13\n*E\n"})
    public static final class o00OOO0 implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74813OooO0oO;

        public o00OOO0(MutableLiveData mutableLiveData) {
            this.f74813OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74813OooO0oO.observeForever(new AccountKt.OooO00o(o00OOO00.f74814OooO0oO));
        }
    }

    public static final class o00OOO00 implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o00OOO00 f74814OooO0oO = new o00OOO00();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            p472o0o0000o.OooOO0O.OooO00o().OooOO0o("videoMuted", bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class o00OOO0O implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o00OOO0O f74815OooO0oO = new o00OOO0O();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            p472o0o0000o.OooOO0O.OooO00o().OooOOO0(num.intValue(), "visitorNum");
            return Unit.INSTANCE;
        }
    }

    public static final class o00OOOO0 extends MutableLiveData<Boolean> {
        @Override // androidx.lifecycle.MutableLiveData, androidx.lifecycle.LiveData
        public final void setValue(Object obj) {
            Boolean bool = (Boolean) obj;
            super.setValue(bool);
            p471o0o000.OooOo00 oooOo00OooO0oO = p472o0o0000o.OooOO0O.OooO0oO();
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            oooOo00OooO0oO.getClass();
            Account account = Account.f74684OooO00o;
            oooOo00OooO0oO.OooOO0o("welcome" + Account.OooOo0o().getValue(), zBooleanValue);
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n389#2,2:13\n*E\n"})
    public static final class o00Oo0 implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74816OooO0oO;

        public o00Oo0(MutableLiveData mutableLiveData) {
            this.f74816OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74816OooO0oO.observeForever(new AccountKt.OooO00o(o00O0O.f74801OooO0oO));
        }
    }

    public static final class o00Ooo implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o00Ooo f74817OooO0oO = new o00Ooo();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String value = str;
            p471o0o000.OooO0o oooO0oOooO00o = p472o0o0000o.OooOO0O.OooO00o();
            oooO0oOooO00o.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            oooO0oOooO00o.OooOOOO("currWealthCardImg", value);
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o implements Function1<Long, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o00oO0o f74818OooO0oO = new o00oO0o();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Long l) {
            p472o0o0000o.OooOO0O.OooO00o().OooOOO(l.longValue(), "currWealthExperience");
            return Unit.INSTANCE;
        }
    }

    public static final class o00oOoo implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o00oOoo f74819OooO0oO = new o00oOoo();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            p472o0o0000o.OooOO0O.OooO00o().OooOOO0(num.intValue(), "role");
            return Unit.INSTANCE;
        }
    }

    public static final class o0O0O00 implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o0O0O00 f74820OooO0oO = new o0O0O00();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            p472o0o0000o.OooOO0O.OooO00o().OooOOO0(num.intValue(), "fanNum");
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n139#2,2:13\n*E\n"})
    public static final class o0O0ooO implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74821OooO0oO;

        public o0O0ooO(MutableLiveData mutableLiveData) {
            this.f74821OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74821OooO0oO.observeForever(new AccountKt.OooO00o(o00O0000.f74797OooO0oO));
        }
    }

    public static final class o0OO00O implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o0OO00O f74822OooO0oO = new o0OO00O();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String value = str;
            p471o0o000.OooO0o oooO0oOooO00o = p472o0o0000o.OooOO0O.OooO00o();
            oooO0oOooO00o.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            oooO0oOooO00o.OooOOOO("currWealthTextColor", value);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final o0OOO0o f74823OooO0oO = new o0OOO0o();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            p472o0o0000o.OooOO0O.OooO00o().OooOOO0(num.intValue(), "currWealthLevel");
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n371#2,2:13\n*E\n"})
    public static final class o0Oo0oo implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74824OooO0oO;

        public o0Oo0oo(MutableLiveData mutableLiveData) {
            this.f74824OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74824OooO0oO.observeForever(new AccountKt.OooO00o(o0OOO0o.f74823OooO0oO));
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n396#2,2:13\n*E\n"})
    public static final class o0OoOo0 implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74825OooO0oO;

        public o0OoOo0(MutableLiveData mutableLiveData) {
            this.f74825OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74825OooO0oO.observeForever(new AccountKt.OooO00o(o000oOoO.f74792OooO0oO));
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n186#2,2:13\n*E\n"})
    public static final class o0o0Oo implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74826OooO0oO;

        public o0o0Oo(MutableLiveData mutableLiveData) {
            this.f74826OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74826OooO0oO.observeForever(new AccountKt.OooO00o(o00OOO0O.f74815OooO0oO));
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n382#2,2:13\n*E\n"})
    public static final class o0ooOOo implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74827OooO0oO;

        public o0ooOOo(MutableLiveData mutableLiveData) {
            this.f74827OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74827OooO0oO.observeForever(new AccountKt.OooO00o(o00oO0o.f74818OooO0oO));
        }
    }

    public static final class oOO00O implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final oOO00O f74828OooO0oO = new oOO00O();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            p472o0o0000o.OooOO0O.OooO00o().OooOOO0(num.intValue(), "sex");
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n442#2,2:13\n*E\n"})
    public static final class oo000o implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74829OooO0oO;

        public oo000o(MutableLiveData mutableLiveData) {
            this.f74829OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74829OooO0oO.observeForever(new AccountKt.OooO00o(o00Ooo.f74817OooO0oO));
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n278#2,2:13\n*E\n"})
    public static final class oo00o implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74830OooO0oO;

        public oo00o(MutableLiveData mutableLiveData) {
            this.f74830OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74830OooO0oO.observeForever(new AccountKt.OooO00o(o00O00o0.f74800OooO0oO));
        }
    }

    public static final class oo0O implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final oo0O f74831OooO0oO = new oo0O();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String value = str;
            p471o0o000.OooO0o oooO0oOooO00o = p472o0o0000o.OooOO0O.OooO00o();
            oooO0oOooO00o.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            oooO0oOooO00o.OooOOOO("userName", value);
            return Unit.INSTANCE;
        }
    }

    public static final class oo0o0O0 implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public static final oo0o0O0 f74832OooO0oO = new oo0o0O0();

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String value = str;
            p471o0o000.OooO0o oooO0oOooO00o = p472o0o0000o.OooOO0O.OooO00o();
            oooO0oOooO00o.getClass();
            Intrinsics.checkNotNullParameter(value, "value");
            oooO0oOooO00o.OooOOOO(String.valueOf(1552156712), StringsKt.isBlank(value) ? "" : Base64ExtensionsKt.base64EncodeToString(AESKt.aesEncrypt$default(value, com.yalla.yalla.util.OooO00o.f80880OooO0O0, com.yalla.yalla.util.OooO00o.f80879OooO00o, (String) null, 4, (Object) null)));
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n435#2,2:13\n*E\n"})
    public static final class oo0o0Oo implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74833OooO0oO;

        public oo0o0Oo(MutableLiveData mutableLiveData) {
            this.f74833OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74833OooO0oO.observeForever(new AccountKt.OooO00o(o0OO00O.f74822OooO0oO));
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n1#1,12:1\n298#2,2:13\n*E\n"})
    public static final class oo0oOO0 implements Runnable {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData f74834OooO0oO;

        public oo0oOO0(MutableLiveData mutableLiveData) {
            this.f74834OooO0oO = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f74834OooO0oO.observeForever(new AccountKt.OooO00o(o00O0OOO.f74807OooO0oO));
        }
    }

    static {
        int i = 1;
        f74688OooO0o = LazyKt.lazy(new oOo000Oo(i));
        f74690OooO0oO = LazyKt.lazy(new com.yalla.yalla.module.room.room.live.bottom.OooO0OO(i));
        int i2 = 2;
        f74691OooO0oo = LazyKt.lazy(new com.yalla.yalla.mixedroom.service.error.OooO0O0(i2));
        f74683OooO = LazyKt.lazy(new com.yalla.yalla.mixedroom.service.error.OooO0OO(i2));
        int i3 = 2;
        f74703OooOo0 = LazyKt.lazy(new t7(i3));
        f74705OooOo0O = LazyKt.lazy(new com.yalla.yalla.developer.screen.o00Ooo(i3));
        int i4 = 2;
        f74702OooOo = LazyKt.lazy(new androidx.compose.foundation.gestures.o000O0Oo(i4));
        f74708OooOoO0 = LazyKt.lazy(new androidx.compose.foundation.gestures.o000OO0O(i4));
        int i5 = 1;
        f74707OooOoO = LazyKt.lazy(new oO00o00(i5));
        f74709OooOoOO = LazyKt.lazy(new oO0OOO00(i5));
        f74711OooOoo0 = LazyKt.lazy(new oO00o00O(i5));
        int i6 = 2;
        f74710OooOoo = LazyKt.lazy(new oO00o0(i6));
        f74712OooOooO = LazyKt.lazy(new oOo00o0o(i6));
        f74713OooOooo = LazyKt.lazy(new com.yalla.yalla.developer.crash.OooOO0O(i6));
        f74716Oooo000 = LazyKt.lazy(new com.yalla.yalla.developer.crash.OooOOO(i6));
        int i7 = 1;
        f74717Oooo00O = LazyKt.lazy(new oO0OO00o(i7));
        f74718Oooo00o = LazyKt.lazy(new oOo0000O(i7));
        int i8 = 1;
        f74719Oooo0O0 = LazyKt.lazy(new com.yalla.yalla.module.user.activity.Oooo0(i8));
        f74720Oooo0OO = LazyKt.lazy(new androidx.lifecycle.compose.o00oO0o(i8));
        f74722Oooo0o0 = LazyKt.lazy(new com.code.android.window.dialog.o00Ooo(i8));
        int i9 = 2;
        f74721Oooo0o = LazyKt.lazy(new androidx.lifecycle.viewmodel.compose.OooO00o(i9));
        f74723Oooo0oO = LazyKt.lazy(new com.code.android.window.dialog.o0OO00O(i9));
        int i10 = 2;
        f74726OoooO0 = LazyKt.lazy(new com.code.android.window.popup.OooO00o(i10));
        f74728OoooO0O = LazyKt.lazy(new com.code.android.window.popup.OooO0O0(i10));
        int i11 = 0;
        f74732OoooOo0 = LazyKt.lazy(new com.yalla.yalla.repository.OooO0o(i11));
        f74733OoooOoO = LazyKt.lazy(new com.yalla.yalla.repository.OooO(i11));
        Boolean bool = Boolean.FALSE;
        f74736Ooooo0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        f74737OooooO0 = StateFlowKt.MutableStateFlow(bool);
        f74738OooooOO = StateFlowKt.MutableStateFlow(null);
        f74739OooooOo = StateFlowKt.MutableStateFlow(bool);
        f74740Oooooo = new o00O000o(null);
    }

    @NotNull
    public static MutableLiveData OooO() {
        return (MutableLiveData) f74692OooOO0.getValue();
    }

    public static void OooO00o(long j, long j2) {
        long jLongValue = oOO0OO.OooO0o0().f93883OooO0OO.OooO00o().longValue();
        if (j2 <= jLongValue) {
            com.yalla.yalla.util.log.OooOO0.OooO0O0("Game coin has no update (version " + jLongValue + ")");
            return;
        }
        oOO0OO.OooO0o0().f93883OooO0OO.OooO0OO(Long.valueOf(j2));
        oOO0OO.OooO0o0().f93882OooO0O0.OooO0OO(Long.valueOf(j));
        com.yalla.yalla.util.log.OooOO0.OooO0O0("Game coin updated to version " + j2);
    }

    public static void OooO0O0() {
        Oooo0o(null);
        Oooo0oO(false, null);
        MutableLiveData mutableLiveDataOooOooO = OooOooO();
        Boolean bool = Boolean.FALSE;
        mutableLiveDataOooOooO.postValue(bool);
        f74740Oooooo.postValue(null);
        OooOOo().postValue(bool);
    }

    @NotNull
    public static MutableLiveData OooO0OO() {
        return (MutableLiveData) f74700OooOOo0.getValue();
    }

    @NotNull
    public static MutableLiveData OooO0Oo() {
        return (MutableLiveData) f74701OooOOoo.getValue();
    }

    @NotNull
    public static MutableLiveData OooO0o() {
        return (MutableLiveData) f74734OoooOoo.getValue();
    }

    @NotNull
    public static MutableLiveData OooO0o0() {
        return (MutableLiveData) f74699OooOOo.getValue();
    }

    @NotNull
    public static MutableLiveData OooO0oO() {
        return (MutableLiveData) f74725OoooO.getValue();
    }

    @NotNull
    public static MutableLiveData OooO0oo() {
        return (MutableLiveData) f74727OoooO00.getValue();
    }

    @NotNull
    public static MutableLiveData OooOO0() {
        return (MutableLiveData) f74683OooO.getValue();
    }

    @NotNull
    public static MutableLiveData OooOO0O() {
        return (MutableLiveData) f74720Oooo0OO.getValue();
    }

    @NotNull
    public static MutableLiveData OooOO0o() {
        return (MutableLiveData) f74705OooOo0O.getValue();
    }

    @NotNull
    public static MutableLiveData OooOOO() {
        return (MutableLiveData) f74696OooOOO0.getValue();
    }

    @NotNull
    public static MutableLiveData OooOOO0() {
        return (MutableLiveData) f74694OooOO0o.getValue();
    }

    @NotNull
    public static MutableLiveData OooOOOO() {
        return (MutableLiveData) f74691OooO0oo.getValue();
    }

    @NotNull
    public static MutableLiveData OooOOOo() {
        return (MutableLiveData) f74702OooOo.getValue();
    }

    @NotNull
    public static MutableLiveData OooOOo() {
        return (MutableLiveData) f74735Ooooo00.getValue();
    }

    @NotNull
    public static MutableLiveData OooOOo0() {
        return (MutableLiveData) f74708OooOoO0.getValue();
    }

    @NotNull
    public static MutableLiveData OooOOoo() {
        return (MutableLiveData) f74712OooOooO.getValue();
    }

    @NotNull
    public static MutableLiveData OooOo() {
        return (MutableLiveData) f74690OooO0oO.getValue();
    }

    @NotNull
    public static MutableLiveData OooOo0() {
        return (MutableLiveData) f74718Oooo00o.getValue();
    }

    @NotNull
    public static MutableLiveData OooOo00() {
        return (MutableLiveData) f74716Oooo000.getValue();
    }

    @NotNull
    public static MutableLiveData OooOo0O() {
        return (MutableLiveData) f74717Oooo00O.getValue();
    }

    @NotNull
    public static MutableLiveData OooOo0o() {
        return (MutableLiveData) f74688OooO0o.getValue();
    }

    @NotNull
    public static MutableLiveData OooOoO() {
        return (MutableLiveData) f74687OooO0Oo.getValue();
    }

    @NotNull
    public static MutableLiveData OooOoO0() {
        return (MutableLiveData) f74693OooOO0O.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean OooOoOO() {
        CharSequence charSequence;
        CharSequence charSequence2;
        Long l = (Long) OooOo0o().getValue();
        return ((l != null && l.longValue() == 0) || (charSequence = (CharSequence) OooOOoo().getValue()) == null || StringsKt.isBlank(charSequence) || (charSequence2 = (CharSequence) OooOo00().getValue()) == null || StringsKt.isBlank(charSequence2)) ? false : true;
    }

    @NotNull
    public static MutableLiveData OooOoo() {
        return (MutableLiveData) f74724Oooo0oo.getValue();
    }

    @NotNull
    public static MutableLiveData OooOoo0() {
        return (MutableLiveData) f74721Oooo0o.getValue();
    }

    @NotNull
    public static MutableLiveData OooOooO() {
        return (MutableLiveData) f74686OooO0OO.getValue();
    }

    @NotNull
    public static MutableLiveData OooOooo() {
        return (MutableLiveData) f74704OooOo00.getValue();
    }

    public static void Oooo0() {
        if (Intrinsics.areEqual(OooOooO().getValue(), Boolean.FALSE)) {
            f74741Oooooo0 = true;
        } else {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new Account$loadMyRoomInfo$1(2, null), 3, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean Oooo000() {
        Pair pair = (Pair) OooOOO().getValue();
        return pair != null && ((Boolean) pair.getFirst()).booleanValue();
    }

    @NotNull
    public static MutableLiveData Oooo00O() {
        return (MutableLiveData) f74730OoooOOO.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean Oooo00o() {
        Pair pair = (Pair) OooOO0O().getValue();
        if (pair != null && ((Number) pair.getFirst()).intValue() == VipState.Vip.getValue()) {
            return true;
        }
        Pair pair2 = (Pair) OooOO0O().getValue();
        return pair2 != null && ((Number) pair2.getFirst()).intValue() == VipState.VipHide.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void Oooo0OO() {
        if (((Long) OooOo0o().getValue()) == null || !Intrinsics.areEqual(OooOooO().getValue(), Boolean.TRUE)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new Account$loadUserWealthLvInfo$1$1(2, null), 3, null);
    }

    public static void Oooo0o(@Nullable LoginToken loginToken) {
        String token;
        String tokenActivity;
        String tokenChat;
        String tokenRoom;
        String tokenGameSocket;
        MutableLiveData mutableLiveDataOooOOoo = OooOOoo();
        String str = "";
        if (loginToken == null || (token = loginToken.getToken()) == null) {
            token = "";
        }
        mutableLiveDataOooOOoo.setValue(token);
        MutableLiveData mutableLiveData = (MutableLiveData) f74713OooOooo.getValue();
        if (loginToken == null || (tokenActivity = loginToken.getTokenActivity()) == null) {
            tokenActivity = "";
        }
        mutableLiveData.setValue(tokenActivity);
        MutableLiveData mutableLiveDataOooOo00 = OooOo00();
        if (loginToken == null || (tokenChat = loginToken.getTokenChat()) == null) {
            tokenChat = "";
        }
        mutableLiveDataOooOo00.setValue(tokenChat);
        MutableLiveData mutableLiveDataOooOo0O = OooOo0O();
        if (loginToken == null || (tokenRoom = loginToken.getTokenRoom()) == null) {
            tokenRoom = "";
        }
        mutableLiveDataOooOo0O.setValue(tokenRoom);
        MutableLiveData mutableLiveDataOooOo0 = OooOo0();
        if (loginToken != null && (tokenGameSocket = loginToken.getTokenGameSocket()) != null) {
            str = tokenGameSocket;
        }
        mutableLiveDataOooOo0.setValue(str);
    }

    public static void Oooo0oO(boolean z, @Nullable MyUserInfoModel myUserInfoModel) {
        long regTimeStamp;
        String userIdx;
        String userIdx2;
        String userHeader;
        String userHeaderFrame;
        String userName;
        NicknameStyle nicknameStyle;
        String background;
        List<UserInfo.TagInfo> arrayList;
        String bio;
        String birthday;
        String wealthMyInfoTextColour;
        String wealthMyInfoCardImg;
        FirstRecharge firstRecharge;
        UserInfo.WealthLevelModel wealthLv;
        String wealthBadgeWithBg;
        OooOo0o().setValue(Long.valueOf(myUserInfoModel != null ? myUserInfoModel.getUserId() : 0L));
        oOO0OO.OooO00o().f93849OooO0Oo.OooO0OO(Long.valueOf(myUserInfoModel != null ? myUserInfoModel.getUserId() : 0L));
        oOO0OOO<Long> ooo0ooo = oOO0OO.OooO00o().f93852OooO0oO;
        if (myUserInfoModel != null) {
            regTimeStamp = myUserInfoModel.getRegTimeStamp();
            int iOooO00o = com.yalla.yalla.model.OooO0O0.OooO00o(com.yalla.yalla.model.OooO00o.OooO00o(), regTimeStamp);
            if (1 <= iOooO00o) {
                int i = 1;
                while (true) {
                    regTimeStamp *= (long) 10;
                    if (i == iOooO00o) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        } else {
            regTimeStamp = 0;
        }
        ooo0ooo.OooO0OO(Long.valueOf(regTimeStamp));
        boolean hasCoupon = false;
        oOO0OO.OooO00o().f93845OooO.OooO0OO(Integer.valueOf(myUserInfoModel != null ? myUserInfoModel.getNewAccountDays() : 0));
        MutableLiveData mutableLiveDataOooOo = OooOo();
        String str = "";
        if (myUserInfoModel == null || (userIdx = myUserInfoModel.getUserIdx()) == null) {
            userIdx = "";
        }
        mutableLiveDataOooOo.setValue(userIdx);
        oOO0OOO<String> ooo0ooo2 = oOO0OO.OooO00o().f93851OooO0o0;
        if (myUserInfoModel == null || (userIdx2 = myUserInfoModel.getUserIdx()) == null) {
            userIdx2 = "";
        }
        ooo0ooo2.OooO0OO(userIdx2);
        MutableLiveData mutableLiveDataOooOO0 = OooOO0();
        if (myUserInfoModel == null || (userHeader = myUserInfoModel.getUserHeader()) == null) {
            userHeader = "";
        }
        mutableLiveDataOooOO0.setValue(userHeader);
        MutableLiveData mutableLiveDataOooO = OooO();
        if (myUserInfoModel == null || (userHeaderFrame = myUserInfoModel.getUserHeaderFrame()) == null) {
            userHeaderFrame = "";
        }
        mutableLiveDataOooO.setValue(userHeaderFrame);
        MutableLiveData mutableLiveDataOooOoO0 = OooOoO0();
        if (myUserInfoModel == null || (userName = myUserInfoModel.getUserName()) == null) {
            userName = "";
        }
        mutableLiveDataOooOoO0.setValue(userName);
        MutableLiveData mutableLiveDataOooOOO0 = OooOOO0();
        if (myUserInfoModel == null || (nicknameStyle = myUserInfoModel.getNicknameStyle()) == null) {
            nicknameStyle = new NicknameStyle(0, null, 0, null, null, null, null, 127, null);
        }
        mutableLiveDataOooOOO0.setValue(nicknameStyle);
        OooOOO().setValue(new Pair(Boolean.valueOf(myUserInfoModel != null && myUserInfoModel.isPremium()), Integer.valueOf(myUserInfoModel != null ? myUserInfoModel.getPremiumLevel() : 0)));
        OooO0OO().setValue(Long.valueOf(myUserInfoModel != null ? myUserInfoModel.getCoin() : 0L));
        oOO0OO.OooO0o0().f93882OooO0O0.OooO0OO(Long.valueOf(myUserInfoModel != null ? myUserInfoModel.getGameCoin() : 0L));
        oOO0OO.OooO0o0().f93883OooO0OO.OooO0OO(Long.valueOf(myUserInfoModel != null ? myUserInfoModel.getGameCoinVersion() : 0L));
        OooO0o0().setValue(Long.valueOf(myUserInfoModel != null ? myUserInfoModel.getCrystal() : 0L));
        OooO0Oo().setValue(Integer.valueOf(myUserInfoModel != null ? myUserInfoModel.getCountryId() : 2));
        OooOooo().setValue(Boolean.valueOf(myUserInfoModel != null && myUserInfoModel.getIsNewUser()));
        ((MutableLiveData) f74703OooOo0.getValue()).setValue(Integer.valueOf(myUserInfoModel != null ? myUserInfoModel.getIdLevel() : 0));
        OooOO0o().setValue(Integer.valueOf(myUserInfoModel != null ? myUserInfoModel.getUserLevel() : 0));
        ((MutableLiveData) f74706OooOo0o.getValue()).setValue(myUserInfoModel != null ? myUserInfoModel.getMedalIcons() : null);
        OooOOOo().setValue(Integer.valueOf(myUserInfoModel != null ? myUserInfoModel.getRole() : 0));
        OooOOo0().setValue(Integer.valueOf(myUserInfoModel != null ? myUserInfoModel.getSex() : 2));
        MutableLiveData mutableLiveData = (MutableLiveData) f74707OooOoO.getValue();
        if (myUserInfoModel == null || (background = myUserInfoModel.getBackground()) == null) {
            background = "";
        }
        mutableLiveData.setValue(background);
        MutableLiveData mutableLiveData2 = (MutableLiveData) f74709OooOoOO.getValue();
        if (myUserInfoModel == null || (arrayList = myUserInfoModel.getTags()) == null) {
            arrayList = new ArrayList<>();
        }
        mutableLiveData2.setValue(arrayList);
        MutableLiveData mutableLiveData3 = (MutableLiveData) f74711OooOoo0.getValue();
        if (myUserInfoModel == null || (bio = myUserInfoModel.getBio()) == null) {
            bio = "";
        }
        mutableLiveData3.setValue(bio);
        MutableLiveData mutableLiveData4 = (MutableLiveData) f74710OooOoo.getValue();
        if (myUserInfoModel == null || (birthday = myUserInfoModel.getBirthday()) == null) {
            birthday = "";
        }
        mutableLiveData4.setValue(birthday);
        ((MutableLiveData) f74698OooOOOo.getValue()).setValue(Integer.valueOf(myUserInfoModel != null ? myUserInfoModel.getFansNum() : 0));
        ((MutableLiveData) f74697OooOOOO.getValue()).setValue(Integer.valueOf(myUserInfoModel != null ? myUserInfoModel.getFollowedNum() : 0));
        ((MutableLiveData) f74695OooOOO.getValue()).setValue(Integer.valueOf(myUserInfoModel != null ? myUserInfoModel.getVisitorNum() : 0));
        OooOO0O().setValue(new Pair(Integer.valueOf(myUserInfoModel != null ? myUserInfoModel.getVipState() : 0), Integer.valueOf(myUserInfoModel != null ? myUserInfoModel.getVipLevel() : 0)));
        ((MutableLiveData) f74722Oooo0o0.getValue()).setValue(new Pair(Boolean.valueOf(myUserInfoModel != null ? myUserInfoModel.getCoinFrozen() : false), Integer.valueOf(myUserInfoModel != null ? myUserInfoModel.getDebtAmount() : 0)));
        OooOoo().setValue(Boolean.valueOf((!Intrinsics.areEqual(OooOooO().getValue(), Boolean.TRUE) || myUserInfoModel == null) ? true : myUserInfoModel.getIsBindPhone()));
        ((MutableLiveData) f74714Oooo.getValue()).setValue(Boolean.valueOf(myUserInfoModel != null ? myUserInfoModel.getIsBlackUser() : false));
        f74736Ooooo0o.setValue(Boolean.valueOf(myUserInfoModel != null && myUserInfoModel.getIsWhiteCountry()));
        f74737OooooO0.setValue(Boolean.valueOf((myUserInfoModel == null || myUserInfoModel.getIsShowPhBind()) ? false : true));
        if (z) {
            OooOoo0().postValue(null);
        }
        if (myUserInfoModel != null) {
            OooOOOO().setValue(Integer.valueOf(myUserInfoModel.getRegion()));
        }
        MutableLiveData mutableLiveData5 = (MutableLiveData) f74732OoooOo0.getValue();
        if (myUserInfoModel == null || (wealthMyInfoTextColour = myUserInfoModel.getWealthMyInfoTextColour()) == null) {
            wealthMyInfoTextColour = "";
        }
        mutableLiveData5.postValue(wealthMyInfoTextColour);
        MutableLiveData mutableLiveData6 = (MutableLiveData) f74733OoooOoO.getValue();
        if (myUserInfoModel == null || (wealthMyInfoCardImg = myUserInfoModel.getWealthMyInfoCardImg()) == null) {
            wealthMyInfoCardImg = "";
        }
        mutableLiveData6.postValue(wealthMyInfoCardImg);
        MutableLiveData mutableLiveDataOooO0o = OooO0o();
        if (myUserInfoModel != null && (wealthBadgeWithBg = myUserInfoModel.getWealthBadgeWithBg()) != null) {
            str = wealthBadgeWithBg;
        }
        mutableLiveDataOooO0o.postValue(str);
        Oooo00O().postValue(Boolean.valueOf(myUserInfoModel != null ? myUserInfoModel.getShowWealthLevel() : true));
        if (myUserInfoModel != null && (wealthLv = myUserInfoModel.getWealthLv()) != null) {
            OooO0oo().postValue(Integer.valueOf(wealthLv.getWealthLevel()));
            OooO0oO().postValue(wealthLv.getCurrBadgeImg());
        }
        f74738OooooOO.setValue(myUserInfoModel != null ? myUserInfoModel.getFirstRecharge() : null);
        if (myUserInfoModel != null && (firstRecharge = myUserInfoModel.getFirstRecharge()) != null) {
            hasCoupon = firstRecharge.getHasCoupon();
        }
        f74739OooooOo.setValue(Boolean.valueOf(hasCoupon));
        com.yalla.yalla.util.log.OooOO0.OooO0O0("saveUser user = ".concat(p247o00oo0oO.o000OO0O.OooO00o(myUserInfoModel)));
        if (oOO0OO.OooO0OO().OooO00o().getInt("needShowHonorTitleEntryRedDot", -1) != -1 || myUserInfoModel == null) {
            return;
        }
        oOO0OO.OooO0OO().OooO00o().OooO0OO("needShowHonorTitleEntryRedDot", !myUserInfoModel.getIsNewUser() ? 1 : 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object Oooo0O0(@NotNull ContinuationImpl continuationImpl) {
        Account$loadMyRoomInfoWithResult$1 account$loadMyRoomInfoWithResult$1;
        if (continuationImpl instanceof Account$loadMyRoomInfoWithResult$1) {
            account$loadMyRoomInfoWithResult$1 = (Account$loadMyRoomInfoWithResult$1) continuationImpl;
            int i = account$loadMyRoomInfoWithResult$1.f74758OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                account$loadMyRoomInfoWithResult$1.f74758OooO = i - Integer.MIN_VALUE;
            } else {
                account$loadMyRoomInfoWithResult$1 = new Account$loadMyRoomInfoWithResult$1(this, continuationImpl);
            }
        } else {
            account$loadMyRoomInfoWithResult$1 = new Account$loadMyRoomInfoWithResult$1(this, continuationImpl);
        }
        Object obj = account$loadMyRoomInfoWithResult$1.f74759OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = account$loadMyRoomInfoWithResult$1.f74758OooO;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return null;
        }
        ResultKt.throwOnFailure(obj);
        if (Intrinsics.areEqual(OooOooO().getValue(), Boxing.boxBoolean(false))) {
            f74741Oooooo0 = true;
            return null;
        }
        account$loadMyRoomInfoWithResult$1.f74758OooO = 1;
        if (Oooo0o0(account$loadMyRoomInfoWithResult$1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Oooo0o0(ContinuationImpl continuationImpl) throws Throwable {
        Account$requestMyRoomInfo$1 account$requestMyRoomInfo$1;
        if (continuationImpl instanceof Account$requestMyRoomInfo$1) {
            account$requestMyRoomInfo$1 = (Account$requestMyRoomInfo$1) continuationImpl;
            int i = account$requestMyRoomInfo$1.f74835OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                account$requestMyRoomInfo$1.f74835OooO = i - Integer.MIN_VALUE;
            } else {
                account$requestMyRoomInfo$1 = new Account$requestMyRoomInfo$1(this, continuationImpl);
            }
        } else {
            account$requestMyRoomInfo$1 = new Account$requestMyRoomInfo$1(this, continuationImpl);
        }
        Object objWithContext = account$requestMyRoomInfo$1.f74836OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = account$requestMyRoomInfo$1.f74835OooO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            com.yalla.yalla.repository.o00Ooo o00ooo2 = com.yalla.yalla.repository.o00Ooo.f75395OooO00o;
            account$requestMyRoomInfo$1.f74835OooO = 1;
            o00ooo2.getClass();
            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new CommonRepository$loadMyRoomInfo$$inlined$call$default$1(o00ooo2, null), account$requestMyRoomInfo$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        Response response = (Response) objWithContext;
        if (response.getIsSuccess()) {
            p589o0oo00Oo.o00oO0o o00oo0oOooO0Oo = p472o0o0000o.OooOO0O.OooO0Oo();
            o00oo0oOooO0Oo.getClass();
            o00oo0oOooO0Oo.OooOO0O("HAS_ROOM" + OooOo0o().getValue(), true);
            List list = (List) response.getData();
            List list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                f74740Oooooo.postValue(list.get(0));
                p589o0oo00Oo.o00oO0o o00oo0oOooO0Oo2 = p472o0o0000o.OooOO0O.OooO0Oo();
                String value = ((RoomIndexModel) list.get(0)).barid;
                o00oo0oOooO0Oo2.getClass();
                Intrinsics.checkNotNullParameter(value, "value");
                o00oo0oOooO0Oo2.OooOO0("MY_ROOM_BARID" + OooOo0o().getValue(), value);
            }
            f74741Oooooo0 = true;
        }
        return Unit.INSTANCE;
    }
}
