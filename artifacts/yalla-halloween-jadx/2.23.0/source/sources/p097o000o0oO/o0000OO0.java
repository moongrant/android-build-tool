package p097o000o0oO;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p102o000oo0.OooOO0;
import p102o000oo0.OooOo00;
import p321o0O0ooO.o000O0O0;
import p321o0O0ooO.o00O000;
import p659o0oooO00.o000OO00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000OO0 extends Lambda implements Function0<OooOO0> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000O000.OooO00o f35407OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000OO0(o000O000.OooO00o oooO00o) {
        super(0);
        this.f35407OooO0Oo = oooO00o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OooOO0 invoke() {
        OooOo00 oooOo00OooO00o;
        o00O000 o00o001 = o00O000.f42858OooO00o;
        Context context = this.f35407OooO0Oo.f35419OooO00o;
        synchronized (o00o001) {
            oooOo00OooO00o = o00O000.f42859OooO0O0;
            if (oooOo00OooO00o == null) {
                OooOO0.OooO00o oooO00o = new OooOO0.OooO00o();
                Bitmap.Config[] configArr = o000O0O0.f42845OooO00o;
                File cacheDir = context.getCacheDir();
                cacheDir.mkdirs();
                File fileResolve = FilesKt__UtilsKt.resolve(cacheDir, "image_cache");
                String str = o000OO00.f60221OooO0o0;
                oooO00o.f35603OooO00o = o000OO00.OooO00o.OooO0O0(fileResolve);
                oooOo00OooO00o = oooO00o.OooO00o();
                o00O000.f42859OooO0O0 = oooOo00OooO00o;
            }
        }
        return oooOo00OooO00o;
    }
}
