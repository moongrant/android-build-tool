package p107o000ooO0;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import p097o000o0o0.o000O0O0;

/* JADX INFO: loaded from: classes.dex */
public final class o0OoOo0 implements SupportSQLiteOpenHelper.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Context f30013OooO00o;

    public o0OoOo0(Context context) {
        this.f30013OooO00o = context;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.OooO0O0
    @NonNull
    public final SupportSQLiteOpenHelper create(@NonNull SupportSQLiteOpenHelper.Configuration configuration) {
        Context context = this.f30013OooO00o;
        String str = configuration.f9350OooO0O0;
        SupportSQLiteOpenHelper.OooO00o oooO00o = configuration.f9351OooO0OO;
        if (oooO00o == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new o000O0O0(context, str, oooO00o, true);
    }
}
