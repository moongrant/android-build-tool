package p531o0o0OOoo;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.code.android.util.o0000;
import com.yalla.yalla.model.room.RoomUserRecordModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o000O0.OooO0O0;
import p148o00Oo0o.oo0o0Oo;
import p153o00OoO0.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ String f54538OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<RoomUserRecordModel> f54539OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooO0O0<RoomUserRecordModel> f54540OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f54541OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ int f54542OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String str, OooO0O0<RoomUserRecordModel> oooO0O0, OooO0O0<RoomUserRecordModel> oooO0O1, int i, int i2) {
        super(1);
        this.f54538OooO0Oo = str;
        this.f54540OooO0o0 = oooO0O0;
        this.f54539OooO0o = oooO0O1;
        this.f54541OooO0oO = i;
        this.f54542OooO0oo = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        String str = this.f54538OooO0Oo;
        boolean z = !StringsKt.isBlank(str);
        OooO0O0<RoomUserRecordModel> oooO0O0 = this.f54540OooO0o0;
        OooO0O0<RoomUserRecordModel> oooO0O1 = this.f54539OooO0o;
        LazyListScope.CC.OooOO0O(LazyColumn, z ? oooO0O0.OooO0O0() : oooO0O1.OooO0O0(), null, null, ComposableLambdaKt.composableLambdaInstance(344257863, true, new v(this.f54538OooO0Oo, this.f54540OooO0o0, this.f54539OooO0o, this.f54541OooO0oO, this.f54542OooO0oo)), 6, null);
        if (!(!StringsKt.isBlank(str))) {
            oooO0O0 = oooO0O1;
        }
        OooOo00.OooO00o(LazyColumn, oooO0O0, o0000.OooO0OO(oo0o0Oo.refreshcontentstate_no_more_data));
        return Unit.INSTANCE;
    }
}
