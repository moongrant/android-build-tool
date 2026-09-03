package p536o0o0Oo0o;

import androidx.compose.runtime.State;
import com.yalla.yalla.ui.screen.user.FollowingScreen;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0000Oo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ State<Integer> f55088OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0000Oo(State<Integer> state) {
        super(0);
        this.f55088OooO0Oo = state;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        FollowingScreen followingScreen = FollowingScreen.INSTANCE;
        Integer value = this.f55088OooO0Oo.getValue();
        followingScreen.navigate(value == null ? 0 : value.intValue());
        return Unit.INSTANCE;
    }
}
