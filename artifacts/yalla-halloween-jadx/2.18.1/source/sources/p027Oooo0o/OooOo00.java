package p027Oooo0o;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p023Oooo00O.o0Oo0oo;
import p023Oooo00O.o0ooOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 extends CancellationException {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final oo000o f1746Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final o0ooOOo<Float, o0Oo0oo> f1747Oooo0oO;

    public OooOo00(@NotNull oo000o item, @NotNull o0ooOOo<Float, o0Oo0oo> previousAnimation) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(previousAnimation, "previousAnimation");
        this.f1746Oooo0o = item;
        this.f1747Oooo0oO = previousAnimation;
    }
}
