package p587o0oOoo0O;

import androidx.paging.compose.OooO0OO;
import androidx.paging.compose.OooOO0;
import com.yalla.yalla.model.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p027Oooo0o.o000;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00OOO extends Lambda implements Function1<o000, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO<EventModel> f47057Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00OOO(OooO0OO<EventModel> oooO0OO) {
        super(1);
        this.f47057Oooo0o = oooO0OO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o000 o000Var) {
        o000 LazyColumn = o000Var;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        if (this.f47057Oooo0o.OooO0OO() > 0) {
            o0OO0o00 o0oo0o01 = o0OO0o00.f46991OooO00o;
            LazyColumn.OooO0O0(null, null, o0OO0o00.f46992OooO0O0);
        }
        OooO0OO<EventModel> oooO0OO = this.f47057Oooo0o;
        o0OO0o00 o0oo0o02 = o0OO0o00.f46991OooO00o;
        OooOO0.OooO0OO(LazyColumn, oooO0OO, o0OO0o00.f46993OooO0OO);
        return Unit.INSTANCE;
    }
}
