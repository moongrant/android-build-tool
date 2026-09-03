package p669oO0Oo;

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
import o000O0.OooO0O0;
import p577o0oOoOoO.oOO000o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O000 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ long f60521OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LazyListState f60522OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ int f60523OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<RoomMemberTaskInfoModel> f60524OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ oOO000o f60525OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ long f60526OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ int f60527OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ int f60528OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ long f60529OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final /* synthetic */ Context f60530OooOOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000(LazyListState lazyListState, OooO0O0<RoomMemberTaskInfoModel> oooO0O0, int i, oOO000o ooo000o, long j, long j2, int i2, int i3, long j3, Context context) {
        super(3);
        this.f60522OooO0Oo = lazyListState;
        this.f60524OooO0o0 = oooO0O0;
        this.f60523OooO0o = i;
        this.f60525OooO0oO = ooo000o;
        this.f60526OooO0oo = j;
        this.f60521OooO = j2;
        this.f60527OooOO0 = i2;
        this.f60528OooOO0O = i3;
        this.f60529OooOO0o = j3;
        this.f60530OooOOO0 = context;
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
                ComposerKt.traceEventStart(1980526327, iIntValue, -1, "com.yalla.yalla.ui.dialog.room.LiveRoomMemberTaskDialog.OnDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LiveRoomMemberTaskDialog.kt:212)");
            }
            LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), this.f60522OooO0Oo, null, false, null, null, null, false, new o00oOoo(this.f60524OooO0o0, this.f60523OooO0o, this.f60525OooO0oO, this.f60526OooO0oo, this.f60521OooO, this.f60527OooOO0, this.f60528OooOO0O, this.f60529OooOO0o, this.f60530OooOOO0), composer2, 6, 252);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
