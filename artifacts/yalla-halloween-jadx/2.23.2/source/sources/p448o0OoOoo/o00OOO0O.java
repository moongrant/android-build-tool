package p448o0OoOoo;

import android.content.Context;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.code.android.util.o0000;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.module.event.vm.EventViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p107o000ooO0.OooOOOO;
import p194o00o0OO.o00O00o0;
import p201o00o0Ooo.o0O0000O;

/* JADX INFO: loaded from: classes4.dex */
public final class o00OOO0O extends Lambda implements Function1<LazyListScope, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ OooOOOO<EventModel> f47435OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f47436OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Context f47437OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0O(OooOOOO<EventModel> oooOOOO, Context context, EventViewModel eventViewModel) {
        super(1);
        this.f47435OooO0Oo = oooOOOO;
        this.f47437OooO0o0 = context;
        this.f47436OooO0o = eventViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LazyListScope lazyListScope) {
        LazyListScope LazyColumn = lazyListScope;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        OooOOOO<EventModel> oooOOOO = this.f47435OooO0Oo;
        LazyListScope.CC.OooOO0O(LazyColumn, oooOOOO.OooO0O0(), null, null, ComposableLambdaKt.composableLambdaInstance(1241062666, true, new o00OOO0(oooOOOO, this.f47437OooO0o0, this.f47436OooO0o)), 6, null);
        o0O0000O.OooO00o(LazyColumn, oooOOOO, o0000.OooO0OO(o00O00o0.refreshcontentstate_no_more_data));
        return Unit.INSTANCE;
    }
}
