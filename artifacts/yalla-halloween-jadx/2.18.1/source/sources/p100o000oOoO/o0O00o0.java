package p100o000oOoO;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import p046Oooooo.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00o0 implements o0Oo0oo, Iterable<Object>, KMappedMarker {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oo00oO f29538Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ int f29539Oooo0oO;

    public o0O00o0(oo00oO oo00oo, int i) {
        this.f29538Oooo0o = oo00oo;
        this.f29539Oooo0oO = i;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Object> iterator() {
        oo00oO oo00oo = this.f29538Oooo0o;
        o0OO0O0 o0oo0o1 = oo00oo.f29694Oooo0o;
        if (o0oo0o1.f29607OoooO0O != oo00oo.f29693Oooo) {
            throw new ConcurrentModificationException();
        }
        int i = this.f29539Oooo0oO;
        return new oo00oO(o0oo0o1, i + 1, o0OOooO0.OooO0Oo(o0oo0o1.f29601Oooo0o, i) + i);
    }
}
