package p466o0Ooo0oO;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.SendMomentPollView;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import p255o00ooO0O.o000O0O0;
import p259o00ooOOo.g;
import p603o0oo00Oo.oO00000o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0000 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f40460Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f40461OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f40462OoooO00;

    public /* synthetic */ o0000(Object obj, Object obj2, int i) {
        this.f40460Oooo = i;
        this.f40462OoooO00 = obj;
        this.f40461OoooO0 = obj2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // android.view.View.OnClickListener
    public final void onClick(View it) {
        Function3<? super o0000O0O<T>, ? super View, ? super Integer, Unit> function3;
        boolean z = false;
        switch (this.f40460Oooo) {
            case 0:
                o0000O0O this$0 = (o0000O0O) this.f40462OoooO00;
                o000OO holder = (o000OO) this.f40461OoooO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(holder, "$holder");
                int itemCount = this$0.getItemCount();
                int bindingAdapterPosition = holder.getBindingAdapterPosition();
                if (bindingAdapterPosition >= 0 && bindingAdapterPosition < itemCount) {
                    z = true;
                }
                if (z && (function3 = this$0.f40476OooOO0o) != 0) {
                    Intrinsics.checkNotNullExpressionValue(it, "it");
                    function3.invoke(this$0, it, Integer.valueOf(holder.getBindingAdapterPosition()));
                    break;
                }
                break;
            default:
                Context context = (Context) this.f40462OoooO00;
                SendMomentPollView this$1 = (SendMomentPollView) this.f40461OoooO0;
                int i = SendMomentPollView.f25205OoooOo0;
                Intrinsics.checkNotNullParameter(context, "$context");
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                g gVar = new g((AppCompatActivity) context, o000O0O0.OooO0OO(R.string.Cancel), o000O0O0.OooO0OO(R.string.Confirm));
                gVar.f34646OooO0oo = 5;
                gVar.f34644OooO = 7;
                String dayUnit = this$1.f25210OoooO0O.f41595OooO0O0;
                String hourUnit = this$1.f25207OoooO.f41595OooO0O0;
                String minuteUnit = this$1.f25211OoooOO0.f41595OooO0O0;
                Intrinsics.checkNotNullParameter(dayUnit, "dayUnit");
                Intrinsics.checkNotNullParameter(hourUnit, "hourUnit");
                Intrinsics.checkNotNullParameter(minuteUnit, "minuteUnit");
                gVar.OooOOOO().f34405OooO0Oo.setSelectedUnit(dayUnit);
                gVar.OooOOOO().f34407OooO0o0.setSelectedUnit(hourUnit);
                gVar.OooOOOO().f34406OooO0o.setSelectedUnit(minuteUnit);
                int i2 = this$1.f25210OoooO0O.f41594OooO00o;
                int i3 = this$1.f25207OoooO.f41594OooO00o;
                int i4 = this$1.f25211OoooOO0.f41594OooO00o;
                gVar.OooOOOO().f34405OooO0Oo.OooO0OO(new IntRange(0, 7), i2);
                gVar.OooOOOO().f34407OooO0o0.OooO0OO(new IntRange(0, 23), i3);
                gVar.OooOOOO().f34406OooO0o.OooO0OO(new IntRange(0, 59), i4);
                oO00000o selected = new oO00000o(this$1);
                Intrinsics.checkNotNullParameter(selected, "selected");
                gVar.f34650OooOOO0 = selected;
                gVar.OooOOO0();
                break;
        }
    }
}
