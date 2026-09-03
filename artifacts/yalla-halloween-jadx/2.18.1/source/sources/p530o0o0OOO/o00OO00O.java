package p530o0o0OOO;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.app.base.mixedroom.model.RoomConfiguration;
import com.app.base.mixedroom.model.RoomGameConfig;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.app.base.mixedroom.model.RoomPKResultModel;
import com.app.base.mixedroom.model.TreasureBoxProgressModel;
import com.app.base.model.CategoryModel;
import com.app.base.model.MoraGiftListModel;
import com.app.base.model.ProfileLimitModel;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.data.constant.RoomLoginState;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00OO00O {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f43313OooooOo = new OooO00o();

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @Nullable
    public static o00OO00O f43314Oooooo0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f43327OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f43329OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<String> f43330OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Long> f43331OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<String> f43332OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f43333OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<CategoryModel> f43334OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f43335OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f43336OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<String> f43337OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f43338OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ArrayList<Room.RoshamboModel>> f43339OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<MoraGiftListModel>> f43340OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f43341OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<o00OOO00> f43342OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f43343OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f43344OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f43345OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final Lazy f43346Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f43347Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f43348Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f43349Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f43350Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f43351Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f43352Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<ProfileLimitModel>> f43353Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f43354Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final Lazy f43355Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final Lazy f43356Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<Room.EnvelopInfo>> f43357OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final Lazy f43358OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final Lazy f43359OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @Nullable
    public Job f43360OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f43361OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<RoomGameConfig.Vote> f43362OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<TreasureBoxProgressModel> f43363OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<RoomPKResultModel> f43364OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f43365OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<RoomUserInfoModel> f43366OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Long> f43367Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Pair<Long, Integer>> f43368Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Pair<Long, Boolean>> f43369OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f43370OooooOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f43371o000oOoO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<String> f43316OooO00o = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<String> f43317OooO0O0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Long> f43318OooO0OO = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Long> f43319OooO0Oo = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f43321OooO0o0 = new MutableLiveData<>(0);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f43320OooO0o = new MutableLiveData<>(0);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f43322OooO0oO = new MutableLiveData<>(0);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Boolean> f43323OooO0oo = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Boolean> f43315OooO = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<RoomLoginInformation> f43324OooOO0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<RoomLoginState> f43325OooOO0O = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<RoomConfiguration> f43326OooOO0o = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ProfileLimitModel> f43328OooOOO0 = new MutableLiveData<>();

    public static final class OooO extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO f43372Oooo0o = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            return new MutableLiveData<>();
        }
    }

    public static final class OooO00o {
        @NotNull
        public final synchronized o00OO00O OooO00o() {
            o00OO00O o00oo00o;
            if (o00OO00O.f43314Oooooo0 == null) {
                o00OO00O.f43314Oooooo0 = new o00OO00O();
            }
            o00oo00o = o00OO00O.f43314Oooooo0;
            Intrinsics.checkNotNull(o00oo00o);
            return o00oo00o;
        }
    }

    @StabilityInferred(parameters = 0)
    public static abstract class OooO0O0 {

        @StabilityInferred(parameters = 0)
        public static final class OooO00o extends OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @NotNull
            public static final OooO00o f43373OooO00o = new OooO00o();
        }

        /* JADX INFO: renamed from: o0o0OOO.o00OO00O$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @StabilityInferred(parameters = 0)
        public static final class C0405OooO0O0 extends OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            @NotNull
            public static final C0405OooO0O0 f43374OooO00o = new C0405OooO0O0();
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f43375Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            return new MutableLiveData<>();
        }
    }

    public static final class OooO0o extends Lambda implements Function0<MutableLiveData<Long>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f43376Oooo0o = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Long> invoke() {
            return new MutableLiveData<>(-1L);
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0 f43377Oooo0o = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            return new MutableLiveData<>();
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0O f43378Oooo0o = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>(Boolean.FALSE);
        }
    }

    public o00OO00O() {
        new MutableLiveData();
        Boolean bool = Boolean.FALSE;
        this.f43327OooOOO = new MutableLiveData<>(bool);
        this.f43329OooOOOO = new MutableLiveData<>(0);
        this.f43330OooOOOo = new MutableLiveData<>();
        this.f43332OooOOo0 = new MutableLiveData<>();
        this.f43331OooOOo = new MutableLiveData<>(-1L);
        this.f43333OooOOoo = new MutableLiveData<>(bool);
        this.f43336OooOo00 = new MutableLiveData<>(Boolean.TRUE);
        this.f43335OooOo0 = new MutableLiveData<>(bool);
        this.f43337OooOo0O = new MutableLiveData<>();
        this.f43338OooOo0o = new MutableLiveData<>(0);
        this.f43334OooOo = new MutableLiveData<>();
        this.f43340OooOoO0 = new MutableLiveData<>();
        this.f43339OooOoO = new MutableLiveData<>();
        this.f43341OooOoOO = new MutableLiveData<>();
        this.f43343OooOoo0 = new MutableLiveData<>();
        this.f43342OooOoo = new MutableLiveData<>();
        this.f43344OooOooO = new MutableLiveData<>(bool);
        this.f43345OooOooo = new MutableLiveData<>(bool);
        this.f43348Oooo000 = new MutableLiveData<>(bool);
        this.f43349Oooo00O = new MutableLiveData<>(bool);
        this.f43350Oooo00o = new MutableLiveData<>(bool);
        this.f43347Oooo0 = new MutableLiveData<>(0);
        this.f43351Oooo0O0 = new MutableLiveData<>(0);
        this.f43352Oooo0OO = new MutableLiveData<>(bool);
        this.f43354Oooo0o0 = new MutableLiveData<>(0);
        this.f43353Oooo0o = new MutableLiveData<>(new ArrayList());
        this.f43355Oooo0oO = LazyKt.lazy(OooO0OO.f43375Oooo0o);
        this.f43356Oooo0oo = LazyKt.lazy(OooO.f43372Oooo0o);
        this.f43346Oooo = LazyKt.lazy(OooOO0.f43377Oooo0o);
        this.f43359OoooO00 = LazyKt.lazy(OooOO0O.f43378Oooo0o);
        this.f43358OoooO0 = LazyKt.lazy(OooO0o.f43376Oooo0o);
        this.f43357OoooO = new MutableLiveData<>(new ArrayList());
        this.f43361OoooOO0 = new MutableLiveData<>(bool);
        this.f43371o000oOoO = new MutableLiveData<>(bool);
        this.f43362OoooOOO = new MutableLiveData<>(null);
        this.f43363OoooOOo = new MutableLiveData<>();
        this.f43364OoooOo0 = new MutableLiveData<>();
        this.f43365OoooOoO = new MutableLiveData<>();
        this.f43366OoooOoo = new MutableLiveData<>(null);
        this.f43367Ooooo00 = new MutableLiveData<>(null);
        this.f43368Ooooo0o = new MutableLiveData<>(null);
        this.f43369OooooO0 = new MutableLiveData<>(null);
        this.f43370OooooOO = new MutableLiveData<>(bool);
    }

    @NotNull
    public final MutableLiveData<Integer> OooO() {
        return (MutableLiveData) this.f43356Oooo0oo.getValue();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooO00o() {
        o00O o00o2 = o00O.f43140OooO00o;
        for (o00OO<?> o00oo2 : o00O.f43142OooO0OO) {
            o00oo2.f43310OooO00o.setValue((T) o00oo2.f43311OooO0O0.invoke());
        }
        for (o00OO0OO<?> o00oo0oo : o00O.f43141OooO0O0) {
            o00oo0oo.f43381OooO00o.setValue((T) o00oo0oo.f43382OooO0O0.invoke());
        }
        Job job = o00O.f43175Oooo0O0;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        o00O.f43175Oooo0O0 = null;
        o00O.OooOO0 oooOO1 = o00O.OooOO0.f43243OooO00o;
        o00O.OooOO0.f43246OooO0Oo.clear();
        o00O.OooO0o oooO0o = o00O.OooO0o.f43216OooO00o;
        o00O.OooO0o.f43226OooOO0o.clear();
        this.f43316OooO00o.postValue("");
        this.f43318OooO0OO.postValue(null);
        this.f43319OooO0Oo.postValue(null);
        this.f43353Oooo0o.postValue(null);
        this.f43317OooO0O0.postValue("");
        this.f43326OooOO0o.postValue(null);
        MutableLiveData<Boolean> mutableLiveData = this.f43327OooOOO;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.postValue(bool);
        this.f43329OooOOOO.postValue(-1);
        this.f43324OooOO0.postValue(null);
        this.f43333OooOOoo.postValue(bool);
        this.f43337OooOo0O.postValue(null);
        this.f43331OooOOo.postValue(-1L);
        this.f43339OooOoO.postValue(null);
        this.f43343OooOoo0.postValue(-1);
        this.f43357OoooO.postValue(new ArrayList());
        this.f43334OooOo.postValue(null);
        this.f43338OooOo0o.postValue(-1);
        this.f43335OooOo0.postValue(bool);
        MutableLiveData<Boolean> mutableLiveData2 = this.f43336OooOo00;
        Boolean bool2 = Boolean.TRUE;
        mutableLiveData2.postValue(bool2);
        this.f43348Oooo000.postValue(bool2);
        this.f43349Oooo00O.postValue(bool);
        this.f43352Oooo0OO.postValue(bool);
        Job job2 = this.f43360OoooO0O;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.f43360OoooO0O = null;
        this.f43371o000oOoO.postValue(bool);
        this.f43332OooOOo0.postValue("");
        this.f43366OoooOoo.postValue(null);
        this.f43367Ooooo00.postValue(null);
        this.f43362OoooOOO.postValue(null);
        this.f43368Ooooo0o.postValue(null);
        this.f43369OooooO0.postValue(null);
        this.f43370OooooOO.postValue(bool);
        this.f43322OooO0oO.postValue(0);
    }

    @NotNull
    public final MutableLiveData<Boolean> OooO0O0() {
        return this.f43349Oooo00O;
    }

    @NotNull
    public final MutableLiveData<Boolean> OooO0OO() {
        return this.f43348Oooo000;
    }

    @NotNull
    public final MutableLiveData<List<Room.EnvelopInfo>> OooO0Oo() {
        return this.f43357OoooO;
    }

    @NotNull
    public final MutableLiveData<Long> OooO0o() {
        return this.f43319OooO0Oo;
    }

    @NotNull
    public final MutableLiveData<ProfileLimitModel> OooO0o0() {
        return this.f43328OooOOO0;
    }

    @NotNull
    public final MutableLiveData<Integer> OooO0oO() {
        return (MutableLiveData) this.f43355Oooo0oO.getValue();
    }

    @NotNull
    public final MutableLiveData<Long> OooO0oo() {
        return (MutableLiveData) this.f43358OoooO0.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> OooOO0() {
        return (MutableLiveData) this.f43346Oooo.getValue();
    }

    @NotNull
    public final MutableLiveData<Boolean> OooOO0O() {
        return (MutableLiveData) this.f43359OoooO00.getValue();
    }

    @NotNull
    public final MutableLiveData<String> OooOO0o() {
        return this.f43337OooOo0O;
    }

    public final boolean OooOOO() {
        Integer value = this.f43329OooOOOO.getValue();
        return value == null || value.intValue() != 0;
    }

    @NotNull
    public final MutableLiveData<RoomGameConfig.Vote> OooOOO0() {
        return this.f43362OoooOOO;
    }

    public final boolean OooOOOO() {
        Integer value = this.f43329OooOOOO.getValue();
        return value != null && value.intValue() == 2;
    }

    public final boolean OooOOOo() {
        Integer value = this.f43329OooOOOO.getValue();
        return value != null && value.intValue() == 0;
    }

    public final boolean OooOOo() {
        Integer value = this.f43329OooOOOO.getValue();
        return value != null && value.intValue() == 3;
    }

    public final boolean OooOOo0() {
        Integer value = this.f43329OooOOOO.getValue();
        return value != null && value.intValue() == 1;
    }
}
