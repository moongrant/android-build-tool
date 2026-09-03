package p509o0o0O0;

import androidx.compose.runtime.MutableState;
import com.jeremyliao.liveeventbus.LiveEventBus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<Integer> f50982OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f50983OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0000O(MutableState<Integer> mutableState, int i) {
        super(0);
        this.f50982OooO0Oo = mutableState;
        this.f50983OooO0o0 = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        LiveEventBus.get("SHOW_BOTTOM_SHEET_POSITION").post(Boolean.TRUE);
        this.f50982OooO0Oo.setValue(Integer.valueOf(this.f50983OooO0o0));
        o0OO000.OooO00o("103043");
        return Unit.INSTANCE;
    }
}
