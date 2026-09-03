package p029Oooo0oO;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o0000O0O.OooOo;
import o0O0O00.o000O000;
import p027Oooo0o.o00oO0o;

/* JADX INFO: loaded from: classes.dex */
public final class o00OO00O extends Lambda implements Function1<o000O000.OooO00o, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ List<oo0O> f2340Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OO00O(List<oo0O> list) {
        super(1);
        this.f2340Oooo0o = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.LinkedHashMap, java.util.Map<java.lang.Object, Oooo0oO.o000O>] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList, java.util.List<Oooo0oO.o0O00OO>] */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o000O000.OooO00o oooO00o) {
        int i;
        long j;
        oo0O oo0o;
        char c;
        int iOooO0OO;
        int iOooO0OO2;
        o000O000.OooO00o scope = oooO00o;
        Intrinsics.checkNotNullParameter(scope, "$this$invoke");
        List<oo0O> list = this.f2340Oooo0o;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            oo0O oo0o2 = list.get(i2);
            Objects.requireNonNull(oo0o2);
            Intrinsics.checkNotNullParameter(scope, "scope");
            int iOooO0o = oo0o2.OooO0o();
            oo0O oo0o3 = oo0o2;
            int i3 = 0;
            while (i3 < iOooO0o) {
                o000O000 o000o001 = oo0o3.f2493OooOOO0.get(i3).f2348OooO00o;
                int i4 = oo0o3.f2489OooOO0 - (oo0o3.f2491OooOO0o ? o000o001.f35266Oooo0oO : o000o001.f35265Oooo0o);
                int i5 = oo0o3.f2490OooOO0O;
                if (oo0o3.OooO0OO(i3) != null) {
                    o00O000 o00o001 = oo0o3.f2492OooOOO;
                    Object key = oo0o3.f2484OooO0Oo;
                    j = oo0o3.f2482OooO0O0;
                    Objects.requireNonNull(o00o001);
                    Intrinsics.checkNotNullParameter(key, "key");
                    o000O o000o = (o000O) o00o001.f2280OooO0Oo.get(key);
                    if (o000o == null) {
                        i = size;
                    } else {
                        o0O00OO o0o00oo2 = (o0O00OO) o000o.f2254OooO0Oo.get(i3);
                        long j2 = o0o00oo2.f2428OooO0O0.OooO0o().f27312OooO00o;
                        long j3 = o000o.f2253OooO0OO;
                        int i6 = size;
                        long jOooO00o = o00oO0o.OooO00o(j3, OooOo.OooO0OO(j2), ((int) (j2 >> 32)) + ((int) (j3 >> 32)));
                        long j4 = o0o00oo2.f2429OooO0OO;
                        long j5 = o000o.f2253OooO0OO;
                        i = i6;
                        long jOooO00o2 = o00oO0o.OooO00o(j5, OooOo.OooO0OO(j4), ((int) (j4 >> 32)) + ((int) (j5 >> 32)));
                        if (((Boolean) o0o00oo2.f2430OooO0Oo.getValue()).booleanValue() && ((o00o001.OooO0O0(jOooO00o2) < i4 && o00o001.OooO0O0(jOooO00o) < i4) || (o00o001.OooO0O0(jOooO00o2) > i5 && o00o001.OooO0O0(jOooO00o) > i5))) {
                            BuildersKt__Builders_commonKt.launch$default(o00o001.f2277OooO00o, null, null, new o0O0ooO(o0o00oo2, null), 3, null);
                        }
                        j = jOooO00o;
                    }
                    oo0o = oo0o2;
                } else {
                    list = list;
                    i = size;
                    i2 = i2;
                    oo0o2 = oo0o2;
                    iOooO0o = iOooO0o;
                    j = oo0o3.f2482OooO0O0;
                    oo0o = oo0o3;
                }
                if (oo0o.f2491OooOO0o) {
                    iOooO0OO = OooOo.OooO0OO(j);
                    c = ' ';
                } else {
                    OooOo.OooO00o oooO00o2 = OooOo.f27310OooO0O0;
                    c = ' ';
                    iOooO0OO = (int) (j >> 32);
                }
                if (iOooO0OO > i4) {
                    if (oo0o.f2491OooOO0o) {
                        iOooO0OO2 = OooOo.OooO0OO(j);
                    } else {
                        OooOo.OooO00o oooO00o3 = OooOo.f27310OooO0O0;
                        iOooO0OO2 = (int) (j >> c);
                    }
                    if (iOooO0OO2 < i5) {
                        if (oo0o.f2491OooOO0o) {
                            long j6 = oo0o.f2494OooOOOO;
                            OooOo.OooO00o oooO00o4 = OooOo.f27310OooO0O0;
                            o000O000.OooO00o.OooOOO0(scope, o000o001, o00oO0o.OooO00o(j6, OooOo.OooO0OO(j), ((int) (j >> c)) + ((int) (j6 >> c))), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 6, null);
                        } else {
                            long j7 = oo0o.f2494OooOOOO;
                            OooOo.OooO00o oooO00o5 = OooOo.f27310OooO0O0;
                            o000O000.OooO00o.OooO(scope, o000o001, o00oO0o.OooO00o(j7, OooOo.OooO0OO(j), ((int) (j >> 32)) + ((int) (j7 >> 32))), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, null, 6, null);
                        }
                    }
                }
                i3++;
                oo0o3 = oo0o;
                list = list;
                oo0o2 = oo0o2;
                iOooO0o = iOooO0o;
                i2 = i2;
                size = i;
            }
            i2++;
        }
        return Unit.INSTANCE;
    }
}
