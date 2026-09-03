package p593o0oOooOo;

import android.content.Context;
import com.app.base.dialog.baseDialog.MenuDialogTag;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO0O0;
import com.yalla.yalla.ui.vm.event.EventDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p031OoooO.o0000O;
import p140o00OOOo0.o000Oo0;
import p255o00ooO0O.o000O0O0;
import p256o00ooO0o.oo0oOO0;
import p586o0oOoo.o000O;
import p597o0oOoooo.t5;

/* JADX INFO: loaded from: classes3.dex */
public final class i4 extends Lambda implements Function2<Integer, o000Oo0<MenuDialogTag>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ EventDetailViewModel f47266Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f47267OoooO00;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MenuDialogTag.values().length];
            iArr[MenuDialogTag.copyEvent.ordinal()] = 1;
            iArr[MenuDialogTag.delete.ordinal()] = 2;
            iArr[MenuDialogTag.report.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(EventDetailViewModel eventDetailViewModel, CoroutineScope coroutineScope) {
        super(2);
        this.f47266Oooo = eventDetailViewModel;
        this.f47267OoooO00 = coroutineScope;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, o000Oo0<MenuDialogTag> o000oo1) {
        num.intValue();
        o000Oo0<MenuDialogTag> item = o000oo1;
        Intrinsics.checkNotNullParameter(item, "item");
        int i = OooO00o.$EnumSwitchMapping$0[item.f31824Oooo.ordinal()];
        Context context = null;
        if (i == 1) {
            this.f47266Oooo.getShowLoadingDialog().setValue(Boolean.TRUE);
            return BuildersKt__Builders_commonKt.launch$default(this.f47267OoooO00, null, null, new g4(this.f47266Oooo, null), 3, null);
        }
        if (i != 2) {
            if (i == 3) {
                o000O.OooO00o(t5.f47585OooO00o, t5.OooO0o(6, this.f47266Oooo.getEventModel().getId(), (52 & 4) != 0 ? null : null, (52 & 8) != 0 ? null : null, (52 & 16) != 0 ? null : null, (52 & 32) != 0 ? null : null));
            }
            return Unit.INSTANCE;
        }
        h4 h4Var = new h4(this.f47266Oooo);
        Context contextOooO0O0 = OooO0O0.f20522OooO00o.OooO0O0();
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2671OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
        } else {
            context = contextOooO0O0;
        }
        oo0oOO0 oo0ooo0 = new oo0oOO0(context);
        oo0ooo0.OooOooO(o000O0O0.OooO0OO(R.string.event_delete_title));
        oo0ooo0.OooOo0O(o000O0O0.OooO0OO(R.string.event_delete_content));
        oo0ooo0.OooOoOO(true);
        oo0ooo0.OooOOOo(R.string.DELETE_);
        oo0ooo0.OooOo0o(new f4(h4Var));
        oo0ooo0.OooOOO0();
        return Unit.INSTANCE;
    }
}
