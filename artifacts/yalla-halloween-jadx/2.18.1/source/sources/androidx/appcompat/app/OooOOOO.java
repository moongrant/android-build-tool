package androidx.appcompat.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.WeakHashMap;
import o000O0O0.o00000O;
import o000O0O0.o0000Ooo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ AppCompatDelegateImpl f4523Oooo0o;

    public class OooO00o extends o0000Ooo {
        public OooO00o() {
        }

        @Override // o000O0O0.o00000OO
        public final void OooO00o() {
            OooOOOO.this.f4523Oooo0o.f4434OoooOoo.setAlpha(1.0f);
            OooOOOO.this.f4523Oooo0o.f4437OooooO0.OooO0Oo(null);
            OooOOOO.this.f4523Oooo0o.f4437OooooO0 = null;
        }

        @Override // o000O0O0.o0000Ooo, o000O0O0.o00000OO
        public final void OooO0O0() {
            OooOOOO.this.f4523Oooo0o.f4434OoooOoo.setVisibility(0);
        }
    }

    public OooOOOO(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f4523Oooo0o = appCompatDelegateImpl;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        ViewGroup viewGroup;
        AppCompatDelegateImpl appCompatDelegateImpl = this.f4523Oooo0o;
        appCompatDelegateImpl.f4435Ooooo00.showAtLocation(appCompatDelegateImpl.f4434OoooOoo, 55, 0, 0);
        this.f4523Oooo0o.Oooo00o();
        AppCompatDelegateImpl appCompatDelegateImpl2 = this.f4523Oooo0o;
        if (!appCompatDelegateImpl2.f4438OooooOO || (viewGroup = appCompatDelegateImpl2.f4439OooooOo) == null) {
            z = false;
        } else {
            WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
            if (ViewCompat.OooOO0O.OooO0OO(viewGroup)) {
                z = true;
            } else {
                z = false;
            }
        }
        if (!z) {
            this.f4523Oooo0o.f4434OoooOoo.setAlpha(1.0f);
            this.f4523Oooo0o.f4434OoooOoo.setVisibility(0);
            return;
        }
        this.f4523Oooo0o.f4434OoooOoo.setAlpha(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        AppCompatDelegateImpl appCompatDelegateImpl3 = this.f4523Oooo0o;
        o00000O o00000oOooO0O0 = ViewCompat.OooO0O0(appCompatDelegateImpl3.f4434OoooOoo);
        o00000oOooO0O0.OooO00o(1.0f);
        appCompatDelegateImpl3.f4437OooooO0 = o00000oOooO0O0;
        this.f4523Oooo0o.f4437OooooO0.OooO0Oo(new OooO00o());
    }
}
