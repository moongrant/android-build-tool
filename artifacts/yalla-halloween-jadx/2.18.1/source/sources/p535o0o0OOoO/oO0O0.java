package p535o0o0OOoO;

import androidx.drawerlayout.widget.DrawerLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.oOO00O;
import p524o0o0O0oO.o0O0O0o0;

/* JADX INFO: loaded from: classes2.dex */
public final class oO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout f43644Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O0O0o0 f43645Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ int f43646Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0O0(DrawerLayout drawerLayout, o0O0O0o0 o0o0o0o0, int i) {
        super(2);
        this.f43644Oooo0o = drawerLayout;
        this.f43645Oooo0oO = o0o0o0o0;
        this.f43646Oooo0oo = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        num.intValue();
        oO0O0O00.OooO0O0(this.f43644Oooo0o, this.f43645Oooo0oO, ooo00o, this.f43646Oooo0oo | 1);
        return Unit.INSTANCE;
    }
}
