package p022Oooo00O;

import androidx.media3.common.Player;
import androidx.media3.session.o0000OO0;
import androidx.media3.session.o000oOoO;
import androidx.media3.session.o00O00O;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.yalla.yalla.ui.activity.room.VoteHistoryActivity;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment;
import io.opentelemetry.api.trace.propagation.W3CTraceContextPropagator;
import io.opentelemetry.compat.BiConsumer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p080o000OoO.o00000O0;
import p080o000OoO.o0O0O00;
import p338o0OO0oOo.Oooo0;
import p559o0oOo.o00O0O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0oOo0O0 implements o0O0O00, o00O0O, BiConsumer, o00000O0.OooO00o, Oooo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f888OooO0Oo;

    public /* synthetic */ o0oOo0O0(Object obj) {
        this.f888OooO0Oo = obj;
    }

    @Override // p338o0OO0oOo.Oooo0
    public void OooO00o(SmartRefreshLayout it) {
        VoteHistoryActivity this$0 = (VoteHistoryActivity) this.f888OooO0Oo;
        int i = VoteHistoryActivity.f26312OooOoO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.OooOoO0(true);
    }

    @Override // p559o0oOo.o00O0O
    public void OooO0OO() {
        MainRoomMineFollowingFragment.initView$lambda$1((MainRoomMineFollowingFragment) this.f888OooO0Oo);
    }

    @Override // io.opentelemetry.compat.BiConsumer
    public void accept(Object obj, Object obj2) {
        StringBuilder sb = (StringBuilder) this.f888OooO0Oo;
        String str = (String) obj;
        String str2 = (String) obj2;
        List<String> list = W3CTraceContextPropagator.f32537OooO00o;
        if (sb.length() != 0) {
            sb.append(',');
        }
        sb.append(str);
        sb.append('=');
        sb.append(str2);
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        ((Player.OooO0OO) obj).onMaxSeekToPreviousPositionChanged(((o00O00O) this.f888OooO0Oo).f9394Oooo000);
    }

    @Override // p080o000OoO.o0O0O00
    public void accept(Object obj) {
        ((o0000OO0) this.f888OooO0Oo).OooO0o0();
        ((o000oOoO.OooO00o) obj).OooO0O0();
    }
}
