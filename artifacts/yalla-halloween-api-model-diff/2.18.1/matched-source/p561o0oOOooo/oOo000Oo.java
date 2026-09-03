package p561o0oOOooo;

import OooO00o.OooOO0O;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.o00000O;
import com.app.base.mixedroom.MixedRoomActivity;
import com.app.base.mixedroom.MixedRoomMicView;
import com.app.base.mixedroom.MixedRoomService;
import com.app.base.mixedroom.model.RoomLoginInformation;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import com.yalla.yalla.model.RoomUserInfoModel;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p021OooOooo.o0OoOo0;
import p141o00OOoo.OooO;
import p142o00OOooO.o000O00O;
import p142o00OOooO.o000OO00;
import p159o00OoOO.o0000;
import p159o00OoOO.o00O000;
import p163o00OoOo.o00O00OO;
import p163o00OoOo.oo00o;
import p188o00o00o0.OooO0OO;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p445o0OoOo0o.o0O0OOOo;
import p445o0OoOo0o.o0O0o000;
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.OooOOO;
import p499o0o00OoO.o0OO00O;
import p515o0o0O00.o00O00;
import p530o0o0OOO.o00OO00O;
import p545o0o0OoOo.a8;
import p545o0o0OoOo.c8;
import p617o0oo0o.o00;
import p618o0oo0o0.o0O0O00;
import p618o0oo0o0.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class oOo000Oo extends c8 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f44923OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final a8 f44924OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Lazy f44925OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public OooO0OO<RoomLoginInformation.MIC> f44926OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public MixedRoomService f44927OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f44928OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f44929OooO0oo;

    public static final class OooO00o extends Lambda implements Function0<RecyclerView> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RecyclerView invoke() {
            return (RecyclerView) oOo000Oo.this.f44923OooO0O0.findViewById(R.id.rv_mic);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ boolean f44931Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f44933Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f44934Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f44935OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f44936OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z, boolean z2, boolean z3, int i, String str) {
            super(1);
            this.f44933Oooo0oO = z;
            this.f44934Oooo0oo = z2;
            this.f44931Oooo = z3;
            this.f44936OoooO00 = i;
            this.f44935OoooO0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            if (bool.booleanValue()) {
                oOo000Oo ooo000oo = oOo000Oo.this;
                ooo000oo.f44928OooO0oO = true;
                if (this.f44933Oooo0oO && ooo000oo.f44927OooO0o0 != null) {
                    MusicState musicState = MusicState.f21402OooO00o;
                    boolean z = MusicState.f21404OooO0OO.getValue() == MusicState.State.Playing;
                    o00 o00Var = o00.f48461OooO00o;
                    int iOooO = o0O0OOOo.OooO0O0().OooO00o().OooO();
                    MixedRoomService mixedRoomService = oOo000Oo.this.f44927OooO0o0;
                    Intrinsics.checkNotNull(mixedRoomService);
                    Objects.requireNonNull(mixedRoomService);
                    o00O00.OooO0OO("MixedRoomService", "renewChannelKey");
                    if (mixedRoomService.f11831Oooo0oo != null && !TextUtils.isEmpty(mixedRoomService.f11837o000oOoO)) {
                        mixedRoomService.f11831Oooo0oo.OooOOOo();
                        mixedRoomService.OooO0o0(mixedRoomService.f11837o000oOoO);
                    }
                    MusicTable value = MusicState.f21403OooO0O0.getValue();
                    if (z && value != null) {
                        o00Var.OooO0Oo(value);
                        int i = o00.f48465OooO0o;
                        o0O0OOOo.OooO0O0().OooO00o().OooO0o0(i);
                        o00.f48465OooO0o = i;
                        o0O0OOOo.OooO0O0().OooO00o().OooOO0O(iOooO);
                    }
                }
                if (this.f44934Oooo0oo) {
                    o00O000.OooO().OooO00o(true, this.f44931Oooo);
                } else {
                    o00O000 o00o000OooO = o00O000.OooO();
                    int i2 = this.f44936OoooO00 + 1;
                    String str = this.f44935OoooO0;
                    Objects.requireNonNull(o00o000OooO);
                    if (o00O000.f32468OooO00o != null) {
                        o00O000.f32468OooO00o.OooO0o(10016, "{\"micorder\":" + i2 + ",\"puller\":" + str + "}");
                        String strOooO0O0 = kotlin.collections.unsigned.OooO00o.OooO0O0(OooOOO.f41216OooO00o);
                        if (o00000O.OooO0O0().OooO00o("Hold_MIC_" + strOooO0O0) == 0) {
                            OooO.OooO00o("AFEventMic", null);
                            o00000O.OooO0O0().OooO0o0("Hold_MIC_" + strOooO0O0, 1);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo000Oo(@NotNull MixedRoomActivity roomActivity, @NotNull a8 roomProxy) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
        Intrinsics.checkNotNullParameter(roomProxy, "roomProxy");
        this.f44923OooO0O0 = roomActivity;
        this.f44924OooO0OO = roomProxy;
        this.f44925OooO0Oo = LazyKt.lazy(new OooO00o());
        o000O00O o000o00o2 = new o000O00O(this);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            arrayList.add(new RoomLoginInformation.MIC());
        }
        oO00o000 oo00o000 = new oO00o000(arrayList, this, o000o00o2, this.f44923OooO0O0);
        this.f44926OooO0o = oo00o000;
        Intrinsics.checkNotNull(oo00o000);
        oo00o000.hindEmptyView(true);
        OooO0OO<RoomLoginInformation.MIC> oooO0OO = this.f44926OooO0o;
        Intrinsics.checkNotNull(oooO0OO);
        oooO0OO.setLoadComplete();
        OooO0o().setLayoutManager(new GridLayoutManager(this.f44923OooO0O0, 5));
        OooO0o().setAdapter(this.f44926OooO0o);
        this.f44928OooO0oO = o0O0O00.OooO0O0(this.f44923OooO0O0, oo0o0Oo.f48606OooO00o);
        LiveEventBus.get("INVITE_UP_MIC").observe(this.f44923OooO0O0, new o0000(this, 3));
    }

    public static final void OooO0OO(oOo000Oo ooo000oo, int i) {
        oo0oOO0 oo0ooo0 = new oo0oOO0(ooo000oo.f44923OooO0O0);
        oo0ooo0.OooOo0(R.string.Switch_Mic);
        oo0ooo0.OooOOOo(R.string.Switch);
        oo0ooo0.OooOo0o(new oOo0000O(ooo000oo, i));
        oo0oOO0.OooOoo0(oo0ooo0, false, 1, null);
        oo0ooo0.OooOOO0();
    }

    public final void OooO(int i, String str, boolean z, boolean z2) {
        MixedRoomService mixedRoomService = this.f44927OooO0o0;
        if (mixedRoomService != null) {
            Intrinsics.checkNotNull(mixedRoomService);
            if (!mixedRoomService.f11831Oooo0oo.OooOOo(p159o00OoOO.o000O00O.OooO().f32430Oooo0oo.getRoom().getId())) {
                return;
            }
        }
        o0O00000.OooO0OO("InRoom_take_mic");
        MixedRoomActivity mixedRoomActivity = this.f44923OooO0O0;
        oo0o0Oo.OooO00o oooO00o = oo0o0Oo.f48606OooO00o;
        boolean z3 = !o0O0O00.OooO0O0(mixedRoomActivity, oooO00o);
        o0O0O00.OooO0OO(this.f44923OooO0O0, oooO00o, null, new OooO0O0((z3 || this.f44928OooO0oO) ? z3 : true, z, z2, i, str));
    }

    @Override // p545o0o0OoOo.c8
    public final void OooO00o() {
    }

    @Override // p545o0o0OoOo.c8
    public final void OooO0O0() {
        int childCount = OooO0o().getChildCount();
        for (int i = 0; i < childCount; i++) {
            OooO0o0(i).setMicInformation(null);
        }
    }

    public final void OooO0Oo(boolean z) {
        o00O00OO o00o00oo2 = this.f44923OooO0O0.f11785o000OOo;
        if (o00o00oo2 != null) {
            o00o00oo2.OooO00o(z);
        }
    }

    public final RecyclerView OooO0o() {
        Object value = this.f44925OooO0Oo.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-rvMic>(...)");
        return (RecyclerView) value;
    }

    public final MixedRoomMicView OooO0o0(int i) {
        if (OooO0o().getChildAt(i) == null) {
            return new MixedRoomMicView(this.f44923OooO0O0);
        }
        View childAt = OooO0o().getChildAt(i);
        Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type com.app.base.mixedroom.MixedRoomMicView");
        return (MixedRoomMicView) childAt;
    }

    public final void OooO0oO(boolean z) {
        MixedRoomService mixedRoomService;
        o0O0o000 o0o0o000;
        ArrayList arrayList = new ArrayList();
        int size = p159o00OoOO.o000O00O.OooO().f32431OoooO.size();
        for (int i = 0; i < size; i++) {
            RoomLoginInformation.MIC mic = p159o00OoOO.o000O00O.OooO().f32431OoooO.get(i);
            if (mic != null) {
                arrayList.add(mic);
                MixedRoomService mixedRoomService2 = this.f44927OooO0o0;
                if ((mixedRoomService2 != null ? mixedRoomService2.f11831Oooo0oo : null) != null && mic.user != null && Intrinsics.areEqual(o00OO00O.f43313OooooOo.OooO00o().f43333OooOOoo.getValue(), Boolean.FALSE) && (mixedRoomService = this.f44927OooO0o0) != null && (o0o0o000 = mixedRoomService.f11831Oooo0oo) != null) {
                    o0o0o000.OooOo00((int) mic.user.getUserId(), mic.isMuteSound());
                }
            } else {
                arrayList.add(new RoomLoginInformation.MIC());
            }
            OooO0o0(i).setMicInformation((RoomLoginInformation.MIC) arrayList.get(i));
        }
        if (arrayList.isEmpty()) {
            for (int i2 = 0; i2 < 5; i2++) {
                arrayList.add(new RoomLoginInformation.MIC());
            }
        }
        OooO0OO<RoomLoginInformation.MIC> oooO0OO = this.f44926OooO0o;
        if (oooO0OO != null) {
            oooO0OO.setNewData(arrayList);
        }
        OooO0o().getLayoutParams().height = -2;
        OooO0OO<RoomLoginInformation.MIC> oooO0OO2 = this.f44926OooO0o;
        if (oooO0OO2 != null) {
            oooO0OO2.setLoadComplete();
        }
        o00O00OO o00o00oo2 = this.f44923OooO0O0.f11785o000OOo;
        if (o00o00oo2 != null) {
            OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
            o0OO00O o0oo00oOooO0o0 = OooOOO0.OooO0o0();
            StringBuilder sbOooO00o = o000OO00.OooO00o(o0oo00oOooO0o0, "room");
            sbOooO00o.append(OooOOO.f41216OooO00o.OooOo().getValue());
            if (o0oo00oOooO0o0.OooO00o(sbOooO00o.toString(), false)) {
                int iOooO0oo = p159o00OoOO.o000O00O.OooO().OooO0oo() - 1;
                o00o00oo2.f32530OooOO0o = iOooO0oo;
                if (iOooO0oo >= 0) {
                    RecyclerView.Adapter adapter = o00o00oo2.f32525OooO0o0.getAdapter();
                    Intrinsics.checkNotNull(adapter);
                    if (iOooO0oo <= adapter.getItemCount() - 1) {
                        o00o00oo2.f32525OooO0o0.getViewTreeObserver().addOnPreDrawListener(new oo00o(o00o00oo2));
                    }
                }
            }
        }
        if (z) {
            OooO0o().postDelayed(new OooOO0O(this, 1), 500L);
        }
    }

    public final void OooO0oo() {
        o0O0o000 o0o0o000;
        RoomUserInfoModel roomUserInfoModel;
        SparseArray<RoomLoginInformation.MIC> sparseArray = p159o00OoOO.o000O00O.OooO().f32431OoooO;
        o0OoOo0 o0oooo1 = new o0OoOo0(0);
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            RoomLoginInformation.MIC micValueAt = sparseArray.valueAt(i);
            if (micValueAt != null && (roomUserInfoModel = micValueAt.user) != null && roomUserInfoModel.getUserId() != 0) {
                o0oooo1.add(Long.valueOf(roomUserInfoModel.getUserId()));
            }
        }
        MixedRoomService mixedRoomService = this.f44927OooO0o0;
        if (mixedRoomService == null || (o0o0o000 = mixedRoomService.f11831Oooo0oo) == null) {
            return;
        }
        o0o0o000.OooOOOO(o0oooo1);
    }
}
