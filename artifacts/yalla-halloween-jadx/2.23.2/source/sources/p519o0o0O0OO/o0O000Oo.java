package p519o0o0O0OO;

import com.code.android.util.OooOOO;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.ui.composable.moment.TempAtVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000Oo extends Lambda implements Function1<UserInfo, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f52253OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentVideoVM f52254OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ TempAtVM f52255OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000Oo(TempAtVM tempAtVM, MomentVideoVM momentVideoVM, CoroutineScope coroutineScope) {
        super(1);
        this.f52253OooO0Oo = coroutineScope;
        this.f52255OooO0o0 = tempAtVM;
        this.f52254OooO0o = momentVideoVM;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(UserInfo userInfo) {
        MomentVideoVM momentVideoVM = this.f52254OooO0o;
        OooOOO.OooO0O0(this.f52253OooO0Oo, new o0OoOoOo(this.f52255OooO0o0, userInfo, momentVideoVM, null));
        return Unit.INSTANCE;
    }
}
