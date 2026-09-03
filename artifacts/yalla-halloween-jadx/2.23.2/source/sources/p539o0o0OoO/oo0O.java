package p539o0o0OoO;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import com.code.android.util.o0000O0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomUserActionRecordScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomUserActionRecordScreen.kt\ncom/yalla/yalla/ui/screen/room/RoomUserActionRecordScreenKt$RoomUserActionRecordScreenContent$1$4$1$2$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,318:1\n154#2:319\n*S KotlinDebug\n*F\n+ 1 RoomUserActionRecordScreen.kt\ncom/yalla/yalla/ui/screen/room/RoomUserActionRecordScreenKt$RoomUserActionRecordScreenContent$1$4$1$2$1$1\n*L\n130#1:319\n*E\n"})
public final class oo0O extends Lambda implements Function1<IntSize, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Dp> f54625OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0O(MutableState<Dp> mutableState) {
        super(1);
        this.f54625OooO0Oo = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(IntSize intSize) {
        float fM3775constructorimpl = Dp.m3775constructorimpl(o0000O0.OooO0O0(IntSize.m3934getHeightimpl(intSize.getPackedValue())));
        MutableState<Dp> mutableState = this.f54625OooO0Oo;
        if (Dp.m3774compareTo0680j_4(fM3775constructorimpl, mutableState.getValue().m3789unboximpl()) > 0) {
            mutableState.setValue(Dp.m3773boximpl(fM3775constructorimpl));
        }
        return Unit.INSTANCE;
    }
}
