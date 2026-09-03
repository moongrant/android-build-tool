package p235o00oOoo;

import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O000 implements SupportSQLiteOpenHelper.OooO0O0 {
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.OooO0O0
    @NotNull
    public final SupportSQLiteOpenHelper create(@NotNull SupportSQLiteOpenHelper.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new FrameworkSQLiteOpenHelper(configuration.f11078OooO00o, configuration.f11079OooO0O0, configuration.f11080OooO0OO, configuration.f11081OooO0Oo, configuration.f11082OooO0o0);
    }
}
