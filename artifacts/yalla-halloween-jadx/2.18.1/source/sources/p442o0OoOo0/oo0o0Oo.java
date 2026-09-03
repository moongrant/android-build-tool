package p442o0OoOo0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p145o00Oo0.o0000;
import p145o00Oo0.o000OOo0;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo extends Lambda implements Function1<o0000, Unit> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ long f40226Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ float f40227Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o000OOo0 f40228Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ boolean f40229Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ long f40230OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0o0Oo(float f, o000OOo0 o000ooo1, boolean z, long j, long j2) {
        super(1);
        this.f40227Oooo0o = f;
        this.f40228Oooo0oO = o000ooo1;
        this.f40229Oooo0oo = z;
        this.f40226Oooo = j;
        this.f40230OoooO00 = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o0000 o0000Var) {
        o0000 graphicsLayer = o0000Var;
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.OooOo00(graphicsLayer.OoooOoo(this.f40227Oooo0o));
        graphicsLayer.Oooo00o(this.f40228Oooo0oO);
        graphicsLayer.Oooooo0(this.f40229Oooo0oo);
        graphicsLayer.Ooooo00(this.f40226Oooo);
        graphicsLayer.ooOO(this.f40230OoooO00);
        return Unit.INSTANCE;
    }
}
