package p642o0ooOOo;

import android.os.Handler;
import android.os.Looper;
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
public final class o0OOOO00 implements o0OOO0OO, RememberObserver {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NotNull
    public final ArrayList f59560OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final ConstraintLayoutScope f59561OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final SnapshotStateObserver f59562OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Handler f59563OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f59564OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final OooO0OO f59565OooO0oo;

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<Measurable> f59566OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0OOOO00 f59567OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oO0000O f59568OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(List<? extends Measurable> list, oO0000O oo0000o, o0OOOO00 o0oooo01) {
            super(0);
            this.f59566OooO0Oo = list;
            this.f59568OooO0o0 = oo0000o;
            this.f59567OooO0o = o0oooo01;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            List<Measurable> list = this.f59566OooO0Oo;
            int size = list.size() - 1;
            if (size >= 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    Object parentData = list.get(i).getParentData();
                    o0OOO00 o0ooo00 = parentData instanceof o0OOO00 ? (o0OOO00) parentData : null;
                    if (o0ooo00 != null) {
                        o0OO0 o0oo1 = new o0OO0(o0ooo00.f59557OooO0Oo.f59539OooO00o);
                        o0ooo00.f59559OooO0o0.invoke(o0oo1);
                        oO0000O state = this.f59568OooO0o0;
                        Intrinsics.checkNotNullParameter(state, "state");
                        Iterator it = o0oo1.f59519OooO0O0.iterator();
                        while (it.hasNext()) {
                            ((Function1) it.next()).invoke(state);
                        }
                    }
                    this.f59567OooO0o.f59560OooO.add(o0ooo00);
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
                o0OOOO00 o0oooo01 = o0OOOO00.this;
                Handler handler = o0oooo01.f59563OooO0o0;
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                    o0oooo01.f59563OooO0o0 = handler;
                }
                handler.post(new o0OOOO0o(it, 0));
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
            o0OOOO00.this.f59564OooO0oO = true;
            return Unit.INSTANCE;
        }
    }

    public o0OOOO00(@NotNull ConstraintLayoutScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f59561OooO0Oo = scope;
        this.f59562OooO0o = new SnapshotStateObserver(new OooO0O0());
        this.f59564OooO0oO = true;
        this.f59565OooO0oo = new OooO0OO();
        this.f59560OooO = new ArrayList();
    }

    public final void OooO00o(@NotNull oO0000O state, @NotNull List<? extends Measurable> measurables) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ConstraintLayoutScope constraintLayoutScope = this.f59561OooO0Oo;
        constraintLayoutScope.getClass();
        Intrinsics.checkNotNullParameter(state, "state");
        Iterator it = constraintLayoutScope.f59550OooO00o.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(state);
        }
        this.f59560OooO.clear();
        this.f59562OooO0o.observeReads(Unit.INSTANCE, this.f59565OooO0oo, new OooO00o(measurables, state, this));
        this.f59564OooO0oO = false;
    }

    public final boolean OooO0O0(@NotNull List<? extends Measurable> measurables) {
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        if (!this.f59564OooO0oO) {
            int size = measurables.size();
            ArrayList arrayList = this.f59560OooO;
            if (size == arrayList.size()) {
                int size2 = measurables.size() - 1;
                if (size2 >= 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        Object parentData = measurables.get(i).getParentData();
                        if (!Intrinsics.areEqual(parentData instanceof o0OOO00 ? (o0OOO00) parentData : null, arrayList.get(i))) {
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
        SnapshotStateObserver snapshotStateObserver = this.f59562OooO0o;
        snapshotStateObserver.stop();
        snapshotStateObserver.clear();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        this.f59562OooO0o.start();
    }
}
