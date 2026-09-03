package p464o0Ooo0oO;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.SendMomentPollView;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import p254o00ooO0O.o000O0O0;
import p258o00ooOOo.d;
import p601o0oo00Oo.oO00000o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f40441Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f40442Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f40443Oooo0oo;

    public /* synthetic */ o0000(Object obj, Object obj2, int i) {
        this.f40441Oooo0o = i;
        this.f40442Oooo0oO = obj;
        this.f40443Oooo0oo = obj2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        Function3<? super o0000O0O<T>, ? super View, ? super Integer, Unit> function3;
        boolean z = false;
        switch (this.f40441Oooo0o) {
            case 0:
                o0000O0O this$0 = (o0000O0O) this.f40442Oooo0oO;
                o000OO holder = (o000OO) this.f40443Oooo0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(holder, "$holder");
                int itemCount = this$0.getItemCount();
                int bindingAdapterPosition = holder.getBindingAdapterPosition();
                if (bindingAdapterPosition >= 0 && bindingAdapterPosition < itemCount) {
                    z = true;
                }
                if (z && (function3 = this$0.f40457OooOO0o) != 0) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    function3.invoke(this$0, it, Integer.valueOf(holder.getBindingAdapterPosition()));
                    break;
                }
                break;
            default:
                Context context = (Context) this.f40442Oooo0oO;
                SendMomentPollView this$1 = (SendMomentPollView) this.f40443Oooo0oo;
                int i = SendMomentPollView.f25186o000oOoO;
                Intrinsics.checkNotNullParameter(context, "$context");
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                d dVar = new d((AppCompatActivity) context, o000O0O0.OooO0OO(R.string.Cancel), o000O0O0.OooO0OO(R.string.Confirm));
                dVar.f34624OooO0oo = 5;
                dVar.f34622OooO = 7;
                String dayUnit = this$1.f25187Oooo.f41576OooO0O0;
                String hourUnit = this$1.f25193OoooO00.f41576OooO0O0;
                String minuteUnit = this$1.f25192OoooO0.f41576OooO0O0;
                Intrinsics.checkNotNullParameter(dayUnit, "dayUnit");
                Intrinsics.checkNotNullParameter(hourUnit, "hourUnit");
                Intrinsics.checkNotNullParameter(minuteUnit, "minuteUnit");
                dVar.OooOOOO().f34383OooO0Oo.setSelectedUnit(dayUnit);
                dVar.OooOOOO().f34385OooO0o0.setSelectedUnit(hourUnit);
                dVar.OooOOOO().f34384OooO0o.setSelectedUnit(minuteUnit);
                int i2 = this$1.f25187Oooo.f41575OooO00o;
                int i3 = this$1.f25193OoooO00.f41575OooO00o;
                int i4 = this$1.f25192OoooO0.f41575OooO00o;
                dVar.OooOOOO().f34383OooO0Oo.OooO0OO(new IntRange(0, 7), i2);
                dVar.OooOOOO().f34385OooO0o0.OooO0OO(new IntRange(0, 23), i3);
                dVar.OooOOOO().f34384OooO0o.OooO0OO(new IntRange(0, 59), i4);
                oO00000o selected = new oO00000o(this$1);
                Intrinsics.checkNotNullParameter(selected, "selected");
                dVar.f34628OooOOO0 = selected;
                dVar.OooOOO0();
                break;
        }
    }
}
