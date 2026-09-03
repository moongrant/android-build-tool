package o0OO0O0O;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOo00 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "SVGAParser-Thread-" + com.opensource.svgaplayer.OooO0OO.f20768OooO0OO.getAndIncrement());
    }
}
