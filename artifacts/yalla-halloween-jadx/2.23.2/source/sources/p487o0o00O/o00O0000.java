package p487o0o00O;

import com.yalla.yalla.ui.activity.main.MainSearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o0oo0000.OooO00o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0000 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainSearchActivity f48800OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0000(MainSearchActivity mainSearchActivity) {
        super(0);
        this.f48800OooO0Oo = mainSearchActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        OooO00o.OooO0O0("101032");
        int i = MainSearchActivity.f24960OooOoO;
        MainSearchActivity mainSearchActivity = this.f48800OooO0Oo;
        mainSearchActivity.OooOoO(mainSearchActivity.OooOoO0().getSearchText());
        return Unit.INSTANCE;
    }
}
