package p175o00OooOo;

import android.view.KeyEvent;
import android.widget.EditText;
import com.app.base.view.FacePanelView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
public final class o0O0OOO0 extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ FacePanelView f32715Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0OOO0(FacePanelView facePanelView) {
        super(0);
        this.f32715Oooo0o = facePanelView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EditText editText = this.f32715Oooo0o.f11956Oooo0o;
        if (editText != null) {
            editText.dispatchKeyEvent(new KeyEvent(0, 67));
        }
        EditText editText2 = this.f32715Oooo0o.f11956Oooo0o;
        if (editText2 != null) {
            editText2.dispatchKeyEvent(new KeyEvent(1, 67));
        }
        return Unit.INSTANCE;
    }
}
