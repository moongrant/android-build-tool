package p475o0o000;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.model.CheckConveneMemberStatusModel;
import com.yalla.yalla.model.GetConveneMemberStateModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o0O0O00;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomMemberConveneData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMemberConveneData.kt\ncom/yalla/yalla/service/room/data/RoomMemberConveneData\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,24:1\n81#2:25\n107#2,2:26\n*S KotlinDebug\n*F\n+ 1 RoomMemberConveneData.kt\ncom/yalla/yalla/service/room/data/RoomMemberConveneData\n*L\n14#1:25\n14#1:26,2\n*E\n"})
public final class o0OO00O extends Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableState f47467OooO00o = Oooo000.OooO0OO(OooO0O0.f47471OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<GetConveneMemberStateModel> f47468OooO0O0 = Oooo000.OooO00o(OooO0OO.f47472OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<CheckConveneMemberStatusModel> f47469OooO0OO = Oooo000.OooO00o(OooO00o.f47470OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<CheckConveneMemberStatusModel> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f47470OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ CheckConveneMemberStatusModel invoke() {
            return null;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f47471OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            o0O0O00 o0o0o00OooO0o0 = o00Oo0.OooO0o0();
            o0o0o00OooO0o0.getClass();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            return Boolean.valueOf(o0o0o00OooO0o0.OooO0O0("isConveneMembersRead" + o000000O.OooOOo0().getValue(), true));
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<GetConveneMemberStateModel> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f47472OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ GetConveneMemberStateModel invoke() {
            return null;
        }
    }
}
