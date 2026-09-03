package p089o000o000;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final class o00O00OO extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o00O00<Object> f28938Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000O<Object> f28939Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Ref.BooleanRef f28940Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00OO(o00O00<Object> o00o01, o000O<Object> o000o, Ref.BooleanRef booleanRef) {
        super(0);
        this.f28938Oooo0o = o00o01;
        this.f28939Oooo0oO = o000o;
        this.f28940Oooo0oo = booleanRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.f28938Oooo0o.f28908OooO0OO = this.f28939Oooo0oO;
        this.f28940Oooo0oo.element = true;
        return Unit.INSTANCE;
    }
}
