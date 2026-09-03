package p523o0o0O0oo;

import androidx.compose.runtime.MutableState;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.composable.room.SoundRippleComp$SoundRipple$1$launcher$1$3", f = "SoundRippleComp.kt", i = {}, l = {73, 77}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nSoundRippleComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SoundRippleComp.kt\ncom/yalla/yalla/ui/composable/room/SoundRippleComp$SoundRipple$1$launcher$1$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,125:1\n1855#2,2:126\n*S KotlinDebug\n*F\n+ 1 SoundRippleComp.kt\ncom/yalla/yalla/ui/composable/room/SoundRippleComp$SoundRipple$1$launcher$1$3\n*L\n75#1:126,2\n*E\n"})
public final class oO00O0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f53162OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f53163OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public List f53164OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f53165OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public MutableState f53166OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Iterator f53167OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Float> f53168OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final /* synthetic */ List<Float> f53169OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Job> f53170OooOO0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00O0o(MutableState<Float> mutableState, List<Float> list, MutableState<Job> mutableState2, Continuation<? super oO00O0o> continuation) {
        super(2, continuation);
        this.f53168OooOO0 = mutableState;
        this.f53169OooOO0O = list;
        this.f53170OooOO0o = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oO00O0o(this.f53168OooOO0, this.f53169OooOO0O, this.f53170OooOO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oO00O0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004f  */
    /* JADX WARN: Code duplicated, block: B:18:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0081 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:? A[LOOP:0: B:16:0x0056->B:27:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004f -> B:16:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.f53162OooO
            androidx.compose.runtime.MutableState<java.lang.Float> r2 = r10.f53168OooOO0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L28
            if (r1 != r3) goto L20
            int r1 = r10.f53165OooO0o0
            int r2 = r10.f53163OooO0Oo
            java.util.Iterator r4 = r10.f53167OooO0oo
            androidx.compose.runtime.MutableState r5 = r10.f53166OooO0oO
            java.util.List r6 = r10.f53164OooO0o
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r5
            r5 = r10
            goto L56
        L20:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L28:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L43
        L2c:
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = 1061158912(0x3f400000, float:0.75)
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            r2.setValue(r11)
            r10.f53162OooO = r4
            r4 = 10
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r4, r10)
            if (r11 != r0) goto L43
            return r0
        L43:
            r11 = 3
            java.util.List<java.lang.Float> r1 = r10.f53169OooOO0O
            r4 = 0
            r6 = r1
            r1 = r4
            r4 = r10
            r9 = r2
            r2 = r11
            r11 = r9
        L4d:
            if (r1 >= r2) goto L86
            java.util.Iterator r5 = r6.iterator()
            r9 = r5
            r5 = r4
            r4 = r9
        L56:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L82
            java.lang.Object r7 = r4.next()
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r11.setValue(r7)
            r5.f53164OooO0o = r6
            r5.f53166OooO0oO = r11
            r5.f53167OooO0oo = r4
            r5.f53163OooO0Oo = r2
            r5.f53165OooO0o0 = r1
            r5.f53162OooO = r3
            r7 = 200(0xc8, double:9.9E-322)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.delay(r7, r5)
            if (r7 != r0) goto L56
            return r0
        L82:
            int r1 = r1 + 1
            r4 = r5
            goto L4d
        L86:
            r11 = 0
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            androidx.compose.runtime.MutableState<java.lang.Float> r0 = r4.f53168OooOO0
            r0.setValue(r11)
            androidx.compose.runtime.MutableState<kotlinx.coroutines.Job> r11 = r4.f53170OooOO0o
            r0 = 0
            r11.setValue(r0)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p523o0o0O0oo.oO00O0o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
