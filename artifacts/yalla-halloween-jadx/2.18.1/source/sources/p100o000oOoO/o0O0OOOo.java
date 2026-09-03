package p100o000oOoO;

import java.util.Objects;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p036OoooOOO.o0OO00O;
import p036OoooOOO.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0OOOo extends Lambda implements Function1<o00O0OO, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oo0OOoo f29560Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f29561Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f29562Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOOo(oo0OOoo oo0oooo, int i, o0Oo0oo o0oo0oo2) {
        super(1);
        this.f29560Oooo0o = oo0oooo;
        this.f29561Oooo0oO = i;
        this.f29562Oooo0oo = o0oo0oo2;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00O0OO o00o0oo2) {
        o0OO00O<o00OOO0<?>, Object> o0oo00o2;
        o00O0OO composition = o00o0oo2;
        Intrinsics.checkNotNullParameter(composition, "composition");
        oo0OOoo oo0oooo = this.f29560Oooo0o;
        if (oo0oooo.f29702OooO0o0 == this.f29561Oooo0oO && Intrinsics.areEqual(this.f29562Oooo0oo, oo0oooo.f29701OooO0o) && (composition instanceof o00O)) {
            o0Oo0oo o0oo0oo2 = this.f29562Oooo0oo;
            int i = this.f29561Oooo0oO;
            oo0OOoo scope = this.f29560Oooo0o;
            int i2 = o0oo0oo2.f3678OooO00o;
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                Object instance = o0oo0oo2.f3679OooO0O0[i3];
                Objects.requireNonNull(instance, "null cannot be cast to non-null type kotlin.Any");
                int i5 = o0oo0oo2.f3680OooO0OO[i3];
                boolean z = i5 != i;
                if (z) {
                    o00O o00o2 = (o00O) composition;
                    Objects.requireNonNull(o00o2);
                    Intrinsics.checkNotNullParameter(instance, "instance");
                    Intrinsics.checkNotNullParameter(scope, "scope");
                    o00o2.f29334OoooO0O.OooO0o0(instance, scope);
                    o00OOO0<?> key = instance instanceof o00OOO0 ? (o00OOO0) instance : null;
                    if (key != null) {
                        Intrinsics.checkNotNullParameter(key, "state");
                        if (!o00o2.f29334OoooO0O.OooO0OO(key)) {
                            o00o2.f29335OoooOO0.OooO0o(key);
                        }
                        o0OO00O<o00OOO0<?>, Object> o0oo00o3 = scope.f29703OooO0oO;
                        if (o0oo00o3 != null) {
                            Intrinsics.checkNotNullParameter(key, "key");
                            int iOooO00o = o0oo00o3.OooO00o(key);
                            if (iOooO00o >= 0) {
                                int i6 = o0oo00o3.f3677OooO0OO;
                                Object[] objArr = o0oo00o3.f3675OooO00o;
                                Object[] objArr2 = o0oo00o3.f3676OooO0O0;
                                int i7 = iOooO00o + 1;
                                ArraysKt.copyInto(objArr, objArr, iOooO00o, i7, i6);
                                ArraysKt.copyInto(objArr2, objArr2, iOooO00o, i7, i6);
                                int i8 = i6 - 1;
                                o0oo00o2 = null;
                                objArr[i8] = null;
                                objArr2[i8] = null;
                                o0oo00o3.f3677OooO0OO = i8;
                            } else {
                                o0oo00o2 = null;
                            }
                            if (o0oo00o3.f3677OooO0OO == 0) {
                                scope.f29703OooO0oO = o0oo00o2;
                            }
                        } else {
                            composition = composition;
                        }
                    } else {
                        composition = composition;
                    }
                } else {
                    composition = composition;
                }
                if (!z) {
                    if (i4 != i3) {
                        o0oo0oo2.f3679OooO0O0[i4] = instance;
                        o0oo0oo2.f3680OooO0OO[i4] = i5;
                    }
                    i4++;
                }
                i3++;
                composition = composition;
            }
            int i9 = o0oo0oo2.f3678OooO00o;
            for (int i10 = i4; i10 < i9; i10++) {
                o0oo0oo2.f3679OooO0O0[i10] = null;
            }
            o0oo0oo2.f3678OooO00o = i4;
            if (this.f29562Oooo0oo.f3678OooO00o == 0) {
                this.f29560Oooo0o.f29701OooO0o = null;
            }
        }
        return Unit.INSTANCE;
    }
}
