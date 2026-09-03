package o000O0O0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @JvmField
    @NotNull
    public final Executor f34688OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @NotNull
    public final Context f34689OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    @Nullable
    public final String f34690OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    @NotNull
    public final SupportSQLiteOpenHelper.OooO0O0 f34691OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public final RoomDatabase.OooO0OO f34692OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    public final boolean f34693OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @Nullable
    public final List<RoomDatabase.OooO0O0> f34694OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @JvmField
    @NotNull
    public final RoomDatabase.JournalMode f34695OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public final Executor f34696OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Nullable
    public final Intent f34697OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @JvmField
    public final boolean f34698OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @JvmField
    public final boolean f34699OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @JvmField
    @Nullable
    public final Callable<InputStream> f34700OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public final Set<Integer> f34701OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @JvmField
    @NotNull
    public final List<Object> f34702OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @JvmField
    @NotNull
    public final List<Object> f34703OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @JvmField
    public final boolean f34704OooOOo0;

    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public OooO(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.OooO0O0 sqliteOpenHelperFactory, @NotNull RoomDatabase.OooO0OO migrationContainer, @Nullable ArrayList arrayList, boolean z, @NotNull RoomDatabase.JournalMode journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, boolean z2, boolean z3, @Nullable LinkedHashSet linkedHashSet, @NotNull ArrayList typeConverters, @NotNull ArrayList autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.f34689OooO00o = context;
        this.f34690OooO0O0 = str;
        this.f34691OooO0OO = sqliteOpenHelperFactory;
        this.f34692OooO0Oo = migrationContainer;
        this.f34694OooO0o0 = arrayList;
        this.f34693OooO0o = z;
        this.f34695OooO0oO = journalMode;
        this.f34696OooO0oo = queryExecutor;
        this.f34688OooO = transactionExecutor;
        this.f34697OooOO0 = null;
        this.f34698OooOO0O = z2;
        this.f34699OooOO0o = z3;
        this.f34701OooOOO0 = linkedHashSet;
        this.f34700OooOOO = null;
        this.f34702OooOOOO = typeConverters;
        this.f34703OooOOOo = autoMigrationSpecs;
        this.f34704OooOOo0 = false;
    }

    public final boolean OooO00o(int i, int i2) {
        Set<Integer> set;
        if ((i > i2) && this.f34699OooOO0o) {
            return false;
        }
        return this.f34698OooOO0O && ((set = this.f34701OooOOO0) == null || !set.contains(Integer.valueOf(i)));
    }
}
