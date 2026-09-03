package p475o0o000;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomCommonData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomCommonData.kt\ncom/yalla/yalla/service/room/data/RoomCommonData\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,19:1\n81#2:20\n107#2,2:21\n*S KotlinDebug\n*F\n+ 1 RoomCommonData.kt\ncom/yalla/yalla/service/room/data/RoomCommonData\n*L\n17#1:20\n17#1:21,2\n*E\n"})
public final class o000oOoO extends Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final MutableSharedFlow<Integer> f47437OooO00o = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MutableState<Boolean> f47438OooO0O0 = Oooo000.OooO0OO(OooO0O0.f47441OooO0Oo);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final MutableState f47439OooO0OO = Oooo000.OooO0OO(OooO00o.f47440OooO0Oo);

    public static final class OooO00o extends Lambda implements Function0<WebPageInfo> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f47440OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final WebPageInfo invoke() {
            return WebPageInfo.f32815OooOOo;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f47441OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public final void OooO0Oo(@NotNull WebPageInfo webPageInfo) {
        Intrinsics.checkNotNullParameter(webPageInfo, "<set-?>");
        this.f47439OooO0OO.setValue(webPageInfo);
    }
}
