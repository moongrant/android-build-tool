package p422o0OoO0o;

import androidx.sqlite.db.SupportSQLiteQuery;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO implements SupportSQLiteQuery {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f45569OooO0Oo;

    public OooOOOO(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f45569OooO0Oo = query;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final void OooO00o(@NotNull OooOo00 statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        Intrinsics.checkNotNullParameter(statement, "statement");
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    public final int OooO0OO() {
        return 0;
    }

    @Override // androidx.sqlite.db.SupportSQLiteQuery
    @NotNull
    public final String OooO0oO() {
        return this.f45569OooO0Oo;
    }
}
