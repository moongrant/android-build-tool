package p085o000OooO;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OoOo0 implements SupportSQLiteOpenHelper.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Context f35169OooO00o;

    public o0OoOo0(Context context) {
        this.f35169OooO00o = context;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.OooO0O0
    @NonNull
    public final SupportSQLiteOpenHelper create(@NonNull SupportSQLiteOpenHelper.Configuration configuration) {
        Context context = this.f35169OooO00o;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        SupportSQLiteOpenHelper.OooO00o callback = configuration.f7986OooO0OO;
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (callback == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.".toString());
        }
        String str = configuration.f7985OooO0O0;
        if (!(str == null || str.length() == 0 ? false : true)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
        }
        SupportSQLiteOpenHelper.Configuration configuration2 = new SupportSQLiteOpenHelper.Configuration(context, str, callback, true);
        Intrinsics.checkNotNullParameter(configuration2, "configuration");
        return new FrameworkSQLiteOpenHelper(configuration2.f7984OooO00o, configuration2.f7985OooO0O0, configuration2.f7986OooO0OO, configuration2.f7987OooO0Oo, configuration2.f7988OooO0o0);
    }
}
