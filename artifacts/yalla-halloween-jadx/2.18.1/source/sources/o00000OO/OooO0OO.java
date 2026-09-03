package o00000OO;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p052o00000o0.o000000;
import p052o00000o0.o000000O;

/* JADX INFO: loaded from: classes.dex */
@InternalPlatformTextApi
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Lazy f27020OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f27021OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f27022OooO0OO;

    public static final class OooO00o extends Lambda implements Function0<BoringLayout.Metrics> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f27023Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ CharSequence f27024Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ TextPaint f27025Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, CharSequence charSequence, TextPaint textPaint) {
            super(0);
            this.f27023Oooo0o = i;
            this.f27024Oooo0oO = charSequence;
            this.f27025Oooo0oo = textPaint;
        }

        @Override // kotlin.jvm.functions.Function0
        public final BoringLayout.Metrics invoke() {
            TextDirectionHeuristic textDir = o00Oo0.OooO00o(this.f27023Oooo0o);
            CharSequence text = this.f27024Oooo0oO;
            TextPaint textPaint = this.f27025Oooo0oo;
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(textDir, "textDir");
            if (textDir.isRtl(text, 0, text.length())) {
                return null;
            }
            return BoringLayout.isBoring(text, textPaint, null);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ CharSequence f27027Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ TextPaint f27028Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(CharSequence charSequence, TextPaint textPaint) {
            super(0);
            this.f27027Oooo0oO = charSequence;
            this.f27028Oooo0oo = textPaint;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x004f  */
        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            float desiredWidth;
            BoringLayout.Metrics metrics = (BoringLayout.Metrics) OooO0OO.this.f27020OooO00o.getValue();
            boolean z = false;
            if (metrics != null) {
                desiredWidth = metrics.width;
            } else {
                CharSequence charSequence = this.f27027Oooo0oO;
                desiredWidth = Layout.getDesiredWidth(charSequence, 0, charSequence.length(), this.f27028Oooo0oo);
            }
            CharSequence charSequence2 = this.f27027Oooo0oO;
            TextPaint textPaint = this.f27028Oooo0oo;
            if (!(desiredWidth == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) && (charSequence2 instanceof Spanned)) {
                if (textPaint.getLetterSpacing() == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                    Spanned spanned = (Spanned) charSequence2;
                    if (OooOO0O.OooO00o(spanned, o000000O.class) || OooOO0O.OooO00o(spanned, o000000.class)) {
                        z = true;
                    }
                } else {
                    z = true;
                }
            }
            if (z) {
                desiredWidth += 0.5f;
            }
            return Float.valueOf(desiredWidth);
        }
    }

    /* JADX INFO: renamed from: o00000OO.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static final class C0285OooO0OO extends Lambda implements Function0<Float> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ CharSequence f27029Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ TextPaint f27030Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0285OooO0OO(CharSequence charSequence, TextPaint textPaint) {
            super(0);
            this.f27029Oooo0o = charSequence;
            this.f27030Oooo0oO = textPaint;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            CharSequence text = this.f27029Oooo0o;
            TextPaint paint = this.f27030Oooo0oO;
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(paint, "paint");
            BreakIterator lineInstance = BreakIterator.getLineInstance(paint.getTextLocale());
            lineInstance.setText(new o00000OO.OooO00o(text, text.length()));
            PriorityQueue<Pair> priorityQueue = new PriorityQueue(10, new Comparator() { // from class: o00000OO.OooO0o
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Pair pair = (Pair) obj;
                    Pair pair2 = (Pair) obj2;
                    return (((Number) pair.getSecond()).intValue() - ((Number) pair.getFirst()).intValue()) - (((Number) pair2.getSecond()).intValue() - ((Number) pair2.getFirst()).intValue());
                }
            });
            int i = 0;
            for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
                if (priorityQueue.size() < 10) {
                    priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
                } else {
                    Pair pair = (Pair) priorityQueue.peek();
                    if (pair != null && ((Number) pair.getSecond()).intValue() - ((Number) pair.getFirst()).intValue() < next - i) {
                        priorityQueue.poll();
                        priorityQueue.add(new Pair(Integer.valueOf(i), Integer.valueOf(next)));
                    }
                }
                i = next;
            }
            float fMax = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            for (Pair pair2 : priorityQueue) {
                fMax = Math.max(fMax, Layout.getDesiredWidth(text, ((Number) pair2.component1()).intValue(), ((Number) pair2.component2()).intValue(), paint));
            }
            return Float.valueOf(fMax);
        }
    }

    public OooO0OO(@NotNull CharSequence charSequence, @NotNull TextPaint textPaint, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f27020OooO00o = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new OooO00o(i, charSequence, textPaint));
        this.f27021OooO0O0 = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new C0285OooO0OO(charSequence, textPaint));
        this.f27022OooO0OO = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new OooO0O0(charSequence, textPaint));
    }
}
