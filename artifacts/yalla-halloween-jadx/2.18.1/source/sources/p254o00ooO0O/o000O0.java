package p254o00ooO0O;

import Oooo000.o0000O00;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooOOO0;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p145o00Oo0.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0 extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ float f34290Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f34291Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ float f34292Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ float f34293Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ boolean f34294OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ boolean f34295OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ float f34296OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final /* synthetic */ boolean f34297OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ long f34298OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final /* synthetic */ long f34299o000oOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0(boolean z, float f, float f2, float f3, float f4, boolean z2, boolean z3, boolean z4, long j, long j2) {
        super(3);
        this.f34291Oooo0o = z;
        this.f34292Oooo0oO = f;
        this.f34293Oooo0oo = f2;
        this.f34290Oooo = f3;
        this.f34296OoooO00 = f4;
        this.f34295OoooO0 = z2;
        this.f34297OoooO0O = z3;
        this.f34294OoooO = z4;
        this.f34298OoooOO0 = j;
        this.f34299o000oOoO = j2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
        o00OOOO0 o00oooo2 = o00oooo1;
        oOO00O ooo00o2 = ooo00o;
        o0000O00.OooO00o(num, o00oooo2, "$this$composed", ooo00o2, 709648673);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        boolean z = ooo00o2.OooOO0o(o000.f6360OooOO0O) == LayoutDirection.Rtl;
        Object[] objArr = {Boolean.valueOf(this.f34291Oooo0o), new OooOOO0(this.f34292Oooo0oO), new OooOOO0(this.f34293Oooo0oo), new OooOOO0(this.f34290Oooo), new OooOOO0(this.f34296OoooO00), Boolean.valueOf(this.f34295OoooO0), Boolean.valueOf(z), Boolean.valueOf(this.f34297OoooO0O), Boolean.valueOf(this.f34294OoooO), new o00000O0(this.f34298OoooOO0), new o00000O0(this.f34299o000oOoO)};
        boolean z2 = this.f34291Oooo0o;
        float f = this.f34292Oooo0oO;
        float f2 = this.f34293Oooo0oo;
        float f3 = this.f34290Oooo;
        float f4 = this.f34296OoooO00;
        boolean z3 = this.f34295OoooO0;
        boolean z4 = this.f34297OoooO0O;
        boolean z5 = this.f34294OoooO;
        long j = this.f34298OoooOO0;
        long j2 = this.f34299o000oOoO;
        ooo00o2.OooO0o0(-568225417);
        boolean zOooo0oo = false;
        int i = 0;
        for (int i2 = 11; i < i2; i2 = 11) {
            zOooo0oo |= ooo00o2.Oooo0oo(objArr[i]);
            i++;
        }
        Object objOooO0o = ooo00o2.OooO0o();
        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = new o000O00O(z2, f, f2, f3, f4, z3, z, z4, z5, j, j2);
            ooo00o2.Oooo00o(objOooO0o);
        }
        ooo00o2.Oooo0o0();
        o00OOOO0 o00oooo0OooO0OO = DrawModifierKt.OooO0OO(o00oooo2, (Function1) objOooO0o);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function4 = oo0o0O0.f29705OooO00o;
        ooo00o2.Oooo0o0();
        return o00oooo0OooO0OO;
    }
}
