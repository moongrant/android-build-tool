package p712ooOO;

import androidx.compose.ui.focus.FocusStateImpl;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00O0O.OooOO0O;
import o0O0O00.OooO0OO;
import org.jetbrains.annotations.NotNull;
import p036OoooOOO.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O {

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FocusStateImpl.values().length];
            iArr[FocusStateImpl.ActiveParent.ordinal()] = 1;
            iArr[FocusStateImpl.DeactivatedParent.ordinal()] = 2;
            iArr[FocusStateImpl.Active.ordinal()] = 3;
            iArr[FocusStateImpl.Captured.ordinal()] = 4;
            iArr[FocusStateImpl.Deactivated.ordinal()] = 5;
            iArr[FocusStateImpl.Inactive.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<OooO0OO.OooO00o, Boolean> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0OO00O f53467Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f53468OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ o0OO00O f53469OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ Function1<o0OO00O, Boolean> f53470OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(o0OO00O o0oo00o2, o0OO00O o0oo00o3, int i, Function1<? super o0OO00O, Boolean> function1) {
            super(1);
            this.f53467Oooo = o0oo00o2;
            this.f53469OoooO00 = o0oo00o3;
            this.f53468OoooO0 = i;
            this.f53470OoooO0O = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(OooO0OO.OooO00o oooO00o) {
            OooO0OO.OooO00o searchBeyondBounds = oooO00o;
            Intrinsics.checkNotNullParameter(searchBeyondBounds, "$this$searchBeyondBounds");
            Boolean boolValueOf = Boolean.valueOf(o0000O.OooO0oO(this.f53467Oooo, this.f53469OoooO00, this.f53468OoooO0, this.f53470OoooO0O));
            if (boolValueOf.booleanValue() || !searchBeyondBounds.OooO00o()) {
                return boolValueOf;
            }
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0055  */
    /* JADX WARN: Code duplicated, block: B:37:0x0057  */
    /* JADX WARN: Code duplicated, block: B:73:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:77:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00bb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:84:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:86:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:88:0x00c8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:90:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:92:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:97:0x00e0  */
    public static final boolean OooO00o(OooOO0O oooOO0O, OooOO0O oooOO0O2, OooOO0O oooOO0O3, int i) {
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float fMax;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        if (!OooO0O0(oooOO0O3, i, oooOO0O) && OooO0O0(oooOO0O2, i, oooOO0O)) {
            if (!(i == 3)) {
                if (!(i == 4)) {
                    if (!(i == 5)) {
                        if (!(i == 6)) {
                            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                        }
                        if (oooOO0O.f30425OooO0Oo <= oooOO0O3.f30423OooO0O0) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else if (oooOO0O.f30423OooO0O0 >= oooOO0O3.f30425OooO0Oo) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (oooOO0O.f30424OooO0OO <= oooOO0O3.f30422OooO00o) {
                    z = true;
                } else {
                    z = false;
                }
            } else if (oooOO0O.f30422OooO00o >= oooOO0O3.f30424OooO0OO) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
            if (i == 3) {
                return true;
            }
            if (i == 4) {
                return true;
            }
            if (i == 3) {
                f3 = oooOO0O.f30422OooO00o;
                f4 = oooOO0O2.f30424OooO0OO;
            } else {
                if (i == 4) {
                    f = oooOO0O2.f30422OooO00o;
                    f2 = oooOO0O.f30424OooO0OO;
                } else {
                    if (i == 5) {
                        f3 = oooOO0O.f30423OooO0O0;
                        f4 = oooOO0O2.f30425OooO0Oo;
                    } else {
                        if (!(i == 6)) {
                            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                        }
                        f = oooOO0O2.f30423OooO0O0;
                        f2 = oooOO0O.f30425OooO0Oo;
                    }
                }
                f5 = f - f2;
                fMax = Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f5);
                if (i == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    f8 = oooOO0O.f30422OooO00o;
                    f9 = oooOO0O3.f30422OooO00o;
                } else {
                    if (i == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        f6 = oooOO0O3.f30424OooO0OO;
                        f7 = oooOO0O.f30424OooO0OO;
                    } else {
                        if (i == 5) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            f8 = oooOO0O.f30423OooO0O0;
                            f9 = oooOO0O3.f30423OooO0O0;
                        } else {
                            if (i == 6) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5) {
                                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                            }
                            f6 = oooOO0O3.f30425OooO0Oo;
                            f7 = oooOO0O.f30425OooO0Oo;
                        }
                    }
                    f10 = f6 - f7;
                    if (fMax < Math.max(1.0f, f10)) {
                        return true;
                    }
                }
                f10 = f8 - f9;
                if (fMax < Math.max(1.0f, f10)) {
                    return true;
                }
            }
            f5 = f3 - f4;
            fMax = Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f5);
            if (i == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                f8 = oooOO0O.f30422OooO00o;
                f9 = oooOO0O3.f30422OooO00o;
            } else {
                if (i == 4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    f6 = oooOO0O3.f30424OooO0OO;
                    f7 = oooOO0O.f30424OooO0OO;
                } else {
                    if (i == 5) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        f8 = oooOO0O.f30423OooO0O0;
                        f9 = oooOO0O3.f30423OooO0O0;
                    } else {
                        if (i == 6) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                        }
                        f6 = oooOO0O3.f30425OooO0Oo;
                        f7 = oooOO0O.f30425OooO0Oo;
                    }
                }
                f10 = f6 - f7;
                if (fMax < Math.max(1.0f, f10)) {
                    return true;
                }
            }
            f10 = f8 - f9;
            if (fMax < Math.max(1.0f, f10)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean OooO0O0(OooOO0O oooOO0O, int i, OooOO0O oooOO0O2) {
        if (!((i == 3) || i == 4)) {
            if (!((i == 5) || i == 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            if (oooOO0O.f30424OooO0OO > oooOO0O2.f30422OooO00o && oooOO0O.f30422OooO00o < oooOO0O2.f30424OooO0OO) {
                return true;
            }
        } else if (oooOO0O.f30425OooO0Oo > oooOO0O2.f30423OooO0O0 && oooOO0O.f30423OooO0O0 < oooOO0O2.f30425OooO0Oo) {
            return true;
        }
        return false;
    }

    public static final o0OO00O OooO0OO(o000OOo<o0OO00O> o000ooo2, OooOO0O oooOO0O, int i) {
        OooOO0O oooOO0OOooO0OO;
        if (i == 3) {
            oooOO0OOooO0OO = oooOO0O.OooO0OO((oooOO0O.f30424OooO0OO - oooOO0O.f30422OooO00o) + 1, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        } else {
            if (i == 4) {
                oooOO0OOooO0OO = oooOO0O.OooO0OO(-((oooOO0O.f30424OooO0OO - oooOO0O.f30422OooO00o) + 1), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            } else {
                if (i == 5) {
                    oooOO0OOooO0OO = oooOO0O.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, (oooOO0O.f30425OooO0Oo - oooOO0O.f30423OooO0O0) + 1);
                } else {
                    if (!(i == 6)) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                    oooOO0OOooO0OO = oooOO0O.OooO0OO(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, -((oooOO0O.f30425OooO0Oo - oooOO0O.f30423OooO0O0) + 1));
                }
            }
        }
        o0OO00O o0oo00o2 = null;
        int i2 = o000ooo2.f3678OoooO0;
        if (i2 > 0) {
            o0OO00O[] o0oo00oArr = o000ooo2.f3677Oooo;
            int i3 = 0;
            do {
                o0OO00O o0oo00o3 = o0oo00oArr[i3];
                if (o0000O0O.OooO0o0(o0oo00o3)) {
                    OooOO0O oooOO0OOooO0Oo = o0000O0O.OooO0Oo(o0oo00o3);
                    if (OooO0o0(oooOO0OOooO0Oo, i, oooOO0O) && (!OooO0o0(oooOO0OOooO0OO, i, oooOO0O) || OooO00o(oooOO0O, oooOO0OOooO0Oo, oooOO0OOooO0OO, i) || (!OooO00o(oooOO0O, oooOO0OOooO0OO, oooOO0OOooO0Oo, i) && OooO0o(i, oooOO0O, oooOO0OOooO0Oo) < OooO0o(i, oooOO0O, oooOO0OOooO0OO)))) {
                        o0oo00o2 = o0oo00o3;
                        oooOO0OOooO0OO = oooOO0OOooO0Oo;
                    }
                }
                i3++;
            } while (i3 < i2);
        }
        return o0oo00o2;
    }

    public static final boolean OooO0Oo(o0OO00O o0oo00o2, o0OO00O o0oo00o3, int i, Function1<? super o0OO00O, Boolean> function1) {
        if (OooO0oO(o0oo00o2, o0oo00o3, i, function1)) {
            return true;
        }
        Boolean bool = (Boolean) o000oOoO.OooO00o(o0oo00o2, i, new OooO0O0(o0oo00o2, o0oo00o3, i, function1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final long OooO0o(int i, OooOO0O oooOO0O, OooOO0O oooOO0O2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        boolean z = true;
        if (i == 3) {
            f = oooOO0O.f30422OooO00o;
            f2 = oooOO0O2.f30424OooO0OO;
        } else {
            if (i == 4) {
                f = oooOO0O2.f30422OooO00o;
                f2 = oooOO0O.f30424OooO0OO;
            } else {
                if (i == 5) {
                    f = oooOO0O.f30423OooO0O0;
                    f2 = oooOO0O2.f30425OooO0Oo;
                } else {
                    if (!(i == 6)) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                    f = oooOO0O2.f30423OooO0O0;
                    f2 = oooOO0O.f30425OooO0Oo;
                }
            }
        }
        long jAbs = (long) Math.abs(Math.max(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f - f2));
        if ((i == 3) || i == 4) {
            float f7 = oooOO0O.f30423OooO0O0;
            f3 = 2;
            f4 = ((oooOO0O.f30425OooO0Oo - f7) / f3) + f7;
            f5 = oooOO0O2.f30423OooO0O0;
            f6 = oooOO0O2.f30425OooO0Oo;
        } else {
            if (!(i == 5)) {
                z = i == 6;
            }
            if (!z) {
                throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
            }
            float f8 = oooOO0O.f30422OooO00o;
            f3 = 2;
            f4 = ((oooOO0O.f30424OooO0OO - f8) / f3) + f8;
            f5 = oooOO0O2.f30422OooO00o;
            f6 = oooOO0O2.f30424OooO0OO;
        }
        long jAbs2 = (long) Math.abs(f4 - (((f6 - f5) / f3) + f5));
        return (jAbs2 * jAbs2) + (((long) 13) * jAbs * jAbs);
    }

    public static final boolean OooO0o0(OooOO0O oooOO0O, int i, OooOO0O oooOO0O2) {
        if (i == 3) {
            float f = oooOO0O2.f30424OooO0OO;
            float f2 = oooOO0O.f30424OooO0OO;
            if ((f <= f2 && oooOO0O2.f30422OooO00o < f2) || oooOO0O2.f30422OooO00o <= oooOO0O.f30422OooO00o) {
                return false;
            }
        } else {
            if (i == 4) {
                float f3 = oooOO0O2.f30422OooO00o;
                float f4 = oooOO0O.f30422OooO00o;
                if ((f3 >= f4 && oooOO0O2.f30424OooO0OO > f4) || oooOO0O2.f30424OooO0OO >= oooOO0O.f30424OooO0OO) {
                    return false;
                }
            } else {
                if (i == 5) {
                    float f5 = oooOO0O2.f30425OooO0Oo;
                    float f6 = oooOO0O.f30425OooO0Oo;
                    if ((f5 <= f6 && oooOO0O2.f30423OooO0O0 < f6) || oooOO0O2.f30423OooO0O0 <= oooOO0O.f30423OooO0O0) {
                        return false;
                    }
                } else {
                    if (!(i == 6)) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                    float f7 = oooOO0O2.f30423OooO0O0;
                    float f8 = oooOO0O.f30423OooO0O0;
                    if ((f7 >= f8 && oooOO0O2.f30425OooO0Oo > f8) || oooOO0O2.f30425OooO0Oo >= oooOO0O.f30425OooO0Oo) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static final boolean OooO0oO(o0OO00O o0oo00o2, o0OO00O o0oo00o3, int i, Function1<? super o0OO00O, Boolean> function1) {
        o0OO00O o0oo00oOooO0OO;
        o000OOo o000ooo2 = new o000OOo(new o0OO00O[o0oo00o2.f53492OoooO0.f3678OoooO0]);
        o000ooo2.OooO0OO(o000ooo2.f3678OoooO0, o0oo00o2.f53492OoooO0);
        while (o000ooo2.OooOO0() && (o0oo00oOooO0OO = OooO0OO(o000ooo2, o0000O0O.OooO0Oo(o0oo00o3), i)) != null) {
            if (!o0oo00oOooO0OO.f53494OoooO0O.OooO0Oo()) {
                return function1.invoke(o0oo00oOooO0OO).booleanValue();
            }
            if (OooO0Oo(o0oo00oOooO0OO, o0oo00o3, i, function1)) {
                return true;
            }
            o000ooo2.OooOO0O(o0oo00oOooO0OO);
        }
        return false;
    }

    public static final boolean OooO0oo(@NotNull o0OO00O twoDimensionalFocusSearch, int i, @NotNull Function1<? super o0OO00O, Boolean> onFound) {
        OooOO0O oooOO0O;
        Intrinsics.checkNotNullParameter(twoDimensionalFocusSearch, "$this$twoDimensionalFocusSearch");
        Intrinsics.checkNotNullParameter(onFound, "onFound");
        FocusStateImpl focusStateImpl = twoDimensionalFocusSearch.f53494OoooO0O;
        int[] iArr = OooO00o.$EnumSwitchMapping$0;
        boolean z = true;
        switch (iArr[focusStateImpl.ordinal()]) {
            case 1:
            case 2:
                o0OO00O o0oo00o2 = twoDimensionalFocusSearch.f53491OoooO;
                if (o0oo00o2 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                }
                switch (iArr[o0oo00o2.f53494OoooO0O.ordinal()]) {
                    case 1:
                    case 2:
                        if (OooO0oo(o0oo00o2, i, onFound)) {
                            return true;
                        }
                        FocusStateImpl focusStateImpl2 = o0oo00o2.f53494OoooO0O;
                        if (!(focusStateImpl2 == FocusStateImpl.ActiveParent || focusStateImpl2 == FocusStateImpl.DeactivatedParent)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                        o0OO00O o0oo00oOooO0O0 = o0000O0O.OooO0O0(o0oo00o2);
                        if (o0oo00oOooO0O0 != null) {
                            return OooO0Oo(twoDimensionalFocusSearch, o0oo00oOooO0O0, i, onFound);
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                    case 3:
                    case 4:
                        return OooO0Oo(twoDimensionalFocusSearch, o0oo00o2, i, onFound);
                    case 5:
                    case 6:
                        throw new IllegalStateException("ActiveParent must have a focusedChild".toString());
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 3:
            case 4:
                o000OOo<o0OO00O> o000oooOooO00o = o0000O0O.OooO00o(twoDimensionalFocusSearch);
                if (o000oooOooO00o.f3678OoooO0 <= 1) {
                    o0OO00O o0oo00o3 = o000oooOooO00o.OooO() ? null : o000oooOooO00o.f3677Oooo[0];
                    if (o0oo00o3 != null) {
                        return ((Boolean) ((o0OOO0o.OooO0O0) onFound).invoke(o0oo00o3)).booleanValue();
                    }
                    return false;
                }
                if ((i == 4) || i == 6) {
                    OooOO0O oooOO0OOooO0Oo = o0000O0O.OooO0Oo(twoDimensionalFocusSearch);
                    float f = oooOO0OOooO0Oo.f30422OooO00o;
                    float f2 = oooOO0OOooO0Oo.f30423OooO0O0;
                    oooOO0O = new OooOO0O(f, f2, f, f2);
                } else {
                    if (!(i == 3) && i != 5) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search".toString());
                    }
                    OooOO0O oooOO0OOooO0Oo2 = o0000O0O.OooO0Oo(twoDimensionalFocusSearch);
                    float f3 = oooOO0OOooO0Oo2.f30424OooO0OO;
                    float f4 = oooOO0OOooO0Oo2.f30425OooO0Oo;
                    oooOO0O = new OooOO0O(f3, f4, f3, f4);
                }
                o0OO00O o0oo00oOooO0OO = OooO0OO(o000oooOooO00o, oooOO0O, i);
                if (o0oo00oOooO0OO != null) {
                    return ((Boolean) ((o0OOO0o.OooO0O0) onFound).invoke(o0oo00oOooO0OO)).booleanValue();
                }
                return false;
            case 5:
                return false;
            case 6:
                return ((Boolean) ((o0OOO0o.OooO0O0) onFound).invoke(twoDimensionalFocusSearch)).booleanValue();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
