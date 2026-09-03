package p519o0o0O0OO;

import androidx.compose.runtime.MutableState;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o0OO0o00 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Integer> f52446OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f52447OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0o00(MutableState<Integer> mutableState, int i) {
        super(0);
        this.f52446OooO0Oo = mutableState;
        this.f52447OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LiveEventBus.get("SHOW_BOTTOM_SHEET_POSITION").post(Boolean.TRUE);
        this.f52446OooO0Oo.setValue(Integer.valueOf(this.f52447OooO0o0));
        OooO00o.OooO0O0("103043");
        return Unit.INSTANCE;
    }
}
