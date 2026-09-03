package o00000O;

import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.appcompat.widget.o00000O0;
import androidx.compose.ui.text.ExperimentalTextApi;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042Ooooo0o.o000O0Oo;
import p145o00Oo0.o000O;
import p145o00Oo0.o000O000;
import p145o00Oo0.o000O0o;
import p145o00Oo0.o000OO00;
import p145o00Oo0.o0O0ooO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final OooO f26773OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f26774OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f26775OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f26776OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f26777OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f26778OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NotNull
    public final List<o00O0O.OooOO0O> f26779OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NotNull
    public final List<OooOOO0> f26780OooO0oo;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.ArrayList, java.util.List<o00000O.OooOOO>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    public OooO0o(OooO oooO, long j, int i, boolean z) {
        ?? r1;
        boolean z2;
        int iOooO0oO;
        this.f26773OooO00o = oooO;
        this.f26774OooO0O0 = i;
        int i2 = 0;
        if (!(o0000O0O.OooO0O0.OooOO0(j) == 0 && o0000O0O.OooO0O0.OooO(j) == 0)) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        ArrayList arrayList = new ArrayList();
        ?? r2 = oooO.f26752OooO0o0;
        int size = r2.size();
        int i3 = 0;
        int i4 = 0;
        float f = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        while (true) {
            if (i3 >= size) {
                r1 = r2;
                z2 = false;
                break;
            }
            OooOOO oooOOO = (OooOOO) r1.get(i3);
            OooOOOO paragraphIntrinsics = oooOOO.f26781OooO00o;
            int iOooO0oo = o0000O0O.OooO0O0.OooO0oo(j);
            if (o0000O0O.OooO0O0.OooO0OO(j)) {
                r1 = r2;
                iOooO0oO = RangesKt.coerceAtLeast(o0000O0O.OooO0O0.OooO0oO(j) - ((int) Math.ceil(f)), i2);
            } else {
                r1 = r2;
                iOooO0oO = o0000O0O.OooO0O0.OooO0oO(j);
            }
            long jOooO0O0 = o0000O0O.OooO0OO.OooO0O0(iOooO0oo, iOooO0oO, 5);
            int i5 = this.f26774OooO0O0 - i4;
            Intrinsics.checkNotNullParameter(paragraphIntrinsics, "paragraphIntrinsics");
            Intrinsics.checkNotNullParameter(paragraphIntrinsics, "paragraphIntrinsics");
            o0000O00.OooO0OO oooO0OO = new o0000O00.OooO0OO((o0000O00.OooO0o) paragraphIntrinsics, i5, z, jOooO0O0);
            float height = oooO0OO.getHeight() + f;
            int i6 = i4 + oooO0OO.f27276OooO0Oo.f27062OooO0OO;
            ?? r17 = r1;
            arrayList.add(new OooOOO0(oooO0OO, oooOOO.f26782OooO0O0, oooOOO.f26783OooO0OO, i4, i6, f, height));
            if (oooO0OO.f27276OooO0Oo.f27060OooO00o || (i6 == this.f26774OooO0O0 && i3 != CollectionsKt.getLastIndex(this.f26773OooO00o.f26752OooO0o0))) {
                i4 = i6;
                f = height;
                z2 = true;
                break;
            } else {
                i3++;
                i4 = i6;
                f = height;
                r1 = r17;
                i2 = 0;
            }
        }
        this.f26778OooO0o0 = f;
        this.f26777OooO0o = i4;
        this.f26775OooO0OO = z2;
        this.f26780OooO0oo = arrayList;
        this.f26776OooO0Oo = o0000O0O.OooO0O0.OooO0oo(j);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i7 = 0; i7 < size2; i7++) {
            OooOOO0 oooOOO0 = (OooOOO0) arrayList.get(i7);
            List<o00O0O.OooOO0O> listOooOO0o = oooOOO0.f26784OooO00o.OooOO0o();
            ArrayList arrayList3 = new ArrayList(listOooOO0o.size());
            int size3 = listOooOO0o.size();
            for (int i8 = 0; i8 < size3; i8++) {
                o00O0O.OooOO0O oooOO0O = listOooOO0o.get(i8);
                arrayList3.add(oooOO0O != null ? oooOOO0.OooO00o(oooOO0O) : null);
            }
            CollectionsKt.addAll(arrayList2, arrayList3);
        }
        int size4 = arrayList2.size();
        List<o00O0O.OooOO0O> listPlus = arrayList2;
        if (size4 < this.f26773OooO00o.f26749OooO0O0.size()) {
            int size5 = this.f26773OooO00o.f26749OooO0O0.size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size5);
            for (int i9 = 0; i9 < size5; i9++) {
                arrayList4.add(null);
            }
            listPlus = CollectionsKt.plus((Collection) arrayList2, (Iterable) arrayList4);
        }
        this.f26779OooO0oO = listPlus;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<o00000O.OooOOO0>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList, java.util.List<o00000O.OooOOO0>] */
    @NotNull
    public final o000O0o OooO00o(int i, int i2) {
        boolean z = false;
        if ((i >= 0 && i <= i2) && i2 <= this.f26773OooO00o.f26748OooO00o.f26756Oooo0o.length()) {
            z = true;
        }
        if (!z) {
            StringBuilder sbOooO0O0 = o000O0Oo.OooO0O0("Start(", i, ") or End(", i2, ") is out of range [0..");
            sbOooO0O0.append(this.f26773OooO00o.f26748OooO00o.f26756Oooo0o.length());
            sbOooO0O0.append("), or start > end!");
            throw new IllegalArgumentException(sbOooO0O0.toString().toString());
        }
        if (i == i2) {
            return p145o00Oo0.o00Ooo.OooO00o();
        }
        o000O0o o000o0oOooO00o = p145o00Oo0.o00Ooo.OooO00o();
        int size = this.f26780OooO0oo.size();
        for (int iOooO00o = OooOO0.OooO00o(this.f26780OooO0oo, i); iOooO00o < size; iOooO00o++) {
            OooOOO0 oooOOO0 = (OooOOO0) this.f26780OooO0oo.get(iOooO00o);
            int i3 = oooOOO0.f26785OooO0O0;
            if (i3 >= i2) {
                break;
            }
            if (i3 != oooOOO0.f26786OooO0OO) {
                o000O0o o000o0oOooOOo = oooOOO0.f26784OooO00o.OooOOo(oooOOO0.OooO0O0(i), oooOOO0.OooO0O0(i2));
                Intrinsics.checkNotNullParameter(o000o0oOooOOo, "<this>");
                o000o0oOooOOo.OooOO0o(o00O0O.OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, oooOOO0.f26788OooO0o));
                o000O000.OooO00o(o000o0oOooO00o, o000o0oOooOOo, 0L, 2, null);
            }
        }
        return o000o0oOooO00o;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o00000O.OooOOO0>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List, java.util.List<o00000O.OooOOO0>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List, java.util.List<o00000O.OooOOO0>] */
    @ExperimentalTextApi
    public final void OooO0O0(@NotNull p145o00Oo0.o0O0O00 canvas, @NotNull p145o00Oo0.o0Oo0oo brush, @Nullable o000OO00 o000oo01, @Nullable o0000O0.OooO oooO) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(this, "<this>");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(brush, "brush");
        canvas.OooO0oo();
        if (this.f26780OooO0oo.size() <= 1 || (brush instanceof o0O0ooO)) {
            o0000O00.OooO0O0.OooO00o(this, canvas, brush, o000oo01, oooO);
        } else if (brush instanceof o000O) {
            ?? r0 = this.f26780OooO0oo;
            int size = r0.size();
            float fMax = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            float height = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            for (int i = 0; i < size; i++) {
                OooOOO0 oooOOO0 = (OooOOO0) r0.get(i);
                height += oooOOO0.f26784OooO00o.getHeight();
                fMax = Math.max(fMax, oooOOO0.f26784OooO00o.getWidth());
            }
            Shader shader = ((o000O) brush).OooO0O0(o00O0O.OooOo.OooO00o(fMax, height));
            Matrix matrix = new Matrix();
            shader.getLocalMatrix(matrix);
            ?? r1 = this.f26780OooO0oo;
            int size2 = r1.size();
            for (int i2 = 0; i2 < size2; i2++) {
                OooOOO0 oooOOO1 = (OooOOO0) r1.get(i2);
                OooOO0O oooOO0O = oooOOO1.f26784OooO00o;
                Intrinsics.checkNotNullParameter(shader, "shader");
                oooOO0O.OooOOOo(canvas, new p145o00Oo0.o0OO00O(shader), o000oo01, oooO);
                canvas.OooO0O0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, oooOOO1.f26784OooO00o.getHeight());
                matrix.setTranslate(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, -oooOOO1.f26784OooO00o.getHeight());
                shader.setLocalMatrix(matrix);
            }
        }
        canvas.OooOOo0();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List, java.util.List<o00000O.OooOOO0>] */
    public final void OooO0OO(@NotNull p145o00Oo0.o0O0O00 canvas, long j, @Nullable o000OO00 o000oo01, @Nullable o0000O0.OooO oooO) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.OooO0oo();
        ?? r0 = this.f26780OooO0oo;
        int size = r0.size();
        for (int i = 0; i < size; i++) {
            OooOOO0 oooOOO0 = (OooOOO0) r0.get(i);
            oooOOO0.f26784OooO00o.OooOo00(canvas, j, o000oo01, oooO);
            canvas.OooO0O0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, oooOOO0.f26784OooO00o.getHeight());
        }
        canvas.OooOOo0();
    }

    public final void OooO0Oo(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f26773OooO00o.f26748OooO00o.f26756Oooo0o.length()) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbOooO00o = o00000O0.OooO00o("offset(", i, ") is out of bounds [0, ");
        sbOooO00o.append(this.f26773OooO00o.f26748OooO00o.length());
        sbOooO00o.append(']');
        throw new IllegalArgumentException(sbOooO00o.toString().toString());
    }

    public final void OooO0o0(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f26777OooO0o) {
            z = true;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(("lineIndex(" + i + ") is out of bounds [0, " + i + ')').toString());
    }
}
