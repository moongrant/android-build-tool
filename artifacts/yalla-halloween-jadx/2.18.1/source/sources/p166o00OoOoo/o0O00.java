package p166o00OoOoo;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.o00O000;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public class o0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final SharedPreferences f32553OooO00o;

    public o0O00(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        o00O000 o00o001 = o00O000.f34346OooO00o;
        SharedPreferences sharedPreferences = o00O000.OooO00o().getSharedPreferences(name, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "Utils.context.getSharedP…me, Context.MODE_PRIVATE)");
        this.f32553OooO00o = sharedPreferences;
    }

    public final boolean OooO(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor editorPutString = this.f32553OooO00o.edit().putString(key, value);
        if (editorPutString != null) {
            return editorPutString.commit();
        }
        return false;
    }

    public final boolean OooO00o(@NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f32553OooO00o.getBoolean(key, z);
    }

    public final int OooO0O0(@NotNull String key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f32553OooO00o.getInt(key, i);
    }

    public final long OooO0OO(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f32553OooO00o.getLong(key, 0L);
    }

    @NotNull
    public final String OooO0Oo(@NotNull String key, @NotNull String defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defValue, "defValue");
        String string = this.f32553OooO00o.getString(key, defValue);
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final boolean OooO0o(@NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorPutBoolean = this.f32553OooO00o.edit().putBoolean(key, z);
        if (editorPutBoolean != null) {
            return editorPutBoolean.commit();
        }
        return false;
    }

    public final boolean OooO0oO(@NotNull String key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorPutInt = this.f32553OooO00o.edit().putInt(key, i);
        if (editorPutInt != null) {
            return editorPutInt.commit();
        }
        return false;
    }

    public final boolean OooO0oo(@NotNull String key, long j) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorPutLong = this.f32553OooO00o.edit().putLong(key, j);
        if (editorPutLong != null) {
            return editorPutLong.commit();
        }
        return false;
    }

    public final boolean OooOO0(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorRemove = this.f32553OooO00o.edit().remove(key);
        if (editorRemove != null) {
            return editorRemove.commit();
        }
        return false;
    }
}
