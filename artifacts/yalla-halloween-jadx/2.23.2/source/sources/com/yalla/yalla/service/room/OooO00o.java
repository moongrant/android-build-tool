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
import p187o00o00o0.OooO;
import p483o0o000Oo.o000000;
import p483o0o000Oo.o000000O;
import p483o0o000Oo.o00000O;
import p483o0o000Oo.o00000OO;
import p483o0o000Oo.o0000O;
import p483o0o000Oo.o0000O0;
import p483o0o000Oo.o0000O00;
import p483o0o000Oo.o0000O0O;
import p483o0o000Oo.o0000OO0;
import p483o0o000Oo.o0000Ooo;
import p483o0o000Oo.o0000oo;
import p483o0o000Oo.o000OOo;
import p483o0o000Oo.o0O0O00;
import p483o0o000Oo.o0OO00O;
import p483o0o000Oo.o0OOO0o;
import p483o0o000Oo.o0Oo0oo;
import p483o0o000Oo.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomData.kt\ncom/yalla/yalla/service/room/RoomData\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n1855#2,2:149\n1855#2,2:151\n1855#2,2:153\n1855#2,2:155\n81#3:157\n107#3,2:158\n1#4:160\n*S KotlinDebug\n*F\n+ 1 RoomData.kt\ncom/yalla/yalla/service/room/RoomData\n*L\n46#1:149,2\n49#1:151,2\n52#1:153,2\n55#1:155,2\n82#1:157\n82#1:158,2\n*E\n"})
public final class OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public static final o0OO00O f24510OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ArrayList f24511OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ArrayList f24512OooO0O0 = new ArrayList();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final ArrayList f24513OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final ArrayList f24514OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final o0Oo0oo f24515OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final o000000 f24516OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public static final o0000oo f24517OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public static final o00000OO f24518OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NotNull
    public static final o0000O0 f24519OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public static final o0000OO0 f24520OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @NotNull
    public static final MutableState f24521OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public static final o0O0O00 f24522OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public static final o0000O0O f24523OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @NotNull
    public static final o0000Ooo f24524OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @NotNull
    public static final oo0o0Oo f24525OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public static final o0OOO0o f24526OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public static final o000OOo f24527OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public static final o00000O f24528OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public static final o0000O00 f24529OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public static final o000000O f24530OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public static final HashMap<Long, RoomUserInfoModel> f24531OooOo0O;

    /* JADX INFO: renamed from: com.yalla.yalla.service.room.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C0315OooO00o extends Lambda implements Function0<OooO0OO> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final C0315OooO00o f24532OooO0Oo = new C0315OooO00o();

        public C0315OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final OooO0OO invoke() {
            return OooO0OO.OooO0O0.f24590OooO00o;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f24513OooO0OO = arrayList;
        f24514OooO0Oo = new ArrayList();
        f24516OooO0o0 = new o000000();
        f24515OooO0o = new o0Oo0oo();
        f24517OooO0oO = new o0000oo();
        f24518OooO0oo = new o00000OO();
        f24510OooO = new o0OO00O();
        f24519OooOO0 = new o0000O0();
        f24520OooOO0O = new o0000OO0();
        C0315OooO00o c0315OooO00o = C0315OooO00o.f24532OooO0Oo;
        c0315OooO00o.getClass();
        MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(OooO0OO.OooO0O0.f24590OooO00o, null, 2, null);
        arrayList.add(new o0000O(mutableStateMutableStateOf$default, c0315OooO00o));
        f24521OooOO0o = mutableStateMutableStateOf$default;
        f24523OooOOO0 = new o0000O0O();
        f24522OooOOO = new o0O0O00();
        f24524OooOOOO = new o0000Ooo();
        f24525OooOOOo = new oo0o0Oo();
        f24527OooOOo0 = new o000OOo();
        f24526OooOOo = new o0OOO0o();
        f24528OooOOoo = new o00000O();
        f24530OooOo00 = new o000000O();
        f24529OooOo0 = new o0000O00();
        f24531OooOo0O = new HashMap<>();
    }

    @NotNull
    public static final o000000 OooO00o() {
        return f24516OooO0o0;
    }

    @NotNull
    public static final o00000O OooO0O0() {
        return f24528OooOOoo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static OooO0OO OooO0OO() {
        return (OooO0OO) f24521OooOO0o.getValue();
    }

    @NotNull
    public static final o0000OO0 OooO0Oo() {
        return f24520OooOO0O;
    }

    public static void OooO0o(@Nullable RoomUserInfoModel roomUserInfoModel) {
        MutableStateFlow<Long> userId;
        MutableStateFlow<Long> userId2;
        Long value = null;
        Long value2 = (roomUserInfoModel == null || (userId2 = roomUserInfoModel.getUserId()) == null) ? null : userId2.getValue();
        p598o0oo00Oo.o0000O00.OooO0OO("RoomUserInfoManager", "putUserInfo userId = " + value2 + ", model = " + OooO.OooO00o(roomUserInfoModel));
        if (roomUserInfoModel != null && (userId = roomUserInfoModel.getUserId()) != null) {
            value = userId.getValue();
        }
        if (value == null || roomUserInfoModel.getUserId().getValue().longValue() <= 0) {
            return;
        }
        HashMap<Long, RoomUserInfoModel> map = f24531OooOo0O;
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
        if (l == null || l.longValue() <= 0 || (roomUserInfoModel = f24531OooOo0O.get(l)) == null) {
            return null;
        }
        roomUserInfoModel.parseDataByDefaultJsonString();
        return roomUserInfoModel;
    }

    public static void OooO0oO(@NotNull OooO0OO oooO0OO) {
        Intrinsics.checkNotNullParameter(oooO0OO, "<set-?>");
        f24521OooOO0o.setValue(oooO0OO);
    }
}
