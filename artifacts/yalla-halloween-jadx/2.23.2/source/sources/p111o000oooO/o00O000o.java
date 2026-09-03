package p111o000oooO;

import android.database.Cursor;
import androidx.paging.o0O0O00;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import java.util.List;
import java.util.TreeMap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p112o000oooo.o00O00OO;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.room.paging.LimitOffsetPagingSource$initialLoad$2", f = "LimitOffsetPagingSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o00O000o extends SuspendLambda implements Function1<Continuation<? super o0O0O00.OooO0O0<Integer, Object>>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oOO00O<Object> f35973OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0O00.OooO00o<Integer> f35974OooO0o0;

    public /* synthetic */ class OooO00o extends FunctionReferenceImpl implements Function1<Cursor, List<Object>> {
        public OooO00o(oOO00O ooo00o) {
            super(1, ooo00o, oOO00O.class, "convertRows", "convertRows(Landroid/database/Cursor;)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<Object> invoke(Cursor cursor) {
            Cursor p0 = cursor;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((oOO00O) this.receiver).OooO0o0(p0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(oOO00O<Object> ooo00o, o0O0O00.OooO00o<Integer> oooO00o, Continuation<? super o00O000o> continuation) {
        super(1, continuation);
        this.f35973OooO0Oo = ooo00o;
        this.f35974OooO0o0 = oooO00o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new o00O000o(this.f35973OooO0Oo, this.f35974OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super o0O0O00.OooO0O0<Integer, Object>> continuation) {
        return ((o00O000o) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        oOO00O<Object> ooo00o = this.f35973OooO0Oo;
        RoomSQLiteQuery sourceQuery = ooo00o.f35975OooO0O0;
        o0O0O00.OooO0O0.C0175OooO0O0<Object, Object> c0175OooO0O0 = o00O00OO.f35979OooO00o;
        Intrinsics.checkNotNullParameter(sourceQuery, "sourceQuery");
        RoomDatabase db = ooo00o.f35976OooO0OO;
        Intrinsics.checkNotNullParameter(db, "db");
        String str = "SELECT COUNT(*) FROM ( " + sourceQuery.OooO0oO() + " )";
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f11007OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(sourceQuery.f11015OooOO0O, str);
        roomSQLiteQueryOooO00o.OooOo00(sourceQuery);
        Cursor cursorOooOO0o = db.OooOO0o(roomSQLiteQueryOooO00o, null);
        try {
            int i = cursorOooOO0o.moveToFirst() ? cursorOooOO0o.getInt(0) : 0;
            cursorOooOO0o.close();
            roomSQLiteQueryOooO00o.release();
            ooo00o.f35977OooO0Oo.set(i);
            return o00O00OO.OooO00o(this.f35974OooO0o0, ooo00o.f35975OooO0O0, db, i, new OooO00o(ooo00o));
        } catch (Throwable th) {
            cursorOooOO0o.close();
            roomSQLiteQueryOooO00o.release();
            throw th;
        }
    }
}
