package p034OoooO0O;

import androidx.compose.foundation.text.Handle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.Objects;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScopeKt;
import o00000O.o0OO00O;
import o00O0O.OooO;
import o00O0O.OooOO0;
import o00O0O.OooOO0O;
import o0O0O00.Oooo0;
import o0O0O00.Oooo000;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p032OoooO0.o000O0Oo;
import p032OoooO0.o00O00OO;
import p032OoooO0.o0O0000O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0ooO;
import p418o0Oo0oo.o00000;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O0 {

    @DebugMetadata(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1", f = "TextFieldSelectionManager.kt", i = {}, l = {818}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<o00000, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f3490Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f3491Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00O00OO f3492Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00O00OO o00o00oo2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f3492Oooo0oo = o00o00oo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f3492Oooo0oo, continuation);
            oooO00o.f3491Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00000 o00000Var, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o00000Var, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f3490Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00000 o00000Var = (o00000) this.f3491Oooo0oO;
                o00O00OO o00o00oo2 = this.f3492Oooo0oo;
                this.f3490Oooo0o = 1;
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new o000O0Oo(o00000Var, o00o00oo2, null), this);
                if (objCoroutineScope != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCoroutineScope = Unit.INSTANCE;
                }
                if (objCoroutineScope == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<oOO00O, Integer, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f3493Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f3494Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ ResolvedTextDirection f3495Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0000oo f3496Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z, ResolvedTextDirection resolvedTextDirection, o0000oo o0000ooVar, int i) {
            super(2);
            this.f3494Oooo0o = z;
            this.f3495Oooo0oO = resolvedTextDirection;
            this.f3496Oooo0oo = o0000ooVar;
            this.f3493Oooo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(oOO00O ooo00o, Integer num) {
            num.intValue();
            o0000O0.OooO00o(this.f3494Oooo0o, this.f3495Oooo0oO, this.f3496Oooo0oo, ooo00o, this.f3493Oooo | 1);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class OooO0OO {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            iArr[Handle.Cursor.ordinal()] = 1;
            iArr[Handle.SelectionStart.ordinal()] = 2;
            iArr[Handle.SelectionEnd.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(boolean z, @NotNull ResolvedTextDirection direction, @NotNull o0000oo manager, @Nullable oOO00O ooo00o, int i) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(manager, "manager");
        oOO00O ooo00oOooOOo = ooo00o.OooOOo(-1344558920);
        Boolean boolValueOf = Boolean.valueOf(z);
        ooo00oOooOOo.OooO0o0(511388516);
        boolean zOooo0oo = ooo00oOooOOo.Oooo0oo(boolValueOf) | ooo00oOooOOo.Oooo0oo(manager);
        Object objOooO0o = ooo00oOooOOo.OooO0o();
        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            Objects.requireNonNull(manager);
            objOooO0o = new o0000O00(manager, z);
            ooo00oOooOOo.Oooo00o(objOooO0o);
        }
        ooo00oOooOOo.Oooo0o0();
        o00O00OO o00o00oo2 = (o00O00OO) objOooO0o;
        long jOooOO0 = manager.OooOO0(z);
        boolean zOooO0oo = o0OO00O.OooO0oo(manager.OooOO0O().f27237OooO0O0);
        o00OOOO0 o00oooo0OooO0O0 = SuspendingPointerInputFilterKt.OooO0O0(o00OOOO0.OooO00o.f4198Oooo0o, o00o00oo2, new OooO00o(o00o00oo2, null));
        int i2 = i << 3;
        OooOo00.OooO0OO(jOooOO0, z, direction, zOooO0oo, o00oooo0OooO0O0, null, ooo00oOooOOo, 196608 | (i2 & 112) | (i2 & 896));
        oo0ooO oo0oooOooOo = ooo00oOooOOo.OooOo();
        if (oo0oooOooOo == null) {
            return;
        }
        oo0oooOooOo.OooO00o(new OooO0O0(z, direction, manager, i));
    }

    public static final boolean OooO0O0(@NotNull o0000oo o0000ooVar, boolean z) {
        Oooo000 oooo000;
        Intrinsics.checkNotNullParameter(o0000ooVar, "<this>");
        o0O0000O o0o0000o2 = o0000ooVar.f3509OooO0Oo;
        if (o0o0000o2 == null || (oooo000 = o0o0000o2.f3323OooO0o) == null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(oooo000, "<this>");
        OooOO0O oooOO0OOooO0OO = Oooo0.OooO0OO(oooo000);
        long jOooo00O = oooo000.Oooo00O(OooOO0.OooO00o(oooOO0OOooO0OO.f30404OooO00o, oooOO0OOooO0OO.f30405OooO0O0));
        long jOooo00O2 = oooo000.Oooo00O(OooOO0.OooO00o(oooOO0OOooO0OO.f30406OooO0OO, oooOO0OOooO0OO.f30407OooO0Oo));
        float fOooO0OO = OooO.OooO0OO(jOooo00O);
        float fOooO0Oo = OooO.OooO0Oo(jOooo00O);
        float fOooO0OO2 = OooO.OooO0OO(jOooo00O2);
        float fOooO0Oo2 = OooO.OooO0Oo(jOooo00O2);
        OooOO0O containsInclusive = new OooOO0O(fOooO0OO, fOooO0Oo, fOooO0OO2, fOooO0Oo2);
        long jOooOO0 = o0000ooVar.OooOO0(z);
        Intrinsics.checkNotNullParameter(containsInclusive, "$this$containsInclusive");
        float fOooO0OO3 = OooO.OooO0OO(jOooOO0);
        if (!(fOooO0OO <= fOooO0OO3 && fOooO0OO3 <= fOooO0OO2)) {
            return false;
        }
        float fOooO0Oo3 = OooO.OooO0Oo(jOooOO0);
        return (fOooO0Oo > fOooO0Oo3 ? 1 : (fOooO0Oo == fOooO0Oo3 ? 0 : -1)) <= 0 && (fOooO0Oo3 > fOooO0Oo2 ? 1 : (fOooO0Oo3 == fOooO0Oo2 ? 0 : -1)) <= 0;
    }
}
