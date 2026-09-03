package p459o0Ooo0O;

import androidx.lifecycle.Observer;
import com.yalla.yalla.data.manager.MusicState;
import com.yalla.yalla.ui.dialog.TreasureBoxDialog;
import kotlin.jvm.internal.Intrinsics;
import p565o0oOo000.o0OOO0o;
import p675oO0Oo.o0oO0Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o0000O00 implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f47757OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0oO0Ooo f47758OooO0o0;

    public /* synthetic */ o0000O00(o0oO0Ooo o0oo0ooo2, int i) {
        this.f47757OooO0Oo = i;
        this.f47758OooO0o0 = o0oo0ooo2;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.f47757OooO0Oo;
        o0oO0Ooo o0oo0ooo2 = this.f47758OooO0o0;
        switch (i) {
            case 0:
                o0000O0O this$0 = (o0000O0O) o0oo0ooo2;
                MusicState.LoopMode loopMode = (MusicState.LoopMode) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i2 = loopMode == null ? -1 : o0000O0O.OooO00o.$EnumSwitchMapping$1[loopMode.ordinal()];
                if (i2 == 1) {
                    this$0.f47759OooOO0O.f44392OooO0oO.setImageResource(o0OOO0o.ic_music_dialog_loop_all);
                    break;
                } else if (i2 == 2) {
                    this$0.f47759OooOO0O.f44392OooO0oO.setImageResource(o0OOO0o.ic_dialog_muisc_loop_single);
                    break;
                }
                break;
            default:
                TreasureBoxDialog this$1 = (TreasureBoxDialog) o0oo0ooo2;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOO0O();
                break;
        }
    }
}
