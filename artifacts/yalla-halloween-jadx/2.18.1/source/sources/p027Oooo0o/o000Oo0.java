package p027Oooo0o;

import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import com.zego.zegoliveroom.callback.IZegoLiveEventCallback;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p023Oooo00O.o00Ooo;
import p023Oooo00O.o0Oo0oo;
import p023Oooo00O.o0ooOOo;
import p025Oooo0O0.o0000O;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.lazy.LazyListScrollingKt$doSmoothScrollToItem$3", f = "LazyListScrolling.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {114, IZegoLiveEventCallback.StreamEvent.RetryPlayFail}, m = "invokeSuspend", n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", "forward"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "I$0"})
public final class o000Oo0 extends SuspendLambda implements Function2<o0000O, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public float f1940Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Ref.BooleanRef f1941Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Ref.ObjectRef f1942Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Ref.IntRef f1943Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public /* synthetic */ Object f1944OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f1945OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f1946OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f1947OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final /* synthetic */ o000O00O f1948OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final /* synthetic */ int f1949OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final /* synthetic */ int f1950o000oOoO;

    public static final class OooO00o extends Lambda implements Function1<o00Ooo<Float, o0Oo0oo>, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f1951Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ float f1952Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f1953Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0000O f1954Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ int f1955OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ float f1956OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ boolean f1957OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ Ref.IntRef f1958OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ o000O00O f1959OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<o0ooOOo<Float, o0Oo0oo>> f1960OoooOOO;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ int f1961o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(float f, Ref.FloatRef floatRef, o0000O o0000o2, Ref.BooleanRef booleanRef, boolean z, float f2, Ref.IntRef intRef, int i, o000O00O o000o00o2, int i2, Ref.ObjectRef<o0ooOOo<Float, o0Oo0oo>> objectRef) {
            super(1);
            this.f1952Oooo0o = f;
            this.f1953Oooo0oO = floatRef;
            this.f1954Oooo0oo = o0000o2;
            this.f1951Oooo = booleanRef;
            this.f1957OoooO00 = z;
            this.f1956OoooO0 = f2;
            this.f1958OoooO0O = intRef;
            this.f1955OoooO = i;
            this.f1959OoooOO0 = o000o00o2;
            this.f1961o000oOoO = i2;
            this.f1960OoooOOO = objectRef;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x0107  */
        /* JADX WARN: Code duplicated, block: B:43:0x0118 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:46:0x011d  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o00Ooo<Float, o0Oo0oo> o00ooo2) {
            o00Ooo<Float, o0Oo0oo> animateTo = o00ooo2;
            Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
            oo000o oo000oVarOooO00o = o000O00.OooO00o(this.f1959OoooOO0, this.f1955OoooO);
            if (oo000oVarOooO00o == null) {
                float fCoerceAtMost = (this.f1952Oooo0o > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE ? RangesKt.coerceAtMost(animateTo.OooO0O0().floatValue(), this.f1952Oooo0o) : RangesKt.coerceAtLeast(animateTo.OooO0O0().floatValue(), this.f1952Oooo0o)) - this.f1953Oooo0oO.element;
                float fOooO00o = this.f1954Oooo0oo.OooO00o(fCoerceAtMost);
                oo000o oo000oVarOooO00o2 = o000O00.OooO00o(this.f1959OoooOO0, this.f1955OoooO);
                if (oo000oVarOooO00o2 == null && !o000Oo0.OooO00o(this.f1957OoooO00, this.f1959OoooOO0, this.f1955OoooO, this.f1961o000oOoO)) {
                    if (fCoerceAtMost == fOooO00o) {
                        this.f1953Oooo0oO.element += fCoerceAtMost;
                        if (this.f1957OoooO00) {
                            if (animateTo.OooO0O0().floatValue() > this.f1956OoooO0) {
                                animateTo.OooO00o();
                            }
                        } else if (animateTo.OooO0O0().floatValue() < (-this.f1956OoooO0)) {
                            animateTo.OooO00o();
                        }
                        if (this.f1957OoooO00) {
                            if (this.f1958OoooO0O.element >= 2 && this.f1955OoooO - ((oo000o) CollectionsKt.last((List) this.f1959OoooOO0.OooO0oO().OooO0O0())).getIndex() > 100) {
                                this.f1959OoooOO0.OooOO0(this.f1955OoooO - 100, 0);
                            }
                        } else if (this.f1958OoooO0O.element >= 2) {
                            int index = ((oo000o) CollectionsKt.first((List) this.f1959OoooOO0.OooO0oO().OooO0O0())).getIndex();
                            int i = this.f1955OoooO;
                            if (index - i > 100) {
                                this.f1959OoooOO0.OooOO0(i + 100, 0);
                            }
                        }
                    } else {
                        animateTo.OooO00o();
                        this.f1951Oooo.element = false;
                    }
                }
                oo000oVarOooO00o = oo000oVarOooO00o2;
                if (o000Oo0.OooO00o(this.f1957OoooO00, this.f1959OoooOO0, this.f1955OoooO, this.f1961o000oOoO)) {
                    this.f1959OoooOO0.OooOO0(this.f1955OoooO, this.f1961o000oOoO);
                    this.f1951Oooo.element = false;
                    animateTo.OooO00o();
                } else if (oo000oVarOooO00o != null) {
                    throw new OooOo00(oo000oVarOooO00o, this.f1960OoooOOO.element);
                }
            } else if (o000Oo0.OooO00o(this.f1957OoooO00, this.f1959OoooOO0, this.f1955OoooO, this.f1961o000oOoO)) {
                this.f1959OoooOO0.OooOO0(this.f1955OoooO, this.f1961o000oOoO);
                this.f1951Oooo.element = false;
                animateTo.OooO00o();
            } else if (oo000oVarOooO00o != null) {
                throw new OooOo00(oo000oVarOooO00o, this.f1960OoooOOO.element);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<o00Ooo<Float, o0Oo0oo>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ float f1962Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Ref.FloatRef f1963Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ o0000O f1964Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(float f, Ref.FloatRef floatRef, o0000O o0000o2) {
            super(1);
            this.f1962Oooo0o = f;
            this.f1963Oooo0oO = floatRef;
            this.f1964Oooo0oo = o0000o2;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x005b  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(o00Ooo<Float, o0Oo0oo> o00ooo2) {
            o00Ooo<Float, o0Oo0oo> animateTo = o00ooo2;
            Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
            float f = this.f1962Oooo0o;
            float fCoerceAtLeast = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            if (f > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                fCoerceAtLeast = RangesKt.coerceAtMost(animateTo.OooO0O0().floatValue(), this.f1962Oooo0o);
            } else if (f < ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                fCoerceAtLeast = RangesKt.coerceAtLeast(animateTo.OooO0O0().floatValue(), this.f1962Oooo0o);
            }
            float f2 = fCoerceAtLeast - this.f1963Oooo0oO.element;
            if (f2 == this.f1964Oooo0oo.OooO00o(f2)) {
                if (!(fCoerceAtLeast == animateTo.OooO0O0().floatValue())) {
                    animateTo.OooO00o();
                }
            } else {
                animateTo.OooO00o();
            }
            this.f1963Oooo0oO.element += f2;
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000Oo0(o000O00O o000o00o2, int i, int i2, Continuation<? super o000Oo0> continuation) {
        super(2, continuation);
        this.f1948OoooOO0 = o000o00o2;
        this.f1950o000oOoO = i;
        this.f1949OoooOOO = i2;
    }

    public static final boolean OooO00o(boolean z, o000O00O o000o00o2, int i, int i2) {
        if (z) {
            if (o000o00o2.OooO0o0() <= i && (o000o00o2.OooO0o0() != i || o000o00o2.OooO0o() <= i2)) {
                return false;
            }
        } else if (o000o00o2.OooO0o0() >= i && (o000o00o2.OooO0o0() != i || o000o00o2.OooO0o() >= i2)) {
            return false;
        }
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o000Oo0 o000oo1 = new o000Oo0(this.f1948OoooOO0, this.f1950o000oOoO, this.f1949OoooOOO, continuation);
        o000oo1.f1944OoooO = obj;
        return o000oo1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(o0000O o0000o2, Continuation<? super Unit> continuation) {
        return ((o000Oo0) create(o0000o2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00a9 A[Catch: OooOo00 -> 0x01bb, TryCatch #3 {OooOo00 -> 0x01bb, blocks: (B:23:0x00a5, B:25:0x00a9, B:27:0x00b5, B:32:0x00d7, B:39:0x0104, B:46:0x013b, B:50:0x0144), top: B:89:0x00a5 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00c8 A[Catch: OooOo00 -> 0x01b2, TRY_ENTER, TRY_LEAVE, TryCatch #1 {OooOo00 -> 0x01b2, blocks: (B:58:0x01a5, B:30:0x00c8), top: B:85:0x01a5 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00fe A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0100  */
    /* JADX WARN: Code duplicated, block: B:41:0x0131  */
    /* JADX WARN: Code duplicated, block: B:42:0x0133  */
    /* JADX WARN: Code duplicated, block: B:44:0x0136  */
    /* JADX WARN: Code duplicated, block: B:45:0x0139  */
    /* JADX WARN: Code duplicated, block: B:48:0x013f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0142  */
    /* JADX WARN: Code duplicated, block: B:56:0x019a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x019b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [Oooo00O.o0ooOOo, T] */
    /* JADX WARN: Type inference failed for: r5v15, types: [Oooo00O.o0ooOOo, T] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x019b -> B:85:0x01a5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p027Oooo0o.o000Oo0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
