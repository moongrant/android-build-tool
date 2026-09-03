package p498o0o00Oo0;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.app.base.model.RoomIndexModel;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.common.repository.CommonRepository$loadMyRoomInfo$$inlined$call$1;
import com.yalla.yalla.model.UserReturnRewardModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Result;
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
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p166o00OoOoo.o0O00O0o;
import p640o0ooO0oO.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooOOO {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static boolean f41218OooO0OO;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public static boolean f41250Oooo0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOOO f41216OooO00o = new OooOOO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Lazy f41217OooO0O0 = LazyKt.lazy(Oooo000.f41265Oooo0o);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f41219OooO0Oo = LazyKt.lazy(o00000O0.f41270Oooo0o);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final Lazy f41221OooO0o0 = LazyKt.lazy(o00000O.f41269Oooo0o);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f41220OooO0o = LazyKt.lazy(o00oO0o.f41278Oooo0o);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final Lazy f41222OooO0oO = LazyKt.lazy(C0394OooOOO.f41259Oooo0o);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final Lazy f41223OooO0oo = LazyKt.lazy(OooOOO0.f41260Oooo0o);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final Lazy f41215OooO = LazyKt.lazy(o00000OO.f41271Oooo0o);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public static final Lazy f41224OooOO0 = LazyKt.lazy(oo000o.f41284Oooo0o);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public static final Lazy f41225OooOO0O = LazyKt.lazy(OooOO0O.f41258Oooo0o);

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f41226OooOO0o = LazyKt.lazy(OooO0OO.f41255Oooo0o);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public static final Lazy f41228OooOOO0 = LazyKt.lazy(OooOO0.f41257Oooo0o);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public static final Lazy f41227OooOOO = LazyKt.lazy(OooO0o.f41256Oooo0o);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public static final Lazy f41229OooOOOO = LazyKt.lazy(Oooo0.f41264Oooo0o);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public static final Lazy f41230OooOOOo = LazyKt.lazy(OooOOOO.f41261Oooo0o);

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public static final Lazy f41232OooOOo0 = LazyKt.lazy(o0OoOo0.f41282Oooo0o);

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public static final Lazy f41231OooOOo = LazyKt.lazy(o00Oo0.f41276Oooo0o);

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public static final Lazy f41233OooOOoo = LazyKt.lazy(o0ooOOo.f41283Oooo0o);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public static final Lazy f41236OooOo00 = LazyKt.lazy(o0Oo0oo.f41281Oooo0o);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public static final Lazy f41235OooOo0 = LazyKt.lazy(OooO.f41252Oooo0o);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public static final Lazy f41237OooOo0O = LazyKt.lazy(o0O0O00.f41279Oooo0o);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public static final Lazy f41238OooOo0o = LazyKt.lazy(oo0o0Oo.f41285Oooo0o);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public static final Lazy f41234OooOo = LazyKt.lazy(OooO0O0.f41254Oooo0o);

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public static final Lazy f41240OooOoO0 = LazyKt.lazy(o000OOo.f41273Oooo0o);

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public static final Lazy f41239OooOoO = LazyKt.lazy(o000000.f41267Oooo0o);

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public static final Lazy f41241OooOoOO = LazyKt.lazy(o000000O.f41268Oooo0o);

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public static final Lazy f41243OooOoo0 = LazyKt.lazy(o00000.f41266Oooo0o);

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public static final Lazy f41242OooOoo = LazyKt.lazy(o000oOoO.f41274Oooo0o);

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public static final Lazy f41244OooOooO = LazyKt.lazy(OooO00o.f41253Oooo0o);

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public static final Lazy f41245OooOooo = LazyKt.lazy(OooOo00.f41263Oooo0o);

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @NotNull
    public static final Lazy f41247Oooo000 = LazyKt.lazy(o00Ooo.f41277Oooo0o);

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @NotNull
    public static final Lazy f41248Oooo00O = LazyKt.lazy(OooOo.f41262Oooo0o);

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f41249Oooo00o = LazyKt.lazy(o0OO00O.f41280Oooo0o);

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @NotNull
    public static final Lazy f41246Oooo0 = LazyKt.lazy(o0000Ooo.f41272Oooo0o);

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @NotNull
    public static MutableLiveData<RoomIndexModel> f41251Oooo0OO = new o0OOO0o();

    public static final class OooO extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO f41252Oooo0o = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(o00o0oOooO00o.OooO0Oo(o000O0O0.OooO00o(-20675144424976L), o000O0O0.OooO00o(-20700914228752L)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(p498o0o00Oo0.o0OoOo0.f41357OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new p498o0o00Oo0.o00O0O(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<MutableLiveData<Pair<? extends Boolean, ? extends Integer>>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f41253Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Pair<? extends Boolean, ? extends Integer>> invoke() {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            Boolean boolValueOf = Boolean.valueOf(o00o0oOooO00o.OooO00o(o000O0O0.OooO00o(-23844830289424L), false));
            p499o0o00OoO.o00O0O o00o0oOooO00o2 = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o2);
            MutableLiveData<Pair<? extends Boolean, ? extends Integer>> mutableLiveData = new MutableLiveData<>(new Pair(boolValueOf, Integer.valueOf(o00o0oOooO00o2.OooO0O0(o000O0O0.OooO00o(-23956499439120L), 0))));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(p498o0o00Oo0.OooOO0O.f41214OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new p498o0o00Oo0.OooOOO0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f41254Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p497o0o00Oo.OooOOO0.OooO00o().OooOO0o());
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(p498o0o00Oo0.OooOOOO.f41287OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new p498o0o00Oo0.OooOo00(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<MutableLiveData<Long>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f41255Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Long> invoke() {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            MutableLiveData<Long> mutableLiveData = new MutableLiveData<>(Long.valueOf(o00o0oOooO00o.OooO0OO(o000O0O0.OooO00o(-20086733905424L))));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(p498o0o00Oo0.OooOo.f41288OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new p498o0o00Oo0.Oooo000(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f41256Oooo0o = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(o00o0oOooO00o.OooO0O0(o000O0O0.OooO00o(-20129683578384L), 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(p498o0o00Oo0.Oooo0.f41290OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new p498o0o00Oo0.o000oOoO(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<MutableLiveData<Long>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0 f41257Oooo0o = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Long> invoke() {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            MutableLiveData<Long> mutableLiveData = new MutableLiveData<>(Long.valueOf(o00o0oOooO00o.OooO0OO(o000O0O0.OooO00o(-20215582924304L))));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(p498o0o00Oo0.o00Oo0.f41348OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new p498o0o00Oo0.o00Ooo(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0O f41258Oooo0o = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(o00o0oOooO00o.OooO0O0(o000O0O0.OooO00o(-20026604363280L), 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(p498o0o00Oo0.oo000o.f41359OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new p498o0o00Oo0.o00oO0o(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    /* JADX INFO: renamed from: o0o00Oo0.OooOOO$OooOOO, reason: collision with other inner class name */
    public static final class C0394OooOOO extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final C0394OooOOO f41259Oooo0o = new C0394OooOOO();

        public C0394OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(o00o0oOooO00o.OooO0Oo(o000O0O0.OooO00o(-19640057306640L), o000O0O0.OooO00o(-19683006979600L)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(p498o0o00Oo0.o0Oo0oo.f41356OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new p498o0o00Oo0.o0OO00O(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOO0 f41260Oooo0o = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(o00o0oOooO00o.OooO0Oo(o000O0O0.OooO00o(-19756021423632L), o000O0O0.OooO00o(-19820445933072L)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(p498o0o00Oo0.o0ooOOo.f41358OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new p498o0o00Oo0.o0OOO0o(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOOOO f41261Oooo0o = new OooOOOO();

        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(o00o0oOooO00o.OooO0O0(o000O0O0.OooO00o(-20370201746960L), 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(p498o0o00Oo0.oo0o0Oo.f41364OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new p498o0o00Oo0.o0O0O00(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class OooOo extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOo f41262Oooo0o = new OooOo();

        public OooOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>(Boolean.FALSE);
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOo00 f41263Oooo0o = new OooOo00();

        public OooOo00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>(null);
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final Oooo0 f41264Oooo0o = new Oooo0();

        public Oooo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>(Boolean.valueOf(o00o0oOooO00o.OooO00o(o000O0O0.OooO00o(-20284302401040L), false)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(p498o0o00Oo0.o000000.f41296OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new p498o0o00Oo0.o000000O(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<p498o0o00Oo0.o000OOo> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final Oooo000 f41265Oooo0o = new Oooo000();

        public Oooo000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p498o0o00Oo0.o000OOo invoke() {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            return new p498o0o00Oo0.o000OOo(o00o0oOooO00o.OooO00o(o000O0O0.OooO00o(-19064531688976L), false));
        }
    }

    public static final class o00000 extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o00000 f41266Oooo0o = new o00000();

        public o00000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            String strOooO00o;
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            String strOooO0Oo = o00o0oOooO00o.OooO0Oo(String.valueOf(o000O0O0.OooO00o(-21581382524432L).hashCode()), o000O0O0.OooO00o(-21624332197392L));
            if (StringsKt.isBlank(strOooO0Oo)) {
                strOooO00o = o00o0oOooO00o.OooO0Oo(o000O0O0.OooO00o(-21628627164688L), o000O0O0.OooO00o(-21671576837648L));
                o00o0oOooO00o.OooOO0(o000O0O0.OooO00o(-21675871804944L));
            } else {
                strOooO00o = p168o00Ooo0.OooOOOO.OooO00o(strOooO0Oo);
                Intrinsics.checkNotNullExpressionValue(strOooO00o, o000O0O0.OooO00o(-21718821477904L));
            }
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(strOooO00o);
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(o000OO00.f41317OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new o000OOo0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o000000 extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o000000 f41267Oooo0o = new o000000();

        public o000000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            String strOooO00o;
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            String strOooO0Oo = o00o0oOooO00o.OooO0Oo(String.valueOf(o000O0O0.OooO00o(-22878462647824L).hashCode()), o000O0O0.OooO00o(-22938592189968L));
            if (StringsKt.isBlank(strOooO0Oo)) {
                strOooO00o = o00o0oOooO00o.OooO0Oo(o000O0O0.OooO00o(-22942887157264L), o000O0O0.OooO00o(-23003016699408L));
                o00o0oOooO00o.OooOO0(o000O0O0.OooO00o(-23007311666704L));
            } else {
                strOooO00o = p168o00Ooo0.OooOOOO.OooO00o(strOooO0Oo);
                Intrinsics.checkNotNullExpressionValue(strOooO00o, o000O0O0.OooO00o(-23067441208848L));
            }
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(strOooO00o);
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(o000O0Oo.f41314OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new o000OO0O(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o000000O extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o000000O f41268Oooo0o = new o000000O();

        public o000000O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            String strOooO00o;
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            String strOooO0Oo = o00o0oOooO00o.OooO0Oo(String.valueOf(o000O0O0.OooO00o(-22229922586128L).hashCode()), o000O0O0.OooO00o(-22272872259088L));
            if (StringsKt.isBlank(strOooO0Oo)) {
                strOooO00o = o00o0oOooO00o.OooO0Oo(o000O0O0.OooO00o(-22277167226384L), o000O0O0.OooO00o(-22320116899344L));
                o00o0oOooO00o.OooOO0(o000O0O0.OooO00o(-22324411866640L));
            } else {
                strOooO00o = p168o00Ooo0.OooOOOO.OooO00o(strOooO0Oo);
                Intrinsics.checkNotNullExpressionValue(strOooO00o, o000O0O0.OooO00o(-22367361539600L));
            }
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(strOooO00o);
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(o000O0O0.f41313OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new o000O(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o00000O extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o00000O f41269Oooo0o = new o00000O();

        public o00000O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(o00o0oOooO00o.OooO0Oo(o000O0O0.OooO00o(-19433898876432L), o000O0O0.OooO00o(-19468258614800L)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(o0O0ooO.f41353OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new o00oOoo(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o00000O0 extends Lambda implements Function0<MutableLiveData<Long>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o00000O0 f41270Oooo0o = new o00000O0();

        public o00000O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Long> invoke() {
            long jOooO0oO;
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            Ref.LongRef longRef = new Ref.LongRef();
            longRef.element = -1L;
            try {
                Result.Companion companion = Result.INSTANCE;
                String strOooO0Oo = o00o0oOooO00o.OooO0Oo(String.valueOf(o000O0O0.OooO00o(-19133251165712L).hashCode()), o000O0O0.OooO00o(-19163315936784L));
                if (StringsKt.isBlank(strOooO0Oo)) {
                    jOooO0oO = o00o0oOooO00o.OooO0OO(o000O0O0.OooO00o(-19167610904080L));
                    o00o0oOooO00o.OooOO0(o000O0O0.OooO00o(-19197675675152L));
                } else {
                    String strOooO00o = p168o00Ooo0.OooOOOO.OooO00o(strOooO0Oo);
                    Intrinsics.checkNotNullExpressionValue(strOooO00o, o000O0O0.OooO00o(-19227740446224L));
                    jOooO0oO = com.yalla.support.common.util.OooO.OooO0oO(strOooO00o);
                }
                longRef.element = jOooO0oO;
                Result.m502constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m502constructorimpl(ResultKt.createFailure(th));
            }
            MutableLiveData<Long> mutableLiveData = new MutableLiveData<>(Long.valueOf(longRef.element));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(o00.f41292OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new o00O0000(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o00000OO extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o00000OO f41271Oooo0o = new o00000OO();

        public o00000OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(o00o0oOooO00o.OooO0Oo(o000O0O0.OooO00o(-19532683124240L), o000O0O0.OooO00o(-19571337829904L)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(o00O000.f41322OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new o00O000o(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o0000Ooo extends Lambda implements Function0<MutableLiveData<UserReturnRewardModel>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o0000Ooo f41272Oooo0o = new o0000Ooo();

        public o0000Ooo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<UserReturnRewardModel> invoke() {
            return new MutableLiveData<>(null);
        }
    }

    public static final class o000OOo extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o000OOo f41273Oooo0o = new o000OOo();

        public o000OOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            String strOooO00o;
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            String strOooO0Oo = o00o0oOooO00o.OooO0Oo(String.valueOf(o000O0O0.OooO00o(-21001561939472L).hashCode()), o000O0O0.OooO00o(-21027331743248L));
            if (StringsKt.isBlank(strOooO0Oo)) {
                strOooO00o = o00o0oOooO00o.OooO0Oo(o000O0O0.OooO00o(-21031626710544L), o000O0O0.OooO00o(-21057396514320L));
                o00o0oOooO00o.OooOO0(o000O0O0.OooO00o(-21061691481616L));
            } else {
                strOooO00o = p168o00Ooo0.OooOOOO.OooO00o(strOooO0Oo);
                Intrinsics.checkNotNullExpressionValue(strOooO00o, o000O0O0.OooO00o(-21087461285392L));
            }
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(strOooO00o);
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(o000O00O.f41312OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new o000O0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<MutableLiveData<Pair<? extends Integer, ? extends Integer>>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o000oOoO f41274Oooo0o = new o000oOoO();

        public o000oOoO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Pair<? extends Integer, ? extends Integer>> invoke() {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            Integer numValueOf = Integer.valueOf(o00o0oOooO00o.OooO0O0(o000O0O0.OooO00o(-23655851728400L), 0));
            p499o0o00OoO.o00O0O o00o0oOooO00o2 = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o2);
            MutableLiveData<Pair<? extends Integer, ? extends Integer>> mutableLiveData = new MutableLiveData<>(new Pair(numValueOf, Integer.valueOf(o00o0oOooO00o2.OooO0O0(o000O0O0.OooO00o(-23750341008912L), 0))));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(p498o0o00Oo0.o00000.f41295OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new p498o0o00Oo0.o00000O0(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.repository.Account$loadMyRoomInfo$1", f = "Account.kt", i = {}, l = {317}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00O0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f41275Oooo0o;

        public o00O0O(Continuation<? super o00O0O> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o00O0O(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new o00O0O(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f41275Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00O00o0 o00o00o1 = o00O00o0.f41325OooO00o;
                this.f41275Oooo0o = 1;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new CommonRepository$loadMyRoomInfo$$inlined$call$1(o00o00o1, null), this);
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
                o0O00O0o o0o00o0oOooO0O0 = com.android.billingclient.api.o00000O.OooO0O0();
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("HAS_ROOM");
                OooOOO oooOOO = OooOOO.f41216OooO00o;
                sbOooO0o0.append(oooOOO.OooOo().getValue());
                o0o00o0oOooO0O0.OooO0oo(sbOooO0o0.toString(), true);
                List list = (List) response.getData();
                if (!(list == null || list.isEmpty())) {
                    OooOOO.f41251Oooo0OO.postValue((RoomIndexModel) list.get(0));
                    o0O00O0o o0o00o0oOooO0O1 = com.android.billingclient.api.o00000O.OooO0O0();
                    StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("MY_ROOM_BARID");
                    sbOooO0o1.append(oooOOO.OooOo().getValue());
                    o0o00o0oOooO0O1.OooO0oO(sbOooO0o1.toString(), ((RoomIndexModel) list.get(0)).barid);
                }
                OooOOO.f41250Oooo0O0 = true;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o00Oo0 f41276Oooo0o = new o00Oo0();

        public o00Oo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(o00o0oOooO00o.OooO0Oo(o000O0O0.OooO00o(-20516230635024L), o000O0O0.OooO00o(-20542000438800L)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(p498o0o00Oo0.o0000Ooo.f41306OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new o0000(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o00Ooo extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o00Ooo f41277Oooo0o = new o00Ooo();

        public o00Ooo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>(Boolean.FALSE);
        }
    }

    public static final class o00oO0o extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o00oO0o f41278Oooo0o = new o00oO0o();

        public o00oO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            int iOooO0O0 = 6;
            if (o00o0oOooO00o.OooO0O0(o000O0O0.OooO00o(-23595722186256L), -1) == -1) {
                String strOooO0Oo = p168o00Ooo0.oo000o.OooO0Oo();
                Objects.requireNonNull(strOooO0Oo);
                strOooO0Oo.hashCode();
                switch (strOooO0Oo) {
                    case "ar":
                        iOooO0O0 = 1;
                        break;
                    case "es":
                        break;
                    case "hi":
                        iOooO0O0 = 7;
                        break;
                    case "in":
                        iOooO0O0 = 3;
                        break;
                    case "pt":
                        iOooO0O0 = 5;
                        break;
                    case "tr":
                        iOooO0O0 = 2;
                        break;
                    case "ur":
                        iOooO0O0 = 8;
                        break;
                    default:
                        iOooO0O0 = 0;
                        break;
                }
            } else {
                p499o0o00OoO.o00O0O o00o0oOooO00o2 = p497o0o00Oo.OooOOO0.OooO00o();
                Objects.requireNonNull(o00o0oOooO00o2);
                iOooO0O0 = o00o0oOooO00o2.OooO0O0(o000O0O0.OooO00o(-23595722186256L), -1);
            }
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(iOooO0O0));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(o0000O0.f41302OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new o0000O0O(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o0O0O00 extends Lambda implements Function0<MutableLiveData<List<UserInfo.TagInfo>>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o0O0O00 f41279Oooo0o = new o0O0O00();

        public o0O0O00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<List<UserInfo.TagInfo>> invoke() {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            Object arrayList = (List) com.android.billingclient.api.o0Oo0oo.OooO0OO(o00o0oOooO00o.OooO0Oo(o000O0O0.OooO00o(-20756748803600L), o000O0O0.OooO00o(-20773928672784L)), new p499o0o00OoO.o0OoOo0().getType());
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            MutableLiveData<List<UserInfo.TagInfo>> mutableLiveData = new MutableLiveData<>(arrayList);
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(o000Oo0.f41320OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new o000O00(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o0OO00O extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o0OO00O f41280Oooo0o = new o0OO00O();

        public o0OO00O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>(Boolean.FALSE);
        }
    }

    public static final class o0OOO0o extends MutableLiveData<RoomIndexModel> {
        public o0OOO0o() {
            super(null);
        }

        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super RoomIndexModel> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            super.observe(owner, observer);
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            if (OooOOO.f41250Oooo0O0) {
                return;
            }
            oooOOO.Oooo000();
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o0Oo0oo f41281Oooo0o = new o0Oo0oo();

        public o0Oo0oo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(o00o0oOooO00o.OooO0O0(o000O0O0.OooO00o(-20640784686608L), 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(o0000OO0.f41305OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new o000(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o0OoOo0 f41282Oooo0o = new o0OoOo0();

        public o0OoOo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(o00o0oOooO00o.OooO0O0(o000O0O0.OooO00o(-20370201746960L), 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(p498o0o00Oo0.o00000O.f41298OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new p498o0o00Oo0.o00000OO(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o0ooOOo f41283Oooo0o = new o0ooOOo();

        public o0ooOOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(Integer.valueOf(o00o0oOooO00o.OooO0O0(o000O0O0.OooO00o(-20597835013648L), 0)));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(o000OO.f41316OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new o0000O(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class oo000o extends Lambda implements Function0<MutableLiveData<Pair<? extends Boolean, ? extends Integer>>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final oo000o f41284Oooo0o = new oo000o();

        public oo000o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Pair<? extends Boolean, ? extends Integer>> invoke() {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p499o0o00OoO.o00O0O o00o0oOooO00o = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o);
            Boolean boolValueOf = Boolean.valueOf(o00o0oOooO00o.OooO00o(o000O0O0.OooO00o(-19914935213584L), false));
            p499o0o00OoO.o00O0O o00o0oOooO00o2 = p497o0o00Oo.OooOOO0.OooO00o();
            Objects.requireNonNull(o00o0oOooO00o2);
            MutableLiveData<Pair<? extends Boolean, ? extends Integer>> mutableLiveData = new MutableLiveData<>(new Pair(boolValueOf, Integer.valueOf(o00o0oOooO00o2.OooO0O0(o000O0O0.OooO00o(-19949294951952L), 0))));
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(o0000O00.f41303OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new o0000oo(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static final class oo0o0Oo extends Lambda implements Function0<MutableLiveData<String>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final oo0o0Oo f41285Oooo0o = new oo0o0Oo();

        public oo0o0Oo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<String> invoke() {
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            MutableLiveData<String> mutableLiveData = new MutableLiveData<>(p497o0o00Oo.OooOOO0.OooO00o().OooOO0o());
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                mutableLiveData.observeForever(o000O000.f41311OooO00o);
            } else {
                new Handler(Looper.getMainLooper()).post(new o000O0o(mutableLiveData));
            }
            return mutableLiveData;
        }
    }

    public static /* synthetic */ void Oooo00o(OooOOO oooOOO, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = "";
        }
        String str3 = (i & 2) != 0 ? "" : null;
        String str4 = (i & 4) != 0 ? "" : null;
        if ((i & 8) != 0) {
            str2 = "";
        }
        oooOOO.Oooo00O(str, str3, str4, str2);
    }

    @NotNull
    public final MutableLiveData<Pair<Integer, Integer>> OooO() {
        return (MutableLiveData) f41242OooOoo.getValue();
    }

    public final void OooO00o() {
        Oooo0(null, false);
        Oooo00o(this, null, null, 15);
        MutableLiveData<Boolean> mutableLiveDataOooOooO = OooOooO();
        Boolean bool = Boolean.FALSE;
        mutableLiveDataOooOooO.postValue(bool);
        f41251Oooo0OO.postValue(null);
        OooOOo0().postValue(bool);
    }

    @NotNull
    public final MutableLiveData<String> OooO0O0() {
        return (MutableLiveData) f41234OooOo.getValue();
    }

    @NotNull
    public final MutableLiveData<Long> OooO0OO() {
        return (MutableLiveData) f41226OooOO0o.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> OooO0Oo() {
        return (MutableLiveData) f41227OooOOO.getValue();
    }

    @NotNull
    public final MutableLiveData<Long> OooO0o() {
        return (MutableLiveData) f41228OooOOO0.getValue();
    }

    @NotNull
    public final MutableLiveData<String> OooO0o0() {
        return (MutableLiveData) f41235OooOo0.getValue();
    }

    @NotNull
    public final MutableLiveData<String> OooO0oO() {
        return (MutableLiveData) f41223OooO0oo.getValue();
    }

    @NotNull
    public final MutableLiveData<String> OooO0oo() {
        return (MutableLiveData) f41222OooO0oO.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> OooOO0() {
        return (MutableLiveData) f41232OooOOo0.getValue();
    }

    @NotNull
    public final MutableLiveData<String> OooOO0O() {
        return (MutableLiveData) f41231OooOOo.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> OooOO0o() {
        return (MutableLiveData) f41247Oooo000.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> OooOOO() {
        return (MutableLiveData) f41220OooO0o.getValue();
    }

    @NotNull
    public final MutableLiveData<Pair<Boolean, Integer>> OooOOO0() {
        return (MutableLiveData) f41224OooOO0.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> OooOOOO() {
        return (MutableLiveData) f41233OooOOoo.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> OooOOOo() {
        return (MutableLiveData) f41236OooOo00.getValue();
    }

    @NotNull
    public final MutableLiveData<String> OooOOo() {
        return (MutableLiveData) f41238OooOo0o.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> OooOOo0() {
        return (MutableLiveData) f41249Oooo00o.getValue();
    }

    @NotNull
    public final MutableLiveData<List<UserInfo.TagInfo>> OooOOoo() {
        return (MutableLiveData) f41237OooOo0O.getValue();
    }

    @NotNull
    public final MutableLiveData<Long> OooOo() {
        return (MutableLiveData) f41219OooO0Oo.getValue();
    }

    @NotNull
    public final MutableLiveData<String> OooOo0() {
        return (MutableLiveData) f41239OooOoO.getValue();
    }

    @NotNull
    public final MutableLiveData<String> OooOo00() {
        return (MutableLiveData) f41240OooOoO0.getValue();
    }

    @NotNull
    public final MutableLiveData<String> OooOo0O() {
        return (MutableLiveData) f41241OooOoOO.getValue();
    }

    @NotNull
    public final MutableLiveData<String> OooOo0o() {
        return (MutableLiveData) f41243OooOoo0.getValue();
    }

    @NotNull
    public final MutableLiveData<String> OooOoO() {
        return (MutableLiveData) f41215OooO.getValue();
    }

    @NotNull
    public final MutableLiveData<String> OooOoO0() {
        return (MutableLiveData) f41221OooO0o0.getValue();
    }

    @NotNull
    public final MutableLiveData<UserReturnRewardModel> OooOoOO() {
        return (MutableLiveData) f41246Oooo0.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> OooOoo() {
        return (MutableLiveData) f41248Oooo00O.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> OooOoo0() {
        return (MutableLiveData) f41245OooOooo.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> OooOooO() {
        return (MutableLiveData) f41217OooO0O0.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> OooOooo() {
        return (MutableLiveData) f41229OooOOOO.getValue();
    }

    public final void Oooo0(@Nullable UserInfoModel userInfoModel, boolean z) {
        String userIdx;
        String userHeader;
        String userHeaderFrame;
        String userName;
        String medal;
        String background;
        List<UserInfo.TagInfo> arrayList;
        String bio;
        String birthday;
        OooOo().setValue(userInfoModel != null ? Long.valueOf(userInfoModel.getUserId()) : 0L);
        MutableLiveData<String> mutableLiveDataOooOoO0 = OooOoO0();
        String str = "";
        if (userInfoModel == null || (userIdx = userInfoModel.getUserIdx()) == null) {
            userIdx = "";
        }
        mutableLiveDataOooOoO0.setValue(userIdx);
        MutableLiveData<String> mutableLiveDataOooO0oo = OooO0oo();
        if (userInfoModel == null || (userHeader = userInfoModel.getUserHeader()) == null) {
            userHeader = "";
        }
        mutableLiveDataOooO0oo.setValue(userHeader);
        MutableLiveData<String> mutableLiveDataOooO0oO = OooO0oO();
        if (userInfoModel == null || (userHeaderFrame = userInfoModel.getUserHeaderFrame()) == null) {
            userHeaderFrame = "";
        }
        mutableLiveDataOooO0oO.setValue(userHeaderFrame);
        MutableLiveData<String> mutableLiveDataOooOoO = OooOoO();
        if (userInfoModel == null || (userName = userInfoModel.getUserName()) == null) {
            userName = "";
        }
        mutableLiveDataOooOoO.setValue(userName);
        OooOOO0().setValue(new Pair<>(Boolean.valueOf(userInfoModel != null && userInfoModel.isPremium()), Integer.valueOf(userInfoModel != null ? userInfoModel.getPremiumLevel() : 0)));
        OooO0OO().setValue(userInfoModel != null ? Long.valueOf(userInfoModel.getCoin()) : 0L);
        OooO0o().setValue(userInfoModel != null ? Long.valueOf(userInfoModel.getCrystal()) : 0L);
        OooO0Oo().setValue(userInfoModel != null ? Integer.valueOf(userInfoModel.getCountryId()) : 2);
        OooOooo().setValue(Boolean.valueOf(userInfoModel != null && userInfoModel.getIsNewUser()));
        ((MutableLiveData) f41230OooOOOo.getValue()).setValue(userInfoModel != null ? Integer.valueOf(userInfoModel.getIdLevel()) : 0);
        OooOO0().setValue(userInfoModel != null ? Integer.valueOf(userInfoModel.getUserLevel()) : 0);
        MutableLiveData<String> mutableLiveDataOooOO0O = OooOO0O();
        if (userInfoModel == null || (medal = userInfoModel.getMedal()) == null) {
            medal = "";
        }
        mutableLiveDataOooOO0O.setValue(medal);
        OooOOOO().setValue(userInfoModel != null ? Integer.valueOf(userInfoModel.getRole()) : 0);
        OooOOOo().setValue(Integer.valueOf(userInfoModel != null ? userInfoModel.getSex() : 2));
        MutableLiveData<String> mutableLiveDataOooO0o0 = OooO0o0();
        if (userInfoModel == null || (background = userInfoModel.getBackground()) == null) {
            background = "";
        }
        mutableLiveDataOooO0o0.setValue(background);
        MutableLiveData<List<UserInfo.TagInfo>> mutableLiveDataOooOOoo = OooOOoo();
        if (userInfoModel == null || (arrayList = userInfoModel.getTags()) == null) {
            arrayList = new ArrayList<>();
        }
        mutableLiveDataOooOOoo.setValue(arrayList);
        MutableLiveData<String> mutableLiveDataOooOOo = OooOOo();
        if (userInfoModel == null || (bio = userInfoModel.getBio()) == null) {
            bio = "";
        }
        mutableLiveDataOooOOo.setValue(bio);
        MutableLiveData<String> mutableLiveDataOooO0O0 = OooO0O0();
        if (userInfoModel != null && (birthday = userInfoModel.getBirthday()) != null) {
            str = birthday;
        }
        mutableLiveDataOooO0O0.setValue(str);
        ((MutableLiveData) f41225OooOO0O.getValue()).setValue(userInfoModel != null ? Integer.valueOf(userInfoModel.getFansNum()) : 0);
        OooO().setValue(new Pair<>(Integer.valueOf(userInfoModel != null ? userInfoModel.getVipState() : 0), Integer.valueOf(userInfoModel != null ? userInfoModel.getVipLevel() : 0)));
        ((MutableLiveData) f41244OooOooO.getValue()).setValue(new Pair(Boolean.valueOf(userInfoModel != null ? userInfoModel.getCoinFrozen() : false), Integer.valueOf(userInfoModel != null ? userInfoModel.getDebtAmount() : 0)));
        MutableLiveData<Boolean> mutableLiveDataOooOoo = OooOoo();
        Boolean value = OooOooO().getValue();
        Boolean boolValueOf = Boolean.TRUE;
        if (Intrinsics.areEqual(value, boolValueOf)) {
            boolValueOf = Boolean.valueOf(userInfoModel != null ? userInfoModel.getIsBindPhone() : true);
        }
        mutableLiveDataOooOoo.setValue(boolValueOf);
        if (z) {
            OooOoo0().postValue(null);
        }
        if (!(userInfoModel != null) || z) {
            return;
        }
        OooOOO().setValue(userInfoModel != null ? Integer.valueOf(userInfoModel.getRegion()) : 0);
    }

    public final void Oooo000() {
        if (Intrinsics.areEqual(OooOooO().getValue(), Boolean.FALSE)) {
            f41250Oooo0O0 = true;
        } else {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new o00O0O(null), 3, null);
        }
    }

    public final void Oooo00O(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        MutableLiveData<String> mutableLiveDataOooOo00 = OooOo00();
        if (str == null) {
            str = "";
        }
        mutableLiveDataOooOo00.setValue(str);
        MutableLiveData<String> mutableLiveDataOooOo0 = OooOo0();
        if (str2 == null) {
            str2 = "";
        }
        mutableLiveDataOooOo0.setValue(str2);
        MutableLiveData<String> mutableLiveDataOooOo0O = OooOo0O();
        if (str3 == null) {
            str3 = "";
        }
        mutableLiveDataOooOo0O.setValue(str3);
        MutableLiveData<String> mutableLiveDataOooOo0o = OooOo0o();
        if (str4 == null) {
            str4 = "";
        }
        mutableLiveDataOooOo0o.setValue(str4);
    }
}
