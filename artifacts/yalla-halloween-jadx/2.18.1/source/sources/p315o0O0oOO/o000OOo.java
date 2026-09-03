package p315o0O0oOO;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.span.RubySpan;
import com.google.android.exoplayer2.text.ttml.TtmlStyle;
import com.umeng.analytics.pro.ak;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import p314o0O0oO0o.o00000O;
import p314o0O0oO0o.o00000O0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final String f36589OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final String f36590OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f36591OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f36592OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f36593OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final TtmlStyle f36594OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f36595OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public final String[] f36596OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f36597OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final o000OOo f36598OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final HashMap<String, Integer> f36599OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final HashMap<String, Integer> f36600OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public List<o000OOo> f36601OooOOO0;

    public o000OOo(@Nullable String str, @Nullable String str2, long j, long j2, @Nullable TtmlStyle ttmlStyle, @Nullable String[] strArr, String str3, @Nullable String str4, @Nullable o000OOo o000ooo2) {
        this.f36590OooO00o = str;
        this.f36591OooO0O0 = str2;
        this.f36589OooO = str4;
        this.f36594OooO0o = ttmlStyle;
        this.f36596OooO0oO = strArr;
        this.f36592OooO0OO = str2 != null;
        this.f36593OooO0Oo = j;
        this.f36595OooO0o0 = j2;
        Objects.requireNonNull(str3);
        this.f36597OooO0oo = str3;
        this.f36598OooOO0 = o000ooo2;
        this.f36599OooOO0O = new HashMap<>();
        this.f36600OooOO0o = new HashMap<>();
    }

    public static o000OOo OooO0O0(String str) {
        return new o000OOo(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", ZegoConstants.ZegoVideoDataAuxPublishingStream).replaceAll("[ \t\\x0B\f\r]+", ZegoConstants.ZegoVideoDataAuxPublishingStream), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder OooO0o(String str, Map<String, Cue.OooO00o> map) {
        if (!map.containsKey(str)) {
            Cue.OooO00o oooO00o = new Cue.OooO00o();
            oooO00o.f14634OooO00o = new SpannableStringBuilder();
            map.put(str, oooO00o);
        }
        CharSequence charSequence = map.get(str).f14634OooO00o;
        Objects.requireNonNull(charSequence);
        return (SpannableStringBuilder) charSequence;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0197  */
    /* JADX WARN: Code duplicated, block: B:101:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:102:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:91:0x0182  */
    /* JADX WARN: Code duplicated, block: B:93:0x0185  */
    /* JADX WARN: Code duplicated, block: B:96:0x0191  */
    /* JADX WARN: Code duplicated, block: B:98:0x0194 A[DONT_INVERT] */
    public final void OooO(long j, Map<String, TtmlStyle> map, Map<String, Cue.OooO00o> map2) {
        o000OOo o000ooo2;
        boolean z;
        int i;
        if (OooO0oO(j)) {
            for (Map.Entry<String, Integer> entry : this.f36600OooOO0o.entrySet()) {
                String key = entry.getKey();
                int iIntValue = this.f36599OooOO0O.containsKey(key) ? this.f36599OooOO0O.get(key).intValue() : 0;
                int iIntValue2 = entry.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    Cue.OooO00o oooO00o = map2.get(key);
                    Objects.requireNonNull(oooO00o);
                    TtmlStyle ttmlStyleOooO00o = o000000O.OooO00o(this.f36594OooO0o, this.f36596OooO0oO, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) oooO00o.f14634OooO00o;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        oooO00o.f14634OooO00o = spannableStringBuilder;
                    }
                    if (ttmlStyleOooO00o != null) {
                        o000OOo o000ooo3 = this.f36598OooOO0;
                        if (ttmlStyleOooO00o.OooO0O0() != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(ttmlStyleOooO00o.OooO0O0()), iIntValue, iIntValue2, 33);
                        }
                        if (ttmlStyleOooO00o.f14668OooO0o == 1) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (ttmlStyleOooO00o.f14670OooO0oO == 1) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, 33);
                        }
                        if (ttmlStyleOooO00o.f14666OooO0OO) {
                            if (!ttmlStyleOooO00o.f14666OooO0OO) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            o00000O.OooO00o(spannableStringBuilder, new ForegroundColorSpan(ttmlStyleOooO00o.f14665OooO0O0), iIntValue, iIntValue2);
                        }
                        if (ttmlStyleOooO00o.f14669OooO0o0) {
                            if (!ttmlStyleOooO00o.f14669OooO0o0) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            o00000O.OooO00o(spannableStringBuilder, new BackgroundColorSpan(ttmlStyleOooO00o.f14667OooO0Oo), iIntValue, iIntValue2);
                        }
                        if (ttmlStyleOooO00o.f14664OooO00o != null) {
                            o00000O.OooO00o(spannableStringBuilder, new TypefaceSpan(ttmlStyleOooO00o.f14664OooO00o), iIntValue, iIntValue2);
                        }
                        int i2 = ttmlStyleOooO00o.f14676OooOOO0;
                        if (i2 == 2) {
                            while (true) {
                                if (o000ooo3 == null) {
                                    o000ooo3 = null;
                                    break;
                                }
                                TtmlStyle ttmlStyleOooO00o2 = o000000O.OooO00o(o000ooo3.f36594OooO0o, o000ooo3.f36596OooO0oO, map);
                                if (ttmlStyleOooO00o2 != null && ttmlStyleOooO00o2.f14676OooOOO0 == 1) {
                                    break;
                                } else {
                                    o000ooo3 = o000ooo3.f36598OooOO0;
                                }
                            }
                            if (o000ooo3 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(o000ooo3);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        o000ooo2 = null;
                                        break;
                                    }
                                    o000OOo o000ooo4 = (o000OOo) arrayDeque.pop();
                                    TtmlStyle ttmlStyleOooO00o3 = o000000O.OooO00o(o000ooo4.f36594OooO0o, o000ooo4.f36596OooO0oO, map);
                                    if (ttmlStyleOooO00o3 != null && ttmlStyleOooO00o3.f14676OooOOO0 == 3) {
                                        o000ooo2 = o000ooo4;
                                        break;
                                    }
                                    for (int iOooO0Oo = o000ooo4.OooO0Oo() - 1; iOooO0Oo >= 0; iOooO0Oo--) {
                                        arrayDeque.push(o000ooo4.OooO0OO(iOooO0Oo));
                                    }
                                }
                                if (o000ooo2 != null) {
                                    if (o000ooo2.OooO0Oo() == 1) {
                                        z = false;
                                        if (o000ooo2.OooO0OO(0).f36591OooO0O0 != null) {
                                            String str = o000ooo2.OooO0OO(0).f36591OooO0O0;
                                            int i3 = o000OOo0.f36740OooO00o;
                                            spannableStringBuilder.setSpan(new RubySpan(), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        z = false;
                                    }
                                    Log.i("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                            }
                            if (ttmlStyleOooO00o.f14678OooOOOo == 1) {
                                z = true;
                            }
                            if (z) {
                                o00000O.OooO00o(spannableStringBuilder, new o00000O0(), iIntValue, iIntValue2);
                            }
                            i = ttmlStyleOooO00o.f14672OooOO0;
                            if (i != 1) {
                                o00000O.OooO00o(spannableStringBuilder, new AbsoluteSizeSpan((int) ttmlStyleOooO00o.f14673OooOO0O, true), iIntValue, iIntValue2);
                            } else if (i != 2) {
                                o00000O.OooO00o(spannableStringBuilder, new RelativeSizeSpan(ttmlStyleOooO00o.f14673OooOO0O), iIntValue, iIntValue2);
                            } else if (i == 3) {
                                o00000O.OooO00o(spannableStringBuilder, new RelativeSizeSpan(ttmlStyleOooO00o.f14673OooOO0O / 100.0f), iIntValue, iIntValue2);
                            }
                            oooO00o.f14636OooO0OO = ttmlStyleOooO00o.f14677OooOOOO;
                        } else if (i2 == 3 || i2 == 4) {
                            spannableStringBuilder.setSpan(new oo0o0Oo(), iIntValue, iIntValue2, 33);
                        }
                        z = false;
                        if (ttmlStyleOooO00o.f14678OooOOOo == 1) {
                            z = true;
                        }
                        if (z) {
                            o00000O.OooO00o(spannableStringBuilder, new o00000O0(), iIntValue, iIntValue2);
                        }
                        i = ttmlStyleOooO00o.f14672OooOO0;
                        if (i != 1) {
                            o00000O.OooO00o(spannableStringBuilder, new AbsoluteSizeSpan((int) ttmlStyleOooO00o.f14673OooOO0O, true), iIntValue, iIntValue2);
                        } else if (i != 2) {
                            o00000O.OooO00o(spannableStringBuilder, new RelativeSizeSpan(ttmlStyleOooO00o.f14673OooOO0O), iIntValue, iIntValue2);
                        } else if (i == 3) {
                            o00000O.OooO00o(spannableStringBuilder, new RelativeSizeSpan(ttmlStyleOooO00o.f14673OooOO0O / 100.0f), iIntValue, iIntValue2);
                        }
                        oooO00o.f14636OooO0OO = ttmlStyleOooO00o.f14677OooOOOO;
                    } else {
                        continue;
                    }
                }
            }
            for (int i4 = 0; i4 < OooO0Oo(); i4++) {
                OooO0OO(i4).OooO(j, map, map2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<o0O0oOO.o000OOo>] */
    public final void OooO00o(o000OOo o000ooo2) {
        if (this.f36601OooOOO0 == null) {
            this.f36601OooOOO0 = new ArrayList();
        }
        this.f36601OooOOO0.add(o000ooo2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o0O0oOO.o000OOo>] */
    public final o000OOo OooO0OO(int i) {
        ?? r0 = this.f36601OooOOO0;
        if (r0 != 0) {
            return (o000OOo) r0.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<o0O0oOO.o000OOo>] */
    public final int OooO0Oo() {
        ?? r0 = this.f36601OooOOO0;
        if (r0 == 0) {
            return 0;
        }
        return r0.size();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<o0O0oOO.o000OOo>] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList, java.util.List<o0O0oOO.o000OOo>] */
    public final void OooO0o0(TreeSet<Long> treeSet, boolean z) {
        boolean zEquals = ak.ax.equals(this.f36590OooO00o);
        boolean zEquals2 = "div".equals(this.f36590OooO00o);
        if (z || zEquals || (zEquals2 && this.f36589OooO != null)) {
            long j = this.f36593OooO0Oo;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f36595OooO0o0;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.f36601OooOOO0 == null) {
            return;
        }
        for (int i = 0; i < this.f36601OooOOO0.size(); i++) {
            ((o000OOo) this.f36601OooOOO0.get(i)).OooO0o0(treeSet, z || zEquals);
        }
    }

    public final boolean OooO0oO(long j) {
        long j2 = this.f36593OooO0Oo;
        return (j2 == -9223372036854775807L && this.f36595OooO0o0 == -9223372036854775807L) || (j2 <= j && this.f36595OooO0o0 == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < this.f36595OooO0o0) || (j2 <= j && j < this.f36595OooO0o0));
    }

    public final void OooO0oo(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.f36597OooO0oo)) {
            str = this.f36597OooO0oo;
        }
        if (OooO0oO(j) && "div".equals(this.f36590OooO00o) && this.f36589OooO != null) {
            list.add(new Pair<>(str, this.f36589OooO));
            return;
        }
        for (int i = 0; i < OooO0Oo(); i++) {
            OooO0OO(i).OooO0oo(j, str, list);
        }
    }

    public final void OooOO0(long j, boolean z, String str, Map<String, Cue.OooO00o> map) {
        this.f36599OooOO0O.clear();
        this.f36600OooOO0o.clear();
        if ("metadata".equals(this.f36590OooO00o)) {
            return;
        }
        if (!"".equals(this.f36597OooO0oo)) {
            str = this.f36597OooO0oo;
        }
        if (this.f36592OooO0OO && z) {
            SpannableStringBuilder spannableStringBuilderOooO0o = OooO0o(str, map);
            String str2 = this.f36591OooO0O0;
            Objects.requireNonNull(str2);
            spannableStringBuilderOooO0o.append((CharSequence) str2);
            return;
        }
        if ("br".equals(this.f36590OooO00o) && z) {
            OooO0o(str, map).append('\n');
            return;
        }
        if (OooO0oO(j)) {
            for (Map.Entry<String, Cue.OooO00o> entry : map.entrySet()) {
                HashMap<String, Integer> map2 = this.f36599OooOO0O;
                String key = entry.getKey();
                CharSequence charSequence = entry.getValue().f14634OooO00o;
                Objects.requireNonNull(charSequence);
                map2.put(key, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = ak.ax.equals(this.f36590OooO00o);
            for (int i = 0; i < OooO0Oo(); i++) {
                OooO0OO(i).OooOO0(j, z || zEquals, str, map);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderOooO0o2 = OooO0o(str, map);
                int length = spannableStringBuilderOooO0o2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (spannableStringBuilderOooO0o2.charAt(length) == ' ');
                if (length >= 0 && spannableStringBuilderOooO0o2.charAt(length) != '\n') {
                    spannableStringBuilderOooO0o2.append('\n');
                }
            }
            for (Map.Entry<String, Cue.OooO00o> entry2 : map.entrySet()) {
                HashMap<String, Integer> map3 = this.f36600OooOO0o;
                String key2 = entry2.getKey();
                CharSequence charSequence2 = entry2.getValue().f14634OooO00o;
                Objects.requireNonNull(charSequence2);
                map3.put(key2, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
