package p540o0o0OoO0;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.model.room.RoomMemberTaskInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p107o000ooO0.OooOOO;
import p107o000ooO0.OooOOOO;
import p581o0oOoo.o0000O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0OO0 extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f54782OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<RoomMemberTaskInfoModel> f54783OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o0000O0 f54784OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f54785OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f54786OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ long f54787OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ int f54788OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ long f54789OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ Context f54790OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OO0(OooOOOO<RoomMemberTaskInfoModel> oooOOOO, int i, o0000O0 o0000o1, long j, long j2, int i2, int i3, long j3, Context context) {
        super(1);
        this.f54783OooO0Oo = oooOOOO;
        this.f54785OooO0o0 = i;
        this.f54784OooO0o = o0000o1;
        this.f54786OooO0oO = j;
        this.f54787OooO0oo = j2;
        this.f54782OooO = i2;
        this.f54788OooOO0 = i3;
        this.f54789OooOO0O = j3;
        this.f54790OooOO0o = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.CC.OooO(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-623477533, true, new o0O0oo0o(this.f54785OooO0o0, this.f54784OooO0o, this.f54786OooO0oO, this.f54787OooO0oo, this.f54782OooO, this.f54788OooOO0)), 3, null);
        OooOOOO<RoomMemberTaskInfoModel> oooOOOO = this.f54783OooO0Oo;
        int iOooO0O0 = oooOOOO.OooO0O0();
        Intrinsics.checkNotNullParameter(oooOOOO, "<this>");
        LazyListScope.CC.OooOO0O(LazyColumn, iOooO0O0, new OooOOO(oooOOOO, o0O0O0Oo.f54778OooO0Oo), null, ComposableLambdaKt.composableLambdaInstance(1656485178, true, new o0O0O0o0(oooOOOO, this.f54789OooOO0O, this.f54790OooOO0o)), 4, null);
        LazyListScope.CC.OooO(LazyColumn, null, null, oo00oO.f55041OooO00o, 3, null);
        return Unit.INSTANCE;
    }
}
