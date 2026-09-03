package p546o0o0OoOO;

import android.view.View;
import android.widget.EditText;
import com.yalla.yalla.ui.activity.room.CreateRoomActivity;
import kotlin.jvm.internal.Intrinsics;
import p504o0o00o0.o00000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c3 implements View.OnClickListener {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f44228Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f44229OoooO00;

    public /* synthetic */ c3(Object obj, int i) {
        this.f44228Oooo = i;
        this.f44229OoooO00 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f44228Oooo) {
            case 0:
                CreateRoomActivity this$0 = (CreateRoomActivity) this.f44229OoooO00;
                CreateRoomActivity.OooO00o oooO00o = CreateRoomActivity.f22793o00O0O;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                EditText editText = this$0.f22798OooooOo;
                if (editText == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("etRoomAnno");
                    editText = null;
                }
                editText.setText((CharSequence) null);
                break;
            default:
                o00000O this_apply = (o00000O) this.f44229OoooO00;
                Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                this_apply.OooO0O0();
                break;
        }
    }
}
