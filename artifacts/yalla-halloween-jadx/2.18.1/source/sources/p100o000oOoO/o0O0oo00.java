package p100o000oOoO;

import android.os.Trace;
import androidx.compose.runtime.Recomposer;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import p036OoooOOO.oo0o0Oo;
import p047Oooooo0.o0oOOo;
import p047Oooooo0.oo0o0O0;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {436, 454}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
public final class o0O0oo00 extends SuspendLambda implements Function3<CoroutineScope, o0O000o0, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public Set f29570Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public List f29571Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public List f29572Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public List f29573Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final /* synthetic */ Recomposer f29574OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f29575OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public Set f29576OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public /* synthetic */ o0O000o0 f29577OoooO0O;

    public static final class OooO00o extends Lambda implements Function1<Long, CancellableContinuation<? super Unit>> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Set<oo0O> f29578Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Recomposer f29579Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ List<oo0O> f29580Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ List<o0O00O> f29581Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Set<oo0O> f29582OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ List<oo0O> f29583OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Recomposer recomposer, List<oo0O> list, List<o0O00O> list2, Set<oo0O> set, List<oo0O> list3, Set<oo0O> set2) {
            super(1);
            this.f29579Oooo0o = recomposer;
            this.f29580Oooo0oO = list;
            this.f29581Oooo0oo = list2;
            this.f29578Oooo = set;
            this.f29583OoooO00 = list3;
            this.f29582OoooO0 = set2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList, java.util.List, java.util.List<o000oOoO.oo0O>] */
        /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList, java.util.List<o000oOoO.oo0O>] */
        /* JADX WARN: Type inference failed for: r12v4, types: [java.util.ArrayList, java.util.List, java.util.List<o000oOoO.oo0O>] */
        @Override // kotlin.jvm.functions.Function1
        public final CancellableContinuation<? super Unit> invoke(Long l) {
            CancellableContinuation<Unit> cancellableContinuationOooOo0O;
            boolean z;
            long jLongValue = l.longValue();
            if (this.f29579Oooo0o.f5965OooO00o.OooO00o()) {
                Recomposer recomposer = this.f29579Oooo0o;
                Intrinsics.checkNotNullParameter("Recomposer:animation", "name");
                Trace.beginSection("Recomposer:animation");
                try {
                    recomposer.f5965OooO00o.OooO0OO(jLongValue);
                    synchronized (oo0o0O0.f4158OooO0OO) {
                        Set<o0oOOo> set = oo0o0O0.f4155OooO.get().f4068OooO0oo;
                        z = set != null && (set.isEmpty() ^ true);
                    }
                    if (z) {
                        oo0o0O0.OooO00o();
                    }
                    Unit unit = Unit.INSTANCE;
                    Trace.endSection();
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            Recomposer recomposer2 = this.f29579Oooo0o;
            List<oo0O> list = this.f29580Oooo0oO;
            List<o0O00O> list2 = this.f29581Oooo0oo;
            Set<oo0O> set2 = this.f29578Oooo;
            List<oo0O> list3 = this.f29583OoooO00;
            Set<oo0O> set3 = this.f29582OoooO0;
            Intrinsics.checkNotNullParameter("Recomposer:recompose", "name");
            Trace.beginSection("Recomposer:recompose");
            try {
                synchronized (recomposer2.f5968OooO0Oo) {
                    Recomposer.OooOOoo(recomposer2);
                    ?? r0 = recomposer2.f5964OooO;
                    int size = r0.size();
                    for (int i = 0; i < size; i++) {
                        list.add((oo0O) r0.get(i));
                    }
                    recomposer2.f5964OooO.clear();
                    Unit unit2 = Unit.INSTANCE;
                }
                oo0o0Oo<Object> oo0o0oo = new oo0o0Oo<>();
                oo0o0Oo oo0o0oo2 = new oo0o0Oo();
                while (true) {
                    if (!(!list.isEmpty()) && !(!list2.isEmpty())) {
                        break;
                    }
                    try {
                        int size2 = list.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            oo0O oo0o = list.get(i2);
                            oo0o0oo2.add(oo0o);
                            oo0O oo0oOooOOo = Recomposer.OooOOo(recomposer2, oo0o, oo0o0oo);
                            if (oo0oOooOOo != null) {
                                list3.add(oo0oOooOOo);
                            }
                        }
                        list.clear();
                        if (oo0o0oo.OooO0O0()) {
                            synchronized (recomposer2.f5968OooO0Oo) {
                                ?? r12 = recomposer2.f5971OooO0oO;
                                int size3 = r12.size();
                                for (int i3 = 0; i3 < size3; i3++) {
                                    oo0O oo0o2 = (oo0O) r12.get(i3);
                                    if (!oo0o0oo2.contains(oo0o2) && oo0o2.OooO0O0(oo0o0oo)) {
                                        list.add(oo0o2);
                                    }
                                }
                                Unit unit3 = Unit.INSTANCE;
                            }
                        }
                        if (list.isEmpty()) {
                            o0O0oo00.OooO00o(list2, recomposer2);
                            while (!list2.isEmpty()) {
                                CollectionsKt.addAll(set2, recomposer2.OooOoO0(list2, oo0o0oo));
                                o0O0oo00.OooO00o(list2, recomposer2);
                            }
                        }
                    } catch (Throwable th2) {
                        list.clear();
                        throw th2;
                    }
                    Trace.endSection();
                    throw th;
                }
                if (!list3.isEmpty()) {
                    try {
                        CollectionsKt.addAll(set3, list3);
                        int size4 = list3.size();
                        for (int i4 = 0; i4 < size4; i4++) {
                            list3.get(i4).OooO0oo();
                        }
                        list3.clear();
                    } catch (Throwable th3) {
                        list3.clear();
                        throw th3;
                    }
                }
                if (!set2.isEmpty()) {
                    try {
                        CollectionsKt.addAll(set3, set2);
                        Iterator<T> it = set2.iterator();
                        while (it.hasNext()) {
                            ((oo0O) it.next()).OooO0OO();
                        }
                        set2.clear();
                    } catch (Throwable th4) {
                        set2.clear();
                        throw th4;
                    }
                }
                if (!set3.isEmpty()) {
                    try {
                        Iterator<T> it2 = set3.iterator();
                        while (it2.hasNext()) {
                            ((oo0O) it2.next()).OooOOOO();
                        }
                        set3.clear();
                    } catch (Throwable th5) {
                        set3.clear();
                        throw th5;
                    }
                }
                Recomposer.OooOOOo(recomposer2);
                synchronized (recomposer2.f5968OooO0Oo) {
                    cancellableContinuationOooOo0O = recomposer2.OooOo0O();
                }
                Trace.endSection();
                return cancellableContinuationOooOo0O;
            } catch (Throwable th6) {
                Trace.endSection();
                throw th6;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0oo00(Recomposer recomposer, Continuation<? super o0O0oo00> continuation) {
        super(3, continuation);
        this.f29574OoooO = recomposer;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List, java.util.List<o000oOoO.o0O00O>] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList, java.util.List<o000oOoO.o0O00O>] */
    public static final void OooO00o(List list, Recomposer recomposer) {
        list.clear();
        synchronized (recomposer.f5968OooO0Oo) {
            ?? r1 = recomposer.f5974OooOO0O;
            int size = r1.size();
            for (int i = 0; i < size; i++) {
                list.add((o0O00O) r1.get(i));
            }
            recomposer.f5974OooOO0O.clear();
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, o0O000o0 o0o000o1, Continuation<? super Unit> continuation) {
        o0O0oo00 o0o0oo00 = new o0O0oo00(this.f29574OoooO, continuation);
        o0o0oo00.f29577OoooO0O = o0o000o1;
        return o0o0oo00.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0072 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:16:0x0089  */
    /* JADX WARN: Code duplicated, block: B:20:0x009e A[Catch: all -> 0x00c4, TryCatch #0 {, blocks: (B:18:0x0098, B:20:0x009e, B:22:0x00ac, B:21:0x00aa), top: B:55:0x0098 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x00aa A[Catch: all -> 0x00c4, TryCatch #0 {, blocks: (B:18:0x0098, B:20:0x009e, B:22:0x00ac, B:21:0x00aa), top: B:55:0x0098 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00de A[Catch: all -> 0x0127, TRY_LEAVE, TryCatch #1 {, blocks: (B:39:0x00d7, B:41:0x00de), top: B:57:0x00d7 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:49:0x011c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x011d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00d7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00eb -> B:11:0x006d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x011d -> B:51:0x0121). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p100o000oOoO.o0O0oo00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
