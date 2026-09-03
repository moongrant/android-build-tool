package p487o0o00O;

import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.activity.main.MainSearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class o000OO00 extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainSearchActivity f48787OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(MainSearchActivity mainSearchActivity) {
        super(1);
        this.f48787OooO0Oo = mainSearchActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String it = str;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.length() == 0) {
            LiveEventBus.get("MainSearch").post("");
        }
        int i = MainSearchActivity.f24960OooOoO;
        this.f48787OooO0Oo.OooOoO0().setSearchText(it);
        return Unit.INSTANCE;
    }
}
