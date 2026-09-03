package androidx.compose.ui.input.pointer;

import Oooo000.o0000O00;
import androidx.compose.ui.platform.o000;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00OOOOo;
import androidx.compose.ui.platform.o00oOoo;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0000O0O.OooO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.oOO00O;
import p418o0Oo0oo.o00000;
import p418o0Oo0oo.o0000OO0;
import p418o0Oo0oo.o000OO;
import p418o0Oo0oo.o00Oo0;

/* JADX INFO: loaded from: classes.dex */
public final class SuspendingPointerInputFilterKt {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00Oo0 f6100OooO00o;

    public static final class OooO00o extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Object f6101Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function2<o00000, Continuation<? super Unit>, Object> f6102Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Object obj, Function2<? super o00000, ? super Continuation<? super Unit>, ? extends Object> function2) {
            super(3);
            this.f6101Oooo0o = obj;
            this.f6102Oooo0oO = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            o0000O00.OooO00o(num, o00oooo1, "$this$composed", ooo00o2, -906157935);
            OooO oooO = (OooO) ooo00o2.OooOO0o(o000.f6356OooO0o0);
            o00OOOOo o00ooooo2 = (o00OOOOo) ooo00o2.OooOO0o(o000.f6364OooOOOO);
            ooo00o2.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00o2.Oooo0oo(oooO);
            Object objOooO0o = ooo00o2.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = new o000OO(o00ooooo2, oooO);
                ooo00o2.Oooo00o(objOooO0o);
            }
            ooo00o2.Oooo0o0();
            o000OO o000oo2 = (o000OO) objOooO0o;
            o00Oo00.OooO0Oo(o000oo2, this.f6101Oooo0o, new androidx.compose.ui.input.pointer.OooO00o(o000oo2, this.f6102Oooo0oO, null), ooo00o2);
            ooo00o2.Oooo0o0();
            return o000oo2;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Object f6103Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Object f6104Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function2<o00000, Continuation<? super Unit>, Object> f6105Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Object obj, Object obj2, Function2<? super o00000, ? super Continuation<? super Unit>, ? extends Object> function2) {
            super(3);
            this.f6103Oooo0o = obj;
            this.f6104Oooo0oO = obj2;
            this.f6105Oooo0oo = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            o0000O00.OooO00o(num, o00oooo1, "$this$composed", ooo00o2, 1175567217);
            OooO oooO = (OooO) ooo00o2.OooOO0o(o000.f6356OooO0o0);
            o00OOOOo o00ooooo2 = (o00OOOOo) ooo00o2.OooOO0o(o000.f6364OooOOOO);
            ooo00o2.OooO0o0(1157296644);
            boolean zOooo0oo = ooo00o2.Oooo0oo(oooO);
            Object objOooO0o = ooo00o2.OooO0o();
            if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = new o000OO(o00ooooo2, oooO);
                ooo00o2.Oooo00o(objOooO0o);
            }
            ooo00o2.Oooo0o0();
            o000OO o000oo2 = (o000OO) objOooO0o;
            o00Oo00.OooO0OO(o000oo2, this.f6103Oooo0o, this.f6104Oooo0oO, new androidx.compose.ui.input.pointer.OooO0O0(o000oo2, this.f6105Oooo0oo, null), ooo00o2);
            ooo00o2.Oooo0o0();
            return o000oo2;
        }
    }

    static {
        List changes = CollectionsKt.emptyList();
        Intrinsics.checkNotNullParameter(changes, "changes");
        f6100OooO00o = new o00Oo0(changes, null);
    }

    @NotNull
    public static final o00OOOO0 OooO00o(@NotNull o00OOOO0 o00oooo1, @Nullable Object obj, @Nullable Object obj2, @NotNull Function2<? super o00000, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        return o00OOO0O.OooO00o(o00oooo1, o00oOoo.f6560OooO00o, new OooO0O0(obj, obj2, block));
    }

    @NotNull
    public static final o00OOOO0 OooO0O0(@NotNull o00OOOO0 o00oooo1, @Nullable Object obj, @NotNull Function2<? super o00000, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        return o00OOO0O.OooO00o(o00oooo1, o00oOoo.f6560OooO00o, new OooO00o(obj, block));
    }

    @NotNull
    public static final o00OOOO0 OooO0OO(@NotNull Object[] keys, @NotNull Function2 block) {
        o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
        Intrinsics.checkNotNullParameter(oooO00o, "<this>");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(block, "block");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        return o00OOO0O.OooO00o(oooO00o, o00oOoo.f6560OooO00o, new o0000OO0(keys, block));
    }
}
