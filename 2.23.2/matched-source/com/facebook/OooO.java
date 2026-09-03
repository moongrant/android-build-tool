package com.facebook;

import android.content.Context;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.opensource.svgaplayer.SVGACache;
import java.io.File;
import java.io.FileOutputStream;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f13611OooO0Oo = 0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f13612OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ String f13613OooO0o0;

    public /* synthetic */ OooO(Context context, String str) {
        this.f13612OooO0o = context;
        this.f13613OooO0o0 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f13611OooO0Oo;
        String cacheKey = this.f13613OooO0o0;
        Object obj = this.f13612OooO0o;
        switch (i) {
            case 0:
                FacebookSdk.m4040publishInstallAsync$lambda15((Context) obj, cacheKey);
                break;
            default:
                byte[] bytes = (byte[]) obj;
                AtomicInteger atomicInteger = com.opensource.svgaplayer.OooO0OO.f20768OooO0OO;
                Intrinsics.checkNotNullParameter(cacheKey, "$cacheKey");
                Intrinsics.checkNotNullParameter(bytes, "$bytes");
                File fileOooO0OO = SVGACache.OooO0OO(cacheKey);
                try {
                    File file = fileOooO0OO.exists() ^ true ? fileOooO0OO : null;
                    if (file != null) {
                        file.createNewFile();
                    }
                    new FileOutputStream(fileOooO0OO).write(bytes);
                } catch (Exception error) {
                    Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                    Intrinsics.checkNotNullParameter("create cache file fail.", "msg");
                    Intrinsics.checkNotNullParameter(error, "error");
                    fileOooO0OO.delete();
                    return;
                }
                break;
        }
    }

    public /* synthetic */ OooO(String str, byte[] bArr) {
        this.f13613OooO0o0 = str;
        this.f13612OooO0o = bArr;
    }
}
