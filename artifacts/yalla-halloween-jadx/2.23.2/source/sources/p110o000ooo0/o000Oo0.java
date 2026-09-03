package p110o000ooo0;

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
public abstract class o000Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final RoomDatabase f35925OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final AtomicBoolean f35926OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f35927OooO0OO;

    public static final class OooO00o extends Lambda implements Function0<SupportSQLiteStatement> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final SupportSQLiteStatement invoke() {
            return o000Oo0.this.OooO0O0();
        }
    }

    public o000Oo0(@NotNull RoomDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f35925OooO00o = database;
        this.f35926OooO0O0 = new AtomicBoolean(false);
        this.f35927OooO0OO = LazyKt.lazy(new OooO00o());
    }

    @NotNull
    public final SupportSQLiteStatement OooO00o() {
        this.f35925OooO00o.OooO00o();
        return this.f35926OooO0O0.compareAndSet(false, true) ? (SupportSQLiteStatement) this.f35927OooO0OO.getValue() : OooO0O0();
    }

    public final SupportSQLiteStatement OooO0O0() {
        String sql = OooO0OO();
        RoomDatabase roomDatabase = this.f35925OooO00o;
        roomDatabase.getClass();
        Intrinsics.checkNotNullParameter(sql, "sql");
        roomDatabase.OooO00o();
        roomDatabase.OooO0O0();
        return roomDatabase.OooO0oO().getWritableDatabase().compileStatement(sql);
    }

    @NotNull
    public abstract String OooO0OO();

    public final void OooO0Oo(@NotNull SupportSQLiteStatement statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == ((SupportSQLiteStatement) this.f35927OooO0OO.getValue())) {
            this.f35926OooO0O0.set(false);
        }
    }
}
