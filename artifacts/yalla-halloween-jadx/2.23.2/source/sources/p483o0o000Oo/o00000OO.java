package p483o0o000Oo;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.model.CheckConveneMemberStatusModel;
import com.yalla.yalla.model.GetConveneMemberStateModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p414o0Oo0oO.oO0OOo0o;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomMemberConveneData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomMemberConveneData.kt\ncom/yalla/yalla/service/room/data/RoomMemberConveneData\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,24:1\n81#2:25\n107#2,2:26\n*S KotlinDebug\n*F\n+ 1 RoomMemberConveneData.kt\ncom/yalla/yalla/service/room/data/RoomMemberConveneData\n*L\n14#1:25\n14#1:26,2\n*E\n"})
public final class o00000OO extends o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableState f48485OooO00o = o0ooOOo.OooO0OO(OooO0O0.f48489OooO0Oo);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<GetConveneMemberStateModel> f48486OooO0O0 = o0ooOOo.OooO00o(OooO0OO.f48490OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<CheckConveneMemberStatusModel> f48487OooO0OO = o0ooOOo.OooO00o(OooO00o.f48488OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<CheckConveneMemberStatusModel> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f48488OooO0Oo = new OooO00o();

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
        public static final OooO0O0 f48489OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            oO0OOo0o oo0ooo0oOooO0o0 = o00Ooo.OooO0o0();
            oo0ooo0oOooO0o0.getClass();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            return Boolean.valueOf(oo0ooo0oOooO0o0.OooO0O0("isConveneMembersRead" + o0O00oO0.OooOOo0().getValue(), true));
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<GetConveneMemberStateModel> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f48490OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ GetConveneMemberStateModel invoke() {
            return null;
        }
    }
}
