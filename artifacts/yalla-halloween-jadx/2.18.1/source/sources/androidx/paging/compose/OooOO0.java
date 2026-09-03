package androidx.paging.compose;

import androidx.compose.runtime.Composable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p027Oooo0o.o000;
import p027Oooo0o.o000oOoO;
import p043OooooO0.o00O0000;
import p089o000o000.o000000;
import p089o000o000.o000000O;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000000O f8804OooO00o;

    public static final class OooO00o extends Lambda implements Function1<Integer, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0OO<T> f8805Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<T, Object> f8806Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(OooO0OO<T> oooO0OO, Function1<? super T, ? extends Object> function1) {
            super(1);
            this.f8805Oooo0o = oooO0OO;
            this.f8806Oooo0oO = function1;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Integer num) {
            int iIntValue = num.intValue();
            Object obj = this.f8805Oooo0o.OooO0Oo().get(iIntValue);
            return obj == null ? new PagingPlaceholderKey(iIntValue) : this.f8806Oooo0oO.invoke((T) obj);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function4<o000oOoO, Integer, oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function4<o000oOoO, T, oOO00O, Integer, Unit> f8807Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ OooO0OO<T> f8808Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Function4<? super o000oOoO, ? super T, ? super oOO00O, ? super Integer, Unit> function4, OooO0OO<T> oooO0OO) {
            super(4);
            this.f8807Oooo0o = function4;
            this.f8808Oooo0oO = oooO0OO;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r4v4 boolean
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
            */
        @Override // kotlin.jvm.functions.Function4
        public final kotlin.Unit invoke(p027Oooo0o.o000oOoO r3, java.lang.Integer r4, p100o000oOoO.oOO00O r5, java.lang.Integer r6) {
            /*
                r2 = this;
                Oooo0o.o000oOoO r3 = (p027Oooo0o.o000oOoO) r3
                java.lang.Number r4 = (java.lang.Number) r4
                int r4 = r4.intValue()
                o000oOoO.oOO00O r5 = (p100o000oOoO.oOO00O) r5
                java.lang.Number r6 = (java.lang.Number) r6
                int r6 = r6.intValue()
                java.lang.String r0 = "$this$items"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r0 = r6 & 14
                if (r0 != 0) goto L24
                boolean r0 = r5.Oooo0oo(r3)
                if (r0 == 0) goto L21
                r0 = 4
                goto L22
            L21:
                r0 = 2
            L22:
                r0 = r0 | r6
                goto L25
            L24:
                r0 = r6
            L25:
                r6 = r6 & 112(0x70, float:1.57E-43)
                if (r6 != 0) goto L35
                boolean r6 = r5.OooO(r4)
                if (r6 == 0) goto L32
                r6 = 32
                goto L34
            L32:
                r6 = 16
            L34:
                r0 = r0 | r6
            L35:
                r6 = r0 & 731(0x2db, float:1.024E-42)
                r1 = 146(0x92, float:2.05E-43)
                if (r6 != r1) goto L46
                boolean r6 = r5.OooOo0()
                if (r6 != 0) goto L42
                goto L46
            L42:
                r5.OooOoo0()
                goto L57
            L46:
                kotlin.jvm.functions.Function4<Oooo0o.o000oOoO, T, o000oOoO.oOO00O, java.lang.Integer, kotlin.Unit> r6 = r2.f8807Oooo0o
                androidx.paging.compose.OooO0OO<T> r1 = r2.f8808Oooo0oO
                java.lang.Object r4 = r1.OooO0O0(r4)
                r0 = r0 & 14
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r6.invoke(r3, r4, r5, r0)
            L57:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.compose.OooOO0.OooO0O0.invoke(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    static {
        o000000.OooO0OO oooO0OO = new o000000.OooO0OO(false);
        f8804OooO00o = new o000000O(o000000.OooO0O0.f28697OooO0O0, oooO0OO, oooO0OO);
    }

    @Composable
    @NotNull
    public static final OooO0OO OooO00o(@NotNull Flow flow, @Nullable oOO00O ooo00o) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        ooo00o.OooO0o0(1082059943);
        ooo00o.OooO0o0(-3686930);
        boolean zOooo0oo = ooo00o.Oooo0oo(flow);
        Object objOooO0o = ooo00o.OooO0o();
        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            objOooO0o = new OooO0OO(flow);
            ooo00o.Oooo00o(objOooO0o);
        }
        ooo00o.Oooo0o0();
        OooO0OO oooO0OO = (OooO0OO) objOooO0o;
        o00Oo00.OooO0o0(oooO0OO, new OooO0o(oooO0OO, null), ooo00o);
        o00Oo00.OooO0o0(oooO0OO, new OooO(oooO0OO, null), ooo00o);
        ooo00o.Oooo0o0();
        return oooO0OO;
    }

    public static final <T> void OooO0O0(@NotNull o000 o000Var, @NotNull OooO0OO<T> items, @Nullable Function1<? super T, ? extends Object> function1, @NotNull Function4<? super o000oOoO, ? super T, ? super oOO00O, ? super Integer, Unit> itemContent) {
        Intrinsics.checkNotNullParameter(o000Var, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        o000Var.OooO00o(items.OooO0OO(), function1 == null ? null : new OooO00o(items, function1), o00O0000.OooO0O0(-830876825, true, new OooO0O0(itemContent, items)));
    }

    public static void OooO0OO(o000 o000Var, OooO0OO items, Function5 itemContent) {
        Intrinsics.checkNotNullParameter(o000Var, "<this>");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(itemContent, "itemContent");
        o000Var.OooO00o(items.OooO0OO(), null, o00O0000.OooO0O0(715053046, true, new OooOO0O(itemContent, items)));
    }
}
