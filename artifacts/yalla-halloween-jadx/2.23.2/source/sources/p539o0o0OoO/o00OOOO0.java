package p539o0o0OoO;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.code.android.util.o0000;
import com.yalla.yalla.model.room.RoomUserRecordModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import p107o000ooO0.OooOOOO;
import p194o00o0OO.o00O00o0;
import p201o00o0Ooo.o0O0000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOOO0 extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f54579OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<RoomUserRecordModel> f54580OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<RoomUserRecordModel> f54581OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f54582OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f54583OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOOO0(String str, OooOOOO<RoomUserRecordModel> oooOOOO, OooOOOO<RoomUserRecordModel> oooOOOO2, int i, int i2) {
        super(1);
        this.f54579OooO0Oo = str;
        this.f54581OooO0o0 = oooOOOO;
        this.f54580OooO0o = oooOOOO2;
        this.f54582OooO0oO = i;
        this.f54583OooO0oo = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        String str = this.f54579OooO0Oo;
        boolean z = !StringsKt.isBlank(str);
        OooOOOO<RoomUserRecordModel> oooOOOO = this.f54581OooO0o0;
        OooOOOO<RoomUserRecordModel> oooOOOO2 = this.f54580OooO0o;
        LazyListScope.CC.OooOO0O(LazyColumn, z ? oooOOOO.OooO0O0() : oooOOOO2.OooO0O0(), null, null, ComposableLambdaKt.composableLambdaInstance(344257863, true, new o0o0Oo(this.f54579OooO0Oo, this.f54581OooO0o0, this.f54580OooO0o, this.f54582OooO0oO, this.f54583OooO0oo)), 6, null);
        if (!(!StringsKt.isBlank(str))) {
            oooOOOO = oooOOOO2;
        }
        o0O0000O.OooO00o(LazyColumn, oooOOOO, o0000.OooO0OO(o00O00o0.refreshcontentstate_no_more_data));
        return Unit.INSTANCE;
    }
}
