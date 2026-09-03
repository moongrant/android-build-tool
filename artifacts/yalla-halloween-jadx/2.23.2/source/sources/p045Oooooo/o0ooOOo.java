package p045Oooooo;

import androidx.compose.ui.graphics.colorspace.DoubleFunction;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.graphics.colorspace.TransferParameters;
import com.yalla.yalla.ui.activity.room.RoomMoraGameHistoryActivity;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import p559o0oOo.o00O0O;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0ooOOo implements o000Oo0.OooO0OO, DoubleFunction, o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1993OooO0Oo;

    public /* synthetic */ o0ooOOo(Object obj) {
        this.f1993OooO0Oo = obj;
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        RoomMoraGameHistoryActivity this$0 = (RoomMoraGameHistoryActivity) this.f1993OooO0Oo;
        int i = RoomMoraGameHistoryActivity.f26161OooOoOO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOo0(false);
    }

    @Override // o0ooOO0.o000Oo0.OooO0OO
    public final Object OooO0o0(o000Oo0.OooO00o oooO00o) {
        ((AtomicReference) this.f1993OooO0Oo).set(oooO00o);
        return "acquireInputBuffer";
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return Rgb._init_$lambda$7((TransferParameters) this.f1993OooO0Oo, d);
    }
}
