package o00000;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.StringRes;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.o0O0O00;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.oOO00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {
    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final String OooO00o(@StringRes int i, @Nullable oOO00O ooo00o) {
        ooo00o.OooOO0o(o0O0O00.f6590OooO00o);
        Resources resources = ((Context) ooo00o.OooOO0o(o0O0O00.f6591OooO0O0)).getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "LocalContext.current.resources");
        String string = resources.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(id)");
        return string;
    }
}
