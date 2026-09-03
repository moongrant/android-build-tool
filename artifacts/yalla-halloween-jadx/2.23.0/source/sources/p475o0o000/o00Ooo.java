package p475o0o000;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.android.billingclient.api.o0000OO0;
import com.yalla.yalla.mixedroom.model.RoomGameConfig;
import com.yalla.yalla.model.RoomRunWayModel;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p385o0OOooOO.oOO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomGiftData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomGiftData.kt\ncom/yalla/yalla/service/room/data/RoomGiftData\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,40:1\n81#2:41\n81#2:42\n107#2,2:43\n81#2:45\n107#2,2:46\n81#2:48\n107#2,2:49\n81#2:51\n107#2,2:52\n81#2:54\n107#2,2:55\n*S KotlinDebug\n*F\n+ 1 RoomGiftData.kt\ncom/yalla/yalla/service/room/data/RoomGiftData\n*L\n18#1:41\n20#1:42\n20#1:43,2\n22#1:45\n22#1:46,2\n25#1:48\n25#1:49,2\n28#1:51\n28#1:52,2\n31#1:54\n31#1:55,2\n*E\n"})
public final class o00Ooo extends Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableState f47448OooO00o = Oooo000.OooO0OO(OooO0O0.f47458OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableState f47449OooO0O0 = Oooo000.OooO0OO(OooO0o.f47460OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState f47450OooO0OO = Oooo000.OooO0OO(OooO0OO.f47459OooO0Oo);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MutableState f47451OooO0Oo = Oooo000.OooO0OO(OooO00o.f47457OooO0Oo);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final MutableState f47453OooO0o0 = Oooo000.OooO0OO(OooO.f47456OooO0Oo);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableState f47452OooO0o = Oooo000.OooO0OO(OooOO0.f47461OooO0Oo);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final com.yalla.yalla.util.eventlivedata.OooO00o<Boolean> f47454OooO0oO = new com.yalla.yalla.util.eventlivedata.OooO00o<>();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final com.yalla.yalla.util.eventlivedata.OooO00o<RoomRunWayModel> f47455OooO0oo = new com.yalla.yalla.util.eventlivedata.OooO00o<>();

    public static final class OooO extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f47456OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return 0;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f47457OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oOO00O.f44351OooO00o;
            return Boolean.valueOf(oOO00O.OooO0OO());
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f47458OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            return new MutableLiveData<>(Boolean.valueOf(o0000OO0.OooO0O0().OooO0O0("FIRST_SEND_GIFT", true)));
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f47459OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return -1;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<List<RoomGameConfig.NewGift>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f47460OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<RoomGameConfig.NewGift> invoke() {
            return new ArrayList();
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f47461OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(GiftPropTypeUser.Hot.getValue());
        }
    }

    public final void OooO0Oo(boolean z) {
        this.f47451OooO0Oo.setValue(Boolean.valueOf(z));
    }
}
