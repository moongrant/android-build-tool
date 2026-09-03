package p587o0oOoo0O;

import android.content.Context;
import com.yalla.yalla.model.SquareEventRoomModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p027Oooo0o.o000;
import p027Oooo0o.o0000O;
import p043OooooO0.o00O0000;
import p047Oooooo0.o00OO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0o0o extends Lambda implements Function1<o000, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00OO0OO<SquareEventRoomModel> f47072Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Context f47073Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0o0o(o00OO0OO<SquareEventRoomModel> o00oo0oo, Context context) {
        super(1);
        this.f47072Oooo0o = o00oo0oo;
        this.f47073Oooo0oO = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o000 o000Var) {
        o000 LazyRow = o000Var;
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        o0000O.OooO0O0(LazyRow, this.f47072Oooo0o.size(), null, null, o00O0000.OooO0O0(-104839175, true, new oO0Ooooo(this.f47072Oooo0o, this.f47073Oooo0oO)), 6, null);
        return Unit.INSTANCE;
    }
}
