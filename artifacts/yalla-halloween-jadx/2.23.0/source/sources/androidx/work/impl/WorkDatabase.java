package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.work.OooO0O0;
import java.util.concurrent.TimeUnit;
import p091o000o0O.OooOOO;
import p091o000o0O.OooOOOO;
import p091o000o0O.OooOo;
import p091o000o0O.Oooo000;
import p091o000o0O.o000000O;
import p091o000o0O.o000OOo;
import p091o000o0O.o000oOoO;
import p091o000o0O.o00Oo0;
import p091o000o0O.o00Ooo;
import p091o000o0O.o00oO0o;
import p091o000o0O.o0O0O00;
import p091o000o0O.o0OO00O;
import p091o000o0O.o0Oo0oo;
import p091o000o0O.o0OoOo0;
import p091o000o0O.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
@TypeConverters({OooO0O0.class, o000000O.class})
@Database(entities = {OooOOO.class, o0Oo0oo.class, o0O0O00.class, o000oOoO.class, o00Oo0.class, o00oO0o.class, OooOo.class}, version = 12)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public abstract class WorkDatabase extends RoomDatabase {

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final /* synthetic */ int f8410OooOOO = 0;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final long f8411OooOOO0 = TimeUnit.DAYS.toMillis(1);

    @NonNull
    public abstract OooOOOO OooOOOO();

    @NonNull
    public abstract Oooo000 OooOOOo();

    @NonNull
    public abstract o00Ooo OooOOo();

    @NonNull
    public abstract o0OoOo0 OooOOo0();

    @NonNull
    public abstract o0ooOOo OooOOoo();

    @NonNull
    public abstract o000OOo OooOo0();

    @NonNull
    public abstract o0OO00O OooOo00();
}
