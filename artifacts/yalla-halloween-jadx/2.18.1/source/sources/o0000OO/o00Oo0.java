package o0000OO;

import android.os.Handler;
import android.os.Looper;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p047Oooooo0.o00OOO0;
import p100o000oOoO.oo0oO0;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 implements o00O0O, oo0oO0 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public boolean f27406Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final ConstraintLayoutScope f27407Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public Handler f27408Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final o00OOO0 f27409Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final List<Oooo0> f27410OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final Function1<Unit, Unit> f27411OoooO00;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ List<o0O0O00.o0O0O00> f27412Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o00000 f27413Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o00Oo0 f27414Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(List<? extends o0O0O00.o0O0O00> list, o00000 o00000Var, o00Oo0 o00oo1) {
            super(0);
            this.f27412Oooo0o = list;
            this.f27413Oooo0oO = o00000Var;
            this.f27414Oooo0oo = o00oo1;
        }

        /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList, java.util.List<o0000OO.Oooo0>] */
        /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList, java.util.List<kotlin.jvm.functions.Function1<o0000OO.o00000, kotlin.Unit>>] */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            List<o0O0O00.o0O0O00> list = this.f27412Oooo0o;
            o00000 state = this.f27413Oooo0oO;
            o00Oo0 o00oo1 = this.f27414Oooo0oo;
            int size = list.size() - 1;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    Object objOooo0o = list.get(i).Oooo0o();
                    Oooo0 oooo0 = objOooo0o instanceof Oooo0 ? (Oooo0) objOooo0o : null;
                    if (oooo0 != null) {
                        OooOO0 oooOO1 = new OooOO0(oooo0.f27383Oooo0o.f27364OooO00o);
                        oooo0.f27384Oooo0oO.invoke(oooOO1);
                        Intrinsics.checkNotNullParameter(state, "state");
                        Iterator it = oooOO1.f27358OooO0O0.iterator();
                        while (it.hasNext()) {
                            ((Function1) it.next()).invoke(state);
                        }
                    }
                    o00oo1.f27410OoooO0.add(oooo0);
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Function0<? extends Unit>, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Function0<? extends Unit> function0) {
            final Function0<? extends Unit> it = function0;
            Intrinsics.checkNotNullParameter(it, "it");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                it.invoke();
            } else {
                Handler handler = o00Oo0.this.f27408Oooo0oO;
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                    o00Oo0.this.f27408Oooo0oO = handler;
                }
                handler.post(new Runnable() { // from class: o0000OO.o00Ooo
                    @Override // java.lang.Runnable
                    public final void run() {
                        Function0 tmp0 = it;
                        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                        tmp0.invoke();
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Unit, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Unit unit) {
            Unit noName_0 = unit;
            Intrinsics.checkNotNullParameter(noName_0, "$noName_0");
            o00Oo0.this.f27406Oooo = true;
            return Unit.INSTANCE;
        }
    }

    public o00Oo0(@NotNull ConstraintLayoutScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f27407Oooo0o = scope;
        this.f27409Oooo0oo = new o00OOO0(new OooO0O0());
        this.f27406Oooo = true;
        this.f27411OoooO00 = new OooO0OO();
        this.f27410OoooO0 = new ArrayList();
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO00o() {
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO0O0() {
        this.f27409Oooo0oo.OooO0Oo();
        this.f27409Oooo0oo.OooO00o();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<kotlin.jvm.functions.Function1<o0000OO.o00000, kotlin.Unit>>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<o0000OO.Oooo0>] */
    public final void OooO0OO(@NotNull o00000 state, @NotNull List<? extends o0O0O00.o0O0O00> measurables) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ConstraintLayoutScope constraintLayoutScope = this.f27407Oooo0o;
        Objects.requireNonNull(constraintLayoutScope);
        Intrinsics.checkNotNullParameter(state, "state");
        Iterator it = constraintLayoutScope.f27369OooO00o.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(state);
        }
        this.f27410OoooO0.clear();
        this.f27409Oooo0oo.OooO0O0(Unit.INSTANCE, this.f27411OoooO00, new OooO00o(measurables, state, this));
        this.f27406Oooo = false;
    }

    @Override // p100o000oOoO.oo0oO0
    public final void OooO0Oo() {
        this.f27409Oooo0oo.OooO0OO();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList, java.util.List<o0000OO.Oooo0>] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.ArrayList, java.util.List<o0000OO.Oooo0>] */
    public final boolean OooO0o0(@NotNull List<? extends o0O0O00.o0O0O00> measurables) {
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        if (this.f27406Oooo || measurables.size() != this.f27410OoooO0.size()) {
            return true;
        }
        int size = measurables.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Object objOooo0o = measurables.get(i).Oooo0o();
                if (!Intrinsics.areEqual(objOooo0o instanceof Oooo0 ? (Oooo0) objOooo0o : null, this.f27410OoooO0.get(i))) {
                    return true;
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return false;
    }
}
