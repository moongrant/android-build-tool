package o000O0O0;

import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class o000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final RoomDatabase f34763OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f34764OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f34765OooO0OO;

    public static final class OooO00o extends Lambda implements Function0<SupportSQLiteStatement> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SupportSQLiteStatement invoke() {
            o000000 o000000Var = o000000.this;
            String sql = o000000Var.OooO0O0();
            RoomDatabase roomDatabase = o000000Var.f34763OooO00o;
            roomDatabase.getClass();
            Intrinsics.checkNotNullParameter(sql, "sql");
            roomDatabase.OooO00o();
            roomDatabase.OooO0O0();
            return roomDatabase.OooO0oO().getWritableDatabase().compileStatement(sql);
        }
    }

    public o000000(@NotNull RoomDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f34763OooO00o = database;
        this.f34764OooO0O0 = new AtomicBoolean(false);
        this.f34765OooO0OO = LazyKt.lazy(new OooO00o());
    }

    @NotNull
    public final SupportSQLiteStatement OooO00o() {
        RoomDatabase roomDatabase = this.f34763OooO00o;
        roomDatabase.OooO00o();
        if (this.f34764OooO0O0.compareAndSet(false, true)) {
            return (SupportSQLiteStatement) this.f34765OooO0OO.getValue();
        }
        String sql = OooO0O0();
        roomDatabase.getClass();
        Intrinsics.checkNotNullParameter(sql, "sql");
        roomDatabase.OooO00o();
        roomDatabase.OooO0O0();
        return roomDatabase.OooO0oO().getWritableDatabase().compileStatement(sql);
    }

    @NotNull
    public abstract String OooO0O0();

    public final void OooO0OO(@NotNull SupportSQLiteStatement statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == ((SupportSQLiteStatement) this.f34765OooO0OO.getValue())) {
            this.f34764OooO0O0.set(false);
        }
    }
}
