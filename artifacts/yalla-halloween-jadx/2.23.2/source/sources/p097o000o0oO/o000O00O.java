package p097o000o0oO;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.media3.common.text.Cue;
import androidx.media3.extractor.text.ttml.TtmlStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p080o000OoO.o00;
import p092o000o0O0.o0OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00O implements o0OO00O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O0o f35300OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Map<String, TtmlStyle> f35301OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long[] f35302OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Map<String, o000Oo0> f35303OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Map<String, String> f35304OooO0oo;

    public o000O00O(o000O0o o000o0o2, HashMap map, HashMap map2, HashMap map3) {
        this.f35300OooO0Oo = o000o0o2;
        this.f35303OooO0oO = map2;
        this.f35304OooO0oo = map3;
        this.f35301OooO0o = Collections.unmodifiableMap(map);
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        o000o0o2.OooO0Oo(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        this.f35302OooO0o0 = jArr;
    }

    @Override // p092o000o0O0.o0OO00O
    public final int OooO00o(long j) {
        long[] jArr = this.f35302OooO0o0;
        int iOooO0O0 = o00.OooO0O0(jArr, j, false);
        if (iOooO0O0 < jArr.length) {
            return iOooO0O0;
        }
        return -1;
    }

    @Override // p092o000o0O0.o0OO00O
    public final List<Cue> OooO0O0(long j) {
        Map<String, TtmlStyle> map = this.f35301OooO0o;
        Map<String, o000Oo0> map2 = this.f35303OooO0oO;
        o000O0o o000o0o2 = this.f35300OooO0Oo;
        o000o0o2.getClass();
        ArrayList<Pair> arrayList = new ArrayList();
        o000o0o2.OooO0oO(j, o000o0o2.f35313OooO0oo, arrayList);
        TreeMap treeMap = new TreeMap();
        o000o0o2.OooO(j, false, o000o0o2.f35313OooO0oo, treeMap);
        o000o0o2.OooO0oo(j, map, map2, o000o0o2.f35313OooO0oo, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = this.f35304OooO0oo.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                o000Oo0 o000oo1 = map2.get(pair.first);
                o000oo1.getClass();
                Cue.OooO00o oooO00o = new Cue.OooO00o();
                oooO00o.f6916OooO0O0 = bitmapDecodeByteArray;
                oooO00o.f6922OooO0oo = o000oo1.f35320OooO0O0;
                oooO00o.f6914OooO = 0;
                oooO00o.f6920OooO0o0 = o000oo1.f35321OooO0OO;
                oooO00o.f6919OooO0o = 0;
                oooO00o.f6921OooO0oO = o000oo1.f35324OooO0o0;
                oooO00o.f6925OooOO0o = o000oo1.f35323OooO0o;
                oooO00o.f6927OooOOO0 = o000oo1.f35325OooO0oO;
                oooO00o.f6929OooOOOo = o000oo1.f35327OooOO0;
                arrayList2.add(oooO00o.OooO00o());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            o000Oo0 o000oo2 = map2.get(entry.getKey());
            o000oo2.getClass();
            Cue.OooO00o oooO00o2 = (Cue.OooO00o) entry.getValue();
            CharSequence charSequence = oooO00o2.f6915OooO00o;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (o000 o000Var : (o000[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), o000.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(o000Var), spannableStringBuilder.getSpanEnd(o000Var), (CharSequence) "");
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
            oooO00o2.f6920OooO0o0 = o000oo2.f35321OooO0OO;
            oooO00o2.f6919OooO0o = o000oo2.f35322OooO0Oo;
            oooO00o2.f6921OooO0oO = o000oo2.f35324OooO0o0;
            oooO00o2.f6922OooO0oo = o000oo2.f35320OooO0O0;
            oooO00o2.f6925OooOO0o = o000oo2.f35323OooO0o;
            oooO00o2.f6924OooOO0O = o000oo2.f35318OooO;
            oooO00o2.f6923OooOO0 = o000oo2.f35326OooO0oo;
            oooO00o2.f6929OooOOOo = o000oo2.f35327OooOO0;
            arrayList2.add(oooO00o2.OooO00o());
        }
        return arrayList2;
    }

    @Override // p092o000o0O0.o0OO00O
    public final long OooO0OO(int i) {
        return this.f35302OooO0o0[i];
    }

    @Override // p092o000o0O0.o0OO00O
    public final int OooO0Oo() {
        return this.f35302OooO0o0.length;
    }
}
