package p580o0oOoOo;

import androidx.lifecycle.LifecycleOwner;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p518o0o0O00o.o0O0ooO;

/* JADX INFO: loaded from: classes3.dex */
public final class oO0OoOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ LifecycleOwner f46647Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OoOO0(LifecycleOwner lifecycleOwner) {
        super(0);
        this.f46647Oooo0o = lifecycleOwner;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SharedUrlManager.INSTANCE.getRoomMemberTaskRule().observe(this.f46647Oooo0o, o0O0ooO.f42206OooO0OO);
        return Unit.INSTANCE;
    }
}
