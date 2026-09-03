package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.OooO;
import com.google.firebase.components.OooOo;
import com.google.firebase.components.Qualified;
import com.google.firebase.components.oo000o;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import org.jetbrains.annotations.NotNull;
import p314o0O0oOo0.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/google/firebase/ktx/FirebaseCommonKtxRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "", "Lcom/google/firebase/components/OooO0O0;", "getComponents", "<init>", "()V", "com.google.firebase-firebase-common-ktx"}, k = 1, mv = {1, 7, 1})
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class OooO00o<T> implements OooO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o<T> f20223OooO0Oo = new OooO00o<>();

        @Override // com.google.firebase.components.OooO
        public final Object OooO0OO(oo000o oo000oVar) {
            Object objOooO0Oo = oo000oVar.OooO0Oo(new Qualified<>(Background.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objOooO0Oo, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return ExecutorsKt.from((Executor) objOooO0Oo);
        }
    }

    public static final class OooO0O0<T> implements OooO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0<T> f20224OooO0Oo = new OooO0O0<>();

        @Override // com.google.firebase.components.OooO
        public final Object OooO0OO(oo000o oo000oVar) {
            Object objOooO0Oo = oo000oVar.OooO0Oo(new Qualified<>(Lightweight.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objOooO0Oo, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return ExecutorsKt.from((Executor) objOooO0Oo);
        }
    }

    public static final class OooO0OO<T> implements OooO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO<T> f20225OooO0Oo = new OooO0OO<>();

        @Override // com.google.firebase.components.OooO
        public final Object OooO0OO(oo000o oo000oVar) {
            Object objOooO0Oo = oo000oVar.OooO0Oo(new Qualified<>(Blocking.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objOooO0Oo, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return ExecutorsKt.from((Executor) objOooO0Oo);
        }
    }

    public static final class OooO0o<T> implements OooO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o<T> f20226OooO0Oo = new OooO0o<>();

        @Override // com.google.firebase.components.OooO
        public final Object OooO0OO(oo000o oo000oVar) {
            Object objOooO0Oo = oo000oVar.OooO0Oo(new Qualified<>(UiThread.class, Executor.class));
            Intrinsics.checkNotNullExpressionValue(objOooO0Oo, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return ExecutorsKt.from((Executor) objOooO0Oo);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<com.google.firebase.components.OooO0O0<?>> getComponents() {
        com.google.firebase.components.OooO0O0[] oooO0O0Arr = new com.google.firebase.components.OooO0O0[5];
        oooO0O0Arr[0] = o000O0Oo.OooO00o("fire-core-ktx", "unspecified");
        Qualified qualified = new Qualified(Background.class, CoroutineDispatcher.class);
        Qualified[] qualifiedArr = new Qualified[0];
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(qualified);
        for (Qualified qualified2 : qualifiedArr) {
            if (qualified2 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet, qualifiedArr);
        OooOo oooOo = new OooOo((Qualified<?>) new Qualified(Background.class, Executor.class), 1, 0);
        if (!(!hashSet.contains(oooOo.f19819OooO00o))) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet2.add(oooOo);
        com.google.firebase.components.OooO0O0 oooO0O0 = new com.google.firebase.components.OooO0O0(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, OooO00o.f20223OooO0Oo, hashSet3);
        Intrinsics.checkNotNullExpressionValue(oooO0O0, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        oooO0O0Arr[1] = oooO0O0;
        Qualified qualified3 = new Qualified(Lightweight.class, CoroutineDispatcher.class);
        Qualified[] qualifiedArr2 = new Qualified[0];
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(qualified3);
        for (Qualified qualified4 : qualifiedArr2) {
            if (qualified4 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet4, qualifiedArr2);
        OooOo oooOo2 = new OooOo((Qualified<?>) new Qualified(Lightweight.class, Executor.class), 1, 0);
        if (!(!hashSet4.contains(oooOo2.f19819OooO00o))) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet5.add(oooOo2);
        com.google.firebase.components.OooO0O0 oooO0O1 = new com.google.firebase.components.OooO0O0(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, OooO0O0.f20224OooO0Oo, hashSet6);
        Intrinsics.checkNotNullExpressionValue(oooO0O1, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        oooO0O0Arr[2] = oooO0O1;
        Qualified qualified5 = new Qualified(Blocking.class, CoroutineDispatcher.class);
        Qualified[] qualifiedArr3 = new Qualified[0];
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(qualified5);
        for (Qualified qualified6 : qualifiedArr3) {
            if (qualified6 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet7, qualifiedArr3);
        OooOo oooOo3 = new OooOo((Qualified<?>) new Qualified(Blocking.class, Executor.class), 1, 0);
        if (!(!hashSet7.contains(oooOo3.f19819OooO00o))) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet8.add(oooOo3);
        com.google.firebase.components.OooO0O0 oooO0O2 = new com.google.firebase.components.OooO0O0(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, OooO0OO.f20225OooO0Oo, hashSet9);
        Intrinsics.checkNotNullExpressionValue(oooO0O2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        oooO0O0Arr[3] = oooO0O2;
        Qualified qualified7 = new Qualified(UiThread.class, CoroutineDispatcher.class);
        Qualified[] qualifiedArr4 = new Qualified[0];
        HashSet hashSet10 = new HashSet();
        HashSet hashSet11 = new HashSet();
        HashSet hashSet12 = new HashSet();
        hashSet10.add(qualified7);
        for (Qualified qualified8 : qualifiedArr4) {
            if (qualified8 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet10, qualifiedArr4);
        OooOo oooOo4 = new OooOo((Qualified<?>) new Qualified(UiThread.class, Executor.class), 1, 0);
        if (!(!hashSet10.contains(oooOo4.f19819OooO00o))) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        hashSet11.add(oooOo4);
        com.google.firebase.components.OooO0O0 oooO0O3 = new com.google.firebase.components.OooO0O0(null, new HashSet(hashSet10), new HashSet(hashSet11), 0, 0, OooO0o.f20226OooO0Oo, hashSet12);
        Intrinsics.checkNotNullExpressionValue(oooO0O3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        oooO0O0Arr[4] = oooO0O3;
        return CollectionsKt.listOf((Object[]) oooO0O0Arr);
    }
}
