package p238o00oo0;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.span.TextEmphasisSpan;
import com.google.android.exoplayer2.text.ttml.TextEmphasis;
import com.google.android.exoplayer2.text.ttml.TtmlStyle;
import com.google.android.exoplayer2.util.Log;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import p234o00oOoo0.o000O;
import p234o00oOoo0.o000OO00;
import p234o00oOoo0.o000OO0O;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final String f40314OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final String f40315OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f40316OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f40317OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f40318OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final TtmlStyle f40319OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f40320OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final String[] f40321OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f40322OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final o00oO0o f40323OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final HashMap<String, Integer> f40324OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final HashMap<String, Integer> f40325OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public ArrayList f40326OooOOO0;

    public o00oO0o(@Nullable String str, @Nullable String str2, long j, long j2, @Nullable TtmlStyle ttmlStyle, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable o00oO0o o00oo0o2) {
        this.f40315OooO00o = str;
        this.f40316OooO0O0 = str2;
        this.f40314OooO = str4;
        this.f40319OooO0o = ttmlStyle;
        this.f40321OooO0oO = strArr;
        this.f40317OooO0OO = str2 != null;
        this.f40318OooO0Oo = j;
        this.f40320OooO0o0 = j2;
        str3.getClass();
        this.f40322OooO0oo = str3;
        this.f40323OooOO0 = o00oo0o2;
        this.f40324OooOO0O = new HashMap<>();
        this.f40325OooOO0o = new HashMap<>();
    }

    public static o00oO0o OooO00o(String str) {
        return new o00oO0o(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", ZegoConstants.ZegoVideoDataAuxPublishingStream).replaceAll("[ \t\\x0B\f\r]+", ZegoConstants.ZegoVideoDataAuxPublishingStream), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder OooO0o0(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            Cue.OooO00o oooO00o = new Cue.OooO00o();
            oooO00o.f13419OooO00o = new SpannableStringBuilder();
            treeMap.put(str, oooO00o);
        }
        CharSequence charSequence = ((Cue.OooO00o) treeMap.get(str)).f13419OooO00o;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final void OooO(long j, boolean z, String str, TreeMap treeMap) {
        HashMap<String, Integer> map = this.f40324OooOO0O;
        map.clear();
        HashMap<String, Integer> map2 = this.f40325OooOO0o;
        map2.clear();
        String str2 = this.f40315OooO00o;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f40322OooO0oo;
        String str4 = "".equals(str3) ? str : str3;
        if (this.f40317OooO0OO && z) {
            SpannableStringBuilder spannableStringBuilderOooO0o0 = OooO0o0(str4, treeMap);
            String str5 = this.f40316OooO0O0;
            str5.getClass();
            spannableStringBuilderOooO0o0.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str2) && z) {
            OooO0o0(str4, treeMap).append('\n');
            return;
        }
        if (OooO0o(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((Cue.OooO00o) entry.getValue()).f13419OooO00o;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < OooO0OO(); i++) {
                OooO0O0(i).OooO(j, z || zEquals, str4, treeMap);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderOooO0o1 = OooO0o0(str4, treeMap);
                int length = spannableStringBuilderOooO0o1.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderOooO0o1.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderOooO0o1.charAt(length) != '\n') {
                    spannableStringBuilderOooO0o1.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((Cue.OooO00o) entry2.getValue()).f13419OooO00o;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }

    public final o00oO0o OooO0O0(int i) {
        ArrayList arrayList = this.f40326OooOOO0;
        if (arrayList != null) {
            return (o00oO0o) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int OooO0OO() {
        ArrayList arrayList = this.f40326OooOOO0;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void OooO0Oo(TreeSet<Long> treeSet, boolean z) {
        String str = this.f40315OooO00o;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z || zEquals || (zEquals2 && this.f40314OooO != null)) {
            long j = this.f40318OooO0Oo;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f40320OooO0o0;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f40326OooOOO0 == null) {
            return;
        }
        for (int i = 0; i < this.f40326OooOOO0.size(); i++) {
            ((o00oO0o) this.f40326OooOOO0.get(i)).OooO0Oo(treeSet, z || zEquals);
        }
    }

    public final boolean OooO0o(long j) {
        long j2 = this.f40318OooO0Oo;
        long j3 = this.f40320OooO0o0;
        return (j2 == -9223372036854775807L && j3 == -9223372036854775807L) || (j2 <= j && j3 == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < j3) || (j2 <= j && j < j3));
    }

    public final void OooO0oO(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f40322OooO0oo;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (OooO0o(j) && "div".equals(this.f40315OooO00o) && (str2 = this.f40314OooO) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < OooO0OO(); i++) {
            OooO0O0(i).OooO0oO(j, str, arrayList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:148:0x0211  */
    /* JADX WARN: Code duplicated, block: B:149:0x0213  */
    /* JADX WARN: Code duplicated, block: B:151:0x0216  */
    /* JADX WARN: Code duplicated, block: B:154:0x0224  */
    /* JADX WARN: Code duplicated, block: B:156:0x0227  */
    /* JADX WARN: Code duplicated, block: B:159:0x022b  */
    /* JADX WARN: Code duplicated, block: B:160:0x0237  */
    /* JADX WARN: Code duplicated, block: B:161:0x0242  */
    /* JADX WARN: Code duplicated, block: B:166:0x0261  */
    /* JADX WARN: Code duplicated, block: B:169:0x026b  */
    /* JADX WARN: Code duplicated, block: B:184:0x0258 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x0271 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
    public final void OooO0oo(long j, Map map, Map map2, String str, TreeMap treeMap) {
        int i;
        o00oO0o o00oo0o2;
        boolean z;
        int i2;
        int i3;
        TtmlStyle ttmlStyleOooO00o;
        boolean z2;
        int i4;
        float f;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i5;
        int i6;
        int i7;
        if (OooO0o(j)) {
            String str2 = this.f40322OooO0oo;
            String str3 = "".equals(str2) ? str : str2;
            for (Map.Entry<String, Integer> entry : this.f40325OooOO0o.entrySet()) {
                String key = entry.getKey();
                HashMap<String, Integer> map3 = this.f40324OooOO0O;
                int iIntValue = map3.containsKey(key) ? map3.get(key).intValue() : 0;
                int iIntValue2 = entry.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    Cue.OooO00o oooO00o = (Cue.OooO00o) treeMap.get(key);
                    oooO00o.getClass();
                    o0ooOOo o0ooooo = (o0ooOOo) map2.get(str3);
                    o0ooooo.getClass();
                    TtmlStyle ttmlStyleOooO00o2 = o0OOO0o.OooO00o(this.f40319OooO0o, this.f40321OooO0oO, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) oooO00o.f13419OooO00o;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        oooO00o.f13419OooO00o = spannableStringBuilder;
                    }
                    if (ttmlStyleOooO00o2 != null) {
                        int i8 = ttmlStyleOooO00o2.f13485OooO0oo;
                        int i9 = -1;
                        int i10 = 1;
                        if (((i8 == -1 && ttmlStyleOooO00o2.f13477OooO == -1) ? -1 : (i8 == 1 ? (char) 1 : (char) 0) | (ttmlStyleOooO00o2.f13477OooO == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i11 = ttmlStyleOooO00o2.f13485OooO0oo;
                            if (i11 != -1) {
                                if (i11 == i10) {
                                    i6 = i10;
                                } else {
                                    i6 = 0;
                                }
                                if (ttmlStyleOooO00o2.f13477OooO == i10) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                i9 = i7 | i6;
                            } else if (ttmlStyleOooO00o2.f13477OooO != -1) {
                                i10 = 1;
                                if (i11 == i10) {
                                    i6 = i10;
                                } else {
                                    i6 = 0;
                                }
                                if (ttmlStyleOooO00o2.f13477OooO == i10) {
                                    i7 = 2;
                                } else {
                                    i7 = 0;
                                }
                                i9 = i7 | i6;
                            }
                            i = 33;
                            spannableStringBuilder.setSpan(new StyleSpan(i9), iIntValue, iIntValue2, 33);
                        } else {
                            i = 33;
                        }
                        if (ttmlStyleOooO00o2.f13482OooO0o == 1) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i);
                        }
                        if (ttmlStyleOooO00o2.f13484OooO0oO == 1) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i);
                        }
                        if (ttmlStyleOooO00o2.f13480OooO0OO) {
                            if (!ttmlStyleOooO00o2.f13480OooO0OO) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            o000OO00.OooO00o(spannableStringBuilder, new ForegroundColorSpan(ttmlStyleOooO00o2.f13479OooO0O0), iIntValue, iIntValue2);
                        }
                        if (ttmlStyleOooO00o2.f13483OooO0o0) {
                            if (!ttmlStyleOooO00o2.f13483OooO0o0) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            o000OO00.OooO00o(spannableStringBuilder, new BackgroundColorSpan(ttmlStyleOooO00o2.f13481OooO0Oo), iIntValue, iIntValue2);
                        }
                        if (ttmlStyleOooO00o2.f13478OooO00o != null) {
                            o000OO00.OooO00o(spannableStringBuilder, new TypefaceSpan(ttmlStyleOooO00o2.f13478OooO00o), iIntValue, iIntValue2);
                        }
                        TextEmphasis textEmphasis = ttmlStyleOooO00o2.f13493OooOOo;
                        if (textEmphasis != null) {
                            int i12 = textEmphasis.f13474OooO00o;
                            if (i12 == -1) {
                                int i13 = o0ooooo.f40341OooOO0;
                                i12 = (i13 == 2 || i13 == 1) ? 3 : 1;
                                i5 = 1;
                            } else {
                                i5 = textEmphasis.f13475OooO0O0;
                            }
                            int i14 = textEmphasis.f13476OooO0OO;
                            if (i14 == -2) {
                                i14 = 1;
                            }
                            o000OO00.OooO00o(spannableStringBuilder, new TextEmphasisSpan(i12, i5, i14), iIntValue, iIntValue2);
                        }
                        int i15 = ttmlStyleOooO00o2.f13490OooOOO0;
                        if (i15 == 2) {
                            o00oO0o o00oo0o3 = this.f40323OooOO0;
                            while (true) {
                                if (o00oo0o3 == null) {
                                    o00oo0o3 = null;
                                    break;
                                }
                                TtmlStyle ttmlStyleOooO00o3 = o0OOO0o.OooO00o(o00oo0o3.f40319OooO0o, o00oo0o3.f40321OooO0oO, map);
                                if (ttmlStyleOooO00o3 != null && ttmlStyleOooO00o3.f13490OooOOO0 == 1) {
                                    break;
                                } else {
                                    o00oo0o3 = o00oo0o3.f40323OooOO0;
                                }
                            }
                            if (o00oo0o3 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(o00oo0o3);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        o00oo0o2 = null;
                                        break;
                                    }
                                    o00oO0o o00oo0o4 = (o00oO0o) arrayDeque.pop();
                                    TtmlStyle ttmlStyleOooO00o4 = o0OOO0o.OooO00o(o00oo0o4.f40319OooO0o, o00oo0o4.f40321OooO0oO, map);
                                    if (ttmlStyleOooO00o4 != null && ttmlStyleOooO00o4.f13490OooOOO0 == 3) {
                                        o00oo0o2 = o00oo0o4;
                                        break;
                                    }
                                    for (int iOooO0OO = o00oo0o4.OooO0OO() - 1; iOooO0OO >= 0; iOooO0OO--) {
                                        arrayDeque.push(o00oo0o4.OooO0O0(iOooO0OO));
                                    }
                                }
                                if (o00oo0o2 != null) {
                                    if (o00oo0o2.OooO0OO() == 1) {
                                        z = false;
                                        if (o00oo0o2.OooO0O0(0).f40316OooO0O0 != null) {
                                            String str4 = o00oo0o2.OooO0O0(0).f40316OooO0O0;
                                            int i16 = o0O00.f40595OooO00o;
                                            TtmlStyle ttmlStyleOooO00o5 = o0OOO0o.OooO00o(o00oo0o2.f40319OooO0o, o00oo0o2.f40321OooO0oO, map);
                                            if (ttmlStyleOooO00o5 != null) {
                                                i3 = ttmlStyleOooO00o5.f13489OooOOO;
                                                i2 = -1;
                                            } else {
                                                i2 = -1;
                                                i3 = -1;
                                            }
                                            if (i3 == i2 && (ttmlStyleOooO00o = o0OOO0o.OooO00o(o00oo0o3.f40319OooO0o, o00oo0o3.f40321OooO0oO, map)) != null) {
                                                i3 = ttmlStyleOooO00o.f13489OooOOO;
                                            }
                                            spannableStringBuilder.setSpan(new o000O(str4, i3), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        z = false;
                                    }
                                    Log.OooO0o0("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                            }
                            if (ttmlStyleOooO00o2.f13494OooOOo0 == 1) {
                                z2 = true;
                            } else {
                                z2 = z;
                            }
                            if (z2) {
                                o000OO00.OooO00o(spannableStringBuilder, new o000OO0O(), iIntValue, iIntValue2);
                            }
                            i4 = ttmlStyleOooO00o2.f13486OooOO0;
                            if (i4 != 1) {
                                o000OO00.OooO00o(spannableStringBuilder, new AbsoluteSizeSpan((int) ttmlStyleOooO00o2.f13487OooOO0O, true), iIntValue, iIntValue2);
                            } else if (i4 != 2) {
                                o000OO00.OooO00o(spannableStringBuilder, new RelativeSizeSpan(ttmlStyleOooO00o2.f13487OooOO0O), iIntValue, iIntValue2);
                            } else if (i4 == 3) {
                                o000OO00.OooO00o(spannableStringBuilder, new RelativeSizeSpan(ttmlStyleOooO00o2.f13487OooOO0O / 100.0f), iIntValue, iIntValue2);
                            }
                            if ("p".equals(this.f40315OooO00o)) {
                                f = ttmlStyleOooO00o2.f13495OooOOoo;
                                if (f != Float.MAX_VALUE) {
                                    oooO00o.f13434OooOOo0 = (f * (-90.0f)) / 100.0f;
                                }
                                alignment = ttmlStyleOooO00o2.f13491OooOOOO;
                                if (alignment != null) {
                                    oooO00o.f13421OooO0OO = alignment;
                                }
                                alignment2 = ttmlStyleOooO00o2.f13492OooOOOo;
                                if (alignment2 != null) {
                                    oooO00o.f13422OooO0Oo = alignment2;
                                }
                            }
                        } else if (i15 == 3 || i15 == 4) {
                            spannableStringBuilder.setSpan(new o00Ooo(), iIntValue, iIntValue2, 33);
                        }
                        z = false;
                        if (ttmlStyleOooO00o2.f13494OooOOo0 == 1) {
                            z2 = true;
                        } else {
                            z2 = z;
                        }
                        if (z2) {
                            o000OO00.OooO00o(spannableStringBuilder, new o000OO0O(), iIntValue, iIntValue2);
                        }
                        i4 = ttmlStyleOooO00o2.f13486OooOO0;
                        if (i4 != 1) {
                            o000OO00.OooO00o(spannableStringBuilder, new AbsoluteSizeSpan((int) ttmlStyleOooO00o2.f13487OooOO0O, true), iIntValue, iIntValue2);
                        } else if (i4 != 2) {
                            o000OO00.OooO00o(spannableStringBuilder, new RelativeSizeSpan(ttmlStyleOooO00o2.f13487OooOO0O), iIntValue, iIntValue2);
                        } else if (i4 == 3) {
                            o000OO00.OooO00o(spannableStringBuilder, new RelativeSizeSpan(ttmlStyleOooO00o2.f13487OooOO0O / 100.0f), iIntValue, iIntValue2);
                        }
                        if ("p".equals(this.f40315OooO00o)) {
                            f = ttmlStyleOooO00o2.f13495OooOOoo;
                            if (f != Float.MAX_VALUE) {
                                oooO00o.f13434OooOOo0 = (f * (-90.0f)) / 100.0f;
                            }
                            alignment = ttmlStyleOooO00o2.f13491OooOOOO;
                            if (alignment != null) {
                                oooO00o.f13421OooO0OO = alignment;
                            }
                            alignment2 = ttmlStyleOooO00o2.f13492OooOOOo;
                            if (alignment2 != null) {
                                oooO00o.f13422OooO0Oo = alignment2;
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            for (int i17 = 0; i17 < OooO0OO(); i17++) {
                OooO0O0(i17).OooO0oo(j, map, map2, str3, treeMap);
            }
        }
    }
}
