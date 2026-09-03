package androidx.media3.session;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import net.sqlcipher.database.SQLiteDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionCommand implements androidx.media3.common.OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f9264OooO;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f9265OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f9266OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @UnstableApi
    public static final OooO0o f9267OooOO0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f9268OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Bundle f9269OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f9270OooO0o0;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface CommandCode {
    }

    static {
        ImmutableList.OooOOOo(40010);
        Object[] objArr = {Integer.valueOf(SQLiteDatabase.SQLITE_MAX_LIKE_PATTERN_LENGTH), 50001, 50002, 50003, 50004, 50005, 50006};
        o0.OooO00o(7, objArr);
        ImmutableList.OooO(7, objArr);
        f9265OooO0oO = p080o000OoO.o00.Oooo00o(0);
        f9266OooO0oo = p080o000OoO.o00.Oooo00o(1);
        f9264OooO = p080o000OoO.o00.Oooo00o(2);
        f9267OooOO0 = new OooO0o(1);
    }

    public SessionCommand(int i) {
        p080o000OoO.o00Oo0.OooO0O0(i != 0, "commandCode shouldn't be COMMAND_CODE_CUSTOM");
        this.f9268OooO0Oo = i;
        this.f9270OooO0o0 = "";
        this.f9269OooO0o = Bundle.EMPTY;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SessionCommand)) {
            return false;
        }
        SessionCommand sessionCommand = (SessionCommand) obj;
        return this.f9268OooO0Oo == sessionCommand.f9268OooO0Oo && TextUtils.equals(this.f9270OooO0o0, sessionCommand.f9270OooO0o0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9270OooO0o0, Integer.valueOf(this.f9268OooO0Oo)});
    }

    @Override // androidx.media3.common.OooO0OO
    @UnstableApi
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f9265OooO0oO, this.f9268OooO0Oo);
        bundle.putString(f9266OooO0oo, this.f9270OooO0o0);
        bundle.putBundle(f9264OooO, this.f9269OooO0o);
        return bundle;
    }

    public SessionCommand(String str, Bundle bundle) {
        this.f9268OooO0Oo = 0;
        str.getClass();
        this.f9270OooO0o0 = str;
        bundle.getClass();
        this.f9269OooO0o = new Bundle(bundle);
    }
}
