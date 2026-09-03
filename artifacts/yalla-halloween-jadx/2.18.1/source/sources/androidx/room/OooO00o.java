package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import p713oooo00o.o0O000Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final RoomDatabase.JournalMode f9273OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final SupportSQLiteOpenHelper.OooO0O0 f9274OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Context f9275OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final String f9276OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NonNull
    public final RoomDatabase.OooO0OO f9277OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final List<RoomDatabase.OooO0O0> f9279OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f9281OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public final Executor f9282OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NonNull
    public final Executor f9283OooOO0O;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final boolean f9285OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final boolean f9286OooOOO0;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f9284OooOO0o = false;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public final List<Object> f9278OooO0o = Collections.emptyList();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public final List<o0O000Oo> f9280OooO0oO = Collections.emptyList();

    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public OooO00o(@NonNull Context context, @Nullable String str, @NonNull SupportSQLiteOpenHelper.OooO0O0 oooO0O0, @NonNull RoomDatabase.OooO0OO oooO0OO, @Nullable List list, boolean z, @NonNull RoomDatabase.JournalMode journalMode, @NonNull Executor executor, @NonNull Executor executor2, boolean z2, boolean z3) {
        this.f9274OooO00o = oooO0O0;
        this.f9275OooO0O0 = context;
        this.f9276OooO0OO = str;
        this.f9277OooO0Oo = oooO0OO;
        this.f9279OooO0o0 = list;
        this.f9281OooO0oo = z;
        this.f9273OooO = journalMode;
        this.f9282OooOO0 = executor;
        this.f9283OooOO0O = executor2;
        this.f9286OooOOO0 = z2;
        this.f9285OooOOO = z3;
    }

    public final boolean OooO00o(int i, int i2) {
        return !((i > i2) && this.f9285OooOOO) && this.f9286OooOOO0;
    }
}
