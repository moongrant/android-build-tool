package p405o0Oo0OO0;

import android.media.SoundPool;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 implements SoundPool.OnLoadCompleteListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f39099OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ List f39100OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooOo f39101OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Function0 f39102OooO0Oo;

    public Oooo000(Ref.IntRef intRef, List list, OooOo oooOo, Function0 function0) {
        this.f39099OooO00o = intRef;
        this.f39100OooO0O0 = list;
        this.f39101OooO0OO = oooOo;
        this.f39102OooO0Oo = function0;
    }

    @Override // android.media.SoundPool.OnLoadCompleteListener
    public final void onLoadComplete(SoundPool soundPool, int i, int i2) {
        Ref.IntRef intRef = this.f39099OooO00o;
        int i3 = intRef.element + 1;
        intRef.element = i3;
        if (i3 >= this.f39100OooO0O0.size()) {
            this.f39102OooO0Oo.invoke();
        }
    }
}
