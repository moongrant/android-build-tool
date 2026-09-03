package p072o000O0oO;

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
import p073o000O0oo.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.room.paging.LimitOffsetPagingSource$initialLoad$2", f = "LimitOffsetPagingSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OooOo00 extends SuspendLambda implements Function1<Continuation<? super o0O0O00.OooO0O0<Integer, Object>>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Oooo0<Object> f34856OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0O00.OooO00o<Integer> f34857OooO0o0;

    public /* synthetic */ class OooO00o extends FunctionReferenceImpl implements Function1<Cursor, List<Object>> {
        public OooO00o(Oooo0 oooo0) {
            super(1, oooo0, Oooo0.class, "convertRows", "convertRows(Landroid/database/Cursor;)Ljava/util/List;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<Object> invoke(Cursor cursor) {
            Cursor p0 = cursor;
            Intrinsics.checkNotNullParameter(p0, "p0");
            return ((Oooo0) this.receiver).OooO0o0(p0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo00(Oooo0<Object> oooo0, o0O0O00.OooO00o<Integer> oooO00o, Continuation<? super OooOo00> continuation) {
        super(1, continuation);
        this.f34856OooO0Oo = oooo0;
        this.f34857OooO0o0 = oooO00o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
        return new OooOo00(this.f34856OooO0Oo, this.f34857OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super o0O0O00.OooO0O0<Integer, Object>> continuation) {
        return ((OooOo00) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Oooo0<Object> oooo0 = this.f34856OooO0Oo;
        RoomSQLiteQuery sourceQuery = oooo0.f34858OooO0O0;
        o0O0O00.OooO0O0.C0156OooO0O0<Object, Object> c0156OooO0O0 = o000oOoO.f34862OooO00o;
        Intrinsics.checkNotNullParameter(sourceQuery, "sourceQuery");
        RoomDatabase db = oooo0.f34859OooO0OO;
        Intrinsics.checkNotNullParameter(db, "db");
        String str = "SELECT COUNT(*) FROM ( " + sourceQuery.OooO0oO() + " )";
        TreeMap<Integer, RoomSQLiteQuery> treeMap = RoomSQLiteQuery.f7913OooOO0o;
        RoomSQLiteQuery roomSQLiteQueryOooO00o = RoomSQLiteQuery.OooO00o.OooO00o(sourceQuery.f7921OooOO0O, str);
        roomSQLiteQueryOooO00o.OooOOo(sourceQuery);
        Cursor cursorOooOO0o = db.OooOO0o(roomSQLiteQueryOooO00o, null);
        try {
            int i = cursorOooOO0o.moveToFirst() ? cursorOooOO0o.getInt(0) : 0;
            cursorOooOO0o.close();
            roomSQLiteQueryOooO00o.release();
            oooo0.f34860OooO0Oo.set(i);
            return o000oOoO.OooO00o(this.f34857OooO0o0, oooo0.f34858OooO0O0, db, i, new OooO00o(oooo0));
        } catch (Throwable th) {
            cursorOooOO0o.close();
            roomSQLiteQueryOooO00o.release();
            throw th;
        }
    }
}
