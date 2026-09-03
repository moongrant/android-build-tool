package p587o0oOoo0O;

import androidx.paging.compose.OooO0OO;
import androidx.paging.compose.OooOO0;
import com.yalla.yalla.model.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p027Oooo0o.o000;
import p043OooooO0.o00O0000;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0OO extends Lambda implements Function1<o000, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO<EventModel> f47001Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0OO(OooO0OO<EventModel> oooO0OO) {
        super(1);
        this.f47001Oooo0o = oooO0OO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o000 o000Var) {
        o000 LazyColumn = o000Var;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        OooO0OO<EventModel> oooO0OO = this.f47001Oooo0o;
        o0OO0 o0oo1 = o0OO0.f46977OooO00o;
        OooOO0.OooO0O0(LazyColumn, oooO0OO, null, o0OO0.f46979OooO0OO);
        if (this.f47001Oooo0o.OooO0OO() > 0) {
            LazyColumn.OooO0O0(null, null, o00O0000.OooO0O0(-173259056, true, new o0OOO0(this.f47001Oooo0o)));
        }
        return Unit.INSTANCE;
    }
}
