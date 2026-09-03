package p483o0o000Oo;

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
import p414o0Oo0oO.oO0OOo0o;
import p475o0Ooooo0.o0O00oO0;
import p541o0o0OoOO.oo00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomMicData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMicData.kt\ncom/yalla/yalla/service/room/data/RoomMicData\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,160:1\n81#2:161\n107#2,2:162\n81#2:173\n107#2,2:174\n81#2:180\n107#2,2:181\n81#2:183\n107#2,2:184\n81#2:186\n107#2,2:187\n81#2:189\n107#2,2:190\n81#2:192\n107#2,2:193\n81#2:195\n107#2,2:196\n81#2:198\n107#2,2:199\n81#2:201\n107#2,2:202\n1#3:164\n1774#4,4:165\n1774#4,4:169\n1855#4,2:176\n1855#4,2:178\n*S KotlinDebug\n*F\n+ 1 RoomMicData.kt\ncom/yalla/yalla/service/room/data/RoomMicData\n*L\n30#1:161\n30#1:162,2\n55#1:173\n55#1:174,2\n126#1:180\n126#1:181,2\n129#1:183\n129#1:184,2\n132#1:186\n132#1:187,2\n147#1:189\n147#1:190,2\n150#1:192\n150#1:193,2\n153#1:195\n153#1:196,2\n156#1:198\n156#1:199,2\n159#1:201\n159#1:202,2\n46#1:165,4\n49#1:169,4\n70#1:176,2\n79#1:178,2\n*E\n"})
public final class o0000oo extends o0ooOOo {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final SnapshotStateList<Long> f48591OooOOo;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final MutableState f48593OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final MutableState f48594OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final MutableState f48595OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final MutableState f48596OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final MutableState f48597OooOo0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f48576OooO00o = o0ooOOo.OooO0O0(OooOOOO.f48607OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f48577OooO0O0 = o0ooOOo.OooO0O0(OooOOO.f48605OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f48578OooO0OO = o0ooOOo.OooO0O0(OooOO0O.f48604OooO0Oo);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f48579OooO0Oo = o0ooOOo.OooO0O0(OooOOO0.f48606OooO0Oo);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f48581OooO0o0 = o0ooOOo.OooO0OO(o000oOoO.f48612OooO0Oo);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f48580OooO0o = o0ooOOo.OooO0OO(OooO0OO.f48601OooO0Oo);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Pair<Long, Integer>> f48582OooO0oO = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Boolean> f48583OooO0oo = o0ooOOo.OooO0O0(o00Oo0.f48614OooO0Oo);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f48575OooO = o0ooOOo.OooO0O0(o00Ooo.f48615OooO0Oo);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public final MutableState f48584OooOO0 = o0ooOOo.OooO0OO(OooOo00.f48609OooO0Oo);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final List<oo00> f48585OooOO0O = CollectionsKt.listOf((Object[]) new oo00[]{new oo00(0), new oo00(1), new oo00(2), new oo00(3), new oo00(4), new oo00(5), new oo00(6), new oo00(7), new oo00(8), new oo00(9)});

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f48586OooOO0o = o0ooOOo.OooO0OO(OooO.f48598OooO0Oo);

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final MutableState f48588OooOOO0 = o0ooOOo.OooO0OO(OooO0o.f48602OooO0Oo);

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final MutableState f48587OooOOO = o0ooOOo.OooO0OO(OooOO0.f48603OooO0Oo);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f48589OooOOOO = o0ooOOo.OooO0OO(OooOo.f48608OooO0Oo);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f48590OooOOOo = o0ooOOo.OooO0OO(Oooo000.f48611OooO0Oo);

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f48592OooOOo0 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    public static final class OooO extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f48598OooO0Oo = new OooO();

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
        public static final OooO00o f48599OooO0Oo = new OooO00o();

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
        public static final OooO0O0 f48600OooO0Oo = new OooO0O0();

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
        public static final OooO0OO f48601OooO0Oo = new OooO0OO();

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
        public static final OooO0o f48602OooO0Oo = new OooO0o();

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
        public static final OooOO0 f48603OooO0Oo = new OooOO0();

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
        public static final OooOO0O f48604OooO0Oo = new OooOO0O();

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
        public static final OooOOO f48605OooO0Oo = new OooOOO();

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
        public static final OooOOO0 f48606OooO0Oo = new OooOOO0();

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
        public static final OooOOOO f48607OooO0Oo = new OooOOOO();

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
        public static final OooOo f48608OooO0Oo = new OooOo();

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
        public static final OooOo00 f48609OooO0Oo = new OooOo00();

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
        public static final Oooo0 f48610OooO0Oo = new Oooo0();

        public Oooo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            oO0OOo0o oo0ooo0oOooO0o0 = p415o0Oo0oO0.o00Ooo.OooO0o0();
            oo0ooo0oOooO0o0.getClass();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            return Boolean.valueOf(oo0ooo0oOooO0o0.OooO0O0("showRoomApplyMicSettingDot" + o0O00oO0.OooOOo0().getValue(), true));
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo000 f48611OooO0Oo = new Oooo000();

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
        public static final o000oOoO f48612OooO0Oo = new o000oOoO();

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
        public static final o00O0O f48613OooO0Oo = new o00O0O();

        public o00O0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            oO0OOo0o oo0ooo0oOooO0o0 = p415o0Oo0oO0.o00Ooo.OooO0o0();
            oo0ooo0oOooO0o0.getClass();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            return Boolean.valueOf(oo0ooo0oOooO0o0.OooO0O0("showRoomApplyMicGuideForMember" + o0O00oO0.OooOOo0().getValue(), true));
        }
    }

