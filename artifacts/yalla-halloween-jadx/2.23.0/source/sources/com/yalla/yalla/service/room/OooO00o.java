package com.yalla.yalla.service.room;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.room.NewRoomUserInfoTransformutilsKt;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p140o00OOooo.OooOO0;
import p475o0o000.Oooo0;
import p475o0o000.o00000;
import p475o0o000.o000000;
import p475o0o000.o000000O;
import p475o0o000.o00000O;
import p475o0o000.o00000OO;
import p475o0o000.o000OOo;
import p475o0o000.o000oOoO;
import p475o0o000.o00O0O;
import p475o0o000.o00Oo0;
import p475o0o000.o00Ooo;
import p475o0o000.o00oO0o;
import p475o0o000.o0OO00O;
import p475o0o000.o0Oo0oo;
import p475o0o000.o0OoOo0;
import p475o0o000.oo000o;
import p475o0o000.oo0o0Oo;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomData.kt\ncom/yalla/yalla/service/room/RoomData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n1855#2,2:149\n1855#2,2:151\n1855#2,2:153\n1855#2,2:155\n81#3:157\n107#3,2:158\n1#4:160\n*S KotlinDebug\n*F\n+ 1 RoomData.kt\ncom/yalla/yalla/service/room/RoomData\n*L\n46#1:149,2\n49#1:151,2\n52#1:153,2\n55#1:155,2\n82#1:157\n82#1:158,2\n*E\n"})
public final class OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final o0OoOo0 f24972OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ArrayList f24973OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ArrayList f24974OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final ArrayList f24975OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final ArrayList f24976OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final o000oOoO f24977OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final oo000o f24978OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final o000000 f24979OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final o0OO00O f24980OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public static final o000000O f24981OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public static final o00000OO f24982OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public static final MutableState f24983OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public static final o00Oo0 f24984OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public static final o00000 f24985OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public static final oo0o0Oo f24986OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public static final o00O0O f24987OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public static final Oooo0 f24988OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public static final o00Ooo f24989OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public static final o0Oo0oo f24990OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public static final o000OOo f24991OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public static final o00oO0o f24992OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public static final HashMap<Long, RoomUserInfoModel> f24993OooOo0O;

    /* JADX INFO: renamed from: com.yalla.yalla.service.room.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0316OooO00o extends Lambda implements Function0<OooO0OO> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final C0316OooO00o f24994OooO0Oo = new C0316OooO00o();

        public C0316OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO0OO invoke() {
            return OooO0OO.OooO0O0.f25052OooO00o;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f24975OooO0OO = arrayList;
        f24976OooO0Oo = new ArrayList();
        f24978OooO0o0 = new oo000o();
        f24977OooO0o = new o000oOoO();
        f24979OooO0oO = new o000000();
        f24980OooO0oo = new o0OO00O();
        f24972OooO = new o0OoOo0();
        f24981OooOO0 = new o000000O();
        f24982OooOO0O = new o00000OO();
        C0316OooO00o c0316OooO00o = C0316OooO00o.f24994OooO0Oo;
        c0316OooO00o.getClass();
        MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0OO.OooO0O0.f25052OooO00o, null, 2, null);
        arrayList.add(new o00000O(mutableStateMutableStateOf$default, c0316OooO00o));
        f24983OooOO0o = mutableStateMutableStateOf$default;
        f24985OooOOO0 = new o00000();
        f24984OooOOO = new o00Oo0();
        f24986OooOOOO = new oo0o0Oo();
        f24987OooOOOo = new o00O0O();
        f24989OooOOo0 = new o00Ooo();
        f24988OooOOo = new Oooo0();
        f24990OooOOoo = new o0Oo0oo();
        f24992OooOo00 = new o00oO0o();
        f24991OooOo0 = new o000OOo();
        f24993OooOo0O = new HashMap<>();
    }

    @NotNull
    public static final oo000o OooO00o() {
        return f24978OooO0o0;
    }

    @NotNull
    public static final o0Oo0oo OooO0O0() {
        return f24990OooOOoo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static OooO0OO OooO0OO() {
        return (OooO0OO) f24983OooOO0o.getValue();
    }

    @NotNull
    public static final o00000OO OooO0Oo() {
        return f24982OooOO0O;
    }

    public static void OooO0o(@Nullable RoomUserInfoModel roomUserInfoModel) {
        MutableStateFlow<Long> userId;
        Long value = null;
        MutableStateFlow<Long> userId2 = roomUserInfoModel != null ? roomUserInfoModel.getUserId() : null;
        OooOOO0.OooO0OO("RoomUserInfoManager", "putUserInfo userId = " + userId2 + ", model = " + OooOO0.OooO00o(roomUserInfoModel));
        if (roomUserInfoModel != null && (userId = roomUserInfoModel.getUserId()) != null) {
            value = userId.getValue();
        }
        if (value == null || roomUserInfoModel.getUserId().getValue().longValue() <= 0) {
            return;
        }
        HashMap<Long, RoomUserInfoModel> map = f24993OooOo0O;
        if (map.get(roomUserInfoModel.getUserId().getValue()) == null) {
            map.put(roomUserInfoModel.getUserId().getValue(), roomUserInfoModel.parseDataByDefaultJsonString());
            return;
        }
        RoomUserInfoModel roomUserInfoModel2 = map.get(roomUserInfoModel.getUserId().getValue());
        Intrinsics.checkNotNull(roomUserInfoModel2);
        NewRoomUserInfoTransformutilsKt.updateData(roomUserInfoModel2, roomUserInfoModel).parseDataByDefaultJsonString();
    }

    @Nullable
    public static RoomUserInfoModel OooO0o0(@Nullable Long l) {
        RoomUserInfoModel roomUserInfoModel;
        if (l == null || l.longValue() <= 0 || (roomUserInfoModel = f24993OooOo0O.get(l)) == null) {
            return null;
        }
        roomUserInfoModel.parseDataByDefaultJsonString();
        return roomUserInfoModel;
    }

    public static void OooO0oO(@NotNull OooO0OO oooO0OO) {
        Intrinsics.checkNotNullParameter(oooO0OO, "<set-?>");
        f24983OooOO0o.setValue(oooO0OO);
    }
}
