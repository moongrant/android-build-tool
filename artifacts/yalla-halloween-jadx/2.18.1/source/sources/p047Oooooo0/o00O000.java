package p047Oooooo0;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00O000 extends o00O000o {

    public static final class OooO00o extends Lambda implements Function1<Object, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ List<Function1<Object, Unit>> f4061Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(List<Function1<Object, Unit>> list) {
            super(1);
            this.f4061Oooo0o = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object state) {
            Intrinsics.checkNotNullParameter(state, "state");
            List<Function1<Object, Unit>> list = this.f4061Oooo0o;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).invoke(state);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o00O0O0, o00O000o> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Object, Unit> f4062Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<Object, Unit> f4063Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Function1<Object, Unit> function1, Function1<Object, Unit> function2) {
            super(1);
            this.f4062Oooo0o = function1;
            this.f4063Oooo0oO = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o00O000o invoke(o00O0O0 o00o0o0) {
            int i;
            o00O0O0 invalid = o00o0o0;
            Intrinsics.checkNotNullParameter(invalid, "invalid");
            synchronized (oo0o0O0.f4158OooO0OO) {
                i = oo0o0O0.f4161OooO0o0;
                oo0o0O0.f4161OooO0o0 = i + 1;
            }
            return new o00O000o(i, invalid, this.f4062Oooo0o, this.f4063Oooo0oO);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<o00O0O0, o00O00OO> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function1<Object, Unit> f4064Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Function1<Object, Unit> function1) {
            super(1);
            this.f4064Oooo0o = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final o00O00OO invoke(o00O0O0 o00o0o0) {
            int i;
            o00O0O0 invalid = o00o0o0;
            Intrinsics.checkNotNullParameter(invalid, "invalid");
            synchronized (oo0o0O0.f4158OooO0OO) {
                i = oo0o0O0.f4161OooO0o0;
                oo0o0O0.f4161OooO0o0 = i + 1;
            }
            return new o00O00OO(i, invalid, this.f4064Oooo0o);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.Collection, java.util.List<kotlin.jvm.functions.Function1<java.lang.Object, kotlin.Unit>>] */
    public o00O000(int i, @NotNull o00O0O0 invalid) {
        Function1 oooO00o;
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        synchronized (oo0o0O0.f4158OooO0OO) {
            ?? r1 = oo0o0O0.f4163OooO0oo;
            List mutableList = r1.isEmpty() ^ true ? CollectionsKt.toMutableList((Collection) r1) : null;
            if (mutableList != null) {
                oooO00o = (Function1) CollectionsKt.singleOrNull(mutableList);
                if (oooO00o == null) {
                    oooO00o = new OooO00o(mutableList);
                }
            } else {
                oooO00o = null;
            }
        }
        super(i, invalid, null, oooO00o);
    }

    @Override // p047Oooooo0.o00O000o, p047Oooooo0.oo00o
    public final void OooO0OO() {
        synchronized (oo0o0O0.f4158OooO0OO) {
            OooOOO();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // p047Oooooo0.o00O000o, p047Oooooo0.oo00o
    public final void OooOO0(oo00o snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        o00OOO00.OooO00o();
        throw null;
    }

    @Override // p047Oooooo0.o00O000o, p047Oooooo0.oo00o
    public final void OooOO0O(oo00o snapshot) {
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        o00OOO00.OooO00o();
        throw null;
    }

    @Override // p047Oooooo0.o00O000o, p047Oooooo0.oo00o
    public final void OooOO0o() {
        oo0o0O0.OooO00o();
    }

    @Override // p047Oooooo0.o00O000o, p047Oooooo0.oo00o
    @NotNull
    public final oo00o OooOOoo(@Nullable Function1<Object, Unit> function1) {
        OooO0OO oooO0OO = new OooO0OO(function1);
        Function1<o00O0O0, Unit> function2 = oo0o0O0.f4156OooO00o;
        return (oo00o) oo0o0O0.OooO0o(new o00O0OOO(oooO0OO));
    }

    @Override // p047Oooooo0.o00O000o
    @NotNull
    public final o00O0 OooOo0() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @Override // p047Oooooo0.o00O000o
    @NotNull
    public final o00O000o OooOoO(@Nullable Function1<Object, Unit> function1, @Nullable Function1<Object, Unit> function2) {
        OooO0O0 oooO0O0 = new OooO0O0(function1, function2);
        Function1<o00O0O0, Unit> function3 = oo0o0O0.f4156OooO00o;
        return (o00O000o) ((oo00o) oo0o0O0.OooO0o(new o00O0OOO(oooO0O0)));
    }
}
