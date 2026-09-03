package com.opensource.svgaplayer;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.net.URL;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O extends Lambda implements Function1<Exception, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ URL f20780OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ OooO0OO.OooO0O0 f20781OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f20782OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ String f20783OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(URL url, OooO0OO oooO0OO, OooO00o oooO00o, String str) {
        super(1);
        this.f20780OooO0Oo = url;
        this.f20782OooO0o0 = oooO0OO;
        this.f20781OooO0o = oooO00o;
        this.f20783OooO0oO = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Exception exc) {
        Exception it = exc;
        Intrinsics.checkNotNullParameter(it, "it");
        String msg = "================ svga file: " + this.f20780OooO0Oo + " download fail ================";
        Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.f20782OooO0o0.getClass();
        OooO0OO.OooO0oo(it, this.f20781OooO0o, this.f20783OooO0oO);
        return Unit.INSTANCE;
    }
}
