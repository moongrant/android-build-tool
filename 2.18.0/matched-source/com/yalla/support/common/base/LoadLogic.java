package com.yalla.support.common.base;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LoadLogic<K, T> {

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yalla/support/common/base/LoadLogic$LoadLevel;", "", "", "level", "I", "OooO00o", "()I", "CACHE", "DISK", "ALL", "Common_release"}, k = 1, mv = {1, 7, 1})
    public enum LoadLevel {
        CACHE(1),
        DISK(2),
        ALL(3);

        private final int level;

        LoadLevel(int i) {
            this.level = i;
        }

        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final int getLevel() {
            return this.level;
        }
    }

    @DebugMetadata(c = "com.yalla.support.common.base.LoadLogic", f = "LoadLogic.kt", i = {0, 0, 1, 1, 2}, l = {57, 57, 58}, m = "localOnly", n = {"this", "key", "this", "key", "$this$localOnly_u24lambda_u2d3"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
    public static final class OooO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public Object f20478Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public int f20479OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public /* synthetic */ Object f20480OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public Object f20481OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ LoadLogic<K, T> f20482OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(LoadLogic<K, T> loadLogic, Continuation<? super OooO> continuation) {
            super(continuation);
            this.f20482OoooO0O = loadLogic;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20480OoooO0 = obj;
            this.f20479OoooO |= Integer.MIN_VALUE;
            return this.f20482OoooO0O.localOnly(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.support.common.base.LoadLogic", f = "LoadLogic.kt", i = {0, 0, 0, 1, 1, 1, 2, 3, 3, 4, 4, 4, 5}, l = {39, 41, 42, 47, 48, 49}, m = "load", n = {"this", "key", "loadLevel", "this", "key", "loadLevel", "$this$load_u24lambda_u2d1", "this", "key", "this", "key", "$this$load_u24lambda_u2d2", "$this$load_u24lambda_u2d2"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public Object f20483Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ LoadLogic<K, T> f20484OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public Object f20485OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public Object f20486OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public /* synthetic */ Object f20487OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public int f20488OoooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(LoadLogic<K, T> loadLogic, Continuation<? super OooO00o> continuation) {
            super(continuation);
            this.f20484OoooO = loadLogic;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20487OoooO0O = obj;
            this.f20488OoooOO0 |= Integer.MIN_VALUE;
            return this.f20484OoooO.load(null, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.support.common.base.LoadLogic$loadAsFlow$2", f = "LoadLogic.kt", i = {0, 1, 2, 3, 3, 4, 5, 6, 7}, l = {22, 22, 24, 25, 26, 30, 31, 32, 33}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$invokeSuspend_u24lambda_u2d1", "$this$flow", "$this$flow", "$this$invokeSuspend_u24lambda_u2d2", "$this$invokeSuspend_u24lambda_u2d2"}, s = {"L$0", "L$0", "L$0", "L$0", "L$3", "L$0", "L$0", "L$2", "L$2"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public Object f20489Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public /* synthetic */ Object f20490OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public Object f20491OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public Object f20492OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f20493OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ LoadLogic<K, T> f20494OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final /* synthetic */ LoadLevel f20495OoooOOO;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ K f20496o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(LoadLogic<K, T> loadLogic, K k, LoadLevel loadLevel, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f20494OoooOO0 = loadLogic;
            this.f20496o000oOoO = k;
            this.f20495OoooOOO = loadLevel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f20494OoooOO0, this.f20496o000oOoO, this.f20495OoooOOO, continuation);
            oooO0O0.f20490OoooO = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create((FlowCollector) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0089  */
        /* JADX WARN: Code duplicated, block: B:22:0x0093 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x009c  */
        /* JADX WARN: Code duplicated, block: B:27:0x00ab A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:29:0x00ae  */
        /* JADX WARN: Code duplicated, block: B:31:0x00c3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:32:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:35:0x00d7 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:36:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:37:0x00d9 A[PHI: r1
          0x00d9: PHI (r1v17 ??) = (r1v7 ??), (r1v10 ??), (r1v15 ??), (r1v19 ??) binds: [B:24:0x009a, B:28:0x00ac, B:36:0x00d8, B:10:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:39:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:41:0x00f0 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:43:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:45:0x0106 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:46:0x0107  */
        /* JADX WARN: Code duplicated, block: B:49:0x011b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:52:0x012c A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v19, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v20, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v29 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v30 */
        /* JADX WARN: Type inference failed for: r1v31 */
        /* JADX WARN: Type inference failed for: r1v32 */
        /* JADX WARN: Type inference failed for: r1v33 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v9, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r3v11, types: [com.yalla.support.common.base.LoadLogic] */
        /* JADX WARN: Type inference failed for: r3v16 */
        /* JADX WARN: Type inference failed for: r3v17 */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v7 */
        /* JADX WARN: Type inference failed for: r3v8, types: [com.yalla.support.common.base.LoadLogic, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v3, types: [com.yalla.support.common.base.LoadLogic] */
        /* JADX WARN: Type inference failed for: r5v8 */
        /* JADX WARN: Type inference failed for: r5v9 */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r6v6 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ?? r1;
            LoadLogic<K, T> loadLogic;
            K k;
            ?? r6;
            Object obj2;
            ?? r5;
            ?? r2;
            LoadLogic<K, T> loadLogic2;
            K k2;
            Object obj3;
            ?? r3;
            Object obj4;
            Object objSyncCache;
            ?? r4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.f20493OoooO0O) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector = (FlowCollector) this.f20490OoooO;
                    LoadLogic<K, T> loadLogic3 = this.f20494OoooOO0;
                    K k3 = this.f20496o000oOoO;
                    this.f20490OoooO = flowCollector;
                    this.f20493OoooO0O = 1;
                    Object objLoadFromCache = loadLogic3.loadFromCache(k3, this);
                    if (objLoadFromCache == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r1 = flowCollector;
                    obj = objLoadFromCache;
                    if (obj != null) {
                        this.f20490OoooO = r1;
                        this.f20493OoooO0O = 2;
                        if (r1.emit(obj, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    if (this.f20495OoooOOO.getLevel() > 1) {
                        LoadLogic<K, T> loadLogic4 = this.f20494OoooOO0;
                        K k4 = this.f20496o000oOoO;
                        this.f20490OoooO = r1;
                        this.f20493OoooO0O = 3;
                        obj = loadLogic4.loadFromDisk(k4, this);
                        if (obj == coroutine_suspended) {
                            r1 = r1;
                            return coroutine_suspended;
                        }
                        if (obj != null) {
                            loadLogic = this.f20494OoooOO0;
                            k = this.f20496o000oOoO;
                            this.f20490OoooO = r1;
                            this.f20489Oooo = loadLogic;
                            this.f20492OoooO00 = k;
                            this.f20491OoooO0 = obj;
                            this.f20493OoooO0O = 4;
                            if (r1.emit(obj, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r6 = r1;
                            obj2 = obj;
                            r5 = loadLogic;
                            this.f20490OoooO = r6;
                            this.f20489Oooo = null;
                            this.f20492OoooO00 = null;
                            this.f20491OoooO0 = null;
                            this.f20493OoooO0O = 5;
                            if (r5.syncCache(k, obj2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r1 = r6;
                            if (this.f20495OoooOOO.getLevel() > 2) {
                                LoadLogic<K, T> loadLogic5 = this.f20494OoooOO0;
                                K k5 = this.f20496o000oOoO;
                                this.f20490OoooO = r1;
                                this.f20493OoooO0O = 6;
                                obj = loadLogic5.fetchFromNet(k5, this);
                                if (obj == coroutine_suspended) {
                                    r2 = r1;
                                    return coroutine_suspended;
                                }
                                if (obj != null) {
                                    loadLogic2 = this.f20494OoooOO0;
                                    k2 = this.f20496o000oOoO;
                                    this.f20490OoooO = loadLogic2;
                                    this.f20489Oooo = k2;
                                    this.f20492OoooO00 = obj;
                                    this.f20493OoooO0O = 7;
                                    if (r2.emit(obj, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    obj3 = obj;
                                    r3 = loadLogic2;
                                    obj4 = k2;
                                    this.f20490OoooO = r3;
                                    this.f20489Oooo = obj4;
                                    this.f20492OoooO00 = obj3;
                                    this.f20493OoooO0O = 8;
                                    objSyncCache = r3.syncCache(obj4, obj3, this);
                                    r4 = r3;
                                    if (objSyncCache == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    this.f20490OoooO = null;
                                    this.f20489Oooo = null;
                                    this.f20492OoooO00 = null;
                                    this.f20493OoooO0O = 9;
                                    if (r4.saveToDisk(obj4, obj3, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                        } else if (this.f20495OoooOOO.getLevel() > 2) {
                            LoadLogic<K, T> loadLogic6 = this.f20494OoooOO0;
                            K k6 = this.f20496o000oOoO;
                            this.f20490OoooO = r1;
                            this.f20493OoooO0O = 6;
                            obj = loadLogic6.fetchFromNet(k6, this);
                            if (obj == coroutine_suspended) {
                                r2 = r1;
                                return coroutine_suspended;
                            }
                            if (obj != null) {
                                loadLogic2 = this.f20494OoooOO0;
                                k2 = this.f20496o000oOoO;
                                this.f20490OoooO = loadLogic2;
                                this.f20489Oooo = k2;
                                this.f20492OoooO00 = obj;
                                this.f20493OoooO0O = 7;
                                if (r2.emit(obj, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj3 = obj;
                                r3 = loadLogic2;
                                obj4 = k2;
                                this.f20490OoooO = r3;
                                this.f20489Oooo = obj4;
                                this.f20492OoooO00 = obj3;
                                this.f20493OoooO0O = 8;
                                objSyncCache = r3.syncCache(obj4, obj3, this);
                                r4 = r3;
                                if (objSyncCache == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                this.f20490OoooO = null;
                                this.f20489Oooo = null;
                                this.f20492OoooO00 = null;
                                this.f20493OoooO0O = 9;
                                if (r4.saveToDisk(obj4, obj3, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                    } else if (this.f20495OoooOOO.getLevel() > 2) {
                        LoadLogic<K, T> loadLogic7 = this.f20494OoooOO0;
                        K k7 = this.f20496o000oOoO;
                        this.f20490OoooO = r1;
                        this.f20493OoooO0O = 6;
                        obj = loadLogic7.fetchFromNet(k7, this);
                        if (obj == coroutine_suspended) {
                            r2 = r1;
                            return coroutine_suspended;
                        }
                        if (obj != null) {
                            loadLogic2 = this.f20494OoooOO0;
                            k2 = this.f20496o000oOoO;
                            this.f20490OoooO = loadLogic2;
                            this.f20489Oooo = k2;
                            this.f20492OoooO00 = obj;
                            this.f20493OoooO0O = 7;
                            if (r2.emit(obj, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj3 = obj;
                            r3 = loadLogic2;
                            obj4 = k2;
                            this.f20490OoooO = r3;
                            this.f20489Oooo = obj4;
                            this.f20492OoooO00 = obj3;
                            this.f20493OoooO0O = 8;
                            objSyncCache = r3.syncCache(obj4, obj3, this);
                            r4 = r3;
                            if (objSyncCache == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.f20490OoooO = null;
                            this.f20489Oooo = null;
                            this.f20492OoooO00 = null;
                            this.f20493OoooO0O = 9;
                            if (r4.saveToDisk(obj4, obj3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 1:
                    FlowCollector flowCollector2 = (FlowCollector) this.f20490OoooO;
                    ResultKt.throwOnFailure(obj);
                    r1 = flowCollector2;
                    if (obj != null) {
                        this.f20490OoooO = r1;
                        this.f20493OoooO0O = 2;
                        if (r1.emit(obj, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    if (this.f20495OoooOOO.getLevel() > 1) {
                        LoadLogic<K, T> loadLogic8 = this.f20494OoooOO0;
                        K k8 = this.f20496o000oOoO;
                        this.f20490OoooO = r1;
                        this.f20493OoooO0O = 3;
                        obj = loadLogic8.loadFromDisk(k8, this);
                        if (obj == coroutine_suspended) {
                            r1 = r1;
                            return coroutine_suspended;
                        }
                        if (obj != null) {
                            loadLogic = this.f20494OoooOO0;
                            k = this.f20496o000oOoO;
                            this.f20490OoooO = r1;
                            this.f20489Oooo = loadLogic;
                            this.f20492OoooO00 = k;
                            this.f20491OoooO0 = obj;
                            this.f20493OoooO0O = 4;
                            if (r1.emit(obj, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r6 = r1;
                            obj2 = obj;
                            r5 = loadLogic;
                            this.f20490OoooO = r6;
                            this.f20489Oooo = null;
                            this.f20492OoooO00 = null;
                            this.f20491OoooO0 = null;
                            this.f20493OoooO0O = 5;
                            if (r5.syncCache(k, obj2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r1 = r6;
                            if (this.f20495OoooOOO.getLevel() > 2) {
                                LoadLogic<K, T> loadLogic9 = this.f20494OoooOO0;
                                K k9 = this.f20496o000oOoO;
                                this.f20490OoooO = r1;
                                this.f20493OoooO0O = 6;
                                obj = loadLogic9.fetchFromNet(k9, this);
                                if (obj == coroutine_suspended) {
                                    r2 = r1;
                                    return coroutine_suspended;
                                }
                                if (obj != null) {
                                    loadLogic2 = this.f20494OoooOO0;
                                    k2 = this.f20496o000oOoO;
                                    this.f20490OoooO = loadLogic2;
                                    this.f20489Oooo = k2;
                                    this.f20492OoooO00 = obj;
                                    this.f20493OoooO0O = 7;
                                    if (r2.emit(obj, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    obj3 = obj;
                                    r3 = loadLogic2;
                                    obj4 = k2;
                                    this.f20490OoooO = r3;
                                    this.f20489Oooo = obj4;
                                    this.f20492OoooO00 = obj3;
                                    this.f20493OoooO0O = 8;
                                    objSyncCache = r3.syncCache(obj4, obj3, this);
                                    r4 = r3;
                                    if (objSyncCache == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    this.f20490OoooO = null;
                                    this.f20489Oooo = null;
                                    this.f20492OoooO00 = null;
                                    this.f20493OoooO0O = 9;
                                    if (r4.saveToDisk(obj4, obj3, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                        } else if (this.f20495OoooOOO.getLevel() > 2) {
                            LoadLogic<K, T> loadLogic10 = this.f20494OoooOO0;
                            K k10 = this.f20496o000oOoO;
                            this.f20490OoooO = r1;
                            this.f20493OoooO0O = 6;
                            obj = loadLogic10.fetchFromNet(k10, this);
                            if (obj == coroutine_suspended) {
                                r2 = r1;
                                return coroutine_suspended;
                            }
                            if (obj != null) {
                                loadLogic2 = this.f20494OoooOO0;
                                k2 = this.f20496o000oOoO;
                                this.f20490OoooO = loadLogic2;
                                this.f20489Oooo = k2;
                                this.f20492OoooO00 = obj;
                                this.f20493OoooO0O = 7;
                                if (r2.emit(obj, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj3 = obj;
                                r3 = loadLogic2;
                                obj4 = k2;
                                this.f20490OoooO = r3;
                                this.f20489Oooo = obj4;
                                this.f20492OoooO00 = obj3;
                                this.f20493OoooO0O = 8;
                                objSyncCache = r3.syncCache(obj4, obj3, this);
                                r4 = r3;
                                if (objSyncCache == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                this.f20490OoooO = null;
                                this.f20489Oooo = null;
                                this.f20492OoooO00 = null;
                                this.f20493OoooO0O = 9;
                                if (r4.saveToDisk(obj4, obj3, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                    } else if (this.f20495OoooOOO.getLevel() > 2) {
                        LoadLogic<K, T> loadLogic11 = this.f20494OoooOO0;
                        K k11 = this.f20496o000oOoO;
                        this.f20490OoooO = r1;
                        this.f20493OoooO0O = 6;
                        obj = loadLogic11.fetchFromNet(k11, this);
                        if (obj == coroutine_suspended) {
                            r2 = r1;
                            return coroutine_suspended;
                        }
                        if (obj != null) {
                            loadLogic2 = this.f20494OoooOO0;
                            k2 = this.f20496o000oOoO;
                            this.f20490OoooO = loadLogic2;
                            this.f20489Oooo = k2;
                            this.f20492OoooO00 = obj;
                            this.f20493OoooO0O = 7;
                            if (r2.emit(obj, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj3 = obj;
                            r3 = loadLogic2;
                            obj4 = k2;
                            this.f20490OoooO = r3;
                            this.f20489Oooo = obj4;
                            this.f20492OoooO00 = obj3;
                            this.f20493OoooO0O = 8;
                            objSyncCache = r3.syncCache(obj4, obj3, this);
                            r4 = r3;
                            if (objSyncCache == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.f20490OoooO = null;
                            this.f20489Oooo = null;
                            this.f20492OoooO00 = null;
                            this.f20493OoooO0O = 9;
                            if (r4.saveToDisk(obj4, obj3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 2:
                    r1 = (FlowCollector) this.f20490OoooO;
                    ResultKt.throwOnFailure(obj);
                    if (this.f20495OoooOOO.getLevel() > 1) {
                        LoadLogic<K, T> loadLogic12 = this.f20494OoooOO0;
                        K k12 = this.f20496o000oOoO;
                        this.f20490OoooO = r1;
                        this.f20493OoooO0O = 3;
                        obj = loadLogic12.loadFromDisk(k12, this);
                        if (obj == coroutine_suspended) {
                            r1 = r1;
                            return coroutine_suspended;
                        }
                        if (obj != null) {
                            loadLogic = this.f20494OoooOO0;
                            k = this.f20496o000oOoO;
                            this.f20490OoooO = r1;
                            this.f20489Oooo = loadLogic;
                            this.f20492OoooO00 = k;
                            this.f20491OoooO0 = obj;
                            this.f20493OoooO0O = 4;
                            if (r1.emit(obj, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r6 = r1;
                            obj2 = obj;
                            r5 = loadLogic;
                            this.f20490OoooO = r6;
                            this.f20489Oooo = null;
                            this.f20492OoooO00 = null;
                            this.f20491OoooO0 = null;
                            this.f20493OoooO0O = 5;
                            if (r5.syncCache(k, obj2, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            r1 = r6;
                            if (this.f20495OoooOOO.getLevel() > 2) {
                                LoadLogic<K, T> loadLogic13 = this.f20494OoooOO0;
                                K k13 = this.f20496o000oOoO;
                                this.f20490OoooO = r1;
                                this.f20493OoooO0O = 6;
                                obj = loadLogic13.fetchFromNet(k13, this);
                                if (obj == coroutine_suspended) {
                                    r2 = r1;
                                    return coroutine_suspended;
                                }
                                if (obj != null) {
                                    loadLogic2 = this.f20494OoooOO0;
                                    k2 = this.f20496o000oOoO;
                                    this.f20490OoooO = loadLogic2;
                                    this.f20489Oooo = k2;
                                    this.f20492OoooO00 = obj;
                                    this.f20493OoooO0O = 7;
                                    if (r2.emit(obj, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    obj3 = obj;
                                    r3 = loadLogic2;
                                    obj4 = k2;
                                    this.f20490OoooO = r3;
                                    this.f20489Oooo = obj4;
                                    this.f20492OoooO00 = obj3;
                                    this.f20493OoooO0O = 8;
                                    objSyncCache = r3.syncCache(obj4, obj3, this);
                                    r4 = r3;
                                    if (objSyncCache == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    this.f20490OoooO = null;
                                    this.f20489Oooo = null;
                                    this.f20492OoooO00 = null;
                                    this.f20493OoooO0O = 9;
                                    if (r4.saveToDisk(obj4, obj3, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            }
                        } else if (this.f20495OoooOOO.getLevel() > 2) {
                            LoadLogic<K, T> loadLogic14 = this.f20494OoooOO0;
                            K k14 = this.f20496o000oOoO;
                            this.f20490OoooO = r1;
                            this.f20493OoooO0O = 6;
                            obj = loadLogic14.fetchFromNet(k14, this);
                            if (obj == coroutine_suspended) {
                                r2 = r1;
                                return coroutine_suspended;
                            }
                            if (obj != null) {
                                loadLogic2 = this.f20494OoooOO0;
                                k2 = this.f20496o000oOoO;
                                this.f20490OoooO = loadLogic2;
                                this.f20489Oooo = k2;
                                this.f20492OoooO00 = obj;
                                this.f20493OoooO0O = 7;
                                if (r2.emit(obj, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj3 = obj;
                                r3 = loadLogic2;
                                obj4 = k2;
                                this.f20490OoooO = r3;
                                this.f20489Oooo = obj4;
                                this.f20492OoooO00 = obj3;
                                this.f20493OoooO0O = 8;
                                objSyncCache = r3.syncCache(obj4, obj3, this);
                                r4 = r3;
                                if (objSyncCache == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                this.f20490OoooO = null;
                                this.f20489Oooo = null;
                                this.f20492OoooO00 = null;
                                this.f20493OoooO0O = 9;
                                if (r4.saveToDisk(obj4, obj3, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                    } else if (this.f20495OoooOOO.getLevel() > 2) {
                        LoadLogic<K, T> loadLogic15 = this.f20494OoooOO0;
                        K k15 = this.f20496o000oOoO;
                        this.f20490OoooO = r1;
                        this.f20493OoooO0O = 6;
                        obj = loadLogic15.fetchFromNet(k15, this);
                        if (obj == coroutine_suspended) {
                            r2 = r1;
                            return coroutine_suspended;
                        }
                        if (obj != null) {
                            loadLogic2 = this.f20494OoooOO0;
                            k2 = this.f20496o000oOoO;
                            this.f20490OoooO = loadLogic2;
                            this.f20489Oooo = k2;
                            this.f20492OoooO00 = obj;
                            this.f20493OoooO0O = 7;
                            if (r2.emit(obj, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj3 = obj;
                            r3 = loadLogic2;
                            obj4 = k2;
                            this.f20490OoooO = r3;
                            this.f20489Oooo = obj4;
                            this.f20492OoooO00 = obj3;
                            this.f20493OoooO0O = 8;
                            objSyncCache = r3.syncCache(obj4, obj3, this);
                            r4 = r3;
                            if (objSyncCache == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.f20490OoooO = null;
                            this.f20489Oooo = null;
                            this.f20492OoooO00 = null;
                            this.f20493OoooO0O = 9;
                            if (r4.saveToDisk(obj4, obj3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 3:
                    FlowCollector flowCollector3 = (FlowCollector) this.f20490OoooO;
                    ResultKt.throwOnFailure(obj);
                    r1 = flowCollector3;
                    if (obj != null) {
                        loadLogic = this.f20494OoooOO0;
                        k = this.f20496o000oOoO;
                        this.f20490OoooO = r1;
                        this.f20489Oooo = loadLogic;
                        this.f20492OoooO00 = k;
                        this.f20491OoooO0 = obj;
                        this.f20493OoooO0O = 4;
                        if (r1.emit(obj, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r6 = r1;
                        obj2 = obj;
                        r5 = loadLogic;
                        this.f20490OoooO = r6;
                        this.f20489Oooo = null;
                        this.f20492OoooO00 = null;
                        this.f20491OoooO0 = null;
                        this.f20493OoooO0O = 5;
                        if (r5.syncCache(k, obj2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r1 = r6;
                        if (this.f20495OoooOOO.getLevel() > 2) {
                            LoadLogic<K, T> loadLogic16 = this.f20494OoooOO0;
                            K k16 = this.f20496o000oOoO;
                            this.f20490OoooO = r1;
                            this.f20493OoooO0O = 6;
                            obj = loadLogic16.fetchFromNet(k16, this);
                            if (obj == coroutine_suspended) {
                                r2 = r1;
                                return coroutine_suspended;
                            }
                            if (obj != null) {
                                loadLogic2 = this.f20494OoooOO0;
                                k2 = this.f20496o000oOoO;
                                this.f20490OoooO = loadLogic2;
                                this.f20489Oooo = k2;
                                this.f20492OoooO00 = obj;
                                this.f20493OoooO0O = 7;
                                if (r2.emit(obj, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                obj3 = obj;
                                r3 = loadLogic2;
                                obj4 = k2;
                                this.f20490OoooO = r3;
                                this.f20489Oooo = obj4;
                                this.f20492OoooO00 = obj3;
                                this.f20493OoooO0O = 8;
                                objSyncCache = r3.syncCache(obj4, obj3, this);
                                r4 = r3;
                                if (objSyncCache == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                this.f20490OoooO = null;
                                this.f20489Oooo = null;
                                this.f20492OoooO00 = null;
                                this.f20493OoooO0O = 9;
                                if (r4.saveToDisk(obj4, obj3, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        }
                    } else if (this.f20495OoooOOO.getLevel() > 2) {
                        LoadLogic<K, T> loadLogic17 = this.f20494OoooOO0;
                        K k17 = this.f20496o000oOoO;
                        this.f20490OoooO = r1;
                        this.f20493OoooO0O = 6;
                        obj = loadLogic17.fetchFromNet(k17, this);
                        if (obj == coroutine_suspended) {
                            r2 = r1;
                            return coroutine_suspended;
                        }
                        if (obj != null) {
                            loadLogic2 = this.f20494OoooOO0;
                            k2 = this.f20496o000oOoO;
                            this.f20490OoooO = loadLogic2;
                            this.f20489Oooo = k2;
                            this.f20492OoooO00 = obj;
                            this.f20493OoooO0O = 7;
                            if (r2.emit(obj, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj3 = obj;
                            r3 = loadLogic2;
                            obj4 = k2;
                            this.f20490OoooO = r3;
                            this.f20489Oooo = obj4;
                            this.f20492OoooO00 = obj3;
                            this.f20493OoooO0O = 8;
                            objSyncCache = r3.syncCache(obj4, obj3, this);
                            r4 = r3;
                            if (objSyncCache == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.f20490OoooO = null;
                            this.f20489Oooo = null;
                            this.f20492OoooO00 = null;
                            this.f20493OoooO0O = 9;
                            if (r4.saveToDisk(obj4, obj3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 4:
                    obj2 = this.f20491OoooO0;
                    k = (K) this.f20492OoooO00;
                    boolean z = (LoadLogic<K, T>) ((LoadLogic) this.f20489Oooo);
                    FlowCollector flowCollector4 = (FlowCollector) this.f20490OoooO;
                    ResultKt.throwOnFailure(obj);
                    r5 = z;
                    r6 = flowCollector4;
                    this.f20490OoooO = r6;
                    this.f20489Oooo = null;
                    this.f20492OoooO00 = null;
                    this.f20491OoooO0 = null;
                    this.f20493OoooO0O = 5;
                    if (r5.syncCache(k, obj2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r1 = r6;
                    if (this.f20495OoooOOO.getLevel() > 2) {
                        LoadLogic<K, T> loadLogic18 = this.f20494OoooOO0;
                        K k18 = this.f20496o000oOoO;
                        this.f20490OoooO = r1;
                        this.f20493OoooO0O = 6;
                        obj = loadLogic18.fetchFromNet(k18, this);
                        if (obj == coroutine_suspended) {
                            r2 = r1;
                            return coroutine_suspended;
                        }
                        if (obj != null) {
                            loadLogic2 = this.f20494OoooOO0;
                            k2 = this.f20496o000oOoO;
                            this.f20490OoooO = loadLogic2;
                            this.f20489Oooo = k2;
                            this.f20492OoooO00 = obj;
                            this.f20493OoooO0O = 7;
                            if (r2.emit(obj, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj3 = obj;
                            r3 = loadLogic2;
                            obj4 = k2;
                            this.f20490OoooO = r3;
                            this.f20489Oooo = obj4;
                            this.f20492OoooO00 = obj3;
                            this.f20493OoooO0O = 8;
                            objSyncCache = r3.syncCache(obj4, obj3, this);
                            r4 = r3;
                            if (objSyncCache == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.f20490OoooO = null;
                            this.f20489Oooo = null;
                            this.f20492OoooO00 = null;
                            this.f20493OoooO0O = 9;
                            if (r4.saveToDisk(obj4, obj3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 5:
                    r1 = (FlowCollector) this.f20490OoooO;
                    ResultKt.throwOnFailure(obj);
                    if (this.f20495OoooOOO.getLevel() > 2) {
                        LoadLogic<K, T> loadLogic19 = this.f20494OoooOO0;
                        K k19 = this.f20496o000oOoO;
                        this.f20490OoooO = r1;
                        this.f20493OoooO0O = 6;
                        obj = loadLogic19.fetchFromNet(k19, this);
                        if (obj == coroutine_suspended) {
                            r2 = r1;
                            return coroutine_suspended;
                        }
                        if (obj != null) {
                            loadLogic2 = this.f20494OoooOO0;
                            k2 = this.f20496o000oOoO;
                            this.f20490OoooO = loadLogic2;
                            this.f20489Oooo = k2;
                            this.f20492OoooO00 = obj;
                            this.f20493OoooO0O = 7;
                            if (r2.emit(obj, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj3 = obj;
                            r3 = loadLogic2;
                            obj4 = k2;
                            this.f20490OoooO = r3;
                            this.f20489Oooo = obj4;
                            this.f20492OoooO00 = obj3;
                            this.f20493OoooO0O = 8;
                            objSyncCache = r3.syncCache(obj4, obj3, this);
                            r4 = r3;
                            if (objSyncCache == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            this.f20490OoooO = null;
                            this.f20489Oooo = null;
                            this.f20492OoooO00 = null;
                            this.f20493OoooO0O = 9;
                            if (r4.saveToDisk(obj4, obj3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    return Unit.INSTANCE;
                case 6:
                    FlowCollector flowCollector5 = (FlowCollector) this.f20490OoooO;
                    ResultKt.throwOnFailure(obj);
                    r2 = flowCollector5;
                    if (obj != null) {
                        loadLogic2 = this.f20494OoooOO0;
                        k2 = this.f20496o000oOoO;
                        this.f20490OoooO = loadLogic2;
                        this.f20489Oooo = k2;
                        this.f20492OoooO00 = obj;
                        this.f20493OoooO0O = 7;
                        if (r2.emit(obj, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj3 = obj;
                        r3 = loadLogic2;
                        obj4 = k2;
                        this.f20490OoooO = r3;
                        this.f20489Oooo = obj4;
                        this.f20492OoooO00 = obj3;
                        this.f20493OoooO0O = 8;
                        objSyncCache = r3.syncCache(obj4, obj3, this);
                        r4 = r3;
                        if (objSyncCache == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        this.f20490OoooO = null;
                        this.f20489Oooo = null;
                        this.f20492OoooO00 = null;
                        this.f20493OoooO0O = 9;
                        if (r4.saveToDisk(obj4, obj3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                case 7:
                    obj3 = this.f20492OoooO00;
                    obj4 = this.f20489Oooo;
                    LoadLogic loadLogic20 = (LoadLogic) this.f20490OoooO;
                    ResultKt.throwOnFailure(obj);
                    r3 = loadLogic20;
                    this.f20490OoooO = r3;
                    this.f20489Oooo = obj4;
                    this.f20492OoooO00 = obj3;
                    this.f20493OoooO0O = 8;
                    objSyncCache = r3.syncCache(obj4, obj3, this);
                    r4 = r3;
                    if (objSyncCache == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.f20490OoooO = null;
                    this.f20489Oooo = null;
                    this.f20492OoooO00 = null;
                    this.f20493OoooO0O = 9;
                    if (r4.saveToDisk(obj4, obj3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 8:
                    obj3 = this.f20492OoooO00;
                    obj4 = this.f20489Oooo;
                    LoadLogic loadLogic21 = (LoadLogic) this.f20490OoooO;
                    ResultKt.throwOnFailure(obj);
                    r4 = loadLogic21;
                    this.f20490OoooO = null;
                    this.f20489Oooo = null;
                    this.f20492OoooO00 = null;
                    this.f20493OoooO0O = 9;
                    if (r4.saveToDisk(obj4, obj3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 9:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @DebugMetadata(c = "com.yalla.support.common.base.LoadLogic", f = "LoadLogic.kt", i = {0, 0, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 5}, l = {64, 64, 65, 68, 70, 71}, m = "localFirst", n = {"this", "key", "this", "key", "this", "key", "$this$localFirst_u24lambda_u2d4", "this", "key", "this", "key", "netResult", "$this$localFirst_u24lambda_u2d6_u24lambda_u2d5", "netResult"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0"})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public Object f20497Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public /* synthetic */ Object f20498OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public Object f20499OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public Object f20500OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public Object f20501OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public final /* synthetic */ LoadLogic<K, T> f20502OoooOO0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public int f20503o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(LoadLogic<K, T> loadLogic, Continuation<? super OooO0OO> continuation) {
            super(continuation);
            this.f20502OoooOO0 = loadLogic;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20498OoooO = obj;
            this.f20503o000oOoO |= Integer.MIN_VALUE;
            return this.f20502OoooOO0.localFirst(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.support.common.base.LoadLogic$localFirstAsFlow$2", f = "LoadLogic.kt", i = {0, 1, 2, 3, 3, 4, 5, 6, 6, 6, 7, 7}, l = {78, 79, 80, 81, 82, 84, 86, 87, 89}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow", "$this$invokeSuspend_u24lambda_u2d1", "$this$flow", "$this$flow", "$this$flow", "netData", "$this$invokeSuspend_u24lambda_u2d2", "$this$flow", "netData"}, s = {"L$0", "L$0", "L$0", "L$0", "L$1", "L$0", "L$0", "L$0", "L$1", "L$4", "L$0", "L$1"})
    public static final class OooO0o extends SuspendLambda implements Function2<FlowCollector<? super T>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public Object f20504Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public int f20505OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public Object f20506OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public LoadLogic f20507OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public Object f20508OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public /* synthetic */ Object f20509OoooOO0;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public final /* synthetic */ K f20510OoooOOO;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public final /* synthetic */ LoadLogic<K, T> f20511o000oOoO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(LoadLogic<K, T> loadLogic, K k, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f20511o000oOoO = loadLogic;
            this.f20510OoooOOO = k;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f20511o000oOoO, this.f20510OoooOOO, continuation);
            oooO0o.f20509OoooOO0 = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return ((OooO0o) create((FlowCollector) obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v25, types: [kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v27 */
        /* JADX WARN: Type inference failed for: r1v29 */
        /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r1v30 */
        /* JADX WARN: Type inference failed for: r1v31 */
        /* JADX WARN: Type inference failed for: r1v32 */
        /* JADX WARN: Type inference failed for: r1v33 */
        /* JADX WARN: Type inference failed for: r1v34 */
        /* JADX WARN: Type inference failed for: r1v35 */
        /* JADX WARN: Type inference failed for: r1v36 */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r3v10 */
        /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v13 */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v17 */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v19 */
        /* JADX WARN: Type inference failed for: r3v20 */
        /* JADX WARN: Type inference failed for: r3v21 */
        /* JADX WARN: Type inference failed for: r3v22 */
        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
        /* JADX WARN: Type inference failed for: r5v3 */
        /* JADX WARN: Type inference failed for: r5v4, types: [com.yalla.support.common.base.LoadLogic] */
        /* JADX WARN: Type inference failed for: r5v6 */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to com.yalla.support.common.base.LoadLogic$OooO0o for r7v2 'this'  kotlin.coroutines.Continuation
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                Method dump skipped, instruction units count: 302
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yalla.support.common.base.LoadLogic.OooO0o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.yalla.support.common.base.LoadLogic", f = "LoadLogic.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4}, l = {93, 94, 95, 98, 99}, m = "netFirst", n = {"this", "key", "this", "key", "$this$netFirst_u24lambda_u2d7", "this", "key", "$this$netFirst_u24lambda_u2d7", "this", "key", "$this$netFirst_u24lambda_u2d9_u24lambda_u2d8"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
    public static final class OooOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public Object f20512Oooo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ LoadLogic<K, T> f20513OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public Object f20514OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public Object f20515OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public /* synthetic */ Object f20516OoooO0O;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public int f20517OoooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(LoadLogic<K, T> loadLogic, Continuation<? super OooOO0> continuation) {
            super(continuation);
            this.f20513OoooO = loadLogic;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f20516OoooO0O = obj;
            this.f20517OoooOO0 |= Integer.MIN_VALUE;
            return this.f20513OoooO.netFirst(null, this);
        }
    }

    public static /* synthetic */ Object load$default(LoadLogic loadLogic, Object obj, LoadLevel loadLevel, Continuation continuation, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
        }
        if ((i & 2) != 0) {
            loadLevel = LoadLevel.ALL;
        }
        return loadLogic.load(obj, loadLevel, continuation);
    }

    public static /* synthetic */ Object loadAsFlow$default(LoadLogic loadLogic, Object obj, LoadLevel loadLevel, Continuation continuation, int i, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadAsFlow");
        }
        if ((i & 2) != 0) {
            loadLevel = LoadLevel.ALL;
        }
        return loadLogic.loadAsFlow(obj, loadLevel, continuation);
    }

    @Nullable
    public abstract Object fetchFromNet(K k, @NotNull Continuation<? super T> continuation);

    /* JADX WARN: Code duplicated, block: B:24:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e  */
    /* JADX WARN: Code duplicated, block: B:29:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b7 A[PHI: r2 r8 r9
      0x00b7: PHI (r2v5 ??) = (r2v19 ??), (r2v20 ??) binds: [B:26:0x008c, B:37:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r8v5 java.lang.Object) = (r8v26 java.lang.Object), (r8v7 java.lang.Object) binds: [B:26:0x008c, B:37:0x00b4] A[DONT_GENERATE, DONT_INLINE]
      0x00b7: PHI (r9v5 com.yalla.support.common.base.LoadLogic$LoadLevel) = (r9v1 com.yalla.support.common.base.LoadLogic$LoadLevel), (r9v9 com.yalla.support.common.base.LoadLogic$LoadLevel) binds: [B:26:0x008c, B:37:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [com.yalla.support.common.base.LoadLogic] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.yalla.support.common.base.LoadLogic, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.yalla.support.common.base.LoadLogic, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [com.yalla.support.common.base.LoadLogic] */
    /* JADX WARN: Type inference failed for: r2v9, types: [com.yalla.support.common.base.LoadLogic, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.yalla.support.common.base.LoadLogic, com.yalla.support.common.base.LoadLogic<K, T>, java.lang.Object] */
    @Nullable
    public final Object load(K k, @NotNull LoadLevel loadLevel, @NotNull Continuation<? super T> continuation) {
        OooO00o oooO00o;
        ?? r2;
        K k2;
        Object obj;
        LoadLevel loadLevel2;
        Object obj2;
        ?? r3;
        ?? r4;
        Object obj3;
        ?? r5;
        Object obj4;
        Object obj5;
        Object obj6;
        ?? r6;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f20488OoooOO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f20488OoooOO0 = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(this, continuation);
            }
        } else {
            oooO00o = new OooO00o(this, continuation);
        }
        Object objLoadFromCache = oooO00o.f20487OoooO0O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (oooO00o.f20488OoooOO0) {
            case 0:
                ResultKt.throwOnFailure(objLoadFromCache);
                oooO00o.f20483Oooo = this;
                oooO00o.f20486OoooO00 = k;
                oooO00o.f20485OoooO0 = loadLevel;
                oooO00o.f20488OoooOO0 = 1;
                objLoadFromCache = loadFromCache(k, oooO00o);
                if (objLoadFromCache == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r2 = this;
                if (objLoadFromCache != null) {
                    k2 = k;
                    return objLoadFromCache;
                }
                k2 = k;
                if (loadLevel.getLevel() > 1) {
                    oooO00o.f20483Oooo = r2;
                    oooO00o.f20486OoooO00 = k2;
                    oooO00o.f20485OoooO0 = loadLevel;
                    oooO00o.f20488OoooOO0 = 2;
                    objLoadFromCache = r2.loadFromDisk(k2, oooO00o);
                    if (objLoadFromCache == coroutine_suspended) {
                        r3 = r2;
                        obj2 = k2;
                        return coroutine_suspended;
                    }
                    LoadLevel loadLevel3 = loadLevel;
                    obj = k2;
                    loadLevel2 = loadLevel3;
                    if (objLoadFromCache != null) {
                        r3 = r2;
                        obj2 = k2;
                        r4 = r2;
                        oooO00o.f20483Oooo = objLoadFromCache;
                        oooO00o.f20486OoooO00 = null;
                        oooO00o.f20485OoooO0 = null;
                        oooO00o.f20488OoooOO0 = 3;
                        if (r4.syncCache(obj, objLoadFromCache, oooO00o) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return objLoadFromCache;
                    }
                    r3 = r2;
                    obj2 = k2;
                    r4 = r2;
                    Object obj7 = obj;
                    loadLevel = loadLevel2;
                    obj2 = obj7;
                    r3 = r4;
                    r3 = r2;
                    obj2 = k2;
                    if (loadLevel.getLevel() > 2) {
                        oooO00o.f20483Oooo = r3;
                        oooO00o.f20486OoooO00 = obj2;
                        oooO00o.f20485OoooO0 = null;
                        oooO00o.f20488OoooOO0 = 4;
                        objLoadFromCache = r3.fetchFromNet(obj2, oooO00o);
                        if (objLoadFromCache == coroutine_suspended) {
                            r5 = r3;
                            obj3 = obj2;
                            return coroutine_suspended;
                        }
                        r5 = r3;
                        obj3 = obj2;
                        obj4 = obj3;
                        if (objLoadFromCache != null) {
                            oooO00o.f20483Oooo = r5;
                            oooO00o.f20486OoooO00 = obj4;
                            oooO00o.f20485OoooO0 = objLoadFromCache;
                            oooO00o.f20488OoooOO0 = 5;
                            if (r5.syncCache(obj4, objLoadFromCache, oooO00o) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj5 = objLoadFromCache;
                            r6 = r5;
                            obj6 = obj4;
                            oooO00o.f20483Oooo = obj5;
                            oooO00o.f20486OoooO00 = null;
                            oooO00o.f20485OoooO0 = null;
                            oooO00o.f20488OoooOO0 = 6;
                            if (r6.saveToDisk(obj6, obj5, oooO00o) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return obj5;
                        }
                    }
                } else {
                    r3 = r2;
                    obj2 = k2;
                    if (loadLevel.getLevel() > 2) {
                        oooO00o.f20483Oooo = r3;
                        oooO00o.f20486OoooO00 = obj2;
                        oooO00o.f20485OoooO0 = null;
                        oooO00o.f20488OoooOO0 = 4;
                        objLoadFromCache = r3.fetchFromNet(obj2, oooO00o);
                        if (objLoadFromCache == coroutine_suspended) {
                            r5 = r3;
                            obj3 = obj2;
                            return coroutine_suspended;
                        }
                        r5 = r3;
                        obj3 = obj2;
                        obj4 = obj3;
                        if (objLoadFromCache != null) {
                            oooO00o.f20483Oooo = r5;
                            oooO00o.f20486OoooO00 = obj4;
                            oooO00o.f20485OoooO0 = objLoadFromCache;
                            oooO00o.f20488OoooOO0 = 5;
                            if (r5.syncCache(obj4, objLoadFromCache, oooO00o) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj5 = objLoadFromCache;
                            r6 = r5;
                            obj6 = obj4;
                            oooO00o.f20483Oooo = obj5;
                            oooO00o.f20486OoooO00 = null;
                            oooO00o.f20485OoooO0 = null;
                            oooO00o.f20488OoooOO0 = 6;
                            if (r6.saveToDisk(obj6, obj5, oooO00o) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return obj5;
                        }
                    }
                }
                return null;
            case 1:
                loadLevel = (LoadLevel) oooO00o.f20485OoooO0;
                K k3 = (K) oooO00o.f20486OoooO00;
                LoadLogic loadLogic = (LoadLogic) oooO00o.f20483Oooo;
                ResultKt.throwOnFailure(objLoadFromCache);
                r2 = loadLogic;
                k2 = k3;
                if (objLoadFromCache != null) {
                    k2 = k;
                    return objLoadFromCache;
                }
                k2 = k;
                if (loadLevel.getLevel() > 1) {
                    oooO00o.f20483Oooo = r2;
                    oooO00o.f20486OoooO00 = k2;
                    oooO00o.f20485OoooO0 = loadLevel;
                    oooO00o.f20488OoooOO0 = 2;
                    objLoadFromCache = r2.loadFromDisk(k2, oooO00o);
                    if (objLoadFromCache == coroutine_suspended) {
                        r3 = r2;
                        obj2 = k2;
                        return coroutine_suspended;
                    }
                    LoadLevel loadLevel4 = loadLevel;
                    obj = k2;
                    loadLevel2 = loadLevel4;
                    if (objLoadFromCache != null) {
                        r3 = r2;
                        obj2 = k2;
                        r4 = r2;
                        oooO00o.f20483Oooo = objLoadFromCache;
                        oooO00o.f20486OoooO00 = null;
                        oooO00o.f20485OoooO0 = null;
                        oooO00o.f20488OoooOO0 = 3;
                        if (r4.syncCache(obj, objLoadFromCache, oooO00o) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return objLoadFromCache;
                    }
                    r3 = r2;
                    obj2 = k2;
                    r4 = r2;
                    Object obj8 = obj;
                    loadLevel = loadLevel2;
                    obj2 = obj8;
                    r3 = r4;
                    r3 = r2;
                    obj2 = k2;
                    if (loadLevel.getLevel() > 2) {
                        oooO00o.f20483Oooo = r3;
                        oooO00o.f20486OoooO00 = obj2;
                        oooO00o.f20485OoooO0 = null;
                        oooO00o.f20488OoooOO0 = 4;
                        objLoadFromCache = r3.fetchFromNet(obj2, oooO00o);
                        if (objLoadFromCache == coroutine_suspended) {
                            r5 = r3;
                            obj3 = obj2;
                            return coroutine_suspended;
                        }
                        r5 = r3;
                        obj3 = obj2;
                        obj4 = obj3;
                        if (objLoadFromCache != null) {
                            oooO00o.f20483Oooo = r5;
                            oooO00o.f20486OoooO00 = obj4;
                            oooO00o.f20485OoooO0 = objLoadFromCache;
                            oooO00o.f20488OoooOO0 = 5;
                            if (r5.syncCache(obj4, objLoadFromCache, oooO00o) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj5 = objLoadFromCache;
                            r6 = r5;
                            obj6 = obj4;
                            oooO00o.f20483Oooo = obj5;
                            oooO00o.f20486OoooO00 = null;
                            oooO00o.f20485OoooO0 = null;
                            oooO00o.f20488OoooOO0 = 6;
                            if (r6.saveToDisk(obj6, obj5, oooO00o) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return obj5;
                        }
                    }
                } else {
                    r3 = r2;
                    obj2 = k2;
                    if (loadLevel.getLevel() > 2) {
                        oooO00o.f20483Oooo = r3;
                        oooO00o.f20486OoooO00 = obj2;
                        oooO00o.f20485OoooO0 = null;
                        oooO00o.f20488OoooOO0 = 4;
                        objLoadFromCache = r3.fetchFromNet(obj2, oooO00o);
                        if (objLoadFromCache == coroutine_suspended) {
                            r5 = r3;
                            obj3 = obj2;
                            return coroutine_suspended;
                        }
                        r5 = r3;
                        obj3 = obj2;
                        obj4 = obj3;
                        if (objLoadFromCache != null) {
                            oooO00o.f20483Oooo = r5;
                            oooO00o.f20486OoooO00 = obj4;
                            oooO00o.f20485OoooO0 = objLoadFromCache;
                            oooO00o.f20488OoooOO0 = 5;
                            if (r5.syncCache(obj4, objLoadFromCache, oooO00o) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj5 = objLoadFromCache;
                            r6 = r5;
                            obj6 = obj4;
                            oooO00o.f20483Oooo = obj5;
                            oooO00o.f20486OoooO00 = null;
                            oooO00o.f20485OoooO0 = null;
                            oooO00o.f20488OoooOO0 = 6;
                            if (r6.saveToDisk(obj6, obj5, oooO00o) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return obj5;
                        }
                    }
                }
                return null;
            case 2:
                loadLevel2 = (LoadLevel) oooO00o.f20485OoooO0;
                Object obj9 = oooO00o.f20486OoooO00;
                LoadLogic loadLogic2 = (LoadLogic) oooO00o.f20483Oooo;
                ResultKt.throwOnFailure(objLoadFromCache);
                r4 = loadLogic2;
                obj = obj9;
                if (objLoadFromCache != null) {
                    r3 = r2;
                    obj2 = k2;
                    r4 = r2;
                    oooO00o.f20483Oooo = objLoadFromCache;
                    oooO00o.f20486OoooO00 = null;
                    oooO00o.f20485OoooO0 = null;
                    oooO00o.f20488OoooOO0 = 3;
                    if (r4.syncCache(obj, objLoadFromCache, oooO00o) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objLoadFromCache;
                }
                r3 = r2;
                obj2 = k2;
                r4 = r2;
                Object obj10 = obj;
                loadLevel = loadLevel2;
                obj2 = obj10;
                r3 = r4;
                r3 = r2;
                obj2 = k2;
                if (loadLevel.getLevel() > 2) {
                    oooO00o.f20483Oooo = r3;
                    oooO00o.f20486OoooO00 = obj2;
                    oooO00o.f20485OoooO0 = null;
                    oooO00o.f20488OoooOO0 = 4;
                    objLoadFromCache = r3.fetchFromNet(obj2, oooO00o);
                    if (objLoadFromCache == coroutine_suspended) {
                        r5 = r3;
                        obj3 = obj2;
                        return coroutine_suspended;
                    }
                    r5 = r3;
                    obj3 = obj2;
                    obj4 = obj3;
                    if (objLoadFromCache != null) {
                        oooO00o.f20483Oooo = r5;
                        oooO00o.f20486OoooO00 = obj4;
                        oooO00o.f20485OoooO0 = objLoadFromCache;
                        oooO00o.f20488OoooOO0 = 5;
                        if (r5.syncCache(obj4, objLoadFromCache, oooO00o) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj5 = objLoadFromCache;
                        r6 = r5;
                        obj6 = obj4;
                        oooO00o.f20483Oooo = obj5;
                        oooO00o.f20486OoooO00 = null;
                        oooO00o.f20485OoooO0 = null;
                        oooO00o.f20488OoooOO0 = 6;
                        if (r6.saveToDisk(obj6, obj5, oooO00o) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return obj5;
                    }
                }
                return null;
            case 3:
                Object obj11 = oooO00o.f20483Oooo;
                ResultKt.throwOnFailure(objLoadFromCache);
                return obj11;
            case 4:
                Object obj12 = oooO00o.f20486OoooO00;
                LoadLogic loadLogic3 = (LoadLogic) oooO00o.f20483Oooo;
                ResultKt.throwOnFailure(objLoadFromCache);
                r5 = loadLogic3;
                obj3 = obj12;
                r5 = r3;
                obj3 = obj2;
                obj4 = obj3;
                if (objLoadFromCache != null) {
                    oooO00o.f20483Oooo = r5;
                    oooO00o.f20486OoooO00 = obj4;
                    oooO00o.f20485OoooO0 = objLoadFromCache;
                    oooO00o.f20488OoooOO0 = 5;
                    if (r5.syncCache(obj4, objLoadFromCache, oooO00o) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj5 = objLoadFromCache;
                    r6 = r5;
                    obj6 = obj4;
                    oooO00o.f20483Oooo = obj5;
                    oooO00o.f20486OoooO00 = null;
                    oooO00o.f20485OoooO0 = null;
                    oooO00o.f20488OoooOO0 = 6;
                    if (r6.saveToDisk(obj6, obj5, oooO00o) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return obj5;
                }
                return null;
            case 5:
                obj5 = oooO00o.f20485OoooO0;
                Object obj13 = oooO00o.f20486OoooO00;
                LoadLogic loadLogic4 = (LoadLogic) oooO00o.f20483Oooo;
                ResultKt.throwOnFailure(objLoadFromCache);
                r6 = loadLogic4;
                obj6 = obj13;
                oooO00o.f20483Oooo = obj5;
                oooO00o.f20486OoooO00 = null;
                oooO00o.f20485OoooO0 = null;
                oooO00o.f20488OoooOO0 = 6;
                if (r6.saveToDisk(obj6, obj5, oooO00o) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return obj5;
            case 6:
                Object obj14 = oooO00o.f20483Oooo;
                ResultKt.throwOnFailure(objLoadFromCache);
                return obj14;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Nullable
    public final Object loadAsFlow(K k, @NotNull LoadLevel loadLevel, @NotNull Continuation<? super Flow<? extends T>> continuation) {
        return FlowKt.flow(new OooO0O0(this, k, loadLevel, null));
    }

    @Nullable
    public abstract Object loadFromCache(K k, @NotNull Continuation<? super T> continuation);

    @Nullable
    public abstract Object loadFromDisk(K k, @NotNull Continuation<? super T> continuation);

    /* JADX WARN: Code duplicated, block: B:24:0x0086  */
    /* JADX WARN: Code duplicated, block: B:26:0x0093 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0096  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.yalla.support.common.base.LoadLogic, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.yalla.support.common.base.LoadLogic, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.yalla.support.common.base.LoadLogic, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.yalla.support.common.base.LoadLogic, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.yalla.support.common.base.LoadLogic] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.yalla.support.common.base.LoadLogic, com.yalla.support.common.base.LoadLogic<K, T>, java.lang.Object] */
    @Nullable
    public final Object localFirst(K k, @NotNull Continuation<? super T> continuation) {
        OooO0OO oooO0OO;
        ?? r2;
        K k2;
        Object obj;
        ?? r3;
        ?? r4;
        Object obj2;
        Object obj3;
        Object obj4;
        ?? r5;
        Object obj5;
        ?? r6;
        Object obj6;
        ?? r7;
        Object obj7;
        Object obj8;
        ?? r8;
        Object obj9;
        Object obj10;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f20503o000oOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f20503o000oOoO = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(this, continuation);
            }
        } else {
            oooO0OO = new OooO0OO(this, continuation);
        }
        Object objLoadFromCache = oooO0OO.f20498OoooO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (oooO0OO.f20503o000oOoO) {
            case 0:
                ResultKt.throwOnFailure(objLoadFromCache);
                oooO0OO.f20497Oooo = this;
                oooO0OO.f20500OoooO00 = k;
                oooO0OO.f20503o000oOoO = 1;
                objLoadFromCache = loadFromCache(k, oooO0OO);
                if (objLoadFromCache == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r2 = this;
                if (objLoadFromCache == null) {
                    k2 = k;
                    return objLoadFromCache;
                }
                k2 = k;
                oooO0OO.f20497Oooo = r2;
                oooO0OO.f20500OoooO00 = k2;
                oooO0OO.f20503o000oOoO = 2;
                objLoadFromCache = r2.loadFromDisk(k2, oooO0OO);
                if (objLoadFromCache == coroutine_suspended) {
                    r3 = r2;
                    obj = k2;
                    return coroutine_suspended;
                }
                r3 = r2;
                obj = k2;
                r4 = r3;
                obj2 = obj;
                if (objLoadFromCache != null) {
                    oooO0OO.f20497Oooo = r4;
                    oooO0OO.f20500OoooO00 = obj2;
                    oooO0OO.f20499OoooO0 = objLoadFromCache;
                    oooO0OO.f20503o000oOoO = 3;
                    if (r4.syncCache(obj2, objLoadFromCache, oooO0OO) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj4 = objLoadFromCache;
                    obj7 = obj2;
                    r7 = r4;
                    obj3 = obj4;
                    obj5 = obj7;
                    r5 = r7;
                } else {
                    obj3 = null;
                }
                if (obj3 == null) {
                    obj5 = obj2;
                    r5 = r4;
                    return obj3;
                }
                obj5 = obj2;
                r5 = r4;
                oooO0OO.f20497Oooo = r5;
                oooO0OO.f20500OoooO00 = obj5;
                oooO0OO.f20499OoooO0 = null;
                oooO0OO.f20503o000oOoO = 4;
                objLoadFromCache = r5.fetchFromNet(obj5, oooO0OO);
                if (objLoadFromCache == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r6 = r5;
                obj6 = obj5;
                if (objLoadFromCache == null) {
                    return objLoadFromCache;
                }
                oooO0OO.f20497Oooo = r6;
                oooO0OO.f20500OoooO00 = obj6;
                oooO0OO.f20499OoooO0 = objLoadFromCache;
                oooO0OO.f20501OoooO0O = objLoadFromCache;
                oooO0OO.f20503o000oOoO = 5;
                if (r6.syncCache(obj6, objLoadFromCache, oooO0OO) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj8 = objLoadFromCache;
                obj9 = obj6;
                r8 = r6;
                oooO0OO.f20497Oooo = objLoadFromCache;
                oooO0OO.f20500OoooO00 = null;
                oooO0OO.f20499OoooO0 = null;
                oooO0OO.f20501OoooO0O = null;
                oooO0OO.f20503o000oOoO = 6;
                if (r8.saveToDisk(obj9, obj8, oooO0OO) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj10 = objLoadFromCache;
                return obj10;
            case 1:
                K k3 = (K) oooO0OO.f20500OoooO00;
                LoadLogic loadLogic = (LoadLogic) oooO0OO.f20497Oooo;
                ResultKt.throwOnFailure(objLoadFromCache);
                r2 = loadLogic;
                k2 = k3;
                if (objLoadFromCache == null) {
                    k2 = k;
                    return objLoadFromCache;
                }
                k2 = k;
                oooO0OO.f20497Oooo = r2;
                oooO0OO.f20500OoooO00 = k2;
                oooO0OO.f20503o000oOoO = 2;
                objLoadFromCache = r2.loadFromDisk(k2, oooO0OO);
                if (objLoadFromCache == coroutine_suspended) {
                    r3 = r2;
                    obj = k2;
                    return coroutine_suspended;
                }
                r3 = r2;
                obj = k2;
                r4 = r3;
                obj2 = obj;
                if (objLoadFromCache != null) {
                    oooO0OO.f20497Oooo = r4;
                    oooO0OO.f20500OoooO00 = obj2;
                    oooO0OO.f20499OoooO0 = objLoadFromCache;
                    oooO0OO.f20503o000oOoO = 3;
                    if (r4.syncCache(obj2, objLoadFromCache, oooO0OO) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj4 = objLoadFromCache;
                    obj7 = obj2;
                    r7 = r4;
                    obj3 = obj4;
                    obj5 = obj7;
                    r5 = r7;
                } else {
                    obj3 = null;
                }
                if (obj3 == null) {
                    obj5 = obj2;
                    r5 = r4;
                    return obj3;
                }
                obj5 = obj2;
                r5 = r4;
                oooO0OO.f20497Oooo = r5;
                oooO0OO.f20500OoooO00 = obj5;
                oooO0OO.f20499OoooO0 = null;
                oooO0OO.f20503o000oOoO = 4;
                objLoadFromCache = r5.fetchFromNet(obj5, oooO0OO);
                if (objLoadFromCache == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r6 = r5;
                obj6 = obj5;
                if (objLoadFromCache == null) {
                    return objLoadFromCache;
                }
                oooO0OO.f20497Oooo = r6;
                oooO0OO.f20500OoooO00 = obj6;
                oooO0OO.f20499OoooO0 = objLoadFromCache;
                oooO0OO.f20501OoooO0O = objLoadFromCache;
                oooO0OO.f20503o000oOoO = 5;
                if (r6.syncCache(obj6, objLoadFromCache, oooO0OO) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj8 = objLoadFromCache;
                obj9 = obj6;
                r8 = r6;
                oooO0OO.f20497Oooo = objLoadFromCache;
                oooO0OO.f20500OoooO00 = null;
                oooO0OO.f20499OoooO0 = null;
                oooO0OO.f20501OoooO0O = null;
                oooO0OO.f20503o000oOoO = 6;
                if (r8.saveToDisk(obj9, obj8, oooO0OO) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj10 = objLoadFromCache;
                return obj10;
            case 2:
                Object obj11 = oooO0OO.f20500OoooO00;
                LoadLogic loadLogic2 = (LoadLogic) oooO0OO.f20497Oooo;
                ResultKt.throwOnFailure(objLoadFromCache);
                r3 = loadLogic2;
                obj = obj11;
                r3 = r2;
                obj = k2;
                r4 = r3;
                obj2 = obj;
                if (objLoadFromCache != null) {
                    oooO0OO.f20497Oooo = r4;
                    oooO0OO.f20500OoooO00 = obj2;
                    oooO0OO.f20499OoooO0 = objLoadFromCache;
                    oooO0OO.f20503o000oOoO = 3;
                    if (r4.syncCache(obj2, objLoadFromCache, oooO0OO) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj4 = objLoadFromCache;
                    obj7 = obj2;
                    r7 = r4;
                    obj3 = obj4;
                    obj5 = obj7;
                    r5 = r7;
                } else {
                    obj3 = null;
                }
                if (obj3 == null) {
                    obj5 = obj2;
                    r5 = r4;
                    return obj3;
                }
                obj5 = obj2;
                r5 = r4;
                oooO0OO.f20497Oooo = r5;
                oooO0OO.f20500OoooO00 = obj5;
                oooO0OO.f20499OoooO0 = null;
                oooO0OO.f20503o000oOoO = 4;
                objLoadFromCache = r5.fetchFromNet(obj5, oooO0OO);
                if (objLoadFromCache == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r6 = r5;
                obj6 = obj5;
                if (objLoadFromCache == null) {
                    return objLoadFromCache;
                }
                oooO0OO.f20497Oooo = r6;
                oooO0OO.f20500OoooO00 = obj6;
                oooO0OO.f20499OoooO0 = objLoadFromCache;
                oooO0OO.f20501OoooO0O = objLoadFromCache;
                oooO0OO.f20503o000oOoO = 5;
                if (r6.syncCache(obj6, objLoadFromCache, oooO0OO) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj8 = objLoadFromCache;
                obj9 = obj6;
                r8 = r6;
                oooO0OO.f20497Oooo = objLoadFromCache;
                oooO0OO.f20500OoooO00 = null;
                oooO0OO.f20499OoooO0 = null;
                oooO0OO.f20501OoooO0O = null;
                oooO0OO.f20503o000oOoO = 6;
                if (r8.saveToDisk(obj9, obj8, oooO0OO) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj10 = objLoadFromCache;
                return obj10;
            case 3:
                obj4 = oooO0OO.f20499OoooO0;
                Object obj12 = oooO0OO.f20500OoooO00;
                LoadLogic loadLogic3 = (LoadLogic) oooO0OO.f20497Oooo;
                ResultKt.throwOnFailure(objLoadFromCache);
                obj7 = obj12;
                r7 = loadLogic3;
                obj3 = obj4;
                obj5 = obj7;
                r5 = r7;
                if (obj3 == null) {
                    obj5 = obj2;
                    r5 = r4;
                    return obj3;
                }
                obj5 = obj2;
                r5 = r4;
                oooO0OO.f20497Oooo = r5;
                oooO0OO.f20500OoooO00 = obj5;
                oooO0OO.f20499OoooO0 = null;
                oooO0OO.f20503o000oOoO = 4;
                objLoadFromCache = r5.fetchFromNet(obj5, oooO0OO);
                if (objLoadFromCache == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r6 = r5;
                obj6 = obj5;
                if (objLoadFromCache == null) {
                    return objLoadFromCache;
                }
                oooO0OO.f20497Oooo = r6;
                oooO0OO.f20500OoooO00 = obj6;
                oooO0OO.f20499OoooO0 = objLoadFromCache;
                oooO0OO.f20501OoooO0O = objLoadFromCache;
                oooO0OO.f20503o000oOoO = 5;
                if (r6.syncCache(obj6, objLoadFromCache, oooO0OO) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj8 = objLoadFromCache;
                obj9 = obj6;
                r8 = r6;
                oooO0OO.f20497Oooo = objLoadFromCache;
                oooO0OO.f20500OoooO00 = null;
                oooO0OO.f20499OoooO0 = null;
                oooO0OO.f20501OoooO0O = null;
                oooO0OO.f20503o000oOoO = 6;
                if (r8.saveToDisk(obj9, obj8, oooO0OO) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj10 = objLoadFromCache;
                return obj10;
            case 4:
                Object obj13 = oooO0OO.f20500OoooO00;
                LoadLogic loadLogic4 = (LoadLogic) oooO0OO.f20497Oooo;
                ResultKt.throwOnFailure(objLoadFromCache);
                obj6 = obj13;
                r6 = loadLogic4;
                if (objLoadFromCache == null) {
                    return objLoadFromCache;
                }
                oooO0OO.f20497Oooo = r6;
                oooO0OO.f20500OoooO00 = obj6;
                oooO0OO.f20499OoooO0 = objLoadFromCache;
                oooO0OO.f20501OoooO0O = objLoadFromCache;
                oooO0OO.f20503o000oOoO = 5;
                if (r6.syncCache(obj6, objLoadFromCache, oooO0OO) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj8 = objLoadFromCache;
                obj9 = obj6;
                r8 = r6;
                oooO0OO.f20497Oooo = objLoadFromCache;
                oooO0OO.f20500OoooO00 = null;
                oooO0OO.f20499OoooO0 = null;
                oooO0OO.f20501OoooO0O = null;
                oooO0OO.f20503o000oOoO = 6;
                if (r8.saveToDisk(obj9, obj8, oooO0OO) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj10 = objLoadFromCache;
                return obj10;
            case 5:
                obj8 = oooO0OO.f20501OoooO0O;
                Object obj14 = oooO0OO.f20499OoooO0;
                Object obj15 = oooO0OO.f20500OoooO00;
                LoadLogic loadLogic5 = (LoadLogic) oooO0OO.f20497Oooo;
                ResultKt.throwOnFailure(objLoadFromCache);
                objLoadFromCache = obj14;
                obj9 = obj15;
                r8 = loadLogic5;
                oooO0OO.f20497Oooo = objLoadFromCache;
                oooO0OO.f20500OoooO00 = null;
                oooO0OO.f20499OoooO0 = null;
                oooO0OO.f20501OoooO0O = null;
                oooO0OO.f20503o000oOoO = 6;
                if (r8.saveToDisk(obj9, obj8, oooO0OO) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj10 = objLoadFromCache;
                return obj10;
            case 6:
                obj10 = oooO0OO.f20497Oooo;
                ResultKt.throwOnFailure(objLoadFromCache);
                return obj10;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Nullable
    public final Object localFirstAsFlow(K k, @NotNull Continuation<? super Flow<? extends T>> continuation) {
        return FlowKt.flow(new OooO0o(this, k, null));
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:29:0x007d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object localOnly(K k, @NotNull Continuation<? super T> continuation) {
        OooO oooO;
        LoadLogic loadLogic;
        K k2;
        Object obj;
        LoadLogic loadLogic2;
        K k3;
        LoadLogic loadLogic3;
        Object obj2;
        LoadLogic loadLogic4;
        if (continuation instanceof OooO) {
            oooO = (OooO) continuation;
            int i = oooO.f20479OoooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO.f20479OoooO = i - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(this, continuation);
            }
        } else {
            oooO = new OooO(this, continuation);
        }
        Object objLoadFromCache = oooO.f20480OoooO0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO.f20479OoooO;
        if (i2 != 0) {
            if (i2 == 1) {
                k3 = (K) oooO.f20481OoooO00;
                loadLogic3 = (LoadLogic) oooO.f20478Oooo;
                ResultKt.throwOnFailure(objLoadFromCache);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj3 = oooO.f20478Oooo;
                    ResultKt.throwOnFailure(objLoadFromCache);
                    return obj3;
                }
                obj2 = oooO.f20481OoooO00;
                loadLogic4 = (LoadLogic) oooO.f20478Oooo;
                ResultKt.throwOnFailure(objLoadFromCache);
            }
            if (objLoadFromCache != null) {
                loadLogic2 = loadLogic4;
                obj = obj2;
                return null;
            }
            oooO.f20478Oooo = objLoadFromCache;
            oooO.f20481OoooO00 = null;
            oooO.f20479OoooO = 3;
            if (loadLogic2.syncCache(obj, objLoadFromCache, oooO) == coroutine_suspended) {
                loadLogic2 = loadLogic4;
                obj = obj2;
                return coroutine_suspended;
            }
            k2 = k;
            loadLogic = loadLogic3;
            k2 = k3;
            loadLogic2 = loadLogic4;
            obj = obj2;
            return objLoadFromCache;
        }
        ResultKt.throwOnFailure(objLoadFromCache);
        oooO.f20478Oooo = this;
        oooO.f20481OoooO00 = k;
        oooO.f20479OoooO = 1;
        objLoadFromCache = loadFromCache(k, oooO);
        if (objLoadFromCache == coroutine_suspended) {
            return coroutine_suspended;
        }
        loadLogic = this;
        if (objLoadFromCache == null) {
            k2 = k;
            oooO.f20478Oooo = loadLogic;
            oooO.f20481OoooO00 = k2;
            oooO.f20479OoooO = 2;
            objLoadFromCache = loadLogic.loadFromDisk(k2, oooO);
            if (objLoadFromCache == coroutine_suspended) {
                loadLogic = loadLogic3;
                k2 = k3;
                loadLogic2 = loadLogic;
                obj = k2;
                return coroutine_suspended;
            }
            if (objLoadFromCache != null) {
                loadLogic2 = loadLogic4;
                obj = obj2;
                return null;
            }
            oooO.f20478Oooo = objLoadFromCache;
            oooO.f20481OoooO00 = null;
            oooO.f20479OoooO = 3;
            if (loadLogic2.syncCache(obj, objLoadFromCache, oooO) == coroutine_suspended) {
                loadLogic2 = loadLogic4;
                obj = obj2;
                return coroutine_suspended;
            }
        }
        k2 = k;
        loadLogic = loadLogic3;
        k2 = k3;
        loadLogic2 = loadLogic4;
        obj = obj2;
        return objLoadFromCache;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.yalla.support.common.base.LoadLogic, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.yalla.support.common.base.LoadLogic, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.yalla.support.common.base.LoadLogic] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.yalla.support.common.base.LoadLogic, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.yalla.support.common.base.LoadLogic, com.yalla.support.common.base.LoadLogic<K, T>, java.lang.Object] */
    @Nullable
    public final Object netFirst(K k, @NotNull Continuation<? super T> continuation) {
        OooOO0 oooOO1;
        ?? r2;
        Object obj;
        ?? r6;
        Object obj2;
        Object obj3;
        ?? r5;
        Object obj4;
        Object obj5;
        ?? r3;
        Object obj6;
        LoadLogic loadLogic;
        Object obj7;
        LoadLogic loadLogic2;
        Object obj8;
        LoadLogic loadLogic3;
        if (continuation instanceof OooOO0) {
            oooOO1 = (OooOO0) continuation;
            int i = oooOO1.f20517OoooOO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO1.f20517OoooOO0 = i - Integer.MIN_VALUE;
            } else {
                oooOO1 = new OooOO0(this, continuation);
            }
        } else {
            oooOO1 = new OooOO0(this, continuation);
        }
        Object objFetchFromNet = oooOO1.f20516OoooO0O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOO1.f20517OoooOO0;
        Object obj9 = null;
        if (i2 != 0) {
            if (i2 == 1) {
                obj6 = (K) oooOO1.f20515OoooO00;
                loadLogic = (LoadLogic) oooOO1.f20512Oooo;
                ResultKt.throwOnFailure(objFetchFromNet);
            } else if (i2 == 2) {
                obj3 = oooOO1.f20514OoooO0;
                Object obj10 = oooOO1.f20515OoooO00;
                LoadLogic loadLogic4 = (LoadLogic) oooOO1.f20512Oooo;
                ResultKt.throwOnFailure(objFetchFromNet);
                obj2 = obj10;
                r6 = loadLogic4;
                oooOO1.f20512Oooo = r6;
                oooOO1.f20515OoooO00 = obj2;
                oooOO1.f20514OoooO0 = obj3;
                oooOO1.f20517OoooOO0 = 3;
                if (r6.saveToDisk(obj2, obj3, oooOO1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                r5 = r6;
                if (obj3 != null) {
                    obj4 = obj2;
                    obj4 = obj7;
                    r5 = loadLogic2;
                    return obj3;
                }
                obj4 = obj2;
                obj4 = obj7;
                r5 = loadLogic2;
                obj = obj4;
                r2 = r5;
                obj = k;
                r2 = loadLogic;
                obj = obj6;
                oooOO1.f20512Oooo = r2;
                oooOO1.f20515OoooO00 = obj;
                oooOO1.f20514OoooO0 = null;
                oooOO1.f20517OoooOO0 = 4;
                objFetchFromNet = r2.loadFromDisk(obj, oooOO1);
                r3 = r2;
                obj5 = obj;
                if (objFetchFromNet == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (objFetchFromNet != null) {
                    oooOO1.f20512Oooo = objFetchFromNet;
                    oooOO1.f20515OoooO00 = null;
                    oooOO1.f20517OoooOO0 = 5;
                    if (r3.syncCache(obj5, objFetchFromNet, oooOO1) == coroutine_suspended) {
                        r3 = loadLogic3;
                        obj5 = obj8;
                        return coroutine_suspended;
                    }
                    r3 = loadLogic3;
                    obj5 = obj8;
                    obj9 = objFetchFromNet;
                }
            } else if (i2 == 3) {
                obj3 = oooOO1.f20514OoooO0;
                obj7 = oooOO1.f20515OoooO00;
                loadLogic2 = (LoadLogic) oooOO1.f20512Oooo;
                ResultKt.throwOnFailure(objFetchFromNet);
                if (obj3 != null) {
                    obj4 = obj2;
                    obj4 = obj7;
                    r5 = loadLogic2;
                    return obj3;
                }
                obj4 = obj2;
                obj4 = obj7;
                r5 = loadLogic2;
                obj = obj4;
                r2 = r5;
                obj = k;
                r2 = loadLogic;
                obj = obj6;
                oooOO1.f20512Oooo = r2;
                oooOO1.f20515OoooO00 = obj;
                oooOO1.f20514OoooO0 = null;
                oooOO1.f20517OoooOO0 = 4;
                objFetchFromNet = r2.loadFromDisk(obj, oooOO1);
                r3 = r2;
                obj5 = obj;
                if (objFetchFromNet == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (objFetchFromNet != null) {
                    oooOO1.f20512Oooo = objFetchFromNet;
                    oooOO1.f20515OoooO00 = null;
                    oooOO1.f20517OoooOO0 = 5;
                    if (r3.syncCache(obj5, objFetchFromNet, oooOO1) == coroutine_suspended) {
                        r3 = loadLogic3;
                        obj5 = obj8;
                        return coroutine_suspended;
                    }
                    r3 = loadLogic3;
                    obj5 = obj8;
                    obj9 = objFetchFromNet;
                }
            } else if (i2 == 4) {
                obj8 = oooOO1.f20515OoooO00;
                loadLogic3 = (LoadLogic) oooOO1.f20512Oooo;
                ResultKt.throwOnFailure(objFetchFromNet);
                if (objFetchFromNet != null) {
                    oooOO1.f20512Oooo = objFetchFromNet;
                    oooOO1.f20515OoooO00 = null;
                    oooOO1.f20517OoooOO0 = 5;
                    if (r3.syncCache(obj5, objFetchFromNet, oooOO1) == coroutine_suspended) {
                        r3 = loadLogic3;
                        obj5 = obj8;
                        return coroutine_suspended;
                    }
                    r3 = loadLogic3;
                    obj5 = obj8;
                    obj9 = objFetchFromNet;
                }
            } else {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj11 = oooOO1.f20512Oooo;
                ResultKt.throwOnFailure(objFetchFromNet);
                obj9 = obj11;
            }
            r3 = loadLogic3;
            obj5 = obj8;
            return obj9;
        }
        ResultKt.throwOnFailure(objFetchFromNet);
        oooOO1.f20512Oooo = this;
        oooOO1.f20515OoooO00 = k;
        oooOO1.f20517OoooOO0 = 1;
        objFetchFromNet = fetchFromNet(k, oooOO1);
        if (objFetchFromNet == coroutine_suspended) {
            return coroutine_suspended;
        }
        r2 = this;
        if (objFetchFromNet != null) {
            obj = k;
            oooOO1.f20512Oooo = r2;
            oooOO1.f20515OoooO00 = obj;
            oooOO1.f20514OoooO0 = objFetchFromNet;
            oooOO1.f20517OoooOO0 = 2;
            if (r2.syncCache(obj, objFetchFromNet, oooOO1) == coroutine_suspended) {
                r2 = loadLogic;
                obj = obj6;
                return coroutine_suspended;
            }
            r2 = loadLogic;
            obj = obj6;
            r6 = r2;
            obj2 = obj;
            obj3 = objFetchFromNet;
            oooOO1.f20512Oooo = r6;
            oooOO1.f20515OoooO00 = obj2;
            oooOO1.f20514OoooO0 = obj3;
            oooOO1.f20517OoooOO0 = 3;
            if (r6.saveToDisk(obj2, obj3, oooOO1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            r5 = r6;
            if (obj3 != null) {
                obj4 = obj2;
                obj4 = obj7;
                r5 = loadLogic2;
                return obj3;
            }
            obj4 = obj2;
            obj4 = obj7;
            r5 = loadLogic2;
            obj = obj4;
            r2 = r5;
        }
        obj = k;
        r2 = loadLogic;
        obj = obj6;
        oooOO1.f20512Oooo = r2;
        oooOO1.f20515OoooO00 = obj;
        oooOO1.f20514OoooO0 = null;
        oooOO1.f20517OoooOO0 = 4;
        objFetchFromNet = r2.loadFromDisk(obj, oooOO1);
        r3 = r2;
        obj5 = obj;
        if (objFetchFromNet == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (objFetchFromNet != null) {
            oooOO1.f20512Oooo = objFetchFromNet;
            oooOO1.f20515OoooO00 = null;
            oooOO1.f20517OoooOO0 = 5;
            if (r3.syncCache(obj5, objFetchFromNet, oooOO1) == coroutine_suspended) {
                r3 = loadLogic3;
                obj5 = obj8;
                return coroutine_suspended;
            }
            r3 = loadLogic3;
            obj5 = obj8;
            obj9 = objFetchFromNet;
        }
        r3 = loadLogic3;
        obj5 = obj8;
        return obj9;
    }

    @Nullable
    public abstract Object saveToDisk(K k, T t, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    public abstract Object syncCache(K k, T t, @NotNull Continuation<? super Unit> continuation);
}
