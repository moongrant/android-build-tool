package p475o0Ooooo0;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.media3.session.o00O0O0;
import com.common.support.crypto.AESKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.gson.reflect.TypeToken;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.data.repository.AccountRepo;
import com.yalla.yalla.data.repository.AccountRepo$getUserWealthLvInfo$$inlined$call$1;
import com.yalla.yalla.model.UserWealthLevelModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.model.user.MyUserInfoModel;
import com.yalla.yalla.repository.CommonRepository$loadMyRoomInfo$$inlined$call$1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p269o00oooo0.o0O0oo0o;
import p414o0Oo0oO.oO000O0;
import p414o0Oo0oO.oO0OOo0o;
import p590o0oOooo0.oO0oO000;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,561:1\n81#2:562\n107#2,2:563\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n371#1:562\n371#1:563,2\n*E\n"})
public final class o0O00oO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static boolean f47939OooO0Oo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public static final MutableState f47984OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public static final MutableStateFlow<Boolean> f47985OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public static boolean f47986OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public static final o0000 f47987Ooooo00;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O00oO0 f47936OooO00o = new o0O00oO0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f47937OooO0O0 = LazyKt.lazy(o0ooOOo.f48037OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f47938OooO0OO = LazyKt.lazy(o000OO0O.f48024OooO0Oo);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final Lazy f47941OooO0o0 = LazyKt.lazy(o000Oo0.f48026OooO0Oo);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f47940OooO0o = LazyKt.lazy(o000O00.f48018OooO0Oo);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final Lazy f47942OooO0oO = LazyKt.lazy(o00000OO.f48009OooO0Oo);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f47943OooO0oo = LazyKt.lazy(o00O0O.f48028OooO0Oo);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final Lazy f47935OooO = LazyKt.lazy(o0OoOo0.f48036OooO0Oo);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public static final Lazy f47944OooOO0 = LazyKt.lazy(o000O00O.f48020OooO0Oo);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public static final Lazy f47945OooOO0O = LazyKt.lazy(o00000O.f48007OooO0Oo);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f47946OooOO0o = LazyKt.lazy(o000O0Oo.f48021OooO0Oo);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public static final Lazy f47948OooOOO0 = LazyKt.lazy(o000oOoO.f48027OooO0Oo);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public static final Lazy f47947OooOOO = LazyKt.lazy(Oooo0.f48001OooO0Oo);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public static final Lazy f47949OooOOOO = LazyKt.lazy(OooO0OO.f47992OooO0Oo);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public static final Lazy f47950OooOOOo = LazyKt.lazy(OooOO0.f47994OooO0Oo);

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public static final Lazy f47952OooOOo0 = LazyKt.lazy(OooO0o.f47993OooO0Oo);

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public static final Lazy f47951OooOOo = LazyKt.lazy(o0OOO0o.f48034OooO0Oo);

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public static final Lazy f47953OooOOoo = LazyKt.lazy(o00Oo0.f48029OooO0Oo);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public static final Lazy f47956OooOo00 = LazyKt.lazy(o0O0O00.f48032OooO0Oo);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public static final Lazy f47955OooOo0 = LazyKt.lazy(o000000O.f48006OooO0Oo);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public static final Lazy f47957OooOo0O = LazyKt.lazy(o0000Ooo.f48015OooO0Oo);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f47958OooOo0o = LazyKt.lazy(o0000oo.f48016OooO0Oo);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public static final Lazy f47954OooOo = LazyKt.lazy(OooO.f47989OooO0Oo);

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public static final Lazy f47960OooOoO0 = LazyKt.lazy(o000OO.f48023OooO0Oo);

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public static final Lazy f47959OooOoO = LazyKt.lazy(o0000O0O.f48013OooO0Oo);

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public static final Lazy f47961OooOoOO = LazyKt.lazy(OooO0O0.f47991OooO0Oo);

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public static final Lazy f47963OooOoo0 = LazyKt.lazy(o0000OO0.f48014OooO0Oo);

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public static final Lazy f47962OooOoo = LazyKt.lazy(o000.f48003OooO0Oo);

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public static final Lazy f47964OooOooO = LazyKt.lazy(o000O000.f48019OooO0Oo);

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public static final Lazy f47965OooOooo = LazyKt.lazy(o000O0o.f48022OooO0Oo);

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @NotNull
    public static final Lazy f47968Oooo000 = LazyKt.lazy(o000O0.f48017OooO0Oo);

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @NotNull
    public static final Lazy f47969Oooo00O = LazyKt.lazy(oo0o0Oo.f48039OooO0Oo);

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f47970Oooo00o = LazyKt.lazy(OooO00o.f47990OooO0Oo);

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @NotNull
    public static final Lazy f47967Oooo0 = LazyKt.lazy(o00Ooo.f48030OooO0Oo);

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f47971Oooo0O0 = LazyKt.lazy(o00000O0.f48008OooO0Oo);

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f47972Oooo0OO = LazyKt.lazy(oo000o.f48038OooO0Oo);

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @NotNull
    public static final Lazy f47974Oooo0o0 = LazyKt.lazy(o00oO0o.f48031OooO0Oo);

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f47973Oooo0o = LazyKt.lazy(OooOo.f47999OooO0Oo);

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public static final Lazy f47975Oooo0oO = LazyKt.lazy(OooOo00.f48000OooO0Oo);

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f47976Oooo0oo = LazyKt.lazy(OooOOO.f47996OooO0Oo);

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public static final Lazy f47966Oooo = LazyKt.lazy(OooOOO0.f47997OooO0Oo);

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public static final Lazy f47979OoooO00 = LazyKt.lazy(o00000.f48004OooO0Oo);

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public static final Lazy f47978OoooO0 = LazyKt.lazy(o0000O.f48010OooO0Oo);

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public static final Lazy f47980OoooO0O = LazyKt.lazy(o0Oo0oo.f48035OooO0Oo);

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public static final Lazy f47977OoooO = LazyKt.lazy(o0OO00O.f48033OooO0Oo);

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public static final Lazy f47981OoooOO0 = LazyKt.lazy(Oooo000.f48002OooO0Oo);

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public static final Lazy f47988o000oOoO = LazyKt.lazy(OooOOOO.f47998OooO0Oo);

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public static final Lazy f47982OoooOOO = LazyKt.lazy(OooOO0O.f47995OooO0Oo);

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public static final Lazy f47983OoooOOo = LazyKt.lazy(o0000O0.f48011OooO0Oo);

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$cover$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$cover$2\n*L\n209#1:562,8\n*E\n"})
    public static final class OooO extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f47989OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0o0("cover", ""));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0O0OOO0.f48044OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0O0OOOo(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$arrearsState$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$arrearsState$2\n*L\n267#1:562,8\n*E\n"})
    public static final class OooO00o extends Lambda implements Function0<MutableLiveData<Pair<? extends Boolean, ? extends Integer>>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f47990OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Pair<? extends Boolean, ? extends Integer>> invoke() {
            MutableLiveData<Pair<? extends Boolean, ? extends Integer>> mutableLiveData = new MutableLiveData<>(new Pair(Boolean.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0O0("coinIsFrozen", false)), Integer.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0OO("debtAmount", 0))));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0oO0Ooo.f48070OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0O00o00(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$birthday$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$birthday$2\n*L\n224#1:562,8\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f47991OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0o0("sign", ""));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0O0O0O.f48040OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0oO0O0o(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$coin$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$coin$2\n*L\n156#1:562,8\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function0<MutableLiveData<Long>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f47992OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Long> invoke() {
            MutableLiveData<Long> mutableLiveData = new MutableLiveData<>(Long.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0Oo("coin")));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0O0oo0o.f48050OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0O0O0Oo(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$countryId$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$countryId$2\n*L\n168#1:562,8\n*E\n"})
    public static final class OooO0o extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f47993OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0OO("countryId", 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0O0O0o0.f48042OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0O0OO0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$crystal$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$crystal$2\n*L\n162#1:562,8\n*E\n"})
    public static final class OooOO0 extends Lambda implements Function0<MutableLiveData<Long>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f47994OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Long> invoke() {
            MutableLiveData<Long> mutableLiveData = new MutableLiveData<>(Long.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0Oo("crystal")));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oo0OOoo.f48128OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0O0o000(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currBadgeRoundedImg$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currBadgeRoundedImg$2\n*L\n362#1:562,8\n*E\n"})
    public static final class OooOO0O extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f47995OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0o0("currBadgeRoundedImg", ""));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0O0o00O.f48048OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0O0o0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthBadgeLevel$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthBadgeLevel$2\n*L\n306#1:562,8\n*E\n"})
    public static final class OooOOO extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f47996OooO0Oo = new OooOOO();

        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0OO("currWealthBadgeLevel", 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0O.f47933OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0OO000(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthBadgeImg$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthBadgeImg$2\n*L\n313#1:562,8\n*E\n"})
    public static final class OooOOO0 extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f47997OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0o0("currWealthBadgeImg", ""));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0oOo0O0.f48071OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0O0oo00(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthCardImg$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthCardImg$2\n*L\n355#1:562,8\n*E\n"})
    public static final class OooOOOO extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOOO f47998OooO0Oo = new OooOOOO();

        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0o0("currWealthCardImg", ""));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0OO000o.f48054OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oo0oO0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthLevel$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthLevel$2\n*L\n292#1:562,8\n*E\n"})
    public static final class OooOo extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo f47999OooO0Oo = new OooOo();

        public OooOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0OO("currWealthLevel", 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0OO00o0.f48056OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0OO0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthExperience$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthExperience$2\n*L\n299#1:562,8\n*E\n"})
    public static final class OooOo00 extends Lambda implements Function0<MutableLiveData<Long>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo00 f48000OooO0Oo = new OooOo00();

        public OooOo00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Long> invoke() {
            MutableLiveData<Long> mutableLiveData = new MutableLiveData<>(Long.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0Oo("currWealthExperience")));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oo0ooO.f48130OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0OO00OO(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$fansNum$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$fansNum$2\n*L\n150#1:562,8\n*E\n"})
    public static final class Oooo0 extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo0 f48001OooO0Oo = new Oooo0();

        public Oooo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0OO("fanNum", 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0OO0o00.f48059OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0OO0o(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthTextColor$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthTextColor$2\n*L\n348#1:562,8\n*E\n"})
    public static final class Oooo000 extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo000 f48002OooO0Oo = new Oooo000();

        public Oooo000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0o0("currWealthTextColor", "#00000000"));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0OO0O0.f48057OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0OOooO0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$tokenActivity$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$tokenActivity$2\n*L\n234#1:562,8\n*E\n"})
    public static final class o000 extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000 f48003OooO0Oo = new o000();

        public o000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            String str;
            oO000O0 oo000o0OooO00o = p415o0Oo0oO0.o00Ooo.OooO00o();
            oo000o0OooO00o.getClass();
            String strOooO0o0 = oo000o0OooO00o.OooO0o0(String.valueOf(1552156712), "");
            if (StringsKt.isBlank(strOooO0o0)) {
                str = oo000o0OooO00o.OooO0o0("tokenActivity", "");
                oo000o0OooO00o.OooOO0("tokenActivity");
            } else {
                str = new String(AESKt.aesDecrypt$default(strOooO0o0, oO0oO000.f57155OooO0O0, oO0oO000.f57154OooO00o, false, null, 12, null), Charsets.UTF_8);
            }
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(str);
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oO00o000.f48097OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oO00o00(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o0000 extends MutableLiveData<RoomIndexModel> {
        public o0000() {
            super(null);
        }

        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super RoomIndexModel> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            super.observe(owner, observer);
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (o0O00oO0.f47986OoooOoo) {
                return;
            }
            o0O00oO0.OooOoO0();
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$nextWealthLevelExperience$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$nextWealthLevelExperience$2\n*L\n320#1:562,8\n*E\n"})
    public static final class o00000 extends Lambda implements Function0<MutableLiveData<Long>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00000 f48004OooO0Oo = new o00000();

        public o00000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Long> invoke() {
            MutableLiveData<Long> mutableLiveData = new MutableLiveData<>(Long.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0Oo("nextWealthLevelExperience")));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oO000OOo.f48082OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new ooOOOOoo(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.repository.Account$loadUserWealthLvInfo$1$1", f = "Account.kt", i = {}, l = {509}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f48005OooO0Oo;

        public o000000(Continuation<? super o000000> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o000000(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new o000000(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f48005OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountRepo accountRepo = AccountRepo.f22385OooO00o;
                this.f48005OooO0Oo = 1;
                accountRepo.getClass();
                String str = p382o0OOoo.OooOOO0.f43303OooOOo;
                obj = com.code.android.util.OooOOO.OooO0Oo(new AccountRepo$getUserWealthLvInfo$$inlined$call$1(p391o0OOooo0.oo000o.OooO00o(str, "url", str, 0), null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                UserWealthLevelModel userWealthLevelModel = (UserWealthLevelModel) apiResult.getData();
                if (userWealthLevelModel != null) {
                    if (userWealthLevelModel.getCurrWealthBadgeImg().length() > 0) {
                        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                        o0O00oO0.OooO0oO().postValue(Boxing.boxInt(userWealthLevelModel.getCurrWealthLevel()));
                        ((MutableLiveData) o0O00oO0.f47975Oooo0oO.getValue()).postValue(Boxing.boxLong(userWealthLevelModel.getCurrWealthExperience()));
                        ((MutableLiveData) o0O00oO0.f47976Oooo0oo.getValue()).postValue(Boxing.boxInt(userWealthLevelModel.getCurrWealthBadgeLevel()));
                        o0O00oO0.OooO0o().postValue(userWealthLevelModel.getCurrWealthBadgeImg());
                        ((MutableLiveData) o0O00oO0.f47979OoooO00.getValue()).postValue(Boxing.boxLong(userWealthLevelModel.getNextWealthLevelExperience()));
                        ((MutableLiveData) o0O00oO0.f47978OoooO0.getValue()).postValue(Boxing.boxLong(userWealthLevelModel.getThisWealthLevelExperience()));
                        o0O00oO0.OooOo().postValue(Boxing.boxBoolean(userWealthLevelModel.getIsShowWealthLevel()));
                        ((MutableLiveData) o0O00oO0.f47977OoooO.getValue()).postValue(Boxing.boxBoolean(userWealthLevelModel.getIsWealthFullLevel()));
                    }
                }
                LiveEventBus.get("UserWealthLevel_Change").post(Boxing.boxBoolean(true));
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$medal$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$medal$2\n*L\n192#1:562,8\n*E\n"})
    public static final class o000000O extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000000O f48006OooO0Oo = new o000000O();

        public o000000O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0o0("medal", ""));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oO0OoOO0.f48114OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oO0Oo0oo(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$premium$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$premium$2\n*L\n130#1:562,8\n*E\n"})
    public static final class o00000O extends Lambda implements Function0<MutableLiveData<Pair<? extends Boolean, ? extends Integer>>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00000O f48007OooO0Oo = new o00000O();

        public o00000O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Pair<? extends Boolean, ? extends Integer>> invoke() {
            MutableLiveData<Pair<? extends Boolean, ? extends Integer>> mutableLiveData = new MutableLiveData<>(new Pair(Boolean.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0O0("vip", false)), Integer.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0OO("vipLevel", 0))));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oO0OOo0o.f48111OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oO000Oo0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o00000O0 extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00000O0 f48008OooO0Oo = new o00000O0();

        public o00000O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>(Boolean.FALSE);
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$region$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$region$2\n*L\n102#1:562,8\n*E\n"})
    public static final class o00000OO extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00000OO f48009OooO0Oo = new o00000OO();

        public o00000OO() {
            super(0);
        }

        /* JADX WARN: Code duplicated, block: B:52:0x0092  */
        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            int iOooO0OO;
            if (p415o0Oo0oO0.o00Ooo.OooO00o().OooO0OO("region", -1) == -1) {
                String strOooO0Oo = p595o0oo00O.OooOo00.OooO0Oo(com.code.android.util.o000O00O.OooO00o());
                if (strOooO0Oo == null) {
                    iOooO0OO = 0;
                } else {
                    int iHashCode = strOooO0Oo.hashCode();
                    if (iHashCode != 3121) {
                        if (iHashCode == 3241) {
                            strOooO0Oo.equals("en");
                        } else if (iHashCode != 3246) {
                            if (iHashCode != 3329) {
                                if (iHashCode != 3365) {
                                    if (iHashCode != 3588) {
                                        if (iHashCode != 3710) {
                                            if (iHashCode == 3741 && strOooO0Oo.equals("ur")) {
                                                iOooO0OO = 8;
                                            }
                                        } else if (strOooO0Oo.equals("tr")) {
                                            iOooO0OO = 2;
                                        }
                                    } else if (strOooO0Oo.equals("pt")) {
                                        iOooO0OO = 5;
                                    }
                                } else if (strOooO0Oo.equals("in")) {
                                    iOooO0OO = 3;
                                }
                            } else if (strOooO0Oo.equals("hi")) {
                                iOooO0OO = 7;
                            }
                        } else if (strOooO0Oo.equals("es")) {
                            iOooO0OO = 6;
                        }
                        iOooO0OO = 0;
                    } else if (strOooO0Oo.equals("ar")) {
                        iOooO0OO = 1;
                    } else {
                        iOooO0OO = 0;
                    }
                }
            } else {
                iOooO0OO = p415o0Oo0oO0.o00Ooo.OooO00o().OooO0OO("region", -1);
            }
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(iOooO0OO));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oO000Oo.f48083OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oO000o00(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$thisWealthLevelExperience$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$thisWealthLevelExperience$2\n*L\n327#1:562,8\n*E\n"})
    public static final class o0000O extends Lambda implements Function0<MutableLiveData<Long>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O f48010OooO0Oo = new o0000O();

        public o0000O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Long> invoke() {
            MutableLiveData<Long> mutableLiveData = new MutableLiveData<>(Long.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0Oo("thisWealthLevelExperience")));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oO00OOo0.f48092OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oO00Oo00(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o0000O0 extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O0 f48011OooO0Oo = new o0000O0();

        public o0000O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>(Boolean.FALSE);
        }
    }

    public static final class o0000O00 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f48012OooO0Oo;

        public o0000O00(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f48012OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f48012OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f48012OooO0Oo;
        }

        public final int hashCode() {
            return this.f48012OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f48012OooO0Oo.invoke(obj);
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$sign$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$sign$2\n*L\n219#1:562,8\n*E\n"})
    public static final class o0000O0O extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O0O f48013OooO0Oo = new o0000O0O();

        public o0000O0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0o0("sign", ""));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oO00O0oO.f48088OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oO00OO0O(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$token$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$token$2\n*L\n229#1:562,8\n*E\n"})
    public static final class o0000OO0 extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000OO0 f48014OooO0Oo = new o0000OO0();

        public o0000OO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            String str;
            oO000O0 oo000o0OooO00o = p415o0Oo0oO0.o00Ooo.OooO00o();
            oo000o0OooO00o.getClass();
            String strOooO0o0 = oo000o0OooO00o.OooO0o0(String.valueOf(110541305), "");
            if (StringsKt.isBlank(strOooO0o0)) {
                str = oo000o0OooO00o.OooO0o0("token", "");
                oo000o0OooO00o.OooOO0("token");
            } else {
                str = new String(AESKt.aesDecrypt$default(strOooO0o0, oO0oO000.f57155OooO0O0, oO0oO000.f57154OooO00o, false, null, 12, null), Charsets.UTF_8);
            }
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(str);
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oO00Oo0.f48093OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oOOoOOO0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$role$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$role$2\n*L\n198#1:562,8\n*E\n"})
    public static final class o0000Ooo extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000Ooo f48015OooO0Oo = new o0000Ooo();

        public o0000Ooo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0OO("role", 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oO0O0OoO.f48108OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oO00O0o0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$sex$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$sex$2\n*L\n204#1:562,8\n*E\n"})
    public static final class o0000oo extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000oo f48016OooO0Oo = new o0000oo();

        public o0000oo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0OO("sex", 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oO00O0o.f48086OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oOo00OO0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$videoMuted$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$videoMuted$2\n*L\n249#1:562,8\n*E\n"})
    public static final class o000O0 extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000O0 f48017OooO0Oo = new o000O0();

        public o000O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0O0("videoMuted", true)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oOo000Oo.f48119OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oOo0000O(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o000O00 extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000O00 f48018OooO0Oo = new o000O00();

        public o000O00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            return new MutableLiveData<>(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0o0("userIdx", ""));
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$tokenChat$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$tokenChat$2\n*L\n239#1:562,8\n*E\n"})
    public static final class o000O000 extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000O000 f48019OooO0Oo = new o000O000();

        public o000O000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            String str;
            oO000O0 oo000o0OooO00o = p415o0Oo0oO0.o00Ooo.OooO00o();
            oo000o0OooO00o.getClass();
            String strOooO0o0 = oo000o0OooO00o.OooO0o0(String.valueOf(140975345), "");
            if (StringsKt.isBlank(strOooO0o0)) {
                str = oo000o0OooO00o.OooO0o0("tokenChat", "");
                oo000o0OooO00o.OooOO0("tokenChat");
            } else {
                str = new String(AESKt.aesDecrypt$default(strOooO0o0, oO0oO000.f57155OooO0O0, oO0oO000.f57154OooO00o, false, null, 12, null), Charsets.UTF_8);
            }
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(str);
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oO0OOO00.f48110OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oO00o00O(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$userName$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$userName$2\n*L\n120#1:562,8\n*E\n"})
    public static final class o000O00O extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000O00O f48020OooO0Oo = new o000O00O();

        public o000O00O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0o0("userName", ""));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oOo00ooO.f48123OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oO0OO00o(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$visitorNum$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$visitorNum$2\n*L\n139#1:562,8\n*E\n"})
    public static final class o000O0Oo extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000O0Oo f48021OooO0Oo = new o000O0Oo();

        public o000O0Oo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0OO("visitorNum", 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oOo000o0.f48120OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oO0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$tokenRoom$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$tokenRoom$2\n*L\n244#1:562,8\n*E\n"})
    public static final class o000O0o extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000O0o f48022OooO0Oo = new o000O0o();

        public o000O0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            String str;
            oO000O0 oo000o0OooO00o = p415o0Oo0oO0.o00Ooo.OooO00o();
            oo000o0OooO00o.getClass();
            String strOooO0o0 = oo000o0OooO00o.OooO0o0(String.valueOf(141429364), "");
            if (StringsKt.isBlank(strOooO0o0)) {
                str = oo000o0OooO00o.OooO0o0("tokenRoom", "");
                oo000o0OooO00o.OooOO0("tokenRoom");
            } else {
                str = new String(AESKt.aesDecrypt$default(strOooO0o0, oO0oO000.f57155OooO0O0, oO0oO000.f57154OooO00o, false, null, 12, null), Charsets.UTF_8);
            }
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(str);
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oO00o0.f48095OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oOo00o0o(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$tag$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$tag$2\n*L\n214#1:562,8\n*E\n"})
    public static final class o000OO extends Lambda implements Function0<MutableLiveData<List<UserInfo.TagInfo>>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000OO f48023OooO0Oo = new o000OO();

        public o000OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<List<UserInfo.TagInfo>> invoke() {
            Object arrayList = (List) oOOO00.OooO0O0(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0o0(ViewHierarchyConstants.TAG_KEY, ""), new TypeToken<List<UserInfo.TagInfo>>() { // from class: com.yalla.yalla.data.sp.table.AccountSpTable$tag$1
            }.getType());
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            MutableLiveData<List<UserInfo.TagInfo>> mutableLiveData = new MutableLiveData<>(arrayList);
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oO00OOO.f48090OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oO00OOOo(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o000OO0O extends Lambda implements Function0<oO0O000> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000OO0O f48024OooO0Oo = new o000OO0O();

        public o000OO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO0O000 invoke() {
            oO0OOo0o oo0ooo0oOooO0o0 = p415o0Oo0oO0.o00Ooo.OooO0o0();
            oo0ooo0oOooO0o0.getClass();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            return new oO0O000(oo0ooo0oOooO0o0.OooO0O0("welcome" + o0O00oO0.OooOOo0().getValue(), false));
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.repository.Account$loadMyRoomInfo$1", f = "Account.kt", i = {}, l = {470}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000OOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f48025OooO0Oo;

        public o000OOo(Continuation<? super o000OOo> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o000OOo(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new o000OOo(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f48025OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                oO0O0 oo0o0 = oO0O0.f48099OooO00o;
                this.f48025OooO0Oo = 1;
                oo0o0.getClass();
                obj = BuildersKt.withContext(Dispatchers.getIO(), new CommonRepository$loadMyRoomInfo$$inlined$call$1(oo0o0, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Response response = (Response) obj;
            if (response.getIsSuccess()) {
                p477o0o00.OooO0o oooO0oOooO00o = o0O0oo0o.OooO00o();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                oooO0oOooO00o.OooO0o("HAS_ROOM" + o0O00oO0.OooOOo0().getValue(), true);
                List list = (List) response.getData();
                if (!(list == null || list.isEmpty())) {
                    o0O00oO0.f47987Ooooo00.postValue(list.get(0));
                    o0O0oo0o.OooO00o().OooO0o0(o00O0O0.OooO0O0("MY_ROOM_BARID", o0O00oO0.OooOOo0().getValue()), ((RoomIndexModel) list.get(0)).barid);
                }
                o0O00oO0.f47986OoooOoo = true;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000Oo0 extends Lambda implements Function0<MutableLiveData<Long>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000Oo0 f48026OooO0Oo = new o000Oo0();

        public o000Oo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Long> invoke() {
            long jOooO;
            oO000O0 oo000o0OooO00o = p415o0Oo0oO0.o00Ooo.OooO00o();
            oo000o0OooO00o.getClass();
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.element = -1L;
            try {
                Result.Companion companion = Result.INSTANCE;
                String strOooO0o0 = oo000o0OooO00o.OooO0o0(String.valueOf(-836030906), "");
                if (StringsKt.isBlank(strOooO0o0)) {
                    jOooO = oo000o0OooO00o.OooO0Oo("userId");
                    oo000o0OooO00o.OooOO0("userId");
                } else {
                    jOooO = com.code.android.util.o0OoOo0.OooO(0L, new String(AESKt.aesDecrypt$default(strOooO0o0, oO0oO000.f57155OooO0O0, oO0oO000.f57154OooO00o, false, null, 12, null), Charsets.UTF_8));
                }
                longRef.element = jOooO;
                Result.m4215constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m4215constructorimpl(ResultKt.createFailure(th));
            }
            return new MutableLiveData<>(Long.valueOf(longRef.element));
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$followingNum$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$followingNum$2\n*L\n144#1:562,8\n*E\n"})
    public static final class o000oOoO extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000oOoO f48027OooO0Oo = new o000oOoO();

        public o000oOoO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0OO("followingNum", 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0OO0oO0.f48060OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0OO(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$headerUrl$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$headerUrl$2\n*L\n108#1:562,8\n*E\n"})
    public static final class o00O0O extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00O0O f48028OooO0Oo = new o00O0O();

        public o00O0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0o0("headerUrl", ""));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0OOO0OO.f48063OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0OOOO00(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$idLevel$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$idLevel$2\n*L\n180#1:562,8\n*E\n"})
    public static final class o00Oo0 extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00Oo0 f48029OooO0Oo = new o00Oo0();

        public o00Oo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0OO("isPrettyId", 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0OOOO0o.f48065OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0OOo000(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o00Ooo extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00Ooo f48030OooO0Oo = new o00Ooo();

        public o00Ooo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>(null);
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$isBlackUser$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$isBlackUser$2\n*L\n285#1:562,8\n*E\n"})
    public static final class o00oO0o extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00oO0o f48031OooO0Oo = new o00oO0o();

        public o00oO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0O0("isBlackUser", false)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0oo0000.f48072OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new ooo0Oo0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$level$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$level$2\n*L\n186#1:562,8\n*E\n"})
    public static final class o0O0O00 extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0O0O00 f48032OooO0Oo = new o0O0O00();

        public o0O0O00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0OO("isPrettyId", 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oO0Ooooo.f48115OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oO0o0o(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$isWealthFullLevel$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$isWealthFullLevel$2\n*L\n341#1:562,8\n*E\n"})
    public static final class o0OO00O extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0OO00O f48033OooO0Oo = new o0OO00O();

        public o0OO00O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0O0("isWealthFullLevel", false)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oO0000o0.f48079OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oO000(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$isNewUser$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$isNewUser$2\n*L\n174#1:562,8\n*E\n"})
    public static final class o0OOO0o extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0OOO0o f48034OooO0Oo = new o0OOO0o();

        public o0OOO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0O0("isNewUser", false)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oO00000.f48075OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oO00000o(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$isShowWealthLevel$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$isShowWealthLevel$2\n*L\n334#1:562,8\n*E\n"})
    public static final class o0Oo0oo extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0Oo0oo f48035OooO0Oo = new o0Oo0oo();

        public o0Oo0oo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0O0("isShowWealthLevel", false)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oO0000O.f48077OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oO0000Oo(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$headerFrameUrl$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$headerFrameUrl$2\n*L\n114#1:562,8\n*E\n"})
    public static final class o0OoOo0 extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0OoOo0 f48036OooO0Oo = new o0OoOo0();

        public o0OoOo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0o0("headerFrameUrl", ""));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0OOO00.f48062OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0OOO0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function0<o> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0ooOOo f48037OooO0Oo = new o0ooOOo();

        public o0ooOOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o invoke() {
            return new o(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0O0("isLogin", false));
        }
    }

    public static final class oo000o extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final oo000o f48038OooO0Oo = new oo000o();

        public oo000o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>(Boolean.FALSE);
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$kaVipStateAndLevel$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,561:1\n7#2,8:562\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$kaVipStateAndLevel$2\n*L\n259#1:562,8\n*E\n"})
    public static final class oo0o0Oo extends Lambda implements Function0<MutableLiveData<Pair<? extends Integer, ? extends Integer>>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final oo0o0Oo f48039OooO0Oo = new oo0o0Oo();

        public oo0o0Oo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Pair<? extends Integer, ? extends Integer>> invoke() {
            MutableLiveData<Pair<? extends Integer, ? extends Integer>> mutableLiveData = new MutableLiveData<>(new Pair(Integer.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0OO("kaVipState", 0)), Integer.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0OO("kaVipLevel", 0))));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oO000O0.f48080OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oO000O0O(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f47984OoooOo0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        f47985OoooOoO = StateFlowKt.MutableStateFlow(bool);
        f47987Ooooo00 = new o0000();
    }

    @NotNull
    public static MutableLiveData OooO() {
        return (MutableLiveData) f47943OooO0oo.getValue();
    }

    @NotNull
    public static MutableLiveData OooO0O0() {
        return (MutableLiveData) f47949OooOOOO.getValue();
    }

    @NotNull
    public static MutableLiveData OooO0OO() {
        return (MutableLiveData) f47952OooOOo0.getValue();
    }

    @NotNull
    public static MutableLiveData OooO0Oo() {
        return (MutableLiveData) f47950OooOOOo.getValue();
    }

    @NotNull
    public static MutableLiveData OooO0o() {
        return (MutableLiveData) f47966Oooo.getValue();
    }

    @NotNull
    public static MutableLiveData OooO0o0() {
        return (MutableLiveData) f47982OoooOOO.getValue();
    }

    @NotNull
    public static MutableLiveData OooO0oO() {
        return (MutableLiveData) f47973Oooo0o.getValue();
    }

    @NotNull
    public static MutableLiveData OooO0oo() {
        return (MutableLiveData) f47935OooO.getValue();
    }

    @NotNull
    public static MutableLiveData OooOO0() {
        return (MutableLiveData) f47969Oooo00O.getValue();
    }

    @NotNull
    public static MutableLiveData OooOO0O() {
        return (MutableLiveData) f47955OooOo0.getValue();
    }

    @NotNull
    public static MutableLiveData OooOO0o() {
        return (MutableLiveData) f47945OooOO0O.getValue();
    }

    @NotNull
    public static MutableLiveData OooOOO() {
        return (MutableLiveData) f47958OooOo0o.getValue();
    }

    @NotNull
    public static MutableLiveData OooOOO0() {
        return (MutableLiveData) f47942OooO0oO.getValue();
    }

    @NotNull
    public static MutableLiveData OooOOOO() {
        return (MutableLiveData) f47963OooOoo0.getValue();
    }

    @NotNull
    public static MutableLiveData OooOOOo() {
        return (MutableLiveData) f47964OooOooO.getValue();
    }

    @NotNull
    public static MutableLiveData OooOOo() {
        return (MutableLiveData) f47940OooO0o.getValue();
    }

    @NotNull
    public static MutableLiveData OooOOo0() {
        return (MutableLiveData) f47941OooO0o0.getValue();
    }

    @NotNull
    public static MutableLiveData OooOOoo() {
        return (MutableLiveData) f47944OooOO0.getValue();
    }

    @NotNull
    public static MutableLiveData OooOo() {
        return (MutableLiveData) f47980OoooO0O.getValue();
    }

    @NotNull
    public static MutableLiveData OooOo0() {
        return (MutableLiveData) f47972Oooo0OO.getValue();
    }

    @NotNull
    public static MutableLiveData OooOo00() {
        return (MutableLiveData) f47967Oooo0.getValue();
    }

    @NotNull
    public static MutableLiveData OooOo0O() {
        return (MutableLiveData) f47937OooO0O0.getValue();
    }

    @NotNull
    public static MutableLiveData OooOo0o() {
        return (MutableLiveData) f47951OooOOo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooOoO() {
        if (((Long) OooOOo0().getValue()) == null || !Intrinsics.areEqual(OooOo0O().getValue(), Boolean.TRUE)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new o000000(null), 3, null);
    }

    public static void OooOoO0() {
        if (Intrinsics.areEqual(OooOo0O().getValue(), Boolean.FALSE)) {
            f47986OoooOoo = true;
        } else {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new o000OOo(null), 3, null);
        }
    }

    public static void OooOoOO(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        MutableLiveData mutableLiveDataOooOOOO = OooOOOO();
        if (str == null) {
            str = "";
        }
        mutableLiveDataOooOOOO.setValue(str);
        MutableLiveData mutableLiveData = (MutableLiveData) f47962OooOoo.getValue();
        if (str2 == null) {
            str2 = "";
        }
        mutableLiveData.setValue(str2);
        MutableLiveData mutableLiveDataOooOOOo = OooOOOo();
        if (str3 == null) {
            str3 = "";
        }
        mutableLiveDataOooOOOo.setValue(str3);
        MutableLiveData mutableLiveData2 = (MutableLiveData) f47965OooOooo.getValue();
        if (str4 == null) {
            str4 = "";
        }
        mutableLiveData2.setValue(str4);
    }

    public static void OooOoo0(boolean z, @Nullable MyUserInfoModel myUserInfoModel) {
        String userIdx;
        String userHeader;
        String userHeaderFrame;
        String userName;
        String medal;
        String background;
        List<UserInfo.TagInfo> arrayList;
        String bio;
        String birthday;
        String wealthMyInfoTextColour;
        String wealthMyInfoCardImg;
        UserInfo.WealthLevelModel wealthLv$Common_YallaRelease;
        String wealthBadgeWithBg;
        OooOOo0().setValue(myUserInfoModel != null ? Long.valueOf(myUserInfoModel.getUserId()) : 0L);
        MutableLiveData mutableLiveDataOooOOo = OooOOo();
        String str = "";
        if (myUserInfoModel == null || (userIdx = myUserInfoModel.getUserIdx()) == null) {
            userIdx = "";
        }
        mutableLiveDataOooOOo.setValue(userIdx);
        MutableLiveData mutableLiveDataOooO = OooO();
        if (myUserInfoModel == null || (userHeader = myUserInfoModel.getUserHeader()) == null) {
            userHeader = "";
        }
        mutableLiveDataOooO.setValue(userHeader);
        MutableLiveData mutableLiveDataOooO0oo = OooO0oo();
        if (myUserInfoModel == null || (userHeaderFrame = myUserInfoModel.getUserHeaderFrame()) == null) {
            userHeaderFrame = "";
        }
        mutableLiveDataOooO0oo.setValue(userHeaderFrame);
        MutableLiveData mutableLiveDataOooOOoo = OooOOoo();
        if (myUserInfoModel == null || (userName = myUserInfoModel.getUserName()) == null) {
            userName = "";
        }
        mutableLiveDataOooOOoo.setValue(userName);
        OooOO0o().setValue(new Pair(Boolean.valueOf(myUserInfoModel != null && myUserInfoModel.isPremium()), Integer.valueOf(myUserInfoModel != null ? myUserInfoModel.getPremiumLevel() : 0)));
        OooO0O0().setValue(myUserInfoModel != null ? Long.valueOf(myUserInfoModel.getCoin()) : 0L);
        OooO0Oo().setValue(myUserInfoModel != null ? Long.valueOf(myUserInfoModel.getCrystal()) : 0L);
        OooO0OO().setValue(myUserInfoModel != null ? Integer.valueOf(myUserInfoModel.getCountryId()) : 2);
        OooOo0o().setValue(Boolean.valueOf(myUserInfoModel != null && myUserInfoModel.getIsNewUser()));
        ((MutableLiveData) f47953OooOOoo.getValue()).setValue(myUserInfoModel != null ? Integer.valueOf(myUserInfoModel.getIdLevel()) : 0);
        ((MutableLiveData) f47956OooOo00.getValue()).setValue(myUserInfoModel != null ? Integer.valueOf(myUserInfoModel.getUserLevel()) : 0);
        MutableLiveData mutableLiveDataOooOO0O = OooOO0O();
        if (myUserInfoModel == null || (medal = myUserInfoModel.getMedal()) == null) {
            medal = "";
        }
        mutableLiveDataOooOO0O.setValue(medal);
        ((MutableLiveData) f47957OooOo0O.getValue()).setValue(myUserInfoModel != null ? Integer.valueOf(myUserInfoModel.getRole()) : 0);
        OooOOO().setValue(Integer.valueOf(myUserInfoModel != null ? myUserInfoModel.getSex() : 2));
        MutableLiveData mutableLiveData = (MutableLiveData) f47954OooOo.getValue();
        if (myUserInfoModel == null || (background = myUserInfoModel.getBackground()) == null) {
            background = "";
        }
        mutableLiveData.setValue(background);
        MutableLiveData mutableLiveData2 = (MutableLiveData) f47960OooOoO0.getValue();
        if (myUserInfoModel == null || (arrayList = myUserInfoModel.getTags()) == null) {
            arrayList = new ArrayList<>();
        }
        mutableLiveData2.setValue(arrayList);
        MutableLiveData mutableLiveData3 = (MutableLiveData) f47959OooOoO.getValue();
        if (myUserInfoModel == null || (bio = myUserInfoModel.getBio()) == null) {
            bio = "";
        }
        mutableLiveData3.setValue(bio);
        MutableLiveData mutableLiveData4 = (MutableLiveData) f47961OooOoOO.getValue();
        if (myUserInfoModel == null || (birthday = myUserInfoModel.getBirthday()) == null) {
            birthday = "";
        }
        mutableLiveData4.setValue(birthday);
        ((MutableLiveData) f47947OooOOO.getValue()).setValue(myUserInfoModel != null ? Integer.valueOf(myUserInfoModel.getFansNum()) : 0);
        ((MutableLiveData) f47948OooOOO0.getValue()).setValue(myUserInfoModel != null ? Integer.valueOf(myUserInfoModel.getFollowedNum()) : 0);
        ((MutableLiveData) f47946OooOO0o.getValue()).setValue(myUserInfoModel != null ? Integer.valueOf(myUserInfoModel.getVisitorNum()) : 0);
        OooOO0().setValue(new Pair(Integer.valueOf(myUserInfoModel != null ? myUserInfoModel.getVipState() : 0), Integer.valueOf(myUserInfoModel != null ? myUserInfoModel.getVipLevel() : 0)));
        ((MutableLiveData) f47970Oooo00o.getValue()).setValue(new Pair(Boolean.valueOf(myUserInfoModel != null ? myUserInfoModel.getCoinFrozen() : false), Integer.valueOf(myUserInfoModel != null ? myUserInfoModel.getDebtAmount() : 0)));
        MutableLiveData mutableLiveDataOooOo0 = OooOo0();
        T value = OooOo0O().getValue();
        Boolean boolValueOf = Boolean.TRUE;
        if (Intrinsics.areEqual(value, boolValueOf)) {
            boolValueOf = Boolean.valueOf(myUserInfoModel != null ? myUserInfoModel.getIsBindPhone() : true);
        }
        mutableLiveDataOooOo0.setValue(boolValueOf);
        ((MutableLiveData) f47974Oooo0o0.getValue()).setValue(myUserInfoModel != null ? Boolean.valueOf(myUserInfoModel.getIsBlackUser()) : Boolean.FALSE);
        f47984OoooOo0.setValue(Boolean.valueOf(myUserInfoModel != null && myUserInfoModel.getIsWhiteCountry()));
        f47985OoooOoO.setValue(Boolean.valueOf((myUserInfoModel == null || myUserInfoModel.getIsShowPhBind()) ? false : true));
        if (z) {
            OooOo00().postValue(null);
        }
        if ((myUserInfoModel != null) && !z) {
            OooOOO0().setValue(myUserInfoModel != null ? Integer.valueOf(myUserInfoModel.getRegion()) : 0);
        }
        MutableLiveData mutableLiveData5 = (MutableLiveData) f47981OoooOO0.getValue();
        if (myUserInfoModel == null || (wealthMyInfoTextColour = myUserInfoModel.getWealthMyInfoTextColour()) == null) {
            wealthMyInfoTextColour = "";
        }
        mutableLiveData5.postValue(wealthMyInfoTextColour);
        MutableLiveData mutableLiveData6 = (MutableLiveData) f47988o000oOoO.getValue();
        if (myUserInfoModel == null || (wealthMyInfoCardImg = myUserInfoModel.getWealthMyInfoCardImg()) == null) {
            wealthMyInfoCardImg = "";
        }
        mutableLiveData6.postValue(wealthMyInfoCardImg);
        MutableLiveData mutableLiveDataOooO0o0 = OooO0o0();
        if (myUserInfoModel != null && (wealthBadgeWithBg = myUserInfoModel.getWealthBadgeWithBg()) != null) {
            str = wealthBadgeWithBg;
        }
        mutableLiveDataOooO0o0.postValue(str);
        OooOo().postValue(Boolean.valueOf(myUserInfoModel != null ? myUserInfoModel.getShowWealthLevel() : true));
        if (myUserInfoModel != null && (wealthLv$Common_YallaRelease = myUserInfoModel.getWealthLv()) != null) {
            OooO0oO().postValue(Integer.valueOf(wealthLv$Common_YallaRelease.getWealthLevel()));
            OooO0o().postValue(wealthLv$Common_YallaRelease.getCurrBadgeImg());
        }
        p598o0oo00Oo.o0000O00.OooO0O0("saveUser user = ".concat(p187o00o00o0.OooO.OooO00o(myUserInfoModel)));
    }

    public final void OooO00o() {
        OooOoo0(false, null);
        OooOoOO("", "", "", "");
        MutableLiveData mutableLiveDataOooOo0O = OooOo0O();
        Boolean bool = Boolean.FALSE;
        mutableLiveDataOooOo0O.postValue(bool);
        f47987Ooooo00.postValue(null);
        ((MutableLiveData) f47983OoooOOo.getValue()).postValue(bool);
    }
}
