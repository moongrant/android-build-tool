package p442o0OoOoO0;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.yalla.yalla.model.SquareEventRoomModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O00 extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ SnapshotStateList<SquareEventRoomModel> f46220OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Context f46221OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00(SnapshotStateList<SquareEventRoomModel> snapshotStateList, Context context) {
        super(1);
        this.f46220OooO0Oo = snapshotStateList;
        this.f46221OooO0o0 = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyRow = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        SnapshotStateList<SquareEventRoomModel> snapshotStateList = this.f46220OooO0Oo;
        LazyListScope.CC.OooOO0O(LazyRow, snapshotStateList.size(), null, null, ComposableLambdaKt.composableLambdaInstance(1669635785, true, new o0O000o0(snapshotStateList, this.f46221OooO0o0)), 6, null);
        return Unit.INSTANCE;
    }
}
