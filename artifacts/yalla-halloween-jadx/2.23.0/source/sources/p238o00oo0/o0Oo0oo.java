package p238o00oo0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.ttml.TtmlStyle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p230o00oOoO0.o000;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o0Oo0oo implements o000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00oO0o f40327OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Map<String, TtmlStyle> f40328OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long[] f40329OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Map<String, o0ooOOo> f40330OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final Map<String, String> f40331OooO0oo;

    public o0Oo0oo(o00oO0o o00oo0o2, HashMap map, HashMap map2, HashMap map3) {
        this.f40327OooO0Oo = o00oo0o2;
        this.f40330OooO0oO = map2;
        this.f40331OooO0oo = map3;
        this.f40328OooO0o = Collections.unmodifiableMap(map);
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        o00oo0o2.OooO0Oo(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        this.f40329OooO0o0 = jArr;
    }

    @Override // p230o00oOoO0.o000
    public final int OooO00o(long j) {
        long[] jArr = this.f40329OooO0o0;
        int iOooO0O0 = o0O00.OooO0O0(jArr, j, false);
        if (iOooO0O0 < jArr.length) {
            return iOooO0O0;
        }
        return -1;
    }

    @Override // p230o00oOoO0.o000
    public final List<Cue> OooO0O0(long j) {
        Map<String, TtmlStyle> map = this.f40328OooO0o;
        Map<String, o0ooOOo> map2 = this.f40330OooO0oO;
        o00oO0o o00oo0o2 = this.f40327OooO0Oo;
        o00oo0o2.getClass();
        ArrayList<Pair> arrayList = new ArrayList();
        o00oo0o2.OooO0oO(j, o00oo0o2.f40322OooO0oo, arrayList);
        TreeMap treeMap = new TreeMap();
        o00oo0o2.OooO(j, false, o00oo0o2.f40322OooO0oo, treeMap);
        o00oo0o2.OooO0oo(j, map, map2, o00oo0o2.f40322OooO0oo, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            String str = this.f40331OooO0oo.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                o0ooOOo o0ooooo = map2.get(pair.first);
                o0ooooo.getClass();
                Cue.OooO00o oooO00o = new Cue.OooO00o();
                oooO00o.f13420OooO0O0 = bitmapDecodeByteArray;
                oooO00o.f13426OooO0oo = o0ooooo.f40334OooO0O0;
                oooO00o.f13418OooO = 0;
                oooO00o.f13424OooO0o0 = o0ooooo.f40335OooO0OO;
                oooO00o.f13423OooO0o = 0;
                oooO00o.f13425OooO0oO = o0ooooo.f40338OooO0o0;
                oooO00o.f13429OooOO0o = o0ooooo.f40337OooO0o;
                oooO00o.f13431OooOOO0 = o0ooooo.f40339OooO0oO;
                oooO00o.f13433OooOOOo = o0ooooo.f40341OooOO0;
                arrayList2.add(oooO00o.OooO00o());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            o0ooOOo o0ooooo2 = map2.get(entry.getKey());
            o0ooooo2.getClass();
            Cue.OooO00o oooO00o2 = (Cue.OooO00o) entry.getValue();
            CharSequence charSequence = oooO00o2.f13419OooO00o;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (o00Ooo o00ooo2 : (o00Ooo[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), o00Ooo.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(o00ooo2), spannableStringBuilder.getSpanEnd(o00ooo2), (CharSequence) "");
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
            oooO00o2.f13424OooO0o0 = o0ooooo2.f40335OooO0OO;
            oooO00o2.f13423OooO0o = o0ooooo2.f40336OooO0Oo;
            oooO00o2.f13425OooO0oO = o0ooooo2.f40338OooO0o0;
            oooO00o2.f13426OooO0oo = o0ooooo2.f40334OooO0O0;
            oooO00o2.f13429OooOO0o = o0ooooo2.f40337OooO0o;
            oooO00o2.f13428OooOO0O = o0ooooo2.f40332OooO;
            oooO00o2.f13427OooOO0 = o0ooooo2.f40340OooO0oo;
            oooO00o2.f13433OooOOOo = o0ooooo2.f40341OooOO0;
            arrayList2.add(oooO00o2.OooO00o());
        }
        return arrayList2;
    }

    @Override // p230o00oOoO0.o000
    public final long OooO0OO(int i) {
        return this.f40329OooO0o0[i];
    }

    @Override // p230o00oOoO0.o000
    public final int OooO0Oo() {
        return this.f40329OooO0o0.length;
    }
}
