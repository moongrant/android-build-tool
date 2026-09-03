package p587o0oOoo0O;

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
import p254o00ooO0O.o000O0O0;
import p259o00ooOo.o0O00;
import p259o00ooOo.o0O00O0o;

/* JADX INFO: loaded from: classes3.dex */
public final class oO00000o extends Lambda implements Function1<o000, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO<EventModel> f47022Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Context f47023Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f47024Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00000o(OooO0OO<EventModel> oooO0OO, Context context, EventViewModel eventViewModel) {
        super(1);
        this.f47022Oooo0o = oooO0OO;
        this.f47023Oooo0oO = context;
        this.f47024Oooo0oo = eventViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o000 o000Var) {
        o000 LazyColumn = o000Var;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        OooOO0.OooO0OO(LazyColumn, this.f47022Oooo0o, o00O0000.OooO0O0(-1524511858, true, new oO00000(this.f47023Oooo0oO, this.f47024Oooo0oo)));
        o0O00.OooO0Oo(LazyColumn, this.f47022Oooo0o, o000O0O0.OooO0OO(o0O00O0o.refreshcontentstate_no_more_data));
        return Unit.INSTANCE;
    }
}
