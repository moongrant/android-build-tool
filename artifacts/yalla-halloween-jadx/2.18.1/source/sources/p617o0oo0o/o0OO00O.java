package p617o0oo0o;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.ArrayIteratorsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o0OO00O {
    public static final void OooO00o(@NotNull TextView textView, @NotNull int... colors) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (!(colors.length == 0)) {
            ArrayList arrayList = new ArrayList();
            IntIterator it = ArrayIteratorsKt.iterator(colors);
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(it.nextInt()));
            }
            LinearGradient linearGradient = new LinearGradient(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, textView.getLineHeight(), CollectionsKt.toIntArray(arrayList), (float[]) null, Shader.TileMode.MIRROR);
            TextPaint paint = textView.getPaint();
            if (paint == null) {
                return;
            }
            paint.setShader(linearGradient);
        }
    }
}