    public static final class o00Oo0 extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00Oo0 f48614OooO0Oo = new o00Oo0();

        public o00Oo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            oO0OOo0o oo0ooo0oOooO0o0 = p415o0Oo0oO0.o00Ooo.OooO0o0();
            oo0ooo0oOooO0o0.getClass();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            return Boolean.valueOf(oo0ooo0oOooO0o0.OooO0O0("room" + o0O00oO0.OooOOo0().getValue(), false));
        }
    }

    public static final class o00Ooo extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00Ooo f48615OooO0Oo = new o00Ooo();

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
        public static final o0OoOo0 f48616OooO0Oo = new o0OoOo0();

        public o0OoOo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            oO0OOo0o oo0ooo0oOooO0o0 = p415o0Oo0oO0.o00Ooo.OooO0o0();
            oo0ooo0oOooO0o0.getClass();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            return Boolean.valueOf(oo0ooo0oOooO0o0.OooO0O0("showRoomApplyMicGuideForManager" + o0O00oO0.OooOOo0().getValue(), true));
        }
    }

    public o0000oo() {
        SnapshotStateList<Long> snapshotStateListMutableStateListOf = SnapshotStateKt.mutableStateListOf();
        com.yalla.yalla.service.room.OooO00o.f24514OooO0Oo.add(new o00000(snapshotStateListMutableStateListOf));
        this.f48591OooOOo = snapshotStateListMutableStateListOf;
        this.f48593OooOOoo = o0ooOOo.OooO0OO(OooO00o.f48599OooO0Oo);
        this.f48595OooOo00 = o0ooOOo.OooO0OO(OooO0O0.f48600OooO0Oo);
        this.f48594OooOo0 = o0ooOOo.OooO0OO(o0OoOo0.f48616OooO0Oo);
        this.f48596OooOo0O = o0ooOOo.OooO0OO(o00O0O.f48613OooO0Oo);
        this.f48597OooOo0o = o0ooOOo.OooO0OO(Oooo0.f48610OooO0Oo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO() {
        return ((Boolean) this.f48588OooOOO0.getValue()).booleanValue();
    }

    public final void OooO0Oo(int i) {
        oo00 oo00Var = (oo00) CollectionsKt.getOrNull(this.f48585OooOO0O, i);
        if (oo00Var != null) {
            Boolean bool = Boolean.FALSE;
            oo00Var.f55308OooO0Oo.setValue(bool);
            oo00Var.f55307OooO0OO.setValue(0L);
            oo00Var.f55306OooO0O0.setValue(bool);
        }
    }

    public final int OooO0o() {
        Object next;
        Iterator<T> it = this.f48585OooOO0O.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((oo00) next).f55307OooO0OO.getValue().longValue() == 0));
        oo00 oo00Var = (oo00) next;
        if (oo00Var != null) {
            return oo00Var.f55305OooO00o;
        }
        return -1;
    }

    public final int OooO0o0() {
        Object next;
        oo00 oo00Var;
        Iterator<T> it = this.f48585OooOO0O.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            oo00Var = (oo00) next;
        } while (!(!oo00Var.f55306OooO0O0.getValue().booleanValue() && oo00Var.f55307OooO0OO.getValue().longValue() == 0));
        oo00 oo00Var2 = (oo00) next;
        if (oo00Var2 != null) {
            return oo00Var2.f55305OooO00o;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int OooO0oO() {
        return ((Number) this.f48593OooOOoo.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO0oo() {
        return ((Boolean) this.f48597OooOo0o.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooOO0() {
        return ((Boolean) this.f48586OooOO0o.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooOO0O() {
        return ((Boolean) this.f48587OooOOO.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooOO0o() {
        return ((Boolean) this.f48584OooOO0.getValue()).booleanValue();
    }

    public final void OooOOO(int i) {
        this.f48593OooOOoo.setValue(Integer.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002f  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    public final boolean OooOOO0(long j) {
        for (Object obj : this.f48585OooOO0O) {
            if (((oo00) obj).f55307OooO0OO.getValue().longValue() == j) {
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
        this.f48595OooOo00.setValue(str);
    }

    public final void OooOOOo() {
        this.f48596OooOo0O.setValue(Boolean.FALSE);
    }

    public final void OooOOo0(long j, int i, boolean z) {
        List<oo00> list = this.f48585OooOO0O;
        list.get(i).f55306OooO0O0.setValue(Boolean.valueOf(z));
        long jLongValue = list.get(i).f55307OooO0OO.getValue().longValue();
        list.get(i).f55307OooO0OO.setValue(Long.valueOf(j));
        if (jLongValue <= 0 || jLongValue == j) {
            return;
        }
        list.get(i).f55308OooO0Oo.setValue(Boolean.FALSE);
    }
}
