package p475o0o000;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import p409o0Oo0o0o.o0O0O00;
import p464o0Oooo.o000000O;
import p533o0o0Oo0.oo0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomMicData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMicData.kt\ncom/yalla/yalla/service/room/data/RoomMicData\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,160:1\n81#2:161\n107#2,2:162\n81#2:173\n107#2,2:174\n81#2:180\n107#2,2:181\n81#2:183\n107#2,2:184\n81#2:186\n107#2,2:187\n81#2:189\n107#2,2:190\n81#2:192\n107#2,2:193\n81#2:195\n107#2,2:196\n81#2:198\n107#2,2:199\n81#2:201\n107#2,2:202\n1#3:164\n1774#4,4:165\n1774#4,4:169\n1855#4,2:176\n1855#4,2:178\n*S KotlinDebug\n*F\n+ 1 RoomMicData.kt\ncom/yalla/yalla/service/room/data/RoomMicData\n*L\n30#1:161\n30#1:162,2\n55#1:173\n55#1:174,2\n126#1:180\n126#1:181,2\n129#1:183\n129#1:184,2\n132#1:186\n132#1:187,2\n147#1:189\n147#1:190,2\n150#1:192\n150#1:193,2\n153#1:195\n153#1:196,2\n156#1:198\n156#1:199,2\n159#1:201\n159#1:202,2\n46#1:165,4\n49#1:169,4\n70#1:176,2\n79#1:178,2\n*E\n"})
public final class o000000 extends p475o0o000.Oooo000 {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<Long> f47386OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final MutableState f47388OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final MutableState f47389OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final MutableState f47390OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final MutableState f47391OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final MutableState f47392OooOo0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f47371OooO00o = p475o0o000.Oooo000.OooO0O0(OooOOOO.f47402OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f47372OooO0O0 = p475o0o000.Oooo000.OooO0O0(OooOOO.f47400OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f47373OooO0OO = p475o0o000.Oooo000.OooO0O0(OooOO0O.f47399OooO0Oo);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f47374OooO0Oo = p475o0o000.Oooo000.OooO0O0(OooOOO0.f47401OooO0Oo);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f47376OooO0o0 = p475o0o000.Oooo000.OooO0OO(o000oOoO.f47407OooO0Oo);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f47375OooO0o = p475o0o000.Oooo000.OooO0OO(OooO0OO.f47396OooO0Oo);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Pair<Long, Integer>> f47377OooO0oO = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f47378OooO0oo = p475o0o000.Oooo000.OooO0O0(o00Oo0.f47409OooO0Oo);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f47370OooO = p475o0o000.Oooo000.OooO0O0(o00Ooo.f47410OooO0Oo);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final MutableState f47379OooOO0 = p475o0o000.Oooo000.OooO0OO(OooOo00.f47404OooO0Oo);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final List<oo0O> f47380OooOO0O = CollectionsKt.listOf((Object[]) new oo0O[]{new oo0O(0), new oo0O(1), new oo0O(2), new oo0O(3), new oo0O(4), new oo0O(5), new oo0O(6), new oo0O(7), new oo0O(8), new oo0O(9)});

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f47381OooOO0o = p475o0o000.Oooo000.OooO0OO(OooO.f47393OooO0Oo);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final MutableState f47383OooOOO0 = p475o0o000.Oooo000.OooO0OO(OooO0o.f47397OooO0Oo);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final MutableState f47382OooOOO = p475o0o000.Oooo000.OooO0OO(OooOO0.f47398OooO0Oo);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f47384OooOOOO = p475o0o000.Oooo000.OooO0OO(OooOo.f47403OooO0Oo);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f47385OooOOOo = p475o0o000.Oooo000.OooO0OO(Oooo000.f47406OooO0Oo);

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f47387OooOOo0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    public static final class OooO extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f47393OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f47394OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return -1;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f47395OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ String invoke() {
            return "";
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Pair<? extends RoomUserInfoModel, ? extends Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f47396OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Pair<? extends RoomUserInfoModel, ? extends Boolean> invoke() {
            return null;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f47397OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f47398OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f47399OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f47400OooO0Oo = new OooOOO();

        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f47401OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOOO f47402OooO0Oo = new OooOOOO();

        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class OooOo extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo f47403OooO0Oo = new OooOo();

        public OooOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo00 f47404OooO0Oo = new OooOo00();

        public OooOo00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo0 f47405OooO0Oo = new Oooo0();

        public Oooo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            o0O0O00 o0o0o00OooO0o0 = p408o0Oo0o0O.o00Oo0.OooO0o0();
            o0o0o00OooO0o0.getClass();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            return Boolean.valueOf(o0o0o00OooO0o0.OooO0O0("showRoomApplyMicSettingDot" + o000000O.OooOOo0().getValue(), true));
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo000 f47406OooO0Oo = new Oooo000();

        public Oooo000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000oOoO f47407OooO0Oo = new o000oOoO();

        public o000oOoO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class o00O0O extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00O0O f47408OooO0Oo = new o00O0O();

        public o00O0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            o0O0O00 o0o0o00OooO0o0 = p408o0Oo0o0O.o00Oo0.OooO0o0();
            o0o0o00OooO0o0.getClass();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            return Boolean.valueOf(o0o0o00OooO0o0.OooO0O0("showRoomApplyMicGuideForMember" + o000000O.OooOOo0().getValue(), true));
        }
    }

    public static final class o00Oo0 extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00Oo0 f47409OooO0Oo = new o00Oo0();

        public o00Oo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            o0O0O00 o0o0o00OooO0o0 = p408o0Oo0o0O.o00Oo0.OooO0o0();
            o0o0o00OooO0o0.getClass();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            return Boolean.valueOf(o0o0o00OooO0o0.OooO0O0("room" + o000000O.OooOOo0().getValue(), false));
        }
    }

