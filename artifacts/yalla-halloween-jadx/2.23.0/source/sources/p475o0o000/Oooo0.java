package p475o0o000;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o0O0O00;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomChatData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomChatData.kt\ncom/yalla/yalla/service/room/data/RoomChatData\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,21:1\n81#2:22\n107#2,2:23\n81#2:25\n107#2,2:26\n81#2:28\n*S KotlinDebug\n*F\n+ 1 RoomChatData.kt\ncom/yalla/yalla/service/room/data/RoomChatData\n*L\n12#1:22\n12#1:23,2\n15#1:25\n15#1:26,2\n18#1:28\n*E\n"})
public final class Oooo0 extends Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableState f47360OooO00o = Oooo000.OooO0OO(OooO0O0.f47364OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableState f47361OooO0O0 = Oooo000.OooO0OO(OooO00o.f47363OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState f47362OooO0OO = Oooo000.OooO0OO(OooO0OO.f47365OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<Long> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f47363OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return 0L;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f47364OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ String invoke() {
            return "";
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<MutableLiveData<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f47365OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableLiveData<Boolean> invoke() {
            o0O0O00 o0o0o00OooO0o0 = o00Oo0.OooO0o0();
            o0o0o00OooO0o0.getClass();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            return new MutableLiveData<>(Boolean.valueOf(o0o0o00OooO0o0.OooO0O0("roomChat" + o000000O.OooOOo0().getValue(), false)));
        }
    }
}
