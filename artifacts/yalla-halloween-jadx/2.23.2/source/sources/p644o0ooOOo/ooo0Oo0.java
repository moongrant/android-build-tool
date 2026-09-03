package p644o0ooOOo;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.OooOO0;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.layout.Measurable;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class ooo0Oo0 implements o0oo0000, RememberObserver {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final ArrayList f58098OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ConstraintLayoutScope f58099OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final SnapshotStateObserver f58100OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Handler f58101OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f58102OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final OooO0OO f58103OooO0oo;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<Measurable> f58104OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ ooo0Oo0 f58105OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oO0Ooooo f58106OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(List<? extends Measurable> list, oO0Ooooo oo0ooooo, ooo0Oo0 ooo0oo0) {
            super(0);
            this.f58104OooO0Oo = list;
            this.f58106OooO0o0 = oo0ooooo;
            this.f58105OooO0o = ooo0oo0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            List<Measurable> list = this.f58104OooO0Oo;
            int size = list.size() - 1;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    Object parentData = list.get(i).getParentData();
                    o0o0000 o0o0000Var = parentData instanceof o0o0000 ? (o0o0000) parentData : null;
                    if (o0o0000Var != null) {
                        o0OO0oO0 o0oo0oo1 = new o0OO0oO0(o0o0000Var.f58072OooO0Oo.f58020OooO00o);
                        o0o0000Var.f58074OooO0o0.invoke(o0oo0oo1);
                        oO0Ooooo state = this.f58106OooO0o0;
                        Intrinsics.checkNotNullParameter(state, "state");
                        Iterator it = o0oo0oo1.f58046OooO0O0.iterator();
                        while (it.hasNext()) {
                            ((Function1) it.next()).invoke(state);
                        }
                    }
                    this.f58105OooO0o.f58098OooO.add(o0o0000Var);
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
            Function0<? extends Unit> it = function0;
            Intrinsics.checkNotNullParameter(it, "it");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                it.invoke();
            } else {
                ooo0Oo0 ooo0oo0 = ooo0Oo0.this;
                Handler handler = ooo0oo0.f58101OooO0o0;
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                    ooo0oo0.f58101OooO0o0 = handler;
                }
                handler.post(new OooOO0(it, 1));
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
            ooo0Oo0.this.f58102OooO0oO = true;
            return Unit.INSTANCE;
        }
    }

    public ooo0Oo0(@NotNull ConstraintLayoutScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f58099OooO0Oo = scope;
        this.f58100OooO0o = new SnapshotStateObserver(new OooO0O0());
        this.f58102OooO0oO = true;
        this.f58103OooO0oo = new OooO0OO();
        this.f58098OooO = new ArrayList();
    }

    public final void OooO00o(@NotNull oO0Ooooo state, @NotNull List<? extends Measurable> measurables) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ConstraintLayoutScope constraintLayoutScope = this.f58099OooO0Oo;
        constraintLayoutScope.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        Iterator it = constraintLayoutScope.f58052OooO00o.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(state);
        }
        this.f58098OooO.clear();
        this.f58100OooO0o.observeReads(Unit.INSTANCE, this.f58103OooO0oo, new OooO00o(measurables, state, this));
        this.f58102OooO0oO = false;
    }

    public final boolean OooO0O0(@NotNull List<? extends Measurable> measurables) {
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        if (!this.f58102OooO0oO) {
            int size = measurables.size();
            ArrayList arrayList = this.f58098OooO;
            if (size == arrayList.size()) {
                int size2 = measurables.size() - 1;
                if (size2 >= 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        Object parentData = measurables.get(i).getParentData();
                        if (!Intrinsics.areEqual(parentData instanceof o0o0000 ? (o0o0000) parentData : null, arrayList.get(i))) {
                            return true;
                        }
                        if (i2 > size2) {
                            break;
                        }
                        i = i2;
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        SnapshotStateObserver snapshotStateObserver = this.f58100OooO0o;
        snapshotStateObserver.stop();
        snapshotStateObserver.clear();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        this.f58100OooO0o.start();
    }
}
