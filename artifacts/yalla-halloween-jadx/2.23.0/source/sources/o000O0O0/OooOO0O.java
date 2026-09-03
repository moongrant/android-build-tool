package o000O0O0;

import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.yalla.yalla.data.db.YlAppDataBase;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class OooOO0O<T> extends o000000 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(@NotNull YlAppDataBase database) {
        super(database);
        Intrinsics.checkNotNullParameter(database, "database");
    }

    public abstract void OooO0Oo(@NotNull SupportSQLiteStatement supportSQLiteStatement, T t);

    public final int OooO0o0(T t) {
        SupportSQLiteStatement supportSQLiteStatementOooO00o = OooO00o();
        try {
            OooO0Oo(supportSQLiteStatementOooO00o, t);
            return supportSQLiteStatementOooO00o.executeUpdateDelete();
        } finally {
            OooO0OO(supportSQLiteStatementOooO00o);
        }
    }
}
