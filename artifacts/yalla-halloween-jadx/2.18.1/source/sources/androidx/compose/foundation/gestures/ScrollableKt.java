package androidx.compose.foundation.gestures;

import Oooo0.o0000;
import Oooo0.oo0oOO0;
import Oooo000.o00oO0o;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.ui.focus.FocusPropertiesKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import androidx.compose.ui.platform.o0O0ooO;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o00000OO;
import p025Oooo0O0.OooO;
import p025Oooo0O0.OooOO0;
import p025Oooo0O0.OooOOO;
import p025Oooo0O0.o000000O;
import p025Oooo0O0.o0000O;
import p025Oooo0O0.o0000O0O;
import p025Oooo0O0.o000O0;
import p025Oooo0O0.o000O00;
import p025Oooo0O0.o000O000;
import p025Oooo0O0.o000O00O;
import p025Oooo0O0.o000O0o;
import p025Oooo0O0.o000OO00;
import p025Oooo0O0.o000OO0O;
import p025Oooo0O0.o000Oo0;
import p026Oooo0OO.o000;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p076o000OOo.OooOOO0;
import p076o000OOo.OooOo00;
import p100o000oOoO.o00OO0OO;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p346o0OOO0o.OooOOOO;
import p710ooOO.o000OOo;
import p710ooOO.o0OO00O;
import p710ooOO.oo0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollableKt {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f5724OooO00o = new OooO0O0();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooOo00<Boolean> f5725OooO0O0 = OooOOO0.OooO00o(OooO00o.f5726Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f5726Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class OooO0O0 implements o0000O {
        @Override // p025Oooo0O0.o0000O
        public final float OooO00o(float f) {
            return f;
        }
    }

    public static final class OooO0OO extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o000 f5727Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Orientation f5728Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000OO0O f5729Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f5730Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ oo0oOO0 f5731OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o000000O f5732OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ boolean f5733OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Orientation orientation, o000OO0O o000oo0o2, boolean z, o000 o000Var, o000000O o000000o2, oo0oOO0 oo0ooo0, boolean z2) {
            super(3);
            this.f5728Oooo0o = orientation;
            this.f5729Oooo0oO = o000oo0o2;
            this.f5730Oooo0oo = z;
            this.f5727Oooo = o000Var;
            this.f5732OoooO00 = o000000o2;
            this.f5731OoooO0 = oo0ooo0;
            this.f5733OoooO0O = z2;
        }

        @Override // kotlin.jvm.functions.Function3
        public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
            o000000O o000000o2;
            o00OOOO0 composed = o00oooo1;
            oOO00O ooo00o2 = ooo00o;
            num.intValue();
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            ooo00o2.OooO0o0(-629830927);
            ooo00o2.OooO0o0(773894976);
            ooo00o2.OooO0o0(-492369756);
            Object objOooO0o = ooo00o2.OooO0o();
            if (objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o = o00oO0o.OooO0OO(o00Oo00.OooO0oo(EmptyCoroutineContext.INSTANCE, ooo00o2), ooo00o2);
            }
            ooo00o2.Oooo0o0();
            CoroutineScope coroutineScope = ((o00OO0OO) objOooO0o).f29498Oooo0o;
            ooo00o2.Oooo0o0();
            Object[] objArr = {coroutineScope, this.f5728Oooo0o, this.f5729Oooo0oO, Boolean.valueOf(this.f5730Oooo0oo)};
            Orientation orientation = this.f5728Oooo0o;
            o000OO0O o000oo0o2 = this.f5729Oooo0oO;
            boolean z = this.f5730Oooo0oo;
            ooo00o2.OooO0o0(-568225417);
            boolean zOooo0oo = false;
            for (int i = 0; i < 4; i++) {
                zOooo0oo |= ooo00o2.Oooo0oo(objArr[i]);
            }
            Object objOooO0o2 = ooo00o2.OooO0o();
            if (zOooo0oo || objOooO0o2 == oOO00O.OooO00o.f29689OooO0O0) {
                objOooO0o2 = new OooOO0(coroutineScope, orientation, o000oo0o2, z);
                ooo00o2.Oooo00o(objOooO0o2);
            }
            ooo00o2.Oooo0o0();
            o00OOOO0.OooO00o oooO00o = o00OOOO0.OooO00o.f4198Oooo0o;
            o0O0ooO o0o0ooo = FocusableKt.f5584OooO00o;
            Intrinsics.checkNotNullParameter(oooO00o, "<this>");
            o0O0ooO o0o0ooo2 = FocusableKt.f5584OooO00o;
            oooO00o.OooOOoo(o0o0ooo2);
            o00OOOO0 o00oooo0OooO00o = FocusPropertiesKt.OooO00o(o0o0ooo2, o0000.f537Oooo0o);
            OooOo00<o0OO00O> oooOo00 = oo0o0Oo.f53497OooO00o;
            Intrinsics.checkNotNullParameter(o00oooo0OooO00o, "<this>");
            Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
            o00OOOO0 o00oooo0OooOOoo = o00OOO0O.OooO00o(o00oooo0OooO00o, o00oOoo.f6560OooO00o, o000OOo.f53464Oooo0o).OooOOoo(((OooOO0) objOooO0o2).f1358OoooO);
            o000 o000Var = this.f5727Oooo;
            Orientation orientation2 = this.f5728Oooo0o;
            boolean z2 = this.f5730Oooo0oo;
            o000OO0O o000oo0o3 = this.f5729Oooo0oO;
            o000000O o000000o3 = this.f5732OoooO00;
            oo0oOO0 oo0ooo0 = this.f5731OoooO0;
            boolean z3 = this.f5733OoooO0O;
            ooo00o2.OooO0o0(-2012025036);
            ooo00o2.OooO0o0(-1730187034);
            if (o000000o3 == null) {
                ooo00o2.OooO0o0(1107739818);
                o00000OO o00000ooOooO00o = Oooo000.oOO00O.OooO00o(ooo00o2);
                ooo00o2.OooO0o0(1157296644);
                boolean zOooo0oo2 = ooo00o2.Oooo0oo(o00000ooOooO00o);
                Object objOooO0o3 = ooo00o2.OooO0o();
                if (zOooo0oo2 || objOooO0o3 == oOO00O.OooO00o.f29689OooO0O0) {
                    objOooO0o3 = new OooOOO(o00000ooOooO00o);
                    ooo00o2.Oooo00o(objOooO0o3);
                }
                ooo00o2.Oooo0o0();
                ooo00o2.Oooo0o0();
                o000000o2 = (OooOOO) objOooO0o3;
            } else {
                o000000o2 = o000000o3;
            }
            ooo00o2.Oooo0o0();
            ooo00o2.OooO0o0(-492369756);
            Object objOooO0o4 = ooo00o2.OooO0o();
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o4 == c0323OooO00o) {
                objOooO0o4 = o0OOO00.OooO0Oo(new OooOOOO());
                ooo00o2.Oooo00o(objOooO0o4);
            }
            ooo00o2.Oooo0o0();
            o0O00OO o0o00oo2 = (o0O00OO) objOooO0o4;
            oO0Oo oo0ooOooO0o = o0OOO00.OooO0o(new o000OO00(orientation2, z2, o0o00oo2, o000oo0o3, o000000o2, oo0ooo0), ooo00o2);
            Boolean boolValueOf = Boolean.valueOf(z3);
            ooo00o2.OooO0o0(1157296644);
            boolean zOooo0oo3 = ooo00o2.Oooo0oo(boolValueOf);
            Object objOooO0o5 = ooo00o2.OooO0o();
            if (zOooo0oo3 || objOooO0o5 == c0323OooO00o) {
                objOooO0o5 = new o000O0(z3, oo0ooOooO0o);
                ooo00o2.Oooo00o(objOooO0o5);
            }
            ooo00o2.Oooo0o0();
            p346o0OOO0o.OooOOO oooOOO = (p346o0OOO0o.OooOOO) objOooO0o5;
            ooo00o2.OooO0o0(-492369756);
            Object objOooO0o6 = ooo00o2.OooO0o();
            if (objOooO0o6 == c0323OooO00o) {
                objOooO0o6 = new o0000O0O(oo0ooOooO0o);
                ooo00o2.Oooo00o(objOooO0o6);
            }
            ooo00o2.Oooo0o0();
            ooo00o2.OooO0o0(-1485272842);
            OooO oooO = OooO.f1353OooO00o;
            ooo00o2.Oooo0o0();
            o00OOOO0 o00oooo0OooO00o2 = NestedScrollModifierKt.OooO00o(SuspendingPointerInputFilterKt.OooO00o(DraggableKt.OooO0OO(o00oooo0OooOOoo, new o000O0o((o0000O0O) objOooO0o6), o000Oo0.f1651Oooo0o, orientation2, z3, o000Var, new o000O00(oo0ooOooO0o), new p025Oooo0O0.oo0o0Oo(null), new o000O00O(o0o00oo2, oo0ooOooO0o, null), false), oo0ooOooO0o, oooO, new o000O000(oooO, oo0ooOooO0o, null)), oooOOO, (OooOOOO) o0o00oo2.getValue());
            ooo00o2.Oooo0o0();
            o00OOOO0 o00oooo0OooOOoo2 = o00oooo0OooO00o2.OooOOoo(this.f5733OoooO0O ? p025Oooo0O0.o00000OO.f1499Oooo0o : oooO00o);
            ooo00o2.Oooo0o0();
            return o00oooo0OooOOoo2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:18:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object OooO00o(p418o0Oo0oo.OooOOO r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof p025Oooo0O0.o000
            if (r0 == 0) goto L13
            r0 = r6
            Oooo0O0.o000 r0 = (p025Oooo0O0.o000) r0
            int r1 = r0.f1482Oooo0oo
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1482Oooo0oo = r1
            goto L18
        L13:
            Oooo0O0.o000 r0 = new Oooo0O0.o000
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1481Oooo0oO
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f1482Oooo0oo
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            o0Oo0oo.OooOOO r5 = r0.f1480Oooo0o
            kotlin.ResultKt.throwOnFailure(r6)
            goto L42
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            kotlin.ResultKt.throwOnFailure(r6)
        L36:
            r0.f1480Oooo0o = r5
            r0.f1482Oooo0oo = r3
            r6 = 0
            java.lang.Object r6 = o00OO0O0.o0OOO0o.OooO00o(r5, r6, r0, r3, r6)
            if (r6 != r1) goto L42
            goto L4f
        L42:
            o0Oo0oo.o00Oo0 r6 = (p418o0Oo0oo.o00Oo0) r6
            int r2 = r6.f39726OooO0Oo
            r4 = 6
            if (r2 != r4) goto L4b
            r2 = 1
            goto L4c
        L4b:
            r2 = 0
        L4c:
            if (r2 == 0) goto L36
            r1 = r6
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.OooO00o(o0Oo0oo.OooOOO, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final o00OOOO0 OooO0O0(@NotNull o00OOOO0 o00oooo1, @NotNull o000OO0O state, @NotNull Orientation orientation, @Nullable oo0oOO0 oo0ooo0, boolean z, boolean z2, @Nullable o000000O o000000o2, @Nullable o000 o000Var) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        return o00OOO0O.OooO00o(o00oooo1, o00oOoo.f6560OooO00o, new OooO0OO(orientation, state, z2, o000Var, o000000o2, oo0ooo0, z));
    }
}
