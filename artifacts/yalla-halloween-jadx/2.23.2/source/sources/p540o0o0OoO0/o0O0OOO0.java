package p540o0o0OoO0;

import android.content.Context;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.yalla.yalla.model.room.RoomMemberTaskInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p107o000ooO0.OooOOOO;
import p581o0oOoo.o0000O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OOO0 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ long f54791OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LazyListState f54792OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f54793OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<RoomMemberTaskInfoModel> f54794OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0000O0 f54795OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ long f54796OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ int f54797OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ int f54798OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ long f54799OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ Context f54800OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOO0(LazyListState lazyListState, OooOOOO<RoomMemberTaskInfoModel> oooOOOO, int i, o0000O0 o0000o1, long j, long j2, int i2, int i3, long j3, Context context) {
        super(3);
        this.f54792OooO0Oo = lazyListState;
        this.f54794OooO0o0 = oooOOOO;
        this.f54793OooO0o = i;
        this.f54795OooO0oO = o0000o1;
        this.f54796OooO0oo = j;
        this.f54791OooO = j2;
        this.f54797OooOO0 = i2;
        this.f54798OooOO0O = i3;
        this.f54799OooOO0o = j3;
        this.f54800OooOOO0 = context;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
        BoxScope RefreshContentStatus = boxScope;
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullParameter(RefreshContentStatus, "$this$RefreshContentStatus");
        if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1980526327, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskDialog.OnDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LiveRoomMemberTaskDialog.kt:213)");
            }
            LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), this.f54792OooO0Oo, null, false, null, null, null, false, new o0O0OO0(this.f54794OooO0o0, this.f54793OooO0o, this.f54795OooO0oO, this.f54796OooO0oo, this.f54791OooO, this.f54797OooOO0, this.f54798OooOO0O, this.f54799OooOO0o, this.f54800OooOOO0), composer2, 6, 252);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
