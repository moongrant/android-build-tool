package p591o0oOooOo;

import androidx.paging.compose.OooO0OO;
import androidx.paging.compose.OooOO0;
import com.yalla.yalla.model.EventModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p027Oooo0o.o000;
import p254o00ooO0O.o000O0O0;
import p259o00ooOo.o0O00;
import p259o00ooOo.o0O00O0o;

/* JADX INFO: loaded from: classes3.dex */
public final class e5 extends Lambda implements Function1<o000, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO<EventModel> f47229Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(OooO0OO<EventModel> oooO0OO) {
        super(1);
        this.f47229Oooo0o = oooO0OO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o000 o000Var) {
        o000 LazyColumn = o000Var;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        OooO0OO<EventModel> oooO0OO = this.f47229Oooo0o;
        w3 w3Var = w3.f47356OooO00o;
        OooOO0.OooO0O0(LazyColumn, oooO0OO, null, w3.f47357OooO0O0);
        o0O00.OooO0Oo(LazyColumn, this.f47229Oooo0o, o000O0O0.OooO0OO(o0O00O0o.refreshcontentstate_no_more_data));
        return Unit.INSTANCE;
    }
}
