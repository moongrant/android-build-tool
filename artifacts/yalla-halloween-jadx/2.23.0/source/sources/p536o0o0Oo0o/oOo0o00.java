package p536o0o0Oo0o;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.yalla.yalla.ui.vm.moment.MomentUserListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oOo0o00 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentUserListVM f55259OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ LazyListState f55260OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f55261OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ int f55262OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo0o00(MomentUserListVM momentUserListVM, String str, LazyListState lazyListState, int i) {
        super(2);
        this.f55259OooO0Oo = momentUserListVM;
        this.f55261OooO0o0 = str;
        this.f55260OooO0o = lazyListState;
        this.f55262OooO0oO = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        num.intValue();
        int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55262OooO0oO | 1);
        String str = this.f55261OooO0o0;
        LazyListState lazyListState = this.f55260OooO0o;
        O0OO00.OooO0Oo(this.f55259OooO0Oo, str, lazyListState, composer, iUpdateChangedFlags);
        return Unit.INSTANCE;
    }
}
