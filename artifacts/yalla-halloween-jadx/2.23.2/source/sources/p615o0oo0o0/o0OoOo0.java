package p615o0oo0o0;

import android.graphics.Bitmap;
import com.yy.yyeva.mix.EvaSrc;
import com.yy.yyeva.mix.OooO0OO;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public interface o0OoOo0 {
    void releaseSrc(@NotNull List<OooO0OO> list);

    void setImage(@NotNull OooO0OO oooO0OO, @NotNull Function2<? super Bitmap, ? super EvaSrc.FitType, Unit> function2);

    void setText(@NotNull OooO0OO oooO0OO, @NotNull Function2<? super String, ? super String, Unit> function2);
}
