package o00000OO;

import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOOO f27032OooO00o = new OooOOO();

    @DoNotInline
    public final void OooO00o(@NotNull StaticLayout.Builder builder, int i) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.setJustificationMode(i);
    }
}
