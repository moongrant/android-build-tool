package p708oo000o;

import Oooo000.OooO0O0;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p145o00Oo0.o000O0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final List<OooOOOO> f53187OooO00o = new ArrayList();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final OooO00o f53188OooO0O0 = new OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 3, null);

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final OooO00o f53189OooO0OO = new OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 3, null);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooO00o f53190OooO0Oo = new OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 3, null);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final OooO00o f53191OooO0o0 = new OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 3, null);

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public float f53192OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public float f53193OooO0O0;

        public OooO00o() {
            this(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 3, null);
        }

        public OooO00o(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this.f53192OooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f53193OooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }

        public final void OooO00o() {
            this.f53192OooO00o = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            this.f53193OooO0O0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return Intrinsics.areEqual((Object) Float.valueOf(this.f53192OooO00o), (Object) Float.valueOf(oooO00o.f53192OooO00o)) && Intrinsics.areEqual((Object) Float.valueOf(this.f53193OooO0O0), (Object) Float.valueOf(oooO00o.f53193OooO0O0));
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.f53193OooO0O0) + (Float.floatToIntBits(this.f53192OooO00o) * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("PathPoint(x=");
            sbOooO0o0.append(this.f53192OooO00o);
            sbOooO0o0.append(", y=");
            return OooO0O0.OooO00o(sbOooO0o0, this.f53193OooO0O0, ')');
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooO00o(char c, float[] args) {
        ArrayList arrayList;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        OooOOOO oooo000;
        OooOOOO oooo001;
        List listListOf;
        List<OooOOOO> list = this.f53187OooO00o;
        Intrinsics.checkNotNullParameter(args, "args");
        if (c == 'z' || c == 'Z') {
            listListOf = CollectionsKt.listOf(OooOOOO.OooO0O0.f53136OooO0OO);
        } else {
            char c4 = 2;
            if (c == 'm') {
                IntProgression intProgressionStep = RangesKt.step(new IntRange(0, args.length - 2), 2);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep, 10));
                Iterator<Integer> it = intProgressionStep.iterator();
                while (it.hasNext()) {
                    int iNextInt = ((IntIterator) it).nextInt();
                    float[] fArrCopyOfRange = ArraysKt.copyOfRange(args, iNextInt, iNextInt + 2);
                    OooOOOO oooo0 = new OooOOOO.Oooo0(fArrCopyOfRange[0], fArrCopyOfRange[1]);
                    if ((oooo0 instanceof OooOOOO.OooOO0) && iNextInt > 0) {
                        oooo0 = new OooOOOO.OooO(fArrCopyOfRange[0], fArrCopyOfRange[1]);
                    } else if (iNextInt > 0) {
                        oooo0 = new OooOOOO.Oooo000(fArrCopyOfRange[0], fArrCopyOfRange[1]);
                    }
                    arrayList.add(oooo0);
                }
            } else if (c == 'M') {
                IntProgression intProgressionStep2 = RangesKt.step(new IntRange(0, args.length - 2), 2);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep2, 10));
                Iterator<Integer> it2 = intProgressionStep2.iterator();
                while (it2.hasNext()) {
                    int iNextInt2 = ((IntIterator) it2).nextInt();
                    float[] fArrCopyOfRange2 = ArraysKt.copyOfRange(args, iNextInt2, iNextInt2 + 2);
                    OooOOOO oooOO1 = new OooOOOO.OooOO0(fArrCopyOfRange2[0], fArrCopyOfRange2[1]);
                    if (iNextInt2 > 0) {
                        oooOO1 = new OooOOOO.OooO(fArrCopyOfRange2[0], fArrCopyOfRange2[1]);
                    } else if ((oooOO1 instanceof OooOOOO.Oooo0) && iNextInt2 > 0) {
                        oooOO1 = new OooOOOO.Oooo000(fArrCopyOfRange2[0], fArrCopyOfRange2[1]);
                    }
                    arrayList.add(oooOO1);
                }
            } else if (c == 'l') {
                IntProgression intProgressionStep3 = RangesKt.step(new IntRange(0, args.length - 2), 2);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep3, 10));
                Iterator<Integer> it3 = intProgressionStep3.iterator();
                while (it3.hasNext()) {
                    int iNextInt3 = ((IntIterator) it3).nextInt();
                    float[] fArrCopyOfRange3 = ArraysKt.copyOfRange(args, iNextInt3, iNextInt3 + 2);
                    OooOOOO oooo002 = new OooOOOO.Oooo000(fArrCopyOfRange3[0], fArrCopyOfRange3[1]);
                    if ((oooo002 instanceof OooOOOO.OooOO0) && iNextInt3 > 0) {
                        oooo002 = new OooOOOO.OooO(fArrCopyOfRange3[0], fArrCopyOfRange3[1]);
                    } else if ((oooo002 instanceof OooOOOO.Oooo0) && iNextInt3 > 0) {
                        oooo002 = new OooOOOO.Oooo000(fArrCopyOfRange3[0], fArrCopyOfRange3[1]);
                    }
                    arrayList.add(oooo002);
                }
            } else if (c == 'L') {
                IntProgression intProgressionStep4 = RangesKt.step(new IntRange(0, args.length - 2), 2);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep4, 10));
                Iterator<Integer> it4 = intProgressionStep4.iterator();
                while (it4.hasNext()) {
                    int iNextInt4 = ((IntIterator) it4).nextInt();
                    float[] fArrCopyOfRange4 = ArraysKt.copyOfRange(args, iNextInt4, iNextInt4 + 2);
                    OooOOOO oooO = new OooOOOO.OooO(fArrCopyOfRange4[0], fArrCopyOfRange4[1]);
                    if ((oooO instanceof OooOOOO.OooOO0) && iNextInt4 > 0) {
                        oooO = new OooOOOO.OooO(fArrCopyOfRange4[0], fArrCopyOfRange4[1]);
                    } else if ((oooO instanceof OooOOOO.Oooo0) && iNextInt4 > 0) {
                        oooO = new OooOOOO.Oooo000(fArrCopyOfRange4[0], fArrCopyOfRange4[1]);
                    }
                    arrayList.add(oooO);
                }
            } else if (c == 'h') {
                IntProgression intProgressionStep5 = RangesKt.step(new IntRange(0, args.length - 1), 1);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep5, 10));
                Iterator<Integer> it5 = intProgressionStep5.iterator();
                while (it5.hasNext()) {
                    int iNextInt5 = ((IntIterator) it5).nextInt();
                    float[] fArrCopyOfRange5 = ArraysKt.copyOfRange(args, iNextInt5, iNextInt5 + 1);
                    OooOOOO oooOo = new OooOOOO.OooOo(fArrCopyOfRange5[0]);
                    if ((oooOo instanceof OooOOOO.OooOO0) && iNextInt5 > 0) {
                        oooOo = new OooOOOO.OooO(fArrCopyOfRange5[0], fArrCopyOfRange5[1]);
                    } else if ((oooOo instanceof OooOOOO.Oooo0) && iNextInt5 > 0) {
                        oooOo = new OooOOOO.Oooo000(fArrCopyOfRange5[0], fArrCopyOfRange5[1]);
                    }
                    arrayList.add(oooOo);
                }
            } else if (c == 'H') {
                IntProgression intProgressionStep6 = RangesKt.step(new IntRange(0, args.length - 1), 1);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep6, 10));
                Iterator<Integer> it6 = intProgressionStep6.iterator();
                while (it6.hasNext()) {
                    int iNextInt6 = ((IntIterator) it6).nextInt();
                    float[] fArrCopyOfRange6 = ArraysKt.copyOfRange(args, iNextInt6, iNextInt6 + 1);
                    OooOOOO oooO0o = new OooOOOO.OooO0o(fArrCopyOfRange6[0]);
                    if ((oooO0o instanceof OooOOOO.OooOO0) && iNextInt6 > 0) {
                        oooO0o = new OooOOOO.OooO(fArrCopyOfRange6[0], fArrCopyOfRange6[1]);
                    } else if ((oooO0o instanceof OooOOOO.Oooo0) && iNextInt6 > 0) {
                        oooO0o = new OooOOOO.Oooo000(fArrCopyOfRange6[0], fArrCopyOfRange6[1]);
                    }
                    arrayList.add(oooO0o);
                }
            } else if (c == 'v') {
                IntProgression intProgressionStep7 = RangesKt.step(new IntRange(0, args.length - 1), 1);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep7, 10));
                Iterator<Integer> it7 = intProgressionStep7.iterator();
                while (it7.hasNext()) {
                    int iNextInt7 = ((IntIterator) it7).nextInt();
                    float[] fArrCopyOfRange7 = ArraysKt.copyOfRange(args, iNextInt7, iNextInt7 + 1);
                    OooOOOO o00oo1 = new OooOOOO.o00Oo0(fArrCopyOfRange7[0]);
                    if ((o00oo1 instanceof OooOOOO.OooOO0) && iNextInt7 > 0) {
                        o00oo1 = new OooOOOO.OooO(fArrCopyOfRange7[0], fArrCopyOfRange7[1]);
                    } else if ((o00oo1 instanceof OooOOOO.Oooo0) && iNextInt7 > 0) {
                        o00oo1 = new OooOOOO.Oooo000(fArrCopyOfRange7[0], fArrCopyOfRange7[1]);
                    }
                    arrayList.add(o00oo1);
                }
            } else if (c == 'V') {
                IntProgression intProgressionStep8 = RangesKt.step(new IntRange(0, args.length - 1), 1);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep8, 10));
                Iterator<Integer> it8 = intProgressionStep8.iterator();
                while (it8.hasNext()) {
                    int iNextInt8 = ((IntIterator) it8).nextInt();
                    float[] fArrCopyOfRange8 = ArraysKt.copyOfRange(args, iNextInt8, iNextInt8 + 1);
                    OooOOOO o00ooo2 = new OooOOOO.o00Ooo(fArrCopyOfRange8[0]);
                    if ((o00ooo2 instanceof OooOOOO.OooOO0) && iNextInt8 > 0) {
                        o00ooo2 = new OooOOOO.OooO(fArrCopyOfRange8[0], fArrCopyOfRange8[1]);
                    } else if ((o00ooo2 instanceof OooOOOO.Oooo0) && iNextInt8 > 0) {
                        o00ooo2 = new OooOOOO.Oooo000(fArrCopyOfRange8[0], fArrCopyOfRange8[1]);
                    }
                    arrayList.add(o00ooo2);
                }
            } else {
                char c5 = 3;
                char c6 = 5;
                if (c == 'c') {
                    IntProgression intProgressionStep9 = RangesKt.step(new IntRange(0, args.length - 6), 6);
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep9, 10));
                    Iterator<Integer> it9 = intProgressionStep9.iterator();
                    while (it9.hasNext()) {
                        int iNextInt9 = ((IntIterator) it9).nextInt();
                        float[] fArrCopyOfRange9 = ArraysKt.copyOfRange(args, iNextInt9, iNextInt9 + 6);
                        OooOOOO oooOo00 = new OooOOOO.OooOo00(fArrCopyOfRange9[0], fArrCopyOfRange9[1], fArrCopyOfRange9[2], fArrCopyOfRange9[3], fArrCopyOfRange9[4], fArrCopyOfRange9[c6]);
                        if (!(oooOo00 instanceof OooOOOO.OooOO0) || iNextInt9 <= 0) {
                            oooo001 = (!(oooOo00 instanceof OooOOOO.Oooo0) || iNextInt9 <= 0) ? oooOo00 : new OooOOOO.Oooo000(fArrCopyOfRange9[0], fArrCopyOfRange9[1]);
                        } else {
                            oooo001 = new OooOOOO.OooO(fArrCopyOfRange9[0], fArrCopyOfRange9[1]);
                        }
                        arrayList.add(oooo001);
                        c6 = 5;
                    }
                } else if (c == 'C') {
                    IntProgression intProgressionStep10 = RangesKt.step(new IntRange(0, args.length - 6), 6);
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep10, 10));
                    Iterator<Integer> it10 = intProgressionStep10.iterator();
                    while (it10.hasNext()) {
                        int iNextInt10 = ((IntIterator) it10).nextInt();
                        float[] fArrCopyOfRange10 = ArraysKt.copyOfRange(args, iNextInt10, iNextInt10 + 6);
                        OooOOOO oooO0OO = new OooOOOO.OooO0OO(fArrCopyOfRange10[0], fArrCopyOfRange10[1], fArrCopyOfRange10[2], fArrCopyOfRange10[c5], fArrCopyOfRange10[4], fArrCopyOfRange10[5]);
                        if (!(oooO0OO instanceof OooOOOO.OooOO0) || iNextInt10 <= 0) {
                            oooo000 = (!(oooO0OO instanceof OooOOOO.Oooo0) || iNextInt10 <= 0) ? oooO0OO : new OooOOOO.Oooo000(fArrCopyOfRange10[0], fArrCopyOfRange10[1]);
                        } else {
                            oooo000 = new OooOOOO.OooO(fArrCopyOfRange10[0], fArrCopyOfRange10[1]);
                        }
                        arrayList.add(oooo000);
                        c5 = 3;
                    }
                } else if (c == 's') {
                    IntProgression intProgressionStep11 = RangesKt.step(new IntRange(0, args.length - 4), 4);
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep11, 10));
                    Iterator<Integer> it11 = intProgressionStep11.iterator();
                    while (it11.hasNext()) {
                        int iNextInt11 = ((IntIterator) it11).nextInt();
                        float[] fArrCopyOfRange11 = ArraysKt.copyOfRange(args, iNextInt11, iNextInt11 + 4);
                        OooOOOO o0oooo1 = new OooOOOO.o0OoOo0(fArrCopyOfRange11[0], fArrCopyOfRange11[1], fArrCopyOfRange11[2], fArrCopyOfRange11[3]);
                        if ((o0oooo1 instanceof OooOOOO.OooOO0) && iNextInt11 > 0) {
                            o0oooo1 = new OooOOOO.OooO(fArrCopyOfRange11[0], fArrCopyOfRange11[1]);
                        } else if ((o0oooo1 instanceof OooOOOO.Oooo0) && iNextInt11 > 0) {
                            o0oooo1 = new OooOOOO.Oooo000(fArrCopyOfRange11[0], fArrCopyOfRange11[1]);
                        }
                        arrayList.add(o0oooo1);
                    }
                } else if (c == 'S') {
                    IntProgression intProgressionStep12 = RangesKt.step(new IntRange(0, args.length - 4), 4);
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep12, 10));
                    Iterator<Integer> it12 = intProgressionStep12.iterator();
                    while (it12.hasNext()) {
                        int iNextInt12 = ((IntIterator) it12).nextInt();
                        float[] fArrCopyOfRange12 = ArraysKt.copyOfRange(args, iNextInt12, iNextInt12 + 4);
                        OooOOOO oooOOO0 = new OooOOOO.OooOOO0(fArrCopyOfRange12[0], fArrCopyOfRange12[1], fArrCopyOfRange12[2], fArrCopyOfRange12[3]);
                        if ((oooOOO0 instanceof OooOOOO.OooOO0) && iNextInt12 > 0) {
                            oooOOO0 = new OooOOOO.OooO(fArrCopyOfRange12[0], fArrCopyOfRange12[1]);
                        } else if ((oooOOO0 instanceof OooOOOO.Oooo0) && iNextInt12 > 0) {
                            oooOOO0 = new OooOOOO.Oooo000(fArrCopyOfRange12[0], fArrCopyOfRange12[1]);
                        }
                        arrayList.add(oooOOO0);
                    }
                } else if (c == 'q') {
                    IntProgression intProgressionStep13 = RangesKt.step(new IntRange(0, args.length - 4), 4);
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep13, 10));
                    Iterator<Integer> it13 = intProgressionStep13.iterator();
                    while (it13.hasNext()) {
                        int iNextInt13 = ((IntIterator) it13).nextInt();
                        float[] fArrCopyOfRange13 = ArraysKt.copyOfRange(args, iNextInt13, iNextInt13 + 4);
                        OooOOOO o000oooo2 = new OooOOOO.o000oOoO(fArrCopyOfRange13[0], fArrCopyOfRange13[1], fArrCopyOfRange13[2], fArrCopyOfRange13[3]);
                        if ((o000oooo2 instanceof OooOOOO.OooOO0) && iNextInt13 > 0) {
                            o000oooo2 = new OooOOOO.OooO(fArrCopyOfRange13[0], fArrCopyOfRange13[1]);
                        } else if ((o000oooo2 instanceof OooOOOO.Oooo0) && iNextInt13 > 0) {
                            o000oooo2 = new OooOOOO.Oooo000(fArrCopyOfRange13[0], fArrCopyOfRange13[1]);
                        }
                        arrayList.add(o000oooo2);
                    }
                } else if (c == 'Q') {
                    IntProgression intProgressionStep14 = RangesKt.step(new IntRange(0, args.length - 4), 4);
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep14, 10));
                    Iterator<Integer> it14 = intProgressionStep14.iterator();
                    while (it14.hasNext()) {
                        int iNextInt14 = ((IntIterator) it14).nextInt();
                        float[] fArrCopyOfRange14 = ArraysKt.copyOfRange(args, iNextInt14, iNextInt14 + 4);
                        OooOOOO oooOO0O = new OooOOOO.OooOO0O(fArrCopyOfRange14[0], fArrCopyOfRange14[1], fArrCopyOfRange14[2], fArrCopyOfRange14[3]);
                        if ((oooOO0O instanceof OooOOOO.OooOO0) && iNextInt14 > 0) {
                            oooOO0O = new OooOOOO.OooO(fArrCopyOfRange14[0], fArrCopyOfRange14[1]);
                        } else if ((oooOO0O instanceof OooOOOO.Oooo0) && iNextInt14 > 0) {
                            oooOO0O = new OooOOOO.Oooo000(fArrCopyOfRange14[0], fArrCopyOfRange14[1]);
                        }
                        arrayList.add(oooOO0O);
                    }
                } else if (c == 't') {
                    IntProgression intProgressionStep15 = RangesKt.step(new IntRange(0, args.length - 2), 2);
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep15, 10));
                    Iterator<Integer> it15 = intProgressionStep15.iterator();
                    while (it15.hasNext()) {
                        int iNextInt15 = ((IntIterator) it15).nextInt();
                        float[] fArrCopyOfRange15 = ArraysKt.copyOfRange(args, iNextInt15, iNextInt15 + 2);
                        OooOOOO o00o0o2 = new OooOOOO.o00O0O(fArrCopyOfRange15[0], fArrCopyOfRange15[1]);
                        if ((o00o0o2 instanceof OooOOOO.OooOO0) && iNextInt15 > 0) {
                            o00o0o2 = new OooOOOO.OooO(fArrCopyOfRange15[0], fArrCopyOfRange15[1]);
                        } else if ((o00o0o2 instanceof OooOOOO.Oooo0) && iNextInt15 > 0) {
                            o00o0o2 = new OooOOOO.Oooo000(fArrCopyOfRange15[0], fArrCopyOfRange15[1]);
                        }
                        arrayList.add(o00o0o2);
                    }
                } else if (c == 'T') {
                    IntProgression intProgressionStep16 = RangesKt.step(new IntRange(0, args.length - 2), 2);
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep16, 10));
                    Iterator<Integer> it16 = intProgressionStep16.iterator();
                    while (it16.hasNext()) {
                        int iNextInt16 = ((IntIterator) it16).nextInt();
                        float[] fArrCopyOfRange16 = ArraysKt.copyOfRange(args, iNextInt16, iNextInt16 + 2);
                        OooOOOO oooOOO = new OooOOOO.OooOOO(fArrCopyOfRange16[0], fArrCopyOfRange16[1]);
                        if ((oooOOO instanceof OooOOOO.OooOO0) && iNextInt16 > 0) {
                            oooOOO = new OooOOOO.OooO(fArrCopyOfRange16[0], fArrCopyOfRange16[1]);
                        } else if ((oooOOO instanceof OooOOOO.Oooo0) && iNextInt16 > 0) {
                            oooOOO = new OooOOOO.Oooo000(fArrCopyOfRange16[0], fArrCopyOfRange16[1]);
                        }
                        arrayList.add(oooOOO);
                    }
                } else if (c == 'a') {
                    IntProgression intProgressionStep17 = RangesKt.step(new IntRange(0, args.length - 7), 7);
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep17, 10));
                    Iterator<Integer> it17 = intProgressionStep17.iterator();
                    while (it17.hasNext()) {
                        int iNextInt17 = ((IntIterator) it17).nextInt();
                        float[] fArrCopyOfRange17 = ArraysKt.copyOfRange(args, iNextInt17, iNextInt17 + 7);
                        float f = fArrCopyOfRange17[0];
                        float f2 = fArrCopyOfRange17[1];
                        float f3 = fArrCopyOfRange17[2];
                        boolean z3 = Float.compare(fArrCopyOfRange17[3], ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) != 0;
                        if (Float.compare(fArrCopyOfRange17[4], ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) != 0) {
                            c3 = 5;
                            z2 = true;
                        } else {
                            c3 = 5;
                            z2 = false;
                        }
                        OooOOOO c0437OooOOOO = new OooOOOO.C0437OooOOOO(f, f2, f3, z3, z2, fArrCopyOfRange17[c3], fArrCopyOfRange17[6]);
                        if ((c0437OooOOOO instanceof OooOOOO.OooOO0) && iNextInt17 > 0) {
                            c0437OooOOOO = new OooOOOO.OooO(fArrCopyOfRange17[0], fArrCopyOfRange17[1]);
                        } else if ((c0437OooOOOO instanceof OooOOOO.Oooo0) && iNextInt17 > 0) {
                            c0437OooOOOO = new OooOOOO.Oooo000(fArrCopyOfRange17[0], fArrCopyOfRange17[1]);
                        }
                        arrayList.add(c0437OooOOOO);
                    }
                } else {
                    if (c != 'A') {
                        throw new IllegalArgumentException("Unknown command for: " + c);
                    }
                    IntProgression intProgressionStep18 = RangesKt.step(new IntRange(0, args.length - 7), 7);
                    arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep18, 10));
                    Iterator<Integer> it18 = intProgressionStep18.iterator();
                    while (it18.hasNext()) {
                        int iNextInt18 = ((IntIterator) it18).nextInt();
                        float[] fArrCopyOfRange18 = ArraysKt.copyOfRange(args, iNextInt18, iNextInt18 + 7);
                        float f4 = fArrCopyOfRange18[0];
                        float f5 = fArrCopyOfRange18[1];
                        float f6 = fArrCopyOfRange18[c4];
                        boolean z4 = Float.compare(fArrCopyOfRange18[3], ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) != 0;
                        if (Float.compare(fArrCopyOfRange18[4], ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) != 0) {
                            c2 = 5;
                            z = true;
                        } else {
                            c2 = 5;
                            z = false;
                        }
                        OooOOOO oooO00o = new OooOOOO.OooO00o(f4, f5, f6, z4, z, fArrCopyOfRange18[c2], fArrCopyOfRange18[6]);
                        if ((oooO00o instanceof OooOOOO.OooOO0) && iNextInt18 > 0) {
                            oooO00o = new OooOOOO.OooO(fArrCopyOfRange18[0], fArrCopyOfRange18[1]);
                        } else if ((oooO00o instanceof OooOOOO.Oooo0) && iNextInt18 > 0) {
                            oooO00o = new OooOOOO.Oooo000(fArrCopyOfRange18[0], fArrCopyOfRange18[1]);
                        }
                        arrayList.add(oooO00o);
                        c4 = 2;
                    }
                }
            }
            listListOf = arrayList;
        }
        list.addAll(listListOf);
    }

    public final void OooO0O0(o000O0o o000o0o2, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d11);
        double dSin = Math.sin(d11);
        double d12 = ((d2 * dSin) + (d * dCos)) / d10;
        double d13 = ((d2 * dCos) + ((-d) * dSin)) / d6;
        double d14 = ((d4 * dSin) + (d3 * dCos)) / d10;
        double d15 = ((d4 * dCos) + ((-d3) * dSin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = 2;
        double d19 = (d12 + d14) / d18;
        double d20 = (d13 + d15) / d18;
        double d21 = (d17 * d17) + (d16 * d16);
        if (d21 == 0.0d) {
            return;
        }
        double d22 = (1.0d / d21) - 0.25d;
        if (d22 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d21) / 1.99999d);
            OooO0O0(o000o0o2, d, d2, d3, d4, d10 * dSqrt, d6 * dSqrt, d7, z, z2);
            return;
        }
        double dSqrt2 = Math.sqrt(d22);
        double d23 = d16 * dSqrt2;
        double d24 = dSqrt2 * d17;
        if (z == z2) {
            d8 = d19 - d24;
            d9 = d20 + d23;
        } else {
            d8 = d19 + d24;
            d9 = d20 - d23;
        }
        double dAtan2 = Math.atan2(d13 - d9, d12 - d8);
        double dAtan3 = Math.atan2(d15 - d9, d14 - d8) - dAtan2;
        if (z2 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d25 = d8 * d10;
        double d26 = d9 * d6;
        double d27 = (d25 * dCos) - (d26 * dSin);
        double d28 = (d26 * dCos) + (d25 * dSin);
        double d29 = 4;
        int iCeil = (int) Math.ceil(Math.abs((dAtan3 * d29) / 3.141592653589793d));
        double dCos2 = Math.cos(d11);
        double dSin2 = Math.sin(d11);
        double dCos3 = Math.cos(dAtan2);
        double dSin3 = Math.sin(dAtan2);
        double d30 = d27;
        double d31 = -d10;
        double d32 = d31 * dCos2;
        double d33 = d6 * dSin2;
        double d34 = (d32 * dSin3) - (d33 * dCos3);
        double d35 = d31 * dSin2;
        double d36 = d6 * dCos2;
        double d37 = d28;
        double d38 = dAtan3 / ((double) iCeil);
        double d39 = d2;
        double d40 = (dCos3 * d36) + (dSin3 * d35);
        int i = 0;
        double d41 = dAtan2;
        double d42 = d;
        while (i < iCeil) {
            double d43 = d41 + d38;
            double dSin4 = Math.sin(d43);
            double dCos4 = Math.cos(d43);
            double d44 = d30;
            double d45 = d38;
            double d46 = (((d10 * dCos2) * dCos4) + d44) - (d33 * dSin4);
            double d47 = d37;
            double d48 = (d36 * dSin4) + (d10 * dSin2 * dCos4) + d47;
            double d49 = (d32 * dSin4) - (d33 * dCos4);
            double d50 = (dCos4 * d36) + (dSin4 * d35);
            double d51 = d43 - d41;
            double dTan = Math.tan(d51 / d18);
            double dSqrt3 = ((Math.sqrt(((3.0d * dTan) * dTan) + d29) - ((double) 1)) * Math.sin(d51)) / ((double) 3);
            o000o0o2.OooOO0O((float) ((d34 * dSqrt3) + d42), (float) ((d40 * dSqrt3) + d39), (float) (d46 - (dSqrt3 * d49)), (float) (d48 - (dSqrt3 * d50)), (float) d46, (float) d48);
            i++;
            d35 = d35;
            d39 = d48;
            d42 = d46;
            d41 = d43;
            d40 = d50;
            d34 = d49;
            d37 = d47;
            d29 = d29;
            d38 = d45;
            d10 = d5;
            d30 = d44;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.util.ArrayList, java.util.List<oo000o.OooOOOO>] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    @NotNull
    public final o000O0o OooO0OO(@NotNull o000O0o o000o0o2) {
        int i;
        ?? r24;
        int i2;
        OooOOOO oooOOOO;
        OooOo00 oooOo00;
        OooOo00 oooOo01 = this;
        o000O0o target = o000o0o2;
        Intrinsics.checkNotNullParameter(target, "target");
        o000o0o2.OooO00o();
        oooOo01.f53188OooO0O0.OooO00o();
        oooOo01.f53189OooO0OO.OooO00o();
        oooOo01.f53190OooO0Oo.OooO00o();
        oooOo01.f53191OooO0o0.OooO00o();
        ?? r14 = oooOo01.f53187OooO00o;
        int size = r14.size();
        OooOOOO oooOOOO2 = null;
        OooOo00 oooOo02 = oooOo01;
        int i3 = 0;
        ?? r15 = r14;
        while (i3 < size) {
            OooOOOO oooOOOO3 = (OooOOOO) r15.get(i3);
            if (oooOOOO2 == null) {
                oooOOOO2 = oooOOOO3;
            }
            if (oooOOOO3 instanceof OooOOOO.OooO0O0) {
                OooO00o oooO00o = oooOo02.f53188OooO0O0;
                OooO00o oooO00o2 = oooOo02.f53190OooO0Oo;
                oooO00o.f53192OooO00o = oooO00o2.f53192OooO00o;
                oooO00o.f53193OooO0O0 = oooO00o2.f53193OooO0O0;
                OooO00o oooO00o3 = oooOo02.f53189OooO0OO;
                oooO00o3.f53192OooO00o = oooO00o2.f53192OooO00o;
                oooO00o3.f53193OooO0O0 = oooO00o2.f53193OooO0O0;
                o000o0o2.close();
                OooO00o oooO00o4 = oooOo02.f53188OooO0O0;
                target.OooOO0(oooO00o4.f53192OooO00o, oooO00o4.f53193OooO0O0);
            } else if (oooOOOO3 instanceof OooOOOO.Oooo0) {
                OooOOOO.Oooo0 oooo0 = (OooOOOO.Oooo0) oooOOOO3;
                OooO00o oooO00o5 = oooOo02.f53188OooO0O0;
                float f = oooO00o5.f53192OooO00o;
                float f2 = oooo0.f53170OooO0OO;
                oooO00o5.f53192OooO00o = f + f2;
                float f3 = oooO00o5.f53193OooO0O0;
                float f4 = oooo0.f53171OooO0Oo;
                oooO00o5.f53193OooO0O0 = f3 + f4;
                target.OooO0Oo(f2, f4);
                OooO00o oooO00o6 = oooOo02.f53190OooO0Oo;
                OooO00o oooO00o7 = oooOo02.f53188OooO0O0;
                oooO00o6.f53192OooO00o = oooO00o7.f53192OooO00o;
                oooO00o6.f53193OooO0O0 = oooO00o7.f53193OooO0O0;
            } else if (oooOOOO3 instanceof OooOOOO.OooOO0) {
                OooOOOO.OooOO0 oooOO1 = (OooOOOO.OooOO0) oooOOOO3;
                OooO00o oooO00o8 = oooOo02.f53188OooO0O0;
                float f5 = oooOO1.f53144OooO0OO;
                oooO00o8.f53192OooO00o = f5;
                float f6 = oooOO1.f53145OooO0Oo;
                oooO00o8.f53193OooO0O0 = f6;
                target.OooOO0(f5, f6);
                OooO00o oooO00o9 = oooOo02.f53190OooO0Oo;
                OooO00o oooO00o10 = oooOo02.f53188OooO0O0;
                oooO00o9.f53192OooO00o = oooO00o10.f53192OooO00o;
                oooO00o9.f53193OooO0O0 = oooO00o10.f53193OooO0O0;
            } else if (oooOOOO3 instanceof OooOOOO.Oooo000) {
                OooOOOO.Oooo000 oooo000 = (OooOOOO.Oooo000) oooOOOO3;
                target.OooOOO0(oooo000.f53172OooO0OO, oooo000.f53173OooO0Oo);
                OooO00o oooO00o11 = oooOo02.f53188OooO0O0;
                oooO00o11.f53192OooO00o += oooo000.f53172OooO0OO;
                oooO00o11.f53193OooO0O0 += oooo000.f53173OooO0Oo;
            } else if (oooOOOO3 instanceof OooOOOO.OooO) {
                OooOOOO.OooO oooO = (OooOOOO.OooO) oooOOOO3;
                target.OooOOO(oooO.f53127OooO0OO, oooO.f53128OooO0Oo);
                OooO00o oooO00o12 = oooOo02.f53188OooO0O0;
                oooO00o12.f53192OooO00o = oooO.f53127OooO0OO;
                oooO00o12.f53193OooO0O0 = oooO.f53128OooO0Oo;
            } else if (oooOOOO3 instanceof OooOOOO.OooOo) {
                OooOOOO.OooOo oooOo = (OooOOOO.OooOo) oooOOOO3;
                target.OooOOO0(oooOo.f53163OooO0OO, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
                oooOo02.f53188OooO0O0.f53192OooO00o += oooOo.f53163OooO0OO;
            } else if (oooOOOO3 instanceof OooOOOO.OooO0o) {
                OooOOOO.OooO0o oooO0o = (OooOOOO.OooO0o) oooOOOO3;
                target.OooOOO(oooO0o.f53143OooO0OO, oooOo02.f53188OooO0O0.f53193OooO0O0);
                oooOo02.f53188OooO0O0.f53192OooO00o = oooO0o.f53143OooO0OO;
            } else if (oooOOOO3 instanceof OooOOOO.o00Oo0) {
                OooOOOO.o00Oo0 o00oo1 = (OooOOOO.o00Oo0) oooOOOO3;
                target.OooOOO0(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, o00oo1.f53180OooO0OO);
                oooOo02.f53188OooO0O0.f53193OooO0O0 += o00oo1.f53180OooO0OO;
            } else if (oooOOOO3 instanceof OooOOOO.o00Ooo) {
                OooOOOO.o00Ooo o00ooo2 = (OooOOOO.o00Ooo) oooOOOO3;
                target.OooOOO(oooOo02.f53188OooO0O0.f53192OooO00o, o00ooo2.f53181OooO0OO);
                oooOo02.f53188OooO0O0.f53193OooO0O0 = o00ooo2.f53181OooO0OO;
            } else if (oooOOOO3 instanceof OooOOOO.OooOo00) {
                OooOOOO.OooOo00 oooOo03 = (OooOOOO.OooOo00) oooOOOO3;
                o000o0o2.OooO0o0(oooOo03.f53164OooO0OO, oooOo03.f53165OooO0Oo, oooOo03.f53167OooO0o0, oooOo03.f53166OooO0o, oooOo03.f53168OooO0oO, oooOo03.f53169OooO0oo);
                OooO00o oooO00o13 = oooOo02.f53189OooO0OO;
                OooO00o oooO00o14 = oooOo02.f53188OooO0O0;
                oooO00o13.f53192OooO00o = oooO00o14.f53192OooO00o + oooOo03.f53167OooO0o0;
                oooO00o13.f53193OooO0O0 = oooO00o14.f53193OooO0O0 + oooOo03.f53166OooO0o;
                oooO00o14.f53192OooO00o += oooOo03.f53168OooO0oO;
                oooO00o14.f53193OooO0O0 += oooOo03.f53169OooO0oo;
            } else if (oooOOOO3 instanceof OooOOOO.OooO0OO) {
                OooOOOO.OooO0OO oooO0OO = (OooOOOO.OooO0OO) oooOOOO3;
                o000o0o2.OooOO0O(oooO0OO.f53137OooO0OO, oooO0OO.f53138OooO0Oo, oooO0OO.f53140OooO0o0, oooO0OO.f53139OooO0o, oooO0OO.f53141OooO0oO, oooO0OO.f53142OooO0oo);
                OooO00o oooO00o15 = oooOo02.f53189OooO0OO;
                oooO00o15.f53192OooO00o = oooO0OO.f53140OooO0o0;
                oooO00o15.f53193OooO0O0 = oooO0OO.f53139OooO0o;
                OooO00o oooO00o16 = oooOo02.f53188OooO0O0;
                oooO00o16.f53192OooO00o = oooO0OO.f53141OooO0oO;
                oooO00o16.f53193OooO0O0 = oooO0OO.f53142OooO0oo;
            } else if (oooOOOO3 instanceof OooOOOO.o0OoOo0) {
                OooOOOO.o0OoOo0 o0oooo1 = (OooOOOO.o0OoOo0) oooOOOO3;
                Intrinsics.checkNotNull(oooOOOO2);
                if (oooOOOO2.f53125OooO00o) {
                    OooO00o oooO00o17 = oooOo02.f53191OooO0o0;
                    OooO00o oooO00o18 = oooOo02.f53188OooO0O0;
                    float f7 = oooO00o18.f53192OooO00o;
                    OooO00o oooO00o19 = oooOo02.f53189OooO0OO;
                    oooO00o17.f53192OooO00o = f7 - oooO00o19.f53192OooO00o;
                    oooO00o17.f53193OooO0O0 = oooO00o18.f53193OooO0O0 - oooO00o19.f53193OooO0O0;
                } else {
                    oooOo02.f53191OooO0o0.OooO00o();
                }
                OooO00o oooO00o20 = oooOo02.f53191OooO0o0;
                o000o0o2.OooO0o0(oooO00o20.f53192OooO00o, oooO00o20.f53193OooO0O0, o0oooo1.f53182OooO0OO, o0oooo1.f53183OooO0Oo, o0oooo1.f53185OooO0o0, o0oooo1.f53184OooO0o);
                OooO00o oooO00o21 = oooOo02.f53189OooO0OO;
                OooO00o oooO00o22 = oooOo02.f53188OooO0O0;
                oooO00o21.f53192OooO00o = oooO00o22.f53192OooO00o + o0oooo1.f53182OooO0OO;
                oooO00o21.f53193OooO0O0 = oooO00o22.f53193OooO0O0 + o0oooo1.f53183OooO0Oo;
                oooO00o22.f53192OooO00o += o0oooo1.f53185OooO0o0;
                oooO00o22.f53193OooO0O0 += o0oooo1.f53184OooO0o;
            } else if (oooOOOO3 instanceof OooOOOO.OooOOO0) {
                OooOOOO.OooOOO0 oooOOO0 = (OooOOOO.OooOOO0) oooOOOO3;
                Intrinsics.checkNotNull(oooOOOO2);
                if (oooOOOO2.f53125OooO00o) {
                    OooO00o oooO00o23 = oooOo02.f53191OooO0o0;
                    float f8 = 2;
                    OooO00o oooO00o24 = oooOo02.f53188OooO0O0;
                    float f9 = oooO00o24.f53192OooO00o * f8;
                    OooO00o oooO00o25 = oooOo02.f53189OooO0OO;
                    oooO00o23.f53192OooO00o = f9 - oooO00o25.f53192OooO00o;
                    oooO00o23.f53193OooO0O0 = (f8 * oooO00o24.f53193OooO0O0) - oooO00o25.f53193OooO0O0;
                } else {
                    OooO00o oooO00o26 = oooOo02.f53191OooO0o0;
                    OooO00o oooO00o27 = oooOo02.f53188OooO0O0;
                    oooO00o26.f53192OooO00o = oooO00o27.f53192OooO00o;
                    oooO00o26.f53193OooO0O0 = oooO00o27.f53193OooO0O0;
                }
                OooO00o oooO00o28 = oooOo02.f53191OooO0o0;
                o000o0o2.OooOO0O(oooO00o28.f53192OooO00o, oooO00o28.f53193OooO0O0, oooOOO0.f53152OooO0OO, oooOOO0.f53153OooO0Oo, oooOOO0.f53155OooO0o0, oooOOO0.f53154OooO0o);
                OooO00o oooO00o29 = oooOo02.f53189OooO0OO;
                oooO00o29.f53192OooO00o = oooOOO0.f53152OooO0OO;
                oooO00o29.f53193OooO0O0 = oooOOO0.f53153OooO0Oo;
                OooO00o oooO00o30 = oooOo02.f53188OooO0O0;
                oooO00o30.f53192OooO00o = oooOOO0.f53155OooO0o0;
                oooO00o30.f53193OooO0O0 = oooOOO0.f53154OooO0o;
            } else if (oooOOOO3 instanceof OooOOOO.o000oOoO) {
                OooOOOO.o000oOoO o000oooo2 = (OooOOOO.o000oOoO) oooOOOO3;
                target.OooO0oo(o000oooo2.f53174OooO0OO, o000oooo2.f53175OooO0Oo, o000oooo2.f53177OooO0o0, o000oooo2.f53176OooO0o);
                OooO00o oooO00o31 = oooOo02.f53189OooO0OO;
                OooO00o oooO00o32 = oooOo02.f53188OooO0O0;
                oooO00o31.f53192OooO00o = oooO00o32.f53192OooO00o + o000oooo2.f53174OooO0OO;
                oooO00o31.f53193OooO0O0 = oooO00o32.f53193OooO0O0 + o000oooo2.f53175OooO0Oo;
                oooO00o32.f53192OooO00o += o000oooo2.f53177OooO0o0;
                oooO00o32.f53193OooO0O0 += o000oooo2.f53176OooO0o;
            } else if (oooOOOO3 instanceof OooOOOO.OooOO0O) {
                OooOOOO.OooOO0O oooOO0O = (OooOOOO.OooOO0O) oooOOOO3;
                target.OooO0o(oooOO0O.f53146OooO0OO, oooOO0O.f53147OooO0Oo, oooOO0O.f53149OooO0o0, oooOO0O.f53148OooO0o);
                OooO00o oooO00o33 = oooOo02.f53189OooO0OO;
                oooO00o33.f53192OooO00o = oooOO0O.f53146OooO0OO;
                oooO00o33.f53193OooO0O0 = oooOO0O.f53147OooO0Oo;
                OooO00o oooO00o34 = oooOo02.f53188OooO0O0;
                oooO00o34.f53192OooO00o = oooOO0O.f53149OooO0o0;
                oooO00o34.f53193OooO0O0 = oooOO0O.f53148OooO0o;
            } else if (oooOOOO3 instanceof OooOOOO.o00O0O) {
                OooOOOO.o00O0O o00o0o2 = (OooOOOO.o00O0O) oooOOOO3;
                Intrinsics.checkNotNull(oooOOOO2);
                if (oooOOOO2.f53126OooO0O0) {
                    OooO00o oooO00o35 = oooOo02.f53191OooO0o0;
                    OooO00o oooO00o36 = oooOo02.f53188OooO0O0;
                    float f10 = oooO00o36.f53192OooO00o;
                    OooO00o oooO00o37 = oooOo02.f53189OooO0OO;
                    oooO00o35.f53192OooO00o = f10 - oooO00o37.f53192OooO00o;
                    oooO00o35.f53193OooO0O0 = oooO00o36.f53193OooO0O0 - oooO00o37.f53193OooO0O0;
                } else {
                    oooOo02.f53191OooO0o0.OooO00o();
                }
                OooO00o oooO00o38 = oooOo02.f53191OooO0o0;
                target.OooO0oo(oooO00o38.f53192OooO00o, oooO00o38.f53193OooO0O0, o00o0o2.f53178OooO0OO, o00o0o2.f53179OooO0Oo);
                OooO00o oooO00o39 = oooOo02.f53189OooO0OO;
                OooO00o oooO00o40 = oooOo02.f53188OooO0O0;
                float f11 = oooO00o40.f53192OooO00o;
                OooO00o oooO00o41 = oooOo02.f53191OooO0o0;
                oooO00o39.f53192OooO00o = f11 + oooO00o41.f53192OooO00o;
                oooO00o39.f53193OooO0O0 = oooO00o40.f53193OooO0O0 + oooO00o41.f53193OooO0O0;
                oooO00o40.f53192OooO00o += o00o0o2.f53178OooO0OO;
                oooO00o40.f53193OooO0O0 += o00o0o2.f53179OooO0Oo;
            } else {
                if (oooOOOO3 instanceof OooOOOO.OooOOO) {
                    OooOOOO.OooOOO oooOOO = (OooOOOO.OooOOO) oooOOOO3;
                    Intrinsics.checkNotNull(oooOOOO2);
                    if (oooOOOO2.f53126OooO0O0) {
                        OooO00o oooO00o42 = oooOo02.f53191OooO0o0;
                        float f12 = 2;
                        OooO00o oooO00o43 = oooOo02.f53188OooO0O0;
                        float f13 = oooO00o43.f53192OooO00o * f12;
                        OooO00o oooO00o44 = oooOo02.f53189OooO0OO;
                        oooO00o42.f53192OooO00o = f13 - oooO00o44.f53192OooO00o;
                        oooO00o42.f53193OooO0O0 = (f12 * oooO00o43.f53193OooO0O0) - oooO00o44.f53193OooO0O0;
                    } else {
                        OooO00o oooO00o45 = oooOo02.f53191OooO0o0;
                        OooO00o oooO00o46 = oooOo02.f53188OooO0O0;
                        oooO00o45.f53192OooO00o = oooO00o46.f53192OooO00o;
                        oooO00o45.f53193OooO0O0 = oooO00o46.f53193OooO0O0;
                    }
                    OooO00o oooO00o47 = oooOo02.f53191OooO0o0;
                    target.OooO0o(oooO00o47.f53192OooO00o, oooO00o47.f53193OooO0O0, oooOOO.f53150OooO0OO, oooOOO.f53151OooO0Oo);
                    OooO00o oooO00o48 = oooOo02.f53189OooO0OO;
                    OooO00o oooO00o49 = oooOo02.f53191OooO0o0;
                    oooO00o48.f53192OooO00o = oooO00o49.f53192OooO00o;
                    oooO00o48.f53193OooO0O0 = oooO00o49.f53193OooO0O0;
                    OooO00o oooO00o50 = oooOo02.f53188OooO0O0;
                    oooO00o50.f53192OooO00o = oooOOO.f53150OooO0OO;
                    oooO00o50.f53193OooO0O0 = oooOOO.f53151OooO0Oo;
                } else {
                    if (oooOOOO3 instanceof OooOOOO.C0437OooOOOO) {
                        OooOOOO.C0437OooOOOO c0437OooOOOO = (OooOOOO.C0437OooOOOO) oooOOOO3;
                        float f14 = c0437OooOOOO.f53162OooO0oo;
                        OooO00o oooO00o51 = oooOo02.f53188OooO0O0;
                        float f15 = oooO00o51.f53192OooO00o;
                        float f16 = f14 + f15;
                        float f17 = c0437OooOOOO.f53156OooO;
                        float f18 = oooO00o51.f53193OooO0O0;
                        float f19 = f17 + f18;
                        i = i3;
                        r24 = r15;
                        i2 = size;
                        OooO0O0(o000o0o2, f15, f18, f16, f19, c0437OooOOOO.f53157OooO0OO, c0437OooOOOO.f53158OooO0Oo, c0437OooOOOO.f53160OooO0o0, c0437OooOOOO.f53159OooO0o, c0437OooOOOO.f53161OooO0oO);
                        OooO00o oooO00o52 = this.f53188OooO0O0;
                        oooO00o52.f53192OooO00o = f16;
                        oooO00o52.f53193OooO0O0 = f19;
                        OooO00o oooO00o53 = this.f53189OooO0OO;
                        oooO00o53.f53192OooO00o = f16;
                        oooO00o53.f53193OooO0O0 = f19;
                        oooOo00 = this;
                        oooOOOO = oooOOOO3;
                    } else {
                        i = i3;
                        r24 = r15;
                        i2 = size;
                        if (oooOOOO3 instanceof OooOOOO.OooO00o) {
                            OooOOOO.OooO00o oooO00o54 = (OooOOOO.OooO00o) oooOOOO3;
                            OooO00o oooO00o55 = oooOo02.f53188OooO0O0;
                            oooOOOO = oooOOOO3;
                            oooOo00 = this;
                            oooOo00.OooO0O0(o000o0o2, oooO00o55.f53192OooO00o, oooO00o55.f53193OooO0O0, oooO00o54.f53135OooO0oo, oooO00o54.f53129OooO, oooO00o54.f53130OooO0OO, oooO00o54.f53131OooO0Oo, oooO00o54.f53133OooO0o0, oooO00o54.f53132OooO0o, oooO00o54.f53134OooO0oO);
                            OooO00o oooO00o56 = oooOo00.f53188OooO0O0;
                            float f20 = oooO00o54.f53135OooO0oo;
                            oooO00o56.f53192OooO00o = f20;
                            float f21 = oooO00o54.f53129OooO;
                            oooO00o56.f53193OooO0O0 = f21;
                            OooO00o oooO00o57 = oooOo00.f53189OooO0OO;
                            oooO00o57.f53192OooO00o = f20;
                            oooO00o57.f53193OooO0O0 = f21;
                            r24 = r24;
                        } else {
                            oooOOOO = oooOOOO3;
                            oooOo00 = oooOo01;
                        }
                    }
                    oooOo02 = oooOo00;
                }
                i3 = i + 1;
                oooOo01 = oooOo00;
                oooOOOO2 = oooOOOO;
                size = i2;
                r15 = r24;
                target = o000o0o2;
            }
            oooOo00 = oooOo01;
            i = i3;
            oooOOOO = oooOOOO3;
            r24 = r15;
            i2 = size;
            i3 = i + 1;
            oooOo01 = oooOo00;
            oooOOOO2 = oooOOOO;
            size = i2;
            r15 = r24;
            target = o000o0o2;
        }
        return o000o0o2;
    }
}
