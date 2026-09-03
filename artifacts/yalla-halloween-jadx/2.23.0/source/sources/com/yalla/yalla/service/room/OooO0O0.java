package com.yalla.yalla.service.room;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.app.base.protobuf.room.Room;
import com.yalla.yalla.mixedroom.model.RoomConfiguration;
import com.yalla.yalla.mixedroom.model.RoomGameConfig;
import com.yalla.yalla.mixedroom.model.RoomLoginInformation;
import com.yalla.yalla.mixedroom.model.RoomPKResultModel;
import com.yalla.yalla.mixedroom.model.TreasureBoxProgressModel;
import com.yalla.yalla.model.CategoryModel;
import com.yalla.yalla.model.MoraGiftListModel;
import com.yalla.yalla.model.ProfileLimitModel;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import java.util.ArrayList;
import java.util.Iterator;
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
import p475o0o000.o00000O;
import p475o0o000.o00000O0;
import p475o0o000.o0OOO0o;
import p475o0o000.o0ooOOo;
import p475o0o000.oo0o0Oo;
import p476o0o0000o.o00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooO0O0 {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f24995OoooOOO = new OooO00o();

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    public static OooO0O0 f24996OoooOOo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f25007OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f25008OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<String> f25009OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<String> f25010OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Long> f25011OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f25012OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<CategoryModel> f25013OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f25014OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<MoraGiftListModel>> f25015OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f25016OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f25017OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ArrayList<Room.RoshamboModel>> f25018OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f25019OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<o00> f25020OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f25021OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f25022OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f25023OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f25024OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f25025OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f25026OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f25027OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<RoomPKResultModel> f25028Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @NotNull
    public final Lazy f25029Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<ProfileLimitModel>> f25030Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @NotNull
    public final Lazy f25031Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @NotNull
    public final Lazy f25032Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f25033Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f25034Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f25035Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @Nullable
    public Job f25036Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<RoomGameConfig.Vote> f25037Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<TreasureBoxProgressModel> f25038Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Pair<Long, Integer>> f25039OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<RoomUserInfoModel> f25040OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f25041OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Long> f25042OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Pair<Long, Boolean>> f25043OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f25044o000oOoO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<String> f24998OooO00o = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<String> f24999OooO0O0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Long> f25000OooO0OO = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Long> f25001OooO0Oo = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f25003OooO0o0 = new MutableLiveData<>(0);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f25002OooO0o = new MutableLiveData<>(0);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Boolean> f25004OooO0oO = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<RoomLoginInformation> f25005OooO0oo = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<RoomConfiguration> f24997OooO = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ProfileLimitModel> f25006OooOO0 = new MutableLiveData<>();

    public static final class OooO extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f25045OooO0Oo = new OooO();

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
        public final synchronized OooO0O0 OooO00o() {
            OooO0O0 oooO0O0;
            if (OooO0O0.f24996OoooOOo == null) {
                OooO0O0.f24996OoooOOo = new OooO0O0();
            }
            oooO0O0 = OooO0O0.f24996OoooOOo;
            Intrinsics.checkNotNull(oooO0O0);
            return oooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.service.room.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C0317OooO0O0 extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final C0317OooO0O0 f25046OooO0Oo = new C0317OooO0O0();

        public C0317OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            return new MutableLiveData<>();
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<MutableLiveData<Long>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f25047OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Long> invoke() {
            return new MutableLiveData<>(-1L);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f25048OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            return new MutableLiveData<>();
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f25049OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>(Boolean.FALSE);
        }
    }

    public OooO0O0() {
        Boolean bool = Boolean.FALSE;
        this.f25007OooOO0O = new MutableLiveData<>(bool);
        this.f25008OooOO0o = new MutableLiveData<>(0);
        this.f25010OooOOO0 = new MutableLiveData<>();
        this.f25009OooOOO = new MutableLiveData<>();
        this.f25011OooOOOO = new MutableLiveData<>(-1L);
        this.f25012OooOOOo = new MutableLiveData<>(bool);
        this.f25014OooOOo0 = new MutableLiveData<>(0);
        this.f25013OooOOo = new MutableLiveData<>();
        this.f25015OooOOoo = new MutableLiveData<>();
        this.f25018OooOo00 = new MutableLiveData<>();
        this.f25017OooOo0 = new MutableLiveData<>();
        this.f25019OooOo0O = new MutableLiveData<>();
        this.f25020OooOo0o = new MutableLiveData<>();
        this.f25016OooOo = new MutableLiveData<>(bool);
        this.f25022OooOoO0 = new MutableLiveData<>(bool);
        this.f25021OooOoO = new MutableLiveData<>(bool);
        this.f25023OooOoOO = new MutableLiveData<>(bool);
        this.f25025OooOoo0 = new MutableLiveData<>(bool);
        this.f25024OooOoo = new MutableLiveData<>(0);
        this.f25026OooOooO = new MutableLiveData<>(bool);
        this.f25027OooOooo = new MutableLiveData<>(0);
        this.f25030Oooo000 = new MutableLiveData<>(new ArrayList());
        this.f25031Oooo00O = LazyKt.lazy(C0317OooO0O0.f25046OooO0Oo);
        this.f25032Oooo00o = LazyKt.lazy(OooO0o.f25048OooO0Oo);
        this.f25029Oooo0 = LazyKt.lazy(OooO.f25045OooO0Oo);
        this.f25033Oooo0O0 = LazyKt.lazy(OooOO0.f25049OooO0Oo);
        this.f25034Oooo0OO = LazyKt.lazy(OooO0OO.f25047OooO0Oo);
        this.f25035Oooo0o = new MutableLiveData<>(bool);
        this.f25037Oooo0oO = new MutableLiveData<>(null);
        this.f25038Oooo0oo = new MutableLiveData<>();
        this.f25028Oooo = new MutableLiveData<>();
        this.f25041OoooO00 = new MutableLiveData<>();
        this.f25040OoooO0 = new MutableLiveData<>(null);
        this.f25042OoooO0O = new MutableLiveData<>(null);
        this.f25039OoooO = new MutableLiveData<>(null);
        this.f25043OoooOO0 = new MutableLiveData<>(null);
        this.f25044o000oOoO = new MutableLiveData<>(bool);
    }

    @NotNull
    public final MutableLiveData<Boolean> OooO() {
        return (MutableLiveData) this.f25033Oooo0O0.getValue();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooO00o() {
        for (o00000O o00000o : com.yalla.yalla.service.room.OooO00o.f24975OooO0OO) {
            o00000o.f47419OooO00o.setValue((T) o00000o.f47420OooO0O0.invoke());
        }
        for (o0OOO0o o0ooo0o2 : com.yalla.yalla.service.room.OooO00o.f24973OooO00o) {
            o0ooo0o2.f47473OooO00o.setValue((T) o0ooo0o2.f47474OooO0O0.invoke());
        }
        for (o00000O0 o00000o1 : com.yalla.yalla.service.room.OooO00o.f24974OooO0O0) {
            o00000o1.f47421OooO00o.setValue((T) o00000o1.f47422OooO0O0.invoke());
        }
        Iterator it = com.yalla.yalla.service.room.OooO00o.f24976OooO0Oo.iterator();
        while (it.hasNext()) {
            ((o0ooOOo) it.next()).f47484OooO00o.clear();
        }
        oo0o0Oo oo0o0oo = com.yalla.yalla.service.room.OooO00o.f24986OooOOOO;
        Job job = oo0o0oo.f47521OooOOo;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        oo0o0oo.f47521OooOOo = null;
        com.yalla.yalla.service.room.OooO00o.f24981OooOO0.f47414OooO0OO.clear();
        this.f24998OooO00o.postValue("");
        this.f25000OooO0OO.postValue(null);
        this.f25001OooO0Oo.postValue(null);
        this.f25030Oooo000.postValue(null);
        this.f24999OooO0O0.postValue("");
        this.f24997OooO.postValue(null);
        MutableLiveData<Boolean> mutableLiveData = this.f25007OooOO0O;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.postValue(bool);
        this.f25008OooOO0o.postValue(-1);
        this.f25005OooO0oo.postValue(null);
        this.f25011OooOOOO.postValue(-1L);
        this.f25018OooOo00.postValue(null);
        this.f25019OooOo0O.postValue(-1);
        this.f25013OooOOo.postValue(null);
        this.f25014OooOOo0.postValue(-1);
        this.f25012OooOOOo.postValue(bool);
        this.f25021OooOoO.postValue(Boolean.TRUE);
        this.f25023OooOoOO.postValue(bool);
        this.f25026OooOooO.postValue(bool);
        Job job2 = this.f25036Oooo0o0;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.f25036Oooo0o0 = null;
        this.f25035Oooo0o.postValue(bool);
        this.f25009OooOOO.postValue("");
        this.f25040OoooO0.postValue(null);
        this.f25042OoooO0O.postValue(null);
        this.f25037Oooo0oO.postValue(null);
        this.f25039OoooO.postValue(null);
        this.f25043OoooOO0.postValue(null);
        this.f25044o000oOoO.postValue(bool);
    }

    @NotNull
    public final MutableLiveData<Boolean> OooO0O0() {
        return this.f25023OooOoOO;
    }

    @NotNull
    public final MutableLiveData<Boolean> OooO0OO() {
        return this.f25021OooOoO;
    }

    @NotNull
    public final MutableLiveData<ProfileLimitModel> OooO0Oo() {
        return this.f25006OooOO0;
    }

    @NotNull
    public final MutableLiveData<Integer> OooO0o() {
        return (MutableLiveData) this.f25031Oooo00O.getValue();
    }

    @NotNull
    public final MutableLiveData<Long> OooO0o0() {
        return this.f25001OooO0Oo;
    }

    @NotNull
    public final MutableLiveData<Long> OooO0oO() {
        return (MutableLiveData) this.f25034Oooo0OO.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> OooO0oo() {
        return (MutableLiveData) this.f25032Oooo00o.getValue();
    }

    @NotNull
    public final MutableLiveData<RoomGameConfig.Vote> OooOO0() {
        return this.f25037Oooo0oO;
    }

    public final boolean OooOO0O() {
        Integer value = this.f25008OooOO0o.getValue();
        return value == null || value.intValue() != 0;
    }

    public final boolean OooOO0o() {
        Integer value = this.f25008OooOO0o.getValue();
        return value != null && value.intValue() == 2;
    }

    public final boolean OooOOO() {
        Integer value = this.f25008OooOO0o.getValue();
        return value != null && value.intValue() == 1;
    }

    public final boolean OooOOO0() {
        Integer value = this.f25008OooOO0o.getValue();
        return value != null && value.intValue() == 0;
    }
}
