package p454o0Ooo0O;

import android.content.SharedPreferences;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final SharedPreferences f46495OooO00o;

    public OooOo() {
        SharedPreferences sharedPreferences = o000O0.OooO00o().getSharedPreferences("YlMediaLib", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "Utils.context.getSharedP…b\", Context.MODE_PRIVATE)");
        this.f46495OooO00o = sharedPreferences;
    }

    public final boolean OooO00o(@NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f46495OooO00o.getBoolean(key, z);
    }

    public final void OooO0O0(@NotNull String key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        SharedPreferences.Editor editorPutBoolean = this.f46495OooO00o.edit().putBoolean(key, z);
        if (editorPutBoolean != null) {
            editorPutBoolean.commit();
        }
    }
}
