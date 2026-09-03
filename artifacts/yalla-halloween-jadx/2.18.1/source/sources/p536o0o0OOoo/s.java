package p536o0o0OOoo;

import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.message.PrivateChatActivity;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends Lambda implements Function2<Boolean, Integer, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ PrivateChatActivity f43861Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(PrivateChatActivity privateChatActivity) {
        super(2);
        this.f43861Oooo0o = privateChatActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, Integer num) {
        boolean zBooleanValue = bool.booleanValue();
        num.intValue();
        if (zBooleanValue) {
            OooOo.OooO0OO("202021", MapsKt.mapOf(new Pair("sources", 2)));
            PrivateChatActivity privateChatActivity = this.f43861Oooo0o;
            PrivateChatActivity.OooO00o oooO00o = PrivateChatActivity.f22166o00oO0o;
            privateChatActivity.Oooo00o().f49094OooO0OO.OooO0OO();
            this.f43861Oooo0o.Oooo00o().f49095OooO0Oo.setVisibility(8);
        } else {
            PrivateChatActivity privateChatActivity2 = this.f43861Oooo0o;
            privateChatActivity2.f22181o00Ooo = false;
            privateChatActivity2.Oooo00o().f49097OooO0o0.f49549OooO0Oo.setImageResource(R.drawable.icon_emoji);
            PrivateChatActivity.OooOoo(this.f43861Oooo0o, true);
            this.f43861Oooo0o.Oooo00o().f49097OooO0o0.f49547OooO0O0.clearFocus();
            PrivateChatActivity privateChatActivity3 = this.f43861Oooo0o;
            if (privateChatActivity3.f22171Ooooo0o) {
                privateChatActivity3.Oooo00o().f49095OooO0Oo.setVisibility(0);
            }
        }
        PrivateChatActivity privateChatActivity4 = this.f43861Oooo0o;
        PrivateChatActivity.OooO00o oooO00o2 = PrivateChatActivity.f22166o00oO0o;
        privateChatActivity4.Oooo0oO();
        return Unit.INSTANCE;
    }
}
