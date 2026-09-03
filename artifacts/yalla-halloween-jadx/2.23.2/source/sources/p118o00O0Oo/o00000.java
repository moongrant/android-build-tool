package p118o00O0Oo;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import o00OO00O.OooOo00;
import o00OO00O.o00Ooo;
import p224o00oOOo.o000OOo;
import p224o00oOOo.o0OOO0o;
import p662o0oooO0O.o0OOOO00;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 extends Lambda implements Function0<o0OOO0o> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000O.OooO00o f36365OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(o00000O.OooO00o oooO00o) {
        super(0);
        this.f36365OooO0Oo = oooO00o;
    }

    @Override // kotlin.jvm.functions.Function0
    public final o0OOO0o invoke() {
        o000OOo o000oooOooO00o;
        o00Ooo o00ooo2 = o00Ooo.f37090OooO00o;
        Context context = this.f36365OooO0Oo.f36369OooO00o;
        synchronized (o00ooo2) {
            o000oooOooO00o = o00Ooo.f37091OooO0O0;
            if (o000oooOooO00o == null) {
                o0OOO0o.OooO00o oooO00o = new o0OOO0o.OooO00o();
                Bitmap.Config[] configArr = OooOo00.f37081OooO00o;
                File cacheDir = context.getCacheDir();
                cacheDir.mkdirs();
                File fileResolve = FilesKt__UtilsKt.resolve(cacheDir, "image_cache");
                String str = o0OOOO00.f59787OooO0o0;
                oooO00o.f39670OooO00o = o0OOOO00.OooO00o.OooO0O0(fileResolve);
                o000oooOooO00o = oooO00o.OooO00o();
                o00Ooo.f37091OooO0O0 = o000oooOooO00o;
            }
        }
        return o000oooOooO00o;
    }
}
