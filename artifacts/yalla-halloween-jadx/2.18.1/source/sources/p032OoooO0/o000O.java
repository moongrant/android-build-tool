package p032OoooO0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f3033Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(o00O00OO o00o00oo2) {
        super(0);
        this.f3033Oooo0o = o00o00oo2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f3033Oooo0o.onStop();
        return Unit.INSTANCE;
    }
}
