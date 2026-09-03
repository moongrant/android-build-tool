package o00000O;

import Oooo000.o000O00O;
import androidx.appcompat.widget.o00000O0;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p042Ooooo0o.o000O0O0;
import p042Ooooo0o.o000O0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final o0ooOOo f26877OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO0o f26878OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f26879OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f26880OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final List<o00O0O.OooOO0O> f26881OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f26882OooO0o0;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<o00000O.OooOOO0>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList, java.util.List<o00000O.OooOOO0>] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList, java.util.List<o00000O.OooOOO0>] */
    public o0OOO0o(o0ooOOo o0ooooo2, OooO0o oooO0o, long j) {
        this.f26877OooO00o = o0ooooo2;
        this.f26878OooO0O0 = oooO0o;
        this.f26879OooO0OO = j;
        boolean zIsEmpty = oooO0o.f26780OooO0oo.isEmpty();
        float fOooO0OO = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        this.f26880OooO0Oo = zIsEmpty ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : ((OooOOO0) oooO0o.f26780OooO0oo.get(0)).f26784OooO00o.OooO0oO();
        if (!oooO0o.f26780OooO0oo.isEmpty()) {
            OooOOO0 oooOOO0 = (OooOOO0) CollectionsKt.last((List) oooO0o.f26780OooO0oo);
            fOooO0OO = oooOOO0.f26784OooO00o.OooO0OO() + oooOOO0.f26788OooO0o;
        }
        this.f26882OooO0o0 = fOooO0OO;
        this.f26881OooO0o = oooO0o.f26779OooO0oO;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o00000O.OooOOO0>] */
    public final float OooO(int i) {
        OooO0o oooO0o = this.f26878OooO0O0;
        oooO0o.OooO0o0(i);
        OooOOO0 oooOOO0 = (OooOOO0) oooO0o.f26780OooO0oo.get(OooOO0.OooO0O0(oooO0o.f26780OooO0oo, i));
        return oooOOO0.f26784OooO00o.OooOo0(i - oooOOO0.f26787OooO0Oo);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o00000O.OooOOO0>] */
    @NotNull
    public final ResolvedTextDirection OooO00o(int i) {
        OooO0o oooO0o = this.f26878OooO0O0;
        oooO0o.OooO0Oo(i);
        OooOOO0 oooOOO0 = (OooOOO0) oooO0o.f26780OooO0oo.get(i == oooO0o.f26773OooO00o.f26748OooO00o.length() ? CollectionsKt.getLastIndex(oooO0o.f26780OooO0oo) : OooOO0.OooO00o(oooO0o.f26780OooO0oo, i));
        return oooOOO0.f26784OooO00o.OooO0oo(oooOOO0.OooO0O0(i));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<o00000O.OooOOO0>] */
    @NotNull
    public final o00O0O.OooOO0O OooO0O0(int i) {
        OooO0o oooO0o = this.f26878OooO0O0;
        Objects.requireNonNull(oooO0o);
        if (i >= 0 && i < oooO0o.f26773OooO00o.f26748OooO00o.f26756Oooo0o.length()) {
            OooOOO0 oooOOO0 = (OooOOO0) oooO0o.f26780OooO0oo.get(OooOO0.OooO00o(oooO0o.f26780OooO0oo, i));
            return oooOOO0.OooO00o(oooOOO0.f26784OooO00o.OooOO0O(oooOOO0.OooO0O0(i)));
        }
        StringBuilder sbOooO00o = o00000O0.OooO00o("offset(", i, ") is out of bounds [0, ");
        sbOooO00o.append(oooO0o.f26773OooO00o.f26748OooO00o.length());
        sbOooO00o.append(')');
        throw new IllegalArgumentException(sbOooO00o.toString().toString());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o00000O.OooOOO0>] */
    @NotNull
    public final o00O0O.OooOO0O OooO0OO(int i) {
        OooO0o oooO0o = this.f26878OooO0O0;
        oooO0o.OooO0Oo(i);
        OooOOO0 oooOOO0 = (OooOOO0) oooO0o.f26780OooO0oo.get(i == oooO0o.f26773OooO00o.f26748OooO00o.length() ? CollectionsKt.getLastIndex(oooO0o.f26780OooO0oo) : OooOO0.OooO00o(oooO0o.f26780OooO0oo, i));
        return oooOOO0.OooO00o(oooOOO0.f26784OooO00o.OooO0Oo(oooOOO0.OooO0O0(i)));
    }

    public final boolean OooO0Oo() {
        return this.f26878OooO0O0.f26775OooO0OO || ((float) o0000O0O.o000oOoO.OooO0O0(this.f26879OooO0OO)) < this.f26878OooO0O0.f26778OooO0o0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o00000O.OooOOO0>] */
    public final int OooO0o(int i, boolean z) {
        OooO0o oooO0o = this.f26878OooO0O0;
        oooO0o.OooO0o0(i);
        OooOOO0 oooOOO0 = (OooOOO0) oooO0o.f26780OooO0oo.get(OooOO0.OooO0O0(oooO0o.f26780OooO0oo, i));
        return oooOOO0.f26784OooO00o.OooOOO(i - oooOOO0.f26787OooO0Oo, z) + oooOOO0.f26785OooO0O0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o00000O.OooOOO0>] */
    public final float OooO0o0(int i) {
        OooO0o oooO0o = this.f26878OooO0O0;
        oooO0o.OooO0o0(i);
        OooOOO0 oooOOO0 = (OooOOO0) oooO0o.f26780OooO0oo.get(OooOO0.OooO0O0(oooO0o.f26780OooO0oo, i));
        return oooOOO0.f26784OooO00o.OooO(i - oooOOO0.f26787OooO0Oo) + oooOOO0.f26788OooO0o;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o00000O.OooOOO0>] */
    public final int OooO0oO(int i) {
        OooO0o oooO0o = this.f26878OooO0O0;
        oooO0o.OooO0Oo(i);
        OooOOO0 oooOOO0 = (OooOOO0) oooO0o.f26780OooO0oo.get(i == oooO0o.f26773OooO00o.f26748OooO00o.length() ? CollectionsKt.getLastIndex(oooO0o.f26780OooO0oo) : OooOO0.OooO00o(oooO0o.f26780OooO0oo, i));
        return oooOOO0.f26784OooO00o.OooO0o(oooOOO0.OooO0O0(i)) + oooOOO0.f26787OooO0Oo;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o00000O.OooOOO0>] */
    public final int OooO0oo(float f) {
        int lastIndex;
        OooO0o oooO0o = this.f26878OooO0O0;
        if (f <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            lastIndex = 0;
        } else {
            lastIndex = f >= oooO0o.f26778OooO0o0 ? CollectionsKt.getLastIndex(oooO0o.f26780OooO0oo) : OooOO0.OooO0OO(oooO0o.f26780OooO0oo, f);
        }
        OooOOO0 oooOOO0 = (OooOOO0) oooO0o.f26780OooO0oo.get(lastIndex);
        int i = oooOOO0.f26786OooO0OO;
        int i2 = oooOOO0.f26785OooO0O0;
        return i - i2 == 0 ? Math.max(0, i2 - 1) : oooOOO0.f26784OooO00o.OooOOo0(f - oooOOO0.f26788OooO0o) + oooOOO0.f26787OooO0Oo;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o00000O.OooOOO0>] */
    public final float OooOO0(int i) {
        OooO0o oooO0o = this.f26878OooO0O0;
        oooO0o.OooO0o0(i);
        OooOOO0 oooOOO0 = (OooOOO0) oooO0o.f26780OooO0oo.get(OooOO0.OooO0O0(oooO0o.f26780OooO0oo, i));
        return oooOOO0.f26784OooO00o.OooOOOO(i - oooOOO0.f26787OooO0Oo);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o00000O.OooOOO0>] */
    public final int OooOO0O(int i) {
        OooO0o oooO0o = this.f26878OooO0O0;
        oooO0o.OooO0o0(i);
        OooOOO0 oooOOO0 = (OooOOO0) oooO0o.f26780OooO0oo.get(OooOO0.OooO0O0(oooO0o.f26780OooO0oo, i));
        return oooOOO0.f26784OooO00o.OooOOO0(i - oooOOO0.f26787OooO0Oo) + oooOOO0.f26785OooO0O0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o00000O.OooOOO0>] */
    public final float OooOO0o(int i) {
        OooO0o oooO0o = this.f26878OooO0O0;
        oooO0o.OooO0o0(i);
        OooOOO0 oooOOO0 = (OooOOO0) oooO0o.f26780OooO0oo.get(OooOO0.OooO0O0(oooO0o.f26780OooO0oo, i));
        return oooOOO0.f26784OooO00o.OooO0O0(i - oooOOO0.f26787OooO0Oo) + oooOOO0.f26788OooO0o;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o00000O.OooOOO0>] */
    @NotNull
    public final ResolvedTextDirection OooOOO(int i) {
        OooO0o oooO0o = this.f26878OooO0O0;
        oooO0o.OooO0Oo(i);
        OooOOO0 oooOOO0 = (OooOOO0) oooO0o.f26780OooO0oo.get(i == oooO0o.f26773OooO00o.f26748OooO00o.length() ? CollectionsKt.getLastIndex(oooO0o.f26780OooO0oo) : OooOO0.OooO00o(oooO0o.f26780OooO0oo, i));
        return oooOOO0.f26784OooO00o.OooO00o(oooOOO0.OooO0O0(i));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o00000O.OooOOO0>] */
    public final int OooOOO0(long j) {
        int lastIndex;
        OooO0o oooO0o = this.f26878OooO0O0;
        Objects.requireNonNull(oooO0o);
        if (o00O0O.OooO.OooO0Oo(j) <= ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            lastIndex = 0;
        } else {
            lastIndex = o00O0O.OooO.OooO0Oo(j) >= oooO0o.f26778OooO0o0 ? CollectionsKt.getLastIndex(oooO0o.f26780OooO0oo) : OooOO0.OooO0OO(oooO0o.f26780OooO0oo, o00O0O.OooO.OooO0Oo(j));
        }
        OooOOO0 oooOOO0 = (OooOOO0) oooO0o.f26780OooO0oo.get(lastIndex);
        int i = oooOOO0.f26786OooO0OO;
        int i2 = oooOOO0.f26785OooO0O0;
        return i - i2 == 0 ? Math.max(0, i2 - 1) : oooOOO0.f26784OooO00o.OooOO0(o00O0O.OooOO0.OooO00o(o00O0O.OooO.OooO0OO(j), o00O0O.OooO.OooO0Oo(j) - oooOOO0.f26788OooO0o)) + oooOOO0.f26785OooO0O0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o00000O.OooOOO0>] */
    public final long OooOOOO(int i) {
        OooO0o oooO0o = this.f26878OooO0O0;
        oooO0o.OooO0Oo(i);
        OooOOO0 oooOOO0 = (OooOOO0) oooO0o.f26780OooO0oo.get(i == oooO0o.f26773OooO00o.f26748OooO00o.length() ? CollectionsKt.getLastIndex(oooO0o.f26780OooO0oo) : OooOO0.OooO00o(oooO0o.f26780OooO0oo, i));
        long jOooO0o0 = oooOOO0.f26784OooO00o.OooO0o0(oooOOO0.OooO0O0(i));
        o0OO00O.OooO00o oooO00o = o0OO00O.f26874OooO0O0;
        return o000O0O0.OooO00o(((int) (jOooO0o0 >> 32)) + oooOOO0.f26785OooO0O0, o0OO00O.OooO0Oo(jOooO0o0) + oooOOO0.f26785OooO0O0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0OOO0o)) {
            return false;
        }
        o0OOO0o o0ooo0o2 = (o0OOO0o) obj;
        if (!Intrinsics.areEqual(this.f26877OooO00o, o0ooo0o2.f26877OooO00o) || !Intrinsics.areEqual(this.f26878OooO0O0, o0ooo0o2.f26878OooO0O0) || !o0000O0O.o000oOoO.OooO00o(this.f26879OooO0OO, o0ooo0o2.f26879OooO0OO)) {
            return false;
        }
        if (this.f26880OooO0Oo == o0ooo0o2.f26880OooO0Oo) {
            return ((this.f26882OooO0o0 > o0ooo0o2.f26882OooO0o0 ? 1 : (this.f26882OooO0o0 == o0ooo0o2.f26882OooO0o0 ? 0 : -1)) == 0) && Intrinsics.areEqual(this.f26881OooO0o, o0ooo0o2.f26881OooO0o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26881OooO0o.hashCode() + o000O00O.OooO00o(this.f26882OooO0o0, o000O00O.OooO00o(this.f26880OooO0Oo, (o0000O0O.o000oOoO.OooO0OO(this.f26879OooO0OO) + ((this.f26878OooO0O0.hashCode() + (this.f26877OooO00o.hashCode() * 31)) * 31)) * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("TextLayoutResult(layoutInput=");
        sbOooO0o0.append(this.f26877OooO00o);
        sbOooO0o0.append(", multiParagraph=");
        sbOooO0o0.append(this.f26878OooO0O0);
        sbOooO0o0.append(", size=");
        sbOooO0o0.append((Object) o0000O0O.o000oOoO.OooO0Oo(this.f26879OooO0OO));
        sbOooO0o0.append(", firstBaseline=");
        sbOooO0o0.append(this.f26880OooO0Oo);
        sbOooO0o0.append(", lastBaseline=");
        sbOooO0o0.append(this.f26882OooO0o0);
        sbOooO0o0.append(", placeholderRects=");
        return o000O0Oo.OooO00o(sbOooO0o0, this.f26881OooO0o, ')');
    }
}