    public static final class o00Ooo extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00Ooo f47410OooO0Oo = new o00Ooo();

        public o00Ooo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return 0;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0OoOo0 f47411OooO0Oo = new o0OoOo0();

        public o0OoOo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            o0O0O00 o0o0o00OooO0o0 = p408o0Oo0o0O.o00Oo0.OooO0o0();
            o0o0o00OooO0o0.getClass();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            return Boolean.valueOf(o0o0o00OooO0o0.OooO0O0("showRoomApplyMicGuideForManager" + o000000O.OooOOo0().getValue(), true));
        }
    }

    public o000000() {
        SnapshotStateList<Long> snapshotStateListMutableStateListOf = SnapshotStateKt.mutableStateListOf();
        com.yalla.yalla.service.room.OooO00o.f24976OooO0Oo.add(new o0ooOOo(snapshotStateListMutableStateListOf));
        this.f47386OooOOo = snapshotStateListMutableStateListOf;
        this.f47388OooOOoo = p475o0o000.Oooo000.OooO0OO(OooO00o.f47394OooO0Oo);
        this.f47390OooOo00 = p475o0o000.Oooo000.OooO0OO(OooO0O0.f47395OooO0Oo);
        this.f47389OooOo0 = p475o0o000.Oooo000.OooO0OO(o0OoOo0.f47411OooO0Oo);
        this.f47391OooOo0O = p475o0o000.Oooo000.OooO0OO(o00O0O.f47408OooO0Oo);
        this.f47392OooOo0o = p475o0o000.Oooo000.OooO0OO(Oooo0.f47405OooO0Oo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO() {
        return ((Boolean) this.f47383OooOOO0.getValue()).booleanValue();
    }

    public final void OooO0Oo(int i) {
        oo0O oo0o = (oo0O) CollectionsKt.getOrNull(this.f47380OooOO0O, i);
        if (oo0o != null) {
            Boolean bool = Boolean.FALSE;
            oo0o.f54839OooO0Oo.setValue(bool);
            oo0o.f54838OooO0OO.setValue(0L);
            oo0o.f54837OooO0O0.setValue(bool);
        }
    }

    public final int OooO0o() {
        Object next;
        Iterator<T> it = this.f47380OooOO0O.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((oo0O) next).f54838OooO0OO.getValue().longValue() == 0));
        oo0O oo0o = (oo0O) next;
        if (oo0o != null) {
            return oo0o.f54836OooO00o;
        }
        return -1;
    }

    public final int OooO0o0() {
        Object next;
        oo0O oo0o;
        Iterator<T> it = this.f47380OooOO0O.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            oo0o = (oo0O) next;
        } while (!(!oo0o.f54837OooO0O0.getValue().booleanValue() && oo0o.f54838OooO0OO.getValue().longValue() == 0));
        oo0O oo0o2 = (oo0O) next;
        if (oo0o2 != null) {
            return oo0o2.f54836OooO00o;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int OooO0oO() {
        return ((Number) this.f47388OooOOoo.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO0oo() {
        return ((Boolean) this.f47392OooOo0o.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooOO0() {
        return ((Boolean) this.f47381OooOO0o.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooOO0O() {
        return ((Boolean) this.f47382OooOOO.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooOO0o() {
        return ((Boolean) this.f47379OooOO0.getValue()).booleanValue();
    }

    public final void OooOOO(int i) {
        this.f47388OooOOoo.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    public final boolean OooOOO0(long j) {
        for (Object obj : this.f47380OooOO0O) {
            if (((oo0O) obj).f54838OooO0OO.getValue().longValue() == j) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    public final void OooOOOO(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f47390OooOo00.setValue(str);
    }

    public final void OooOOOo() {
        this.f47391OooOo0O.setValue(Boolean.FALSE);
    }

    public final void OooOOo0(long j, int i, boolean z) {
        List<oo0O> list = this.f47380OooOO0O;
        list.get(i).f54837OooO0O0.setValue(Boolean.valueOf(z));
        long jLongValue = list.get(i).f54838OooO0OO.getValue().longValue();
        list.get(i).f54838OooO0OO.setValue(Long.valueOf(j));
        if (jLongValue <= 0 || jLongValue == j) {
            return;
        }
        list.get(i).f54839OooO0Oo.setValue(Boolean.FALSE);
    }
}
