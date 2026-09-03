package com.opensource.svgaplayer;

import com.opensource.svgaplayer.SVGAImageView;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import o0OO0O0.oo000o;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO00o implements OooO0OO.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ WeakReference<SVGAImageView> f21239OooO00o;

    public OooO00o(WeakReference<SVGAImageView> weakReference) {
        this.f21239OooO00o = weakReference;
    }

    @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
    public final void OooO00o(@NotNull final oo000o videoItem) {
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        final SVGAImageView sVGAImageView = this.f21239OooO00o.get();
        if (sVGAImageView != null) {
            int i = SVGAImageView.f21259OooOOo0;
            sVGAImageView.post(new Runnable() { // from class: o0OO0O0.OooOO0O
                @Override // java.lang.Runnable
                public final void run() {
                    SVGAImageView.OooO00o(sVGAImageView, videoItem);
                }
            });
        }
    }

    @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
    public final void onError() {
    }
}
