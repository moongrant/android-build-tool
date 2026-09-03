package androidx.compose.ui.platform;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO00 extends Lambda implements Function1<Object, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Channel<Unit> f6443Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO00(Channel<Unit> channel) {
        super(1);
        this.f6443Oooo0o = channel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Channel<Unit> channel = this.f6443Oooo0o;
        Unit unit = Unit.INSTANCE;
        channel.mo2017trySendJP2dKIU(unit);
        return unit;
    }
}
