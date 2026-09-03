package p110o000ooo0;

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
import oo00o.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @JvmField
    @NotNull
    public final Executor f35952OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @NotNull
    public final Context f35953OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @JvmField
    @Nullable
    public final String f35954OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    @NotNull
    public final SupportSQLiteOpenHelper.OooO0O0 f35955OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public final RoomDatabase.OooO0OO f35956OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @JvmField
    public final boolean f35957OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @Nullable
    public final List<RoomDatabase.OooO0O0> f35958OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @JvmField
    @NotNull
    public final RoomDatabase.JournalMode f35959OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @JvmField
    @NotNull
    public final Executor f35960OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @JvmField
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Nullable
    public final Intent f35961OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @JvmField
    public final boolean f35962OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @JvmField
    public final boolean f35963OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @JvmField
    @Nullable
    public final Callable<InputStream> f35964OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public final Set<Integer> f35965OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    @JvmField
    @NotNull
    public final List<Object> f35966OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @JvmField
    @NotNull
    public final List<OooO0O0> f35967OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @JvmField
    public final boolean f35968OooOOo0;

    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public o0ooOOo(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.OooO0O0 sqliteOpenHelperFactory, @NotNull RoomDatabase.OooO0OO migrationContainer, @Nullable ArrayList arrayList, boolean z, @NotNull RoomDatabase.JournalMode journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, boolean z2, boolean z3, @Nullable LinkedHashSet linkedHashSet, @NotNull ArrayList typeConverters, @NotNull ArrayList autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.f35953OooO00o = context;
        this.f35954OooO0O0 = str;
        this.f35955OooO0OO = sqliteOpenHelperFactory;
        this.f35956OooO0Oo = migrationContainer;
        this.f35958OooO0o0 = arrayList;
        this.f35957OooO0o = z;
        this.f35959OooO0oO = journalMode;
        this.f35960OooO0oo = queryExecutor;
        this.f35952OooO = transactionExecutor;
        this.f35961OooOO0 = null;
        this.f35962OooOO0O = z2;
        this.f35963OooOO0o = z3;
        this.f35965OooOOO0 = linkedHashSet;
        this.f35964OooOOO = null;
        this.f35966OooOOOO = typeConverters;
        this.f35967OooOOOo = autoMigrationSpecs;
        this.f35968OooOOo0 = false;
    }

    public final boolean OooO00o(int i, int i2) {
        Set<Integer> set;
        if ((i > i2) && this.f35963OooOO0o) {
            return false;
        }
        return this.f35962OooOO0O && ((set = this.f35965OooOOO0) == null || !set.contains(Integer.valueOf(i)));
    }
}
