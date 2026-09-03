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
import p482o0o000OO.o00oO0o;
import p483o0o000Oo.o00000;
import p483o0o000Oo.o00000O0;
import p483o0o000Oo.o0000O;
import p483o0o000Oo.o0000Ooo;
import p483o0o000Oo.o000OO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooO0O0 {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f24533OoooOOO = new OooO00o();

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    public static OooO0O0 f24534OoooOOo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f24545OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f24546OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<String> f24547OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<String> f24548OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Long> f24549OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f24550OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<CategoryModel> f24551OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f24552OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<MoraGiftListModel>> f24553OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f24554OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f24555OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ArrayList<Room.RoshamboModel>> f24556OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f24557OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<o00oO0o> f24558OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f24559OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f24560OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f24561OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f24562OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f24563OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f24564OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f24565OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<RoomPKResultModel> f24566Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @NotNull
    public final Lazy f24567Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<List<ProfileLimitModel>> f24568Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @NotNull
    public final Lazy f24569Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @NotNull
    public final Lazy f24570Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f24571Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f24572Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f24573Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @Nullable
    public Job f24574Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<RoomGameConfig.Vote> f24575Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<TreasureBoxProgressModel> f24576Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Pair<Long, Integer>> f24577OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<RoomUserInfoModel> f24578OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f24579OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Long> f24580OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Pair<Long, Boolean>> f24581OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Boolean> f24582o000oOoO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<String> f24536OooO00o = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<String> f24537OooO0O0 = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Long> f24538OooO0OO = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Long> f24539OooO0Oo = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f24541OooO0o0 = new MutableLiveData<>(0);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f24540OooO0o = new MutableLiveData<>(0);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Boolean> f24542OooO0oO = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<RoomLoginInformation> f24543OooO0oo = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<RoomConfiguration> f24535OooO = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<ProfileLimitModel> f24544OooOO0 = new MutableLiveData<>();

    public static final class OooO extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f24583OooO0Oo = new OooO();

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
            if (OooO0O0.f24534OoooOOo == null) {
                OooO0O0.f24534OoooOOo = new OooO0O0();
            }
            oooO0O0 = OooO0O0.f24534OoooOOo;
            Intrinsics.checkNotNull(oooO0O0);
            return oooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.service.room.OooO0O0$OooO0O0, reason: collision with other inner class name */
    public static final class C0316OooO0O0 extends Lambda implements Function0<MutableLiveData<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final C0316OooO0O0 f24584OooO0Oo = new C0316OooO0O0();

        public C0316OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Integer> invoke() {
            return new MutableLiveData<>();
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<MutableLiveData<Long>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f24585OooO0Oo = new OooO0OO();

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
        public static final OooO0o f24586OooO0Oo = new OooO0o();

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
        public static final OooOO0 f24587OooO0Oo = new OooOO0();

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
        this.f24545OooOO0O = new MutableLiveData<>(bool);
        this.f24546OooOO0o = new MutableLiveData<>(0);
        this.f24548OooOOO0 = new MutableLiveData<>();
        this.f24547OooOOO = new MutableLiveData<>();
        this.f24549OooOOOO = new MutableLiveData<>(-1L);
        this.f24550OooOOOo = new MutableLiveData<>(bool);
        this.f24552OooOOo0 = new MutableLiveData<>(0);
        this.f24551OooOOo = new MutableLiveData<>();
        this.f24553OooOOoo = new MutableLiveData<>();
        this.f24556OooOo00 = new MutableLiveData<>();
        this.f24555OooOo0 = new MutableLiveData<>();
        this.f24557OooOo0O = new MutableLiveData<>();
        this.f24558OooOo0o = new MutableLiveData<>();
        this.f24554OooOo = new MutableLiveData<>(bool);
        this.f24560OooOoO0 = new MutableLiveData<>(bool);
        this.f24559OooOoO = new MutableLiveData<>(bool);
        this.f24561OooOoOO = new MutableLiveData<>(bool);
        this.f24563OooOoo0 = new MutableLiveData<>(bool);
        this.f24562OooOoo = new MutableLiveData<>(0);
        this.f24564OooOooO = new MutableLiveData<>(bool);
        this.f24565OooOooo = new MutableLiveData<>(0);
        this.f24568Oooo000 = new MutableLiveData<>(new ArrayList());
        this.f24569Oooo00O = LazyKt.lazy(C0316OooO0O0.f24584OooO0Oo);
        this.f24570Oooo00o = LazyKt.lazy(OooO0o.f24586OooO0Oo);
        this.f24567Oooo0 = LazyKt.lazy(OooO.f24583OooO0Oo);
        this.f24571Oooo0O0 = LazyKt.lazy(OooOO0.f24587OooO0Oo);
        this.f24572Oooo0OO = LazyKt.lazy(OooO0OO.f24585OooO0Oo);
        this.f24573Oooo0o = new MutableLiveData<>(bool);
        this.f24575Oooo0oO = new MutableLiveData<>(null);
        this.f24576Oooo0oo = new MutableLiveData<>();
        this.f24566Oooo = new MutableLiveData<>();
        this.f24579OoooO00 = new MutableLiveData<>();
        this.f24578OoooO0 = new MutableLiveData<>(null);
        this.f24580OoooO0O = new MutableLiveData<>(null);
        this.f24577OoooO = new MutableLiveData<>(null);
        this.f24581OoooOO0 = new MutableLiveData<>(null);
        this.f24582o000oOoO = new MutableLiveData<>(bool);
    }

    @NotNull
    public final MutableLiveData<Boolean> OooO() {
        return (MutableLiveData) this.f24571Oooo0O0.getValue();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooO00o() {
        for (o0000O o0000o2 : com.yalla.yalla.service.room.OooO00o.f24513OooO0OO) {
            o0000o2.f48491OooO00o.setValue((T) o0000o2.f48492OooO0O0.invoke());
        }
        for (o00000O0 o00000o1 : com.yalla.yalla.service.room.OooO00o.f24511OooO00o) {
            o00000o1.f48483OooO00o.setValue((T) o00000o1.f48484OooO0O0.invoke());
        }
        for (o000OO o000oo2 : com.yalla.yalla.service.room.OooO00o.f24512OooO0O0) {
            o000oo2.f48617OooO00o.setValue((T) o000oo2.f48618OooO0O0.invoke());
        }
        Iterator it = com.yalla.yalla.service.room.OooO00o.f24514OooO0Oo.iterator();
        while (it.hasNext()) {
            ((o00000) it.next()).f48457OooO00o.clear();
        }
        o0000Ooo o0000ooo = com.yalla.yalla.service.room.OooO00o.f24524OooOOOO;
        Job job = o0000ooo.f48534OooOOo;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        o0000ooo.f48534OooOOo = null;
        com.yalla.yalla.service.room.OooO00o.f24519OooOO0.f48495OooO0OO.clear();
        this.f24536OooO00o.postValue("");
        this.f24538OooO0OO.postValue(null);
        this.f24539OooO0Oo.postValue(null);
        this.f24568Oooo000.postValue(null);
        this.f24537OooO0O0.postValue("");
        this.f24535OooO.postValue(null);
        MutableLiveData<Boolean> mutableLiveData = this.f24545OooOO0O;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.postValue(bool);
        this.f24546OooOO0o.postValue(-1);
        this.f24543OooO0oo.postValue(null);
        this.f24549OooOOOO.postValue(-1L);
        this.f24556OooOo00.postValue(null);
        this.f24557OooOo0O.postValue(-1);
        this.f24551OooOOo.postValue(null);
        this.f24552OooOOo0.postValue(-1);
        this.f24550OooOOOo.postValue(bool);
        this.f24559OooOoO.postValue(Boolean.TRUE);
        this.f24561OooOoOO.postValue(bool);
        this.f24564OooOooO.postValue(bool);
        Job job2 = this.f24574Oooo0o0;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.f24574Oooo0o0 = null;
        this.f24573Oooo0o.postValue(bool);
        this.f24547OooOOO.postValue("");
        this.f24578OoooO0.postValue(null);
        this.f24580OoooO0O.postValue(null);
        this.f24575Oooo0oO.postValue(null);
        this.f24577OoooO.postValue(null);
        this.f24581OoooOO0.postValue(null);
        this.f24582o000oOoO.postValue(bool);
    }

    @NotNull
    public final MutableLiveData<Boolean> OooO0O0() {
        return this.f24561OooOoOO;
    }

    @NotNull
    public final MutableLiveData<Boolean> OooO0OO() {
        return this.f24559OooOoO;
    }

    @NotNull
    public final MutableLiveData<ProfileLimitModel> OooO0Oo() {
        return this.f24544OooOO0;
    }

    @NotNull
    public final MutableLiveData<Integer> OooO0o() {
        return (MutableLiveData) this.f24569Oooo00O.getValue();
    }

    @NotNull
    public final MutableLiveData<Long> OooO0o0() {
        return this.f24539OooO0Oo;
    }

    @NotNull
    public final MutableLiveData<Long> OooO0oO() {
        return (MutableLiveData) this.f24572Oooo0OO.getValue();
    }

    @NotNull
    public final MutableLiveData<Integer> OooO0oo() {
        return (MutableLiveData) this.f24570Oooo00o.getValue();
    }

    @NotNull
    public final MutableLiveData<RoomGameConfig.Vote> OooOO0() {
        return this.f24575Oooo0oO;
    }

    public final boolean OooOO0O() {
        Integer value = this.f24546OooOO0o.getValue();
        return value == null || value.intValue() != 0;
    }

    public final boolean OooOO0o() {
        Integer value = this.f24546OooOO0o.getValue();
        return value != null && value.intValue() == 2;
    }

    public final boolean OooOOO() {
        Integer value = this.f24546OooOO0o.getValue();
        return value != null && value.intValue() == 1;
    }

    public final boolean OooOOO0() {
        Integer value = this.f24546OooOO0o.getValue();
        return value != null && value.intValue() == 0;
    }
}
