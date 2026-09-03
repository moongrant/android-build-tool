package p254o00ooO0O;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Ref.LongRef f34262Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f34263Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ long f34264Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f34265Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O(boolean z, long j, Function0<Unit> function0, Ref.LongRef longRef) {
        super(0);
        this.f34263Oooo0o = z;
        this.f34264Oooo0oO = j;
        this.f34265Oooo0oo = function0;
        this.f34262Oooo = longRef;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f34263Oooo0o) {
            if (Math.abs(jCurrentTimeMillis - o00O00.f34345OooO00o) >= this.f34264Oooo0oO) {
                o00O00.f34345OooO00o = jCurrentTimeMillis;
                this.f34265Oooo0oo.invoke();
            }
        } else if (Math.abs(jCurrentTimeMillis - this.f34262Oooo.element) >= this.f34264Oooo0oO) {
            this.f34262Oooo.element = jCurrentTimeMillis;
            this.f34265Oooo0oo.invoke();
        }
        return Unit.INSTANCE;
    }
}
