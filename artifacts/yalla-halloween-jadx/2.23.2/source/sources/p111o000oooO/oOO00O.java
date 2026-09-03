package p111o000oooO;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p110o000ooo0.o00oO0o;
import p112o000oooo.o00O00OO;
import p112o000oooo.o00O00o0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class oOO00O<Value> extends o0O0O00<Integer, Value> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final RoomSQLiteQuery f35975OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final RoomDatabase f35976OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final AtomicInteger f35977OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final o00O00o0 f35978OooO0o0;

    public /* synthetic */ class OooO00o extends FunctionReferenceImpl implements Function0<Unit> {
        public OooO00o(Object obj) {
            super(0, obj, oOO00O.class, "invalidate", "invalidate()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((oOO00O) this.receiver).OooO0OO();
            return Unit.INSTANCE;
        }
    }

    public oOO00O(@NotNull RoomSQLiteQuery sourceQuery, @NotNull RoomDatabase db, @NotNull String... tables) {
        Intrinsics.checkNotNullParameter(sourceQuery, "sourceQuery");
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(tables, "tables");
        this.f35975OooO0O0 = sourceQuery;
        this.f35976OooO0OO = db;
        this.f35977OooO0Oo = new AtomicInteger(-1);
        this.f35978OooO0o0 = new o00O00o0(tables, new OooO00o(this));
    }

    @Override // androidx.paging.o0O0O00
    public final boolean OooO00o() {
        return true;
    }

    @Override // androidx.paging.o0O0O00
    public final Integer OooO0O0(o000000 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        o0O0O00.OooO0O0.C0175OooO0O0<Object, Object> c0175OooO0O0 = o00O00OO.f35979OooO00o;
        Intrinsics.checkNotNullParameter(state, "<this>");
        Integer num = state.f10373OooO0O0;
        if (num != null) {
            return Integer.valueOf(Math.max(0, num.intValue() - (state.f10374OooO0OO.f35511OooO0Oo / 2)));
        }
        return null;
    }

    @Override // androidx.paging.o0O0O00
    @Nullable
    public final Object OooO0Oo(@NotNull o0O0O00.OooO00o<Integer> oooO00o, @NotNull Continuation<? super o0O0O00.OooO0O0<Integer, Value>> continuation) {
        return BuildersKt.withContext(o00oO0o.OooO00o(this.f35976OooO0OO), new o00O00(this, oooO00o, null), continuation);
    }

    @NonNull
    @NotNull
    public abstract ArrayList OooO0o0(@NotNull Cursor cursor);
}
