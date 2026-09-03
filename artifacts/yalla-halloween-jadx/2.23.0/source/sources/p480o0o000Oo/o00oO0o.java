package p480o0o000Oo;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public class o00oO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final SharedPreferences f47687OooO00o;

    public o00oO0o(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        SharedPreferences sharedPreferences = o000O0.OooO00o().getSharedPreferences(name, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "Utils.context.getSharedP…me, Context.MODE_PRIVATE)");
        this.f47687OooO00o = sharedPreferences;
    }

    public final boolean OooO(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        SharedPreferences.Editor editorPutString = this.f47687OooO00o.edit().putString(key, value);
        if (editorPutString != null) {
            return editorPutString.commit();
        }
        return false;
    }

    public final void OooO00o() {
        SharedPreferences.Editor editorClear = this.f47687OooO00o.edit().clear();
        if (editorClear != null) {
            editorClear.commit();
        }
    }

    public final boolean OooO0O0(@NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f47687OooO00o.getBoolean(key, z);
    }

    public final int OooO0OO(@NotNull String key, int i) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f47687OooO00o.getInt(key, i);
    }

    public final long OooO0Oo(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f47687OooO00o.getLong(key, 0L);
    }

    public final void OooO0o(@NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorPutBoolean = this.f47687OooO00o.edit().putBoolean(key, z);
        if (editorPutBoolean != null) {
            editorPutBoolean.commit();
        }
    }

    @NotNull
    public final String OooO0o0(@NotNull String key, @NotNull String defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defValue, "defValue");
        String string = this.f47687OooO00o.getString(key, defValue);
        Intrinsics.checkNotNull(string);
        return string;
    }

    public final boolean OooO0oO(int i, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorPutInt = this.f47687OooO00o.edit().putInt(key, i);
        if (editorPutInt != null) {
            return editorPutInt.commit();
        }
        return false;
    }

    public final void OooO0oo(long j, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorPutLong = this.f47687OooO00o.edit().putLong(key, j);
        if (editorPutLong != null) {
            editorPutLong.commit();
        }
    }

    public final void OooOO0(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorRemove = this.f47687OooO00o.edit().remove(key);
        if (editorRemove != null) {
            editorRemove.commit();
        }
    }
}
