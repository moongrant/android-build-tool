package p544o0o0OoOO;

import com.yalla.yalla.ui.activity.room.LuckyPacketDetailActivity;
import com.yalla.yalla.ui.fragment.MainSearchRoomFragment;
import com.yalla.yalla.ui.view.SearchLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p172o00OooO.o00O0O0O;
import p186o00o00Oo.o0ooOOo;
import p407o0Oo0OOo.oO000Oo;
import p417o0Oo0oOo.oO00OO0O;
import p522o0o0O0o.o00O0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m4 implements o0ooOOo, oO00OO0O, o00O0O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f44272OooO0Oo;

    public /* synthetic */ m4(Object obj) {
        this.f44272OooO0Oo = obj;
    }

    @Override // p172o00OooO.o00O0O0O
    public final void OooO0O0(String str) {
        SearchLayout this$0 = (SearchLayout) this.f44272OooO0Oo;
        int i = SearchLayout.f25146o000oOoO;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function1<? super String, Unit> function1 = this$0.f25149Oooo0oO;
        if (function1 != null) {
            function1.invoke(o00O0.OooO0oO(str));
        }
    }

    @Override // p417o0Oo0oOo.oO00OO0O
    public final void OooO0OO(oO000Oo oo000oo) {
        MainSearchRoomFragment.m369initView$lambda9((MainSearchRoomFragment) this.f44272OooO0Oo, oo000oo);
    }

    @Override // p186o00o00Oo.o0ooOOo
    public final void OooO0oO() {
        LuckyPacketDetailActivity this$0 = (LuckyPacketDetailActivity) this.f44272OooO0Oo;
        LuckyPacketDetailActivity.OooO00o oooO00o = LuckyPacketDetailActivity.f22854OooooOo;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.OooOooO();
    }
}
