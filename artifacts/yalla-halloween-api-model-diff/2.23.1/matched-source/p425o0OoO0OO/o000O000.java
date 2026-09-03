package p425o0OoO0OO;

import android.content.DialogInterface;
import com.yalla.yalla.ui.activity.moment.ShowImageActivity;
import com.yalla.yalla.ui.activity.user.BadgeWearActivity;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class o000O000 implements DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f46655OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f46656OooO0o0;

    public /* synthetic */ o000O000(Object obj, int i) {
        this.f46655OooO0Oo = i;
        this.f46656OooO0o0 = obj;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i = this.f46655OooO0Oo;
        Object obj = this.f46656OooO0o0;
        switch (i) {
            case 0:
                Lazy dismissListenerList$delegate = (Lazy) obj;
                Intrinsics.checkNotNullParameter(dismissListenerList$delegate, "$dismissListenerList$delegate");
                for (Function0 function0 : (List) dismissListenerList$delegate.getValue()) {
                    if (function0 != null) {
                        function0.invoke();
                    }
                }
                break;
            case 1:
                ShowImageActivity this$0 = (ShowImageActivity) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f25820Oooo000 = false;
                this$0.OooOo0o().f45047OooO0o0.setCanScroll(true);
                break;
            default:
                BadgeWearActivity this$1 = (BadgeWearActivity) obj;
                int i2 = BadgeWearActivity.f26634OooOo0o;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.OooOoO0();
                break;
        }
    }
}
