package androidx.compose.foundation;

import Oooo000.o00oO0o;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import p026Oooo0OO.o000;
import p026Oooo0OO.o0000O;
import p026Oooo0OO.o0000O0;
import p026Oooo0OO.o0000O0O;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00OO0OO;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class HoverableKt {

    public static final class OooO00o extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ o000 f5591Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f5592Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o000 o000Var, boolean z) {
            super(3);
            this.f5591Oooo0o = o000Var;
            this.f5592Oooo0oO = z;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Object OooO00o(o000 o000Var, o0O00OO o0o00oo2, Continuation continuation) {
            OooOOO0 oooOOO0;
            o0000O0 o0000o1;
            if (continuation instanceof OooOOO0) {
                oooOOO0 = (OooOOO0) continuation;
                int i = oooOOO0.f5654Oooo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    oooOOO0.f5654Oooo = i - Integer.MIN_VALUE;
                } else {
                    oooOOO0 = new OooOOO0(continuation);
                }
            } else {
                oooOOO0 = new OooOOO0(continuation);
            }
            Object obj = oooOOO0.f5657Oooo0oo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = oooOOO0.f5654Oooo;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (((o0000O0) o0o00oo2.getValue()) == null) {
                    o0000O0 o0000o2 = new o0000O0();
                    oooOOO0.f5655Oooo0o = o0o00oo2;
                    oooOOO0.f5656Oooo0oO = o0000o2;
                    oooOOO0.f5654Oooo = 1;
                    if (o000Var.OooO0OO(o0000o2, oooOOO0) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    o0000o1 = o0000o2;
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o0000o1 = oooOOO0.f5656Oooo0oO;
            o0o00oo2 = oooOOO0.f5655Oooo0o;
            ResultKt.throwOnFailure(obj);
            o0o00oo2.setValue(o0000o1);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Object OooO0O0(o0O00OO o0o00oo2, o000 o000Var, Continuation continuation) {
            OooOOO oooOOO;
            if (continuation instanceof OooOOO) {
                oooOOO = (OooOOO) continuation;
                int i = oooOOO.f5653Oooo0oo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    oooOOO.f5653Oooo0oo = i - Integer.MIN_VALUE;
                } else {
                    oooOOO = new OooOOO(continuation);
                }
            } else {
                oooOOO = new OooOOO(continuation);
            }
            Object obj = oooOOO.f5652Oooo0oO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = oooOOO.f5653Oooo0oo;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                o0000O0 o0000o1 = (o0000O0) o0o00oo2.getValue();
                if (o0000o1 != null) {
                    o0000O o0000o0o2 = new o0000O0O(o0000o1);
                    oooOOO.f5651Oooo0o = o0o00oo2;
                    oooOOO.f5653Oooo0oo = 1;
                    if (o000Var.OooO0OO(o0000o0o2, oooOOO) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o0o00oo2 = oooOOO.f5651Oooo0o;
            ResultKt.throwOnFailure(obj);
            o0o00oo2.setValue(null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
            o00OOOO0 o00oooo0OooO0O0;
            o00OOOO0 composed = o00oooo1;
            oOO00O ooo00o2 = ooo00o;
            num.intValue();
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            ooo00o2.OooO0o0(1294013553);
            ooo00o2.OooO0o0(773894976);
            ooo00o2.OooO0o0(-492369756);
            Object objOooO0o = ooo00o2.OooO0o();
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = o00oO0o.OooO0OO(o00Oo00.OooO0oo(EmptyCoroutineContext.INSTANCE, ooo00o2), ooo00o2);
            }
            ooo00o2.Oooo0o0();
            CoroutineScope coroutineScope = ((o00OO0OO) objOooO0o).f29498Oooo0o;
            ooo00o2.Oooo0o0();
            ooo00o2.OooO0o0(-492369756);
            Object objOooO0o2 = ooo00o2.OooO0o();
            if (objOooO0o2 == c0323OooO00o) {
                objOooO0o2 = o0OOO00.OooO0Oo(null);
                ooo00o2.Oooo00o(objOooO0o2);
            }
            ooo00o2.Oooo0o0();
            o0O00OO o0o00oo2 = (o0O00OO) objOooO0o2;
            o000 o000Var = this.f5591Oooo0o;
            o00Oo00.OooO0O0(o000Var, new OooO(o0o00oo2, o000Var), ooo00o2);
            o00Oo00.OooO0o0(Boolean.valueOf(this.f5592Oooo0oO), new OooOO0(this.f5592Oooo0oO, o0o00oo2, this.f5591Oooo0o, null), ooo00o2);
            if (this.f5592Oooo0oO) {
                o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
                o000 o000Var2 = this.f5591Oooo0o;
                o00oooo0OooO0O0 = SuspendingPointerInputFilterKt.OooO0O0(oooO00o, o000Var2, new OooOO0O(coroutineScope, o000Var2, o0o00oo2, null));
            } else {
                o00oooo0OooO0O0 = o00OOOO0.OooO00o.f4198Oooo0o;
            }
            ooo00o2.Oooo0o0();
            return o00oooo0OooO0O0;
        }
    }

    @NotNull
    public static final o00OOOO0 OooO00o(@NotNull o00OOOO0 o00oooo1, @NotNull o000 interactionSource, boolean z) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        return o00OOO0O.OooO00o(o00oooo1, o00oOoo.f6560OooO00o, new OooO00o(interactionSource, z));
    }
}
