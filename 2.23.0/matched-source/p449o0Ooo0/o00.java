package p449o0Ooo0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.data.manager.MusicState;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00 implements Observer<MusicState.LoopMode> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f46404OooO0Oo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MusicState.LoopMode.values().length];
            try {
                iArr[MusicState.LoopMode.LoopAll.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicState.LoopMode.LoopSingle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o00(o000OO00 o000oo01) {
        this.f46404OooO0Oo = o000oo01;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(MusicState.LoopMode loopMode) {
        MusicState.LoopMode loopMode2 = loopMode;
        int i = loopMode2 == null ? -1 : OooO00o.$EnumSwitchMapping$0[loopMode2.ordinal()];
        o000OO00 o000oo01 = this.f46404OooO0Oo;
        if (i == 1) {
            o000oo01.f46408OooOO0O.f58486OooO0oO.setImageResource(oOo00OO0.ic_music_dialog_loop_all);
        } else {
            if (i != 2) {
                return;
            }
            o000oo01.f46408OooOO0O.f58486OooO0oO.setImageResource(oOo00OO0.ic_dialog_muisc_loop_single);
        }
    }
}
