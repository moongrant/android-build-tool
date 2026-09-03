package p072o000O0oO;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.paging.o000000;
import androidx.paging.o0O0O00;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import o000O0O0.OooO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p073o000O0oo.o000oOoO;
import p073o000O0oo.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class Oooo0<Value> extends o0O0O00<Integer, Value> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final RoomSQLiteQuery f34858OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final RoomDatabase f34859OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final AtomicInteger f34860OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o0OoOo0 f34861OooO0o0;

    public /* synthetic */ class OooO00o extends FunctionReferenceImpl implements Function0<Unit> {
        public OooO00o(Object obj) {
            super(0, obj, Oooo0.class, "invalidate", "invalidate()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((Oooo0) this.receiver).OooO0OO();
            return Unit.INSTANCE;
        }
    }

    public Oooo0(@NotNull RoomSQLiteQuery sourceQuery, @NotNull RoomDatabase db, @NotNull String... tables) {
        Intrinsics.checkNotNullParameter(sourceQuery, "sourceQuery");
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(tables, "tables");
        this.f34858OooO0O0 = sourceQuery;
        this.f34859OooO0OO = db;
        this.f34860OooO0Oo = new AtomicInteger(-1);
        this.f34861OooO0o0 = new o0OoOo0(tables, new OooO00o(this));
    }

    @Override // androidx.paging.o0O0O00
    public final boolean OooO00o() {
        return true;
    }

    @Override // androidx.paging.o0O0O00
    public final Integer OooO0O0(o000000 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        o0O0O00.OooO0O0.C0156OooO0O0<Object, Object> c0156OooO0O0 = o000oOoO.f34862OooO00o;
        Intrinsics.checkNotNullParameter(state, "<this>");
        Integer num = state.f7279OooO0O0;
        if (num != null) {
            return Integer.valueOf(Math.max(0, num.intValue() - (state.f7280OooO0OO.f34566OooO0Oo / 2)));
        }
        return null;
    }

    @Override // androidx.paging.o0O0O00
    @Nullable
    public final Object OooO0Oo(@NotNull o0O0O00.OooO00o<Integer> oooO00o, @NotNull Continuation<? super o0O0O00.OooO0O0<Integer, Value>> continuation) {
        return BuildersKt.withContext(OooO0o.OooO00o(this.f34859OooO0OO), new OooOo(this, oooO00o, null), continuation);
    }

    @NonNull
    @NotNull
    public abstract ArrayList OooO0o0(@NotNull Cursor cursor);
}
