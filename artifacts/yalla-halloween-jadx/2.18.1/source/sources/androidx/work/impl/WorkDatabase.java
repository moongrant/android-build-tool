package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.work.OooO0O0;
import java.util.concurrent.TimeUnit;
import o00O0000.OooO;
import o00O0000.OooO0o;
import o00O0000.OooOO0O;
import o00O0000.OooOOO0;
import o00O0000.OooOOOO;
import o00O0000.OooOo00;
import o00O0000.Oooo0;
import o00O0000.Oooo000;
import o00O0000.o00O0O;
import o00O0000.o00Ooo;
import o00O0000.o0OoOo0;
import o00O0000.o0ooOOo;
import o00O0000.oo000o;

/* JADX INFO: loaded from: classes.dex */
@TypeConverters({OooO0O0.class, o0ooOOo.class})
@Database(entities = {o00O0000.OooO00o.class, o0OoOo0.class, o00Ooo.class, OooOO0O.class, OooOOOO.class, Oooo000.class, OooO0o.class}, version = 12)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class WorkDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final long f9765OooOOO = TimeUnit.DAYS.toMillis(1);

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final /* synthetic */ int f9766OooOOOO = 0;

    @NonNull
    public abstract OooO OooOOo();

    @NonNull
    public abstract o00O0000.OooO0O0 OooOOo0();

    @NonNull
    public abstract OooOOO0 OooOOoo();

    @NonNull
    public abstract Oooo0 OooOo0();

    @NonNull
    public abstract OooOo00 OooOo00();

    @NonNull
    public abstract o00O0O OooOo0O();

    @NonNull
    public abstract oo000o OooOo0o();
}
