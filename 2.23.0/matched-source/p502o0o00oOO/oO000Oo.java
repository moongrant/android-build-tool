package p502o0o00oOO;

import android.app.Dialog;
import android.view.View;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.event.EventModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class oO000Oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f49531OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f49532OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f49533OooO0o0;

    public /* synthetic */ oO000Oo(int i, Object obj, Object obj2) {
        this.f49531OooO0Oo = i;
        this.f49533OooO0o0 = obj;
        this.f49532OooO0o = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        int i = this.f49531OooO0Oo;
        Object obj = this.f49532OooO0o;
        Object obj2 = this.f49533OooO0o0;
        switch (i) {
            case 0:
                ChatModel model = (ChatModel) obj2;
                oO0O0OoO this$0 = (oO0O0OoO) obj;
                Intrinsics.checkNotNullParameter(model, "$model");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EventModel eventModel = model.getEventModel();
                if (eventModel != null) {
                    z = eventModel.getHasSubscribe();
                }
                String str = z ? "102003" : "102002";
                EventModel eventModel2 = model.getEventModel();
                o0OO000.OooO0O0(str, MapsKt.mapOf(new Pair("roomeventid", eventModel2 != null ? Long.valueOf(eventModel2.getId()) : null)));
                Function0<Unit> function0 = this$0.f49581OooO0o0;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                Dialog this_apply = (Dialog) obj2;
                Function0 function1 = (Function0) obj;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this_apply.dismiss();
                if (function1 != null) {
                    function1.invoke();
                    break;
                }
                break;
        }
    }
}
