package o00000OO;

import android.os.Build;
import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(23)
public final class OooOOO0 implements OooOo {
    @Override // o00000OO.OooOo
    @DoNotInline
    @NotNull
    public StaticLayout OooO00o(@NotNull Oooo0 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(params.f27037OooO00o, params.f27038OooO0O0, params.f27039OooO0OO, params.f27040OooO0Oo, params.f27042OooO0o0);
        builderObtain.setTextDirection(params.f27041OooO0o);
        builderObtain.setAlignment(params.f27043OooO0oO);
        builderObtain.setMaxLines(params.f27044OooO0oo);
        builderObtain.setEllipsize(params.f27036OooO);
        builderObtain.setEllipsizedWidth(params.f27045OooOO0);
        builderObtain.setLineSpacing(params.f27047OooOO0o, params.f27046OooOO0O);
        builderObtain.setIncludePad(params.f27048OooOOO);
        builderObtain.setBreakStrategy(params.f27051OooOOOo);
        builderObtain.setHyphenationFrequency(params.f27053OooOOo0);
        builderObtain.setIndents(params.f27052OooOOo, params.f27054OooOOoo);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            OooOOO oooOOO = OooOOO.f27032OooO00o;
            Intrinsics.checkNotNullExpressionValue(builderObtain, "this");
            oooOOO.OooO00o(builderObtain, params.f27049OooOOO0);
        }
        if (i >= 28) {
            OooOOOO oooOOOO = OooOOOO.f27033OooO00o;
            Intrinsics.checkNotNullExpressionValue(builderObtain, "this");
            oooOOOO.OooO00o(builderObtain, params.f27050OooOOOO);
        }
        StaticLayout staticLayoutBuild = builderObtain.build();
        Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "obtain(params.text, para…  }\n            }.build()");
        return staticLayoutBuild;
    }
}
