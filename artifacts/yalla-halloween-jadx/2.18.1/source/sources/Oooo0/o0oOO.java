package Oooo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class o0oOO extends Lambda implements Function1<o00000O0.o0OO00O, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o0oOOo f753Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f754Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f755Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f756Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f757OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oOO(boolean z, boolean z2, boolean z3, o0oOOo o0oooo2, CoroutineScope coroutineScope) {
        super(1);
        this.f754Oooo0o = z;
        this.f755Oooo0oO = z2;
        this.f756Oooo0oo = z3;
        this.f753Oooo = o0oooo2;
        this.f757OoooO00 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00000O0.o0OO00O o0oo00o2) {
        o00000O0.o0OO00O semantics = o0oo00o2;
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        o00000O0.OooOOO0 oooOOO0 = new o00000O0.OooOOO0(new o00OOOOo(this.f753Oooo), new o00Oo00(this.f753Oooo), this.f754Oooo0o);
        if (this.f755Oooo0oO) {
            o00000O0.o0ooOOo.OooOO0O(semantics, oooOOO0);
        } else {
            o00000O0.o0ooOOo.OooO0oo(semantics, oooOOO0);
        }
        if (this.f756Oooo0oo) {
            o00000O0.o0ooOOo.OooO0Oo(semantics, new o00OOOO0(this.f757OoooO00, this.f755Oooo0oO, this.f753Oooo));
        }
        return Unit.INSTANCE;
    }
}
