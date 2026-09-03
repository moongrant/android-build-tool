package p464o0Oooo;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p385o0OOooOO.o00oOoo;
import p579o0oOoo.o0o0000;
import p579o0oOoo.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,556:1\n81#2:557\n107#2,2:558\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account\n*L\n370#1:557\n370#1:558,2\n*E\n"})
public final class o000000O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static boolean f46677OooO0Oo;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public static boolean f46723OoooOoO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000000O f46674OooO00o = new o000000O();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f46675OooO0O0 = LazyKt.lazy(o0ooOOo.f46774OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f46676OooO0OO = LazyKt.lazy(o000OO0O.f46761OooO0Oo);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final Lazy f46679OooO0o0 = LazyKt.lazy(o000Oo0.f46763OooO0Oo);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f46678OooO0o = LazyKt.lazy(o000O00.f46755OooO0Oo);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final Lazy f46680OooO0oO = LazyKt.lazy(o00000OO.f46746OooO0Oo);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f46681OooO0oo = LazyKt.lazy(o00O0O.f46765OooO0Oo);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final Lazy f46673OooO = LazyKt.lazy(o0OoOo0.f46773OooO0Oo);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public static final Lazy f46682OooOO0 = LazyKt.lazy(o000O00O.f46757OooO0Oo);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public static final Lazy f46683OooOO0O = LazyKt.lazy(o00000O.f46744OooO0Oo);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f46684OooOO0o = LazyKt.lazy(o000O0Oo.f46758OooO0Oo);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public static final Lazy f46686OooOOO0 = LazyKt.lazy(o000oOoO.f46764OooO0Oo);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public static final Lazy f46685OooOOO = LazyKt.lazy(Oooo0.f46738OooO0Oo);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public static final Lazy f46687OooOOOO = LazyKt.lazy(OooO0OO.f46729OooO0Oo);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public static final Lazy f46688OooOOOo = LazyKt.lazy(OooOO0.f46731OooO0Oo);

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public static final Lazy f46690OooOOo0 = LazyKt.lazy(OooO0o.f46730OooO0Oo);

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public static final Lazy f46689OooOOo = LazyKt.lazy(o0OOO0o.f46771OooO0Oo);

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public static final Lazy f46691OooOOoo = LazyKt.lazy(o00Oo0.f46766OooO0Oo);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public static final Lazy f46694OooOo00 = LazyKt.lazy(o0O0O00.f46769OooO0Oo);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public static final Lazy f46693OooOo0 = LazyKt.lazy(C0478o000000O.f46743OooO0Oo);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public static final Lazy f46695OooOo0O = LazyKt.lazy(o0000Ooo.f46752OooO0Oo);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f46696OooOo0o = LazyKt.lazy(o0000oo.f46753OooO0Oo);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public static final Lazy f46692OooOo = LazyKt.lazy(OooO.f46726OooO0Oo);

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public static final Lazy f46698OooOoO0 = LazyKt.lazy(o000OO.f46760OooO0Oo);

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public static final Lazy f46697OooOoO = LazyKt.lazy(o0000O0O.f46750OooO0Oo);

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public static final Lazy f46699OooOoOO = LazyKt.lazy(OooO0O0.f46728OooO0Oo);

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public static final Lazy f46701OooOoo0 = LazyKt.lazy(o0000OO0.f46751OooO0Oo);

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public static final Lazy f46700OooOoo = LazyKt.lazy(o000.f46740OooO0Oo);

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public static final Lazy f46702OooOooO = LazyKt.lazy(o000O000.f46756OooO0Oo);

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public static final Lazy f46703OooOooo = LazyKt.lazy(o000O0o.f46759OooO0Oo);

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @NotNull
    public static final Lazy f46706Oooo000 = LazyKt.lazy(o000O0.f46754OooO0Oo);

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @NotNull
    public static final Lazy f46707Oooo00O = LazyKt.lazy(oo0o0Oo.f46776OooO0Oo);

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f46708Oooo00o = LazyKt.lazy(OooO00o.f46727OooO0Oo);

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @NotNull
    public static final Lazy f46705Oooo0 = LazyKt.lazy(o00Ooo.f46767OooO0Oo);

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f46709Oooo0O0 = LazyKt.lazy(o00000O0.f46745OooO0Oo);

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @NotNull
    public static final Lazy f46710Oooo0OO = LazyKt.lazy(oo000o.f46775OooO0Oo);

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @NotNull
    public static final Lazy f46712Oooo0o0 = LazyKt.lazy(o00oO0o.f46768OooO0Oo);

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f46711Oooo0o = LazyKt.lazy(OooOo.f46736OooO0Oo);

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public static final Lazy f46713Oooo0oO = LazyKt.lazy(OooOo00.f46737OooO0Oo);

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f46714Oooo0oo = LazyKt.lazy(OooOOO.f46733OooO0Oo);

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public static final Lazy f46704Oooo = LazyKt.lazy(OooOOO0.f46734OooO0Oo);

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public static final Lazy f46717OoooO00 = LazyKt.lazy(o00000.f46741OooO0Oo);

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public static final Lazy f46716OoooO0 = LazyKt.lazy(o0000O.f46747OooO0Oo);

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public static final Lazy f46718OoooO0O = LazyKt.lazy(o0Oo0oo.f46772OooO0Oo);

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public static final Lazy f46715OoooO = LazyKt.lazy(o0OO00O.f46770OooO0Oo);

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public static final Lazy f46719OoooOO0 = LazyKt.lazy(Oooo000.f46739OooO0Oo);

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public static final Lazy f46725o000oOoO = LazyKt.lazy(OooOOOO.f46735OooO0Oo);

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public static final Lazy f46720OoooOOO = LazyKt.lazy(OooOO0O.f46732OooO0Oo);

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public static final Lazy f46721OoooOOo = LazyKt.lazy(o0000O0.f46748OooO0Oo);

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public static final MutableState f46722OoooOo0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public static final o0000 f46724OoooOoo = new o0000();

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$cover$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$cover$2\n*L\n208#1:557,8\n*E\n"})
    public static final class OooO extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f46726OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0o0("cover", ""));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(p464o0Oooo.o0000O00.f46782OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new p464o0Oooo.o0000oo(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$arrearsState$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$arrearsState$2\n*L\n266#1:557,8\n*E\n"})
    public static final class OooO00o extends Lambda implements Function0<MutableLiveData<Pair<? extends Boolean, ? extends Integer>>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f46727OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Pair<? extends Boolean, ? extends Integer>> invoke() {
            MutableLiveData<Pair<? extends Boolean, ? extends Integer>> mutableLiveData = new MutableLiveData<>(new Pair(Boolean.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0O0("coinIsFrozen", false)), Integer.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0OO("debtAmount", 0))));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(p464o0Oooo.o000OOo.f46798OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new p464o0Oooo.o000000(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$birthday$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$birthday$2\n*L\n223#1:557,8\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f46728OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0o0("sign", ""));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(p464o0Oooo.o00000.f46671OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new p464o0Oooo.o00000O0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$coin$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$coin$2\n*L\n155#1:557,8\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function0<MutableLiveData<Long>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f46729OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Long> invoke() {
            MutableLiveData<Long> mutableLiveData = new MutableLiveData<>(Long.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0Oo("coin")));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(p464o0Oooo.o00000O.f46777OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new p464o0Oooo.o00000OO(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$countryId$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$countryId$2\n*L\n167#1:557,8\n*E\n"})
    public static final class OooO0o extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f46730OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0OO("countryId", 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(p464o0Oooo.o0000Ooo.f46785OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new p464o0Oooo.o0000(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$crystal$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$crystal$2\n*L\n161#1:557,8\n*E\n"})
    public static final class OooOO0 extends Lambda implements Function0<MutableLiveData<Long>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f46731OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Long> invoke() {
            MutableLiveData<Long> mutableLiveData = new MutableLiveData<>(Long.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0Oo("crystal")));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(p464o0Oooo.o0000O0.f46781OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new p464o0Oooo.o0000O0O(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currBadgeRoundedImg$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currBadgeRoundedImg$2\n*L\n361#1:557,8\n*E\n"})
    public static final class OooOO0O extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f46732OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0o0("currBadgeRoundedImg", ""));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(p464o0Oooo.o000OO.f46795OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new p464o0Oooo.o0000O(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthBadgeLevel$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthBadgeLevel$2\n*L\n305#1:557,8\n*E\n"})
    public static final class OooOOO extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f46733OooO0Oo = new OooOOO();

        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0OO("currWealthBadgeLevel", 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(p464o0Oooo.o000O000.f46790OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new p464o0Oooo.o000O0o(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthBadgeImg$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthBadgeImg$2\n*L\n312#1:557,8\n*E\n"})
    public static final class OooOOO0 extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f46734OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0o0("currWealthBadgeImg", ""));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(p464o0Oooo.o0000OO0.f46784OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new p464o0Oooo.o000(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthCardImg$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthCardImg$2\n*L\n354#1:557,8\n*E\n"})
    public static final class OooOOOO extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOOO f46735OooO0Oo = new OooOOOO();

        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0o0("currWealthCardImg", ""));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(p464o0Oooo.o000Oo0.f46800OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new p464o0Oooo.o000O00(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthLevel$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthLevel$2\n*L\n291#1:557,8\n*E\n"})
    public static final class OooOo extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo f46736OooO0Oo = new OooOo();

        public OooOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0OO("currWealthLevel", 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(p464o0Oooo.o000O0Oo.f46793OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new p464o0Oooo.o000OO0O(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthExperience$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthExperience$2\n*L\n298#1:557,8\n*E\n"})
    public static final class OooOo00 extends Lambda implements Function0<MutableLiveData<Long>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo00 f46737OooO0Oo = new OooOo00();

        public OooOo00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Long> invoke() {
            MutableLiveData<Long> mutableLiveData = new MutableLiveData<>(Long.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0Oo("currWealthExperience")));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(p464o0Oooo.o000O00O.f46791OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new p464o0Oooo.o000O0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$fansNum$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$fansNum$2\n*L\n149#1:557,8\n*E\n"})
    public static final class Oooo0 extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo0 f46738OooO0Oo = new Oooo0();

        public Oooo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0OO("fanNum", 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o000OO00.f46796OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o000OOo0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthTextColor$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$currWealthTextColor$2\n*L\n347#1:557,8\n*E\n"})
    public static final class Oooo000 extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo000 f46739OooO0Oo = new Oooo000();

        public Oooo000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0o0("currWealthTextColor", "#00000000"));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o000O0O0.f46792OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o000O(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$tokenActivity$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$tokenActivity$2\n*L\n233#1:557,8\n*E\n"})
    public static final class o000 extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000 f46740OooO0Oo = new o000();

        public o000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            String str;
            p409o0Oo0o0o.o00Ooo o00oooOooO00o = p408o0Oo0o0O.o00Oo0.OooO00o();
            o00oooOooO00o.getClass();
            String strOooO0o0 = o00oooOooO00o.OooO0o0(String.valueOf(1552156712), "");
            if (StringsKt.isBlank(strOooO0o0)) {
                str = o00oooOooO00o.OooO0o0("tokenActivity", "");
                o00oooOooO00o.OooOO0("tokenActivity");
            } else {
                str = new String(AESKt.aesDecrypt$default(strOooO0o0, o0o0000.f56519OooO0O0, o0o0000.f56518OooO00o, false, null, 12, null), Charsets.UTF_8);
            }
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(str);
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0O000.f46828OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0O000O(mutableLiveData));
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
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (o000000O.f46723OoooOoO) {
                return;
            }
            o000000O.OooOoO();
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$nextWealthLevelExperience$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$nextWealthLevelExperience$2\n*L\n319#1:557,8\n*E\n"})
    public static final class o00000 extends Lambda implements Function0<MutableLiveData<Long>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00000 f46741OooO0Oo = new o00000();

        public o00000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Long> invoke() {
            MutableLiveData<Long> mutableLiveData = new MutableLiveData<>(Long.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0Oo("nextWealthLevelExperience")));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o00OO0OO.f46819OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oo0O(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.repository.Account$loadUserWealthLvInfo$1$1", f = "Account.kt", i = {}, l = {504}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000000 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f46742OooO0Oo;

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
            int i = this.f46742OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountRepo accountRepo = AccountRepo.f22858OooO00o;
                this.f46742OooO0Oo = 1;
                accountRepo.getClass();
                String str = p381o0OOoo0O.Oooo0.f44264OooOOo;
                obj = com.code.android.util.OooOOO.OooO0Oo(new AccountRepo$getUserWealthLvInfo$$inlined$call$1(o00oOoo.OooO00o(str, "url", str, 0), null), this);
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
                        o000000O o000000o2 = o000000O.f46674OooO00o;
                        o000000O.OooO0oO().postValue(Boxing.boxInt(userWealthLevelModel.getCurrWealthLevel()));
                        ((MutableLiveData) o000000O.f46713Oooo0oO.getValue()).postValue(Boxing.boxLong(userWealthLevelModel.getCurrWealthExperience()));
                        ((MutableLiveData) o000000O.f46714Oooo0oo.getValue()).postValue(Boxing.boxInt(userWealthLevelModel.getCurrWealthBadgeLevel()));
                        o000000O.OooO0o().postValue(userWealthLevelModel.getCurrWealthBadgeImg());
                        ((MutableLiveData) o000000O.f46717OoooO00.getValue()).postValue(Boxing.boxLong(userWealthLevelModel.getNextWealthLevelExperience()));
                        ((MutableLiveData) o000000O.f46716OoooO0.getValue()).postValue(Boxing.boxLong(userWealthLevelModel.getThisWealthLevelExperience()));
                        o000000O.OooOo().postValue(Boxing.boxBoolean(userWealthLevelModel.getIsShowWealthLevel()));
                        ((MutableLiveData) o000000O.f46715OoooO.getValue()).postValue(Boxing.boxBoolean(userWealthLevelModel.getIsWealthFullLevel()));
                    }
                }
                LiveEventBus.get("UserWealthLevel_Change").post(Boxing.boxBoolean(true));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o0Oooo.o000000O$o000000O, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$medal$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$medal$2\n*L\n191#1:557,8\n*E\n"})
    public static final class C0478o000000O extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final C0478o000000O f46743OooO0Oo = new C0478o000000O();

        public C0478o000000O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0o0("medal", ""));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o00OO00O.f46817OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o00OO0O0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$premium$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$premium$2\n*L\n129#1:557,8\n*E\n"})
    public static final class o00000O extends Lambda implements Function0<MutableLiveData<Pair<? extends Boolean, ? extends Integer>>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00000O f46744OooO0Oo = new o00000O();

        public o00000O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Pair<? extends Boolean, ? extends Integer>> invoke() {
            MutableLiveData<Pair<? extends Boolean, ? extends Integer>> mutableLiveData = new MutableLiveData<>(new Pair(Boolean.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0O0("vip", false)), Integer.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0OO("vipLevel", 0))));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o00OO.f46815OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o00OOO00(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o00000O0 extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00000O0 f46745OooO0Oo = new o00000O0();

        public o00000O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>(Boolean.FALSE);
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$region$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$region$2\n*L\n101#1:557,8\n*E\n"})
    public static final class o00000OO extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00000OO f46746OooO0Oo = new o00000OO();

        public o00000OO() {
            super(0);
        }

        /* JADX WARN: Code duplicated, block: B:52:0x0093  */
        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            int iOooO0OO;
            if (p408o0Oo0o0O.o00Oo0.OooO00o().OooO0OO("region", -1) == -1) {
                String strOooO0Oo = p591o0oo000O.OooO.OooO0Oo(com.code.android.util.o000O0.OooO00o());
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
                iOooO0OO = p408o0Oo0o0O.o00Oo0.OooO00o().OooO0OO("region", -1);
            }
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(iOooO0OO));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o00OOO0.f46820OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o00OOO0O(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$thisWealthLevelExperience$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$thisWealthLevelExperience$2\n*L\n326#1:557,8\n*E\n"})
    public static final class o0000O extends Lambda implements Function0<MutableLiveData<Long>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O f46747OooO0Oo = new o0000O();

        public o0000O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Long> invoke() {
            MutableLiveData<Long> mutableLiveData = new MutableLiveData<>(Long.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0Oo("thisWealthLevelExperience")));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0O0o.f46851OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o0000O0 extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O0 f46748OooO0Oo = new o0000O0();

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
        public final /* synthetic */ Function1 f46749OooO0Oo;

        public o0000O00(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f46749OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f46749OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f46749OooO0Oo;
        }

        public final int hashCode() {
            return this.f46749OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46749OooO0Oo.invoke(obj);
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$sign$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$sign$2\n*L\n218#1:557,8\n*E\n"})
    public static final class o0000O0O extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000O0O f46750OooO0Oo = new o0000O0O();

        public o0000O0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0o0("sign", ""));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0oOO.f46858OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0O00o0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$token$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$token$2\n*L\n228#1:557,8\n*E\n"})
    public static final class o0000OO0 extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000OO0 f46751OooO0Oo = new o0000OO0();

        public o0000OO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            String str;
            p409o0Oo0o0o.o00Ooo o00oooOooO00o = p408o0Oo0o0O.o00Oo0.OooO00o();
            o00oooOooO00o.getClass();
            String strOooO0o0 = o00oooOooO00o.OooO0o0(String.valueOf(110541305), "");
            if (StringsKt.isBlank(strOooO0o0)) {
                str = o00oooOooO00o.OooO0o0("token", "");
                o00oooOooO00o.OooOO0("token");
            } else {
                str = new String(AESKt.aesDecrypt$default(strOooO0o0, o0o0000.f56519OooO0O0, o0o0000.f56518OooO00o, false, null, 12, null), Charsets.UTF_8);
            }
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(str);
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0O00000.f46829OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0O0000O(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$role$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$role$2\n*L\n197#1:557,8\n*E\n"})
    public static final class o0000Ooo extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000Ooo f46752OooO0Oo = new o0000Ooo();

        public o0000Ooo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0OO("role", 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0o0Oo.f46855OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o00OOOO0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$sex$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$sex$2\n*L\n203#1:557,8\n*E\n"})
    public static final class o0000oo extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0000oo f46753OooO0Oo = new o0000oo();

        public o0000oo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0OO("sex", 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o00OOOOo.f46824OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o00Oo00(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$videoMuted$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$videoMuted$2\n*L\n248#1:557,8\n*E\n"})
    public static final class o000O0 extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000O0 f46754OooO0Oo = new o000O0();

        public o000O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0O0("videoMuted", true)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0O00O.f46834OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0O00OO(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o000O00 extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000O00 f46755OooO0Oo = new o000O00();

        public o000O00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            return new MutableLiveData<>(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0o0("userIdx", ""));
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$tokenChat$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$tokenChat$2\n*L\n238#1:557,8\n*E\n"})
    public static final class o000O000 extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000O000 f46756OooO0Oo = new o000O000();

        public o000O000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            String str;
            p409o0Oo0o0o.o00Ooo o00oooOooO00o = p408o0Oo0o0O.o00Oo0.OooO00o();
            o00oooOooO00o.getClass();
            String strOooO0o0 = o00oooOooO00o.OooO0o0(String.valueOf(140975345), "");
            if (StringsKt.isBlank(strOooO0o0)) {
                str = o00oooOooO00o.OooO0o0("tokenChat", "");
                o00oooOooO00o.OooOO0("tokenChat");
            } else {
                str = new String(AESKt.aesDecrypt$default(strOooO0o0, o0o0000.f56519OooO0O0, o0o0000.f56518OooO00o, false, null, 12, null), Charsets.UTF_8);
            }
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(str);
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0OoOoOo.f46854OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0O000Oo(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$userName$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$userName$2\n*L\n119#1:557,8\n*E\n"})
    public static final class o000O00O extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000O00O f46757OooO0Oo = new o000O00O();

        public o000O00O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0o0("userName", ""));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0OoO00O.f46853OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0O00O0o(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$visitorNum$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$visitorNum$2\n*L\n138#1:557,8\n*E\n"})
    public static final class o000O0Oo extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000O0Oo f46758OooO0Oo = new o000O0Oo();

        public o000O0Oo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0OO("visitorNum", 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0O00OOO.f46837OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0oO0Ooo(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$tokenRoom$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$tokenRoom$2\n*L\n243#1:557,8\n*E\n"})
    public static final class o000O0o extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000O0o f46759OooO0Oo = new o000O0o();

        public o000O0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            String str;
            p409o0Oo0o0o.o00Ooo o00oooOooO00o = p408o0Oo0o0O.o00Oo0.OooO00o();
            o00oooOooO00o.getClass();
            String strOooO0o0 = o00oooOooO00o.OooO0o0(String.valueOf(141429364), "");
            if (StringsKt.isBlank(strOooO0o0)) {
                str = o00oooOooO00o.OooO0o0("tokenRoom", "");
                o00oooOooO00o.OooOO0("tokenRoom");
            } else {
                str = new String(AESKt.aesDecrypt$default(strOooO0o0, o0o0000.f56519OooO0O0, o0o0000.f56518OooO00o, false, null, 12, null), Charsets.UTF_8);
            }
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(str);
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0O000o0.f46833OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0O00(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$tag$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$tag$2\n*L\n213#1:557,8\n*E\n"})
    public static final class o000OO extends Lambda implements Function0<MutableLiveData<List<UserInfo.TagInfo>>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000OO f46760OooO0Oo = new o000OO();

        public o000OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<List<UserInfo.TagInfo>> invoke() {
            Object arrayList = (List) oOo00OO0.OooO0O0(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0o0(ViewHierarchyConstants.TAG_KEY, ""), new TypeToken<List<UserInfo.TagInfo>>() { // from class: com.yalla.yalla.data.sp.table.AccountSpTable$tag$1
            }.getType());
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            MutableLiveData<List<UserInfo.TagInfo>> mutableLiveData = new MutableLiveData<>(arrayList);
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oo00oO.f46862OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o0oOOo(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o000OO0O extends Lambda implements Function0<o0O00o00> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000OO0O f46761OooO0Oo = new o000OO0O();

        public o000OO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O00o00 invoke() {
            p409o0Oo0o0o.o0O0O00 o0o0o00OooO0o0 = p408o0Oo0o0O.o00Oo0.OooO0o0();
            o0o0o00OooO0o0.getClass();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            return new o0O00o00(o0o0o00OooO0o0.OooO0O0("welcome" + o000000O.OooOOo0().getValue(), false));
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.repository.Account$loadMyRoomInfo$1", f = "Account.kt", i = {}, l = {465}, m = "invokeSuspend", n = {}, s = {})
    public static final class o000OOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f46762OooO0Oo;

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
            int i = this.f46762OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0O0O0o0 o0o0o0o0 = o0O0O0o0.f46843OooO00o;
                this.f46762OooO0Oo = 1;
                o0o0o0o0.getClass();
                obj = BuildersKt.withContext(Dispatchers.getIO(), new CommonRepository$loadMyRoomInfo$$inlined$call$1(o0o0o0o0, null), this);
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
                p480o0o000Oo.o0OOO0o o0ooo0oOooO0O0 = com.android.billingclient.api.o0000OO0.OooO0O0();
                o000000O o000000o2 = o000000O.f46674OooO00o;
                o0ooo0oOooO0O0.OooO0o("HAS_ROOM" + o000000O.OooOOo0().getValue(), true);
                List list = (List) response.getData();
                if (!(list == null || list.isEmpty())) {
                    o000000O.f46724OoooOoo.postValue(list.get(0));
                    com.android.billingclient.api.o0000OO0.OooO0O0().OooO0o0(p101o000oo.Oooo000.OooO00o("MY_ROOM_BARID", o000000O.OooOOo0().getValue()), ((RoomIndexModel) list.get(0)).barid);
                }
                o000000O.f46723OoooOoO = true;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000Oo0 extends Lambda implements Function0<MutableLiveData<Long>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000Oo0 f46763OooO0Oo = new o000Oo0();

        public o000Oo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Long> invoke() {
            long jOooO;
            p409o0Oo0o0o.o00Ooo o00oooOooO00o = p408o0Oo0o0O.o00Oo0.OooO00o();
            o00oooOooO00o.getClass();
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.element = -1L;
            try {
                Result.Companion companion = Result.INSTANCE;
                String strOooO0o0 = o00oooOooO00o.OooO0o0(String.valueOf(-836030906), "");
                if (StringsKt.isBlank(strOooO0o0)) {
                    jOooO = o00oooOooO00o.OooO0Oo("userId");
                    o00oooOooO00o.OooOO0("userId");
                } else {
                    jOooO = com.code.android.util.o0OoOo0.OooO(0L, new String(AESKt.aesDecrypt$default(strOooO0o0, o0o0000.f56519OooO0O0, o0o0000.f56518OooO00o, false, null, 12, null), Charsets.UTF_8));
                }
                longRef.element = jOooO;
                Result.m4213constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m4213constructorimpl(ResultKt.createFailure(th));
            }
            return new MutableLiveData<>(Long.valueOf(longRef.element));
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$followingNum$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$followingNum$2\n*L\n143#1:557,8\n*E\n"})
    public static final class o000oOoO extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000oOoO f46764OooO0Oo = new o000oOoO();

        public o000oOoO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0OO("followingNum", 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o00.f46668OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o00O0000(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$headerUrl$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$headerUrl$2\n*L\n107#1:557,8\n*E\n"})
    public static final class o00O0O extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00O0O f46765OooO0Oo = new o00O0O();

        public o00O0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0o0("headerUrl", ""));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o00O000.f46803OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o00O000o(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$idLevel$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$idLevel$2\n*L\n179#1:557,8\n*E\n"})
    public static final class o00Oo0 extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00Oo0 f46766OooO0Oo = new o00Oo0();

        public o00Oo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0OO("isPrettyId", 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o00O00.f46802OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o00O00O(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o00Ooo extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00Ooo f46767OooO0Oo = new o00Ooo();

        public o00Ooo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>(null);
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$isBlackUser$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$isBlackUser$2\n*L\n284#1:557,8\n*E\n"})
    public static final class o00oO0o extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00oO0o f46768OooO0Oo = new o00oO0o();

        public o00oO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0O0("isBlackUser", false)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o00O00o0.f46808OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oo00o(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$level$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$level$2\n*L\n185#1:557,8\n*E\n"})
    public static final class o0O0O00 extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0O0O00 f46769OooO0Oo = new o0O0O00();

        public o0O0O00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0OO("isPrettyId", 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o00O.f46801OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o00OO000(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$isWealthFullLevel$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$isWealthFullLevel$2\n*L\n340#1:557,8\n*E\n"})
    public static final class o0OO00O extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0OO00O f46770OooO0Oo = new o0OO00O();

        public o0OO00O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0O0("isWealthFullLevel", false)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(oo0o0O0.f46864OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o00O0OO(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$isNewUser$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$isNewUser$2\n*L\n173#1:557,8\n*E\n"})
    public static final class o0OOO0o extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0OOO0o f46771OooO0Oo = new o0OOO0o();

        public o0OOO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0O0("isNewUser", false)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o00O0O00.f46810OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o00O0O0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$isShowWealthLevel$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$isShowWealthLevel$2\n*L\n333#1:557,8\n*E\n"})
    public static final class o0Oo0oo extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0Oo0oo f46772OooO0Oo = new o0Oo0oo();

        public o0Oo0oo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0O0("isShowWealthLevel", false)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o00O0O0O.f46811OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o00O0OO0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$headerFrameUrl$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$headerFrameUrl$2\n*L\n113#1:557,8\n*E\n"})
    public static final class o0OoOo0 extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0OoOo0 f46773OooO0Oo = new o0OoOo0();

        public o0OoOo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0o0("headerFrameUrl", ""));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o0O0ooO.f46852OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new o00oOoo(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function0<o00O0> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0ooOOo f46774OooO0Oo = new o0ooOOo();

        public o0ooOOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O0 invoke() {
            return new o00O0(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0O0("isLogin", false));
        }
    }

    public static final class oo000o extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final oo000o f46775OooO0Oo = new oo000o();

        public oo000o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>(Boolean.FALSE);
        }
    }

    @SourceDebugExtension({"SMAP\nAccount.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$kaVipStateAndLevel$2\n+ 2 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,556:1\n7#2,8:557\n*S KotlinDebug\n*F\n+ 1 Account.kt\ncom/yalla/yalla/repository/Account$kaVipStateAndLevel$2\n*L\n258#1:557,8\n*E\n"})
    public static final class oo0o0Oo extends Lambda implements Function0<MutableLiveData<Pair<? extends Integer, ? extends Integer>>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final oo0o0Oo f46776OooO0Oo = new oo0o0Oo();

        public oo0o0Oo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Pair<? extends Integer, ? extends Integer>> invoke() {
            MutableLiveData<Pair<? extends Integer, ? extends Integer>> mutableLiveData = new MutableLiveData<>(new Pair(Integer.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0OO("kaVipState", 0)), Integer.valueOf(p408o0Oo0o0O.o00Oo0.OooO00o().OooO0OO("kaVipLevel", 0))));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(new o0000O00(o00O0OOO.f46814OooO0Oo));
            } else {
                new Handler(Looper.getMainLooper()).post(new oo0oOO0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @NotNull
    public static MutableLiveData OooO() {
        return (MutableLiveData) f46681OooO0oo.getValue();
    }

    @NotNull
    public static MutableLiveData OooO0O0() {
        return (MutableLiveData) f46687OooOOOO.getValue();
    }

    @NotNull
    public static MutableLiveData OooO0OO() {
        return (MutableLiveData) f46690OooOOo0.getValue();
    }

    @NotNull
    public static MutableLiveData OooO0Oo() {
        return (MutableLiveData) f46688OooOOOo.getValue();
    }

    @NotNull
    public static MutableLiveData OooO0o() {
        return (MutableLiveData) f46704Oooo.getValue();
    }

    @NotNull
    public static MutableLiveData OooO0o0() {
        return (MutableLiveData) f46720OoooOOO.getValue();
    }

    @NotNull
    public static MutableLiveData OooO0oO() {
        return (MutableLiveData) f46711Oooo0o.getValue();
    }

    @NotNull
    public static MutableLiveData OooO0oo() {
        return (MutableLiveData) f46673OooO.getValue();
    }

    @NotNull
    public static MutableLiveData OooOO0() {
        return (MutableLiveData) f46707Oooo00O.getValue();
    }

    @NotNull
    public static MutableLiveData OooOO0O() {
        return (MutableLiveData) f46693OooOo0.getValue();
    }

    @NotNull
    public static MutableLiveData OooOO0o() {
        return (MutableLiveData) f46683OooOO0O.getValue();
    }

    @NotNull
    public static MutableLiveData OooOOO() {
        return (MutableLiveData) f46696OooOo0o.getValue();
    }

    @NotNull
    public static MutableLiveData OooOOO0() {
        return (MutableLiveData) f46680OooO0oO.getValue();
    }

    @NotNull
    public static MutableLiveData OooOOOO() {
        return (MutableLiveData) f46701OooOoo0.getValue();
    }

    @NotNull
    public static MutableLiveData OooOOOo() {
        return (MutableLiveData) f46702OooOooO.getValue();
    }

    @NotNull
    public static MutableLiveData OooOOo() {
        return (MutableLiveData) f46678OooO0o.getValue();
    }

    @NotNull
    public static MutableLiveData OooOOo0() {
        return (MutableLiveData) f46679OooO0o0.getValue();
    }

    @NotNull
    public static MutableLiveData OooOOoo() {
        return (MutableLiveData) f46682OooOO0.getValue();
    }

    @NotNull
    public static MutableLiveData OooOo() {
        return (MutableLiveData) f46718OoooO0O.getValue();
    }

    @NotNull
    public static MutableLiveData OooOo0() {
        return (MutableLiveData) f46710Oooo0OO.getValue();
    }

    @NotNull
    public static MutableLiveData OooOo00() {
        return (MutableLiveData) f46705Oooo0.getValue();
    }

    @NotNull
    public static MutableLiveData OooOo0O() {
        return (MutableLiveData) f46675OooO0O0.getValue();
    }

    @NotNull
    public static MutableLiveData OooOo0o() {
        return (MutableLiveData) f46689OooOOo.getValue();
    }

    public static void OooOoO() {
        if (Intrinsics.areEqual(OooOo0O().getValue(), Boolean.FALSE)) {
            f46723OoooOoO = true;
        } else {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new o000OOo(null), 3, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean OooOoO0() {
        return ((Boolean) f46722OoooOo0.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooOoOO() {
        if (((Long) OooOOo0().getValue()) == null || !Intrinsics.areEqual(OooOo0O().getValue(), Boolean.TRUE)) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new o000000(null), 3, null);
    }

    public static void OooOoo(boolean z, @Nullable MyUserInfoModel myUserInfoModel) {
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
        ((MutableLiveData) f46691OooOOoo.getValue()).setValue(myUserInfoModel != null ? Integer.valueOf(myUserInfoModel.getIdLevel()) : 0);
        ((MutableLiveData) f46694OooOo00.getValue()).setValue(myUserInfoModel != null ? Integer.valueOf(myUserInfoModel.getUserLevel()) : 0);
        MutableLiveData mutableLiveDataOooOO0O = OooOO0O();
        if (myUserInfoModel == null || (medal = myUserInfoModel.getMedal()) == null) {
            medal = "";
        }
        mutableLiveDataOooOO0O.setValue(medal);
        ((MutableLiveData) f46695OooOo0O.getValue()).setValue(myUserInfoModel != null ? Integer.valueOf(myUserInfoModel.getRole()) : 0);
        OooOOO().setValue(Integer.valueOf(myUserInfoModel != null ? myUserInfoModel.getSex() : 2));
        MutableLiveData mutableLiveData = (MutableLiveData) f46692OooOo.getValue();
        if (myUserInfoModel == null || (background = myUserInfoModel.getBackground()) == null) {
            background = "";
        }
        mutableLiveData.setValue(background);
        MutableLiveData mutableLiveData2 = (MutableLiveData) f46698OooOoO0.getValue();
        if (myUserInfoModel == null || (arrayList = myUserInfoModel.getTags()) == null) {
            arrayList = new ArrayList<>();
        }
        mutableLiveData2.setValue(arrayList);
        MutableLiveData mutableLiveData3 = (MutableLiveData) f46697OooOoO.getValue();
        if (myUserInfoModel == null || (bio = myUserInfoModel.getBio()) == null) {
            bio = "";
        }
        mutableLiveData3.setValue(bio);
        MutableLiveData mutableLiveData4 = (MutableLiveData) f46699OooOoOO.getValue();
        if (myUserInfoModel == null || (birthday = myUserInfoModel.getBirthday()) == null) {
            birthday = "";
        }
        mutableLiveData4.setValue(birthday);
        ((MutableLiveData) f46685OooOOO.getValue()).setValue(myUserInfoModel != null ? Integer.valueOf(myUserInfoModel.getFansNum()) : 0);
        ((MutableLiveData) f46686OooOOO0.getValue()).setValue(myUserInfoModel != null ? Integer.valueOf(myUserInfoModel.getFollowedNum()) : 0);
        ((MutableLiveData) f46684OooOO0o.getValue()).setValue(myUserInfoModel != null ? Integer.valueOf(myUserInfoModel.getVisitorNum()) : 0);
        OooOO0().setValue(new Pair(Integer.valueOf(myUserInfoModel != null ? myUserInfoModel.getVipState() : 0), Integer.valueOf(myUserInfoModel != null ? myUserInfoModel.getVipLevel() : 0)));
        ((MutableLiveData) f46708Oooo00o.getValue()).setValue(new Pair(Boolean.valueOf(myUserInfoModel != null ? myUserInfoModel.getCoinFrozen() : false), Integer.valueOf(myUserInfoModel != null ? myUserInfoModel.getDebtAmount() : 0)));
        MutableLiveData mutableLiveDataOooOo0 = OooOo0();
        T value = OooOo0O().getValue();
        Boolean boolValueOf = Boolean.TRUE;
        if (Intrinsics.areEqual(value, boolValueOf)) {
            boolValueOf = Boolean.valueOf(myUserInfoModel != null ? myUserInfoModel.getIsBindPhone() : true);
        }
        mutableLiveDataOooOo0.setValue(boolValueOf);
        ((MutableLiveData) f46712Oooo0o0.getValue()).setValue(myUserInfoModel != null ? Boolean.valueOf(myUserInfoModel.getIsBlackUser()) : Boolean.FALSE);
        f46722OoooOo0.setValue(Boolean.valueOf(myUserInfoModel != null && myUserInfoModel.getIsWhiteCountry()));
        if (z) {
            OooOo00().postValue(null);
        }
        if ((myUserInfoModel != null) && !z) {
            OooOOO0().setValue(myUserInfoModel != null ? Integer.valueOf(myUserInfoModel.getRegion()) : 0);
        }
        MutableLiveData mutableLiveData5 = (MutableLiveData) f46719OoooOO0.getValue();
        if (myUserInfoModel == null || (wealthMyInfoTextColour = myUserInfoModel.getWealthMyInfoTextColour()) == null) {
            wealthMyInfoTextColour = "";
        }
        mutableLiveData5.postValue(wealthMyInfoTextColour);
        MutableLiveData mutableLiveData6 = (MutableLiveData) f46725o000oOoO.getValue();
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
        p592o0oo00O.OooOOO0.OooO0O0("saveUser user = ".concat(p140o00OOooo.OooOO0.OooO00o(myUserInfoModel)));
    }

    public static void OooOoo0(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        MutableLiveData mutableLiveDataOooOOOO = OooOOOO();
        if (str == null) {
            str = "";
        }
        mutableLiveDataOooOOOO.setValue(str);
        MutableLiveData mutableLiveData = (MutableLiveData) f46700OooOoo.getValue();
        if (str2 == null) {
            str2 = "";
        }
        mutableLiveData.setValue(str2);
        MutableLiveData mutableLiveDataOooOOOo = OooOOOo();
        if (str3 == null) {
            str3 = "";
        }
        mutableLiveDataOooOOOo.setValue(str3);
        MutableLiveData mutableLiveData2 = (MutableLiveData) f46703OooOooo.getValue();
        if (str4 == null) {
            str4 = "";
        }
        mutableLiveData2.setValue(str4);
    }

    public final void OooO00o() {
        OooOoo(false, null);
        OooOoo0("", "", "", "");
        MutableLiveData mutableLiveDataOooOo0O = OooOo0O();
        Boolean bool = Boolean.FALSE;
        mutableLiveDataOooOo0O.postValue(bool);
        f46724OoooOoo.postValue(null);
        ((MutableLiveData) f46721OoooOOo.getValue()).postValue(bool);
    }
}
