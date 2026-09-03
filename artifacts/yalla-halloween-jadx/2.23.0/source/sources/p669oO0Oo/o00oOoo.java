package p669oO0Oo;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yalla.yalla.model.room.RoomMemberTaskInfoModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O0.OooO00o;
import o000O0.OooO0O0;
import p577o0oOoOoO.oOO000o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00oOoo extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final /* synthetic */ int f60579OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<RoomMemberTaskInfoModel> f60580OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ oOO000o f60581OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f60582OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ long f60583OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ long f60584OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ int f60585OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ long f60586OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ Context f60587OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oOoo(OooO0O0<RoomMemberTaskInfoModel> oooO0O0, int i, oOO000o ooo000o, long j, long j2, int i2, int i3, long j3, Context context) {
        super(1);
        this.f60580OooO0Oo = oooO0O0;
        this.f60582OooO0o0 = i;
        this.f60581OooO0o = ooo000o;
        this.f60583OooO0oO = j;
        this.f60584OooO0oo = j2;
        this.f60579OooO = i2;
        this.f60585OooOO0 = i3;
        this.f60586OooOO0O = j3;
        this.f60587OooOO0o = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.CC.OooO(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-623477533, true, new o00(this.f60582OooO0o0, this.f60581OooO0o, this.f60583OooO0oO, this.f60584OooO0oo, this.f60579OooO, this.f60585OooOO0)), 3, null);
        OooO0O0<RoomMemberTaskInfoModel> oooO0O0 = this.f60580OooO0Oo;
        int iOooO0O0 = oooO0O0.OooO0O0();
        o00O0000 o00o0001 = o00O0000.f60531OooO0Oo;
        Intrinsics.checkNotNullParameter(oooO0O0, "<this>");
        LazyListScope.CC.OooOO0O(LazyColumn, iOooO0O0, new OooO00o(oooO0O0, o00o0001), null, ComposableLambdaKt.composableLambdaInstance(1656485178, true, new o0O0ooO(oooO0O0, this.f60586OooOO0O, this.f60587OooOO0o)), 4, null);
        LazyListScope.CC.OooO(LazyColumn, null, null, o0000Ooo.f60450OooO00o, 3, null);
        return Unit.INSTANCE;
    }
}
