package p546o0o0Ooo0;

import androidx.compose.ui.platform.ComposeView;
import com.app.base.framework.view.editTextSpan.MessageEditText;
import com.app.base.mixedroom.room_bottom.RoomAtView;
import com.app.base.mixedroom.room_bottom.RoomReplyView;
import com.app.base.view.FacePanelView;
import com.yalla.support.common.util.o00O0O;
import com.yalla.support.keyboardpanel.panel.PanelLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p470o0Oooo0.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00o000 extends Lambda implements Function2<oOO00O, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ oO00Oo00 f44514Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ ComposeView f44515Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO00o000(oO00Oo00 oo00oo00, ComposeView composeView) {
        super(2);
        this.f44514Oooo0o = oo00oo00;
        this.f44515Oooo0oO = composeView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(oOO00O ooo00o, Integer num) {
        oOO00O ooo00o2 = ooo00o;
        if ((num.intValue() & 11) == 2 && ooo00o2.OooOo0()) {
            ooo00o2.OooOoo0();
        } else {
            Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
            if (this.f44514Oooo0o.f44432OooO0OO.getValue().booleanValue()) {
                ComposeView composeView = this.f44515Oooo0oO;
                Intrinsics.checkNotNullExpressionValue(composeView, "composeView");
                o00O0O.OooO(composeView);
                oO00Oo00 oo00oo00 = this.f44514Oooo0o;
                o0O00OO<Boolean> o0o00oo2 = oo00oo00.f44432OooO0OO;
                RoomReplyView roomReplyViewOooO0Oo = oo00oo00.OooO0Oo();
                RoomAtView roomAtView = (RoomAtView) this.f44514Oooo0o.f44434OooO0o.getValue();
                FacePanelView facePanelView = (FacePanelView) this.f44514Oooo0o.f44436OooO0oO.getValue();
                PanelLayout panelLayout = (PanelLayout) this.f44514Oooo0o.f44435OooO0o0.getValue();
                oO00Oo00 oo00oo01 = this.f44514Oooo0o;
                o0O00OO<o00O0000> o0o00oo3 = oo00oo01.f44430OooO;
                MessageEditText messageEditTextOooO0OO = oo00oo01.OooO0OO();
                oO00Oo00 oo00oo02 = this.f44514Oooo0o;
                oO00o0.OooO0oO(o0o00oo2, roomReplyViewOooO0Oo, roomAtView, facePanelView, panelLayout, o0o00oo3, messageEditTextOooO0OO, oo00oo02.f44438OooOO0, oo00oo02.f44439OooOO0O, ooo00o2, 2134592);
            } else {
                ComposeView composeView2 = this.f44515Oooo0oO;
                Intrinsics.checkNotNullExpressionValue(composeView2, "composeView");
                p254o00ooO0O.oOO00O.OooO00o(composeView2);
            }
        }
        return Unit.INSTANCE;
    }
}
