package androidx.paging.compose;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.OooOo;
import p089o000o000.o000000O;
import p089o000o000.o0000O00;
import p089o000o000.o00O00;
import p089o000o000.o00O00OO;
import p089o000o000.o00OO000;
import p089o000o000.o0O0O00;
import p089o000o000.o0O0ooO;
import p089o000o000.o0OoOo0;
import p100o000oOoO.o0OOO00;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooO0OO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Flow<o0O0ooO<T>> f8795OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f8796OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final OooO00o f8797OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f8798OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ParcelableSnapshotMutableState f8799OooO0o0;

    public static final class OooO00o implements o0OoOo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ OooO0OO<T> f8800OooO00o;

        public OooO00o(OooO0OO<T> oooO0OO) {
            this.f8800OooO00o = oooO0OO;
        }

        @Override // p089o000o000.o0OoOo0
        public final void OooO00o(int i, int i2) {
            if (i2 > 0) {
                OooO0OO.OooO00o(this.f8800OooO00o);
            }
        }

        @Override // p089o000o000.o0OoOo0
        public final void OooO0O0(int i, int i2) {
            if (i2 > 0) {
                OooO0OO.OooO00o(this.f8800OooO00o);
            }
        }

        @Override // p089o000o000.o0OoOo0
        public final void OooO0OO(int i, int i2) {
            if (i2 > 0) {
                OooO0OO.OooO00o(this.f8800OooO00o);
            }
        }
    }

    public static final class OooO0O0 extends o00O00<T> {

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ OooO0OO<T> f8801OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(OooO0OO<T> oooO0OO, o0OoOo0 o0oooo1, MainCoroutineDispatcher mainCoroutineDispatcher) {
            super(o0oooo1, mainCoroutineDispatcher);
            this.f8801OooOOO0 = oooO0OO;
        }

        @Override // p089o000o000.o00O00
        @Nullable
        public final Object OooO0o(@NotNull o0000O00<T> o0000o00, @NotNull o0000O00<T> o0000o01, int i, @NotNull Function0<Unit> function0, @NotNull Continuation<? super Integer> continuation) {
            ((o00O00OO) function0).invoke();
            OooO0OO.OooO00o(this.f8801OooOOO0);
            return null;
        }
    }

    public OooO0OO(@NotNull Flow<o0O0ooO<T>> flow) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        this.f8795OooO00o = flow;
        MainCoroutineDispatcher main = Dispatchers.getMain();
        this.f8796OooO0O0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(new o0O0O00(0, 0, CollectionsKt.emptyList()));
        OooO00o oooO00o = new OooO00o(this);
        this.f8797OooO0OO = oooO00o;
        this.f8798OooO0Oo = new OooO0O0(this, oooO00o, main);
        o000000O o000000o2 = OooOO0.f8804OooO00o;
        this.f8799OooO0o0 = (ParcelableSnapshotMutableState) o0OOO00.OooO0Oo(new OooOo(o000000o2.f28702OooO00o, o000000o2.f28703OooO0O0, o000000o2.f28704OooO0OO, o000000o2, null));
    }

    public static final void OooO00o(OooO0OO oooO0OO) {
        oooO0OO.f8796OooO0O0.setValue(oooO0OO.f8798OooO0Oo.OooO0oO());
    }

    @Nullable
    public final T OooO0O0(int i) {
        this.f8798OooO0Oo.OooO0Oo(i);
        return OooO0Oo().get(i);
    }

    public final int OooO0OO() {
        return OooO0Oo().size();
    }

    @NotNull
    public final o0O0O00<T> OooO0Oo() {
        return (o0O0O00) this.f8796OooO0O0.getValue();
    }

    public final void OooO0o() {
        o00OO000 o00oo001 = this.f8798OooO0Oo.f28909OooO0Oo;
        if (o00oo001 != null) {
            o00oo001.refresh();
        }
    }

    @NotNull
    public final OooOo OooO0o0() {
        return (OooOo) this.f8799OooO0o0.getValue();
    }
}
