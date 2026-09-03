package p459o0Ooo0Oo;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O00O;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public class o00Oo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final SharedPreferences f47774OooO00o;

    public o00Oo00() {
        SharedPreferences sharedPreferences = o000O00O.OooO00o().getSharedPreferences("YlMediaLib", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.f47774OooO00o = sharedPreferences;
    }

    public final boolean OooO00o(@NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f47774OooO00o.getBoolean(key, z);
    }

    public final void OooO0O0(@NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorPutBoolean = this.f47774OooO00o.edit().putBoolean(key, z);
        if (editorPutBoolean != null) {
            editorPutBoolean.commit();
        }
    }
}
