package p591o0oOooOo;

import android.content.Context;
import androidx.paging.compose.OooO0OO;
import androidx.paging.compose.OooOO0;
import com.yalla.yalla.model.EventModel;
import com.yalla.yalla.ui.vm.event.EventViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p027Oooo0o.o000;
import p043OooooO0.o00O0000;

/* JADX INFO: loaded from: classes3.dex */
public final class u4 extends Lambda implements Function1<o000, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO<EventModel> f47349Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Context f47350Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f47351Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(OooO0OO<EventModel> oooO0OO, Context context, EventViewModel eventViewModel) {
        super(1);
        this.f47349Oooo0o = oooO0OO;
        this.f47350Oooo0oO = context;
        this.f47351Oooo0oo = eventViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o000 o000Var) {
        o000 LazyColumn = o000Var;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        OooOO0.OooO0O0(LazyColumn, this.f47349Oooo0o, null, o00O0000.OooO0O0(-2030947402, true, new t4(this.f47350Oooo0oO, this.f47351Oooo0oo)));
        return Unit.INSTANCE;
    }
}
