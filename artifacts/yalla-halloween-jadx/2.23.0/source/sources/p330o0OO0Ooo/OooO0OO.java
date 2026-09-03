package p330o0OO0Ooo;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pools.kt\ncom/opensource/svgaplayer/utils/Pools$SimplePool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
public final class OooO0OO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Object[] f43157OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f43158OooO0O0;

    public OooO0OO(int i) {
        if (!(i > 0)) {
            throw new IllegalArgumentException("The max pool size must be > 0".toString());
        }
        this.f43157OooO00o = new Object[i];
    }
}
