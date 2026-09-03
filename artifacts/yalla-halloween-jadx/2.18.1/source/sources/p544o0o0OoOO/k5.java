package p544o0o0OoOO;

import android.view.View;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.weieyu.yalla.R;
import com.yalla.yalla.data.db.model.MusicTable;
import com.yalla.yalla.ui.activity.room.MusicActivity;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p617o0oo0o.o00;

/* JADX INFO: loaded from: classes2.dex */
public final class k5 implements BaseQuickAdapter.OooOo00 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MusicActivity f44262OooO0Oo;

    public k5(MusicActivity musicActivity) {
        this.f44262OooO0Oo = musicActivity;
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOo00
    public final boolean OooO0O0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
        if (this.f44262OooO0Oo.f22904OoooOo0.getText().toString().length() != 0) {
            return false;
        }
        final MusicActivity musicActivity = this.f44262OooO0Oo;
        final MusicTable musicTable = musicActivity.f22909OooooO0.getData().get(i);
        String strOooO0OO = o000O0O0.OooO0OO(R.string.Sure_delete_selected_music);
        oo0oOO0 oo0ooo0 = new oo0oOO0(musicActivity);
        oo0ooo0.OooOo0O(strOooO0OO);
        oo0ooo0.OooOoO();
        oo0ooo0.OooOo0o(new Function0() { // from class: o0o0OoOO.c5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MusicActivity musicActivity2 = musicActivity;
                MusicTable music = musicTable;
                int i2 = MusicActivity.f22903Oooooo0;
                Objects.requireNonNull(musicActivity2);
                o0O00000.OooO0OO("InRoom_music_delete");
                o00 o00Var = o00.f48461OooO00o;
                Intrinsics.checkNotNullParameter(music, "music");
                o00Var.OooO00o(CollectionsKt.mutableListOf(music));
                return null;
            }
        });
        oo0ooo0.OooOOO0();
        return false;
    }
}
