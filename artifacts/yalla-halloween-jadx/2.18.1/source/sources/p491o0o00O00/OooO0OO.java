package p491o0o00O00;

import androidx.room.OooO0o;
import androidx.room.RoomDatabase;
import com.app.base.application.App;
import com.yalla.yalla.common.db.YlAppDataBase;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final Lazy f41114OooO00o = LazyKt.lazy(OooO00o.f41115Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<YlAppDataBase> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f41115Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final YlAppDataBase invoke() {
            RoomDatabase.OooO00o OooO00o2 = OooO0o.OooO00o(App.f11458Oooo0oO, YlAppDataBase.class, "YallaNew.db");
            OooO00o2.f9310OooO0oo = true;
            OooO00o2.OooO00o(OooO0o.f41117OooO00o);
            OooO00o2.OooO00o(OooO0o.f41118OooO0O0);
            OooO00o2.OooO00o(OooO0o.f41119OooO0OO);
            OooO00o2.OooO00o(OooO0o.f41120OooO0Oo);
            OooO00o2.OooO00o(OooO0o.f41122OooO0o0);
            OooO00o2.OooO00o(OooO0o.f41121OooO0o);
            OooO00o2.OooO00o(OooO0o.f41123OooO0oO);
            OooO00o2.OooO00o(OooO0o.f41124OooO0oo);
            OooO00o2.OooO00o(OooO0o.f41116OooO);
            OooO00o2.OooO00o(OooO0o.f41125OooOO0);
            OooO00o2.OooO00o(OooO0o.f41126OooOO0O);
            OooO00o2.OooO00o(OooO0o.f41127OooOO0o);
            OooO00o2.OooO00o(OooO0o.f41129OooOOO0);
            OooO00o2.OooO00o(OooO0o.f41128OooOOO);
            OooO00o2.OooO00o(OooO0o.f41130OooOOOO);
            OooO00o2.OooO00o(OooO0o.f41131OooOOOo);
            OooO00o2.OooO00o(OooO0o.f41133OooOOo0);
            OooO00o2.OooO00o(OooO0o.f41132OooOOo);
            OooO00o2.OooO00o(OooO0o.f41134OooOOoo);
            OooO00o2.OooO00o(OooO0o.f41137OooOo00);
            OooO00o2.OooO00o(OooO0o.f41136OooOo0);
            OooO00o2.OooO00o(OooO0o.f41138OooOo0O);
            OooO00o2.OooO00o(OooO0o.f41139OooOo0o);
            OooO00o2.OooO00o(OooO0o.f41135OooOo);
            OooO00o2.OooO00o(OooO0o.f41141OooOoO0);
            OooO00o2.OooO00o(OooO0o.f41140OooOoO);
            OooO00o2.OooO00o(OooO0o.f41142OooOoOO);
            OooO00o2.OooO00o(OooO0o.f41144OooOoo0);
            OooO00o2.OooO00o(OooO0o.f41143OooOoo);
            OooO00o2.OooO00o(OooO0o.f41145OooOooO);
            OooO00o2.OooO00o(OooO0o.f41146OooOooo);
            OooO00o2.OooO00o(OooO0o.f41148Oooo000);
            OooO00o2.OooO00o(OooO0o.f41149Oooo00O);
            OooO00o2.OooO00o(OooO0o.f41150Oooo00o);
            OooO00o2.OooO00o(OooO0o.f41147Oooo0);
            OooO00o2.OooO00o(OooO0o.f41151Oooo0O0);
            RoomDatabase roomDatabaseOooO0O0 = OooO00o2.OooO0O0();
            Intrinsics.checkNotNullExpressionValue(roomDatabaseOooO0O0, "databaseBuilder(App.getC…N_36_37)\n        .build()");
            return (YlAppDataBase) roomDatabaseOooO0O0;
        }
    }

    @NotNull
    public static final YlAppDataBase OooO00o() {
        return (YlAppDataBase) f41114OooO00o.getValue();
    }
}
