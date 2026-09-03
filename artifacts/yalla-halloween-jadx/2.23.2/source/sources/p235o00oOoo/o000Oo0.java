package p235o00oOoo;

import android.database.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteStatement;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o000Oo0 extends o000O0o implements SupportSQLiteStatement {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final SQLiteStatement f39933OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000Oo0(@NotNull SQLiteStatement delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f39933OooO0o0 = delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final long executeInsert() {
        return this.f39933OooO0o0.executeInsert();
    }

    @Override // androidx.sqlite.db.SupportSQLiteStatement
    public final int executeUpdateDelete() {
        return this.f39933OooO0o0.executeUpdateDelete();
    }
}
