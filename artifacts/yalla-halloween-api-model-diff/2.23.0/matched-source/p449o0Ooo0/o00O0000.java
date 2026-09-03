package p449o0Ooo0;

import android.widget.TextView;
import androidx.lifecycle.Observer;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.data.manager.MusicState;
import kotlin.Lazy;
import p161o00OoOo0.o000OOo;
import p351o0OOOo0O.OooO;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0000 implements Observer<MusicState.State> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f46419OooO0Oo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MusicState.State.values().length];
            try {
                iArr[MusicState.State.Playing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicState.State.Stop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MusicState.State.Pause.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o00O0000(o000OO00 o000oo01) {
        this.f46419OooO0Oo = o000oo01;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(MusicState.State state) {
        MusicState.State state2 = state;
        int i = state2 == null ? -1 : OooO00o.$EnumSwitchMapping$0[state2.ordinal()];
        o000OO00 o000oo01 = this.f46419OooO0Oo;
        if (i != 1) {
            if (i == 2) {
                o000oo01.f46408OooOO0O.f58479OooO.setImageResource(oOo00OO0.icon_room_music_play);
                return;
            } else {
                if (i != 3) {
                    return;
                }
                o000oo01.f46408OooOO0O.f58479OooO.setImageResource(oOo00OO0.icon_room_music_play);
                return;
            }
        }
        o000oo01.f46408OooOO0O.f58479OooO.setImageResource(oOo00OO0.icon_room_music_playing);
        MusicTable value = MusicState.f22835OooO00o.getValue();
        if (value == null || value.mDuration != 0) {
            return;
        }
        int iOooOOO0 = OooO.OooO0O0().OooO00o().OooOOO0();
        TextView textView = o000oo01.f46408OooOO0O.f58497OooOOoo;
        Lazy lazy = o000OOo.f38508OooO00o;
        textView.setText(o000OOo.OooO0OO(iOooOOO0));
        value.mDuration = iOooOOO0;
        p581o0oOoo00.o000OOo.OooO00o().OooOo().OooO0o(value);
    }
}
