package p486o0o00O00;

import com.yalla.yalla.ui.activity.main.MainSearchActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0ooO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MainSearchActivity f48384OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0ooO(MainSearchActivity mainSearchActivity) {
        super(0);
        this.f48384OooO0Oo = mainSearchActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        o0OO000.OooO00o("101032");
        int i = MainSearchActivity.f25414OooOoO;
        MainSearchActivity mainSearchActivity = this.f48384OooO0Oo;
        MainSearchActivity.OooOo(mainSearchActivity, mainSearchActivity.OooOoO().getSearchText());
        return Unit.INSTANCE;
    }
}
