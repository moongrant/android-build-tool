package p552o0oOOoOo;

import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.netimage.NetImageView;
import kotlin.jvm.internal.Intrinsics;
import o0OO0O0.OooOO0;
import org.jetbrains.annotations.NotNull;
import p417o0OoO0.o0000oo;
import p641o0ooOOOO.xb;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class o0OOOO0o {
    public static void OooO00o(@NotNull OooOO0 entity, @NotNull xb binding) {
        Intrinsics.checkNotNullParameter(entity, "entity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        entity.OooO0OO("img_30496", true);
        entity.OooO0OO("img_28963", true);
        entity.OooO0OO("img_28964", true);
        entity.OooO0OO("img_28965", true);
        entity.OooO0OO("img_28973", true);
        NetImageView netImageView = binding.f59351OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivFromHead");
        o0000oo.OooO0O0(entity, netImageView, "img_28965");
        TextView textView = binding.f59357OooOO0O;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvFromUser");
        o0000oo.OooO0O0(entity, textView, "img_28973");
        TextView textView2 = binding.f59358OooOO0o;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvToUser");
        o0000oo.OooO0O0(entity, textView2, "img_28963");
        SVGAView sVGAView = binding.f59352OooO0o;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.ivGift");
        o0000oo.OooO0O0(entity, sVGAView, "img_28964");
        entity.OooO0OO("img_30496", false);
        entity.OooO0OO("img_28963", false);
        entity.OooO0OO("img_28964", false);
        entity.OooO0OO("img_28965", false);
        entity.OooO0OO("img_28973", false);
    }
}
