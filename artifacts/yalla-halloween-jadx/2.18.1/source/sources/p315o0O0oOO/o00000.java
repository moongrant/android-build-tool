package p315o0O0oOO;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.ttml.TtmlStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;
import p318o0O0oOo.o000OOo0;
import p324o0O0oo0O.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 implements o0000O00 {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final Map<String, o000000> f36574Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o000OOo f36575Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final long[] f36576Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Map<String, TtmlStyle> f36577Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final Map<String, String> f36578OoooO00;

    public o00000(o000OOo o000ooo2, Map<String, TtmlStyle> map, Map<String, o000000> map2, Map<String, String> map3) {
        this.f36575Oooo0o = o000ooo2;
        this.f36574Oooo = map2;
        this.f36578OoooO00 = map3;
        this.f36577Oooo0oo = Collections.unmodifiableMap(map);
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        o000ooo2.OooO0o0(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        this.f36576Oooo0oO = jArr;
    }

    @Override // p324o0O0oo0O.o0000O00
    public final int OooO00o(long j) {
        int iOooO0O0 = o000OOo0.OooO0O0(this.f36576Oooo0oO, j, false);
        if (iOooO0O0 < this.f36576Oooo0oO.length) {
            return iOooO0O0;
        }
        return -1;
    }

    @Override // p324o0O0oo0O.o0000O00
    public final long OooO0O0(int i) {
        return this.f36576Oooo0oO[i];
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p324o0O0oo0O.o0000O00
    public final List<Cue> OooO0Oo(long j) {
        o000OOo o000ooo2 = this.f36575Oooo0o;
        Map<String, TtmlStyle> map = this.f36577Oooo0oo;
        Map<String, o000000> map2 = this.f36574Oooo;
        Map<String, String> map3 = this.f36578OoooO00;
        Objects.requireNonNull(o000ooo2);
        ArrayList<Pair> arrayList = new ArrayList();
        o000ooo2.OooO0oo(j, o000ooo2.f36597OooO0oo, arrayList);
        TreeMap treeMap = new TreeMap();
        o000ooo2.OooOO0(j, false, o000ooo2.f36597OooO0oo, treeMap);
        o000ooo2.OooO(j, map, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                o000000 o000000Var = map2.get(pair.first);
                Objects.requireNonNull(o000000Var);
                arrayList2.add(new Cue(null, null, bitmapDecodeByteArray, o000000Var.f36582OooO0OO, 0, o000000Var.f36585OooO0o0, o000000Var.f36581OooO0O0, 0, Integer.MIN_VALUE, -3.4028235E38f, o000000Var.f36584OooO0o, o000000Var.f36586OooO0oO, false, -16777216, o000000Var.f36588OooOO0));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            o000000 o000000Var2 = map2.get(entry.getKey());
            Objects.requireNonNull(o000000Var2);
            Cue.OooO00o oooO00o = (Cue.OooO00o) entry.getValue();
            CharSequence charSequence = oooO00o.f14634OooO00o;
            Objects.requireNonNull(charSequence);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (oo0o0Oo oo0o0oo : (oo0o0Oo[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), oo0o0Oo.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(oo0o0oo), spannableStringBuilder.getSpanEnd(oo0o0oo), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f = o000000Var2.f36582OooO0OO;
            int i9 = o000000Var2.f36583OooO0Oo;
            oooO00o.f14637OooO0Oo = f;
            oooO00o.f14639OooO0o0 = i9;
            oooO00o.f14638OooO0o = o000000Var2.f36585OooO0o0;
            oooO00o.f14640OooO0oO = o000000Var2.f36581OooO0O0;
            oooO00o.f14643OooOO0O = o000000Var2.f36584OooO0o;
            float f2 = o000000Var2.f36579OooO;
            int i10 = o000000Var2.f36587OooO0oo;
            oooO00o.f14642OooOO0 = f2;
            oooO00o.f14633OooO = i10;
            oooO00o.f14647OooOOOO = o000000Var2.f36588OooOO0;
            arrayList2.add(oooO00o.OooO00o());
        }
        return arrayList2;
    }

    @Override // p324o0O0oo0O.o0000O00
    public final int OooO0o0() {
        return this.f36576Oooo0oO.length;
    }
}
