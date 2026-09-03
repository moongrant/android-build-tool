package androidx.compose.foundation.gestures;

import Oooo000.o0000O00;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.platform.o00O000o;
import androidx.compose.ui.platform.o00oOoo;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;
import o00O0O.OooO;
import o00O0O.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025Oooo0O0.OooOo;
import p025Oooo0O0.OooOo00;
import p025Oooo0O0.o0000;
import p025Oooo0O0.o000OOo0;
import p025Oooo0O0.o00O0O;
import p025Oooo0O0.o00Ooo;
import p025Oooo0O0.o00oO0o;
import p025Oooo0O0.oo000o;
import p026Oooo0OO.o000;
import p048OoooooO.o00OOO0O;
import p048OoooooO.o00OOOO0;
import p100o000oOoO.o00Oo00;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oO0Oo;
import p100o000oOoO.oOO00O;
import p418o0Oo0oo.OooOOO;
import p418o0Oo0oo.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class DraggableKt {

    public static final class OooO00o extends Lambda implements Function3<o00OOOO0, oOO00O, Integer, o00OOOO0> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function1<o0Oo0oo, Boolean> f5663Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function2<oOO00O, Integer, o0000> f5664Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ o000 f5665Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Boolean> f5666Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ boolean f5667OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> f5668OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ Function3<CoroutineScope, OooO, Continuation<? super Unit>, Object> f5669OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ Orientation f5670OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ boolean f5671OoooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(Function2<? super oOO00O, ? super Integer, ? extends o0000> function2, o000 o000Var, Function0<Boolean> function0, Function1<? super o0Oo0oo, Boolean> function1, Function3<? super CoroutineScope, ? super OooO, ? super Continuation<? super Unit>, ? extends Object> function3, Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> function4, Orientation orientation, boolean z, boolean z2) {
            super(3);
            this.f5664Oooo0o = function2;
            this.f5665Oooo0oO = o000Var;
            this.f5666Oooo0oo = function0;
            this.f5663Oooo = function1;
            this.f5669OoooO00 = function3;
            this.f5668OoooO0 = function4;
            this.f5670OoooO0O = orientation;
            this.f5667OoooO = z;
            this.f5671OoooOO0 = z2;
        }

        public static final o00O0O OooO00o(oO0Oo oo0oo) {
            return (o00O0O) oo0oo.getValue();
        }

        @Override // kotlin.jvm.functions.Function3
        public final o00OOOO0 invoke(o00OOOO0 o00oooo1, oOO00O ooo00o, Integer num) {
            oOO00O ooo00o2 = ooo00o;
            o0000O00.OooO00o(num, o00oooo1, "$this$composed", ooo00o2, -1487259950);
            o0000 o0000VarInvoke = this.f5664Oooo0o.invoke(ooo00o2, 0);
            ooo00o2.OooO0o0(-492369756);
            Object objOooO0o = ooo00o2.OooO0o();
            oOO00O.OooO00o.C0323OooO00o c0323OooO00o = oOO00O.OooO00o.f29689OooO0O0;
            if (objOooO0o == c0323OooO00o) {
                objOooO0o = o0OOO00.OooO0Oo(null);
                ooo00o2.Oooo00o(objOooO0o);
            }
            ooo00o2.Oooo0o0();
            o0O00OO o0o00oo2 = (o0O00OO) objOooO0o;
            o000 o000Var = this.f5665Oooo0oO;
            o00Oo00.OooO0O0(o000Var, new androidx.compose.foundation.gestures.OooO00o(o0o00oo2, o000Var), ooo00o2);
            ooo00o2.OooO0o0(-492369756);
            Object objOooO0o2 = ooo00o2.OooO0o();
            if (objOooO0o2 == c0323OooO00o) {
                objOooO0o2 = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
                ooo00o2.Oooo00o(objOooO0o2);
            }
            ooo00o2.Oooo0o0();
            Channel channel = (Channel) objOooO0o2;
            oO0Oo oo0ooOooO0o = o0OOO00.OooO0o(this.f5666Oooo0oo, ooo00o2);
            oO0Oo oo0ooOooO0o2 = o0OOO00.OooO0o(this.f5663Oooo, ooo00o2);
            o00Oo00.OooO0o0(o0000VarInvoke, new OooO0O0(channel, o0000VarInvoke, o0OOO00.OooO0o(new o00O0O(this.f5669OoooO00, this.f5668OoooO0, o0o00oo2, this.f5665Oooo0oO), ooo00o2), null), ooo00o2);
            o00OOOO0 o00oooo0OooO0OO = SuspendingPointerInputFilterKt.OooO0OO(new Object[]{this.f5670OoooO0O, Boolean.valueOf(this.f5667OoooO), Boolean.valueOf(this.f5671OoooOO0)}, new OooO0OO(this.f5667OoooO, oo0ooOooO0o2, oo0ooOooO0o, this.f5670OoooO0O, channel, this.f5671OoooOO0, null));
            ooo00o2.Oooo0o0();
            return o00oooo0OooO0OO;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:39:0x0103  */
    /* JADX WARN: Code duplicated, block: B:41:0x0107  */
    /* JADX WARN: Code duplicated, block: B:44:0x011c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0121  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object OooO00o(OooOOO oooOOO, oO0Oo oo0oo, oO0Oo oo0oo2, o0OO00O.OooO0O0 oooO0O0, Orientation orientation, Continuation continuation) {
        o00Ooo o00ooo2;
        OooOOO oooOOO2;
        o0OO00O.OooO0O0 oooO0O1;
        Orientation orientation2;
        Pair pair;
        o0Oo0oo o0oo0oo2;
        Ref.FloatRef floatRef;
        oo000o oo000oVar;
        Ref.FloatRef floatRef2;
        o0Oo0oo o0oo0oo3;
        if (continuation instanceof o00Ooo) {
            o00ooo2 = (o00Ooo) continuation;
            int i = o00ooo2.f1684OoooO0O;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00ooo2.f1684OoooO0O = i - Integer.MIN_VALUE;
            } else {
                o00ooo2 = new o00Ooo(continuation);
            }
        } else {
            o00ooo2 = new o00Ooo(continuation);
        }
        o00Ooo o00ooo3 = o00ooo2;
        Object objOooO0OO = o00ooo3.f1682OoooO0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o00ooo3.f1684OoooO0O;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0OO);
            PointerEventPass pointerEventPass = PointerEventPass.Initial;
            o00ooo3.f1679Oooo0o = oooOOO;
            o00ooo3.f1680Oooo0oO = oo0oo;
            o00ooo3.f1681Oooo0oo = oo0oo2;
            o00ooo3.f1678Oooo = oooO0O0;
            o00ooo3.f1683OoooO00 = orientation;
            o00ooo3.f1684OoooO0O = 1;
            objOooO0OO = o000OOo0.OooO0OO(oooOOO, pointerEventPass, false, o00ooo3);
            if (objOooO0OO == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        floatRef2 = (Ref.FloatRef) o00ooo3.f1679Oooo0o;
                        ResultKt.throwOnFailure(objOooO0OO);
                        o0oo0oo3 = (o0Oo0oo) objOooO0OO;
                        if (o0oo0oo3 != null) {
                            pair = TuplesKt.to(o0oo0oo3, Boxing.boxFloat(floatRef2.element));
                            return pair;
                        }
                        return null;
                    }
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    floatRef2 = (Ref.FloatRef) o00ooo3.f1679Oooo0o;
                    ResultKt.throwOnFailure(objOooO0OO);
                    o0oo0oo3 = (o0Oo0oo) objOooO0OO;
                    if (o0oo0oo3 != null) {
                        pair = TuplesKt.to(o0oo0oo3, Boxing.boxFloat(floatRef2.element));
                        return pair;
                    }
                    return null;
                }
                orientation2 = (Orientation) o00ooo3.f1681Oooo0oo;
                oooO0O1 = (o0OO00O.OooO0O0) o00ooo3.f1680Oooo0oO;
                oooOOO2 = (OooOOO) o00ooo3.f1679Oooo0o;
                ResultKt.throwOnFailure(objOooO0OO);
                o0oo0oo2 = (o0Oo0oo) objOooO0OO;
                o0OO00O.OooO0OO.OooO0O0(oooO0O1, o0oo0oo2);
                floatRef = new Ref.FloatRef();
                oo000oVar = new oo000o(oooO0O1, floatRef);
                if (orientation2 == Orientation.Vertical) {
                    long j = o0oo0oo2.f39742OooO00o;
                    int i3 = o0oo0oo2.f39749OooO0oo;
                    o00ooo3.f1679Oooo0o = floatRef;
                    o00ooo3.f1680Oooo0oO = null;
                    o00ooo3.f1681Oooo0oo = null;
                    o00ooo3.f1684OoooO0O = 3;
                    objOooO0OO = OooOo.OooO0o0(oooOOO2, j, i3, oo000oVar, o00ooo3);
                    if (objOooO0OO == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef2 = floatRef;
                    o0oo0oo3 = (o0Oo0oo) objOooO0OO;
                    if (o0oo0oo3 != null) {
                        pair = TuplesKt.to(o0oo0oo3, Boxing.boxFloat(floatRef2.element));
                        return pair;
                    }
                    return null;
                }
                long j2 = o0oo0oo2.f39742OooO00o;
                int i4 = o0oo0oo2.f39749OooO0oo;
                o00ooo3.f1679Oooo0o = floatRef;
                o00ooo3.f1680Oooo0oO = null;
                o00ooo3.f1681Oooo0oo = null;
                o00ooo3.f1684OoooO0O = 4;
                objOooO0OO = OooOo.OooO0OO(oooOOO2, j2, i4, oo000oVar, o00ooo3);
                if (objOooO0OO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                floatRef2 = floatRef;
                o0oo0oo3 = (o0Oo0oo) objOooO0OO;
                if (o0oo0oo3 != null) {
                    pair = TuplesKt.to(o0oo0oo3, Boxing.boxFloat(floatRef2.element));
                    return pair;
                }
                return null;
            }
            orientation = o00ooo3.f1683OoooO00;
            oooO0O0 = o00ooo3.f1678Oooo;
            oo0oo2 = (oO0Oo) o00ooo3.f1681Oooo0oo;
            oo0oo = (oO0Oo) o00ooo3.f1680Oooo0oO;
            oooOOO = (OooOOO) o00ooo3.f1679Oooo0o;
            ResultKt.throwOnFailure(objOooO0OO);
        }
        o0Oo0oo o0oo0oo4 = (o0Oo0oo) objOooO0OO;
        if (((Boolean) ((Function1) oo0oo.getValue()).invoke(o0oo0oo4)).booleanValue()) {
            if (((Boolean) ((Function0) oo0oo2.getValue()).invoke()).booleanValue()) {
                o0oo0oo4.OooO00o();
                o0OO00O.OooO0OO.OooO0O0(oooO0O0, o0oo0oo4);
                pair = TuplesKt.to(o0oo0oo4, Boxing.boxFloat(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
            } else {
                o00ooo3.f1679Oooo0o = oooOOO;
                o00ooo3.f1680Oooo0oO = oooO0O0;
                o00ooo3.f1681Oooo0oo = orientation;
                o00ooo3.f1678Oooo = null;
                o00ooo3.f1683OoooO00 = null;
                o00ooo3.f1684OoooO0O = 2;
                objOooO0OO = o000OOo0.OooO0O0(oooOOO, false, o00ooo3);
                if (objOooO0OO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooOOO2 = oooOOO;
                oooO0O1 = oooO0O0;
                orientation2 = orientation;
                o0oo0oo2 = (o0Oo0oo) objOooO0OO;
                o0OO00O.OooO0OO.OooO0O0(oooO0O1, o0oo0oo2);
                floatRef = new Ref.FloatRef();
                oo000oVar = new oo000o(oooO0O1, floatRef);
                if (orientation2 == Orientation.Vertical) {
                    long j3 = o0oo0oo2.f39742OooO00o;
                    int i5 = o0oo0oo2.f39749OooO0oo;
                    o00ooo3.f1679Oooo0o = floatRef;
                    o00ooo3.f1680Oooo0oO = null;
                    o00ooo3.f1681Oooo0oo = null;
                    o00ooo3.f1684OoooO0O = 3;
                    objOooO0OO = OooOo.OooO0o0(oooOOO2, j3, i5, oo000oVar, o00ooo3);
                    if (objOooO0OO == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef2 = floatRef;
                    o0oo0oo3 = (o0Oo0oo) objOooO0OO;
                    if (o0oo0oo3 != null) {
                        pair = TuplesKt.to(o0oo0oo3, Boxing.boxFloat(floatRef2.element));
                    }
                } else {
                    long j4 = o0oo0oo2.f39742OooO00o;
                    int i6 = o0oo0oo2.f39749OooO0oo;
                    o00ooo3.f1679Oooo0o = floatRef;
                    o00ooo3.f1680Oooo0oO = null;
                    o00ooo3.f1681Oooo0oo = null;
                    o00ooo3.f1684OoooO0O = 4;
                    objOooO0OO = OooOo.OooO0OO(oooOOO2, j4, i6, oo000oVar, o00ooo3);
                    if (objOooO0OO == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    floatRef2 = floatRef;
                    o0oo0oo3 = (o0Oo0oo) objOooO0OO;
                    if (o0oo0oo3 != null) {
                        pair = TuplesKt.to(o0oo0oo3, Boxing.boxFloat(floatRef2.element));
                    }
                }
            }
            return pair;
        }
        return null;
    }

    public static final Object OooO0O0(OooOOO oooOOO, Pair pair, o0OO00O.OooO0O0 oooO0O0, SendChannel sendChannel, boolean z, Orientation orientation, Continuation continuation) {
        float fFloatValue = ((Number) pair.getSecond()).floatValue();
        o0Oo0oo o0oo0oo2 = (o0Oo0oo) pair.getFirst();
        Orientation orientation2 = Orientation.Vertical;
        long jOooO00o = orientation == orientation2 ? OooOO0.OooO00o(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, fFloatValue) : OooOO0.OooO00o(fFloatValue, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        long j = o0oo0oo2.f39744OooO0OO;
        long jOooO0o = OooO.OooO0o(j, OooO.OooO0oo(jOooO00o, Math.signum(orientation == orientation2 ? OooO.OooO0Oo(j) : OooO.OooO0OO(j))));
        sendChannel.mo2017trySendJP2dKIU(new OooOo00.OooO0OO(jOooO0o));
        if (z) {
            fFloatValue *= -1;
        }
        sendChannel.mo2017trySendJP2dKIU(new OooOo00.OooO0O0(fFloatValue, jOooO0o));
        o00oO0o o00oo0o2 = new o00oO0o(oooO0O0, orientation, sendChannel, z);
        return orientation == orientation2 ? OooOo.OooOO0O(oooOOO, o0oo0oo2.f39742OooO00o, o00oo0o2, continuation) : OooOo.OooO0oo(oooOOO, o0oo0oo2.f39742OooO00o, o00oo0o2, continuation);
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @NotNull
    public static final o00OOOO0 OooO0OO(@NotNull o00OOOO0 o00oooo1, @NotNull Function2<? super oOO00O, ? super Integer, ? extends o0000> stateFactory, @NotNull Function1<? super o0Oo0oo, Boolean> canDrag, @NotNull Orientation orientation, boolean z, @Nullable o000 o000Var, @NotNull Function0<Boolean> startDragImmediately, @NotNull Function3<? super CoroutineScope, ? super OooO, ? super Continuation<? super Unit>, ? extends Object> onDragStarted, @NotNull Function3<? super CoroutineScope, ? super Float, ? super Continuation<? super Unit>, ? extends Object> onDragStopped, boolean z2) {
        Intrinsics.checkNotNullParameter(o00oooo1, "<this>");
        Intrinsics.checkNotNullParameter(stateFactory, "stateFactory");
        Intrinsics.checkNotNullParameter(canDrag, "canDrag");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(startDragImmediately, "startDragImmediately");
        Intrinsics.checkNotNullParameter(onDragStarted, "onDragStarted");
        Intrinsics.checkNotNullParameter(onDragStopped, "onDragStopped");
        Function1<o00O000o, Unit> function1 = o00oOoo.f6560OooO00o;
        return o00OOO0O.OooO00o(o00oooo1, o00oOoo.f6560OooO00o, new OooO00o(stateFactory, o000Var, startDragImmediately, canDrag, onDragStarted, onDragStopped, orientation, z, z2));
    }
}
